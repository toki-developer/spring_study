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

```
curl -X POST -H "Content-Type: application/json" -d '{"title":"ご飯を食べる","description":"スーパーへ買い物に行き、ご飯を買ってくる。9時までに食べる", "importance":1, "period": "2021-09-01"}'  http://localhost:8080/todo
```

```
 curl -X PATCH -H "Content-Type: application/json" -d '{"description":"testtesttesttest"}' http://localhost:8080/todo/4
```