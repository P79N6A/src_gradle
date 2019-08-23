package com.aweme.storage;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "black_tb")
public final class m {
    @PrimaryKey(autoGenerate = true)

    /* renamed from: a  reason: collision with root package name */
    public int f7410a;
    @ColumnInfo(name = "path", typeAffinity = 2)

    /* renamed from: b  reason: collision with root package name */
    public String f7411b;
    @ColumnInfo(name = "size", typeAffinity = 3)

    /* renamed from: c  reason: collision with root package name */
    public long f7412c;
    @ColumnInfo(name = "date", typeAffinity = 3)

    /* renamed from: d  reason: collision with root package name */
    public long f7413d;
    @ColumnInfo(name = "count", typeAffinity = 3)

    /* renamed from: e  reason: collision with root package name */
    public int f7414e;

    public m(String str, long j, int i) {
        this.f7411b = str;
        this.f7413d = j;
        this.f7414e = i;
    }
}
