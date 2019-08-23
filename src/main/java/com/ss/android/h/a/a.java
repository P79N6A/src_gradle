package com.ss.android.h.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.ies.b.c.b;
import com.bytedance.ies.b.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchExecutor;
import com.meituan.robust.PatchedClassInfo;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.io.File;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements WeakHandler.IHandler, c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f29096c;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f29097f = new Object();
    private static volatile boolean j = false;

    /* renamed from: a  reason: collision with root package name */
    public b f29098a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.bytedance.ies.b.a.a> f29099b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final WeakHandler f29100d;

    /* renamed from: e  reason: collision with root package name */
    private Context f29101e;
    private String g;
    private volatile e h;
    private String i;

    /* renamed from: com.ss.android.h.a.a$a  reason: collision with other inner class name */
    static class C0349a {

        /* renamed from: a  reason: collision with root package name */
        List<com.bytedance.ies.b.a.a> f29106a;

        private C0349a() {
        }

        /* synthetic */ C0349a(byte b2) {
            this();
        }
    }

    private void a() {
        SharedPreferences.Editor edit = c.a(this.f29101e, "ies_patch", 0).edit();
        edit.putString("patch_key", "");
        edit.commit();
        String str = this.g;
        if (str != null && str.trim().length() != 0) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (file2.isFile() && file2.getAbsolutePath().contains("_robust")) {
                        file2.delete();
                    }
                }
            }
        }
    }

    private a(Context context) {
        this.f29101e = context;
        this.f29100d = new WeakHandler(Looper.getMainLooper(), this);
    }

    public static a a(Context context) {
        if (f29096c == null) {
            synchronized (f29097f) {
                if (f29096c == null) {
                    f29096c = new a(context);
                }
            }
        }
        return f29096c;
    }

    public final void handleMsg(Message message) {
        if (message.what == 1000 && (message.obj instanceof C0349a)) {
            a(((C0349a) message.obj).f29106a);
        }
    }

    private static void a(com.bytedance.ies.b.a.a aVar) {
        List<PatchedClassInfo> list = aVar.f20194f;
        if (!CollectionUtils.isEmpty(list)) {
            for (PatchedClassInfo patchedClassInfo : list) {
                try {
                    Class<?> loadClass = PatchExecutor.class.getClassLoader().loadClass(patchedClassInfo.patchedClassName.trim());
                    Field[] declaredFields = loadClass.getDeclaredFields();
                    int length = declaredFields.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        Field field = declaredFields[i2];
                        if (TextUtils.equals(field.getType().getCanonicalName(), ChangeQuickRedirect.class.getCanonicalName()) && TextUtils.equals(field.getDeclaringClass().getCanonicalName(), loadClass.getCanonicalName())) {
                            com.bytedance.frameworks.plugin.e.a.a(field, (Object) null);
                            break;
                        }
                        i2++;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized void a(final List<com.bytedance.ies.b.a.a> list) {
        if (list != null) {
            if (this.h == null || !this.h.f20202c.f20213a) {
                g.a("saveu", "start patch, newFetchInfos=" + list);
                try {
                    for (com.bytedance.ies.b.a.a next : this.f29099b) {
                        if (!list.contains(next)) {
                            a(next);
                        }
                    }
                    for (com.bytedance.ies.b.a.a next2 : list) {
                        for (com.bytedance.ies.b.a.a next3 : this.f29099b) {
                            if (next2.equals(next3)) {
                                next2.f20193e = next3.f20193e;
                                next2.f20194f = next3.f20194f;
                            }
                        }
                    }
                    if (!CollectionUtils.isEmpty(this.f29099b) && CollectionUtils.isEmpty(list)) {
                        a();
                    }
                    this.f29099b = list;
                    Context context = this.f29101e;
                    if (context == null) {
                        throw new NullPointerException("Context could not be null");
                    } else if (!TextUtils.isEmpty(com.bytedance.ies.b.b.a.f20198a)) {
                        SharedPreferences a2 = c.a(context, "ies_patch", 0);
                        String a3 = b.a(list, ";");
                        SharedPreferences.Editor edit = a2.edit();
                        if (a3 == null) {
                            a3 = "";
                        }
                        edit.putString("patch_key", a3);
                        edit.putString("patch_version_key", com.bytedance.ies.b.b.a.f20198a);
                        edit.apply();
                        e.a aVar = new e.a(this.f29101e);
                        aVar.f20208b = new com.bytedance.ies.b.c() {
                            public final List<com.bytedance.ies.b.a.a> a() throws Exception {
                                return list;
                            }
                        };
                        aVar.f20209c = new com.bytedance.ies.b.b() {
                            public final OkHttpClient a() {
                                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                                builder.connectTimeout(60000, TimeUnit.MILLISECONDS);
                                builder.readTimeout(60000, TimeUnit.MILLISECONDS);
                                builder.followRedirects(true);
                                return builder.build();
                            }
                        };
                        aVar.f20210d = new com.bytedance.ies.b.a() {
                            public final void a(String str) {
                                if (a.this.f29098a != null) {
                                    a.this.f29098a.a(str);
                                }
                            }

                            public final void a(int i, String str) {
                                if (a.this.f29098a != null) {
                                    a.this.f29098a.a(i, str);
                                }
                            }

                            public final void a(boolean z, Patch patch) {
                                if (a.this.f29098a != null) {
                                    a.this.f29098a.a(z, patch);
                                }
                                if (patch.isAppliedSuccess()) {
                                    for (com.bytedance.ies.b.a.a next : a.this.f29099b) {
                                        if (next.a().equals(patch.getMd5())) {
                                            next.f20193e = true;
                                            next.f20194f = patch.getPatchedClasses();
                                        }
                                    }
                                }
                            }
                        };
                        aVar.f20212f = this.g;
                        this.h = new e(aVar, (byte) 0);
                        this.h.f20202c.start();
                        this.h.f20202c.f20213a = true;
                        g.a("saveu", "patch succeed. newFetchInfos=" + list);
                    } else {
                        throw new RuntimeException("UPDATE_VERSION_CODE could not be null");
                    }
                } catch (Throwable th) {
                    g.a("saveu", "patch failed. newFetchInfos=" + list, th);
                }
            } else {
                Message obtainMessage = this.f29100d.obtainMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                C0349a aVar2 = new C0349a((byte) 0);
                aVar2.f29106a = list;
                obtainMessage.obj = aVar2;
                this.f29100d.sendMessageDelayed(obtainMessage, 3000);
            }
        }
    }

    public final void a(JSONArray jSONArray) {
        if (this.f29101e != null && jSONArray != null) {
            if (this.f29098a != null) {
                this.f29098a.b(jSONArray.toString());
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        if (jSONObject != null) {
                            jSONObject.optString("patch_name");
                            jSONObject.optInt("versioncode");
                            boolean optBoolean = jSONObject.optBoolean("offline");
                            jSONObject.optBoolean("wifionly", true);
                            if (!optBoolean) {
                                String optString = jSONObject.optString(PushConstants.WEB_URL);
                                String optString2 = jSONObject.optString("md5");
                                JSONArray optJSONArray = jSONObject.optJSONArray("backup_urls");
                                JSONArray jSONArray2 = new JSONArray();
                                jSONArray2.put(optString);
                                if (optJSONArray != null && optJSONArray.length() > 0) {
                                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                        jSONArray2.put(optJSONArray.get(i3));
                                    }
                                }
                                arrayList.add(new com.bytedance.ies.b.a.a(this.i, URLEncoder.encode(jSONArray2.toString(), "UTF-8"), optString2));
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            a((List<com.bytedance.ies.b.a.a>) arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = j     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            j = r0     // Catch:{ all -> 0x0076 }
            android.content.Context r1 = r2.f29101e     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0074
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x0074
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x0074
            r2.g = r4     // Catch:{ all -> 0x0076 }
            r2.i = r3     // Catch:{ all -> 0x0076 }
            com.ss.android.h.f.f29123f = r2     // Catch:{ all -> 0x0076 }
            android.content.Context r4 = r2.f29101e     // Catch:{ all -> 0x0076 }
            com.ss.android.h.f r4 = com.ss.android.h.f.a(r4)     // Catch:{ all -> 0x0076 }
            r4.f29126c = r0     // Catch:{ all -> 0x0076 }
            com.bytedance.ies.b.b.a.f20198a = r3     // Catch:{ all -> 0x0076 }
            android.content.Context r3 = r2.f29101e     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x006c
            java.lang.String r4 = com.bytedance.ies.b.b.a.f20198a     // Catch:{ all -> 0x0076 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0076 }
            if (r4 != 0) goto L_0x0064
            java.lang.String r4 = "ies_patch"
            r0 = 0
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r3, r4, r0)     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = com.bytedance.ies.b.b.a.f20198a     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = "patch_version_key"
            r1 = 0
            java.lang.String r0 = r3.getString(r0, r1)     // Catch:{ all -> 0x0076 }
            boolean r4 = r4.equals(r0)     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x005b
            java.lang.String r4 = "patch_key"
            java.lang.String r0 = ""
            java.lang.String r3 = r3.getString(r4, r0)     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = ";"
            java.util.List r3 = com.bytedance.ies.b.c.b.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0076 }
            goto L_0x0060
        L_0x005b:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0076 }
            r3.<init>()     // Catch:{ all -> 0x0076 }
        L_0x0060:
            r2.a((java.util.List<com.bytedance.ies.b.a.a>) r3)     // Catch:{ all -> 0x0076 }
            goto L_0x0074
        L_0x0064:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "UPDATE_VERSION_CODE could not be null"
            r3.<init>(r4)     // Catch:{ all -> 0x0076 }
            throw r3     // Catch:{ all -> 0x0076 }
        L_0x006c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "Context could not be null"
            r3.<init>(r4)     // Catch:{ all -> 0x0076 }
            throw r3     // Catch:{ all -> 0x0076 }
        L_0x0074:
            monitor-exit(r2)
            return
        L_0x0076:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.h.a.a.a(java.lang.String, java.lang.String):void");
    }
}
