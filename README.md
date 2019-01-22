# Test sbt project to debug rollbar native agent

1. Compile project

        sbt clean compile assembly

2. Run app

        env RB=*** java -agentpath:../rollbar-java/native-agent/target/release/librollbar_java_agent.so -cp target/scala-2.10/sbt-native-agent-test-assembly-0.0.1.jar com.samebug.dev.Test
