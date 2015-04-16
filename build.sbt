name := """VascoMouta"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  javaCore,
  cache,
  filters,
  javaWs,
  "wsdl4j" % "wsdl4j" % "1.6.2",
  "org.apache.axis" % "axis-jaxrpc" % "1.4",
  "org.apache.axis" % "axis" % "1.4",
  "org.webjars" %% "webjars-play" % "2.4.0-M3-1-SNAPSHOT",
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "jquery" % "2.1.3",
  "org.webjars" % "jquery-ui" % "1.11.4"
)
