package com.bytedance.android.livesdk.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17299a;

    /* renamed from: b  reason: collision with root package name */
    private final i f17300b;

    k(i iVar) {
        this.f17300b = iVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17299a, false, 13380, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17299a, false, 13380, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        i iVar = this.f17300b;
        if (iVar.f17286b) {
            iVar.a((String) null);
        }
    }
}
