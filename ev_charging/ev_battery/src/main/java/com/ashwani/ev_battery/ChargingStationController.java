package com.ashwani.ev_battery;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/charging-stations")
public class ChargingStationController<ChargingStationRepository> {

    @Autowired
    private ChargingStationRepository chargingStationRepository;

    @GetMapping
    public List<ChargingStation> getAllChargingStations() {
        return chargingStationRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChargingStation> getChargingStationById(@PathVariable Long id) {
        Optional<ChargingStation> chargingStation = chargingStationRepository.findById(id);
        if (chargingStation.isPresent()) {
            return ResponseEntity.ok(chargingStation.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * @param chargingStation
     * @return
     */
    @PostMapping
    public ChargingStation createChargingStation(@RequestBody ChargingStation chargingStation) {
        return chargingStationRepository.save(chargingStation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ChargingStation> updateChargingStation(@PathVariable Long id, @RequestBody ChargingStation chargingStation) {
        Optional<ChargingStation> existingChargingStation = chargingStationRepository.findById(id);
        if (existingChargingStation.isPresent()) {
            chargingStation.setId(id);
            ChargingStation updatedChargingStation = chargingStationRepository.save(chargingStation);
            return ResponseEntity.ok(updatedChargingStation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChargingStation(@PathVariable Long id) {
        Optional<ChargingStation> chargingStation = chargingStationRepository.findById(id);
        if (chargingStation.isPresent()) {
            chargingStationRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
