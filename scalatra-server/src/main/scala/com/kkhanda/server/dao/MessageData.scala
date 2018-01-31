package com.kkhanda.server.dao

import scala.collection.mutable

object MessageData {

  var messagesMap: mutable.TreeMap[Int, String] = mutable.TreeMap[Int, String]()

  def messagesList: List[String] = {
    messagesMap.values.toList
  }

}
