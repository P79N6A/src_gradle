package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.c;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.themechange.base.b;
import java.util.concurrent.TimeUnit;

public class VolumeTapsView extends View implements GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71399a;

    /* renamed from: b  reason: collision with root package name */
    public int f71400b;

    /* renamed from: c  reason: collision with root package name */
    public int f71401c;

    /* renamed from: d  reason: collision with root package name */
    public int f71402d;

    /* renamed from: e  reason: collision with root package name */
    public int f71403e;

    /* renamed from: f  reason: collision with root package name */
    public int f71404f;
    public int g;
    private final RectF h;
    private final RectF i;
    private final Paint j;
    private Bitmap k;
    private Bitmap l;
    private Bitmap m;
    private c n;
    private c o;
    private c p;
    private Bitmap q;
    private GestureDetector r;
    private a s;
    private long t;
    private int u;

    public interface a {
        void a(int i);

        void a(int i, int i2);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public int getStopPosition() {
        return this.g;
    }

    public void a(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f71399a, false, 81509, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f71399a, false, 81509, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (fVar != null && com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a(fVar.getMusicWavePointArray())) {
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 4.0f);
            com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().b(fVar);
            this.n.f66678c = dip2Px;
            this.o.f66678c = dip2Px;
            this.p.f66678c = dip2Px;
            this.n.f66677b = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().f66698e;
            this.o.f66677b = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().f66698e;
            this.p.f66677b = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().f66698e;
            this.n.a(fVar.getMusicWavePointArray());
            this.o.a(fVar.getMusicWavePointArray());
            this.p.a(fVar.getMusicWavePointArray());
        }
    }

    public void setOnProgressChangeListener(a aVar) {
        this.s = aVar;
    }

    public VolumeTapsView(Context context) {
        this(context, null);
    }

    private float a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71399a, false, 81502, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((((float) (i2 - this.f71400b)) * 1.0f) * ((float) getMeasuredWidth())) / ((float) (this.f71401c - this.f71400b));
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71399a, false, 81502, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71399a, false, 81497, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71399a, false, 81497, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.g = a(Math.min(Math.max(a(this.f71402d), motionEvent.getX()), (float) getMeasuredWidth()));
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
        if (this.s != null) {
            this.s.a(this.g);
        }
        return true;
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f71399a, false, 81494, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f71399a, false, 81494, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        c cVar = this.p;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f66676a, false, 76046, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], cVar, c.f66676a, false, 76046, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = f.b.a(cVar.f66679d);
        }
        if (z) {
            a(canvas2, false);
        } else {
            a(canvas2, true);
        }
    }

    public void setPastPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71399a, false, 81500, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71399a, false, 81500, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71402d = i2;
        invalidate();
    }

    public void setProgress(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71399a, false, 81506, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71399a, false, 81506, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71404f = i2;
        invalidate();
    }

    public void setStopPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71399a, false, 81501, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71399a, false, 81501, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        invalidate();
    }

    public void setTotalTime(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f71399a, false, 81507, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f71399a, false, 81507, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.t = j2;
        setWavForm(this.k);
    }

    private int a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71399a, false, 81503, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return ((int) (((1.0f * f2) * ((float) (this.f71401c - this.f71400b))) / ((float) getMeasuredWidth()))) + this.f71400b;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71399a, false, 81503, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71399a, false, 81496, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71399a, false, 81496, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        boolean onTouchEvent = this.r.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71399a, false, 81498, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71399a, false, 81498, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                this.g = a(Math.min(Math.max(a(this.f71402d), motionEvent.getX()), (float) getMeasuredWidth()));
                this.f71403e = Math.max(this.f71402d, this.g - ((int) TimeUnit.SECONDS.toMillis(3)));
                this.f71404f = this.f71403e;
                invalidate();
                if (this.s != null) {
                    this.s.a(this.f71403e, this.g);
                }
            }
            onTouchEvent |= z;
        }
        return onTouchEvent;
    }

    public void setWavForm(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f71399a, false, 81505, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f71399a, false, 81505, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        Context context = getContext();
        int color = ContextCompat.getColor(context, C0906R.color.ks);
        if (com.ss.android.g.a.b()) {
            this.k = a(bitmap, context.getResources().getColor(C0906R.color.ey));
            this.l = a(bitmap, color);
            this.m = a(bitmap, context.getResources().getColor(C0906R.color.ez));
        } else {
            this.k = a(bitmap, context.getResources().getColor(C0906R.color.ew));
            this.l = a(bitmap, ContextCompat.getColor(context, C0906R.color.a1s));
            this.m = a(bitmap, -1);
        }
        invalidate();
    }

    public VolumeTapsView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71399a, false, 81492, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71399a, false, 81492, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        this.n.a(size, size2);
        this.o.a(size, size2);
        this.p.a(size, size2);
    }

    private static Bitmap a(Bitmap bitmap, int i2) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i2)}, null, f71399a, true, 81504, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i2)}, null, f71399a, true, 81504, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class);
        }
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap2, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    private void a(Canvas canvas, boolean z) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f71399a, false, 81495, new Class[]{Canvas.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, Byte.valueOf(z)}, this, f71399a, false, 81495, new Class[]{Canvas.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.h;
        float a2 = a(this.f71402d);
        a(this.f71403e);
        float a3 = a(this.f71404f);
        float a4 = a(this.g);
        rectF.left = 0.0f;
        rectF.right = a2;
        rectF.top = 0.0f;
        float f2 = (float) measuredHeight;
        rectF.bottom = f2;
        canvas2.drawRect(rectF, this.j);
        float f3 = (float) measuredWidth;
        float f4 = ((((float) this.f71400b) * -1.0f) / ((float) (this.f71401c - this.f71400b))) * f3;
        float f5 = (((float) this.t) * 1.0f) / ((float) (this.f71401c - this.f71400b));
        this.i.top = 0.1f * f2;
        this.i.right = f5 * f3;
        this.i.bottom = 0.9f * f2;
        if (z) {
            rectF.left = 0.0f;
        } else {
            rectF.left = a3;
        }
        rectF.right = f3;
        canvas.save();
        canvas2.clipRect(rectF);
        if (z) {
            canvas2.translate(f4, 0.0f);
            canvas2.drawBitmap(this.m, null, this.i, null);
        } else {
            this.p.a(canvas2);
        }
        canvas.restore();
        rectF.top = 0.0f;
        rectF.bottom = f2;
        rectF.left = 0.0f;
        rectF.right = a2;
        canvas.save();
        canvas2.clipRect(rectF);
        if (z) {
            canvas2.translate(f4, 0.0f);
            canvas2.drawBitmap(this.k, null, this.i, null);
        } else {
            this.n.a(canvas2);
        }
        canvas.restore();
        rectF.left = a2;
        rectF.right = a3;
        canvas.save();
        canvas2.clipRect(rectF);
        if (z) {
            canvas2.translate(f4, 0.0f);
            canvas2.drawBitmap(this.l, null, this.i, null);
        } else {
            this.o.a(canvas2);
        }
        canvas.restore();
        canvas2.drawBitmap(this.q, a4 - ((float) (this.q.getWidth() / 2)), (float) ((measuredHeight / 2) - (this.q.getHeight() / 2)), null);
    }

    public com.ss.android.ugc.aweme.shortvideo.f a(Context context, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2)}, this, f71399a, false, 81510, new Class[]{Context.class, Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.f.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.f) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2)}, this, f71399a, false, 81510, new Class[]{Context.class, Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.f.class);
        }
        com.ss.android.ugc.aweme.shortvideo.f fVar = new com.ss.android.ugc.aweme.shortvideo.f();
        int b2 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().b(context2);
        float[] fArr = new float[b2];
        if (i2 > 0) {
            for (int i3 = 0; i3 < b2; i3++) {
                fArr[i3] = (float) Math.random();
            }
        }
        fVar.setMusicWavePointArray(fArr);
        return fVar;
    }

    public VolumeTapsView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        int i4;
        int i5;
        this.h = new RectF();
        this.i = new RectF();
        this.j = new Paint();
        if (PatchProxy.isSupport(new Object[]{context}, this, f71399a, false, 81491, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f71399a, false, 81491, new Class[]{Context.class}, Void.TYPE);
        } else {
            this.r = new GestureDetector(context, this);
            this.q = BitmapFactory.decodeResource(getResources(), 2130839260);
            setWavForm(BitmapFactory.decodeResource(getResources(), 2130837914));
            this.o = new c(context);
            this.n = new c(context);
            this.p = new c(context);
            c cVar = this.o;
            b bVar = b.f74589e;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f74585a, false, 86846, new Class[0], Integer.TYPE)) {
                i4 = ((Integer) PatchProxy.accessDispatch(new Object[0], bVar, b.f74585a, false, 86846, new Class[0], Integer.TYPE)).intValue();
            } else if (!com.ss.android.g.a.b()) {
                i4 = Color.parseColor("#E6FACE15");
            } else {
                i4 = Color.parseColor("#FF20E5DC");
            }
            cVar.a(i4);
            c cVar2 = this.p;
            b bVar2 = b.f74589e;
            if (PatchProxy.isSupport(new Object[0], bVar2, b.f74585a, false, 86845, new Class[0], Integer.TYPE)) {
                i5 = ((Integer) PatchProxy.accessDispatch(new Object[0], bVar2, b.f74585a, false, 86845, new Class[0], Integer.TYPE)).intValue();
            } else if (!com.ss.android.g.a.b() || bVar2.d()) {
                i5 = -1;
            } else {
                i5 = Color.parseColor("#52161823");
            }
            cVar2.a(i5);
            this.n.a(b.f74589e.c());
            this.u = b.f74589e.b();
            this.j.setColor(this.u);
        }
        int dip2Px = (int) UIUtils.dip2Px(context, 2.0f);
        b bVar3 = b.f74589e;
        if (PatchProxy.isSupport(new Object[0], bVar3, b.f74585a, false, 86842, new Class[0], Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], bVar3, b.f74585a, false, 86842, new Class[0], Integer.TYPE)).intValue();
        } else if (!com.ss.android.g.a.b() || bVar3.d()) {
            i3 = Color.parseColor("#22FFFFFF");
        } else {
            i3 = Color.parseColor("#0F161823");
        }
        setBackground(bc.a(0, i3, 0, dip2Px));
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f71399a, false, 81499, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f71399a, false, 81499, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.g = a(Math.min(Math.max(a(this.f71402d), motionEvent2.getX()), (float) getMeasuredWidth()));
        invalidate();
        if (this.s != null) {
            this.s.a(this.g);
        }
        return true;
    }
}
