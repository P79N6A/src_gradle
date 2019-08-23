package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62905a;

    /* renamed from: b  reason: collision with root package name */
    private final a f62906b;

    /* renamed from: c  reason: collision with root package name */
    private final HotSearchSprintStruct f62907c;

    i(a aVar, HotSearchSprintStruct hotSearchSprintStruct) {
        this.f62906b = aVar;
        this.f62907c = hotSearchSprintStruct;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62905a, false, 69400, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62905a, false, 69400, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f62906b.a(this.f62907c);
    }
}
