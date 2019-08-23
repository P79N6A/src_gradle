package android.support.v4.app;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccessibilityUtil {

    public interface AccessibilityDelegateCallBack {
        void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);
    }

    public static boolean isAccessibilityEnabled(Context context) {
        if (context == null) {
            return false;
        }
        try {
            boolean isEnabled = ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
            boolean isScreenReaderActive = isScreenReaderActive(context);
            if (!isEnabled || !isScreenReaderActive) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isScreenReaderActive(Context context) {
        Intent intent = new Intent("android.accessibilityservice.AccessibilityService");
        intent.addCategory("android.accessibilityservice.category.FEEDBACK_SPOKEN");
        boolean z = false;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 15) {
            ContentResolver contentResolver = context.getContentResolver();
            Iterator<ResolveInfo> it2 = queryIntentServices.iterator();
            while (it2.hasNext()) {
                Cursor query = contentResolver.query(Uri.parse("content://" + it2.next().serviceInfo.packageName + ".providers.StatusProvider"), null, null, null, null);
                if (query != null && query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    if (i == 1) {
                        return true;
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            for (ResolveInfo next : queryIntentServices) {
                z |= isAccessibilitySettingsOn(context, next.serviceInfo.packageName + "/" + next.serviceInfo.name);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningServices(Integer.MAX_VALUE)) {
                arrayList.add(runningServiceInfo.service.getPackageName());
            }
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (arrayList.contains(resolveInfo.serviceInfo.packageName)) {
                    z |= true;
                }
            }
        }
        return z;
    }

    public static void setAccessibilityDelegate(View view, final AccessibilityDelegateCallBack accessibilityDelegateCallBack) {
        if (view != null) {
            ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() {
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    if (accessibilityDelegateCallBack != null) {
                        accessibilityDelegateCallBack.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    }
                }
            });
        }
    }

    private static boolean isAccessibilitySettingsOn(Context context, String str) {
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services");
        if (string != null) {
            simpleStringSplitter.setString(string);
            while (simpleStringSplitter.hasNext()) {
                if (simpleStringSplitter.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
