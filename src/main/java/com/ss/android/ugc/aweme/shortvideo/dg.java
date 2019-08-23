package com.ss.android.ugc.aweme.shortvideo;

import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.tools.extract.e;
import com.ss.android.ugc.aweme.tools.extract.l;

public final /* synthetic */ class dg implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66749a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f66750b;

    /* renamed from: c  reason: collision with root package name */
    private final l f66751c;

    /* renamed from: d  reason: collision with root package name */
    private final j f66752d;

    dg(Object obj, l lVar, j jVar) {
        this.f66750b = obj;
        this.f66751c = lVar;
        this.f66752d = jVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66749a, false, 74253, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66749a, false, 74253, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Object obj = this.f66750b;
        l lVar = this.f66751c;
        j jVar = this.f66752d;
        ((cb) obj).extractFramesModel = lVar.e();
        jVar.b(null);
    }
}
