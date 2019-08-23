package com.ss.android.ugc.aweme.comment.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36572a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentInputFragment f36573b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36574c;

    c(CommentInputFragment commentInputFragment, boolean z) {
        this.f36573b = commentInputFragment;
        this.f36574c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36572a, false, 27472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36572a, false, 27472, new Class[0], Void.TYPE);
            return;
        }
        this.f36573b.g(this.f36574c);
    }
}
