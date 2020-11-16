# cloud2020
springcloud全家桶

springcloud-config-bus:
全局广播通知：
curl -X POST "http://localhost:3344/actuator/bus-refresh"
定点通知：
curl -X POST "http://localhost:3344/actuator/bus-refresh/cloud-provider-hystrix-payment:8001"