Mood Ring - A project that allows a client to search Twitter feeds by keyword and location using Spring Integration. This application was inspired by the moods and events being posted to Twitter feeds in the middle east during the protests in Egypt in the Spring of 2011.
================================================================================

To begin run the following maven commands.

* running the "Main" class from within you IDE (Right-click on Main class --> Run As --> Java Application)
* or from the command line:
    - mvn package
    - mvn exec:java

An src/main/resources/oauth.properties will need to be created to provide Twitter OAuth information including:
 twitter.oauth.consumerKey=<consumerKey>
 twitter.oauth.consumerSecret=<Consumer Secret>
 twitter.oauth.accessToken=<Access Token>
 twitter.oauth.accessTokenSecret=<Access Token Secret>

--------------------------------------------------------------------------------

For help please take a look at the Spring Integration documentation:

http://www.springsource.org/spring-integration

