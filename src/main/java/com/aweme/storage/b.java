package com.aweme.storage;

import a.i;
import android.content.Context;
import android.os.FileObserver;
import com.aweme.storage.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static int f7369a;

    /* renamed from: b  reason: collision with root package name */
    static long f7370b;

    /* renamed from: c  reason: collision with root package name */
    static int f7371c;

    /* renamed from: d  reason: collision with root package name */
    static List<String> f7372d;

    /* renamed from: e  reason: collision with root package name */
    static List<FileObserver> f7373e;

    /* renamed from: f  reason: collision with root package name */
    static h f7374f;
    static g g;
    static volatile boolean h;

    static class a extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        public m f7375a;

        /* renamed from: b  reason: collision with root package name */
        public Context f7376b;

        public final void onEvent(int i, String str) {
            new StringBuilder("event path ").append(this.f7375a.f7411b);
            i.a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    if (a.this.f7376b != null) {
                        j a2 = l.a(a.this.f7376b);
                        if (a2 != null) {
                            a2.b(a.this.f7375a);
                        }
                    }
                    return null;
                }
            });
        }

        a(Context context, m mVar, int i) {
            super(mVar.f7411b, 547);
            this.f7375a = mVar;
            this.f7376b = context;
        }
    }

    static List<m> a(Context context) {
        if (f7369a <= 0 || context == null) {
            return null;
        }
        j a2 = l.a(context);
        if (a2 == null) {
            return null;
        }
        List<m> a3 = a2.a();
        if (a3.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (m next : a3) {
            if (!(next == null || next.f7411b == null)) {
                StringBuilder sb = new StringBuilder("black path ");
                sb.append(next.f7411b);
                sb.append("  ");
                sb.append(new Date(next.f7413d));
                sb.append(" ");
                sb.append(next.f7414e);
            }
            if (next == null || next.f7414e < f7371c || next.f7413d + f7370b >= System.currentTimeMillis()) {
                arrayList2.add(next);
            } else {
                new StringBuilder("expired files ").append(next.f7411b);
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            m[] mVarArr = new m[arrayList.size()];
            arrayList.toArray(mVarArr);
            a2.b(mVarArr);
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder();
            for (m mVar : mVarArr) {
                if (!(mVar == null || mVar.f7411b == null)) {
                    sb2.append(mVar.f7411b);
                    sb2.append(";");
                }
            }
            try {
                jSONObject.put("files", sb2.toString());
            } catch (JSONException unused) {
            }
            new StringBuilder("delete files ").append(jSONObject.toString());
            if (g != null) {
                g.a("delete_files", jSONObject);
            }
        }
        return arrayList2;
    }

    static void a(Context context, List<d.a> list) {
        if (f7369a > 0 && context != null && list.size() > 0) {
            ArrayList<File> arrayList = new ArrayList<>();
            for (d.a next : list) {
                if (!(next == null || next.b() == null)) {
                    new StringBuilder("get node path: ").append(next.b());
                    String b2 = next.b();
                    if (b2.startsWith(d.b.e.name()) && context.getExternalCacheDir() != null) {
                        b2 = context.getExternalCacheDir().getParent() + b2.substring(1);
                    } else if (b2.startsWith(d.b.p.name()) && context.getCacheDir() != null) {
                        b2 = context.getCacheDir().getParent() + b2.substring(1);
                    }
                    new StringBuilder("get node file path ").append(b2);
                    File file = new File(b2);
                    if (file.exists()) {
                        d.a(file, arrayList);
                    }
                }
            }
            for (File file2 : arrayList) {
                StringBuilder sb = new StringBuilder("get black folder files : ");
                sb.append(file2.getAbsolutePath());
                sb.append(" ");
                sb.append(file2.length());
            }
            Collections.sort(arrayList, new Comparator<File>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    long j;
                    File file = (File) obj;
                    File file2 = (File) obj2;
                    long j2 = 0;
                    if (file == null) {
                        j = 0;
                    } else {
                        j = file.length();
                    }
                    if (file2 != null) {
                        j2 = file2.length();
                    }
                    if (j < j2) {
                        return 1;
                    }
                    if (j == j2) {
                        return 0;
                    }
                    return -1;
                }
            });
            for (File file3 : arrayList) {
                StringBuilder sb2 = new StringBuilder("sort files : ");
                sb2.append(file3.getAbsolutePath());
                sb2.append(" ");
                sb2.append(file3.length());
            }
            ArrayList<m> arrayList2 = new ArrayList<>();
            for (File file4 : arrayList) {
                if (file4 != null && arrayList2.size() < f7369a) {
                    if (f7372d != null) {
                        int i = 0;
                        while (i < f7372d.size() && !file4.getAbsolutePath().contains(f7372d.get(i))) {
                            i++;
                        }
                        if (i >= f7372d.size() && (f7374f == null || f7374f.b() == null || !f7374f.b().contains(file4.getAbsolutePath()))) {
                            arrayList2.add(new m(file4.getAbsolutePath(), System.currentTimeMillis(), 1));
                        }
                    } else if (f7374f == null || f7374f.b() == null || !f7374f.b().contains(file4.getAbsolutePath())) {
                        arrayList2.add(new m(file4.getAbsolutePath(), System.currentTimeMillis(), 1));
                    }
                }
            }
            for (m mVar : arrayList2) {
                new StringBuilder("black list: ").append(mVar.f7411b);
            }
            l.a(context, arrayList2, f7369a);
        }
    }
}
