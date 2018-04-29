package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TasksQueueTestSuite {

    @Test
    public void testTasksQueue(){
        TasksQueue hibernateModule = new TaskLearnHibernate();
        TasksQueue springModule = new TaskLearnSpring();
        TasksQueue arraysModule = new TaskLearnArrays();
        Mentor john = new Mentor("John");
        Mentor mary = new Mentor("Mary");

        hibernateModule.registerMentor(john);
        hibernateModule.registerMentor(mary);
        springModule.registerMentor(mary);
        arraysModule.registerMentor(john);
        arraysModule.registerMentor(mary);



        hibernateModule.addTask("Module 1.1 finished");
        hibernateModule.addTask("Module 1.2 started");
        springModule.addTask("Module 3.1 in progress");
        arraysModule.addTask("Module 2.2 started");

        assertEquals(3, john.getUpdateCount());
        assertEquals(4, mary.getUpdateCount());




    }
}
