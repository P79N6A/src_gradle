package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public class bj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65804a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f65805b = new HashMap();

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65806a = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f65808c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f65808c, false, 74109, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f65808c, false, 74109, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f65807b = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f65809c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f65809c, false, 74110, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f65809c, false, 74110, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2) || PushConstants.PUSH_TYPE_NOTIFY.equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        String a(String str);
    }

    public static bj a() {
        if (PatchProxy.isSupport(new Object[0], null, f65804a, true, 74103, new Class[0], bj.class)) {
            return (bj) PatchProxy.accessDispatch(new Object[0], null, f65804a, true, 74103, new Class[0], bj.class);
        }
        return new bj();
    }

    public final bj a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f65804a, false, 74106, new Class[]{String.class, Integer.TYPE}, bj.class)) {
            return (bj) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f65804a, false, 74106, new Class[]{String.class, Integer.TYPE}, bj.class);
        }
        return a(str2, String.valueOf(i), a.f65806a);
    }

    public final bj a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f65804a, false, 74104, new Class[]{String.class, String.class}, bj.class)) {
            return (bj) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f65804a, false, 74104, new Class[]{String.class, String.class}, bj.class);
        }
        return a(str3, str4, a.f65806a);
    }

    private bj a(String str, String str2, a aVar) {
        String str3 = str;
        String str4 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, f65804a, false, 74107, new Class[]{String.class, String.class, a.class}, bj.class)) {
            return (bj) PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, f65804a, false, 74107, new Class[]{String.class, String.class, a.class}, bj.class);
        }
        this.f65805b.put(str3, aVar2.a(str4));
        return this;
    }
}
