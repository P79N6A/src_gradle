package com.ss.android.ugc.aweme.newfollow.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;

public final class a extends BitmapDrawable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57295a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f57296b;

    public a(Bitmap bitmap) {
        super(bitmap);
        this.f57296b = bitmap;
    }

    public final void draw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f57295a, false, 61441, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f57295a, false, 61441, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.f57296b != null) {
            if (this.f57296b.isRecycled()) {
                n.a("bitmap_draw_after_recycled", "bitmap recycled", null);
                return;
            }
            try {
                super.draw(canvas);
            } catch (Exception e2) {
                n.a("bitmap_draw_after_recycled", e2.getMessage(), null);
            }
        }
    }
}
