package com.ss.android.ugc.aweme.qrcode.v2;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.d.x;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63533a;

    /* renamed from: b  reason: collision with root package name */
    private final QRCodeActivityV2 f63534b;

    a(QRCodeActivityV2 qRCodeActivityV2) {
        this.f63534b = qRCodeActivityV2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f63533a, false, 70535, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63533a, false, 70535, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        QRCodeActivityV2 qRCodeActivityV2 = this.f63534b;
        if (PatchProxy.isSupport(new Object[0], qRCodeActivityV2, QRCodeActivityV2.f63490b, false, 70517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], qRCodeActivityV2, QRCodeActivityV2.f63490b, false, 70517, new Class[0], Void.TYPE);
            return;
        }
        r.a("click_share_person", (Map) d.a().a("enter_from", "qr_code").f34114b);
        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        if (curUser != null) {
            x.a((Activity) qRCodeActivityV2, curUser, (String) null, qRCodeActivityV2.h, true);
        }
    }
}
