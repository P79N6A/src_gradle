package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.a.c;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

public final /* synthetic */ class d implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60160a;

    /* renamed from: b  reason: collision with root package name */
    private final c f60161b;

    /* renamed from: c  reason: collision with root package name */
    private final g f60162c;

    /* renamed from: d  reason: collision with root package name */
    private final String f60163d;

    /* renamed from: e  reason: collision with root package name */
    private final TransferImage f60164e;

    /* renamed from: f  reason: collision with root package name */
    private final int f60165f;

    d(c cVar, g gVar, String str, TransferImage transferImage, int i) {
        this.f60161b = cVar;
        this.f60162c = gVar;
        this.f60163d = str;
        this.f60164e = transferImage;
        this.f60165f = i;
    }

    public final void a(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f60160a, false, 65428, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f60160a, false, 65428, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.f60161b.a(this.f60162c, this.f60163d, this.f60164e, this.f60165f, drawable);
    }
}
