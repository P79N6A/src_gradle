package com.ss.android.ugc.aweme.poi.preview.a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.a.c;
import com.ss.android.ugc.aweme.poi.preview.transfer.g;

public final /* synthetic */ class b implements com.ss.android.ugc.aweme.base.b.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60127a;

    /* renamed from: b  reason: collision with root package name */
    private final a f60128b;

    /* renamed from: c  reason: collision with root package name */
    private final c.b f60129c;

    /* renamed from: d  reason: collision with root package name */
    private final g f60130d;

    /* renamed from: e  reason: collision with root package name */
    private final String f60131e;

    b(a aVar, c.b bVar, g gVar, String str) {
        this.f60128b = aVar;
        this.f60129c = bVar;
        this.f60130d = gVar;
        this.f60131e = str;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f60127a, false, 65400, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f60127a, false, 65400, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f60128b;
        c.b bVar = this.f60129c;
        g gVar = this.f60130d;
        String str = this.f60131e;
        Bitmap bitmap = (Bitmap) obj;
        if (bVar != null) {
            if (bitmap == null || bitmap.isRecycled()) {
                bVar.a(null);
            } else {
                bVar.a(new BitmapDrawable(aVar.a(bitmap, gVar != null ? gVar.x : "", str)));
            }
        }
    }
}
