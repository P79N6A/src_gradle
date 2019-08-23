package com.bytedance.android.livesdk.floatwindow.ui;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.floatwindow.ui.ControlButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class c extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14608a;

    /* renamed from: b  reason: collision with root package name */
    public ControlButton f14609b;

    /* renamed from: c  reason: collision with root package name */
    public ControlButton f14610c;

    /* renamed from: d  reason: collision with root package name */
    public a f14611d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f14612e;

    /* renamed from: f  reason: collision with root package name */
    private ControlButton f14613f;
    private ControlButton g;
    private ImageView h;

    public interface a {
        void a();

        void a(boolean z);

        void b();

        void b(boolean z);
    }

    private int getLayoutId() {
        return C0906R.layout.an0;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14608a, false, 9142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14608a, false, 9142, new Class[0], Void.TYPE);
            return;
        }
        this.f14612e.setVisibility(8);
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f14608a, false, 9145, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14608a, false, 9145, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f14612e.getVisibility() == 0) {
            z = true;
        }
        return z;
    }

    public final void setOnViewClickListener(a aVar) {
        this.f14611d = aVar;
    }

    public final void setMsgBtn(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14608a, false, 9146, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14608a, false, 9146, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f14610c.setChecked(z);
    }

    public c(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f14608a, false, 9141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14608a, false, 9141, new Class[0], Void.TYPE);
            return;
        }
        inflate(getContext(), getLayoutId(), this);
        this.f14612e = (LinearLayout) findViewById(C0906R.id.yj);
        this.h = (ImageView) findViewById(C0906R.id.b2_);
        this.f14613f = (ControlButton) findViewById(C0906R.id.ow);
        this.f14613f.a(2130841247, 2130841247, C0906R.color.si, C0906R.color.si, C0906R.string.d30, C0906R.string.d30, false);
        this.f14609b = (ControlButton) findViewById(C0906R.id.ol);
        this.f14609b.a(2130841273, 2130841274, C0906R.color.si, C0906R.color.a8u, C0906R.string.d2y, C0906R.string.d2z, true);
        this.f14610c = (ControlButton) findViewById(C0906R.id.oj);
        this.f14610c.a(2130841271, 2130841272, C0906R.color.si, C0906R.color.a8u, C0906R.string.d2w, C0906R.string.d2x, true);
        this.g = (ControlButton) findViewById(C0906R.id.oz);
        this.g.a(2130841337, 2130841337, C0906R.color.si, C0906R.color.si, C0906R.string.d31, C0906R.string.d31, false);
        this.f14613f.setOnViewClickListener(new ControlButton.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14614a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f14614a, false, 9147, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14614a, false, 9147, new Class[0], Void.TYPE);
                    return;
                }
                if (c.this.f14611d != null) {
                    c.this.f14611d.a();
                }
            }
        });
        this.f14609b.setOnViewClickListener(new ControlButton.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14616a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f14616a, false, 9148, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14616a, false, 9148, new Class[0], Void.TYPE);
                    return;
                }
                if (c.this.f14611d != null) {
                    c.this.f14611d.a(c.this.f14609b.f14580b);
                }
            }
        });
        this.f14610c.setOnViewClickListener(new ControlButton.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14618a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f14618a, false, 9149, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14618a, false, 9149, new Class[0], Void.TYPE);
                    return;
                }
                if (c.this.f14611d != null) {
                    c.this.f14611d.b(c.this.f14610c.f14580b);
                }
            }
        });
        this.g.setOnViewClickListener(new ControlButton.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14620a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f14620a, false, 9150, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14620a, false, 9150, new Class[0], Void.TYPE);
                    return;
                }
                if (c.this.f14611d != null) {
                    c.this.f14611d.b();
                }
            }
        });
    }
}
