package com.bytedance.android.livesdk.chatroom.widget;

import android.os.Build;
import android.support.constraint.ConstraintLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13498a;

    /* renamed from: b  reason: collision with root package name */
    private final h f13499b;

    j(h hVar) {
        this.f13499b = hVar;
    }

    public final void run() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f13498a, false, 7843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13498a, false, 7843, new Class[0], Void.TYPE);
            return;
        }
        h hVar = this.f13499b;
        if (hVar.f13491b) {
            if (PatchProxy.isSupport(new Object[0], hVar, h.f13490a, false, 7837, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], hVar, h.f13490a, false, 7837, new Class[0], Void.TYPE);
            } else {
                if (hVar.f13492c[0] <= 0) {
                    i2 = (int) UIUtils.dip2Px(hVar.getContext(), 62.0f);
                    i = (int) UIUtils.dip2Px(hVar.getContext(), 108.0f);
                } else {
                    int screenWidth = UIUtils.getScreenWidth(hVar.getContext());
                    int width = hVar.f13494e.getWidth();
                    int width2 = hVar.f13493d.getWidth();
                    int dip2Px = screenWidth - (hVar.f13492c[0] + (((int) UIUtils.dip2Px(hVar.getContext(), 36.0f)) / 2));
                    int i3 = dip2Px - (width / 2);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    int i4 = i3;
                    i = dip2Px - (width2 / 2);
                    i2 = i4;
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) hVar.f13494e.getLayoutParams();
                layoutParams.rightMargin = i2;
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(i2);
                }
                hVar.f13494e.setLayoutParams(layoutParams);
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) hVar.f13493d.getLayoutParams();
                layoutParams2.rightMargin = i;
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginEnd(i);
                }
                hVar.f13493d.setLayoutParams(layoutParams2);
            }
            hVar.f13494e.setVisibility(0);
            hVar.f13493d.setVisibility(0);
        }
    }
}
