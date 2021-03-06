name := """athlete"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.orientechnologies" % "orientdb-core" % "2.1.0",
  "com.orientechnologies" % "orientdb-graphdb" % "2.1.0",
  "junit" % "junit" % "4.12" % "test"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
