package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class aa implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11804a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment.g f11805b;

    aa(AbsInteractionFragment.g gVar) {
        this.f11805b = gVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11804a, false, 5632, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11804a, false, 5632, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        AbsInteractionFragment.this.a((ShareReportResult) ((d) obj).f7871b);
    }
}
