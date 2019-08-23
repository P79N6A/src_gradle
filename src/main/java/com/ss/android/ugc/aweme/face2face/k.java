package com.ss.android.ugc.aweme.face2face;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43943a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendFragment f43944b;

    k(Face2FaceAddFriendFragment face2FaceAddFriendFragment) {
        this.f43944b = face2FaceAddFriendFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43943a, false, 39093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43943a, false, 39093, new Class[0], Void.TYPE);
            return;
        }
        Face2FaceAddFriendFragment face2FaceAddFriendFragment = this.f43944b;
        face2FaceAddFriendFragment.f43893e.removeObserver(face2FaceAddFriendFragment.f43891c);
    }
}
