package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.widget.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13286a;

    /* renamed from: b  reason: collision with root package name */
    private final m f13287b;

    public p(m mVar) {
        this.f13287b = mVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13286a, false, 6657, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13286a, false, 6657, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13287b.dismiss();
    }
}
