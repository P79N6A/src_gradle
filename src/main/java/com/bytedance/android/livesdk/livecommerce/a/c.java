package com.bytedance.android.livesdk.livecommerce.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15891a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f15892b = new HashMap();

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15893a = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f15895c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f15895c, false, 10679, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f15895c, false, 10679, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f15894b = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f15896c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f15896c, false, 10680, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f15896c, false, 10680, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2) || PushConstants.PUSH_TYPE_NOTIFY.equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        String a(String str);
    }

    public final c a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f15891a, false, 10676, new Class[]{String.class, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f15891a, false, 10676, new Class[]{String.class, Integer.TYPE}, c.class);
        }
        return a(str2, String.valueOf(i), a.f15893a);
    }

    public final c a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f15891a, false, 10674, new Class[]{String.class, String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f15891a, false, 10674, new Class[]{String.class, String.class}, c.class);
        }
        return a(str3, str4, a.f15893a);
    }

    private c a(String str, String str2, a aVar) {
        String str3 = str;
        String str4 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, f15891a, false, 10677, new Class[]{String.class, String.class, a.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, f15891a, false, 10677, new Class[]{String.class, String.class, a.class}, c.class);
        }
        this.f15892b.put(str3, aVar2.a(str4));
        return this;
    }
}
