package com.ss.android.ugc.aweme.story.shootvideo.textfont;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74194a;

    /* renamed from: b  reason: collision with root package name */
    private final f f74195b;

    /* renamed from: c  reason: collision with root package name */
    private final e f74196c;

    g(f fVar, e eVar) {
        this.f74195b = fVar;
        this.f74196c = eVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74194a, false, 86118, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74194a, false, 86118, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        f fVar = this.f74195b;
        e eVar = this.f74196c;
        fVar.f74189d.a(view);
        if (eVar.getFontData() != null) {
            fVar.f74188c = eVar.getFontData().h;
        }
        if (eVar.c()) {
            fVar.a(eVar.getFontData());
        }
    }
}
