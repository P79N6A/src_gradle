package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.net.e;
import com.ss.android.ugc.aweme.w.b.a;

public final /* synthetic */ class m implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43946a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceInviteDialogFragment f43947b;

    m(Face2FaceInviteDialogFragment face2FaceInviteDialogFragment) {
        this.f43947b = face2FaceInviteDialogFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43946a, false, 39111, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43946a, false, 39111, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        e.a(this.f43947b.getActivity(), (a) obj);
    }
}
