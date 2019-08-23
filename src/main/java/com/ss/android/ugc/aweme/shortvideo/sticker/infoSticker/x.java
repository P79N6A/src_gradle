package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70123a;

    /* renamed from: b  reason: collision with root package name */
    private final w f70124b;

    x(w wVar) {
        this.f70124b = wVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70123a, false, 79470, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70123a, false, 79470, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        w wVar = this.f70124b;
        if (StringUtils.isEmpty(wVar.b())) {
            wVar.m.a(0);
        } else {
            wVar.m.a(wVar.b());
        }
    }
}
