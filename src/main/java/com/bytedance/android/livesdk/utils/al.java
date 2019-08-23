package com.bytedance.android.livesdk.utils;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

@Deprecated
public final class al {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17582a;

        /* renamed from: b  reason: collision with root package name */
        private HashMap<String, String> f17583b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f17584c;

        private a() {
            this.f17583b = new HashMap<>();
        }

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f17582a, false, 13785, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f17582a, false, 13785, new Class[]{String.class}, Void.TYPE);
            } else if (!this.f17584c) {
                TTLiveSDKContext.getHostService().d().a(str, this.f17583b);
            }
        }

        public final a a(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f17582a, false, 13770, new Class[]{String.class, Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f17582a, false, 13770, new Class[]{String.class, Long.TYPE}, a.class);
            }
            this.f17583b.put(str, String.valueOf(j));
            return this;
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f17582a, false, 13768, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f17582a, false, 13768, new Class[]{String.class, String.class}, a.class);
            }
            this.f17583b.put(str, str2);
            return this;
        }

        private a(String str, String str2, String str3) {
            this.f17583b = new HashMap<>();
            this.f17583b.put("event_type", str);
            this.f17583b.put("event_belong", str2);
            this.f17583b.put("event_page", str3);
        }

        /* synthetic */ a(String str, String str2, String str3, byte b2) {
            this(str, str2, str3);
        }
    }

    public enum b {
        CORE("core"),
        SHOW("show"),
        PV("pv"),
        OTHER("other"),
        CLICK("click");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mType;

        public final String getType() {
            return this.mType;
        }

        private b(String str) {
            this.mType = str;
        }
    }

    @Deprecated
    public static a a(b bVar, String str, String str2) {
        return new a(bVar.mType, str, str2, (byte) 0);
    }
}
