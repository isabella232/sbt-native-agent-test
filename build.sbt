import sbt._

name := "sbt-native-agent-test"
version := "0.0.1"
scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.rollbar" % "rollbar-java" % "1.4.0"
)
