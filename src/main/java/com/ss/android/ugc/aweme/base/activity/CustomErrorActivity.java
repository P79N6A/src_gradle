package com.ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import cat.ereza.customactivityoncrash.a;
import com.bytedance.a.a.c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.util.d;
import java.util.ArrayList;

public class CustomErrorActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2720a;

    /* renamed from: b  reason: collision with root package name */
    TextView f2721b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2720a, false, 24110, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2720a, false, 24110, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2720a, false, 24111, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2720a, false, 24111, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2720a, false, 24109, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2720a, false, 24109, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(C0906R.layout.ax);
        this.f2721b = (TextView) findViewById(C0906R.id.a_t);
        final String a2 = a.a(getIntent());
        this.f2721b.setText(a2);
        Button button = (Button) findViewById(C0906R.id.cdw);
        Button button2 = (Button) findViewById(C0906R.id.zs);
        Button button3 = (Button) findViewById(C0906R.id.b6r);
        final Class<? extends Activity> b2 = a.b(getIntent());
        if (b2 != null) {
            button.setText(C0906R.string.bzt);
            button.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34500a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f34500a, false, 24112, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f34500a, false, 24112, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    a.a(CustomErrorActivity.this, new Intent(CustomErrorActivity.this, b2), null);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34503a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f34503a, false, 24113, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f34503a, false, 24113, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    ((ClipboardManager) CustomErrorActivity.this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("crashlog", CustomErrorActivity.this.f2721b.getText().toString()));
                    com.bytedance.ies.dmt.ui.d.a.a((Context) CustomErrorActivity.this, (int) C0906R.string.a2_).a();
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34505a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f34505a, false, 24114, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f34505a, false, 24114, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    a.a((Activity) CustomErrorActivity.this, (a.C0004a) null);
                }
            });
        }
        button3.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34507a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f34507a, false, 24115, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f34507a, false, 24115, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                Application application = CustomErrorActivity.this.getApplication();
                String str = a2;
                if (PatchProxy.isSupport(new Object[]{application, str}, null, d.f75427a, true, 87785, new Class[]{Application.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{application, str}, null, d.f75427a, true, 87785, new Class[]{Application.class, String.class}, Void.TYPE);
                    return;
                }
                if (d.b()) {
                    d.a(application);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(com.bytedance.a.a.d.obtainTxt(str, "crash"));
                    new c(arrayList, "", "", "[Android]" + d.c() + " 7.5.0" + " Crash", "", null);
                    d.a();
                }
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onCreate", false);
    }
}
