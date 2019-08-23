package com.huawei.android.pushagent.permission;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.tools.b;
import java.util.ArrayList;
import java.util.Arrays;

public class PermissionsMgrActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f25108a = {"android.permission.READ_PHONE_STATE"};

    /* renamed from: b  reason: collision with root package name */
    private Intent f25109b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f25110c = new String[0];

    public static void a(Context context, Intent intent) {
        e.b("PushLogAC2815", "enter startPermissionActivity");
        if (context != null) {
            Intent intent2 = new Intent(context.getApplicationContext(), PermissionsMgrActivity.class);
            intent2.addFlags(276824064);
            if (intent != null) {
                intent2.putExtra("previous_intent", intent);
            }
            try {
                context.startActivity(intent2);
            } catch (ActivityNotFoundException e2) {
                e.c("PushLogAC2815", e2.toString(), e2);
            }
        }
    }

    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 23 && !a(context, f25108a);
    }

    protected static boolean a(Context context, String[] strArr) {
        if (context == null || strArr == null || strArr.length == 0) {
            return false;
        }
        for (String checkSelfPermission : strArr) {
            if (context.checkSelfPermission(checkSelfPermission) != 0) {
                e.a("PushLogAC2815", checkSelfPermission + " need request");
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
                e.b("PushLogAC2815", "request permissions failed:" + strArr[i]);
                return false;
            }
        }
        e.b("PushLogAC2815", "request all permissions success:");
        return true;
    }

    private boolean a(String[] strArr, int[] iArr) {
        int i = 0;
        while (i < strArr.length) {
            if (iArr[i] == 0 || !a(strArr[i])) {
                i++;
            } else {
                e.a("PushLogAC2815", "request permissions failed:" + strArr[i]);
                return false;
            }
        }
        e.a("PushLogAC2815", "request all permissions success");
        return true;
    }

    private void b(String[] strArr) {
        try {
            Intent intent = new Intent("huawei.intent.action.REQUEST_PERMISSIONS");
            intent.setPackage("com.huawei.systemmanager");
            intent.putExtra("KEY_HW_PERMISSION_ARRAY", strArr);
            intent.putExtra("KEY_HW_PERMISSION_PKG", getPackageName());
            if (a.a((Context) this, "com.huawei.systemmanager", intent).booleanValue()) {
                try {
                    e.b("PushLogAC2815", "checkAndRequestPermission: systemmanager permission activity is exist");
                    startActivityForResult(intent, 1357);
                } catch (Exception e2) {
                    e.c("PushLogAC2815", "checkAndRequestPermission: Exception", e2);
                    requestPermissions(strArr, 1357);
                }
                return;
            }
            e.b("PushLogAC2815", "checkAndRequestPermission: systemmanager permission activity is not exist");
            requestPermissions(strArr, 1357);
        } catch (Exception e3) {
            e.c("PushLogAC2815", e3.toString(), e3);
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
            this.f25110c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            b(this.f25110c);
            return;
        }
        e.a("PushLogAC2815", "unsatisfiedPermissions size is 0, finish");
        finish();
    }

    /* access modifiers changed from: protected */
    public String[] a() {
        return f25108a;
    }

    /* access modifiers changed from: protected */
    public String[] b() {
        return f25108a;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (1357 == i) {
            if (i2 == 0) {
                try {
                    e.b("PushLogAC2815", "onActivityResult: RESULT_CANCELED");
                } catch (Exception e2) {
                    e.c("PushLogAC2815", e2.toString(), e2);
                    return;
                }
            } else if (-1 == i2) {
                e.b("PushLogAC2815", "onActivityResult: RESULT_OK");
                if (!(this.f25110c == null || this.f25110c.length == 0 || !a(this.f25110c))) {
                    e.b("PushLogAC2815", "onActivityResult: Permission is granted");
                    b.a((Context) this, this.f25109b);
                }
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        e.a((Context) this);
        e.b("PushLogAC2815", "enter RequestPermissionsActivity onCreate");
        requestWindowFeature(1);
        Intent intent = getIntent();
        if (intent == null) {
            str = "PushLogAC2815";
            str2 = "enter RequestPermissionsActivity onCreate, intent is null, finish";
        } else if (Build.VERSION.SDK_INT < 23) {
            str = "PushLogAC2815";
            str2 = "enter RequestPermissionsActivity onCreate, SDK version is less than 23, finish";
        } else {
            try {
                if (intent.getExtras() != null) {
                    this.f25109b = (Intent) intent.getExtras().get("previous_intent");
                }
            } catch (Exception e2) {
                e.c("PushLogAC2815", e2.toString(), e2);
            }
            e.a("PushLogAC2815", "savedInstanceState is " + bundle);
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
        e.a("PushLogAC2815", "enter RequestPermissionsActivity onDestroy");
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        e.a("PushLogAC2815", "enter RequestPermissionsActivity onNewIntent");
        super.onNewIntent(intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        e.b("PushLogAC2815", "RequestPermissionsActivity onRequestPermissionsResult");
        if (1357 == i && strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0 && a(strArr, iArr) && this.f25109b != null) {
            b.a((Context) this, this.f25109b);
        }
        finish();
    }
}
