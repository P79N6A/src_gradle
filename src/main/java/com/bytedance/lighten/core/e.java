package com.bytedance.lighten.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.lighten.core.b.b;
import com.bytedance.lighten.core.b.g;
import com.bytedance.lighten.core.b.i;
import com.bytedance.lighten.core.c.a;
import java.util.List;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public Uri f21781a;

    /* renamed from: b  reason: collision with root package name */
    public Context f21782b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21783c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21784d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21785e;

    /* renamed from: f  reason: collision with root package name */
    public int f21786f;
    public boolean g;
    public int h = -1;
    public int i = -1;
    public int j;
    public int k;
    public Drawable l;
    public Bitmap.Config m = Bitmap.Config.ARGB_8888;
    public m n = m.CENTER_CROP;
    public List<String> o;
    public b p;
    public a q;
    public c r;
    public k s = k.MEDIUM;
    public g t;
    public i u;
    public b v;

    public final d a() {
        return new d(this);
    }

    public e() {
    }

    public final e a(int i2) {
        this.f21786f = 1;
        return this;
    }

    public final e a(Bitmap.Config config) {
        this.m = config;
        return this;
    }

    public e(@NonNull String str) {
        this.f21781a = a.a(str);
    }

    public final e a(Drawable drawable) {
        this.l = drawable;
        return this;
    }

    public e(@NonNull List<String> list) {
        this.o = list;
    }

    public final e a(@Nullable g gVar) {
        this.t = gVar;
        return this;
    }

    public final e a(@Nullable k kVar) {
        this.s = kVar;
        return this;
    }

    public final e a(boolean z) {
        this.f21785e = false;
        return this;
    }

    public final e a(int i2, int i3) {
        this.h = i2;
        this.i = i3;
        return this;
    }
}
