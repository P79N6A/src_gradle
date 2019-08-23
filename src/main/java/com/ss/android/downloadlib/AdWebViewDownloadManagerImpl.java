package com.ss.android.downloadlib;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.b.d;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadad.api.a.a;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.downloadad.api.a.c;
import com.ss.android.downloadlib.addownload.j;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.c.h;
import com.ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.ss.android.socialbase.downloader.downloader.g;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.q.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AdWebViewDownloadManagerImpl implements com.ss.android.download.api.b.a.a, com.ss.android.downloadad.api.b {

    /* renamed from: d  reason: collision with root package name */
    private static String f28656d = "AdWebViewDownloadManagerImpl";

    /* renamed from: e  reason: collision with root package name */
    private static volatile AdWebViewDownloadManagerImpl f28657e;

    /* renamed from: a  reason: collision with root package name */
    a f28658a;

    /* renamed from: b  reason: collision with root package name */
    public h f28659b = h.a(k.a());

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, JSONObject> f28660c;

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f28661f = c.a(k.a(), "sp_webview_ad_download_info", 0);
    private b<Long, DownloadInfo> g = b();

    @Keep
    static class DownloadInfo {
        long mAdId;
        String mAppName;
        String mDownloadUrl;
        long mExtValue;
        String mMimeType;
        String mPackageName;
        String mUserAgent;

        static com.ss.android.download.api.b.a createDownloadController() {
            boolean z = true;
            a.C0339a a2 = new a.C0339a().a(0).b(0).a(true);
            if (k.g().optInt("download_manage_enable") != 1) {
                z = false;
            }
            a.C0339a c2 = a2.b(z).c(false);
            c2.h = false;
            return c2.a();
        }

        static com.ss.android.download.api.b.b createDownloadEventConfigure() {
            return new b.a().a("landing_h5_download_ad_button").b("landing_h5_download_ad_button").h("click_start_detail").i("click_pause_detail").j("click_continue_detail").k("click_install_detail").l("click_open_detail").m("storage_deny_detail").a(1).a(false).b(true).c(false).a();
        }

        static DownloadInfo fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                DownloadInfo downloadInfo = new DownloadInfo(com.ss.android.downloadlib.c.k.a(jSONObject, "adId"), com.ss.android.downloadlib.c.k.a(jSONObject, "adId"), jSONObject.optString("appName"), jSONObject.optString("downloadUrl"), jSONObject.optString("packageName"), jSONObject.optString("mimeType"), jSONObject.optString("userAgent"));
                return downloadInfo;
            } catch (Exception unused) {
                return null;
            }
        }

        static JSONObject toJson(DownloadInfo downloadInfo) {
            if (downloadInfo == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("adId", downloadInfo.mAdId);
                jSONObject.put("extValue", downloadInfo.mExtValue);
                jSONObject.put("appName", downloadInfo.mAppName);
                jSONObject.put("downloadUrl", downloadInfo.mDownloadUrl);
                jSONObject.put("packageName", downloadInfo.mPackageName);
                jSONObject.put("mimeType", downloadInfo.mMimeType);
                jSONObject.put("userAgent", downloadInfo.mUserAgent);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        static com.ss.android.download.api.b.c createDownloadModel(String str, DownloadInfo downloadInfo) {
            HashMap hashMap;
            if (!TextUtils.isEmpty(downloadInfo.mUserAgent)) {
                hashMap = new HashMap();
                hashMap.put("User-Agent", downloadInfo.mUserAgent);
            } else {
                hashMap = null;
            }
            return new c.a().a(downloadInfo.mAdId).b(downloadInfo.mExtValue).a(str).d(downloadInfo.mDownloadUrl).b(downloadInfo.mPackageName).e(downloadInfo.mAppName).f(downloadInfo.mMimeType).a((Map<String, String>) hashMap).a();
        }

        DownloadInfo(long j, long j2, String str, String str2, String str3, String str4, String str5) {
            this.mAdId = j;
            this.mExtValue = j2;
            this.mAppName = str;
            this.mDownloadUrl = str2;
            this.mPackageName = str3;
            this.mMimeType = str4;
            this.mUserAgent = str5;
        }
    }

    class a extends AsyncTask<String, Void, e> {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<Context> f28675b;

        /* renamed from: c  reason: collision with root package name */
        private String f28676c;

        /* renamed from: d  reason: collision with root package name */
        private DownloadInfo f28677d;

        /* renamed from: e  reason: collision with root package name */
        private d f28678e;

        /* renamed from: f  reason: collision with root package name */
        private int f28679f;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            String[] strArr = (String[]) objArr;
            if (strArr == null || (strArr.length > 0 && TextUtils.isEmpty(strArr[0]))) {
                return null;
            }
            return com.ss.android.downloadlib.core.download.d.a(k.a()).a(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            boolean z;
            long j;
            long j2;
            e eVar = (e) obj;
            if (this.f28675b != null) {
                Context context = (Context) this.f28675b.get();
                if (!(context == null || this.f28677d == null)) {
                    boolean z2 = false;
                    if (this.f28677d.mAdId <= 0 || TextUtils.isEmpty(this.f28677d.mAppName) || TextUtils.isEmpty(this.f28677d.mDownloadUrl) || k.g().optInt("download_manage_enable") != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (this.f28677d == null) {
                        j = 0;
                    } else {
                        if (eVar != null) {
                            z2 = true;
                        }
                        if (k.a(z2, true)) {
                            HashMap hashMap = null;
                            if (!TextUtils.isEmpty(this.f28677d.mUserAgent)) {
                                hashMap = new HashMap();
                                hashMap.put("User-Agent", this.f28677d.mUserAgent);
                            }
                            j2 = AdWebViewDownloadManagerImpl.this.f28659b.f29059c.a(this.f28677d.mDownloadUrl, this.f28677d.mAppName, context, this.f28677d.mMimeType, hashMap, AdWebViewDownloadManagerImpl.this.f28660c.get(this.f28677d.mDownloadUrl), z);
                            AdWebViewDownloadManagerImpl.this.f28659b.f29059c.a(Long.valueOf(j2), String.valueOf(this.f28677d.mAdId), 0, this.f28676c, true, this.f28677d.mExtValue);
                            if (j2 != 0) {
                                AdWebViewDownloadManagerImpl.this.a(this.f28677d.mAdId, this.f28677d.mExtValue, this.f28676c, 0);
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new HttpHeader("User-Agent", this.f28677d.mUserAgent));
                            j2 = (long) j.a(true, z, AdWebViewDownloadManagerImpl.this.f28660c.remove(this.f28677d.mDownloadUrl), new AppTaskBuilder(context, this.f28677d.mDownloadUrl).name(this.f28677d.mAppName).extra(com.ss.android.downloadlib.c.b.a(String.valueOf(this.f28677d.mAdId), this.f28677d.mExtValue, 0, this.f28676c, true, null)).mimeType("application/vnd.android.package-archive").headers(arrayList).packageName(this.f28677d.mPackageName).chunkStrategy(new g() {
                                public final int a(long j) {
                                    return 1;
                                }
                            }));
                            if (j2 != 0) {
                                AdWebViewDownloadManagerImpl.this.a(this.f28677d.mAdId, this.f28677d.mExtValue, this.f28676c, 1);
                            }
                        }
                        j = j2;
                    }
                    if (j != 0) {
                        a a2 = a.a();
                        com.ss.android.downloadad.api.b.a aVar = new com.ss.android.downloadad.api.b.a(this.f28677d.mAdId, this.f28677d.mExtValue, this.f28676c, j);
                        a2.a(aVar);
                        com.ss.android.download.api.b.c createDownloadModel = DownloadInfo.createDownloadModel(this.f28676c, this.f28677d);
                        if (z && this.f28678e != null) {
                            this.f28678e.a(createDownloadModel, DownloadInfo.createDownloadController());
                        }
                        AdWebViewDownloadManagerImpl.this.f28659b.a(this.f28679f, this.f28678e, createDownloadModel);
                    }
                }
            }
        }

        public a(Context context, String str, DownloadInfo downloadInfo, d dVar, int i) {
            this.f28675b = new WeakReference<>(context);
            this.f28676c = str;
            this.f28677d = downloadInfo;
            this.f28678e = dVar;
            this.f28679f = i;
        }
    }

    static class b<K, T> extends LinkedHashMap<K, T> {
        private static final long serialVersionUID = 6166255753998387313L;
        final int mMaxSize;

        /* access modifiers changed from: protected */
        public final boolean removeEldestEntry(Map.Entry<K, T> entry) {
            if (size() > this.mMaxSize) {
                return true;
            }
            return false;
        }

        public b(int i, int i2) {
            super(i2, 0.75f, true);
            this.mMaxSize = i;
            if (i <= 0) {
                throw new IllegalArgumentException("maxSize <= 0");
            }
        }
    }

    public final void a(@NonNull com.ss.android.socialbase.downloader.model.DownloadInfo downloadInfo) {
    }

    public final void a(@NonNull com.ss.android.socialbase.downloader.model.DownloadInfo downloadInfo, BaseException baseException, String str) {
    }

    public final boolean a(long j, String str, d dVar, int i) {
        if (!b(j)) {
            return false;
        }
        DownloadInfo downloadInfo = (DownloadInfo) this.g.get(Long.valueOf(j));
        if (downloadInfo == null || TextUtils.isEmpty(downloadInfo.mDownloadUrl)) {
            return false;
        }
        this.f28659b.a(i, dVar, DownloadInfo.createDownloadModel(str, downloadInfo));
        return true;
    }

    public final boolean a(long j, int i) {
        if (!b(j)) {
            return false;
        }
        DownloadInfo downloadInfo = (DownloadInfo) this.g.get(Long.valueOf(j));
        if (downloadInfo != null) {
            this.f28659b.a(downloadInfo.mDownloadUrl, i);
            this.f28660c.remove(downloadInfo.mDownloadUrl);
        }
        if (!(this.f28658a == null || this.f28658a.getStatus() == AsyncTask.Status.FINISHED)) {
            this.f28658a.cancel(true);
        }
        return true;
    }

    public final void a(@NonNull com.ss.android.socialbase.downloader.model.DownloadInfo downloadInfo, String str) {
        long j;
        String extra = downloadInfo.getExtra();
        if (!TextUtils.isEmpty(extra)) {
            try {
                j = com.ss.android.downloadlib.c.k.a(new JSONObject(extra), PushConstants.EXTRA);
            } catch (JSONException unused) {
                j = 0;
            }
            if (this.g.containsKey(Long.valueOf(j))) {
                a(j, str);
            }
        }
    }

    public static AdWebViewDownloadManagerImpl a() {
        if (f28657e == null) {
            synchronized (AdWebViewDownloadManagerImpl.class) {
                if (f28657e == null) {
                    f28657e = new AdWebViewDownloadManagerImpl();
                }
            }
        }
        return f28657e;
    }

    private AdWebViewDownloadManagerImpl() {
        this.f28659b.a((com.ss.android.download.api.b.a.a) this);
        this.f28660c = new HashMap();
    }

    private b<Long, DownloadInfo> b() {
        b<Long, DownloadInfo> bVar = new b<>(8, 8);
        try {
            JSONObject jSONObject = new JSONObject(this.f28661f.getString("key_download_info_list", ""));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                DownloadInfo fromJson = DownloadInfo.fromJson(jSONObject.optJSONObject(next));
                if (fromJson != null) {
                    bVar.put(Long.valueOf(next), fromJson);
                }
            }
        } catch (Exception unused) {
        }
        return bVar;
    }

    public final boolean b(long j) {
        return this.g.containsKey(Long.valueOf(j));
    }

    private void a(Map<Long, DownloadInfo> map) {
        if (map != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put(String.valueOf(next.getKey()), DownloadInfo.toJson((DownloadInfo) next.getValue()));
                }
            } catch (JSONException unused) {
            }
            this.f28661f.edit().putString("key_download_info_list", jSONObject.toString()).apply();
        }
    }

    public final void a(long j) {
        DownloadInfo downloadInfo = (DownloadInfo) this.g.get(Long.valueOf(j));
        if (downloadInfo != null) {
            this.f28659b.a(downloadInfo.mDownloadUrl, 2, DownloadInfo.createDownloadEventConfigure(), DownloadInfo.createDownloadController());
        }
    }

    private void a(long j, String str) {
        if (this.g.containsKey(Long.valueOf(j))) {
            DownloadInfo downloadInfo = (DownloadInfo) this.g.get(Long.valueOf(j));
            if (downloadInfo != null) {
                downloadInfo.mPackageName = str;
            }
            this.g.put(Long.valueOf(j), downloadInfo);
            a((Map<Long, DownloadInfo>) this.g);
        }
    }

    public final void a(long j, long j2, String str, int i) {
        j.a("landing_h5_download_ad", "download_start", true, j, str, j2, 1);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_using_new", i);
        } catch (Exception unused) {
        }
        j.a("landing_h5_download_ad", "click_start_detail", true, j, str, j2, jSONObject, 1);
    }

    public final void a(Context context, String str, DownloadInfo downloadInfo, d dVar, int i) {
        final Context context2 = context;
        final String str2 = str;
        final DownloadInfo downloadInfo2 = downloadInfo;
        final d dVar2 = dVar;
        final int i2 = i;
        AnonymousClass2 r3 = new h.a() {
            public final void a(String str) {
            }

            public final void a() {
                AdWebViewDownloadManagerImpl adWebViewDownloadManagerImpl = AdWebViewDownloadManagerImpl.this;
                Context context = context2;
                String str = str2;
                DownloadInfo downloadInfo = downloadInfo2;
                d dVar = dVar2;
                int i = i2;
                if (!(adWebViewDownloadManagerImpl.f28658a == null || adWebViewDownloadManagerImpl.f28658a.getStatus() == AsyncTask.Status.FINISHED)) {
                    adWebViewDownloadManagerImpl.f28658a.cancel(true);
                }
                a aVar = new a(context, str, downloadInfo, dVar, i);
                adWebViewDownloadManagerImpl.f28658a = aVar;
                com.ss.android.downloadlib.c.a.a.a(adWebViewDownloadManagerImpl.f28658a, downloadInfo.mDownloadUrl);
            }
        };
        h.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, (h.a) r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        if (android.text.TextUtils.equals(r8.mDownloadUrl, r0.mDownloadUrl) != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog a(android.content.Context r19, java.lang.String r20, boolean r21, @android.support.annotation.NonNull com.ss.android.download.api.b.c r22, com.ss.android.download.api.b.d r23, int r24) {
        /*
            r18 = this;
            r7 = r18
            r2 = r19
            r6 = 0
            if (r2 == 0) goto L_0x012a
            java.lang.String r0 = r22.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0013
            goto L_0x012a
        L_0x0013:
            long r0 = r22.b()
            boolean r0 = r7.b(r0)
            if (r0 == 0) goto L_0x002b
            com.ss.android.downloadlib.h r0 = r7.f28659b
            java.lang.String r1 = r22.a()
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0036
            long r0 = r22.b()
            r7.a((long) r0)
            return r6
        L_0x0036:
            java.util.Map<java.lang.String, org.json.JSONObject> r0 = r7.f28660c
            java.lang.String r1 = r22.a()
            org.json.JSONObject r3 = r22.t()
            r0.put(r1, r3)
            com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$DownloadInfo r4 = new com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$DownloadInfo
            long r9 = r22.b()
            long r11 = r22.c()
            java.lang.String r13 = r22.d()
            java.lang.String r14 = r22.a()
            java.lang.String r15 = ""
            java.lang.String r16 = r22.e()
            r8 = r4
            r17 = r20
            r8.<init>(r9, r11, r13, r14, r15, r16, r17)
            com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$b<java.lang.Long, com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$DownloadInfo> r0 = r7.g
            long r8 = r4.mAdId
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0089
            com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$b<java.lang.Long, com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$DownloadInfo> r0 = r7.g
            long r8 = r4.mAdId
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$DownloadInfo r0 = (com.ss.android.downloadlib.AdWebViewDownloadManagerImpl.DownloadInfo) r0
            if (r0 == 0) goto L_0x0089
            java.lang.String r1 = r4.mDownloadUrl
            java.lang.String r0 = r0.mDownloadUrl
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0099
        L_0x0089:
            com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$b<java.lang.Long, com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$DownloadInfo> r0 = r7.g
            long r8 = r4.mAdId
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.put(r1, r4)
            com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$b<java.lang.Long, com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$DownloadInfo> r0 = r7.g
            r7.a((java.util.Map<java.lang.Long, com.ss.android.downloadlib.AdWebViewDownloadManagerImpl.DownloadInfo>) r0)
        L_0x0099:
            com.ss.android.downloadlib.h r0 = r7.f28659b
            r3 = r22
            r5 = r23
            r8 = r24
            r0.a((int) r8, (com.ss.android.download.api.b.d) r5, (com.ss.android.download.api.b.c) r3)
            if (r21 == 0) goto L_0x00b8
            java.lang.String r3 = r22.p()
            r0 = r18
            r1 = r19
            r2 = r3
            r3 = r4
            r4 = r23
            r5 = r24
            r0.a(r1, r2, r3, r4, r5)
            return r6
        L_0x00b8:
            java.lang.String r0 = f28656d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r9 = "tryStartDownload show dialog appName:"
            r1.<init>(r9)
            java.lang.String r9 = r22.a()
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.ss.android.downloadlib.c.c.a(r0, r1, r6)
            com.ss.android.download.api.config.h r9 = com.ss.android.downloadlib.addownload.k.d()
            com.ss.android.download.api.c.c$a r0 = new com.ss.android.download.api.c.c$a
            r0.<init>(r2)
            java.lang.String r1 = r22.d()
            com.ss.android.download.api.c.c$a r0 = r0.a((java.lang.String) r1)
            android.content.res.Resources r1 = r19.getResources()
            r6 = 2131558625(0x7f0d00e1, float:1.8742571E38)
            java.lang.String r1 = r1.getString(r6)
            com.ss.android.download.api.c.c$a r0 = r0.b(r1)
            android.content.res.Resources r1 = r19.getResources()
            r6 = 2131560943(0x7f0d09ef, float:1.8747273E38)
            java.lang.String r1 = r1.getString(r6)
            com.ss.android.download.api.c.c$a r0 = r0.c(r1)
            android.content.res.Resources r1 = r19.getResources()
            r6 = 2131560942(0x7f0d09ee, float:1.874727E38)
            java.lang.String r1 = r1.getString(r6)
            com.ss.android.download.api.c.c$a r10 = r0.d(r1)
            com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$1 r11 = new com.ss.android.downloadlib.AdWebViewDownloadManagerImpl$1
            r0 = r11
            r1 = r18
            r2 = r19
            r3 = r22
            r5 = r23
            r6 = r24
            r0.<init>(r2, r3, r4, r5, r6)
            com.ss.android.download.api.c.c$a r0 = r10.a((com.ss.android.download.api.c.c.b) r11)
            com.ss.android.download.api.c.c r0 = r0.a()
            android.app.Dialog r0 = r9.a((com.ss.android.download.api.c.c) r0)
            return r0
        L_0x012a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.AdWebViewDownloadManagerImpl.a(android.content.Context, java.lang.String, boolean, com.ss.android.download.api.b.c, com.ss.android.download.api.b.d, int):android.app.Dialog");
    }
}
