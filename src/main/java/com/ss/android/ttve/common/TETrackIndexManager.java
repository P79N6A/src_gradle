package com.ss.android.ttve.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class TETrackIndexManager {

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f31150a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f31151b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f31152c = -1;

    /* renamed from: d  reason: collision with root package name */
    private List<Integer> f31153d = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    public @interface TETrackType {
    }

    public final int a(int i, int i2) {
        if (this.f31151b == -1) {
            this.f31151b = i2;
        }
        if (this.f31150a.size() > 0) {
            i2 = this.f31150a.get(this.f31150a.size() - 1).intValue() + 1;
        }
        this.f31150a.add(Integer.valueOf(i2));
        return i2;
    }

    public final int b(int i, int i2) {
        if (i2 < this.f31151b || this.f31151b == -1) {
            return i2;
        }
        for (int i3 = 0; i3 < this.f31150a.size(); i3++) {
            if (i2 == this.f31150a.get(i3).intValue()) {
                return i3 + this.f31151b;
            }
        }
        return i2;
    }
}
