package com.aweme.storage;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;

@Dao
public interface j {
    @Query("select * from black_tb")
    List<m> a();

    @Insert(onConflict = 2)
    void a(m... mVarArr);

    @Delete
    void b(m... mVarArr);
}
