package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70086a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerPagerAdapter f70087b;

    /* renamed from: c  reason: collision with root package name */
    private final int f70088c;

    l(InfoStickerPagerAdapter infoStickerPagerAdapter, int i) {
        this.f70087b = infoStickerPagerAdapter;
        this.f70088c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70086a, false, 79311, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70086a, false, 79311, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        InfoStickerPagerAdapter infoStickerPagerAdapter = this.f70087b;
        infoStickerPagerAdapter.f69726b.setCurrentItem(this.f70088c, true);
    }
}
