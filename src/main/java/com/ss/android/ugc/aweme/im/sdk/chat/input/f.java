package com.ss.android.ugc.aweme.im.sdk.chat.input;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter;

public final /* synthetic */ class f implements SearchGifAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50590a;

    /* renamed from: b  reason: collision with root package name */
    private final d f50591b;

    f(d dVar) {
        this.f50591b = dVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50590a, false, 50599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50590a, false, 50599, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f50591b;
        dVar.a((CharSequence) dVar.f3367d.getText());
    }
}
