@Android
Feature: Login

  Scenario: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page

  Scenario: login with wrong username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    When User input email "orianisihalohogmail.com" on moka sign in page
    And User input phone "08396990139" on moka sign in page
    When User input password "ani301097"on moka sign in page
    When User click sign in button on moka login page


