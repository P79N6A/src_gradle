package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.presenter.ab;
import com.bytedance.android.livesdk.chatroom.presenter.ac;
import com.bytedance.android.livesdk.chatroom.presenter.ad;
import com.bytedance.android.livesdk.chatroom.presenter.ae;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.relay.GiftRelayDialogFragment;
import com.bytedance.android.livesdk.gift.relay.a.a;
import com.bytedance.android.livesdk.gift.relay.c;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class GiftRelayWidget extends LiveRecyclableWidget implements Observer<KVData>, ab.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12544a;

    /* renamed from: b  reason: collision with root package name */
    private Room f12545b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12546c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12547d;

    /* renamed from: e  reason: collision with root package name */
    private GiftRelayDialogFragment f12548e;

    /* renamed from: f  reason: collision with root package name */
    private ab f12549f;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12544a, false, 6866, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12544a, false, 6866, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12544a, false, 6867, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12544a, false, 6867, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12544a, false, 6860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12544a, false, 6860, new Class[0], Void.TYPE);
            return;
        }
        this.dataCenter.removeObserver(this);
        if (PatchProxy.isSupport(new Object[0], this, f12544a, false, 6864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12544a, false, 6864, new Class[0], Void.TYPE);
        } else if (this.f12548e != null && this.f12548e.isViewValid()) {
            this.f12548e.f15414b = false;
            this.f12548e.dismissAllowingStateLoss();
        }
        this.f12549f.d();
    }

    public void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12544a, false, 6858, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12544a, false, 6858, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12549f = new ab();
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12544a, false, 6865, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12544a, false, 6865, new Class[]{a.class}, Void.TYPE);
        } else if (this.f12548e != null && this.f12548e.isShowing() && aVar != null) {
            this.f12548e.a(aVar.n, aVar.m);
        }
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12544a, false, 6859, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12544a, false, 6859, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12545b = (Room) this.dataCenter.get("data_room", null);
        this.f12546c = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.TRUE)).booleanValue();
        this.f12547d = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.FALSE)).booleanValue();
        this.dataCenter.observe("cmd_show_gift_relay_dialog", this);
        this.f12549f.a((ab.a) this);
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        String str;
        GiftRelayDialogFragment giftRelayDialogFragment;
        long j;
        boolean z;
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12544a, false, 6861, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12544a, false, 6861, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == -171438776 && key.equals("cmd_show_gift_relay_dialog")) {
                c2 = 0;
            }
            if (c2 == 0) {
                String str2 = (String) kVData.getData();
                if (PatchProxy.isSupport(new Object[]{str2}, this, f12544a, false, 6862, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f12544a, false, 6862, new Class[]{String.class}, Void.TYPE);
                } else {
                    if (this.f12548e != null && this.f12548e.isShowing()) {
                        this.f12548e.f15414b = false;
                        this.f12548e.dismissAllowingStateLoss();
                        this.f12548e = null;
                    }
                    Activity activity = (Activity) this.context;
                    Room room = this.f12545b;
                    boolean z2 = this.f12546c;
                    boolean z3 = this.f12547d;
                    if (PatchProxy.isSupport(new Object[]{activity, room, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), str2}, null, GiftRelayDialogFragment.f15413a, true, 10088, new Class[]{Activity.class, Room.class, Boolean.TYPE, Boolean.TYPE, String.class}, GiftRelayDialogFragment.class)) {
                        giftRelayDialogFragment = (GiftRelayDialogFragment) PatchProxy.accessDispatch(new Object[]{activity, room, Byte.valueOf(z2), Byte.valueOf(z3), str2}, null, GiftRelayDialogFragment.f15413a, true, 10088, new Class[]{Activity.class, Room.class, Boolean.TYPE, Boolean.TYPE, String.class}, GiftRelayDialogFragment.class);
                    } else {
                        GiftRelayDialogFragment giftRelayDialogFragment2 = new GiftRelayDialogFragment();
                        giftRelayDialogFragment2.f15415c = activity;
                        giftRelayDialogFragment2.f15417e = room;
                        giftRelayDialogFragment2.f15418f = z2;
                        giftRelayDialogFragment2.g = z3;
                        if (!z2 || (!z3 && !g.a(activity))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        giftRelayDialogFragment2.h = z;
                        giftRelayDialogFragment2.f15414b = "gift_panel".equals(str2);
                        giftRelayDialogFragment = giftRelayDialogFragment2;
                    }
                    this.f12548e = giftRelayDialogFragment;
                    GiftRelayDialogFragment giftRelayDialogFragment3 = this.f12548e;
                    DataCenter dataCenter = this.dataCenter;
                    if (PatchProxy.isSupport(new Object[]{dataCenter}, giftRelayDialogFragment3, GiftRelayDialogFragment.f15413a, false, 10102, new Class[]{DataCenter.class}, Void.TYPE)) {
                        GiftRelayDialogFragment giftRelayDialogFragment4 = giftRelayDialogFragment3;
                        PatchProxy.accessDispatch(new Object[]{dataCenter}, giftRelayDialogFragment4, GiftRelayDialogFragment.f15413a, false, 10102, new Class[]{DataCenter.class}, Void.TYPE);
                    } else {
                        giftRelayDialogFragment3.f15416d = dataCenter;
                        giftRelayDialogFragment3.f15416d.observe("data_is_gift_relay_showing", new c(giftRelayDialogFragment3));
                    }
                    if (this.context instanceof FragmentActivity) {
                        com.bytedance.android.livesdk.gift.relay.a.c giftRelayInfo = GiftManager.inst().getGiftRelayInfo(0);
                        ab abVar = this.f12549f;
                        long id = this.f12545b.getId();
                        long ownerUserId = this.f12545b.getOwnerUserId();
                        if (giftRelayInfo != null) {
                            j = giftRelayInfo.f15438c;
                        } else {
                            j = 0;
                        }
                        long j2 = j;
                        Object[] objArr = {new Long(id), new Long(ownerUserId), new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect = ab.f11199a;
                        Class[] clsArr = {Long.TYPE, Long.TYPE, Long.TYPE};
                        long j3 = j2;
                        if (PatchProxy.isSupport(objArr, abVar, changeQuickRedirect, false, 5217, clsArr, Void.TYPE)) {
                            ab abVar2 = abVar;
                            PatchProxy.accessDispatch(new Object[]{new Long(id), new Long(ownerUserId), new Long(j3)}, abVar2, ab.f11199a, false, 5217, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
                        } else {
                            abVar.f11200b = ((GiftRetrofitApi) ((h) b.a(h.class)).c().create(GiftRetrofitApi.class)).checkFreeCellStatus(id, ownerUserId, j3).compose(i.a()).subscribe(new ac(abVar), ad.f11204b, ae.f11206b);
                        }
                        this.f12548e.show(((FragmentActivity) this.context).getSupportFragmentManager(), "");
                    }
                }
                if (PatchProxy.isSupport(new Object[]{str2}, this, f12544a, false, 6863, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f12544a, false, 6863, new Class[]{String.class}, Void.TYPE);
                } else if (this.f12545b != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(this.f12545b.getOwnerUserId()));
                    hashMap.put("room_id", String.valueOf(this.f12545b.getId()));
                    hashMap.put("show_position", str2);
                    com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                    Object[] objArr2 = new Object[2];
                    j jVar = new j();
                    if (this.f12547d) {
                        str = "live_take_detail";
                    } else {
                        str = "live_detail";
                    }
                    objArr2[0] = jVar.a(str).c("bottom_tab").b("live_interact").f("other");
                    objArr2[1] = Room.class;
                    a2.a("endless_gift_show", hashMap, objArr2);
                }
            }
        }
    }
}
