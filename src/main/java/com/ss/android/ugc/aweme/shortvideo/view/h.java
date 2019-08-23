package com.ss.android.ugc.aweme.shortvideo.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71305a;

    /* renamed from: b  reason: collision with root package name */
    private final HashTagMentionEditText.a f71306b;

    h(HashTagMentionEditText.a aVar) {
        this.f71306b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f71305a, false, 81241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71305a, false, 81241, new Class[0], Void.TYPE);
            return;
        }
        HashTagMentionEditText.this.a(false);
    }
}
