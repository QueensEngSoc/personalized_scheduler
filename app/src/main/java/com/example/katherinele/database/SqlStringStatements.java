package com.example.katherinele.database;

import com.example.katherinele.database.user.User;
import com.example.katherinele.database.user.UserManager;
import com.example.katherinele.database.Course.Course;
import com.example.katherinele.database.Course.CourseManager;
import com.example.katherinele.database.Class.OneClass;


public class SqlStringStatements {

    public static final String PHONE_DATABASE_NAME = "PHONE.db";

    //create table statements
    static final String CREATE_COURSES = "CREATE TABLE " + Course.TABLE_NAME + "(" +
            Course.ID + " INTEGER PRIMARY KEY," + Course.COLUMN_CODE + " TEXT," + Course.COLUMN_NAME + " TEXT," + Course.COLUMN_SET_NAME + " INTEGER);";

    static final String CREATE_USERS = "CREATE TABLE " + User.TABLE_NAME + "(" +
            User.ID + " INTEGER PRIMARY KEY," + User.COLUMN_NETID + " TEXT," +
            User.COLUMN_FIRST_NAME + " TEXT," + User.COLUMN_LAST_NAME + " TEXT," +
            User.COLUMN_DATE_INIT + " TEXT," + User.COLUMN_ICS_URL + " TEXT);";

    static final String CREATE_CLASSES = "CREATE TABLE " + OneClass.TABLE_NAME + "(" +
            OneClass.ID + " INTEGER PRIMARY KEY," + OneClass.COLUMN_CLASS_TYPE + " TEXT," +
            OneClass.COLUMN_BUILDING_ID + " INT," + OneClass.COLUMN_ROOM_NUM + " TEXT," +
            OneClass.COLUMN_START_TIME + " TEXT," + OneClass.COLUMN_END_TIME + " TEXT," +
            OneClass.COLUMN_DAY + " TEXT," + OneClass.COLUMN_MONTH + " TEXT," + OneClass.COLUMN_YEAR +
            " TEXT," + OneClass.COLUMN_COURSE_ID + " INT," + OneClass.COLUMN_HAS_NAME + " TEXT);";

    //Delete table statements
    static final String DELETE_COURSES = "DROP TABLE IF EXISTS " + Course.TABLE_NAME;
    static final String DELETE_USERS = "DROP TABLE IF EXISTS " + User.TABLE_NAME;
    static final String DELETE_CLASSES = "DROP TABLE IF EXISTS " + OneClass.TABLE_NAME;
}