package com.kkhanda.server

import org.scalatra.test.scalatest._

class RestControllerTests extends ScalatraFunSuite {

  addServlet(classOf[RestController], "/*")

  test("GET / on RestController should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
