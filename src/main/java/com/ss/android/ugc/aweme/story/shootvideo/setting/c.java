package com.ss.android.ugc.aweme.story.shootvideo.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.setting.a;
import com.ss.android.ugc.aweme.story.shootvideo.setting.h;

public final /* synthetic */ class c implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74126a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass1 f74127b;

    c(a.AnonymousClass1 r1) {
        this.f74127b = r1;
    }

    public final void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74126a, false, 86025, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74126a, false, 86025, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = a.this;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, aVar, a.f74107a, false, 86019, new Class[]{Integer.TYPE}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, aVar2, a.f74107a, false, 86019, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        aVar.g.b(i2);
        aVar.f74111e = i2;
    }
}
