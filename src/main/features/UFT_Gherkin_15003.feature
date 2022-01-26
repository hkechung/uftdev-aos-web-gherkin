#Auto generated Octane revision tag
@TID15003REV0.3.0
Feature: Advantage Online
	Scenario Outline: verify mice color
		Given I am in the site 
        And I select the Mice category
		When I filter by "<color>" color
		Then the mouse price is "<price>"

	Examples:
		| color  | price  |
		| white  | $29.99 |
		| purple | $15.99 |
