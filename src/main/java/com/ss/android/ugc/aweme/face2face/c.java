package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.net.e;
import com.ss.android.ugc.aweme.w.b.a;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43925a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendActivity f43926b;

    c(Face2FaceAddFriendActivity face2FaceAddFriendActivity) {
        this.f43926b = face2FaceAddFriendActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43925a, false, 39076, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43925a, false, 39076, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        e.a(this.f43926b, (a) obj);
    }
}
