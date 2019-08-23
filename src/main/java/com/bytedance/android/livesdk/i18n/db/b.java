package com.bytedance.android.livesdk.i18n.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

@Dao
public interface b {
    @Query("SELECT * FROM information WHERE `key` = :key")
    a a(String str);

    @Insert(onConflict = 1)
    void a(a aVar);
}
