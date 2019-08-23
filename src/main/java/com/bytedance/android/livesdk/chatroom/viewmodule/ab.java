package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12961a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowGuideWidget f12962b;

    ab(FollowGuideWidget followGuideWidget) {
        this.f12962b = followGuideWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12961a, false, 6806, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12961a, false, 6806, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f12962b.f12505c.dismiss();
    }
}
