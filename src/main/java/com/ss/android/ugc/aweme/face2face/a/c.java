package com.ss.android.ugc.aweme.face2face.a;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.net.b;

public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43914a;

    public final void a(@NonNull b bVar, @NonNull i iVar) {
        if (PatchProxy.isSupport(new Object[]{bVar, iVar}, this, f43914a, false, 39157, new Class[]{b.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, iVar}, this, f43914a, false, 39157, new Class[]{b.class, i.class}, Void.TYPE);
            return;
        }
        iVar.a();
    }
}
