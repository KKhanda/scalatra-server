package com.kkhanda.server

import com.kkhanda.server.dao.MessageData
import org.scalatra._

class RestController extends ScalatraServlet {

//  get("/") {
//    views.html.hello()
//  }

  post("/messages") {

  }

  get("/") {
    views.html.greeting()
  }

  get("/messages") {
    views.html.messages(MessageData.messagesList)
  }

}
