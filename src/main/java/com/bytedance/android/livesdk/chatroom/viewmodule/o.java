package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements CommonToastLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13284a;

    /* renamed from: b  reason: collision with root package name */
    static final CommonToastLayout.a f13285b = new o();

    private o() {
    }

    public final void a(CommonToastLayout commonToastLayout) {
        if (PatchProxy.isSupport(new Object[]{commonToastLayout}, this, f13284a, false, 6656, new Class[]{CommonToastLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonToastLayout}, this, f13284a, false, 6656, new Class[]{CommonToastLayout.class}, Void.TYPE);
            return;
        }
        d.INSTANCE.onMessageFinish();
    }
}
