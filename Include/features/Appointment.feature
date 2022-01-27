Feature: Appointment feature

  Scenario Outline: Make Appointment
    Given User masuk kehalaman login
    When User input <username> dan <password> yang valid
    And Klik button login
    Then User masuk kehalaman Make Appointment
    And User pilih Facility
    And Check Apply for hospital readmission
    And Pilih Healthcare Program
    And Input Visit Date
    And Input Comment
    And Klik button Book Appointment
    Then Masuk kehalaman Appointment Confirmation

    Examples: 
      | username | password           |
      | John Doe | ThisIsNotAPassword |
