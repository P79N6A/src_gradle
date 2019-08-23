package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.adapter.PKUserAdapter;
import com.bytedance.android.livesdk.chatroom.interact.c.ay;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKUserListContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.chatroom.interact.model.d;
import com.bytedance.android.livesdk.j.c.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.List;

public class InteractPKUserListFragment extends InteractDialogPKUserListContract.View implements PKUserAdapter.a {
    public static ChangeQuickRedirect j;
    private RecyclerView k;
    private PKUserAdapter l;
    private int m;
    private DataCenter n;
    private boolean o;

    public final float d() {
        return 432.0f;
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, j, false, 4586, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, j, false, 4586, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f8193f) {
            l.a(getContext(), th2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f10827b.a(InteractSettingsFragment.a(this.f10827b));
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4583, new Class[0], String.class)) {
            return getString(C0906R.string.d72);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, j, false, 4583, new Class[0], String.class);
    }

    public final View e() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4584, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4584, new Class[0], View.class);
        } else if (this.m == 1) {
            return this.f10827b.b();
        } else {
            return null;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4582, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        ((InteractDialogPKUserListContract.a) this.h).c();
    }

    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4585, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4585, new Class[0], View.class);
        } else if (!a.a() && !a.f() && !this.o) {
            return super.f();
        } else {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.amp, (ViewGroup) getView(), false);
            inflate.setOnClickListener(new l(this));
            return inflate;
        }
    }

    public final void b(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, j, false, 4588, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, j, false, 4588, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f8193f) {
            l.a(getContext(), th2);
        }
    }

    public final void a(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, j, false, 4587, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, j, false, 4587, new Class[]{d.class}, Void.TYPE);
        } else if (this.f8193f) {
            if (dVar2 == null || (Lists.isEmpty(dVar2.f10978a) && Lists.isEmpty(dVar2.f10979b))) {
                this.k.setVisibility(8);
                return;
            }
            PKUserAdapter pKUserAdapter = this.l;
            List<Room> list = dVar2.f10978a;
            List<Room> list2 = dVar2.f10979b;
            if (PatchProxy.isSupport(new Object[]{list, list2}, pKUserAdapter, PKUserAdapter.f10322a, false, 4479, new Class[]{List.class, List.class}, Void.TYPE)) {
                PKUserAdapter pKUserAdapter2 = pKUserAdapter;
                PatchProxy.accessDispatch(new Object[]{list, list2}, pKUserAdapter2, PKUserAdapter.f10322a, false, 4479, new Class[]{List.class, List.class}, Void.TYPE);
            } else {
                pKUserAdapter.f10323b = list;
                pKUserAdapter.f10324c = list2;
                if (!Lists.isEmpty(pKUserAdapter.f10323b)) {
                    pKUserAdapter.f10325d = pKUserAdapter.f10323b.size();
                }
                if (!Lists.isEmpty(pKUserAdapter.f10324c)) {
                    pKUserAdapter.f10326e = pKUserAdapter.f10324c.size();
                }
            }
            this.l.notifyDataSetChanged();
        }
    }

    public final void a(Room room) {
        String string;
        if (PatchProxy.isSupport(new Object[]{room}, this, j, false, 4589, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room}, this, j, false, 4589, new Class[]{Room.class}, Void.TYPE);
        } else if (this.f8193f) {
            this.i.p = 0;
            b.C0088b bVar = this.f10827b;
            b.C0088b bVar2 = this.f10827b;
            if (this.m == 1) {
                string = (String) com.bytedance.android.livesdk.w.b.aI.a();
            } else {
                string = getString(C0906R.string.d01);
            }
            bVar.a(InteractPKInviteFragment.a(bVar2, 0, string, room.getOwner(), this.i.f9030d, room.getId(), this.n));
        }
    }

    public final void a(Room room, int i) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{room, Integer.valueOf(i)}, this, j, false, 4590, new Class[]{Room.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room, Integer.valueOf(i)}, this, j, false, 4590, new Class[]{Room.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f10827b.c() != null) {
            TTLiveSDKContext.getHostService().b();
            if (this.m == 2) {
                ((InteractDialogPKUserListContract.a) this.h).a(room, this.f10827b.c().getId());
            } else {
                Room room2 = room;
                ((InteractDialogPKUserListContract.a) this.h).a(room2, this.f10827b.c().getId(), (String) com.bytedance.android.livesdk.w.b.aI.a(), ((Integer) com.bytedance.android.livesdk.w.b.aC.a()).intValue());
            }
            HashMap hashMap = new HashMap();
            if (i == 4) {
                str = "other_anchor";
            } else {
                str = "recently_invited_anchor";
            }
            hashMap.put("list_type", str);
            com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
            Object[] objArr = new Object[3];
            objArr[0] = new j().b("live").f("other").a("live_detail");
            g gVar = new g();
            if (this.m == 2) {
                str2 = "anchor";
            } else {
                str2 = PushConstants.URI_PACKAGE_NAME;
            }
            objArr[1] = gVar.a(str2).c("manual").a(this.f10827b.c().getOwner().getId()).b(room.getOwner().getId()).b((String) com.bytedance.android.livesdk.w.b.aI.a()).a(((Integer) com.bytedance.android.livesdk.w.b.aC.a()).intValue());
            objArr[2] = Room.class;
            a2.a("connection_invite", hashMap, objArr);
        }
    }

    public static InteractPKUserListFragment a(b.C0088b bVar, int i, DataCenter dataCenter) {
        b.C0088b bVar2 = bVar;
        DataCenter dataCenter2 = dataCenter;
        if (!PatchProxy.isSupport(new Object[]{bVar2, Integer.valueOf(i), dataCenter2}, null, j, true, 4579, new Class[]{b.C0088b.class, Integer.TYPE, DataCenter.class}, InteractPKUserListFragment.class)) {
            return a(bVar2, i, dataCenter2, false);
        }
        return (InteractPKUserListFragment) PatchProxy.accessDispatch(new Object[]{bVar2, Integer.valueOf(i), dataCenter2}, null, j, true, 4579, new Class[]{b.C0088b.class, Integer.TYPE, DataCenter.class}, InteractPKUserListFragment.class);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4581, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4581, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ai7, viewGroup2, false);
        this.k = (RecyclerView) inflate.findViewById(C0906R.id.ccc);
        this.k.setLayoutManager(new LinearLayoutManager(getContext()));
        this.l = new PKUserAdapter(getContext(), this);
        this.k.setAdapter(this.l);
        return inflate;
    }

    public static InteractPKUserListFragment a(b.C0088b bVar, int i, DataCenter dataCenter, boolean z) {
        b.C0088b bVar2 = bVar;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{bVar2, Integer.valueOf(i), dataCenter2, Byte.valueOf(z ? (byte) 1 : 0)}, null, j, true, 4580, new Class[]{b.C0088b.class, Integer.TYPE, DataCenter.class, Boolean.TYPE}, InteractPKUserListFragment.class)) {
            return (InteractPKUserListFragment) PatchProxy.accessDispatch(new Object[]{bVar2, Integer.valueOf(i), dataCenter2, Byte.valueOf(z)}, null, j, true, 4580, new Class[]{b.C0088b.class, Integer.TYPE, DataCenter.class, Boolean.TYPE}, InteractPKUserListFragment.class);
        }
        InteractPKUserListFragment interactPKUserListFragment = new InteractPKUserListFragment();
        interactPKUserListFragment.h = new ay(interactPKUserListFragment);
        interactPKUserListFragment.f10827b = bVar2;
        interactPKUserListFragment.m = i;
        interactPKUserListFragment.n = dataCenter2;
        interactPKUserListFragment.o = z;
        return interactPKUserListFragment;
    }
}
