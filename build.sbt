name := "hello-mainargs-scala"

version := "0.1"

scalaVersion := "3.3.3"

scalacOptions += "@.scalacOptions.txt"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "mainargs" % "0.6.3"
)

enablePlugins(JavaAppPackaging)
