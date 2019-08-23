package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.s;

public final class k extends a<ImageView> {
    e m;

    /* access modifiers changed from: package-private */
    public final void b() {
        super.b();
        if (this.m != null) {
            this.m = null;
        }
    }

    public final void a() {
        ImageView imageView = (ImageView) this.f27383c.get();
        if (imageView != null) {
            if (this.g != 0) {
                imageView.setImageResource(this.g);
            } else if (this.h != null) {
                imageView.setImageDrawable(this.h);
            }
            if (this.m != null) {
                this.m.b();
            }
        }
    }

    public final void a(Bitmap bitmap, s.d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f27383c.get();
            if (imageView != null) {
                Bitmap bitmap2 = bitmap;
                s.d dVar2 = dVar;
                t.a(imageView, this.f27381a.f27440d, bitmap2, dVar2, this.f27384d, this.f27381a.l);
                if (this.m != null) {
                    this.m.a();
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    k(s sVar, ImageView imageView, v vVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, e eVar, boolean z) {
        super(sVar, imageView, vVar, i, i2, i3, drawable, str, obj, z);
        this.m = eVar;
    }
}
