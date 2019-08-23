package com.ss.android.ugc.aweme.share.c;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.c.b;
import java.io.File;
import java.lang.ref.WeakReference;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64885a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f64886b;

    f(WeakReference weakReference) {
        this.f64886b = weakReference;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64885a, false, 73748, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64885a, false, 73748, new Class[]{i.class}, Object.class);
        }
        WeakReference weakReference = this.f64886b;
        if (iVar.e() != null) {
            if (weakReference.get() != null) {
                ((b.a) weakReference.get()).a((File) iVar.e());
            }
        } else if (weakReference.get() != null) {
            ((b.a) weakReference.get()).a((Exception) new RuntimeException("save fail."));
        }
        return null;
    }
}
