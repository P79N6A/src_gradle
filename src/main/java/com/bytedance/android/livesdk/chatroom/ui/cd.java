package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cd implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12001a;

    /* renamed from: b  reason: collision with root package name */
    private final cc f12002b;

    cd(cc ccVar) {
        this.f12002b = ccVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12001a, false, 5914, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12001a, false, 5914, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f12002b.e();
    }
}
