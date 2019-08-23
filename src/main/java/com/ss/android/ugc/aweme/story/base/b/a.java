package com.ss.android.ugc.aweme.story.base.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71924a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f71925b = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.story.base.b.a$a  reason: collision with other inner class name */
    public interface C0750a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0750a f71926a = new C0750a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f71928c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f71928c, false, 82256, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f71928c, false, 82256, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final C0750a f71927b = new C0750a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f71929c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f71929c, false, 82257, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f71929c, false, 82257, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2) || PushConstants.PUSH_TYPE_NOTIFY.equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        String a(String str);
    }

    public final a a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f71924a, false, 82250, new Class[]{String.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f71924a, false, 82250, new Class[]{String.class, String.class}, a.class);
        }
        return a(str3, str4, C0750a.f71926a);
    }

    public final a a(String str, String str2, C0750a aVar) {
        String str3 = str;
        String str4 = str2;
        C0750a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, f71924a, false, 82253, new Class[]{String.class, String.class, C0750a.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, f71924a, false, 82253, new Class[]{String.class, String.class, C0750a.class}, a.class);
        }
        this.f71925b.put(str3, aVar2.a(str4));
        return this;
    }
}
