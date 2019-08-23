package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.n;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import org.aspectj.lang.a;

public class InteractPKInviteFragment extends InteractDialogPKInviteContract.View implements View.OnClickListener {
    public static ChangeQuickRedirect j;
    private static final /* synthetic */ a.C0900a w;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private User o;
    private User p;
    private int q;
    private long r;
    private long s;
    private String t;
    private long u;
    private TextView v;

    public final float d() {
        return 216.0f;
    }

    public final String c() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        b.aF.a(Boolean.FALSE);
        this.f10827b.a(InteractSettingsFragment.a(this.f10827b));
    }

    public final View e() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4502, new Class[0], View.class)) {
            return this.f10827b.b();
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4502, new Class[0], View.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4504, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f10827b.setCancelable(true);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4503, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4503, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        ((InteractDialogPKInviteContract.a) this.h).c();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, j, true, 4506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, j, true, 4506, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("InteractPKInviteFragment.java", InteractPKInviteFragment.class);
        w = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKInviteFragment", "android.view.View", NotifyType.VIBRATE, "", "void"), 225);
    }

    public final View f() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4501, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4501, new Class[0], View.class);
        } else if (this.q == 0) {
            return null;
        } else {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.amp, (ViewGroup) getView(), false);
            View findViewById = inflate.findViewById(C0906R.id.b53);
            if (!((Boolean) b.aF.a()).booleanValue()) {
                i = 8;
            }
            findViewById.setVisibility(i);
            inflate.setOnClickListener(new b(this));
            return inflate;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 4500, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, j, false, 4500, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z || com.bytedance.android.livesdkapi.a.a.f18616d) {
            this.f10827b.dismiss();
        } else {
            this.k.setVisibility(8);
            this.v.setVisibility(8);
            this.m.setVisibility(0);
            this.n.setVisibility(0);
        }
    }

    public void onClick(View view) {
        int i;
        String str;
        String str2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, j, false, 4505, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, j, false, 4505, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(w, this, this, view2));
        int id = view.getId();
        HashMap hashMap = new HashMap();
        hashMap.put("event_page", "live_detail");
        hashMap.put("room_id", String.valueOf(this.f10827b.c().getId()));
        hashMap.put("inviter_id", String.valueOf(this.p.getId()));
        hashMap.put("invitee_id", String.valueOf(this.o.getId()));
        if ((id == C0906R.id.ng || id == C0906R.id.nk) && this.i.p == 1) {
            HashMap hashMap2 = new HashMap(hashMap);
            hashMap2.put("theme", this.i.j);
            hashMap2.put("pk_time", String.valueOf(this.i.i));
            com.bytedance.android.livesdk.j.a.a().a("random_match_cancel", hashMap2, new j().b("live").f("other"));
        }
        if (id == C0906R.id.nk || id == C0906R.id.nf) {
            if (this.i.p == 1) {
                str = "random";
            } else {
                str = "manual";
            }
            hashMap.put("match_type", str);
            if (this.i.i == 0) {
                hashMap.put("connection_type", "anchor");
            } else {
                hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
                hashMap.put("theme", this.i.j);
                hashMap.put("pk_time", String.valueOf(this.i.i));
            }
            if (id == C0906R.id.nk) {
                str2 = "reject";
            } else {
                str2 = "accept";
            }
            hashMap.put("selection", str2);
            com.bytedance.android.livesdk.j.a.a().a("connection_invited", hashMap, new j().b("live").f("other"), Room.class);
        }
        if (id == C0906R.id.ng) {
            ((InteractDialogPKInviteContract.a) this.h).a(this.r, this.s, this.o.getId(), this.u);
            this.i.f9032f = 0;
            this.f10827b.dismiss();
        } else if (id == C0906R.id.nf || id == C0906R.id.nk) {
            InteractDialogPKInviteContract.a aVar = (InteractDialogPKInviteContract.a) this.h;
            if (id == C0906R.id.nk) {
                i = 2;
            } else {
                i = 1;
            }
            aVar.a(i, this.r, this.s, this.p);
            if (id == C0906R.id.nk) {
                this.i.c();
            }
            ((InteractDialogPKInviteContract.a) this.h).c();
        } else if (id == C0906R.id.np) {
            this.f10827b.dismiss();
        } else {
            if (id == C0906R.id.pa) {
                ((InteractDialogPKInviteContract.a) this.h).d();
            }
        }
    }

    public final void a(int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 4499, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 4499, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f8193f) {
            if (this.q == 0) {
                this.l.setText(n.a(getString(C0906R.string.d61), Integer.valueOf(i)));
            } else {
                this.k.setText(n.a(getString(C0906R.string.czj), Integer.valueOf(i)));
            }
            if (i == 0) {
                if (this.q == 1) {
                    ((InteractDialogPKInviteContract.a) this.h).a(5, this.r, this.s, this.p);
                    this.f10827b.setCancelable(false);
                } else if (this.q == 0) {
                    a(false);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_page", "live_detail");
                hashMap.put("room_id", String.valueOf(this.f10827b.c().getId()));
                hashMap.put("inviter_id", String.valueOf(this.p.getId()));
                hashMap.put("invitee_id", String.valueOf(this.o.getId()));
                if (this.i.p == 1) {
                    HashMap hashMap2 = new HashMap(hashMap);
                    hashMap2.put("theme", this.i.j);
                    hashMap2.put("pk_time", String.valueOf(this.i.i));
                    com.bytedance.android.livesdk.j.a.a().a("random_match_cancel", hashMap2, new j().b("live").f("other"));
                }
                if (this.i.p == 1) {
                    str = "random";
                } else {
                    str = "manual";
                }
                hashMap.put("match_type", str);
                if (this.i.i == 0) {
                    hashMap.put("connection_type", "anchor");
                } else {
                    hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
                    hashMap.put("theme", this.i.j);
                    hashMap.put("pk_time", String.valueOf(this.i.i));
                }
                hashMap.put("selection", "reject");
                com.bytedance.android.livesdk.j.a.a().a("connection_invited", hashMap, new j().b("live").f("other"), Room.class);
            }
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        int i;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4498, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4498, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ai1, viewGroup2, false);
        this.l = (TextView) inflate.findViewById(C0906R.id.ng);
        this.k = (TextView) inflate.findViewById(C0906R.id.nk);
        this.v = (TextView) inflate.findViewById(C0906R.id.nf);
        this.m = (TextView) inflate.findViewById(C0906R.id.pa);
        this.n = (TextView) inflate.findViewById(C0906R.id.np);
        VHeadView vHeadView = (VHeadView) inflate.findViewById(C0906R.id.ang);
        VHeadView vHeadView2 = (VHeadView) inflate.findViewById(C0906R.id.anf);
        this.l.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.v.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        com.bytedance.android.livesdk.chatroom.f.b.b(vHeadView, this.p.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), 2130841141);
        ((TextView) inflate.findViewById(C0906R.id.dfd)).setText(this.p.getNickName());
        com.bytedance.android.livesdk.chatroom.f.b.b(vHeadView2, this.o.getAvatarThumb(), vHeadView2.getWidth(), vHeadView2.getHeight(), 2130841141);
        ((TextView) inflate.findViewById(C0906R.id.dfc)).setText(this.o.getNickName());
        if (this.q == 0) {
            this.k.setVisibility(8);
            this.v.setVisibility(8);
        } else {
            this.l.setVisibility(8);
        }
        this.f10827b.setCancelable(false);
        InteractDialogPKInviteContract.a aVar = (InteractDialogPKInviteContract.a) this.h;
        if (this.q == 0) {
            i = 12;
        } else {
            i = 10;
        }
        aVar.a(i);
        return inflate;
    }

    public static InteractPKInviteFragment a(b.C0088b bVar, int i, String str, User user, long j2, long j3, DataCenter dataCenter) {
        b.C0088b bVar2 = bVar;
        int i2 = i;
        String str2 = str;
        User user2 = user;
        long j4 = j2;
        long j5 = j3;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{bVar2, Integer.valueOf(i), str2, user2, new Long(j4), new Long(j5), dataCenter2}, null, j, true, 4497, new Class[]{b.C0088b.class, Integer.TYPE, String.class, User.class, Long.TYPE, Long.TYPE, DataCenter.class}, InteractPKInviteFragment.class)) {
            return (InteractPKInviteFragment) PatchProxy.accessDispatch(new Object[]{bVar2, Integer.valueOf(i), str2, user2, new Long(j4), new Long(j5), dataCenter2}, null, j, true, 4497, new Class[]{b.C0088b.class, Integer.TYPE, String.class, User.class, Long.TYPE, Long.TYPE, DataCenter.class}, InteractPKInviteFragment.class);
        }
        InteractPKInviteFragment interactPKInviteFragment = new InteractPKInviteFragment();
        interactPKInviteFragment.h = new com.bytedance.android.livesdk.chatroom.interact.c.n(interactPKInviteFragment, dataCenter2);
        interactPKInviteFragment.f10827b = bVar2;
        if (TextUtils.isEmpty(str)) {
            interactPKInviteFragment.t = ac.e().getString(C0906R.string.d01);
        } else {
            interactPKInviteFragment.t = str2;
        }
        if (i2 == 0) {
            interactPKInviteFragment.o = user2;
            interactPKInviteFragment.p = bVar.c().getOwner();
        } else {
            interactPKInviteFragment.p = user2;
            interactPKInviteFragment.o = bVar.c().getOwner();
        }
        interactPKInviteFragment.s = bVar.c().getId();
        interactPKInviteFragment.r = j4;
        interactPKInviteFragment.q = i2;
        interactPKInviteFragment.u = j5;
        return interactPKInviteFragment;
    }
}
