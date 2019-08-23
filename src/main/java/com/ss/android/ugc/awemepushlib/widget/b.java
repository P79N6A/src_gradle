package com.ss.android.ugc.awemepushlib.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77113a;

    public static class a extends Dialog {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f77118a;

        /* renamed from: b  reason: collision with root package name */
        public DialogInterface.OnClickListener f77119b;

        /* renamed from: c  reason: collision with root package name */
        public String f77120c;

        /* renamed from: d  reason: collision with root package name */
        public String f77121d;

        public a(Context context) {
            super(context);
        }

        public final void onCreate(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{bundle}, this, f77118a, false, 90451, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle}, this, f77118a, false, 90451, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            super.onCreate(bundle);
            requestWindowFeature(1);
            setCancelable(true);
            setCanceledOnTouchOutside(false);
            setContentView(C0906R.layout.ez);
            ((TextView) findViewById(C0906R.id.title)).setText(this.f77120c);
            ((TextView) findViewById(C0906R.id.yp)).setText(this.f77121d);
            View findViewById = findViewById(C0906R.id.ob);
            View findViewById2 = findViewById(C0906R.id.oy);
            findViewById.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f77122a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f77122a, false, 90452, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f77122a, false, 90452, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (a.this.f77119b != null) {
                        a.this.f77119b.onClick(a.this, -2);
                    }
                }
            });
            findViewById2.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f77124a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f77124a, false, 90453, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f77124a, false, 90453, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (a.this.f77119b != null) {
                        a.this.f77119b.onClick(a.this, -1);
                    }
                }
            });
        }
    }
}
