package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65015a;

    /* renamed from: b  reason: collision with root package name */
    private final e f65016b;

    /* renamed from: c  reason: collision with root package name */
    private final a f65017c;

    f(e eVar, a aVar) {
        this.f65016b = eVar;
        this.f65017c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65015a, false, 72937, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65015a, false, 72937, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        e eVar = this.f65016b;
        a aVar = this.f65017c;
        if (eVar.j) {
            eVar.a(view, aVar);
        } else {
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
        }
    }
}
