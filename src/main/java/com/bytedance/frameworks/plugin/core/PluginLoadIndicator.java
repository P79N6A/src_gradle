package com.bytedance.frameworks.plugin.core;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.pm.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;
import java.util.List;

public class PluginLoadIndicator extends Activity implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public ProgressDialog f2187a;

    /* renamed from: b  reason: collision with root package name */
    public Intent f2188b;

    /* renamed from: c  reason: collision with root package name */
    public int f2189c;

    /* renamed from: d  reason: collision with root package name */
    private String f2190d;

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f2187a != null && this.f2187a.isShowing()) {
            this.f2187a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f2187a != null && !this.f2187a.isShowing()) {
            this.f2187a.show();
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(this);
    }

    public void run() {
        if (!c.b()) {
            c.c();
        }
        if (!TextUtils.isEmpty(this.f2190d)) {
            c.e(this.f2190d);
        }
        final boolean z = false;
        List<ResolveInfo> b2 = c.b(this.f2188b, 0);
        if (b2 != null && !b2.isEmpty()) {
            z = true;
        }
        runOnUiThread(new Runnable() {
            public final void run() {
                if (PluginLoadIndicator.this.f2187a != null && PluginLoadIndicator.this.f2187a.isShowing()) {
                    PluginLoadIndicator.this.f2187a.dismiss();
                }
                if (z) {
                    PluginLoadIndicator.this.startActivityForResult(PluginLoadIndicator.this.f2188b, PluginLoadIndicator.this.f2189c);
                    if (PluginLoadIndicator.this.f2189c == -1) {
                        PluginLoadIndicator.this.finish();
                    }
                } else {
                    Toast makeText = Toast.makeText(e.a(), "启动失败", 1);
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(makeText);
                    }
                    makeText.show();
                    PluginLoadIndicator.this.finish();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.c8, C0906R.anim.c9);
        this.f2188b = (Intent) getIntent().getParcelableExtra("target_intent");
        this.f2189c = getIntent().getIntExtra("request_code", -1);
        this.f2190d = getIntent().getStringExtra("plugin_package_name");
        this.f2187a = new ProgressDialog(this, 3);
        this.f2187a.setMessage("正在加载，请稍后...");
        this.f2187a.setCancelable(false);
        this.f2187a.setCanceledOnTouchOutside(false);
        this.f2187a.getWindow().requestFeature(1);
        this.f2187a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }
}
