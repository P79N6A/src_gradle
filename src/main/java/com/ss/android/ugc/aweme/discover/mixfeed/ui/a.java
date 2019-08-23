package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.hotsearch.RankingListActivity;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42567a;

    /* renamed from: b  reason: collision with root package name */
    private final HotBar f42568b;

    a(HotBar hotBar) {
        this.f42568b = hotBar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f42567a, false, 36800, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f42567a, false, 36800, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        HotBar hotBar = this.f42568b;
        RankingListActivity.a(hotBar.f42559e.getContext());
        hotBar.a(false);
    }
}
