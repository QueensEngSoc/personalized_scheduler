package com.example.katherinele.database;

public abstract class DatabaseRow {
    public static final String TABLE_NAME = ""; //must be overridden in children
    public static final String ID = "ID";
    public static final int ID_POS = 0;
    private long id;

    public DatabaseRow(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}