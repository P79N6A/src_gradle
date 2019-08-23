package com.ss.android.newmedia.logsdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a implements NetworkUtils.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2513a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2514b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f2515c = new Object();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2513a, false, 18643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2513a, false, 18643, new Class[0], Void.TYPE);
        } else if (!"ActionReaper".equals(Thread.currentThread().getName())) {
            synchronized (this.f2515c) {
                if (!this.f2514b) {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception unused) {
                    }
                    this.f2514b = true;
                }
            }
        }
    }

    public final String a(String str, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2513a, false, 18641, new Class[]{String.class, Boolean.TYPE}, String.class)) {
            return AppLog.addCommonParams(str, z);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f2513a, false, 18641, new Class[]{String.class, Boolean.TYPE}, String.class);
    }

    public final void a(List<e> list, boolean z) {
        List<e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2513a, false, 18642, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f2513a, false, 18642, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, z);
        for (Map.Entry entry : hashMap.entrySet()) {
            list2.add(new e((String) entry.getKey(), (String) entry.getValue()));
        }
    }
}
