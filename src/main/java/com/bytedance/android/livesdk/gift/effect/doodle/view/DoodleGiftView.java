package com.bytedance.android.livesdk.gift.effect.doodle.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.gift.effect.doodle.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DoodleGiftView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14797a;
    private float A;
    private float B;
    private float C;
    private int D;
    private Matrix E;
    private Bitmap F;
    private long G;
    private int H;

    /* renamed from: b  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.gift.effect.doodle.c.a> f14798b;

    /* renamed from: c  reason: collision with root package name */
    public a f14799c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.android.livesdk.gift.effect.doodle.b.a f14800d;

    /* renamed from: e  reason: collision with root package name */
    boolean f14801e;

    /* renamed from: f  reason: collision with root package name */
    private float f14802f;
    private float g;
    private b h;
    private HashMap<String, Bitmap> i;
    private Paint j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private int x;
    private float y;
    private float z;

    public enum a {
        play,
        draw;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public int getDrawPointNum() {
        if (!PatchProxy.isSupport(new Object[0], this, f14797a, false, 9418, new Class[0], Integer.TYPE)) {
            return this.f14798b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14797a, false, 9418, new Class[0], Integer.TYPE)).intValue();
    }

    private void b() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f14797a, false, 9419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14797a, false, 9419, new Class[0], Void.TYPE);
            return;
        }
        int c2 = ac.c();
        int b2 = ac.b();
        this.o = this.h.g;
        this.p = this.h.h;
        float f3 = this.h.f14795e;
        float f4 = this.h.f14796f;
        float f5 = (float) c2;
        float f6 = this.h.f14792b / f5;
        this.k = f3 / f6;
        this.l = f4 / f6;
        if (this.H == 1) {
            f2 = 0.8f;
        } else {
            f2 = 0.5f;
        }
        this.f14802f = f2;
        float f7 = this.k / this.l;
        if (this.k > this.f14802f * f5) {
            this.k = this.f14802f * f5;
            this.l = this.k / f7;
        }
        float f8 = (float) b2;
        if (this.l > this.f14802f * f8) {
            this.l = this.f14802f * f8;
            this.k = this.l * f7;
        }
        this.m = (f5 - this.k) / 2.0f;
        this.n = (f8 - this.l) / 2.0f;
        if (this.h.f14794d.size() > 30) {
            this.r = 1500 / ((long) this.h.f14794d.size());
        } else {
            this.r = 64;
        }
        this.q = 1200;
        this.t = (this.r * ((long) this.h.f14794d.size())) + 60;
        this.u = this.t + this.q;
        this.s = this.t + this.q + 300;
        for (int i2 = 0; i2 < this.h.f14794d.size(); i2++) {
            this.h.f14794d.get(i2).f14789d = ((long) i2) * this.r;
            a(this.h.f14794d.get(i2).f14788c);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14797a, false, 9421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14797a, false, 9421, new Class[0], Void.TYPE);
        } else if (this.f14799c == a.play) {
            this.f14801e = false;
            this.w = false;
            this.v = 0;
            if (this.f14800d != null) {
                this.f14800d.a(300, this.n);
            }
            invalidate();
        }
    }

    public final DoodleGiftView a(a aVar) {
        this.f14799c = aVar;
        return this;
    }

    public DoodleGiftView(Context context) {
        super(context);
        a(context);
    }

    public final DoodleGiftView a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f14797a, false, 9417, new Class[]{b.class}, DoodleGiftView.class)) {
            return (DoodleGiftView) PatchProxy.accessDispatch(new Object[]{bVar}, this, f14797a, false, 9417, new Class[]{b.class}, DoodleGiftView.class);
        } else if (bVar == null) {
            return this;
        } else {
            this.h = bVar;
            b();
            return this;
        }
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f14797a, false, 9416, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f14797a, false, 9416, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f14798b = new ArrayList();
        this.i = new HashMap<>();
        this.f14799c = a.draw;
        this.E = new Matrix();
        this.j = new Paint();
        this.g = getResources().getDimension(C0906R.dimen.n2);
        this.H = context.getResources().getConfiguration().orientation;
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f14797a, false, 9420, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f14797a, false, 9420, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!this.i.containsKey(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile != null) {
                this.i.put(str, Bitmap.createBitmap(decodeFile));
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f14797a, false, 9425, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f14797a, false, 9425, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        switch (this.f14799c) {
            case play:
                if (PatchProxy.isSupport(new Object[]{canvas2}, this, f14797a, false, 9426, new Class[]{Canvas.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{canvas2}, this, f14797a, false, 9426, new Class[]{Canvas.class}, Void.TYPE);
                    break;
                } else if (!this.f14801e && this.h != null && !this.h.f14794d.isEmpty()) {
                    List<com.bytedance.android.livesdk.gift.effect.doodle.c.a> list = this.h.f14794d;
                    if (this.v <= this.u) {
                        if (PatchProxy.isSupport(new Object[]{canvas2, list}, this, f14797a, false, 9427, new Class[]{Canvas.class, List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{canvas2, list}, this, f14797a, false, 9427, new Class[]{Canvas.class, List.class}, Void.TYPE);
                        } else {
                            this.x = list.size();
                            for (int i2 = 0; i2 < this.x; i2++) {
                                this.F = this.i.get(list.get(i2).f14788c);
                                if (this.F != null) {
                                    if (list.get(i2).f14789d <= this.v) {
                                        this.y = ((this.k * (((float) list.get(i2).f14786a) - this.o)) / this.h.f14795e) + this.m;
                                        this.z = ((this.l * (((float) list.get(i2).f14787b) - this.p)) / this.h.f14796f) + this.n;
                                        this.A = this.y - ((float) (this.F.getWidth() / 2));
                                        this.B = this.z - ((float) (this.F.getHeight() / 2));
                                        this.C = a(this.F.getWidth(), this.F.getHeight()) * 0.9f;
                                        this.D = 255;
                                        if (!list.get(i2).f14790e) {
                                            this.G = this.v - list.get(i2).f14789d;
                                            if (this.G > 60) {
                                                list.get(i2).f14790e = true;
                                            } else {
                                                this.C = (((float) this.G) / 60.0f) * this.C;
                                                this.D = (int) ((((float) this.G) / 60.0f) * 255.0f);
                                            }
                                        }
                                        this.E.setScale(this.C, this.C, (float) (this.F.getWidth() / 2), (float) (this.F.getHeight() / 2));
                                        this.E.postTranslate(this.A, this.B);
                                        this.j.setAlpha(this.D);
                                        canvas2.drawBitmap(this.F, this.E, this.j);
                                    }
                                }
                            }
                        }
                    } else {
                        if (PatchProxy.isSupport(new Object[]{canvas2, list}, this, f14797a, false, 9428, new Class[]{Canvas.class, List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{canvas2, list}, this, f14797a, false, 9428, new Class[]{Canvas.class, List.class}, Void.TYPE);
                        } else {
                            if (this.f14800d != null && !this.w) {
                                this.f14800d.a(300);
                                this.w = true;
                            }
                            this.x = list.size();
                            for (int i3 = 0; i3 < this.x; i3++) {
                                this.F = this.i.get(list.get(i3).f14788c);
                                if (this.F != null) {
                                    this.y = ((this.k * (((float) list.get(i3).f14786a) - this.o)) / this.h.f14795e) + this.m;
                                    this.z = ((this.l * (((float) list.get(i3).f14787b) - this.p)) / this.h.f14796f) + this.n;
                                    this.A = this.y - ((float) (this.F.getWidth() / 2));
                                    this.B = this.z - ((float) (this.F.getHeight() / 2));
                                    this.G = this.s - this.v;
                                    this.C = a(this.F.getWidth(), this.F.getHeight()) * 0.9f;
                                    this.C += (1.0f - (((float) this.G) / 300.0f)) * 0.5f;
                                    this.D = (int) ((((float) this.G) / 300.0f) * 255.0f);
                                    this.E.setScale(this.C, this.C, (float) (this.F.getWidth() / 2), (float) (this.F.getHeight() / 2));
                                    this.E.postTranslate(this.A, this.B);
                                    this.j.setAlpha(this.D);
                                    canvas2.drawBitmap(this.F, this.E, this.j);
                                }
                            }
                        }
                    }
                    this.v += 20;
                    if (this.v < this.s) {
                        postInvalidateDelayed(20);
                        break;
                    } else {
                        this.f14801e = true;
                        if (PatchProxy.isSupport(new Object[0], this, f14797a, false, 9430, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f14797a, false, 9430, new Class[0], Void.TYPE);
                            break;
                        } else {
                            this.h = null;
                            if (this.f14800d != null) {
                                this.f14800d.a();
                            }
                            return;
                        }
                    }
                }
            case draw:
                if (!PatchProxy.isSupport(new Object[]{canvas2}, this, f14797a, false, 9429, new Class[]{Canvas.class}, Void.TYPE)) {
                    if (!this.f14798b.isEmpty()) {
                        int drawPointNum = getDrawPointNum();
                        for (int i4 = 0; i4 < drawPointNum; i4++) {
                            com.bytedance.android.livesdk.gift.effect.doodle.c.a aVar = this.f14798b.get(i4);
                            Bitmap bitmap = this.i.get(aVar.f14788c);
                            if (bitmap != null) {
                                int width = aVar.f14786a - (bitmap.getWidth() / 2);
                                int height = aVar.f14787b - (bitmap.getHeight() / 2);
                                this.C = a(bitmap.getWidth(), bitmap.getHeight()) * 0.9f;
                                this.E.setScale(this.C, this.C, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
                                this.E.postTranslate((float) width, (float) height);
                                canvas2.drawBitmap(bitmap, this.E, this.j);
                            }
                        }
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[]{canvas2}, this, f14797a, false, 9429, new Class[]{Canvas.class}, Void.TYPE);
                    return;
                }
                break;
        }
    }

    public DoodleGiftView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private float a(int i2, int i3) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14797a, false, 9431, new Class[]{Integer.TYPE, Integer.TYPE}, Float.TYPE)) {
            return this.g / ((float) Math.max(i2, i3));
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14797a, false, 9431, new Class[]{Integer.TYPE, Integer.TYPE}, Float.TYPE)).floatValue();
    }

    public DoodleGiftView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    public final void a(int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f14797a, false, 9422, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f14797a, false, 9422, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.f14799c == a.draw && str2 != null) {
            int i4 = i2;
            int i5 = i3;
            this.f14798b.add(new com.bytedance.android.livesdk.gift.effect.doodle.c.a(i2, i3, str2));
            a(str2);
            invalidate();
        }
    }
}
