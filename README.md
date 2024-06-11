### Hexlet tests and linter status:
[![Actions Status](https://github.com/AAvchinnikova/java-project-78/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/AAvchinnikova/java-project-78/actions)

### Maintainability Badge
<a href="https://codeclimate.com/github/AAvchinnikova/java-project-78/maintainability"><img src="https://api.codeclimate.com/v1/badges/82fd6b1042698f8ee6a1/maintainability" /></a>

### Test Coverage Badge
<a href="https://codeclimate.com/github/AAvchinnikova/java-project-78/test_coverage"><img src="https://api.codeclimate.com/v1/badges/82fd6b1042698f8ee6a1/test_coverage" /></a>

### Data validator
Data validator это библиотека для проверки корректности данных для следующих типов: String, Number, Map.
Библиотека содержит методы для следующих проверок:

### String:
required()  -  значение не пустое или не установлено как null,
minLength() - длина строки меньше или равна установленного значения,
contains()  -  строка содержит переданное значение (substring).
### Number:
required() - значение не установлено как null,
positive() - переданное число позитивно,
range()    - переданное число находиться внутри заданного диапазона (включительно).
### Map:
required() - значение не установлено как null,
sizeof()   - проверка, что Map равно заданному размеру,
shape()    - позволяет описать проверку вставленных объектов карты по ключам.
