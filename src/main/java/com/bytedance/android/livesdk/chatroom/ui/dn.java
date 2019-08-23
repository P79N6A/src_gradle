package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dn implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12096a;

    /* renamed from: b  reason: collision with root package name */
    private final dl f12097b;

    dn(dl dlVar) {
        this.f12097b = dlVar;
    }

    public final void accept(Object obj) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12096a, false, 6232, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12096a, false, 6232, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        dl dlVar = this.f12097b;
        dlVar.f12087d = ((User) obj).isFollowing();
        View view = dlVar.f12089f;
        if (dlVar.f12087d) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
