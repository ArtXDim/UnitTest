Урок 5. Другие виды тестирования

*Задание 1.

*Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты. Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

Unit-тест "testAddContact" - проверка добавления нового контакта в записную книжку.

Unit-тест "testEditContact" - проверка редактирования существующего контакта в записной книжке.

Unit-тест "testDeleteContact" - проверка удаления контакта из записной книжки.

Unit-тест "testGetAllContacts" - проверка получения всех контактов из записной книжки.
Unit-тест "testGetContactById" - проверка получения контакта по его id из записной книжки.

Интеграционный тест "testAddContactToDatabase" - проверка добавления нового контакта в базу данных.

Интеграционный тест "testEditContactInDatabase" - проверка редактирования существующего контакта в базе данных.

Интеграционный тест "testDeleteContactFromDatabase" - проверка удаления контакта из базы данных.

Интеграционный тест "testGetAllContactsFromDatabase" - проверка получения всех контактов из базы данных.

Интеграционный тест "testGetContactByIdFromDatabase" - проверка получения контакта по его id из базы данных.

Сквозной тест "testAddEditDeleteContact" - проверка добавления, редактирования и удаления контакта в записной книжке и базе данных.

Сквозной тест "testGetAllContactsFromUI" - проверка отображения всех контактов в пользовательском интерфейсе.

*Задание 2.

*Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов"". ""Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов"". ""Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление"".

Юнит-тест, так как проверяется отдельный метод addContact.
Сквозной тест, так как проверяется взаимодействие пользовательского интерфейса и списка контактов.
Интеграционный тест, так как проверяется полный цикл работы с контактом, включая добавление, редактирование и удаление.