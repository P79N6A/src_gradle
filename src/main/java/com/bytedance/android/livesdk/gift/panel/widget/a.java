package com.bytedance.android.livesdk.gift.panel.widget;

import android.text.TextUtils;
import com.bytedance.android.live.f.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15338a;

    /* renamed from: b  reason: collision with root package name */
    private final DouyinGiftPanelBottomWidget f15339b;

    a(DouyinGiftPanelBottomWidget douyinGiftPanelBottomWidget) {
        this.f15339b = douyinGiftPanelBottomWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15338a, false, 9931, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15338a, false, 9931, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        DouyinGiftPanelBottomWidget douyinGiftPanelBottomWidget = this.f15339b;
        if (PatchProxy.isSupport(new Object[0], douyinGiftPanelBottomWidget, DouyinGiftPanelBottomWidget.f15247a, false, 9927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], douyinGiftPanelBottomWidget, DouyinGiftPanelBottomWidget.f15247a, false, 9927, new Class[0], Void.TYPE);
            return;
        }
        if (douyinGiftPanelBottomWidget.isViewValid()) {
            com.bytedance.android.live.f.a walletCenter = ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter();
            if (!TextUtils.isEmpty(walletCenter.f())) {
                douyinGiftPanelBottomWidget.f15248b.setText(walletCenter.f());
            } else {
                douyinGiftPanelBottomWidget.f15248b.setText(C0906R.string.dkq);
            }
            douyinGiftPanelBottomWidget.a((long) walletCenter.b());
        }
    }
}
