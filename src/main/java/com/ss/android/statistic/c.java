package com.ss.android.statistic;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Map;

public final class c {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public String f31116a;

    /* renamed from: b  reason: collision with root package name */
    public int f31117b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Object> f31118c;

    public final boolean a() {
        if (b.h == (this.f31117b & b.h)) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (b.i == (this.f31117b & b.i)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = "";
        if (this.f31118c != null) {
            for (Map.Entry next : this.f31118c.entrySet()) {
                str = str + "[key:" + next.getKey() + " value: " + next.getValue() + "]";
            }
        }
        return "event: " + this.f31116a + " send channels: " + this.f31117b + " info: " + str;
    }

    public c(@NonNull String str, @Nullable Map<String, Object> map, @NonNull int i) {
        this.f31116a = str;
        this.f31118c = map;
        this.f31117b = i;
    }
}
