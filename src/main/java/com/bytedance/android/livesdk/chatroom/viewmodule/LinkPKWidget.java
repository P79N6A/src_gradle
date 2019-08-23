package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.AnimatorSet;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SubscriptSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.chatroom.c.d;
import com.bytedance.android.livesdk.chatroom.interact.c.fl;
import com.bytedance.android.livesdk.chatroom.interact.c.fv;
import com.bytedance.android.livesdk.chatroom.interact.c.fw;
import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.bytedance.android.livesdk.chatroom.model.g;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.effect.b.b;
import com.bytedance.android.livesdk.sticker.i;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.GradientTextView;
import com.bytedance.android.livesdk.widget.PKProgressBar;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.a;

public class LinkPKWidget extends LinkCrossRoomWidget.SubWidget implements Observer<KVData>, View.OnClickListener, fl.a {
    private static final /* synthetic */ a.C0900a G;

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f12635e;
    private boolean A;
    private Disposable B;
    private LinkCrossRoomWidget.SubWidget C;
    private i D;
    private b E;
    private Random F;

    /* renamed from: f  reason: collision with root package name */
    TextView f12636f;
    ImageView g;
    TextView h;
    ImageView i;
    SimpleDraweeView j;
    View k;
    AnimatorSet l;
    AnimatorSet m;
    fl n;
    private View o;
    private ViewGroup p;
    private GradientTextView q;
    private ImageView r;
    private ImageView s;
    private TextView t;
    private m u;
    private d v;
    private c<PKProgressBar> w;
    private c<TextView> x;
    private m y;
    private boolean z;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12635e, false, 7147, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7147, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12635e, false, 7148, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12635e, false, 7148, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.amu;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7132, new Class[0], Void.TYPE);
            return;
        }
        if (this.C == null && com.bytedance.android.live.uikit.a.a.d()) {
            this.C = new LinkPkTaskWidget(this.contentView, this.containerView);
            this.subWidgetManager.load(this.C);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7135, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            ai.a((int) C0906R.string.d4m);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7128, new Class[0], Void.TYPE);
            return;
        }
        this.n.d();
        this.f12607b.removeObserver(this);
        this.v.a();
        if (this.B != null) {
            this.B.dispose();
        }
        super.onDestroy();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12635e, true, 7146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12635e, true, 7146, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LinkPKWidget.java", LinkPKWidget.class);
        G = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.LinkPKWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 219);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7136, new Class[0], Void.TYPE);
            return;
        }
        ((PKProgressBar) this.w.f9861c).setVisibility(0);
        this.o.setVisibility(0);
        if (((Integer) this.f12607b.get("data_pk_battle_mode", 0)).intValue() == 0) {
            this.p.setVisibility(0);
        }
        this.f12607b.lambda$put$1$DataCenter("cmd_pk_show_interface", new g());
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7142, new Class[0], Void.TYPE);
            return;
        }
        if (!(!this.f12609d || this.E == null || this.D == null)) {
            b bVar = this.D.f17288d;
            if (bVar != null && bVar.f14779a == this.E.f14779a) {
                this.D.b();
            }
        }
        this.f12607b.r = LinkCrossRoomDataHolder.b.HIDE;
        this.E = null;
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7144, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7144, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f12607b.p != 1 || com.bytedance.android.livesdkapi.a.a.f18614b || !com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.f()) {
            return false;
        } else {
            return true;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7134, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (this.y == null) {
                this.y = new m.a(this.context).d((int) C0906R.string.d4e).c((int) C0906R.string.d4n).b(0, (int) C0906R.string.d4b, (DialogInterface.OnClickListener) new ch(this)).b(1, (int) C0906R.string.d70, (DialogInterface.OnClickListener) new ci(this)).a();
            }
            if (!this.y.isShowing()) {
                this.y.show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7139, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f12609d) {
            this.A = true;
            if (this.f12607b.k != 0) {
                a((com.bytedance.android.live.core.network.response.d) this.f12607b.get("data_pk_current_room_interact_info"));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        String str;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7140, new Class[0], Void.TYPE);
            return;
        }
        LinkCrossRoomDataHolder.d dVar = (LinkCrossRoomDataHolder.d) LinkCrossRoomDataHolder.a().get("data_pk_state");
        if (dVar == LinkCrossRoomDataHolder.d.PK) {
            if (!((String) com.bytedance.android.livesdk.w.b.k.a()).equals(ah.b(System.currentTimeMillis()))) {
                com.bytedance.android.livesdk.w.b.aw.a(Integer.valueOf(((Integer) com.bytedance.android.livesdk.w.b.j.a()).intValue()));
                com.bytedance.android.livesdk.w.b.k.a(ah.b(System.currentTimeMillis()));
            } else if (((Integer) com.bytedance.android.livesdk.w.b.aw.a()).intValue() <= 0) {
                ai.a((int) C0906R.string.d4r);
                return;
            }
        }
        if (this.u == null) {
            Context context = this.context;
            if (com.bytedance.android.live.uikit.a.a.f()) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            this.u = new m.a(context, i2).a((CharSequence) ac.a((int) C0906R.string.d4x)).b(0, (int) C0906R.string.d30, (DialogInterface.OnClickListener) new cl(this, dVar)).b(1, (int) C0906R.string.cpz, cm.f13087b).a();
        }
        if (dVar == LinkCrossRoomDataHolder.d.PK) {
            TextView textView = this.u.f18499b;
            textView.setGravity(17);
            if (com.bytedance.android.live.uikit.a.a.f()) {
                textView.setVisibility(0);
                this.u.setTitle((CharSequence) ac.a((int) C0906R.string.d54, com.bytedance.android.livesdk.w.b.aw.a()));
                if (this.u.f18502e != null) {
                    this.u.f18502e.setVisibility(0);
                }
                String valueOf = String.valueOf(com.bytedance.android.livesdk.w.b.j.a());
                str = ac.a((int) C0906R.string.d4y, valueOf, valueOf);
            } else {
                textView.setVisibility(8);
                str = ac.a((int) C0906R.string.d4y, com.bytedance.android.livesdk.w.b.aw.a(), com.bytedance.android.livesdk.w.b.i.a());
            }
            if (com.bytedance.android.live.uikit.a.a.f()) {
                this.u.a((CharSequence) str);
                this.u.f18500c.setGravity(3);
            } else {
                String[] split = str.split("\n");
                int length = split[split.length - 1].length();
                SpannableString spannableString = new SpannableString(str);
                cn.a(spannableString, new ForegroundColorSpan(this.context.getResources().getColor(C0906R.color.adx)), 0, spannableString.length() - length, 17);
                cn.a(spannableString, new ForegroundColorSpan(this.context.getResources().getColor(C0906R.color.a_b)), (spannableString.length() - length) - 1, spannableString.length(), 17);
                cn.a(spannableString, new SubscriptSpan(), (spannableString.length() - length) - 1, spannableString.length(), 17);
                cn.a(spannableString, new RelativeSizeSpan(1.1428572f), (spannableString.length() - length) - 1, spannableString.length(), 17);
                this.u.a((CharSequence) spannableString);
                this.u.f18500c.setLineSpacing(0.0f, 1.1f);
                this.u.f18500c.setGravity(17);
            }
            this.u.f18500c.setVisibility(0);
        } else {
            this.u.f18499b.setGravity(8388611);
            this.u.setTitle((int) C0906R.string.d4x);
            this.u.f18499b.setVisibility(0);
            this.u.f18500c.setVisibility(8);
        }
        if (!this.u.isShowing()) {
            this.u.show();
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7127, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.o = this.contentView.findViewById(C0906R.id.kn);
        this.q = (GradientTextView) this.contentView.findViewById(C0906R.id.dga);
        if (com.bytedance.android.live.uikit.a.a.c()) {
            this.q.setColorList(new int[]{-52603, -60622});
        } else if (com.bytedance.android.live.uikit.a.a.e()) {
            this.q.setColorList(new int[]{-501415, -501415});
        }
        this.p = (ViewGroup) this.contentView.findViewById(C0906R.id.bac);
        this.k = this.contentView.findViewById(C0906R.id.z1);
        this.j = (SimpleDraweeView) this.contentView.findViewById(C0906R.id.b3y);
        this.f12636f = (TextView) this.contentView.findViewById(C0906R.id.dck);
        this.g = (ImageView) this.contentView.findViewById(C0906R.id.b1r);
        this.h = (TextView) this.contentView.findViewById(C0906R.id.dlh);
        this.i = (ImageView) this.contentView.findViewById(C0906R.id.b6e);
        this.t = (TextView) this.contentView.findViewById(C0906R.id.d96);
        this.t.setOnClickListener(this);
        this.r = (ImageView) this.contentView.findViewById(C0906R.id.b40);
        this.s = (ImageView) this.contentView.findViewById(C0906R.id.b2o);
        this.o.setVisibility(4);
        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7130, new Class[0], Void.TYPE);
        } else {
            this.v = new d(this.f12607b, this.contentView);
            this.w = this.v.a(C0906R.id.byc).a(cb.f13064b).a("data_pk_anchor_score", cc.f13066b).a("data_pk_guest_score", cf.f13072b).a();
            this.x = this.v.a(C0906R.id.dkg).a("data_pk_time_left", cg.f13074b).a();
        }
        this.f12607b.observe("data_pk_state", this).observe("data_link_state", this).observe("data_pk_result", this).observe("data_pk_current_room_interact_info", this);
        this.n = new fl(this.dataCenter);
        this.n.a((fl.a) this);
        enableSubWidgetManager();
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            LinkPKStealTowerWidget linkPKStealTowerWidget = new LinkPKStealTowerWidget(this.contentView, this.containerView);
            this.subWidgetManager.load(linkPKStealTowerWidget).load(new LinkPKMvpWidget(this.contentView, this.containerView));
        }
        if (i()) {
            this.r.setImageResource(2130841306);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12635e, false, 7133, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12635e, false, 7133, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.q.setVisibility(8);
    }

    private void a(com.bytedance.android.live.core.network.response.d<p> dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f12635e, false, 7143, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f12635e, false, 7143, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
            return;
        }
        if (this.A) {
            this.A = false;
            long a2 = (com.bytedance.android.livesdk.utils.a.a.a() - this.f12607b.k) / 1000;
            if (i()) {
                this.r.setImageResource(2130841306);
            }
            if (this.f12607b.i > 0 && a2 < ((long) (this.f12607b.i + this.f12607b.q))) {
                g();
                if (a2 < ((long) this.f12607b.i) && (!this.f12607b.s.h || !this.f12607b.s.f9038f)) {
                    this.q.setVisibility(8);
                    a(false);
                    if (!(dVar == null || dVar.f7871b == null || ((p) dVar.f7871b).f11075f == null || !((p) dVar.f7871b).f11075f.f11034a)) {
                        b();
                    }
                }
            }
        }
    }

    public void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f12635e, false, 7129, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f12635e, false, 7129, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(G, this, this, view2));
        if (view.getId() == C0906R.id.d96) {
            fl flVar = this.n;
            if (PatchProxy.isSupport(new Object[0], flVar, fl.f10687a, false, 4946, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], flVar, fl.f10687a, false, 4946, new Class[0], Void.TYPE);
            } else if (flVar.b() != null) {
                LinkCrossRoomDataHolder.d dVar = (LinkCrossRoomDataHolder.d) LinkCrossRoomDataHolder.a().get("data_pk_state");
                if (!flVar.f10691e && dVar == LinkCrossRoomDataHolder.d.PENAL) {
                    flVar.f10691e = true;
                    flVar.f10692f = true;
                    ((ab) j.q().d().b().battleInvite(flVar.f10690d.f9030d).as(flVar.p())).a(new fv(flVar), new fw(flVar));
                    com.bytedance.android.livesdk.j.a.a().a("pk_oncemore_invite", new com.bytedance.android.livesdk.j.c.j().b("live").f("other").a("live_detail"), new com.bytedance.android.livesdk.j.c.g().a(flVar.f10688b.getOwner().getId()).b(flVar.f10690d.f9032f), LinkCrossRoomDataHolder.a().b(), Room.class);
                }
            }
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12635e, false, 7145, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f12635e, false, 7145, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.z || this.f12609d || z2) {
            this.z = false;
            if (com.bytedance.android.live.uikit.a.a.a()) {
                TTLiveSDKContext.getHostService().c().a((View) this.j, "asset://com.ss.android.ies.live.sdk/pk_animation.webp", Bitmap.Config.ARGB_8888);
            } else {
                this.j.setController(((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri("asset://com.ss.android.ies.live.sdk/pk_animation.webp").setAutoPlayAnimations(true)).build());
            }
            this.j.setVisibility(0);
            this.B = Observable.timer(2000, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new cd(this), new ce(this));
        } else {
            this.z = true;
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        b bVar;
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12635e, false, 7126, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12635e, false, 7126, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1692693464) {
                if (hashCode != 872172481) {
                    if (hashCode == 1505611330 && key.equals("data_pk_state")) {
                        c2 = 0;
                    }
                } else if (key.equals("data_link_state")) {
                    c2 = 2;
                }
            } else if (key.equals("data_pk_current_room_interact_info")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    LinkCrossRoomDataHolder.d dVar = (LinkCrossRoomDataHolder.d) kVData.getData();
                    if (dVar == LinkCrossRoomDataHolder.d.PK) {
                        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7131, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7131, new Class[0], Void.TYPE);
                        } else {
                            if (this.f12609d) {
                                g();
                            }
                            this.g.setVisibility(8);
                            this.i.setVisibility(8);
                            ((TextView) this.x.f9861c).setVisibility(0);
                            this.f12636f.setVisibility(8);
                            this.h.setVisibility(8);
                            if (i()) {
                                this.r.setImageResource(2130841306);
                            }
                            this.r.setVisibility(0);
                            this.s.setVisibility(8);
                            this.q.setVisibility(8);
                            this.t.setVisibility(8);
                            if (this.y != null && this.y.isShowing()) {
                                this.y.dismiss();
                            }
                        }
                    } else if (dVar == LinkCrossRoomDataHolder.d.PENAL) {
                        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7137, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7137, new Class[0], Void.TYPE);
                        } else if (isViewValid()) {
                            this.q.setGradient(false);
                            this.q.setText(ac.a((int) C0906R.string.d5v));
                            this.q.setVisibility(0);
                            this.r.setVisibility(8);
                            this.s.setVisibility(8);
                            LinkCrossRoomDataHolder.c cVar = (LinkCrossRoomDataHolder.c) this.f12607b.get("data_pk_result");
                            if (cVar == LinkCrossRoomDataHolder.c.EVEN) {
                                this.g.setImageResource(2130841293);
                                this.i.setImageResource(2130841293);
                            } else if (cVar == LinkCrossRoomDataHolder.c.LEFT_WON) {
                                this.g.setImageResource(2130841294);
                                this.i.setImageResource(2130841295);
                            } else {
                                this.g.setImageResource(2130841295);
                                this.i.setImageResource(2130841294);
                            }
                            this.f12636f.setText(String.valueOf(((PKProgressBar) this.w.f9861c).getRightValue()));
                            this.h.setText(String.valueOf(((PKProgressBar) this.w.f9861c).getLeftValue()));
                            this.i.setScaleX(1.0f);
                            this.i.setScaleY(1.0f);
                            this.i.setTranslationX(0.0f);
                            this.i.setTranslationY(0.0f);
                            this.g.setScaleX(1.0f);
                            this.g.setScaleY(1.0f);
                            this.g.setTranslationX(0.0f);
                            this.g.setTranslationY(0.0f);
                            if (!com.bytedance.android.live.uikit.a.a.f()) {
                                this.h.setVisibility(0);
                                this.f12636f.setVisibility(0);
                            }
                            this.i.setVisibility(0);
                            this.g.setVisibility(0);
                            if (this.f12609d) {
                                if (com.bytedance.android.livesdkapi.a.a.f18616d || this.f12607b.p == 0) {
                                    this.t.setVisibility(0);
                                }
                                if (cVar == LinkCrossRoomDataHolder.c.RIGHT_WON) {
                                    if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7141, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7141, new Class[0], Void.TYPE);
                                    } else {
                                        if (this.D == null) {
                                            this.D = (i) this.dataCenter.get("data_sticker_message_manager");
                                        }
                                        if (this.D != null) {
                                            Integer[] numArr = (Integer[]) LiveConfigSettingKeys.PK_PANEL_STICKER.a();
                                            if (numArr != null && numArr.length > 0) {
                                                if (this.F == null) {
                                                    this.F = new Random();
                                                }
                                                int intValue = numArr[this.F.nextInt(numArr.length)].intValue();
                                                int intValue2 = ((Integer) LiveConfigSettingKeys.PK_PANEL_STICKER_DURATION.a()).intValue();
                                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), (byte) 1, Integer.valueOf(intValue2), (byte) 0}, null, com.bytedance.android.livesdk.chatroom.bl.c.f9787a, true, 3961, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, b.class)) {
                                                    bVar = (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), (byte) 1, Integer.valueOf(intValue2), (byte) 0}, null, com.bytedance.android.livesdk.chatroom.bl.c.f9787a, true, 3961, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, b.class);
                                                } else {
                                                    long j2 = (long) intValue;
                                                    String assetsPath = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getAssetsPath("effects", j2);
                                                    if (StringUtils.isEmpty(assetsPath)) {
                                                        bVar = null;
                                                    } else {
                                                        bVar = (b) new b().b(false).d((long) intValue2).a(System.currentTimeMillis()).b(j2).a(assetsPath).a(true);
                                                    }
                                                }
                                                this.E = bVar;
                                                if (this.E != null) {
                                                    this.f12607b.r = LinkCrossRoomDataHolder.b.SHOW;
                                                    this.D.a(this.E);
                                                    b bVar2 = this.D.f17288d;
                                                    if (!(bVar2 == null || bVar2.f14779a == this.E.f14779a)) {
                                                        this.D.b();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ((ab) Observable.timer(3, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).as(autoDispose())).a(new cj(this), new ck(this));
                        }
                    } else if (dVar == LinkCrossRoomDataHolder.d.FINISHED) {
                        if (PatchProxy.isSupport(new Object[0], this, f12635e, false, 7138, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f12635e, false, 7138, new Class[0], Void.TYPE);
                        } else {
                            this.i.setVisibility(8);
                            this.g.setVisibility(8);
                            PKProgressBar pKProgressBar = (PKProgressBar) this.w.f9861c;
                            if (PatchProxy.isSupport(new Object[0], pKProgressBar, PKProgressBar.f18310a, false, 14611, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], pKProgressBar, PKProgressBar.f18310a, false, 14611, new Class[0], Void.TYPE);
                            } else {
                                pKProgressBar.f18314e = 0;
                                pKProgressBar.f18315f = 0;
                                pKProgressBar.f18311b = 0.5f;
                                pKProgressBar.invalidate();
                            }
                            this.p.setVisibility(0);
                            this.r.setVisibility(8);
                            this.s.setVisibility(0);
                            ((TextView) this.x.f9861c).setVisibility(8);
                            this.q.setText(ac.a((int) C0906R.string.d58));
                            this.q.setVisibility(0);
                            this.q.setGradient(true);
                            if (com.bytedance.android.live.uikit.a.a.a()) {
                                GradientTextView gradientTextView = this.q;
                                int parseColor = Color.parseColor("#ffca69e1");
                                int parseColor2 = Color.parseColor("#ff7851ff");
                                gradientTextView.f18233c = true;
                                gradientTextView.f18232b = new int[]{parseColor, parseColor2};
                            }
                            ((PKProgressBar) this.w.f9861c).setVisibility(8);
                            this.o.setVisibility(8);
                            this.t.setVisibility(8);
                            if (this.y != null && this.y.isShowing()) {
                                this.y.dismiss();
                            }
                            this.f12607b.i = 0;
                            if (this.f12607b.p == 1 && ((Boolean) com.bytedance.android.livesdk.w.b.aG.a()).booleanValue()) {
                                this.f12607b.lambda$put$1$DataCenter("cmd_stop_interact", Boolean.FALSE);
                            }
                        }
                    }
                    if (LinkCrossRoomDataHolder.b.SHOW == this.f12607b.r && dVar != LinkCrossRoomDataHolder.d.PENAL) {
                        h();
                        return;
                    }
                case 1:
                    a((com.bytedance.android.live.core.network.response.d) kVData.getData());
                    return;
                case 2:
                    if (LinkCrossRoomDataHolder.a.UNLOADED.equals((LinkCrossRoomDataHolder.a) kVData.getData()) && this.f12607b.i > 0) {
                        h();
                        break;
                    }
            }
        }
    }

    LinkPKWidget(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
        TTLiveSDKContext.getHostService().c().c();
    }
}
