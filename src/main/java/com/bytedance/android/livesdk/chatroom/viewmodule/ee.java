package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter;
import com.bytedance.android.livesdk.chatroom.presenter.bp;
import com.bytedance.android.livesdk.chatroom.presenter.bq;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class ee implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13209a;

    /* renamed from: b  reason: collision with root package name */
    private final RadioWidget f13210b;

    ee(RadioWidget radioWidget) {
        this.f13210b = radioWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13209a, false, 7440, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13209a, false, 7440, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            RadioViewPresenter radioViewPresenter = this.f13210b.f12778d;
            if (PatchProxy.isSupport(new Object[0], radioViewPresenter, RadioViewPresenter.f11191a, false, 5298, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], radioViewPresenter, RadioViewPresenter.f11191a, false, 5298, new Class[0], Void.TYPE);
            } else {
                ((ab) ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).removeRoomBackgroundImg(((RadioViewPresenter.a) radioViewPresenter.b()).b().getId(), ((RadioViewPresenter.a) radioViewPresenter.b()).b().getOwner().getId()).as(radioViewPresenter.p())).a(bp.f11310b, new bq(radioViewPresenter));
            }
        } catch (Exception unused) {
            ai.a((int) C0906R.string.d_l);
        }
        dialogInterface.dismiss();
    }
}
