package com.ss.android.ugc.aweme.challenge.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {c.class}, exportSchema = false, version = 1)
public abstract class LocalHashTagDataBase extends RoomDatabase {
    public abstract a a();
}
