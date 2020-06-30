package com.example.ffff

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class DbManager {

    val dbName="MYBank"
    val dbTable="Banks"
    val colInfo="Info"
    val colDes="Des"
    val colTime="Time"
    val colRate="Rate"
    val dbVersion=1
    val sqlCreateTable="CREATE TABLE IF NOT EXISTS "+ dbTable+" (" + colInfo +
            " TEXT, "+ colDes +" TEXT,"+ colTime +" TEXT, "+ colRate +" TEXT);"
    var sqlDB: SQLiteDatabase

    constructor(context: Context){
        var db=DatabaseHelperNotes(context)
        sqlDB=db.writableDatabase
    }

    inner class DatabaseHelperNotes: SQLiteOpenHelper {

        var context: Context?=null
        constructor(context: Context):super(context,dbName,null,dbVersion){
            this.context=context
        }

        override fun onCreate(p0: SQLiteDatabase?) {
            p0!!.execSQL(sqlCreateTable)
            Toast.makeText(this.context,"database is created", Toast.LENGTH_SHORT).show()
        }

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
            p0!!.execSQL("Drop table IF EXISTS"+dbTable)
        }
    }

    fun dataInsert(values: ContentValues):Long{
        val ID=sqlDB!!.insert(dbTable,"",values)
        return ID
    }

}