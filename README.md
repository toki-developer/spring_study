# spring_study

* ドッカー起動

```
docker-compose up
```

* javaコンテナにインスペクション

```
docker-compose exec java bash
```

* アプリのビルド&起動
```
sh gradlew build && java -jar build/libs/study-0.0.1-SNAPSHOT.jar
```