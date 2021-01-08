package com.arifahmadalfian.noteappsroom.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Note::class], version = 1)
abstract class NoteRoomDatabase: RoomDatabase() {
}