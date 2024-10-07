package com.afapps.managenotification.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.afapps.managenotification.core.local.NotificationDatabase

fun getDatabaseBuilder(context: Context): RoomDatabase.Builder<NotificationDatabase> {
    val dbFile = context.getDatabasePath("notification.db")
    return Room.databaseBuilder(context = context, name = dbFile.absolutePath)
}