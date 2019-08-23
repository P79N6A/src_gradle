package com.ss.android.ugc.aweme.runtime.behavior;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0007\b\u0016¢\u0006\u0002\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/runtime/behavior/RuntimeBehaviorEntity;", "", "type", "", "time", "", "msg", "(Ljava/lang/String;JLjava/lang/String;)V", "()V", "id", "", "getId", "()I", "setId", "(I)V", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getType", "setType", "room-stuff_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@Entity(tableName = "runtimeBehaviorEntity")
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63683a;
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")

    /* renamed from: b  reason: collision with root package name */
    public int f63684b;
    @NotNull
    @ColumnInfo(name = "type")

    /* renamed from: c  reason: collision with root package name */
    public String f63685c = "";
    @ColumnInfo(name = "time")

    /* renamed from: d  reason: collision with root package name */
    public long f63686d;
    @NotNull
    @ColumnInfo(name = "msg")

    /* renamed from: e  reason: collision with root package name */
    public String f63687e = "";

    public c() {
    }

    @Ignore
    public c(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "type");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        this.f63685c = str;
        this.f63686d = j;
        this.f63687e = str2;
    }
}
