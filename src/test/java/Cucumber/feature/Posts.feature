Feature: Post feature of facebook
  This will test the functionality at the user wall
  Background: This is for common steps
    Given User should be logged in and  should be present at  its own wall
  Scenario: Post a message on user wall
    When I type the message as "My Post"in the textbox
    And Click on Post button
    Then The message should get posted

  Scenario: Post a video on user wall
    When User supply the youtube link as "https://www.google.com" in the textbox
    And Click on Post button
    Then Then video should have proper thumbnail.