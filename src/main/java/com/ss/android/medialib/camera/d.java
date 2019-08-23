package com.ss.android.medialib.camera;

import android.content.Context;
import android.graphics.Point;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f29516a = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* renamed from: b  reason: collision with root package name */
    public Context f29517b;

    /* renamed from: c  reason: collision with root package name */
    public int f29518c = 1;

    /* renamed from: d  reason: collision with root package name */
    public int f29519d = 7;

    /* renamed from: e  reason: collision with root package name */
    public int f29520e = 30;

    /* renamed from: f  reason: collision with root package name */
    public int f29521f = 1280;
    public int g = 720;
    public boolean h;
    public int i = -1;
    public int j = -1;
    public boolean k;
    public boolean l;
    public boolean m;
    public Point n;
    public int o = 1;
    public int p = 1;
    public byte q = 1;
    public String r = "auto";
    public boolean s = true;

    public final boolean a() {
        if (this.f29517b == null || this.f29521f <= 0 || this.g <= 0 || this.f29519d <= 0 || this.f29520e < this.f29519d) {
            return false;
        }
        return true;
    }

    public d(Context context, int i2) {
        this.f29517b = context;
        this.f29518c = i2;
    }
}
