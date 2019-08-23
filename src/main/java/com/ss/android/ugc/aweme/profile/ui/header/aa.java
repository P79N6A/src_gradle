package com.ss.android.ugc.aweme.profile.ui.header;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commerce.service.logs.ac;
import com.ss.android.ugc.aweme.commerce.service.logs.aw;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity;
import com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.im.f;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.d.h;
import com.ss.android.ugc.aweme.profile.d.p;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.presenter.y;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity;
import com.ss.android.ugc.aweme.profile.ui.ProfileTabView;
import com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.UserUtils$1;
import com.ss.android.ugc.aweme.utils.UserUtils$2;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.permission.e;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class aa extends a implements m, o, ap, at {
    public static ChangeQuickRedirect ai;
    static final int aj = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 106.0f));
    static final int ak = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 98.0f));
    static final int al = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 58.0f));
    static final int am = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 59.5f));
    static final int an = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 22.0f));
    static final int ao = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 18.0f));
    static final int ap = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 4.0f));
    static final int aq = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 3.0f));
    static final int ar = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 2.0f));
    static final int as = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 0.2f));
    View aA;
    @Nullable
    View aB;
    TextView aC;
    RecommendCommonUserView aD;
    View aE;
    View aF;
    Button aG;
    TextView aH;
    ConnectedRelationView aI;
    ImageView aJ;
    public h aK;
    public i aL;
    protected RemoteImageView aM;
    protected FrameLayout aN;
    public y aO;
    public WeakHandler aP;
    public String aQ;
    public String aR;
    public String aS;
    public String aT;
    public String aU;
    public boolean aV = false;
    public int aW = -1;
    public com.ss.android.ugc.aweme.feed.ui.a aX;
    List<String> aY;
    b<RecommendUserCardViewHolder> aZ = new b<RecommendUserCardViewHolder>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62812a;

        public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder) {
            RecommendUserCardViewHolder recommendUserCardViewHolder = (RecommendUserCardViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{recommendUserCardViewHolder}, this, f62812a, false, 69604, new Class[]{RecommendUserCardViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendUserCardViewHolder}, this, f62812a, false, 69604, new Class[]{RecommendUserCardViewHolder.class}, Void.TYPE);
                return;
            }
            if (!(recommendUserCardViewHolder == null || aa.this.aO == null)) {
                User user = recommendUserCardViewHolder.f63087d;
                if (user != null) {
                    if (aa.this.aY == null) {
                        aa.this.aY = new ArrayList();
                    }
                    if (!aa.this.aY.contains(user.getUid())) {
                        k.a().a(1, user.getUid());
                        if (com.ss.android.g.a.a()) {
                            p.a(user, "impression", aa.this.j(user), aa.this.U.getmRequestId());
                        } else {
                            r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("personal_homepage").setJsonObject(aa.this.a(user.getUid(), "impression", aa.this.j(user))));
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("rec_uid", user.getUid());
                            jSONObject.put("enter_from", "others_homepage");
                            jSONObject.put("event_type", "impression");
                            jSONObject.put("impr_order", aa.this.j(user));
                            jSONObject.put("req_id", user.getRequestId());
                            jSONObject.put("page_status", "empty");
                            jSONObject.put("rec_reason", user.getRecommendReason());
                            jSONObject.put("page_status", "nonempty");
                        } catch (JSONException unused) {
                        }
                        r.a("follow_card", jSONObject);
                        aa.this.aY.add(user.getUid());
                    }
                }
            }
        }
    };
    RemoteImageView at;
    DmtTextView au;
    View av;
    View aw;
    Button ax;
    AnimationImageView ay;
    FrameLayout az;
    protected float ba = 0.0f;
    protected float bb = 0.0f;
    private TextView bc;
    private ImageView bd;
    private FrameLayout be;
    private com.bytedance.ies.dmt.ui.a.b bf;
    private ImageView bg;
    private FragmentManager bh;
    private boolean bi = true;
    private boolean bj;
    private ImageView bk;
    private List<String> bl = new ArrayList();
    private aq bm;
    private ArrayList<a> bn;
    private boolean bo = false;
    private Consumer<com.ss.android.ugc.aweme.live.feedpage.b> bp;
    private boolean bq;
    private long br = 0;

    class a extends com.ss.android.ugc.aweme.im.service.a.a {

        /* renamed from: a  reason: collision with root package name */
        boolean f62830a;

        public final void a(DialogInterface dialogInterface) {
            this.f62830a = true;
        }

        a() {
        }
    }

    public void onLoadMoreRecommendSuccess(RecommendList recommendList) {
    }

    public void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, ai, false, 69498, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, ai, false, 69498, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        if (c.a()) {
            this.I.setVisibility(8);
        }
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69500, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69500, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.aj.b.b().b(getContext(), "follow_in_profile", true) && com.ss.android.ugc.aweme.q.c.a(getContext(), "applog_stats", 0).getString("app_track", "").contains("need_follow")) {
            m(this.G);
            com.ss.android.ugc.aweme.aj.b.b().a(getContext(), "follow_in_profile", false);
        }
        this.at = (RemoteImageView) view2.findViewById(C0906R.id.agx);
        this.au = (DmtTextView) view2.findViewById(C0906R.id.agw);
        this.av = view2.findViewById(C0906R.id.cnz);
        this.aw = view2.findViewById(C0906R.id.cnx);
        this.ax = (Button) view2.findViewById(C0906R.id.c6v);
        this.ay = (AnimationImageView) view2.findViewById(C0906R.id.dx);
        this.az = (FrameLayout) view2.findViewById(C0906R.id.afl);
        this.aA = view2.findViewById(C0906R.id.bpj);
        this.aB = view2.findViewById(C0906R.id.bqe);
        this.aC = (TextView) view2.findViewById(C0906R.id.c7f);
        this.aD = (RecommendCommonUserView) view2.findViewById(C0906R.id.cb4);
        this.aE = view2.findViewById(C0906R.id.a5r);
        this.aF = view2.findViewById(C0906R.id.a5s);
        this.aG = (Button) view2.findViewById(C0906R.id.cdt);
        this.aH = (TextView) view2.findViewById(C0906R.id.dh6);
        this.be = (FrameLayout) view2.findViewById(C0906R.id.c72);
        this.aI = (ConnectedRelationView) view2.findViewById(C0906R.id.y5);
        if (AbTestManager.a().K()) {
            this.be.setAlpha(1.0f);
        } else {
            this.be.setAlpha(0.96f);
        }
        this.aJ = (ImageView) view2.findViewById(C0906R.id.c7e);
        this.bg = (ImageView) view2.findViewById(C0906R.id.c6w);
        this.bk = (ImageView) view2.findViewById(C0906R.id.a_p);
        if (com.ss.android.g.a.a() && this.bk != null) {
            this.bk.setVisibility(8);
            this.bk = null;
        }
        if (this.bk != null) {
            this.bk.setOnClickListener(new ab(this));
        }
        this.aM = (RemoteImageView) view2.findViewById(C0906R.id.cny);
        RemoteImageView remoteImageView = this.aM;
        String string = getContext().getResources().getString(C0906R.string.apt);
        if (PatchProxy.isSupport(new Object[]{remoteImageView, string}, null, ex.f75854a, true, 88679, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView, string}, null, ex.f75854a, true, 88679, new Class[]{View.class, String.class}, Void.TYPE);
        } else if (!(remoteImageView == null || string == null)) {
            ViewCompat.setAccessibilityDelegate(remoteImageView, new UserUtils$2(string));
        }
        this.r = view2.findViewById(C0906R.id.a2k);
        if (!c() || !com.ss.android.ugc.aweme.im.b.c()) {
            this.aM.setVisibility(0);
            this.aM.setImageResource(2130839295);
        } else {
            com.ss.android.ugc.aweme.im.b.a().wrapperSendMessageSyncXIcon(this.aM, 2);
            this.aM.setVisibility(0);
        }
        this.aN = (FrameLayout) view2.findViewById(C0906R.id.c6x);
        if (ab_() && !com.ss.android.g.a.a()) {
            this.aN.setVisibility(8);
        }
        if (com.ss.android.ugc.aweme.profile.k.a()) {
            String str = this.U.getmUserId();
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, d.a().getCurUserId())) {
                this.aN.setVisibility(8);
            } else {
                setOpenRecommendCardButtonState(0);
            }
        } else {
            this.bg.setImageResource(2130839778);
            if (AbTestManager.a().bK()) {
                if (com.ss.android.g.a.b()) {
                    this.bg.setImageResource(2130839380);
                } else {
                    this.bg.setImageResource(2130839244);
                }
            }
            this.bg.setBackgroundResource(2130837983);
        }
        if (this.w != null) {
            this.w.setOnClickListener(new ac(this));
            this.w.setOnTouchListener(new ah(this));
        }
        this.aD.setOnClickListener(new ai(this));
    }

    public final void a(TextView textView, ImageView imageView) {
        ImageView imageView2 = imageView;
        TextView textView2 = null;
        if (PatchProxy.isSupport(new Object[]{null, imageView2}, this, ai, false, 69501, new Class[]{TextView.class, ImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null, imageView2}, this, ai, false, 69501, new Class[]{TextView.class, ImageView.class}, Void.TYPE);
            return;
        }
        this.bc = null;
        this.bd = imageView2;
        Context context = getContext();
        Button button = (Button) this.G;
        if (!com.ss.android.ugc.aweme.profile.k.a()) {
            textView2 = this.bc;
        }
        Button button2 = button;
        h hVar = new h(context, button2, textView2, this.av, this.at, this.au, this.aG, this.bk, c(), ab_(), this.aN);
        this.aK = hVar;
    }

    public final void a(String str, FragmentManager fragmentManager) {
        if (PatchProxy.isSupport(new Object[]{str, fragmentManager}, this, ai, false, 69503, new Class[]{String.class, FragmentManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, fragmentManager}, this, ai, false, 69503, new Class[]{String.class, FragmentManager.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            this.bh = fragmentManager;
            if (this.aL == null) {
                this.aL = new i();
                this.aL.a(this);
            }
        }
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        Context context;
        int i;
        Context context2;
        int i2;
        Object obj;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, ai, false, 69520, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, ai, false, 69520, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.T.isViewValid()) {
            int i3 = 8;
            if (com.ss.android.ugc.aweme.commercialize.utils.c.b(this.f3817c)) {
                this.aA.setVisibility(0);
                this.aC.setText(this.f3817c.getQuickShopInfo().getQuickShopName());
                this.aJ.setBackgroundResource(2130839814);
                if (this.aB != null) {
                    this.aB.setVisibility(8);
                }
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.bpj)}, this, ai, false, 69584, new Class[]{Integer.TYPE}, Object.class)) {
                    obj = PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.bpj)}, this, ai, false, 69584, new Class[]{Integer.TYPE}, Object.class);
                } else {
                    ViewParent parent = getParent();
                    obj = parent instanceof View ? ((View) parent).getTag(C0906R.id.bpj) : null;
                }
                if (obj == null && K()) {
                    a((int) C0906R.id.bpj, (Object) 1);
                    g.a("othershow", getContext(), this.U.getmAweme(), this.f3817c);
                }
                return;
            }
            boolean z4 = (!((Boolean) x.a().N().c()).booleanValue() || !ex.g(this.f3817c)) ? z : z3;
            this.aA.setVisibility(z4 ? 0 : 8);
            if (this.aB != null) {
                View view = this.aB;
                if (z2) {
                    i3 = 0;
                }
                view.setVisibility(i3);
            }
            if (TextUtils.isEmpty(this.f3817c.getShopMicroApp())) {
                TextView textView = this.aC;
                if (ex.g(this.f3817c)) {
                    context2 = getContext();
                    i2 = C0906R.string.akj;
                } else {
                    context2 = getContext();
                    i2 = C0906R.string.bs1;
                }
                textView.setText(context2.getString(i2));
                if (z4 && this.aA.getTag(C0906R.id.bpj) == null && K()) {
                    new aw().b(this.U.getmUserId()).a(ex.g(this.f3817c) ? "personal_homepage" : "others_homepage").c("normal").b();
                    this.aA.setTag(C0906R.id.bpj, 1);
                }
            } else {
                TextView textView2 = this.aC;
                if (ex.g(this.f3817c)) {
                    context = getContext();
                    i = C0906R.string.bfn;
                } else {
                    context = getContext();
                    i = C0906R.string.ama;
                }
                textView2.setText(context.getString(i));
                if (z4 && this.aA.getTag(C0906R.id.bpj) == null && K()) {
                    new aw().b(this.U.getmUserId()).a(ex.g(this.f3817c) ? "personal_homepage" : "others_homepage").c("mini_program").b();
                    this.aA.setTag(C0906R.id.bpj, 1);
                }
            }
        }
    }

    public final void a(int i, int i2) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, ai, false, 69529, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, ai, false, 69529, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        byte b2 = this.aW != i3 ? (byte) 1 : 0;
        this.aW = i3;
        if (this.T.isViewValid() && !c(i, i2)) {
            h hVar = this.aK;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, hVar, h.f61406a, false, 69904, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, hVar, h.f61406a, false, 69904, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                hVar.f61409d = i3;
                if (i3 == 0) {
                    hVar.b();
                    hVar.d();
                } else if (i3 == 1) {
                    hVar.a();
                    hVar.e();
                    hVar.d();
                } else if (i3 == 2) {
                    hVar.a();
                    hVar.e();
                    hVar.d();
                } else if (i3 == 4) {
                    hVar.c();
                    hVar.d();
                }
                hVar.c(i3);
            }
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2)}, this, ai, false, 69530, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2)}, this, ai, false, 69530, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            switch (AbTestManager.a().k().intValue()) {
                case 0:
                    if (c() && this.av.getVisibility() == 0 && b2 != 0) {
                        com.ss.android.ugc.aweme.im.b.a().wrapperSendMessageSyncXIcon(this.aM, 2);
                        if (this.bi) {
                            f.c("click_message");
                            return;
                        }
                    }
                    break;
                case 1:
                    this.aM.setVisibility(8);
                    if (c() && this.at.getVisibility() == 0 && b2 != 0) {
                        this.at.setPadding((int) UIUtils.dip2Px(getContext(), 9.0f), (int) UIUtils.dip2Px(getContext(), 8.5f), (int) UIUtils.dip2Px(getContext(), 9.0f), (int) UIUtils.dip2Px(getContext(), 8.5f));
                        com.ss.android.ugc.aweme.im.b.a().wrapperSendMessageSyncXIcon(this.at, 2);
                        if (this.bi) {
                            f.c("click_message");
                            return;
                        }
                    }
                    break;
                case 2:
                    this.aM.setVisibility(8);
                    if (c() && this.at.getVisibility() == 0 && b2 != 0) {
                        this.at.setPadding((int) UIUtils.dip2Px(getContext(), 9.0f), (int) UIUtils.dip2Px(getContext(), 8.5f), (int) UIUtils.dip2Px(getContext(), 9.0f), (int) UIUtils.dip2Px(getContext(), 8.5f));
                        com.ss.android.ugc.aweme.im.b.a().wrapperSendMessageSyncXIcon(this.at, 2);
                        if (this.bi) {
                            f.c("click_message");
                            break;
                        }
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, int i2, int i3) {
        if (this.aL != null && this.aL.l()) {
            b(i, i2);
            this.aL.a(new i.a().a(this.U.getmUserId()).b("").a(i3).b(19).c(bp.a(this.U)).a());
        }
    }

    private boolean a(boolean z, View view) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view}, this, ai, false, 69542, new Class[]{Boolean.TYPE, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), view}, this, ai, false, 69542, new Class[]{Boolean.TYPE, View.class}, Boolean.TYPE)).booleanValue();
        }
        if (!z) {
            Activity c2 = v.c(view);
            if (c2 instanceof FragmentActivity) {
                StatusStoreViewModel statusStoreViewModel = (StatusStoreViewModel) ViewModelProviders.of((FragmentActivity) c2).get(StatusStoreViewModel.class);
                String str = (String) statusStoreViewModel.a("extra_from_event_type", "");
                String str2 = (String) statusStoreViewModel.a("extra_from_event_enter_from", "");
                String str3 = (String) statusStoreViewModel.a("extra_from_pre_page", "");
                String str4 = (String) statusStoreViewModel.a("extra_from_pre_relation_from", "");
                if (TextUtils.equals("face_to_face", str3)) {
                    r.a("follow", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("event_type", str).a("enter_from", str2).a("previous_page", str3).a("relation_from", str4).a("to_user_id", this.f3817c != null ? this.f3817c.getUid() : "").f34114b);
                    return true;
                }
            }
        }
        return false;
    }

    public final JSONObject a(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, ai, false, 69563, new Class[]{String.class, String.class, Integer.TYPE}, JSONObject.class)) {
            return com.ss.android.ugc.aweme.app.d.c.a().a("rec_uid", str).a("profile_uid", this.U.getmUserId()).a("enter_from", this.U.getmEventType()).a("event_type", str4).a("impr_order", Integer.valueOf(i)).a("req_id", getRid()).a("is_direct", Integer.valueOf(this.bq ? 1 : 0)).b();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, ai, false, 69563, new Class[]{String.class, String.class, Integer.TYPE}, JSONObject.class);
    }

    public final void a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 69566, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ai, false, 69566, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!ex.e(this.f3817c) && this.bj != z2) {
            this.J.setAlpha(z2 ? 0.0f : 1.0f);
            if (z2) {
                if (this.aY == null) {
                    this.aY = new ArrayList();
                } else {
                    this.aY.clear();
                }
                setOpenRecommendCardButtonState(1);
                if (this.aO == null) {
                    this.aO = new y(new RecommendCommonUserModel(), this);
                } else {
                    this.aO.c();
                    RecommendList d2 = this.aO.d();
                    if (d2 != null && !CollectionUtils.isEmpty(d2.getUserList())) {
                        this.aD.setPageType(0);
                        this.aD.a(d2.getUserList(), d2.rid);
                        this.aE.setVisibility(0);
                        com.ss.android.ugc.aweme.profile.d.v.a(true, this.aD, this.F, this.N, this.az, this.r, this.aE, this.Q);
                        this.ay.setVisibility(8);
                        this.ba = 0.0f;
                        this.bb = 0.0f;
                        this.bj = true;
                        setOpenRecommendCardButtonState(2);
                        if (this.bm != null) {
                            this.bm.a();
                        }
                        return;
                    }
                }
                this.aO.a(30, this.U.getmUserId(), 1, e.a(), (String) null, e.b(), this.U.getSecUserId());
            } else {
                if (this.aO != null) {
                    this.aO.a(this.aD.getData());
                }
                if (this.aI == null || this.aI.getVisibility() != 0) {
                    this.aE.setVisibility(0);
                } else {
                    this.aE.setVisibility(8);
                }
                com.ss.android.ugc.aweme.profile.d.v.a(false, this.aD, this.F, this.N, this.az, this.r, this.aE, this.Q);
                if (this.bo && com.ss.android.ugc.aweme.story.a.a()) {
                    this.ay.setVisibility(0);
                }
                this.ba = 0.0f;
                this.bb = 0.0f;
                this.bj = false;
                setOpenRecommendCardButtonState(0);
            }
            if (this.bm != null) {
                this.bm.a();
            }
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, ai, false, 69572, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, ai, false, 69572, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        super.a(str, str2);
    }

    public final void a(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, ai, false, 69573, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, ai, false, 69573, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        a(followStatus2.followStatus, this.f3817c.getFollowerStatus());
        RecommendCommonUserView recommendCommonUserView = this.aD;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, recommendCommonUserView, RecommendCommonUserView.f63061a, false, 69804, new Class[]{FollowStatus.class}, Void.TYPE)) {
            RecommendCommonUserView recommendCommonUserView2 = recommendCommonUserView;
            PatchProxy.accessDispatch(new Object[]{followStatus2}, recommendCommonUserView2, RecommendCommonUserView.f63061a, false, 69804, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        RecommendUserAdapter adapter = recommendCommonUserView.getAdapter();
        if (PatchProxy.isSupport(new Object[]{followStatus2}, adapter, RecommendUserAdapter.f63074a, false, 69817, new Class[]{FollowStatus.class}, Void.TYPE)) {
            Object[] objArr = {followStatus2};
            RecommendUserAdapter recommendUserAdapter = adapter;
            PatchProxy.accessDispatch(objArr, recommendUserAdapter, RecommendUserAdapter.f63074a, false, 69817, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (adapter.mItems != null && !adapter.mItems.isEmpty() && followStatus2 != null && !TextUtils.isEmpty(followStatus2.userId)) {
            int size = adapter.mItems.size();
            while (i < size) {
                User user = (User) adapter.mItems.get(i);
                if (user == null || !followStatus2.userId.equals(user.getUid())) {
                    i++;
                } else {
                    user.setFollowStatus(followStatus2.followStatus);
                    adapter.notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    public final void a(UrlModel urlModel) {
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, this, ai, false, 69574, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2}, this, ai, false, 69574, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        super.a(urlModel);
        if (urlModel2 != null && this.T.isViewValid()) {
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 100.0f);
            com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.y, urlModel2, dip2Px, dip2Px);
            com.ss.android.ugc.aweme.base.c.a(this.E, urlModel2, dip2Px, dip2Px);
        }
        Context context = getContext();
        AvatarWithBorderView avatarWithBorderView = this.y;
        User user = this.f3817c;
        if (PatchProxy.isSupport(new Object[]{context, avatarWithBorderView, user}, null, ex.f75854a, true, 88677, new Class[]{Context.class, ImageView.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, avatarWithBorderView, user}, null, ex.f75854a, true, 88677, new Class[]{Context.class, ImageView.class, User.class}, Void.TYPE);
        } else if (avatarWithBorderView != null && user != null) {
            ViewCompat.setAccessibilityDelegate(avatarWithBorderView, new UserUtils$1(user, context));
        }
    }

    private boolean K() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69583, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, ai, false, 69583, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ViewParent parent = getParent();
        if (!(parent instanceof View) || !ao.b((View) parent)) {
            return false;
        }
        return true;
    }

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69579, new Class[0], Void.TYPE);
            return;
        }
        if (this.bf != null && this.bf.isShowing()) {
            this.bf.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void F() {
        if (this.f3817c != null && !TextUtils.isEmpty(this.f3817c.getRemarkName())) {
            a(this.f3817c.getRemarkName(), this.f3817c.getStarBillboardRank(), this.f3817c.getBrandInfo(), this.f3817c);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69543, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69543, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        i(this.f3817c);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69508, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69508, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        if (this.aL != null) {
            this.aL.k();
        }
        if (this.aO != null) {
            this.aO.a();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69509, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        if (this.aB != null) {
            this.aB.setVisibility(8);
        }
        k.a().d();
    }

    public String getUserId() {
        if (!PatchProxy.isSupport(new Object[0], this, ai, false, 69578, new Class[0], String.class)) {
            return this.U.getmUserId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, ai, false, 69578, new Class[0], String.class);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69581, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.bf != null) {
            this.bf.b();
        }
    }

    public void y() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69505, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69505, new Class[0], Void.TYPE);
            return;
        }
        a(false);
        this.aO = null;
        setOpenRecommendCardButtonState(0);
    }

    private void G() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69525, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            this.y.setBorderColor(C0906R.color.a1z);
            this.y.setBorderWidth(2);
        } else {
            if (this.z != null) {
                this.z.setStrokeWidth(4);
                this.z.setVisibility(0);
            }
            this.y.setBorderWidthPx(0);
        }
        I();
    }

    private void H() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69526, new Class[0], Void.TYPE);
            return;
        }
        G();
        this.z.getLayoutParams().width = aj;
        this.z.getLayoutParams().height = aj;
        LiveCircleView liveCircleView = this.z;
        int i = ap;
        int i2 = ap;
        liveCircleView.setPadding(i, i, i2, i2);
        if (this.aX == null) {
            this.aX = new com.ss.android.ugc.aweme.feed.ui.a(true, this.y, this.y, this.z);
        }
        if (this.bp == null) {
            this.bp = new Consumer<com.ss.android.ugc.aweme.live.feedpage.b>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62804a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    com.ss.android.ugc.aweme.live.feedpage.b bVar = (com.ss.android.ugc.aweme.live.feedpage.b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f62804a, false, 69618, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f62804a, false, 69618, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE);
                        return;
                    }
                    if (TextUtils.equals(aa.this.f3817c.getUid(), String.valueOf(bVar.f53380a))) {
                        aa.this.f3817c.roomId = bVar.f53381b;
                        if (!aa.this.f3817c.isLive()) {
                            aa.this.aX.d();
                        }
                    }
                }
            };
        }
        this.aX.a(this.f3817c, getClass(), this.bp);
    }

    private void I() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69527, new Class[0], Void.TYPE);
            return;
        }
        if (this.aX != null) {
            this.aX.b(8);
            this.aX.f();
            this.z.getLayoutParams().width = ak;
            this.z.getLayoutParams().height = ak;
            LiveCircleView liveCircleView = this.z;
            int i = as;
            int i2 = as;
            liveCircleView.setPadding(i, i, i2, i2);
        }
    }

    private String getRequestId() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69545, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, ai, false, 69545, new Class[0], String.class);
        }
        String str = "";
        if (!TextUtils.isEmpty(this.U.getmEnterFromRequestId())) {
            return this.U.getmEnterFromRequestId();
        }
        if (this.f3817c != null) {
            str = this.f3817c.getRequestId();
        }
        Aweme aweme = this.U.getmAweme();
        if (TextUtils.isEmpty(str) && TextUtils.equals("homepage_hot", this.U.getmEventType()) && aweme != null) {
            str = aweme.getRequestId();
        }
        return str;
    }

    public final void D() {
        ArrayList<Aweme> arrayList;
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69561, new Class[0], Void.TYPE);
            return;
        }
        if (this.T instanceof UserProfileFragment) {
            AwemeListFragment awemeListFragment = ((UserProfileFragment) this.T).T;
            if (awemeListFragment != null) {
                arrayList = awemeListFragment.D();
                com.ss.android.ugc.aweme.profile.d.x.a(getActivity(), this.f3817c, (String) null, (List<Aweme>) arrayList);
            }
        }
        arrayList = null;
        com.ss.android.ugc.aweme.profile.d.x.a(getActivity(), this.f3817c, (String) null, (List<Aweme>) arrayList);
    }

    public void d() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69507, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (com.ss.android.ugc.aweme.profile.k.a() && !ex.e(this.f3817c)) {
            if (!d.a().isLogin() || !AbTestManager.a().i() || TextUtils.equals(d.a().getCurUserId(), this.U.getmUserId())) {
                i = 8;
            }
            if (this.aN.getVisibility() != i) {
                this.aN.setVisibility(i);
            }
        }
    }

    public String getRid() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69564, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, ai, false, 69564, new Class[0], String.class);
        } else if (this.aO == null || this.aO.d() == null) {
            return "";
        } else {
            return this.aO.d().rid;
        }
    }

    private void J() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69544, new Class[0], Void.TYPE);
            return;
        }
        s i = new s().b("others_homepage").g(this.U.getmPreviousPagePosition()).f(this.U.getmPreviousPage()).c("follow_button").h(this.U.getmUserId()).i(this.U.getmAwemeId());
        if (!TextUtils.isEmpty(this.U.getmEnterFromRequestId())) {
            str = this.U.getmEnterFromRequestId();
        } else if (this.f3817c != null) {
            str = this.f3817c.getRequestId();
        } else {
            str = "";
        }
        i.k(str).e();
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69558, new Class[0], Void.TYPE);
        } else if (!d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a(getActivity(), this.U.getmEventType(), "report");
        } else {
            if (this.f3817c != null) {
                r.a("report_user", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("to_user_id", this.f3817c.getUid()).f34114b);
                ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), AllStoryActivity.f73306b, this.f3817c.getUid(), this.f3817c.getUid(), null);
            }
        }
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69559, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3817c != null) {
            r.a("click_block", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("to_user_id", this.f3817c.getUid()).f34114b);
            boolean isBlock = this.f3817c.isBlock();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(isBlock ? (byte) 1 : 0)}, this, ai, false, 69562, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(isBlock)}, this, ai, false, 69562, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (isBlock) {
                BlockApi.a((Handler) this.aP, this.f3817c.getUid(), 0);
                f.a("others_homepage", this.f3817c.getUid());
            } else {
                AnonymousClass3 r0 = new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62814a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62814a, false, 69605, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62814a, false, 69605, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == -2 || i != -1) {
                            f.a("cancel", aa.this.f3817c.getUid(), "others_homepage");
                            dialogInterface.dismiss();
                        } else {
                            dialogInterface.dismiss();
                            BlockApi.a((Handler) aa.this.aP, aa.this.f3817c.getUid(), 1);
                            f.a("success", aa.this.f3817c.getUid(), "others_homepage");
                            if (TextUtils.equals(aa.this.U.getmProfileFrom(), "chat")) {
                                f.b(aa.this.f3817c.getUid());
                            }
                            if (aa.this.U.getmFollowStatus() != 0) {
                                aa.this.a(0, aa.this.f3817c.getFollowerStatus());
                            }
                        }
                    }
                };
                new a.C0185a(getContext()).b((int) C0906R.string.jp).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) r0).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) r0).a().a();
                f.a("others_homepage", this.f3817c.getUid(), "");
            }
        }
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69560, new Class[0], Void.TYPE);
            return;
        }
        User user = this.f3817c;
        if (user == null) {
            user = new User();
            user.setUid(this.U.getmUserId());
        }
        Aweme aweme = this.U.getmAweme();
        if (a(aweme)) {
            com.ss.android.ugc.aweme.im.b.a().startChatWithAdLog(getContext(), com.ss.android.ugc.aweme.im.b.a(user), new com.ss.android.ugc.aweme.im.service.model.a(aweme.getAwemeRawAd().getLogExtra(), String.valueOf(aweme.getAwemeRawAd().getCreativeId())));
        } else {
            com.ss.android.ugc.aweme.im.b.a().startChat(getContext(), com.ss.android.ugc.aweme.im.b.a(user), 5);
        }
        f.a(this.U.getmUserId());
        f.a(this.U.getmUserId(), this.U.getmAwemeId(), this.U.getmEventType(), this.U.getmRequestId(), "click_stranger_chat_button");
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69504, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.equals(this.U.getmType(), "need_follow")) {
            this.G.performClick();
        }
        this.G.setEnabled(true);
        this.at.setEnabled(true);
        this.av.setEnabled(true);
        this.aG.setEnabled(true);
        com.ss.android.ugc.aweme.notification.d.c.a(this.at);
        com.ss.android.ugc.aweme.notification.d.c.a(this.av);
        com.ss.android.ugc.aweme.notification.d.c.a(this.aG);
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69570, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("others_homepage"));
        r.a("click_follow_count", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "others_homepage").f34114b);
        if (com.ss.android.g.a.c() || (!com.ss.android.g.a.a() && AbTestManager.a().bQ() == 1)) {
            FollowRelationTabActivity.a(getActivity(), this.f3817c, "following_relation");
            r.a("enter_relation_tab", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "others_homepage").a("enter_method", "click_follow_count").f34114b);
            return;
        }
        FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(getActivity(), this.T, this.U.getmUserId(), false, SimpleUserFragment.b.following, this.f3818d);
        aVar.a(this.f3817c).a();
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69571, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName("others_homepage"));
        r.a("click_fans_count", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "others_homepage").f34114b);
        if (com.ss.android.g.a.c() || (!com.ss.android.g.a.a() && AbTestManager.a().bQ() == 1)) {
            FollowRelationTabActivity.a(getActivity(), this.f3817c, "follower_relation");
            r.a("enter_relation_tab", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "others_homepage").a("enter_method", "click_fans_count").f34114b);
            return;
        }
        FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(getActivity(), this.T, this.U.getmUserId(), false, SimpleUserFragment.b.follower, this.f3819e);
        aVar.a(this.f3817c).a();
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69582, new Class[0], Void.TYPE);
            return;
        }
        super.t();
        if (this.T.isViewValid()) {
            if (getPublishPosi() > 0) {
                ProfileTabView profileTabView = (ProfileTabView) this.H.a(getPublishPosi());
                String string = getContext().getString(C0906R.string.du_);
                if (m()) {
                    string = getContext().getString(C0906R.string.bsf);
                }
                a(profileTabView, "", string);
            }
            if (getFavoritePosi() > 0) {
                ProfileTabView profileTabView2 = (ProfileTabView) this.H.a(getFavoritePosi());
                String string2 = getContext().getString(C0906R.string.b5j);
                if (m()) {
                    string2 = getContext().getString(C0906R.string.bs3);
                }
                a(profileTabView2, "", string2);
            }
            if (getDynamicPosi() > 0) {
                a((ProfileTabView) this.H.a(getDynamicPosi()), "", getContext().getString(C0906R.string.aej));
            }
        }
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69556, new Class[0], Void.TYPE);
        } else if (this.f3817c != null) {
            r.a("click_more_action", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").f34114b);
            if (AbTestManager.a().aT() == 1) {
                ArrayList<Aweme> arrayList = null;
                if (this.T instanceof UserProfileFragment) {
                    AwemeListFragment awemeListFragment = ((UserProfileFragment) this.T).T;
                    if (awemeListFragment != null) {
                        arrayList = awemeListFragment.D();
                    }
                }
                this.bl.clear();
                getItemList();
                String[] strArr = new String[this.bl.size()];
                this.bl.toArray(strArr);
                com.ss.android.ugc.aweme.profile.d.x.a((Handler) this.aP, getActivity(), this.f3817c, (List<Aweme>) arrayList, strArr);
                return;
            }
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(getActivity());
            final String[] itemList = getItemList();
            aVar.a((CharSequence[]) itemList, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62809a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62809a, false, 69620, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62809a, false, 69620, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (TextUtils.equals(itemList[i], aa.this.aR)) {
                        aa.this.A();
                    } else if (TextUtils.equals(itemList[i], aa.this.aS)) {
                        aa.this.B();
                    } else if (TextUtils.equals(itemList[i], aa.this.aT)) {
                        aa.this.C();
                    } else if (TextUtils.equals(itemList[i], aa.this.aU) || TextUtils.equals(itemList[i], aa.this.aQ)) {
                        aa.this.D();
                    }
                    dialogInterface.dismiss();
                }
            });
            try {
                aVar.b();
            } catch (Resources.NotFoundException unused) {
            }
        }
    }

    private String[] getItemList() {
        Resources resources;
        int i;
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69557, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, ai, false, 69557, new Class[0], String[].class);
        }
        ArrayList arrayList = new ArrayList();
        if (!c.a()) {
            if (TextUtils.isEmpty(this.aQ)) {
                this.aQ = getResources().getString(C0906R.string.c6x);
            }
            arrayList.add(this.aQ);
        }
        if (TextUtils.isEmpty(this.aR)) {
            this.aR = getResources().getString(C0906R.string.bzd);
        }
        if (TextUtils.isEmpty(this.aT)) {
            this.aT = getResources().getString(C0906R.string.c44);
        }
        arrayList.add(this.aR);
        this.bl.add("report_user");
        if (this.f3817c != null && d.a().isLogin()) {
            if (this.f3817c.isBlock()) {
                resources = getResources();
                i = C0906R.string.dn6;
            } else {
                resources = getResources();
                i = C0906R.string.nj;
            }
            this.aS = resources.getString(i);
            arrayList.add(this.aS);
            if (this.f3817c.isBlock()) {
                this.bl.add("unblock");
            } else {
                this.bl.add("block");
            }
            if (com.ss.android.g.a.a()) {
                if (!this.f3817c.isBlock && com.ss.android.ugc.aweme.im.b.b()) {
                    arrayList.add(this.aT);
                    this.bl.add("message");
                }
            } else if (com.ss.android.ugc.aweme.im.b.b()) {
                arrayList.add(this.aT);
                this.bl.add("message");
            }
        }
        if (com.ss.android.g.a.a()) {
            if (TextUtils.isEmpty(this.aU)) {
                this.aU = getResources().getString(C0906R.string.c7g);
            }
            if (this.f3817c != null) {
                if (this.f3817c.isMe() || !this.f3817c.isSecret()) {
                    arrayList.add(0, this.aU);
                }
                if (((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().c()).booleanValue() && this.f3817c.getFollowerStatus() == 1) {
                    this.bl.add("remove_follower");
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public final void p() {
        HashMap hashMap;
        String str;
        Bundle bundle;
        String livePreviousPage;
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69569, new Class[0], Void.TYPE);
            return;
        }
        r.a("click_profile_photo", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("to_user_id", this.U.getmUserId()).f34114b);
        if (this.f3817c != null) {
            if (TimeLockRuler.isTeenModeON()) {
                r.a("click_profile_icon", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("enter_method", "click_head").f34114b);
                HeaderDetailActivity.a(getActivity(), ad.a().a("uri", ex.a(ex.c(this.f3817c))).a("extra_zoom_info", (Parcelable) fe.a(this.y)).a("share_info", (Serializable) this.f3817c).f75487b);
                return;
            }
            int i = 2;
            if (this.f3817c.isLive() && !m()) {
                this.U.setFromLive(true);
                Aweme aweme = this.U.getmAweme();
                if (aweme == null && this.ah != null && TextUtils.equals(this.ah.getAuthorUid(), ex.h(this.f3817c))) {
                    aweme = this.ah;
                }
                if (com.ss.android.ugc.aweme.commercialize.utils.c.u(aweme)) {
                    g.a(getContext(), "homepage_ad", aweme);
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    hashMap = new HashMap();
                    hashMap.put("value", String.valueOf(awemeRawAd.getCreativeId()));
                    hashMap.put("log_extra", awemeRawAd.getLogExtra());
                } else {
                    hashMap = null;
                }
                Context context = getContext();
                User user = this.f3817c;
                if (this.U != null) {
                    if (TextUtils.isEmpty(this.U.getLivePreviousPage())) {
                        livePreviousPage = this.U.getmFromSearch();
                    } else {
                        livePreviousPage = this.U.getLivePreviousPage();
                    }
                    str = livePreviousPage;
                } else {
                    str = null;
                }
                if (PatchProxy.isSupport(new Object[]{context, user, str, (byte) 1, hashMap}, null, com.ss.android.ugc.aweme.story.live.f.f73134a, true, 84724, new Class[]{Context.class, User.class, String.class, Boolean.TYPE, HashMap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, user, str, (byte) 1, hashMap}, null, com.ss.android.ugc.aweme.story.live.f.f73134a, true, 84724, new Class[]{Context.class, User.class, String.class, Boolean.TYPE, HashMap.class}, Void.TYPE);
                } else if (!(context == null || user == null)) {
                    if (FeedPagerAdapter.b(user.roomId)) {
                        context.startActivity(new Intent(context, LiveDetailActivity.class));
                    } else {
                        HashMap hashMap2 = hashMap;
                        String str2 = str;
                        com.ss.android.ugc.aweme.story.live.b.a(context, true, 1, user.getRequestId(), user.getUid(), user.roomId);
                        com.ss.android.ugc.aweme.story.live.g gVar = new com.ss.android.ugc.aweme.story.live.g(context);
                        if (PatchProxy.isSupport(new Object[]{user, str2, hashMap2}, gVar, com.ss.android.ugc.aweme.story.live.g.f73135a, false, 84750, new Class[]{User.class, String.class, HashMap.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.story.live.g gVar2 = gVar;
                            PatchProxy.accessDispatch(new Object[]{user, str2, hashMap2}, gVar2, com.ss.android.ugc.aweme.story.live.g.f73135a, false, 84750, new Class[]{User.class, String.class, HashMap.class}, Void.TYPE);
                        } else {
                            if (hashMap2 == null || hashMap2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putSerializable("live_douplus_log_extra", hashMap2);
                                bundle.putBoolean("enter_from_dou_plus", true);
                            }
                            c.a b2 = new c.a(gVar.f73136b, user).a("previous_page", str2).b("others_homepage");
                            if (!TextUtils.equals(str2, "homepage_hot")) {
                                i = 4;
                            }
                            c.a c2 = b2.a(i).c("others_photo");
                            if (bundle != null) {
                                c2.j = bundle;
                            }
                            com.ss.android.ugc.aweme.story.live.c.a().a(c2);
                        }
                    }
                }
            } else if (getHeadStatus() == 3 || getHeadStatus() == 2) {
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                a2.a("enter_from", "others_homepage").a("enter_method", "click_head").a("author_id", this.f3817c.getUid()).a("is_read", StoryUnreadUtils.hasUnreadStory(this.f3817c) ^ true ? 1 : 0).a("to_user_id", this.f3817c.getUid());
                a2.a("log_pb", ai.a().b(this.f3817c.getUid()));
                if (this.f3817c.getFollowStatus() == 2) {
                    a2.a("relation_type", 3);
                }
                if (getContext() instanceof Activity) {
                    Intent intent = ((Activity) getContext()).getIntent();
                    if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                        String stringExtra = intent.getStringExtra("rule_id");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            a2.a("rule_id", stringExtra);
                        }
                    }
                }
                r.a("enter_story_detail", com.ss.android.ugc.aweme.u.aa.a(a2.f34114b));
                com.ss.android.ugc.aweme.story.api.model.f fVar = new com.ss.android.ugc.aweme.story.api.model.f();
                fVar.detailType = 3;
                fVar.uid = this.f3817c.getUid();
                fVar.isSelf = ex.g(this.f3817c);
                fVar.eventType = "others_homepage";
                a(fVar);
            } else {
                r.a("click_profile_icon", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("enter_method", "click_head").f34114b);
                HeaderDetailActivity.a(getActivity(), ad.a().a("uri", ex.a(ex.c(this.f3817c))).a("extra_zoom_info", (Parcelable) fe.a(this.y)).a("share_info", (Serializable) this.f3817c).f75487b);
            }
        }
    }

    public void setFollowFromTitleBar(boolean z) {
        this.aV = z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n(View view) {
        a(view, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(MotionEvent motionEvent) {
        if (!com.ss.android.ugc.aweme.commercialize.utils.c.c(this.f3817c)) {
            return false;
        }
        com.ss.android.ugc.aweme.commercialize.b.h hVar = new com.ss.android.ugc.aweme.commercialize.b.h(motionEvent.getAction(), motionEvent.getDownTime(), motionEvent.getEventTime());
        bg.a(hVar);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o(View view) {
        if (this.bn.size() > 0) {
            boolean z = false;
            a remove = this.bn.remove(0);
            if (!com.ss.android.g.a.b() && !remove.f62830a) {
                z = true;
            }
            b(view, z);
        }
    }

    public final void j(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69552, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69552, new Class[]{View.class}, Void.TYPE);
            return;
        }
        f(view);
    }

    private void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 69524, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ai, false, 69524, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ay.setVisibility(0);
        if (z) {
            this.ay.setAnimation("tag_profile_live.json");
            this.ay.playAnimation();
        }
        setHeadStatus(1);
        I();
    }

    public final void f(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69518, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69518, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.T.isViewValid() && getStoryPosi() >= 0) {
            ProfileTabView profileTabView = (ProfileTabView) this.H.a(getStoryPosi());
            String valueOf = String.valueOf(i);
            Locale locale = Locale.getDefault();
            String string = getContext().getString(C0906R.string.ceb);
            Object[] objArr = new Object[1];
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            objArr[0] = Integer.valueOf(i2);
            a(profileTabView, valueOf, String.format(locale, string, objArr));
        }
    }

    public final void i(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69512, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69512, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (s() && getToolPosi() >= 0) {
            ProfileTabView profileTabView = (ProfileTabView) this.H.a(getToolPosi());
            String valueOf = String.valueOf(i);
            Locale locale = Locale.getDefault();
            String string = getContext().getString(C0906R.string.bsb);
            Object[] objArr = new Object[1];
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            objArr[0] = Integer.valueOf(i2);
            a(profileTabView, valueOf, String.format(locale, string, objArr));
        }
    }

    public final int j(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, ai, false, 69577, new Class[]{User.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{user}, this, ai, false, 69577, new Class[]{User.class}, Integer.TYPE)).intValue();
        } else if (user == null || this.aO == null) {
            return 0;
        } else {
            return this.aO.a(user.getUid());
        }
    }

    public final void l(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69555, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69555, new Class[]{View.class}, Void.TYPE);
        } else if (System.currentTimeMillis() - this.br >= 500) {
            this.br = System.currentTimeMillis();
            if (!com.ss.android.ugc.aweme.profile.k.a()) {
                z();
                return;
            }
            if (!this.bj) {
                this.bq = false;
            }
            boolean z = !this.bj;
            a(z);
            if (z && !com.ss.android.g.a.a()) {
                r.a("spread_follow_card", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
            }
        }
    }

    public void onFollowFail(final Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, ai, false, 69568, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, ai, false, 69568, new Class[]{Exception.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
            com.ss.android.ugc.aweme.captcha.c.b.a(this.bh, (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62816a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f62816a, false, 69606, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f62816a, false, 69606, new Class[0], Void.TYPE);
                        return;
                    }
                    aa.this.aL.a();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f62816a, false, 69607, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f62816a, false, 69607, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.app.api.a.a.a(aa.this.getActivity(), exc, C0906R.string.afx);
                }
            });
        } else {
            com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.afx);
        }
    }

    public void onRecommendFailed(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, ai, false, 69575, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, ai, false, 69575, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a((Context) getActivity(), (Throwable) exc2);
        setOpenRecommendCardButtonState(0);
    }

    public void setOpenRecommendCardButtonState(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69549, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69549, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.profile.k.a()) {
            setDouYinBtnReport(i);
        }
    }

    private void setDouYinBtnReport(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69550, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69550, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.T != null && this.bg != null) {
            switch (i) {
                case 0:
                    this.bg.setContentDescription(getResources().getString(C0906R.string.brv));
                    this.bg.clearAnimation();
                    this.aN.setBackgroundResource(2130837983);
                    this.bg.setImageResource(2130839407);
                    this.bg.setRotation(-180.0f);
                    this.bg.animate().rotation(0.0f).start();
                    return;
                case 1:
                    this.bg.clearAnimation();
                    this.aN.setBackgroundResource(2130837983);
                    this.bg.setImageResource(2130839100);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setRepeatCount(-1);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setDuration(600);
                    this.bg.startAnimation(rotateAnimation);
                    return;
                case 2:
                    this.bg.setContentDescription(getResources().getString(C0906R.string.brv));
                    this.bg.clearAnimation();
                    this.aN.setBackgroundResource(2130837968);
                    this.bg.setImageResource(2130839408);
                    this.bg.setRotation(-180.0f);
                    this.bg.animate().rotation(0.0f).start();
                    break;
            }
        }
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69502, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69502, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.b(view);
        this.aA.setOnClickListener(new aj(this));
        this.ax.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62795a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62795a, false, 69603, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62795a, false, 69603, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!aa.this.h(view)) {
                    aa.this.m(view);
                }
            }
        });
        this.av.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62824a;

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62824a, false, 69613, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62824a, false, 69613, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                aa.this.i(view2);
            }
        });
        this.au.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62826a;

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62826a, false, 69614, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62826a, false, 69614, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                aa.this.j(view2);
            }
        });
        this.aG.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62828a;

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62828a, false, 69615, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62828a, false, 69615, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                aa.this.k(view2);
            }
        });
        this.bg.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62797a;

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62797a, false, 69616, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62797a, false, 69616, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                aa.this.l(view2);
            }
        });
    }

    public final void d(int i) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69515, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69515, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.T.isViewValid() && getPublishPosi() >= 0) {
            if (this.f3817c == null || (!this.f3817c.isBlock && !this.f3817c.isBlocked())) {
                i2 = i;
            } else {
                i2 = 0;
            }
            ProfileTabView profileTabView = (ProfileTabView) this.H.a(getPublishPosi());
            Locale locale = Locale.getDefault();
            String string = getContext().getString(C0906R.string.du9);
            Object[] objArr = new Object[1];
            if (i2 < 0) {
                i3 = 0;
            } else {
                i3 = i2;
            }
            objArr[0] = Integer.valueOf(i3);
            String format = String.format(locale, string, objArr);
            if (m()) {
                format = getContext().getString(C0906R.string.du_);
            }
            a(profileTabView, String.valueOf(i2), format);
        }
    }

    public final void e(int i) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69516, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69516, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.T.isViewValid() && getFavoritePosi() >= 0) {
            if (this.f3817c == null || (!this.f3817c.isBlock && !this.f3817c.isBlocked())) {
                i2 = i;
            } else {
                i2 = 0;
            }
            ProfileTabView profileTabView = (ProfileTabView) this.H.a(getFavoritePosi());
            Locale locale = Locale.getDefault();
            String string = getContext().getString(C0906R.string.b5g);
            Object[] objArr = new Object[1];
            if (i2 < 0) {
                i3 = 0;
            } else {
                i3 = i2;
            }
            objArr[0] = Integer.valueOf(i3);
            String format = String.format(locale, string, objArr);
            if (m()) {
                format = getContext().getString(C0906R.string.b5j);
            }
            a(profileTabView, String.valueOf(i2), format);
        }
    }

    public final void f(View view) {
        boolean z;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, ai, false, 69535, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, ai, false, 69535, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.bn == null) {
            this.bn = new ArrayList<>(1);
        }
        this.bn.add(new a());
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
        Activity activity = getActivity();
        if (this.U.getmFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        a2.wrapperSyncXAlert(activity, 2, z, new ak(this, view2), this.bn.get(this.bn.size() - 1));
    }

    public final void g(int i) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69517, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69517, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.T.isViewValid() && SharePrefCache.inst().isOpenForward() && getDynamicPosi() >= 0) {
            ProfileTabView profileTabView = (ProfileTabView) this.H.a(getDynamicPosi());
            if (this.f3817c == null || (!this.f3817c.isBlock && !this.f3817c.isBlocked())) {
                i2 = i;
            } else {
                i2 = 0;
            }
            Locale locale = Locale.getDefault();
            String string = getContext().getString(C0906R.string.aei);
            Object[] objArr = new Object[1];
            if (i2 < 0) {
                i3 = 0;
            } else {
                i3 = i2;
            }
            objArr[0] = Integer.valueOf(i3);
            String format = String.format(locale, string, objArr);
            if (m()) {
                format = getContext().getString(C0906R.string.aej);
            }
            a(profileTabView, String.valueOf(i2), format);
        }
    }

    public final void h(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69511, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69511, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.T.isViewValid()) {
            super.h(i);
            if (o() && getOriginMusicsionPosi() >= 0) {
                ProfileTabView profileTabView = (ProfileTabView) this.H.a(getOriginMusicsionPosi());
                String valueOf = String.valueOf(i);
                Locale locale = Locale.getDefault();
                String string = getContext().getString(C0906R.string.bs4);
                Object[] objArr = new Object[1];
                if (i < 0) {
                    i2 = 0;
                } else {
                    i2 = i;
                }
                objArr[0] = Integer.valueOf(i2);
                a(profileTabView, valueOf, String.format(locale, string, objArr));
                profileTabView.setDescription(String.valueOf(i));
            }
        }
    }

    public final void k(View view) {
        com.ss.android.ugc.aweme.common.ui.a aVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69554, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69554, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(this.U.getmRequestedText())) {
            aVar = new com.ss.android.ugc.aweme.common.ui.a(getActivity());
            aVar.a((CharSequence[]) new String[]{getResources().getString(C0906R.string.pt), getResources().getString(C0906R.string.pm)}, (DialogInterface.OnClickListener) new ae(this));
        } else {
            aVar = new com.ss.android.ugc.aweme.common.ui.a(getActivity());
            ArrayList arrayList = new ArrayList();
            this.U.setmRequestedText(getContext().getString(C0906R.string.dnv));
            arrayList.add(this.U.getmRequestedText());
            arrayList.add(getContext().getString(C0906R.string.pm));
            final String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            aVar.a((CharSequence[]) strArr, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62806a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62806a, false, 69619, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62806a, false, 69619, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (TextUtils.equals(strArr[i], aa.this.U.getmRequestedText())) {
                        aa.this.f((View) aa.this.aG);
                    }
                    dialogInterface.dismiss();
                }
            });
        }
        try {
            aVar.b();
        } catch (Resources.NotFoundException unused) {
        }
    }

    public void onRefreshRecommendSuccess(final RecommendList recommendList) {
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, ai, false, 69576, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, ai, false, 69576, new Class[]{RecommendList.class}, Void.TYPE);
        } else if (this.T.isViewValid()) {
            if (recommendList == null || recommendList.getUserList() == null) {
                setOpenRecommendCardButtonState(0);
                return;
            }
            if (recommendList.getUserList().size() < 10) {
                this.aD.setShowLookMore(false);
            } else {
                this.aD.setShowLookMore(true);
            }
            this.aD.setOnViewAttachedToWindowListener(this.aZ);
            this.aD.a(recommendList.getUserList(), recommendList.rid);
            this.aD.setOnItemOperationListener(new RecommendUserAdapter.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62819a;

                public final void b(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f62819a, false, 69609, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f62819a, false, 69609, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    aa.this.a(false);
                }

                public final void a(User user, int i) {
                    User user2 = user;
                    if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i)}, this, f62819a, false, 69608, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i)}, this, f62819a, false, 69608, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.friends.api.b.a().dislikeRecommend(user.getUid());
                    if (com.ss.android.g.a.a()) {
                        p.a(user2, "delete", aa.this.j(user2), aa.this.U.getmRequestId());
                    } else {
                        r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("personal_homepage").setJsonObject(aa.this.a(user.getUid(), "delete", aa.this.j(user2))));
                    }
                    String uid = user.getUid();
                    int j = aa.this.j(user2);
                    String rid = aa.this.getRid();
                    if (PatchProxy.isSupport(new Object[]{uid, "delete", Integer.valueOf(j), rid, "empty"}, null, p.f61463a, true, 69983, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                        Object[] objArr = {uid, "delete", Integer.valueOf(j), rid, "empty"};
                        Object[] objArr2 = objArr;
                        PatchProxy.accessDispatch(objArr2, null, p.f61463a, true, 69983, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("rec_uid", uid);
                            jSONObject.put("enter_from", "others_homepage");
                            jSONObject.put("event_type", "delete");
                            jSONObject.put("impr_order", j);
                            jSONObject.put("req_id", rid);
                            jSONObject.put("is_direct", 1);
                            jSONObject.put("page_status", "empty");
                        } catch (JSONException unused) {
                        }
                        r.a("follow_card", jSONObject);
                    }
                    aa.this.aO.a(user2);
                }

                public final void d(User user, int i) {
                    User user2 = user;
                    if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i)}, this, f62819a, false, 69611, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i)}, this, f62819a, false, 69611, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    String str = aa.this.U.getmAwemeId();
                    String str2 = aa.this.U.getmUserId();
                    String str3 = aa.this.U.getmEventType();
                    if (com.ss.android.g.a.a()) {
                        p.a(user2, "enter_profile", aa.this.j(user2), aa.this.U.getmRequestId());
                        if (PatchProxy.isSupport(new Object[]{str, str2, "card"}, null, p.f61463a, true, 69982, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, str2, "card"}, null, p.f61463a, true, 69982, new Class[]{String.class, String.class, String.class}, Void.TYPE);
                        } else {
                            ((q) new q().c(str).b("others_homepage").k(str2).a("card")).e();
                        }
                    } else {
                        r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("personal_homepage").setJsonObject(aa.this.a(user.getUid(), "enter_profile", aa.this.j(user2))));
                        r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aa.this.U.getmUserId()).setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("enter_from", aa.this.U.getmEventType()).a("enter_type", "card").b()));
                        ((q) new q().c(str).b("personal_homepage").k(str2).a(str3)).e();
                    }
                }

                public final void c(User user, int i) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    User user2 = user;
                    if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i)}, this, f62819a, false, 69610, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i)}, this, f62819a, false, 69610, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (com.ss.android.g.a.a()) {
                        if (user.getFollowStatus() == 0) {
                            str3 = "follow";
                        } else {
                            str3 = "follow_cancel";
                        }
                        p.a(user2, str3, aa.this.j(user2), aa.this.U.getmRequestId());
                        String str5 = aa.this.U.getmPreviousPagePosition();
                        String str6 = recommendList.rid;
                        String str7 = aa.this.U.getmPreviousPage();
                        if (PatchProxy.isSupport(new Object[]{user2, str5, str6, str7}, null, p.f61463a, true, 69981, new Class[]{User.class, String.class, String.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{user2, str5, str6, str7}, null, p.f61463a, true, 69981, new Class[]{User.class, String.class, String.class, String.class}, Void.TYPE);
                        } else {
                            if (user.getFollowStatus() == 0) {
                                str4 = "follow";
                            } else {
                                str4 = "follow_cancel";
                            }
                            new s(str4).c("follow_card_button").b("others_homepage").g(str5).f(str7).k(str6).m("card").h(com.ss.android.ugc.aweme.u.aa.b(user)).e();
                        }
                    } else {
                        r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("personal_homepage").setJsonObject(aa.this.a(user.getUid(), "follow", aa.this.j(user2))));
                        r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("others_homepage").setValue(aa.this.U.getmUserId()).setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("previous_page", aa.this.U.getmEventType()).a("request_id", recommendList.rid).a("enter_type", "card").b()));
                        if (user.getFollowStatus() == 0) {
                            str = "follow";
                        } else {
                            str = "follow_cancel";
                        }
                        new s(str).c("follow_card_button").b("others_homepage").g(aa.this.U.getmPreviousPagePosition()).f(aa.this.U.getmPreviousPage()).k(recommendList.rid).m("card").e("nonempty").h(aa.this.U.getmUserId()).e();
                        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                        if (user.getFollowStatus() == 0) {
                            str2 = "follow";
                        } else {
                            str2 = "follow_cancel";
                        }
                        r.a("follow_card", (Map) a2.a("event_type", str2).a("enter_method", "follow_card_button").a("enter_from", "others_homepage").a("previous_page_position", aa.this.U.getmPreviousPagePosition()).a("previous_page", aa.this.U.getmPreviousPage()).a("request_id", recommendList.rid).a("to_user_id", aa.this.U.getmUserId()).f34114b);
                    }
                }
            });
            this.aD.setOnLookMoreUserListener(new RecommendCommonUserView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62822a;

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f62822a, false, 69612, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f62822a, false, 69612, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    RecommendUserActivity.a(aa.this.getContext(), aa.this.U.getmUserId(), 1, "others_homepage_more", "others_homepage", str, aa.this.U.getSecUserId());
                    r.onEvent(MobClick.obtain().setEventName("click_add_friends").setLabelName("personal_homepage").setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("event_type", "card").b()));
                }
            });
            if (recommendList == null || CollectionUtils.isEmpty(recommendList.getUserList())) {
                onRecommendFailed(new Exception());
            } else {
                a(true);
            }
        }
    }

    public void setSimpleUserData(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, ai, false, 69499, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, ai, false, 69499, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            h(user);
            int i = 8;
            if (TextUtils.equals(user.getUid(), d.a().getCurUserId())) {
                if (this.aN != null) {
                    this.aN.setVisibility(8);
                }
            } else if (com.ss.android.ugc.aweme.profile.k.a() && this.aN != null) {
                if (d.a().isLogin() && AbTestManager.a().i()) {
                    i = 0;
                }
                if (this.aN.getVisibility() != i) {
                    this.aN.setVisibility(i);
                }
            }
        }
    }

    public void setVisible(boolean z) {
        String str;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 69510, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ai, false, 69510, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setVisible(z);
        this.bi = z;
        if (this.aA != null && this.aA.getVisibility() == 0 && z) {
            if (com.ss.android.ugc.aweme.commercialize.utils.c.b(this.f3817c)) {
                g.a("othershow", getContext(), this.U.getmAweme(), this.f3817c);
                a((int) C0906R.id.bpj, (Object) 1);
            } else {
                aw b2 = new aw().b(this.U.getmUserId());
                if (ex.g(this.f3817c)) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                b2.a(str).c("normal").b();
                this.aA.setTag(C0906R.id.bpj, 1);
            }
        }
        if (z && c() && this.av.getVisibility() == 0) {
            f.c("click_message");
        }
        if (this.f3817c != null) {
            if (!this.f3817c.isLive() || !z) {
                z2 = false;
            }
            b(z2, ex.l(this.f3817c), false);
        }
        if (z) {
            i();
        }
    }

    private void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, ai, false, 69540, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, ai, false, 69540, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        an<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = ((Integer) privacyAccountFollowCount.c()).intValue();
        if (intValue == 0) {
            new a.C0185a(activity2).b((int) C0906R.string.br4).a((int) C0906R.string.anv, (DialogInterface.OnClickListener) null).a().a();
        } else if (intValue > 0 && intValue < 4) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) activity2, (int) C0906R.string.br5).a();
        }
        privacyAccountFollowCount.a(Integer.valueOf(intValue + 1));
    }

    public final void b(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 69519, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ai, false, 69519, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.T.isViewValid()) {
            ImageView imageView = this.bg;
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: g */
    public final void m(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, ai, false, 69536, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, ai, false, 69536, new Class[]{View.class}, Void.TYPE);
            return;
        }
        b(view2, true ^ com.ss.android.g.a.b());
    }

    public final boolean h(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69541, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69541, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f3817c != null && this.f3817c.isBlock && this.U.getmFollowStatus() == 0) {
            Context context = getContext();
            if (context != null) {
                new a.C0185a(context).a((int) C0906R.string.dnp).b((int) C0906R.string.dno).a((int) C0906R.string.afp, (DialogInterface.OnClickListener) new ad(this, view)).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a().a();
                return true;
            }
        }
        return false;
    }

    public final void i(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69551, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69551, new Class[]{View.class}, Void.TYPE);
        } else if (this.f3817c != null) {
            if (TimeLockRuler.isTeenModeON()) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.cif).a();
                return;
            }
            IIMService a2 = com.ss.android.ugc.aweme.im.b.a(false);
            if (view.equals(this.av) || view.equals(this.bk)) {
                if (PatchProxy.isSupport(new Object[]{a2}, this, ai, false, 69553, new Class[]{IIMService.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{a2}, this, ai, false, 69553, new Class[]{IIMService.class}, Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.im.b.b() || a2 == null) {
                    f((View) this.au);
                } else {
                    f.a(this.f3817c.getUid());
                    f.a(this.U.getmUserId(), this.U.getmAwemeId(), this.U.getmEventType(), this.U.getmRequestId(), "click_message");
                    Aweme aweme = this.U.getmAweme();
                    if (a(aweme)) {
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("log_extra", aweme.getAwemeRawAd().getLogExtra());
                        jsonObject.addProperty("creative_id", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
                        a2.wrapperChatWithSyncXAlert(getActivity(), com.ss.android.ugc.aweme.im.b.a(this.f3817c), 2, new com.ss.android.ugc.aweme.im.service.model.a(aweme.getAwemeRawAd().getLogExtra(), String.valueOf(aweme.getAwemeRawAd().getCreativeId())));
                    } else {
                        a2.wrapperChatWithSyncXAlert(getActivity(), com.ss.android.ugc.aweme.im.b.a(this.f3817c), 2);
                    }
                    if (a(aweme)) {
                        g.u(getContext(), aweme);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFollowSuccess(com.ss.android.ugc.aweme.profile.model.FollowStatus r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = ai
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.FollowStatus> r1 = com.ss.android.ugc.aweme.profile.model.FollowStatus.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 69567(0x10fbf, float:9.7484E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = ai
            r3 = 0
            r4 = 69567(0x10fbf, float:9.7484E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.FollowStatus> r1 = com.ss.android.ugc.aweme.profile.model.FollowStatus.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f3817c
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.a(r0, r10)
            if (r0 == 0) goto L_0x0045
            int r0 = r8.followStatus
            if (r0 != r9) goto L_0x0045
            return
        L_0x0045:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f3817c
            if (r0 != 0) goto L_0x005c
            com.ss.android.ugc.aweme.profile.model.User r0 = new com.ss.android.ugc.aweme.profile.model.User
            r0.<init>()
            com.ss.android.ugc.aweme.profile.ui.header.ay r1 = r7.U
            java.lang.String r1 = r1.getmUserId()
            r0.setUid(r1)
            int r1 = r8.followStatus
            r0.setFollowStatus(r1)
        L_0x005c:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x0131
            java.lang.String r1 = r0.getEnterpriseVerifyReason()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0131
            int r1 = r8.followStatus
            if (r1 != 0) goto L_0x0083
            com.bytedance.ies.dmt.ui.a.b r1 = r7.bf
            if (r1 == 0) goto L_0x0131
            com.bytedance.ies.dmt.ui.a.b r1 = r7.bf
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x0131
            com.bytedance.ies.dmt.ui.a.b r1 = r7.bf
            r1.dismiss()
            goto L_0x0131
        L_0x0083:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getHasShowRemarkNamePopup()
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00fe
            com.bytedance.ies.dmt.ui.a.b r1 = r7.bf
            if (r1 != 0) goto L_0x00bf
            com.bytedance.ies.dmt.ui.a.b$a r1 = new com.bytedance.ies.dmt.ui.a.b$a
            android.app.Activity r2 = r17.getActivity()
            r1.<init>(r2)
            r2 = 2131561269(0x7f0d0b35, float:1.8747934E38)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.b((int) r2)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.c((boolean) r10)
            r2 = 5000(0x1388, double:2.4703E-320)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.a((long) r2)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.a((boolean) r10)
            com.bytedance.ies.dmt.ui.a.b r1 = r1.a()
            r7.bf = r1
        L_0x00bf:
            com.bytedance.ies.dmt.ui.a.b r1 = r7.bf
            boolean r1 = r1.isShowing()
            if (r1 != 0) goto L_0x0131
            com.bytedance.ies.dmt.ui.a.b r1 = r7.bf
            r1.a()
            com.bytedance.ies.dmt.ui.a.b r11 = r7.bf
            android.widget.Button r12 = r7.ax
            r13 = 80
            android.content.Context r1 = r17.getContext()
            int r1 = com.ss.android.ugc.aweme.base.utils.p.b(r1)
            com.bytedance.ies.dmt.ui.a.b r2 = r7.bf
            int r2 = r2.d()
            int r14 = r1 - r2
            r1 = 4634626229029306368(0x4051800000000000, double:70.0)
            int r15 = com.ss.android.ugc.aweme.base.utils.u.a((double) r1)
            r16 = 1137049600(0x43c60000, float:396.0)
            r11.a(r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getHasShowRemarkNamePopup()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.a(r2)
            goto L_0x0131
        L_0x00fe:
            android.content.Context r1 = r17.getContext()
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f3817c
            boolean r1 = com.ss.android.ugc.aweme.profile.d.i.a(r1, r2, r8)
            if (r1 == 0) goto L_0x0131
            boolean r1 = r7.aV
            com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog r2 = new com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog
            android.content.Context r3 = r17.getContext()
            r2.<init>(r3)
            r2.g = r0
            java.lang.String r3 = r8.contactName
            r2.h = r3
            r2.i = r9
            com.ss.android.ugc.aweme.profile.ui.header.af r3 = new com.ss.android.ugc.aweme.profile.ui.header.af
            r3.<init>(r7)
            r2.f63095f = r3
            com.ss.android.ugc.aweme.profile.ui.header.ag r3 = new com.ss.android.ugc.aweme.profile.ui.header.ag
            r3.<init>(r7, r8, r1)
            r2.setOnDismissListener(r3)
            r2.show()
            r1 = 1
            goto L_0x0132
        L_0x0131:
            r1 = 0
        L_0x0132:
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = com.ss.android.ugc.aweme.im.b.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            int r3 = r8.followStatus
            r2.setFollowStatus(r3)
            com.ss.android.ugc.aweme.im.service.IIMService r3 = com.ss.android.ugc.aweme.im.b.a()
            r3.updateIMUser(r2)
            int r2 = r8.followStatus
            if (r2 == 0) goto L_0x014c
            com.ss.android.ugc.aweme.discover.hitrank.f r2 = com.ss.android.ugc.aweme.discover.hitrank.f.f42393c
            r3 = 5
            r2.a((com.ss.android.ugc.aweme.profile.model.User) r0, (int) r3)
        L_0x014c:
            int r2 = r8.followStatus
            int r3 = r0.getFollowerStatus()
            r7.a((int) r2, (int) r3)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "code"
            r2.put(r3, r9)     // Catch:{ JSONException -> 0x0171 }
            java.lang.String r3 = "user_id"
            com.ss.android.ugc.aweme.profile.ui.header.ay r4 = r7.U     // Catch:{ JSONException -> 0x0171 }
            java.lang.String r4 = r4.getmUserId()     // Catch:{ JSONException -> 0x0171 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0171 }
            java.lang.String r3 = "follow_status"
            int r4 = r8.followStatus     // Catch:{ JSONException -> 0x0171 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0171 }
        L_0x0171:
            com.ss.android.ugc.aweme.web.jsbridge.t r3 = new com.ss.android.ugc.aweme.web.jsbridge.t
            java.lang.String r4 = "userFollowStatusChange"
            r3.<init>(r4, r2)
            com.ss.android.ugc.aweme.utils.bg.a(r3)
            int r2 = r8.followStatus
            boolean r3 = r7.aV
            r7.a((int) r2, (boolean) r3, (boolean) r1)
            int r1 = r0.getFollowStatus()
            r2 = 2
            if (r1 != r2) goto L_0x0190
            boolean r1 = com.ss.android.ugc.aweme.utils.ex.l(r0)
            if (r1 == 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r9 = 0
        L_0x0191:
            boolean r0 = com.ss.android.ugc.aweme.feed.model.StoryUnreadUtils.hasUnreadStory(r0)
            r7.a((boolean) r9, (boolean) r0)
            r7.aV = r10
            int r0 = r8.followStatus
            if (r0 != 0) goto L_0x01c8
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f3817c
            java.lang.String r0 = r0.getRemarkName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c8
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f3817c
            java.lang.String r1 = ""
            r0.setRemarkName(r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f3817c
            java.lang.String r0 = r0.getNickname()
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f3817c
            int r1 = r1.getStarBillboardRank()
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f3817c
            com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo r2 = r2.getBrandInfo()
            com.ss.android.ugc.aweme.profile.model.User r3 = r7.f3817c
            r7.a(r0, r1, r2, r3)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.header.aa.onFollowSuccess(com.ss.android.ugc.aweme.profile.model.FollowStatus):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p(View view) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        GeneralPermission generalPermission = this.f3817c.getGeneralPermission();
        if (generalPermission != null) {
            i = generalPermission.getShopToast();
        } else {
            i = 0;
        }
        if (i == 1) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.l1).a();
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69533, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69533, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!(getActivity() == null || this.f3817c == null)) {
            Aweme aweme = this.U.getmAweme();
            if (a(aweme)) {
                Context context = getContext();
                if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31742, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31742, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                } else if (!com.ss.android.g.a.a()) {
                    com.ss.android.ugc.aweme.commercialize.log.d.a().a("homepage_ad").b("click_shopwindow").b(aweme).a(context);
                }
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.c.b(this.f3817c)) {
                String quickShopUrl = this.f3817c.getQuickShopInfo().getQuickShopUrl();
                if (!com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), quickShopUrl, true)) {
                    com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), quickShopUrl, "");
                }
                g.a("click", getContext(), aweme, this.f3817c);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, ai, false, 69534, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, ai, false, 69534, new Class[0], Void.TYPE);
            } else if (TextUtils.isEmpty(this.f3817c.getShopMicroApp())) {
                Activity activity = getActivity();
                int verifyStatus = d.a().getVerifyStatus();
                CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(this.f3817c);
                if (ex.g(this.f3817c)) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                com.ss.android.ugc.aweme.commerce.service.models.m mVar = new com.ss.android.ugc.aweme.commerce.service.models.m(activity, verifyStatus, a2, str2, ex.g(this.f3817c), this.U.getmAwemeId());
                if (ex.g(this.f3817c)) {
                    str3 = "personal_homepage";
                } else {
                    str3 = "others_homepage";
                }
                if (ex.g(this.f3817c)) {
                    str4 = "click_personal_store";
                } else {
                    str4 = "click_others_store";
                }
                com.ss.android.ugc.aweme.commercialize.g.a(mVar, "my_store", str3, str4);
            } else {
                ac acVar = new ac();
                if (ex.g(this.f3817c)) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                acVar.a(str).c("mini_program").b(this.U.getmUserId()).b();
                ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(getActivity(), this.f3817c.getShopMicroApp(), new b.a().b("others_homepage").a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(View view) {
        if (this.f3817c == null || com.ss.android.ugc.aweme.commercialize.utils.c.c(this.f3817c)) {
            return;
        }
        if (this.f3817c.getDefaultAdCoverUrl() != null) {
            AdCoverTitle adCoverTitle = this.f3817c.getAdCoverTitle();
            if (adCoverTitle != null) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().a("starpage_ad").b("click").d("top_bar").g("{}").c(this.f3817c.getAdOrderId()).a(getContext());
                com.ss.android.ugc.aweme.commercialize.utils.g.a(view.getContext(), adCoverTitle.getWebUrl(), "");
            }
            return;
        }
        if (!CollectionUtils.isEmpty(this.f3817c.getCoverUrls())) {
            r.a("click_profile_icon", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").a("enter_method", "click_cover").f34114b);
            ProfileCoverPreviewActivity.a(getContext(), this.f3817c.getCoverUrls().get(0), false);
        }
    }

    public final void c(String str) {
        int i;
        if (PatchProxy.isSupport(new Object[]{str}, this, ai, false, 69532, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, ai, false, 69532, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.T.isViewValid()) {
            this.aa = str;
            StringBuilder sb = new StringBuilder();
            Resources resources = getResources();
            if (com.ss.android.g.a.c()) {
                i = C0906R.string.c8j;
            } else {
                i = C0906R.string.ao6;
            }
            sb.append(resources.getString(i));
            sb.append(str);
            this.q.setText(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        if (r2 != false) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(com.ss.android.ugc.aweme.profile.model.User r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = ai
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 69531(0x10f9b, float:9.7434E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = ai
            r3 = 0
            r4 = 69531(0x10f9b, float:9.7434E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment r0 = r7.T
            boolean r0 = r0.isViewValid()
            if (r0 == 0) goto L_0x02b4
            boolean r0 = r18.m()
            if (r0 == 0) goto L_0x0048
            goto L_0x02b4
        L_0x0048:
            super.f((com.ss.android.ugc.aweme.profile.model.User) r19)
            com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView r0 = r7.aI
            r1 = 8
            if (r0 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView r0 = r7.aI
            r0.setVisibility(r1)
        L_0x0056:
            android.widget.TextView r0 = r7.J
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0070
            android.widget.TextView r0 = r7.L
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0070
            android.widget.TextView r0 = r7.K
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            java.lang.String r2 = r19.getRecommendReasonRelation()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02a4
            if (r0 != 0) goto L_0x00bc
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71999(0x1193f, float:1.00892E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r2
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x00b0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71999(0x1193f, float:1.00892E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r2
            r16 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x00ba
        L_0x00b0:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r2 = r2.d()
            if (r2 != 0) goto L_0x00b8
            r2 = 0
            goto L_0x00ba
        L_0x00b8:
            boolean r2 = r2.enableVerifyUserRecommendReason
        L_0x00ba:
            if (r2 == 0) goto L_0x02a4
        L_0x00bc:
            if (r0 == 0) goto L_0x00c4
            android.view.View r0 = r7.aF
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r1)
            goto L_0x00c9
        L_0x00c4:
            android.view.View r0 = r7.aF
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r10)
        L_0x00c9:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.bQ()
            if (r0 != r9) goto L_0x0291
            android.widget.TextView r0 = r7.aH
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView r0 = r7.aI
            if (r0 == 0) goto L_0x028b
            com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView r0 = r7.aI
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView.f62989a
            r14 = 0
            r15 = 69660(0x1101c, float:9.7614E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0113
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView.f62989a
            r14 = 0
            r15 = 69660(0x1101c, float:9.7614E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x028b
        L_0x0113:
            java.lang.String r2 = "user"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r2)
            java.lang.String r2 = r19.getRecommendReasonRelation()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0129
            r0.setVisibility(r1)
            goto L_0x028b
        L_0x0129:
            r0.setVisibility(r10)
            boolean r2 = com.ss.android.ugc.aweme.utils.ex.o(r19)
            if (r2 == 0) goto L_0x0234
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView.f62989a
            r14 = 0
            r15 = 69662(0x1101e, float:9.7617E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0167
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView.f62989a
            r14 = 0
            r15 = 69662(0x1101e, float:9.7617E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x028b
        L_0x0167:
            android.widget.ImageView r2 = r0.f62990b
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f62992d
            r2.setAlpha(r3)
            java.lang.String r3 = r19.getRecommendReasonRelation()
            java.lang.String r4 = "user.recommendReasonRelation"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView.f62989a
            r14 = 0
            r15 = 69663(0x1101f, float:9.7619E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r10] = r5
            java.lang.Class<android.text.SpannableStringBuilder> r17 = android.text.SpannableStringBuilder.class
            r12 = r0
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x01b3
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView.f62989a
            r14 = 0
            r15 = 69663(0x1101f, float:9.7619E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r10] = r4
            java.lang.Class<android.text.SpannableStringBuilder> r17 = android.text.SpannableStringBuilder.class
            r12 = r0
            r16 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
            goto L_0x021f
        L_0x01b3:
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r12 = "<b>"
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r4
            int r5 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r11, (java.lang.String) r12, (int) r13, (boolean) r14, (int) r15, (java.lang.Object) r16)
            java.lang.String r12 = "</b>"
            int r4 = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) r11, (java.lang.String) r12, (int) r13, (boolean) r14, (int) r15, (java.lang.Object) r16)
            int r4 = r4 + 4
            int r6 = r3.length()
            int r6 = r6 - r4
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4.<init>(r3)
            r3 = 33
            r9 = 2131625729(0x7f0e0701, float:1.8878674E38)
            if (r5 <= 0) goto L_0x01fa
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan
            android.content.Context r12 = r0.getContext()
            java.lang.String r13 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r13)
            android.content.res.Resources r12 = r12.getResources()
            int r12 = r12.getColor(r9)
            r11.<init>(r12)
            r4.setSpan(r11, r10, r5, r3)
        L_0x01fa:
            if (r6 <= 0) goto L_0x021e
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            android.content.Context r11 = r0.getContext()
            java.lang.String r12 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            android.content.res.Resources r11 = r11.getResources()
            int r9 = r11.getColor(r9)
            r5.<init>(r9)
            int r9 = r4.length()
            int r9 = r9 - r6
            int r6 = r4.length()
            r4.setSpan(r5, r9, r6, r3)
        L_0x021e:
            r3 = r4
        L_0x021f:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.widget.ImageView r2 = r0.f62991c
            r2.setVisibility(r10)
            com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView$a r2 = new com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView$a
            r2.<init>(r0, r8)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            goto L_0x028b
        L_0x0234:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView.f62989a
            r14 = 0
            r15 = 69661(0x1101d, float:9.7616E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0268
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView.f62989a
            r14 = 0
            r15 = 69661(0x1101d, float:9.7616E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x028b
        L_0x0268:
            android.widget.ImageView r2 = r0.f62990b
            r3 = 1056964608(0x3f000000, float:0.5)
            r2.setAlpha(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f62992d
            r2.setAlpha(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f62992d
            r2.setAlpha(r3)
            java.lang.String r3 = r19.getRecommendReasonRelation()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.widget.ImageView r2 = r0.f62991c
            r2.setVisibility(r1)
            r2 = 0
            r0.setOnClickListener(r2)
        L_0x028b:
            android.view.View r0 = r7.aE
            r0.setVisibility(r1)
            return
        L_0x0291:
            android.widget.TextView r0 = r7.aH
            java.lang.String r1 = r19.getRecommendReasonRelation()
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r7.aH
            r0.setVisibility(r10)
            return
        L_0x02a4:
            android.view.View r0 = r7.aF
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r1)
            android.widget.TextView r0 = r7.aH
            r0.setVisibility(r1)
            android.view.View r0 = r7.aE
            r0.setVisibility(r10)
            return
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.header.aa.f(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    private boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, ai, false, 69580, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, ai, false, 69580, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            return aweme.isAd();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(FollowStatus followStatus, boolean z) {
        a(followStatus.followStatus, z, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            f((View) this.aG);
        }
        dialogInterface.dismiss();
    }

    private void a(@IdRes int i, Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.bpj), obj2}, this, ai, false, 69585, new Class[]{Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.bpj), obj2}, this, ai, false, 69585, new Class[]{Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).setTag(C0906R.id.bpj, obj2);
        }
    }

    private void b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, ai, false, 69546, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, ai, false, 69546, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!c(i, i2)) {
            this.aK.a(i, i2);
        }
    }

    private void c(final boolean z, final boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, ai, false, 69522, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, ai, false, 69522, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        final User user = this.f3817c;
        com.ss.android.ugc.aweme.live.feedpage.c.a().a(getClass(), user, new Consumer<Map<Long, Long>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62799a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                long j;
                Map map = (Map) obj;
                if (PatchProxy.isSupport(new Object[]{map}, this, f62799a, false, 69617, new Class[]{Map.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{map}, this, f62799a, false, 69617, new Class[]{Map.class}, Void.TYPE);
                    return;
                }
                if (aa.this.f3817c != null) {
                    Long l = (Long) map.get(Long.valueOf(user.getUid()));
                    User user = user;
                    if (l == null) {
                        j = 0;
                    } else {
                        j = l.longValue();
                    }
                    user.roomId = j;
                    if (TextUtils.equals(user.getUid(), aa.this.f3817c.getUid())) {
                        aa.this.f3817c.roomId = user.roomId;
                        if (!user.isLive()) {
                            aa.this.b(z, z2);
                        }
                    }
                }
            }
        });
    }

    private boolean c(int i, int i2) {
        TextView textView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, ai, false, 69548, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, ai, false, 69548, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.aK == null) {
            Context context = getContext();
            Button button = (Button) this.G;
            if (!com.ss.android.ugc.aweme.profile.k.a()) {
                textView = this.bc;
            } else {
                textView = null;
            }
            TextView textView2 = textView;
            View view = this.av;
            RemoteImageView remoteImageView = this.at;
            DmtTextView dmtTextView = this.au;
            Button button2 = this.aG;
            h hVar = new h(context, button, textView2, view, remoteImageView, dmtTextView, button2, this.bk, c(), ab_(), this.aN);
            this.aK = hVar;
        }
        this.U.setmFollowStatus(i);
        this.U.setmFollowerStatus(i2);
        if (!TextUtils.equals(this.U.getmUserId(), d.a().getCurUserId())) {
            return false;
        }
        v.a(this.G, 8);
        v.a((View) this.bc, 8);
        v.a(this.av, 8);
        v.a((View) this.at, 8);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void b(View view, boolean z) {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 69537, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, ai, false, 69537, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.f3817c != null && this.U != null && getActivity() != null) {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
            } else if (!d.a().isLogin()) {
                String string = getContext().getString(C0906R.string.afr);
                if (getSourceAweme() != null) {
                    str = getSourceAweme().getAid();
                } else {
                    str = "";
                }
                com.ss.android.ugc.aweme.login.e.a(getActivity(), this.U.getmEventType(), "click_follow", ad.a().a("login_title", string).a("group_id", str).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(str)).f75487b, (com.ss.android.ugc.aweme.base.component.f) new al(this, view, z));
            } else {
                if (this.U.getmFollowStatus() == 0) {
                    if (this.f3817c.getGeneralPermission() != null) {
                        i = this.f3817c.getGeneralPermission().getFollowToast();
                    }
                    if (i == 1) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), (int) C0906R.string.bm5).a();
                        return;
                    } else if (i == 2) {
                        new a.C0185a(getActivity()).a((int) C0906R.string.bly).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new am(this, view, z)).a().b();
                        return;
                    }
                }
                a(view, z);
            }
        }
    }

    public final void b(boolean z, boolean z2) {
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, ai, false, 69523, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, ai, false, 69523, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z, z2);
        if (!z) {
            i = 0;
        } else if (!z2) {
            i = 3;
        }
        setHeadStatus(i);
        this.ay.setVisibility(8);
        this.ay.cancelAnimation();
        if (this.z != null) {
            this.z.setVisibility(8);
        }
        this.y.setBorderWidthPx(0);
        I();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void a(View view, boolean z) {
        boolean z2;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        View view2 = view;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 69538, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, this, ai, false, 69538, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        } else if (!z || this.U.getmFollowStatus() != 2 || getContext() == null) {
            String str7 = this.U.getmFromSearch();
            if (!TextUtils.isEmpty(str7)) {
                this.U.setmEventType(str7);
                this.U.setmPreviousPage(str7);
            }
            if (this.U.getmFollowStatus() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = !z2;
            int i2 = this.U.getmFollowerStatus();
            if (z2) {
                i = 0;
            } else if (m()) {
                i = 4;
                a(getActivity());
            } else {
                i = 1;
            }
            String str8 = this.U.getmUserId();
            bg.a(new com.ss.android.ugc.aweme.challenge.a.d(i, this.f3817c, 1));
            if (d.a().isLogin()) {
                if (!TextUtils.isEmpty(this.U.getmProfileFrom())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("previous_page", this.U.getmEventType());
                        jSONObject.put("request_id", this.U.getmRequestId());
                        if (!TextUtils.isEmpty(this.U.getmPoiId())) {
                            jSONObject.put("poi_id", this.U.getmPoiId());
                        }
                        if (!TextUtils.isEmpty(this.U.getmMethodFrom())) {
                            jSONObject.put("previous_page", this.U.getmMethodFrom());
                        }
                        jSONObject.put("enter_type", "normal_way");
                        jSONObject.put("impr_type", com.ss.android.ugc.aweme.u.aa.s(this.U.getmAweme()));
                        if (!z2 && !TextUtils.isEmpty(this.U.getmEnterFromRequestId())) {
                            jSONObject.put("enter_from_request", this.U.getmEnterFromRequestId());
                        }
                        jSONObject.put("group_id", this.U.getmAwemeId());
                        jSONObject.put("scene_id", this.U.getSceneId());
                    } catch (JSONException unused) {
                    }
                    if (TextUtils.isEmpty(this.U.getmLiveRoomId()) || z2) {
                        Aweme aweme = this.U.getmAweme();
                        if (aweme == null && this.ah != null && TextUtils.equals(this.ah.getAuthorUid(), ex.h(this.f3817c))) {
                            aweme = this.ah;
                        }
                        if (a(aweme)) {
                            if (z2) {
                                g.t(getContext(), aweme);
                            } else if (!com.ss.android.ugc.aweme.commercialize.utils.c.x(aweme)) {
                                g.s(getContext(), aweme);
                            }
                        }
                        if (!z2 && com.ss.android.ugc.aweme.commercialize.utils.c.u(aweme)) {
                            g.C(getContext(), aweme);
                        }
                        MobClick obtain = MobClick.obtain();
                        if (z2) {
                            str2 = "follow_cancel";
                        } else {
                            str2 = "follow";
                        }
                        r.onEvent(obtain.setEventName(str2).setLabelName("others_homepage").setValue(str8).setExtValueString(this.U.getmAwemeId()).setJsonObject(jSONObject));
                        if (!a(z2, view2)) {
                            if (!TextUtils.equals("search_for_you_list", this.U.getmPreviousPage())) {
                                if (z2) {
                                    str4 = "follow_cancel";
                                } else {
                                    str4 = "follow";
                                }
                                s f2 = new s(str4).r(com.ss.android.ugc.aweme.u.aa.s(this.U.getmAweme())).b("others_homepage").g(this.U.getmPreviousPagePosition()).f(this.U.getmPreviousPage());
                                if (this.aV) {
                                    str5 = "top_bar_follow_button";
                                } else {
                                    str5 = "follow_button";
                                }
                                f2.c(str5).h(str8).i(this.U.getmAwemeId()).m("normal_way").k(getRequestId()).l(this.U.getmEnterFromRequestId()).a(this.U.getSceneId()).e();
                            } else if (!z2) {
                                new s("follow").r(com.ss.android.ugc.aweme.u.aa.s(this.U.getmAweme())).a("1034").b("others_homepage").f("search_for_you_list").h(str8).e();
                            } else {
                                new s("follow_cancel").r(com.ss.android.ugc.aweme.u.aa.s(this.U.getmAweme())).a("1002").b("others_homepage").f("search_for_you_list").h(str8).e();
                            }
                        }
                        if (TextUtils.equals(this.U.getmPreviousPage(), "search_result") || TextUtils.equals(this.U.getmPreviousPage(), "general_search") || TextUtils.equals(this.U.getmPreviousPage(), "search_for_you_list")) {
                            j jVar = j.f42669b;
                            if (z2) {
                                str3 = "search_follow_cancel";
                            } else {
                                str3 = "search_follow";
                            }
                            if (TextUtils.equals(this.U.getmPreviousPage(), "search_result") || TextUtils.equals(this.U.getmPreviousPage(), "search_for_you_list")) {
                                z3 = true;
                            }
                            jVar.a(str3, str8, "others_homepage", z3);
                        }
                    } else {
                        com.ss.android.ugc.aweme.story.live.b.a(this.U.getmLiveRoomOwnerId(), this.U.getmLiveRoomId(), this.U.getmLiveRequestId(), str8, this.U.getmLiveType(), this.U.getmEnterFrom());
                        com.ss.android.ugc.aweme.story.live.b.a("others_homepage", "live", this.U.getmLiveRoomOwnerId(), this.U.getmLiveRoomId(), Boolean.valueOf(TextUtils.equals(d.a().getCurUserId(), this.U.getmLiveRoomOwnerId())), str8, this.U.getmRequestId());
                        if (com.ss.android.g.a.b()) {
                            s h = new s().b("others_homepage").h(this.U.getmLiveRoomOwnerId());
                            if (!TextUtils.isEmpty(this.U.getmEnterFromRequestId())) {
                                str6 = this.U.getmEnterFromRequestId();
                            } else if (this.f3817c != null) {
                                str6 = this.f3817c.getRequestId();
                            } else {
                                str6 = "";
                            }
                            h.k(str6).g(this.U.getmPreviousPagePosition()).f(this.U.getmPreviousPage()).c("follow_button").l(this.U.getmEnterFromRequestId()).f("live_aud").e();
                        }
                    }
                }
                b(i, i2);
                if (this.aL != null) {
                    Aweme aweme2 = this.U.getmAweme();
                    if (aweme2 == null && this.ah != null && TextUtils.equals(this.ah.getAuthorUid(), ex.h(this.f3817c))) {
                        aweme2 = this.ah;
                    }
                    this.aL.a(new i.a().a(this.U.getmUserId()).b("").a(z4 ? 1 : 0).c("others_homepage").a(aweme2).e("homepage").b(19).c(bp.a(this.U)).a());
                }
            } else {
                r.a((Context) getActivity(), "follow", "personal_homepage", str8, 0);
                J();
                String string = getContext().getString(C0906R.string.afr);
                if (getSourceAweme() != null) {
                    str = getSourceAweme().getAid();
                } else {
                    str = "";
                }
                com.ss.android.ugc.aweme.login.e.a(getActivity(), this.U.getmEventType(), "click_follow", ad.a().a("login_title", string).a("group_id", str).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(str)).f75487b, (com.ss.android.ugc.aweme.base.component.f) new ao(this, i, i2, z4));
            }
        } else {
            Dialog b2 = new a.C0185a(getContext()).a((int) C0906R.string.dn_).b((int) C0906R.string.kj, (DialogInterface.OnClickListener) null).a((int) C0906R.string.dpt, (DialogInterface.OnClickListener) new an(this, view2)).a().b();
            if (b2.findViewById(C0906R.id.dhn) instanceof TextView) {
                ((TextView) b2.findViewById(C0906R.id.dhn)).setTextColor(getResources().getColor(C0906R.color.ho));
            }
            if (b2.findViewById(C0906R.id.da0) != null) {
                b2.findViewById(C0906R.id.da0).setVisibility(8);
            }
        }
    }

    private void a(int i, boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, ai, false, 69565, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), Byte.valueOf(z2)}, this, ai, false, 69565, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.profile.k.a() && i != 0 && !z && !z2) {
            this.bq = true;
            a(true);
        }
    }

    private void a(ProfileTabView profileTabView, String str, String str2) {
        ProfileTabView profileTabView2 = profileTabView;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{profileTabView2, str, str3}, this, ai, false, 69513, new Class[]{ProfileTabView.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{profileTabView2, str, str3}, this, ai, false, 69513, new Class[]{ProfileTabView.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (profileTabView2 != null && getTabCount() < 4) {
            profileTabView2.setText(str3);
        }
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = z2;
        boolean z6 = z3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, ai, false, 69521, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, ai, false, 69521, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.T.isViewValid() && !m() && this.f3817c != null && !TimeLockRuler.isTeenModeON()) {
            if (TextUtils.equals(this.f3817c.getUid(), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
                z4 = false;
            } else {
                z4 = z;
            }
            if (!z4 || !com.ss.android.ugc.aweme.story.a.a() || !this.bi) {
                b(z5, z6);
                return;
            }
            this.bo = true;
            if (this.ay != null) {
                a(false, z6);
                com.ss.android.ugc.aweme.story.live.b.a(getContext(), false, 0, this.f3817c.getRequestId(), this.U.getmUserId(), this.f3817c.roomId);
                if (this.T.getUserVisibleHintCompat() && this.f3817c != null) {
                    com.ss.android.ugc.aweme.story.live.b.a(this.f3817c.getUid(), this.f3817c.roomId, "others_homepage", this.f3817c.getRequestId(), -1, -1, com.ss.android.g.a.b(), "", "others_photo");
                }
                if (AbTestManager.a().g() == 2) {
                    H();
                    this.ay.setVisibility(8);
                } else if (AbTestManager.a().g() == 1) {
                    this.ay.getLayoutParams().width = al;
                    this.ay.getLayoutParams().height = an;
                    if (this.ay.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ay.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, -ar, -aq);
                        if (Build.VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginEnd(-ar);
                        }
                    }
                    this.ay.setImageResource(2130839089);
                    g(false);
                    G();
                    c(z5, z6);
                } else {
                    this.ay.getLayoutParams().width = am;
                    this.ay.getLayoutParams().height = ao;
                    if (this.ay.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.ay.getLayoutParams();
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, 0, -aq);
                        if (Build.VERSION.SDK_INT >= 17) {
                            marginLayoutParams2.setMarginEnd(0);
                        }
                    }
                    g(true);
                    G();
                    c(z5, z6);
                }
            }
        }
    }

    public aa(@NonNull Context context, BaseProfileFragment baseProfileFragment, ay ayVar, WeakHandler weakHandler, aq aqVar) {
        super(context, baseProfileFragment, ayVar);
        this.aP = weakHandler;
        this.aV = false;
        this.bm = aqVar;
    }
}
