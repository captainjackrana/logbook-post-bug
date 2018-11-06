# logbook-post-bug
Sample Spring Boot app demonstrating the logbook bug regarding printing of POST request body


This app demonstrates the bug where Logbook does not print POST request body if the Content-Type is `application/x-www-form-urlencoded`.
For more details, see https://github.com/zalando/logbook/issues/382

1. Run the app & open http://localhost:8080/
2. Enter any text in search box and click submit
3. Check the logs printed. The request log does not have a `body` key 
