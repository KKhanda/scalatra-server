package com.kkhanda.server

import com.kkhanda.server.dao.MessageData
import com.kkhanda.server.models.Message
import org.json4s.{DefaultFormats, Formats}
import org.scalatra._
import org.scalatra.json.JacksonJsonSupport

class RestController extends ScalatraServlet with JacksonJsonSupport {

  protected implicit val jsonFormats: Formats = DefaultFormats

  // Setting 'content-type' header to 'application/json' before each of the requests
  // Not writing 'application/json' because mapping exists inside formats implementation
  before() {
    contentType = formats("json")
  }

  post("/messages/") {
    val message = parsedBody.extract[Message]
    if (MessageData.messagesMap.contains(message.id)) {
      response.sendError(406, "Message with id " + message.id + " already exists")
    } else {
      MessageData.messagesMap.put(message.id, message.text)
    }
  }

  get("/") {
    views.html.greeting()
  }

  get("/messages/") {
    views.html.messages(MessageData.messagesList)
  }

  get("messages/:id") {

  }

}
