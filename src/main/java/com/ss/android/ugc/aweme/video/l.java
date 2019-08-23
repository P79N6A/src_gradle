package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lancet.g;
import com.ss.android.ugc.playerkit.videoview.d.b;

public final /* synthetic */ class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76121a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f76122b = new l();

    private l() {
    }

    public final String a(String str) {
        Object[] objArr;
        l lVar;
        ChangeQuickRedirect changeQuickRedirect;
        boolean z;
        int i;
        Class[] clsArr;
        Class<String> cls;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76121a, false, 88937, new Class[]{String.class}, String.class)) {
            objArr = new Object[]{str2};
            changeQuickRedirect = f76121a;
            z = false;
            i = 88937;
            clsArr = new Class[]{String.class};
            cls = String.class;
            lVar = this;
        } else {
            if (!PatchProxy.isSupport(new Object[]{str2}, null, g.f52957a, true, 54979, new Class[]{String.class}, String.class)) {
                return (str2 == null || !str2.startsWith("http") || str2.startsWith("https")) ? str2 : str2.replaceFirst("http", "https");
            }
            objArr = new Object[]{str2};
            lVar = null;
            changeQuickRedirect = g.f52957a;
            z = true;
            i = 54979;
            clsArr = new Class[]{String.class};
            cls = String.class;
        }
        return (String) PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, z, i, clsArr, cls);
    }
}
