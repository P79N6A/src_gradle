package com.ss.android.ugc.aweme.account.a.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31598a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f31599b = new HashMap();

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31600a = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f31602c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f31602c, false, 19646, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f31602c, false, 19646, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f31601b = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f31603c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f31603c, false, 19647, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f31603c, false, 19647, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2) || PushConstants.PUSH_TYPE_NOTIFY.equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        String a(String str);
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f31598a, true, 19639, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f31598a, true, 19639, new Class[0], b.class);
        }
        return new b();
    }

    public final b a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f31598a, false, 19642, new Class[]{String.class, Integer.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f31598a, false, 19642, new Class[]{String.class, Integer.TYPE}, b.class);
        }
        return a(str2, String.valueOf(i), a.f31600a);
    }

    public final b a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f31598a, false, 19641, new Class[]{String.class, Long.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f31598a, false, 19641, new Class[]{String.class, Long.TYPE}, b.class);
        }
        return a(str2, String.valueOf(j), a.f31600a);
    }

    public final b a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f31598a, false, 19640, new Class[]{String.class, String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f31598a, false, 19640, new Class[]{String.class, String.class}, b.class);
        }
        return a(str3, str4, a.f31600a);
    }

    private b a(String str, String str2, a aVar) {
        String str3 = str;
        String str4 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, f31598a, false, 19643, new Class[]{String.class, String.class, a.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, f31598a, false, 19643, new Class[]{String.class, String.class, a.class}, b.class);
        }
        this.f31599b.put(str3, aVar2.a(str4));
        return this;
    }
}
