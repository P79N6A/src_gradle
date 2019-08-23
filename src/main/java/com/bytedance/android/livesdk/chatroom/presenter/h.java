package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11357a;

    /* renamed from: b  reason: collision with root package name */
    private final f f11358b;

    public h(f fVar) {
        this.f11358b = fVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11357a, false, 5162, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11357a, false, 5162, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        f fVar = this.f11358b;
        if (fVar.f11352d != null && !fVar.f11352d.isDisposed()) {
            fVar.f11352d.dispose();
            fVar.f11352d = null;
        }
    }
}
