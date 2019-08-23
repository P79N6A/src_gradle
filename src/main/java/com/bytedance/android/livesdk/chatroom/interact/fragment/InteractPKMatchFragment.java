package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.a.h;
import com.bytedance.android.livesdk.chatroom.interact.c.af;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.HashMap;
import org.aspectj.lang.a;

public class InteractPKMatchFragment extends InteractDialogPKMatchContract.View implements View.OnClickListener {
    public static ChangeQuickRedirect j;
    private static final /* synthetic */ a.C0900a w;
    private TextView k;
    private VHeadView l;
    private TextView m;
    private TextView n;
    private LinearLayout o;
    private FrameLayout p;
    private FrameLayout q;
    private d r;
    private int s;
    private LinkAutoMatchModel t;
    private DataCenter u;
    private h.a v = new h.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10929a;

        public final boolean a() {
            return false;
        }

        public final boolean c() {
            return false;
        }

        public final boolean b() {
            if (PatchProxy.isSupport(new Object[0], this, f10929a, false, 4532, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10929a, false, 4532, new Class[0], Boolean.TYPE)).booleanValue();
            }
            InteractPKMatchFragment.this.b();
            return false;
        }

        public final boolean a(LinkAutoMatchModel linkAutoMatchModel) {
            LinkAutoMatchModel linkAutoMatchModel2 = linkAutoMatchModel;
            if (PatchProxy.isSupport(new Object[]{linkAutoMatchModel2}, this, f10929a, false, 4530, new Class[]{LinkAutoMatchModel.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{linkAutoMatchModel2}, this, f10929a, false, 4530, new Class[]{LinkAutoMatchModel.class}, Boolean.TYPE)).booleanValue();
            }
            InteractPKMatchFragment.this.a(linkAutoMatchModel2);
            return false;
        }

        public final boolean b(LinkAutoMatchModel linkAutoMatchModel) {
            LinkAutoMatchModel linkAutoMatchModel2 = linkAutoMatchModel;
            if (PatchProxy.isSupport(new Object[]{linkAutoMatchModel2}, this, f10929a, false, 4531, new Class[]{LinkAutoMatchModel.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{linkAutoMatchModel2}, this, f10929a, false, 4531, new Class[]{LinkAutoMatchModel.class}, Boolean.TYPE)).booleanValue();
            }
            InteractPKMatchFragment.this.b(linkAutoMatchModel2);
            return false;
        }
    };

    public final float d() {
        return 216.0f;
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, j, false, 4516, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, j, false, 4516, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f8193f) {
            l.a(getContext(), th);
            ((InteractDialogPKMatchContract.a) this.h).a(this.f10827b.c().getId());
        }
    }

    public final void a(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, this, j, false, 4517, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room}, this, j, false, 4517, new Class[]{Room.class}, Void.TYPE);
        } else if (this.f8193f) {
            this.i.p = 1;
            this.f10827b.a(InteractPKMatchInviteFragment.a(this.f10827b, 0, (String) b.aI.a(), room.getOwner(), this.i.f9030d, room.getId(), this.u));
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, j, false, 4518, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, j, false, 4518, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ai.a(str);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            this.n.setText(C0906R.string.d6k);
            this.n.setTextColor(getContext().getResources().getColor(C0906R.color.agj));
            return;
        }
        b((int) C0906R.string.d6k);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        com.bytedance.android.livesdk.chatroom.interact.a.a.a().b();
        this.f10827b.a();
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4523, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, j, false, 4523, new Class[0], String.class);
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            return getString(C0906R.string.d6i);
        } else {
            return getString(C0906R.string.d6j);
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, j, true, 4527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, j, true, 4527, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("InteractPKMatchFragment.java", InteractPKMatchFragment.class);
        w = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKMatchFragment", "android.view.View", NotifyType.VIBRATE, "", "void"), 204);
    }

    public final View e() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4524, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4524, new Class[0], View.class);
        } else if (this.s != 1) {
            return null;
        } else {
            AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
            autoRTLImageView.setLayoutParams(new RelativeLayout.LayoutParams(ac.a(32.0f), ac.a(32.0f)));
            autoRTLImageView.setImageDrawable(ac.c(2130841118));
            autoRTLImageView.setOnClickListener(new c(this));
            return autoRTLImageView;
        }
    }

    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4525, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4525, new Class[0], View.class);
        } else if (this.s == 2) {
            return null;
        } else {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.amo, (ViewGroup) getView(), false);
            inflate.setOnClickListener(new d(this));
            return inflate;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        if (com.bytedance.android.live.uikit.a.a.f()) {
            this.n.setText(C0906R.string.d6k);
            this.n.setTextColor(getContext().getResources().getColor(C0906R.color.agy));
        } else {
            b((int) C0906R.string.d6k);
        }
        ((InteractDialogPKMatchContract.a) this.h).d();
        com.bytedance.android.livesdk.chatroom.interact.a.a.a().b();
        this.k.setText("");
        this.m.setText("");
        this.f10827b.a(InteractPKUserListFragment.a(this.f10827b, 1, this.u));
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4514, new Class[0], Void.TYPE);
            return;
        }
        if (((InteractDialogPKMatchContract.a) this.h).e()) {
            ((InteractDialogPKMatchContract.a) this.h).d();
            com.bytedance.android.livesdk.chatroom.interact.a.a.a().a(this.f10827b.c().getId());
        }
        com.bytedance.android.livesdk.chatroom.interact.a.a.a().a(this.v);
        super.onStop();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4519, new Class[0], Void.TYPE);
        } else if (b_()) {
            if (!((Boolean) b.aG.a()).booleanValue()) {
                this.k.setText(C0906R.string.d64);
                this.p.setVisibility(8);
                this.q.setVisibility(0);
                this.n.setText(C0906R.string.d6k);
                if (com.bytedance.android.live.uikit.a.a.f()) {
                    this.n.setTextColor(getContext().getResources().getColor(C0906R.color.agy));
                }
            } else if (com.bytedance.android.live.uikit.a.a.a()) {
                ((InteractDialogPKMatchContract.a) this.h).a(this.f10827b.c().getId());
            } else {
                this.m.setVisibility(0);
                this.o.setVisibility(8);
                ((InteractDialogPKMatchContract.a) this.h).a(3);
            }
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4513, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4513, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        com.bytedance.android.livesdk.chatroom.interact.a.a.a().a(this.v, 0);
        switch (this.s) {
            case 1:
                ((InteractDialogPKMatchContract.a) this.h).a(this.f10827b.c().getId());
                return;
            case 2:
                if (b_()) {
                    if (this.t != null) {
                        com.bytedance.android.livesdk.chatroom.f.b.b(this.l, this.t.getDefaultAvatar(), this.l.getWidth(), this.l.getHeight(), 2130841141);
                    }
                    b();
                    return;
                }
                return;
            case 3:
                if (this.t != null) {
                    if (this.t.getRivalRoom() != null) {
                        b(this.t);
                        break;
                    } else {
                        a(this.t);
                        return;
                    }
                } else {
                    b();
                    return;
                }
        }
    }

    private void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 4526, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 4526, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.a()) {
            int i2 = C0906R.color.af0;
            if (i == C0906R.string.d6k) {
                i2 = C0906R.color.ag9;
            }
            this.n.setTextColor(getResources().getColor(i2));
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            this.n.setTextColor(getResources().getColor(C0906R.color.agj));
        }
        this.n.setText(i);
    }

    public final void b(LinkAutoMatchModel linkAutoMatchModel) {
        if (PatchProxy.isSupport(new Object[]{linkAutoMatchModel}, this, j, false, 4521, new Class[]{LinkAutoMatchModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkAutoMatchModel}, this, j, false, 4521, new Class[]{LinkAutoMatchModel.class}, Void.TYPE);
        } else if (b_()) {
            ((InteractDialogPKMatchContract.a) this.h).a(linkAutoMatchModel.getRivalRoom(), this.f10827b.c().getId(), (String) b.aI.a(), c.f69428f);
            HashMap hashMap = new HashMap();
            hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
            hashMap.put("theme", b.aI.a());
            hashMap.put("pk_time", String.valueOf(b.aC.a()));
            hashMap.put("event_page", "live_detail");
            hashMap.put("room_id", String.valueOf(this.f10827b.c().getId()));
            hashMap.put("inviter_id", String.valueOf(this.f10827b.c().getOwner().getId()));
            hashMap.put("invitee_id", String.valueOf(linkAutoMatchModel.getRivalRoom().getOwner().getId()));
            hashMap.put("match_type", "random");
            com.bytedance.android.livesdk.j.a.a().a("connection_invite", hashMap, new j().b("live").f("other"));
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 4515, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 4515, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(w, this, this, view));
        if (view.getId() == C0906R.id.ng) {
            if (com.bytedance.android.livesdk.chatroom.interact.a.a.a().c()) {
                b((int) C0906R.string.d6k);
                ((InteractDialogPKMatchContract.a) this.h).c();
            } else if (((InteractDialogPKMatchContract.a) this.h).e()) {
                b((int) C0906R.string.d6k);
                ((InteractDialogPKMatchContract.a) this.h).d();
                com.bytedance.android.livesdk.chatroom.interact.a.a.a().b();
                this.k.setText("");
                this.m.setText("");
            } else {
                if (com.bytedance.android.live.uikit.a.a.f()) {
                    this.n.setText(C0906R.string.cpv);
                    if (com.bytedance.android.live.uikit.a.a.f()) {
                        this.n.setTextColor(getContext().getResources().getColor(C0906R.color.agh));
                    }
                } else {
                    b((int) C0906R.string.cpv);
                }
                this.m.setVisibility(8);
                this.o.setVisibility(0);
                ((InteractDialogPKMatchContract.a) this.h).a(this.f10827b.c().getId());
            }
        } else if (view.getId() == C0906R.id.nh) {
            ((InteractDialogPKMatchContract.a) this.h).a(this.f10827b.c().getId());
        } else {
            if (view.getId() == C0906R.id.nj) {
                b.aG.a(Boolean.TRUE);
                ((InteractDialogPKMatchContract.a) this.h).a(this.f10827b.c().getId());
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 4522, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 4522, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (b_()) {
            if (this.m.getVisibility() == 0) {
                this.m.setText(String.valueOf(i));
                this.k.setText(getString(C0906R.string.d65, Integer.valueOf(i)));
            }
            if (i == 0) {
                this.m.setVisibility(8);
                this.o.setVisibility(0);
                ((InteractDialogPKMatchContract.a) this.h).a(this.f10827b.c().getId());
            }
        }
    }

    public final void a(LinkAutoMatchModel linkAutoMatchModel) {
        if (PatchProxy.isSupport(new Object[]{linkAutoMatchModel}, this, j, false, 4520, new Class[]{LinkAutoMatchModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkAutoMatchModel}, this, j, false, 4520, new Class[]{LinkAutoMatchModel.class}, Void.TYPE);
        } else if (b_()) {
            this.p.setVisibility(0);
            this.q.setVisibility(8);
            if (!com.bytedance.android.live.uikit.a.a.a()) {
                this.k.setText(linkAutoMatchModel.getDefaultContent());
            }
            com.bytedance.android.livesdk.chatroom.f.b.b(this.l, linkAutoMatchModel.getDefaultAvatar(), this.l.getWidth(), this.l.getHeight(), 2130841141);
        }
    }

    public static InteractPKMatchFragment a(b.C0088b bVar, DataCenter dataCenter) {
        b.C0088b bVar2 = bVar;
        DataCenter dataCenter2 = dataCenter;
        if (!PatchProxy.isSupport(new Object[]{bVar2, dataCenter2}, null, j, true, 4508, new Class[]{b.C0088b.class, DataCenter.class}, InteractPKMatchFragment.class)) {
            return a(bVar2, 1, dataCenter2);
        }
        return (InteractPKMatchFragment) PatchProxy.accessDispatch(new Object[]{bVar2, dataCenter2}, null, j, true, 4508, new Class[]{b.C0088b.class, DataCenter.class}, InteractPKMatchFragment.class);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, j, false, 4512, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, j, false, 4512, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.r = TTLiveSDKContext.getHostService().b().b();
        if (com.bytedance.android.live.uikit.a.a.a()) {
            com.bytedance.android.livesdk.w.b.aG.a(Boolean.TRUE);
        }
        this.k = (TextView) view.findViewById(C0906R.id.deg);
        VHeadView vHeadView = (VHeadView) view.findViewById(C0906R.id.ang);
        this.l = (VHeadView) view.findViewById(C0906R.id.anf);
        this.p = (FrameLayout) view.findViewById(C0906R.id.b9b);
        this.m = (TextView) view.findViewById(C0906R.id.dab);
        this.n = (TextView) view.findViewById(C0906R.id.ng);
        this.o = (LinearLayout) view.findViewById(C0906R.id.b_b);
        this.n.setOnClickListener(this);
        this.m.setVisibility(8);
        this.q = (FrameLayout) view.findViewById(C0906R.id.b9c);
        ((TextView) view.findViewById(C0906R.id.nh)).setOnClickListener(this);
        ((TextView) view.findViewById(C0906R.id.nj)).setOnClickListener(this);
        this.q.setVisibility(8);
        ((TextView) view.findViewById(C0906R.id.dfd)).setText(this.f10827b.c().getOwner().getNickName());
        com.bytedance.android.livesdk.chatroom.f.b.b(vHeadView, this.f10827b.c().getOwner().getAvatarMedium(), vHeadView.getWidth(), vHeadView.getHeight(), 2130841141);
    }

    private static InteractPKMatchFragment a(b.C0088b bVar, int i, DataCenter dataCenter) {
        b.C0088b bVar2 = bVar;
        DataCenter dataCenter2 = dataCenter;
        if (!PatchProxy.isSupport(new Object[]{bVar2, 1, dataCenter2}, null, j, true, 4509, new Class[]{b.C0088b.class, Integer.TYPE, DataCenter.class}, InteractPKMatchFragment.class)) {
            return a(bVar2, null, 1, dataCenter2);
        }
        return (InteractPKMatchFragment) PatchProxy.accessDispatch(new Object[]{bVar2, 1, dataCenter2}, null, j, true, 4509, new Class[]{b.C0088b.class, Integer.TYPE, DataCenter.class}, InteractPKMatchFragment.class);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4511, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ai2, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4511, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public static InteractPKMatchFragment a(b.C0088b bVar, LinkAutoMatchModel linkAutoMatchModel, int i, DataCenter dataCenter) {
        b.C0088b bVar2 = bVar;
        LinkAutoMatchModel linkAutoMatchModel2 = linkAutoMatchModel;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{bVar2, linkAutoMatchModel2, Integer.valueOf(i), dataCenter2}, null, j, true, 4510, new Class[]{b.C0088b.class, LinkAutoMatchModel.class, Integer.TYPE, DataCenter.class}, InteractPKMatchFragment.class)) {
            return (InteractPKMatchFragment) PatchProxy.accessDispatch(new Object[]{bVar2, linkAutoMatchModel2, Integer.valueOf(i), dataCenter2}, null, j, true, 4510, new Class[]{b.C0088b.class, LinkAutoMatchModel.class, Integer.TYPE, DataCenter.class}, InteractPKMatchFragment.class);
        }
        InteractPKMatchFragment interactPKMatchFragment = new InteractPKMatchFragment();
        interactPKMatchFragment.h = new af(interactPKMatchFragment);
        interactPKMatchFragment.f10827b = bVar2;
        interactPKMatchFragment.t = linkAutoMatchModel2;
        interactPKMatchFragment.s = i;
        interactPKMatchFragment.u = dataCenter2;
        return interactPKMatchFragment;
    }
}
