package com.bytedance.android.livesdk.chatroom.interact.c;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.bl.c;
import com.bytedance.android.livesdk.chatroom.model.a.n;
import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.ah;
import com.bytedance.android.livesdk.message.model.aj;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;

public final class fk extends bx<a> implements Observer<KVData>, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10684a;

    /* renamed from: b  reason: collision with root package name */
    private Room f10685b;

    /* renamed from: c  reason: collision with root package name */
    private LinkCrossRoomDataHolder f10686c = LinkCrossRoomDataHolder.a();

    public interface a extends al {
        void b();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10684a, false, 4932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10684a, false, 4932, new Class[0], Void.TYPE);
            return;
        }
        this.f10686c.removeObserver(this);
        super.d();
    }

    public fk(DataCenter dataCenter) {
        this.f10685b = (Room) dataCenter.get("data_room");
    }

    private void a(List<n> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10684a, false, 4936, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10684a, false, 4936, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (n next : list) {
            if (next.f11062b != null) {
                if (next.f11061a == this.f10685b.getOwner().getId()) {
                    this.f10686c.lambda$put$1$DataCenter("data_pk_mvp_list_anchor", next.f11062b);
                } else {
                    this.f10686c.lambda$put$1$DataCenter("data_pk_mvp_list_guest", next.f11062b);
                }
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f10684a, false, 4934, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f10684a, false, 4934, new Class[]{IMessage.class}, Void.TYPE);
        } else if (iMessage instanceof aj) {
            this.f10686c.lambda$put$1$DataCenter("data_pk_mvp_list_anchor", new ArrayList());
            this.f10686c.lambda$put$1$DataCenter("data_pk_mvp_list_guest", new ArrayList());
            ((a) b()).b();
        } else {
            if (iMessage instanceof ah) {
                ah ahVar = (ah) iMessage;
                if (ahVar.f16451b != null) {
                    a(ahVar.f16451b);
                }
            }
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10684a, false, 4931, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10684a, false, 4931, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_ARMIES.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE.getIntType(), this);
        if (this.f10686c != LinkCrossRoomDataHolder.f9028b) {
            this.f10686c.observeForever("data_pk_current_room_interact_info", this).observeForever("data_pk_state", this);
        }
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        List list;
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f10684a, false, 4933, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f10684a, false, 4933, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1692693464) {
                if (hashCode == 1505611330 && key.equals("data_pk_state")) {
                    c2 = 1;
                }
            } else if (key.equals("data_pk_current_room_interact_info")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    d dVar = (d) kVData.getData();
                    if (dVar.f7871b != null) {
                        p pVar = (p) dVar.f7871b;
                        if (PatchProxy.isSupport(new Object[]{pVar}, this, f10684a, false, 4937, new Class[]{p.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{pVar}, this, f10684a, false, 4937, new Class[]{p.class}, Void.TYPE);
                            break;
                        } else {
                            if (pVar.g != null) {
                                ah ahVar = new ah();
                                ahVar.f16451b = pVar.g;
                                this.y.insertMessage(ahVar, true);
                            }
                            return;
                        }
                    }
                    break;
                case 1:
                    if (kVData.getData().equals(LinkCrossRoomDataHolder.d.PENAL)) {
                        if (!PatchProxy.isSupport(new Object[0], this, f10684a, false, 4935, new Class[0], Void.TYPE)) {
                            String str = null;
                            LinkCrossRoomDataHolder.c cVar = (LinkCrossRoomDataHolder.c) this.f10686c.get("data_pk_result", LinkCrossRoomDataHolder.c.EVEN);
                            if (cVar == LinkCrossRoomDataHolder.c.LEFT_WON) {
                                list = (List) this.f10686c.get("data_pk_mvp_list_anchor");
                            } else if (cVar == LinkCrossRoomDataHolder.c.RIGHT_WON) {
                                list = (List) this.f10686c.get("data_pk_mvp_list_guest");
                            } else {
                                return;
                            }
                            if (!Lists.isEmpty(list)) {
                                String str2 = ((n.a) list.get(0)).f11065c;
                                if (((n.a) list.get(0)).f11063a == TTLiveSDKContext.getHostService().k().b()) {
                                    str = ac.a((int) C0906R.string.d6c);
                                } else if (cVar == LinkCrossRoomDataHolder.c.LEFT_WON) {
                                    str = ac.a((int) C0906R.string.d6b, str2);
                                }
                                if (str != null) {
                                    this.y.insertMessage(c.a(this.f10685b.getId(), str), true);
                                    break;
                                }
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], this, f10684a, false, 4935, new Class[0], Void.TYPE);
                            return;
                        }
                    }
                    break;
            }
        }
    }
}
