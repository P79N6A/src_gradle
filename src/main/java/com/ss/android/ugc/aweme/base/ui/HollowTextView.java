package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.R$styleable;

public class HollowTextView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34941a;

    /* renamed from: b  reason: collision with root package name */
    private String f34942b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffXfermode f34943c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffXfermode f34944d;

    /* renamed from: e  reason: collision with root package name */
    private RectF f34945e;

    /* renamed from: f  reason: collision with root package name */
    private int f34946f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private Paint m;
    private int n;
    private int o;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f34947a;

        /* renamed from: b  reason: collision with root package name */
        public int f34948b;

        /* renamed from: c  reason: collision with root package name */
        public int f34949c;

        /* renamed from: d  reason: collision with root package name */
        public int f34950d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f34951e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f34952f;
        public boolean g;
        public boolean h;
    }

    public String getText() {
        return this.f34942b;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34941a, false, 25041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34941a, false, 25041, new Class[0], Void.TYPE);
            return;
        }
        this.m = new Paint();
        this.m.setTextSize((float) this.f34946f);
        this.m.setAntiAlias(true);
        this.m.setFakeBoldText(true);
        this.m.setColor(this.g);
        this.m.setAntiAlias(true);
    }

    public HollowTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34941a, false, 25045, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34941a, false, 25045, new Class[]{String.class}, Void.TYPE);
        } else if (str != null && !str.equals(this.f34942b)) {
            this.f34942b = str;
            requestLayout();
            invalidate();
            setContentDescription(str);
        }
    }

    public void onDraw(Canvas canvas) {
        int saveLayer;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f34941a, false, 25044, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f34941a, false, 25044, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.f34942b)) {
            if (Build.VERSION.SDK_INT >= 21) {
                saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null);
            } else {
                saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            }
            int i2 = saveLayer;
            if (this.f34944d == null) {
                this.f34944d = new PorterDuffXfermode(PorterDuff.Mode.SRC);
            }
            this.m.setXfermode(this.f34944d);
            if (this.h > 0) {
                if (this.f34945e == null) {
                    this.f34945e = new RectF();
                }
                this.f34945e.left = 0.0f;
                this.f34945e.top = 0.0f;
                this.f34945e.right = (float) this.n;
                this.f34945e.bottom = (float) this.o;
                canvas.drawRoundRect(this.f34945e, (float) this.h, (float) this.h, this.m);
                if (!this.i) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.h, (float) this.h, this.m);
                }
                if (!this.j) {
                    canvas.drawRect((float) (this.n - this.h), 0.0f, (float) this.n, (float) this.h, this.m);
                }
                if (!this.k) {
                    canvas.drawRect(0.0f, (float) (this.o - this.h), (float) this.h, (float) this.o, this.m);
                }
                if (!this.l) {
                    canvas.drawRect((float) (this.n - this.h), (float) (this.o - this.h), (float) this.n, (float) this.o, this.m);
                }
            } else {
                canvas.drawRect(0.0f, 0.0f, (float) this.n, (float) this.o, this.m);
            }
            if (this.f34943c == null) {
                this.f34943c = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            this.m.setXfermode(this.f34943c);
            Paint.FontMetrics fontMetrics = this.m.getFontMetrics();
            canvas.drawText(this.f34942b, (float) getPaddingLeft(), (float) ((((int) (((float) this.o) - fontMetrics.ascent)) >> 1) - 2), this.m);
            canvas.restoreToCount(i2);
        }
    }

    public HollowTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HollowTextView(Context context, a aVar) {
        super(context);
        this.f34946f = 15;
        this.g = -1711276033;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f34941a, false, 25040, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f34941a, false, 25040, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f34942b = aVar.f34947a;
        this.f34946f = aVar.f34948b;
        this.g = aVar.f34949c;
        this.h = aVar.f34950d;
        this.i = aVar.f34951e;
        this.j = aVar.f34952f;
        this.k = aVar.g;
        this.l = aVar.h;
        a();
    }

    private int a(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34941a, false, 25043, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34941a, false, 25043, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(i2, size);
        } else if (mode == 0 || mode != 1073741824) {
            i4 = i2;
        } else {
            i4 = size;
        }
        return i4;
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34941a, false, 25042, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34941a, false, 25042, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n = ((int) this.m.measureText(this.f34942b)) + getPaddingLeft() + getPaddingRight();
        this.o = this.f34946f + getPaddingTop() + getPaddingBottom();
        this.n = a(this.n, i2);
        this.o = a(this.o, i3);
        setMeasuredDimension(this.n, this.o);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HollowTextView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.f34946f = 15;
        this.g = -1711276033;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f34941a, false, 25039, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f34941a, false, 25039, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HollowTextView);
        this.f34946f = (int) obtainStyledAttributes.getDimension(0, UIUtils.dip2Px(context, 15.0f));
        this.f34942b = obtainStyledAttributes.getString(1);
        this.g = obtainStyledAttributes.getColor(3, 0);
        this.h = (int) obtainStyledAttributes.getDimension(2, 0.0f);
        this.i = obtainStyledAttributes.getBoolean(6, false);
        this.j = obtainStyledAttributes.getBoolean(7, false);
        this.k = obtainStyledAttributes.getBoolean(4, false);
        this.l = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        a();
    }
}
