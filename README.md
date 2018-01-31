# Scalatra Server #
Scalatra server application build during the Functional Programming and Scala Language course

## Installation ## 
```sh
$ git clone https://github.com/KKhanda/scalatra-server.git
$ cd scalatra_server
```

## Build & Run ##
From root directory (~/.../scalatra_server/): 
```sh
$ cd scalatra_server
$ sbt
> jetty:start
```
**The server will start on port 3000**
### Available routes ###
Please refer to the information provided on [http://localhost:3000/](http://localhost:3000/)

### Suggestions ###
I suggest you to use [Postman](https://www.getpostman.com) for API requests

## Built with ###
* [Scalatra](http://scalatra.org)
* [Jetty](https://www.eclipse.org/jetty/)
* [xsbt-web-plugin](https://github.com/earldouglas/xsbt-web-plugin)
* [Twirl](https://github.com/playframework/twirl)
  