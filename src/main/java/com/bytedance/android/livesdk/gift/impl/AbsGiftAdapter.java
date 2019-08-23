package com.bytedance.android.livesdk.gift.impl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.model.ag;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.holder.BannerPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.GiftAdViewHolder;
import com.bytedance.android.livesdk.gift.holder.GiftPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.PropPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.RedPacketPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.TaskGiftPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.XgPanelViewHolder;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.a.e;
import com.bytedance.android.livesdk.gift.model.a.i;
import com.bytedance.android.livesdk.gift.model.a.j;
import com.bytedance.android.livesdk.gift.model.a.k;
import com.bytedance.android.livesdk.gift.panel.GiftListDiffUtilCallback;
import com.bytedance.android.livesdk.gift.u;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbsGiftAdapter extends RecyclerView.Adapter<BasePanelViewHolder> implements BasePanelViewHolder.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15032a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f15033b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.bytedance.android.livesdk.gift.model.a.b> f15034c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final c f15035d = new c(this, (byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public boolean f15036e;

    /* renamed from: f  reason: collision with root package name */
    private final LayoutInflater f15037f;
    private Room g;
    private com.bytedance.android.livesdk.gift.model.a.b h;
    private a i;
    private final int j = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    private boolean k;

    public interface a {
        void a(com.bytedance.android.livesdk.gift.model.a.b bVar);
    }

    public interface b {
        void a(com.bytedance.android.livesdk.gift.model.a.b bVar, boolean z);
    }

    public class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15038a;

        /* renamed from: b  reason: collision with root package name */
        public b f15039b;

        private c() {
        }

        /* synthetic */ c(AbsGiftAdapter absGiftAdapter, byte b2) {
            this();
        }

        public final void a(com.bytedance.android.livesdk.gift.model.a.b bVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f15038a, false, 9769, new Class[]{com.bytedance.android.livesdk.gift.model.a.b.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, this, f15038a, false, 9769, new Class[]{com.bytedance.android.livesdk.gift.model.a.b.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (this.f15039b != null) {
                this.f15039b.a(bVar, z);
            }
        }
    }

    public final com.bytedance.android.livesdk.gift.model.a.b a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f15032a, false, 9752, new Class[]{Long.TYPE}, com.bytedance.android.livesdk.gift.model.a.b.class)) {
            return (com.bytedance.android.livesdk.gift.model.a.b) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f15032a, false, 9752, new Class[]{Long.TYPE}, com.bytedance.android.livesdk.gift.model.a.b.class);
        }
        for (com.bytedance.android.livesdk.gift.model.a.b next : this.f15034c) {
            if (next != null && next.o() == j3) {
                return next;
            }
        }
        return null;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15032a, false, 9755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15032a, false, 9755, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f15035d;
        List<com.bytedance.android.livesdk.gift.model.a.b> list = this.f15034c;
        if (PatchProxy.isSupport(new Object[]{list}, cVar, c.f15038a, false, 9768, new Class[]{List.class}, Void.TYPE)) {
            Object[] objArr = {list};
            c cVar2 = cVar;
            PatchProxy.accessDispatch(objArr, cVar2, c.f15038a, false, 9768, new Class[]{List.class}, Void.TYPE);
        } else {
            for (com.bytedance.android.livesdk.gift.model.a.b next : list) {
                if (next != null) {
                    cVar.a(next, false);
                }
            }
        }
        this.h = null;
    }

    public void a(List<com.bytedance.android.livesdk.gift.model.a.b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15032a, false, 9758, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15032a, false, 9758, new Class[]{List.class}, Void.TYPE);
            return;
        }
        DiffUtil.calculateDiff(new GiftListDiffUtilCallback(this.f15034c, list, this.k)).dispatchUpdatesTo((RecyclerView.Adapter) this);
        this.f15034c.clear();
        this.f15034c.addAll(list);
        if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.b()) {
            for (com.bytedance.android.livesdk.gift.model.a.b bVar : this.f15034c) {
                bVar.f15097c = false;
            }
        }
    }

    public final void a(BasePanelViewHolder basePanelViewHolder, com.bytedance.android.livesdk.gift.model.a.b bVar) {
        BasePanelViewHolder basePanelViewHolder2 = basePanelViewHolder;
        if (PatchProxy.isSupport(new Object[]{basePanelViewHolder2, bVar}, this, f15032a, false, 9767, new Class[]{BasePanelViewHolder.class, com.bytedance.android.livesdk.gift.model.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{basePanelViewHolder2, bVar}, this, f15032a, false, 9767, new Class[]{BasePanelViewHolder.class, com.bytedance.android.livesdk.gift.model.a.b.class}, Void.TYPE);
            return;
        }
        if (basePanelViewHolder2 instanceof BannerPanelViewHolder) {
            com.bytedance.android.livesdk.gift.model.a.c cVar = (com.bytedance.android.livesdk.gift.model.a.c) bVar;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f15032a, false, 9760, new Class[]{com.bytedance.android.livesdk.gift.model.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f15032a, false, 9760, new Class[]{com.bytedance.android.livesdk.gift.model.a.c.class}, Void.TYPE);
            } else {
                if (this.i != null) {
                    this.i.a(cVar);
                }
            }
        } else if (basePanelViewHolder2 instanceof RedPacketPanelViewHolder) {
            i iVar = (i) bVar;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f15032a, false, 9761, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f15032a, false, 9761, new Class[]{i.class}, Void.TYPE);
            } else {
                if ((!iVar.f15097c || iVar.d()) && this.i != null) {
                    this.i.a(iVar);
                }
            }
        } else if (basePanelViewHolder2 instanceof TaskGiftPanelViewHolder) {
            j jVar = (j) bVar;
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f15032a, false, 9762, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, f15032a, false, 9762, new Class[]{j.class}, Void.TYPE);
            } else {
                if (!jVar.f15097c || jVar.d()) {
                    if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
                        ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a(this.f15033b, com.bytedance.android.livesdk.user.i.a().a(ac.a((int) C0906R.string.der)).d("live_detail").e("gift_send").c("gift").a(1003).a()).subscribe((Observer<? super T>) new g<Object>());
                    } else if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a(h.TASK_GIFT)) {
                        if (u.a().b() <= 0) {
                            com.bytedance.android.livesdk.u.a.a().a((Object) new ag());
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("log_pb", this.g.getLog_pb());
                                jSONObject.put("request_id", this.g.getRequestId());
                                jSONObject.put("source", this.g.getUserFrom());
                                f.a(this.f15033b).a("click_empty_pop_gift", "giftlist", ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().b(), this.g.getId(), jSONObject);
                            } catch (JSONException unused) {
                            }
                        } else {
                            a((com.bytedance.android.livesdk.gift.model.a.a) jVar);
                        }
                    }
                }
            }
        } else if (basePanelViewHolder2 instanceof GiftAdViewHolder) {
            a(basePanelViewHolder2, (e) bVar);
        } else if (basePanelViewHolder2 instanceof XgPanelViewHolder) {
            a((com.bytedance.android.livesdk.gift.model.a.a) (k) bVar);
        } else if (basePanelViewHolder2 instanceof PropPanelViewHolder) {
            com.bytedance.android.livesdk.gift.model.a.h hVar = (com.bytedance.android.livesdk.gift.model.a.h) bVar;
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f15032a, false, 9763, new Class[]{com.bytedance.android.livesdk.gift.model.a.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f15032a, false, 9763, new Class[]{com.bytedance.android.livesdk.gift.model.a.h.class}, Void.TYPE);
            } else {
                if (((Prop) hVar.f15098d).count > 0) {
                    a((com.bytedance.android.livesdk.gift.model.a.a) hVar);
                }
            }
        } else {
            a((com.bytedance.android.livesdk.gift.model.a.a) bVar);
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f15032a, false, 9759, new Class[0], Integer.TYPE)) {
            return this.f15034c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15032a, false, 9759, new Class[0], Integer.TYPE)).intValue();
    }

    private void b(com.bytedance.android.livesdk.gift.model.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f15032a, false, 9765, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f15032a, false, 9765, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a(aVar);
        }
    }

    public long getItemId(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15032a, false, 9750, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return this.f15034c.get(i2).o();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15032a, false, 9750, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
    }

    public int getItemViewType(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15032a, false, 9749, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f15034c.get(i2).f15095a;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15032a, false, 9749, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    private void a(com.bytedance.android.livesdk.gift.model.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f15032a, false, 9764, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f15032a, false, 9764, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class}, Void.TYPE);
        } else if (this.k) {
            b(aVar);
        } else if (com.bytedance.android.live.uikit.a.a.j()) {
            b(aVar);
        } else {
            if (aVar.f15097c) {
                boolean a2 = ((com.bytedance.android.livesdkapi.host.e) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.e.class)).a(aVar.n());
                if (!aVar.d() || !a2) {
                    return;
                }
            }
            boolean z = !aVar.f15096b;
            if (!aVar.d() || z) {
                if (z) {
                    this.f15035d.a(this.h, false);
                    if (aVar.f15095a != 8) {
                        this.f15035d.a(aVar, true);
                    }
                    this.h = aVar;
                    com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.gift.b.b(aVar.d()));
                } else if (!com.bytedance.android.live.uikit.a.a.f()) {
                    this.f15035d.a(aVar, false);
                    this.h = null;
                }
                if (this.i != null && (!com.bytedance.android.live.uikit.a.a.f() || !z)) {
                    this.i.a(aVar);
                }
            }
        }
    }

    public final int a(com.bytedance.android.livesdk.gift.model.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f15032a, false, 9751, new Class[]{com.bytedance.android.livesdk.gift.model.a.b.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bVar}, this, f15032a, false, 9751, new Class[]{com.bytedance.android.livesdk.gift.model.a.b.class}, Integer.TYPE)).intValue();
        }
        for (int i2 = 0; i2 < this.f15034c.size(); i2++) {
            if (this.f15034c.get(i2).equals(bVar)) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(@NonNull BasePanelViewHolder basePanelViewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{basePanelViewHolder, Integer.valueOf(i2)}, this, f15032a, false, 9753, new Class[]{BasePanelViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{basePanelViewHolder, Integer.valueOf(i2)}, this, f15032a, false, 9753, new Class[]{BasePanelViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.gift.model.a.b bVar = this.f15034c.get(i2);
        if (bVar != null) {
            if (bVar.f15095a == 0) {
                basePanelViewHolder.itemView.setVisibility(4);
                return;
            }
            basePanelViewHolder.a(bVar);
            basePanelViewHolder.n = this;
        }
    }

    private void a(BasePanelViewHolder basePanelViewHolder, e eVar) {
        if (PatchProxy.isSupport(new Object[]{basePanelViewHolder, eVar}, this, f15032a, false, 9766, new Class[]{BasePanelViewHolder.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{basePanelViewHolder, eVar}, this, f15032a, false, 9766, new Class[]{BasePanelViewHolder.class, e.class}, Void.TYPE);
            return;
        }
        a();
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.gift.b.b(false));
        if (!(basePanelViewHolder == null || basePanelViewHolder.itemView == null || com.bytedance.android.livesdk.utils.k.a(basePanelViewHolder.itemView.getId(), 1000) || this.i == null)) {
            this.i.a(eVar);
        }
    }

    @NonNull
    /* renamed from: a */
    public BasePanelViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        BasePanelViewHolder basePanelViewHolder;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f15032a, false, 9748, new Class[]{ViewGroup.class, Integer.TYPE}, BasePanelViewHolder.class)) {
            return (BasePanelViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f15032a, false, 9748, new Class[]{ViewGroup.class, Integer.TYPE}, BasePanelViewHolder.class);
        }
        switch (i2) {
            case 1:
            case 8:
                basePanelViewHolder = new GiftPanelViewHolder(this.f15037f.inflate(C0906R.layout.ajy, null));
                break;
            case 2:
                basePanelViewHolder = new PropPanelViewHolder(this.f15037f.inflate(C0906R.layout.ak0, null));
                break;
            case 4:
                basePanelViewHolder = new TaskGiftPanelViewHolder(this.f15037f.inflate(C0906R.layout.ajy, null));
                break;
            case 5:
                basePanelViewHolder = new RedPacketPanelViewHolder(this.f15037f.inflate(C0906R.layout.ajy, null));
                break;
            case 6:
                basePanelViewHolder = new GiftAdViewHolder(this.f15037f.inflate(C0906R.layout.ajz, null));
                break;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                basePanelViewHolder = new XgPanelViewHolder(this.f15037f.inflate(C0906R.layout.ajy, null), this.f15036e);
                break;
            default:
                basePanelViewHolder = new BannerPanelViewHolder(this.f15037f.inflate(C0906R.layout.ajw, null));
                break;
        }
        return basePanelViewHolder;
    }

    public AbsGiftAdapter(Context context, Room room, a aVar) {
        this.f15033b = context;
        this.g = room;
        this.f15037f = LayoutInflater.from(this.f15033b);
        this.i = aVar;
        boolean z = true;
        this.k = (!com.bytedance.android.live.uikit.a.a.a() || ((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.a()).intValue() != 1) ? false : z;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2, @NonNull List list) {
        int i3 = i2;
        List list2 = list;
        BasePanelViewHolder basePanelViewHolder = (BasePanelViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{basePanelViewHolder, Integer.valueOf(i2), list2}, this, f15032a, false, 9754, new Class[]{BasePanelViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{basePanelViewHolder, Integer.valueOf(i2), list2}, this, f15032a, false, 9754, new Class[]{BasePanelViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
        } else if (list.isEmpty()) {
            onBindViewHolder(basePanelViewHolder, i3);
        } else {
            com.bytedance.android.livesdk.gift.model.a.b bVar = this.f15034c.get(i3);
            if (bVar != null) {
                if (bVar.f15095a == 0) {
                    basePanelViewHolder.itemView.setVisibility(4);
                } else {
                    basePanelViewHolder.a(bVar, list2);
                    basePanelViewHolder.n = this;
                }
            }
        }
    }
}
