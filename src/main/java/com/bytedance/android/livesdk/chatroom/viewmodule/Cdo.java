package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.do  reason: invalid class name */
public final /* synthetic */ class Cdo implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13174a;

    /* renamed from: b  reason: collision with root package name */
    private final LuckyBoxWidget f13175b;

    Cdo(LuckyBoxWidget luckyBoxWidget) {
        this.f13175b = luckyBoxWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13174a, false, 7284, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13174a, false, 7284, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13175b.f12672d.setText(ah.a((long) ((Integer) obj).intValue()));
    }
}
