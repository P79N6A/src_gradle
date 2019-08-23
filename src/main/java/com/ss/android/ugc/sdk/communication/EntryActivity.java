package com.ss.android.ugc.sdk.communication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.ugc.sdk.communication.a;
import com.ss.android.ugc.sdk.communication.msg.base.e;
import java.lang.ref.WeakReference;

public class EntryActivity extends FragmentActivity implements a.C0825a {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.sdk.communication.EntryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.sdk.communication.EntryActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.sdk.communication.EntryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(e eVar) {
        a.b bVar;
        e a2 = e.a();
        WeakReference remove = a2.f77789a.remove(eVar.c());
        if (remove == null || remove.get() == null) {
            bVar = null;
        } else {
            bVar = (a.b) remove.get();
        }
        if (bVar != null) {
            bVar.a(eVar);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.sdk.communication.EntryActivity", "onCreate", true);
        super.onCreate(bundle);
        if (b.a(this).a(getIntent(), (a.C0825a) this)) {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.sdk.communication.EntryActivity", "onCreate", false);
    }
}
