package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.util.c;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47659a;

    /* renamed from: c  reason: collision with root package name */
    private static v f47660c;

    /* renamed from: b  reason: collision with root package name */
    public String f47661b = new File(b.c(GlobalContext.getContext()), "filters").getAbsolutePath();

    private v() {
        b.a(this.f47661b, false);
    }

    public static v a() {
        if (PatchProxy.isSupport(new Object[0], null, f47659a, true, 44264, new Class[0], v.class)) {
            return (v) PatchProxy.accessDispatch(new Object[0], null, f47659a, true, 44264, new Class[0], v.class);
        }
        if (f47660c == null) {
            synchronized (v.class) {
                if (f47660c == null) {
                    f47660c = new v();
                }
            }
        }
        return f47660c;
    }

    public final boolean c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47659a, false, 44268, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47659a, false, 44268, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i < 0) {
            return true;
        } else {
            return b(i);
        }
    }

    public final String a(int i) {
        StringBuilder sb;
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47659a, false, 44266, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47659a, false, 44266, new Class[]{Integer.TYPE}, String.class);
        }
        String str2 = i + ".zip";
        if (this.f47661b.endsWith(File.separator)) {
            sb = new StringBuilder();
            str = this.f47661b;
        } else {
            sb = new StringBuilder();
            sb.append(this.f47661b);
            str = File.separator;
        }
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public final boolean b(int i) {
        StringBuilder sb;
        String str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47659a, false, 44267, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47659a, false, 44267, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.f47661b.endsWith(File.separator)) {
            sb = new StringBuilder();
            str = this.f47661b;
        } else {
            sb = new StringBuilder();
            sb.append(this.f47661b);
            str = File.separator;
        }
        sb.append(str);
        sb.append(i);
        sb.append(File.separator);
        File file = new File(sb.toString());
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = false;
            boolean z3 = false;
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    String name = file2.getName();
                    if (new File(file2.getAbsolutePath() + File.separator + name + ".png").exists()) {
                        z2 = true;
                    }
                } else if (file2.isFile() && !TextUtils.equals("config.json", file2.getName()) && TextUtils.equals("thumbnail.jpg", file2.getName())) {
                    z3 = true;
                }
            }
            if (z2 && z3) {
                z = true;
            }
        }
        return z;
    }

    @NonNull
    public final String a(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47659a, false, 44265, new Class[]{h.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47659a, false, 44265, new Class[]{h.class}, String.class);
        } else if (hVar2 == null) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            String str = this.f47661b;
            sb.append(new File(str, hVar2.f47598b).getAbsolutePath());
            sb.append(File.separator);
            return sb.toString();
        }
    }

    public final void b(h hVar) {
        h hVar2;
        String a2;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f47659a, false, 44269, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f47659a, false, 44269, new Class[]{h.class}, Void.TYPE);
            return;
        }
        File file = new File(this.f47661b, hVar.f47598b);
        if (!file.exists() || !file.isDirectory()) {
            File file2 = new File(a(hVar.f47598b));
            try {
                b.b(file);
                hVar.i = w.a(a2 + File.separator);
                String b2 = w.b(hVar.i);
                if (TextUtils.isEmpty(b2)) {
                    b2 = a2;
                }
                hVar.j = b2;
                hVar.h = a2 + File.separator + "thumbnail.jpg";
            } catch (IOException e2) {
                c.a("filter unzip error" + hVar.f47598b + " filterZipFile path ->" + r1 + " filterZipFile path exit ->" + file2.exists());
                c.a(Log.getStackTraceString(e2));
                if (PatchProxy.isSupport(new Object[0], this, f47659a, false, 44270, new Class[0], h.class)) {
                    hVar2 = (h) PatchProxy.accessDispatch(new Object[0], this, f47659a, false, 44270, new Class[0], h.class);
                } else {
                    List<h> d2 = aa.a().d();
                    if (CollectionUtils.isEmpty(d2)) {
                        hVar2 = null;
                    } else {
                        hVar2 = d2.get(0);
                    }
                }
                if (hVar2 != null) {
                    hVar.i = hVar2.i;
                    hVar.j = hVar2.j;
                    hVar.h = hVar2.h;
                    hVar.g = hVar2.g;
                }
            } finally {
                file2.delete();
            }
        } else {
            String str = file.getAbsolutePath() + File.separator;
            hVar.i = w.a(str);
            String b3 = w.b(hVar.i);
            if (TextUtils.isEmpty(b3)) {
                b3 = str;
            }
            hVar.j = b3;
            hVar.h = str + "thumbnail.jpg";
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final List<h> a(String str) {
        int i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f47659a, false, 44271, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, this, f47659a, false, 44271, new Class[]{String.class}, List.class);
        }
        String[] stringArray = GlobalContext.getContext().getResources().getStringArray(C0906R.array.u);
        String[] stringArray2 = GlobalContext.getContext().getResources().getStringArray(C0906R.array.v);
        ArrayList arrayList = new ArrayList();
        Context context = GlobalContext.getContext();
        int length = stringArray.length;
        int i2 = -1;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (i3 < length) {
            String str3 = stringArray[i3];
            h hVar = new h();
            hVar.f47598b = i4;
            i4 += i2;
            hVar.f47602f = i5;
            if (i5 == 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("normal");
                hVar.k = arrayList2;
            }
            hVar.f47599c = str3;
            hVar.f47600d = stringArray2[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            Object[] objArr = new Object[2];
            if (i5 < 10) {
                i = 0;
            } else {
                i = "";
            }
            objArr[0] = i;
            objArr[1] = Integer.valueOf(i5);
            sb.append(String.format("filter_%s%s/", objArr));
            hVar.i = w.a(sb.toString());
            hVar.j = w.b(hVar.i);
            hVar.h = "";
            hVar.g = Uri.parse("res://" + context.getPackageName() + "/" + context.getResources().obtainTypedArray(C0906R.array.w).getResourceId(i5, 0));
            i5++;
            arrayList.add(hVar);
            i3++;
            i2 = -1;
        }
        return arrayList;
    }
}
