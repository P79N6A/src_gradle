package com.ss.android.ugc.aweme.freeflowcard.data.a;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import com.ss.android.ugc.aweme.freeflowcard.data.b.b;
import java.util.List;

@Dao
public abstract class c {
    @Query("select * from tb_auto_play_setting")
    public abstract List<b> a();

    @Insert
    public abstract void a(b bVar);

    @Query("delete from tb_auto_play_setting")
    public abstract void b();
}
