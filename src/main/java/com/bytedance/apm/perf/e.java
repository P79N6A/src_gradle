package com.bytedance.apm.perf;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.apm.k.r;
import java.io.File;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e extends a {
    private static long q = 17179869184L;

    /* renamed from: a  reason: collision with root package name */
    public long f2070a = 524288000;

    /* renamed from: d  reason: collision with root package name */
    public String f2071d;

    /* renamed from: e  reason: collision with root package name */
    public String f2072e;

    /* renamed from: f  reason: collision with root package name */
    public String f2073f;
    public String g;
    public long h;
    public long i;
    public long j;
    public long k;
    private boolean l;
    private boolean m;
    private long n = 524288000;
    private int o = 20;
    private long p = 2592000000L;
    private boolean r;
    private r<a> s;
    private r<a> t;
    private r<c> u;

    static class a implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public long f19054a;

        /* renamed from: b  reason: collision with root package name */
        private String f19055b;

        /* renamed from: c  reason: collision with root package name */
        private int f19056c;

        public final JSONObject a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.f19055b);
                jSONObject.put("size", this.f19054a);
                if (this.f19056c > 0) {
                    jSONObject.put("num", this.f19056c);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public final int compareTo(Object obj) {
            a aVar = (a) obj;
            if (this.f19054a == aVar.f19054a) {
                return 0;
            }
            if (this.f19054a > aVar.f19054a) {
                return 1;
            }
            return -1;
        }

        public a(String str, long j, int i) {
            this.f19055b = str;
            this.f19054a = j;
            this.f19056c = i;
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        public String f19057a;

        /* renamed from: b  reason: collision with root package name */
        public b f19058b;

        /* renamed from: c  reason: collision with root package name */
        public int f19059c;

        /* renamed from: d  reason: collision with root package name */
        public int f19060d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f19061e;

        /* renamed from: f  reason: collision with root package name */
        public long f19062f;
        private int h;
        private boolean i;

        private boolean a() {
            if (this.h == this.f19060d) {
                return true;
            }
            return false;
        }

        private void b() {
            if (TextUtils.equals(this.f19057a, e.this.f2071d)) {
                e.this.h = (long) this.f19059c;
            } else if (TextUtils.equals(this.f19057a, e.this.f2073f)) {
                e.this.i = (long) this.f19059c;
            } else if (TextUtils.equals(this.f19057a, e.this.f2072e)) {
                e.this.j = (long) this.f19059c;
            } else {
                if (TextUtils.equals(this.f19057a, e.this.g)) {
                    e.this.k = (long) this.f19059c;
                }
            }
        }

        private b() {
        }

        public final void a(long j) {
            this.f19059c = (int) (((long) this.f19059c) + j);
            this.h++;
            if (this.f19058b != null && a()) {
                if (this.i) {
                    this.f19058b.i = true;
                }
                if (((long) this.f19059c) >= e.this.f2070a && !this.i) {
                    e.this.a(this.f19057a, (long) this.f19059c, this.f19060d);
                    this.f19058b.i = true;
                }
                this.f19058b.a((long) this.f19059c);
                if (this.f19061e) {
                    e.this.a(this.f19057a, (long) this.f19059c, this.f19060d, this.f19062f);
                }
                b();
            }
        }

        /* synthetic */ b(e eVar, byte b2) {
            this();
        }
    }

    static class c implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public long f19063a;

        /* renamed from: b  reason: collision with root package name */
        private String f19064b;

        /* renamed from: c  reason: collision with root package name */
        private int f19065c;

        /* renamed from: d  reason: collision with root package name */
        private long f19066d;

        public final JSONObject a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.f19064b);
                jSONObject.put("size", this.f19063a);
                if (this.f19065c > 0) {
                    jSONObject.put("num", this.f19065c);
                }
                jSONObject.put("outdate_interval", this.f19066d);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public final int compareTo(Object obj) {
            c cVar = (c) obj;
            if (this.f19066d == cVar.f19066d) {
                return 0;
            }
            if (this.f19066d > cVar.f19066d) {
                return 1;
            }
            return -1;
        }

        public c(String str, long j, int i, long j2) {
            this.f19064b = str;
            this.f19063a = j;
            this.f19065c = i;
            this.f19066d = j2;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return 120000;
    }

    private void a() {
        String[] strArr;
        int i2 = 2;
        byte b2 = 0;
        String[] strArr2 = {this.f2071d, this.f2073f};
        int i3 = 0;
        while (i3 < i2) {
            String str = strArr2[i3];
            File file = new File(str);
            b bVar = new b(this, b2);
            bVar.f19057a = str;
            bVar.f19058b = new b(this, b2);
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                bVar.f19060d = listFiles.length;
                LinkedList linkedList = new LinkedList();
                linkedList.offer(bVar);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        b bVar2 = (b) linkedList.poll();
                        if (bVar2 != null) {
                            String str2 = bVar2.f19057a;
                            File file2 = new File(str2);
                            if (file2.isFile()) {
                                strArr = strArr2;
                                long length = file2.length();
                                if (length > 0) {
                                    a(str2, length);
                                }
                                if (bVar2.f19058b != null) {
                                    bVar2.f19058b.a(length);
                                    if (!bVar2.f19058b.f19061e) {
                                        long b3 = b(file2.lastModified());
                                        if (b3 > 0) {
                                            a(str2, length, 0, b3);
                                        }
                                    }
                                }
                            } else {
                                strArr = strArr2;
                                File[] listFiles2 = file2.listFiles();
                                if (listFiles2 == null || listFiles2.length == 0) {
                                    bVar2.f19058b.a(0);
                                    i4++;
                                    strArr2 = strArr;
                                    b2 = 0;
                                } else {
                                    bVar2.f19060d = listFiles2.length;
                                    int length2 = listFiles2.length;
                                    int i5 = 0;
                                    while (i5 < length2) {
                                        File file3 = listFiles2[i5];
                                        b bVar3 = new b(this, b2);
                                        bVar3.f19058b = bVar2;
                                        bVar3.f19057a = file3.getAbsolutePath();
                                        if (file3.isDirectory() && !bVar2.f19061e) {
                                            long b4 = b(file3.lastModified());
                                            if (b4 > 0) {
                                                bVar3.f19061e = true;
                                                bVar3.f19062f = b4;
                                                linkedList.offer(bVar3);
                                                i5++;
                                                b2 = 0;
                                            }
                                        }
                                        linkedList.offer(bVar3);
                                        i5++;
                                        b2 = 0;
                                    }
                                }
                            }
                        } else {
                            strArr = strArr2;
                        }
                        i4++;
                        strArr2 = strArr;
                        b2 = 0;
                    }
                }
            }
            i3++;
            strArr2 = strArr2;
            i2 = 2;
            b2 = 0;
        }
    }

    public final void e() {
        boolean z = this.f2059c;
        if (!this.l && z) {
            if (this.f2071d == null) {
                Context a2 = com.bytedance.apm.c.a();
                try {
                    String packageName = a2.getPackageName();
                    this.f2071d = a2.getFilesDir().getParent();
                    this.f2072e = a2.getCacheDir().getAbsolutePath();
                    this.f2073f = com.bytedance.apm.k.e.a() + "/Android/data/" + packageName;
                    File externalCacheDir = a2.getExternalCacheDir();
                    if (externalCacheDir != null) {
                        this.g = externalCacheDir.getAbsolutePath();
                    }
                } catch (Exception unused) {
                    this.r = true;
                }
            }
            if (this.r) {
                this.l = true;
                return;
            }
            if (this.m) {
                try {
                    a();
                    a(this.h + this.i, this.j + this.k, Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace(), Environment.getDataDirectory().getFreeSpace());
                    com.bytedance.apm.internal.a a3 = com.bytedance.apm.internal.a.a();
                    a3.f2038a.edit().putLong("check_disk_last_time", System.currentTimeMillis()).apply();
                } catch (Exception unused2) {
                }
            } else {
                a(com.bytedance.apm.k.c.b(com.bytedance.apm.c.a()), com.bytedance.apm.k.c.c(com.bytedance.apm.c.a()), com.bytedance.apm.k.c.d(), Environment.getDataDirectory().getFreeSpace());
            }
            this.l = true;
            g();
            h();
        }
    }

    private long b(long j2) {
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis < this.p || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    /* access modifiers changed from: protected */
    public final void a(JSONObject jSONObject) {
        this.m = jSONObject.optBoolean("exception_disk_switch", false);
        if (this.m) {
            long currentTimeMillis = System.currentTimeMillis() - com.bytedance.apm.internal.a.a().f2038a.getLong("check_disk_last_time", 0);
            if (currentTimeMillis < 86400000 && currentTimeMillis > 0) {
                this.l = true;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("exception_disk");
            if (optJSONObject.optInt("disk_used_size_threshold") > 0) {
                this.n = ((long) optJSONObject.optInt("disk_used_size_threshold")) * 1024 * 1024;
            }
            if (optJSONObject.optInt("folder_size_threshold") > 0) {
                this.f2070a = ((long) optJSONObject.optInt("folder_size_threshold")) * 1024 * 1024;
            }
            if (optJSONObject.optInt("outdate_interval") > 0) {
                this.o = optJSONObject.optInt("outdate_interval");
            }
            if (optJSONObject.optInt("max_report_count") > 0) {
                this.p = ((long) optJSONObject.optInt("max_report_count")) * 86400000;
            }
        }
    }

    private void a(String str, long j2) {
        if (j2 <= q) {
            if (this.s == null) {
                this.s = new r<>(this.o);
            }
            this.s.a(new a(str, j2, 1));
        }
    }

    public final void a(String str, long j2, int i2) {
        if (j2 <= q) {
            if (this.t == null) {
                this.t = new r<>(this.o);
            }
            this.t.a(new a(str, j2, i2));
        }
    }

    public final void a(String str, long j2, int i2, long j3) {
        if (j2 >= 102400 && j2 <= q) {
            if (this.u == null) {
                this.u = new r<>(this.o);
            }
            r<c> rVar = this.u;
            c cVar = new c(str, j2, i2, j3);
            rVar.a(cVar);
        }
    }

    private void a(long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        try {
            if (com.bytedance.apm.c.d()) {
                new String[1][0] = "disk: data: " + j8 + " , cache: " + j9 + " , total: " + j10 + " , free: " + j11;
            }
            if (j8 > q) {
                j6 = q;
            } else {
                j6 = j8;
            }
            if (j9 > q) {
                j7 = q;
            } else {
                j7 = j9;
            }
            JSONObject jSONObject = new JSONObject();
            if (j8 > 0) {
                jSONObject.put("data", j6);
            }
            if (j9 > 0) {
                jSONObject.put("cache", j7);
            }
            if (j10 > 0) {
                jSONObject.put("total", j10);
            }
            if (j11 > 0) {
                jSONObject.put("rom_free", j11);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.m && j6 > this.n) {
                if (this.s != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (a a2 : this.s.a()) {
                        JSONObject a3 = a2.a();
                        if (a3 != null) {
                            jSONArray.put(a3);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                    this.s = null;
                }
                if (this.t != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (a a4 : this.t.a()) {
                        JSONObject a5 = a4.a();
                        if (a5 != null) {
                            jSONArray2.put(a5);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                    this.t = null;
                }
                if (this.u != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (c a6 : this.u.a()) {
                        JSONObject a7 = a6.a();
                        if (a7 != null) {
                            jSONArray3.put(a7);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                    this.u = null;
                }
            }
            com.bytedance.apm.d.b.e eVar = new com.bytedance.apm.d.b.e("disk", "storageUsed", false, jSONObject, null, jSONObject2);
            a(eVar);
        } catch (Exception unused) {
        }
    }
}
