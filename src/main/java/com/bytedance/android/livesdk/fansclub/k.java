package com.bytedance.android.livesdk.fansclub;

import com.bytedance.android.livesdk.fansclub.JoinFansPortraitNotifyView;
import com.bytedance.android.livesdk.fansclub.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13889a;

    /* renamed from: b  reason: collision with root package name */
    private final JoinFansPortraitNotifyView.AnonymousClass3 f13890b;

    k(JoinFansPortraitNotifyView.AnonymousClass3 r1) {
        this.f13890b = r1;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13889a, false, 8327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13889a, false, 8327, new Class[0], Void.TYPE);
            return;
        }
        JoinFansPortraitNotifyView.AnonymousClass3 r1 = this.f13890b;
        if (JoinFansPortraitNotifyView.this.f13855f != null && !JoinFansPortraitNotifyView.this.r) {
            JoinFansPortraitNotifyView.this.g.f16695f = false;
            JoinFansPortraitNotifyView.this.f13855f.a();
        }
    }
}
