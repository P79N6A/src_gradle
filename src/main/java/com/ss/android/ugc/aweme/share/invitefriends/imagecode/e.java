package com.ss.android.ugc.aweme.share.invitefriends.imagecode;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65114a;

    /* renamed from: b  reason: collision with root package name */
    private final InviteFriendWithImageTokenDialog f65115b;

    e(InviteFriendWithImageTokenDialog inviteFriendWithImageTokenDialog) {
        this.f65115b = inviteFriendWithImageTokenDialog;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f65114a, false, 73550, new Class[]{i.class}, Object.class)) {
            return this.f65115b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f65114a, false, 73550, new Class[]{i.class}, Object.class);
    }
}
