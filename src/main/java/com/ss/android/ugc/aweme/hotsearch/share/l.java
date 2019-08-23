package com.ss.android.ugc.aweme.hotsearch.share;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.permission.g;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49843a;

    /* renamed from: b  reason: collision with root package name */
    private final g f49844b;

    /* renamed from: c  reason: collision with root package name */
    private final a f49845c;

    l(g gVar, a aVar) {
        this.f49844b = gVar;
        this.f49845c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49843a, false, 49785, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49843a, false, 49785, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        g gVar = this.f49844b;
        g.a(gVar.f49830c, new q(gVar, this.f49845c), r.f49860b);
    }
}
