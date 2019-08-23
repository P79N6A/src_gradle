package com.ss.android.sdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.bytedance.android.livesdkapi.b.a;
import com.bytedance.android.livesdkapi.b.b;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.android.livesdkapi.service.c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;

public class LiveDummyActivity extends AmeSSActivity implements a {

    /* renamed from: a  reason: collision with root package name */
    private b f30631a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        com.ss.android.ugc.aweme.live.a.d();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.c4);
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(C0906R.color.a17));
        Intent intent = getIntent();
        if (intent.getIntExtra("intent_type", 0) == 1) {
            Bundle extras = intent.getExtras();
            c e2 = h.e();
            if (e2 != null) {
                this.f30631a = e2.b(extras);
                Fragment f2 = this.f30631a.f();
                f2.setArguments(extras);
                getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, f2).commit();
            }
        } else {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onCreate", false);
    }
}
