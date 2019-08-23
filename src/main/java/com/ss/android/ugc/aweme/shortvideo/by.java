package com.ss.android.ugc.aweme.shortvideo;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public final class by {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65852a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f65852a, true, 74165, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f65852a, true, 74165, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("PCT-AL10");
        arrayList.add("PCT-TL10");
        arrayList.add("PCT-L29");
        arrayList.add("VNA-AL10");
        return arrayList.contains(Build.MODEL);
    }
}
