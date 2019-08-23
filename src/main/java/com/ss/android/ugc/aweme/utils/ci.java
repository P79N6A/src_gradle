package com.ss.android.ugc.aweme.utils;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class ci implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75686a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f75687b = new ci();

    private ci() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75686a, false, 88375, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75686a, false, 88375, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("location_permission").setLabelName("click_no"));
        r.a("location_permission_result", (Map) d.a().a("enter_from", "homepage_fresh").a("is_allow", PushConstants.PUSH_TYPE_NOTIFY).f34114b);
        cg.a(true);
    }
}
