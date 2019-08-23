package com.ss.android.ugc.aweme.poi.ui;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.map.k;

public final /* synthetic */ class e implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60794a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsSlidablePoiAwemeFeedFragment f60795b;

    e(AbsSlidablePoiAwemeFeedFragment absSlidablePoiAwemeFeedFragment) {
        this.f60795b = absSlidablePoiAwemeFeedFragment;
    }

    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f60794a, false, 65951, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f60794a, false, 65951, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        this.f60795b.a(bitmap2);
    }
}
