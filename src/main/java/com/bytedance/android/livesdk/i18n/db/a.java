package com.bytedance.android.livesdk.i18n.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;

@Entity(tableName = "information")
public class a {
    @ColumnInfo(name = "key")
    @NonNull
    @PrimaryKey
    @IgnoreStyleCheck

    /* renamed from: a  reason: collision with root package name */
    public String f15610a;
    @ColumnInfo(name = "value")
    @IgnoreStyleCheck

    /* renamed from: b  reason: collision with root package name */
    public String f15611b;

    public a() {
    }

    @Ignore
    public a(String str, String str2) {
        this.f15610a = str;
        this.f15611b = str2;
    }
}
