package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PKProgressBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18310a;

    /* renamed from: b  reason: collision with root package name */
    public float f18311b;

    /* renamed from: c  reason: collision with root package name */
    float f18312c;

    /* renamed from: d  reason: collision with root package name */
    float f18313d;

    /* renamed from: e  reason: collision with root package name */
    public int f18314e;

    /* renamed from: f  reason: collision with root package name */
    public int f18315f;
    private boolean g;
    private int h;
    private int i;
    private float j;
    private final Paint k;
    private int l;
    private int m;
    private float n;
    private float o;
    private RectF p;
    private RectF q;
    private ValueAnimator r;
    private ValueAnimator s;
    private ValueAnimator t;

    public int getLeftValue() {
        return this.f18314e;
    }

    public int getRightValue() {
        return this.f18315f;
    }

    private Path getClipPath() {
        if (PatchProxy.isSupport(new Object[0], this, f18310a, false, 14606, new Class[0], Path.class)) {
            return (Path) PatchProxy.accessDispatch(new Object[0], this, f18310a, false, 14606, new Class[0], Path.class);
        }
        float leftPaddingOffset = (float) getLeftPaddingOffset();
        float topPaddingOffset = (float) getTopPaddingOffset();
        float width = (((float) getWidth()) - leftPaddingOffset) - ((float) getRightPaddingOffset());
        float height = (((float) getHeight()) - topPaddingOffset) - ((float) getBottomPaddingOffset());
        Path path = new Path();
        float f2 = height / 2.0f;
        float f3 = f2 + leftPaddingOffset;
        path.moveTo(f3, topPaddingOffset);
        float f4 = width + leftPaddingOffset;
        path.lineTo(f4 - f2, topPaddingOffset);
        float f5 = height + topPaddingOffset;
        path.arcTo(new RectF(f4 - height, topPaddingOffset, f4, f5), -90.0f, 180.0f);
        path.lineTo(f3, f5);
        path.arcTo(new RectF(leftPaddingOffset, topPaddingOffset, height + leftPaddingOffset, f5), 90.0f, 180.0f);
        path.close();
        return path;
    }

    public void setIsVigo(boolean z) {
        this.g = z;
    }

    public PKProgressBar(Context context) {
        this(context, null);
    }

    private void setProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18310a, false, 14610, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18310a, false, 14610, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float f3 = this.f18311b;
        if (this.r != null && this.r.isRunning()) {
            this.r.cancel();
        }
        this.r = ValueAnimator.ofFloat(new float[]{f3, f2});
        this.r.setDuration(300);
        this.r.addUpdateListener(new t(this));
        this.r.start();
    }

    public void setLeftValue(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18310a, false, 14608, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18310a, false, 14608, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f18314e = i2;
        if (this.f18315f + this.f18314e == 0) {
            setProgress(0.5f);
        } else {
            setProgress(((float) this.f18314e) / ((float) (this.f18314e + this.f18315f)));
        }
        if (this.s == null || !this.s.isRunning()) {
            this.s = ValueAnimator.ofFloat(new float[]{this.f18312c, this.j});
            this.s.setDuration(300);
            this.s.setRepeatCount(1);
            this.s.setRepeatMode(2);
            this.s.addUpdateListener(new r(this));
            this.s.start();
        }
    }

    public void setRightValue(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18310a, false, 14609, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18310a, false, 14609, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f18315f = i2;
        if (this.f18315f + this.f18314e == 0) {
            setProgress(0.5f);
        } else {
            setProgress(((float) this.f18314e) / ((float) (this.f18314e + this.f18315f)));
        }
        if (this.t == null || !this.t.isRunning()) {
            this.t = ValueAnimator.ofFloat(new float[]{this.f18313d, this.j});
            this.t.setDuration(300);
            this.t.setRepeatCount(1);
            this.t.setRepeatMode(2);
            this.t.addUpdateListener(new s(this));
            this.t.start();
        }
    }

    public void onDraw(Canvas canvas) {
        String str;
        String str2;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f18310a, false, 14607, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f18310a, false, 14607, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        this.p.right = this.f18311b * ((float) getWidth());
        this.p.bottom = (float) getHeight();
        this.q.left = this.f18311b * ((float) getWidth());
        this.q.bottom = (float) getHeight();
        this.q.right = (float) getWidth();
        if (this.g) {
            str2 = String.valueOf(this.f18314e);
            str = String.valueOf(this.f18315f);
        } else {
            str2 = getContext().getString(C0906R.string.dhf) + this.f18314e;
            str = this.f18315f + getContext().getString(C0906R.string.dhg);
        }
        canvas2.clipPath(getClipPath());
        if (a.d() || a.g()) {
            this.k.setColor(this.h);
            canvas2.drawRect(this.p, this.k);
            this.k.setColor(this.i);
            canvas2.drawRect(this.q, this.k);
        } else {
            LinearGradient linearGradient = new LinearGradient(this.p.left, this.p.top, this.p.right, (float) getHeight(), Color.parseColor("#fe155d"), Color.parseColor("#fe499b"), Shader.TileMode.MIRROR);
            this.k.setShader(linearGradient);
            canvas2.drawRect(this.p, this.k);
            LinearGradient linearGradient2 = new LinearGradient(this.q.left, this.q.top, this.q.right, (float) getHeight(), Color.parseColor("#2bffff"), Color.parseColor("#274ae8"), Shader.TileMode.MIRROR);
            this.k.setShader(linearGradient2);
            canvas2.drawRect(this.q, this.k);
            this.k.setShader(null);
        }
        this.k.setShader(null);
        this.k.setTextSize(this.f18312c);
        this.k.setColor(this.l);
        canvas2.drawText(str2, this.n, (float) ((int) (((float) (getHeight() / 2)) - ((this.k.ascent() + this.k.descent()) / 2.0f))), this.k);
        this.k.setTextSize(this.f18313d);
        this.k.setColor(this.m);
        canvas2.drawText(str, (((float) getWidth()) - this.o) - this.k.measureText(str), (float) ((int) (((float) (getHeight() / 2)) - ((this.k.ascent() + this.k.descent()) / 2.0f))), this.k);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0906R.attr.a1x);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = Color.parseColor("#ff3333");
        this.n = (float) ac.a(14.0f);
        this.f18312c = (float) ac.a(10.0f);
        this.i = Color.parseColor("#ffa033");
        this.o = (float) ac.a(14.0f);
        this.f18313d = (float) ac.a(10.0f);
        this.m = -1;
        this.l = -1;
        this.j = (float) ac.a(14.0f);
        this.f18315f = 0;
        this.f18314e = 0;
        this.f18311b = 0.5f;
        this.k = new Paint();
        this.k.setTypeface(Typeface.DEFAULT_BOLD);
        this.k.setStyle(Paint.Style.FILL);
        this.k.setDither(true);
        this.k.setAntiAlias(true);
        this.p = new RectF(0.0f, 0.0f, this.f18311b * ((float) getWidth()), (float) getHeight());
        this.q = new RectF(this.f18311b * ((float) getWidth()), 0.0f, (float) getWidth(), (float) getHeight());
    }
}
