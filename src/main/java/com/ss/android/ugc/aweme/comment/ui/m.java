package com.ss.android.ugc.aweme.comment.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36602a;

    /* renamed from: b  reason: collision with root package name */
    private final KeyboardDialogFragment f36603b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36604c;

    m(KeyboardDialogFragment keyboardDialogFragment, boolean z) {
        this.f36603b = keyboardDialogFragment;
        this.f36604c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36602a, false, 27570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36602a, false, 27570, new Class[0], Void.TYPE);
            return;
        }
        this.f36603b.c(this.f36604c);
    }
}
