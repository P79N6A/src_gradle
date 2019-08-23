package com.ss.android.ugc.aweme.shortvideo;

import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.tools.extract.e;
import com.ss.android.ugc.aweme.tools.extract.l;
import java.util.concurrent.Callable;

public final /* synthetic */ class df implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66746a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f66747b;

    /* renamed from: c  reason: collision with root package name */
    private final j f66748c;

    df(Object obj, j jVar) {
        this.f66747b = obj;
        this.f66748c = jVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f66746a, false, 74252, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f66746a, false, 74252, new Class[0], Object.class);
        }
        Object obj = this.f66747b;
        j jVar = this.f66748c;
        cb cbVar = (cb) obj;
        l lVar = new l(cbVar.mPath, cbVar.previewConfigure);
        lVar.a((e.a) new dg(obj, lVar, jVar));
        return null;
    }
}
