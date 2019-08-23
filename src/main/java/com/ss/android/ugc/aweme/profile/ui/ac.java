package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.d.w;

public final /* synthetic */ class ac implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62443a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationAdapter f62444b;

    /* renamed from: c  reason: collision with root package name */
    private final w f62445c;

    /* renamed from: d  reason: collision with root package name */
    private final int f62446d;

    ac(LocationAdapter locationAdapter, w wVar, int i) {
        this.f62444b = locationAdapter;
        this.f62445c = wVar;
        this.f62446d = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62443a, false, 68118, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62443a, false, 68118, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        LocationAdapter locationAdapter = this.f62444b;
        w wVar = this.f62445c;
        locationAdapter.f61899b.a(wVar.getCode(), wVar.getName(), this.f62446d, locationAdapter.f61900c, wVar.size() > 0);
    }
}
