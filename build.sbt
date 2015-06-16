lazy val root =
  (project in file(".")).
    settings(
      name := "scalaexamples",
      organization := "com.spotright",
      scalaVersion := "2.11.6",
      libraryDependencies ++= Seq(
        "io.spray" %% "spray-json" % "1.3.2"
      )
    )
