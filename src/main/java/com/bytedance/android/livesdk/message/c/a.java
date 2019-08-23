package com.bytedance.android.livesdk.message.c;

import android.support.v4.util.LongSparseArray;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.f;
import com.bytedance.android.livesdk.gift.assets.h;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a implements com.bytedance.android.livesdk.message.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16399a;

    /* renamed from: b  reason: collision with root package name */
    public h f16400b = f.a("effects");

    /* renamed from: c  reason: collision with root package name */
    long f16401c;

    /* renamed from: d  reason: collision with root package name */
    LongSparseArray<List<c>> f16402d = new LongSparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public List<Long> f16403e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public IMessageManager f16404f;
    private final boolean g;
    private h.a h = new h.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16405a;

        public final void a(List<AssetsModel> list) {
            List<c> list2;
            if (PatchProxy.isSupport(new Object[]{list}, this, f16405a, false, 11006, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f16405a, false, 11006, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Iterator<Long> it2 = a.this.f16403e.iterator();
            while (it2.hasNext()) {
                long longValue = it2.next().longValue();
                if (a.this.f16400b.c(longValue) != null) {
                    a aVar = a.this;
                    if (PatchProxy.isSupport(new Object[]{new Long(longValue)}, aVar, a.f16399a, false, 11000, new Class[]{Long.TYPE}, List.class)) {
                        a aVar2 = aVar;
                        list2 = (List) PatchProxy.accessDispatch(new Object[]{new Long(longValue)}, aVar2, a.f16399a, false, 11000, new Class[]{Long.TYPE}, List.class);
                    } else {
                        list2 = (List) aVar.f16402d.get(longValue);
                    }
                    if (!Lists.isEmpty(list2) && a.this.f16404f != null) {
                        for (c insertMessage : list2) {
                            a.this.f16404f.insertMessage(insertMessage, true);
                        }
                    }
                } else {
                    com.bytedance.android.live.core.c.a.c("AssetsInterceptor", "拉不到该特效资源  assetId = " + longValue);
                    a aVar3 = a.this;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.d3u)}, aVar3, a.f16399a, false, 11004, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        a aVar4 = aVar3;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.d3u)}, aVar4, a.f16399a, false, 11004, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else if (System.currentTimeMillis() - aVar3.f16401c > 30000) {
                        aVar3.f16401c = System.currentTimeMillis();
                        ai.a((int) C0906R.string.d3u);
                    }
                }
                a aVar5 = a.this;
                if (PatchProxy.isSupport(new Object[]{new Long(longValue)}, aVar5, a.f16399a, false, 11002, new Class[]{Long.TYPE}, Void.TYPE)) {
                    a aVar6 = aVar5;
                    PatchProxy.accessDispatch(new Object[]{new Long(longValue)}, aVar6, a.f16399a, false, 11002, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    List list3 = (List) aVar5.f16402d.get(longValue);
                    if (list3 != null) {
                        list3.clear();
                    }
                }
                it2.remove();
            }
        }
    };
    private long i;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16399a, false, 11005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16399a, false, 11005, new Class[0], Void.TYPE);
            return;
        }
        if (this.f16400b != null) {
            this.f16400b.b(this.h);
        }
        this.f16404f = null;
    }

    public final void a(IMessageManager iMessageManager) {
        this.f16404f = iMessageManager;
    }

    public a(boolean z) {
        this.f16400b.a(this.h);
        this.g = z;
    }

    public final boolean onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f16399a, false, 11003, new Class[]{IMessage.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f16399a, false, 11003, new Class[]{IMessage.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.i <= 0) {
            this.i = ((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().b();
        }
        if (this.i > 0 && (iMessage2 instanceof ab)) {
            ab abVar = (ab) iMessage2;
            if (!abVar.o && abVar.f16430b != null && this.i == abVar.f16430b.getId() && abVar.h != 1) {
                return true;
            }
        }
        if (iMessage2 instanceof ab) {
            ab abVar2 = (ab) iMessage2;
            com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(abVar2.f16432d);
            if (findGiftById == null) {
                this.f16404f.insertMessage(iMessage2);
                return true;
            } else if ((findGiftById.f15106e != 2 && findGiftById.f15106e != 8) || findGiftById.f15105d == 998 || this.f16400b.c(findGiftById.r) != null) {
                return false;
            } else {
                long j = abVar2.f16432d;
                long j2 = findGiftById.r;
                if (PatchProxy.isSupport(new Object[]{new Long(j), new Long(j2)}, null, o.f15142a, true, 9293, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j), new Long(j2)}, null, o.f15142a, true, 9293, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("gift_id", Long.valueOf(j));
                    hashMap.put("asset_id", Long.valueOf(j2));
                    Room a2 = ((com.bytedance.android.live.room.c) b.a(com.bytedance.android.live.room.c.class)).room().a();
                    if (a2 != null) {
                        hashMap.put("room_type", Integer.valueOf(a2.getOrientation()));
                        hashMap.put("room_id", Long.valueOf(a2.getId()));
                        hashMap.put("anchor_id", Long.valueOf(a2.getOwnerUserId()));
                    }
                    e.a(o.b("ttlive_asset_id_not_found"), 1, (Map<String, Object>) hashMap);
                    com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.b.Gift.info, "ttlive_asset_id_not_found", 1, (Map) hashMap);
                }
                a(abVar2, findGiftById.r);
                this.f16403e.add(Long.valueOf(findGiftById.r));
                this.f16400b.a(4, this.g);
                return true;
            }
        } else if (!(iMessage2 instanceof com.bytedance.android.livesdk.message.model.a)) {
            return false;
        } else {
            com.bytedance.android.livesdk.message.model.a aVar = (com.bytedance.android.livesdk.message.model.a) iMessage2;
            if (this.f16400b.c(aVar.f16420b) != null) {
                return false;
            }
            a(aVar, aVar.f16420b);
            this.f16403e.add(Long.valueOf(aVar.f16420b));
            this.f16400b.a(4, this.g);
            return true;
        }
    }

    private void a(c cVar, long j) {
        c cVar2 = cVar;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{cVar2, new Long(j2)}, this, f16399a, false, 11001, new Class[]{c.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, new Long(j2)}, this, f16399a, false, 11001, new Class[]{c.class, Long.TYPE}, Void.TYPE);
            return;
        }
        List list = (List) this.f16402d.get(j2);
        if (list == null) {
            list = new ArrayList();
            this.f16402d.put(j2, list);
        }
        list.add(cVar);
    }
}
