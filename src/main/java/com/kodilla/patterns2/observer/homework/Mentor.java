package com.kodilla.patterns2.observer.homework;

public class Mentor implements TasksObserver{

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(mentorName + ": New tasks from " +
                tasksQueue.getName() + "\n");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }
    public int getUpdateCount(){
        return updateCount;
    }
}
