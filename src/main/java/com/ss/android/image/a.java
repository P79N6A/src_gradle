package com.ss.android.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.uikit.util.IESUIUtils;
import com.ss.android.common.util.c;
import com.ss.android.common.util.h;
import com.ss.android.download.a.e;
import com.ss.android.download.a.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    protected e<String, Bitmap> f29214a;

    /* renamed from: b  reason: collision with root package name */
    protected g.a<String, f, Void, ImageView, Bitmap> f29215b;

    /* renamed from: c  reason: collision with root package name */
    protected g<String, f, Void, ImageView, Bitmap> f29216c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f29217d;

    /* renamed from: e  reason: collision with root package name */
    boolean f29218e;

    /* renamed from: f  reason: collision with root package name */
    boolean f29219f;
    public Drawable g;
    private final int h;
    private Drawable i;
    private final int j;
    private final h k;
    private final boolean l;
    private final b m;
    private final C0351a n;

    /* renamed from: com.ss.android.image.a$a  reason: collision with other inner class name */
    public interface C0351a {
        Bitmap a(Bitmap bitmap);
    }

    public static class b implements C0351a {

        /* renamed from: a  reason: collision with root package name */
        private final int f29221a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f29222b;

        public final Bitmap a(Bitmap bitmap) {
            if (this.f29221a <= 0) {
                return bitmap;
            }
            if (this.f29222b) {
                int i = this.f29221a;
                int i2 = i * 2;
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-1);
                float f2 = (float) i;
                canvas.drawCircle(f2, f2, f2, paint);
                Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                Rect rect2 = new Rect(0, 0, i2, i2);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, rect, rect2, paint);
                return createBitmap;
            }
            int i3 = this.f29221a;
            if (bitmap == null) {
                return null;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Paint paint2 = new Paint();
            Rect rect3 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(rect3);
            float f3 = (float) i3;
            paint2.setAntiAlias(true);
            canvas2.drawARGB(0, 0, 0, 0);
            paint2.setColor(-12434878);
            canvas2.drawRoundRect(rectF, f3, f3, paint2);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas2.drawBitmap(bitmap, rect3, rect3, paint2);
            return createBitmap2;
        }

        public b(int i, boolean z) {
            this.f29221a = i;
            this.f29222b = z;
        }
    }

    public final void a() {
        this.f29218e = true;
        this.f29219f = true;
        this.f29216c.d();
    }

    public final void b() {
        this.f29219f = false;
        this.f29216c.c();
        this.f29214a.a(8);
    }

    public final void c() {
        this.f29218e = false;
        this.f29216c.b();
        if (this.k != null) {
            this.k.a();
        }
    }

    private void a(ImageView imageView) {
        if (this.h > 0) {
            if (this.l) {
                imageView.setBackgroundResource(this.h);
            } else {
                imageView.setImageResource(this.h);
            }
        } else if (this.g == null) {
            if (this.i != null) {
                imageView.setBackgroundDrawable(this.i);
            }
        } else if (this.l) {
            IESUIUtils.setViewBackground(imageView, this.g);
        } else {
            imageView.setImageDrawable(this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public final Bitmap a(String str, f fVar) {
        try {
            String d2 = this.m.d(str);
            String f2 = this.m.f(str);
            File file = new File(d2);
            File file2 = new File(f2);
            boolean z = false;
            if (file.isFile() || file2.isFile()) {
                z = true;
            }
            if (!z && this.f29217d) {
                String b2 = this.m.b(str);
                String c2 = b.c(str);
                z = d.a(this.m.l, 512000, fVar.mUri, fVar.mUrlList, b2, this.m.e(str), c2, (c<String>) null, this.k);
            }
            if (!z) {
                return null;
            }
            if (!new File(d2).isFile()) {
                d2 = f2;
            }
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(d2, this.j, this.j);
            if (bitmapFromSD != null) {
                if (this.n != null) {
                    return this.n.a(bitmapFromSD);
                }
                return bitmapFromSD;
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public final void a(ImageView imageView, String str) {
        f fVar = new f(str, null);
        if (imageView != null) {
            String str2 = fVar.mKey;
            this.i = imageView.getBackground();
            imageView.setTag(str2);
            if (str2 == null) {
                a(imageView);
                return;
            }
            Bitmap bitmap = (Bitmap) this.f29214a.a(str2);
            if (bitmap != null) {
                if (this.l) {
                    IESUIUtils.setViewBackground(imageView, new BitmapDrawable(imageView.getResources(), bitmap));
                } else {
                    imageView.setImageBitmap(bitmap);
                    imageView.setBackgroundDrawable(null);
                }
                new ArrayList().add(imageView);
                imageView.setTag(null);
                return;
            }
            a(imageView);
            this.f29216c.a(str2, fVar, null, imageView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, f fVar, Collection<ImageView> collection, Bitmap bitmap) {
        if (this.f29218e && str != null && collection != null && bitmap != null) {
            if (bitmap != null) {
                this.f29214a.a(str, bitmap);
            }
            for (ImageView next : collection) {
                if (str.equals(next.getTag())) {
                    if (this.l) {
                        next.setBackgroundDrawable(new BitmapDrawable(next.getResources(), bitmap));
                    } else {
                        next.setImageBitmap(bitmap);
                        if (bitmap != null) {
                            next.setBackgroundDrawable(null);
                        }
                    }
                    next.setTag(null);
                }
            }
        }
    }

    public a(int i2, h hVar, b bVar, int i3, boolean z, int i4) {
        this(2130840567, hVar, bVar, i3, false, i4, false);
    }

    private a(int i2, h hVar, b bVar, int i3, boolean z, C0351a aVar) {
        this(i2, hVar, bVar, i3, z, aVar, 16, 2);
    }

    public a(int i2, h hVar, b bVar, int i3, boolean z, int i4, boolean z2) {
        this(i2, hVar, bVar, i3, z, (C0351a) new b(i4, z2));
    }

    private a(int i2, h hVar, b bVar, int i3, boolean z, C0351a aVar, int i4, int i5) {
        this.h = i2;
        this.j = i3;
        this.k = hVar;
        this.m = bVar;
        this.l = z;
        this.n = aVar;
        this.f29214a = new e<>(32);
        this.f29215b = new g.a<String, f, Void, ImageView, Bitmap>() {
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
                return a.this.a((String) obj, (f) obj2);
            }

            public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2, Object obj3, Collection collection, Object obj4) {
                a.this.a((String) obj, (f) obj2, collection, (Bitmap) obj4);
            }
        };
        this.f29216c = new g<>(16, 2, this.f29215b);
        this.f29217d = true;
        this.f29218e = true;
        this.f29219f = true;
    }
}
