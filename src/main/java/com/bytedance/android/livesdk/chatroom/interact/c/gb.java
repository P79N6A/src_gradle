package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gb implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10727a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10728b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10729c;

    gb(fl flVar, boolean z) {
        this.f10728b = flVar;
        this.f10729c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10727a, false, 4968, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10727a, false, 4968, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        fl flVar = this.f10728b;
        if (!this.f10729c) {
            flVar.b(true);
        } else {
            flVar.f10690d.lambda$put$1$DataCenter("data_pk_result", LinkCrossRoomDataHolder.c.RIGHT_WON).lambda$put$1$DataCenter("cmd_stop_interact", Boolean.FALSE);
        }
    }
}
