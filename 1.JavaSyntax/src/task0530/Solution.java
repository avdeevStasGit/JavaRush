package com.javarush.task.task05.task0530;
import java.io.*;

/* 
Шеф, что-то не пашет

Чужой код — неизведанная земля. Что ждет вас там? Возможно, духовно развитые волки, поющие мантры и кровожадные лани,
готовые вцепиться зубами в чье-то горло… Мы вас не пугаем, лишь предупреждаем, что чужой код полон неожиданностей.
Давайте покопаемся в программе, которая по идее должна считать сумму двух чисел, и посмотрим, что в ней не так.

Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть только один метод main.
3. Программа должна выводить строку, которая начинается на "Sum = ".
4. Программа должна выводить строку, которая заканчивается суммой введенных чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
