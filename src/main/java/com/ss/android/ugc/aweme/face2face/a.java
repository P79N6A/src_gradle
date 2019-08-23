package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43907a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendActivity f43908b;

    a(Face2FaceAddFriendActivity face2FaceAddFriendActivity) {
        this.f43908b = face2FaceAddFriendActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43907a, false, 39074, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43907a, false, 39074, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Face2FaceAddFriendActivity face2FaceAddFriendActivity = this.f43908b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            face2FaceAddFriendActivity.finish();
        }
    }
}
