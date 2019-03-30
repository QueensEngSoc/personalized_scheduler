package com.example.katherinele.database.Class;

import com.example.katherinele.database.DatabaseRow;


public class OneClass extends DatabaseRow {

    public static final String TABLE_NAME = "oneClass";
    public static final String COLUMN_CLASS_TYPE = "classType";
    public static final String COLUMN_BUILDING_ID = "buildingID";
    public static final String COLUMN_ROOM_NUM = "roomNumber";
    public static final String COLUMN_START_TIME = "startTime";
    public static final String COLUMN_END_TIME = "endTime";
    public static final String COLUMN_DAY = "day";
    public static final String COLUMN_MONTH = "month";
    public static final String COLUMN_YEAR = "year";
    public static final String COLUMN_COURSE_ID = "courseID";
    public static final String COLUMN_HAS_NAME = "hasName";

    //column number each field ends up in
    public static final int CLASS_TYPE_POS = 1;
    public static final int BUILDING_ID_POS = 2;
    public static final int ROOM_NUM_POS = 3;
    public static final int STIME_POS = 4;
    public static final int ETIME_POS = 5;
    public static final int DAY_POS = 6;
    public static final int MONTH_POS = 7;
    public static final int YEAR_POS = 8;
    public static final int COURSE_ID_POS = 9;
    public static final int COURSE_HAS_NAME_POS = 10;

    //fields in database
    private String type;
    private long buildingID;
    private String roomNum;
    private String startTime;
    private String endTime;
    private String day;
    private String month;
    private String year;
    private long courseID;
    private String hasName;

    public OneClass(int id, String type, String roomNum, String startTime, String endTime, String day, String month, String year) {
        super(id);
        this.type = type;
        this.roomNum = roomNum;
        this.startTime = startTime;
        this.endTime = endTime;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public OneClass(int id, String type, String roomNum, String startTime, String endTime, String day, String month, String year, String hasName) {
        super(id);
        this.type = type;
        this.roomNum = roomNum;
        this.startTime = startTime;
        this.endTime = endTime;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hasName = hasName;
    }


    //getters and setters
    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    public void setBuildingID(long buildingID) {
        this.buildingID = buildingID;
    }

    public void setHasName(String hasName) {
        this.hasName = hasName;
    }

    public String getHasName() {
        return hasName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBuildingID() {
        return buildingID;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

}