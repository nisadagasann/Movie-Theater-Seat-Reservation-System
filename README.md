# Movie-Theater-Seat-Reservation-System

##Introduction
This project is a software application designed to digitize the process of movie theater seat reservation. The goal of this system is to prevent confusion and simplify the process of booking seats, by allowing customers to select their desired seat and choose additional items such as popcorn. The system keeps track of seat availability and provides an easy way to manage reservations and additional orders.

In addition, the program will ask customers about their popcorn preferences (whether they want popcorn and the weight in grams), and the system will generate a confirmation message when popcorn is ready.

Features
Seat Reservation: Customers can choose a seat number between 0-20. If the selected seat is already occupied, the system will inform the user and prompt them to choose another seat.

Popcorn Order: After selecting a seat, customers are asked if they want to buy popcorn. If they say yes, the program prompts them to enter the amount of popcorn they desire in grams. The system will display a message confirming their order and the weight of the popcorn.

Input Validation: The program ensures that the input provided by the user is valid. If the user enters an invalid seat number or response (other than "yes" or "no"), an error message will be displayed.

Ticket Types: The system allows customers to choose from different ticket types (e.g., student, adult, elderly). Based on the ticket type selected, the program calculates the ticket price.

Popcorn Price Calculation: The price of popcorn is calculated based on the weight the customer selects.

Implementation
Seat Reservation
The theater has 20 seats, numbered from 0 to 19. When the customer enters a seat number, the system checks whether the seat is available. If the seat is already taken, the system prompts the customer to choose another seat. If the seat is available, it is reserved for the customer.

Popcorn Order
After reserving a seat, the customer is asked if they want to buy popcorn. The customer is prompted to enter "yes" or "no." If they choose "yes," the system asks for the amount of popcorn in grams. Once the customer enters a valid amount, the program confirms the popcorn order with the message:

(Entered value) grams popcorn is getting ready. Enjoy the movie!

Ticket Type Selection and Price Calculation
The system offers different ticket types, such as student, adult, and elderly. The price of the ticket is calculated based on the type selected. The customer can choose their ticket type during the reservation process, and the price will be adjusted accordingly.

Additionally, the price of the popcorn will vary based on the selected weight, and this is calculated by the system.

Input Validation
If the customer enters an invalid seat number (out of the 0-19 range) or a seat that has already been reserved, the system will display an error message:
"Sorry, there's a mistake with input. Please try again..."

If the customer enters a response other than "yes" or "no" when asked about popcorn, the system will again display the same error message.

Example Usage
The customer enters their seat number, e.g., "10".

If the seat is available, the system confirms the reservation.
If the seat is already taken, an error message is shown.
The customer is asked if they want popcorn. If they select "yes", they are prompted to enter the number of grams.

For example, if the customer enters "150", the system responds:
"150 grams popcorn is getting ready. Enjoy the movie!"
The system asks for the ticket type (student, adult, elderly), and the price is calculated accordingly.

Technologies Used
Python: Programming language used to implement the entire system.
Basic Python Concepts: Loops, conditionals, and input handling are used to implement the reservation and popcorn ordering logic.
Future Enhancements
Expanded Seating Options: The theater could be expanded to allow more than 20 seats, and additional rows or sections could be added.
User Profiles: Implement user authentication, allowing customers to create and manage profiles with past reservations and preferences.
GUI Interface: A graphical user interface (GUI) could be implemented to make the reservation process more user-friendly.
How to Run
