package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class du implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12111a;

    /* renamed from: b  reason: collision with root package name */
    private final dl f12112b;

    du(dl dlVar) {
        this.f12112b = dlVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12111a, false, 6239, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12111a, false, 6239, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        dl dlVar = this.f12112b;
        dlVar.i.setVisibility(4);
        dlVar.j.setVisibility(4);
        dlVar.h.setAdapter(new LuckyBoxRushListAdapter(dlVar.getContext(), ((t) ((d) obj).f7871b).f11164a));
        dlVar.h.setVisibility(0);
    }
}
