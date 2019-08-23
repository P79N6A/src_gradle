package com.bytedance.android.livesdk.wallet;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17935a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f17936b;

    af(ae aeVar) {
        this.f17936b = aeVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17935a, false, 14125, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17935a, false, 14125, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f17936b.g();
    }
}
