package com.example.katherinele.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseAccessor {
    private static SQLiteDatabase mDatabase;
    private DbHelper mDBHelper;
    private Context mContext;

    public DatabaseAccessor(Context context) {
        this.mContext = context;
        mDBHelper = DbHelper.getInstance(mContext);
        open();
    }

    /**
     * Creates an instance of the database helper and opens
     * a readable/writable instance of the database.
     */
    private void open() {
        if (mDBHelper == null) {
            mDBHelper = DbHelper.getInstance(mContext);
        }
        mDatabase = mDBHelper.getWritableDatabase();
    }

    public static SQLiteDatabase getDatabase(){
        return mDatabase;
    }
}
