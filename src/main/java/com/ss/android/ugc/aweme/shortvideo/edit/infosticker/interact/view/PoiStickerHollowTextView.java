package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiStickerHollowTextView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67302a;

    /* renamed from: b  reason: collision with root package name */
    private String f67303b;

    /* renamed from: c  reason: collision with root package name */
    private float f67304c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f67305d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f67306e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f67307f;
    private Paint g;
    private Paint h;
    private float i;
    private int j;
    private int k;
    private RectF l;
    private String m;
    private float n;
    private int o;
    private int p;
    private int q;

    public String getText() {
        return this.f67303b;
    }

    public int getTextViewWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, f67302a, false, 77093, new Class[0], Integer.TYPE)) {
            return ((int) this.f67305d.measureText(this.f67303b)) + ((int) this.g.measureText(this.m)) + this.p + getPaddingLeft() + getPaddingRight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67302a, false, 77093, new Class[0], Integer.TYPE)).intValue();
    }

    public void setMaxWidth(int i2) {
        this.o = i2;
    }

    public PoiStickerHollowTextView(Context context) {
        this(context, null);
    }

    public void setText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f67302a, false, 77095, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f67302a, false, 77095, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            this.f67303b = str2;
            requestLayout();
            invalidate();
        }
    }

    public void setTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67302a, false, 77096, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67302a, false, 77096, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f67304c = f2;
        this.f67305d.setTextSize(this.f67304c);
        this.f67306e.setTextSize(this.f67304c);
        this.g.setTextSize(this.f67304c * this.n);
        this.h.setTextSize(this.f67304c * this.n);
        requestLayout();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f67302a, false, 77094, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f67302a, false, 77094, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.l.set(0.0f, 0.0f, (float) this.j, (float) this.k);
        String a2 = a(this.f67303b, this.o);
        if (Build.VERSION.SDK_INT >= 21) {
            i2 = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null);
        } else {
            i2 = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
        }
        this.f67305d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        canvas.drawRoundRect(this.l, this.i, this.i, this.f67307f);
        this.f67305d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint.FontMetrics fontMetrics = this.f67305d.getFontMetrics();
        int measuredHeight = (int) ((((((float) getMeasuredHeight()) - fontMetrics.bottom) + fontMetrics.top) / 2.0f) - fontMetrics.top);
        Paint.FontMetrics fontMetrics2 = this.g.getFontMetrics();
        float measuredHeight2 = (float) ((int) ((((((float) getMeasuredHeight()) - fontMetrics2.bottom) + fontMetrics2.top) / 2.0f) - fontMetrics2.top));
        canvas.drawText(this.m, (float) getPaddingLeft(), measuredHeight2, this.g);
        canvas.drawText(this.m, (float) getPaddingLeft(), measuredHeight2, this.h);
        float measureText = this.g.measureText(this.m);
        float f2 = (float) measuredHeight;
        canvas.drawText(a2, ((float) getPaddingLeft()) + measureText + ((float) this.p), f2, this.f67305d);
        canvas.drawText(a2, ((float) getPaddingLeft()) + measureText + ((float) this.p), f2, this.f67306e);
        canvas.restoreToCount(i2);
    }

    public PoiStickerHollowTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private String a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f67302a, false, 77097, new Class[]{String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f67302a, false, 77097, new Class[]{String.class, Integer.TYPE}, String.class);
        }
        int measureText = (int) this.f67305d.measureText("...");
        int measureText2 = (int) ((((((float) i2) - this.g.measureText(this.m)) - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - ((float) this.p));
        if (((int) this.f67305d.measureText(str)) <= measureText2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb.append(str.charAt(i3));
            if (((float) measureText2) - this.f67305d.measureText(sb.toString()) < ((float) measureText)) {
                return str.substring(0, i3) + "...";
            }
        }
        return str;
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67302a, false, 77092, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67302a, false, 77092, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        String a2 = a(this.f67303b, this.o);
        Rect rect = new Rect();
        this.f67305d.getTextBounds(a2, 0, a2.length(), rect);
        this.j = rect.width() + ((int) this.g.measureText(this.m)) + this.p + getPaddingLeft() + getPaddingRight();
        this.k = rect.height() + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(this.j, this.k);
    }

    public PoiStickerHollowTextView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f67304c = 15.0f;
        this.n = 0.7f;
        if (PatchProxy.isSupport(new Object[]{context}, this, f67302a, false, 77091, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f67302a, false, 77091, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f67304c = (float) ((int) UIUtils.dip2Px(context, 28.0f));
        this.i = UIUtils.dip2Px(context, 5.0f);
        this.p = (int) UIUtils.dip2Px(context, 10.0f);
        this.q = (int) UIUtils.dip2Px(context, 6.0f);
        this.f67305d = new Paint();
        this.f67305d.setTextSize(this.f67304c);
        this.f67305d.setAntiAlias(true);
        this.f67305d.setFakeBoldText(true);
        this.f67305d.setColor(-16777216);
        this.f67306e = new Paint(this.f67305d);
        this.f67306e.setColor(1073741824);
        this.f67307f = new Paint(this.f67305d);
        this.f67307f.setColor(-1);
        this.g = new Paint(this.f67305d);
        this.g.setTextSize(this.f67304c * this.n);
        this.h = new Paint(this.f67306e);
        this.h.setTextSize(this.f67304c * this.n);
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "poi_sticker_iconfont.ttf");
            this.g.setTypeface(createFromAsset);
            this.h.setTypeface(createFromAsset);
        } catch (Exception unused) {
        }
        this.l = new RectF();
        this.m = context.getResources().getString(C0906R.string.bpo);
    }
}
