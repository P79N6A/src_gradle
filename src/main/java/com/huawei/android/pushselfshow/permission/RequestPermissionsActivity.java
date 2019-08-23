package com.huawei.android.pushselfshow.permission;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.SelfShowReceiver;
import com.huawei.android.pushselfshow.utils.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestPermissionsActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f25219a = {"android.permission.READ_PHONE_STATE"};

    /* renamed from: c  reason: collision with root package name */
    private static List f25220c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f25221d = false;

    /* renamed from: b  reason: collision with root package name */
    private String[] f25222b = new String[0];

    public static void a(Context context, Intent intent) {
        e.b("PushSelfShowLog", "enter startPermissionActivity");
        if (context != null) {
            Intent intent2 = new Intent(context.getApplicationContext(), RequestPermissionsActivity.class);
            intent2.addFlags(276824064);
            if (intent != null) {
                intent2.putExtra("previous_intent", intent);
            }
            try {
                context.startActivity(intent2);
            } catch (ActivityNotFoundException e2) {
                e.c("PushSelfShowLog", e2.toString(), e2);
            }
        }
    }

    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 23 && !a(context, f25219a);
    }

    protected static boolean a(Context context, String[] strArr) {
        if (context == null || strArr == null || strArr.length == 0) {
            return false;
        }
        for (String checkSelfPermission : strArr) {
            if (context.checkSelfPermission(checkSelfPermission) != 0) {
                e.a("PushSelfShowLog", checkSelfPermission + " need request");
                return false;
            }
        }
        return true;
    }

    private boolean a(String str) {
        return Arrays.asList(a()).contains(str);
    }

    private boolean a(String[] strArr) {
        int i = 0;
        while (i < strArr.length) {
            if (checkSelfPermission(strArr[i]) == 0 || !a(strArr[i])) {
                i++;
            } else {
                e.b("PushSelfShowLog", "request permissions failed:" + strArr[i]);
                return false;
            }
        }
        e.b("PushSelfShowLog", "request all permissions success:");
        return true;
    }

    private boolean a(String[] strArr, int[] iArr) {
        int i = 0;
        while (i < strArr.length) {
            if (iArr[i] == 0 || !a(strArr[i])) {
                i++;
            } else {
                e.a("PushSelfShowLog", "request permissions failed:" + strArr[i]);
                return false;
            }
        }
        e.a("PushSelfShowLog", "request all permissions success:");
        return true;
    }

    private void b(String[] strArr) {
        if (f25221d) {
            e.b("PushSelfShowLog", "has Start PermissionActivity, do nothing");
            finish();
            return;
        }
        f25221d = true;
        try {
            Intent intent = new Intent("huawei.intent.action.REQUEST_PERMISSIONS");
            intent.setPackage("com.huawei.systemmanager");
            intent.putExtra("KEY_HW_PERMISSION_ARRAY", strArr);
            intent.putExtra("KEY_HW_PERMISSION_PKG", getPackageName());
            if (a.a((Context) this, "com.huawei.systemmanager", intent).booleanValue()) {
                try {
                    e.b("PushSelfShowLog", "checkAndRequestPermission: systemmanager permission activity is exist");
                    startActivityForResult(intent, 1357);
                } catch (Exception e2) {
                    e.c("PushSelfShowLog", "checkAndRequestPermission: Exception", e2);
                    requestPermissions(strArr, 1357);
                }
                return;
            }
            e.b("PushSelfShowLog", "checkAndRequestPermission: systemmanager permission activity is not exist");
            requestPermissions(strArr, 1357);
        } catch (Exception e3) {
            e.c("PushSelfShowLog", e3.toString(), e3);
        }
    }

    private void c() {
        ArrayList arrayList = new ArrayList();
        for (String str : b()) {
            if (checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() != 0) {
            this.f25222b = (String[]) arrayList.toArray(new String[arrayList.size()]);
            b(this.f25222b);
            return;
        }
        e.a("PushSelfShowLog", "unsatisfiedPermissions size is 0, finish");
        finish();
    }

    /* access modifiers changed from: protected */
    public String[] a() {
        return f25219a;
    }

    /* access modifiers changed from: protected */
    public String[] b() {
        return f25219a;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (1357 == i) {
            if (i2 == 0) {
                try {
                    e.b("PushSelfShowLog", "onActivityResult: RESULT_CANCELED");
                } catch (Exception e2) {
                    e.c("PushSelfShowLog", e2.toString(), e2);
                    return;
                }
            } else if (-1 == i2) {
                e.b("PushSelfShowLog", "onActivityResult: RESULT_OK");
                if (!(this.f25222b == null || this.f25222b.length == 0 || !a(this.f25222b))) {
                    e.b("PushSelfShowLog", "onActivityResult: Permission is granted");
                    e.b("PushSelfShowLog", "mCacheIntents size: " + f25220c.size());
                    for (Intent onReceive : f25220c) {
                        new SelfShowReceiver().onReceive(this, onReceive);
                    }
                }
            }
        }
        f25221d = false;
        f25220c.clear();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        e.a((Context) this);
        e.b("PushSelfShowLog", "enter RequestPermissionsActivity onCreate");
        requestWindowFeature(1);
        Intent intent = getIntent();
        if (intent == null) {
            str = "PushSelfShowLog";
            str2 = "enter RequestPermissionsActivity onCreate, intent is null, finish";
        } else if (Build.VERSION.SDK_INT < 23) {
            str = "PushSelfShowLog";
            str2 = "enter RequestPermissionsActivity onCreate, SDK version is less than 23, finish";
        } else {
            try {
                if (intent.getExtras() != null) {
                    Intent intent2 = (Intent) intent.getExtras().get("previous_intent");
                    e.a("PushSelfShowLog", "mCacheIntents size is " + f25220c.size());
                    if (f25220c.size() >= 30) {
                        f25220c.remove(0);
                    }
                    f25220c.add(intent2);
                }
            } catch (Exception e2) {
                e.c("PushSelfShowLog", e2.toString(), e2);
            }
            e.a("PushSelfShowLog", "savedInstanceState is " + bundle);
            if (bundle == null) {
                c();
            }
            return;
        }
        e.b(str, str2);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        e.a("PushSelfShowLog", "enter RequestPermissionsActivity onDestroy");
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        e.a("PushSelfShowLog", "enter RequestPermissionsActivity onNewIntent");
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        e.a("PushSelfShowLog", "RequestPermissionsActivity onPause");
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        e.b("PushSelfShowLog", "RequestPermissionsActivity onRequestPermissionsResult");
        if (1357 == i && strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0 && a(strArr, iArr)) {
            for (Intent onReceive : f25220c) {
                new SelfShowReceiver().onReceive(this, onReceive);
            }
        }
        f25221d = false;
        f25220c.clear();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        e.a("PushSelfShowLog", "RequestPermissionsActivity onStop");
        super.onStop();
    }
}
