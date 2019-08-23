package com.ss.android.ugc.aweme.shortvideo.mvtemplate.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68506a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.draft.a.c f68507b;

    public c(com.ss.android.ugc.aweme.draft.a.c cVar) {
        this.f68507b = cVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f68506a, false, 78109, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f68506a, false, 78109, new Class[0], Object.class);
        }
        com.ss.android.ugc.aweme.draft.a.c cVar = this.f68507b;
        ArrayList<String> arrayList = cVar.H().selectMediaList;
        if (!j.a((Collection<T>) arrayList)) {
            for (String c2 : arrayList) {
                b.c(c2);
            }
        }
        b.c(cVar.H().videoCoverImgPath);
        b.c(cVar.H().contactVideoPath);
        return null;
    }
}
