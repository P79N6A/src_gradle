package com.ss.android.ugc.aweme.poi.ui.publish;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.utils.g;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60864a;

    /* renamed from: b  reason: collision with root package name */
    private final b f60865b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60866c;

    f(b bVar, String str) {
        this.f60865b = bVar;
        this.f60866c = str;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60864a, false, 66664, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60864a, false, 66664, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        b bVar = this.f60865b;
        g.a(bVar.b(), this.f60866c, bVar.a((int) C0906R.string.c7t));
    }
}
