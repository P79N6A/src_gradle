package com.ss.android.ugc.aweme.freeflowcard.data.a;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import com.ss.android.ugc.aweme.freeflowcard.data.b.c;
import java.util.List;

@Dao
public abstract class e {
    @Query("select * from tb_user_click_event where time between :start and :end")
    public abstract List<c> a(long j, long j2);

    @Query("delete from tb_user_click_event")
    public abstract void a();

    @Insert
    public abstract void a(c cVar);
}
