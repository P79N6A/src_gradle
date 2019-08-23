package com.ss.android.ugc.aweme.shortvideo;

import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.tools.extract.e;
import com.ss.android.ugc.aweme.tools.extract.g;
import java.util.concurrent.Callable;

public final /* synthetic */ class de implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66743a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f66744b;

    /* renamed from: c  reason: collision with root package name */
    private final j f66745c;

    de(Object obj, j jVar) {
        this.f66744b = obj;
        this.f66745c = jVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f66743a, false, 74251, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f66743a, false, 74251, new Class[0], Object.class);
        }
        Object obj = this.f66744b;
        j jVar = this.f66745c;
        g gVar = new g(((cb) obj).mvCreateVideoData.srcSelectMediaList);
        gVar.a((e.a) new dh(obj, gVar, jVar));
        return null;
    }
}
