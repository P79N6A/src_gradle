package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.a.c;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

public final /* synthetic */ class f implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60173a;

    /* renamed from: b  reason: collision with root package name */
    private final e f60174b;

    /* renamed from: c  reason: collision with root package name */
    private final g f60175c;

    /* renamed from: d  reason: collision with root package name */
    private final int f60176d;

    /* renamed from: e  reason: collision with root package name */
    private final TransferImage f60177e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.poi.preview.b.c f60178f;

    f(e eVar, g gVar, int i, TransferImage transferImage, com.ss.android.ugc.aweme.poi.preview.b.c cVar) {
        this.f60174b = eVar;
        this.f60175c = gVar;
        this.f60176d = i;
        this.f60177e = transferImage;
        this.f60178f = cVar;
    }

    public final void a(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f60173a, false, 65435, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f60173a, false, 65435, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.f60174b.a(this.f60175c, this.f60176d, this.f60177e, this.f60178f, drawable);
    }
}
