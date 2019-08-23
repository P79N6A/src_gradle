package com.ss.android.downloadlib;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.downloadad.api.a.c;
import com.ss.android.downloadlib.addownload.j;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.c.c;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements com.ss.android.downloadad.api.a {

    /* renamed from: a  reason: collision with root package name */
    public static String f28681a = "a";

    /* renamed from: f  reason: collision with root package name */
    private static a f28682f;

    /* renamed from: b  reason: collision with root package name */
    public ExecutorService f28683b = h.a(m.a(p.FIXED).a(1).a());

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f28684c = false;

    /* renamed from: d  reason: collision with root package name */
    public Set<String> f28685d = new CopyOnWriteArraySet();

    /* renamed from: e  reason: collision with root package name */
    private ExecutorService f28686e = Executors.newCachedThreadPool();

    /* renamed from: com.ss.android.downloadlib.a$a  reason: collision with other inner class name */
    class C0340a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final int f28694b;

        public final void run() {
            try {
                c.b(a.f28681a, "CheckAdEventRunnable start", null);
                SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0);
                Map<String, ?> all = a2.getAll();
                if (all != null && !all.isEmpty()) {
                    c.b(a.f28681a, "CheckAdEventRunnable map not empty", null);
                    SharedPreferences.Editor edit = a2.edit();
                    for (Map.Entry next : all.entrySet()) {
                        String str = (String) next.getValue();
                        String str2 = a.f28681a;
                        c.b(str2, "CheckAdEventRunnable value:" + str, null);
                        if (TextUtils.isEmpty(str)) {
                            String str3 = a.f28681a;
                            c.b(str3, "CheckAdEventRunnable map return" + str, null);
                            return;
                        }
                        c.b(a.f28681a, "CheckAdEventRunnable map next", null);
                        com.ss.android.downloadad.api.b.a a3 = com.ss.android.downloadad.api.b.a.a(new JSONObject(str));
                        if (a3 == null) {
                            edit.remove((String) next.getKey());
                            c.b(a.f28681a, "CheckAdEventRunnable map model == null", null);
                        } else {
                            c.b(a.f28681a, "CheckAdEventRunnable map trySendAndRefreshAdEvent", null);
                            a aVar = a.this;
                            String str4 = (String) next.getKey();
                            int i = this.f28694b;
                            String str5 = a.f28681a;
                            c.b(str5, "trySendAndRefreshAdEvent start key:" + str4, null);
                            if (!(a3 == null || edit == null)) {
                                if (!TextUtils.isEmpty(str4)) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    String str6 = a.f28681a;
                                    c.b(str6, "trySendAndRefreshAdEvent now:" + currentTimeMillis + ", download status: " + a3.f28653d + ", model timestamp:" + a3.i + ", adid:" + a3.f28650a, null);
                                    switch (a3.f28653d) {
                                        case 1:
                                            c.b(a.f28681a, "trySendAndRefreshAdEvent STATUS_START_DOWNLOAD start", null);
                                            if (currentTimeMillis - a3.i >= 259200000) {
                                                edit.remove(str4);
                                                c.b(a.f28681a, "trySendAndRefreshAdEvent STATUS_START_DOWNLOAD remove", null);
                                            }
                                            c.b(a.f28681a, "trySendAndRefreshAdEvent STATUS_START_DOWNLOAD end", null);
                                            break;
                                        case 2:
                                            c.b(a.f28681a, "trySendAndRefreshAdEvent STATUS_DOWNLOAD_FINISH start", null);
                                            if (currentTimeMillis - a3.i < 604800000) {
                                                String str7 = a3.f28654e;
                                                String str8 = a.f28681a;
                                                c.b(str8, "trySendAndRefreshAdEvent STATUS_DOWNLOAD_FINISH packageName:" + str7, null);
                                                if (TextUtils.isEmpty(str7)) {
                                                    edit.remove(str4);
                                                    c.b(a.f28681a, "trySendAndRefreshAdEvent STATUS_DOWNLOAD_FINISH romve", null);
                                                } else if (com.ss.android.downloadlib.c.k.a(a3)) {
                                                    j.a(k.l(), "install_finish", a3.h, a3.f28650a, a3.f28652c, a3.f28651b, a.a(a3, a.a(String.valueOf(a3.f28650a), a3.f28654e), i), 2);
                                                    edit.remove(str4);
                                                    com.ss.android.downloadlib.addownload.e.b.a(a3, k.a());
                                                    c.b(a.f28681a, "trySendAndRefreshAdEvent STATUS_DOWNLOAD_FINISH isInstalledApp", null);
                                                }
                                                c.b(a.f28681a, "trySendAndRefreshAdEvent STATUS_DOWNLOAD_FINISH end", null);
                                                break;
                                            } else {
                                                edit.remove(str4);
                                                c.b(a.f28681a, "trySendAndRefreshAdEvent STATUS_DOWNLOAD_FINISH return romve", null);
                                                break;
                                            }
                                    }
                                }
                            }
                            if (a3 == null) {
                                str4 = "null == model";
                            }
                            String str9 = a.f28681a;
                            c.b(str9, "trySendAndRefreshAdEvent " + str4 + ", return", null);
                        }
                    }
                    edit.apply();
                }
            } catch (Exception e2) {
                String str10 = a.f28681a;
                c.b(str10, "CheckAdEventRunnable exception:" + e2.getMessage(), null);
            }
            c.b(a.f28681a, "CheckAdEventRunnable end", null);
        }

        public C0340a(int i) {
            this.f28694b = i;
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final String f28699b;

        /* renamed from: c  reason: collision with root package name */
        private final String f28700c;

        /* renamed from: d  reason: collision with root package name */
        private final SharedPreferences f28701d;

        public final void run() {
            com.ss.android.downloadad.api.b.a aVar;
            try {
                String str = a.f28681a;
                c.b(str, "SendAndListenAdEventRunnable start adId:" + this.f28699b, null);
                a.this.f28684c = true;
                String string = this.f28701d.getString(this.f28699b, "");
                String str2 = a.f28681a;
                c.b(str2, "SendAndListenAdEventRunnable value:" + string + ", adId:" + this.f28699b, null);
                if (TextUtils.isEmpty(string)) {
                    c.b(a.f28681a, "SendAndListenAdEventRunnable value is empty", null);
                    a.this.f28684c = false;
                    return;
                }
                aVar = com.ss.android.downloadad.api.b.a.a(new JSONObject(string));
                c.b(a.f28681a, "SendAndListenAdEventRunnable next", null);
                if (aVar == null) {
                    c.b(a.f28681a, "SendAndListenAdEventRunnable model == null", null);
                    a.this.f28684c = false;
                    return;
                }
                String str3 = a.f28681a;
                c.b(str3, "SendAndListenAdEventRunnable model getPackageName: " + aVar.f28654e + ", mPackageName:" + this.f28700c, null);
                if (TextUtils.isEmpty(aVar.f28654e) && !TextUtils.isEmpty(this.f28700c)) {
                    aVar.f28654e = this.f28700c;
                }
                if (aVar.f28653d == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - aVar.i < 259200000) {
                        a.b(aVar);
                        aVar.f28653d = 2;
                        aVar.i = currentTimeMillis;
                        this.f28701d.edit().putString(String.valueOf(this.f28699b), aVar.a().toString()).apply();
                        a.this.a(aVar, this.f28701d);
                    } else {
                        this.f28701d.edit().remove(String.valueOf(this.f28699b)).apply();
                    }
                }
                String str4 = a.f28681a;
                c.b(str4, "SendAndListenAdEventRunnable model getPackageName: " + aVar.f28654e + ", mPackageName:" + this.f28700c, null);
                a.this.f28684c = false;
                c.b(a.f28681a, "SendAndListenAdEventRunnable end ", null);
            } catch (JSONException e2) {
                String str5 = a.f28681a;
                c.b(str5, "SendAndListenAdEventRunnable exception:" + e2.getMessage(), null);
                aVar = null;
            } catch (Throwable th) {
                a.this.f28684c = false;
                throw th;
            }
        }

        public b(String str, String str2, SharedPreferences sharedPreferences) {
            this.f28699b = str;
            this.f28700c = str2;
            this.f28701d = sharedPreferences;
        }
    }

    public final void a(final com.ss.android.downloadad.api.b.a aVar) {
        if (aVar != null && aVar.f28650a > 0) {
            final String valueOf = String.valueOf(aVar.f28650a);
            this.f28686e.submit(new Runnable() {
                public final void run() {
                    com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0).edit().putString(valueOf, aVar.a().toString()).apply();
                }
            });
        }
    }

    public final void a(DownloadInfo downloadInfo, long j) {
        try {
            ContentValues contentValues = new ContentValues();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("download_url", downloadInfo.getUrl());
            jSONObject.put("app_name", downloadInfo.getTitle());
            jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
            jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
            jSONObject.put("chunk_count", downloadInfo.getChunkCount());
            jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
            jSONObject.put("download_time", downloadInfo.getDownloadTime());
            jSONObject.put("is_using_new", 1);
            contentValues.put(PushConstants.EXTRA, jSONObject.toString());
            a(String.valueOf(j), contentValues);
        } catch (Exception unused) {
        }
    }

    public final void a(String str, ContentValues contentValues) {
        if (!TextUtils.isEmpty(str)) {
            try {
                SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0);
                String string = a2.getString(str, "");
                if (!TextUtils.isEmpty(string)) {
                    com.ss.android.downloadad.api.b.a a3 = com.ss.android.downloadad.api.b.a.a(new JSONObject(string));
                    if (a3.h) {
                        a(a3, contentValues);
                        a2.edit().putString(str, a3.a().toString()).apply();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(long j, String str) {
        if (j > 0) {
            String valueOf = String.valueOf(j);
            SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0);
            if (!TextUtils.isEmpty(a2.getString(valueOf, ""))) {
                this.f28686e.submit(new b(valueOf, str, a2));
            }
        }
    }

    @WorkerThread
    public final void a(com.ss.android.downloadad.api.b.a aVar, SharedPreferences sharedPreferences) {
        String str;
        com.ss.android.downloadad.api.b.a aVar2;
        Set<String> set;
        String str2;
        com.ss.android.downloadad.api.b.a aVar3 = aVar;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        c.a(f28681a, "tryListenInstallFinishEvent start", null);
        if (aVar3 == null || aVar3.f28650a <= 0 || sharedPreferences2 == null) {
            if (aVar3 == null) {
                str = "model is null";
            } else {
                str = "id:" + aVar3.f28650a;
            }
            c.a(f28681a, "tryListenInstallFinishEvent value: " + str + ",return ", null);
            return;
        }
        String valueOf = String.valueOf(aVar3.f28650a);
        if (TextUtils.isEmpty(aVar3.f28654e)) {
            sharedPreferences.edit().remove(valueOf).apply();
            c.a(f28681a, "tryListenInstallFinishEvent adId: " + valueOf + ",packageName is empty ", null);
            return;
        }
        this.f28685d.add(aVar3.f28654e);
        int i = 15;
        try {
            c.b(f28681a, "tryListenInstallFinishEvent start check: ", null);
            SystemClock.sleep(20000);
            while (true) {
                if (i > 0) {
                    aVar2 = com.ss.android.downloadad.api.b.a.a(new JSONObject(sharedPreferences2.getString(valueOf, "")));
                    try {
                        if (com.ss.android.downloadlib.c.k.a(aVar2)) {
                            c.b(f28681a, "tryListenInstallFinishEvent isInstalledApp start adId: " + valueOf + ", packageName:" + aVar2.f28654e, null);
                            j.a(k.l(), "install_finish", aVar2.h, aVar2.f28650a, aVar2.f28652c, aVar2.f28651b, a(aVar2, a(valueOf, aVar2.f28654e), 0), 2);
                            sharedPreferences.edit().remove(valueOf).apply();
                            com.ss.android.downloadlib.addownload.e.b.a(aVar2, k.a());
                            c.b(f28681a, "tryListenInstallFinishEvent isInstalledApp end ", null);
                            break;
                        }
                        i--;
                        if (i == 0) {
                            c.b(f28681a, "tryListenInstallFinishEvent while retryCount == 0 ", null);
                            break;
                        } else {
                            SystemClock.sleep(20000);
                            aVar3 = aVar2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            c.b(f28681a, "tryListenInstallFinishEvent throwable: " + th.getMessage(), null);
                            set = this.f28685d;
                            str2 = aVar2.f28654e;
                            set.remove(str2);
                            c.b(f28681a, "tryListenInstallFinishEvent end", null);
                        } catch (Throwable th2) {
                            th = th2;
                            this.f28685d.remove(aVar2.f28654e);
                            throw th;
                        }
                    }
                }
                break;
            }
            aVar3 = aVar2;
            break;
            c.b(f28681a, "tryListenInstallFinishEvent while end ", null);
            set = this.f28685d;
            str2 = aVar3.f28654e;
            break;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar3;
            this.f28685d.remove(aVar2.f28654e);
            throw th;
        }
        set.remove(str2);
        c.b(f28681a, "tryListenInstallFinishEvent end", null);
    }

    public final void a(int i) {
        String str = f28681a;
        c.b(str, "checkEventStatus mIsListeningInstallFinish:" + this.f28684c, null);
        if (!this.f28684c) {
            this.f28686e.submit(new C0340a(i));
        }
    }

    public final void a(com.ss.android.downloadlib.addownload.d.b bVar, String str, String str2) {
        a((com.ss.android.download.api.b.b) new b.a().f(str).k(str2).a(), (com.ss.android.download.api.b.c) new c.a().a(true).a(bVar.f28760a).a(bVar.f28762c).b(bVar.f28761b).a());
    }

    public final void a(long j, DownloadInfo downloadInfo, long j2, long j3) {
        try {
            String string = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                com.ss.android.downloadad.api.b.a a2 = com.ss.android.downloadad.api.b.a.a(new JSONObject(string));
                if (a2 != null) {
                    JSONObject a3 = com.ss.android.downloadad.api.b.a.a(a2);
                    a3.putOpt("room_before_clean_up", Long.valueOf(j3));
                    a3.putOpt("room_to_clean_up", Long.valueOf(j2));
                    if (downloadInfo != null) {
                        try {
                            if (a2.h) {
                                a3.put("total_bytes", downloadInfo.getTotalBytes());
                                a3.put("chunk_count", downloadInfo.getChunkCount());
                                a3.put("download_url", downloadInfo.getUrl());
                                a3.put("app_name", downloadInfo.getTitle());
                                a3.put("network_quality", downloadInfo.getNetworkQuality());
                            }
                        } catch (Exception unused) {
                        }
                    }
                    j.a("download_tool", "cleanup", a2.h, j, a2.f28652c, a2.f28651b, a3, 2);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f28682f == null) {
                f28682f = new a();
            }
            aVar = f28682f;
        }
        return aVar;
    }

    private a() {
    }

    public static void b(com.ss.android.downloadad.api.b.a aVar) {
        j.a(k.l(), "download_finish", aVar.h, aVar.f28650a, aVar.f28652c, aVar.f28651b, aVar.j, 2);
    }

    public static int a(String str, String str2) {
        if (k.g().optInt("check_hijack", 0) == 0) {
            return 0;
        }
        String string = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ttdownloader_md5", 0).getString(str, null);
        String b2 = com.ss.android.downloadlib.c.a.b(str2);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(b2) || string.equals(b2)) {
            return 0;
        }
        return 1;
    }

    public static void a(long j, int i) {
        try {
            String string = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                com.ss.android.downloadad.api.b.a a2 = com.ss.android.downloadad.api.b.a.a(new JSONObject(string));
                if (a2 != null) {
                    JSONObject a3 = com.ss.android.downloadad.api.b.a.a(a2);
                    a3.putOpt("fail_security", 1);
                    j.a(k.l(), "download_failed", a2.h, j, a2.f28652c, a2.f28651b, a3, 2);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void a(com.ss.android.download.api.b.b bVar, com.ss.android.download.api.b.c cVar) {
        com.ss.android.downloadad.api.b.a aVar;
        JSONObject jSONObject;
        long j;
        String str;
        long j2;
        boolean z;
        String string = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0).getString(String.valueOf(cVar.b()), "");
        try {
            String h = bVar.h();
            if (!TextUtils.isEmpty(string)) {
                aVar = com.ss.android.downloadad.api.b.a.a(new JSONObject(string));
            } else {
                aVar = null;
            }
            String p = bVar.p();
            if (TextUtils.isEmpty(h)) {
                h = bVar.a();
            }
            if (TextUtils.isEmpty(p)) {
                p = "click_install";
            }
            if (aVar == null) {
                JSONObject t = cVar.t();
                if (t == null) {
                    t = new JSONObject();
                }
                long b2 = cVar.b();
                boolean o = cVar.o();
                String p2 = cVar.p();
                jSONObject = t;
                j = cVar.c();
                str = p2;
                j2 = b2;
                z = o;
            } else {
                JSONObject jSONObject2 = aVar.j;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                long j3 = aVar.f28650a;
                boolean z2 = aVar.h;
                String str2 = aVar.f28652c;
                jSONObject = jSONObject2;
                j = aVar.f28651b;
                str = str2;
                j2 = j3;
                z = z2;
            }
            jSONObject.put("key_extra_check_install_tag", h);
            jSONObject.put("key_extra_check_install_label", p);
            j.a(h, "install_window_show", z, j2, str, j, jSONObject, 1);
        } catch (Exception unused) {
        }
    }

    private static void a(com.ss.android.downloadad.api.b.a aVar, ContentValues contentValues) throws JSONException {
        if (aVar != null && contentValues != null) {
            Long asLong = contentValues.getAsLong("ext_value");
            if (!(asLong == null || asLong.longValue() == 0)) {
                aVar.f28651b = asLong.longValue();
            }
            Long asLong2 = contentValues.getAsLong("ad_id");
            if (!(asLong2 == null || asLong2.longValue() == 0)) {
                aVar.f28650a = asLong2.longValue();
            }
            String asString = contentValues.getAsString("log_extra");
            if (!TextUtils.isEmpty(asString)) {
                aVar.f28652c = asString;
            }
            String asString2 = contentValues.getAsString("package_name");
            if (!TextUtils.isEmpty(asString2)) {
                aVar.f28654e = asString2;
            }
            Integer asInteger = contentValues.getAsInteger("force_update");
            boolean z = true;
            if (asInteger == null || asInteger.intValue() != 1) {
                z = false;
            }
            String asString3 = contentValues.getAsString(PushConstants.EXTRA);
            if (!TextUtils.isEmpty(asString3)) {
                if (z) {
                    aVar.j = new JSONObject(asString3);
                    return;
                }
                JSONObject jSONObject = new JSONObject(asString3);
                com.ss.android.downloadlib.c.k.a(aVar.j, jSONObject);
                aVar.j = jSONObject;
            }
        }
    }

    public static JSONObject a(@NonNull com.ss.android.downloadad.api.b.a aVar, int i, int i2) {
        JSONObject jSONObject;
        try {
            if (aVar.j == null) {
                jSONObject = new JSONObject();
                if (i2 >= 0) {
                    try {
                        jSONObject.putOpt("scene", Integer.valueOf(i2));
                    } catch (JSONException unused) {
                        return jSONObject;
                    }
                }
            } else {
                JSONObject jSONObject2 = new JSONObject(aVar.j.toString());
                if (i2 >= 0) {
                    try {
                        jSONObject2.putOpt("scene", Integer.valueOf(i2));
                    } catch (JSONException unused2) {
                        return jSONObject2;
                    }
                }
                jSONObject = jSONObject2;
            }
            jSONObject.put("hijack", i);
            return jSONObject;
        } catch (JSONException unused3) {
            return null;
        }
    }

    public static void a(long j, int i, String str, long j2, boolean z) {
        int i2;
        try {
            String string = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                com.ss.android.downloadad.api.b.a a2 = com.ss.android.downloadad.api.b.a.a(new JSONObject(string));
                if (a2 != null) {
                    JSONObject a3 = com.ss.android.downloadad.api.b.a.a(a2);
                    a3.putOpt("download_time", Long.valueOf(j2));
                    if (z) {
                        i2 = com.ss.android.downloadlib.core.download.k.a(i);
                    } else {
                        i2 = i;
                    }
                    a3.putOpt("fail_status", Integer.valueOf(i2));
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = str;
                        a3.putOpt("fail_msg", str);
                    }
                    j.a(k.l(), "download_failed", a2.h, j, a2.f28652c, a2.f28651b, a3, 2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
