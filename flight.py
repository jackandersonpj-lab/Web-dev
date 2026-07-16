print("My ticket counter")
traveler_name="Jack"
destination="India"
ticket_price1 = 120
ticket_price2 = 100
total_cost = ticket_price1 + ticket_price2
print("Booking Details")
print("Traveler Name:",traveler_name)
print("Destination:",destination)
print("Ticket one price:",ticket_price1)
print("Ticket two price:",ticket_price2)
print("Total cost:",total_cost)
if ticket_price1 > ticket_price2:
    print("First ticket is more expensive")
elif ticket_price1 < ticket_price2:
    print("Second ticket is more expensive")
else:
    print("Both tickets have the same price")
