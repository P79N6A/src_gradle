package com.bytedance.android.livesdk.s;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.bytedance.android.live.core.setting.LiveSettingGroupFragment;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.LiveBroadcastFragment;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.StartLiveActivityProxy;
import com.bytedance.android.livesdk.StartLiveFragmentD;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.activity.GiftAdActivityProxy;
import com.bytedance.android.livesdk.an;
import com.bytedance.android.livesdk.bgbroadcast.BgBroadcastFragment;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.chatroom.event.am;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.j.b.g;
import com.bytedance.android.livesdk.j.b.k;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.s.b;
import com.bytedance.android.livesdk.sign.BroadcastSigningActivityProxy;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.verify.VerifyActivityProxy;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.f.b;
import com.bytedance.android.livesdkapi.service.c;
import com.bytedance.android.livesdkapi.service.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17120a;

    /* renamed from: b  reason: collision with root package name */
    private final b f17121b = f.f17126a;

    /* renamed from: c  reason: collision with root package name */
    private f f17122c;

    /* renamed from: d  reason: collision with root package name */
    private final d f17123d = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17124a;

        public final int a() {
            if (!PatchProxy.isSupport(new Object[0], this, f17124a, false, 12901, new Class[0], Integer.TYPE)) {
                return ((Integer) com.bytedance.android.livesdk.app.dataholder.e.a().f9041c).intValue();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17124a, false, 12901, new Class[0], Integer.TYPE)).intValue();
        }

        public final void a(com.bytedance.android.livesdkapi.b.c<Integer> cVar) {
            com.bytedance.android.livesdkapi.b.c<Integer> cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f17124a, false, 12899, new Class[]{com.bytedance.android.livesdkapi.b.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2}, this, f17124a, false, 12899, new Class[]{com.bytedance.android.livesdkapi.b.c.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.app.dataholder.e.a().a(cVar2);
        }
    };

    public final d c() {
        return this.f17123d;
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f17120a, false, 12865, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f17120a, false, 12865, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).initGiftResourceManager(context2);
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, (byte) 0}, this, f17120a, false, 12868, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, (byte) 0}, this, f17120a, false, 12868, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).openGiftDialog(str2, false);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f17120a, false, 12869, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f17120a, false, 12869, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a.a().a((Object) new am(2, z));
    }

    public final boolean a(Context context, Uri uri) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2, uri}, this, f17120a, false, 12871, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return j.q().m().b(context2, uri.toString());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri}, this, f17120a, false, 12871, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f17120a, false, 12876, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f17120a, false, 12876, new Class[]{String.class}, Void.TYPE);
            return;
        }
        j.q().i().f15874a = new com.bytedance.android.livesdk.live.b.a(str2);
    }

    public final void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f17120a, false, 12888, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f17120a, false, 12888, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdkapi.k.a.e eVar = new com.bytedance.android.livesdkapi.k.a.e((String) LiveConfigSettingKeys.LIVE_FULL_SCREEN_RECHARGE_URL.a());
        g a2 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class);
        if (a2 instanceof k) {
            k kVar = (k) a2;
            if (kVar.a().containsKey("enter_from_merge")) {
                eVar.a("enter_from_merge", (String) kVar.a().get("enter_from_merge"));
            }
            if (kVar.a().containsKey("enter_method")) {
                eVar.a("enter_method", (String) kVar.a().get("enter_method"));
            }
        }
        g a3 = com.bytedance.android.livesdk.j.a.a().a(Room.class);
        if (a3 instanceof n) {
            n nVar = (n) a3;
            if (nVar.a().containsKey("anchor_id")) {
                eVar.a("anchor_id", (String) nVar.a().get("anchor_id"));
            }
            if (nVar.a().containsKey("room_id")) {
                eVar.a("room_id", (String) nVar.a().get("room_id"));
            }
            if (nVar.a().containsKey("log_pb")) {
                eVar.a("log_pb", (String) nVar.a().get("log_pb"));
            }
            if (nVar.a().containsKey("request_id")) {
                eVar.a("request_id", (String) nVar.a().get("request_id"));
            }
        }
        eVar.a("request_page", "my_profile");
        TTLiveSDKContext.getHostService().i().a(eVar.a(), str2, context2);
    }

    public final void a(long j, com.bytedance.android.livesdkapi.service.a aVar) {
        long j2 = j;
        com.bytedance.android.livesdkapi.service.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), aVar2}, this, f17120a, false, 12889, new Class[]{Long.TYPE, com.bytedance.android.livesdkapi.service.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), aVar2}, this, f17120a, false, 12889, new Class[]{Long.TYPE, com.bytedance.android.livesdkapi.service.a.class}, Void.TYPE);
            return;
        }
        ((RoomStatApi) j.q().b().create(RoomStatApi.class)).checkRoom(String.valueOf(j)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new g(aVar2), new h(aVar2));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17120a, false, 12866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12866, new Class[0], Void.TYPE);
            return;
        }
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).syncGiftList(1);
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).syncAssetsList("effects", 1);
    }

    public final com.bytedance.android.livesdkapi.depend.d.n d() {
        if (!PatchProxy.isSupport(new Object[0], this, f17120a, false, 12875, new Class[0], com.bytedance.android.livesdkapi.depend.d.n.class)) {
            return j.q().g();
        }
        return (com.bytedance.android.livesdkapi.depend.d.n) PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12875, new Class[0], com.bytedance.android.livesdkapi.depend.d.n.class);
    }

    public final com.bytedance.android.livesdkapi.depend.d.g e() {
        if (!PatchProxy.isSupport(new Object[0], this, f17120a, false, 12878, new Class[0], com.bytedance.android.livesdkapi.depend.d.g.class)) {
            return j.q().a();
        }
        return (com.bytedance.android.livesdkapi.depend.d.g) PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12878, new Class[0], com.bytedance.android.livesdkapi.depend.d.g.class);
    }

    public final com.bytedance.android.livesdkapi.depend.d.a.b f() {
        if (!PatchProxy.isSupport(new Object[0], this, f17120a, false, 12879, new Class[0], com.bytedance.android.livesdkapi.depend.d.a.b.class)) {
            return ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).giftPlayControllerManager();
        }
        return (com.bytedance.android.livesdkapi.depend.d.a.b) PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12879, new Class[0], com.bytedance.android.livesdkapi.depend.d.a.b.class);
    }

    public final Fragment g() {
        if (!PatchProxy.isSupport(new Object[0], this, f17120a, false, 12883, new Class[0], Fragment.class)) {
            return new LiveSettingGroupFragment();
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12883, new Class[0], Fragment.class);
    }

    public final com.bytedance.android.livesdkapi.depend.d.c h() {
        if (!PatchProxy.isSupport(new Object[0], this, f17120a, false, 12886, new Class[0], com.bytedance.android.livesdkapi.depend.d.c.class)) {
            return a.a();
        }
        return (com.bytedance.android.livesdkapi.depend.d.c) PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12886, new Class[0], com.bytedance.android.livesdkapi.depend.d.c.class);
    }

    public final f i() {
        if (PatchProxy.isSupport(new Object[0], this, f17120a, false, 12890, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12890, new Class[0], f.class);
        }
        if (this.f17122c == null) {
            this.f17122c = new com.bytedance.android.livesdk.live.a.a();
        }
        return this.f17122c;
    }

    public final com.bytedance.android.livesdkapi.depend.d.e j() {
        if (!PatchProxy.isSupport(new Object[0], this, f17120a, false, 12891, new Class[0], com.bytedance.android.livesdkapi.depend.d.e.class)) {
            return b.a.f17114a;
        }
        return (com.bytedance.android.livesdkapi.depend.d.e) PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12891, new Class[0], com.bytedance.android.livesdkapi.depend.d.e.class);
    }

    public final com.bytedance.android.livesdkapi.depend.model.a.e b() {
        if (PatchProxy.isSupport(new Object[0], this, f17120a, false, 12874, new Class[0], com.bytedance.android.livesdkapi.depend.model.a.e.class)) {
            return (com.bytedance.android.livesdkapi.depend.model.a.e) PatchProxy.accessDispatch(new Object[0], this, f17120a, false, 12874, new Class[0], com.bytedance.android.livesdkapi.depend.model.a.e.class);
        } else if (PatchProxy.isSupport(new Object[0], null, StartLiveFragmentD.u, true, 2802, new Class[0], StartLiveFragmentD.class)) {
            return (StartLiveFragmentD) PatchProxy.accessDispatch(new Object[0], null, StartLiveFragmentD.u, true, 2802, new Class[0], StartLiveFragmentD.class);
        } else {
            com.bytedance.android.livesdk.effect.j.a().c();
            return new StartLiveFragmentD();
        }
    }

    public final com.bytedance.android.livesdkapi.b.b b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f17120a, false, 12887, new Class[]{Bundle.class}, com.bytedance.android.livesdkapi.b.b.class)) {
            return (com.bytedance.android.livesdkapi.b.b) PatchProxy.accessDispatch(new Object[]{bundle2}, this, f17120a, false, 12887, new Class[]{Bundle.class}, com.bytedance.android.livesdkapi.b.b.class);
        }
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, TTLiveBrowserFragment.f9357a, true, 3487, new Class[]{Bundle.class}, TTLiveBrowserFragment.class)) {
            return (TTLiveBrowserFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, null, TTLiveBrowserFragment.f9357a, true, 3487, new Class[]{Bundle.class}, TTLiveBrowserFragment.class);
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = new TTLiveBrowserFragment();
        tTLiveBrowserFragment.setArguments(bundle2);
        return tTLiveBrowserFragment;
    }

    public final void b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f17120a, false, 12867, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f17120a, false, 12867, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        j.q().a().c(context2);
        an.a().b();
    }

    public final com.bytedance.android.livesdkapi.depend.model.a.a a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f17120a, false, 12882, new Class[]{Bundle.class}, com.bytedance.android.livesdkapi.depend.model.a.a.class)) {
            return (com.bytedance.android.livesdkapi.depend.model.a.a) PatchProxy.accessDispatch(new Object[]{bundle2}, this, f17120a, false, 12882, new Class[]{Bundle.class}, com.bytedance.android.livesdkapi.depend.model.a.a.class);
        }
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, BgBroadcastFragment.f9140a, true, 3213, new Class[]{Bundle.class}, BgBroadcastFragment.class)) {
            return (BgBroadcastFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, null, BgBroadcastFragment.f9140a, true, 3213, new Class[]{Bundle.class}, BgBroadcastFragment.class);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putBundle(PushConstants.EXTRA, bundle2);
        BgBroadcastFragment bgBroadcastFragment = new BgBroadcastFragment();
        bgBroadcastFragment.setArguments(bundle3);
        return bgBroadcastFragment;
    }

    public final LiveActivityProxy a(FragmentActivity fragmentActivity, int i) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, Integer.valueOf(i)}, this, f17120a, false, 12885, new Class[]{FragmentActivity.class, Integer.TYPE}, LiveActivityProxy.class)) {
            return (LiveActivityProxy) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, Integer.valueOf(i)}, this, f17120a, false, 12885, new Class[]{FragmentActivity.class, Integer.TYPE}, LiveActivityProxy.class);
        }
        LiveActivityProxy liveActivityProxy = null;
        if (i2 != 1) {
            switch (i2) {
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                    liveActivityProxy = new StartLiveActivityProxy(fragmentActivity2);
                    break;
                case 8:
                    liveActivityProxy = new VerifyActivityProxy(fragmentActivity2);
                    break;
                case 9:
                    liveActivityProxy = new BroadcastSigningActivityProxy(fragmentActivity2);
                    break;
            }
        } else {
            liveActivityProxy = new GiftAdActivityProxy(fragmentActivity2);
        }
        return liveActivityProxy;
    }

    public final Fragment a(com.bytedance.android.livesdkapi.depend.model.a.c cVar, Bundle bundle) {
        com.bytedance.android.livesdkapi.depend.model.a.c cVar2 = cVar;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{cVar2, bundle2}, this, f17120a, false, 12881, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.c.class, Bundle.class}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{cVar2, bundle2}, this, f17120a, false, 12881, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.c.class, Bundle.class}, Fragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{cVar2, bundle2}, null, LiveBroadcastFragment.f8747a, true, 2535, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.c.class, Bundle.class}, LiveBroadcastFragment.class)) {
            return (LiveBroadcastFragment) PatchProxy.accessDispatch(new Object[]{cVar2, bundle2}, null, LiveBroadcastFragment.f8747a, true, 2535, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.c.class, Bundle.class}, LiveBroadcastFragment.class);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putBundle(PushConstants.EXTRA, bundle2);
        LiveBroadcastFragment liveBroadcastFragment = new LiveBroadcastFragment();
        liveBroadcastFragment.setArguments(bundle3);
        liveBroadcastFragment.f8748b = cVar2;
        return liveBroadcastFragment;
    }

    public final com.bytedance.android.livesdkapi.depend.d.b a(Context context, ViewGroup viewGroup) {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{context2, viewGroup2}, this, f17120a, false, 12893, new Class[]{Context.class, ViewGroup.class}, com.bytedance.android.livesdkapi.depend.d.b.class)) {
            return new com.bytedance.android.livesdk.widget.b(context2, viewGroup2);
        }
        return (com.bytedance.android.livesdkapi.depend.d.b) PatchProxy.accessDispatch(new Object[]{context2, viewGroup2}, this, f17120a, false, 12893, new Class[]{Context.class, ViewGroup.class}, com.bytedance.android.livesdkapi.depend.d.b.class);
    }

    public final h a(long j, Bundle bundle) {
        long j2 = j;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), bundle2}, this, f17120a, false, 12880, new Class[]{Long.TYPE, Bundle.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{new Long(j2), bundle2}, this, f17120a, false, 12880, new Class[]{Long.TYPE, Bundle.class}, h.class);
        }
        if (PatchProxy.isSupport(new Object[]{new Long(j2), bundle2}, null, LiveRoomFragment.f8782a, true, 2665, new Class[]{Long.TYPE, Bundle.class}, LiveRoomFragment.class)) {
            return (LiveRoomFragment) PatchProxy.accessDispatch(new Object[]{new Long(j2), bundle2}, null, LiveRoomFragment.f8782a, true, 2665, new Class[]{Long.TYPE, Bundle.class}, LiveRoomFragment.class);
        }
        Bundle bundle3 = new Bundle();
        if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
        bundle3.putLong("live.intent.extra.ROOM_ID", j2);
        LiveRoomFragment liveRoomFragment = new LiveRoomFragment();
        liveRoomFragment.setArguments(bundle3);
        return liveRoomFragment;
    }
}
