package com.ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66399a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66400b;

    d(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66400b = cutMultiVideoActivity;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66399a, false, 75443, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f66399a, false, 75443, new Class[]{Object.class}, Object.class);
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66400b;
        if (fc.a()) {
            if (!cutMultiVideoActivity.C) {
                fb.a((View) cutMultiVideoActivity.textureView, (Context) cutMultiVideoActivity, cutMultiVideoActivity.v.c().get(0).g, cutMultiVideoActivity.v.c().get(0).h);
                cutMultiVideoActivity.b();
            }
        } else if (!cutMultiVideoActivity.C) {
            int dip2Px = (int) UIUtils.dip2Px(cutMultiVideoActivity, 52.0f);
            int dip2Px2 = (int) UIUtils.dip2Px(cutMultiVideoActivity, 132.0f);
            int[] a2 = FFMpegManager.a().a(cutMultiVideoActivity.v.c().get(cutMultiVideoActivity.t).f66495b);
            if (a2[0] == 0) {
                TextureView textureView = cutMultiVideoActivity.textureView;
                int i = a2[2];
                int i2 = a2[3];
                if (PatchProxy.isSupport(new Object[]{textureView, cutMultiVideoActivity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(dip2Px), Integer.valueOf(dip2Px2)}, null, fb.f67662a, true, 74538, new Class[]{View.class, Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textureView, cutMultiVideoActivity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(dip2Px), Integer.valueOf(dip2Px2)}, null, fb.f67662a, true, 74538, new Class[]{View.class, Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (!(i2 == 0 || i == 0)) {
                    int e2 = fc.e(cutMultiVideoActivity);
                    int b2 = fc.b(cutMultiVideoActivity);
                    int c2 = fc.c(cutMultiVideoActivity);
                    int d2 = fc.d(cutMultiVideoActivity);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    if (e2 * 9 <= b2 * 16 || i >= i2) {
                        layoutParams.width = b2;
                        layoutParams.height = (i2 * b2) / i;
                        layoutParams.topMargin = dip2Px + ((((((e2 - c2) - d2) - layoutParams.height) - dip2Px2) - dip2Px) / 2);
                        layoutParams.topMargin = layoutParams.topMargin >= 0 ? layoutParams.topMargin : 0;
                        layoutParams.leftMargin = 0;
                    } else {
                        layoutParams.height = ((e2 - d2) - dip2Px) - dip2Px2;
                        layoutParams.width = (i * layoutParams.height) / i2;
                        layoutParams.leftMargin = (b2 - layoutParams.width) / 2;
                        layoutParams.topMargin = dip2Px;
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginStart(layoutParams.leftMargin);
                    }
                    textureView.setLayoutParams(layoutParams);
                }
            }
        }
        return null;
    }
}
