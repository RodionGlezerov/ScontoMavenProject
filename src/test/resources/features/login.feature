Feature: Sconto Login
  Login in the website to see the user area

  @validCredentials
  Scenario: Successful Login
    Given Navigate to Home Page
    When Click on Anmelden icon
    Then Login Page dispalyed

    When Enter the valid credantials
    And Click on Anmelden button
    Then Home Page displayed

    When Click on Mein Konto icon
    Then User Name is dispalyed

  @invalidEmail
  Scenario Outline: Login with a wrong email
    Given Navigate to Home Page
    When Click on Anmelden icon
    Then Login Page dispalyed

    When Enter the wrong email and a valid password
      | email   | password   |
      | <email> | <password> |
    And Click on Anmelden button
    Then Email Error message dispalyed
    Examples:
      | email            | password        |
      | tomfordgmail.com | +bKvVs9dD+YK5u! |
      | tomford@gmailcom | +bKvVs9dD+YK5u! |
      | tomford@gmail@co | +bKvVs9dD+YK5u! |

  @emptyEmailField
  Scenario Outline: Login without email
    Given Navigate to Home Page
    When Click on Anmelden icon
    Then Login Page dispalyed
    When Enter valid password
      | email   | password   |
      | <email> | <password> |
    And Click on Anmelden button
    Then Email message displayed
    Examples:
      | email | password        |
      |       | +bKvVs9dD+YK5u! |

  @emptyPasswordField
  Scenario Outline: Login without email
    Given Navigate to Home Page
    When Click on Anmelden icon
    Then Login Page dispalyed
    When Enter valid Email
      | email   | password   |
      | <email> | <password> |
    And Click on Anmelden button
    Then Password message displayed
    Examples:
      | email             | password |
      | tomford@gmail.com |          |
