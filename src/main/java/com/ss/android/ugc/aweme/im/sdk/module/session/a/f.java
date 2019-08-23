package com.ss.android.ugc.aweme.im.sdk.module.session.a;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;

public final class f extends g {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f51921d;

    public final String O_() {
        return "stranger_1";
    }

    public final int b() {
        return 2;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51921d, false, 52485, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51922a;

                public final void a(Context context, a aVar, int i) {
                    Context context2 = context;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f51922a, false, 52488, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f51922a, false, 52488, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 1) {
                        if (PatchProxy.isSupport(new Object[]{context2}, null, StrangerListActivity.f51932a, true, 52512, new Class[]{Context.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context2}, null, StrangerListActivity.f51932a, true, 52512, new Class[]{Context.class}, Void.TYPE);
                        } else {
                            context2.startActivity(new Intent(context2, StrangerListActivity.class));
                        }
                        f fVar = f.this;
                        if (PatchProxy.isSupport(new Object[0], fVar, f.f51921d, false, 52486, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], fVar, f.f51921d, false, 52486, new Class[0], Void.TYPE);
                        } else {
                            LocalBroadcastManager.getInstance(GlobalContext.getContext()).sendBroadcast(new Intent("message_stranger_mark_read_action"));
                        }
                        z a2 = z.a();
                        if (PatchProxy.isSupport(new Object[]{"stranger"}, a2, z.f52670a, false, 53592, new Class[]{String.class}, Void.TYPE)) {
                            z zVar = a2;
                            PatchProxy.accessDispatch(new Object[]{"stranger"}, zVar, z.f52670a, false, 53592, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        if (PatchProxy.isSupport(new Object[]{"stranger", null}, a2, z.f52670a, false, 53593, new Class[]{String.class, String.class}, Void.TYPE)) {
                            z zVar2 = a2;
                            PatchProxy.accessDispatch(new Object[]{"stranger", null}, zVar2, z.f52670a, false, 53593, new Class[]{String.class, String.class}, Void.TYPE);
                            return;
                        }
                        r.onEvent(MobClick.obtain().setEventName("message_click").setLabelName("stranger").setValue(null));
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f51921d, false, 52485, new Class[0], IAction.class);
    }

    public static f a(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, null, f51921d, true, 52484, new Class[]{g.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{gVar2}, null, f51921d, true, 52484, new Class[]{g.class}, f.class);
        }
        f fVar = new f();
        fVar.k = gVar2.k;
        fVar.j = gVar2.j;
        fVar.a(gVar2.l);
        return fVar;
    }
}
