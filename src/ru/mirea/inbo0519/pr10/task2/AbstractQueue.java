package ru.mirea.inbo0519.pr10.task2;

public abstract class AbstractQueue<T> implements MyQueue<T> {
    int size;

    public boolean isEmpty()
    {
        return size==0;
    }

    abstract public void display();
}
