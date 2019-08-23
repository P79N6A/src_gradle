package com.bytedance.android.livesdk.gift;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DoodleCanvasView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14674a;

    /* renamed from: b  reason: collision with root package name */
    public List<p> f14675b;

    /* renamed from: c  reason: collision with root package name */
    public long f14676c;

    /* renamed from: d  reason: collision with root package name */
    public int f14677d;

    /* renamed from: e  reason: collision with root package name */
    public ImageModel f14678e;

    /* renamed from: f  reason: collision with root package name */
    public int f14679f;
    public DoodleGiftView g;
    public Stack<Integer> h;
    public int i;
    public boolean j;
    public a k;
    private int l;
    private Paint m;
    private LongSparseArray<Bitmap> n;
    private int o;
    private Runnable p;

    public interface a {
        void a(List<p> list, int i, int i2, int i3);
    }

    public List<p> getMoveActions() {
        return this.f14675b;
    }

    public int getTotalCostDiamondCount() {
        return this.f14679f;
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f14674a, false, 9219, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14674a, false, 9219, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!Lists.isEmpty(this.h)) {
            z = true;
        }
        return z;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f14674a, false, 9220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14674a, false, 9220, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.n != null) {
            this.n.clear();
        }
        removeCallbacks(this.p);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14674a, false, 9217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14674a, false, 9217, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14675b != null && this.f14675b.size() > 0) {
            this.f14675b.clear();
            this.f14679f = 0;
            if (this.g != null) {
                DoodleGiftView doodleGiftView = this.g;
                if (PatchProxy.isSupport(new Object[0], doodleGiftView, DoodleGiftView.f14797a, false, 9424, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], doodleGiftView, DoodleGiftView.f14797a, false, 9424, new Class[0], Void.TYPE);
                } else if (doodleGiftView.f14799c == DoodleGiftView.a.draw && !doodleGiftView.f14798b.isEmpty()) {
                    doodleGiftView.f14798b.clear();
                    doodleGiftView.invalidate();
                }
            }
        }
    }

    public void setDoodleCanvasListener(a aVar) {
        this.k = aVar;
    }

    public DoodleCanvasView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f14674a, false, 9213, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f14674a, false, 9213, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas2.drawColor(Color.parseColor("#51000000"));
    }

    public void setDrawDoodleGiftView(DoodleGiftView doodleGiftView) {
        if (PatchProxy.isSupport(new Object[]{doodleGiftView}, this, f14674a, false, 9222, new Class[]{DoodleGiftView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{doodleGiftView}, this, f14674a, false, 9222, new Class[]{DoodleGiftView.class}, Void.TYPE);
            return;
        }
        this.g = doodleGiftView;
        if (this.g != null) {
            this.g.a(DoodleGiftView.a.draw);
        }
    }

    private void a(p pVar) {
        if (PatchProxy.isSupport(new Object[]{pVar}, this, f14674a, false, 9216, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar}, this, f14674a, false, 9216, new Class[]{p.class}, Void.TYPE);
        } else if (this.g != null) {
            if (this.f14675b.size() < this.l) {
                this.f14675b.add(pVar);
                this.f14679f += this.f14677d;
                String b2 = ((e) b.a(e.class)).b(this.f14678e);
                if (!TextUtils.isEmpty(b2)) {
                    this.g.a(pVar.f15143a, pVar.f15144b, b2);
                }
            } else if (!this.j) {
                ai.a((int) C0906R.string.dfe);
                postDelayed(this.p, 3000);
                this.j = true;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f14674a, false, 9214, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f14674a, false, 9214, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                p pVar = new p((int) motionEvent.getX(), (int) motionEvent.getY(), this.f14676c, this.f14677d);
                a(pVar);
                if (this.k != null) {
                    this.k.a(this.f14675b, getWidth(), getHeight(), this.f14679f);
                }
                com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.gift.b.a(this.f14675b.size(), this.f14679f));
                break;
            case 1:
                if (PatchProxy.isSupport(new Object[0], this, f14674a, false, 9221, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14674a, false, 9221, new Class[0], Void.TYPE);
                } else if (this.i < this.f14675b.size()) {
                    this.h.push(Integer.valueOf(this.f14675b.size() - this.i));
                    this.i = this.f14675b.size();
                }
                if (this.k != null) {
                    this.k.a(this.f14675b, getWidth(), getHeight(), this.f14679f);
                }
                com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.gift.b.a(this.f14675b.size(), this.f14679f));
                break;
            case 2:
                if (this.f14675b.size() > 0) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int i5 = this.f14675b.get(this.f14675b.size() - 1).f15143a;
                    int i6 = this.f14675b.get(this.f14675b.size() - 1).f15144b;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(x), Integer.valueOf(y)}, this, f14674a, false, 9215, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(x), Integer.valueOf(y)}, this, f14674a, false, 9215, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                    } else {
                        i2 = (int) Math.pow(Math.pow((double) (x - i5), 2.0d) + Math.pow((double) (y - i6), 2.0d), 0.5d);
                    }
                    if (i2 > this.o) {
                        int round = Math.round(((float) i2) / ((float) this.o));
                        int i7 = y - i6;
                        double abs = (double) Math.abs(i7);
                        int i8 = x - i5;
                        double abs2 = (double) Math.abs(i8);
                        Double.isNaN(abs);
                        Double.isNaN(abs2);
                        double atan = Math.atan(abs / abs2);
                        double d2 = (double) this.o;
                        double cos = Math.cos(atan);
                        Double.isNaN(d2);
                        int i9 = (int) (d2 * cos);
                        double d3 = (double) this.o;
                        double sin = Math.sin(atan);
                        Double.isNaN(d3);
                        int i10 = (int) (d3 * sin);
                        for (int i11 = 1; i11 <= round; i11++) {
                            if (i8 > 0) {
                                i3 = (i9 * i11) + i5;
                            } else {
                                i3 = i5 - (i9 * i11);
                            }
                            int i12 = i3;
                            if (i7 > 0) {
                                i4 = (i10 * i11) + i6;
                            } else {
                                i4 = i6 - (i10 * i11);
                            }
                            int i13 = i4;
                            p pVar2 = new p(i12, i13, this.f14676c, this.f14677d);
                            a(pVar2);
                        }
                        if (this.k != null) {
                            this.k.a(this.f14675b, getWidth(), getHeight(), this.f14679f);
                        }
                        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.gift.b.a(this.f14675b.size(), this.f14679f));
                        break;
                    }
                } else {
                    p pVar3 = new p((int) motionEvent.getX(), (int) motionEvent.getY(), this.f14676c, this.f14677d);
                    a(pVar3);
                    if (this.k != null) {
                        this.k.a(this.f14675b, getWidth(), getHeight(), this.f14679f);
                    }
                    com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.gift.b.a(this.f14675b.size(), this.f14679f));
                    return true;
                }
                break;
        }
        return true;
    }

    public DoodleCanvasView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DoodleCanvasView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new Stack<>();
        this.i = 0;
        this.j = false;
        this.p = new Runnable() {
            public final void run() {
                DoodleCanvasView.this.j = false;
            }
        };
        if (PatchProxy.isSupport(new Object[0], this, f14674a, false, 9212, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14674a, false, 9212, new Class[0], Void.TYPE);
            return;
        }
        this.m = new Paint();
        this.m.setAntiAlias(true);
        this.m.setStyle(Paint.Style.FILL);
        this.f14675b = new ArrayList();
        this.n = new LongSparseArray<>();
        this.o = (int) UIUtils.dip2Px(getContext(), 40.0f);
        this.l = ((Integer) com.bytedance.android.livesdk.config.a.F.a()).intValue();
    }
}
