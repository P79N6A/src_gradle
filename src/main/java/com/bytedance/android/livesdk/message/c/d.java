package com.bytedance.android.livesdk.message.c;

import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.c;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.message.a;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdk.message.model.r;
import com.bytedance.android.livesdk.message.model.s;
import com.bytedance.android.livesdk.message.model.y;
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
import java.util.List;
import java.util.Map;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16410a;

    /* renamed from: b  reason: collision with root package name */
    long f16411b;

    /* renamed from: c  reason: collision with root package name */
    LongSparseArray<List<ab>> f16412c = new LongSparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public IMessageManager f16413d;

    /* renamed from: e  reason: collision with root package name */
    private long f16414e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16415f;
    private c g;
    private c.a h = new c.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16416a;

        public final void a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f16416a, false, 11014, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f16416a, false, 11014, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            d dVar = d.this;
            String str = ac.a((int) C0906R.string.d3u) + "giftId:" + j2;
            if (PatchProxy.isSupport(new Object[]{str}, dVar, d.f16410a, false, 11012, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, dVar, d.f16410a, false, 11012, new Class[]{String.class}, Void.TYPE);
            } else if (System.currentTimeMillis() - dVar.f16411b > 30000) {
                dVar.f16411b = System.currentTimeMillis();
                ai.a(str);
            }
            d.this.a(j2);
            com.bytedance.android.live.core.c.a.c("GiftInterceptor", "can't find giftId = " + j2);
        }

        public final void a(b bVar) {
            List<ab> list;
            b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f16416a, false, 11013, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f16416a, false, 11013, new Class[]{b.class}, Void.TYPE);
                return;
            }
            d dVar = d.this;
            long j = bVar2.f15105d;
            if (PatchProxy.isSupport(new Object[]{new Long(j)}, dVar, d.f16410a, false, 11008, new Class[]{Long.TYPE}, List.class)) {
                Object[] objArr = {new Long(j)};
                Object[] objArr2 = objArr;
                d dVar2 = dVar;
                list = (List) PatchProxy.accessDispatch(objArr2, dVar2, d.f16410a, false, 11008, new Class[]{Long.TYPE}, List.class);
            } else {
                list = (List) dVar.f16412c.get(j);
            }
            if (!Lists.isEmpty(list)) {
                if (d.this.f16413d != null) {
                    for (ab insertMessage : list) {
                        d.this.f16413d.insertMessage(insertMessage, true);
                    }
                }
                d.this.a(bVar2.f15105d);
            }
        }
    };
    private long i;

    public final void a() {
    }

    public final void a(IMessageManager iMessageManager) {
        this.f16413d = iMessageManager;
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f16410a, false, 11010, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f16410a, false, 11010, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        List list = (List) this.f16412c.get(j2);
        if (list != null) {
            list.clear();
        }
    }

    public final boolean onMessage(IMessage iMessage) {
        boolean z;
        IMessage iMessage2 = iMessage;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f16410a, false, 11011, new Class[]{IMessage.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f16410a, false, 11011, new Class[]{IMessage.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.i <= 0) {
            this.i = ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().b();
        }
        if (this.i > 0 && (iMessage2 instanceof ab)) {
            ab abVar = (ab) iMessage2;
            if (!abVar.o && abVar.f16430b != null && this.i == abVar.f16430b.getId() && abVar.h != 1) {
                return true;
            }
        }
        if (this.i > 0 && (iMessage2 instanceof y)) {
            y yVar = (y) iMessage2;
            if (!yVar.j && yVar.g != null && yVar.g.getId() == this.i) {
                return true;
            }
        }
        if (iMessage2 instanceof ab) {
            ab abVar2 = (ab) iMessage2;
            com.bytedance.android.live.core.c.a.b("GiftInterceptor", "收到 GiftMessage: " + abVar2.toString());
            if (abVar2.f16430b == null) {
                com.bytedance.android.live.core.c.a.c("GiftInterceptor", "giftMessage#fromUser is null! messageId = " + abVar2.getMessageId());
                return true;
            } else if (((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(abVar2.f16432d) != null) {
                return false;
            } else {
                long j = abVar2.f16432d;
                if (PatchProxy.isSupport(new Object[]{new Long(j)}, null, o.f15142a, true, 9292, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j)}, null, o.f15142a, true, 9292, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("gift_id", Long.valueOf(j));
                    Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
                    if (a2 != null) {
                        hashMap.put("room_type", Integer.valueOf(a2.getOrientation()));
                        hashMap.put("room_id", Long.valueOf(a2.getId()));
                        hashMap.put("anchor_id", Long.valueOf(a2.getOwnerUserId()));
                    }
                    e.a(o.b("ttlive_gift_id_not_found"), 1, (Map<String, Object>) hashMap);
                    com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.b.Gift.info, "ttlive_gift_id_not_found", 1, (Map) hashMap);
                }
                if (PatchProxy.isSupport(new Object[]{abVar2}, this, f16410a, false, 11009, new Class[]{ab.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{abVar2}, this, f16410a, false, 11009, new Class[]{ab.class}, Void.TYPE);
                } else {
                    List list = (List) this.f16412c.get(abVar2.f16432d);
                    if (list == null) {
                        list = new ArrayList();
                        this.f16412c.put(abVar2.f16432d, list);
                    }
                    list.add(abVar2);
                }
                c cVar = this.g;
                com.bytedance.android.livesdk.gift.b bVar = new com.bytedance.android.livesdk.gift.b(abVar2.f16432d, this.f16414e, this.h);
                com.bytedance.android.livesdk.gift.b bVar2 = bVar;
                if (PatchProxy.isSupport(new Object[]{bVar}, cVar, c.f14751a, false, 9225, new Class[]{com.bytedance.android.livesdk.gift.b.class}, Void.TYPE)) {
                    c cVar2 = cVar;
                    PatchProxy.accessDispatch(new Object[]{bVar2}, cVar2, c.f14751a, false, 9225, new Class[]{com.bytedance.android.livesdk.gift.b.class}, Void.TYPE);
                } else {
                    if (PatchProxy.isSupport(new Object[]{bVar2}, cVar, c.f14751a, false, 9227, new Class[]{com.bytedance.android.livesdk.gift.b.class}, Void.TYPE)) {
                        c cVar3 = cVar;
                        PatchProxy.accessDispatch(new Object[]{bVar2}, cVar3, c.f14751a, false, 9227, new Class[]{com.bytedance.android.livesdk.gift.b.class}, Void.TYPE);
                    } else {
                        List list2 = cVar.f14753c.get(Long.valueOf(bVar2.f14745b));
                        if (list2 == null) {
                            list2 = new ArrayList();
                            cVar.f14753c.put(Long.valueOf(bVar2.f14745b), list2);
                            cVar.f14752b.put(Long.valueOf(bVar2.f14745b), 0);
                        }
                        if (!list2.contains(bVar2)) {
                            list2.add(bVar2);
                        }
                    }
                    cVar.a();
                }
                return true;
            }
        } else if (!(iMessage2 instanceof q)) {
            return false;
        } else {
            q qVar = (q) iMessage2;
            com.bytedance.android.live.core.c.a.b("GiftInterceptor", "收到 DoodleGiftMessage: " + qVar.toString());
            if (qVar.f16671b == null) {
                com.bytedance.android.live.core.c.a.c("GiftInterceptor", "doodleGiftMessage#fromUser is null! messageId = " + qVar.getMessageId());
                return true;
            }
            r rVar = qVar.h;
            if (rVar == null || rVar.f16676a == null) {
                z = false;
            } else {
                z = true;
                for (int i2 = 0; i2 < rVar.f16676a.size(); i2++) {
                    s sVar = rVar.f16676a.get(i2);
                    if (TextUtils.isEmpty(com.bytedance.android.livesdk.gift.a.a(sVar.f16681c))) {
                        com.bytedance.android.livesdk.gift.a.b(sVar.f16681c);
                        z = false;
                    }
                }
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    public d(long j, boolean z) {
        this.f16414e = j;
        this.f16415f = z;
        this.g = new c(z);
    }
}
