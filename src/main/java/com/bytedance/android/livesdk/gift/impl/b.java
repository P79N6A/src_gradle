package com.bytedance.android.livesdk.gift.impl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.l;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.q;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import org.json.JSONObject;

public final class b extends Dialog implements View.OnClickListener, a.C0132a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15058a;

    /* renamed from: b  reason: collision with root package name */
    Room f15059b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f15060c;

    /* renamed from: d  reason: collision with root package name */
    public c f15061d;

    /* renamed from: e  reason: collision with root package name */
    public final CompositeDisposable f15062e;

    /* renamed from: f  reason: collision with root package name */
    public long f15063f;
    public boolean g;
    private Activity h;
    private RelativeLayout i;
    private SpecialCombView j;
    private User k;
    private boolean l;
    private boolean m;
    private i n;
    private int o;
    private String p;
    private String q;
    private Handler r;
    private ObjectAnimator s;
    private AnimatorSet t;
    private AnimatorSet u;
    private int v;
    private int w;

    enum a {
        enter,
        exit;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* renamed from: com.bytedance.android.livesdk.gift.impl.b$b  reason: collision with other inner class name */
    class C0108b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15069a;

        /* renamed from: c  reason: collision with root package name */
        private a f15071c;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f15069a, false, 9816, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f15069a, false, 9816, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            switch (this.f15071c) {
                case enter:
                    b.this.g = true;
                    b.this.a();
                    return;
                case exit:
                    b.this.dismiss();
                    break;
            }
        }

        C0108b(a aVar) {
            this.f15071c = aVar;
        }
    }

    public interface c {
        void a(Exception exc, Runnable runnable);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f15058a, false, 9792, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15058a, false, 9792, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f15062e.clear();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15058a, false, 9799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15058a, false, 9799, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null && this.s.isStarted()) {
            this.s.cancel();
        }
        this.s = ObjectAnimator.ofFloat(this.j, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) this.w) * 1000);
        this.s.start();
        this.j.startScaleAnim(((long) this.w) * 1000, null);
        if (this.r.hasMessages(110)) {
            this.r.removeMessages(110);
        }
        this.r.sendEmptyMessageDelayed(110, ((long) this.w) * 1000);
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f15058a, false, 9807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15058a, false, 9807, new Class[0], Void.TYPE);
            return;
        }
        this.r.removeCallbacksAndMessages(null);
        if (this.t != null && this.t.isStarted()) {
            this.t.removeAllListeners();
            this.t.cancel();
        }
        if (this.s != null && this.s.isStarted()) {
            this.s.removeAllListeners();
            this.s.cancel();
        }
        if (this.u != null && this.u.isStarted()) {
            this.u.removeAllListeners();
            this.u.cancel();
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, g.f15088a, true, 9817, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, g.f15088a, true, 9817, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public final void show() {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[0], this, f15058a, false, 9806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15058a, false, 9806, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        if (PatchProxy.isSupport(new Object[0], this, f15058a, false, 9794, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15058a, false, 9794, new Class[0], Void.TYPE);
        } else {
            this.j.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.j, "scaleX", new float[]{0.0f, 1.0f}).setDuration(200);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.j, "scaleY", new float[]{0.0f, 1.0f}).setDuration(200);
            this.t = new AnimatorSet();
            this.t.playTogether(new Animator[]{duration, duration2});
            this.t.addListener(new C0108b(a.enter));
            this.t.start();
        }
        i iVar = this.n;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f15058a, false, 9802, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f15058a, false, 9802, new Class[]{i.class}, Void.TYPE);
        } else if (iVar != null && iVar.f15133e != -1 && iVar.h > 0) {
            if (iVar.l <= 0) {
                long id = this.f15059b.getId();
                long userFrom = this.f15059b.getUserFrom();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("live_source", this.p);
                    jSONObject.put("source", userFrom);
                    jSONObject.put("gift_id", iVar.f15133e);
                    jSONObject.put("request_id", this.f15059b.getRequestId());
                    jSONObject.put("log_pb", this.f15059b.getLog_pb());
                    jSONObject.put("gift_cnt", iVar.h);
                    jSONObject.put("group_cnt", iVar.f15134f);
                    jSONObject.put("combo_cnt", iVar.j);
                    jSONObject.put("enter_from", this.q);
                    if (this.l) {
                        str4 = "live_take_detail";
                    } else {
                        str4 = "live_detail";
                    }
                    jSONObject.put("event_page", str4);
                    if (!TextUtils.isEmpty(this.f15059b.getSourceType())) {
                        jSONObject.put("moment_room_source", this.f15059b.getSourceType());
                    }
                } catch (Exception unused) {
                }
                if (iVar.h > 1) {
                    f a2 = f.a((Context) this.h);
                    a2.a("send_gift_refer", "running_gift_" + userFrom, id, (long) iVar.h);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("is_combo", "first_combo");
            if (this.f15063f != 0) {
                hashMap.put("team_id", String.valueOf(this.f15063f));
                if (this.k == null) {
                    str3 = "";
                } else {
                    str3 = this.k.getIdStr();
                }
                hashMap.put("top_anchor_id", str3);
            }
            HashMap hashMap2 = new HashMap();
            if (iVar.l <= 0) {
                hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                hashMap.put("gift_position", String.valueOf(this.v));
                hashMap2.put(Long.valueOf(iVar.f15133e), 1);
                hashMap.put("gift_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
            } else {
                hashMap2.put(Long.valueOf(iVar.l), 1);
                hashMap.put("prop_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
            }
            hashMap.put("is_first_consume", String.valueOf(((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).isFirstConsume(((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a())));
            if (!(this.k == null || this.k.getId() == this.f15059b.getOwnerUserId())) {
                hashMap.put("to_user_id", String.valueOf(this.k.getId()));
            }
            com.bytedance.android.livesdk.j.a a3 = com.bytedance.android.livesdk.j.a.a();
            if (iVar.l > 0) {
                str = "send_prop";
            } else {
                str = "send_gift";
            }
            Object[] objArr = new Object[4];
            j jVar = new j();
            if (this.l) {
                str2 = "live_take_detail";
            } else {
                str2 = "live_detail";
            }
            objArr[0] = jVar.a(str2).c("bottom_tab").b("live_interact").f("other");
            objArr[1] = Room.class;
            objArr[2] = l.a(iVar);
            objArr[3] = ((com.bytedance.android.live.d.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.d.a.class)).getLinkCrossRoomLog();
            a3.a(str, hashMap, objArr);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f15058a, false, 9801, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f15058a, false, 9801, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f15061d != null) {
            this.f15061d.a(exc, new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15066a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f15066a, false, 9813, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f15066a, false, 9813, new Class[0], Void.TYPE);
                        return;
                    }
                    if (b.this.isShowing()) {
                        b.this.dismiss();
                    }
                }
            });
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15058a, false, 9791, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15058a, false, 9791, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        window.requestFeature(1);
        if (window != null) {
            window.setLayout(-1, -1);
            window.setGravity(80);
            window.setDimAmount(0.0f);
        }
        setContentView(LayoutInflater.from(this.h).inflate(C0906R.layout.ahf, null));
        if (window != null) {
            if (!this.m || (!this.l && !g.a(getContext()))) {
                window.addFlags(1024);
            } else {
                window.clearFlags(1024);
            }
            window.setLayout(-1, -1);
        }
        if (PatchProxy.isSupport(new Object[0], this, f15058a, false, 9793, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15058a, false, 9793, new Class[0], Void.TYPE);
        } else {
            this.i = (RelativeLayout) findViewById(C0906R.id.csw);
            this.i.setOnClickListener(this);
            this.j = (SpecialCombView) findViewById(C0906R.id.csx);
            this.j.setOnClickListener(this);
            this.j.setVisibility(4);
            this.j.setCountDownTime(this.w);
        }
        if (com.ss.android.ugc.aweme.q.c.a(this.h, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.p = str;
    }

    public final void a(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f15058a, false, 9805, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f15058a, false, 9805, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 110) {
            if (PatchProxy.isSupport(new Object[0], this, f15058a, false, 9795, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f15058a, false, 9795, new Class[0], Void.TYPE);
                return;
            }
            this.g = false;
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.j, "scaleX", new float[]{1.0f, 0.0f}).setDuration(200);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.j, "scaleY", new float[]{1.0f, 0.0f}).setDuration(200);
            this.u = new AnimatorSet();
            this.u.playTogether(new Animator[]{duration, duration2});
            this.u.addListener(new C0108b(a.exit));
            this.u.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar) {
        long j2;
        String str;
        String str2;
        String str3;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15058a, false, 9804, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15058a, false, 9804, new Class[]{i.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15058a, false, 9800, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15058a, false, 9800, new Class[]{i.class}, Void.TYPE);
            return;
        }
        ((IMessageManager) this.f15060c.get("data_message_manager")).insertMessage(l.a(this.f15059b.getId(), iVar2, this.k, (User) this.f15060c.get("data_user_in_room")));
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15058a, false, 9803, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15058a, false, 9803, new Class[]{i.class}, Void.TYPE);
        } else if (!(iVar2 == null || iVar2.f15133e == -1 || iVar2.h <= 0)) {
            if (iVar2.l <= 0) {
                long id = this.f15059b.getId();
                long userFrom = this.f15059b.getUserFrom();
                if (iVar2.h > 1) {
                    f.a((Context) this.h).a("send_gift_refer", "running_gift_" + userFrom, id, (long) iVar2.h);
                }
            }
            iVar2.r = this.o;
            if (this.k == null) {
                j2 = 0;
            } else {
                j2 = this.k.getId();
            }
            iVar2.s = j2;
            HashMap hashMap = new HashMap();
            hashMap.put("is_combo", "click_combo");
            if (this.f15063f != 0) {
                hashMap.put("team_id", String.valueOf(this.f15063f));
                if (this.k == null) {
                    str3 = "";
                } else {
                    str3 = this.k.getIdStr();
                }
                hashMap.put("top_anchor_id", str3);
            }
            HashMap hashMap2 = new HashMap();
            if (iVar2.l <= 0) {
                hashMap.put("gift_position", String.valueOf(this.v));
                hashMap2.put(Long.valueOf(iVar2.f15133e), 1);
                hashMap.put("gift_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
            } else {
                hashMap2.put(Long.valueOf(iVar2.l), 1);
                hashMap.put("prop_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
            }
            hashMap.put("gift_cnt", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            hashMap.put("money", String.valueOf(GiftManager.inst().findGiftById(iVar2.f15133e).f15107f));
            if (!(this.k == null || this.k.getId() == this.f15059b.getOwnerUserId())) {
                hashMap.put("to_user_id", String.valueOf(this.k.getId()));
            }
            if (iVar2.l > 0) {
                hashMap2.put(Long.valueOf(iVar2.l), 1);
                hashMap.put("prop_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
                com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                Object[] objArr = new Object[5];
                j jVar = new j();
                if (this.l) {
                    str2 = "live_take_detail";
                } else {
                    str2 = "live_detail";
                }
                objArr[0] = jVar.a(str2).c("bottom_tab").b("live_interact").f("other");
                objArr[1] = Room.class;
                objArr[2] = l.a(iVar);
                objArr[3] = ((com.bytedance.android.live.d.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.d.a.class)).getLinkCrossRoomLog();
                objArr[4] = new k();
                a2.a("send_prop", hashMap, objArr);
            } else {
                hashMap.put("gift_position", String.valueOf(this.v));
                hashMap2.put(Long.valueOf(iVar2.f15133e), 1);
                hashMap.put("gift_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
                hashMap.put("is_first_consume", String.valueOf(((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).isFirstConsume(((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a())));
                hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                com.bytedance.android.livesdk.j.a a3 = com.bytedance.android.livesdk.j.a.a();
                Object[] objArr2 = new Object[4];
                j jVar2 = new j();
                if (this.l) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                objArr2[0] = jVar2.a(str).c("bottom_tab").b("live_interact").f("other");
                objArr2[1] = Room.class;
                objArr2[2] = l.a(iVar);
                objArr2[3] = ((com.bytedance.android.live.d.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.d.a.class)).getLinkCrossRoomLog();
                a3.a("send_gift", hashMap, objArr2);
            }
        }
        a();
    }

    public final void onClick(View view) {
        long ownerUserId;
        long id;
        if (PatchProxy.isSupport(new Object[]{view}, this, f15058a, false, 9796, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15058a, false, 9796, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() == C0906R.id.csw) {
            dismiss();
        } else if (view.getId() == C0906R.id.csx && this.g) {
            if (this.n.l > 0) {
                long id2 = this.f15059b.getId();
                long j2 = this.n.l;
                long j3 = j2;
                if (PatchProxy.isSupport(new Object[]{new Long(id2), new Long(j2), 1}, this, f15058a, false, 9797, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(id2), new Long(j3), 1}, this, f15058a, false, 9797, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Prop a2 = q.a().a(j3);
                    if (a2 != null) {
                        PropApi propApi = (PropApi) ((h) com.bytedance.android.live.utility.b.a(h.class)).c().create(PropApi.class);
                        long j4 = a2.id;
                        long j5 = j3;
                        if (this.k == null) {
                            id = this.f15059b.getOwnerUserId();
                        } else {
                            id = this.k.getId();
                        }
                        long j6 = id2;
                        Observable compose = propApi.sendProp(j4, j6, 1, id, a2.isAwemeFreeGift).compose(com.bytedance.android.live.core.rxutils.i.a());
                        long j7 = j5;
                        long j8 = j6;
                        c cVar = new c(this, j7, j8, uptimeMillis);
                        d dVar = new d(this, j7, j8);
                        compose.subscribe(cVar, dVar);
                    }
                }
            } else {
                long id3 = this.f15059b.getId();
                long j9 = this.n.f15133e;
                String labels = this.f15059b.getLabels();
                String str = labels;
                long j10 = j9;
                if (PatchProxy.isSupport(new Object[]{new Long(id3), new Long(j9), labels, 1}, this, f15058a, false, 9798, new Class[]{Long.TYPE, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(id3), new Long(j10), str, 1}, this, f15058a, false, 9798, new Class[]{Long.TYPE, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                } else if (GiftManager.inst().findGiftById(j10) != null) {
                    if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
                        ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a(this.h, com.bytedance.android.livesdk.user.i.a().a(ac.a((int) C0906R.string.der)).a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST).d("live_detail").e("gift_send").c("gift").a()).subscribe((Observer<? super T>) new com.bytedance.android.livesdk.user.g<com.bytedance.android.live.base.model.user.i>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f15064a;

                            public final void onSubscribe(Disposable disposable) {
                                Disposable disposable2 = disposable;
                                if (PatchProxy.isSupport(new Object[]{disposable2}, this, f15064a, false, 9812, new Class[]{Disposable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{disposable2}, this, f15064a, false, 9812, new Class[]{Disposable.class}, Void.TYPE);
                                    return;
                                }
                                super.onSubscribe(disposable);
                                b.this.f15062e.add(disposable2);
                            }
                        });
                    } else if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a(com.bytedance.android.livesdk.user.h.GIFT)) {
                        if (!NetworkUtils.isNetworkAvailable(getContext())) {
                            com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.cst);
                            return;
                        }
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) ((h) com.bytedance.android.live.utility.b.a(h.class)).c().create(GiftRetrofitApi.class);
                        if (this.k != null) {
                            ownerUserId = this.k.getId();
                        } else {
                            ownerUserId = this.f15059b.getOwnerUserId();
                        }
                        long j11 = j10;
                        Observable compose2 = giftRetrofitApi.send(j11, id3, ownerUserId, 1).compose(com.bytedance.android.live.core.rxutils.i.a());
                        e eVar = new e(this, j11, uptimeMillis2);
                        compose2.subscribe(eVar, new f(this, j11));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.app.Activity r2, com.bytedance.android.livesdkapi.depend.model.live.Room r3, com.bytedance.android.live.base.model.user.User r4, boolean r5, boolean r6, com.bytedance.android.livesdk.gift.model.i r7, java.lang.String r8, int r9) {
        /*
            r1 = this;
            if (r6 == 0) goto L_0x000e
            if (r5 != 0) goto L_0x000a
            boolean r0 = com.bytedance.android.live.core.utils.g.a(r2)
            if (r0 == 0) goto L_0x000e
        L_0x000a:
            r0 = 2131493754(0x7f0c037a, float:1.8610997E38)
            goto L_0x0011
        L_0x000e:
            r0 = 2131493753(0x7f0c0379, float:1.8610995E38)
        L_0x0011:
            r1.<init>(r2, r0)
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r1.f15062e = r0
            com.bytedance.android.livesdkapi.depend.c.a r0 = new com.bytedance.android.livesdkapi.depend.c.a
            r0.<init>(r1)
            r1.r = r0
            r0 = 0
            r1.g = r0
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.a.H
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.w = r0
            r1.h = r2
            r1.f15059b = r3
            r1.k = r4
            r1.l = r5
            r1.m = r6
            r1.n = r7
            if (r4 != 0) goto L_0x0044
            int r2 = com.bytedance.android.livesdk.j.c.i.f15691a
            goto L_0x0046
        L_0x0044:
            int r2 = com.bytedance.android.livesdk.j.c.i.f15692b
        L_0x0046:
            r1.o = r2
            r1.q = r8
            r1.v = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.impl.b.<init>(android.app.Activity, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.live.base.model.user.User, boolean, boolean, com.bytedance.android.livesdk.gift.model.i, java.lang.String, int):void");
    }
}
