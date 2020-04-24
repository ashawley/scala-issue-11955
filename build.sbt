scalaVersion := "2.13.1"

crossScalaVersions := Seq(
  "2.13.1",
  "2.13.2-bin-d433c3e",
  "2.13.2-bin-98c1648", // !
  "2.13.2"              // !
)

apiMappings ++= {
  Map(
    scalaInstance.value.libraryJar
      -> url(s"http://www.scala-lang.org/api/${scalaVersion.value}/")
  ) ++ Map(
    file("/modules/java.base")
      -> url("https://docs.oracle.com/en/java/javase/11/docs/api/java.base")
  )
}

resolvers += "scala-integration" at
  "https://scala-ci.typesafe.com/artifactory/scala-integration/"
