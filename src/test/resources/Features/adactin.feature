Feature: Booking Hotel
Scenario Outline: Booking Hotel with valid Credentials
Given user is on Login page
When user enters "<username>"and"<password>"
And user should click the Login button
And user is on Booking Page
And user enters "<Location>", "<Hotels>", "<RoomType>", "<Number of Rooms>", "<Check In Date>", "<Check Out Date>", "<Adults per Room>", "<Children per Room>"
And user enters the search button
And user select the hotel
And user Click the continue page
And user is on Book a hotel page "<First Name>", "<Last Name>", "<Billing Address>", "<Credit card no>", "<Credit Card Type>", "<Expiry Month>", "<Expiry Year>", "<CVV Number>"
And user Clicks the Book now button
And print order Id


Examples: 
| username | password  | Location | Hotels       | RoomType | Number of Rooms |Check In Date | Check Out Date | Adults per Room |Children per Room|First Name | Last Name | Billing Address | Credit card no   | Credit Card Type | Expiry Month |  Expiry Year|CVV Number |
| Nithya13 | Smiffy@18 | London   | Hotel Hervey | Deluxe   | 2 - Two         |03-03-2020    | 04-03-2020     | 1 - One         | 1 - One         |Thillai    | N         | Chennai         | 7589635425876352 | VISA             | May          |        2020 |741        |                           
 