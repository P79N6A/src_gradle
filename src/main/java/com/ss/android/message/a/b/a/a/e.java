package com.ss.android.message.a.b.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.message.b.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.msgpack.template.Template;

public class e extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29886a;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f29887b = new ArrayList();

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29888a;

        /* renamed from: b  reason: collision with root package name */
        public Long f29889b;

        /* renamed from: c  reason: collision with root package name */
        public long f29890c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f29891d;

        public final int hashCode() {
            if (!PatchProxy.isSupport(new Object[0], this, f29888a, false, 18101, new Class[0], Integer.TYPE)) {
                return this.f29889b.hashCode();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29888a, false, 18101, new Class[0], Integer.TYPE)).intValue();
        }

        public a() {
        }

        public final boolean equals(Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f29888a, false, 18100, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f29888a, false, 18100, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if ((obj2 instanceof a) && obj2 != null) {
                return this.f29889b.equals(((a) obj2).f29889b);
            } else {
                return super.equals(obj);
            }
        }
    }

    public final void a(byte[] bArr) {
    }

    public final byte[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f29886a, false, 18099, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f29886a, false, 18099, new Class[0], byte[].class);
        }
        byte[] bArr = null;
        h.a aVar = new h.a();
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f29887b != null && !this.f29887b.isEmpty()) {
                for (a next : this.f29887b) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("a", next.f29889b);
                    hashMap.put("i", Long.valueOf(next.f29890c));
                    hashMap.put("e", Boolean.valueOf(next.f29891d));
                    arrayList.add(hashMap);
                }
            }
            aVar.f29987a.put(AdvanceSetting.ADVANCE_SETTING, arrayList);
            bArr = this.j.a(aVar, (Template<T>) this.k);
        } catch (IOException e2) {
            h.a((Exception) e2);
        } catch (Exception e3) {
            h.a(e3);
        }
        return bArr;
    }
}
