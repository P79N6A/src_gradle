package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.c.cl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ct implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10520a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10521b;

    ct(cl clVar) {
        this.f10521b = clVar;
    }

    public final void accept(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10520a, false, 4790, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10520a, false, 4790, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cl clVar = this.f10521b;
        clVar.b((Throwable) obj);
        if (LinkCrossRoomDataHolder.a.CONNECTION_SUCCEED.compareTo((LinkCrossRoomDataHolder.a) clVar.f10499b.get("data_link_state", LinkCrossRoomDataHolder.a.DISABLED)) > 0) {
            z = false;
        }
        if (!z) {
            ((cl.a) clVar.b()).c();
        }
    }
}
