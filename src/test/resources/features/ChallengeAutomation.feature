Feature: I As a user of the Travelocity website, I want to find a destination to go on vacation

  Background: Open web site TraveloCity
    Given that the user wants to find a destination for their vacations



   @GoingTo
  Scenario: Going to the TraveloCity platform

    When he enters the web site and chooses the going to option
      |GointTo  |
      |Cartagena|
    Then he verifies that he found the perfect accommodation Cartagena (y alrededores), Bolívar, Colombia

     @HotelReservation
     Scenario: the user wants to make a reservation with four guests
       When he enters the web site and looks for hotels for four people
         |GointTo  |
         |Pereira|
       Then he verifies that in the guest option there is the number of people that the user entered 4