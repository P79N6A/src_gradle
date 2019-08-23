package com.ss.android.ugc.aweme.challenge.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "localHashTag")
public class c {
    @PrimaryKey
    @ColumnInfo(name = "name")
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public String f35395a;
    @ColumnInfo(name = "time")

    /* renamed from: b  reason: collision with root package name */
    public Long f35396b;

    public c() {
    }

    @Ignore
    public c(Long l, String str) {
        this.f35396b = l;
        this.f35395a = str;
    }
}
