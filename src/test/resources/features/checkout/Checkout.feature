@Android
Feature: Checkout
  Scenario: check out on favorites page
    Given User is on moka start page
    When User click sign in button on moka start page
    When User input email "orianisihalohogmail.com" on moka sign in page
    And User input phone "083196990139" on moka sign in page
    When User input password "ani301097"on moka sign in page
    When User click sign in button on moka login page
    When User click item "Americano"
    When User click checkout button
    When User input amount "400000" on checkout
    When User click charge button

  Scenario: save bill
    Given User is on moka start page
    When User click sign in button on moka start page
    When User input email "orianisihalohogmail.com" on moka sign in page
    And User input phone "083196990139" on moka sign in page
    When User input password "ani301097"on moka sign in page
    When User click sign in button on moka login page
    When User click item "Americano"
    When User click save Bill
    When User input Billname "Oriani"





