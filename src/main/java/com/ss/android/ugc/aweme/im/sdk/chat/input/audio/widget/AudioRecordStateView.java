package com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.R$styleable;

public class AudioRecordStateView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50426a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f50427b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f50428c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f50429d;

    /* renamed from: e  reason: collision with root package name */
    int f50430e;

    /* renamed from: f  reason: collision with root package name */
    public int f50431f;
    public int g;
    public int h;
    int i;
    int j;
    long k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    @SuppressLint({"HandlerLeak"})
    private Handler s = new Handler() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50432a;

        public final void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f50432a, false, 50761, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f50432a, false, 50761, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (1 == message2.what) {
                AudioRecordStateView.this.setVisibility(4);
            }
        }
    };

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50426a, false, 50752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50426a, false, 50752, new Class[0], Void.TYPE);
            return;
        }
        this.s.removeMessages(1);
        setVisibility(0);
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50426a, false, 50753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50426a, false, 50753, new Class[0], Void.TYPE);
            return;
        }
        this.s.removeMessages(1);
        this.s.sendEmptyMessageDelayed(1, 1500);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50426a, false, 50751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50426a, false, 50751, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != -1) {
            this.f50427b.setText(this.l);
        } else {
            this.f50427b.setText("");
        }
        this.f50428c.setVisibility(4);
        if (this.q != -1) {
            this.f50429d.setImageResource(this.q);
            this.f50429d.setVisibility(0);
        } else {
            this.f50429d.setVisibility(4);
        }
        this.f50428c.setTextColor(getResources().getColor(this.r));
        this.f50427b.setTextColor(getResources().getColor(this.r));
        this.j = 0;
        this.k = 0;
        setVisibility(4);
    }

    public void setVolumeLevel(int i2) {
        this.j = i2;
    }

    public AudioRecordStateView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f50426a, false, 50756, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f50426a, false, 50756, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        c();
        setVolumeLevel(i2);
        switch (Math.min(i2, 5)) {
            case 2:
                this.f50429d.setImageResource(this.p);
                break;
            case 3:
                this.f50429d.setImageResource(this.o);
                break;
            case 4:
                this.f50429d.setImageResource(this.n);
                break;
            case 5:
                this.f50429d.setImageResource(this.m);
                break;
            default:
                this.f50429d.setImageResource(this.q);
                break;
        }
        a();
    }

    public void setSecondsRemain(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f50426a, false, 50754, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f50426a, false, 50754, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.k = j2;
        double d2 = (double) j2;
        Double.isNaN(d2);
        this.f50428c.setText(String.valueOf((int) Math.ceil(d2 / 1000.0d)));
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f50426a, false, 50757, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f50426a, false, 50757, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        setSecondsRemain(j2);
        this.f50428c.setVisibility(0);
        this.f50429d.setVisibility(4);
        a();
    }

    public AudioRecordStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f50426a, false, 50750, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f50426a, false, 50750, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        inflate(context, C0906R.layout.adn, this);
        this.f50427b = (TextView) findViewById(C0906R.id.djl);
        this.f50428c = (TextView) findViewById(C0906R.id.ddl);
        this.f50429d = (ImageView) findViewById(C0906R.id.b5c);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioRecordStateView);
            this.l = obtainStyledAttributes.getResourceId(2, -1);
            this.f50430e = obtainStyledAttributes.getResourceId(1, this.l);
            this.f50431f = obtainStyledAttributes.getResourceId(6, -1);
            this.g = obtainStyledAttributes.getResourceId(5, -1);
            this.h = obtainStyledAttributes.getResourceId(3, -1);
            this.i = obtainStyledAttributes.getResourceId(0, -1);
            this.m = obtainStyledAttributes.getResourceId(11, -1);
            this.n = obtainStyledAttributes.getResourceId(10, this.m);
            this.o = obtainStyledAttributes.getResourceId(9, this.n);
            this.p = obtainStyledAttributes.getResourceId(8, this.o);
            this.q = obtainStyledAttributes.getResourceId(7, this.p);
            this.r = obtainStyledAttributes.getResourceId(4, -1);
            obtainStyledAttributes.recycle();
            c();
        }
    }

    public AudioRecordStateView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }
}
