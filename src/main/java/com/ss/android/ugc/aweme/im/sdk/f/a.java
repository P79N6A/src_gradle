package com.ss.android.ugc.aweme.im.sdk.f;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import java.util.HashMap;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51437a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51438b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f51439c = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.f.a$a  reason: collision with other inner class name */
    interface C0601a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0601a f51442a = new C0601a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f51444c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f51444c, false, 52355, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f51444c, false, 52355, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final C0601a f51443b = new C0601a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f51445c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f51445c, false, 52356, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f51445c, false, 52356, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2) || PushConstants.PUSH_TYPE_NOTIFY.equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        String a(String str);
    }

    public abstract void b();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51437a, false, 52352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51437a, false, 52352, new Class[0], Void.TYPE);
            return;
        }
        b();
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51440a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f51440a, false, 52354, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51440a, false, 52354, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    if (!m.b()) {
                        a.this.f51439c.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    }
                    q.a(a.this.f51438b, a.this.f51439c);
                } catch (Throwable unused) {
                }
            }
        });
    }

    a(String str) {
        this.f51438b = str;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, C0601a aVar) {
        String str3 = str;
        String str4 = str2;
        C0601a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, f51437a, false, 52353, new Class[]{String.class, String.class, C0601a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, f51437a, false, 52353, new Class[]{String.class, String.class, C0601a.class}, Void.TYPE);
            return;
        }
        this.f51439c.put(str3, aVar2.a(str4));
    }
}
