package com.ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56330a;

    /* renamed from: b  reason: collision with root package name */
    private final OriginMusicListFragment f56331b;

    f(OriginMusicListFragment originMusicListFragment) {
        this.f56331b = originMusicListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f56330a, false, 59848, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f56330a, false, 59848, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f56331b.b();
    }
}
