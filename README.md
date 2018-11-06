# logbook-post-bug
Sample Spring Boot app demonstrating the logbook bug regarding printing of POST request body


This app demonstrates the bug where Logbook does not print POST request body if the Content-Type is `application/x-www-form-urlencoded`.
For more details, see https://github.com/zalando/logbook/issues/382
