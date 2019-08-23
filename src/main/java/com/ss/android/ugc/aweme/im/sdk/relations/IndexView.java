package com.ss.android.ugc.aweme.im.sdk.relations;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class IndexView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51981a;

    /* renamed from: b  reason: collision with root package name */
    private int f51982b = -1;

    /* renamed from: c  reason: collision with root package name */
    private a f51983c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f51984d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<Integer> f51985e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private Context f51986f;
    private Resources g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private TextView m;
    private Paint n;
    private Paint o;
    private int p;
    private int q;
    private float r;
    private Bitmap s;
    private Bitmap t;
    private Bitmap u;
    private Bitmap v;
    private Bitmap w;
    private Rect x;
    private Rect y;
    private int z = 0;

    public interface a {
        void a(String str, int i);
    }

    private int getSuggestedMinWidth() {
        if (PatchProxy.isSupport(new Object[0], this, f51981a, false, 52660, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51981a, false, 52660, new Class[0], Integer.TYPE)).intValue();
        }
        String str = "";
        for (String next : this.f51984d) {
            if (str.length() < next.length()) {
                str = next;
            }
        }
        double measureText = (double) this.o.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51981a, false, 52651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51981a, false, 52651, new Class[0], Void.TYPE);
            return;
        }
        this.g = this.f51986f.getResources();
        this.o = new Paint(1);
        this.o.setTextSize(UIUtils.dip2Px(this.f51986f, 11.0f));
        this.o.setTextAlign(Paint.Align.CENTER);
        this.o.setColor(this.g.getColor(C0906R.color.qs));
        this.n = new Paint(1);
        this.n.setTextSize(UIUtils.dip2Px(this.f51986f, 11.0f));
        this.n.setTextAlign(Paint.Align.CENTER);
        this.n.setColor(this.g.getColor(C0906R.color.anq));
        this.w = ((BitmapDrawable) com.ss.android.ugc.bytex.a.a.a.a(this.g, 2130840103)).getBitmap();
        this.s = ((BitmapDrawable) com.ss.android.ugc.bytex.a.a.a.a(this.g, 2130840102)).getBitmap();
        this.t = ((BitmapDrawable) com.ss.android.ugc.bytex.a.a.a.a(this.g, 2130840101)).getBitmap();
        this.u = ((BitmapDrawable) com.ss.android.ugc.bytex.a.a.a.a(this.g, 2130840111)).getBitmap();
        this.v = ((BitmapDrawable) com.ss.android.ugc.bytex.a.a.a.a(this.g, 2130840110)).getBitmap();
        this.r = UIUtils.dip2Px(this.f51986f, 2.0f);
        this.p = (int) UIUtils.dip2Px(this.f51986f, 16.0f);
        this.q = (int) (UIUtils.dip2Px(this.f51986f, 16.0f) + this.r);
        this.x = new Rect(0, 0, this.p, this.p);
        this.y = new Rect();
    }

    public void setIndexLetterTv(TextView textView) {
        this.m = textView;
    }

    public void setOnLetterTouchListener(a aVar) {
        this.f51983c = aVar;
    }

    public IndexView(Context context) {
        super(context);
        this.f51986f = context;
        a();
    }

    public void setIndexLetters(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51981a, false, 52652, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51981a, false, 52652, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f51984d.clear();
        this.f51984d.addAll(list);
        requestLayout();
    }

    public final int a(int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51981a, false, 52654, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51981a, false, 52654, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int i4 = 0;
        while (i3 < this.f51985e.size() && i3 < i2) {
            i4 += this.f51985e.get(i3).intValue();
            i3++;
        }
        return i4;
    }

    public void setCurrentIndex(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51981a, false, 52656, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51981a, false, 52656, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f51982b = i2;
        invalidate();
    }

    public void setRecycleViewPos(int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51981a, false, 52655, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51981a, false, 52655, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i4 = 0;
        while (true) {
            if (i3 >= this.f51985e.size()) {
                break;
            }
            i4 += this.f51985e.get(i3).intValue();
            if (i2 >= i4) {
                i3++;
            } else if (this.f51982b != i3) {
                this.f51982b = i3;
                invalidate();
                return;
            }
        }
    }

    public void setCurrentIndex(String str) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f51981a, false, 52663, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f51981a, false, 52663, new Class[]{String.class}, Void.TYPE);
            return;
        }
        while (true) {
            if (i2 >= this.f51984d.size()) {
                break;
            } else if (TextUtils.equals(str, this.f51984d.get(i2))) {
                this.f51982b = i2;
                break;
            } else {
                i2++;
            }
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f51981a, false, 52662, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f51981a, false, 52662, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.f51984d != null && this.f51984d.size() != 0) {
            this.k = this.i;
            this.z = 0;
            for (int i2 = 0; i2 < this.f51984d.size(); i2++) {
                if (this.f51984d.get(i2).equals("recent")) {
                    this.z++;
                    this.x.set(0, 0, this.p, this.p);
                    if (this.f51982b == i2) {
                        canvas.drawBitmap(this.t, null, this.x, this.o);
                    } else {
                        canvas.drawBitmap(this.s, null, this.x, this.o);
                    }
                } else if (this.f51984d.get(i2).equals("Friend")) {
                    this.z++;
                    this.x.set(0, this.q * i2, this.p, (this.q * i2) + this.p);
                    if (this.f51982b == i2) {
                        canvas.drawBitmap(this.v, null, this.x, this.o);
                    } else {
                        canvas.drawBitmap(this.u, null, this.x, this.o);
                    }
                } else {
                    this.l = (this.j - (this.q * this.z)) / (this.f51984d.size() - this.z);
                    this.o.getTextBounds(this.f51984d.get(i2), 0, this.f51984d.get(i2).length(), this.y);
                    float f2 = ((float) this.k) / 2.0f;
                    float height = ((float) ((this.q * this.z) + (this.l * ((i2 + 1) - this.z)))) - (((float) this.y.height()) / 2.0f);
                    if (this.f51982b == i2) {
                        canvas.drawText(this.f51984d.get(i2), f2, height, this.o);
                    } else {
                        canvas.drawText(this.f51984d.get(i2), f2, height, this.n);
                    }
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f51981a, false, 52664, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f51981a, false, 52664, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
            case 2:
                float y2 = motionEvent.getY();
                if (y2 <= ((float) (this.j + this.l))) {
                    this.f51982b = (int) (y2 / ((float) this.q));
                    if (this.f51982b >= this.z) {
                        this.f51982b = ((int) ((y2 - ((float) (this.q * this.z))) / ((float) this.l))) + this.z;
                    }
                    if (this.f51982b != this.h && this.f51983c != null && this.f51982b >= 0 && this.f51982b < this.f51984d.size()) {
                        String str = this.f51984d.get(this.f51982b);
                        if (str.equals("recent") || str.equals("Friend")) {
                            this.m.setVisibility(8);
                        } else {
                            this.m.setText(str);
                            this.m.setVisibility(0);
                        }
                        this.f51983c.a(str, this.f51982b);
                    }
                    this.m.setTranslationY((float) ((int) (((((y2 + ((float) this.m.getTop())) + (((float) this.m.getHeight()) / 2.0f)) - ((float) getTop())) - ((float) this.j)) + (((float) this.l) / 2.0f))));
                    this.h = this.f51982b;
                    break;
                } else {
                    this.m.setVisibility(8);
                    this.h = -1;
                    return true;
                }
                break;
            case 1:
                this.m.setVisibility(8);
                this.h = -1;
                break;
        }
        invalidate();
        return true;
    }

    public IndexView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51986f = context;
        a();
    }

    public final void a(List<String> list, List<Integer> list2) {
        if (PatchProxy.isSupport(new Object[]{list, list2}, this, f51981a, false, 52653, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, list2}, this, f51981a, false, 52653, new Class[]{List.class, List.class}, Void.TYPE);
            return;
        }
        this.f51984d.clear();
        this.f51984d.addAll(list);
        this.f51985e.clear();
        this.f51985e.addAll(list2);
        requestLayout();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51981a, false, 52658, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51981a, false, 52658, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51981a, false, 52659, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i4 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51981a, false, 52659, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                i4 = size;
            } else {
                int suggestedMinWidth = getSuggestedMinWidth();
                if (mode == Integer.MIN_VALUE) {
                    i4 = Math.min(suggestedMinWidth, size);
                } else {
                    i4 = suggestedMinWidth;
                }
            }
            this.i = i4;
        }
        int i6 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f51981a, false, 52661, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i5 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f51981a, false, 52661, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                i5 = size2;
            } else {
                Paint.FontMetrics fontMetrics = this.o.getFontMetrics();
                int size3 = (int) (((float) this.f51984d.size()) * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
                if (mode2 == Integer.MIN_VALUE) {
                    i5 = Math.min(size3, size2);
                } else {
                    i5 = size3;
                }
            }
            this.j = i5;
        }
        setMeasuredDimension(i6, i5);
    }

    public IndexView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f51986f = context;
        a();
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f51981a, false, 52657, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f51981a, false, 52657, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
