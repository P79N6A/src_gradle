package com.ss.android.ugc.aweme.qrcode;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;

public class ScanResultActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63321a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f63321a, false, 70379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63321a, false, 70379, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63321a, false, 70380, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63321a, false, 70380, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63321a, false, 70377, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63321a, false, 70377, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.f16do);
        String stringExtra = getIntent().getStringExtra("extra_scan_result");
        ((TextTitleBar) findViewById(C0906R.id.d3m)).setOnTitleBarClickListener(new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63322a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63322a, false, 70381, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63322a, false, 70381, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ScanResultActivity.this.finish();
            }
        });
        ((DmtTextView) findViewById(C0906R.id.dhz)).setText(stringExtra);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onCreate", false);
    }
}
