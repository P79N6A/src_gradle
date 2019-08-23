package com.bytedance.android.livesdk.feed.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14445a;

    /* renamed from: b  reason: collision with root package name */
    public C0104a f14446b;

    /* renamed from: c  reason: collision with root package name */
    private String f14447c;

    /* renamed from: d  reason: collision with root package name */
    private String f14448d;

    /* renamed from: com.bytedance.android.livesdk.feed.ui.a$a  reason: collision with other inner class name */
    public interface C0104a {
        void a();

        void b();
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f14445a, false, 8955, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f14445a, false, 8955, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.alf);
        if (!TextUtils.isEmpty(this.f14447c)) {
            ((TextView) findViewById(C0906R.id.dc1)).setText(this.f14447c);
        }
        TextView textView = (TextView) findViewById(C0906R.id.bq5);
        if (!TextUtils.isEmpty(this.f14448d)) {
            textView.setText(this.f14448d);
        }
        findViewById(C0906R.id.bq5).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14449a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14449a, false, 8956, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14449a, false, 8956, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (a.this.f14446b != null) {
                    a.this.f14446b.a();
                }
            }
        });
        findViewById(C0906R.id.buz).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14451a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14451a, false, 8957, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14451a, false, 8957, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (a.this.f14446b != null) {
                    a.this.f14446b.b();
                }
                a.this.dismiss();
            }
        });
        findViewById(C0906R.id.q2).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14453a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14453a, false, 8958, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14453a, false, 8958, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                a.this.dismiss();
            }
        });
    }

    public a(@NonNull Context context, C0104a aVar) {
        super(context);
        setCanceledOnTouchOutside(false);
        this.f14446b = aVar;
    }
}
