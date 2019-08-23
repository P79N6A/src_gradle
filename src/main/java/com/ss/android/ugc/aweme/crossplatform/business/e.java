package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.downloadad.api.a.a;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40771a;

    /* renamed from: b  reason: collision with root package name */
    private final DownloadBusiness f40772b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f40773c;

    /* renamed from: d  reason: collision with root package name */
    private final a f40774d;

    e(DownloadBusiness downloadBusiness, Activity activity, a aVar) {
        this.f40772b = downloadBusiness;
        this.f40773c = activity;
        this.f40774d = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40771a, false, 34256, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40771a, false, 34256, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f40772b.a(this.f40773c, this.f40774d);
    }
}
