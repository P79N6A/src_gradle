package com.bytedance.android.livesdk.common;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c extends Dialog {
    public static ChangeQuickRedirect g;
    protected boolean h;

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 8078, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 8078, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.h) {
                window.setLayout(-1, -2);
                return;
            }
            window.setLayout(-2, -1);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r3, boolean r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0006
            r0 = 2131493694(0x7f0c033e, float:1.8610875E38)
            goto L_0x0009
        L_0x0006:
            r0 = 2131493695(0x7f0c033f, float:1.8610877E38)
        L_0x0009:
            r2.<init>(r3, r0)
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L_0x0028
            android.view.Window r0 = r2.getWindow()
            r1 = 1
            r0.requestFeature(r1)
            if (r4 == 0) goto L_0x0022
            r0 = 80
            r3.setGravity(r0)
            goto L_0x0028
        L_0x0022:
            r0 = 8388613(0x800005, float:1.175495E-38)
            r3.setGravity(r0)
        L_0x0028:
            r2.h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.common.c.<init>(android.content.Context, boolean):void");
    }
}
