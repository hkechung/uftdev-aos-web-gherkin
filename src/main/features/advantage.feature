#Auto generated NGA revision tag
@TID8021REV0.2.0
Feature: Advantage Online
	verify multiple scenarios

	Scenario Outline: verify mice color
		Given I am in the site
		And I select the Mice category
		When I filter by "<color>" color
		Then the mouse price is "<price>"

		Examples:
			| color  | price |
			| white  | $29.99 |
			| purple | $9.99 |
