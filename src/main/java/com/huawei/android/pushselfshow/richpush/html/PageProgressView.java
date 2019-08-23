package com.huawei.android.pushselfshow.richpush.html;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.huawei.android.pushselfshow.utils.c;

public class PageProgressView extends ImageView implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private int f25263a;

    /* renamed from: b  reason: collision with root package name */
    private int f25264b;

    /* renamed from: c  reason: collision with root package name */
    private int f25265c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f25266d;

    /* renamed from: e  reason: collision with root package name */
    private c f25267e;

    public PageProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PageProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        this.f25266d = new Rect(0, 0, 0, 0);
        this.f25263a = 0;
        this.f25264b = 0;
        this.f25267e = new c(this);
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        this.f25263a = this.f25264b;
        this.f25264b = i;
        this.f25265c = (this.f25264b - this.f25263a) / 10;
        this.f25267e.removeMessages(42);
        this.f25267e.sendEmptyMessage(42);
    }

    public void handleMessage(Message message) {
        if (message.what == 42) {
            this.f25263a = Math.min(this.f25264b, this.f25263a + this.f25265c);
            this.f25266d.right = (getWidth() * this.f25263a) / 10000;
            invalidate();
            if (this.f25263a < this.f25264b) {
                this.f25267e.sendMessageDelayed(this.f25267e.obtainMessage(42), 40);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        drawable.setBounds(this.f25266d);
        drawable.draw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f25266d.left = 0;
        this.f25266d.right = ((i3 - i) * this.f25263a) / 10000;
        this.f25266d.top = 0;
        this.f25266d.bottom = i4 - i2;
    }
}
