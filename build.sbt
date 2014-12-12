name := "minimal-java"

version := "1.0"

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  // libraryDependencies += TypesafeLibrary.akkaActor.value,
  "junit"             % "junit"           % "4.11"  % "test",
  "com.novocode"      % "junit-interface" % "0.10"  % "test"
)
