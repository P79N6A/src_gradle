package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.h;

public final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f44553e;

    public final Bitmap c() {
        if (PatchProxy.isSupport(new Object[0], this, f44553e, false, 39757, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f44553e, false, 39757, new Class[0], Bitmap.class);
        }
        Bitmap bitmap = null;
        if (this.f44521b != null && (this.f44521b instanceof com.ss.android.ugc.aweme.crossplatform.base.d)) {
            h hVar = (h) ((com.ss.android.ugc.aweme.crossplatform.base.d) this.f44521b).a(h.class);
            if (hVar != null) {
                SingleWebView b2 = hVar.b();
                if (b2 != null) {
                    bitmap = Bitmap.createBitmap(b2.getWidth(), b2.getHeight(), Bitmap.Config.RGB_565);
                    b2.draw(new Canvas(bitmap));
                }
            }
        }
        return bitmap;
    }

    public d(Activity activity, ShareInfo shareInfo, String str, String str2) {
        super(activity, shareInfo, str, str2);
    }
}
