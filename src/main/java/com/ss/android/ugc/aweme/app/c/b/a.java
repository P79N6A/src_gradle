package com.ss.android.ugc.aweme.app.c.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.b.d;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadad.api.a.c;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.h;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.app.c.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements com.ss.android.download.api.b.a.a, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34022a;

    /* renamed from: b  reason: collision with root package name */
    public f f34023b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, c> f34024c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, d> f34025d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<String, JSONObject> f34026e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private Context f34027f;
    private int g = hashCode();

    /* renamed from: com.ss.android.ugc.aweme.app.c.b.a$a  reason: collision with other inner class name */
    class C0438a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34028a;

        /* renamed from: c  reason: collision with root package name */
        private JSONObject f34030c;

        /* renamed from: d  reason: collision with root package name */
        private com.ss.android.download.api.b.c f34031d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f34032e;

        public final void a(@NonNull com.ss.android.download.api.b.c cVar, @Nullable com.ss.android.download.api.b.a aVar) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f34028a, false, 23413, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34028a, false, 23413, new Class[0], Void.TYPE);
            } else if (this.f34032e) {
                a("status", "update");
            } else {
                a("status", "idle");
            }
        }

        private void a(String... strArr) {
            if (PatchProxy.isSupport(new Object[]{strArr}, this, f34028a, false, 23419, new Class[]{String[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr}, this, f34028a, false, 23419, new Class[]{String[].class}, Void.TYPE);
            } else if (strArr.length % 2 == 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("message", "success");
                    jSONObject.put("appad", this.f34030c);
                    for (int i = 0; i < strArr.length; i += 2) {
                        jSONObject.put(strArr[i], strArr[i + 1]);
                    }
                    a.this.f34023b.a("app_ad_event", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }

        public final void b(e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f34028a, false, 23417, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f34028a, false, 23417, new Class[]{e.class}, Void.TYPE);
                return;
            }
            a("status", "installed");
        }

        public final void c(e eVar) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f34028a, false, 23418, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f34028a, false, 23418, new Class[]{e.class}, Void.TYPE);
                return;
            }
            a("status", "download_finished", "total_bytes", String.valueOf(eVar2.f28493c), "current_bytes", String.valueOf(eVar2.f28494d));
        }

        public final void a(e eVar) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f34028a, false, 23416, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f34028a, false, 23416, new Class[]{e.class}, Void.TYPE);
                return;
            }
            a("status", "download_failed", "total_bytes", String.valueOf(eVar2.f28493c), "current_bytes", String.valueOf(eVar2.f28494d));
        }

        public final void b(e eVar, int i) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i)}, this, f34028a, false, 23415, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i)}, this, f34028a, false, 23415, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            a("status", "download_paused", "total_bytes", String.valueOf(eVar2.f28493c), "current_bytes", String.valueOf(eVar2.f28494d));
        }

        public final void a(e eVar, int i) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i)}, this, f34028a, false, 23414, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i)}, this, f34028a, false, 23414, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            a("status", "download_active", "total_bytes", String.valueOf(eVar2.f28493c), "current_bytes", String.valueOf(eVar2.f28494d));
        }

        C0438a(com.ss.android.download.api.b.c cVar, JSONObject jSONObject) {
            this.f34031d = cVar;
            this.f34030c = jSONObject;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f34028a, false, 23412, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34028a, false, 23412, new Class[0], Void.TYPE);
                return;
            }
            String a2 = this.f34031d.a();
            String n = this.f34031d.n();
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(n)) {
                String str = null;
                try {
                    PackageInfo packageInfo = k.a().getPackageManager().getPackageInfo(this.f34031d.q(), 0);
                    if (packageInfo != null) {
                        str = packageInfo.versionName;
                    }
                } catch (Exception unused) {
                }
                this.f34032e = com.ss.android.downloadlib.c.k.a(n, str) > 0 ? true : z;
            }
        }
    }

    public final void a(DownloadInfo downloadInfo, String str) {
    }

    public final void a(c cVar, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{cVar, jSONObject}, this, f34022a, false, 23403, new Class[]{c.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, jSONObject}, this, f34022a, false, 23403, new Class[]{c.class, JSONObject.class}, Void.TYPE);
        } else if (this.f34023b != null && cVar != null) {
            this.f34024c.remove(cVar.a());
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                if (this.f34023b != null) {
                    this.f34023b.a("app_ad_event", jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{jSONArray2}, this, f34022a, false, 23408, new Class[]{JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONArray2}, this, f34022a, false, 23408, new Class[]{JSONArray.class}, Void.TYPE);
        } else if (jSONArray2 != null) {
            b bVar = new b(this, jSONArray2);
            if (PatchProxy.isSupport(new Object[]{jSONArray2, bVar}, null, b.f34021a, true, 23355, new Class[]{JSONArray.class, b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jSONArray2, bVar}, null, b.f34021a, true, 23355, new Class[]{JSONArray.class, b.a.class}, Void.TYPE);
                return;
            }
            if (jSONArray2 != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i);
                        com.ss.android.downloadlib.addownload.d.d dVar = new com.ss.android.downloadlib.addownload.d.d();
                        dVar.g = jSONObject.optString("pkg_name");
                        dVar.f28775f = jSONObject.optString("version_name");
                        arrayList.add(dVar);
                    }
                    com.ss.android.downloadlib.c.a.a.a(new com.ss.android.downloadlib.addownload.c.a(arrayList, new com.ss.android.ugc.aweme.app.c.c(arrayList, jSONArray2, bVar)), new Void[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void a(@NonNull DownloadInfo downloadInfo, BaseException baseException, String str) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException, str}, this, f34022a, false, 23409, new Class[]{DownloadInfo.class, BaseException.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException, str}, this, f34022a, false, 23409, new Class[]{DownloadInfo.class, BaseException.class, String.class}, Void.TYPE);
        } else if (baseException != null && this.f34023b != null) {
            try {
                if (this.f34026e.containsKey(downloadInfo.getUrl())) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("message", "success");
                    jSONObject.put("status", "download_failed_reason");
                    jSONObject.put("appad", this.f34026e.get(downloadInfo.getUrl()));
                    jSONObject.put("error_code", baseException.getErrorCode());
                    jSONObject.put("error_message", baseException.getErrorMessage());
                    this.f34023b.a("app_ad_event", jSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(DownloadInfo downloadInfo) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f34022a, false, 23410, new Class[]{DownloadInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f34022a, false, 23410, new Class[]{DownloadInfo.class}, Void.TYPE);
        } else if (this.f34024c.containsKey(downloadInfo.getUrl())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("message", "success");
                jSONObject.put("appad", this.f34026e.remove(downloadInfo.getUrl()));
                jSONObject.put("status", "cancel_download");
                this.f34023b.a("app_ad_event", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34022a, false, 23400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34022a, false, 23400, new Class[0], Void.TYPE);
            return;
        }
        a();
        h.a(this.f34027f).f29058b.b((com.ss.android.download.api.b.a.a) this);
        this.f34024c.clear();
        this.f34025d.clear();
        this.f34026e.clear();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34022a, false, 23399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34022a, false, 23399, new Class[0], Void.TYPE);
            return;
        }
        for (c next : this.f34024c.values()) {
            if (next != null) {
                h.a(this.f34027f).a(next.a(), this.g);
            }
        }
    }

    public final void c() {
        List list;
        if (PatchProxy.isSupport(new Object[0], this, f34022a, false, 23405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34022a, false, 23405, new Class[0], Void.TYPE);
        } else if (this.f34023b != null) {
            Context context = this.f34027f;
            if (PatchProxy.isSupport(new Object[]{context}, null, b.f34021a, true, 23353, new Class[]{Context.class}, List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[]{context}, null, b.f34021a, true, 23353, new Class[]{Context.class}, List.class);
            } else if (context == null) {
                list = new ArrayList();
            } else {
                h.a(context);
                list = h.c();
            }
            try {
                JSONArray a2 = a(list);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("task_list", a2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, "get_downloading_task");
                jSONObject2.put("data", jSONObject);
                this.f34023b.a("app_ad_event", jSONObject2);
            } catch (Exception e2) {
                e2.getStackTrace();
            }
        }
    }

    public final void d() {
        List list;
        if (PatchProxy.isSupport(new Object[0], this, f34022a, false, 23406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34022a, false, 23406, new Class[0], Void.TYPE);
        } else if (this.f34023b != null) {
            Context context = this.f34027f;
            if (PatchProxy.isSupport(new Object[]{context}, null, b.f34021a, true, 23354, new Class[]{Context.class}, List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[]{context}, null, b.f34021a, true, 23354, new Class[]{Context.class}, List.class);
            } else if (context == null) {
                list = new ArrayList();
            } else {
                h.a(context);
                list = h.d();
            }
            try {
                JSONArray a2 = a(list);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("task_list", a2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, "get_download_pause_task");
                jSONObject2.put("data", jSONObject);
                this.f34023b.a("app_ad_event", jSONObject2);
            } catch (Exception e2) {
                e2.getStackTrace();
            }
        }
    }

    private JSONArray a(List<com.ss.android.download.api.b.c> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f34022a, false, 23407, new Class[]{List.class}, JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[]{list}, this, f34022a, false, 23407, new Class[]{List.class}, JSONArray.class);
        } else if (list == null || this.f34026e == null) {
            return null;
        } else {
            JSONArray jSONArray = new JSONArray();
            for (com.ss.android.download.api.b.c next : list) {
                if (next != null && this.f34026e.containsKey(next.a())) {
                    jSONArray.put(this.f34026e.get(next.a()));
                }
            }
            return jSONArray;
        }
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f34022a, false, 23398, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f34022a, false, 23398, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        for (Map.Entry next : this.f34024c.entrySet()) {
            if (!(next == null || TextUtils.isEmpty((CharSequence) next.getKey()) || next.getValue() == null)) {
                h.a(this.f34027f).a(com.ss.android.downloadlib.c.k.c(context), this.g, this.f34025d.get(next.getKey()), (com.ss.android.download.api.b.c) next.getValue());
            }
        }
    }

    public a(Context context, f fVar) {
        this.f34027f = context;
        this.f34023b = fVar;
        com.ss.android.ugc.aweme.app.c.a.c.a().a((com.ss.android.download.api.b.a.a) this);
    }

    public final void b(c cVar, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{cVar, jSONObject}, this, f34022a, false, 23404, new Class[]{c.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, jSONObject}, this, f34022a, false, 23404, new Class[]{c.class, JSONObject.class}, Void.TYPE);
        } else if (cVar != null && jSONObject != null) {
            h a2 = h.a(this.f34027f);
            a2.f29058b.b(cVar.a());
            this.f34026e.put(cVar.a(), jSONObject);
        }
    }

    public final void a(Context context, c cVar, JSONObject jSONObject) {
        c cVar2 = cVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context, cVar2, jSONObject2}, this, f34022a, false, 23401, new Class[]{Context.class, c.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, cVar2, jSONObject2}, this, f34022a, false, 23401, new Class[]{Context.class, c.class, JSONObject.class}, Void.TYPE);
        } else if (context != null && this.f34023b != null) {
            C0438a aVar = new C0438a(cVar2, jSONObject2);
            h.a(this.f34027f).a(com.ss.android.downloadlib.c.k.c(context), this.g, (d) aVar, (com.ss.android.download.api.b.c) cVar2);
            this.f34024c.put(cVar.a(), cVar2);
            this.f34025d.put(cVar.a(), aVar);
            this.f34026e.put(cVar.a(), jSONObject2);
        }
    }

    public final void a(Context context, c cVar, com.ss.android.downloadad.api.a.b bVar, com.ss.android.downloadad.api.a.a aVar, JSONObject jSONObject) {
        c cVar2 = cVar;
        com.ss.android.downloadad.api.a.b bVar2 = bVar;
        com.ss.android.downloadad.api.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, cVar2, bVar2, aVar2, jSONObject}, this, f34022a, false, 23402, new Class[]{Context.class, c.class, com.ss.android.downloadad.api.a.b.class, com.ss.android.downloadad.api.a.a.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, cVar2, bVar2, aVar2, jSONObject}, this, f34022a, false, 23402, new Class[]{Context.class, c.class, com.ss.android.downloadad.api.a.b.class, com.ss.android.downloadad.api.a.a.class, JSONObject.class}, Void.TYPE);
        } else if (context != null && cVar2 != null) {
            if (!this.f34024c.containsKey(cVar.a())) {
                this.f34024c.put(cVar.a(), cVar2);
                h.a(this.f34027f).a(com.ss.android.downloadlib.c.k.c(context), this.g, (d) null, (com.ss.android.download.api.b.c) cVar2);
            }
            h.a(this.f34027f).a(cVar.a(), 2, (com.ss.android.download.api.b.b) bVar2, (com.ss.android.download.api.b.a) aVar2);
        }
    }
}
