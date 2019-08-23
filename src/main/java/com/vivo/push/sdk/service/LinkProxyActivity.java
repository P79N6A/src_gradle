package com.vivo.push.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.vivo.push.util.o;
import com.vivo.push.util.y;

public class LinkProxyActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        o.d("LinkProxyActivity", hashCode() + " onDestory " + getPackageName());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            o.d("LinkProxyActivity", "enter RequestPermissionsActivity onCreate, intent is null, finish");
            finish();
            return;
        }
        try {
            Window window = getWindow();
            window.setGravity(8388659);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = 0;
            attributes.height = 1;
            attributes.width = 1;
            window.setAttributes(attributes);
        } catch (Throwable th) {
            o.b("LinkProxyActivity", "enter onCreate error ", th);
        }
        String packageName = getPackageName();
        o.d("LinkProxyActivity", hashCode() + " enter onCreate " + packageName);
        if (!"com.vivo.abe".equals(packageName)) {
            try {
                if (intent.getExtras() != null) {
                    startService((Intent) intent.getExtras().get("previous_intent"));
                }
            } catch (Exception e2) {
                o.a("LinkProxyActivity", e2.toString(), e2);
            }
        } else if (intent == null) {
            try {
                o.d("LinkProxyActivity", "adapterToService intent is null");
            } catch (Exception e3) {
                o.a("LinkProxyActivity", e3.toString(), e3);
            }
        } else if (intent.getExtras() == null) {
            o.d("LinkProxyActivity", "adapterToService getExtras() is null");
        } else {
            Intent intent2 = (Intent) intent.getExtras().get("previous_intent");
            if (intent2 == null) {
                o.d("LinkProxyActivity", "adapterToService proxyIntent is null");
            } else {
                y.a((Context) this, intent2);
            }
        }
        finish();
    }
}
