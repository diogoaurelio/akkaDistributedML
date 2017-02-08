name := "akkaDistributedML"

version := "1.0"

scalaVersion := "2.11.8"


lazy val akkaVersion = "2.4.16"

fork in Test := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion
  ,"com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion
  ,"com.typesafe.akka" %% "akka-persistence" % akkaVersion
  ,"org.iq80.leveldb" % "leveldb" % "0.7"
  ,"org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8"
  ,"com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
  ,"org.scalatest" %% "scalatest" % "2.2.4" % "test"
  ,"commons-io" % "commons-io" % "2.4" % "test"
  ,"org.scalanlp" %% "breeze" % "0.12"
  ,"org.scalanlp" %% "breeze-natives" % "0.12"
  ,"org.scalanlp" %% "breeze-viz" % "0.12"
)

resolvers ++= Seq(
  // other resolvers here
  // if you want to use snapshot builds (currently 0.12-SNAPSHOT), use this.
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
