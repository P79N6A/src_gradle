package com.ss.android.ugc.aweme.festival.common;

import a.i;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.fd;
import java.io.File;
import java.util.concurrent.Callable;

public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47293a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f47294b = (com.ss.android.ugc.aweme.video.b.f() + File.separator + "festival");

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f47295c;

    /* renamed from: d  reason: collision with root package name */
    private String f47296d;

    /* renamed from: e  reason: collision with root package name */
    private String f47297e;

    /* renamed from: f  reason: collision with root package name */
    private a f47298f;

    public interface a {
    }

    public void onCancel() {
        if (PatchProxy.isSupport(new Object[0], this, f47293a, false, 43961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47293a, false, 43961, new Class[0], Void.TYPE);
        }
    }

    public void onDownloadPause() {
        if (PatchProxy.isSupport(new Object[0], this, f47293a, false, 43960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47293a, false, 43960, new Class[0], Void.TYPE);
        }
    }

    public void onDownloadProgress(int i, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4)}, this, f47293a, false, 43958, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4)}, this, f47293a, false, 43958, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
        }
    }

    public void onDownloadStart(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47293a, false, 43957, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47293a, false, 43957, new Class[]{Integer.TYPE}, Void.TYPE);
        }
    }

    public void onError(c cVar) {
    }

    private b() {
        if (!com.ss.android.ugc.aweme.festival.christmas.a.a()) {
            a(f47294b);
        } else {
            bm.a(f47294b, false);
        }
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f47293a, true, 43948, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f47293a, true, 43948, new Class[0], b.class);
        }
        if (f47295c == null) {
            synchronized (b.class) {
                if (f47295c == null) {
                    f47295c = new b();
                }
            }
        }
        return f47295c;
    }

    public final File b() {
        String str;
        e eVar;
        if (PatchProxy.isSupport(new Object[0], this, f47293a, false, 43956, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f47293a, false, 43956, new Class[0], File.class);
        }
        String str2 = this.f47296d;
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(f47294b);
            sb.append(File.separator);
            if (PatchProxy.isSupport(new Object[0], this, f47293a, false, 43952, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f47293a, false, 43952, new Class[0], String.class);
            } else {
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43886, new Class[0], e.class)) {
                    eVar = (e) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43886, new Class[0], e.class);
                } else {
                    a e2 = com.ss.android.ugc.aweme.festival.christmas.a.e();
                    if (e2 == null) {
                        eVar = null;
                    } else {
                        eVar = e2.f47291e;
                    }
                }
                if (eVar != null) {
                    UrlModel urlModel = eVar.f47302b;
                    if (urlModel != null && !CollectionUtils.isEmpty(urlModel.getUrlList())) {
                        str = urlModel.getUrlList().get(0);
                    }
                }
                str = null;
            }
            sb.append(DigestUtils.md5Hex(str));
            this.f47296d = sb.toString();
            str2 = this.f47296d;
        }
        File file = new File(str2);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        return file;
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f47293a, false, 43955, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f47293a, false, 43955, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            bm.c(str);
        } catch (NoSuchMethodError e2) {
            NoSuchMethodError noSuchMethodError = e2;
            com.ss.android.ugc.aweme.util.c.a("NoSuchMethodError in FestivalResDownloader-deleteFiles, path is " + str2 + ", error is " + noSuchMethodError.getMessage());
        }
    }

    public void onDownloadSuccess(String str) {
        boolean z;
        boolean z2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f47293a, false, 43954, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f47293a, false, 43954, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43885, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43885, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (com.ss.android.ugc.aweme.festival.christmas.a.e() == null || com.ss.android.ugc.aweme.festival.christmas.a.e().f47291e == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str3 = com.ss.android.ugc.aweme.festival.christmas.a.e().f47291e.f47301a;
                if (PatchProxy.isSupport(new Object[]{file, str3}, this, f47293a, false, 43951, new Class[]{File.class, String.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{file, str3}, this, f47293a, false, 43951, new Class[]{File.class, String.class}, Boolean.TYPE)).booleanValue();
                } else if (!file.exists()) {
                    z2 = false;
                } else {
                    z2 = TextUtils.equals(DigestUtils.md5Hex(file), str3);
                }
                if (!z2) {
                    a(file.getPath());
                    return;
                }
                File file2 = new File(this.f47297e);
                if (file2.exists() && file2.listFiles().length > 0) {
                    a(file2.getPath());
                }
                File a2 = bm.a(this.f47297e, false);
                try {
                    fd.a(new File(str2), a2);
                    this.f47296d = a2.getPath();
                    if (this.f47298f != null) {
                        i.a((Callable<TResult>) new c<TResult>(this), i.f1052b);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
