package com.ss.android.ugc.aweme.face2face;

import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.face2face.b.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43927a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendActivity f43928b;

    /* renamed from: c  reason: collision with root package name */
    private final a f43929c;

    d(Face2FaceAddFriendActivity face2FaceAddFriendActivity, a aVar) {
        this.f43928b = face2FaceAddFriendActivity;
        this.f43929c = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43927a, false, 39077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43927a, false, 39077, new Class[0], Void.TYPE);
            return;
        }
        Face2FaceAddFriendActivity face2FaceAddFriendActivity = this.f43928b;
        new a.C0185a(face2FaceAddFriendActivity).a((int) C0906R.string.ad0).b((int) C0906R.string.acz).a((int) C0906R.string.ad2, (DialogInterface.OnClickListener) new e(face2FaceAddFriendActivity)).b((int) C0906R.string.ad4, (DialogInterface.OnClickListener) new f(face2FaceAddFriendActivity, this.f43929c)).a().a();
    }
}
