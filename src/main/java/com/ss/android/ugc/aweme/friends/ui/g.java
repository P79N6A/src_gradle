package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import java.util.Map;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49457a;

    /* renamed from: b  reason: collision with root package name */
    private final FindFriendsFragment f49458b;

    g(FindFriendsFragment findFriendsFragment) {
        this.f49458b = findFriendsFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49457a, false, 47164, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49457a, false, 47164, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        QRCodePermissionActivity.a(this.f49458b.getActivity(), false);
        r.a("qr_code_scan_enter", (Map) d.a().a("enter_from", "find_friends").f34114b);
    }
}
