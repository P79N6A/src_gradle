package com.ss.android.common.applog;

import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28170a;

    /* renamed from: b  reason: collision with root package name */
    volatile ConcurrentHashMap<String, a> f28171b = new ConcurrentHashMap<>();

    class a {

        /* renamed from: a  reason: collision with root package name */
        long f28172a;

        /* renamed from: b  reason: collision with root package name */
        long f28173b = 120000;

        /* renamed from: c  reason: collision with root package name */
        long f28174c = 12;

        /* renamed from: d  reason: collision with root package name */
        int f28175d = 0;

        /* renamed from: e  reason: collision with root package name */
        long f28176e;

        public a(long j, long j2, long j3, int i) {
            this.f28172a = j;
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f28170a, false, 15531, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f28170a, false, 15531, new Class[]{String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && !this.f28171b.containsKey(str)) {
            a aVar = new a(System.currentTimeMillis(), 120000, 12, 0);
            this.f28171b.put(str, aVar);
        }
    }
}
