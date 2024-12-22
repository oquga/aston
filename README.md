
## Общая часть задания: 
* написать приложение, которое будет реализовывать алгоритм сортировки по переданным классам.
* Приложение должно быть выложено на гитхаб/гитлаб, количество веток с кодом должно соответствовать количеству участников (минимум), все ветки в итоге должны быть смерджены в master/main ветку.
* Вся архитектура и код стайл должны соответствовать конвенциям языка Java.


```
Булка это Boolean, 
если числового поля нет в классе - введите его,
либо обработайте в программе, что этот класс не подлежит дополнительной сортировке"
```

## Features:

1. Программа должна выполняться в цикле.
    * Выход из цикла возможен только путем соответствующего выбора пользователя.


2. Пользователь должен иметь возможность выбирать варианты заполнения исходного массива данных и его длину.
   * из файла,
   * вручную
   * рандом,
     * Для вводимых данных (в тч из файла) должна производится валидация данных.


3. Сортировка - InsertionSort
   * Также у пользователя должна быть возможность найти какой-либо элемент отсортированной коллекции при помощи алгоритма бинарного поиска, которые также необходимо реализовать.
   * Сортировки и бинарный поиск должны быть реализованы с использованием дженериков и быть универсальными под любые классы программы.
   * В программе должен использовать паттерн стратегия.



4. Класcы:
   * Животное (Вид, Цвет глаз, Шерсть (булка)),
   * Бочка (Объем, Хранимый материал, Материал из которого изготовлена),
   * Человек (Пол, Возраст, Фамилия)
* Сортировать необходимо кастомные классы - класс должен иметь реализованный паттерн Builder.
* Все классы должны базово имплементировать сортировку по всем 3 полям. Для кастомной сортировки можно использовать компаратор. 


* 🚨 Использовать готовые реализации сортировок и поиска нельзя. Работа должна производится с массивами.

### Дополнительно:
* ❇️ Доп. задание: дополнительно к основным сортировкам реализовать эти же алгоритмы сортировки таким образом, что классы будут сортироватся по какому-либо числовому полю таким образом, что классы с четными значениями будут сортироваться в натуральном порядке, а с нечетными оставаться на своих местах.
* ❇️ Доп. доп. задание: Необходимо реализовать функционал для записи отсортированных коллекций/найденных значений в файл в режиме добавления данных






