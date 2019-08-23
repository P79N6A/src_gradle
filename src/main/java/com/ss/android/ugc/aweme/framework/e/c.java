package com.ss.android.ugc.aweme.framework.e;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48485a;

    /* renamed from: b  reason: collision with root package name */
    public View f48486b;

    /* renamed from: c  reason: collision with root package name */
    public View f48487c;

    /* renamed from: d  reason: collision with root package name */
    private int f48488d;
    @IdRes

    /* renamed from: e  reason: collision with root package name */
    private int f48489e;
    @IdRes

    /* renamed from: f  reason: collision with root package name */
    private int f48490f;
    @IdRes
    private int g;
    @IdRes
    private int h;
    private Context i;
    private View j;
    private AlertDialog.Builder k;

    public final AlertDialog a() {
        final AlertDialog alertDialog;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f48485a, false, 45944, new Class[0], AlertDialog.class)) {
            return (AlertDialog) PatchProxy.accessDispatch(new Object[0], this, f48485a, false, 45944, new Class[0], AlertDialog.class);
        }
        if (this.j == null && this.f48488d != 0) {
            try {
                this.j = View.inflate(this.i, this.f48488d, null);
            } catch (Exception unused) {
            }
        }
        if (this.j != null) {
            this.f48486b = this.j.findViewById(this.g);
            this.f48487c = this.j.findViewById(this.h);
            this.k.setView(this.j);
            alertDialog = this.k.create();
            if (PatchProxy.isSupport(new Object[]{alertDialog}, this, f48485a, false, 45943, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{alertDialog}, this, f48485a, false, 45943, new Class[]{DialogInterface.class}, Void.TYPE);
            } else {
                AnonymousClass1 r0 = new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48491a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f48491a, false, 45945, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f48491a, false, 45945, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (view.equals(c.this.f48486b)) {
                            alertDialog.dismiss();
                        } else {
                            view.equals(c.this.f48487c);
                        }
                    }
                };
                if (this.f48486b != null) {
                    this.f48486b.setOnClickListener(r0);
                }
                if (this.f48487c != null) {
                    this.f48487c.setOnClickListener(r0);
                }
            }
        } else {
            AlertDialog.Builder builder = this.k;
            if (this.f48489e > 0) {
                i2 = this.f48489e;
            } else {
                i2 = C0906R.string.pm;
            }
            AlertDialog.Builder negativeButton = builder.setNegativeButton(i2, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48496a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48496a, false, 45947, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48496a, false, 45947, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    }
                }
            });
            if (this.f48490f > 0) {
                i3 = this.f48490f;
            } else {
                i3 = C0906R.string.a0v;
            }
            negativeButton.setPositiveButton(i3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48494a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48494a, false, 45946, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48494a, false, 45946, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    }
                }
            });
            alertDialog = this.k.create();
        }
        return alertDialog;
    }

    public final c a(View view) {
        this.j = view;
        return this;
    }

    public c(Context context) {
        this.i = context;
        if (this.k == null) {
            this.k = new AlertDialog.Builder(this.i, C0906R.style.sn);
        }
    }
}
