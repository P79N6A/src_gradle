package com.ss.android.ugc.aweme.app.d;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34113a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f34114b = new HashMap();

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34115a = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f34117c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f34117c, false, 23487, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34117c, false, 23487, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f34116b = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f34118c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f34118c, false, 23488, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34118c, false, 23488, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2) || PushConstants.PUSH_TYPE_NOTIFY.equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        String a(String str);
    }

    public final d a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f34113a, false, 23479, new Class[]{String.class, String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f34113a, false, 23479, new Class[]{String.class, String.class}, d.class);
        }
        return a(str3, str4, a.f34115a);
    }

    public final d a(HashMap<? extends String, ? extends String> hashMap) {
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f34113a, false, 23484, new Class[]{HashMap.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{hashMap}, this, f34113a, false, 23484, new Class[]{HashMap.class}, d.class);
        }
        if (hashMap != null) {
            this.f34114b.putAll(hashMap);
        }
        return this;
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f34113a, true, 23478, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f34113a, true, 23478, new Class[0], d.class);
        }
        return new d();
    }

    public final d b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f34113a, false, 23483, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f34113a, false, 23483, new Class[0], d.class);
        }
        if (com.ss.android.g.a.b()) {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        a("_staging_flag", str);
        return this;
    }

    public final d a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f34113a, false, 23481, new Class[]{String.class, Integer.TYPE}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f34113a, false, 23481, new Class[]{String.class, Integer.TYPE}, d.class);
        }
        return a(str2, String.valueOf(i), a.f34115a);
    }

    public final d a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f34113a, false, 23480, new Class[]{String.class, Long.TYPE}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f34113a, false, 23480, new Class[]{String.class, Long.TYPE}, d.class);
        }
        return a(str2, String.valueOf(j), a.f34115a);
    }

    public final d a(String str, LogPbBean logPbBean) {
        if (PatchProxy.isSupport(new Object[]{str, logPbBean}, this, f34113a, false, 23485, new Class[]{String.class, LogPbBean.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str, logPbBean}, this, f34113a, false, 23485, new Class[]{String.class, LogPbBean.class}, d.class);
        }
        if (logPbBean != null) {
            a(str, new Gson().toJson((Object) logPbBean));
        }
        return this;
    }

    public final d a(String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f34113a, false, 23486, new Class[]{String.class, Object.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str, obj}, this, f34113a, false, 23486, new Class[]{String.class, Object.class}, d.class);
        }
        if (obj != null) {
            a(str, new Gson().toJson(obj));
        }
        return this;
    }

    private d a(String str, String str2, a aVar) {
        String str3 = str;
        String str4 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, f34113a, false, 23482, new Class[]{String.class, String.class, a.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, f34113a, false, 23482, new Class[]{String.class, String.class, a.class}, d.class);
        }
        this.f34114b.put(str3, aVar2.a(str4));
        return this;
    }
}
