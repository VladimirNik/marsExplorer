import sbt._
import Keys._

object build extends Build {
  val marsExplorer = Project(
    id = "marsExplorer", 
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq(
      name := "marsExplorer",
      version := "0.1.0",
      scalaVersion := "2.11.0-M8",
      libraryDependencies ++= Seq(
        compilerPlugin("org.scala-lang.plugins" %% "marsplugin" % "0.1.0")
      )
    )
  )
}
