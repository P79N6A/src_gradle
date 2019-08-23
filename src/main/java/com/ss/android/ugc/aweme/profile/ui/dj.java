package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.permission.e;

public final /* synthetic */ class dj implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62655a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendUserActivity f62656b;

    dj(RecommendUserActivity recommendUserActivity) {
        this.f62656b = recommendUserActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62655a, false, 68973, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62655a, false, 68973, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        RecommendUserActivity recommendUserActivity = this.f62656b;
        recommendUserActivity.f62334c.d();
        recommendUserActivity.h.a(30, recommendUserActivity.f62337f, recommendUserActivity.i, e.a(), (String) null, e.b(), recommendUserActivity.g);
    }
}
