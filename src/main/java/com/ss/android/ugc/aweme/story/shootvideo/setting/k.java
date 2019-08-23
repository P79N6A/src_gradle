package com.ss.android.ugc.aweme.story.shootvideo.setting;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74159a;

    /* renamed from: b  reason: collision with root package name */
    private final j f74160b;

    k(j jVar) {
        this.f74160b = jVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74159a, false, 86071, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74159a, false, 86071, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        j jVar = this.f74160b;
        if (jVar.j != null) {
            jVar.j.a();
        }
    }
}
