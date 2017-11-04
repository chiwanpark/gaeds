organization := "com.github.chiwanpark"

name := "gaeds"

version := "0.5.0-SNAPSHOT"

crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.4")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/chiwanpark/gaeds</url>
    <licenses>
      <license>
        <name>MIT License</name>
        <url>http://www.opensource.org/licenses/mit-license.php</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:chiwanpark/gaeds.git</url>
      <connection>scm:git:git@github.com:chiwanpark/gaeds.git</connection>
    </scm>
    <developers>
      <developer>
        <id>hexx</id>
        <name>Seitaro Yuuki</name>
        <url>https://github.com/hexx</url>
      </developer>
      <developer>
        <id>chiwanpark</id>
        <name>Chiwan Park</name>
        <url>http://chiwanpark.com</url>
      </developer>
    </developers>)

libraryDependencies ++= {
  val appengineVersion = "1.9.58"
  Seq(
    "org.json4s" %% "json4s-native" % "3.5.3",
    "com.google.appengine" % "appengine-api-1.0-sdk" % appengineVersion,
    "com.google.appengine" % "appengine-api-stubs" % appengineVersion % "test",
    "com.google.appengine" % "appengine-testing" % appengineVersion % "test",
    "commons-codec" % "commons-codec" % "1.11",
    "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  )
}
