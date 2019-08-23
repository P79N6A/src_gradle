package com.bytedance.im.core.b.a.c;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import com.bytedance.im.core.b.a.c.c;

public abstract class a implements com.bytedance.im.core.b.a.c.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f20912a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20913b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f20914c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20915d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20916e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.im.core.b.a.c.a.a f20917f;
    private final DatabaseErrorHandler g;

    public abstract com.bytedance.im.core.b.a.c.a.a a();

    public final void a(com.bytedance.im.core.b.a.c.a.a aVar) {
    }

    public void a(c cVar) {
    }

    public void a(c cVar, int i, int i2) {
    }

    public final c b() {
        return null;
    }

    public a(Context context, String str, c.a aVar, int i) {
        this(context, str, null, null, 12, null);
    }

    public a(Context context, String str, String str2, c.a aVar, int i) {
        this(context, str, str2, null, 12, null);
    }

    private a(Context context, String str, String str2, c.a aVar, int i, DatabaseErrorHandler databaseErrorHandler) {
        if (i > 0) {
            this.f20912a = context;
            this.f20913b = str;
            this.f20916e = str2;
            this.f20914c = aVar;
            this.f20915d = i;
            this.g = null;
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was " + i);
    }
}
