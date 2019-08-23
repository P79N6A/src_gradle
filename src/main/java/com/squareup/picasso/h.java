package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    final w f27416a;

    /* renamed from: b  reason: collision with root package name */
    final WeakReference<ImageView> f27417b;

    /* renamed from: c  reason: collision with root package name */
    e f27418c;

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f27418c = null;
        ImageView imageView = (ImageView) this.f27417b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public final boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f27417b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width <= 0 || height <= 0) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        w wVar = this.f27416a;
        wVar.f27474b = false;
        wVar.a(width, height).a(imageView, this.f27418c);
        return true;
    }

    h(w wVar, ImageView imageView, e eVar) {
        this.f27416a = wVar;
        this.f27417b = new WeakReference<>(imageView);
        this.f27418c = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }
}
