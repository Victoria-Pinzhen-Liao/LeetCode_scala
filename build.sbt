name := "LeetCode__"

version := "0.1"

scalaVersion := "2.13.7"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.2"
libraryDependencies += "com.eed3si9n" %% "gigahorse-okhttp" % "0.5.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test
libraryDependencies += "org.owasp" % "dependency-check-parent" % "6.3.2"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.15.4"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.6"
libraryDependencies += "org.webjars.npm" % "type-check" % "0.4.0"

scalacOptions ++= Seq(
  "-encoding", "utf8",
  "-deprecation",
  "-unchecked",
  "-Xlint",
  "-feature",
  "-Xfatal-warnings",
  "-language:existentials",
  "-language:experimental.macros",
  "-language:higherKinds",
  "-language:implicitConversions"
)