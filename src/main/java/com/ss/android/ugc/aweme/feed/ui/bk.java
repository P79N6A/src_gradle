package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;

public final /* synthetic */ class bk implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46617a;

    /* renamed from: b  reason: collision with root package name */
    private final bj f46618b;

    bk(bj bjVar) {
        this.f46618b = bjVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46617a, false, 43185, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46617a, false, 43185, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        bj bjVar = this.f46618b;
        if (!(bjVar.c() || bjVar.p == null || bjVar.o == null)) {
            g.a(bjVar.h, bjVar.f3210b, bjVar.o, 1, bjVar.p);
        }
    }
}
