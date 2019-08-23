package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.p;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67414a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67415b;

    /* renamed from: c  reason: collision with root package name */
    private final p f67416c;

    /* renamed from: d  reason: collision with root package name */
    private final FrameLayout f67417d;

    r(InfoStickerHelper infoStickerHelper, p pVar, FrameLayout frameLayout) {
        this.f67415b = infoStickerHelper;
        this.f67416c = pVar;
        this.f67417d = frameLayout;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67414a, false, 76845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67414a, false, 76845, new Class[0], Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67415b;
        p pVar = this.f67416c;
        FrameLayout frameLayout = this.f67417d;
        aj d2 = pVar.d();
        if (d2.f77890a != 0 && d2.f77891b != 0) {
            int[] a2 = z.a((View) frameLayout, d2.f77890a, d2.f77891b, infoStickerHelper.f67203c);
            infoStickerHelper.r = a2[0];
            infoStickerHelper.s = a2[1];
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            infoStickerHelper.t = new Rect(0, layoutParams.topMargin, layoutParams.width, layoutParams.height + layoutParams.topMargin);
            infoStickerHelper.u = a.a(infoStickerHelper.o.getContext(), layoutParams.width, layoutParams.height, infoStickerHelper.r, infoStickerHelper.s);
            frameLayout.addView(infoStickerHelper.u);
        }
    }
}
