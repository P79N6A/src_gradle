package com.aweme.storage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static long f7387a;

    /* renamed from: b  reason: collision with root package name */
    static long f7388b;

    /* renamed from: c  reason: collision with root package name */
    static List<String> f7389c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f7390a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f7391b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private String f7392c;

        /* renamed from: d  reason: collision with root package name */
        private a f7393d;

        /* renamed from: e  reason: collision with root package name */
        private String f7394e;

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f7390a > d.f7387a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final String b() {
            if (this.f7394e != null) {
                return this.f7394e;
            }
            if (this.f7393d == null) {
                this.f7394e = this.f7392c;
            } else {
                this.f7394e = this.f7393d.b() + File.separator + this.f7392c;
            }
            return this.f7394e;
        }

        /* access modifiers changed from: package-private */
        public final JSONObject c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.f7392c);
                jSONObject.put("size", this.f7390a);
                if (this.f7391b != null && this.f7391b.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (a next : this.f7391b) {
                        if (next != null) {
                            jSONArray.put(next.c());
                        }
                    }
                    jSONObject.put("child", jSONArray);
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        public final void a(a aVar) {
            this.f7391b.add(aVar);
        }

        static a a(JSONObject jSONObject, a aVar) {
            if (jSONObject == null) {
                return null;
            }
            try {
                String optString = jSONObject.optString("name");
                long optLong = jSONObject.optLong("size", 0);
                if (optString == null) {
                    return null;
                }
                a aVar2 = new a(optString, optLong, aVar);
                if (aVar != null) {
                    aVar.a(aVar2);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("child");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            a(jSONObject2, aVar2);
                        }
                    }
                }
                return aVar2;
            } catch (Exception unused) {
                return null;
            }
        }

        a(String str, long j, a aVar) {
            this.f7392c = str;
            this.f7390a = j;
            this.f7393d = aVar;
        }
    }

    enum b {
        p,
        e
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.aweme.storage.d.a a(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            r1 = 0
            if (r4 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0037, all -> 0x0031 }
            r4.<init>(r0)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0037, all -> 0x0031 }
            int r0 = r4.available()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            byte[] r0 = new byte[r0]     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r4.read(r0)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            java.lang.String r3 = "utf-8"
            r2.<init>(r0, r3)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r0.<init>(r2)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            com.aweme.storage.d$a r0 = com.aweme.storage.d.a.a(r0, r1)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r4.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return r0
        L_0x002f:
            r0 = move-exception
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            r4 = r1
        L_0x0033:
            r4.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            throw r0
        L_0x0037:
            r4 = r1
        L_0x0038:
            r4.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.d.a(java.lang.String):com.aweme.storage.d$a");
    }

    static void a(a aVar) {
        if (aVar != null) {
            aVar.b();
            if (aVar.f7391b != null && aVar.f7391b.size() > 0) {
                for (a a2 : aVar.f7391b) {
                    a(a2);
                }
            }
        }
    }

    static void a(File file, List<File> list) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isFile() && file2.length() > f7388b && !list.contains(file2)) {
                        list.add(file2);
                    }
                }
            }
        }
    }

    static a a(File file, a aVar, b bVar) {
        String str;
        if (file == null || !file.exists()) {
            return null;
        }
        boolean z = true;
        if (file != null && !file.isFile() && (f7389c == null || !f7389c.contains(file.getName()))) {
            z = false;
        }
        if (z) {
            return null;
        }
        if (aVar == null) {
            str = bVar.name();
        } else {
            str = file.getName();
        }
        a aVar2 = new a(str, e.a(file), aVar);
        if (aVar != null) {
            aVar.a(aVar2);
        }
        if (file.isFile()) {
            return null;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File a2 : listFiles) {
                    a(a2, aVar2, bVar);
                }
            }
        }
        return aVar2;
    }

    static void a(a aVar, a aVar2, List<a> list) {
        boolean z;
        if (aVar != null && aVar2 != null && list != null) {
            if (aVar == null || aVar2.f7390a - aVar.f7390a <= f7387a) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                list.add(aVar2);
            }
            List<a> list2 = aVar2.f7391b;
            if (list2 != null && !list2.isEmpty()) {
                List<a> list3 = aVar.f7391b;
                if (list3 == null || list3.isEmpty()) {
                    for (a next : list2) {
                        if (next != null && next.a()) {
                            list.add(next);
                        }
                    }
                    return;
                }
                for (a next2 : list2) {
                    if (next2 != null) {
                        Iterator<a> it2 = list3.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            a next3 = it2.next();
                            if (next3 != null && next2.b().equals(next3.b())) {
                                a(next3, next2, list);
                                break;
                            }
                            i++;
                        }
                        if (i >= list3.size() && next2 != null && next2.a()) {
                            list.add(next2);
                        }
                    }
                }
            }
        }
    }
}
