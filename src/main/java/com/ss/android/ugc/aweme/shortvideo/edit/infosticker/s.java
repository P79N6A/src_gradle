package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67418a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67419b;

    s(InfoStickerHelper infoStickerHelper) {
        this.f67419b = infoStickerHelper;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f67418a, false, 76846, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f67418a, false, 76846, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f67419b.j();
    }
}
