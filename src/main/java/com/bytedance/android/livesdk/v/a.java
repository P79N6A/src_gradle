package com.bytedance.android.livesdk.v;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17654a;

    /* renamed from: b  reason: collision with root package name */
    h.c f17655b;

    /* renamed from: com.bytedance.android.livesdk.v.a$a  reason: collision with other inner class name */
    public static final class C0125a implements h.b<d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17656a;

        @NonNull
        public final h.b.a<d> a(h.b.a<d> aVar) {
            h.b.a<d> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17656a, false, 13191, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new a((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17656a, false, 13191, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private a() {
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    @Nullable
    public final <T> T a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f17654a, false, 13189, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls2}, this, f17654a, false, 13189, new Class[]{Class.class}, Object.class);
        }
        if (PatchProxy.isSupport(new Object[]{cls2}, null, h.f17666a, true, 13216, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls2}, null, h.f17666a, true, 13216, new Class[]{Class.class}, Object.class);
        }
        h a2 = h.a();
        if (!PatchProxy.isSupport(new Object[]{cls2}, a2, h.f17666a, false, 13221, new Class[]{Class.class}, Object.class)) {
            return a2.a(cls2, false);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, a2, h.f17666a, false, 13221, new Class[]{Class.class}, Object.class);
    }

    public final <T> void a(Class<T> cls, h.b<T> bVar) {
        Class<T> cls2 = cls;
        h.b<T> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{cls2, bVar2}, this, f17654a, false, 13190, new Class[]{Class.class, h.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2, bVar2}, this, f17654a, false, 13190, new Class[]{Class.class, h.b.class}, Void.TYPE);
            return;
        }
        this.f17655b.a(cls2, bVar2);
    }
}
