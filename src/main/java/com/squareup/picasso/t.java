package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.s;

public final class t extends BitmapDrawable {

    /* renamed from: e  reason: collision with root package name */
    private static final Paint f27454e = new Paint();

    /* renamed from: a  reason: collision with root package name */
    Drawable f27455a;

    /* renamed from: b  reason: collision with root package name */
    long f27456b;

    /* renamed from: c  reason: collision with root package name */
    boolean f27457c;

    /* renamed from: d  reason: collision with root package name */
    int f27458d = 255;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f27459f;
    private final float g;
    private final s.d h;

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.f27455a != null) {
            this.f27455a.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i) {
        this.f27458d = i;
        if (this.f27455a != null) {
            this.f27455a.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f27455a != null) {
            this.f27455a.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        if (!this.f27457c) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f27456b)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f27457c = false;
                this.f27455a = null;
                super.draw(canvas);
            } else {
                if (this.f27455a != null) {
                    this.f27455a.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f27458d) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f27458d);
                if (Build.VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        }
        if (this.f27459f) {
            f27454e.setColor(-1);
            canvas.drawPath(a(new Point(0, 0), (int) (this.g * 16.0f)), f27454e);
            f27454e.setColor(this.h.debugColor);
            canvas.drawPath(a(new Point(0, 0), (int) (this.g * 15.0f)), f27454e);
        }
    }

    private static Path a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    static void a(ImageView imageView, Context context, Bitmap bitmap, s.d dVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        t tVar = new t(context, bitmap, drawable, dVar, z, z2);
        imageView.setImageDrawable(tVar);
    }

    private t(Context context, Bitmap bitmap, Drawable drawable, s.d dVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        boolean z3;
        this.f27459f = z2;
        this.g = context.getResources().getDisplayMetrics().density;
        this.h = dVar;
        if (dVar == s.d.MEMORY || z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            this.f27455a = drawable;
            this.f27457c = true;
            this.f27456b = SystemClock.uptimeMillis();
        }
    }
}
