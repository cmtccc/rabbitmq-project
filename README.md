# rabbitmq-project
rabbitmq的简单使用

docker部署rabbitmq的命令
docker run -d -e RABBITMQ_DEFAULT_USER=chenmt -e RABBITMQ_DEFAULT_PASS=123456 -p 5672:5672 -p 15672:15672 --name rabbitmq rabbitmq:management
