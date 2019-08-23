package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.message.model.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class az implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11259a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11260b;

    az(au auVar) {
        this.f11260b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11259a, false, 5269, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11259a, false, 5269, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        au auVar = this.f11260b;
        c cVar = (c) obj;
        for (aq aqVar : cVar.f7867b) {
            aqVar.timestamp = cVar.f7868c.now;
            if (aqVar.j) {
                aqVar.p = true;
            }
            auVar.onMessage(aqVar);
        }
    }
}
