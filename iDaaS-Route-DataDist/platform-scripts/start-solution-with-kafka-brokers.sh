# Kafka needs to be already running and brokers connection details passed as:
# ./start-solution-with-kafka-brokers.sh --idaas.kafkaBrokers=localhost:9092
cd ..
cd target
java -jar persist-data-transform-1.0.jar $@
