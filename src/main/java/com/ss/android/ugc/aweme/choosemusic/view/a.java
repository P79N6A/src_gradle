package com.ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36045a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseMusicListView f36046b;

    a(BaseMusicListView baseMusicListView) {
        this.f36046b = baseMusicListView;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36045a, false, 26817, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36045a, false, 26817, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f36046b.f();
    }
}
