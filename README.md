# Moveo_GarageCar_Api
## Moveo project

### About the project-
The project includes 2 parts when they simulate a garage management system.
The first part of the project:
is the management and implementation of a database of vehicles of different types, 
with each vehicle having unique characteristics and functionality according to its type.
Can be expanded in case we need to add new types of vehicles.
Each vehicle has unique characteristics and functionality by type.
You will enable vehicle management by adding viewing and performing various actions on the vehicles.

## part one:
### There are 5 types of vehicles as follows: (Each such vehicle is a class in itself)
Regular motorcycle, electric motorcycle, regular vehicle, electric car, truck
For the characteristics of the vehicles there is the abstract class:vechiles-
that contains all the properties:
All vehicles have an energy source (battery or fuel tank) and a list of wheels, motorcycles have 2, cars 4 and trucks 16 wheels.

### Each vehicle has the following characteristics:
Model name, license number, percentage of energy available (how much battery or fuel is left), maximum tire pressure, tire inflation, adding energy (refuel or charge the battery

## Part Two:
After building the garage system, this section implements a simple HTTP-based API that reveals the following endpoints:

For installing the garage system please follow the instructions below:

- Clone this repository.
- open this project in your IDE
- Run the RestServiceApplication class
- After running the application you will need a client platform like Postman (its better to use the Desktop version)

## REST API procedures 
### installation and operating instructions for the project

- Add a new vehicle to the vehicle's collection:
Need to insert:type, modelName, licenseNumber, maxTirePressure, isElectric
http://localhost:8080/add?type=car&modelName=tesla&licenseNumber=1234&maxTirePressure=20&isElectric=true
 - for example:
 ![](https://web.whatsapp.com/2be645e0-b1cc-4de3-9cab-1c01f5c39a46)
- Returns all cars:
http://localhost:8080/getAll

- Returns a specific car Returns a specific car by driver's license number:
http://localhost:8080/getVehicle?licenseNumber=1234

- Fills the tire with air according to the license number:
 Need to insert licenseNumber
http://localhost:8080/inflate?licenseNumber=1234

- Refueling by license number:
Need to insert licenseNumber
http://localhost:8080/addenergy?licenseNumber=1234
