package com.bytedance.android.livesdk.chatroom.interact.e;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.aa;
import com.bytedance.android.livesdk.chatroom.interact.ab;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioGuestAdapter;
import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.model.a.k;
import com.bytedance.android.livesdk.chatroom.ui.bv;
import com.bytedance.android.livesdk.rank.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.b.a.a.c.d;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public final class a implements aa.a, LinkInRoomAudioGuestAdapter.a, a.C0089a, d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10881a;

    /* renamed from: b  reason: collision with root package name */
    public Context f10882b;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f10883c;

    /* renamed from: d  reason: collision with root package name */
    public View f10884d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f10885e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f10886f;
    public RecyclerView g;
    public LinkInRoomAudioGuestAdapter h;
    public com.bytedance.android.livesdk.chatroom.interact.d.a i;
    public Room j;
    public boolean k;
    public boolean l;
    public DataCenter m;
    public c<Integer> n = new b(this);
    public com.bytedance.android.livesdk.chatroom.interact.c.a o;
    public bv p;
    private d q;
    private ab r;
    private g s;
    private Map<String, Boolean> t = new HashMap(9);
    private View.OnClickListener u = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10887a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10888c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10887a, true, 5078, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10887a, true, 5078, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomAudioWindowManager.java", AnonymousClass1.class);
            f10888c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.wm.LinkInRoomAudioWindowManager$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 289);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f10887a, false, 5077, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10887a, false, 5077, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10888c, this, this, view));
            if (!a.this.k) {
                if (!TTLiveSDKContext.getHostService().k().c()) {
                    TTLiveSDKContext.getHostService().k().a(a.this.f10882b, i.a().a(ac.a((int) C0906R.string.d5n)).c("interact").a(0).a()).subscribe((Observer<? super T>) new com.bytedance.android.livesdk.user.g<Object>());
                    return;
                } else if (TTLiveSDKContext.getHostService().k().a(h.INTERACT)) {
                    return;
                }
            }
            a.this.m.lambda$put$1$DataCenter("cmd_interact_state_change", new q(0));
            com.bytedance.android.livesdk.utils.aa.a(a.this.j, "click_connection_banner", "guest_connection", a.this.k);
        }
    };
    private View.OnClickListener v = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10890a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10891c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10890a, true, 5080, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10890a, true, 5080, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomAudioWindowManager.java", AnonymousClass2.class);
            f10891c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.wm.LinkInRoomAudioWindowManager$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 311);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f10890a, false, 5079, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10890a, false, 5079, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10891c, this, this, view));
            a.this.b();
        }
    };
    private View.OnClickListener w = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10895a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10896c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10895a, true, 5084, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10895a, true, 5084, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomAudioWindowManager.java", AnonymousClass4.class);
            f10896c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.wm.LinkInRoomAudioWindowManager$4", "android.view.View", NotifyType.VIBRATE, "", "void"), 363);
        }

        public void onClick(View view) {
            boolean z;
            int i;
            if (PatchProxy.isSupport(new Object[]{view}, this, f10895a, false, 5083, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10895a, false, 5083, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10896c, this, this, view));
            if (((Integer) e.a().f9041c).intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            m.a a2 = new m.a(a.this.f10882b).a(false);
            if (z) {
                i = C0906R.string.d_u;
            } else {
                i = C0906R.string.d_v;
            }
            a2.c(i).b(0, (int) C0906R.string.cqy, (DialogInterface.OnClickListener) new e(this, z)).b(1, (int) C0906R.string.cpz, f.f10908b).c();
        }
    };

    public final void a(long j2, int i2) {
    }

    public final void a(long j2, int i2, boolean z) {
    }

    public final boolean c(int i2) {
        return i2 == 3;
    }

    public final void a(String[] strArr, boolean[] zArr) {
        if (PatchProxy.isSupport(new Object[]{strArr, zArr}, this, f10881a, false, 5058, new Class[]{String[].class, boolean[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, zArr}, this, f10881a, false, 5058, new Class[]{String[].class, boolean[].class}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            this.t.put(strArr[i2], Boolean.valueOf(zArr[i2]));
        }
        long a2 = (long) this.i.a(this.j.getOwner().getId());
        if (this.t.containsKey(String.valueOf(a2)) && this.r != null) {
            this.r.a(a2, this.t.get(String.valueOf(a2)).booleanValue());
        }
        this.h.a(this.t);
    }

    public final void a(List<j> list) {
        List<j> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f10881a, false, 5060, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f10881a, false, 5060, new Class[]{List.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList(8);
        if (list.size() > 0 && list.size() <= 9) {
            this.r.b(list2.get(0).f11052e.getId(), list2.get(0).m != 0);
            for (int i2 = 0; i2 < 8; i2++) {
                j jVar = new j();
                jVar.f11051d = -1;
                arrayList.add(jVar);
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (list2.get(i3).l > 0 && list2.get(i3).l < 9) {
                    arrayList.set(list2.get(i3).l - 1, list2.get(i3));
                }
            }
            LinkInRoomAudioGuestAdapter linkInRoomAudioGuestAdapter = this.h;
            if (PatchProxy.isSupport(new Object[]{arrayList}, linkInRoomAudioGuestAdapter, LinkInRoomAudioGuestAdapter.f10287a, false, 4454, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{arrayList}, linkInRoomAudioGuestAdapter, LinkInRoomAudioGuestAdapter.f10287a, false, 4454, new Class[]{List.class}, Void.TYPE);
            } else {
                linkInRoomAudioGuestAdapter.f10288b = arrayList;
                linkInRoomAudioGuestAdapter.notifyDataSetChanged();
            }
            this.h.f10289c = list2;
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f10881a, false, 5067, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f10881a, false, 5067, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.l) {
            this.q.a(str);
        }
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f10881a, false, 5068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10881a, false, 5068, new Class[0], Void.TYPE);
            return;
        }
        int d2 = this.i.d();
        List<j> list = this.i.j;
        if (this.k) {
            if (d2 > 0) {
                str = ac.a((int) C0906R.string.da3, Integer.valueOf(d2));
                com.bytedance.android.livesdk.chatroom.f.b.b(this.f10885e, list.get(d2 - 1).f11052e.getAvatarThumb());
            } else {
                str = ac.a((int) C0906R.string.da2);
                com.bytedance.android.livesdk.chatroom.f.b.a(this.f10885e, 2130841098);
            }
            this.f10886f.setText(str);
            this.f10884d.setOnClickListener(this.u);
            this.f10884d.setVisibility(0);
        } else if (1 == ((Integer) e.a().f9041c).intValue()) {
            this.f10886f.setText(C0906R.string.d_i);
            com.bytedance.android.livesdk.chatroom.f.b.a(this.f10885e, 2130841119);
            this.f10884d.setOnClickListener(this.w);
            this.f10884d.setVisibility(0);
        } else if (2 == ((Integer) e.a().f9041c).intValue()) {
            this.f10886f.setText(C0906R.string.d_r);
            com.bytedance.android.livesdk.chatroom.f.b.a(this.f10885e, 2130841120);
            this.f10884d.setOnClickListener(this.w);
            this.f10884d.setVisibility(0);
        } else {
            this.f10886f.setText(C0906R.string.d4f);
            com.bytedance.android.livesdk.chatroom.f.b.a(this.f10885e, 2130841098);
            this.f10884d.setOnClickListener(this.v);
            this.f10884d.setVisibility(0);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10881a, false, 5069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10881a, false, 5069, new Class[0], Void.TYPE);
            return;
        }
        if (!this.k) {
            if (!TTLiveSDKContext.getHostService().k().c()) {
                TTLiveSDKContext.getHostService().k().a(this.f10882b, i.a().a(ac.a((int) C0906R.string.d5n)).c("interact").a(0).a()).subscribe((Observer<? super T>) new com.bytedance.android.livesdk.user.g<Object>());
                return;
            } else if (TTLiveSDKContext.getHostService().k().a(h.INTERACT)) {
                return;
            }
        }
        com.bytedance.android.livesdk.utils.aa.a(this.j, "click_connection_banner", "guest_connection", false);
        if (!this.k && ((Integer) e.a().f9041c).intValue() == 0) {
            new m.a(this.f10882b).c((int) C0906R.string.d_t).b(0, (int) C0906R.string.cqy, (DialogInterface.OnClickListener) new c(this)).b(1, (int) C0906R.string.cpz, d.f10903b).c();
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10881a, false, 5059, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10881a, false, 5059, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a();
    }

    public final void b(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10881a, false, 5061, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10881a, false, 5061, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a();
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10881a, false, 5071, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10881a, false, 5071, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!this.k) {
            b();
        }
    }

    public final void c(List<k> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10881a, false, 5063, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10881a, false, 5063, new Class[]{List.class}, Void.TYPE);
        } else if (this.l) {
            if (this.s != null && this.s.isShowing()) {
                this.s.dismiss();
            }
            this.s = new g(this.f10882b, list);
            this.s.show();
        }
    }

    public final void a(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f10881a, false, 5072, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f10881a, false, 5072, new Class[]{j.class}, Void.TYPE);
        } else if (this.k) {
            if (this.o == null) {
                this.o = new com.bytedance.android.livesdk.chatroom.interact.c.a(this.j, true, this.i);
            }
            this.p = new bv(this.f10882b, this.m, jVar, this.o);
            this.p.show();
        } else {
            if (this.m != null) {
                this.m.lambda$put$1$DataCenter("cmd_send_gift", jVar.f11052e);
            }
        }
    }

    public final void a(com.bytedance.b.a.a.f.c cVar) {
        com.bytedance.b.a.a.f.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f10881a, false, 5057, new Class[]{com.bytedance.b.a.a.f.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f10881a, false, 5057, new Class[]{com.bytedance.b.a.a.f.c.class}, Void.TYPE);
        } else if (cVar2 == null || cVar2.f19214d == null || cVar2.f19214d.isEmpty()) {
        } else {
            List<com.bytedance.b.a.a.f.b> list = cVar2.f19214d;
            int size = list.size();
            String[] strArr = new String[size];
            boolean[] zArr = new boolean[size];
            for (int i2 = 0; i2 < size; i2++) {
                com.bytedance.b.a.a.f.b bVar = list.get(i2);
                strArr[i2] = String.valueOf(bVar.f19206b);
                zArr[i2] = bVar.i;
            }
            a(strArr, zArr);
        }
    }

    public final void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f10881a, false, 5062, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f10881a, false, 5062, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.h.a(j4, j5);
    }

    public final void a(int i2, boolean z) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f10881a, false, 5073, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f10881a, false, 5073, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.g.findViewHolderForAdapterPosition(i3) instanceof LinkInRoomAudioGuestAdapter.AudioGuestViewHolder) {
            LinkInRoomAudioGuestAdapter.AudioGuestViewHolder audioGuestViewHolder = (LinkInRoomAudioGuestAdapter.AudioGuestViewHolder) this.g.findViewHolderForAdapterPosition(i3);
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, audioGuestViewHolder, LinkInRoomAudioGuestAdapter.AudioGuestViewHolder.f10291a, false, 4458, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                LinkInRoomAudioGuestAdapter.AudioGuestViewHolder audioGuestViewHolder2 = audioGuestViewHolder;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, audioGuestViewHolder2, LinkInRoomAudioGuestAdapter.AudioGuestViewHolder.f10291a, false, 4458, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (!z || audioGuestViewHolder.i.m != 0) {
                audioGuestViewHolder.h.setVisibility(4);
                if (audioGuestViewHolder.h.isAnimating()) {
                    audioGuestViewHolder.h.cancelAnimation();
                }
            } else {
                audioGuestViewHolder.h.setVisibility(0);
                audioGuestViewHolder.h.playAnimation();
            }
        }
    }

    public a(Room room, boolean z, FrameLayout frameLayout, com.bytedance.android.livesdk.chatroom.interact.d.a aVar, Context context, ab abVar, DataCenter dataCenter) {
        this.f10882b = context;
        this.j = room;
        this.k = z;
        this.f10883c = frameLayout;
        this.i = aVar;
        this.q = new d(this);
        this.r = abVar;
        this.m = dataCenter;
    }
}
