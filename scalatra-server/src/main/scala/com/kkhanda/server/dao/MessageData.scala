package com.kkhanda.server.dao

import scala.collection.mutable

object MessageData {

  var messagesMap = mutable.HashMap(1 -> "Test 1", 2 -> "Test 2")
  var messagesList: List[String] = messagesMap.values.toList

}
