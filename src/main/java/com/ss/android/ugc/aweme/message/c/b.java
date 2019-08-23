package com.ss.android.ugc.aweme.message.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55360a;

    /* renamed from: b  reason: collision with root package name */
    private static b f55361b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Long, Integer> f55362c = new HashMap<>();

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f55360a, true, 58741, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f55360a, true, 58741, new Class[0], b.class);
        }
        if (f55361b == null) {
            synchronized (b.class) {
                if (f55361b == null) {
                    f55361b = new b();
                }
            }
        }
        return f55361b;
    }

    public final int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f55360a, false, 58745, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f55360a, false, 58745, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            long parseLong = Long.parseLong(str);
            if (PatchProxy.isSupport(new Object[]{new Long(parseLong)}, this, f55360a, false, 58746, new Class[]{Long.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(parseLong)}, this, f55360a, false, 58746, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
            }
            try {
                Integer num = this.f55362c.get(Long.valueOf(parseLong));
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (NumberFormatException unused2) {
            return 0;
        }
    }
}
