package com.example.samca.calendartest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class DbHelper extends SQLiteOpenHelper {

    //**NOTE** this must be incremented if you are trying to run changes to the database schema
    private static final int DATABASE_VERSION = 8;

    private static DbHelper mInstance = null;

    public DbHelper(Context context) {
        super(context, SqlStringStatements.PHONE_DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Creates an instance of the DBHelper. This method ensures that only one instance
     * of DBHelper can be created at once.
     *
     * @param context Context to create the DBHelper for.
     * @return returns the instance of DBHelper.
     */
    static DbHelper getInstance(Context context) {
        if (mInstance == null) {
            //use application context so as to not accidentally leak application context in database.
            mInstance = new DbHelper(context.getApplicationContext());
        }
        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Crashlytics.logException(new Throwable("DB Version Change"));
        db.execSQL(SqlStringStatements.CREATE_USERS);
        db.execSQL(SqlStringStatements.CREATE_COURSES);
        db.execSQL(SqlStringStatements.CREATE_CLASSES);
        db.execSQL(SqlStringStatements.CREATE_DATE);
        db.execSQL(SqlStringStatements.CREATE_MONTH);
        db.execSQL(SqlStringStatements.CREATE_YEAR);
        db.execSQL(SqlStringStatements.CREATE_BUILDINGS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //deletes the database and then re-creates the new version
        db.execSQL(SqlStringStatements.DELETE_USERS);
        db.execSQL(SqlStringStatements.DELETE_COURSES);
        db.execSQL(SqlStringStatements.DELETE_CLASSES);
        db.execSQL(SqlStringStatements.DELETE_DATE);
        db.execSQL(SqlStringStatements.DELETE_MONTH);
        db.execSQL(SqlStringStatements.DELETE_YEAR);
        db.execSQL(SqlStringStatements.DELETE_BUILDINGS);
 
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
