Feature:Visiting store front and viewing the content
  @wip1
  Scenario Outline:User experience from <market regions>
    Given A user from one of the "<market regions>"
    When The user visits the store front"<market regions>"
    Then They should be able to view the content related to the "<market regions>"
    Examples:
      |market regions|
      |United Kingdom|
      |France        |
      |Italy         |

