package com.ss.android.ugc.aweme.commercialize.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {a.class}, exportSchema = false, version = 1)
public abstract class ShowAdDataBase extends RoomDatabase {
    public abstract b a();
}
