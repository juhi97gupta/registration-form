Feature: Registartion form

Scenario: Invalid name
Given User is on 'home' page
When User enters invalid name
Then display 'please enter name'

Scenario: Invalid address
Given User is on 'home' page
When User enters invalid address
Then Display 'please enter valid address'

Scenario: Invalid marks
Given User is on 'home' page
When User enters invalid marks
Then Display 'please enter valid marks'

Scenario: Invalid Details
Given User is on 'home' page
When User enters invalid Details
Then Display 'please enter valid Details'


Scenario: Valid Details
Given User is on 'home' page
When user enters valid details
Then display 'registration' page