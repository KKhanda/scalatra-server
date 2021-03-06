val ScalatraVersion = "2.6.2"

containerPort := 3000

organization := "com.kkhanda"

name := "Scalatra Server"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.4"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.8.v20171121" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.scalatra" %% "scalatra-json" % "2.6.2",
  "org.json4s" %% "json4s-jackson" % "3.5.2"
)

lazy val scalatra_server = (project in file("."))
  .enablePlugins(JettyPlugin)
  .enablePlugins(SbtTwirl)
  .enablePlugins(ScalatraPlugin)
