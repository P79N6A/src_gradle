package com.ss.android.ugc.aweme.challenge.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;

@Dao
public interface a {
    @Query("SELECT * FROM localHashTag order by time desc")
    List<c> a();

    @Query("DELETE FROM localHashTag WHERE time in(SELECT time FROM localHashTag ORDER BY time ASC LIMIT :num)")
    void a(int i);

    @Insert(onConflict = 4)
    void a(c cVar);

    @Query("SELECT count(*) FROM localHashTag")
    int b();

    @Update(onConflict = 4)
    void b(c cVar);
}
