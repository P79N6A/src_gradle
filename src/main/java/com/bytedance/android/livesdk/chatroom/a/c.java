package com.bytedance.android.livesdk.chatroom.a;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9718a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnClickListener f9719b = new c();

    private c() {
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9718a, false, 3923, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9718a, false, 3923, new Class[]{View.class}, Void.TYPE);
        }
    }
}
