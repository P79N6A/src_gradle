package com.ss.android.pushmanager.thirdparty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.a;
import com.ss.android.message.b.f;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PushManager implements IPushAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile PushManager sPushManager;
    private Map<Integer, a> mPush3rdTypeMap = new HashMap();
    @SuppressLint({"UseSparseArrays"})
    private Map<Integer, IPushAdapter> mPushAdapterMap;

    public static PushManager inst() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 19293, new Class[0], PushManager.class)) {
            return (PushManager) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 19293, new Class[0], PushManager.class);
        }
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                if (sPushManager == null) {
                    sPushManager = new PushManager();
                }
            }
        }
        return sPushManager;
    }

    private PushManager() {
        this.mPush3rdTypeMap.put(14, new a(14, "com.adm.push.AdmPushAdapter"));
        this.mPush3rdTypeMap.put(5, new a(5, "com.fcm.FcmPushAdapter"));
        this.mPush3rdTypeMap.put(1, new a(1, "com.xiaomi.MiPushAdapter"));
        this.mPush3rdTypeMap.put(6, new a(6, "com.umeng.UmengPushAdapter"));
        this.mPush3rdTypeMap.put(7, new a(7, "com.huawei.HWPushAdapter"));
        this.mPush3rdTypeMap.put(8, new a(8, "com.meizu.MzPushAdapter"));
        this.mPush3rdTypeMap.put(10, new a(10, "com.coloros.OppoPushAdapter"));
        this.mPush3rdTypeMap.put(11, new a(11, "com.vivo.VivoPushAdapter"));
        this.mPushAdapterMap = new HashMap();
    }

    private void tryResolveImpl(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19294, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19294, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!this.mPushAdapterMap.containsKey(Integer.valueOf(i))) {
            a aVar = this.mPush3rdTypeMap.get(Integer.valueOf(i));
            String str = null;
            if (aVar != null) {
                str = aVar.f30590b;
            }
            if (!StringUtils.isEmpty(str)) {
                try {
                    Object newInstance = Class.forName(str).newInstance();
                    if (newInstance instanceof IPushAdapter) {
                        this.mPushAdapterMap.put(Integer.valueOf(i), (IPushAdapter) newInstance);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean isPushAvailable(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19295, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19295, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                return iPushAdapter.isPushAvailable(context, i);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void registerPush(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19296, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19296, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                d.a(i);
                iPushAdapter.registerPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    public void unregisterPush(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19298, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19298, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.unregisterPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        String str3 = str;
        Context context2 = context;
        boolean z6 = false;
        if (PatchProxy.isSupport(new Object[]{str3, context2}, this, changeQuickRedirect, false, 19300, new Class[]{String.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, context2}, this, changeQuickRedirect, false, 19300, new Class[]{String.class, Context.class}, Boolean.TYPE)).booleanValue();
        }
        boolean z7 = true;
        for (Integer next : this.mPush3rdTypeMap.keySet()) {
            tryResolveImpl(next.intValue());
            IPushAdapter iPushAdapter = this.mPushAdapterMap.get(next);
            if (iPushAdapter != null) {
                try {
                    z7 &= iPushAdapter.checkThirdPushConfig(str3, context2);
                } catch (Throwable unused) {
                    z7 = false;
                }
            }
        }
        try {
            Set<Integer> keySet = this.mPushAdapterMap.keySet();
            if (PatchProxy.isSupport(new Object[]{context2, str3, keySet}, null, e.f30554a, true, 18929, new Class[]{Context.class, String.class, Set.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3, keySet}, null, e.f30554a, true, 18929, new Class[]{Context.class, String.class, Set.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (PatchProxy.isSupport(new Object[]{context2, str3, keySet}, null, e.f30554a, true, 18933, new Class[]{Context.class, String.class, Set.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3, keySet}, null, e.f30554a, true, 18933, new Class[]{Context.class, String.class, Set.class}, Boolean.TYPE)).booleanValue();
                } else {
                    a.C0361a d2 = a.C0361a.d("com.ss.android.message.NotifyService");
                    a.C0361a d3 = a.C0361a.d("com.ss.android.message.NotifyIntentService");
                    a.C0361a d4 = a.C0361a.d("com.ss.android.message.PushJobService");
                    a.C0361a d5 = a.C0361a.d("com.ss.android.message.log.LogService");
                    a.C0361a d6 = a.C0361a.d("com.ss.android.push.daemon.PushService");
                    a.C0361a d7 = a.C0361a.d("com.baidu.android.pushservice.CommandService");
                    a.C0361a d8 = a.C0361a.d("com.igexin.sdk.PushService");
                    boolean b2 = f.b(context2, str3, "Push", Arrays.asList(new a[]{d2.a(context.getPackageName() + ":push").a(new a.b(Arrays.asList(new String[]{"com.ss.android.message.action.PUSH_SERVICE"}))).f29961b, d3.a(context.getPackageName() + ":push").f29961b, d4.a(context.getPackageName() + ":push").b("android.permission.BIND_JOB_SERVICE").f29961b, d5.a(context.getPackageName() + ":push").f29961b, d6.a(context.getPackageName() + ":pushservice").f29961b, a.C0361a.d("com.ss.android.push.DefaultService").a(context.getPackageName()).f29961b, d7.a(context.getPackageName() + ":push").f29961b, d8.a(context.getPackageName() + ":push").a(new a.b(Arrays.asList(new String[]{"com.igexin.sdk.action.service.message"}))).f29961b}));
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add("com.ss.android.message");
                    if (keySet != null) {
                        for (Integer intValue : keySet) {
                            int intValue2 = intValue.intValue();
                            if (intValue2 == 1) {
                                str2 = "com.ss.android.xiaomi.message";
                            } else if (intValue2 != 14) {
                                switch (intValue2) {
                                    case 5:
                                        str2 = "com.ss.android.fcm.message";
                                        break;
                                    case 6:
                                        str2 = "com.ss.android.umeng.message";
                                        break;
                                    case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*7*/:
                                        str2 = "com.ss.android.hw.message";
                                        break;
                                    case 8:
                                        str2 = "com.ss.android.mz.message";
                                        break;
                                    default:
                                        switch (intValue2) {
                                            case 10:
                                                str2 = "com.ss.android.oppo.message";
                                                break;
                                            case 11:
                                                str2 = "com.ss.android.vivo.message";
                                                break;
                                            default:
                                                throw new IllegalArgumentException("not supported push channel");
                                        }
                                }
                            } else {
                                str2 = "com.ss.android.adm.message";
                            }
                            arrayList.add(str2);
                        }
                    }
                    boolean z8 = true;
                    for (String action : arrayList) {
                        Intent intent = new Intent();
                        intent.setPackage(context.getPackageName());
                        intent.setAction(action);
                        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            z8 = false;
                        }
                    }
                    if (!b2 || !z8) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                if (PatchProxy.isSupport(new Object[]{context2, str3}, null, e.f30554a, true, 18932, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3}, null, e.f30554a, true, 18932, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    a.C0361a d9 = a.C0361a.d("com.ss.android.message.MessageReceiver");
                    a.C0361a a2 = d9.a(context.getPackageName() + ":push").a(new a.b(Arrays.asList(new String[]{"android.intent.action.BOOT_COMPLETED", "android.net.conn.CONNECTIVITY_CHANGE", "android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_UNMOUNTED", "android.intent.action.USER_PRESENT", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED"})));
                    List asList = Arrays.asList(new String[]{"android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_REMOVED"});
                    a.C0361a d10 = a.C0361a.d("com.ss.android.push.daemon.PushReceiver");
                    a.C0361a d11 = a.C0361a.d("com.baidu.android.pushservice.RegistrationReceiver");
                    a.C0361a a3 = d11.a(context.getPackageName() + ":push").a(new a.b(Arrays.asList(new String[]{"com.baidu.android.pushservice.action.METHOD", "com.baidu.android.pushservice.action.BIND_SYNC"})));
                    List asList2 = Arrays.asList(new String[]{"android.intent.action.PACKAGE_REMOVED"});
                    a.C0361a d12 = a.C0361a.d("com.igexin.sdk.PushReceiver");
                    a.C0361a d13 = a.C0361a.d("com.ss.android.message.sswo.SswoReceiver");
                    z3 = f.c(context2, str3, "Push", Arrays.asList(new a[]{a2.a(new a.b(asList, null, Uri.parse("package://" + context.getPackageName()))).f29961b, d10.a(context.getPackageName() + ":pushservice").f29961b, a3.a(new a.b(asList2, null, Uri.parse("package://" + context.getPackageName()))).f29961b, d12.a(context.getPackageName() + ":push").a(new a.b(Arrays.asList(new String[]{"com.igexin.sdk.action.refreshls"}))).f29961b, a.C0361a.d("com.ss.android.push.DefaultReceiver").a(context.getPackageName()).f29961b, d13.a(context.getPackageName() + ":push").a(new a.b(Arrays.asList(new String[]{"android.intent.action.USER_PRESENT", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON"}))).f29961b}));
                }
                boolean z9 = z2 & z3;
                if (PatchProxy.isSupport(new Object[]{context2, str3}, null, e.f30554a, true, 18931, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                    z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3}, null, e.f30554a, true, 18931, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    a.C0361a d14 = a.C0361a.d("com.ss.android.message.sswo.SswoActivity");
                    z4 = f.d(context2, str3, "Push", Arrays.asList(new a[]{d14.a(context.getPackageName() + ":push").f29961b}));
                }
                boolean z10 = z9 & z4;
                if (PatchProxy.isSupport(new Object[]{context2, str3}, null, e.f30554a, true, 18930, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                    z5 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3}, null, e.f30554a, true, 18930, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    a.C0361a a4 = a.C0361a.d("com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider").a(context.getPackageName());
                    z5 = f.e(context2, str3, "Push", Arrays.asList(new a[]{a4.c(context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY").f29961b}));
                }
                z = z10 & z5;
            }
            z6 = z7 & z;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return z6;
    }

    public void setAlias(Context context, String str, int i) {
        Context context2 = context;
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19297, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19297, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        tryResolveImpl(i2);
        IPushAdapter iPushAdapter = this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.setAlias(context2, str2, i2);
            } catch (Throwable unused) {
            }
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        Context context2 = context;
        int i2 = i;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 19299, new Class[]{Context.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 19299, new Class[]{Context.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        tryResolveImpl(i2);
        IPushAdapter iPushAdapter = this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.trackPush(context2, i2, obj2);
            } catch (Throwable unused) {
            }
        }
    }
}
