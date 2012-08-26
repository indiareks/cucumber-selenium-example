@temp
Feature: Hotmail homepage

Scenario Outline:    browser mail example
Given I am on the blank web <browser>
When go I to <mail> home page
Then browser should show the <button>

Examples:
|browser|mail|button|
|firefox|gmail|login|
|ie|iemail|iesignup|
|chrome|hotmail|hotsignup|


Scenario Outline:    browser mail example
Given I am on the blank web <browser>
When go I to <mail> home page
Then browser should show the <button>

Examples:
|browser|mail|button|
|firefox|gmail|login|
|ie|iemail|iesignup|
|chrome|hotmail|hotsignup|


