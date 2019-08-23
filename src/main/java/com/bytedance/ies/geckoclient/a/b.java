package com.bytedance.ies.geckoclient.a;

import android.annotation.SuppressLint;
import android.content.Context;

@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20706a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final b f20707b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final b f20708c = new e();

    /* renamed from: d  reason: collision with root package name */
    protected a f20709d;

    /* renamed from: e  reason: collision with root package name */
    protected String f20710e;

    /* renamed from: f  reason: collision with root package name */
    protected String f20711f;
    protected String g;
    protected Context h;

    public abstract void a();

    public void a(Context context, a aVar, String str, String str2, String str3) {
        this.f20709d = aVar;
        this.f20710e = str;
        this.f20711f = str2;
        this.g = str3;
        this.h = context;
    }
}
