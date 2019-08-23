package com.ss.android.ugc.aweme.freeflowcard.data.a;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;

@Dao
public abstract class a {
    @Query("select * from tb_app_start_mode where time between :start and :end")
    public abstract List<com.ss.android.ugc.aweme.freeflowcard.data.b.a> a(long j, long j2);

    @Query("select * from tb_app_start_mode where start_mode=:mode and time between :start and :end")
    public abstract List<com.ss.android.ugc.aweme.freeflowcard.data.b.a> a(long j, long j2, int i);

    @Query("delete from tb_app_start_mode")
    public abstract void a();

    @Insert
    public abstract void a(com.ss.android.ugc.aweme.freeflowcard.data.b.a aVar);
}
