package ru.netology.javacore;

import org.junit.jupiter.api.*;

public class TodosTests {

    @Test
    public void addTaskTest() {

        Todos todo = new Todos();

        todo.addTask("Задача 1");

        boolean actual = todo.getAllTasks().contains("Задача 1");

        Assertions.assertTrue(actual);
    }

    @Test
    public void removeTaskTest() {

        Todos todo = new Todos();

        todo.addTask("Очередное задание");
        todo.removeTask("Очередное задание");

        boolean actual = todo.getAllTasks().contains("Очередное задание");

        Assertions.assertFalse(actual);
    }


    @Test
    public void getAllTasksTest() {

        Todos todo = new Todos();

        String expected = "Задание 1" + " "
                + "Задание 2" + " "
                + "Задание 3" + " ";

        todo.addTask("Задание 1");
        todo.addTask("Задание 2");
        todo.addTask("Задание 3");

        Assertions.assertEquals(expected, todo.getAllTasks());
    }

}