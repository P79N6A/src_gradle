package com.ss.android.downloadlib.addownload;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.downloadad.api.a.c;
import com.ss.android.downloadlib.c.k;
import com.ss.android.downloadlib.c.l;
import com.ss.android.downloadlib.core.download.m;
import com.ss.android.downloadlib.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class b implements l.a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28733a = "b";

    /* renamed from: f  reason: collision with root package name */
    private static b f28734f;

    /* renamed from: b  reason: collision with root package name */
    public l f28735b;

    /* renamed from: c  reason: collision with root package name */
    public i f28736c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, a> f28737d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28738e;
    private c g;
    private Map<String, String> h;
    private long i;
    private C0342b j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public c f28739a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f28740b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28741c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28742d;

        /* renamed from: e  reason: collision with root package name */
        public int f28743e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f28744f;
        public boolean g;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("downloadModel", this.f28739a.w());
                jSONObject.put("isContinueDownload", this.f28740b ? 1 : 0);
                jSONObject.put("isAddToDownloadManage", this.f28741c ? 1 : 0);
                jSONObject.put("isEnableMultipleDownload", this.f28742d ? 1 : 0);
                jSONObject.put("mDownloadChunkCount", this.f28743e);
                jSONObject.put("isEnableBackDialog", this.f28744f ? 1 : 0);
                jSONObject.put("isAllowDeepLink", this.g ? 1 : 0);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public static a a(JSONObject jSONObject) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (jSONObject == null) {
                return null;
            }
            a aVar = new a();
            try {
                boolean z5 = false;
                if (jSONObject.optInt("isContinueDownload") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.f28740b = z;
                if (jSONObject.optInt("isAddToDownloadManage") == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aVar.f28741c = z2;
                if (jSONObject.optInt("isEnableMultipleDownload") == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aVar.f28742d = z3;
                aVar.f28743e = jSONObject.optInt("mDownloadChunkCount", 1);
                if (jSONObject.optInt("isEnableBackDialog") == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                aVar.f28744f = z4;
                if (jSONObject.optInt("isAllowDeepLink") == 1) {
                    z5 = true;
                }
                aVar.g = z5;
                aVar.f28739a = c.a(jSONObject.optJSONObject("downloadModel"));
                return aVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.b$b  reason: collision with other inner class name */
    public static class C0342b {

        /* renamed from: a  reason: collision with root package name */
        public String f28745a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.android.download.api.b.b f28746b;

        /* renamed from: c  reason: collision with root package name */
        public com.ss.android.download.api.b.a f28747c;

        public final void a(String str, com.ss.android.download.api.b.b bVar, com.ss.android.download.api.b.a aVar) {
            this.f28745a = str;
            this.f28746b = bVar;
            this.f28747c = aVar;
        }
    }

    private Map<String, String> c() {
        if (this.h == null) {
            this.h = new ConcurrentHashMap();
        }
        return this.h;
    }

    public final C0342b b() {
        if (this.j == null) {
            this.j = new C0342b();
        }
        return this.j;
    }

    public static b a() {
        if (f28734f == null) {
            synchronized (b.class) {
                if (f28734f == null) {
                    f28734f = new b();
                }
            }
        }
        return f28734f;
    }

    private b() {
        this.f28735b = new l(Looper.getMainLooper(), this);
        this.f28737d = new HashMap();
        this.f28738e = false;
        this.g = new c();
        this.f28737d = c.a("sp_delay_operation_info", "key_waiting_wifi_download_list");
        this.f28736c = new i();
    }

    public final void a(Message message) {
        String str;
        switch (message.what) {
            case 200:
                com.ss.android.downloadlib.addownload.d.a aVar = (com.ss.android.downloadlib.addownload.d.a) message.obj;
                String str2 = f28733a;
                StringBuilder sb = new StringBuilder("handleStartInstallMsg start appName:");
                if (aVar == null) {
                    str = "";
                } else {
                    str = aVar.f28758e;
                }
                sb.append(str);
                com.ss.android.downloadlib.c.c.a(str2, sb.toString(), null);
                if (k.i() != null) {
                    if (k.i().a() && !k.m()) {
                        com.ss.android.downloadlib.c.c.a(f28733a, "handleStartInstallMsg isAppInBackground !isHandleDelayInstallWhenBg return", null);
                        break;
                    } else if (aVar == null) {
                        com.ss.android.downloadlib.c.c.a(f28733a, "handleStartInstallMsg appInfo == null return", null);
                        break;
                    } else if (k.b(k.a(), aVar.f28757d)) {
                        a(aVar, "installed", aVar.f28756c);
                        String str3 = f28733a;
                        com.ss.android.downloadlib.c.c.a(str3, "handleStartInstallMsg isInstalledApp mPackageName:" + aVar.f28757d, null);
                        break;
                    } else if (!k.b(aVar.g)) {
                        a(aVar, "file_lost", aVar.f28756c);
                        String str4 = f28733a;
                        com.ss.android.downloadlib.c.c.a(str4, "handleStartInstallMsg file_lost mPackageName:" + aVar.f28757d, null);
                        break;
                    } else {
                        com.ss.android.downloadlib.addownload.a.a a2 = com.ss.android.downloadlib.addownload.a.a.a();
                        if (TextUtils.equals(a2.f28727d, aVar.f28757d)) {
                            a(aVar, "conflict_with_back_dialog", aVar.f28756c);
                            String str5 = f28733a;
                            com.ss.android.downloadlib.c.c.a(str5, "handleStartInstallMsg conflict_with_back_dialog mPackageName:" + aVar.f28757d, null);
                            break;
                        } else {
                            String str6 = f28733a;
                            com.ss.android.downloadlib.c.c.a(str6, "handleStartInstallMsg start_install  mPackageName:" + aVar.f28757d, null);
                            a(aVar, "start_install", k.n());
                            m.a(k.a(), aVar.f28754a, new int[]{268435456}, aVar.f28757d);
                            return;
                        }
                    }
                } else {
                    com.ss.android.downloadlib.c.c.a(f28733a, "handleStartInstallMsg getAppStatusChangeListener null return", null);
                    break;
                }
                break;
            case 201:
                h hVar = e.a().f29048a.get((String) message.obj);
                if (hVar != null) {
                    hVar.a();
                    break;
                }
                break;
        }
    }

    public final void a(String str) {
        String str2 = f28733a;
        com.ss.android.downloadlib.c.c.a(str2, "trySendRecommendAdEvent packageName:" + str, null);
        if (c().containsKey(str)) {
            String remove = c().remove(str);
            com.ss.android.downloadlib.a a2 = com.ss.android.downloadlib.a.a();
            if (!TextUtils.isEmpty(remove) && !a2.f28685d.contains(str)) {
                SharedPreferences a3 = com.ss.android.ugc.aweme.q.c.a(k.a(), "sp_ad_download_event", 0);
                String string = a3.getString(remove, "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        com.ss.android.downloadad.api.b.a a4 = com.ss.android.downloadad.api.b.a.a(new JSONObject(string));
                        if (a4 != null) {
                            if (TextUtils.equals(a4.f28654e, str)) {
                                a4.f28651b = 3;
                                j.a(k.l(), "install_finish", a4.h, a4.f28650a, a4.f28652c, a4.f28651b, com.ss.android.downloadlib.a.a(a4, com.ss.android.downloadlib.a.a(remove, str), 3), 2);
                                a3.edit().remove(remove).apply();
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public final void a(String str, long j2) {
        String str2 = f28733a;
        com.ss.android.downloadlib.c.c.a(str2, "addPackageName packageName:" + str + ",adId:" + j2, null);
        if (!TextUtils.isEmpty(str)) {
            c().put(str, String.valueOf(j2));
        } else {
            c().remove(str);
        }
    }

    private static void a(com.ss.android.downloadlib.addownload.d.a aVar, String str, long j2) {
        j.a("delay_install", str, true, aVar.f28755b, aVar.f28759f, j2, 2);
    }

    public final void a(long j2, long j3, long j4, String str, String str2, String str3, String str4) {
        long j5 = j3;
        String str5 = str;
        String str6 = f28733a;
        com.ss.android.downloadlib.c.c.a(str6, "trySendDelayInstallMsg start packageName:" + str5 + ",adId:" + j5, null);
        boolean z = true;
        if (k.g().optInt("is_enable_start_install_again") != 1 && !k.m()) {
            z = false;
        }
        if (z) {
            String str7 = f28733a;
            com.ss.android.downloadlib.c.c.a(str7, "trySendDelayInstallMsg next packageName:" + str5 + ",adId:" + j5, null);
            com.ss.android.downloadlib.addownload.d.a aVar = new com.ss.android.downloadlib.addownload.d.a(j2, j3, j4, str, str2, str3, str4);
            long currentTimeMillis = System.currentTimeMillis() - this.i;
            long n = k.n();
            if (currentTimeMillis < k.o()) {
                long o = k.o() - currentTimeMillis;
                n += o;
                this.i = System.currentTimeMillis() + o;
            } else {
                this.i = System.currentTimeMillis();
            }
            this.f28735b.sendMessageDelayed(this.f28735b.obtainMessage(200, aVar), n);
        }
    }
}
