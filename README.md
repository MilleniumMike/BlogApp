
## Описание приложения блоги

Создание блога с использованием Spring Boot.
Данные находятся в памяти, для их хранения используется H2.

В приложении присутствует возможность регистрации.

Каждый зарегистрированный пользователь имеет возможность добавлять новые посты, а также оставлять комментарии к существующим постам. Незарегистрированные пользователи имеют возможность просматривать чужие блоги.

### Конфигурационные файлы

**src/resources/application.properties** - здесь находится файл конфигурации.

## Как запустить приложение
Можно запустить как из коммандной строки, так и с помощью Maven.

Чтобы посмотреть существующие посты, нужно перейти по ссылке http://localhost:8080/home

Admin username: FirstMan

Admin password: password

## Maven

**Как запустить приложение с помощью Maven Plugin**
Необходимо ввести команду:
```
$ mvn clean spring-boot:run
```
**Как запустить приложение с помощью исполняемого Jar файла**
Чтобы создать jar файл, нужно ввести команду:
```
$ mvn clean package
```
Далее для запуска приложения нужно использовать команду java -jar:
```
$ java -jar target/springblog-0.0.1-SNAPSHOT.jar
```
Чтобы выйти из приложения, нужно использовать **ctrl-c**.

## Тесты
Тесты запускаются следующей командой в корневой папке приложения:
```
$ mvn test
```

## Инструменты

Интерфейс базы данных H2:
для того, чтобы в него попасть, нужно перейти по ссылке http://localhost:8080/h2-console

