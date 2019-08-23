package com.ss.android.ttve.model;

import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f31220a;

    /* renamed from: b  reason: collision with root package name */
    public float f31221b;

    /* renamed from: c  reason: collision with root package name */
    public float f31222c;

    /* renamed from: d  reason: collision with root package name */
    public Map<Integer, Float> f31223d;

    public e() {
        this("", 0.0f, 0.0f);
    }

    public final void a(Map<Integer, Float> map) {
        if (this.f31223d == null) {
            this.f31223d = map;
        } else {
            this.f31223d.putAll(map);
        }
    }

    private e(String str, float f2, float f3) {
        this.f31220a = str;
        this.f31221b = 0.0f;
        this.f31222c = 0.0f;
    }
}
