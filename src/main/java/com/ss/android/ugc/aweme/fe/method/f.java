package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.crossplatform.base.d;
import com.ss.android.ugc.aweme.crossplatform.view.c;

public final class f extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f44586e;

    /* renamed from: f  reason: collision with root package name */
    private ScrollView f44587f;

    public final Bitmap c() {
        if (PatchProxy.isSupport(new Object[0], this, f44586e, false, 39799, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f44586e, false, 39799, new Class[0], Bitmap.class);
        }
        if (this.f44521b != null && (this.f44521b instanceof d)) {
            c cVar = (c) ((d) this.f44521b).a(c.class);
            if (cVar != null) {
                a(cVar.a());
                if (this.f44587f != null) {
                    int scrollY = this.f44587f.getScrollY();
                    int width = this.f44587f.getWidth();
                    int height = this.f44587f.getHeight();
                    this.f44587f.scrollTo(0, 0);
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                    this.f44587f.draw(new Canvas(createBitmap));
                    this.f44587f.scrollTo(0, scrollY);
                    return createBitmap;
                }
            }
        }
        return null;
    }

    private void a(ViewGroup viewGroup) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f44586e, false, 39798, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f44586e, false, 39798, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ScrollView) {
                this.f44587f = (ScrollView) childAt;
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public f(Activity activity, ShareInfo shareInfo, String str, String str2) {
        super(activity, shareInfo, str, str2);
    }
}
