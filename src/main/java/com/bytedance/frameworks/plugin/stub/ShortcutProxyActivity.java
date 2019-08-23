package com.bytedance.frameworks.plugin.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.net.URISyntaxException;

public class ShortcutProxyActivity extends Activity {
    private Intent a() {
        Intent intent = getIntent();
        if (intent != null) {
            Intent intent2 = (Intent) intent.getParcelableExtra("target_intent");
            String stringExtra = intent.getStringExtra("target_uri");
            if (stringExtra != null) {
                try {
                    return Intent.parseUri(stringExtra, 0);
                } catch (URISyntaxException unused) {
                }
            } else if (intent2 != null) {
                return intent2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent a2 = a();
        if (a2 != null) {
            a2.addFlags(268435456);
            a2.putExtras(getIntent());
            if (Build.VERSION.SDK_INT >= 15) {
                a2.setSelector(null);
            }
            startActivity(a2);
        }
        finish();
    }
}
