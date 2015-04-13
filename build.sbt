name := """VascoMouta"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  filters,
  javaWs
)
