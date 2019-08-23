package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.w;
import com.bytedance.android.livesdk.chatroom.model.x;
import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.bytedance.android.livesdk.chatroom.presenter.bf;
import com.bytedance.android.livesdk.chatroom.presenter.bg;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.e;
import com.bytedance.android.livesdkapi.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dz implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12124a;

    /* renamed from: b  reason: collision with root package name */
    private final dy f12125b;

    dz(dy dyVar) {
        this.f12125b = dyVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12124a, false, 6261, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12124a, false, 6261, new Class[]{View.class}, Void.TYPE);
            return;
        }
        dy dyVar = this.f12125b;
        au auVar = dyVar.f12120c;
        x xVar = dyVar.f12122e;
        w wVar = dyVar.f12121d;
        boolean isChecked = dyVar.i.isChecked();
        if (PatchProxy.isSupport(new Object[]{xVar, wVar, Byte.valueOf(isChecked ? (byte) 1 : 0)}, auVar, au.f11241a, false, 5256, new Class[]{x.class, w.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xVar, wVar, Byte.valueOf(isChecked)}, auVar, au.f11241a, false, 5256, new Class[]{x.class, w.class, Boolean.TYPE}, Void.TYPE);
        } else if (auVar.f11246f) {
            ((au.b) auVar.b()).b(null);
        } else {
            auVar.f11246f = true;
            ((ab) j.q().d().c().send((long) xVar.f11181a, auVar.f11242b.getId(), wVar.f11174a, isChecked ? wVar.f11178e : 0, auVar.f11244d, auVar.f11242b.getRequestId(), auVar.f11242b.getLabels()).compose(i.a()).as(auVar.o())).a(new bf(auVar, xVar, isChecked, wVar), new bg(auVar));
        }
        TTLiveSDKContext.getHostService().b().b().a((d.a) e.SEND_DELAY_RED_ENVELOPE, dyVar.i.isChecked());
        dyVar.dismiss();
    }
}
