
FROM eclipse-temurin:22-jre-alpine

# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем собранный JAR-файл в контейнер
COPY target/WebEnergyReporter-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт 8080 для доступа к приложению
EXPOSE 8080

# Команда запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]