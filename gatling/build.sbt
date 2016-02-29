name := "gatling-sbt-prototype"

version := "1.0"

scalaVersion := "2.11.7"

val root = project.in(file("."))
  .enablePlugins(GatlingPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7" % "test",
      "io.gatling"            % "gatling-test-framework"    % "2.1.7" % "test"
    )
  )

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.2.1"
)