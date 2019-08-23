package com.ss.android.downloadlib.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.download.api.config.l;
import com.ss.android.downloadlib.c.h;
import com.ss.android.downloadlib.c.k;
import com.ss.android.ugc.aweme.app.f;
import java.lang.ref.WeakReference;

public class TTDelegateActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback {

    /* renamed from: a  reason: collision with root package name */
    private Intent f28703a;

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f28703a != null) {
            int intExtra = this.f28703a.getIntExtra("type", 0);
            if (intExtra == 1) {
                b(this.f28703a.getStringExtra("permission_id_key"), this.f28703a.getStringArrayExtra("permission_content_key"));
            } else if (intExtra == 2) {
                b(this.f28703a.getStringExtra(f.f34168b));
            } else {
                k.a((Activity) this);
            }
            this.f28703a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f28703a = intent;
        if (com.ss.android.downloadlib.addownload.k.a() == null) {
            com.ss.android.downloadlib.addownload.k.a((Context) this);
        }
    }

    public static void a(String str) {
        Intent intent = new Intent(com.ss.android.downloadlib.addownload.k.a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 2);
        intent.putExtra(f.f34168b, str);
        if (com.ss.android.downloadlib.addownload.k.a() != null) {
            com.ss.android.downloadlib.addownload.k.a().startActivity(intent);
        }
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            k.a((Activity) this);
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.putExtra(f.f34168b, str);
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
        } finally {
            k.a((Activity) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        this.f28703a = getIntent();
        if (com.ss.android.downloadlib.addownload.k.a() == null) {
            com.ss.android.downloadlib.addownload.k.a((Context) this);
        }
    }

    public static void a(String str, String[] strArr) {
        Intent intent = new Intent(com.ss.android.downloadlib.addownload.k.a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 1);
        intent.putExtra("permission_id_key", str);
        intent.putExtra("permission_content_key", strArr);
        if (com.ss.android.downloadlib.addownload.k.a() != null) {
            com.ss.android.downloadlib.addownload.k.a().startActivity(intent);
        }
    }

    private void b(final String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            k.a((Activity) this);
            return;
        }
        AnonymousClass1 r0 = new l() {

            /* renamed from: c  reason: collision with root package name */
            private WeakReference<Activity> f28706c = new WeakReference<>(TTDelegateActivity.this);

            public final void a() {
                String str = str;
                if (!TextUtils.isEmpty(str)) {
                    h.a a2 = h.a(str);
                    if (a2 != null) {
                        a2.a();
                    }
                }
                k.a((Activity) this.f28706c.get());
            }

            public final void a(String str) {
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    h.a a2 = h.a(str2);
                    if (a2 != null) {
                        a2.a(str);
                    }
                }
                k.a((Activity) this.f28706c.get());
            }
        };
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                com.ss.android.downloadlib.addownload.k.f().a(this, strArr, r0);
                return;
            } catch (Exception unused) {
            }
        }
        r0.a();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        com.ss.android.downloadlib.addownload.k.f().a(strArr, iArr);
    }
}
