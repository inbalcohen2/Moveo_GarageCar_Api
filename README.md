# Moveo_GarageCar_Api
## Moveo project

<img src="https://clictellassets.s3.amazonaws.com/prod/users/cleaning_service.jpg" width="400" height="320">

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

### For installing the garage system please follow the instructions below:

- Clone this repository.
- open this project in your IDE
- Run the RestServiceApplication class
- After running the application you will need a client platform like Postman (its better to use the Desktop version)

## REST API procedures 
### installation and operating instructions for the project

### - To Add a new vehicle to the vehicle's collection:
 insert the details of the car:type, modelName, licenseNumber, maxTirePressure, isElectric
 
http://localhost:8080/add?type=car&modelName=tesla&licenseNumber=1234&maxTirePressure=20&isElectric=true
 ### for example:
![image](https://user-images.githubusercontent.com/57721728/166470984-5d4da3ff-29a9-44b7-b84b-34805cc52931.png)

### - To get all cars:
http://localhost:8080/getAll
 ### for example:
 ![image](https://user-images.githubusercontent.com/57721728/166471704-1b57d289-4374-4c5e-86c9-997ca1a9d5b9.png)

### - To get a specific car according to the license number:
http://localhost:8080/getVehicle?licenseNumber=1234
 ### for example:
 ![image](https://user-images.githubusercontent.com/57721728/166471360-0fe33e32-4108-4549-af3b-92a48bc77821.png)

### -To fill the tire in the air according to the license number:
 Need to insert licenseNumber
http://localhost:8080/inflate?licenseNumber=1234
 ### for example:
 ![image](https://user-images.githubusercontent.com/57721728/166471601-d1d41785-5577-4f43-ba7c-b9e260ac2afb.png)
 
### - To Refuel a vehicle by license number:
Need to insert licenseNumber
http://localhost:8080/addenergy?licenseNumber=1234
 ### for example:
 ![image](https://user-images.githubusercontent.com/57721728/166471803-d8201115-f8c3-422c-892d-b820c5402d97.png)

