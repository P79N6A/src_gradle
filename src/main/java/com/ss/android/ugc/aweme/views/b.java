package com.ss.android.ugc.aweme.views;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

@Deprecated
public class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76443a;

    /* renamed from: b  reason: collision with root package name */
    public a f76444b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f76445c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f76446d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f76447e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f76448f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private View.OnClickListener j = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76449a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f76449a, false, 89383, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f76449a, false, 89383, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            b.this.dismiss();
        }
    };

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76451a;

        /* renamed from: b  reason: collision with root package name */
        public String f76452b;

        /* renamed from: c  reason: collision with root package name */
        public String f76453c;

        /* renamed from: d  reason: collision with root package name */
        public String f76454d;
        @ColorInt

        /* renamed from: e  reason: collision with root package name */
        public int f76455e = -1;

        /* renamed from: f  reason: collision with root package name */
        public String f76456f;
        @ColorInt
        public int g = -1;
        public int h;
        public String i;
        public String j;
        public View.OnClickListener k;
        public View.OnClickListener l;
        public View.OnClickListener m;

        public final a a(int i2) {
            this.h = i2;
            return this;
        }

        public final a b(String str) {
            this.f76454d = str;
            return this;
        }

        public final a c(String str) {
            this.i = str;
            return this;
        }

        public final a d(String str) {
            this.j = str;
            return this;
        }

        public final a a(String str) {
            this.f76452b = str;
            return this;
        }

        public final b a(Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f76451a, false, 89384, new Class[]{Context.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{context2}, this, f76451a, false, 89384, new Class[]{Context.class}, b.class);
            }
            b bVar = new b(context2);
            bVar.f76444b = this;
            return bVar;
        }
    }

    public b(Context context) {
        super(context, C0906R.style.su);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f76443a, false, 89381, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f76443a, false, 89381, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (this.f76444b != null) {
            this.f76444b.m = onClickListener;
        } else {
            throw new IllegalStateException("You must init Builder first !");
        }
    }

    public final void b(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f76443a, false, 89382, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f76443a, false, 89382, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (this.f76444b != null) {
            this.f76444b.l = onClickListener;
        } else {
            throw new IllegalStateException("You must init Builder first !");
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f76443a, false, 89380, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f76443a, false, 89380, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.aru);
        this.f76447e = (TextView) findViewById(C0906R.id.dmv);
        this.f76448f = (TextView) findViewById(C0906R.id.qy);
        this.f76445c = (TextView) findViewById(C0906R.id.dnn);
        this.f76446d = (TextView) findViewById(C0906R.id.dni);
        this.h = (TextView) findViewById(C0906R.id.dnd);
        this.i = (TextView) findViewById(C0906R.id.dnr);
        this.g = (ImageView) findViewById(C0906R.id.asc);
        this.h.setOnClickListener(this.j);
        this.i.setOnClickListener(this.j);
        if (!TextUtils.isEmpty(this.f76444b.f76452b)) {
            this.f76445c.setText(this.f76444b.f76452b);
        }
        if (!TextUtils.isEmpty(this.f76444b.f76453c)) {
            this.f76446d.setText(this.f76444b.f76453c);
            this.f76446d.setVisibility(0);
        } else {
            this.f76446d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f76444b.f76454d)) {
            this.f76447e.setText(this.f76444b.f76454d);
            this.f76447e.setMovementMethod(new ScrollingMovementMethod());
            if (this.f76444b.f76455e != -1) {
                this.f76447e.setTextColor(this.f76444b.f76455e);
            }
        } else {
            this.f76447e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f76444b.f76456f)) {
            this.f76448f.setVisibility(0);
            this.f76448f.setText(this.f76444b.f76456f);
            if (this.f76444b.g != -1) {
                this.f76448f.setTextColor(this.f76444b.g);
            }
            if (this.f76444b.k != null) {
                this.f76448f.setOnClickListener(this.f76444b.k);
            }
        } else {
            this.f76448f.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f76444b.i)) {
            this.h.setText(this.f76444b.i);
        } else {
            this.h.setVisibility(8);
            this.i.setBackgroundResource(2130838202);
        }
        if (!TextUtils.isEmpty(this.f76444b.j)) {
            this.i.setText(this.f76444b.j);
        }
        this.g.setImageResource(this.f76444b.h);
        if (this.f76444b.h == 0) {
            findViewById(C0906R.id.asd).setVisibility(8);
            this.g.setVisibility(8);
            View findViewById = findViewById(C0906R.id.yp);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, 0, layoutParams.rightMargin, layoutParams.bottomMargin);
            findViewById.setLayoutParams(layoutParams);
        }
        if (this.f76444b.l != null) {
            this.h.setOnClickListener(this.f76444b.l);
        }
        if (this.f76444b.m != null) {
            this.i.setOnClickListener(this.f76444b.m);
        }
    }
}
