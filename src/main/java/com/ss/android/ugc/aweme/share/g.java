package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65018a;

    /* renamed from: b  reason: collision with root package name */
    private final e f65019b;

    /* renamed from: c  reason: collision with root package name */
    private final a f65020c;

    g(e eVar, a aVar) {
        this.f65019b = eVar;
        this.f65020c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65018a, false, 72938, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65018a, false, 72938, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        e eVar = this.f65019b;
        a aVar = this.f65020c;
        if (eVar.j) {
            eVar.a(view, aVar);
        } else {
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
        }
    }
}
