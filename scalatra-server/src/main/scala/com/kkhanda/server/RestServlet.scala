package com.kkhanda.server

import org.scalatra._

class RestServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
