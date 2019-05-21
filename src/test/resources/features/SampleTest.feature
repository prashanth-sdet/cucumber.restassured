Feature: To test my first project

Scenario Outline: Request 1
	Given I create a get request with baseURI <baseuri>
	When I pass a get request for endpoint <url>  
	Then I print the response
Examples:
|baseuri|url|
|http://dummy.restapiexample.com/api/v1|/employees|
|http://dummy.restapiexample.com/api/v1|/employee/50871|

@Smoketest
Scenario Outline: Request 2
	Given I create a get request with baseURI <baseuri>
	When I pass a get request for endpoint <url>  
	Then I extract the key <key> from response
Examples:
|baseuri|url|key|
|http://dummy.restapiexample.com/api/v1|/employees|id[0]|
|http://dummy.restapiexample.com/api/v1|/employee/50871|id|
