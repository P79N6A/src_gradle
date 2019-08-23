package com.bytedance.android.livesdk.chatroom.end;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.constraint.Group;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.media.Media;
import com.bytedance.android.live.base.model.media.d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.ae;
import com.bytedance.android.live.core.utils.aj;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.api.EndPageRecommendRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.end.TopFansLayout;
import com.bytedance.android.livesdk.chatroom.ui.ag;
import com.bytedance.android.livesdk.chatroom.ui.eo;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.utils.u;
import com.bytedance.android.livesdk.viewmodel.AssetAuthorizeViewModel;
import com.bytedance.android.livesdk.w.e;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.a.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.facebook.imagepipeline.request.Postprocessor;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.taobao.android.dexposed.ClassUtils;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveBroadcastEndFragment extends LiveEndFragment implements a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10043a;
    private TextView F;
    private TextView G;
    private TextView H;
    private TextView I;
    private TextView J;
    private HSImageView K;
    private View L;
    private View M;
    private View N;
    private View O;
    private HSImageView P;
    private HSImageView Q;
    private ImageView R;
    private ImageView S;
    private VHeadView T;
    private TextView U;
    private ImageView V;
    private TextView W;
    private ImageView X;
    private ImageView Y;
    private TextView Z;
    private TextView aa;
    private TextView ab;
    private TextView ac;
    private View ad;
    private String ae;
    private List<d> af;
    private String ag;
    private CharSequence ah;
    private CharSequence ai;
    private CharSequence aj;
    private WeakHandler ak = new WeakHandler(this);
    private a al;
    private long am;
    private AssetAuthorizeViewModel an;
    private TextView ao;
    private TopFansLayout ap;
    private LinearLayout aq;
    private TextView ar;
    private TextView as;
    private TextView at;
    private View au;
    private View.OnClickListener av = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10060a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10061c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10060a, true, 4250, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10060a, true, 4250, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LiveBroadcastEndFragment.java", AnonymousClass6.class);
            f10061c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.end.LiveBroadcastEndFragment$6", "android.view.View", NotifyType.VIBRATE, "", "void"), 710);
        }

        public void onClick(View view) {
            float f2;
            float f3;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f10060a, false, 4249, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f10060a, false, 4249, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10061c, this, this, view2));
            int id = view.getId();
            if (id == C0906R.id.j6) {
                if (!com.bytedance.android.livesdkapi.a.a.f18616d || !LiveBroadcastEndFragment.this.l) {
                    LiveBroadcastEndFragment.this.d();
                    return;
                }
                LiveBroadcastEndFragment liveBroadcastEndFragment = LiveBroadcastEndFragment.this;
                if (PatchProxy.isSupport(new Object[0], liveBroadcastEndFragment, LiveBroadcastEndFragment.f10043a, false, 4226, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], liveBroadcastEndFragment, LiveBroadcastEndFragment.f10043a, false, 4226, new Class[0], Void.TYPE);
                } else {
                    if (liveBroadcastEndFragment.o == null) {
                        liveBroadcastEndFragment.o = new ag(liveBroadcastEndFragment.getContext());
                        liveBroadcastEndFragment.o.setOnDismissListener(new e(liveBroadcastEndFragment));
                    }
                    liveBroadcastEndFragment.o.show();
                }
            } else if (id == C0906R.id.d43) {
                LiveBroadcastEndFragment.this.c();
            } else if (id == C0906R.id.aen) {
                f.a((Context) LiveBroadcastEndFragment.this.n).a("camera", "source", 7, 0);
                LiveBroadcastEndFragment.this.a(0, "live_ending");
            } else if (id == C0906R.id.cme) {
                LiveBroadcastEndFragment.this.a(0, "anchor_live_ending");
            } else if (id == C0906R.id.d2m) {
                LiveBroadcastEndFragment.this.a(1, "anchor_live_ending");
            } else {
                int i = 8;
                if (id == C0906R.id.ox) {
                    f.a((Context) LiveBroadcastEndFragment.this.n).a("take_video", "anchor_live_over", LiveBroadcastEndFragment.this.B.getId(), 0);
                    LiveBroadcastEndFragment.this.j = true;
                    TTLiveSDKContext.getHostService().b().b().a((d.a) e.CLICK_RECORD_BUTTON_IN_END_LIVE, LiveBroadcastEndFragment.this.j);
                    LiveBroadcastEndFragment.this.h.setVisibility(8);
                    if (LiveBroadcastEndFragment.this.p != null) {
                        LiveBroadcastEndFragment.this.p.a();
                    }
                    com.bytedance.android.livesdk.j.a.a().a("pm_live_take_video_add", new j().b("live_take").f("click").a("anchor_live_ending"), new k());
                    if (com.bytedance.android.livesdk.o.a.a(com.bytedance.android.livesdkapi.j.a.LiveResource)) {
                        LiveBroadcastEndFragment.this.b();
                    } else {
                        com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(LiveBroadcastEndFragment.this.getContext(), "live_end", new i.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f10063a;

                            public final void b(String str) {
                            }

                            public final void a(String str) {
                                if (PatchProxy.isSupport(new Object[]{str}, this, f10063a, false, 4251, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str}, this, f10063a, false, 4251, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                LiveBroadcastEndFragment.this.m.add(g.a().c().subscribe(new g(this), h.f10110b));
                            }
                        });
                    }
                } else if (id == C0906R.id.d_7 || id == C0906R.id.bd9) {
                    com.bytedance.android.livesdk.v.j.q().f().a(LiveBroadcastEndFragment.this.getContext(), c.b(String.format("https://hotsoon.snssdk.com/falcon/live_inroom/page/live_cheats/index.html?room_id=%d", new Object[]{Long.valueOf(LiveBroadcastEndFragment.this.B.getId())})).a(ac.a((int) C0906R.string.d1q)));
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_belong", "live");
                    hashMap.put("event_type", "click");
                    hashMap.put("event_page", "anchor_live_ending");
                    hashMap.put("room_id", String.valueOf(LiveBroadcastEndFragment.this.B.getId()));
                    hashMap.put("user_id", String.valueOf(LiveBroadcastEndFragment.this.B.getOwner().getId()));
                    com.bytedance.android.livesdk.j.a.a().a("live_assit_guide_click", hashMap, new Object[0]);
                } else {
                    float f4 = 0.0f;
                    if (id == C0906R.id.dwq) {
                        if (!com.bytedance.android.livesdkapi.a.a.f18614b && !com.bytedance.android.live.uikit.a.a.b() && !com.bytedance.android.live.uikit.a.a.f()) {
                            com.bytedance.android.livesdk.j.a.a().a("pm_live_take_count_click", new j().b("live_take").f("click").a("anchor_live_ending"), new k());
                            LiveBroadcastEndFragment.this.i.setVisibility(0);
                            LiveBroadcastEndFragment.this.i.setPivotY(0.0f);
                            LiveBroadcastEndFragment liveBroadcastEndFragment2 = LiveBroadcastEndFragment.this;
                            ViewPropertyAnimator animate = LiveBroadcastEndFragment.this.i.animate();
                            if (!LiveBroadcastEndFragment.this.t) {
                                f4 = 1.0f;
                            }
                            liveBroadcastEndFragment2.s = animate.scaleY(f4).setDuration(200).setListener(new Animator.AnimatorListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f10065a;

                                public final void onAnimationCancel(Animator animator) {
                                }

                                public final void onAnimationRepeat(Animator animator) {
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f10065a, false, 4254, new Class[]{Animator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f10065a, false, 4254, new Class[]{Animator.class}, Void.TYPE);
                                        return;
                                    }
                                    LiveBroadcastEndFragment.this.q.setClickable(true);
                                }
                            });
                            ViewPropertyAnimator animate2 = LiveBroadcastEndFragment.this.f10044b.animate();
                            if (!LiveBroadcastEndFragment.this.t) {
                                f2 = UIUtils.dip2Px(LiveBroadcastEndFragment.this.n, 56.0f);
                            } else {
                                f2 = -UIUtils.dip2Px(LiveBroadcastEndFragment.this.n, 56.0f);
                            }
                            animate2.translationYBy(f2).setDuration(200).start();
                            if (LiveBroadcastEndFragment.this.z != null) {
                                ViewPropertyAnimator animate3 = LiveBroadcastEndFragment.this.z.animate();
                                if (!LiveBroadcastEndFragment.this.t) {
                                    f3 = UIUtils.dip2Px(LiveBroadcastEndFragment.this.n, 56.0f);
                                } else {
                                    f3 = -UIUtils.dip2Px(LiveBroadcastEndFragment.this.n, 56.0f);
                                }
                                animate3.translationYBy(f3).setDuration(200).start();
                            }
                            LiveBroadcastEndFragment.this.s.start();
                            LiveBroadcastEndFragment.this.r.animate().rotationBy(180.0f).setDuration(200).start();
                            LiveBroadcastEndFragment.this.q.setClickable(false);
                            LiveBroadcastEndFragment.this.t = !LiveBroadcastEndFragment.this.t;
                        }
                    } else if (view2.equals(LiveBroadcastEndFragment.this.x)) {
                        if (LiveBroadcastEndFragment.this.b_()) {
                            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(LiveBroadcastEndFragment.this.getContext(), LiveBroadcastEndFragment.this.k);
                        }
                    } else if (view2.equals(LiveBroadcastEndFragment.this.w) || view2.equals(LiveBroadcastEndFragment.this.v)) {
                        if (LiveBroadcastEndFragment.this.b_()) {
                            if (LiveBroadcastEndFragment.this.y.getVisibility() != 0) {
                                i = 0;
                            }
                            LiveBroadcastEndFragment.this.y.setVisibility(i);
                            if (i == 0) {
                                LiveBroadcastEndFragment.this.w.animate().rotation(180.0f).start();
                            } else {
                                LiveBroadcastEndFragment.this.w.animate().rotation(0.0f).start();
                            }
                        }
                    } else if (!(id != C0906R.id.ad3 || LiveBroadcastEndFragment.this.B == null || LiveBroadcastEndFragment.this.B.getId() == 0)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("roomId", LiveBroadcastEndFragment.this.B.getId());
                        } catch (JSONException unused) {
                        }
                        TTLiveSDKContext.getHostService().i().a(jSONObject.toString(), (Context) LiveBroadcastEndFragment.this.n);
                        HashMap hashMap2 = new HashMap(1);
                        hashMap2.put("event_from", "anchor_liveend");
                        TTLiveSDKContext.getHostService().d().a("livesdk_pm_liveend_feedback", hashMap2);
                    }
                }
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f10044b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f10045c;
    public TextView h;
    public View i;
    public boolean j;
    public String k;
    public boolean l;
    public final CompositeDisposable m = new CompositeDisposable();
    public Activity n;
    ag o;
    public com.bytedance.android.livesdk.f p;
    public View q;
    public ImageView r;
    public ViewPropertyAnimator s;
    public boolean t = true;
    public RelativeLayout u;
    public View v;
    public View w;
    public TextView x;
    public Group y;
    public View z;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4227, new Class[0], Void.TYPE);
            return;
        }
        this.ak.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f10067a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f10067a, false, 4255, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f10067a, false, 4255, new Class[0], Void.TYPE);
                } else if (TTLiveSDKContext.getHostService().c().a(LiveBroadcastEndFragment.this.n, "live_end_dialog")) {
                    LiveBroadcastEndFragment.this.n.finish();
                }
            }
        }, 200);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4233, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.ak != null) {
            this.ak.removeCallbacks(null);
        }
        this.m.clear();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4216, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4215, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4221, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.s != null) {
            this.s.cancel();
        }
    }

    public final boolean i_() {
        if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4237, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4237, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.al == null || !this.al.i_()) {
            return false;
        } else {
            if (this.n != null) {
                this.n.finish();
            }
            return true;
        }
    }

    public void onEvent(com.bytedance.android.livesdkapi.depend.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f10043a, false, 4217, new Class[]{com.bytedance.android.livesdkapi.depend.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f10043a, false, 4217, new Class[]{com.bytedance.android.livesdkapi.depend.b.b.class}, Void.TYPE);
        } else if (bVar == null || !isAdded()) {
        } else {
            ((FragmentActivity) this.n).getSupportFragmentManager();
        }
    }

    public void setArguments(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f10043a, false, 4211, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f10043a, false, 4211, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.setArguments(bundle);
        this.ag = bundle.getString("live_end_banned_url", null);
        this.ah = bundle.getCharSequence("live_end_banned_title", null);
        this.ai = bundle.getCharSequence("live_end_banned_reason", null);
        this.aj = bundle.getCharSequence("live_end_banned_content", null);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f10043a, false, 4212, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f10043a, false, 4212, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.B != null) {
            h a2 = h.a();
            WeakHandler weakHandler = this.ak;
            long id = this.B.getId();
            if (PatchProxy.isSupport(new Object[]{weakHandler, (byte) 1, new Long(id), 4, (byte) 1, 1, 12}, a2, h.f9797a, false, 3996, new Class[]{Handler.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                h hVar = a2;
                PatchProxy.accessDispatch(new Object[]{weakHandler, (byte) 1, new Long(id), 4, (byte) 1, 1, 12}, hVar, h.f9797a, false, 3996, new Class[]{Handler.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            com.bytedance.ies.d.a.b a3 = com.bytedance.ies.d.a.b.a();
            h.AnonymousClass2 r11 = new Callable(true, id, 4, true, 1) {

                /* renamed from: a */
                public static ChangeQuickRedirect f9805a;

                /* renamed from: b */
                final /* synthetic */ boolean f9806b;

                /* renamed from: c */
                final /* synthetic */ long f9807c;

                /* renamed from: d */
                final /* synthetic */ int f9808d;

                /* renamed from: e */
                final /* synthetic */ boolean f9809e;

                /* renamed from: f */
                final /* synthetic */ int f9810f;

                public final java.lang.Object call(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.bl.h.2.call():java.lang.Object, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.bl.h.2.call():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            };
            a3.a(weakHandler, r11, 12);
        }
    }

    private void a(List<com.bytedance.android.live.base.model.media.d> list) {
        Media media;
        String str;
        List<com.bytedance.android.live.base.model.media.d> list2 = list;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f10043a, false, 4231, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f10043a, false, 4231, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int size = list.size();
        if (size <= 0) {
            this.X.setVisibility(0);
            this.Y.setVisibility(0);
        }
        if (size == 1) {
            this.Y.setVisibility(0);
        }
        int i3 = 0;
        while (i3 < size) {
            com.bytedance.android.live.base.model.media.d dVar = list2.get(i3);
            if (!(dVar == null || dVar.f7733a == null)) {
                if (i3 == 0) {
                    com.bytedance.android.livesdk.chatroom.f.b.a(this.P, dVar.f7733a);
                    this.R.setVisibility(i2);
                    this.N.setOnClickListener(this.av);
                }
                if (i3 == 1) {
                    com.bytedance.android.livesdk.chatroom.f.b.a(this.Q, dVar.f7733a);
                    this.S.setVisibility(i2);
                    this.O.setOnClickListener(this.av);
                }
                Room room = this.B;
                Object[] objArr = new Object[4];
                objArr[i2] = room;
                objArr[1] = dVar;
                objArr[2] = (byte) 1;
                objArr[3] = null;
                ChangeQuickRedirect changeQuickRedirect = f10043a;
                Class[] clsArr = new Class[4];
                clsArr[i2] = Room.class;
                clsArr[1] = com.bytedance.android.live.base.model.media.d.class;
                clsArr[2] = Boolean.TYPE;
                clsArr[3] = String.class;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 4234, clsArr, Void.TYPE)) {
                    Object[] objArr2 = new Object[4];
                    objArr2[i2] = room;
                    objArr2[1] = dVar;
                    objArr2[2] = (byte) 1;
                    objArr2[3] = null;
                    ChangeQuickRedirect changeQuickRedirect2 = f10043a;
                    Class[] clsArr2 = new Class[4];
                    clsArr2[i2] = Room.class;
                    clsArr2[1] = com.bytedance.android.live.base.model.media.d.class;
                    clsArr2[2] = Boolean.TYPE;
                    clsArr2[3] = String.class;
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, 4234, clsArr2, Void.TYPE);
                } else if (room != null) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i2] = dVar;
                    ChangeQuickRedirect changeQuickRedirect3 = f10043a;
                    Class[] clsArr3 = new Class[1];
                    clsArr3[i2] = com.bytedance.android.live.base.model.media.d.class;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, 4235, clsArr3, Media.class)) {
                        Object[] objArr4 = new Object[1];
                        objArr4[i2] = dVar;
                        ChangeQuickRedirect changeQuickRedirect4 = f10043a;
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i2] = com.bytedance.android.live.base.model.media.d.class;
                        media = (Media) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, 4235, clsArr4, Media.class);
                    } else {
                        media = (Media) com.bytedance.android.livesdk.v.j.q().c().fromJson(dVar.f7734b, Media.class);
                    }
                    if (media != null) {
                        long id = room.getId();
                        long userFrom = room.getUserFrom();
                        String requestId = room.getRequestId();
                        TTLiveSDKContext.getHostService().k().b();
                        if (room.isLiveTypeAudio()) {
                            str = "voice_live";
                        } else {
                            str = "video_live";
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_page", "anchor_live_ending");
                        hashMap.put("event_module", "video");
                        hashMap.put("room_id", String.valueOf(id));
                        hashMap.put("video_id", String.valueOf(media.getId()));
                        hashMap.put("request_id", requestId);
                        hashMap.put("log_pb", room.getLog_pb());
                        hashMap.put("live_type", str);
                        hashMap.put("source", String.valueOf(userFrom));
                        if (media != null) {
                            if (media.getVideoPicNum() > 0) {
                                hashMap.put("video_type", "photofilm");
                            } else {
                                hashMap.put("video_type", "video");
                            }
                            if (media.getMusic() != null) {
                                hashMap.put("music", media.getMusic().f7731e);
                                hashMap.put("music_id", String.valueOf(media.getMusic().f7728b));
                            }
                            if (media.getHashTag() != null) {
                                hashMap.put("hashtag_content", media.getHashTag().f7726b);
                                hashMap.put("hashtag_id", String.valueOf(media.getHashTag().f7725a));
                            }
                        }
                        com.bytedance.android.livesdk.j.a.a().a("video_show", hashMap, new j().b("video_view").f("show"));
                        i3++;
                        i2 = 0;
                    }
                }
            }
            i3++;
            i2 = 0;
        }
    }

    public void handleMsg(Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f10043a, false, 4229, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f10043a, false, 4229, new Class[]{Message.class}, Void.TYPE);
        } else if (this.n != null && !this.n.isFinishing()) {
            int i2 = message2.what;
            if (message2.obj instanceof Exception) {
                if ((!com.bytedance.android.livesdkapi.a.a.f18614b || !(i2 == 21 || i2 == 22)) && (message2.obj instanceof com.bytedance.android.live.a.a.b.a)) {
                    com.bytedance.android.live.uikit.d.a.a((Context) this.n, ((com.bytedance.android.live.a.a.b.a) message2.obj).getPrompt());
                }
                return;
            }
            if (12 == i2 && (message2.obj instanceof Room)) {
                Room room = (Room) message2.obj;
                if (PatchProxy.isSupport(new Object[]{room}, this, f10043a, false, 4222, new Class[]{Room.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{room}, this, f10043a, false, 4222, new Class[]{Room.class}, Void.TYPE);
                } else if (!(room == null || room.getStats() == null)) {
                    if (room.isLiveTypeAudio()) {
                        this.F.setText(C0906R.string.d1u);
                    }
                    if (com.bytedance.android.live.uikit.a.a.f() && room.getOrientation() == 2 && this.C) {
                        this.F.setText(C0906R.string.d1z);
                    }
                    RoomStats stats = room.getStats();
                    if (com.bytedance.android.live.uikit.a.a.f()) {
                        str3 = com.bytedance.android.live.core.utils.e.a((long) stats.getEnterCount());
                    } else {
                        str3 = com.bytedance.android.live.core.utils.e.a((long) stats.getTotalUser()) + ClassUtils.PACKAGE_SEPARATOR;
                    }
                    if (com.bytedance.android.live.core.utils.e.e((long) stats.getTotalUser())) {
                        SpannableString a2 = ae.a(str3, 0.6777f, str3.length() - 2, str3.length() - 1);
                        i.a(a2, new ForegroundColorSpan(0), str3.length() - 1, str3.length(), 18);
                        this.G.setText(a2);
                    }
                    if (com.bytedance.android.live.uikit.a.a.g() || com.bytedance.android.live.uikit.a.a.d()) {
                        String str5 = com.bytedance.android.live.core.utils.e.a((long) stats.getTotalUser()) + PushConstants.PUSH_TYPE_NOTIFY;
                        if (com.bytedance.android.live.core.utils.e.e((long) stats.getTotalUser())) {
                            SpannableString a3 = ae.a(str5, 0.6777f, str5.length() - 2, str5.length() - 1);
                            i.a(a3, new ForegroundColorSpan(0), str5.length() - 1, str5.length(), 18);
                            this.G.setText(a3);
                        } else {
                            SpannableString spannableString = new SpannableString(str5);
                            i.a(spannableString, new ForegroundColorSpan(0), str5.length() - 1, str5.length(), 18);
                            this.G.setText(spannableString);
                        }
                    } else {
                        String a4 = com.bytedance.android.live.core.utils.e.a((long) stats.getTotalUser());
                        if (com.bytedance.android.live.core.utils.e.e((long) stats.getTotalUser())) {
                            this.G.setText(ae.a(a4, 0.6777f, a4.length() - 1, a4.length()));
                        } else {
                            this.G.setText(a4);
                        }
                    }
                    String a5 = com.bytedance.android.live.core.utils.e.a(stats.getTicket());
                    if (!com.bytedance.android.live.core.utils.e.e(stats.getTicket())) {
                        this.H.setText(a5);
                    } else if (com.bytedance.android.live.uikit.a.a.d()) {
                        this.H.setText(ae.b(a5, 20.0f, a5.length() - 1, a5.length()));
                    } else {
                        this.H.setText(ae.a(a5, 0.6777f, a5.length() - 1, a5.length()));
                    }
                    String a6 = com.bytedance.android.live.core.utils.e.a((long) stats.getFollowCount());
                    if (com.bytedance.android.live.core.utils.e.e((long) stats.getFollowCount())) {
                        this.I.setText(ae.a(a6, 0.6777f, a6.length() - 1, a6.length()));
                    } else {
                        this.I.setText(a6);
                    }
                    if (com.bytedance.android.live.uikit.a.a.f()) {
                        str4 = com.bytedance.android.live.core.utils.e.a((long) stats.getWatermelon());
                    } else {
                        str4 = com.bytedance.android.live.core.utils.e.a((long) stats.getGiftUVCount());
                    }
                    if (com.bytedance.android.live.core.utils.e.e((long) stats.getGiftUVCount())) {
                        this.J.setText(ae.a(str4, 0.6777f, str4.length() - 1, str4.length()));
                    } else {
                        this.J.setText(str4);
                    }
                    this.r.setRotation(180.0f);
                    final com.bytedance.android.livesdkapi.depend.model.live.i healthScoreInfo = room.getHealthScoreInfo();
                    if (healthScoreInfo != null && com.bytedance.android.live.uikit.a.a.d()) {
                        double d2 = healthScoreInfo.f18743a;
                        this.aq.setVisibility(0);
                        this.ar.setText(new DecimalFormat("#.## ").format(d2));
                        this.aq.setOnClickListener(new View.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f10050a;

                            /* renamed from: d  reason: collision with root package name */
                            private static final /* synthetic */ a.C0900a f10051d;

                            static {
                                if (PatchProxy.isSupport(new Object[0], null, f10050a, true, 4245, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], null, f10050a, true, 4245, new Class[0], Void.TYPE);
                                    return;
                                }
                                b bVar = new b("LiveBroadcastEndFragment.java", AnonymousClass3.class);
                                f10051d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.end.LiveBroadcastEndFragment$3", "android.view.View", NotifyType.VIBRATE, "", "void"), 567);
                            }

                            public void onClick(View view) {
                                if (PatchProxy.isSupport(new Object[]{view}, this, f10050a, false, 4244, new Class[]{View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view}, this, f10050a, false, 4244, new Class[]{View.class}, Void.TYPE);
                                    return;
                                }
                                com.bytedance.android.livesdk.a.b.a().a(b.a(f10051d, this, this, view));
                                if (!TextUtils.isEmpty(healthScoreInfo.f18745c)) {
                                    com.bytedance.android.livesdk.v.j.q().f().a(LiveBroadcastEndFragment.this.getContext(), c.b(healthScoreInfo.f18745c).a(true));
                                    LiveBroadcastEndFragment.this.u.setVisibility(8);
                                    com.bytedance.android.livesdk.j.a.a().a("livesdk_health_score_page_show", new j().e("live_end"));
                                }
                            }
                        });
                        if (PatchProxy.isSupport(new Object[]{healthScoreInfo}, this, f10043a, false, 4224, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.i.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{healthScoreInfo}, this, f10043a, false, 4224, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.i.class}, Void.TYPE);
                        } else if (healthScoreInfo != null) {
                            String str6 = healthScoreInfo.f18744b;
                            if (((Boolean) com.bytedance.android.livesdk.w.b.aT.a()).booleanValue() && TextUtils.isEmpty(str6)) {
                                str6 = ac.a((int) C0906R.string.d8p);
                            }
                            if (!TextUtils.isEmpty(str6)) {
                                this.as.setText(str6);
                                this.u.setVisibility(0);
                                this.u.setOnClickListener(new View.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f10056a;

                                    /* renamed from: d  reason: collision with root package name */
                                    private static final /* synthetic */ a.C0900a f10057d;

                                    static {
                                        if (PatchProxy.isSupport(new Object[0], null, f10056a, true, 4248, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], null, f10056a, true, 4248, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        b bVar = new b("LiveBroadcastEndFragment.java", AnonymousClass5.class);
                                        f10057d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.end.LiveBroadcastEndFragment$5", "android.view.View", NotifyType.VIBRATE, "", "void"), 680);
                                    }

                                    public void onClick(View view) {
                                        if (PatchProxy.isSupport(new Object[]{view}, this, f10056a, false, 4247, new Class[]{View.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{view}, this, f10056a, false, 4247, new Class[]{View.class}, Void.TYPE);
                                            return;
                                        }
                                        com.bytedance.android.livesdk.a.b.a().a(b.a(f10057d, this, this, view));
                                        if (!TextUtils.isEmpty(healthScoreInfo.f18745c)) {
                                            com.bytedance.android.livesdk.v.j.q().f().a(LiveBroadcastEndFragment.this.getContext(), c.b(healthScoreInfo.f18745c).a(true));
                                            LiveBroadcastEndFragment.this.u.setVisibility(8);
                                            com.bytedance.android.livesdk.j.a.a().a("livesdk_health_score_page_show", new j().e("live_end"));
                                        }
                                    }
                                });
                                com.bytedance.android.livesdk.w.b.aT.a(Boolean.FALSE);
                            }
                        }
                    }
                    if (!com.bytedance.android.livesdkapi.a.a.f18614b && !com.bytedance.android.live.uikit.a.a.b() && !com.bytedance.android.live.uikit.a.a.f()) {
                        if (PatchProxy.isSupport(new Object[]{room}, this, f10043a, false, 4225, new Class[]{Room.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{room}, this, f10043a, false, 4225, new Class[]{Room.class}, Void.TYPE);
                        } else if (!(!b_() || room.getStats() == null || room.getStats().userComposition == null)) {
                            RoomStats stats2 = room.getStats();
                            this.i.setVisibility(0);
                            this.aa.setText(String.valueOf((int) (stats2.userComposition.f7716a * 100.0f)) + "%");
                            this.ab.setText(String.valueOf((int) (stats2.userComposition.f7717b * 100.0f)) + "%");
                            this.ac.setText(String.valueOf((int) (stats2.userComposition.f7718c * 100.0f)) + "%");
                        }
                    }
                    User owner = this.B.getOwner();
                    if (owner != null && owner.isFollowing()) {
                        this.D = true;
                    }
                    if (Lists.isEmpty(room.getTopFanTickets())) {
                        UIUtils.setViewVisibility(this.f10045c, 8);
                    } else {
                        this.ap.a(this.n, this, room, this.ae);
                        this.ap.setTopFansCallBack(new TopFansLayout.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f10054a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f10054a, false, 4246, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f10054a, false, 4246, new Class[0], Void.TYPE);
                                    return;
                                }
                                LiveBroadcastEndFragment.this.f10045c.setVisibility(8);
                            }
                        });
                    }
                    if (PatchProxy.isSupport(new Object[]{room}, this, f10043a, false, 4223, new Class[]{Room.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{room}, this, f10043a, false, 4223, new Class[]{Room.class}, Void.TYPE);
                    } else {
                        RoomStats stats3 = room.getStats();
                        if (stats3 != null) {
                            String douPlusPromotion = stats3.getDouPlusPromotion();
                            if (!TextUtils.isEmpty(douPlusPromotion)) {
                                JsonObject jsonObject = (JsonObject) com.bytedance.android.live.a.a().fromJson(douPlusPromotion, JsonObject.class);
                                if (jsonObject != null) {
                                    JsonElement jsonElement = jsonObject.get("live_click");
                                    JsonElement jsonElement2 = jsonObject.get("is_dou_plus_on");
                                    JsonElement jsonElement3 = jsonObject.get("task_list_path");
                                    if (jsonElement != null && !TextUtils.isEmpty(jsonElement.getAsString()) && jsonElement2 != null && jsonElement2.getAsInt() == 1 && jsonElement3 != null && !TextUtils.isEmpty(jsonElement3.getAsString())) {
                                        this.k = jsonElement3.getAsString();
                                        String asString = jsonElement.getAsString();
                                        if (this.z == null) {
                                            this.z = a(C0906R.id.b8f);
                                            if (this.z != null) {
                                                this.at = (TextView) this.z.findViewById(C0906R.id.a6e);
                                                this.x = (TextView) this.z.findViewById(C0906R.id.a6k);
                                                this.y = (Group) this.z.findViewById(C0906R.id.a6f);
                                                this.v = this.z.findViewById(C0906R.id.a6q);
                                                this.w = this.z.findViewById(C0906R.id.a6p);
                                                this.y.setReferencedIds(new int[]{C0906R.id.a6e, C0906R.id.a6d, C0906R.id.a6k});
                                                this.x.setOnClickListener(this.av);
                                                this.v.setOnClickListener(this.av);
                                                this.w.setOnClickListener(this.av);
                                            }
                                        }
                                        this.y.setVisibility(8);
                                        this.z.setVisibility(0);
                                        this.at.setText(asString);
                                    }
                                }
                            }
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(room.getId()));
                if (room.isLiveTypeAudio()) {
                    str = "voice_live";
                } else {
                    str = "video_live";
                }
                hashMap.put("live_type", str);
                hashMap.put("time", String.valueOf(room.getFinishTime() - room.getCreateTime()));
                if (this.B.isThirdParty) {
                    str2 = "thirdparty";
                } else {
                    str2 = "general";
                }
                hashMap.put("streaming_type", str2);
                com.bytedance.android.livesdk.j.a.a().a("live_over", hashMap, new j().a("live_take_page").f("click").b("live_take"));
            }
            if (21 == i2) {
                this.af = (List) message2.obj;
                a(this.af);
            }
            if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4232, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4232, new Class[0], Void.TYPE);
                return;
            }
            View a7 = a(C0906R.id.al9);
            if ((a7 instanceof FrameLayout) && com.bytedance.android.live.uikit.a.a.f()) {
                if (this.B == null || !this.B.hasCommerceGoods) {
                    UIUtils.setViewVisibility(a7, 8);
                    return;
                }
                View a8 = a(C0906R.id.ck8);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) a8.getLayoutParams();
                layoutParams.addRule(3, C0906R.id.al9);
                a8.setLayoutParams(layoutParams);
                com.bytedance.android.livesdk.n.c cVar = (com.bytedance.android.livesdk.n.c) com.bytedance.android.livesdk.v.j.q().k().a(com.bytedance.android.livesdk.n.c.class);
                View view = null;
                if (!(cVar == null || getContext() == null || this.B == null)) {
                    getContext();
                    view = cVar.i();
                }
                if (view != null) {
                    FrameLayout frameLayout = (FrameLayout) a7;
                    frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -2));
                    frameLayout.setVisibility(0);
                }
            }
        }
    }

    public final void a(int i2, String str) {
        int i3 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f10043a, false, 4228, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f10043a, false, 4228, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (SystemClock.elapsedRealtime() - this.am >= 1000 && this.n != null && !this.n.isFinishing() && this.af != null && i3 <= this.af.size() - 1) {
            f.a((Context) this.n).a("audience_live_over", "click_video", this.B.getId(), 0);
            this.am = SystemClock.elapsedRealtime();
            TTLiveSDKContext.getHostService().i().a(this.af.get(i3).f7734b, str2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        String str;
        String str2;
        long id;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f10043a, false, 4214, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f10043a, false, 4214, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4220, new Class[0], Void.TYPE);
        } else {
            this.L = a(C0906R.id.da);
            this.G = (TextView) a(C0906R.id.dwo);
            this.F = (TextView) a(C0906R.id.dwp);
            this.I = (TextView) a(C0906R.id.bq_);
            this.J = (TextView) a(C0906R.id.zj);
            this.H = (TextView) a(C0906R.id.d2q);
            View a2 = a(C0906R.id.j6);
            this.K = (HSImageView) a(C0906R.id.be4);
            this.f10044b = (LinearLayout) a(C0906R.id.ck8);
            this.f10045c = (LinearLayout) a(C0906R.id.zl);
            this.ap = (TopFansLayout) a(C0906R.id.d60);
            this.M = a(C0906R.id.drc);
            this.N = a(C0906R.id.cme);
            this.O = a(C0906R.id.d2m);
            this.P = (HSImageView) a(C0906R.id.ds0);
            this.Q = (HSImageView) a(C0906R.id.ds1);
            this.R = (ImageView) a(C0906R.id.cmc);
            this.S = (ImageView) a(C0906R.id.d2k);
            if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
                this.M.setVisibility(0);
            } else {
                this.M.setVisibility(8);
            }
            this.T = (VHeadView) a(C0906R.id.d43);
            this.U = (TextView) a(C0906R.id.d44);
            this.h = (TextView) a(C0906R.id.cbo);
            this.V = (ImageView) a(C0906R.id.ox);
            this.W = (TextView) a(C0906R.id.dsx);
            this.X = (ImageView) a(C0906R.id.aso);
            this.Y = (ImageView) a(C0906R.id.asp);
            this.Z = (TextView) a(C0906R.id.d_7);
            this.ao = (TextView) a(C0906R.id.bd6);
            this.q = a(C0906R.id.dwq);
            this.r = (ImageView) a(C0906R.id.bfb);
            if (com.bytedance.android.live.uikit.a.a.b() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.g() || com.bytedance.android.live.uikit.a.a.j()) {
                UIUtils.setViewVisibility(this.r, 8);
            }
            this.i = a(C0906R.id.dpc);
            this.aa = (TextView) a(C0906R.id.bda);
            this.ab = (TextView) a(C0906R.id.bez);
            this.ac = (TextView) a(C0906R.id.be8);
            this.ad = a(C0906R.id.s8);
            this.aq = (LinearLayout) a(C0906R.id.bea);
            this.ar = (TextView) a(C0906R.id.be_);
            this.u = (RelativeLayout) a(C0906R.id.ant);
            this.as = (TextView) a(C0906R.id.anu);
            this.au = a(C0906R.id.ad3);
            this.au.setOnClickListener(this.av);
            this.q.setOnClickListener(this.av);
            this.V.setOnClickListener(this.av);
            a2.setOnClickListener(this.av);
            this.T.setOnClickListener(this.av);
            this.Z.setOnClickListener(this.av);
            a(C0906R.id.bd9).setOnClickListener(this.av);
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live");
            hashMap.put("event_type", "show");
            hashMap.put("event_module", "live");
            if (this.B == null) {
                str2 = PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                str2 = String.valueOf(this.B.getId());
            }
            hashMap.put("room_id", str2);
            if (this.B == null) {
                id = TTLiveSDKContext.getHostService().k().b();
            } else {
                id = this.B.getOwner().getId();
            }
            hashMap.put("user_id", String.valueOf(id));
            com.bytedance.android.livesdk.j.a.a().a("live_assit_guide_show", hashMap, new Object[0]);
        }
        if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4238, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4238, new Class[0], Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.f() && com.bytedance.android.live.core.utils.g.a(getContext())) {
            UIUtils.updateLayoutMargin(this.L, 0, UIUtils.getStatusBarHeight(getContext()), 0, 0);
        }
        if (this.B != null) {
            User owner = this.B.getOwner();
            if (owner != null) {
                com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.T, owner.getAvatarThumb(), 2130841141);
                this.U.setText(owner.getNickName());
            }
            if (!com.bytedance.android.live.uikit.a.a.a()) {
                WeakHandler weakHandler = this.ak;
                long id2 = this.B.getId();
                if (PatchProxy.isSupport(new Object[]{weakHandler, new Long(id2)}, null, com.bytedance.android.livesdk.chatroom.api.a.f9743a, true, 3909, new Class[]{Handler.class, Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{weakHandler, new Long(id2)}, null, com.bytedance.android.livesdk.chatroom.api.a.f9743a, true, 3909, new Class[]{Handler.class, Long.TYPE}, Void.TYPE);
                } else {
                    ((EndPageRecommendRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(EndPageRecommendRetrofitApi.class)).getVideos(id2).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new Consumer<com.bytedance.android.live.core.network.response.c<com.bytedance.android.live.base.model.media.d>>(weakHandler) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f9744a;

                        /* renamed from: b */
                        final /* synthetic */ Handler f9745b;

                        public final /* synthetic */ void accept(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.api.a.1.accept(java.lang.Object):void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.api.a.1.accept(java.lang.Object):void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                    }, new Consumer<Throwable>(weakHandler) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f9746a;

                        /* renamed from: b */
                        final /* synthetic */ Handler f9747b;

                        public final /* synthetic */ void accept(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.api.a.2.accept(java.lang.Object):void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.api.a.2.accept(java.lang.Object):void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                }
            }
            if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.b() || com.bytedance.android.live.uikit.a.a.g() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.j()) {
                UIUtils.setViewVisibility(this.ad, 8);
            }
            this.V.setVisibility(0);
            if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                this.Z.setVisibility(8);
            } else {
                this.Z.setVisibility(0);
            }
            if (owner != null && owner.getId() == TTLiveSDKContext.getHostService().k().b()) {
                TTLiveSDKContext.getHostService().k().a(true);
            }
            float screenWidth = ((float) UIUtils.getScreenWidth(getContext())) / ((float) UIUtils.getScreenHeight(getContext()));
            if (owner != null) {
                com.bytedance.android.livesdk.chatroom.f.b.a(this.K, owner.getAvatarLarge(), (Postprocessor) new u(8, screenWidth, null));
            }
            f.a((Context) this.n).a("anchor_live_over", "enter", this.B.getId(), 0);
            this.W.setText(C0906R.string.d1x);
            TextView textView = this.h;
            if (this.j || com.bytedance.android.livesdkapi.a.a.f18614b) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
            f.a((Context) this.n).a("anchor_live_over_show", "anchor_live_over", this.B.getId(), 0);
            com.bytedance.android.livesdk.app.dataholder.e.a().a((Integer) 0);
            if (com.bytedance.android.livesdkapi.a.a.f18616d && !TextUtils.isEmpty((CharSequence) LiveSettingKeys.I18N_ASSET_AUTHORIZE_URL.a())) {
                this.an = (AssetAuthorizeViewModel) ViewModelProviders.of((Fragment) this).get(AssetAuthorizeViewModel.class);
                this.an.f17719c.observe(this, new d(this));
                AssetAuthorizeViewModel assetAuthorizeViewModel = this.an;
                if (PatchProxy.isSupport(new Object[0], assetAuthorizeViewModel, AssetAuthorizeViewModel.f17717a, false, 13852, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], assetAuthorizeViewModel, AssetAuthorizeViewModel.f17717a, false, 13852, new Class[0], Void.TYPE);
                } else {
                    assetAuthorizeViewModel.a(assetAuthorizeViewModel.f17718b.isShowAuthorizeTips().compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new com.bytedance.android.livesdk.viewmodel.a(assetAuthorizeViewModel), com.bytedance.android.livesdk.viewmodel.b.f17747b));
                }
            }
            if (((Boolean) LiveSettingKeys.VIGO_FLAME_DIAMOND_GUIDE_SWITCH.a()).booleanValue() && com.bytedance.android.livesdkapi.a.a.f18616d) {
                if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4230, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4230, new Class[0], Void.TYPE);
                } else if (com.bytedance.android.livesdkapi.a.a.f18616d && ((Integer) com.bytedance.android.livesdk.w.b.al.a()).intValue() < 3) {
                    m.a a3 = new m.a(getContext()).d((int) C0906R.string.d04);
                    a3.c((CharSequence) ac.a((int) C0906R.string.d8y) + "\n" + ac.a((int) C0906R.string.d8z)).b(0, (int) C0906R.string.d48, f.f10106b).c();
                    com.bytedance.android.livesdk.w.c<Integer> cVar = com.bytedance.android.livesdk.w.b.al;
                    cVar.a(Integer.valueOf(((Integer) cVar.a()).intValue() + 1));
                }
            }
            long j2 = 0;
            if (this.B.getId() == ((Long) com.bytedance.android.livesdk.w.b.u.a()).longValue()) {
                j2 = SystemClock.elapsedRealtime() - ((Long) com.bytedance.android.livesdk.w.b.v.a()).longValue();
            }
            TextView textView2 = this.ao;
            Resources resources = this.n.getResources();
            Object[] objArr = new Object[1];
            int i3 = (int) j2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, null, aj.f8240a, true, 1303, new Class[]{Integer.TYPE}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, null, aj.f8240a, true, 1303, new Class[]{Integer.TYPE}, String.class);
            } else {
                int i4 = i3 / 3600000;
                int i5 = (i3 % 60000) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                str = String.format(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf((i3 % 3600000) / 60000), Integer.valueOf(i5)});
            }
            objArr[0] = str;
            UIUtils.setText(textView2, resources.getString(C0906R.string.cpr, objArr));
            if (!TextUtils.isEmpty(this.ag)) {
                if (com.bytedance.android.live.uikit.a.a.d()) {
                    if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4219, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4219, new Class[0], Void.TYPE);
                    } else if (!TextUtils.isEmpty(this.ah) && !TextUtils.isEmpty(this.ai) && !TextUtils.isEmpty(this.aj)) {
                        SpannableString spannableString = new SpannableString(ac.a((int) C0906R.string.djy));
                        spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_t)), 0, spannableString.length(), 33);
                        eo.a a4 = new eo.a(getContext(), 2).a(false).a(this.ah);
                        a4.b((CharSequence) this.ai + "\n" + this.aj).a(ac.a((int) C0906R.string.czp), new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f10048a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10048a, false, 4243, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10048a, false, 4243, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                dialogInterface.dismiss();
                            }
                        }).b(spannableString, new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f10046a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10046a, false, 4242, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10046a, false, 4242, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                com.bytedance.android.livesdk.v.j.q().f().a(LiveBroadcastEndFragment.this.getContext(), c.b("https://webcast.huoshan.com/falcon/webcast_huoshan/page/health_score/main/index.html?showHeader=1").a(true));
                                com.bytedance.android.livesdk.j.a.a().a("livesdk_health_score_page_show", new j().e("live_break"));
                            }
                        }).b();
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, f10043a, false, 4218, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f10043a, false, 4218, new Class[0], Void.TYPE);
                    } else if (com.bytedance.android.live.uikit.a.a.a()) {
                        com.bytedance.android.livesdk.v.j.q().f().a((Context) getActivity(), c.b(this.ag).a(getContext().getResources().getString(C0906R.string.cpi)));
                    } else if (com.bytedance.android.live.uikit.a.a.j()) {
                        com.bytedance.android.livesdk.v.j.q().f().a((Context) getActivity(), c.b(this.ag).a(true).a(getContext().getResources().getString(C0906R.string.cpi)));
                    } else {
                        BaseDialogFragment.a(getActivity(), (DialogFragment) com.bytedance.android.livesdk.v.j.q().f().a(c.a(this.ag).a((int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f).b(400).d(8)));
                    }
                }
            }
            if (com.bytedance.android.live.uikit.a.a.g()) {
                this.au.setVisibility(0);
            }
            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f10043a, false, 4213, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return LayoutInflater.from(getContext()).inflate(C0906R.layout.aib, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f10043a, false, 4213, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public final void a(Activity activity, Room room, com.bytedance.android.livesdkapi.depend.a.a aVar, String str) {
        Activity activity2 = activity;
        Room room2 = room;
        com.bytedance.android.livesdkapi.depend.a.a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, room2, aVar2, str2}, this, f10043a, false, 4210, new Class[]{Activity.class, Room.class, com.bytedance.android.livesdkapi.depend.a.a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, room2, aVar2, str2}, this, f10043a, false, 4210, new Class[]{Activity.class, Room.class, com.bytedance.android.livesdkapi.depend.a.a.class, String.class}, Void.TYPE);
            return;
        }
        this.n = activity2;
        this.B = room2;
        this.C = true;
        this.j = TTLiveSDKContext.getHostService().b().b().a(e.CLICK_RECORD_BUTTON_IN_END_LIVE);
        this.al = aVar2;
        this.ae = str2;
    }
}
