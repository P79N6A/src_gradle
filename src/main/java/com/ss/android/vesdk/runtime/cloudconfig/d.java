package com.ss.android.vesdk.runtime.cloudconfig;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.annotation.RestrictTo;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static c f78118a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final e f78119b = new e();
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: c  reason: collision with root package name */
    public static int f78120c = 0;

    public static class a extends AsyncTask<Void, Void, Void> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        }

        private a() {
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Void a() {
            /*
                com.ss.android.vesdk.runtime.VERuntime r0 = com.ss.android.vesdk.runtime.VERuntime.a()     // Catch:{  }
                android.content.Context r0 = r0.f78079a     // Catch:{  }
                java.util.Map r1 = com.ss.android.ttve.monitor.a.a()     // Catch:{  }
                java.lang.String r0 = r0.getPackageName()     // Catch:{  }
                java.lang.String r2 = "package_name"
                r1.put(r2, r0)     // Catch:{  }
                java.lang.String r0 = "model"
                java.lang.String r2 = android.os.Build.MODEL     // Catch:{  }
                r1.put(r0, r2)     // Catch:{  }
                java.lang.String r0 = "os_version"
                java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{  }
                r1.put(r0, r2)     // Catch:{  }
                java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{  }
                if (r0 == 0) goto L_0x003d
                java.lang.String r2 = r0.getCountry()     // Catch:{  }
                if (r2 != 0) goto L_0x0030
                java.lang.String r0 = ""
                goto L_0x0034
            L_0x0030:
                java.lang.String r0 = r0.getCountry()     // Catch:{  }
            L_0x0034:
                java.lang.String r2 = "locale"
                java.lang.String r0 = r0.toLowerCase()     // Catch:{  }
                r1.put(r2, r0)     // Catch:{  }
            L_0x003d:
                java.lang.String r0 = "platform"
                java.lang.String r2 = "android"
                r1.put(r0, r2)     // Catch:{  }
                int r0 = com.ss.android.vesdk.runtime.cloudconfig.d.f78120c     // Catch:{  }
                if (r0 == 0) goto L_0x0054
                switch(r0) {
                    case 2: goto L_0x0051;
                    case 3: goto L_0x004e;
                    default: goto L_0x004b;
                }     // Catch:{  }
            L_0x004b:
                java.lang.String r0 = "https://effect.snssdk.com/devicehub/getSettings?"
                goto L_0x0056
            L_0x004e:
                java.lang.String r0 = "https://sg-effect.byteoversea.com/devicehub/getSetting?"
                goto L_0x0056
            L_0x0051:
                java.lang.String r0 = "https://va-effect.byteoversea.com/devicehub/getSettings?"
                goto L_0x0056
            L_0x0054:
                java.lang.String r0 = "https://effect.snssdk.com/devicehub/getSettings?"
            L_0x0056:
                java.lang.String r0 = r0.toString()     // Catch:{  }
                if (r1 == 0) goto L_0x00dc
                boolean r2 = r1.isEmpty()     // Catch:{  }
                if (r2 == 0) goto L_0x0064
                goto L_0x00dc
            L_0x0064:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>(r0)     // Catch:{  }
                r3 = 58
                int r3 = r0.indexOf(r3)     // Catch:{  }
                int r3 = r3 + 2
                r4 = 47
                int r5 = r0.lastIndexOf(r4)     // Catch:{  }
                if (r3 != r5) goto L_0x007c
                r2.append(r4)     // Catch:{  }
            L_0x007c:
                r3 = 63
                int r4 = r0.indexOf(r3)     // Catch:{  }
                int r5 = r2.length()     // Catch:{  }
                int r5 = r5 + -1
                r6 = -1
                r7 = 38
                if (r4 != r6) goto L_0x0091
                r2.append(r3)     // Catch:{  }
                goto L_0x009c
            L_0x0091:
                if (r4 >= r5) goto L_0x009c
                char r0 = r0.charAt(r5)     // Catch:{  }
                if (r0 == r7) goto L_0x009c
                r2.append(r7)     // Catch:{  }
            L_0x009c:
                java.util.Set r0 = r1.entrySet()     // Catch:{  }
                java.util.Iterator r0 = r0.iterator()     // Catch:{  }
                java.lang.Object r1 = r0.next()     // Catch:{  }
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{  }
                java.lang.Object r3 = r1.getKey()     // Catch:{  }
                java.lang.String r3 = r3.toString()     // Catch:{  }
                java.lang.Object r1 = r1.getValue()     // Catch:{  }
                com.ss.android.vesdk.runtime.cloudconfig.b.a(r3, r1, r2)     // Catch:{  }
            L_0x00b9:
                boolean r1 = r0.hasNext()     // Catch:{  }
                if (r1 == 0) goto L_0x00d8
                r2.append(r7)     // Catch:{  }
                java.lang.Object r1 = r0.next()     // Catch:{  }
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{  }
                java.lang.Object r3 = r1.getKey()     // Catch:{  }
                java.lang.String r3 = r3.toString()     // Catch:{  }
                java.lang.Object r1 = r1.getValue()     // Catch:{  }
                com.ss.android.vesdk.runtime.cloudconfig.b.a(r3, r1, r2)     // Catch:{  }
                goto L_0x00b9
            L_0x00d8:
                java.lang.String r0 = r2.toString()     // Catch:{  }
            L_0x00dc:
                java.lang.String r0 = com.ss.android.vesdk.runtime.cloudconfig.b.a((java.lang.CharSequence) r0)     // Catch:{  }
                com.ss.android.vesdk.runtime.cloudconfig.b r1 = new com.ss.android.vesdk.runtime.cloudconfig.b     // Catch:{  }
                java.lang.String r2 = "GET"
                r1.<init>(r0, r2)     // Catch:{  }
                java.lang.String r0 = r1.a()     // Catch:{  }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x010e }
                r1.<init>(r0)     // Catch:{ Exception -> 0x010e }
                com.ss.android.vesdk.runtime.cloudconfig.c r0 = com.ss.android.vesdk.runtime.cloudconfig.d.f78118a     // Catch:{ Exception -> 0x010e }
                if (r0 == 0) goto L_0x0106
                com.ss.android.vesdk.runtime.cloudconfig.c r0 = com.ss.android.vesdk.runtime.cloudconfig.d.f78118a     // Catch:{ Exception -> 0x010e }
                java.util.Map r0 = r0.a(r1)     // Catch:{ Exception -> 0x010e }
                if (r0 == 0) goto L_0x010e
                com.ss.android.vesdk.runtime.VERuntime r1 = com.ss.android.vesdk.runtime.VERuntime.a()     // Catch:{ Exception -> 0x010e }
                android.content.Context r1 = r1.f78079a     // Catch:{ Exception -> 0x010e }
                com.ss.android.vesdk.runtime.cloudconfig.d.a(r1, r0)     // Catch:{ Exception -> 0x010e }
                goto L_0x010e
            L_0x0106:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x010e }
                java.lang.String r1 = "Injector == null. VECloudConfig is not initialized!"
                r0.<init>(r1)     // Catch:{ Exception -> 0x010e }
                throw r0     // Catch:{ Exception -> 0x010e }
            L_0x010e:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.runtime.cloudconfig.d.a.a():java.lang.Void");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void a() {
        if (VERuntime.a().f78079a != null) {
            a(a(VERuntime.a().f78079a));
            return;
        }
        throw new IllegalStateException("Must call VideoSdkCore.init() before.");
    }

    private static void a(Map<String, String> map) {
        if (f78118a != null) {
            f78118a.a(map, f78119b);
            return;
        }
        throw new IllegalStateException("CompileTimeBUG: Injector == null. VECloudConfig won't be initialized!. Consider specify an IInjector instance before compile code.");
    }

    private static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : c.a(context, "ShortVideoConfig", 0).getAll().entrySet()) {
            if (((String) next.getKey()).startsWith("PerfConfig_")) {
                hashMap.put(((String) next.getKey()).substring(11), (String) next.getValue());
            }
        }
        return hashMap;
    }

    public static void a(Context context, Map<String, String> map) {
        if (map != null) {
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            SharedPreferences.Editor edit = c.a(context, "ShortVideoConfig", 0).edit();
            for (Map.Entry next : entrySet) {
                edit.putString("PerfConfig_" + ((String) next.getKey()), (String) next.getValue());
            }
            edit.apply();
        }
    }
}
