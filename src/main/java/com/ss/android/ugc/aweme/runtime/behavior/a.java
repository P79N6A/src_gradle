package com.ss.android.ugc.aweme.runtime.behavior;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH'¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/runtime/behavior/RuntimeBehaviorDao;", "", "deleteAll", "", "deleteExpiredEntityByType", "type", "", "validTime", "", "getValidEntityByType", "", "Lcom/ss/android/ugc/aweme/runtime/behavior/RuntimeBehaviorEntity;", "insert", "entity", "room-stuff_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface a {
    @Query("SELECT * FROM runtimeBehaviorEntity where type = :type  and time > :validTime")
    @NotNull
    List<c> a(@NotNull String str, long j);

    @Insert
    void a(@NotNull c cVar);

    @Query("DELETE FROM runtimeBehaviorEntity where type = :type and time < :validTime")
    void b(@NotNull String str, long j);
}
