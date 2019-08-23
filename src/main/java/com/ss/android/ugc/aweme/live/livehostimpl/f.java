package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.host.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.util.HashMap;
import java.util.Map;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f53432a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.e.b f53433b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final d f53434c;

    static class a implements com.bytedance.android.livesdkapi.e.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53435a;

        private a() {
        }

        public final boolean e() {
            boolean z = f.f53432a;
            if (f.f53432a) {
                f.f53432a = false;
            }
            return z;
        }

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f53435a, false, 55751, new Class[0], Boolean.TYPE)) {
                return ((Boolean) com.bytedance.android.livesdkapi.e.a.f18747b.a()).booleanValue();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53435a, false, 55751, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final boolean b() {
            if (!PatchProxy.isSupport(new Object[0], this, f53435a, false, 55757, new Class[0], Boolean.TYPE)) {
                return ((Boolean) SharePrefCache.inst().isEnableMessagePb2Json().c()).booleanValue();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53435a, false, 55757, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final String c() {
            if (!PatchProxy.isSupport(new Object[0], this, f53435a, false, 55758, new Class[0], String.class)) {
                return com.ss.android.ugc.aweme.freeflowcard.b.a().c();
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f53435a, false, 55758, new Class[0], String.class);
        }

        public final boolean d() {
            if (!PatchProxy.isSupport(new Object[0], this, f53435a, false, 55759, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.freeflowcard.freeflowmember.a.f3325c.b();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53435a, false, 55759, new Class[0], Boolean.TYPE)).booleanValue();
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f53435a, false, 55752, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f53435a, false, 55752, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdkapi.e.a.f18747b.a(Boolean.TRUE);
        }

        public final void b(boolean z) {
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f53435a, false, 55754, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f53435a, false, 55754, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdkapi.e.a.f18748c.a(Boolean.TRUE);
        }
    }

    static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53436a;

        /* renamed from: b  reason: collision with root package name */
        private com.bytedance.ies.e.b f53437b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, Object> f53438c = new HashMap();

        public final boolean a(d.a aVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f53436a, false, 55760, new Class[]{d.a.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f53436a, false, 55760, new Class[]{d.a.class}, Boolean.TYPE)).booleanValue();
            }
            if (aVar.type() != d.b.Boolean) {
                z = false;
            }
            a(z);
            Boolean bool = (Boolean) this.f53438c.get(aVar.key());
            if (bool == null) {
                if (aVar.supportPersist()) {
                    bool = Boolean.valueOf(this.f53437b.a(aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
                } else {
                    bool = (Boolean) aVar.defValue();
                }
                this.f53438c.put(aVar.key(), bool);
            }
            return bool.booleanValue();
        }

        b(Context context) {
            this.f53437b = com.bytedance.ies.e.b.a(context, "live-app-core-sdk");
            com.bytedance.android.live.utility.b.a(d.class, this);
        }

        private static void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f53436a, true, 55773, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f53436a, true, 55773, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (!z) {
                throw new IllegalArgumentException();
            }
        }

        public final String d(d.a aVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f53436a, false, 55768, new Class[]{d.a.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{aVar}, this, f53436a, false, 55768, new Class[]{d.a.class}, String.class);
            }
            if (aVar.type() != d.b.String) {
                z = false;
            }
            a(z);
            String str = (String) this.f53438c.get(aVar.key());
            if (str == null) {
                if (aVar.supportPersist()) {
                    str = this.f53437b.a(aVar.key(), (String) aVar.defValue());
                } else {
                    str = (String) aVar.defValue();
                }
                this.f53438c.put(aVar.key(), str);
            }
            return str;
        }

        public final int b(d.a aVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f53436a, false, 55762, new Class[]{d.a.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar}, this, f53436a, false, 55762, new Class[]{d.a.class}, Integer.TYPE)).intValue();
            }
            if (aVar.type() != d.b.Integer) {
                z = false;
            }
            a(z);
            Integer num = (Integer) this.f53438c.get(aVar.key());
            if (num == null) {
                if (aVar.supportPersist()) {
                    num = Integer.valueOf(this.f53437b.a(aVar.key(), ((Integer) aVar.defValue()).intValue()));
                } else {
                    num = (Integer) aVar.defValue();
                }
                this.f53438c.put(aVar.key(), num);
            }
            return num.intValue();
        }

        public final long c(d.a aVar) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f53436a, false, 55764, new Class[]{d.a.class}, Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[]{aVar}, this, f53436a, false, 55764, new Class[]{d.a.class}, Long.TYPE)).longValue();
            }
            if (aVar.type() != d.b.Long) {
                z = false;
            }
            a(z);
            Long l = (Long) this.f53438c.get(aVar.key());
            if (l == null) {
                if (aVar.supportPersist()) {
                    l = Long.valueOf(this.f53437b.a(aVar.key(), ((Long) aVar.defValue()).longValue()));
                } else {
                    l = (Long) aVar.defValue();
                }
                this.f53438c.put(aVar.key(), l);
            }
            return l.longValue();
        }

        public final void a(d.a aVar, int i) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f53436a, false, 55763, new Class[]{d.a.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f53436a, false, 55763, new Class[]{d.a.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (aVar.type() == d.b.Integer) {
                z = true;
            }
            a(z);
            this.f53438c.put(aVar.key(), Integer.valueOf(i));
            if (aVar.supportPersist()) {
                this.f53437b.f20606a.edit().putInt(aVar.key(), i).apply();
            }
        }

        public final void a(d.a aVar, long j) {
            long j2 = j;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{aVar, new Long(j2)}, this, f53436a, false, 55765, new Class[]{d.a.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, new Long(j2)}, this, f53436a, false, 55765, new Class[]{d.a.class, Long.TYPE}, Void.TYPE);
                return;
            }
            if (aVar.type() == d.b.Long) {
                z = true;
            }
            a(z);
            this.f53438c.put(aVar.key(), Long.valueOf(j));
            if (aVar.supportPersist()) {
                this.f53437b.f20606a.edit().putLong(aVar.key(), j2).apply();
            }
        }

        public final void a(d.a aVar, String str) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{aVar, str}, this, f53436a, false, 55769, new Class[]{d.a.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, str}, this, f53436a, false, 55769, new Class[]{d.a.class, String.class}, Void.TYPE);
                return;
            }
            if (aVar.type() == d.b.String) {
                z = true;
            }
            a(z);
            this.f53438c.put(aVar.key(), str);
            if (aVar.supportPersist()) {
                this.f53437b.f20606a.edit().putString(aVar.key(), str).apply();
            }
        }

        public final void a(d.a aVar, boolean z) {
            Boolean bool;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f53436a, false, 55761, new Class[]{d.a.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, f53436a, false, 55761, new Class[]{d.a.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (aVar.type() == d.b.Boolean) {
                z2 = true;
            }
            a(z2);
            Map<String, Object> map = this.f53438c;
            String key = aVar.key();
            if (z) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            map.put(key, bool);
            if (aVar.supportPersist()) {
                this.f53437b.f20606a.edit().putBoolean(aVar.key(), z).apply();
            }
        }
    }

    public final com.bytedance.android.livesdkapi.e.b a() {
        return this.f53433b;
    }

    public final d b() {
        return this.f53434c;
    }

    f(Context context) {
        this.f53434c = new b(context);
    }
}
