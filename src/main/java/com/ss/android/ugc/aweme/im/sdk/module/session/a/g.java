package com.ss.android.ugc.aweme.im.sdk.module.session.a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.module.stranger.b;
import com.ss.android.ugc.aweme.im.sdk.utils.ay;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.c;

public class g extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f51924e;

    /* renamed from: f  reason: collision with root package name */
    public IMUser f51925f;

    public int b() {
        return 1;
    }

    public final IMUser c() {
        return this.f51925f;
    }

    public IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51924e, false, 52490, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51926a;

                public final void a(Context context, a aVar, int i) {
                    Context context2 = context;
                    final a aVar2 = aVar;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f51926a, false, 52491, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f51926a, false, 52491, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 1) {
                        IMUser c2 = g.this.c();
                        c2.setType(4);
                        ChatRoomActivity.a(context2, c2, 2);
                        z.a().a(aVar.O_(), "stranger");
                    } else if (i2 == 2) {
                        j.f51270d.c(g.this.c().getUid());
                        ay.f52524b.a(g.this.O_());
                    } else {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.ui.a aVar3 = new com.ss.android.ugc.aweme.common.ui.a(context2);
                            aVar3.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f51928a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51928a, false, 52492, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51928a, false, 52492, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    if (i == 0) {
                                        b a2 = b.a();
                                        String O_ = aVar2.O_();
                                        if (PatchProxy.isSupport(new Object[]{O_}, a2, b.f51958a, false, 52530, new Class[]{String.class}, Void.TYPE)) {
                                            b bVar = a2;
                                            PatchProxy.accessDispatch(new Object[]{O_}, bVar, b.f51958a, false, 52530, new Class[]{String.class}, Void.TYPE);
                                        } else {
                                            if (O_ != null) {
                                                WeakHandler weakHandler = a2.f51959b;
                                                long parseLong = Long.parseLong(O_);
                                                if (PatchProxy.isSupport(new Object[]{weakHandler, new Long(parseLong), 6}, null, r.f52611a, true, 53461, new Class[]{Handler.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{weakHandler, new Long(parseLong), 6}, null, r.f52611a, true, 53461, new Class[]{Handler.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
                                                } else {
                                                    m.a().a(weakHandler, new Callable(parseLong) {

                                                        /* renamed from: a  reason: collision with root package name */
                                                        public static ChangeQuickRedirect f52619a;

                                                        /* renamed from: b  reason: collision with root package name */
                                                        final /* synthetic */ long f52620b;

                                                        public final Object call() throws Exception {
                                                            if (PatchProxy.isSupport(new Object[0], this, f52619a, false, 53489, new Class[0], Object.class)) {
                                                                return PatchProxy.accessDispatch(new Object[0], this, f52619a, false, 53489, new Class[0], Object.class);
                                                            }
                                                            try {
                                                                return r.f52612b.deleteStrangerSingleSession(this.f52620b).get();
                                                            } catch (ExecutionException e2) {
                                                                throw aj.a(e2);
                                                            }
                                                        }

                                                        {
                                                            this.f52620b = r1;
                                                        }
                                                    }, 6);
                                                }
                                            }
                                            c.a().d(new com.ss.android.ugc.aweme.im.sdk.module.stranger.a(0, O_));
                                        }
                                        z.a().b(aVar2.O_());
                                    }
                                }
                            });
                            aVar3.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f51924e, false, 52490, new Class[0], IAction.class);
    }
}
