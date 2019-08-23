package com.bytedance.android.livesdk.chatroom.interact.e;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.chatroom.widget.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10925a;

    /* renamed from: b  reason: collision with root package name */
    private final g f10926b;

    h(g gVar) {
        this.f10926b = gVar;
    }

    public final void run() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f10925a, false, 5104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10925a, false, 5104, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f10926b;
        int size = gVar.f10913e.size();
        float f2 = 2.14748365E9f;
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = gVar.f10913e.get(i2);
            if (mVar != null && mVar.getY() < f2) {
                f2 = mVar.getY();
            }
        }
        if (2.14748365E9f == f2 || f2 < 10.0f) {
            i = gVar.g;
        } else {
            i = (int) (((gVar.f10911c.getY() + ((float) gVar.f10911c.getHeight())) - f2) + ((float) gVar.f10914f));
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gVar.f10912d.getLayoutParams();
        layoutParams.bottomMargin = i;
        gVar.f10912d.setLayoutParams(layoutParams);
    }
}
