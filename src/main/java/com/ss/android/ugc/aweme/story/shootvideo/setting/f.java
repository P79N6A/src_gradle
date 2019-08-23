package com.ss.android.ugc.aweme.story.shootvideo.setting;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74136a;

    /* renamed from: b  reason: collision with root package name */
    private final e f74137b;

    f(e eVar) {
        this.f74137b = eVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74136a, false, 86046, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74136a, false, 86046, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        e eVar = this.f74137b;
        if (eVar.f74133d != null) {
            eVar.f74133d.a(false);
        }
    }
}
