Feature: I As a user of the Travelocity website, I want to find a destination to go on vacation

  Background: Open web site TraveloCity
    Given that the user wants to find a destination for their vacations



  Scenario: Going to the TraveloCity platform

    When he enters the web site and chooses the going to option
      |GointTo  |
      |Cartagena|
    Then he verifies that he found the perfect accommodation Cartagena (y alrededores), Bolívar, Colombia


     Scenario: the user wants to make a reservation with four guests
       When he enters the web site and looks for hotels for four people
         |GointTo|
         |Pereira|
       Then he verifies that in the guest option there is the number of people that the user entered 4



       Scenario: the user wants to make a reservation for a flight by avianca
         When he enters and looks for a flight but with the avianca airline
           |orgin |GointTo  |
           |Bogotá|Cartagena|
         Then he verifies that the flight chosen was the one delivered Avianca
