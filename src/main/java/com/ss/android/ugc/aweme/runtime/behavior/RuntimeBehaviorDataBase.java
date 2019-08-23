package com.ss.android.ugc.aweme.runtime.behavior;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/runtime/behavior/RuntimeBehaviorDataBase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "runtimeBehaviorDao", "Lcom/ss/android/ugc/aweme/runtime/behavior/RuntimeBehaviorDao;", "room-stuff_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@Database(entities = {c.class}, exportSchema = false, version = 1)
public abstract class RuntimeBehaviorDataBase extends RoomDatabase {
    @NotNull
    public abstract a a();
}
