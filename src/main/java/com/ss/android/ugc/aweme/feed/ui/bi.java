package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;

public final /* synthetic */ class bi implements TranslationStatusView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46609a;

    /* renamed from: b  reason: collision with root package name */
    private final bh f46610b;

    bi(bh bhVar) {
        this.f46610b = bhVar;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46609a, false, 43158, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46609a, false, 43158, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f46610b.a(i);
    }
}
