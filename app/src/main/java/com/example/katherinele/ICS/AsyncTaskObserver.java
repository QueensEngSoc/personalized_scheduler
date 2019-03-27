package com.example.katherinele.ICS;

public interface AsyncTaskObserver {
    void onTaskCompleted(Object obj);

    void beforeTaskStarted();

    void duringTask(Object obj);
}
