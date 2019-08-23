package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.util.Map;

public final /* synthetic */ class ch implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75683a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f75684b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0792a f75685c;

    ch(Activity activity, a.C0792a aVar) {
        this.f75684b = activity;
        this.f75685c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75683a, false, 88374, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75683a, false, 88374, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Activity activity = this.f75684b;
        a.C0792a aVar = this.f75685c;
        r.onEvent(MobClick.obtain().setEventName("location_permission").setLabelName("click_yes"));
        r.a("location_permission_result", (Map) d.a().a("enter_from", "homepage_fresh").a("is_allow", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).f34114b);
        a.a(activity, 2, af.f2626c, aVar);
        cg.a(true);
    }
}
