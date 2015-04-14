name := """VascoMouta"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  javaCore,
  cache,
  filters,
  javaWs,
  "org.webjars" %% "webjars-play" % "2.4.0-M3-1-SNAPSHOT",
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "jquery" % "2.1.3",
  "org.webjars" % "jquery-ui" % "1.11.4"
)
