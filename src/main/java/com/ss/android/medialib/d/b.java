package com.ss.android.medialib.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.log.IMonitor;
import com.ss.android.medialib.log.a;
import java.util.HashMap;
import java.util.Map;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f29647c;

    public b(IMonitor iMonitor) {
        a.f29688b = iMonitor;
    }

    public final void a(String str, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, this, f29647c, false, 17473, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2}, this, f29647c, false, 17473, new Class[]{String.class, a.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            aVar2.a(hashMap);
            if (PatchProxy.isSupport(new Object[]{str2, "record_monitor", hashMap}, null, a.f29687a, true, 17462, new Class[]{String.class, String.class, Map.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, "record_monitor", hashMap}, null, a.f29687a, true, 17462, new Class[]{String.class, String.class, Map.class}, Boolean.TYPE)).booleanValue();
            } else {
                a.a(a.f29688b, str2, "record_monitor", hashMap);
            }
        }
    }
}
