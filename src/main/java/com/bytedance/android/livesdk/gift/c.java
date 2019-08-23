package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.gift.d;
import com.bytedance.android.livesdk.gift.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14751a;

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap<Long, Integer> f14752b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentHashMap<Long, List<b>> f14753c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f14754d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14755e;

    /* renamed from: f  reason: collision with root package name */
    private d f14756f = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14757a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f14757a, false, 9231, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14757a, false, 9231, new Class[0], Void.TYPE);
                return;
            }
            super.a();
            c.this.f14754d = false;
        }

        public final void a(List<b> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f14757a, false, 9230, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f14757a, false, 9230, new Class[]{List.class}, Void.TYPE);
                return;
            }
            c.this.f14754d = false;
            c.this.a();
        }
    };

    public interface a {
        void a(long j);

        void a(b bVar);
    }

    public final void a() {
        List<b> list;
        if (PatchProxy.isSupport(new Object[0], this, f14751a, false, 9226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14751a, false, 9226, new Class[0], Void.TYPE);
        } else if (!this.f14754d) {
            for (Map.Entry next : this.f14752b.entrySet()) {
                if (((Integer) next.getValue()).intValue() >= 3) {
                    long longValue = ((Long) next.getKey()).longValue();
                    if (PatchProxy.isSupport(new Object[]{new Long(longValue)}, this, f14751a, false, 9228, new Class[]{Long.TYPE}, List.class)) {
                        list = (List) PatchProxy.accessDispatch(new Object[]{new Long(longValue)}, this, f14751a, false, 9228, new Class[]{Long.TYPE}, List.class);
                    } else {
                        list = this.f14753c.get(Long.valueOf(longValue));
                    }
                    for (b bVar : list) {
                        b findGiftById = GiftManager.inst().findGiftById(bVar.f14744a);
                        if (findGiftById == null) {
                            bVar.f14746c.a(bVar.f14744a);
                        } else {
                            bVar.f14746c.a(findGiftById);
                        }
                    }
                    this.f14753c.remove(next.getKey());
                    this.f14752b.remove(next.getKey());
                }
            }
            for (Map.Entry<Long, List<b>> value : this.f14753c.entrySet()) {
                Iterator it2 = ((List) value.getValue()).iterator();
                while (it2.hasNext()) {
                    b bVar2 = (b) it2.next();
                    b findGiftById2 = GiftManager.inst().findGiftById(bVar2.f14744a);
                    if (findGiftById2 != null) {
                        bVar2.f14746c.a(findGiftById2);
                        it2.remove();
                    }
                }
            }
            for (Map.Entry next2 : this.f14752b.entrySet()) {
                int intValue = ((Integer) next2.getValue()).intValue();
                if (intValue < 3) {
                    long longValue2 = ((Long) next2.getKey()).longValue();
                    next2.setValue(Integer.valueOf(intValue + 1));
                    GiftManager.inst().syncGiftList(this.f14756f, longValue2, 4, this.f14755e);
                    this.f14754d = true;
                    return;
                }
            }
        }
    }

    public c(boolean z) {
        this.f14755e = z;
    }
}
