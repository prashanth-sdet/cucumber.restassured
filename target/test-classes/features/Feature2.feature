Feature: POST

Scenario Outline: Request 3
	Given I create a post request with baseURI <baseuri> and request <request>
	When I pass a post request for endpoint <url>  
	Then I extract the key <key> from response
Examples:
|baseuri|url|request|key|
|http://dummy.restapiexample.com/api/v1|/create|\\suite1\\request1.txt|id|
|http://dummy.restapiexample.com/api/v1|/create|\\suite1\\request1.json|id|

@data
Scenario: to practise data tables
	Given I practice data tables
|Fields|values|
|Value1|uft|
|Value2|cucumber|
|Value3|selenium|
	And I practice data tables again 
|Fields|values|
|Value1|uft|
|Value2|cucumber|
|Value3|selenium|
	And I test step 89 definitions