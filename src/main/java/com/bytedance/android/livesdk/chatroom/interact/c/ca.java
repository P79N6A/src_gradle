package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.bytedance.android.livesdk.user.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.SingleObserver;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ca implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10473a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10474b;

    ca(bl blVar) {
        this.f10474b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10473a, false, 4742, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10473a, false, 4742, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10474b;
        blVar.f10439e = false;
        ((bl.a) blVar.b()).b();
        e.a().a((Integer) 2);
        TTLiveSDKContext.getHostService().k().e().subscribe((SingleObserver<? super T>) new g<Object>());
    }
}
