package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dz implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13195a;

    /* renamed from: b  reason: collision with root package name */
    private final PromotionStatusWidget f13196b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13197c;

    dz(PromotionStatusWidget promotionStatusWidget, long j) {
        this.f13196b = promotionStatusWidget;
        this.f13197c = j;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13195a, false, 7409, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13195a, false, 7409, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13196b.a(view, this.f13197c);
    }
}
