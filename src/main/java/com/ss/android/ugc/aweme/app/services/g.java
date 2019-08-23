package com.ss.android.ugc.aweme.app.services;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.aweme.AwemeSoLoader;
import com.bytedance.neverland.Config;
import com.bytedance.neverland.Neverland;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.q.c;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2686a;

    public static boolean a(Application application) {
        Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2}, null, f2686a, true, 23601, new Class[]{Application.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{application2}, null, f2686a, true, 23601, new Class[]{Application.class}, Boolean.TYPE)).booleanValue();
        }
        SharedPreferences a2 = c.a(application2, "NEVERLAND_STORE", 0);
        String string = a2.getString("random_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString() + "-" + new Random().nextInt();
            a2.edit().putString("random_id", string).apply();
        }
        String str = "1128";
        try {
            str = String.valueOf(application.getPackageManager().getApplicationInfo(application.getPackageName(), SearchJediMixFeedAdapter.f42517f).metaData.getInt("UPDATE_VERSION_CODE"));
        } catch (Exception unused) {
        }
        Config host = new Config() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f2687a;

            public final void loadLibrary(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f2687a, false, 23604, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f2687a, false, 23604, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                AwemeSoLoader.loadLibrary(str);
            }
        }.setAppId(1128).setRandomId(string).setDeviceId(c.a(application2, "applog_stats", 0).getString("device_id", "1128")).setDetailVersion(str).setHost("http://aweme.snssdk.com");
        Neverland instance = Neverland.getInstance();
        instance.setUp(application2, host);
        return instance.isTooMuchNativeCrash();
    }

    public static void a(long j, boolean z, String str, JSONObject jSONObject) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), str, null}, null, f2686a, true, 23602, new Class[]{Long.TYPE, Boolean.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), Byte.valueOf(z), str, null};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f2686a, true, 23602, new Class[]{Long.TYPE, Boolean.TYPE, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Neverland.getInstance().setMultiDexInfo(j, z, str, null);
    }
}
