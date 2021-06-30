Feature: Bank Test
  As a User I want to login to xyz bank website and perform different activities

  @Smoke,@Regression
  Scenario: User should add customer into bank manager page successfully
    Given I am on Login page
    When I click on Bank Manager Login Tab
    And I click on Add customer tab
    And I enter first name "rogger"
    And I enter last name "binny"
    And I enter post code "UL1 2KY"
    And I click on Add customer Button
    Then I should get a message "Customer added successfully"
    And I click on alert message

    @Smoke,@Sanity
    Scenario: User should open account from bank managers login successfully
      Given I am on Login page
      When I click on Bank Manager Login Tab
      And I click on Add customer tab
      And I enter first name "rogger"
      And I enter last name "binny"
      And I enter post code "UL1 2KY"
      And I click on Add customer Button
      And I click on alert message
      And I click on Open Account Tab
      And I select customer which was added before
      And I select currency pound
      And I click on process button
      Then I should get a created message "Account created successfully"
      And I click on created alert message

    @Smoke,@Sanity
    Scenario: User Should login and logout successfully
      Given I am on Login page
      When I click on Bank Manager Login Tab
      And I click on Add customer tab
      And I enter first name "rogger"
      And I enter last name "binny"
      And I enter post code "UL1 2KY"
      And I click on Add customer Button
      And I click on alert message
      And I click on Open Account Tab
      And I select customer which was added before
      And I select currency pound
      And I click on process button
      And I click on created alert message
      And I click on home button
      And I click customer login tab
      And I select customer from list
      And I click on login button
      And I have logged in successfully "Logout"
      And I click on Log out button
      Then I should see name message displayed "rogger binny"

    @Smoke,@Sanity,@Regression
    Scenario: User should deposit money successfully
      Given I am on Login page
      When I click on Bank Manager Login Tab
      And I click on Add customer tab
      And I enter first name "rogger"
      And I enter last name "binny"
      And I enter post code "UL1 2KY"
      And I click on Add customer Button
      And I click on alert message
      And I click on Open Account Tab
      And I select customer which was added before
      And I select currency pound
      And I click on process button
      And I click on created alert message
      And I click on home button
      And I click customer login tab
      And I select customer from list
      And I click on login button
      And I click on Deposit button
      And I enter amount "100"
      And I click on deposit button after amount entered
      Then I should deposit amount successfully "Deposit Successful"

  @Smoke,@Sanity,@Regression
    Scenario: User should withdraw money successfully
      Given I am on Login page
      When I click on Bank Manager Login Tab
      And I click on Add customer tab
      And I enter first name "rogger"
      And I enter last name "binny"
      And I enter post code "UL1 2KY"
      And I click on Add customer Button
      And I click on alert message
      And I click on Open Account Tab
      And I select customer which was added before
      And I select currency pound
      And I click on process button
      And I click on created alert message
      And I click on home button
      And I click customer login tab
      And I select customer from list
      And I click on login button
      And I click on Deposit button
      And I enter amount "100"
      And I click on deposit button after amount entered
      And I click on Withdrawl tab
      And I enter withdrawl amount "50"
      And I click on withdraw button
      Then I should withdraw money successfully with message "Transaction successful"



