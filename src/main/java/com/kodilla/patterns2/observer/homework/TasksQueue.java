package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements TasksObservable {

    private final List<TasksObserver> observers;
    private final List<String> tasks;
    private final String name;

    public TasksQueue(String name){
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }
    public void addTask(String task){
        tasks.add(task);
        notifyMentor();
    }

    @Override
    public void registerMentor(TasksObserver observer){
        observers.add(observer);
    }
    @Override
    public void notifyMentor(){
        for(TasksObserver observer : observers){
            observer.update(this);
        }
    }
    @Override
    public void removeMentor(TasksObserver observer){
        observers.remove(observer);
    }
    public List<String> getMessages(){
        return tasks;
    }
    public String getName(){
        return name;
    }
}
