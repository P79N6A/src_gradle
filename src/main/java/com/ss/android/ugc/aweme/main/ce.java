package com.ss.android.ugc.aweme.main;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;

public final /* synthetic */ class ce implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54710a;

    /* renamed from: b  reason: collision with root package name */
    private final cb f54711b;

    ce(cb cbVar) {
        this.f54711b = cbVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f54710a, false, 57729, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54710a, false, 57729, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        cb cbVar = this.f54711b;
        r.onEvent(MobClick.obtain().setEventName("friend_alert").setLabelName("cancel"));
        cbVar.dismiss();
    }
}
