package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.livesdk.chatroom.api.DoodleGiftApi;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.model.j;
import com.bytedance.android.livesdk.gift.p;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.gift.q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15193a;

    /* renamed from: b  reason: collision with root package name */
    int f15194b;

    /* renamed from: c  reason: collision with root package name */
    long f15195c;

    /* renamed from: d  reason: collision with root package name */
    Room f15196d;

    /* renamed from: e  reason: collision with root package name */
    boolean f15197e;

    /* renamed from: f  reason: collision with root package name */
    private String f15198f;

    /* renamed from: com.bytedance.android.livesdk.gift.panel.g$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15199a = new int[GiftDialogViewModel.c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$c[] r0 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15199a = r0
                int[] r0 = f15199a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$c r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.c.GIFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f15199a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$c r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.c.PROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f15199a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$c r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.c.TASK_GIFT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f15199a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$c r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.c.DOODLE_GIFT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f15199a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$c r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.c.GIFT_AD     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.g.AnonymousClass1.<clinit>():void");
        }
    }

    public interface a extends com.bytedance.ies.a.a {
        void a();

        void a(int i, com.bytedance.android.livesdk.gift.panel.a.b bVar);

        void a(i iVar);

        void a(j jVar);

        void a(Exception exc);

        void b(i iVar);

        void b(Exception exc);

        void c(Exception exc);

        void d(Exception exc);
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar) {
        i iVar2 = iVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15193a, false, 9881, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15193a, false, 9881, new Class[]{i.class}, Void.TYPE);
        } else if (b() != null && iVar2.m != 2) {
            if (GiftManager.inst().findGiftById(iVar2.f15133e).f15106e == 10) {
                ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().c(iVar2.p);
            } else {
                ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().a(iVar2.f15131c);
            }
            if (iVar2.l > 0) {
                iVar2.q = q.a().a(iVar2.l);
                if (iVar2.q != null) {
                    iVar2.f15133e = iVar2.q.gift.f15105d;
                    if (!Lists.isEmpty(iVar2.n)) {
                        Iterator<Prop> it2 = iVar2.n.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next().id == iVar2.l) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z) {
                        Prop newInstance = Prop.newInstance(iVar2.q);
                        newInstance.count -= this.f15194b;
                        if (iVar2.n == null) {
                            iVar2.n = new ArrayList();
                        }
                        iVar2.n.add(newInstance);
                        ((a) b()).a(iVar2);
                    }
                }
            }
            ((a) b()).a(iVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(com.bytedance.android.livesdk.gift.panel.a.b bVar) {
        com.bytedance.android.livesdk.gift.panel.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f15193a, false, 9879, new Class[]{com.bytedance.android.livesdk.gift.panel.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f15193a, false, 9879, new Class[]{com.bytedance.android.livesdk.gift.panel.a.b.class}, Void.TYPE);
        } else if (!this.f15197e) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < bVar2.f15167a.size(); i++) {
                p pVar = bVar2.f15167a.get(i);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", pVar.f15145c);
                    jSONObject2.put("x", pVar.f15143a);
                    jSONObject2.put("y", pVar.f15144b);
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            try {
                jSONObject.put("points", jSONArray);
                jSONObject.put("origin_width", bVar2.f15168b);
                jSONObject.put("origin_height", bVar2.f15169c);
            } catch (Exception unused2) {
            }
            this.f15197e = true;
            ((DoodleGiftApi) ((h) com.bytedance.android.live.utility.b.a(h.class)).c().create(DoodleGiftApi.class)).sendDoodleGift(998, this.f15196d.getId(), jSONObject.toString(), this.f15195c).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new o(this, bVar2, SystemClock.uptimeMillis()), new p(this), new q(this));
        }
    }

    public g(Room room, long j, String str) {
        this.f15196d = room;
        this.f15195c = j;
        this.f15198f = str;
    }
}
