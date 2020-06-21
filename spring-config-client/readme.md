## Spring Cloud Config
* Spring Cloud는 applicaition.properties 대신 bootstrap.properties를 사용한다.

## Online Refresh
* 아래 명령어로 Client Service에서 참조하는 github의 config-server-properties의 변경 사항을 자동으로 적용한다
* 적용되는 부분은 Client의 @RefreshScope 어노테이션이 적용된 Class이다.
> curl -X POST http://localhost:8080/actuator/refresh