package com.bytedance.android.livesdk.i18n.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;

@Entity(tableName = "translation")
public class d {
    @ColumnInfo(name = "key")
    @NonNull
    @PrimaryKey
    @IgnoreStyleCheck

    /* renamed from: a  reason: collision with root package name */
    public String f15617a;
    @ColumnInfo(name = "value")
    @IgnoreStyleCheck

    /* renamed from: b  reason: collision with root package name */
    public String f15618b;

    public d() {
    }

    @Ignore
    public d(String str, String str2) {
        this.f15617a = str;
        this.f15618b = str2;
    }
}
