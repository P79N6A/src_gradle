package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class br implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11954a;

    /* renamed from: b  reason: collision with root package name */
    private final bn f11955b;

    br(bn bnVar) {
        this.f11955b = bnVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11954a, false, 5860, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11954a, false, 5860, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bn bnVar = this.f11955b;
        bnVar.f11945e = false;
        bnVar.f11943c = new LinkInRoomAudioWaitingListAdapter(bnVar, bnVar.a(((c) obj).f7867b), bnVar.f11946f);
        bnVar.g.setAdapter(bnVar.f11943c);
    }
}
