import _root_.sbt.Keys._

name := "SparkTest"

version := "1.0"

scalaVersion := "2.11.8"



libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.0" % "provided",
  "org.apache.spark" %% "spark-streaming" % "1.5.0",
  "org.apache.spark" %% "spark-streaming-twitter" % "1.5.0",
  "org.apache.spark" %% "spark-mllib" % "1.5.0",
  "org.apache.commons" % "commons-lang3" % "3.0",
  "org.scalaj" %% "scalaj-http" % "1.1.5",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.3.0",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.3.0" classifier "models",
  "org.twitter4j" % "twitter4j-core" % "3.0.5",
  "org.twitter4j" % "twitter4j-stream" % "3.0.5",
  "org.mongodb" % "mongo-java-driver" % "3.2.1")







