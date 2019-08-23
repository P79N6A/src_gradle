package com.ss.android.ugc.aweme.shortvideo;

import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.tools.extract.e;
import com.ss.android.ugc.aweme.tools.extract.g;

public final /* synthetic */ class dh implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66753a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f66754b;

    /* renamed from: c  reason: collision with root package name */
    private final g f66755c;

    /* renamed from: d  reason: collision with root package name */
    private final j f66756d;

    dh(Object obj, g gVar, j jVar) {
        this.f66754b = obj;
        this.f66755c = gVar;
        this.f66756d = jVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66753a, false, 74254, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66753a, false, 74254, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Object obj = this.f66754b;
        g gVar = this.f66755c;
        j jVar = this.f66756d;
        ((cb) obj).extractFramesModel = gVar.e();
        jVar.b(null);
    }
}
