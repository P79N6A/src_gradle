package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.presenter.af;
import com.bytedance.android.livesdk.chatroom.presenter.as;
import com.bytedance.android.livesdk.chatroom.presenter.at;
import com.bytedance.android.livesdk.user.e;
import com.bytedance.android.livesdk.user.f;
import com.bytedance.android.livesdk.user.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dc implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12058a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12059b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12060c;

    dc(LiveProfileDetailFragment liveProfileDetailFragment, String str) {
        this.f12059b = liveProfileDetailFragment;
        this.f12060c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        k.a aVar;
        k.a aVar2;
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12058a, false, 6128, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12058a, false, 6128, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LiveProfileDetailFragment liveProfileDetailFragment = this.f12059b;
        String str = this.f12060c;
        dialogInterface.dismiss();
        if (liveProfileDetailFragment.r.getFollowInfo() != null) {
            af afVar = liveProfileDetailFragment.y;
            Activity activity = liveProfileDetailFragment.h;
            int i2 = (int) liveProfileDetailFragment.r.getFollowInfo().f7764d;
            long j = liveProfileDetailFragment.u;
            long id = liveProfileDetailFragment.v.getId();
            long j2 = id;
            if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i2), new Long(j), str, new Long(id)}, afVar, af.f11207a, false, 5229, new Class[]{Activity.class, Integer.TYPE, Long.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i2), new Long(j), str, new Long(j2)}, afVar, af.f11207a, false, 5229, new Class[]{Activity.class, Integer.TYPE, Long.TYPE, String.class, Long.TYPE}, Void.TYPE);
            } else {
                long j3 = j2;
                e k = TTLiveSDKContext.getHostService().k();
                k.b c2 = f.c();
                if (PatchProxy.isSupport(new Object[]{activity}, c2, k.a.f17461c, false, 13541, new Class[]{Activity.class}, k.a.class)) {
                    aVar = (k.a) PatchProxy.accessDispatch(new Object[]{activity}, c2, k.a.f17461c, false, 13541, new Class[]{Activity.class}, k.a.class);
                } else {
                    c2.f17464f = activity;
                    aVar = c2.a();
                }
                k.b bVar = (k.b) ((k.b) ((k.b) ((k.b) aVar).a(j)).a(i2)).a(str);
                if (PatchProxy.isSupport(new Object[]{new Long(j3)}, bVar, k.a.f17461c, false, 13542, new Class[]{Long.TYPE}, k.a.class)) {
                    aVar2 = (k.a) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, bVar, k.a.f17461c, false, 13542, new Class[]{Long.TYPE}, k.a.class);
                } else {
                    bVar.g = j3;
                    aVar2 = bVar.a();
                }
                k.a(((k.b) aVar2).c()).subscribe(new as(afVar), new at(afVar));
            }
            liveProfileDetailFragment.w.a(false, liveProfileDetailFragment.u, liveProfileDetailFragment.A, liveProfileDetailFragment.t, liveProfileDetailFragment.s, liveProfileDetailFragment.B, LinkCrossRoomDataHolder.a().f9032f == liveProfileDetailFragment.r.getId());
        }
    }
}
