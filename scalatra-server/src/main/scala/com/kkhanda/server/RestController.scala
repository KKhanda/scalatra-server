package com.kkhanda.server

import com.kkhanda.server.dao.MessageData
import com.kkhanda.server.models.{Message, Text}
import org.json4s.{DefaultFormats, Formats}
import org.scalatra._
import org.scalatra.json.JacksonJsonSupport

class RestController extends ScalatraServlet with JacksonJsonSupport {

  protected implicit val jsonFormats: Formats = DefaultFormats

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
    views.html.messages(MessageData.messagesMap)
  }

  get("/messages/:id") {
    val id: Int = params("id").toInt
    if (MessageData.messagesMap.contains(id)) {
      views.html.get_message(MessageData.messagesMap(id))
    } else {
      response.sendError(404, "Message with id " + id + " does not exist")
    }
  }

  put("/messages/:id") {
    val id: Int = params("id").toInt
    val text = parsedBody.extract[Text]
    if (MessageData.messagesMap.contains(id)) {
      MessageData.messagesMap(id) = text.text
    } else {
      response.sendError(404, "Message with id " + id + " does not exist")
    }
  }

  delete("/messages/:id") {
    val id: Int = params("id").toInt
    if (MessageData.messagesMap.contains(id)) {
      MessageData.messagesMap.remove(id)
    } else {
      response.sendError(404, "Message with id " + id + " does not exist")
    }
  }

}
