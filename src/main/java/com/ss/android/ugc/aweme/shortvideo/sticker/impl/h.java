package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69668a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryStickerViewPagerAdapter f69669b;

    /* renamed from: c  reason: collision with root package name */
    private final int f69670c;

    h(StoryStickerViewPagerAdapter storyStickerViewPagerAdapter, int i) {
        this.f69669b = storyStickerViewPagerAdapter;
        this.f69670c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69668a, false, 79232, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69668a, false, 79232, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f69669b.c(this.f69670c);
    }
}
