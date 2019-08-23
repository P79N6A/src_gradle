package com.ss.android.ugc.aweme.account.views;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33174a;

    /* renamed from: b  reason: collision with root package name */
    public C0416a f33175b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f33176c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f33177d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f33178e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f33179f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private LinearLayout j;
    private View.OnClickListener k = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33180a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f33180a, false, 21518, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f33180a, false, 21518, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a.this.dismiss();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.account.views.a$a  reason: collision with other inner class name */
    public static class C0416a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33182a;

        /* renamed from: b  reason: collision with root package name */
        public String f33183b;

        /* renamed from: c  reason: collision with root package name */
        public String f33184c;

        /* renamed from: d  reason: collision with root package name */
        public String f33185d;
        @ColorInt

        /* renamed from: e  reason: collision with root package name */
        public int f33186e = -1;

        /* renamed from: f  reason: collision with root package name */
        public String f33187f;
        @ColorInt
        public int g = -1;
        public int h;
        public String i;
        public String j;
        public View.OnClickListener k;
        public View.OnClickListener l;
        public View.OnClickListener m;

        public final C0416a a(View.OnClickListener onClickListener) {
            this.l = onClickListener;
            return this;
        }

        public final C0416a b(View.OnClickListener onClickListener) {
            this.m = onClickListener;
            return this;
        }

        public final C0416a c(String str) {
            this.i = str;
            return this;
        }

        public final C0416a d(String str) {
            this.j = str;
            return this;
        }

        public final C0416a a(int i2) {
            this.h = 2130840154;
            return this;
        }

        public final C0416a b(String str) {
            this.f33185d = str;
            return this;
        }

        public final C0416a a(String str) {
            this.f33183b = str;
            return this;
        }

        public final a a(Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f33182a, false, 21519, new Class[]{Context.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{context2}, this, f33182a, false, 21519, new Class[]{Context.class}, a.class);
            }
            a aVar = new a(context2);
            aVar.f33175b = this;
            return aVar;
        }
    }

    public a(Context context) {
        super(context, C0906R.style.su);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f33174a, false, 21516, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f33174a, false, 21516, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (this.f33175b != null) {
            this.f33175b.b(onClickListener);
        } else {
            throw new IllegalStateException("You must init Builder first !");
        }
    }

    public final void b(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f33174a, false, 21517, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f33174a, false, 21517, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (this.f33175b != null) {
            this.f33175b.a(onClickListener);
        } else {
            throw new IllegalStateException("You must init Builder first !");
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33174a, false, 21515, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33174a, false, 21515, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.aru);
        this.f33178e = (TextView) findViewById(C0906R.id.dmv);
        this.f33179f = (TextView) findViewById(C0906R.id.qy);
        this.f33176c = (TextView) findViewById(C0906R.id.dnn);
        this.f33177d = (TextView) findViewById(C0906R.id.dni);
        this.h = (TextView) findViewById(C0906R.id.dnd);
        this.i = (TextView) findViewById(C0906R.id.dnr);
        this.g = (ImageView) findViewById(C0906R.id.asc);
        this.j = (LinearLayout) findViewById(C0906R.id.yp);
        this.h.setOnClickListener(this.k);
        this.i.setOnClickListener(this.k);
        if (!TextUtils.isEmpty(this.f33175b.f33183b)) {
            this.f33176c.setText(this.f33175b.f33183b);
        }
        if (!TextUtils.isEmpty(this.f33175b.f33184c)) {
            this.f33177d.setText(this.f33175b.f33184c);
            this.f33177d.setVisibility(0);
        } else {
            this.f33177d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f33175b.f33185d)) {
            this.f33178e.setText(this.f33175b.f33185d);
            this.f33178e.setMovementMethod(new ScrollingMovementMethod());
            if (this.f33175b.f33186e != -1) {
                this.f33178e.setTextColor(this.f33175b.f33186e);
            }
        } else {
            this.f33178e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f33175b.f33187f)) {
            this.f33179f.setVisibility(0);
            this.f33179f.setText(this.f33175b.f33187f);
            if (this.f33175b.g != -1) {
                this.f33179f.setTextColor(this.f33175b.g);
            }
            if (this.f33175b.k != null) {
                this.f33179f.setOnClickListener(this.f33175b.k);
            }
        } else {
            this.f33179f.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f33175b.i)) {
            this.h.setText(this.f33175b.i);
        } else {
            this.h.setVisibility(8);
            this.i.setBackgroundResource(2130838202);
        }
        if (!TextUtils.isEmpty(this.f33175b.j)) {
            this.i.setText(this.f33175b.j);
        } else {
            this.i.setVisibility(8);
        }
        this.g.setImageResource(this.f33175b.h);
        if (this.f33175b.h == 0) {
            findViewById(C0906R.id.asd).setVisibility(8);
            this.g.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
            layoutParams.topMargin = 0;
            this.j.setLayoutParams(layoutParams);
        }
        if (this.f33175b.l != null) {
            this.h.setOnClickListener(this.f33175b.l);
        }
        if (this.f33175b.m != null) {
            this.i.setOnClickListener(this.f33175b.m);
        }
    }
}
