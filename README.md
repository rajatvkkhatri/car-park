CAR PARK

Assignment 
You are required to create a simple service API that will allow a client to manage their parking slot allocation. Parking slots may be queried and managed – allocated, amended or unallocated. 
•	A car park has many parking slots. 
•	A slot could be acquired for a X number of hours, where X >= 1h and X <= 4h 
•	When the acquired time period elapses, it should be possible to allocate the slot again 

Scenarios
1.	User enters a car park and requests a free slot for a number of hours.
2.	User chooses to re-allocate their current slot for a number of hours.
3.	User leaves car park before the allocated time has passed.

Guidelines 
•	The solution should be written in Java, Scala 
•	Use a TDD approach
•	Expose API as REST resources
•	Feel free to make any assumptions, ask questions and get us engaged  
•	No restrictions on external libraries 

Simplifications
•	Any persistence can be held in memory
•	Ignore authentication and authorization concerns 
•	We do not need to handle future reservations.
•	We do not need to maintain a log or history.
