package com.bytedance.android.livesdk.i18n.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {d.class, a.class}, exportSchema = false, version = 1)
public abstract class I18nDatabase extends RoomDatabase {
    public abstract e a();

    public abstract b b();
}
