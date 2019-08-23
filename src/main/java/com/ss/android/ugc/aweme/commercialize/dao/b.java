package com.ss.android.ugc.aweme.commercialize.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;

@Dao
public interface b {
    @Query("SELECT * FROM showAd where awemeId = :videoId")
    List<a> a(String str);

    @Query("delete from showAd")
    void a();

    @Insert
    void a(a aVar);
}
