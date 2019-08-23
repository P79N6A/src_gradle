package com.ss.android.ugc.aweme.freeflowcard.b;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.freeflowcard.b;
import java.util.Map;

public abstract class a extends Dialog implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48584a;

    /* renamed from: b  reason: collision with root package name */
    protected View f48585b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f48586c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f48587d;

    /* renamed from: e  reason: collision with root package name */
    protected TextView f48588e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f48589f;
    protected TextView g;
    protected CheckBox h;
    public String i;
    public String j;
    public C0575a k;
    private ImageView l;
    private LinearLayout m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;

    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.b.a$a  reason: collision with other inner class name */
    public interface C0575a {
        void a(Dialog dialog);

        void b(Dialog dialog);
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f48584a, false, 46179, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48584a, false, 46179, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.h != null) {
            return this.h.isChecked();
        } else {
            return false;
        }
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f48584a, false, 46182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48584a, false, 46182, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        com.bytedance.ies.dmt.ui.b.a.a(true, this.f48585b);
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f48584a, false, 46183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48584a, false, 46183, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, b.f48592a, true, 46185, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, b.f48592a, true, 46185, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public a(Context context) {
        super(context, C0906R.style.su);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48584a, false, 46174, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48584a, false, 46174, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.n = str;
        if (this.f48586c != null && !TextUtils.isEmpty(this.n)) {
            this.f48586c.setText(str);
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48584a, false, 46175, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48584a, false, 46175, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.o = str;
        if (this.f48587d != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 9) {
                this.f48587d.setTextSize(2, 14.0f);
            }
            this.f48587d.setText(str);
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48584a, false, 46176, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48584a, false, 46176, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.p = str;
        if (this.f48588e != null && !TextUtils.isEmpty(this.p)) {
            this.f48588e.setText(str);
        }
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48584a, false, 46177, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48584a, false, 46177, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.q = str;
        if (this.f48589f != null && !TextUtils.isEmpty(this.q)) {
            this.f48589f.setText(str);
        }
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48584a, false, 46178, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48584a, false, 46178, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.r = str;
        if (this.g != null && !TextUtils.isEmpty(this.r)) {
            this.g.setText(this.r);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48584a, false, 46180, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48584a, false, 46180, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.d9v) {
            if (this.k != null) {
                this.k.b(this);
            }
        } else if (id == C0906R.id.da4) {
            if (this.k != null) {
                this.k.a(this);
            }
        } else if (id == C0906R.id.b8s || id == C0906R.id.arg) {
            if (PatchProxy.isSupport(new Object[0], this, f48584a, false, 46181, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48584a, false, 46181, new Class[0], Void.TYPE);
                return;
            }
            Context context = getContext();
            if (context != null && !TextUtils.isEmpty(this.i)) {
                d dVar = new d();
                dVar.a("enter_from", this.j);
                r.onEvent(MobClick.obtain().setEventName("enter_phone_card_apply").setLabelName("no_wifi_alert"));
                if (this instanceof e) {
                    r.a("wifi_byte_free", (Map) b.a().a(dVar, getContext()).f34114b);
                } else {
                    r.a("no_wifi_byte_free", (Map) b.a().a(dVar, getContext()).f34114b);
                }
                Intent intent = new Intent(context, CrossPlatformActivity.class);
                intent.setData(Uri.parse(this.i));
                context.startActivity(intent);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f48584a, false, 46172, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f48584a, false, 46172, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(a());
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = com.bytedance.ies.dmt.ui.b.a.f20279f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        getWindow().setWindowAnimations(0);
        if (PatchProxy.isSupport(new Object[0], this, f48584a, false, 46173, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48584a, false, 46173, new Class[0], Void.TYPE);
        } else {
            if (TextUtils.isEmpty(this.n)) {
                this.n = (String) SharePrefCache.inst().getDialogTitle().c();
            }
            if (TextUtils.isEmpty(this.q)) {
                this.o = (String) SharePrefCache.inst().getDialogContent().c();
            }
            if (TextUtils.isEmpty(this.r)) {
                this.r = (String) SharePrefCache.inst().getDialogSlogan().c();
            }
            if (TextUtils.isEmpty(this.i)) {
                this.i = (String) SharePrefCache.inst().getDialogUrl().c();
            }
        }
        this.f48585b = findViewById(C0906R.id.chu);
        this.f48586c = (TextView) findViewById(C0906R.id.dkk);
        if (this.f48586c != null && !TextUtils.isEmpty(this.n)) {
            this.f48586c.setText(this.n);
        }
        this.f48587d = (TextView) findViewById(C0906R.id.da0);
        if (this.f48587d != null && !TextUtils.isEmpty(this.o)) {
            if (this.o.length() > 9) {
                this.f48587d.setTextSize(2, 14.0f);
            }
            this.f48587d.setText(this.o);
        }
        this.f48588e = (TextView) findViewById(C0906R.id.da4);
        this.f48588e.setOnClickListener(this);
        if (!TextUtils.isEmpty(this.p)) {
            this.f48588e.setText(this.p);
        }
        this.f48589f = (TextView) findViewById(C0906R.id.d9v);
        if (this.f48589f != null) {
            this.f48589f.setOnClickListener(this);
            if (!TextUtils.isEmpty(this.q)) {
                this.f48589f.setText(this.q);
            }
        }
        this.g = (TextView) findViewById(C0906R.id.dj_);
        if (this.g != null && !TextUtils.isEmpty(this.r)) {
            this.g.setText(this.r);
        }
        this.h = (CheckBox) findViewById(C0906R.id.r0);
        if (this.h != null) {
            com.bytedance.ies.dmt.ui.e.b.a(this.h, 0.75f);
            this.h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48590a;

                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f48590a, false, 46184, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f48590a, false, 46184, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    d dVar = new d();
                    dVar.a("enter_from", a.this.j);
                    if (z) {
                        str = "no_wifi_auto_confirm";
                    } else {
                        str = "no_wifi_auto_cancel";
                    }
                    r.a(str, (Map) b.a().a(dVar, a.this.getContext()).f34114b);
                }
            });
        }
        this.m = (LinearLayout) findViewById(C0906R.id.b8s);
        if (this.m != null) {
            this.m.setOnClickListener(this);
            com.bytedance.ies.dmt.ui.e.b.a(this.m, 0.75f);
        }
        this.l = (ImageView) findViewById(C0906R.id.arg);
        if (this.l != null) {
            this.l.setOnClickListener(this);
        }
    }
}
