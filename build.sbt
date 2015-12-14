name := """VascoMouta"""

version := "0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaCore,
  cache,
  filters,
  javaWs,
  "wsdl4j" % "wsdl4j" % "1.6.2",
  "org.apache.axis" % "axis-jaxrpc" % "1.4",
  "org.apache.axis" % "axis" % "1.4",
  "commons-discovery" % "commons-discovery" % "0.5",
  "org.webjars" % "bootstrap" % "3.3.5",
  "org.webjars" % "jquery" % "2.1.4",
  "org.webjars" % "jquery-ui" % "1.11.4"
)
