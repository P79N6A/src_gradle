package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class g implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43935a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendFragment f43936b;

    g(Face2FaceAddFriendFragment face2FaceAddFriendFragment) {
        this.f43936b = face2FaceAddFriendFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43935a, false, 39089, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43935a, false, 39089, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f43936b.a((List) obj);
    }
}
