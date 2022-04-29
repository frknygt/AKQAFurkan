Feature: Personalized Engagement Ring
  @wip2
  Scenario Outline:Viewing all available rings "<market regions>"
    Given A user from one of the "<market regions>"
    When I view all available "Engagement rings"
    Then I should be able to filter the product by all available following filters
      |MATERIAL|
      |SIZE    |
      |CUT     |
      |PRICE   |
    Examples:
      |market regions|
      |United Kingdom|
      |France        |
      |Italy         |

  @wip3
  Scenario Outline:Adding personalised engagement ring to the bag "<market regions>"
    Given A user from one of the "<market regions>"
    When I view the details of a ring
    Then I should be able to personalise the ring on and add it to the shopping bag
    Examples:
      |market regions|
      |United Kingdom|
      |France        |
      |Italy         |
  @wip4
  Scenario Outline:Adding an engagement ring to the shopping bag "<market regions>"
    Given A user from one of the "<market regions>"
    When I add an engagement ring to the shopping bag
    Then I should be able to place an order for the ring
    Examples:
      |market regions|
      |United Kingdom|
      |France        |
      |Italy         |
