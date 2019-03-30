package com.example.katherinele.database.Course;
import com.example.katherinele.database.DatabaseRow;

public class Course extends DatabaseRow {
    //table schema
    public static final String TABLE_NAME = "courses";
    public static final String COLUMN_CODE = "code";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_SET_NAME = "set_name";

    //column number each field ends up in
    public static final int CODE_POS = 1;
    public static final int NAME_POS = 2;
    public static final int SET_NAME_POS = 3;

    //fields in database
    private String code;
    private String name;
    private boolean setName;

    public Course(long id, String code, String name, boolean setName) {
        super(id);
        this.code = code;
        this.name = name;
        this.setName = setName;
    }

    public Course(int id, String code) {
        super(id);
        this.code = code;
        setName = false;
    }

    public Course(int id, String code, String name) {
        super(id);
        this.code = code;
        this.name = name;
        setName = true;
    }

    public Course(int id, String code, boolean setName) {
        super(id);
        this.code = code;
        this.setName = setName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSetName() {
        return setName;
    }

    public void setSetName(boolean setName) {
        this.setName = setName;
    }
}
