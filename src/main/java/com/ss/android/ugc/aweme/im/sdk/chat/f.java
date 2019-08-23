package com.ss.android.ugc.aweme.im.sdk.chat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.e;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;

public final /* synthetic */ class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50323a;

    /* renamed from: b  reason: collision with root package name */
    private final e.a f50324b;

    f(e.a aVar) {
        this.f50324b = aVar;
    }

    public final void sendMsg() {
        if (PatchProxy.isSupport(new Object[0], this, f50323a, false, 50317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50323a, false, 50317, new Class[0], Void.TYPE);
            return;
        }
        e.a aVar = this.f50324b;
        ba.a().a(aVar.f50310c, (BaseContent) TextContent.obtain(aVar.f50309b.value));
    }
}
