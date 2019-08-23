package com.ss.android.ugc.aweme.util;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.a.a.a;
import com.bytedance.a.a.b;
import com.bytedance.a.a.e;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.util.crony.c;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75427a;

    /* renamed from: b  reason: collision with root package name */
    private static e f75428b = e.f75431a;

    /* renamed from: c  reason: collision with root package name */
    private static a f75429c = f.f75432a;

    public static IDebugBoxService a() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87777, new Class[0], IDebugBoxService.class)) {
            return (IDebugBoxService) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87777, new Class[0], IDebugBoxService.class);
        }
        return (IDebugBoxService) ServiceManager.get().getService(IDebugBoxService.class);
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87778, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87778, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.g.a.a() || f()) {
            return true;
        }
        return false;
    }

    public static String c() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87787, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87787, new Class[0], String.class);
        }
        if (com.ss.android.g.a.b()) {
            return "musical.ly";
        }
        if (com.ss.android.g.a.c()) {
            return "tiktok";
        }
        return "抖音";
    }

    private static String d() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87788, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87788, new Class[0], String.class);
        }
        if (com.ss.android.g.a.a()) {
            return BuildConfig.VERSION_NAME.substring(0, BuildConfig.VERSION_NAME.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR));
        }
        return BuildConfig.VERSION_NAME;
    }

    private static String e() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87789, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87789, new Class[0], String.class);
        }
        if (com.ss.android.g.a.b()) {
            return "[Android][M]";
        }
        if (com.ss.android.g.a.c()) {
            return "[Android][T]";
        }
        return "[Android][D]";
    }

    private static boolean f() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87790, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87790, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return TextUtils.equals(com.ss.android.ugc.aweme.framework.core.a.b().f3304b, "lark_inhouse");
    }

    private static boolean g() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87791, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87791, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return TextUtils.equals(com.ss.android.ugc.aweme.framework.core.a.b().f3304b, "local_test");
    }

    private static List<String> i() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87793, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87793, new Class[0], List.class);
        }
        return new ArrayList();
    }

    private static List<String> h() {
        if (PatchProxy.isSupport(new Object[0], null, f75427a, true, 87792, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f75427a, true, 87792, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
        arrayList.add("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity");
        arrayList.add("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity");
        arrayList.add("com.ss.android.ugc.aweme.live.LiveFeedActivity");
        return arrayList;
    }

    public static void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f75427a, true, 87782, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f75427a, true, 87782, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (b()) {
            a().forceShowFloatingButton(activity2);
        }
    }

    public static void a(Application application) {
        final Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2}, null, f75427a, true, 87786, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2}, null, f75427a, true, 87786, new Class[]{Application.class}, Void.TYPE);
        } else if (ToolUtils.isMainProcess(application)) {
            if (b()) {
                String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
                String c2 = c();
                String d2 = d();
                String e2 = e();
                b bVar = new b("https://jira.bytedance.com/rest/api/2", "AME", "feedback2", "feedback2", 1128, c2, d2, e2, "\nDeviceId:" + AppLog.getServerDeviceId() + "\nVersion Name:7.5.0" + "\nVersion Code:750", str);
                com.bytedance.debugbox.base.a a2 = com.bytedance.debugbox.base.a.a(bVar, 1, 1128, BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE, false, false);
                a2.h = g() ^ true;
                a2.i = false;
                a2.k = false;
                a2.l = true;
                a2.m = h();
                a2.n = i();
                a2.j = false;
                a2.o = new com.bytedance.debugbox.base.b() {
                };
                a().initialize(application2, a2);
                a();
                a();
            }
            if (g()) {
                com.ss.android.ugc.aweme.util.crony.a.a(application);
                com.ss.android.ugc.aweme.util.crony.a.a((c) new com.ss.android.ugc.aweme.util.crony.b());
            }
        }
    }
}
