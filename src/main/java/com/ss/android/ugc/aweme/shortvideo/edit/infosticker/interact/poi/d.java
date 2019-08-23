package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67292a;

    /* renamed from: b  reason: collision with root package name */
    private final c f67293b;

    d(c cVar) {
        this.f67293b = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67292a, false, 77001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67292a, false, 77001, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f67293b;
        if (cVar.f67288b.getTextViewWidth() > cVar.f67289c) {
            if (PatchProxy.isSupport(new Object[0], cVar, c.f67287a, false, 77000, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f67287a, false, 77000, new Class[0], Void.TYPE);
            } else {
                ViewGroup.LayoutParams layoutParams = cVar.f67288b.getLayoutParams();
                layoutParams.width = cVar.f67291e;
                cVar.f67288b.setLayoutParams(layoutParams);
                cVar.f67288b.setTextSize(cVar.f67290d * 0.75f);
            }
            cVar.f67288b.post(new e(cVar));
        }
        cVar.a();
    }
}
