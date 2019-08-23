package com.ss.android.ugc.common.component.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.bytedance.ies.uikit.base.AbsActivity;

public abstract class ComponentActivity extends AbsActivity {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<Object> f77201a;

    @NonNull
    public abstract SparseArray<Object> a();

    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.f77201a.size(); i++) {
            this.f77201a.valueAt(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        for (int i = 0; i < this.f77201a.size(); i++) {
            this.f77201a.valueAt(i);
        }
    }

    public void onResume() {
        super.onResume();
        for (int i = 0; i < this.f77201a.size(); i++) {
            this.f77201a.valueAt(i);
        }
    }

    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.f77201a.size(); i++) {
            this.f77201a.valueAt(i);
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.f77201a.size(); i++) {
            this.f77201a.valueAt(i);
        }
    }

    public void onDestroy() {
        for (int i = 0; i < this.f77201a.size(); i++) {
            this.f77201a.valueAt(i);
        }
        if (this.f77201a != null) {
            this.f77201a.clear();
            this.f77201a = null;
        }
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        this.f77201a = a();
        super.onCreate(bundle);
        for (int i = 0; i < this.f77201a.size(); i++) {
            this.f77201a.valueAt(i);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        for (int i = 0; i < this.f77201a.size(); i++) {
            this.f77201a.valueAt(i);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (int i3 = 0; i3 < this.f77201a.size(); i3++) {
            this.f77201a.valueAt(i3);
        }
    }
}
