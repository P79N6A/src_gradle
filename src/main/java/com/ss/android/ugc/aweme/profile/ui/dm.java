package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class dm extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62660a;

    /* renamed from: b  reason: collision with root package name */
    TextTitleBar f62661b;

    /* renamed from: c  reason: collision with root package name */
    CommonItemView f62662c;

    /* renamed from: d  reason: collision with root package name */
    CommonItemView f62663d;

    /* renamed from: e  reason: collision with root package name */
    CommonItemView f62664e;

    /* renamed from: f  reason: collision with root package name */
    public a f62665f;
    private int g;

    public interface a {
        void a(int i);
    }

    public final void a(CommonItemView commonItemView, boolean z) {
        CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{commonItemView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62660a, false, 68994, new Class[]{CommonItemView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonItemView2, Byte.valueOf(z)}, this, f62660a, false, 68994, new Class[]{CommonItemView.class, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            commonItemView2.setRightIconRes(2130839076);
        } else {
            commonItemView2.setRightIconRes(0);
        }
    }

    dm(@NonNull Context context, int i) {
        super(context, C0906R.style.fu);
        boolean z;
        boolean z2;
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.pz, null);
        boolean z3 = true;
        this.g = (i > 3 || i <= 0) ? 1 : i;
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f62660a, false, 68992, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f62660a, false, 68992, new Class[]{View.class}, Void.TYPE);
        } else {
            setContentView(inflate);
            this.f62661b = (TextTitleBar) inflate.findViewById(C0906R.id.d3m);
            this.f62662c = (CommonItemView) inflate.findViewById(C0906R.id.cr_);
            this.f62663d = (CommonItemView) inflate.findViewById(C0906R.id.cra);
            this.f62664e = (CommonItemView) inflate.findViewById(C0906R.id.cr7);
            CommonItemView commonItemView = this.f62662c;
            if (this.g == 1) {
                z = true;
            } else {
                z = false;
            }
            a(commonItemView, z);
            CommonItemView commonItemView2 = this.f62663d;
            if (this.g == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            a(commonItemView2, z2);
            a(this.f62664e, this.g != 3 ? false : z3);
        }
        if (PatchProxy.isSupport(new Object[0], this, f62660a, false, 68993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62660a, false, 68993, new Class[0], Void.TYPE);
            return;
        }
        this.f62661b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62666a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62666a, false, 68995, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62666a, false, 68995, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                dm.this.onBackPressed();
            }
        });
        this.f62662c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62668a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62668a, false, 68996, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62668a, false, 68996, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                dm.this.a(dm.this.f62662c, true);
                dm.this.a(dm.this.f62663d, false);
                dm.this.a(dm.this.f62664e, false);
                if (dm.this.f62665f != null) {
                    dm.this.f62665f.a(1);
                }
                dm.this.f62662c.post(new dn(this));
            }
        });
        this.f62663d.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62670a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62670a, false, 68998, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62670a, false, 68998, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                dm.this.a(dm.this.f62662c, false);
                dm.this.a(dm.this.f62663d, true);
                dm.this.a(dm.this.f62664e, false);
                if (dm.this.f62665f != null) {
                    dm.this.f62665f.a(2);
                }
                dm.this.f62663d.post(new Cdo(this));
            }
        });
        this.f62664e.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62672a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62672a, false, 69000, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62672a, false, 69000, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                dm.this.a(dm.this.f62662c, false);
                dm.this.a(dm.this.f62663d, false);
                dm.this.a(dm.this.f62664e, true);
                if (dm.this.f62665f != null) {
                    dm.this.f62665f.a(3);
                }
                dm.this.f62664e.post(new dp(this));
            }
        });
    }
}
