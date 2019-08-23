package com.ss.android.ugc.aweme.profile.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.adapter.ProfileCoverAdapter;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61298a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverAdapter.a f61299b;

    /* renamed from: c  reason: collision with root package name */
    private final UrlModel f61300c;

    f(ProfileCoverAdapter.a aVar, UrlModel urlModel) {
        this.f61299b = aVar;
        this.f61300c = urlModel;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f61298a, false, 67420, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61298a, false, 67420, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f61299b.a(this.f61300c);
    }
}
