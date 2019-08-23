package com.bytedance.android.livesdk.gift.relay;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.e.a;
import com.bytedance.android.livesdk.gift.l;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.message.model.y;
import com.bytedance.android.livesdkapi.h.b;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.android.livesdkapi.h.g;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.functions.Consumer;
import java.util.Iterator;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15450a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftRelayDialogFragment f15451b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15452c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15453d;

    d(GiftRelayDialogFragment giftRelayDialogFragment, long j, long j2) {
        this.f15451b = giftRelayDialogFragment;
        this.f15452c = j;
        this.f15453d = j2;
    }

    public final void accept(Object obj) {
        long j;
        char c2;
        y yVar;
        User user;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15450a, false, 10116, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15450a, false, 10116, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftRelayDialogFragment giftRelayDialogFragment = this.f15451b;
        long j2 = this.f15452c;
        long j3 = this.f15453d;
        i iVar = (i) ((com.bytedance.android.live.core.network.response.d) obj).f7871b;
        if (PatchProxy.isSupport(new Object[]{iVar}, giftRelayDialogFragment, GiftRelayDialogFragment.f15413a, false, 10106, new Class[]{i.class}, Void.TYPE)) {
            Object[] objArr = {iVar};
            GiftRelayDialogFragment giftRelayDialogFragment2 = giftRelayDialogFragment;
            ChangeQuickRedirect changeQuickRedirect = GiftRelayDialogFragment.f15413a;
            PatchProxy.accessDispatch(objArr, giftRelayDialogFragment2, changeQuickRedirect, false, 10106, new Class[]{i.class}, Void.TYPE);
        } else if (iVar != null) {
            if (PatchProxy.isSupport(new Object[0], giftRelayDialogFragment, GiftRelayDialogFragment.f15413a, false, 10109, new Class[0], Void.TYPE)) {
                GiftRelayDialogFragment giftRelayDialogFragment3 = giftRelayDialogFragment;
                c2 = 2;
                PatchProxy.accessDispatch(new Object[0], giftRelayDialogFragment3, GiftRelayDialogFragment.f15413a, false, 10109, new Class[0], Void.TYPE);
            } else {
                c2 = 2;
                giftRelayDialogFragment.k.setVisibility(8);
                giftRelayDialogFragment.m.setVisibility(0);
                if (giftRelayDialogFragment.n != null && giftRelayDialogFragment.n.isRunning()) {
                    giftRelayDialogFragment.n.cancel();
                }
                giftRelayDialogFragment.n = ObjectAnimator.ofFloat(giftRelayDialogFragment.m, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) giftRelayDialogFragment.p) * 1000);
                giftRelayDialogFragment.n.start();
                giftRelayDialogFragment.m.startScaleAnim(((long) giftRelayDialogFragment.p) * 1000, null);
                if (giftRelayDialogFragment.o.hasMessages(0)) {
                    giftRelayDialogFragment.o.removeMessages(0);
                }
                giftRelayDialogFragment.o.sendEmptyMessageDelayed(0, ((long) giftRelayDialogFragment.p) * 1000);
            }
            giftRelayDialogFragment.q = iVar;
            if (giftRelayDialogFragment.f15416d != null) {
                IMessageManager iMessageManager = (IMessageManager) giftRelayDialogFragment.f15416d.get("data_message_manager", null);
                if (iMessageManager != null) {
                    User user2 = (User) giftRelayDialogFragment.f15416d.get("data_user_in_room", null);
                    long id = giftRelayDialogFragment.f15417e.getId();
                    User owner = giftRelayDialogFragment.f15417e.getOwner();
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = new Long(id);
                    objArr2[1] = iVar;
                    objArr2[c2] = owner;
                    objArr2[3] = user2;
                    if (PatchProxy.isSupport(objArr2, null, l.f15092a, true, 9275, new Class[]{Long.TYPE, i.class, User.class, User.class}, y.class)) {
                        Object[] objArr3 = {new Long(id), iVar, owner, user2};
                        Object[] objArr4 = objArr3;
                        yVar = (y) PatchProxy.accessDispatch(objArr4, null, l.f15092a, true, 9275, new Class[]{Long.TYPE, i.class, User.class, User.class}, y.class);
                        j = j2;
                    } else {
                        yVar = new y();
                        b bVar = new b();
                        bVar.f18776c = id;
                        bVar.f18777d = iVar.k;
                        bVar.g = true;
                        bVar.f18779f = iVar.f15132d;
                        bVar.j = iVar.f15129a;
                        yVar.baseMessage = bVar;
                        e eVar = iVar.f15129a;
                        if (eVar != null && !CollectionUtils.isEmpty(eVar.f18785d)) {
                            Iterator<g> it2 = eVar.f18785d.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                g next = it2.next();
                                if (next.f18792d == null || next.f18792d.f18800a == null) {
                                    j = j2;
                                } else {
                                    j = j2;
                                    if (l.a(next.f18792d.f18800a, ((a) com.bytedance.android.live.utility.b.a(a.class)).user().b())) {
                                        user = next.f18792d.f18800a;
                                        break;
                                    }
                                }
                                j2 = j;
                            }
                        }
                        j = j2;
                        user = null;
                        if (user != null) {
                            yVar.g = user;
                        } else if (user2 != null) {
                            yVar.g = user2;
                        } else {
                            yVar.g = User.from(((a) com.bytedance.android.live.utility.b.a(a.class)).user().a());
                        }
                        yVar.f16712e = (long) iVar.h;
                        yVar.f16710c = (long) iVar.f15130b;
                        yVar.f16709b = iVar.f15133e;
                        yVar.h = owner;
                        yVar.f16713f = (long) iVar.j;
                        yVar.f16711d = (long) iVar.f15134f;
                        yVar.i = iVar.o;
                        yVar.j = true;
                    }
                    iMessageManager.insertMessage(yVar);
                    if (iVar.o != null) {
                        giftRelayDialogFragment.a(iVar.o.n, iVar.o.m);
                    }
                    o.a(j, giftRelayDialogFragment.f15417e.getId(), SystemClock.uptimeMillis() - j3);
                }
            }
        }
        j = j2;
        o.a(j, giftRelayDialogFragment.f15417e.getId(), SystemClock.uptimeMillis() - j3);
    }
}
