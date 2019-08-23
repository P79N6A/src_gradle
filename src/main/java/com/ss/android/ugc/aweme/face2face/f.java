package com.ss.android.ugc.aweme.face2face;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.b.a;

public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43932a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendActivity f43933b;

    /* renamed from: c  reason: collision with root package name */
    private final a f43934c;

    f(Face2FaceAddFriendActivity face2FaceAddFriendActivity, a aVar) {
        this.f43933b = face2FaceAddFriendActivity;
        this.f43934c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43932a, false, 39079, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43932a, false, 39079, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f43933b.a(this.f43934c, dialogInterface);
    }
}
