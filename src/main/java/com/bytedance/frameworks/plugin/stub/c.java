package com.bytedance.frameworks.plugin.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class c extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Intent intent2 = (Intent) intent.getParcelableExtra("target_intent");
            if (intent2 != null) {
                startActivity(intent2);
            }
        }
        finish();
    }
}
