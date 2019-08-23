package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c;
import com.ss.android.ugc.aweme.shortvideo.fb;
import org.jetbrains.annotations.NotNull;

public class y implements c<b>, Cloneable {
    private static final int A = ((int) UIUtils.dip2Px(a.f61119b, 8.0f));

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67430a;
    static Bitmap j;
    static Bitmap k;
    static Bitmap l;
    public static boolean w;
    private static final float x = UIUtils.dip2Px(a.f61119b, 44.0f);
    private static final int y = ((int) UIUtils.dip2Px(a.f61119b, 12.0f));
    private static final int z = ((int) UIUtils.dip2Px(a.f61119b, 14.0f));
    private final b B;
    private PointF[] C = {new PointF(), new PointF(), new PointF(), new PointF()};
    private float D;
    private float E;
    private Paint F;

    /* renamed from: b  reason: collision with root package name */
    public float f67431b = 0.15f;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.n.b f67432c;

    /* renamed from: d  reason: collision with root package name */
    boolean f67433d;

    /* renamed from: e  reason: collision with root package name */
    Paint f67434e = new Paint();

    /* renamed from: f  reason: collision with root package name */
    RectF f67435f;
    Rect g;
    public RectF h;
    public Matrix i;
    RectF m;
    RectF n;
    RectF o;
    public RectF p;
    public RectF q;
    public RectF r;
    public long s;
    public boolean t = true;
    PointF[] u = new PointF[4];
    float v = 1.0f;

