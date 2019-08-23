package com.ss.android.ugc.aweme.u.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected final HashMap<String, String> params = new HashMap<>();

    public abstract HashMap<String, String> buildParams();

    public void installToMetrics(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 58971, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 58971, new Class[]{d.class}, Void.TYPE);
            return;
        }
        HashMap<String, String> buildParams = buildParams();
        if (dVar2 != null) {
            dVar2.a((Map<String, String>) buildParams);
        }
    }

    public final void appendParam(String str, String str2, d.a aVar) {
        String str3 = str;
        String str4 = str2;
        d.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, changeQuickRedirect, false, 58970, new Class[]{String.class, String.class, d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, changeQuickRedirect, false, 58970, new Class[]{String.class, String.class, d.a.class}, Void.TYPE);
            return;
        }
        this.params.put(str3, aVar2.a(str4));
    }
}
