package com.ss.android.ugc.aweme.miniapp.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity;
import java.util.Map;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55465a;

    /* renamed from: b  reason: collision with root package name */
    private final MostUseMicroAppViewHolder f55466b;

    b(MostUseMicroAppViewHolder mostUseMicroAppViewHolder) {
        this.f55466b = mostUseMicroAppViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55465a, false, 59161, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55465a, false, 59161, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MostUseMicroAppViewHolder mostUseMicroAppViewHolder = this.f55466b;
        if (PatchProxy.isSupport(new Object[0], mostUseMicroAppViewHolder, MostUseMicroAppViewHolder.f55449a, false, 59159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], mostUseMicroAppViewHolder, MostUseMicroAppViewHolder.f55449a, false, 59159, new Class[0], Void.TYPE);
            return;
        }
        Activity e2 = k.a().e();
        if (e2 != null) {
            r.a("click_mp_entrance", (Map) d.a().a("enter_from", "navigation_panel").a("scene_id", "021001").f34114b);
            e2.startActivity(new Intent(e2, RecentlyUsedMicroAppActivity.class));
            e2.overridePendingTransition(C0906R.anim.d0, C0906R.anim.d9);
        }
    }
}
