package com.ss.android.ugc.aweme.qrcode;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;

public class TextQRCodeActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63324a;

    /* renamed from: b  reason: collision with root package name */
    public String f63325b;

    /* renamed from: c  reason: collision with root package name */
    private View f63326c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f63327d;

    /* renamed from: e  reason: collision with root package name */
    private View f63328e;

    /* renamed from: f  reason: collision with root package name */
    private View f63329f;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f63324a, false, 70384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63324a, false, 70384, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63324a, false, 70385, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63324a, false, 70385, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63324a, false, 70383, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63324a, false, 70383, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.eb);
        this.f63329f = findViewById(C0906R.id.ayw);
        this.f63326c = findViewById(C0906R.id.dhn);
        this.f63328e = findViewById(C0906R.id.da7);
        this.f63327d = (TextView) findViewById(C0906R.id.da0);
        this.f63326c.setVisibility(8);
        Intent intent = getIntent();
        if (intent != null) {
            this.f63325b = intent.getStringExtra("intent_extra_content");
        }
        this.f63327d.setText(this.f63325b);
        this.f63328e.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63330a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63330a, false, 70386, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63330a, false, 70386, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                ClipboardManager clipboardManager = (ClipboardManager) TextQRCodeActivity.this.getSystemService("clipboard");
                ClipData newPlainText = ClipData.newPlainText("label", TextQRCodeActivity.this.f63325b);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                a.a((Context) TextQRCodeActivity.this, (int) C0906R.string.a2_).a();
            }
        });
        this.f63329f.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63332a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63332a, false, 70387, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63332a, false, 70387, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                TextQRCodeActivity.this.finish();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", false);
    }
}
