package com.squad.testdeneme;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class MySQLiteHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "veritabani.db";
    private static final int DATABASE_VERSION = 1;

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //setForcedUpgrade(DATABASE_VERSION);

        //TODO: Son halinde kaldır!!!!! Versiyon no arttırıldığında, db'yi otomatik overwrite edecek.

    }

    /*
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.setForcedUpgrade(DATABASE_VERSION);
        super.onUpgrade(db, oldVersion, newVersion);
    }
     */


}
