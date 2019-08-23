package com.ss.android.ugc.aweme.friends.model;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class InviteContactFriendsModel$$Lambda$9 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final i arg$1;

    private InviteContactFriendsModel$$Lambda$9(i iVar) {
        this.arg$1 = iVar;
    }

    static Callable get$Lambda(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, null, changeQuickRedirect, true, 46629, new Class[]{i.class}, Callable.class)) {
            return new InviteContactFriendsModel$$Lambda$9(iVar2);
        }
        return (Callable) PatchProxy.accessDispatch(new Object[]{iVar2}, null, changeQuickRedirect, true, 46629, new Class[]{i.class}, Callable.class);
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46630, new Class[0], Object.class)) {
            return this.arg$1.e();
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46630, new Class[0], Object.class);
    }
}
