package com.kkhanda.server.dao

import scala.collection.mutable

object MessageData {

  var messagesMap: mutable.HashMap[Int, String] = mutable.HashMap[Int, String]()

  def messagesList: List[String] = {
    messagesMap.values.toList
  }

}
