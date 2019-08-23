package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ex implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12240a;

    /* renamed from: b  reason: collision with root package name */
    private final SimpleInputDialogFragment f12241b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12242c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12243d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12244e;

    ex(SimpleInputDialogFragment simpleInputDialogFragment, long j, int i, int i2) {
        this.f12241b = simpleInputDialogFragment;
        this.f12242c = j;
        this.f12243d = i;
        this.f12244e = i2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12240a, false, 6438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12240a, false, 6438, new Class[0], Void.TYPE);
            return;
        }
        this.f12241b.a(this.f12242c, this.f12243d, this.f12244e);
    }
}
