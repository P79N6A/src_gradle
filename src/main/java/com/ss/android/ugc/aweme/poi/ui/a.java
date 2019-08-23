package com.ss.android.ugc.aweme.poi.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60515a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsPoiAwemeFeedFragment f60516b;

    a(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment) {
        this.f60516b = absPoiAwemeFeedFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60515a, false, 65899, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60515a, false, 65899, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f60516b.L();
    }
}
