package com.ss.android.ugc.aweme.shortvideo.s;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.c;
import com.ss.android.ugc.aweme.property.e;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69127a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69128b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69129c;

    /* renamed from: d  reason: collision with root package name */
    public c f69130d;

    public float a(float f2, int i) {
        return f2;
    }

    public int a() {
        return 0;
    }

    public void a(Context context, c cVar) {
    }

    public float b(float f2, int i) {
        return 0.0f;
    }

    public boolean b(boolean z) {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f69127a, false, 81255, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.DefaultWideMode);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69127a, false, 81255, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void a(boolean z) {
        this.f69128b = false;
        this.f69129c = z;
    }
}
