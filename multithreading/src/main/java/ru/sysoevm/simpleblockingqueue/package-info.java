package ru.sysoevm.simpleblockingqueue;

/*
Реализуйте шаблон Producer Consumer.
Для этого вам необходимо реализовать собственную версию bounded blocking queue. Это блокирующая очередь, ограниченная по размеру.
Producer помещает данные в очередь, а Consumer извлекает данные из очереди.

Если очередь заполнена полностью, то при попытке добавления поток Producer блокируется, до тех пор пока Consumer не извлечет очередные данные, т.е. в очереди появится свободное место. И наоборот если очередь пуста поток Consumer блокируется, до тех пор пока Producer не поместит в очередь данные.
 */