Feature: 

  Scenario Outline:
: 
    Given Create issue in jira with payload "<project>" "<summary>" "<description>"
    When user calls "createIssue" with post http request
    Then Api got success with status code 200
    And "status" in respones body is "OK"

    Examples:
           |project|summary|description|
           |JIR|First bug created through automation framework|Creating an issue while setting custom field values|