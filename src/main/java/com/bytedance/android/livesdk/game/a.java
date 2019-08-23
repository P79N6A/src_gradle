package com.bytedance.android.livesdk.game;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14663a;

    /* renamed from: b  reason: collision with root package name */
    private final SelectGameDialogFragment f14664b;

    a(SelectGameDialogFragment selectGameDialogFragment) {
        this.f14664b = selectGameDialogFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14663a, false, 9188, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14663a, false, 9188, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14664b.a();
    }
}
