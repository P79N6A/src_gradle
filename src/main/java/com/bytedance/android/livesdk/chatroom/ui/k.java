package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12274a;

    /* renamed from: b  reason: collision with root package name */
    private final Dialog f12275b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f12276c;

    k(Dialog dialog, Runnable runnable) {
        this.f12275b = dialog;
        this.f12276c = runnable;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12274a, false, 5565, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12274a, false, 5565, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Dialog dialog = this.f12275b;
        Runnable runnable = this.f12276c;
        af.a(dialog);
        runnable.run();
    }
}
