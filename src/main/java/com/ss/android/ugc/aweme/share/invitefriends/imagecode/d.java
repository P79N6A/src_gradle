package com.ss.android.ugc.aweme.share.invitefriends.imagecode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65112a;

    /* renamed from: b  reason: collision with root package name */
    private final InviteFriendWithImageTokenDialog f65113b;

    d(InviteFriendWithImageTokenDialog inviteFriendWithImageTokenDialog) {
        this.f65113b = inviteFriendWithImageTokenDialog;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f65112a, false, 73549, new Class[0], Object.class)) {
            return this.f65113b.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f65112a, false, 73549, new Class[0], Object.class);
    }
}
