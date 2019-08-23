package com.ss.android.ugc.aweme.favorites.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44358a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseCollectListFragment f44359b;

    a(BaseCollectListFragment baseCollectListFragment) {
        this.f44359b = baseCollectListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44358a, false, 39549, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44358a, false, 39549, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f44359b.p();
    }
}
