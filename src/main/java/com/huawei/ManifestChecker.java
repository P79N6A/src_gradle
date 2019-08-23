package com.huawei;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.a;
import com.ss.android.message.b.f;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ManifestChecker {
    ManifestChecker() {
    }

    static boolean checkManifest(String str, Context context) throws PackageManager.NameNotFoundException {
        return checkComponents(context, str) & checkKeys(str, context);
    }

    private static boolean checkKeys(String str, Context context) throws PackageManager.NameNotFoundException {
        List<String> singletonList = Collections.singletonList("APPKEY");
        if (PatchProxy.isSupport(new Object[]{context, str, "HWPush", singletonList}, null, f.f29975a, true, 18149, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str, "HWPush", singletonList}, null, f.f29975a, true, 18149, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
        }
        if (f.f29976b == null) {
            f.f29976b = context.getPackageManager().getPackageInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f).applicationInfo.metaData;
        }
        if ((f.f29976b == null || f.f29976b.isEmpty()) && !singletonList.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : singletonList) {
            if (f.f29976b == null || !f.f29976b.containsKey(str2)) {
                arrayList.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean checkComponents(Context context, String str) throws PackageManager.NameNotFoundException {
        a.C0361a d2 = a.C0361a.d("com.huawei.android.pushagent.PushEventReceiver");
        a.C0361a a2 = d2.a(context.getPackageName() + ":pushservice").a(new a.b(Arrays.asList(new String[]{"com.huawei.android.push.intent.REFRESH_PUSH_CHANNEL", "com.huawei.intent.action.PUSH", "com.huawei.intent.action.PUSH_ON", "com.huawei.android.push.PLUGIN"})));
        List asList = Arrays.asList(new String[]{"android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_REMOVED"});
        a.C0361a d3 = a.C0361a.d("com.huawei.android.pushagent.PushBootReceiver");
        boolean c2 = f.c(context, str, "HWPush", Arrays.asList(new a[]{a.C0361a.d("com.huawei.push.service.receivers.HWPushMessageHandler").a(context.getPackageName()).a(new a.b(Arrays.asList(new String[]{"com.huawei.android.push.intent.REGISTRATION", "com.huawei.android.push.intent.RECEIVE", "com.huawei.android.push.intent.CLICK", "com.huawei.intent.action.PUSH_STATE"}))).f29961b, a2.a(new a.b(asList, null, Uri.parse("package://" + context.getPackageName()))).f29961b, d3.a(context.getPackageName() + ":pushservice").a(new a.b(Arrays.asList(new String[]{"com.huawei.android.push.intent.REGISTER", "android.net.conn.CONNECTIVITY_CHANGE"}))).f29961b}));
        a.C0361a d4 = a.C0361a.d("com.huawei.android.pushagent.PushService");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(":pushservice");
        boolean b2 = f.b(context, str, "HWPush", Arrays.asList(new a[]{d4.a(sb.toString()).f29961b}));
        boolean d5 = f.d(context, str, "HWPush", Arrays.asList(new a[]{a.C0361a.d("com.huawei.android.pushagent.permission.PermissionsMgrActivity").a(context.getPackageName()).f29961b}));
        if (!b2 || !c2 || !d5) {
            return false;
        }
        return true;
    }
}
