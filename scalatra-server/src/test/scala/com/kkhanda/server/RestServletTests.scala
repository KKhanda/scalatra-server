package com.kkhanda.server

import org.scalatra.test.scalatest._

class RestServletTests extends ScalatraFunSuite {

  addServlet(classOf[RestServlet], "/*")

  test("GET / on RestServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