    public final boolean a(int i2, int i3, int i4, int i5, float f2, float f3) {
        int i6 = i2;
        int i7 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(0.5f), Float.valueOf(0.5f)}, this, f67430a, false, 76867, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(0.5f), Float.valueOf(0.5f)}, this, f67430a, false, 76867, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        float f4 = (float) i4;
        this.D = f4;
        float f5 = (float) i5;
        this.E = f5;
        if (!TextUtils.isEmpty(this.f67432c.path) && this.f67432c.initWidth != 0.0f && this.f67432c.initHeight != 0.0f) {
            w = fb.a(i2, i3);
            float f6 = ((((float) i6) * 0.5f) - (this.f67432c.initWidth / 2.0f)) + f4;
            float f7 = ((((float) i7) * 0.5f) - (this.f67432c.initHeight / 2.0f)) + f5;
            this.f67435f = new RectF(f6, f7, this.f67432c.initWidth + f6, this.f67432c.initHeight + f7);
            this.i = new Matrix();
            this.f67431b = Math.max(x / this.f67432c.initWidth, x / this.f67432c.initHeight);
            this.h = new RectF(this.f67435f);
            e();
            this.g = new Rect(0, 0, j.getWidth(), j.getHeight());
            this.m = new RectF(this.h.left - ((float) z), this.h.top - ((float) z), this.h.left + ((float) z), this.h.top + ((float) z));
            this.n = new RectF(this.h.right - ((float) z), this.h.bottom - ((float) z), this.h.right + ((float) z), this.h.bottom + ((float) z));
            this.o = new RectF(this.h.right - ((float) z), this.h.top - ((float) z), this.h.right + ((float) z), this.h.top + ((float) z));
            this.p = new RectF(this.n);
            this.q = new RectF(this.m);
            this.r = new RectF(this.o);
            a(this.p);
            a(this.q);
            a(this.r);
            for (int i8 = 0; i8 < 4; i8++) {
                this.u[i8] = new PointF();
            }
            return true;
        } else if (!com.ss.android.ugc.aweme.g.a.a()) {
            com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a("event", "initFailed");
            n.a("info_sticker", a2.a("user_info", "path: " + this.f67432c.path + " width * height " + this.f67432c.initWidth + " * " + this.f67432c.initHeight + " surface width * height " + i6 + " * " + i7).b());
            return false;
        } else {
            throw new IllegalStateException("StickerItem wrong \n" + this.f67432c);
        }
    }

    public final int a() {
        return this.f67432c.startTime;
    }

    public final int b() {
        return this.f67432c.endTime;
    }

    public final float c() {
        return this.f67432c.rotateAngle;
    }

    private void e() {
        this.h.left -= (float) y;
        this.h.right += (float) y;
        this.h.top -= (float) y;
        this.h.bottom += (float) y;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public y clone() {
        if (PatchProxy.isSupport(new Object[0], this, f67430a, false, 76878, new Class[0], y.class)) {
            return (y) PatchProxy.accessDispatch(new Object[0], this, f67430a, false, 76878, new Class[0], y.class);
        }
        try {
            return (y) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f67430a, false, 76877, new Class[0], Integer.TYPE)) {
            return this.f67432c.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67430a, false, 76877, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: private */
    @NotNull
    /* renamed from: g */
    public b d() {
        if (PatchProxy.isSupport(new Object[0], this, f67430a, false, 76881, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f67430a, false, 76881, new Class[0], b.class);
        }
        b bVar = new b(this.f67432c.startTime, this.f67432c.endTime, this.f67432c.rotateAngle, this.f67432c.scale, this.f67432c.currentOffsetX, this.f67432c.currentOffsetY);
        return bVar;
    }

    private static void a(RectF rectF) {
        rectF.left -= (float) A;
        rectF.right += (float) A;
        rectF.top -= (float) A;
        rectF.bottom += (float) A;
    }

    public final int b(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f67430a, false, 76875, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return b();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f67430a, false, 76875, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67430a, false, 76876, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f67430a, false, 76876, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof y)) {
                return false;
            }
            return this.f67432c.equals(((y) obj).f67432c);
        }
    }

    public final int a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f67430a, false, 76874, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f67430a, false, 76874, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final PointF[] c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67430a, false, 76880, new Class[]{Float.TYPE}, PointF[].class)) {
            return (PointF[]) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67430a, false, 76880, new Class[]{Float.TYPE}, PointF[].class);
        }
        this.C[0].x = this.f67435f.left;
        this.C[0].y = this.f67435f.top;
        this.C[1].x = this.f67435f.right;
        this.C[1].y = this.f67435f.top;
        this.C[2].x = this.f67435f.right;
        this.C[2].y = this.f67435f.bottom;
        this.C[3].x = this.f67435f.left;
        this.C[3].y = this.f67435f.bottom;
        for (PointF a2 : this.C) {
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(a2, this.f67435f.centerX(), this.f67435f.centerY(), (float) Math.toRadians((double) c()));
        }
        this.C[0].x -= f2;
        this.C[1].x -= f2;
        this.C[2].x -= f2;
        this.C[3].x -= f2;
        return this.C;
    }

    public void setAlpha(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67430a, false, 76882, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f67430a, false, 76882, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            b bVar = this.B;
            if (PatchProxy.isSupport(new Object[]{this}, bVar, b.f67226a, false, 76744, new Class[]{y.class}, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{this}, bVar2, b.f67226a, false, 76744, new Class[]{y.class}, Void.TYPE);
            } else {
                bVar.f67231f.c(this.f67432c.id, 1.0f);
            }
        } else {
            b bVar3 = this.B;
            if (PatchProxy.isSupport(new Object[]{this}, bVar3, b.f67226a, false, 76740, new Class[]{y.class}, Void.TYPE)) {
                Object[] objArr = {this};
                b bVar4 = bVar3;
                PatchProxy.accessDispatch(objArr, bVar4, b.f67226a, false, 76740, new Class[]{y.class}, Void.TYPE);
                return;
            }
            bVar3.f67231f.c(this.f67432c.id, 0.3137255f);
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67430a, false, 76870, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67430a, false, 76870, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (f2 != 0.0f) {
            this.i.postRotate(f2, this.f67435f.centerX(), this.f67435f.centerY());
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.p, this.f67435f.centerX(), this.f67435f.centerY(), f2);
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.q, this.f67435f.centerX(), this.f67435f.centerY(), f2);
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.r, this.f67435f.centerX(), this.f67435f.centerY(), f2);
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67430a, false, 76871, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67430a, false, 76871, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.v *= f2;
        this.i.postScale(f2, f2, this.f67435f.centerX(), this.f67435f.centerY());
        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.f67435f, f2);
        this.h.set(this.f67435f);
        e();
        this.n.offsetTo(this.h.right - ((float) z), this.h.bottom - ((float) z));
        this.m.offsetTo(this.h.left - ((float) z), this.h.top - ((float) z));
        this.o.offsetTo(this.h.right - ((float) z), this.h.top - ((float) z));
        this.p.offsetTo(this.n.left - ((float) A), this.n.top - ((float) A));
        this.q.offsetTo(this.m.left - ((float) A), this.m.top - ((float) A));
        this.r.offsetTo(this.o.left - ((float) A), this.o.top - ((float) A));
        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.p, this.f67435f.centerX(), this.f67435f.centerY(), this.f67432c.rotateAngle);
        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.q, this.f67435f.centerX(), this.f67435f.centerY(), this.f67432c.rotateAngle);
        com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(this.r, this.f67435f.centerX(), this.f67435f.centerY(), this.f67432c.rotateAngle);
    }

    public static void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f67430a, true, 76866, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f67430a, true, 76866, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        w = fb.a(i2, i3);
    }

    public final PointF[] b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67430a, false, 76879, new Class[]{Float.TYPE, Float.TYPE}, PointF[].class)) {
            return (PointF[]) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67430a, false, 76879, new Class[]{Float.TYPE, Float.TYPE}, PointF[].class);
        }
        PointF[] pointFArr = new PointF[this.u.length];
        for (int i2 = 0; i2 < pointFArr.length; i2++) {
            pointFArr[i2] = this.u[i2];
            pointFArr[i2].x -= f2;
            pointFArr[i2].y -= f3;
        }
        for (PointF a2 : pointFArr) {
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(a2, this.f67435f.centerX(), this.f67435f.centerY(), (float) Math.toRadians((double) c()));
        }
        return pointFArr;
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67430a, false, 76868, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f67430a, false, 76868, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.i.postTranslate(f2, f3);
        this.f67435f.offset(f2, f3);
        this.h.offset(f2, f3);
        this.m.offset(f2, f3);
        this.n.offset(f2, f3);
        this.o.offset(f2, f3);
        this.p.offset(f2, f3);
        this.q.offset(f2, f3);
        this.r.offset(f2, f3);
    }

    y(Context context, @NonNull com.ss.android.ugc.aweme.n.b bVar, b bVar2) {
        this.f67432c = bVar;
        this.B = bVar2;
        if (PatchProxy.isSupport(new Object[]{context}, this, f67430a, false, 76864, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f67430a, false, 76864, new Class[]{Context.class}, Void.TYPE);
        } else {
            this.f67434e.setColor(context.getResources().getColor(C0906R.color.ox));
            this.f67434e.setStyle(Paint.Style.STROKE);
            this.f67434e.setAntiAlias(true);
            this.f67434e.setStrokeWidth(2.0f);
            this.F = new Paint();
            this.F.setColor(-65536);
        }
        if (PatchProxy.isSupport(new Object[]{context}, this, f67430a, false, 76865, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f67430a, false, 76865, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (j == null) {
            j = BitmapFactory.decodeResource(context.getResources(), 2130839332);
        }
        if (k == null) {
            k = BitmapFactory.decodeResource(context.getResources(), 2130839334);
        }
        if (l == null) {
            l = BitmapFactory.decodeResource(context.getResources(), 2130839337);
        }
    }

    public final /* synthetic */ void a(@NotNull com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a aVar, int i2, int i3) {
        b bVar = (b) aVar;
        if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67430a, false, 76883, new Class[]{b.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67430a, false, 76883, new Class[]{b.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar2 = this.B;
        bVar2.a(this, bVar.f67221b, bVar.f67222c);
        b g2 = d();
        bVar2.a(this, (bVar.f67225f - g2.f67225f) * ((float) i2), (bVar.g - g2.g) * ((float) i3));
        bVar2.a(this, bVar.f67223d - g2.f67223d);
        bVar2.b(this, bVar.f67224e / g2.f67224e);
    }
}
