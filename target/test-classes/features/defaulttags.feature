@all

#default tags: @wip, @dev, @ignore
Feature: enter any data1 testing

@dev @smoke
Scenario: enter any data1
Given our data in table1
When put sql injection add

@ignore @smoke
Scenario: enter any data2
Given our data in table2
When put sql injection update



Scenario: enter any data3
Given our data in table3
When put sql injection delete

@wip @smoke
Scenario: enter any data4
Given our data in table4
When put sql injection put

Scenario: enter any data5
Given our data in table5
When put sql injection patch
