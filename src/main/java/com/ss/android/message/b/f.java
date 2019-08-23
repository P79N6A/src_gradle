package com.ss.android.message.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29975a;

    /* renamed from: b  reason: collision with root package name */
    public static Bundle f29976b;

    /* renamed from: c  reason: collision with root package name */
    private static List<String> f29977c;

    /* renamed from: d  reason: collision with root package name */
    private static List<ServiceInfo> f29978d;

    /* renamed from: e  reason: collision with root package name */
    private static List<ActivityInfo> f29979e;

    /* renamed from: f  reason: collision with root package name */
    private static List<ActivityInfo> f29980f;
    private static List<ProviderInfo> g;

    private static List<String> a(Context context) throws PackageManager.NameNotFoundException {
        if (PatchProxy.isSupport(new Object[]{context}, null, f29975a, true, 18147, new Class[]{Context.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{context}, null, f29975a, true, 18147, new Class[]{Context.class}, List.class);
        }
        if (f29977c == null) {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                f29977c = Arrays.asList(strArr);
            }
        }
        return f29977c;
    }

    private static boolean a(Context context, String str, a.b bVar, String str2) {
        String str3 = str;
        a.b bVar2 = bVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context, str3, bVar2, str4}, null, f29975a, true, 18152, new Class[]{Context.class, String.class, a.b.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str3, bVar2, str4}, null, f29975a, true, 18152, new Class[]{Context.class, String.class, a.b.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar2.f29964c != null) {
            for (String addCategory : bVar2.f29964c) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str4);
        if (bVar2.f29965d != null) {
            intent.setData(bVar2.f29965d);
        }
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 64);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (next.activityInfo != null && TextUtils.equals(next.activityInfo.name, str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(Context context, String str, a.b bVar, String str2) {
        String str3 = str;
        a.b bVar2 = bVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context, str3, bVar2, str4}, null, f29975a, true, 18153, new Class[]{Context.class, String.class, a.b.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str3, bVar2, str4}, null, f29975a, true, 18153, new Class[]{Context.class, String.class, a.b.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar2.f29964c != null) {
            for (String addCategory : bVar2.f29964c) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str4);
        if (bVar2.f29965d != null) {
            intent.setData(bVar2.f29965d);
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            for (ResolveInfo next : queryIntentServices) {
                if (next.serviceInfo != null && (TextUtils.isEmpty(str) || TextUtils.equals(next.serviceInfo.name, str3))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean c(Context context, String str, a.b bVar, String str2) {
        String str3 = str;
        a.b bVar2 = bVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context, str3, bVar2, str4}, null, f29975a, true, 18154, new Class[]{Context.class, String.class, a.b.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str3, bVar2, str4}, null, f29975a, true, 18154, new Class[]{Context.class, String.class, a.b.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar2.f29964c != null) {
            for (String addCategory : bVar2.f29964c) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str4);
        if (bVar2.f29965d != null) {
            intent.setData(bVar2.f29965d);
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            for (ResolveInfo next : queryIntentActivities) {
                if (next.activityInfo != null && TextUtils.equals(next.activityInfo.name, str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context, String str, String str2, List<String> list) throws PackageManager.NameNotFoundException {
        if (PatchProxy.isSupport(new Object[]{context, str, str2, list}, null, f29975a, true, 18148, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str, str2, list}, null, f29975a, true, 18148, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
        }
        List<String> a2 = a(context);
        if (a2 == null || a2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (!a2.contains(next)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context, String str, String str2, List<a> list) throws PackageManager.NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2, list}, null, f29975a, true, 18150, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)) {
            Object[] objArr = {context2, str, str2, list};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f29975a, true, 18150, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (list == null || list.isEmpty()) {
            return true;
        } else {
            if (f29978d == null) {
                ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services;
                if (serviceInfoArr != null) {
                    f29978d = Arrays.asList(serviceInfoArr);
                }
            }
            if (f29978d == null || f29978d.size() == 0) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            boolean z4 = true;
            for (a next : list) {
                Iterator<ServiceInfo> it2 = f29978d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = z4;
                        z2 = false;
                        break;
                    }
                    ServiceInfo next2 = it2.next();
                    if (TextUtils.equals(next2.name, next.f29954c)) {
                        boolean equals = TextUtils.equals(next.f29955d, next2.processName);
                        if (!TextUtils.isEmpty(next.f29956e)) {
                            z3 = TextUtils.equals(next2.permission, next.f29956e);
                        } else {
                            z3 = true;
                        }
                        if (!equals) {
                            z4 = false;
                        }
                        if (!z3) {
                            z4 = false;
                        }
                        if (next.f29953b != null) {
                            boolean z5 = true;
                            for (a.b next3 : next.f29953b) {
                                if (next3.f29963b != null) {
                                    for (String b2 : next3.f29963b) {
                                        if (!b(context2, next.f29954c, next3, b2)) {
                                            z5 = false;
                                        }
                                    }
                                }
                            }
                            if (!z5) {
                                z4 = false;
                            }
                        }
                        z = z4;
                        z2 = true;
                    }
                }
                if (!z2) {
                    arrayList.add(next);
                }
                z4 = z;
            }
            arrayList.isEmpty();
            if (!z4 || !arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    public static boolean c(Context context, String str, String str2, List<a> list) throws PackageManager.NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2, list}, null, f29975a, true, 18151, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)) {
            Object[] objArr = {context2, str, str2, list};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f29975a, true, 18151, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (list == null || list.isEmpty()) {
            return true;
        } else {
            if (f29979e == null) {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 514).receivers;
                if (activityInfoArr != null) {
                    f29979e = Arrays.asList(activityInfoArr);
                }
            }
            if (f29979e == null || f29979e.size() == 0) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            boolean z4 = true;
            for (a next : list) {
                Iterator<ActivityInfo> it2 = f29979e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = z4;
                        z2 = false;
                        break;
                    }
                    ActivityInfo next2 = it2.next();
                    if (TextUtils.equals(next2.name, next.f29954c)) {
                        if (!TextUtils.equals(next.f29955d, next2.processName)) {
                            z4 = false;
                        }
                        if (!TextUtils.isEmpty(next.f29956e)) {
                            z3 = TextUtils.equals(next2.permission, next.f29956e);
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            z4 = false;
                        }
                        if (next.f29953b != null) {
                            boolean z5 = true;
                            for (a.b next3 : next.f29953b) {
                                if (next3.f29963b != null) {
                                    for (String a2 : next3.f29963b) {
                                        if (!a(context2, next.f29954c, next3, a2)) {
                                            z5 = false;
                                        }
                                    }
                                }
                            }
                            if (!z5) {
                                z4 = false;
                            }
                        }
                        z = z4;
                        z2 = true;
                    }
                }
                if (!z2) {
                    arrayList.add(next);
                }
                z4 = z;
            }
            arrayList.isEmpty();
            if (!z4 || !arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    public static boolean d(Context context, String str, String str2, List<a> list) throws PackageManager.NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2, list}, null, f29975a, true, 18155, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)) {
            Object[] objArr = {context2, str, str2, list};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f29975a, true, 18155, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (list == null || list.isEmpty()) {
            return true;
        } else {
            if (f29980f == null) {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 513).activities;
                if (activityInfoArr != null) {
                    f29980f = Arrays.asList(activityInfoArr);
                }
            }
            if (f29980f == null || f29980f.size() == 0) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            boolean z4 = true;
            for (a next : list) {
                Iterator<ActivityInfo> it2 = f29980f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = z4;
                        z2 = false;
                        break;
                    }
                    ActivityInfo next2 = it2.next();
                    if (TextUtils.equals(next2.name, next.f29954c)) {
                        if (!TextUtils.equals(next.f29955d, next2.processName)) {
                            z4 = false;
                        }
                        if (!TextUtils.isEmpty(next.f29956e)) {
                            z3 = TextUtils.equals(next2.permission, next.f29956e);
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            z4 = false;
                        }
                        if (next.f29953b != null) {
                            boolean z5 = true;
                            for (a.b next3 : next.f29953b) {
                                if (next3.f29963b != null) {
                                    for (String c2 : next3.f29963b) {
                                        if (!c(context2, next.f29954c, next3, c2)) {
                                            z5 = false;
                                        }
                                    }
                                }
                            }
                            if (!z5) {
                                z4 = false;
                            }
                        }
                        z = z4;
                        z2 = true;
                    }
                }
                if (!z2) {
                    arrayList.add(next);
                }
                z4 = z;
            }
            arrayList.isEmpty();
            if (!z4 || !arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    public static boolean e(Context context, String str, String str2, List<a> list) throws PackageManager.NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, list}, null, f29975a, true, 18156, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str, str2, list}, null, f29975a, true, 18156, new Class[]{Context.class, String.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (list == null || list.isEmpty()) {
            return true;
        } else {
            if (g == null) {
                ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 520).providers;
                if (providerInfoArr != null) {
                    g = Arrays.asList(providerInfoArr);
                }
            }
            if (g == null || g.size() == 0) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            boolean z4 = true;
            for (a next : list) {
                Iterator<ProviderInfo> it2 = g.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = z4;
                        z2 = false;
                        break;
                    }
                    ProviderInfo next2 = it2.next();
                    if (TextUtils.equals(next2.name, next.f29954c)) {
                        if (!TextUtils.equals(next.f29955d, next2.processName)) {
                            z4 = false;
                        }
                        if (!TextUtils.isEmpty(next.f29957f)) {
                            z3 = TextUtils.equals(next2.authority, next.f29957f);
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            z2 = true;
                            z = false;
                        } else {
                            z = z4;
                            z2 = true;
                        }
                    }
                }
                if (!z2) {
                    arrayList.add(next);
                }
                z4 = z;
            }
            arrayList.isEmpty();
            if (!z4 || !arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
    }
}
