# ev_battery
EV charging station
Tech stack
Develop a backend API in any tech stack to create, read, update & delete EV battery stations in the city.
• Backend: Spring, Springboot, Java
[Minimum requirement]
• CRUD App (Create, Read, Update, Delete) with images.
• Database Model Parameters:
× h Problems - Veridic Hire Sprint2 
o [station_id, station_name, station_image, station_pricing, station_address]
• A GET request to the base URL should list all the charging stations in the city.
• A GET request to /show/:id should respond to single charging station details.
• A POST request to / should add charging station details to the database.
• A PUT request to /:id/edit, changes the appropriate details in the database.
• A DELETE request to /delete/:id should delete that particular charging station from the database.
●
• A GET request to /?limit=10, should return only 10 entries.
• A GET request to /?sort=asc&param= station_pricing, should sort the EV charging station based on pricing (param value)
• Follow MVC structure.
• This is a basic CRUD API development case.
