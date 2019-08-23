package com.bytedance.scene.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.bytedance.scene.d;
import com.bytedance.scene.e;
import com.bytedance.scene.f;
import com.bytedance.scene.g;

public abstract class SceneActivity extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    private g f22206a;

    /* access modifiers changed from: protected */
    @NonNull
    public abstract Class<? extends e> a();

    /* access modifiers changed from: protected */
    public abstract boolean b();

    public void onBackPressed() {
        if (!this.f22206a.a()) {
            super.onBackPressed();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        }
        Class<? extends e> a2 = a();
        Bundle bundle2 = bundle;
        this.f22206a = d.a((Activity) this, 16908290, bundle2, new com.bytedance.scene.navigation.g(a2, (Bundle) null), (f) null, b());
    }
}
