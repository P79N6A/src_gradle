package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.vesdk.aj;

public final /* synthetic */ class h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67242a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67243b;

    /* renamed from: c  reason: collision with root package name */
    private final FragmentActivity f67244c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f67245d;

    h(InfoStickerHelper infoStickerHelper, FragmentActivity fragmentActivity, boolean z) {
        this.f67243b = infoStickerHelper;
        this.f67244c = fragmentActivity;
        this.f67245d = z;
    }

    public final void onGlobalLayout() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f67242a, false, 76835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67242a, false, 76835, new Class[0], Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67243b;
        FragmentActivity fragmentActivity = this.f67244c;
        boolean z = this.f67245d;
        if (infoStickerHelper.g != null) {
            aj d2 = infoStickerHelper.g.d();
            infoStickerHelper.r = (fc.b(infoStickerHelper.h.getContext()) - d2.f77890a) >> 1;
            if (fc.a()) {
                int f2 = fc.f(fragmentActivity);
                infoStickerHelper.s = (((fc.e(fragmentActivity) - fb.a((Context) fragmentActivity, f2)) - d2.f77891b) / 2) + fb.b(fragmentActivity, f2);
                return;
            }
            int e2 = fc.e(infoStickerHelper.h.getContext());
            if (z) {
                i = fc.c(fragmentActivity);
            }
            infoStickerHelper.s = ((e2 - i) - d2.f77891b) >> 1;
        }
    }
}
