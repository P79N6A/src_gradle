package com.ss.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.common.util.ToolUtils;

public class BootstrapActivity extends Activity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent launchIntentForPackage = ToolUtils.getLaunchIntentForPackage(this, getPackageName());
        finish();
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
        }
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onCreate", false);
    }
}
