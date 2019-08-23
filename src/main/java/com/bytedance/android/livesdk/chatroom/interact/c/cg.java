package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.bytedance.android.livesdk.message.model.am;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10486a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10487b;

    /* renamed from: c  reason: collision with root package name */
    private final am f10488c;

    cg(bl blVar, am amVar) {
        this.f10487b = blVar;
        this.f10488c = amVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10486a, false, 4748, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10486a, false, 4748, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10487b;
        am amVar = this.f10488c;
        ((bl.a) blVar.b()).a(amVar.g, (User) obj);
    }
}
