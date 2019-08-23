package com.ss.android.ugc.aweme.story.shootvideo.setting;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74124a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnClickListener f74125b = new b();

    private b() {
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74124a, false, 86022, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74124a, false, 86022, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }
}
