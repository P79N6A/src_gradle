package com.ss.android.ugc.aweme.poi.ui.comment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60611a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCommentListFragment f60612b;

    a(PoiCommentListFragment poiCommentListFragment) {
        this.f60612b = poiCommentListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60611a, false, 66273, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60611a, false, 66273, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f60612b.c();
    }
}
