package com.kodilla.patterns2.observer.homework;

public interface TasksObservable {

    void registerMentor(TasksObserver tasksObserver);
    void notifyMentor();
    void removeMentor(TasksObserver tasksObserver);
}
