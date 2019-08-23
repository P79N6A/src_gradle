package com.aweme.storage;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {m.class}, exportSchema = false, version = 1)
public abstract class StorageDatabase extends RoomDatabase {
    public abstract j a();
}
