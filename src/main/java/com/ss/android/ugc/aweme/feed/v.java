package com.ss.android.ugc.aweme.feed;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46948a;

    /* renamed from: b  reason: collision with root package name */
    private final d f46949b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f46950c;

    /* renamed from: d  reason: collision with root package name */
    private final IShareService.ShareStruct f46951d;

    v(d dVar, Aweme aweme, IShareService.ShareStruct shareStruct) {
        this.f46949b = dVar;
        this.f46950c = aweme;
        this.f46951d = shareStruct;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46948a, false, 40038, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46948a, false, 40038, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f46949b.a(this.f46950c, this.f46951d, view);
    }
}
