package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;

public final /* synthetic */ class br implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46631a;

    /* renamed from: b  reason: collision with root package name */
    private final bq f46632b;

    /* renamed from: c  reason: collision with root package name */
    private final HotSearchInfo f46633c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f46634d;

    br(bq bqVar, HotSearchInfo hotSearchInfo, boolean z) {
        this.f46632b = bqVar;
        this.f46633c = hotSearchInfo;
        this.f46634d = z;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46631a, false, 43259, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46631a, false, 43259, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f46632b.a(this.f46633c, this.f46634d);
    }
}
