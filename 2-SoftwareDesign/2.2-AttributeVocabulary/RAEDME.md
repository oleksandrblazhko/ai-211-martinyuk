### Словник атрибутів об’єктів

|Об'єкт | Атрибут | Короткий опис | Тип | Обмеження |
|:-         |:-        |:-           |:-      |:-          |
| User  | Email   | Google email    | text   | length <64 symbols|
| User  | Name    | User`s name  | text     | length <64 symbol |
| Project | Name |  Project`s name | text | length <64 symbol |
| Project | Description | Text descriprtion of project |text | length <64 symbol |
| Consumption| Date | Consumption Date |  date |   |
| Consumption| Time | Time when it was consumed | time ||
| Consumption| Location | Where it was consumed | text |  length <64 symbol|
| Consumption| Quantity | Quantity of Kwh | text | length <64 symbol|
| Notification about cleanliness | Time of sending | Date when notification would be shown | date|
| Notification about cleanliness | Text | Text that will be shown in notification | text | length <64 symbol |
| Eco Rating | Eco percentage |  Percentage that is calculated with formula|number | value>0|
| Eco Rating | Date |  Consumption Date | date |
