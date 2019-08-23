package com.ss.android.ugc.aweme.feed.c;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.neverland.Neverland;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.ab;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.commercialize.feed.ae;
import com.ss.android.ugc.aweme.commercialize.feed.af;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.splash.h;
import com.ss.android.ugc.aweme.commercialize.utils.ad;
import com.ss.android.ugc.aweme.commercialize.utils.ak;
import com.ss.android.ugc.aweme.commercialize.utils.s;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.ah;
import com.ss.android.ugc.aweme.feed.f.u;
import com.ss.android.ugc.aweme.feed.k.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.main.ca;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;
import com.ss.android.ugc.aweme.player.a.c;
import com.ss.android.ugc.aweme.player.a.e;
import com.ss.android.ugc.aweme.player.a.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import com.ss.android.ugc.aweme.shortvideo.av;
import com.ss.android.ugc.aweme.shortvideo.f.f;
import com.ss.android.ugc.aweme.store.TaskRecord;
import com.ss.android.ugc.aweme.store.d;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.u.aq;
import com.ss.android.ugc.aweme.u.ar;
import com.ss.android.ugc.aweme.u.as;
import com.ss.android.ugc.aweme.utils.at;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.d;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.w;
import com.ss.android.ugc.aweme.video.z;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.playerkit.session.Session;
import com.toutiao.proxyserver.Proxy;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n extends a implements ScreenBroadcastReceiver.a, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45106a;

    /* renamed from: b  reason: collision with root package name */
    protected static final String f45107b = BaseListFragmentPanel.class.getSimpleName();
    public String A = "";
    public String B;
    double C = -0.5d;
    public boolean D = true;
    public o E;
    private BaseListFragmentPanel F;
    private KeyguardManager G;
    private boolean H;
    private long I;
    private long J;
    private long K = -1;
    private int L;
    private int M;
    private long N = -1;
    private long O;
    private int P;
    private String Q;
    private String R;
    private volatile boolean S;
    private boolean T;
    private long U;
    private ScreenBroadcastReceiver V;
    private Aweme W;
    private boolean X;
    private DisposableObserver Y;
    private final int Z = 1024;
    private final double aa = -0.5d;
    private bm ab;
    private boolean ac = true;
    private double ad;
    private boolean ae;
    private boolean af;
    private int ag;
    private boolean ah;
    private Set<String> ai;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45108c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45109d;

    /* renamed from: e  reason: collision with root package name */
    public long f45110e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f45111f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public com.ss.android.ugc.aweme.feed.b.a j;
    public int k;
    public j l;
    public l m;
    public k n;
    public Aweme w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* renamed from: com.ss.android.ugc.aweme.feed.c.n$9  reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f45141a = new int[c.a.values().length];

        static {
            try {
                f45141a[c.a.Ijk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final String l() {
        return this.r;
    }

    private boolean a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45106a, false, 40973, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f45106a, false, 40973, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return this.q.getUserVisibleHint() && !p() && (d(true) || !ca.a().b()) && this.f45108c && (!z2 || !o()) && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().needRestore();
    }

    private static boolean a(@NonNull IFeedPlayerView iFeedPlayerView) {
        if (!PatchProxy.isSupport(new Object[]{iFeedPlayerView}, null, f45106a, true, 40984, new Class[]{IFeedPlayerView.class}, Boolean.TYPE)) {
            return iFeedPlayerView.q() == 2;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedPlayerView}, null, f45106a, true, 40984, new Class[]{IFeedPlayerView.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
        boolean z2;
        String str;
        long j2;
        bm bmVar;
        final com.ss.android.ugc.aweme.video.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f45106a, false, 40986, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f45106a, false, 40986, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        this.z = false;
        ag i2 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i2, ag.f3141a, false, 40175, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i2, ag.f3141a, false, 40175, new Class[0], Void.TYPE);
        } else if (i2.u > 0) {
            i2.h();
        } else {
            i2.u = SystemClock.uptimeMillis();
        }
        if (com.ss.android.g.a.a()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("video_view", aVar2.f76010a);
        }
        final IFeedViewHolder c2 = this.m.c(aVar2.f76010a);
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40979, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40979, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40980, new Class[0], bm.class)) {
                bmVar = (bm) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40980, new Class[0], bm.class);
            } else {
                if (this.ab == null) {
                    this.ab = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(i.a().getContext(), bm.class);
                }
                bmVar = this.ab;
            }
            z2 = bmVar.c(0) < g.b().aS().intValue();
        }
        if (z2) {
            bg.a(new u(!b.d(c2)));
        }
        if (c2 != null && c2.k() != null) {
            if (!j() || !n()) {
                if (!o.v()) {
                    m().h();
                } else {
                    com.ss.android.ugc.playerkit.videoview.g m2 = c2.m();
                    if (m2 != null) {
                        m2.T();
                    }
                }
                d.b().c();
                return;
            }
            com.ss.android.ugc.playerkit.b.b.a(f45107b, "onRenderReady() called");
            this.H = true;
            this.f45109d = true;
            if (j()) {
                c2.k().a(aVar2);
                h hVar = h.i;
                Context d2 = d();
                Aweme h2 = h();
                if (PatchProxy.isSupport(new Object[]{d2, h2}, hVar, h.f2931a, false, 32019, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{d2, h2}, hVar, h.f2931a, false, 32019, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                } else {
                    h.f2933c = System.currentTimeMillis();
                    if (PatchProxy.isSupport(new Object[]{d2, h2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31673, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{d2, h2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31673, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                    } else if (com.ss.android.ugc.aweme.commercialize.utils.c.Q(h2) && h.b() != 0) {
                        int i3 = !h.d() ? 2 : 1;
                        long currentTimeMillis = System.currentTimeMillis() - h.b();
                        h.a(0);
                        HashMap hashMap = new HashMap();
                        hashMap.put("splashduration", String.valueOf(currentTimeMillis));
                        hashMap.put("awemelaunch", String.valueOf(i3));
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("ad_extra_data", new Gson().toJson((Object) hashMap));
                        com.ss.android.ugc.aweme.commercialize.log.g.b(d2, "splash_show", h2, com.ss.android.ugc.aweme.commercialize.log.g.a(d2, h2, "awesome splash feed show", false, (Map<String, String>) hashMap2));
                    }
                    if (h.f2934d) {
                        if (PatchProxy.isSupport(new Object[]{d2, h2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31668, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{d2, h2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31668, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.Q(h2)) {
                            if (PatchProxy.isSupport(new Object[]{d2, h2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31669, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{d2, h2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31669, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            } else if (com.ss.android.ugc.aweme.commercialize.log.g.a() && com.ss.android.ugc.aweme.commercialize.log.g.S(d2, h2)) {
                                com.ss.android.ugc.aweme.commercialize.log.g.b(d2, "first_view", h2, com.ss.android.ugc.aweme.commercialize.log.g.c(d2, h2, com.ss.android.ugc.aweme.commercialize.log.g.b((JSONObject) null)));
                            }
                        } else {
                            if (PatchProxy.isSupport(new Object[]{d2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31671, new Class[]{Context.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{d2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31671, new Class[]{Context.class}, Void.TYPE);
                            } else if (com.ss.android.ugc.aweme.commercialize.log.g.a()) {
                                r.a(d2, "splash_ad", "first_view", "-1", 0, com.ss.android.ugc.aweme.commercialize.log.g.b((JSONObject) null));
                            }
                        }
                    }
                }
                if (a(c2.k())) {
                    this.Q = c2.d().getAid();
                    q();
                }
                if (b.f(c2)) {
                    if (c2.d() != null && c2.d().isVr() && z.f76282a) {
                        z.a(false);
                        com.bytedance.ies.dmt.ui.d.a.c((Context) c(), com.ss.android.ugc.aweme.base.utils.o.b(C0906R.string.bck)).a();
                    }
                    if (b.a(c2)) {
                        com.ss.android.ugc.aweme.commerce.b.a.a();
                        d();
                        c2.k().x();
                    }
                    this.f45110e = System.currentTimeMillis();
                    this.ad = com.ss.android.ugc.aweme.base.utils.r.a();
                    e a2 = a(c2);
                    if (a2 != null) {
                        a2.a(1, this.k + 1);
                    }
                    if (this.g == -1) {
                        this.f45111f = System.currentTimeMillis();
                    } else {
                        this.g = -1;
                        this.f45111f = System.currentTimeMillis();
                    }
                    this.h = -1;
                    if (a2 != null && a2.b()) {
                        CommerceVideoDelegate r = c2.r();
                        if (PatchProxy.isSupport(new Object[0], r, CommerceVideoDelegate.f38685b, false, 30658, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], r, CommerceVideoDelegate.f38685b, false, 30658, new Class[0], Void.TYPE);
                        } else {
                            r.oldAdBottomLabelView.m();
                            r.newAdBottomLabelView.m();
                        }
                    }
                    Aweme d3 = c2.d();
                    if (d3 != null && d3.isAd()) {
                        this.P = d3.getAwemeRawAd().getShowMaskTimes();
                    }
                    c(c2);
                    com.ss.android.ugc.aweme.utils.o.a();
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.ak.a.f33294a, true, 81958, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.ak.a.f33294a, true, 81958, new Class[0], Void.TYPE);
                    }
                    int awemeType = c2.d() != null ? c2.d().getAwemeType() : 0;
                    if (awemeType == 0) {
                        com.ss.android.ugc.aweme.feed.z.a(aVar2.f76010a);
                    }
                    String str2 = aVar2.f76010a;
                    String str3 = str2;
                    int i4 = awemeType;
                    if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(awemeType)}, this, f45106a, false, 40991, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i4)}, this, f45106a, false, 40991, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.feed.b.a(this.s, str3, i4);
                    }
                    if (b.d(c2)) {
                        r.onEvent(MobClick.obtain().setEventName("ad_play").setExtValueString(c2.d().getAid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("request_id", r().optString("request_id")).b()));
                    }
                    if (this.s == 0) {
                        JSONObject d4 = d(c2);
                        try {
                            ab a3 = ab.a();
                            if (PatchProxy.isSupport(new Object[0], a3, ab.f2618a, false, 22514, new Class[0], Long.TYPE)) {
                                j2 = ((Long) PatchProxy.accessDispatch(new Object[0], a3, ab.f2618a, false, 22514, new Class[0], Long.TYPE)).longValue();
                            } else {
                                j2 = Math.max(0, a3.f2619b);
                            }
                            d4.put("feed_count", j2);
                        } catch (Exception unused) {
                        }
                        r.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("homepage_hot").setValue(aVar2.f76010a).setJsonObject(d4));
                    } else if (Math.abs(this.s - 1000) < 100) {
                        r.a(d(), "video_play", "personal_homepage", aVar2.f76010a, 0, r());
                    } else if (Math.abs(this.s - 8000) < 100) {
                        r.a(d(), "video_play", "toplist_friend", aVar2.f76010a, 0, r());
                        r.a(d(), "show", "toplist_friend", aVar2.f76010a, 0, r());
                    } else if (Math.abs(this.s - 2000) < 100) {
                        if (TextUtils.equals("update_tips", l())) {
                            r.a(d(), "video_play", "update_tips", aVar2.f76010a, 0, r());
                        } else {
                            r.a(d(), "video_play", "others_homepage", aVar2.f76010a, 0, com.ss.android.ugc.aweme.app.d.c.a(r()).a("enter_from_request", this.l.N()).b());
                        }
                    } else if (!TextUtils.equals(this.r, "opus") && !com.ss.android.g.a.b()) {
                        r.onEvent(MobClick.obtain().setEventName("video_play").setLabelName(l()).setValue(aa.m(d3)).setJsonObject(this.l.c(d3).b()));
                    }
                    String str4 = aVar2.f76010a;
                    if (PatchProxy.isSupport(new Object[]{c2, str4}, this, f45106a, false, 40987, new Class[]{IFeedViewHolder.class, String.class}, String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[]{c2, str4}, this, f45106a, false, 40987, new Class[]{IFeedViewHolder.class, String.class}, String.class);
                    } else {
                        str = "";
                        if (c2 != null && TextUtils.equals(aa.m(c2.d()), str4)) {
                            str = aa.a(c2.d());
                        }
                    }
                    this.R = str;
                    if (!com.ss.android.g.a.a()) {
                        ar e2 = new ar().a(this.r).b(d3, this.s).e(m().m().toString());
                        e2.u = aVar2.f76011b ? 1 : 0;
                        boolean w2 = w();
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(w2 ? 1 : 0)}, e2, ar.f75067a, false, 58962, new Class[]{Integer.TYPE}, ar.class)) {
                            e2 = (ar) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(w2)}, e2, ar.f75067a, false, 58962, new Class[]{Integer.TYPE}, ar.class);
                        } else {
                            e2.f75068b = Integer.valueOf(w2);
                        }
                        e2.f75069c = this.l.P();
                        ar c3 = e2.c(this.l.O());
                        c3.f75070d = this.l.N();
                        c3.s = this.l.Q();
                        c3.t = this.A;
                        ar g2 = ((ar) c3.j(this.l.B())).g(this.l.R());
                        if (!TextUtils.isEmpty(this.l.S())) {
                            g2.f(this.l.S());
                        }
                        if (this.F != null && ("homepage_fresh".equalsIgnoreCase(this.r) || "poi_page".equalsIgnoreCase(this.r))) {
                            g2.f((!this.F.ar() || this.ae) ? "slide" : "click");
                            this.ae = true;
                        }
                        Context d5 = d();
                        g2.a(PatchProxy.isSupport(new Object[]{d5}, null, SpotChangeCallBack.f42413a, true, 36541, new Class[]{Context.class}, Map.class) ? (Map) PatchProxy.accessDispatch(new Object[]{d5}, null, SpotChangeCallBack.f42413a, true, 36541, new Class[]{Context.class}, Map.class) : SpotChangeCallBack.f42414d.b(d5));
                        g2.e();
                        if (d() instanceof Activity) {
                            Intent intent = ((Activity) d()).getIntent();
                            if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                                String stringExtra = intent.getStringExtra("rule_id");
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    ar h3 = new ar("video_play_from_push").a(this.r).h(stringExtra);
                                    if (!TextUtils.isEmpty(this.l.S())) {
                                        g2.f(this.l.S());
                                    }
                                    h3.e();
                                }
                            }
                        }
                        if (TextUtils.equals(this.l.O(), "search_result") || TextUtils.equals(this.l.O(), "general_search")) {
                            j.f42669b.a("search_video_play", d3, this.r, TextUtils.equals(this.l.O(), "search_result"));
                        }
                        if (com.ss.android.ugc.aweme.commercialize.utils.c.u(c2.d())) {
                            Aweme d6 = c2.d();
                            if (PatchProxy.isSupport(new Object[]{d6}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31736, new Class[]{Aweme.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{d6}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31736, new Class[]{Aweme.class}, Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.commercialize.log.g.a(com.ss.android.ugc.aweme.base.utils.d.a(), "draw_ad", "uniplay", d6, com.ss.android.ugc.aweme.commercialize.log.g.f(com.ss.android.ugc.aweme.base.utils.d.a(), d6, "uniplay"));
                            }
                        }
                    } else if (!this.S) {
                        Aweme d7 = c2.d();
                        if (d7 != null) {
                            ar g3 = ((ar) new ar().a(this.r).c(this.l.O()).b(d7, this.s).e(com.ss.android.ugc.aweme.video.h.b().name()).j(this.l.B())).g(this.l.R());
                            if (!TextUtils.isEmpty(this.l.S())) {
                                g3.f(this.l.S());
                            }
                            g3.v = this.l.J();
                            g3.w = this.l.K();
                            g3.x = this.l.L();
                            g3.e();
                            if (d() instanceof Activity) {
                                Intent intent2 = ((Activity) d()).getIntent();
                                if (intent2 != null && intent2.getBooleanExtra("from_notification", false)) {
                                    String stringExtra2 = intent2.getStringExtra("rule_id");
                                    if (!TextUtils.isEmpty(stringExtra2)) {
                                        ar h4 = new ar("video_play_from_push").a(this.r).h(stringExtra2);
                                        if (!TextUtils.isEmpty(this.l.S())) {
                                            g3.f(this.l.S());
                                        }
                                        h4.e();
                                    }
                                }
                            }
                            if (TextUtils.equals(this.l.O(), "search_result") || TextUtils.equals(this.l.O(), "general_search") || TextUtils.equals(this.l.O(), "search_for_you_list")) {
                                j.f42669b.a("search_video_play", d3, this.r, TextUtils.equals(this.l.O(), "search_result") || TextUtils.equals(this.l.O(), "search_for_you_list"));
                            }
                        }
                    }
                    this.n.Y();
                    if (!c2.d().isLive() && this.F.aq()) {
                        c2.k().A();
                    }
                    final Video video = c2.d().getVideo();
                    if (video != null) {
                        com.ss.android.b.a.a.a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f45112a;

                            public final void run() {
                                JSONObject jSONObject;
                                String str;
                                String str2;
                                String str3;
                                if (PatchProxy.isSupport(new Object[0], this, f45112a, false, 41069, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f45112a, false, 41069, new Class[0], Void.TYPE);
                                    return;
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("netWorkQuality", com.facebook.d.a.b.a().b().toString());
                                    jSONObject2.put("netWorkSpeed", (int) com.facebook.d.a.b.a().c());
                                    jSONObject2.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
                                    com.ss.android.ugc.aweme.video.e.c.a(jSONObject2);
                                    File a2 = com.ss.android.ugc.aweme.video.b.a(com.ss.android.ugc.aweme.video.b.c(), "cache");
                                    if (a2 == null) {
                                        str2 = "";
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(a2.getPath());
                                        sb.append("/");
                                        if (com.ss.android.g.a.a()) {
                                            str3 = video.getPlayAddr().getBitRatedRatioUri();
                                        } else {
                                            str3 = video.getProperPlayAddr().getUri();
                                        }
                                        sb.append(com.toutiao.proxyserver.f.a.a(str3));
                                        str2 = new com.ss.android.ugc.aweme.shortvideo.helper.c("file", sb.toString()).toString();
                                    }
                                    jSONObject2.put("file", str2);
                                } catch (Exception unused) {
                                }
                                com.ss.android.ugc.aweme.app.n.a("type_log_play_succuss", "play_success", jSONObject2);
                                com.ss.android.ugc.aweme.app.n.a("aweme_media_error_rate", 0, jSONObject2);
                                if (com.ss.android.g.a.a()) {
                                    if (VideoBitRateABManager.a().c()) {
                                        str = "aweme_media_bitrated_error_rate";
                                    } else {
                                        str = "aweme_media_original_error_rate";
                                    }
                                    com.ss.android.ugc.aweme.app.n.a(str, 0, jSONObject2);
                                }
                                if (b.d(c2)) {
                                    try {
                                        jSONObject = new JSONObject(jSONObject2.toString());
                                        jSONObject.put("aweme_id", c2.d().getAid());
                                        jSONObject.put("creative_id", c2.d().getAwemeRawAd().getCreativeId());
                                    } catch (Exception unused2) {
                                        jSONObject = new JSONObject();
                                    }
                                    com.ss.android.ugc.aweme.commercialize.log.e.a("aweme_ad_media_play_error_rate", 0, jSONObject);
                                    if (b.e(c2)) {
                                        com.ss.android.ugc.aweme.commercialize.log.a.a(c2.d(), 1, 0);
                                    }
                                }
                                if (b.e(c2) && aVar2 != null) {
                                    if (aVar2.f76012c / 1000 > 60 || aVar2.f76012c / 1000 < 7) {
                                        com.ss.android.ugc.aweme.commercialize.log.a.a(c2.d(), 4, 1);
                                        JSONObject jSONObject3 = new JSONObject();
                                        try {
                                            jSONObject3.put("alarm_reason", "duration_alarm");
                                            if (c2.d() != null) {
                                                jSONObject3.put("group_id", c2.d().getAid());
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        r.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject3));
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.commercialize.log.a.a(c2.d(), 4, 0);
                                }
                            }
                        });
                        if (aVar2.f76011b) {
                            a(video, true);
                        }
                    }
                    this.j.f45077a = 2;
                    if (!com.ss.android.g.a.a() || !com.ss.android.ugc.aweme.feed.guide.d.e()) {
                        this.n.ad();
                    }
                    if (com.ss.android.ugc.aweme.feed.guide.d.e()) {
                        this.n.c(1);
                    }
                    String str5 = f45107b;
                    com.ss.android.ugc.playerkit.b.b.a(str5, "onRenderReady() called with: playerEvent = [" + aVar2 + "]");
                    a(new f(0, aVar2.f76012c));
                    if (this.x) {
                        String str6 = aVar2.f76010a;
                        if (PatchProxy.isSupport(new Object[]{str6}, null, ak.f39701a, true, 32581, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str6}, null, ak.f39701a, true, 32581, new Class[]{String.class}, Void.TYPE);
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("source_id", str6);
                            } catch (JSONException unused2) {
                            }
                            com.ss.android.ugc.aweme.app.n.a("aweme_screen_ad_open_media_error_rate", 0, jSONObject);
                        }
                    }
                    this.n.u_();
                    ag i5 = ag.i();
                    if (PatchProxy.isSupport(new Object[0], i5, ag.f3141a, false, 40176, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], i5, ag.f3141a, false, 40176, new Class[0], Void.TYPE);
                    } else if (i5.v > 0) {
                        i5.h();
                    } else {
                        i5.v = SystemClock.uptimeMillis();
                    }
                }
            }
        }
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45106a, false, 40994, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45106a, false, 40994, new Class[]{String.class}, Void.TYPE);
        } else if (j()) {
            if (this.z) {
                this.g = -1;
                this.h = -1;
                this.f45111f = System.currentTimeMillis();
            }
            this.z = false;
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).readTaskPlayerCycle(3, false);
            org.greenrobot.eventbus.c a2 = org.greenrobot.eventbus.c.a();
            com.ss.android.ugc.aweme.feed.ui.seekbar.e eVar = new com.ss.android.ugc.aweme.feed.ui.seekbar.e(h(), this.r, this.s, 2, this.F);
            a2.d(eVar);
            v();
            this.ad = com.ss.android.ugc.aweme.base.utils.r.a();
            final IFeedViewHolder c2 = this.m.c(str2);
            if (this.af || c() == null || !com.ss.android.ugc.aweme.feed.g.f.b(c()) || !TextUtils.equals(str2, com.ss.android.ugc.aweme.feed.g.d.a().f45350c) || this.f45110e <= 0) {
                this.f45110e = System.currentTimeMillis();
            } else if (f(c2)) {
                c(c2);
                com.ss.android.ugc.aweme.feed.ui.seekbar.c cVar = new com.ss.android.ugc.aweme.feed.ui.seekbar.c(c2.d(), l(), this.s, null, this.F);
                bg.a(cVar);
            }
            this.af = true;
            this.Q = str2;
            if (f(c2)) {
                c2.k().b(str2);
                if (!this.T) {
                    this.n.Y();
                }
                if (!c2.d().isLive()) {
                    this.n.a((Runnable) new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45120a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f45120a, false, 41071, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f45120a, false, 41071, new Class[0], Void.TYPE);
                            } else if (n.this.j()) {
                                c2.k().z();
                            }
                        }
                    }, 400);
                } else {
                    q();
                }
                this.n.Z();
            }
            this.j.f45077a = 2;
            if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41023, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41023, new Class[0], Void.TYPE);
            } else {
                int ah2 = this.m.ah();
                int i2 = this.F.E ? ah2 + 1 : ah2 - 1;
                if (i2 >= 0 && i2 < this.m.ai() && ((this.m.d(ah2) == null || !this.m.d(ah2).isLive()) && (this.m.d(i2) == null || !this.m.d(i2).isLive()))) {
                    Aweme d2 = this.m.d(i2);
                    if (d2 != null) {
                        Video video = d2.getVideo();
                        if (!(video == null || video.getProperPlayAddr() == null)) {
                            video.setRationAndSourceId(d2.getAid());
                            if (AbTestManager.a().aY() != 2 || !w.a()) {
                                com.ss.android.ugc.aweme.video.preload.g.f().a(this.m.d(ah2 + 1));
                            }
                        }
                    }
                }
            }
            String str3 = f45107b;
            com.ss.android.ugc.playerkit.b.b.a(str3, "onResumePlay() called with: sourceId = [" + str2 + "]");
            a(new f(3));
            new com.ss.android.ugc.aweme.u.j().e();
            com.ss.android.ugc.aweme.feed.z.a(z.c.FEED);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b4, code lost:
        if (r4 == null) goto L_0x01b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.video.e r27) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f45106a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.video.e> r1 = com.ss.android.ugc.aweme.video.e.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 40996(0xa024, float:5.7448E-41)
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f45106a
            r3 = 0
            r4 = 40996(0xa024, float:5.7448E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.video.e> r1 = com.ss.android.ugc.aweme.video.e.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.playerkit.session.a r0 = com.ss.android.ugc.playerkit.session.a.a()
            java.lang.String r1 = r8.f76049b
            com.ss.android.ugc.playerkit.session.Session r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0052
            com.ss.android.ugc.playerkit.videoview.c.a r1 = com.ss.android.ugc.playerkit.videoview.c.a.a()
            java.lang.String r0 = r0.key
            com.ss.android.ugc.playerkit.session.b r0 = r1.c(r0)
            if (r0 == 0) goto L_0x0052
            r0.f77735e = r9
        L_0x0052:
            com.ss.android.ugc.aweme.feed.c.l r0 = r7.m
            java.lang.String r1 = r8.f76049b
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r11 = r0.c(r1)
            boolean r0 = com.ss.android.g.a.a()
            r12 = 2131561673(0x7f0d0cc9, float:1.8748753E38)
            r13 = 3
            r6 = 2
            if (r0 == 0) goto L_0x026a
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r10] = r8
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45106a
            r3 = 0
            r4 = 40999(0xa027, float:5.7452E-41)
            java.lang.Class[] r5 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.video.e> r1 = com.ss.android.ugc.aweme.video.e.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r1 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r5[r9] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r1 = r26
            r14 = 2
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a7
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r10] = r8
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45106a
            r3 = 0
            r4 = 40999(0xa027, float:5.7452E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.video.e> r1 = com.ss.android.ugc.aweme.video.e.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r1 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03a8
        L_0x00a7:
            boolean r0 = r26.j()
            if (r0 == 0) goto L_0x03a8
            java.lang.String r0 = r8.f76049b
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r10] = r11
            r1[r9] = r0
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = f45106a
            r22 = 1
            r23 = 40998(0xa026, float:5.745E-41)
            java.lang.Class[] r2 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r3 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r2[r10] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3
            java.lang.Class r25 = java.lang.Boolean.TYPE
            r19 = r1
            r24 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x00fe
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r10] = r11
            r1[r9] = r0
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = f45106a
            r22 = 1
            r23 = 40998(0xa026, float:5.745E-41)
            java.lang.Class[] r0 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r2 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r0[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r9] = r2
            java.lang.Class r25 = java.lang.Boolean.TYPE
            r19 = r1
            r24 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0115
        L_0x00fe:
            boolean r1 = f((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r11)
            if (r1 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.d()
            java.lang.String r1 = r1.getAid()
            boolean r0 = com.bytedance.common.utility.StringUtils.equal(r1, r0)
            if (r0 == 0) goto L_0x0114
            r0 = 1
            goto L_0x0115
        L_0x0114:
            r0 = 0
        L_0x0115:
            if (r0 == 0) goto L_0x0260
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r0 = r11.k()
            boolean r1 = a((com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView) r0)
            if (r1 == 0) goto L_0x0126
            r0.a((com.ss.android.ugc.aweme.video.e) r8)
            goto L_0x0260
        L_0x0126:
            boolean r1 = com.ss.android.ugc.aweme.feed.k.b.f((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r11)
            if (r1 == 0) goto L_0x0260
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.d()
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r10] = r1
            r2[r9] = r8
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.commercialize.utils.am.f39706a
            r22 = 1
            r23 = 32630(0x7f76, float:4.5724E-41)
            java.lang.Class[] r3 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.video.e> r4 = com.ss.android.ugc.aweme.video.e.class
            r3[r9] = r4
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r24 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r2 == 0) goto L_0x0176
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r10] = r1
            r2[r9] = r8
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.commercialize.utils.am.f39706a
            r22 = 1
            r23 = 32630(0x7f76, float:4.5724E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.video.e> r3 = com.ss.android.ugc.aweme.video.e.class
            r1[r9] = r3
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r24 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01c5
        L_0x0176:
            if (r1 != 0) goto L_0x0179
            goto L_0x01c5
        L_0x0179:
            if (r8 != 0) goto L_0x017c
            goto L_0x01c5
        L_0x017c:
            boolean r2 = com.ss.android.ugc.aweme.commercialize.utils.am.a((com.ss.android.ugc.aweme.feed.model.Aweme) r1, (int) r13)
            if (r2 == 0) goto L_0x01c5
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r2.b((com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            java.lang.String r2 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r2)
            java.lang.String r2 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r2)
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "error_message"
            java.lang.String r4 = "vast_mediafile_bad_response"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "error_code"
            int r4 = r8.f76051d
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (int) r4)
            java.lang.String r3 = "error_detail"
            java.lang.Object r4 = r8.f76053f
            if (r4 == 0) goto L_0x01b6
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x01b8
        L_0x01b6:
            java.lang.String r4 = ""
        L_0x01b8:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f34114b
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r2)
            r1.b()
        L_0x01c5:
            boolean r1 = r8.f76050c
            if (r1 == 0) goto L_0x0219
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            java.lang.String r2 = h(r11)
            r1.setRationAndSourceId(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            a((com.ss.android.ugc.aweme.feed.model.Video) r1, (boolean) r10)
            boolean r1 = com.ss.android.ugc.aweme.video.o.v()
            if (r1 != 0) goto L_0x03a8
            r7.H = r10
            com.ss.android.ugc.aweme.video.o r1 = r26.m()
            android.view.Surface r0 = r0.w()
            r1.a((android.view.Surface) r0)
            com.ss.android.ugc.aweme.video.o r0 = r26.m()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r1.getPlayAddrH264()
            r0.a((com.ss.android.ugc.aweme.feed.model.VideoUrlModel) r1, (boolean) r9, (boolean) r9)
            r7.a((com.ss.android.ugc.aweme.video.e) r8, (com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r11)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            a((com.ss.android.ugc.aweme.feed.model.Video) r0, (boolean) r10)
            goto L_0x03a8
        L_0x0219:
            java.lang.Object r1 = r8.f76053f
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L_0x0224
            java.lang.Object r1 = r8.f76053f
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0228
        L_0x0224:
            java.lang.String r1 = com.ss.android.ugc.aweme.base.utils.o.b(r12)
        L_0x0228:
            android.app.Activity r2 = r26.c()
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r2, (java.lang.String) r1)
            r1.a()
            r0.a((com.ss.android.ugc.aweme.video.e) r8)
            com.ss.android.ugc.aweme.feed.c.k r0 = r7.n
            r0.Y()
            r7.a((com.ss.android.ugc.aweme.video.e) r8, (com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r11)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x03a8
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddr()
            if (r1 != 0) goto L_0x0250
            goto L_0x03a8
        L_0x0250:
            com.ss.android.ugc.aweme.feed.c.n$5 r1 = new com.ss.android.ugc.aweme.feed.c.n$5
            r1.<init>(r8, r0)
            com.ss.android.b.a.a.a.a(r1)
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = r7.F
            r1 = 0
            r0.x = r1
            r7.U = r1
        L_0x0260:
            com.ss.android.ugc.aweme.shortvideo.f.f r0 = new com.ss.android.ugc.aweme.shortvideo.f.f
            r0.<init>(r9)
            r7.a((com.ss.android.ugc.aweme.shortvideo.f.f) r0)
            goto L_0x03a8
        L_0x026a:
            r14 = 2
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r10] = r8
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45106a
            r3 = 0
            r4 = 40997(0xa025, float:5.7449E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.video.e> r1 = com.ss.android.ugc.aweme.video.e.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r1 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02aa
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r10] = r8
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45106a
            r3 = 0
            r4 = 40997(0xa025, float:5.7449E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.video.e> r1 = com.ss.android.ugc.aweme.video.e.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r1 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03a8
        L_0x02aa:
            boolean r0 = r26.j()
            if (r0 == 0) goto L_0x03a8
            boolean r0 = com.ss.android.ugc.aweme.feed.k.b.f((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r11)
            if (r0 == 0) goto L_0x03a8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.d()
            if (r0 == 0) goto L_0x03a0
            boolean r0 = r8.f76050c
            if (r0 == 0) goto L_0x0314
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            java.lang.String r1 = h(r11)
            r0.setRationAndSourceId(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            a((com.ss.android.ugc.aweme.feed.model.Video) r0, (boolean) r10)
            boolean r0 = com.ss.android.ugc.aweme.video.o.v()
            if (r0 != 0) goto L_0x03a8
            r7.H = r10
            com.ss.android.ugc.aweme.video.o r0 = r26.m()
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r1 = r11.k()
            android.view.Surface r1 = r1.w()
            r0.a((android.view.Surface) r1)
            com.ss.android.ugc.aweme.video.o r0 = r26.m()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r1.getPlayAddrH264()
            r0.a((com.ss.android.ugc.aweme.feed.model.VideoUrlModel) r1, (boolean) r9, (boolean) r9)
            r7.a((com.ss.android.ugc.aweme.video.e) r8, (com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r11)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            a((com.ss.android.ugc.aweme.feed.model.Video) r0, (boolean) r10)
            goto L_0x03a8
        L_0x0314:
            java.lang.Object r0 = r8.f76053f
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x031f
            java.lang.Object r0 = r8.f76053f
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0323
        L_0x031f:
            java.lang.String r0 = com.ss.android.ugc.aweme.base.utils.o.b(r12)
        L_0x0323:
            android.app.Activity r1 = r26.c()
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r1, (java.lang.String) r0)
            r0.a()
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r0 = r11.k()
            r0.a((com.ss.android.ugc.aweme.video.e) r8)
            com.ss.android.ugc.aweme.feed.c.k r0 = r7.n
            r0.Y()
            r7.a((com.ss.android.ugc.aweme.video.e) r8, (com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r11)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.d()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x03a8
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddr()
            if (r1 != 0) goto L_0x034e
            goto L_0x03a8
        L_0x034e:
            long r1 = r7.U
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0360
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.U
            long r1 = r1 - r5
            r7.U = r3
            goto L_0x0362
        L_0x0360:
            r1 = 0
        L_0x0362:
            com.ss.android.ugc.aweme.player.a.f$a r3 = new com.ss.android.ugc.aweme.player.a.f$a
            r3.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.ss.android.ugc.aweme.player.a.f$a r1 = r3.a((java.lang.String) r1)
            android.support.v4.app.Fragment r2 = r26.e()
            com.ss.android.ugc.aweme.player.a.f$a r1 = r1.a((android.support.v4.app.Fragment) r2)
            com.ss.android.ugc.aweme.player.a.f$a r1 = r1.a((com.ss.android.ugc.aweme.feed.model.Video) r0)
            com.ss.android.ugc.aweme.player.a.f$a r1 = r1.a((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r11)
            com.ss.android.ugc.aweme.player.a.f$a r1 = r1.a((int) r10)
            java.lang.String r2 = r26.s()
            com.ss.android.ugc.aweme.player.a.f$a r1 = r1.b(r2)
            com.ss.android.ugc.aweme.player.a.f r1 = r1.f59101a
            r1.a()
            com.ss.android.ugc.aweme.feed.c.n$4 r1 = new com.ss.android.ugc.aweme.feed.c.n$4
            r1.<init>(r8, r0, r11)
            com.ss.android.b.a.a.a.a(r1)
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = r7.F
            r1 = 0
            r0.x = r1
            r7.U = r1
        L_0x03a0:
            com.ss.android.ugc.aweme.shortvideo.f.f r0 = new com.ss.android.ugc.aweme.shortvideo.f.f
            r0.<init>(r9)
            r7.a((com.ss.android.ugc.aweme.shortvideo.f.f) r0)
        L_0x03a8:
            if (r11 == 0) goto L_0x03c7
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r0 = r11.k()
            if (r0 == 0) goto L_0x03c7
            boolean r0 = com.ss.android.ugc.aweme.video.o.v()
            if (r0 != 0) goto L_0x03be
            com.ss.android.ugc.aweme.video.o r0 = r26.m()
            r0.u()
            goto L_0x03c7
        L_0x03be:
            com.ss.android.ugc.playerkit.videoview.g r0 = r11.m()
            if (r0 == 0) goto L_0x03c7
            r0.W()
        L_0x03c7:
            java.lang.String r0 = f45107b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onPlayFailed() called with: error = ["
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.ugc.playerkit.b.b.a(r0, r1)
            boolean r0 = r7.x
            if (r0 == 0) goto L_0x0465
            java.lang.String r0 = r8.f76049b
            int r1 = r8.f76051d
            int r2 = r8.f76052e
            java.lang.Object r3 = r8.f76053f
            r4 = 4
            java.lang.Object[] r15 = new java.lang.Object[r4]
            r15[r10] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r15[r9] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r15[r14] = r5
            r15[r13] = r3
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.commercialize.utils.ak.f39701a
            r18 = 1
            r19 = 32582(0x7f46, float:4.5657E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r9] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r14] = r6
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r13] = r6
            java.lang.Class r21 = java.lang.Void.TYPE
            r20 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r5 == 0) goto L_0x0456
            java.lang.Object[] r15 = new java.lang.Object[r4]
            r15[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r15[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r15[r14] = r0
            r15[r13] = r3
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.commercialize.utils.ak.f39701a
            r18 = 1
            r19 = 32582(0x7f46, float:4.5657E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r13] = r1
            java.lang.Class r21 = java.lang.Void.TYPE
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0456:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "source_id"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0460 }
        L_0x0460:
            java.lang.String r0 = "aweme_screen_ad_open_media_error_rate"
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r0, (int) r9, (org.json.JSONObject) r1)
        L_0x0465:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.c.n.a(com.ss.android.ugc.aweme.video.e):void");
    }

    private void a(com.ss.android.ugc.aweme.video.e eVar, IFeedViewHolder iFeedViewHolder) {
        com.ss.android.ugc.aweme.video.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, iFeedViewHolder}, this, f45106a, false, 41000, new Class[]{com.ss.android.ugc.aweme.video.e.class, IFeedViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, iFeedViewHolder}, this, f45106a, false, 41000, new Class[]{com.ss.android.ugc.aweme.video.e.class, IFeedViewHolder.class}, Void.TYPE);
        } else if (eVar2 != null && iFeedViewHolder != null && iFeedViewHolder.d() != null && iFeedViewHolder.d().getVideo() != null) {
            Video video = iFeedViewHolder.d().getVideo();
            HashMap hashMap = new HashMap();
            boolean a2 = com.ss.android.ugc.aweme.feed.cache.a.f45154c.a(iFeedViewHolder.d().getAid());
            hashMap.put("error_code", String.valueOf(eVar2.f76051d));
            hashMap.put("error_internal_code", String.valueOf(eVar2.f76052e));
            hashMap.put("error_info", String.valueOf(eVar2.f76053f));
            hashMap.put("group_id", iFeedViewHolder.d().getAid());
            hashMap.put("video_id", com.ss.android.ugc.playerkit.b.b.f77705b);
            hashMap.put("is_h265", String.valueOf(eVar2.f76050c ? 1 : 0));
            hashMap.put("is_ad", String.valueOf(b.d(iFeedViewHolder) ? 1 : 0));
            hashMap.put("internet_speed", String.valueOf(com.ss.android.ugc.c.b.e()));
            hashMap.put("cache_size", String.valueOf(com.ss.android.ugc.aweme.video.preload.g.f().i(video.getPlayAddr())));
            hashMap.put("video_size", String.valueOf(com.ss.android.ugc.aweme.video.preload.g.f().h(video.getPlayAddr())));
            hashMap.put("play_url", video.getPlayAddr() == null ? "null" : video.getPlayAddr().toString());
            hashMap.put("player_type", m().m().toString());
            hashMap.put("is_from_feed_cache", String.valueOf(a2 ? 1 : 0));
            r.a("video_play_failed", (Map) hashMap);
            com.ss.android.ugc.aweme.t.b.a("video_play_failed", (Map<String, String>) hashMap);
        }
    }

    private void a(f fVar) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f45106a, false, 41001, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f45106a, false, 41001, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (!(this.F instanceof FullFeedFragmentPanel)) {
            i2 = 2;
        }
        fVar.f67650e = i2;
        fVar.f67651f = this.F;
        bg.a(fVar);
    }

    public final void a(String str) {
        int i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45106a, false, 41005, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45106a, false, 41005, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.l.U();
        IFeedViewHolder c2 = this.m.c(str2);
        if (!(c2 == null || c2.d() == null || c2.k() == null)) {
            c2.k().a(str2);
            long j2 = com.ss.android.ugc.aweme.feed.z.f47068c;
            com.ss.android.ugc.aweme.feed.z.f47068c = 0;
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.feed.z.f47066a, true, 40117, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.feed.z.f47066a, true, 40117, new Class[0], Void.TYPE);
            } else if (com.ss.android.ugc.aweme.feed.z.f47069d < 0) {
                com.ss.android.ugc.aweme.feed.z.f47069d = SystemClock.elapsedRealtime();
            }
            boolean a2 = com.ss.android.ugc.aweme.feed.cache.a.f45154c.a(c2.d().getAid());
            t a3 = new t().a("request_id", r().optString("request_id")).a("duration", Long.toString(j2 > 0 ? SystemClock.elapsedRealtime() - j2 : 0));
            if (a2) {
                i2 = -1;
            } else {
                i2 = com.ss.android.ugc.aweme.u.b.a.a() ? 1 : 0;
            }
            JSONObject a4 = a3.a("is_first", String.valueOf(i2)).a("group_id", c2.d().getAid()).a("is_from_feed_cache", String.valueOf(a2 ? 1 : 0)).a();
            try {
                a4.put("preloader_type", AbTestManager.a().d().preloaderType);
            } catch (Exception e2) {
                ExceptionMonitor.ensureNotReachHere((Throwable) e2);
            }
            r.onEvent(MobClick.obtain().setEventName("video_request").setLabelName("perf_monitor").setValue(c2.d().getAid()).setJsonObject(a4));
            r.a("video_request", a4);
            com.ss.android.ugc.aweme.u.b.a.a("video_request", a4);
            com.ss.android.ugc.aweme.t.b.b("video_request", a4);
            this.F.x = SystemClock.elapsedRealtime();
            if (this.U != 0) {
                new f.a().a(String.valueOf(SystemClock.elapsedRealtime() - this.U)).a(e()).a(c2.d().getVideo()).a(c2).a(2).b(s()).f59101a.a();
            }
            this.U = SystemClock.elapsedRealtime();
            com.ss.android.ugc.aweme.video.preload.g.f().a((com.ss.android.ugc.aweme.video.preload.a) this.F);
            com.ss.android.ugc.aweme.video.f.a e3 = e(c2);
            if (e3 != null) {
                e3.f76073e = 0;
                e3.f76071c = 0;
                e3.f76072d = 0;
                e3.f76074f = 0;
                e3.g = false;
                e3.i = -1;
                e3.j = -1;
            }
        }
        this.j.f45077a = 1;
        this.n.aa();
        String str3 = f45107b;
        com.ss.android.ugc.playerkit.b.b.a(str3, "onPreparePlay() called with: sourceId = [" + str2 + "]");
        a(new com.ss.android.ugc.aweme.shortvideo.f.f(2));
        this.S = false;
        if (w() && !this.ah) {
            this.ah = true;
            a();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41006, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a() && TextUtils.equals(this.r, "toplist_friend")) {
            IFeedViewHolder af2 = this.m.af();
            if (af2 != null) {
                Aweme d2 = af2.d();
                if (d2 != null) {
                    User author = d2.getAuthor();
                    if (author != null && !a(author)) {
                        com.ss.android.ugc.aweme.story.b.a().a(author.getUid());
                    }
                }
            }
        }
    }

    private boolean a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f45106a, false, 41007, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f45106a, false, 41007, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.ai == null) {
            this.ai = new HashSet();
        }
        if (this.ai.contains(user.getUid())) {
            return true;
        }
        this.ai.add(user.getUid());
        return false;
    }

    private void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f45106a, false, 41009, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f45106a, false, 41009, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.H) {
            IFeedViewHolder af2 = this.m.af();
            if (b.f(af2)) {
                if (z2) {
                    this.M++;
                    if (this.N == -1) {
                        this.N = SystemClock.elapsedRealtime();
                    }
                } else if (this.N != -1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.N;
                    this.O += elapsedRealtime;
                    this.N = -1;
                    if (!z3 && elapsedRealtime >= ((long) AbTestManager.a().d().videoBufferringThreshold)) {
                        a(af2, elapsedRealtime, "resume", false);
                    }
                }
            }
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45106a, false, 41010, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f45106a, false, 41010, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        IFeedViewHolder af2 = this.m.af();
        if (!(af2 == null || af2.k() == null)) {
            af2.k().b(z2);
        }
        this.T = z2;
        b(z2, false);
        if (af2 != null && af2.k() != null && this.H && b.a(af2)) {
            if (z2) {
                com.ss.android.ugc.aweme.commerce.b.a.a();
                d();
                af2.k().x();
            } else {
                com.ss.android.ugc.aweme.commerce.b.a.a();
                d();
                af2.k().x();
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = z2 ? "start" : "end";
                objArr[1] = af2.d().getDesc();
                String.format(locale, "buffer %s at %s", objArr);
            }
        }
    }

    public final void a(float f2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f45106a, false, 41011, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f45106a, false, 41011, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        Aweme h2 = h();
        if (h2 != null) {
            if (h2.getVideoControl() != null && h2.getVideoControl().showProgressBar == 1) {
                org.greenrobot.eventbus.c a2 = org.greenrobot.eventbus.c.a();
                com.ss.android.ugc.aweme.feed.ui.seekbar.d dVar = new com.ss.android.ugc.aweme.feed.ui.seekbar.d(h2, this.r, this.s, f2, this.F);
                a2.d(dVar);
            }
            Video video = h2.getVideo();
            if (video != null) {
                i2 = video.getDuration();
                if (i2 <= 0) {
                    return;
                }
            }
            double d2 = (double) ((((float) i2) * (f2 / 100.0f)) / 1000.0f);
            if (this.C < Math.floor(d2)) {
                this.n.a(h2.getAid(), (int) Math.floor(d2));
            }
            this.C = d2;
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
        boolean z2;
        int i2;
        com.ss.android.ugc.aweme.video.b.b bVar2 = bVar;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f45106a, false, 41017, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f45106a, false, 41017, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        this.z = false;
        com.ss.android.ugc.aweme.feed.ui.seekbar.c cVar = new com.ss.android.ugc.aweme.feed.ui.seekbar.c(h(), this.r, this.s, bVar, this.F);
        bg.a(cVar);
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).readTaskPlayerCycle(9, false);
        ag i4 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i4, ag.f3141a, false, 40178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i4, ag.f3141a, false, 40178, new Class[0], Void.TYPE);
        } else if (i4.w > 0) {
            i4.h();
        } else {
            i4.w = SystemClock.uptimeMillis();
            if (i4.g()) {
                i4.a("first_feed_show_time_new_user", "");
            } else {
                i4.a("first_feed_show_time_v3", "");
            }
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71891, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71891, new Class[0], Integer.TYPE)).intValue();
            } else {
                AbTestModel d2 = a2.d();
                i2 = d2 == null ? 0 : d2.pushdelayDuration;
            }
            if (i2 != 0) {
                i4.a("first_feed_show_time_push_700", "$$" + i2);
            }
            if (PatchProxy.isSupport(new Object[0], i4, ag.f3141a, false, 40198, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i4, ag.f3141a, false, 40198, new Class[0], Void.TYPE);
            } else {
                a.i.a(10000).b(ah.f44994b, com.ss.android.ugc.aweme.thread.h.e());
                i4.j();
            }
        }
        String str = bVar2.f76013a;
        Session b2 = com.ss.android.ugc.playerkit.session.a.a().b();
        if (b2 != null) {
            com.ss.android.ugc.playerkit.session.b c2 = com.ss.android.ugc.playerkit.videoview.c.a.a().c(b2.key);
            if (c2 != null) {
                c2.f77731a = System.currentTimeMillis();
            }
        }
        av.INSTANCE.setVideoId(str);
        v();
        IFeedViewHolder c3 = this.m.c(str);
        if (!(c3 == null || c3.d() == null || c3.k() == null)) {
            c3.k().a(bVar2);
            if (b.f(c3)) {
                if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isUploadContactsNoticeDialogShowing()) {
                    if (!o.v()) {
                        m().h();
                    } else {
                        com.ss.android.ugc.playerkit.videoview.g m2 = c3.m();
                        if (m2 != null) {
                            m2.T();
                        }
                    }
                }
                com.ss.android.ugc.aweme.shortvideo.f.f fVar = new com.ss.android.ugc.aweme.shortvideo.f.f(5);
                long c4 = m().c();
                if (DetailFragment.a(f()) && c4 > 0) {
                    fVar.f67647b = c4;
                }
                a(fVar);
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.app.services.e.f2679a, true, 23596, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.app.services.e.f2679a, true, 23596, new Class[0], Void.TYPE);
                } else if (Build.VERSION.SDK_INT < 20 && !com.ss.android.ugc.aweme.app.services.e.f2680b) {
                    com.ss.android.ugc.aweme.app.services.e.f2680b = true;
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.app.services.g.f2686a, true, 23603, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.app.services.g.f2686a, true, 23603, new Class[0], Void.TYPE);
                    } else {
                        Neverland.getInstance().setEnable(false);
                    }
                    a.i.a(12000).a(com.ss.android.ugc.aweme.app.services.f.f34275b, (Executor) com.ss.android.ugc.aweme.thread.h.c());
                }
                final Aweme d3 = c3.d();
                if (PatchProxy.isSupport(new Object[]{d3}, this, f45106a, false, 41052, new Class[]{Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{d3}, this, f45106a, false, 41052, new Class[]{Aweme.class}, Void.TYPE);
                } else {
                    new StringBuilder("preloadApi ").append(d3.getAid());
                    d3.getPreload();
                    if (d3.getPreload() != null) {
                        a.i.a((Callable<TResult>) new Callable<Object>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f45138a;

                            public final Object call() {
                                if (PatchProxy.isSupport(new Object[0], this, f45138a, false, 41076, new Class[0], Object.class)) {
                                    return PatchProxy.accessDispatch(new Object[0], this, f45138a, false, 41076, new Class[0], Object.class);
                                }
                                if (d3.getPreload().modelV2 == 1) {
                                    boolean a2 = n.a(d3.getPreload().commentPro, com.ss.android.ugc.aweme.store.a.f71744c, d3.getPreload().commentMedianTime, d3.getPreload().commentThres);
                                    boolean a3 = n.a(d3.getPreload().profilePro, com.ss.android.ugc.aweme.store.a.f71743b, d3.getPreload().profileMedianTime, d3.getPreload().profileThres);
                                    if (a2) {
                                        n.b(d3);
                                    }
                                    if (a3 && d3.getPreload().profilePreload >= 0) {
                                        n.c(d3);
                                    }
                                } else {
                                    n.b(d3);
                                    n.c(d3);
                                }
                                return null;
                            }
                        });
                    }
                }
                Video video = c3.d().getVideo();
                if (video != null) {
                    VideoUrlModel playAddr = video.getPlayAddr();
                    if (playAddr != null) {
                        com.ss.android.ugc.aweme.video.preload.g f2 = com.ss.android.ugc.aweme.video.preload.g.f();
                        if (PatchProxy.isSupport(new Object[]{playAddr}, f2, com.ss.android.ugc.aweme.video.preload.g.f76257a, false, 89248, new Class[]{VideoUrlModel.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{playAddr}, f2, com.ss.android.ugc.aweme.video.preload.g.f76257a, false, 89248, new Class[]{VideoUrlModel.class}, Void.TYPE);
                        } else if (f2.f76258b.get(playAddr.getUri()) != null) {
                            if (PatchProxy.isSupport(new Object[0], f2, com.ss.android.ugc.aweme.video.preload.g.f76257a, false, 89264, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], f2, com.ss.android.ugc.aweme.video.preload.g.f76257a, false, 89264, new Class[0], Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.app.n.a("aweme_media_play_stastics_log", 0, (JSONObject) null);
                            }
                        } else {
                            if (PatchProxy.isSupport(new Object[0], f2, com.ss.android.ugc.aweme.video.preload.g.f76257a, false, 89265, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], f2, com.ss.android.ugc.aweme.video.preload.g.f76257a, false, 89265, new Class[0], Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.app.n.a("aweme_media_play_stastics_log", 1, (JSONObject) null);
                            }
                        }
                        if (this.U != 0) {
                            this.U = 0;
                            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.U);
                            at.a(true);
                            new f.a().a(valueOf).a(e()).a(video).a(c3).a(1).b(s()).f59101a.a();
                            e.a aVar = new e.a();
                            aVar.f59092a.f59088c = c3;
                            aVar.f59092a.f59087b = playAddr;
                            aVar.f59092a.g = bVar2;
                            aVar.f59092a.j = d();
                            aVar.f59092a.f59091f = this.F;
                            aVar.f59092a.f59090e = this.l;
                            aVar.f59092a.k = e(c3);
                            aVar.f59092a.h = this.s;
                            aVar.f59092a.f59089d = valueOf;
                            aVar.f59092a.i = this.p;
                            aVar.f59092a.a();
                            if (PatchProxy.isSupport(new Object[]{playAddr}, this, f45106a, false, 41020, new Class[]{VideoUrlModel.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{playAddr}, this, f45106a, false, 41020, new Class[]{VideoUrlModel.class}, Void.TYPE);
                            } else {
                                AbTestManager a3 = AbTestManager.a();
                                if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71960, new Class[0], Boolean.TYPE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71960, new Class[0], Boolean.TYPE)).booleanValue();
                                } else {
                                    AbTestModel d4 = a3.d();
                                    z2 = d4 == null ? false : d4.forceVideoUrlUseHttps;
                                }
                                if (z2) {
                                    Integer a4 = b.a(playAddr);
                                    if (a4 != null && a4.intValue() > 0) {
                                        float p = m().p();
                                        float intValue = ((float) a4.intValue()) - p;
                                        AbTestManager a5 = AbTestManager.a();
                                        if (PatchProxy.isSupport(new Object[0], a5, AbTestManager.f63777a, false, 71962, new Class[0], Integer.TYPE)) {
                                            i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], a5, AbTestManager.f63777a, false, 71962, new Class[0], Integer.TYPE)).intValue();
                                        } else {
                                            AbTestModel d5 = a5.d();
                                            if (d5 != null) {
                                                i3 = d5.videoSwitchHttpsThreshold;
                                            }
                                        }
                                        if (intValue > ((float) i3)) {
                                            com.ss.android.ugc.aweme.video.j.f76116b = true;
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("play_bitrate", (double) p);
                                                jSONObject.put("hit_bitrate", a4);
                                                jSONObject.put("is_hijack", 1);
                                            } catch (JSONException unused) {
                                            }
                                            com.ss.android.ugc.aweme.app.n.a("http_hijack_info", jSONObject);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        com.ss.android.ugc.aweme.lego.a.i.e();
        String str2 = f45107b;
        com.ss.android.ugc.playerkit.b.b.a(str2, "onRenderFirstFrame() called with: sourceId = [" + str + "]");
    }

    public final void b(final com.ss.android.ugc.aweme.video.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f45106a, false, 41021, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f45106a, false, 41021, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE);
            return;
        }
        String str = f45107b;
        com.ss.android.ugc.playerkit.b.b.a(str, "onRetryOnError() called with: error = [" + eVar + "]");
        if (j()) {
            IFeedViewHolder c2 = this.m.c(eVar.f76049b);
            if (c2 != null && c2.k() != null) {
                c2.k().b(eVar);
                if (AnonymousClass9.f45141a[m().m().ordinal()] == 1 && ((eVar.f76053f == null || (eVar.f76053f instanceof Integer)) && c2.d() != null)) {
                    final Video video = c2.d().getVideo();
                    if (video != null) {
                        com.ss.android.b.a.a.a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f45134a;

                            public final void run() {
                                String str;
                                if (PatchProxy.isSupport(new Object[0], this, f45134a, false, 41075, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f45134a, false, 41075, new Class[0], Void.TYPE);
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    if (eVar.f76053f == null) {
                                        eVar.f76053f = 1;
                                    }
                                    jSONObject.put("type", eVar.f76053f.toString());
                                    jSONObject.put("sourceId", eVar.f76049b);
                                    jSONObject.put("errorCode", eVar.f76051d);
                                    jSONObject.put("errorExtra", eVar.f76052e);
                                    jSONObject.put("netWorkQuality", com.facebook.d.a.b.a().b().toString());
                                    jSONObject.put("netWorkSpeed", (int) com.facebook.d.a.b.a().c());
                                    jSONObject.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
                                    jSONObject.put("playUrlIsLowBr", video.isLowBr());
                                    jSONObject.put("playerType", n.this.m().m().toString());
                                    if (eVar.f76053f != null) {
                                        jSONObject.put("extraInfo", eVar.f76053f.toString());
                                    }
                                    File a2 = com.ss.android.ugc.aweme.video.b.a(com.ss.android.ugc.aweme.video.b.c(), "cache");
                                    if (a2 == null) {
                                        str = "";
                                    } else {
                                        str = new com.ss.android.ugc.aweme.shortvideo.helper.c("file", a2.getPath() + "/" + com.toutiao.proxyserver.f.a.a(video.getProperPlayAddr().getUri())).toString();
                                    }
                                    jSONObject.put("file", str);
                                } catch (JSONException unused) {
                                }
                                com.ss.android.ugc.aweme.app.n.a("aweme_media_play_retry_on_freezing", jSONObject);
                                r.a("aweme_media_play_retry_on_freezing", jSONObject);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        if (r0 != false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f45106a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 41026(0xa042, float:5.749E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f45106a
            r3 = 0
            r4 = 41026(0xa042, float:5.749E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.app.AwemeAppData r0 = com.ss.android.ugc.aweme.app.AwemeAppData.p()
            r0.aq = r10
            r7.W = r8
            android.app.KeyguardManager r0 = r7.G
            if (r0 != 0) goto L_0x0054
            android.content.Context r0 = r18.d()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x0053 }
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0     // Catch:{ Exception -> 0x0053 }
            r7.G = r0     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            android.app.KeyguardManager r0 = r7.G
            if (r0 == 0) goto L_0x00a6
            android.app.KeyguardManager r0 = r7.G
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            if (r0 == 0) goto L_0x00a6
            boolean r0 = com.ss.android.newmedia.p.a()
            if (r0 != 0) goto L_0x00a3
            boolean r0 = com.ss.android.newmedia.p.b()
            if (r0 != 0) goto L_0x00a3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.newmedia.p.f30260a
            r14 = 1
            r15 = 18436(0x4804, float:2.5834E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0099
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.newmedia.p.f30260a
            r14 = 1
            r15 = 18436(0x4804, float:2.5834E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00a1
        L_0x0099:
            java.lang.String r0 = "samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
        L_0x00a1:
            if (r0 == 0) goto L_0x00a5
        L_0x00a3:
            r7.X = r9
        L_0x00a5:
            return
        L_0x00a6:
            r7.X = r10
            r0 = 0
            r7.W = r0
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = r7.F
            r0.ao = r9
            boolean r0 = r18.e((com.ss.android.ugc.aweme.feed.model.Aweme) r19)
            if (r0 == 0) goto L_0x0201
            boolean r0 = r18.n()
            if (r0 == 0) goto L_0x0201
            boolean r0 = r18.d((com.ss.android.ugc.aweme.feed.model.Aweme) r19)
            if (r0 != 0) goto L_0x0201
            boolean r0 = com.ss.android.ugc.aweme.login.utils.a.a(r19)
            if (r0 == 0) goto L_0x00c9
            goto L_0x0201
        L_0x00c9:
            com.ss.android.ugc.aweme.commercialize.symphony.g r0 = com.ss.android.ugc.aweme.commercialize.symphony.g.f39613b
            r0.a()
            com.ss.android.ugc.aweme.feed.c.l r0 = r7.m
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = r0.af()
            boolean r1 = com.ss.android.ugc.aweme.feed.k.b.f((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r0)
            if (r1 == 0) goto L_0x012f
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate r1 = r0.r()
            com.ss.android.ugc.aweme.commercialize.feed.e r2 = a((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r0)
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r3 = r0.k()
            r3.a_(r8)
            if (r2 == 0) goto L_0x00f2
            android.content.Context r3 = r18.d()
            r2.a((android.content.Context) r3, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
        L_0x00f2:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30611(0x7793, float:4.2895E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x011f
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30611(0x7793, float:4.2895E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x012a
        L_0x011f:
            android.widget.LinearLayout r2 = r1.feedAdLayout
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0129
            r2 = 1
            goto L_0x012a
        L_0x0129:
            r2 = 0
        L_0x012a:
            if (r2 == 0) goto L_0x012f
            r1.a((boolean) r10)
        L_0x012f:
            boolean r1 = a((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            if (r1 == 0) goto L_0x01e7
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r1 = r0.k()
            boolean r1 = r1.v()
            if (r1 == 0) goto L_0x01e7
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r1 = r0.k()
            boolean r1 = a((com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView) r1)
            if (r1 == 0) goto L_0x0186
            com.ss.android.ugc.aweme.feed.model.StreamUrlModel r1 = r19.getStreamUrlModel()
            if (r1 != 0) goto L_0x0150
            return
        L_0x0150:
            boolean r1 = com.ss.android.ugc.aweme.video.o.v()
            if (r1 != 0) goto L_0x015e
            com.ss.android.ugc.aweme.video.o r1 = r18.m()
            r1.h()
            goto L_0x0167
        L_0x015e:
            com.ss.android.ugc.playerkit.videoview.g r1 = r0.m()
            if (r1 == 0) goto L_0x0167
            r1.T()
        L_0x0167:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x017e
            com.ss.android.ugc.aweme.video.d.b()
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r0 = r0.k()
            r0.w()
            com.ss.android.ugc.aweme.video.d.b()
            r19.getAid()
            goto L_0x01e7
        L_0x017e:
            com.ss.android.ugc.aweme.video.d r1 = com.ss.android.ugc.aweme.video.d.b()
            r1.a(r0, r8)
            goto L_0x01e7
        L_0x0186:
            boolean r1 = com.ss.android.ugc.aweme.feed.k.b.f((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r0)
            if (r1 == 0) goto L_0x01e7
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.d()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            if (r1 != 0) goto L_0x0197
            return
        L_0x0197:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.d()
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getProperPlayAddr()
            if (r2 != 0) goto L_0x01a6
            return
        L_0x01a6:
            java.lang.String r2 = h(r0)
            r1.setRationAndSourceId(r2)
            boolean r2 = com.ss.android.ugc.aweme.video.o.v()
            if (r2 != 0) goto L_0x01d1
            com.ss.android.ugc.aweme.video.o r2 = r18.m()
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r0 = r0.k()
            android.view.Surface r0 = r0.w()
            r2.a((android.view.Surface) r0)
            com.ss.android.ugc.aweme.video.o r0 = r18.m()
            r0.a((com.ss.android.ugc.aweme.video.a.a) r7)
            com.ss.android.ugc.aweme.video.o r0 = r18.m()
            r0.a((com.ss.android.ugc.aweme.feed.model.Video) r1, (com.ss.android.ugc.aweme.video.a.a) r7)
            goto L_0x01db
        L_0x01d1:
            com.ss.android.ugc.playerkit.videoview.g r0 = r0.m()
            r0.a((com.ss.android.ugc.aweme.video.a.a) r7)
            r0.a((com.ss.android.ugc.aweme.feed.model.Video) r1)
        L_0x01db:
            boolean r0 = r7.T
            if (r0 == 0) goto L_0x01e2
            r7.b((boolean) r9, (boolean) r10)
        L_0x01e2:
            com.ss.android.ugc.aweme.feed.c.k r0 = r7.n
            r0.Z()
        L_0x01e7:
            long r0 = r7.i
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x01fd
            long r0 = r7.J
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r8 = r7.i
            long r4 = r4 - r8
            long r0 = r0 + r4
            r7.J = r0
            r7.i = r2
        L_0x01fd:
            r18.g()
            return
        L_0x0201:
            boolean r0 = com.ss.android.ugc.aweme.login.utils.a.a(r19)
            if (r0 == 0) goto L_0x021a
            android.content.Context r0 = r18.d()
            r1 = 2131561673(0x7f0d0cc9, float:1.8748753E38)
            java.lang.String r1 = com.ss.android.ugc.aweme.login.utils.a.a(r8, r1)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            return
        L_0x021a:
            boolean r0 = r18.d((com.ss.android.ugc.aweme.feed.model.Aweme) r19)
            if (r0 == 0) goto L_0x022e
            android.content.Context r0 = r18.d()
            r1 = 2131564559(0x7f0d180f, float:1.8754607E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.c.n.a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    private static boolean a(IFeedViewHolder iFeedViewHolder, @NonNull Aweme aweme) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{iFeedViewHolder, aweme2}, null, f45106a, true, 41029, new Class[]{IFeedViewHolder.class, Aweme.class}, Boolean.TYPE)) {
            return f(iFeedViewHolder) && iFeedViewHolder.d() == aweme2;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, aweme2}, null, f45106a, true, 41029, new Class[]{IFeedViewHolder.class, Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(Aweme aweme, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45106a, false, 41030, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z2)}, this, f45106a, false, 41030, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.l.W();
        IFeedViewHolder af2 = this.m.af();
        if (af2 != null && af2.k() != null) {
            if (com.ss.android.g.a.a() && aweme != null) {
                a.b.f33267c = aweme;
                a.b.f33268d = this.r;
                a.C0419a.f33262a = aweme.getAid();
                a.C0419a.f33263b = aweme.getAuthorUid();
            }
            if (!(af2 == null || af2.k() == null)) {
                v.a(af2.k().x(), 0);
            }
            if (o.v()) {
                if (a(af2, aweme)) {
                    if (this.m.ah() == 0) {
                        com.ss.android.ugc.aweme.commercialize.feed.e a2 = a(af2);
                        if (a2 != null) {
                            a2.j();
                        }
                    }
                    Video video = af2.d().getVideo();
                    if (a(af2.k()) && n()) {
                        b(af2, aweme);
                    } else if (b.f(af2) && video != null && video.getProperPlayAddr() != null && aweme.isCanPlay()) {
                        video.setRationAndSourceId(h(af2));
                        if (com.ss.android.ugc.aweme.login.utils.a.a(aweme)) {
                            com.bytedance.ies.dmt.ui.d.a.c(d(), com.ss.android.ugc.aweme.login.utils.a.a(aweme, C0906R.string.drx)).a();
                            return;
                        } else if (d(aweme)) {
                            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.dr2).a();
                            com.ss.android.ugc.playerkit.b.b.a(f45107b, "tryPlay: video deleted.");
                            return;
                        } else {
                            com.ss.android.ugc.playerkit.videoview.g m2 = af2.m();
                            if (e(aweme) && n()) {
                                m2.a((com.ss.android.ugc.aweme.video.a.a) this);
                                com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29092f, com.ss.android.experiencekit.c.d.BEGIN);
                                m2.a(video, z2, AbTestManager.a().bS());
                                com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29092f, com.ss.android.experiencekit.c.d.END);
                                if (com.ss.android.g.a.a()) {
                                    if (aweme.isBan()) {
                                        m2.P();
                                        com.bytedance.ies.dmt.ui.d.a.b(d(), (int) C0906R.string.bfd).a();
                                    } else {
                                        m2.Q();
                                    }
                                }
                            }
                        }
                    } else {
                        return;
                    }
                    this.H = false;
                }
                return;
            }
            if (a(af2, aweme) && af2.k().v()) {
                at.a(false);
                Video video2 = af2.d().getVideo();
                if (a(af2.k()) && n()) {
                    b(af2, aweme);
                } else if (video2 != null) {
                    if (com.ss.android.ugc.aweme.login.utils.a.a(aweme)) {
                        com.bytedance.ies.dmt.ui.d.a.c(d(), com.ss.android.ugc.aweme.login.utils.a.a(aweme, C0906R.string.drx)).a();
                        return;
                    }
                    VideoUrlModel properPlayAddr = video2.getProperPlayAddr();
                    if (properPlayAddr != null) {
                        if (aweme.isLive() || aweme.isCanPlay()) {
                            o m3 = m();
                            o m4 = !o.f76179d ? m() : com.ss.android.ugc.aweme.video.u.a().a(properPlayAddr.getUri());
                            m4.a(af2.k().w());
                            video2.setRationAndSourceId(h(af2));
                            if (d(aweme)) {
                                com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.dr2).a();
                                com.ss.android.ugc.playerkit.b.b.a(f45107b, "tryPlay: video deleted.");
                                return;
                            } else if (e(aweme) && n()) {
                                m4.a((com.ss.android.ugc.aweme.video.a.a) this);
                                m4.a(video2, z2);
                                if (o.f76179d) {
                                    com.ss.android.ugc.aweme.video.u.a().a(m3);
                                }
                                if (com.ss.android.g.a.a()) {
                                    if (aweme.isBan()) {
                                        m4.k();
                                        com.bytedance.ies.dmt.ui.d.a.b(d(), (int) C0906R.string.bfd).a();
                                    } else {
                                        m4.l();
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                this.H = false;
            }
        }
    }

    public final void a(String str, boolean z2, IFeedViewHolder iFeedViewHolder) {
        long currentTimeMillis;
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z2 ? (byte) 1 : 0), iFeedViewHolder}, this, f45106a, false, 41036, new Class[]{String.class, Boolean.TYPE, IFeedViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z2), iFeedViewHolder}, this, f45106a, false, 41036, new Class[]{String.class, Boolean.TYPE, IFeedViewHolder.class}, Void.TYPE);
            return;
        }
        g();
        if (this.g == -1) {
            currentTimeMillis = System.currentTimeMillis() - this.f45111f;
        } else {
            currentTimeMillis = (System.currentTimeMillis() - this.f45111f) - this.g;
        }
        long j2 = currentTimeMillis;
        IFeedViewHolder af2 = iFeedViewHolder == null ? this.m.af() : iFeedViewHolder;
        if (b.f(af2)) {
            com.ss.android.ugc.aweme.commercialize.feed.e a2 = a(af2);
            if (a2 != null && !this.z) {
                if (!z2 || this.w == null) {
                    a2.a(this.w, str, j2, this.k + 1);
                } else {
                    a2.a(this.w, this.w.getAid(), j2, this.k + 1);
                }
            }
            this.w = g(af2);
        }
    }

    public final void a(Aweme aweme, int i2) {
        boolean z2;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i2)}, this, f45106a, false, 41045, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i2)}, this, f45106a, false, 41045, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41044, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41044, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z2 = this.F.aq && (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 22 || (this.F.as != null && this.F.as.isResumed()));
        }
        if (z2 && (!com.ss.android.g.a.a() || n())) {
            IFeedViewHolder af2 = this.m.af();
            if (!(af2 == null || af2.k() == null)) {
                if (af2.d() != aweme2) {
                    if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45106a, false, 41046, new Class[]{Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45106a, false, 41046, new Class[]{Aweme.class}, Void.TYPE);
                    } else if (o.f76179d) {
                        Video video = aweme.getVideo();
                        if (video != null) {
                            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
                            if (properPlayAddr != null) {
                                video.setRationAndSourceId(aweme.getAid());
                                IFeedViewHolder c2 = this.m.c(aweme.getAid());
                                if (!o.v()) {
                                    o c3 = com.ss.android.ugc.aweme.video.u.a().c();
                                    if (c2 != null) {
                                        c3.a(c2.k().w());
                                    }
                                    c3.a((com.ss.android.ugc.aweme.video.a.a) this);
                                    if (PatchProxy.isSupport(new Object[]{properPlayAddr}, c3, o.f76178a, false, 88972, new Class[]{VideoUrlModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{properPlayAddr}, c3, o.f76178a, false, 88972, new Class[]{VideoUrlModel.class}, Void.TYPE);
                                    } else {
                                        c3.f76181c = false;
                                        c3.f76183f = properPlayAddr;
                                        com.ss.android.ugc.playerkit.session.a.a().d(properPlayAddr.getUri()).urlModel = properPlayAddr;
                                        com.ss.android.ugc.playerkit.a.d<com.ss.android.ugc.playerkit.c.f> a2 = c3.a(properPlayAddr, false);
                                        com.ss.android.ugc.playerkit.a.d<Boolean> b2 = c3.b(properPlayAddr);
                                        com.ss.android.ugc.aweme.video.v vVar = com.ss.android.ugc.aweme.video.v.Normal;
                                        boolean isVr = properPlayAddr.isVr();
                                        boolean isH265 = properPlayAddr.isH265();
                                        com.ss.android.ugc.playerkit.a.d<Integer> a3 = c3.a(properPlayAddr);
                                        if (PatchProxy.isSupport(new Object[]{a2, b2, properPlayAddr, (byte) 0, vVar, Byte.valueOf(isVr ? (byte) 1 : 0), Byte.valueOf(isH265 ? (byte) 1 : 0), a3, (byte) 1, (byte) 0}, c3, o.f76178a, false, 88973, new Class[]{com.ss.android.ugc.playerkit.a.d.class, com.ss.android.ugc.playerkit.a.d.class, VideoUrlModel.class, Boolean.TYPE, com.ss.android.ugc.aweme.video.v.class, Boolean.TYPE, Boolean.TYPE, com.ss.android.ugc.playerkit.a.d.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{a2, b2, properPlayAddr, (byte) 0, vVar, Byte.valueOf(isVr), Byte.valueOf(isH265), a3, (byte) 1, (byte) 0}, c3, o.f76178a, false, 88973, new Class[]{com.ss.android.ugc.playerkit.a.d.class, com.ss.android.ugc.playerkit.a.d.class, VideoUrlModel.class, Boolean.TYPE, com.ss.android.ugc.aweme.video.v.class, Boolean.TYPE, Boolean.TYPE, com.ss.android.ugc.playerkit.a.d.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                                        } else {
                                            c3.a(a2, b2, properPlayAddr, false, vVar, isVr, isH265, a3, true, false, 0);
                                        }
                                    }
                                } else if (b.f(c2)) {
                                    com.ss.android.ugc.playerkit.videoview.g m2 = c2.m();
                                    m2.a(video, false, AbTestManager.a().bS());
                                    m2.a((com.ss.android.ugc.aweme.video.a.a) this);
                                }
                            }
                        }
                    }
                } else if (aweme.isLive()) {
                    b(af2, aweme2);
                } else if (!m().b((com.ss.android.ugc.aweme.video.a.a) this)) {
                    m().a((com.ss.android.ugc.aweme.video.a.a) this);
                    if (m().g) {
                        m().a(af2.k().w());
                        m().e();
                    } else if (b.f(af2)) {
                        com.ss.android.ugc.aweme.commercialize.feed.e a4 = a(af2);
                        if (a4 != null) {
                            a4.j();
                        }
                        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45106a, false, 41048, new Class[]{Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45106a, false, 41048, new Class[]{Aweme.class}, Void.TYPE);
                        } else {
                            a(aweme2, true);
                        }
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45106a, false, 41047, new Class[]{Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45106a, false, 41047, new Class[]{Aweme.class}, Void.TYPE);
                    } else {
                        a(aweme);
                        this.l.W();
                    }
                    if (com.ss.android.g.a.a()) {
                        if (aweme.isBan()) {
                            m().k();
                            com.bytedance.ies.dmt.ui.d.a.b(d(), (int) C0906R.string.bfd).a();
                        } else {
                            m().l();
                        }
                    }
                }
            }
        }
        if (com.ss.android.g.a.a() && a(false) && !m().b((com.ss.android.ugc.aweme.video.a.a) this)) {
            m().a((com.ss.android.ugc.aweme.video.a.a) this);
        }
    }

    public final void b(Aweme aweme, boolean z2) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45106a, false, 41049, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Byte.valueOf(z2)}, this, f45106a, false, 41049, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        IFeedViewHolder af2 = this.m.af();
        if (com.ss.android.ugc.aweme.login.utils.a.a(aweme)) {
            com.bytedance.ies.dmt.ui.d.a.c(d(), com.ss.android.ugc.aweme.login.utils.a.a(aweme2, C0906R.string.drx)).a();
        } else if (af2 == null || af2.k() == null || af2.d() != aweme2 || d(aweme)) {
            if (d() != null && d(aweme)) {
                com.bytedance.ies.dmt.ui.d.a.c(d(), (int) C0906R.string.dr2).a();
            }
        } else {
            if (aweme2 != null && (aweme.getVideo() != null || aweme.isLive())) {
                if (this.j.f45077a == 2) {
                    if (!aweme.isLive()) {
                        r.a(d(), "click", "video_pause", aweme.getAid(), 0);
                        new aq().b(aweme2, this.s).a(this.r).e();
                        if (!o.v()) {
                            m().h();
                        } else {
                            com.ss.android.ugc.playerkit.videoview.g m2 = af2.m();
                            if (m2 != null) {
                                m2.T();
                            }
                        }
                        if (z2) {
                            this.n.ab();
                        }
                        d.b().a((com.ss.android.ugc.aweme.video.a.a) this);
                        org.greenrobot.eventbus.c a2 = org.greenrobot.eventbus.c.a();
                        com.ss.android.ugc.aweme.feed.ui.seekbar.e eVar = new com.ss.android.ugc.aweme.feed.ui.seekbar.e(h(), this.r, this.s, 1, this.F);
                        a2.d(eVar);
                    }
                } else if (this.j.f45077a == 3) {
                    r.a(d(), "click", "video_play", aweme.getAid(), 0);
                    if (aweme.isLive()) {
                        if (com.ss.android.g.a.a()) {
                            d.b();
                            af2.k().w();
                            d.b();
                            aweme.getAid();
                            aweme.getStreamUrlModel();
                        } else {
                            d.b().a(af2, aweme2);
                        }
                        if (!o.v()) {
                            m().h();
                        } else {
                            com.ss.android.ugc.playerkit.videoview.g m3 = af2.m();
                            if (m3 != null) {
                                m3.T();
                            }
                        }
                    } else if (aweme.getVideo().getProperPlayAddr() != null) {
                        a(aweme);
                    } else {
                        return;
                    }
                    this.n.Z();
                } else if (this.j.f45077a == 0 && this.n.ac()) {
                    if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41050, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41050, new Class[0], Void.TYPE);
                    } else {
                        a(this.m.ag(), true);
                    }
                    this.n.Z();
                }
            }
        }
    }

    public static boolean a(double d2, long j2, long j3, double d3) {
        double exp;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), new Long(j4), new Long(j5), Double.valueOf(d3)}, null, f45106a, true, 41056, new Class[]{Double.TYPE, Long.TYPE, Long.TYPE, Double.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), new Long(j4), new Long(j5), Double.valueOf(d3)}, null, f45106a, true, 41056, new Class[]{Double.TYPE, Long.TYPE, Long.TYPE, Double.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (j5 <= 0) {
            return false;
        } else {
            double d4 = (double) ((j4 / j5) - 1);
            if (PatchProxy.isSupport(new Object[]{Double.valueOf(d4)}, null, f45106a, true, 41055, new Class[]{Double.TYPE}, Double.TYPE)) {
                exp = ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d4)}, null, f45106a, true, 41055, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
            } else {
                Double.isNaN(d4);
                exp = 1.0d / (Math.exp(-d4) + 1.0d);
            }
            return d2 * exp > d3;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41058, new Class[0], Void.TYPE);
            return;
        }
        if (o.v()) {
            IFeedViewHolder af2 = this.m.af();
            if (b.f(af2) && af2.m() != null) {
                af2.m().b(this);
            }
        }
        super.b();
        this.V.a();
        u();
    }

    public final void a(Activity activity, Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{activity, fragment}, this, f45106a, false, 41059, new Class[]{Activity.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, fragment}, this, f45106a, false, 41059, new Class[]{Activity.class, Fragment.class}, Void.TYPE);
            return;
        }
        super.a(activity, fragment);
        this.V = new ScreenBroadcastReceiver(d());
        this.V.a(this);
    }

    private boolean p() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40981, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40981, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.feed.guide.d.d()) {
            return false;
        } else {
            Activity c2 = c();
            return (c2 == null || (c2 instanceof DetailActivity)) ? false : false;
        }
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40988, new Class[0], Void.TYPE);
            return;
        }
        this.F.f(this.Q);
    }

    private JSONObject r() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40992, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40992, new Class[0], JSONObject.class);
        } else if (this.l != null) {
            return this.l.V();
        } else {
            return null;
        }
    }

    private String s() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40993, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40993, new Class[0], String.class);
        }
        JSONObject r = r();
        if (r != null) {
            return r.optString("request_id");
        }
        return "";
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41012, new Class[0], Void.TYPE);
            return;
        }
        if (this.Y != null) {
            this.Y.dispose();
            this.Y = null;
        }
    }

    private boolean w() {
        if (!PatchProxy.isSupport(new Object[0], this, f45106a, false, 41042, new Class[0], Boolean.TYPE)) {
            return this.F.w();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41042, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void K_() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41060, new Class[0], Void.TYPE);
            return;
        }
        if (this.W != null && this.X) {
            a(this.W);
        }
    }

    public final Context d() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40969, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40969, new Class[0], Context.class);
        } else if (this.F == null || this.F.ar == null) {
            return super.d();
        } else {
            return this.F.ar;
        }
    }

    @NonNull
    public final o m() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41062, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41062, new Class[0], o.class);
        } else if (this.E != null) {
            return this.E;
        } else {
            return o.b();
        }
    }

    private boolean o() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40975, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40975, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Activity c2 = c();
        if (c2 != null) {
            if (c2 instanceof MainActivity) {
                if (!((MainActivity) c2).isFeedPage()) {
                    return true;
                }
                return false;
            } else if (!(c2 instanceof DetailActivity) || ((DetailActivity) c2).c()) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    private long t() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41004, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41004, new Class[0], Long.TYPE)).longValue();
        }
        Aweme h2 = h();
        if (h2 != null) {
            Video video = h2.getVideo();
            if (video != null) {
                int duration = video.getDuration();
                if (duration > 0) {
                    return (long) duration;
                }
            }
        }
        long d2 = m().d();
        if (d2 > 0) {
            return d2;
        }
        if (this.f45111f <= 0) {
            return -1;
        }
        if (this.g != -1) {
            return (System.currentTimeMillis() - this.f45111f) - this.g;
        }
        return System.currentTimeMillis() - this.f45111f;
    }

    private void v() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41018, new Class[0], Void.TYPE);
            return;
        }
        try {
            int intValue = g.b().bL().intValue();
            if (intValue >= 100 && intValue <= 1000 && t() > 29000) {
                long t = t() / ((long) intValue);
                if (t > 50) {
                    m().a((int) t);
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        m().t();
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41027, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != -1) {
            if (this.g == -1) {
                this.g = System.currentTimeMillis() - this.h;
            } else {
                this.g += System.currentTimeMillis() - this.h;
            }
            this.h = -1;
        }
    }

    public Aweme h() {
        if (!PatchProxy.isSupport(new Object[0], this, f45106a, false, 41038, new Class[0], Aweme.class)) {
            return g(this.m.af());
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41038, new Class[0], Aweme.class);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41043, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f45110e;
        r.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName(this.r).setExtValueLong(currentTimeMillis));
        new ao().a(String.valueOf(currentTimeMillis)).b(this.r).e();
    }

    private boolean n() {
        if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40970, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40970, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return a(true);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 40974, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 40974, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (!this.q.getUserVisibleHint() || p() || !d(true) || !this.f45108c || o() || ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().needRestore()) {
                return false;
            } else {
                return true;
            }
        }
    }

    private Aweme g(IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, this, f45106a, false, 41039, new Class[]{IFeedViewHolder.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, this, f45106a, false, 41039, new Class[]{IFeedViewHolder.class}, Aweme.class);
        } else if (iFeedViewHolder != null) {
            return iFeedViewHolder.d();
        } else {
            return null;
        }
    }

    private static String h(@NonNull IFeedViewHolder iFeedViewHolder) {
        if (!PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45106a, true, 41061, new Class[]{IFeedViewHolder.class}, String.class)) {
            return iFeedViewHolder.B().getAid();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45106a, true, 41061, new Class[]{IFeedViewHolder.class}, String.class);
    }

    public static com.ss.android.ugc.aweme.commercialize.feed.e a(@NonNull IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45106a, true, 41034, new Class[]{IFeedViewHolder.class}, com.ss.android.ugc.aweme.commercialize.feed.e.class)) {
            return (com.ss.android.ugc.aweme.commercialize.feed.e) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45106a, true, 41034, new Class[]{IFeedViewHolder.class}, com.ss.android.ugc.aweme.commercialize.feed.e.class);
        } else if (iFeedViewHolder.r() == null) {
            return null;
        } else {
            return iFeedViewHolder.r().o;
        }
    }

    public static void c(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f45106a, true, 41054, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f45106a, true, 41054, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme.getPreload().profilePreload >= 0) {
            com.ss.android.ugc.aweme.store.e.a().a(new TaskRecord(aweme2, aweme.getPreload().profilePreload, d.a.PROFILE));
            com.ss.android.ugc.aweme.store.e.a().a(new TaskRecord(aweme2, aweme.getPreload().profilePreload, d.a.POST));
        }
    }

    @Nullable
    private JSONObject d(IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, this, f45106a, false, 40990, new Class[]{IFeedViewHolder.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, this, f45106a, false, 40990, new Class[]{IFeedViewHolder.class}, JSONObject.class);
        }
        JSONObject r = r();
        if (!(r == null || iFeedViewHolder == null || iFeedViewHolder.d() == null || !com.ss.android.ugc.aweme.report.b.b(iFeedViewHolder.d()))) {
            try {
                r.put("is_user_review", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            } catch (JSONException unused) {
            }
        }
        return r;
    }

    private static com.ss.android.ugc.aweme.video.f.a e(@NonNull IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45106a, true, 41022, new Class[]{IFeedViewHolder.class}, com.ss.android.ugc.aweme.video.f.a.class)) {
            return (com.ss.android.ugc.aweme.video.f.a) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45106a, true, 41022, new Class[]{IFeedViewHolder.class}, com.ss.android.ugc.aweme.video.f.a.class);
        } else if (iFeedViewHolder.k() == null) {
            return null;
        } else {
            return iFeedViewHolder.k().y();
        }
    }

    private static boolean f(@Nullable IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45106a, true, 41028, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45106a, true, 41028, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (iFeedViewHolder == null || iFeedViewHolder.d() == null || iFeedViewHolder.k() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static void b(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f45106a, true, 41053, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f45106a, true, 41053, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme.getPreload().commentPreload >= 0) {
            com.ss.android.ugc.aweme.store.e.a().a(new TaskRecord(aweme2, aweme.getPreload().commentPreload, d.a.COMMENT));
        }
    }

    private boolean e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45106a, false, 40972, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45106a, false, 40972, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isCanPlay()) {
            return false;
        } else {
            return true;
        }
    }

    private boolean d(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45106a, false, 40971, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45106a, false, 40971, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getStatus() == null) {
            return false;
        } else {
            return aweme.getStatus().isDelete();
        }
    }

    private boolean e(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45106a, false, 40977, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f45106a, false, 40977, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.freeflowcard.a.a.a().a(l())) {
            return true;
        } else {
            if (z2) {
                if (this.F.bk()) {
                    return true;
                }
                this.F.aP();
            }
            return false;
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45106a, false, 40995, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45106a, false, 40995, new Class[]{String.class}, Void.TYPE);
        } else if (d() != null) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).readTaskPlayerCycle(4, false);
            f(str);
            this.j.f45077a = 3;
            IFeedViewHolder af2 = this.m.af();
            if (!(af2 == null || af2.k() == null)) {
                af2.k().c(str);
                if (!o.v()) {
                    m().u();
                } else {
                    com.ss.android.ugc.playerkit.videoview.g m2 = af2.m();
                    if (m2 != null) {
                        m2.W();
                    }
                }
            }
            String str2 = f45107b;
            com.ss.android.ugc.playerkit.b.b.a(str2, "onPausePlay() called with: sourceId = [" + str + "]");
            a(new com.ss.android.ugc.aweme.shortvideo.f.f(4));
            this.h = System.currentTimeMillis();
            this.ac = false;
        }
    }

    private void c(@NonNull IFeedViewHolder iFeedViewHolder) {
        int i2;
        int i3;
        int i4;
        IFeedViewHolder iFeedViewHolder2 = iFeedViewHolder;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder2}, this, f45106a, false, 40985, new Class[]{IFeedViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder2}, this, f45106a, false, 40985, new Class[]{IFeedViewHolder.class}, Void.TYPE);
            return;
        }
        Aweme d2 = iFeedViewHolder.d();
        ad.a().f39669c = d2;
        if (d2 != null && com.ss.android.ugc.aweme.commercialize.utils.c.k(d2)) {
            if (d2.isShowCommerceCard()) {
                int b2 = s.b(d2);
                if (b2 >= 0) {
                    AbTestManager a2 = AbTestManager.a();
                    if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71761, new Class[0], Integer.TYPE)) {
                        i4 = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71761, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        AbTestModel d3 = a2.d();
                        if (d3 == null) {
                            i4 = 0;
                        } else {
                            i4 = d3.feedGoodsCardStyle;
                        }
                    }
                    if (i4 != 0) {
                        CommerceVideoDelegate r = iFeedViewHolder.r();
                        FragmentManager k2 = k();
                        if (PatchProxy.isSupport(new Object[]{k2}, r, CommerceVideoDelegate.f38685b, false, 30646, new Class[]{FragmentManager.class}, Void.TYPE)) {
                            CommerceVideoDelegate commerceVideoDelegate = r;
                            PatchProxy.accessDispatch(new Object[]{k2}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30646, new Class[]{FragmentManager.class}, Void.TYPE);
                        } else if (r.commerceGoodHalfCardContainer.getChildCount() == 0 && r.f38688e.hasPromotion()) {
                            CommerceGoodHalfCardContainer commerceGoodHalfCardContainer = r.commerceGoodHalfCardContainer;
                            Aweme aweme = r.f38688e;
                            if (PatchProxy.isSupport(new Object[]{aweme}, commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28025, new Class[]{Aweme.class}, Void.TYPE)) {
                                CommerceGoodHalfCardContainer commerceGoodHalfCardContainer2 = commerceGoodHalfCardContainer;
                                PatchProxy.accessDispatch(new Object[]{aweme}, commerceGoodHalfCardContainer2, CommerceGoodHalfCardContainer.f36809a, false, 28025, new Class[]{Aweme.class}, Void.TYPE);
                            } else {
                                commerceGoodHalfCardContainer.g = false;
                                commerceGoodHalfCardContainer.h = false;
                                commerceGoodHalfCardContainer.i = null;
                                commerceGoodHalfCardContainer.f36814f = null;
                                commerceGoodHalfCardContainer.f36810b = View.inflate(commerceGoodHalfCardContainer.getContext(), C0906R.layout.a24, null);
                                if (commerceGoodHalfCardContainer.f36810b != null) {
                                    commerceGoodHalfCardContainer.f36811c = (ViewPager) commerceGoodHalfCardContainer.f36810b.findViewById(C0906R.id.dvj);
                                    commerceGoodHalfCardContainer.f36812d = (RecyclerView) commerceGoodHalfCardContainer.f36810b.findViewById(C0906R.id.cic);
                                    Observable.create(new com.ss.android.ugc.aweme.commerce.card.f(commerceGoodHalfCardContainer, aweme)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<List<com.ss.android.ugc.aweme.commerce.service.models.h>>(aweme) {

                                        /* renamed from: a */
                                        public static ChangeQuickRedirect f36815a;

                                        /* renamed from: b */
                                        final /* synthetic */ Aweme f36816b;

                                        public final void onComplete(
/*
Method generation error in method: com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer.1.onComplete():void, dex: classes4.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer.1.onComplete():void, class status: UNLOADED
                                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                        
*/

                                        public final void onError(
/*
Method generation error in method: com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer.1.onError(java.lang.Throwable):void, dex: classes4.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer.1.onError(java.lang.Throwable):void, class status: UNLOADED
                                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                        
*/

                                        public final void onSubscribe(
/*
Method generation error in method: com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer.1.onSubscribe(io.reactivex.disposables.Disposable):void, dex: classes4.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer.1.onSubscribe(io.reactivex.disposables.Disposable):void, class status: UNLOADED
                                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                        
*/

                                        public final /* synthetic */ void onNext(
/*
Method generation error in method: com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer.1.onNext(java.lang.Object):void, dex: classes4.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer.1.onNext(java.lang.Object):void, class status: UNLOADED
                                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                        
*/
                                    });
                                    commerceGoodHalfCardContainer.addView(commerceGoodHalfCardContainer.f36810b);
                                }
                            }
                            r.commerceGoodHalfCardContainer.setOnClickGoodDetailListener(new com.ss.android.ugc.aweme.commercialize.feed.ad(r));
                            r.commerceGoodHalfCardContainer.setOnClickBuyListener(new ae(r, k2));
                            r.commerceGoodHalfCardContainer.setOnClickCloseListener(new af(r));
                            r.commerceGoodHalfCardContainer.setOnPageSelectedListener(new com.ss.android.ugc.aweme.commercialize.feed.ag(r));
                            r.commerceGoodHalfCardContainer.setVisibility(8);
                            r.y = false;
                        }
                        ad.a().a(b2, new o(iFeedViewHolder2));
                    } else {
                        iFeedViewHolder.r().a(k());
                        ad.a().a(b2, new p(iFeedViewHolder2));
                    }
                }
            } else {
                iFeedViewHolder.r().a(k());
                if (com.ss.android.ugc.aweme.commercialize.utils.c.p(d2)) {
                    i3 = com.ss.android.ugc.aweme.commercialize.utils.c.m(d2).getShowSeconds();
                } else if (com.ss.android.ugc.aweme.commercialize.utils.c.l(d2)) {
                    i3 = d2.getAwemeRawAd().getShowButtonSeconds();
                } else {
                    i3 = 0;
                }
                ad.a().a(i3 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, new q(iFeedViewHolder2));
            }
        }
        if (!com.ss.android.ugc.aweme.commercialize.utils.c.p(d2) && com.ss.android.ugc.aweme.miniapp.l.c.a(d2) && com.ss.android.ugc.aweme.commercialize.link.f.a("iron_man", d2)) {
            if (PatchProxy.isSupport(new Object[]{d2}, null, com.ss.android.ugc.aweme.miniapp.l.c.f55818a, true, 59540, new Class[]{Aweme.class}, Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{d2}, null, com.ss.android.ugc.aweme.miniapp.l.c.f55818a, true, 59540, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
            } else if (com.ss.android.ugc.aweme.miniapp.l.c.a(d2)) {
                i2 = d2.getMicroAppInfo().getMiniAppCard().getWaitTime();
            } else {
                i2 = 0;
            }
            CommerceVideoDelegate r2 = iFeedViewHolder.r();
            if (PatchProxy.isSupport(new Object[0], r2, CommerceVideoDelegate.f38685b, false, 30654, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], r2, CommerceVideoDelegate.f38685b, false, 30654, new Class[0], Void.TYPE);
            } else {
                r2.u.a(r2.f38688e);
            }
            ad.a().a(i2 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, new r(iFeedViewHolder2));
        }
        if (!(d2 == null || d2.getFloatingCardInfo() == null || iFeedViewHolder.t() == null)) {
            ad.a().a(5000, new s(iFeedViewHolder2));
        }
    }

    private boolean d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f45106a, false, 40976, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f45106a, false, 40976, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return true;
        } else {
            return e(true);
        }
    }

    public final void e(String str) {
        boolean z2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45106a, false, 41003, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45106a, false, 41003, new Class[]{String.class}, Void.TYPE);
        } else if (j()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).readTaskPlayerCycle(7, false);
            Session b2 = com.ss.android.ugc.playerkit.session.a.a().b();
            if (b2 != null) {
                com.ss.android.ugc.playerkit.session.b c2 = com.ss.android.ugc.playerkit.videoview.c.a.a().c(b2.key);
                if (c2 != null) {
                    c2.f77734d = true;
                }
            }
            long t = t();
            this.g = -1;
            this.k++;
            IFeedViewHolder af2 = this.m.af();
            try {
                if (b.f(af2)) {
                    com.ss.android.ugc.aweme.commercialize.feed.e eVar = af2.r().o;
                    if (eVar != null) {
                        int i2 = this.k;
                        if (PatchProxy.isSupport(new Object[]{new Long(t), Integer.valueOf(i2)}, eVar, com.ss.android.ugc.aweme.commercialize.feed.e.f38827a, false, 30585, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(t), Integer.valueOf(i2)}, eVar, com.ss.android.ugc.aweme.commercialize.feed.e.f38827a, false, 30585, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                        } else if (eVar.f38830d != null) {
                            eVar.f38830d.onPlayCompleted(eVar.f38829c, eVar.f38828b, t, i2);
                        }
                    }
                    if (!(af2.d() == null || af2.d().getVideoControl() == null || af2.d().getVideoControl().showProgressBar != 0)) {
                        if (!o.v()) {
                            m().u();
                        } else if (af2.m() != null) {
                            af2.m().W();
                        }
                    }
                    if (b.a(af2)) {
                        com.ss.android.ugc.aweme.commerce.b.a.a();
                        d();
                        af2.k().x();
                    }
                    af2.r().f38687d = this.k;
                    if (af2.d() != null && this.k > 0) {
                        Aweme d2 = af2.d();
                        if (com.ss.android.ugc.aweme.commercialize.utils.c.k(d2)) {
                            ad.a().a(this.k);
                        }
                        if (com.ss.android.ugc.aweme.miniapp.l.c.a(d2)) {
                            ad.a().a(this.k);
                        }
                        if (d2.isAd() && this.k == this.P && eVar != null && eVar.b() && !AwemeAppData.p().ap) {
                            CommerceVideoDelegate r = af2.r();
                            FragmentManager k2 = k();
                            if (PatchProxy.isSupport(new Object[]{k2, af2}, r, CommerceVideoDelegate.f38685b, false, 30623, new Class[]{FragmentManager.class, IFeedViewHolder.class}, Boolean.TYPE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{k2, af2}, r, CommerceVideoDelegate.f38685b, false, 30623, new Class[]{FragmentManager.class, IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                if (com.ss.android.ugc.aweme.commercialize.utils.c.t(r.f38688e)) {
                                    if (com.ss.android.ugc.aweme.commercialize.utils.c.k(r.f38688e)) {
                                        if (!r.adHalfWebPageContainer.b() && !r.adHalfWebPageContainer.f39876b) {
                                            CardStruct q = com.ss.android.ugc.aweme.commercialize.utils.c.q(r.f38688e);
                                            if (q == null || TextUtils.isEmpty(q.getCardUrl())) {
                                                z2 = r.b(af2);
                                            } else {
                                                z2 = r.a(k2, af2);
                                            }
                                        }
                                    } else if (!NetworkUtils.isNetworkAvailable(r.k) || TextUtils.isEmpty(com.ss.android.ugc.aweme.commercialize.utils.c.b(r.f38688e)) || !com.ss.android.newmedia.e.a(com.ss.android.ugc.aweme.commercialize.utils.c.b(r.f38688e)) || !com.ss.android.ugc.aweme.commercialize.utils.n.a(r.f38688e)) {
                                        z2 = r.b(af2);
                                    } else {
                                        z2 = r.a(k2, af2);
                                    }
                                }
                                z2 = false;
                            }
                            if (z2) {
                                if (o.v() && af2.m() != null) {
                                    af2.m().T();
                                }
                                this.z = true;
                                if (!(af2 == null || af2.k() == null)) {
                                    af2.k().e(str2);
                                }
                                return;
                            }
                            this.P++;
                        }
                    }
                    this.f45111f = System.currentTimeMillis();
                    if (eVar != null && !this.F.R && !AwemeAppData.p().ap) {
                        eVar.a(2, this.k + 1);
                    }
                    if (!com.ss.android.ugc.aweme.feed.guide.d.e()) {
                        this.n.c(0);
                    }
                    com.ss.android.ugc.playerkit.b.b.a(f45107b, "onPlayCompleted() called with: sourceId = [" + str2 + "]");
                    a(new com.ss.android.ugc.aweme.shortvideo.f.f(7));
                    Set<String> set = AwemeAppData.p().ah;
                    if (set.size() < 3) {
                        set.add(str2);
                    }
                    if (TextUtils.equals(this.B, str2)) {
                        this.ag++;
                    } else {
                        this.ag = 1;
                        this.B = str2;
                    }
                    af2.k().d(this.ag);
                    if (af2.k().y() != null) {
                        af2.k().y().f76073e = this.ag;
                    }
                    this.n.a(str2);
                    if (com.ss.android.ugc.aweme.feed.guide.d.e() && this.ag == 2) {
                        this.n.ad();
                    }
                    if (af2 != null && af2.k() != null) {
                        af2.k().e(str2);
                    }
                }
            } finally {
                if (!(af2 == null || af2.k() == null)) {
                    af2.k().e(str2);
                }
            }
        }
    }

    public final void f(String str) {
        String str2;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{str}, this, f45106a, false, 41041, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45106a, false, 41041, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.T) {
            b(false, true);
            a(false, true);
        }
        IFeedViewHolder af2 = this.m.af();
        if (af2 != null) {
            Aweme d2 = af2.d();
            if (d2 != null) {
                String aid = d2.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    if (!TextUtils.isEmpty(str) || b(af2)) {
                        str2 = str;
                    } else {
                        str2 = aid;
                    }
                    IFeedViewHolder c2 = this.m.c(str2);
                    if (c2 != null) {
                        Aweme d3 = c2.d();
                        if (d3 != null) {
                            Video video = d3.getVideo();
                            if (this.U != 0 && aid.equals(str2)) {
                                this.U = 0;
                                f.a a2 = new f.a().a(String.valueOf(SystemClock.elapsedRealtime() - this.U)).a(e()).a(video).a(c2);
                                if (!p.a().b()) {
                                    i3 = 2;
                                } else {
                                    i3 = 3;
                                }
                                a2.a(i3).b(s()).f59101a.a();
                            }
                            if (com.ss.android.g.a.a() && video != null) {
                                VideoUrlModel playAddr = video.getPlayAddr();
                                if (playAddr != null) {
                                    List<com.ss.android.ugc.aweme.video.preload.e> g2 = com.ss.android.ugc.aweme.video.preload.g.f().g(playAddr);
                                    if (g2 != null) {
                                        new c.a().a(d3).a(this.s).a(playAddr.isH265()).a(com.ss.android.ugc.aweme.video.preload.g.f().e()).a(g2).f59068b.a();
                                    }
                                }
                            }
                            if (!com.ss.android.ugc.aweme.feed.g.f.b(c()) || c() == null || !c().isFinishing()) {
                                String str3 = f45107b;
                                com.ss.android.ugc.playerkit.b.b.a(str3, "stopCalPlayTime() called, with bufferCount = [" + this.L + "]");
                                if (this.f45110e == -1) {
                                    a(d3, 0);
                                    return;
                                }
                                long currentTimeMillis = System.currentTimeMillis() - this.f45110e;
                                a(d3, currentTimeMillis);
                                double a3 = com.ss.android.ugc.aweme.base.utils.r.a() - this.ad;
                                if (currentTimeMillis > 0) {
                                    JSONObject r = r();
                                    try {
                                        r.put("author_id", aa.a(d3));
                                        if (!TextUtils.isEmpty(this.l.X())) {
                                            r.put("poi_id", this.l.X());
                                        }
                                        if (aa.c(this.r)) {
                                            r.put("poi_type", aa.h(d3));
                                            r.put("poi_channel", aa.b());
                                            r.put("city_info", aa.a());
                                            r.put("distance_info", aa.i(d3));
                                        }
                                        r.put("detail", w() ? 1 : 0);
                                        r.put("content_source", this.l.R());
                                        if (!TextUtils.isEmpty(this.l.S())) {
                                            r.put("enter_method", this.l.S());
                                        }
                                    } catch (JSONException unused) {
                                    }
                                    if (b.d(c2)) {
                                        r.onEvent(MobClick.obtain().setEventName("ad_play_time").setValue(String.valueOf(currentTimeMillis)).setExtValueString(aa.m(d3)).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("request_id", r().optString("request_id")).a("is_photo", aa.n(d3)).b()));
                                    }
                                    r.a(d(), "play_time", this.r, str2, currentTimeMillis, r);
                                    o m2 = m();
                                    com.ss.android.ugc.aweme.u.at h2 = ((com.ss.android.ugc.aweme.u.at) new com.ss.android.ugc.aweme.u.at().a(this.r).b(this.l.O()).f(d3).a(currentTimeMillis).a(a3).j(this.l.B())).e(m2.m().toString()).f(aa.a(d3, this.s)).a(m2.o()).k(this.l.K()).l(this.l.L()).i(this.l.J()).h(this.l.R());
                                    if (!TextUtils.isEmpty(this.l.S())) {
                                        h2.g(this.l.S());
                                    }
                                    h2.e();
                                    if (b.f(c2)) {
                                        Session c3 = com.ss.android.ugc.playerkit.session.a.a().c(str2);
                                        if (c3 != null) {
                                            c3.blockTime = (int) this.I;
                                            c3.blockCnt = this.L;
                                            c3.playTime = (int) currentTimeMillis;
                                        }
                                    }
                                }
                                long currentTimeMillis2 = (System.currentTimeMillis() - this.f45110e) - this.J;
                                if (currentTimeMillis2 > 0) {
                                    com.ss.android.ugc.aweme.app.d.c a4 = com.ss.android.ugc.aweme.video.e.c.a(com.ss.android.ugc.aweme.app.d.c.a().a("count_rate", Float.valueOf((((float) this.L) * 1000.0f) / ((float) currentTimeMillis2))).a("duration_rate", Long.valueOf(this.I / currentTimeMillis2)).a("block_count", Integer.valueOf(this.L)).a("block_duration", Long.valueOf(this.I))).a("duration", Long.valueOf(currentTimeMillis2));
                                    if (video != null) {
                                        i2 = video.getDuration();
                                    } else {
                                        i2 = 0;
                                    }
                                    com.ss.android.ugc.aweme.app.n.a("aweme_media_block_log1", "video_block", a4.a("video_duration", Integer.valueOf(i2)).a("netType", NetworkUtils.getNetworkAccessType(d())).b());
                                }
                                if (this.L > 0 && this.I > 0) {
                                    a(c2, this.I, "leave", true);
                                    Session c4 = com.ss.android.ugc.playerkit.session.a.a().c(str2);
                                    if (c4 != null) {
                                        com.ss.android.ugc.playerkit.videoview.c.a.a().a(c4.key, this.L, (int) this.I);
                                    }
                                }
                                if (this.M > 0 && this.O > 0) {
                                    a(c2, this.O, "leave", false);
                                    Session c5 = com.ss.android.ugc.playerkit.session.a.a().c(str2);
                                    if (c5 != null) {
                                        com.ss.android.ugc.playerkit.videoview.c.a.a().a(c5.key, this.M, (int) this.O);
                                    }
                                }
                                this.f45110e = -1;
                                this.ad = com.ss.android.ugc.aweme.base.utils.r.a();
                                this.i = -1;
                                this.K = -1;
                                this.I = 0;
                                this.J = 0;
                                this.L = 0;
                                this.O = 0;
                                this.M = 0;
                                this.N = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean b(@NonNull IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45106a, true, 40983, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45106a, true, 40983, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (iFeedViewHolder.k() == null || iFeedViewHolder.k().q() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45106a, false, 41008, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f45106a, false, 41008, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z2, false);
    }

    public final void d(String str) {
        Aweme aweme;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f45106a, false, 41002, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45106a, false, 41002, new Class[]{String.class}, Void.TYPE);
        } else if (j()) {
            IFeedViewHolder c2 = this.m.c(str);
            if (!(c2 == null || c2.k() == null)) {
                c2.k().d(str);
            }
            a(new com.ss.android.ugc.aweme.shortvideo.f.f(6));
            if (c2 != null) {
                aweme = c2.d();
            } else {
                aweme = null;
            }
            Aweme aweme2 = aweme;
            com.ss.android.ugc.aweme.discover.hitrank.f.f42393c.a(aweme2, 1);
            if (com.ss.android.g.a.a()) {
                try {
                    JSONObject r = r();
                    r.put("enter_from", this.l.a(false));
                    r.put("content_source", this.l.R());
                    if (!TextUtils.isEmpty(this.l.S())) {
                        r.put("enter_method", this.l.S());
                    }
                    r.a(d(), "video_play", "finish", str, PushConstants.PUSH_TYPE_NOTIFY, r);
                    if (!this.S) {
                        as e2 = new as().a(this.r).b(this.l.O()).f(aweme2);
                        String str2 = this.R;
                        e2.f75072b = str;
                        e2.f75073c = str2;
                        e2.f75074d = aa.a(aweme2, this.s);
                        as asVar = (as) e2.j(this.l.B());
                        asVar.t = this.l.K();
                        asVar.u = this.l.L();
                        asVar.s = this.l.J();
                        as f2 = asVar.f(this.l.R());
                        if (!TextUtils.isEmpty(this.l.S())) {
                            f2.e(this.l.S());
                        }
                        f2.e();
                        this.S = true;
                    }
                } catch (JSONException unused) {
                }
            } else {
                this.n.ae();
                r.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("finish").setValue(aa.m(aweme2)).setJsonObject(this.l.d(aweme2).b()));
                as f3 = ((as) new as().b(aweme2, this.s).a(this.r).b(this.l.O()).j(this.l.B())).f(this.l.R());
                if (!TextUtils.isEmpty(this.l.S())) {
                    f3.e(this.l.S());
                }
                f3.e();
            }
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            if (PatchProxy.isSupport(new Object[0], this, f45106a, false, 41040, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45106a, false, 41040, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z2 = TextUtils.equals(l(), "homepage_hot");
            }
            iBridgeService.increaseViewedCount(z2);
        }
    }

    private void b(IFeedViewHolder iFeedViewHolder, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, aweme}, this, f45106a, false, 41031, new Class[]{IFeedViewHolder.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, aweme}, this, f45106a, false, 41031, new Class[]{IFeedViewHolder.class, Aweme.class}, Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            c(iFeedViewHolder, aweme);
        } else {
            d(iFeedViewHolder, aweme);
        }
    }

    private void c(IFeedViewHolder iFeedViewHolder, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, aweme}, this, f45106a, false, 41032, new Class[]{IFeedViewHolder.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, aweme}, this, f45106a, false, 41032, new Class[]{IFeedViewHolder.class, Aweme.class}, Void.TYPE);
        } else if (iFeedViewHolder != null && aweme != null && iFeedViewHolder.k() != null && iFeedViewHolder.k().v() && aweme.getStreamUrlModel() != null) {
            if (!o.v()) {
                m().h();
            } else {
                com.ss.android.ugc.playerkit.videoview.g m2 = iFeedViewHolder.m();
                if (m2 != null) {
                    m2.T();
                }
            }
            com.ss.android.ugc.aweme.video.d.b();
            com.ss.android.ugc.aweme.video.d.b();
            iFeedViewHolder.k().w();
            com.ss.android.ugc.aweme.video.d.b();
            aweme.getAid();
        }
    }

    private void d(IFeedViewHolder iFeedViewHolder, Aweme aweme) {
        IFeedViewHolder iFeedViewHolder2 = iFeedViewHolder;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder2, aweme2}, this, f45106a, false, 41033, new Class[]{IFeedViewHolder.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder2, aweme2}, this, f45106a, false, 41033, new Class[]{IFeedViewHolder.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!(iFeedViewHolder2 == null || aweme2 == null)) {
            if (!o.v()) {
                o.b().h();
            } else {
                com.ss.android.ugc.playerkit.videoview.g m2 = iFeedViewHolder.m();
                if (m2 != null) {
                    m2.T();
                }
            }
            com.ss.android.ugc.aweme.video.d.b().a(iFeedViewHolder2, aweme2);
        }
    }

    private void a(IFeedViewHolder iFeedViewHolder, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, jSONObject2}, this, f45106a, false, 41016, new Class[]{IFeedViewHolder.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, jSONObject2}, this, f45106a, false, 41016, new Class[]{IFeedViewHolder.class, JSONObject.class}, Void.TYPE);
        } else if (iFeedViewHolder != null && iFeedViewHolder.d() != null && iFeedViewHolder.d().getVideo() != null) {
            VideoUrlModel playAddr = iFeedViewHolder.d().getVideo().getPlayAddr();
            if (playAddr != null) {
                com.ss.android.ugc.aweme.video.preload.d j2 = com.ss.android.ugc.aweme.video.preload.g.f().j(playAddr);
                if (j2 != null) {
                    try {
                        jSONObject2.put("video_cache_read_time", (double) ((((float) j2.f76205a) * 1.0f) / ((float) j2.f76207c)));
                        jSONObject2.put("video_cache_read_size", (double) ((((float) j2.f76206b) * 1.0f) / ((float) j2.f76207c)));
                        jSONObject2.put("video_cache_read_cnt", j2.f76207c);
                        jSONObject2.put("video_cache_use_ttnet", Proxy.k);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    private void b(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f45106a, false, 41013, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f45106a, false, 41013, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.H) {
            IFeedViewHolder af2 = this.m.af();
            if (b.f(af2)) {
                int i2 = AbTestManager.a().d().videoBufferringThreshold;
                if (z2) {
                    this.L++;
                    if (this.K == -1) {
                        this.K = SystemClock.elapsedRealtime();
                    }
                    u();
                    this.Y = (DisposableObserver) Observable.timer((long) i2, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableObserver<Long>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45132a;

                        public final void onError(Throwable th) {
                        }

                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }

                        public final void onComplete() {
                            if (PatchProxy.isSupport(new Object[0], this, f45132a, false, 41074, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f45132a, false, 41074, new Class[0], Void.TYPE);
                                return;
                            }
                            n.this.n.aa();
                        }
                    });
                    if (af2.k().y() != null) {
                        af2.k().y().f76072d = this.L;
                    }
                } else {
                    if (this.K != -1) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - this.K;
                        this.I += elapsedRealtime;
                        this.K = -1;
                        if (!z3 && elapsedRealtime >= ((long) i2)) {
                            a(af2, elapsedRealtime, "resume", true);
                        }
                        if (af2.k().y() != null) {
                            af2.k().y().f76071c = this.I;
                        }
                    }
                    u();
                    this.n.Y();
                }
                com.ss.android.ugc.playerkit.b.b.a(f45107b, "onBuffering() called with: start = [" + z2 + "]");
                a(new com.ss.android.ugc.aweme.shortvideo.f.f(8, z2, 0));
            }
        }
    }

    private void a(Aweme aweme, long j2) {
        String str;
        boolean z2;
        Aweme aweme2 = aweme;
        long j3 = j2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{aweme2, new Long(j3)}, this, f45106a, false, 41057, new Class[]{Aweme.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, new Long(j3)}, this, f45106a, false, 41057, new Class[]{Aweme.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (aweme2 != null || TextUtils.isEmpty(aweme.getAid())) {
            StringBuilder sb = new StringBuilder("reportPreload ");
            sb.append(aweme.getAid());
            sb.append(" ");
            if (aweme2 == null) {
                str = "null";
            } else {
                str = aweme.getAid();
            }
            sb.append(str);
            if (this.F.aD()) {
                Aweme h2 = h();
                if (h2 == null || !aweme.getAid().equals(h2.getAid())) {
                    if (aweme.getPreload() == null || (aweme.getPreload().commentPreload < 0 && aweme.getPreload().profilePreload < 0)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    boolean d2 = com.ss.android.ugc.aweme.feed.d.b.d();
                    MLModel a2 = AbTestManager.a().a("profile");
                    MLModel a3 = AbTestManager.a().a("comment");
                    if (!(a2 == null && a3 == null)) {
                        z3 = true;
                    }
                    if (d2 || z2 || z3) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("group_id", aweme.getAid());
                            if (z2) {
                                if (aweme.getPreload().commentPreload >= 0) {
                                    jSONObject.put("comment_hit", com.ss.android.ugc.aweme.store.d.a().b(com.ss.android.ugc.aweme.store.a.a(aweme.getAid(), d.a.COMMENT)) ? 1 : 0);
                                }
                                if (aweme.getPreload().profilePreload >= 0) {
                                    com.ss.android.ugc.aweme.store.d.a().b(com.ss.android.ugc.aweme.store.a.a(aweme.getAid(), d.a.POST));
                                    jSONObject.put("profile_hit", com.ss.android.ugc.aweme.store.d.a().b(com.ss.android.ugc.aweme.store.a.a(aweme.getAid(), d.a.PROFILE)) ? 1 : 0);
                                }
                            }
                            if (d2) {
                                com.ss.android.ugc.aweme.feed.d.b.a().a(jSONObject, aweme, (int) j3);
                                com.ss.android.ugc.aweme.feed.d.b.a().a(this.F.j(aweme));
                            }
                            if (z3) {
                                if (aweme.getPreload() != null && aweme.getPreload().commentPreload >= 0) {
                                    jSONObject.put("c_task_status", com.ss.android.ugc.aweme.store.e.a().b(aweme.getAid(), d.a.COMMENT));
                                }
                                if (aweme.getPreload() != null && aweme.getPreload().profilePreload >= 0) {
                                    jSONObject.put("p_task_status", com.ss.android.ugc.aweme.store.e.a().b(aweme.getAid(), d.a.PROFILE));
                                }
                            }
                        } catch (JSONException unused) {
                        } catch (Throwable th) {
                            com.ss.android.ugc.aweme.store.e.a().a(aweme.getAid());
                            throw th;
                        }
                        com.ss.android.ugc.aweme.store.e.a().a(aweme.getAid());
                        new StringBuilder("applog ").append(jSONObject.toString());
                        AppLogNewUtils.onEventV3("resource_preload", jSONObject);
                    }
                }
            }
        }
    }

    private static void a(Video video, boolean z2) {
        final Video video2 = video;
        if (PatchProxy.isSupport(new Object[]{video2, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f45106a, true, 40989, new Class[]{Video.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, Byte.valueOf(z2)}, null, f45106a, true, 40989, new Class[]{Video.class, Boolean.TYPE}, Void.TYPE);
        } else if (video2 != null) {
            final boolean z3 = z2;
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45117a;

                public final void run() {
                    String str;
                    if (PatchProxy.isSupport(new Object[0], this, f45117a, false, 41070, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45117a, false, 41070, new Class[0], Void.TYPE);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playUrl", JSON.toJSONString(video2.getPlayAddrH265()));
                        com.ss.android.ugc.aweme.video.e.c.a(jSONObject);
                        File a2 = com.ss.android.ugc.aweme.video.b.a(com.ss.android.ugc.aweme.video.b.c(), "cache");
                        if (a2 == null) {
                            str = "";
                        } else {
                            str = new com.ss.android.ugc.aweme.shortvideo.helper.c("file", a2.getPath() + "/" + com.toutiao.proxyserver.f.a.a(video2.getProperPlayAddr().getUri())).toString();
                        }
                        jSONObject.put("file", str);
                    } catch (Exception unused) {
                    }
                    com.ss.android.ugc.aweme.app.n.a("aweme_media_h265_error_rate", z3 ^ true ? 1 : 0, jSONObject);
                }
            });
        }
    }

    public n(String str, int i2, BaseListFragmentPanel baseListFragmentPanel) {
        super(str, i2);
        this.F = baseListFragmentPanel;
        this.f45110e = -1;
        this.f45111f = -1;
        this.g = -1;
        this.h = -1;
    }

    private void a(IFeedViewHolder iFeedViewHolder, long j2, String str, boolean z2) {
        String str2;
        String str3;
        String str4;
        IFeedViewHolder iFeedViewHolder2 = iFeedViewHolder;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder2, new Long(j3), str, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45106a, false, 41014, new Class[]{IFeedViewHolder.class, Long.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {iFeedViewHolder2, new Long(j3), str, Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f45106a, false, 41014, new Class[]{IFeedViewHolder.class, Long.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        JSONObject b2 = b(iFeedViewHolder, j2, str, z2);
        if (b2 != null) {
            if (z2) {
                str2 = "video_block";
            } else {
                str2 = "video_decoder_block";
            }
            r.a(str2, b2);
            if (z2) {
                str3 = "video_block";
            } else {
                str3 = "video_decoder_block";
            }
            com.ss.android.ugc.aweme.t.b.b(str3, b2);
            if (z2) {
                a(iFeedViewHolder2, b2);
            }
            if (z2) {
                str4 = "aweme_block_bitrate_netspeed_log";
            } else {
                str4 = "aweme_block_decoder_log";
            }
            com.ss.android.ugc.aweme.app.n.a(str4, b2);
        }
    }

    private JSONObject b(IFeedViewHolder iFeedViewHolder, long j2, String str, boolean z2) {
        int i2;
        long j3 = j2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, new Long(j3), str2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45106a, false, 41015, new Class[]{IFeedViewHolder.class, Long.TYPE, String.class, Boolean.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, new Long(j3), str2, Byte.valueOf(z2)}, this, f45106a, false, 41015, new Class[]{IFeedViewHolder.class, Long.TYPE, String.class, Boolean.TYPE}, JSONObject.class);
        } else if (iFeedViewHolder == null || iFeedViewHolder.d() == null) {
            return null;
        } else {
            Video video = iFeedViewHolder.d().getVideo();
            if (video == null) {
                return null;
            }
            VideoUrlModel playAddr = video.getPlayAddr();
            if (playAddr == null) {
                return null;
            }
            try {
                JSONObject b2 = com.ss.android.ugc.aweme.feed.a.a().b(iFeedViewHolder.d(), this.s);
                if (this.l != null) {
                    b2.put("enter_from", this.l.a(true));
                }
                b2.put("duration", j3);
                b2.put("position", m().c());
                b2.put("end_type", str2);
                b2.put("player_type", m().m().toString());
                b2.put("is_ad", b.d(iFeedViewHolder) ? 1 : 0);
                b2.put("is_cache", com.ss.android.ugc.aweme.video.preload.g.f().a(playAddr) ? 1 : 0);
                b2.put("is_first", this.ac ? 1 : 0);
                b2.put("video_duration", playAddr.getDuration());
                int i3 = -1;
                if (com.ss.android.ugc.aweme.video.preload.g.f().a(playAddr)) {
                    b2.put("cache_size", com.ss.android.ugc.aweme.video.preload.g.f().i(playAddr) / 1024);
                } else {
                    b2.put("cache_size", -1);
                }
                if (VideoBitRateABManager.a().c()) {
                    Integer a2 = b.a(playAddr);
                    int b3 = b.b(playAddr);
                    if (a2 == null) {
                        List<BitRate> bitRate = video.getBitRate();
                        if (bitRate != null) {
                            Iterator<BitRate> it2 = bitRate.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                BitRate next = it2.next();
                                if (next != null && next.getPlayAddr() != null && !TextUtils.isEmpty(next.getPlayAddr().getUri()) && playAddr.getUri() != null && playAddr.getUri().startsWith(next.getPlayAddr().getUri())) {
                                    a2 = Integer.valueOf(next.getBitRate());
                                    b3 = next.getQualityType();
                                    break;
                                }
                            }
                        }
                    }
                    if (a2 != null) {
                        i3 = a2.intValue();
                    }
                    b2.put("video_bitrate", i3);
                    b2.put("video_quality", b3);
                    List<BitRate> bitRate2 = playAddr.getBitRate();
                    if (bitRate2 != null && !bitRate2.isEmpty()) {
                        b2.put("bitrate_set", new JSONArray(new GsonBuilder().setExclusionStrategies(new BitRate.ExcludeStrategy()).create().toJson((Object) bitRate2)));
                    }
                }
                Session b4 = com.ss.android.ugc.playerkit.session.a.a().b();
                if (b4 != null) {
                    b2.put("is_h265", b4.h265 ? 1 : 0);
                }
                b2.put("internet_speed", com.ss.android.ugc.c.b.e());
                b2.put("group_id", aa.m(iFeedViewHolder.d()));
                if (!z2) {
                    o m2 = m();
                    if (PatchProxy.isSupport(new Object[0], m2, o.f76178a, false, 89017, new Class[0], Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], m2, o.f76178a, false, 89017, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        i2 = (int) m2.f76182e.a(9);
                    }
                    b2.put("drop_cnt", i2);
                } else {
                    com.ss.android.ugc.aweme.video.preload.e f2 = com.ss.android.ugc.aweme.video.preload.g.f().f(playAddr);
                    if (f2 != null) {
                        b2.put("request_info", f2.toString());
                    }
                }
                b2.put("video_size", String.valueOf(com.ss.android.ugc.aweme.video.preload.g.f().h(playAddr)));
                return b2;
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
