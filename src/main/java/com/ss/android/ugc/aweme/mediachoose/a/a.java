package com.ss.android.ugc.aweme.mediachoose.a;

import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ff;
import java.io.File;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55242a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f55243b = (Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + File.separator + "neihanduanzi");

    /* renamed from: e  reason: collision with root package name */
    private static a f55244e;

    /* renamed from: c  reason: collision with root package name */
    public int f55245c = ((int) ff.a());

    /* renamed from: d  reason: collision with root package name */
    public int f55246d = 600000;

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f55242a, true, 58609, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f55242a, true, 58609, new Class[0], a.class);
        }
        if (f55244e == null) {
            synchronized (a.class) {
                f55244e = new a();
            }
        }
        return f55244e;
    }
}
