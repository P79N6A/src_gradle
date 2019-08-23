package com.ss.android.ugc.aweme.miniapp.f;

import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.transfer.j;

public final /* synthetic */ class i implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55766a;

    /* renamed from: b  reason: collision with root package name */
    static final j.a f55767b = new i();

    private i() {
    }

    public final void a(ImageView imageView, int i) {
        if (PatchProxy.isSupport(new Object[]{imageView, Integer.valueOf(i)}, this, f55766a, false, 59448, new Class[]{ImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, Integer.valueOf(i)}, this, f55766a, false, 59448, new Class[]{ImageView.class, Integer.TYPE}, Void.TYPE);
        }
    }
}
