package com.bytedance.android.livesdk.banner.ad;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9124a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9125b;

    /* renamed from: c  reason: collision with root package name */
    private final HSImageView f9126c;

    c(b bVar, HSImageView hSImageView) {
        this.f9125b = bVar;
        this.f9126c = hSImageView;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9124a, false, 3202, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9124a, false, 3202, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f9125b;
        HSImageView hSImageView = this.f9126c;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            hSImageView.setImageDrawable(new BitmapDrawable(bitmap));
            UIUtils.setViewVisibility(bVar, 0);
            a.a().a((Object) new a(true));
        }
    }
}
