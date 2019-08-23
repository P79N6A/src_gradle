package com.bytedance.android.livesdk.rank.viewbinder;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17073a;

    /* renamed from: b  reason: collision with root package name */
    private final User f17074b;

    c(User user) {
        this.f17074b = user;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17073a, false, 13101, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17073a, false, 13101, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a.a().a((Object) new com.bytedance.android.livesdk.rank.b.a(this.f17074b.getId()));
    }
}
