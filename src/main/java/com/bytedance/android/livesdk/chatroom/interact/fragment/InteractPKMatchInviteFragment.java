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
import com.bytedance.android.livesdk.chatroom.interact.c.x;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchInviteContract;
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

public class InteractPKMatchInviteFragment extends InteractDialogPKMatchInviteContract.View implements View.OnClickListener {
    public static ChangeQuickRedirect j;
    private static final /* synthetic */ a.C0900a s;
    private User k;
    private User l;
    private int m;
    private long n;
    private long o;
    private String p;
    private long q;
    private TextView r;

    public final float d() {
        return 216.0f;
    }

    public final String c() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        b.aF.a(Boolean.FALSE);
        this.f10827b.a(InteractSettingsFragment.a(this.f10827b));
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4538, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f10827b.setCancelable(true);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4537, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        ((InteractDialogPKMatchInviteContract.a) this.h).c();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, j, true, 4540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, j, true, 4540, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("InteractPKMatchInviteFragment.java", InteractPKMatchInviteFragment.class);
        s = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKMatchInviteFragment", "android.view.View", NotifyType.VIBRATE, "", "void"), 171);
    }

    public final View f() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4536, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4536, new Class[0], View.class);
        } else if (this.m == 0) {
            return null;
        } else {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.amp, (ViewGroup) getView(), false);
            View findViewById = inflate.findViewById(C0906R.id.b53);
            if (!((Boolean) b.aF.a()).booleanValue()) {
                i = 8;
            }
            findViewById.setVisibility(i);
            inflate.setOnClickListener(new e(this));
            return inflate;
        }
    }

    public void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, j, false, 4539, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, j, false, 4539, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(s, this, this, view2));
        if (view.getId() == C0906R.id.ng) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_page", "live_detail");
            hashMap.put("room_id", String.valueOf(this.f10827b.c().getId()));
            hashMap.put("inviter_id", String.valueOf(this.l.getId()));
            hashMap.put("invitee_id", String.valueOf(this.k.getId()));
            hashMap.put("theme", this.i.j);
            hashMap.put("pk_time", String.valueOf(this.i.i));
            com.bytedance.android.livesdk.j.a.a().a("random_match_cancel", hashMap, new j().b("live").f("other"));
            if (this.m == 1) {
                ((InteractDialogPKMatchInviteContract.a) this.h).a(2, this.n, this.o, this.l.getId());
                this.i.c();
            } else {
                ((InteractDialogPKMatchInviteContract.a) this.h).a(this.n, this.o, this.k.getId(), this.q);
                this.i.f9032f = 0;
            }
            this.f10827b.dismiss();
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 4535, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 4535, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f8193f) {
            this.r.setText(n.a(getString(C0906R.string.d61), Integer.valueOf(i)));
            if (i == 0) {
                if (this.m == 1) {
                    ((InteractDialogPKMatchInviteContract.a) this.h).a(1, this.n, this.o, this.l.getId());
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_page", "live_detail");
                    hashMap.put("room_id", String.valueOf(this.f10827b.c().getId()));
                    hashMap.put("inviter_id", String.valueOf(this.l.getId()));
                    hashMap.put("invitee_id", String.valueOf(this.k.getId()));
                    hashMap.put("match_type", "random");
                    hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
                    hashMap.put("theme", this.i.j);
                    hashMap.put("pk_time", String.valueOf(this.i.i));
                    hashMap.put("selection", "accept");
                    com.bytedance.android.livesdk.j.a.a().a("connection_invited", hashMap, new j().b("live").f("other"), Room.class);
                }
                this.f10827b.dismiss();
            }
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        int i = 3;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4534, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4534, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ai3, viewGroup2, false);
        this.r = (TextView) inflate.findViewById(C0906R.id.ng);
        VHeadView vHeadView = (VHeadView) inflate.findViewById(C0906R.id.ang);
        TextView textView = (TextView) inflate.findViewById(C0906R.id.dfd);
        VHeadView vHeadView2 = (VHeadView) inflate.findViewById(C0906R.id.anf);
        TextView textView2 = (TextView) inflate.findViewById(C0906R.id.dfc);
        this.r.setOnClickListener(this);
        if (!com.bytedance.android.live.uikit.a.a.f() || this.m != 1) {
            com.bytedance.android.livesdk.chatroom.f.b.b(vHeadView, this.l.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), 2130841141);
            textView.setText(this.l.getNickName());
        }
        if (!com.bytedance.android.live.uikit.a.a.f() || this.m != 0) {
            com.bytedance.android.livesdk.chatroom.f.b.b(vHeadView2, this.k.getAvatarThumb(), vHeadView2.getWidth(), vHeadView2.getHeight(), 2130841141);
            textView2.setText(this.k.getNickName());
        }
        this.f10827b.setCancelable(false);
        InteractDialogPKMatchInviteContract.a aVar = (InteractDialogPKMatchInviteContract.a) this.h;
        if (this.m == 0) {
            i = 5;
        }
        aVar.a(i);
        return inflate;
    }

    public static InteractPKMatchInviteFragment a(b.C0088b bVar, int i, String str, User user, long j2, long j3, DataCenter dataCenter) {
        b.C0088b bVar2 = bVar;
        int i2 = i;
        String str2 = str;
        User user2 = user;
        long j4 = j2;
        long j5 = j3;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{bVar2, Integer.valueOf(i), str2, user2, new Long(j4), new Long(j5), dataCenter2}, null, j, true, 4533, new Class[]{b.C0088b.class, Integer.TYPE, String.class, User.class, Long.TYPE, Long.TYPE, DataCenter.class}, InteractPKMatchInviteFragment.class)) {
            return (InteractPKMatchInviteFragment) PatchProxy.accessDispatch(new Object[]{bVar2, Integer.valueOf(i), str2, user2, new Long(j4), new Long(j5), dataCenter2}, null, j, true, 4533, new Class[]{b.C0088b.class, Integer.TYPE, String.class, User.class, Long.TYPE, Long.TYPE, DataCenter.class}, InteractPKMatchInviteFragment.class);
        }
        InteractPKMatchInviteFragment interactPKMatchInviteFragment = new InteractPKMatchInviteFragment();
        interactPKMatchInviteFragment.h = new x(interactPKMatchInviteFragment, dataCenter2);
        interactPKMatchInviteFragment.f10827b = bVar2;
        if (i2 == 0) {
            interactPKMatchInviteFragment.k = user2;
            interactPKMatchInviteFragment.l = bVar.c().getOwner();
        } else {
            interactPKMatchInviteFragment.l = user2;
            interactPKMatchInviteFragment.k = bVar.c().getOwner();
        }
        interactPKMatchInviteFragment.o = bVar.c().getId();
        interactPKMatchInviteFragment.n = j4;
        interactPKMatchInviteFragment.m = i2;
        if (TextUtils.isEmpty(str)) {
            interactPKMatchInviteFragment.p = ac.a((int) C0906R.string.d01);
        } else {
            interactPKMatchInviteFragment.p = str2;
        }
        interactPKMatchInviteFragment.q = j5;
        return interactPKMatchInviteFragment;
    }
}
