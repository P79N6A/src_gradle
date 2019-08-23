package com.bytedance.android.livesdk.gift.panel;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.LiveDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.e.a;
import com.bytedance.android.live.f.b;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.TaskGiftApi;
import com.bytedance.android.livesdk.chatroom.event.j;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.m;
import com.bytedance.android.livesdk.gift.n;
import com.bytedance.android.livesdk.gift.panel.a.c;
import com.bytedance.android.livesdk.gift.panel.g;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.gift.panel.widget.ab;
import com.bytedance.android.livesdk.gift.q;
import com.bytedance.android.livesdk.gift.u;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.d;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.Observable;
import io.reactivex.Observer;
import java.util.HashMap;

public class GiftDialogFragment extends LiveDialogFragment implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15147a;

    /* renamed from: b  reason: collision with root package name */
    public GiftDialogViewModel f15148b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f15149c;

    /* renamed from: d  reason: collision with root package name */
    public int f15150d;

    /* renamed from: e  reason: collision with root package name */
    public n.a f15151e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f15152f;
    private Room g;
    private User h;
    private boolean i;
    private boolean j;
    private String k;
    private GiftDialogViewModel.d l;
    private boolean m;
    private ab n;
    private boolean o;
    private WidgetManager p;
    private g q;
    private View r;
    private boolean s;
    private boolean t;
    private com.bytedance.android.livesdk.user.g<i> u = new com.bytedance.android.livesdk.user.g<i>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15153a;

        public final /* synthetic */ void onNext(Object obj) {
            i iVar = (i) obj;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f15153a, false, 9870, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f15153a, false, 9870, new Class[]{i.class}, Void.TYPE);
                return;
            }
            super.onNext(iVar);
            ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().e();
            GiftDialogFragment.this.f15148b.m.postValue(User.from(iVar));
        }
    };

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f15147a, false, 9848, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f15147a, false, 9848, new Class[]{String.class}, Void.TYPE);
        } else if (!((a) com.bytedance.android.live.utility.b.a(a.class)).user().c()) {
            ((com.bytedance.android.live.core.rxutils.autodispose.ab) ((a) com.bytedance.android.live.utility.b.a(a.class)).user().a(this.f15152f, com.bytedance.android.livesdk.user.i.a().a(ac.a((int) C0906R.string.des)).a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR).d("live_detail").e("gift_send").c("enableGift").a()).as(e.a((Fragment) this))).a((Observer<? super T>) this.u);
        } else if (!((a) com.bytedance.android.live.utility.b.a(a.class)).user().a(h.RECHARGE)) {
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.a()).intValue() == 1) {
                b(str);
            } else {
                ((b) com.bytedance.android.live.utility.b.a(b.class)).openWallet(this.f15152f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15147a, false, 9850, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15147a, false, 9850, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        final View view = getView();
        if (view != null) {
            if (z) {
                this.f15150d = view.getHeight();
            }
            view.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15155a;

                public final void run() {
                    float f2;
                    float f3;
                    if (PatchProxy.isSupport(new Object[0], this, f15155a, false, 9871, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f15155a, false, 9871, new Class[0], Void.TYPE);
                        return;
                    }
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        f2 = (float) GiftDialogFragment.this.f15150d;
                    }
                    if (z) {
                        f3 = (float) GiftDialogFragment.this.f15150d;
                    } else {
                        f3 = 0.0f;
                    }
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f2, f3);
                    translateAnimation.setDuration(300);
                    translateAnimation.setFillAfter(true);
                    view.startAnimation(translateAnimation);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(c cVar) {
        int i2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f15147a, false, 9847, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f15147a, false, 9847, new Class[]{c.class}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(this.f15152f)) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.f15152f, (int) C0906R.string.cst);
        } else if (!((a) com.bytedance.android.live.utility.b.a(a.class)).user().c()) {
            ((com.bytedance.android.live.core.rxutils.autodispose.ab) ((a) com.bytedance.android.live.utility.b.a(a.class)).user().a(this.f15152f, com.bytedance.android.livesdk.user.i.a().a(ac.a((int) C0906R.string.der)).a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST).d("live_detail").e("gift_send").c("enableGift").a()).as(e.a((Fragment) this))).a((Observer<? super T>) this.u);
        } else {
            if (!((a) com.bytedance.android.live.utility.b.a(a.class)).user().a(h.GIFT)) {
                if (((d) com.bytedance.android.live.utility.b.a(d.class)).k()) {
                    ai.a((int) C0906R.string.d_b);
                    return;
                }
                com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(cVar2.f15172b);
                if (findGiftById != null) {
                    i2 = findGiftById.f15107f;
                    if (cVar2.f15171a == GiftDialogViewModel.c.DOODLE_GIFT && cVar2.f15175e != null) {
                        i2 = cVar2.f15175e.f15170d;
                    }
                } else {
                    i2 = 0;
                }
                if (findGiftById == null || cVar2.f15171a == GiftDialogViewModel.c.PROP || ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().b(i2) || ((d) com.bytedance.android.live.utility.b.a(d.class)).f()) {
                    g gVar = this.q;
                    if (!PatchProxy.isSupport(new Object[]{cVar2}, gVar, g.f15193a, false, 9873, new Class[]{c.class}, Void.TYPE)) {
                        if (cVar2 != null) {
                            switch (g.AnonymousClass1.f15199a[cVar2.f15171a.ordinal()]) {
                                case 1:
                                    com.bytedance.android.livesdk.gift.model.b findGiftById2 = GiftManager.inst().findGiftById(cVar2.f15172b);
                                    if (findGiftById2 != null && findGiftById2.u > 0 && findGiftById2.f15106e == 10) {
                                        long j2 = cVar2.f15172b;
                                        int i3 = cVar2.f15173c;
                                        if (!PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i3)}, gVar, g.f15193a, false, 9875, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                                            if (!gVar.f15197e) {
                                                com.bytedance.android.livesdk.gift.model.b findGiftById3 = GiftManager.inst().findGiftById(j2);
                                                if (findGiftById3 != null) {
                                                    if (!((d) com.bytedance.android.live.utility.b.a(d.class)).f() && !((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().a(findGiftById3.u)) {
                                                        ai.a((int) C0906R.string.dje);
                                                        break;
                                                    } else {
                                                        gVar.f15197e = true;
                                                        long uptimeMillis = SystemClock.uptimeMillis();
                                                        Observable compose = ((GiftRetrofitApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(GiftRetrofitApi.class)).sendGoldenGift(j2, gVar.f15196d.getId(), gVar.f15195c, i3).compose(com.bytedance.android.live.core.rxutils.i.a());
                                                        v vVar = new v(gVar, j2, uptimeMillis);
                                                        compose.subscribe(vVar, new w(gVar, j2), new x(gVar));
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr = {new Long(j2), Integer.valueOf(i3)};
                                            Object[] objArr2 = objArr;
                                            g gVar2 = gVar;
                                            PatchProxy.accessDispatch(objArr2, gVar2, g.f15193a, false, 9875, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                                            break;
                                        }
                                    } else {
                                        long j3 = cVar2.f15172b;
                                        int i4 = cVar2.f15173c;
                                        if (!PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i4)}, gVar, g.f15193a, false, 9874, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                                            if (!gVar.f15197e) {
                                                com.bytedance.android.livesdk.gift.model.b findGiftById4 = GiftManager.inst().findGiftById(j3);
                                                if (findGiftById4 != null) {
                                                    if (!((d) com.bytedance.android.live.utility.b.a(d.class)).f() && !((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().b(findGiftById4.f15107f)) {
                                                        ai.a((int) C0906R.string.dje);
                                                        break;
                                                    } else {
                                                        gVar.f15197e = true;
                                                        long uptimeMillis2 = SystemClock.uptimeMillis();
                                                        Observable compose2 = ((GiftRetrofitApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(GiftRetrofitApi.class)).send(j3, gVar.f15196d.getId(), gVar.f15195c, i4).compose(com.bytedance.android.live.core.rxutils.i.a());
                                                        h hVar = new h(gVar, j3, uptimeMillis2);
                                                        compose2.subscribe(hVar, new i(gVar, j3), new t(gVar));
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr3 = {new Long(j3), Integer.valueOf(i4)};
                                            Object[] objArr4 = objArr3;
                                            g gVar3 = gVar;
                                            PatchProxy.accessDispatch(objArr4, gVar3, g.f15193a, false, 9874, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    long j4 = cVar2.f15172b;
                                    int i5 = cVar2.f15173c;
                                    if (!PatchProxy.isSupport(new Object[]{new Long(j4), Integer.valueOf(i5)}, gVar, g.f15193a, false, 9876, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                                        if (!gVar.f15197e) {
                                            Prop a2 = q.a().a(j4);
                                            if (a2 != null) {
                                                if (a2.count > 0) {
                                                    gVar.f15194b = i5;
                                                    gVar.f15197e = true;
                                                    long uptimeMillis3 = SystemClock.uptimeMillis();
                                                    long id = gVar.f15196d.getId();
                                                    long j5 = gVar.f15195c;
                                                    int i6 = a2.isAwemeFreeGift;
                                                    Observable compose3 = ((PropApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(PropApi.class)).sendProp(j4, id, i5, j5, i6).compose(com.bytedance.android.live.core.rxutils.i.a());
                                                    y yVar = new y(gVar, j4, uptimeMillis3);
                                                    compose3.subscribe(yVar, new z(gVar, j4), new aa(gVar));
                                                    break;
                                                } else {
                                                    ai.a((int) C0906R.string.d__);
                                                    if (gVar.b() != null) {
                                                        ((g.a) gVar.b()).a();
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Object[] objArr5 = {new Long(j4), Integer.valueOf(i5)};
                                        Object[] objArr6 = objArr5;
                                        g gVar4 = gVar;
                                        PatchProxy.accessDispatch(objArr6, gVar4, g.f15193a, false, 9876, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                                        break;
                                    }
                                    break;
                                case 3:
                                    if (!com.bytedance.android.live.uikit.a.a.d()) {
                                        long j6 = cVar2.f15172b;
                                        if (!PatchProxy.isSupport(new Object[]{new Long(j6)}, gVar, g.f15193a, false, 9877, new Class[]{Long.TYPE}, Void.TYPE)) {
                                            if (!gVar.f15197e && GiftManager.inst().findGiftById(j6) != null) {
                                                gVar.f15197e = true;
                                                long uptimeMillis4 = SystemClock.uptimeMillis();
                                                Observable compose4 = ((TaskGiftApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(TaskGiftApi.class)).sendTaskGift(j6, 1, gVar.f15196d.getId()).compose(com.bytedance.android.live.core.rxutils.i.a());
                                                ab abVar = new ab(gVar, j6, uptimeMillis4);
                                                compose4.subscribe(abVar, new j(gVar, j6), new k(gVar));
                                                break;
                                            }
                                        } else {
                                            Object[] objArr7 = {new Long(j6)};
                                            Object[] objArr8 = objArr7;
                                            g gVar5 = gVar;
                                            PatchProxy.accessDispatch(objArr8, gVar5, g.f15193a, false, 9877, new Class[]{Long.TYPE}, Void.TYPE);
                                            break;
                                        }
                                    } else {
                                        long j7 = cVar2.f15172b;
                                        if (!PatchProxy.isSupport(new Object[]{new Long(j7)}, gVar, g.f15193a, false, 9878, new Class[]{Long.TYPE}, Void.TYPE)) {
                                            if (!gVar.f15197e && GiftManager.inst().findGiftById(j7) != null) {
                                                if (u.a().b() > 0) {
                                                    gVar.f15197e = true;
                                                    long uptimeMillis5 = SystemClock.uptimeMillis();
                                                    Observable compose5 = ((TaskGiftApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(TaskGiftApi.class)).sendHotsoonTaskGift(j7, 1, gVar.f15196d.getId()).compose(com.bytedance.android.live.core.rxutils.i.a());
                                                    l lVar = new l(gVar, j7, uptimeMillis5);
                                                    compose5.subscribe(lVar, new m(gVar, j7), new n(gVar));
                                                    break;
                                                } else {
                                                    ai.a((int) C0906R.string.d__);
                                                    if (gVar.b() != null) {
                                                        ((g.a) gVar.b()).a();
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr9 = {new Long(j7)};
                                            Object[] objArr10 = objArr9;
                                            g gVar6 = gVar;
                                            PatchProxy.accessDispatch(objArr10, gVar6, g.f15193a, false, 9878, new Class[]{Long.TYPE}, Void.TYPE);
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    gVar.a(cVar2.f15175e);
                                    break;
                                case 5:
                                    long j8 = cVar2.f15172b;
                                    int i7 = cVar2.f15173c;
                                    if (!PatchProxy.isSupport(new Object[]{new Long(j8), Integer.valueOf(i7)}, gVar, g.f15193a, false, 9880, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                                        if (!gVar.f15197e && GiftManager.inst().findGiftById(j8) != null) {
                                            gVar.f15197e = true;
                                            long uptimeMillis6 = SystemClock.uptimeMillis();
                                            Observable compose6 = ((GiftRetrofitApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(GiftRetrofitApi.class)).send(j8, gVar.f15196d.getId(), gVar.f15195c, i7).compose(com.bytedance.android.live.core.rxutils.i.a());
                                            r rVar = new r(gVar, j8, uptimeMillis6);
                                            compose6.subscribe(rVar, new s(gVar, j8), new u(gVar));
                                            break;
                                        }
                                    } else {
                                        Object[] objArr11 = {new Long(j8), Integer.valueOf(i7)};
                                        Object[] objArr12 = objArr11;
                                        g gVar7 = gVar;
                                        PatchProxy.accessDispatch(objArr12, gVar7, g.f15193a, false, 9880, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                                        break;
                                    }
                            }
                        }
                    } else {
                        Object[] objArr13 = {cVar2};
                        g gVar8 = gVar;
                        PatchProxy.accessDispatch(objArr13, gVar8, g.f15193a, false, 9873, new Class[]{c.class}, Void.TYPE);
                    }
                    if (cVar2.f15174d) {
                        dismiss();
                    }
                } else {
                    String str = "";
                    if (this.f15148b.j.getValue() != null) {
                        switch ((ab) this.f15148b.j.getValue()) {
                            case GIFT:
                                str = "gift";
                                break;
                            case FANS_CLUB_GIFT:
                                str = "fans_club_gift";
                                break;
                            case PROP:
                                str = "backpack_gift";
                                break;
                        }
                    }
                    if (com.bytedance.android.live.uikit.a.a.j()) {
                        ai.a(getContext(), (int) C0906R.string.dje);
                    }
                    a(str);
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15147a, false, 9861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15147a, false, 9861, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.f15148b.s.postValue(null);
            this.f15148b.n.postValue(Boolean.FALSE);
        }
    }

    public boolean onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f15147a, false, 9862, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15147a, false, 9862, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f15149c != null) {
            this.f15149c.lambda$put$1$DataCenter("cmd_gift_dialog_switch", new j(false));
        }
        return super.onBackPressed();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f15147a, false, 9851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15147a, false, 9851, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f15148b != null) {
            this.f15148b.p.removeObservers(this);
            this.f15148b.q.removeObservers(this);
            this.f15148b.r.removeObservers(this);
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f15147a, false, 9863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15147a, false, 9863, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15149c != null) {
            this.f15149c.lambda$put$1$DataCenter("cmd_gift_dialog_switch", new j(false));
        }
        this.f15148b.b();
        this.f15148b.c();
        super.dismiss();
    }

    public final void b(com.bytedance.android.livesdk.gift.model.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f15147a, false, 9858, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f15147a, false, 9858, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.djg);
        a(iVar);
    }

    public final void c(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f15147a, false, 9857, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f15147a, false, 9857, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        l.a(getContext(), (Throwable) exc2, (int) C0906R.string.djj);
    }

    public final void d(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f15147a, false, 9859, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f15147a, false, 9859, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(exc);
    }

    private void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f15147a, false, 9849, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f15147a, false, 9849, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            if (com.bytedance.android.live.uikit.a.a.d()) {
                ((b) com.bytedance.android.live.utility.b.a(b.class)).showRechargeDialogInH5(getActivity(), this.i, str, this.f15149c, new e(this));
                a(true);
                return;
            }
            ((b) com.bytedance.android.live.utility.b.a(b.class)).showRechargeDialogInH5(getActivity(), this.i, str, this.f15149c, null);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15147a, false, 9841, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15147a, false, 9841, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.t) {
            i2 = C0906R.style.vw;
        } else {
            i2 = C0906R.style.vv;
        }
        setStyle(1, i2);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f15147a, false, 9853, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f15147a, false, 9853, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f15151e != null) {
            this.f15151e.a(exc, new f(this));
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f15147a, false, 9855, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f15147a, false, 9855, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(exc);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15147a, false, 9843, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15147a, false, 9843, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.j || ((!this.i && !com.bytedance.android.live.core.utils.g.a(getContext())) || (com.bytedance.android.live.uikit.a.a.f() && this.i && !com.bytedance.android.live.core.utils.g.a(getContext())))) {
                window.addFlags(1024);
            } else {
                window.clearFlags(1024);
            }
            if (this.j) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.t) {
                window.setLayout(-1, -2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = ac.c();
                attributes.height = ac.b() - ac.d();
                window.setAttributes(attributes);
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.model.i iVar) {
        int i2;
        com.bytedance.android.livesdk.gift.model.i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15147a, false, 9852, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15147a, false, 9852, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE);
        } else if (iVar2 != null) {
            GiftDialogViewModel giftDialogViewModel = this.f15148b;
            long j2 = iVar2.f15133e;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, giftDialogViewModel, GiftDialogViewModel.f15262a, false, 9940, new Class[]{Long.TYPE}, Integer.TYPE)) {
                GiftDialogViewModel giftDialogViewModel2 = giftDialogViewModel;
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, giftDialogViewModel2, GiftDialogViewModel.f15262a, false, 9940, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
            } else {
                i2 = giftDialogViewModel.D.a(j2);
            }
            if (this.f15151e == null || this.f15151e.a(iVar2, i2, !this.m)) {
                if (iVar2.n != null && !iVar2.n.isEmpty()) {
                    q.a().a(iVar2.n);
                }
                ((a) com.bytedance.android.live.utility.b.a(a.class)).user().a(true);
                GiftDialogViewModel giftDialogViewModel3 = this.f15148b;
                if (PatchProxy.isSupport(new Object[]{iVar2}, giftDialogViewModel3, GiftDialogViewModel.f15262a, false, 9941, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE)) {
                    GiftDialogViewModel giftDialogViewModel4 = giftDialogViewModel3;
                    PatchProxy.accessDispatch(new Object[]{iVar2}, giftDialogViewModel4, GiftDialogViewModel.f15262a, false, 9941, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE);
                } else {
                    if (!(giftDialogViewModel3.A == null || (giftDialogViewModel3.A.f15133e == iVar2.f15133e && giftDialogViewModel3.A.f15134f == iVar2.f15134f && giftDialogViewModel3.A.l == iVar2.l))) {
                        giftDialogViewModel3.b();
                    }
                    giftDialogViewModel3.A = iVar2;
                }
                com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(iVar2.f15133e);
                if (com.bytedance.android.live.uikit.a.a.d()) {
                    com.bytedance.android.livesdk.r.a.a(getContext(), this.g, findGiftById);
                }
                if (findGiftById != null) {
                    if (findGiftById.a()) {
                        this.f15148b.b();
                    }
                    if (this.m || this.o) {
                        this.f15148b.o.postValue(Boolean.TRUE);
                    } else if (!findGiftById.a()) {
                        this.f15148b.n.postValue(Boolean.TRUE);
                    }
                    ((IMessageManager) this.f15149c.get("data_message_manager")).insertMessage(com.bytedance.android.livesdk.gift.l.a(this.g.getId(), iVar2, this.h, (User) this.f15149c.get("data_user_in_room")));
                }
            }
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.model.j jVar) {
        int i2;
        com.bytedance.android.livesdk.message.model.ab abVar;
        com.bytedance.android.livesdk.gift.model.j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, this, f15147a, false, 9856, new Class[]{com.bytedance.android.livesdk.gift.model.j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, this, f15147a, false, 9856, new Class[]{com.bytedance.android.livesdk.gift.model.j.class}, Void.TYPE);
        } else if (isViewValid() && jVar2 != null) {
            User user = (User) this.f15149c.get("data_user_in_room");
            IMessageManager iMessageManager = (IMessageManager) this.f15149c.get("data_message_manager");
            if (iMessageManager != null) {
                long id = this.g.getId();
                if (PatchProxy.isSupport(new Object[]{new Long(id), jVar2, user}, null, com.bytedance.android.livesdk.gift.l.f15092a, true, 9273, new Class[]{Long.TYPE, com.bytedance.android.livesdk.gift.model.j.class, User.class}, com.bytedance.android.livesdk.message.model.ab.class)) {
                    abVar = (com.bytedance.android.livesdk.message.model.ab) PatchProxy.accessDispatch(new Object[]{new Long(id), jVar2, user}, null, com.bytedance.android.livesdk.gift.l.f15092a, true, 9273, new Class[]{Long.TYPE, com.bytedance.android.livesdk.gift.model.j.class, User.class}, com.bytedance.android.livesdk.message.model.ab.class);
                } else {
                    com.bytedance.android.livesdk.message.model.ab abVar2 = new com.bytedance.android.livesdk.message.model.ab();
                    com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
                    bVar.f18776c = id;
                    bVar.f18777d = jVar2.f15135a;
                    bVar.g = true;
                    abVar2.baseMessage = bVar;
                    abVar2.j = 1;
                    if (user != null) {
                        abVar2.f16430b = user;
                    } else {
                        abVar2.f16430b = User.from(((a) com.bytedance.android.live.utility.b.a(a.class)).user().a());
                    }
                    abVar2.i = jVar2.f15137c;
                    abVar2.f16434f = 0;
                    abVar2.f16432d = jVar2.f15138d;
                    abVar2.o = true;
                    abVar = abVar2;
                }
                iMessageManager.insertMessage(abVar, true);
            }
            com.bytedance.android.livesdkapi.l.a aVar = jVar2.f15136b;
            if (aVar != null) {
                u.a().f15476c = aVar;
                this.f15148b.v.postValue(ab.PROP);
            } else {
                com.bytedance.android.live.core.c.a.c("GiftDialogFragment", "TaskGiftSendSuccess return wallet null!");
            }
            this.f15148b.B++;
            this.f15148b.n.postValue(Boolean.TRUE);
            this.f15148b.y.postValue(Boolean.TRUE);
            if (com.bytedance.android.live.uikit.a.a.f()) {
                com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(jVar2.f15138d);
                if (findGiftById != null) {
                    i2 = findGiftById.n;
                } else {
                    i2 = 100;
                }
                this.f15148b.o.postValue(Boolean.TRUE);
                GiftDialogViewModel giftDialogViewModel = this.f15148b;
                boolean z = this.s;
                int orientation = this.g.getOrientation();
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(orientation)}, giftDialogViewModel, GiftDialogViewModel.f15262a, false, 9945, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(orientation)}, giftDialogViewModel, GiftDialogViewModel.f15262a, false, 9945, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("to_user_id", String.valueOf(giftDialogViewModel.f15267f.getOwnerUserId()));
                    hashMap.put("anchor_id", String.valueOf(giftDialogViewModel.f15267f.getOwnerUserId()));
                    hashMap.put("room_id", String.valueOf(giftDialogViewModel.f15267f.getId()));
                    hashMap.put("group_source", "22");
                    String a2 = ac.a((int) C0906R.string.d8d);
                    if (a2 == null) {
                        a2 = "";
                    }
                    hashMap.put("gift_name", a2);
                    hashMap.put("watermelon_seeds", String.valueOf(i2));
                    hashMap.put("orientation", String.valueOf(orientation));
                    hashMap.put("is_guide", String.valueOf(z ? 1 : 0));
                    com.bytedance.android.livesdk.j.a.a().a("livesdk_rt_send_free_gift", hashMap, new com.bytedance.android.livesdk.j.c.j(), Room.class);
                }
            }
            if (this.s) {
                dismiss();
                m mVar = new m();
                mVar.f15141a = true;
                com.bytedance.android.livesdk.u.a.a().a((Object) mVar);
            }
        }
    }

    public final void a(int i2, com.bytedance.android.livesdk.gift.panel.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), bVar}, this, f15147a, false, 9854, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.gift.panel.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), bVar}, this, f15147a, false, 9854, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.gift.panel.a.b.class}, Void.TYPE);
            return;
        }
        this.f15148b.a(this.k, i2, ((Long) this.f15149c.get("data_gift_group_id", 0L)).longValue(), bVar);
        ((a) com.bytedance.android.live.utility.b.a(a.class)).user().a(true);
        dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: com.bytedance.ies.sdk.widgets.Widget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: com.bytedance.ies.sdk.widgets.Widget} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(@android.support.annotation.NonNull android.view.View r20, @android.support.annotation.Nullable android.os.Bundle r21) {
        /*
            r19 = this;
            r7 = r19
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r20
            r11 = 1
            r0[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r2 = f15147a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 9844(0x2674, float:1.3794E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r20
            r0[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r2 = f15147a
            r3 = 0
            r4 = 9844(0x2674, float:1.3794E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0041:
            super.onViewCreated(r20, r21)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.g
            if (r0 != 0) goto L_0x004c
            r19.dismissAllowingStateLoss()
            return
        L_0x004c:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.g
            if (r0 == 0) goto L_0x0057
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.g
            long r0 = r0.getOwnerUserId()
            goto L_0x0059
        L_0x0057:
            r0 = 0
        L_0x0059:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r2 = r7.l
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r3 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.d.GUEST
            if (r2 != r3) goto L_0x0065
            com.bytedance.android.live.base.model.user.User r0 = r7.h
            long r0 = r0.getId()
        L_0x0065:
            com.bytedance.android.livesdk.gift.panel.g r2 = new com.bytedance.android.livesdk.gift.panel.g
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r7.g
            java.lang.String r4 = r7.k
            r2.<init>(r3, r0, r4)
            r7.q = r2
            com.bytedance.android.livesdk.gift.panel.g r0 = r7.q
            r0.a(r7)
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.Fragment) r19)
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel> r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = (com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel) r0
            r7.f15148b = r0
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r7.g
            r0.f15267f = r1
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            boolean r1 = r7.i
            r0.f15263b = r1
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            boolean r1 = r7.j
            r0.f15264c = r1
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            com.bytedance.android.live.base.model.user.User r1 = r7.h
            r0.g = r1
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r1 = r7.l
            r0.f15265d = r1
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            com.bytedance.android.livesdk.gift.panel.widget.ab r1 = r7.n
            r0.h = r1
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            boolean r1 = r7.s
            r0.i = r1
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15149c
            if (r0 == 0) goto L_0x00ba
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15149c
            java.lang.String r1 = "data_gift_dialog_view_model"
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r2 = r7.f15148b
            r0.lambda$put$1$DataCenter(r1, r2)
        L_0x00ba:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            android.arch.lifecycle.MutableLiveData<com.bytedance.android.livesdk.gift.panel.a.c> r0 = r0.p
            com.bytedance.android.livesdk.gift.panel.a r1 = new com.bytedance.android.livesdk.gift.panel.a
            r1.<init>(r7)
            r0.observe(r7, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.q
            com.bytedance.android.livesdk.gift.panel.b r1 = new com.bytedance.android.livesdk.gift.panel.b
            r1.<init>(r7)
            r0.observe(r7, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15148b
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.r
            com.bytedance.android.livesdk.gift.panel.c r1 = new com.bytedance.android.livesdk.gift.panel.c
            r1.<init>(r7)
            r0.observe(r7, r1)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f15147a
            r3 = 0
            r4 = 9845(0x2675, float:1.3796E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0103
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f15147a
            r3 = 0
            r4 = 9845(0x2675, float:1.3796E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x041e
        L_0x0103:
            android.view.View r8 = r19.getView()
            if (r8 == 0) goto L_0x041e
            r0 = 2131166388(0x7f0704b4, float:1.794702E38)
            android.view.View r0 = r8.findViewById(r0)
            r7.r = r0
            android.view.View r0 = r7.r
            com.bytedance.android.livesdk.gift.panel.d r1 = new com.bytedance.android.livesdk.gift.panel.d
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f15147a
            r3 = 0
            r4 = 9846(0x2676, float:1.3797E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x014d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f15147a
            r3 = 0
            r4 = 9846(0x2676, float:1.3797E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0401
        L_0x014d:
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = com.bytedance.ies.sdk.widgets.WidgetManager.of((android.support.v4.app.Fragment) r7, (android.view.View) r8)
            r7.p = r0
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = r7.p
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r7.f15149c
            r0.setDataCenter(r1)
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = r7.p
            r1 = 2131166946(0x7f0706e2, float:1.7948152E38)
            boolean r2 = r7.j
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r3 = r7.l
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r2)
            r12[r10] = r4
            r12[r11] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9910(0x26b6, float:1.3887E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r10] = r5
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d> r5 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.d.class
            r4[r11] = r5
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            r5 = 0
            if (r4 == 0) goto L_0x01ad
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r12[r10] = r2
            r12[r11] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9910(0x26b6, float:1.3887E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r10] = r3
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d> r3 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.d.class
            r2[r11] = r3
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.bytedance.ies.sdk.widgets.Widget r2 = (com.bytedance.ies.sdk.widgets.Widget) r2
            goto L_0x01ba
        L_0x01ad:
            if (r2 == 0) goto L_0x01b9
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r2 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.d.GUEST
            if (r3 != r2) goto L_0x01b9
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelGuestInfoWidget r2 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelGuestInfoWidget
            r2.<init>()
            goto L_0x01ba
        L_0x01b9:
            r2 = r5
        L_0x01ba:
            r0.load(r1, r2)
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = r7.p
            r1 = 2131166954(0x7f0706ea, float:1.7948168E38)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r2 = r7.l
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9911(0x26b7, float:1.3888E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d> r4 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.d.class
            r3[r10] = r4
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x01f9
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9911(0x26b7, float:1.3888E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d> r3 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.d.class
            r2[r10] = r3
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.bytedance.ies.sdk.widgets.Widget r2 = (com.bytedance.ies.sdk.widgets.Widget) r2
            goto L_0x020a
        L_0x01f9:
            boolean r3 = com.bytedance.android.live.uikit.a.a.j()
            if (r3 != 0) goto L_0x0209
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r3 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.d.GUEST
            if (r2 == r3) goto L_0x0209
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelTabWidget r2 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelTabWidget
            r2.<init>()
            goto L_0x020a
        L_0x0209:
            r2 = r5
        L_0x020a:
            r0.load(r1, r2)
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = r7.p
            r1 = 2131166940(0x7f0706dc, float:1.794814E38)
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9912(0x26b8, float:1.389E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x023b
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9912(0x26b8, float:1.389E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.bytedance.ies.sdk.widgets.Widget r2 = (com.bytedance.ies.sdk.widgets.Widget) r2
            goto L_0x024e
        L_0x023b:
            boolean r2 = com.bytedance.android.live.uikit.a.a.a()
            if (r2 != 0) goto L_0x024d
            boolean r2 = com.bytedance.android.live.uikit.a.a.b()
            if (r2 != 0) goto L_0x024d
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelDoodleWidget r2 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelDoodleWidget
            r2.<init>()
            goto L_0x024e
        L_0x024d:
            r2 = r5
        L_0x024e:
            r0.load(r1, r2)
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = r7.p
            r1 = 2131166952(0x7f0706e8, float:1.7948164E38)
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9913(0x26b9, float:1.3891E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x027f
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9913(0x26b9, float:1.3891E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.bytedance.ies.sdk.widgets.Widget r2 = (com.bytedance.ies.sdk.widgets.Widget) r2
            goto L_0x0284
        L_0x027f:
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget r2 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget
            r2.<init>()
        L_0x0284:
            r0.load(r1, r2)
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = r7.p
            r1 = 2131166953(0x7f0706e9, float:1.7948166E38)
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9914(0x26ba, float:1.3892E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x02b5
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9914(0x26ba, float:1.3892E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.bytedance.ies.sdk.widgets.Widget r2 = (com.bytedance.ies.sdk.widgets.Widget) r2
            goto L_0x02fb
        L_0x02b5:
            boolean r2 = com.bytedance.android.live.uikit.a.a.a()
            if (r2 == 0) goto L_0x02d4
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE
            java.lang.Object r2 = r2.a()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r11) goto L_0x02d4
            com.bytedance.android.livesdk.v.b r2 = com.bytedance.android.livesdk.v.b.a()
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.FakeDouyinGiftPanelBottomWidget> r3 = com.bytedance.android.livesdk.gift.panel.widget.FakeDouyinGiftPanelBottomWidget.class
            com.bytedance.ies.sdk.widgets.Widget r2 = r2.a(r3)
            goto L_0x02fb
        L_0x02d4:
            boolean r2 = com.bytedance.android.live.uikit.a.a.f()
            if (r2 == 0) goto L_0x02e5
            com.bytedance.android.livesdk.v.b r2 = com.bytedance.android.livesdk.v.b.a()
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.FakeXgGiftPanelBottomWidget> r3 = com.bytedance.android.livesdk.gift.panel.widget.FakeXgGiftPanelBottomWidget.class
            com.bytedance.ies.sdk.widgets.Widget r2 = r2.a(r3)
            goto L_0x02fb
        L_0x02e5:
            boolean r2 = com.bytedance.android.live.uikit.a.a.j()
            if (r2 == 0) goto L_0x02f6
            com.bytedance.android.livesdk.v.b r2 = com.bytedance.android.livesdk.v.b.a()
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.FakeMtGiftPanelBottomWidget> r3 = com.bytedance.android.livesdk.gift.panel.widget.FakeMtGiftPanelBottomWidget.class
            com.bytedance.ies.sdk.widgets.Widget r2 = r2.a(r3)
            goto L_0x02fb
        L_0x02f6:
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelBottomWidget r2 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelBottomWidget
            r2.<init>()
        L_0x02fb:
            r0.load(r1, r2)
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = r7.p
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9915(0x26bb, float:1.3894E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0329
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9915(0x26bb, float:1.3894E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.bytedance.ies.sdk.widgets.Widget r1 = (com.bytedance.ies.sdk.widgets.Widget) r1
            goto L_0x033b
        L_0x0329:
            boolean r1 = com.bytedance.android.live.uikit.a.a.g()
            if (r1 == 0) goto L_0x033a
            com.bytedance.android.livesdk.v.b r1 = com.bytedance.android.livesdk.v.b.a()
            java.lang.Class<com.bytedance.android.livesdk.gift.panel.widget.FakeGiftPanelVigoRechargeWidget> r2 = com.bytedance.android.livesdk.gift.panel.widget.FakeGiftPanelVigoRechargeWidget.class
            com.bytedance.ies.sdk.widgets.Widget r1 = r1.a(r2)
            goto L_0x033b
        L_0x033a:
            r1 = r5
        L_0x033b:
            r2 = 2131166955(0x7f0706eb, float:1.794817E38)
            r0.load(r2, r1)
            com.bytedance.ies.sdk.widgets.WidgetManager r0 = r7.p
            r1 = 2131166947(0x7f0706e3, float:1.7948154E38)
            boolean r3 = r7.s
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r3)
            r12[r10] = r4
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9916(0x26bc, float:1.3895E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r4[r10] = r6
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0386
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r12[r10] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.gift.panel.ac.f15182a
            r15 = 1
            r16 = 9916(0x26bc, float:1.3895E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r10] = r4
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r17 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            r5 = r3
            com.bytedance.ies.sdk.widgets.Widget r5 = (com.bytedance.ies.sdk.widgets.Widget) r5
            goto L_0x03d9
        L_0x0386:
            boolean r4 = com.bytedance.android.live.uikit.a.a.f()
            if (r4 == 0) goto L_0x03d9
            if (r3 == 0) goto L_0x03d9
            com.bytedance.android.livesdk.am r3 = com.bytedance.android.livesdk.am.a()
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r12[r10] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.am.f9018a
            r15 = 0
            r16 = 2756(0xac4, float:3.862E-42)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r10] = r5
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r13 = r3
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x03d0
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r12[r10] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.am.f9018a
            r15 = 0
            r16 = 2756(0xac4, float:3.862E-42)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r10] = r5
            java.lang.Class<com.bytedance.ies.sdk.widgets.Widget> r18 = com.bytedance.ies.sdk.widgets.Widget.class
            r13 = r3
            r17 = r4
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            r5 = r3
            com.bytedance.ies.sdk.widgets.Widget r5 = (com.bytedance.ies.sdk.widgets.Widget) r5
            goto L_0x03d9
        L_0x03d0:
            android.util.SparseArray<com.bytedance.ies.sdk.widgets.Widget> r3 = r3.f9020b
            java.lang.Object r3 = r3.get(r10)
            r5 = r3
            com.bytedance.ies.sdk.widgets.Widget r5 = (com.bytedance.ies.sdk.widgets.Widget) r5
        L_0x03d9:
            r0.load(r1, r5)
            boolean r0 = com.bytedance.android.live.uikit.a.a.g()
            if (r0 == 0) goto L_0x03e9
            android.view.View r0 = r8.findViewById(r2)
            r0.setVisibility(r10)
        L_0x03e9:
            boolean r0 = com.bytedance.android.live.uikit.a.a.j()
            if (r0 == 0) goto L_0x0401
            r0 = 2131166939(0x7f0706db, float:1.7948138E38)
            android.view.View r0 = r8.findViewById(r0)
            com.bytedance.android.livesdk.gift.d.d r1 = com.bytedance.android.livesdk.gift.d.e.a()
            int r1 = r1.b()
            r0.setBackgroundResource(r1)
        L_0x0401:
            boolean r0 = r7.s
            if (r0 == 0) goto L_0x041e
            android.app.Dialog r0 = r19.getDialog()
            if (r0 == 0) goto L_0x041e
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x041e
            android.view.Window r0 = r0.getWindow()
            r0.addFlags(r9)
            r1 = 1060320051(0x3f333333, float:0.7)
            r0.setDimAmount(r1)
        L_0x041e:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15149c
            if (r0 == 0) goto L_0x042e
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15149c
            java.lang.String r1 = "cmd_gift_dialog_switch"
            com.bytedance.android.livesdk.chatroom.event.j r2 = new com.bytedance.android.livesdk.chatroom.event.j
            r2.<init>(r11)
            r0.lambda$put$1$DataCenter(r1, r2)
        L_0x042e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.GiftDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f15147a, false, 9842, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ag7, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f15147a, false, 9842, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public static GiftDialogFragment a(Activity activity, Room room, User user, ab abVar, boolean z, boolean z2, String str, boolean z3) {
        boolean z4;
        Activity activity2 = activity;
        Room room2 = room;
        User user2 = user;
        ab abVar2 = abVar;
        boolean z5 = z;
        boolean z6 = z2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, room2, user2, abVar2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), str2, Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f15147a, true, 9840, new Class[]{Activity.class, Room.class, User.class, ab.class, Boolean.TYPE, Boolean.TYPE, String.class, Boolean.TYPE}, GiftDialogFragment.class)) {
            return (GiftDialogFragment) PatchProxy.accessDispatch(new Object[]{activity2, room2, user2, abVar2, Byte.valueOf(z), Byte.valueOf(z2), str2, Byte.valueOf(z3)}, null, f15147a, true, 9840, new Class[]{Activity.class, Room.class, User.class, ab.class, Boolean.TYPE, Boolean.TYPE, String.class, Boolean.TYPE}, GiftDialogFragment.class);
        }
        boolean z7 = true;
        GiftDialogFragment giftDialogFragment = new GiftDialogFragment();
        giftDialogFragment.f15152f = activity2;
        giftDialogFragment.g = room2;
        giftDialogFragment.h = user2;
        giftDialogFragment.i = z5;
        giftDialogFragment.j = z6;
        giftDialogFragment.k = str2;
        giftDialogFragment.s = z3;
        if (user2 == null || user.getId() == room.getOwnerUserId()) {
            giftDialogFragment.l = GiftDialogViewModel.d.ANCHOR;
        } else {
            giftDialogFragment.l = GiftDialogViewModel.d.GUEST;
        }
        if (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.a()).intValue() != 1 || (!com.bytedance.android.live.uikit.a.a.a() && !com.bytedance.android.live.uikit.a.a.j())) {
            z4 = false;
        } else {
            z4 = true;
        }
        giftDialogFragment.m = z4;
        giftDialogFragment.n = abVar2;
        giftDialogFragment.o = com.bytedance.android.live.uikit.a.a.f();
        if (!z6 || (!z5 && !com.bytedance.android.live.core.utils.g.a(activity))) {
            z7 = false;
        }
        giftDialogFragment.t = z7;
        return giftDialogFragment;
    }
}
