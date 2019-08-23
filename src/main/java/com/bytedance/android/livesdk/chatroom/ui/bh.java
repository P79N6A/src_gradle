package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class bh implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11931a;

    /* renamed from: b  reason: collision with root package name */
    private final bf f11932b;

    bh(bf bfVar) {
        this.f11932b = bfVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11931a, false, 5793, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11931a, false, 5793, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11932b.a((List) obj);
    }
}
