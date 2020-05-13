import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"
  lazy val `kind-projector` = "org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full
}