### ReadMe.md

# Простое RESTful API с использованием Spring Boot, JPA и H2 Database

## Описание
Этот проект является примером RESTful API, который предоставляет возможность создавать, читать, обновлять и удалять информацию о продуктах компании и связанных с ними статьях.

## Технологии
- Java
- Spring Boot
- Spring Data JPA
- H2 Database (встраиваемая)
- Maven (если вы используете)

## Сущности
- Продукт (Product): id, name, description, cost
- Статья (Article): id, product_id, title, content, createdDate

## Запуск приложения
1. Клонируйте репозиторий: `git clone [url]`
2. Перейдите в директорию проекта: `cd [project_directory]`
3. Запустите приложение: `./mvnw spring-boot:run` (или используйте вашу IDE)

## Эндпоинты API
- `GET /api/products`: получить список всех продуктов.
- `POST /api/products`: создать новый продукт.
- `GET /api/products/{id}`: получить информацию о продукте по id.
- `PUT /api/products/{id}`: обновить информацию о продукте по id.
- `DELETE /api/products/{id}`: удалить продукт по id.
- `GET /api/articles`: получить список всех статей.
- `POST /api/articles`: создать новую статью.
- `GET /api/articles/{id}`: получить информацию о статье по id.
- `PUT /api/articles/{id}`: обновить информацию о статье по id.
- `DELETE /api/articles/{id}`: удалить статью по id.

## База данных
Проект использует встраиваемую базу данных H2. После запуска приложения, вы можете получить доступ к консоли H2, перейдя по адресу: `http://localhost:8080/h2-console`.

## Настройки
Конфигурация базы данных и другие настройки могут быть изменены в файле `application.properties`.

## Завершение
Не забудьте добавить проверку на ошибки, валидацию, тесты, логирование и усилить безопасность при необходимости перед деплоем в продакшн.