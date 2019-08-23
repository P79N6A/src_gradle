package com.bytedance.android.livesdk.i18n.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;

@Dao
public interface e {
    @Query("SELECT * FROM translation")
    List<d> a();

    @Insert(onConflict = 1)
    void a(List<d> list);

    @Query("DELETE FROM translation")
    void b();
}
