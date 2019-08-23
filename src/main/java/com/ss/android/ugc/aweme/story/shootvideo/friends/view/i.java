package com.ss.android.ugc.aweme.story.shootvideo.friends.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73619a;

    /* renamed from: b  reason: collision with root package name */
    private final d f73620b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73621c;

    i(d dVar, boolean z) {
        this.f73620b = dVar;
        this.f73621c = z;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73619a, false, 85377, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73619a, false, 85377, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        d dVar = this.f73620b;
        if (this.f73621c) {
            dVar.h();
        }
    }
}
