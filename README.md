# Notes App

Это простое приложение для управления заметками, состоящее из:
- **Backend**: Spring Boot (Java) с базой данных PostgreSQL.
- **Frontend**: React (JavaScript) с использованием SASS для стилей.

---

# Требования
Java Development Kit (JDK) 21, PostgreSQL, Node.js, Maven

---

# Установка и запуск
1. Необходимо локально создать в postgresql базу данных
2. В Файле /server/src/main/resources/application.yaml в графе url меняем notesdb на название своей базы данных(или просто оставляем такое же название)
3. В том же файле меняем username и password на свои(у меня стоят по умолчанию)
4. Запускаем /server/src/main/java/com/example/notesapp/NotesappApplication.java через maven (mvn clean install, mvn spring-boot:run) - localhost:8080
5. В папке client вводим npm install
6. Потом вводим npm start
7. Открываем в браузере localhost:3000
