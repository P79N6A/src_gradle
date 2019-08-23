package com.ss.android.ugc.aweme.story.shootvideo.textfont;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.google.common.a.u;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74170a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f74171b = {"default", "Proxima-Nova-Semibold.otf"};

    /* renamed from: d  reason: collision with root package name */
    private static d f74172d;

    /* renamed from: c  reason: collision with root package name */
    public String f74173c = "default";

    /* renamed from: e  reason: collision with root package name */
    private LinkedHashMap<String, c> f74174e = new LinkedHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private HashMap<String, Typeface> f74175f = new HashMap<>();

    static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74177a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f74178b;

        /* renamed from: c  reason: collision with root package name */
        private c f74179c;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f74177a, false, 86098, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f74177a, false, 86098, new Class[]{DownloadInfo.class}, Void.TYPE);
                return;
            }
            d.a(this.f74179c, true, (Exception) null);
            if (d.a(this.f74179c)) {
                this.f74179c.k = 1;
            } else {
                d.c(this.f74179c.f74169f);
                this.f74179c.k = 2;
            }
            if (this.f74179c.l != null) {
                a aVar = this.f74179c.l;
                c cVar = this.f74179c;
                if (this.f74179c.k != 1) {
                    z = false;
                }
                aVar.a(cVar, z, this.f74178b);
            }
            this.f74179c.j = false;
            super.onSuccessed(downloadInfo);
        }

        a(c cVar, boolean z) {
            this.f74179c = cVar;
            this.f74178b = z;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException}, this, f74177a, false, 86099, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException}, this, f74177a, false, 86099, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE);
                return;
            }
            d.a(this.f74179c, false, (Exception) baseException);
            this.f74179c.k = 2;
            d.c(this.f74179c.f74169f);
            if (this.f74179c.l != null) {
                this.f74179c.l.a(this.f74178b);
            }
            this.f74179c.j = false;
            super.onFailed(downloadInfo, baseException);
        }
    }

    public void a(List<c> list) {
        List<c> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f74170a, false, 86085, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f74170a, false, 86085, new Class[]{List.class}, Void.TYPE);
        } else if (!com.bytedance.framwork.core.c.a.a(list)) {
            String str = com.ss.android.ugc.aweme.port.in.a.f61119b.getFilesDir().getAbsolutePath() + File.separator + "font";
            for (int i = 0; i < list.size(); i++) {
                String e2 = e(list2.get(i).f74165b);
                if (!TextUtils.isEmpty(e2)) {
                    c cVar = list2.get(i);
                    cVar.h = e2;
                    cVar.g = str;
                    cVar.f74169f = list2.get(i).g + File.separator + list2.get(i).h;
                    cVar.i = i + 1;
                    this.f74174e.put(e2, cVar);
                }
            }
        }
    }

    public final boolean a(c cVar, Context context, boolean z) {
        c cVar2 = cVar;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{cVar2, context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74170a, false, 86090, new Class[]{c.class, Context.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2, context, Byte.valueOf(z)}, this, f74170a, false, 86090, new Class[]{c.class, Context.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (context == null || TextUtils.isEmpty(cVar2.f74165b) || !NetworkUtils.isNetworkAvailable(context)) {
            return false;
        } else {
            if (cVar2.j) {
                return true;
            }
            if (!z2) {
                cVar2.j = true;
            }
            Downloader.with(context).url(cVar2.f74165b).savePath(cVar2.g).name(cVar2.h).mainThreadListener(new a(cVar2, z2)).download();
            return true;
        }
    }

    private d() {
    }

    public final Typeface d() {
        if (PatchProxy.isSupport(new Object[0], this, f74170a, false, 86080, new Class[0], Typeface.class)) {
            return (Typeface) PatchProxy.accessDispatch(new Object[0], this, f74170a, false, 86080, new Class[0], Typeface.class);
        } else if (this.f74175f.get(this.f74173c) != null) {
            return this.f74175f.get(this.f74173c);
        } else {
            return Typeface.DEFAULT_BOLD;
        }
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f74170a, false, 86081, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74170a, false, 86081, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (f() != null) {
            return f().a();
        } else {
            return false;
        }
    }

    public final c f() {
        if (!PatchProxy.isSupport(new Object[0], this, f74170a, false, 86082, new Class[0], c.class)) {
            return this.f74174e.get(this.f74173c);
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f74170a, false, 86082, new Class[0], c.class);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f74170a, false, 86092, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74170a, false, 86092, new Class[0], Void.TYPE);
            return;
        }
        i();
        this.f74175f.clear();
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f74170a, true, 86074, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f74170a, true, 86074, new Class[0], d.class);
        }
        if (f74172d == null) {
            synchronized (d.class) {
                if (f74172d == null) {
                    f74172d = new d();
                }
            }
        }
        return f74172d;
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f74170a, false, 86088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74170a, false, 86088, new Class[0], Void.TYPE);
            return;
        }
        try {
            String str = (String) com.ss.android.ugc.aweme.port.in.a.o.y().a();
            if (!TextUtils.isEmpty(str)) {
                a((List) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(str, new TypeToken<List<c>>() {
                }.getType()));
            }
        } catch (Exception unused) {
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f74170a, false, 86091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74170a, false, 86091, new Class[0], Void.TYPE);
        } else if (this.f74174e.size() != 0) {
            for (String next : this.f74174e.keySet()) {
                if (this.f74174e.get(next) != null) {
                    this.f74174e.get(next).l = null;
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74170a, false, 86079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74170a, false, 86079, new Class[0], Void.TYPE);
            return;
        }
        List<c> b2 = b();
        if (!com.bytedance.framwork.core.c.a.a(b2) && b2.get(0).b()) {
            this.f74173c = b2.get(0).h;
        }
    }

    public final List<c> b() {
        if (PatchProxy.isSupport(new Object[0], this, f74170a, false, 86076, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f74170a, false, 86076, new Class[0], List.class);
        }
        if (this.f74174e.values().size() == 0) {
            h();
            if (this.f74174e.size() == 0) {
                return new ArrayList();
            }
        }
        for (c next : this.f74174e.values()) {
            if (next != null) {
                if (b(next)) {
                    next.k = 1;
                } else {
                    Typeface d2 = d(next.f74169f);
                    if (d2 != null) {
                        this.f74175f.put(next.h, d2);
                        next.k = 1;
                    } else {
                        next.k = 2;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f74174e.values());
        return arrayList;
    }

    private boolean b(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f74170a, false, 86075, new Class[]{c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f74170a, false, 86075, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
        } else if (cVar2 == null || TextUtils.isEmpty(cVar2.h) || this.f74175f.get(cVar2.h) == null) {
            return false;
        } else {
            return true;
        }
    }

    public static void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f74170a, true, 86094, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f74170a, true, 86094, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && new File(str2).exists()) {
            try {
                new File(str2).delete();
            } catch (Exception unused) {
            }
        }
    }

    private Typeface d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f74170a, false, 86078, new Class[]{String.class}, Typeface.class)) {
            return (Typeface) PatchProxy.accessDispatch(new Object[]{str2}, this, f74170a, false, 86078, new Class[]{String.class}, Typeface.class);
        } else if (TextUtils.isEmpty(str) || !new File(str2).exists()) {
            return null;
        } else {
            try {
                return Typeface.createFromFile(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static String e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f74170a, true, 86095, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f74170a, true, 86095, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                return str2.substring(str2.lastIndexOf("/") + 1, str.length());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final Typeface b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f74170a, false, 86084, new Class[]{String.class}, Typeface.class)) {
            return (Typeface) PatchProxy.accessDispatch(new Object[]{str}, this, f74170a, false, 86084, new Class[]{String.class}, Typeface.class);
        } else if (TextUtils.isEmpty(str) || this.f74174e.size() == 0) {
            return null;
        } else {
            for (c next : this.f74174e.values()) {
                if (str.equals(next.f74164a)) {
                    return a(next.h);
                }
            }
            return null;
        }
    }

    public static boolean a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f74170a, true, 86093, new Class[]{c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f74170a, true, 86093, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
        } else if (cVar2 == null || TextUtils.isEmpty(cVar2.f74169f) || !new File(cVar2.f74169f).exists()) {
            return false;
        } else {
            try {
                Typeface createFromFile = Typeface.createFromFile(cVar2.f74169f);
                if (createFromFile == null) {
                    return false;
                }
                a().f74175f.put(cVar2.h, createFromFile);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public final Typeface a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f74170a, false, 86083, new Class[]{String.class}, Typeface.class)) {
            return (Typeface) PatchProxy.accessDispatch(new Object[]{str}, this, f74170a, false, 86083, new Class[]{String.class}, Typeface.class);
        } else if (TextUtils.isEmpty(str) || this.f74175f.size() == 0) {
            return null;
        } else {
            Typeface typeface = this.f74175f.get(str);
            if (typeface == null && this.f74174e.get(str) != null) {
                typeface = d(this.f74174e.get(str).f74169f);
                if (typeface != null) {
                    this.f74175f.put(str, typeface);
                }
            }
            return typeface;
        }
    }

    public void b(List<c> list) {
        List<c> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f74170a, false, 86087, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f74170a, false, 86087, new Class[]{List.class}, Void.TYPE);
        } else if (!com.bytedance.framwork.core.c.a.a(list)) {
            try {
                String json = com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) list2);
                if (!TextUtils.isEmpty(json)) {
                    com.ss.android.ugc.aweme.port.in.a.o.y().a(json);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f74170a, false, 86089, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f74170a, false, 86089, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            if (this.f74174e.size() == 0) {
                h();
                if (this.f74174e.size() == 0) {
                    return;
                }
            }
            for (String str : this.f74174e.keySet()) {
                c cVar = this.f74174e.get(str);
                if (b(cVar) || a(cVar)) {
                    cVar.k = 1;
                } else {
                    c(cVar.f74169f);
                    a(cVar, context, false);
                }
            }
        }
    }

    public static void a(c cVar, boolean z, Exception exc) {
        String str;
        String str2;
        String str3;
        c cVar2;
        c cVar3 = cVar;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{cVar3, Byte.valueOf(z ? (byte) 1 : 0), exc}, null, f74170a, true, 86097, new Class[]{c.class, Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar3, Byte.valueOf(z), exc}, null, f74170a, true, 86097, new Class[]{c.class, Boolean.TYPE, Exception.class}, Void.TYPE);
        } else if (cVar3 != null) {
            if (z) {
                c a2 = c.a().a(PushConstants.WEB_URL, cVar3.f74165b).a("font_title", cVar3.f74166c);
                str = "font_name";
                i = 0;
                str3 = cVar3.h;
                cVar2 = a2;
                str2 = "font_resource_download_error_state";
            } else {
                str2 = "font_resource_download_error_state";
                cVar2 = c.a().a(PushConstants.WEB_URL, cVar3.f74165b).a("font_title", cVar3.f74166c).a("font_name", cVar3.h);
                str = "exception";
                if (exc == null) {
                    str3 = "";
                } else {
                    str3 = u.b(exc);
                }
            }
            n.a(str2, i, cVar2.a(str, str3).b());
        }
    }
}
