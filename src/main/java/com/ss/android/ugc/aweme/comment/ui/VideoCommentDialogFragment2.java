package com.ss.android.ugc.aweme.comment.ui;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.apm.monitor.annotation.AddFragmentTrace;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.downloadlib.c.k;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.comment.CommentInputManager;
import com.ss.android.ugc.aweme.comment.adapter.CommentAdapter;
import com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.d.b;
import com.ss.android.ugc.aweme.comment.e.d;
import com.ss.android.ugc.aweme.comment.e.f;
import com.ss.android.ugc.aweme.comment.e.h;
import com.ss.android.ugc.aweme.comment.e.l;
import com.ss.android.ugc.aweme.comment.e.m;
import com.ss.android.ugc.aweme.comment.e.n;
import com.ss.android.ugc.aweme.comment.e.p;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.ss.android.ugc.aweme.commerce.service.logs.ak;
import com.ss.android.ugc.aweme.commerce.service.logs.al;
import com.ss.android.ugc.aweme.commerce.service.models.x;
import com.ss.android.ugc.aweme.commercialize.c.e;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.link.a.a;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.feed.d.b;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ah;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.listener.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.t;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

@AddFragmentTrace
public class VideoCommentDialogFragment2 extends AbsFragment implements CommentInputManager.b, CommentViewHolder.a, m, n, p, e, LoadMoreRecyclerViewAdapter.a, c<Comment> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2855a;
    public static long w;
    public static boolean x;
    private com.ss.android.ugc.aweme.commercialize.feed.e A = new com.ss.android.ugc.aweme.commercialize.feed.e();
    private f B;
    private l C;
    private e D;
    private boolean E = false;
    private String F;
    private long G;
    private String H;
    private boolean I = false;
    private boolean J;
    private long K;
    private boolean L = true;
    private boolean M = false;
    private WrapLinearLayoutManager N;
    private a O;
    private CommentNestedLayout P;
    private Function1<Boolean, Unit> Q = new Function1<Boolean, Unit>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36526a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Unit invoke(Boolean bool) {
            if (PatchProxy.isSupport(new Object[]{bool}, this, f36526a, false, 27737, new Class[]{Boolean.class}, Unit.class)) {
                return (Unit) PatchProxy.accessDispatch(new Object[]{bool}, this, f36526a, false, 27737, new Class[]{Boolean.class}, Unit.class);
            }
            if (bool.booleanValue()) {
                VideoCommentDialogFragment2.this.m();
            } else {
                VideoCommentDialogFragment2.this.n();
            }
            return null;
        }
    };
    private com.ss.android.ugc.aweme.comment.g.c R;
    private int S = 0;
    private int T = -1;
    private boolean U;

    /* renamed from: b  reason: collision with root package name */
    b f2856b = new b("");

    /* renamed from: c  reason: collision with root package name */
    TextView f2857c;
    @BindView(2131493663)
    View commerceArea;
    @BindView(2131493667)
    View commerceBottomDivider;
    @BindView(2131493668)
    View commerceBottomDivider2;
    @BindView(2131493671)
    View commerceClose;
    @BindView(2131493689)
    View commerceDivider;
    @BindView(2131493694)
    RemoteRoundImageView commerceLogo;
    @BindView(2131493695)
    ImageView commerceLogoRight;
    @BindView(2131493709)
    TextView commercePrice;
    @BindView(2131493710)
    TextView commerceSales;
    @BindView(2131493712)
    TextView commerceTitle;

    /* renamed from: d  reason: collision with root package name */
    View f2858d;

    /* renamed from: e  reason: collision with root package name */
    DmtStatusView f2859e;

    /* renamed from: f  reason: collision with root package name */
    RecyclerView f2860f;
    MentionEditText g;
    ImageView h;
    ImageView i;
    @BindView(2131495096)
    ImageView ivMicroAppLink;
    View j;
    View k;
    RelativeLayout l;
    @BindView(2131493015)
    TextView linkAdTag;
    @BindView(2131493018)
    View linkAdTagDiv;
    @BindView(2131495384)
    View linkClose;
    @BindView(2131495385)
    TextView linkDesc;
    @BindView(2131495386)
    RemoteImageView linkIcon;
    @BindView(2131495394)
    ViewGroup linkTag;
    @BindView(2131495395)
    TextView linkTitle;
    protected h m;
    @BindView(2131493617)
    TextView mCommentAdBtn;
    @BindView(2131493620)
    TextView mCommentAdDesTv;
    @BindView(2131493623)
    View mCommentAdLayout;
    @BindView(2131493622)
    TextView mCommentAdSourceTv;
    @BindView(2131493624)
    AvatarWithBorderView mCommentAdUserAvatar;
    @BindView(2131493639)
    LinearLayout mCommentLayout;
    d n;
    Comment o;
    public g p;
    @BindView(2131493802)
    TextView poiCouponText;
    public aa<ar> q;
    public Aweme r;
    public CommentInputManager s;
    boolean t;
    public com.ss.android.download.api.b.b u;
    Comment v;
    int y;
    com.ss.android.ugc.aweme.commercialize.c.b z = new com.ss.android.ugc.aweme.commercialize.c.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36540a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f36540a, false, 27752, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36540a, false, 27752, new Class[0], Void.TYPE);
                return;
            }
            if (VideoCommentDialogFragment2.this.r != null && VideoCommentDialogFragment2.this.r.isAppAd()) {
                if (VideoCommentDialogFragment2.this.u == null) {
                    VideoCommentDialogFragment2.this.u = com.ss.android.ugc.aweme.app.c.d.f.a().a(new b.a().a("comment_end_ad").b("comment_end_ad").c("comment_end_ad").d("feed_download_ad").e("feed_download_ad").f("feed_download_ad").g("feed_download_ad").c(false).a((Object) VideoCommentDialogFragment2.this.r.getAwemeRawAd()), "comment_end_ad");
                }
                com.ss.android.ugc.aweme.app.c.a.c.a().a(com.ss.android.ugc.aweme.commercialize.utils.c.a(VideoCommentDialogFragment2.this.r), 2, VideoCommentDialogFragment2.this.u, (com.ss.android.download.api.b.a) com.ss.android.ugc.aweme.app.c.d.b.a(VideoCommentDialogFragment2.this.r.getAwemeRawAd()));
            }
        }
    };

    class a implements com.ss.android.download.api.b.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36542a;

        public final void a(@NonNull com.ss.android.download.api.b.c cVar, @Nullable com.ss.android.download.api.b.a aVar) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f36542a, false, 27753, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36542a, false, 27753, new Class[0], Void.TYPE);
                return;
            }
            if (VideoCommentDialogFragment2.this.mCommentAdBtn != null) {
                VideoCommentDialogFragment2.this.mCommentAdBtn.setText(C0906R.string.b0z);
            }
        }

        private a() {
        }

        public final void a(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f36542a, false, 27756, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f36542a, false, 27756, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            if (VideoCommentDialogFragment2.this.mCommentAdBtn != null) {
                VideoCommentDialogFragment2.this.mCommentAdBtn.setText(C0906R.string.bvd);
            }
        }

        public final void b(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f36542a, false, 27757, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f36542a, false, 27757, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            if (VideoCommentDialogFragment2.this.mCommentAdBtn != null) {
                VideoCommentDialogFragment2.this.mCommentAdBtn.setText(C0906R.string.b11);
            }
        }

        public final void c(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f36542a, false, 27758, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f36542a, false, 27758, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            if (VideoCommentDialogFragment2.this.mCommentAdBtn != null) {
                VideoCommentDialogFragment2.this.mCommentAdBtn.setText(C0906R.string.tr);
            }
        }

        /* synthetic */ a(VideoCommentDialogFragment2 videoCommentDialogFragment2, byte b2) {
            this();
        }

        public final void a(com.ss.android.download.api.c.e eVar, int i) {
            if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f36542a, false, 27754, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f36542a, false, 27754, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (VideoCommentDialogFragment2.this.mCommentAdBtn != null) {
                VideoCommentDialogFragment2.this.mCommentAdBtn.setText(C0906R.string.ew);
            }
        }

        public final void b(com.ss.android.download.api.c.e eVar, int i) {
            if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f36542a, false, 27755, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f36542a, false, 27755, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (VideoCommentDialogFragment2.this.mCommentAdBtn != null) {
                VideoCommentDialogFragment2.this.mCommentAdBtn.setText(C0906R.string.blp);
            }
        }
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f2855a, false, 27723, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.comment.e.a(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27723, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public Aweme getCommentInputAweme() {
        return this.r;
    }

    public Comment getCommentInputReplyComment() {
        return this.o;
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27583, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27583, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.link.f.a("shopping_cart", this.r, true)) {
            O();
            if (z2) {
                this.commerceDivider.setVisibility(0);
                this.commerceLogoRight.setVisibility(0);
                this.commerceLogoRight.setImageURI(new Uri.Builder().scheme("res").path("2130839468").build());
                this.commerceLogoRight.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f36528a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f36528a, false, 27738, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f36528a, false, 27738, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                            VideoCommentDialogFragment2.this.i();
                        }
                    }
                });
            } else {
                this.commerceArea.setVisibility(0);
                x promotion = this.r.getPromotion();
                this.commerceTitle.setText(promotion.getShortTitle());
                this.commerceLogo.setImageURI(new Uri.Builder().scheme("res").path("2130839468").build());
                this.commercePrice.setText(com.ss.android.ugc.aweme.commerce.service.l.d.a(String.format(Locale.getDefault(), getString(C0906R.string.bc6), new Object[]{Float.valueOf(((float) promotion.getPrice()) / 100.0f)})));
                this.commerceSales.setText(String.format(Locale.getDefault(), getString(C0906R.string.bci), new Object[]{com.ss.android.ugc.aweme.commerce.service.l.m.a((long) promotion.getSales())}));
                this.f2858d.setVisibility(8);
                this.commerceClose.setOnClickListener(new t(this));
                this.commerceArea.setOnClickListener(new u(this));
                this.commerceDivider.setVisibility(8);
                this.commerceLogoRight.setVisibility(8);
            }
            x promotion2 = this.r.getPromotion();
            new ak().e(this.r.getAuthorUid()).a("comment_cart_tag").b(promotion2.getPromotionId()).a(Integer.valueOf(promotion2.getPromotionSource())).d(o()).c(this.r.getAid()).b();
            new al().f(this.r.getAuthorUid()).b("comment_cart_tag").c(promotion2.getPromotionId()).a(Integer.valueOf(promotion2.getPromotionSource())).g(o()).d(this.r.getAid()).e("click_comment").h(null).a(o()).b();
        } else {
            this.commerceDivider.setVisibility(8);
            this.commerceLogoRight.setVisibility(8);
        }
    }

    private boolean a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{aweme2}, this, f2855a, false, 27587, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.commercialize.link.f.a("company_link", aweme2, true) || com.ss.android.ugc.aweme.commercialize.link.f.a("link", aweme2, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f2855a, false, 27587, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2855a, false, 27609, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2855a, false, 27609, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.D.b(exc);
        if (this.s != null) {
            this.s.b();
        }
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && CollectionUtils.isEmpty(this.R.f36459c)) {
            b(0);
        }
    }

    public final void a(List<Comment> list, boolean z2) {
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27611, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f2855a, false, 27611, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.r == null || !this.r.getAwemeControl().canShowComment()) {
            list.clear();
            y_();
        }
        if (this.s != null) {
            this.s.b();
        }
        if (w > 0) {
            i.a((Callable<TResult>) new aa<TResult>(this, w));
            w = 0;
        }
        if (this.E && !CollectionUtils.isEmpty(list)) {
            com.ss.android.ugc.aweme.commercialize.model.c adCommentStruct = this.f2856b.getAdCommentStruct();
            if (adCommentStruct != null) {
                if (!(list.get(0) instanceof com.ss.android.ugc.aweme.commercialize.model.c)) {
                    list.add(0, adCommentStruct);
                }
                this.mCommentAdSourceTv.setText(adCommentStruct.getSource());
                this.mCommentAdDesTv.setText(adCommentStruct.getTitle());
                Aweme a2 = j.a().a(adCommentStruct.getAid());
                if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27612, new Class[0], Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27612, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (this.r != null && this.r.isAd() && !TextUtils.isEmpty(this.r.getAwemeRawAd().getLearnMoreBgColor())) {
                    z3 = true;
                }
                if (z3) {
                    if (!com.ss.android.g.a.a()) {
                        this.mCommentAdBtn.setTextColor(Color.parseColor(a2.getAwemeRawAd().getLearnMoreBgColor()));
                    } else {
                        ((GradientDrawable) this.mCommentAdBtn.getBackground()).setColor(Color.parseColor(a2.getAwemeRawAd().getLearnMoreBgColor()));
                    }
                }
                if (a2 == null || com.ss.android.g.a.a() || !a2.isAd() || !a2.getAwemeRawAd().isAppAd()) {
                    this.mCommentAdBtn.setText(adCommentStruct.getButtonText());
                }
                com.ss.android.ugc.aweme.base.c.b(this.mCommentAdUserAvatar, adCommentStruct.getAvatarIcon());
            }
        }
        int f2 = f(true);
        if (this.y == 0) {
            a(f2);
        }
        if (this.s != null) {
            this.s.i = ((CommentItemList) ((com.ss.android.ugc.aweme.comment.e.g) this.m.i()).getData()).replyStyle;
        }
        this.D.a(list, z2);
        b(f2);
        L();
    }

    public final void b(List<Comment> list, boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27620, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f2855a, false, 27620, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.J = false;
        this.D.b(list, z2);
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27621, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27621, new Class[0], Integer.TYPE)).intValue();
        } else {
            i2 = f(false);
        }
        b(i2);
    }

    public final void c(List<Comment> list, boolean z2) {
        List<Comment> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27626, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z2)}, this, f2855a, false, 27626, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.D.c(list2, z2);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2855a, false, 27631, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2855a, false, 27631, new Class[]{String.class}, Void.TYPE);
            return;
        }
        c(-d(str));
        this.D.b(str);
        bg.a(new com.ss.android.ugc.aweme.comment.b.a(4, new Object[]{this.r.getAid(), str}));
        com.ss.android.ugc.aweme.setting.commentfilter.b.a.f63900a.a(getActivity(), this.r, this.v);
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f2855a, false, 27638, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f2855a, false, 27638, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            FragmentActivity activity = getActivity();
            a2.a((Activity) activity, com.ss.android.ugc.aweme.ag.j.a("aweme://user/profile/" + str3).a("enter_from", getEventType()).a("sec_user_id", str4).a());
            String eventType = getEventType();
            String l2 = l();
            String E2 = E();
            String requestId = this.f2856b.getRequestId();
            Aweme aweme = this.r;
            if (PatchProxy.isSupport(new Object[]{eventType, l2, E2, str3, requestId, aweme}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27392, new Class[]{String.class, String.class, String.class, String.class, String.class, Aweme.class}, Void.TYPE)) {
                Object[] objArr = {eventType, l2, E2, str3, requestId, aweme};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27392, new Class[]{String.class, String.class, String.class, String.class, String.class, Aweme.class}, Void.TYPE);
            } else {
                r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str3).setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("group_id", l2).a("request_id", requestId).a("enter_from", eventType).a("enter_method", "click_comment_head").a("enter_type", "normal_way").b()));
                r.a("enter_personal_detail_backup", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").a("to_user_id", str3).a("group_id", l2).a("request_id", requestId).a("enter_method", "click_comment_head").a("enter_type", "normal_way").f34114b);
                if (aweme != null) {
                    r.onEvent(MobClick.obtain().setEventName("head").setLabelName(eventType).setValue(aweme.getAuthorUid()).setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("request_id", aweme.getRequestId()).a("group_id", aweme.getAid()).b()));
                }
                ((q) new q().b(eventType).a("click_comment_head")).f(aweme).k(str3).e();
                z.a(z.c.PROFILE);
            }
            bg.a(new ar(36));
        }
    }

    public final void a(Comment comment, int i2) {
        if (PatchProxy.isSupport(new Object[]{comment, Integer.valueOf(i2)}, this, f2855a, false, 27639, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, Integer.valueOf(i2)}, this, f2855a, false, 27639, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a((Fragment) this, getEventType(), "like_comment");
        } else if (comment != null) {
            String str = comment.getUserDigged() == 0 ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_UPLOAD_LOG;
            String uid = comment.getUser() != null ? comment.getUser().getUid() : "";
            if (this.B != null && this.B.l()) {
                this.B.a(comment.getCid(), comment.getAwemeId(), str, D());
            }
            if (TextUtils.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, str)) {
                this.F = comment.getCid();
                String eventType = getEventType();
                String valueOf = String.valueOf(comment.getLabelType());
                String str2 = this.F;
                String l2 = l();
                if (PatchProxy.isSupport(new Object[]{eventType, valueOf, str2, l2, uid}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27387, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eventType, valueOf, str2, l2, uid}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27387, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
                } else {
                    String str3 = "common";
                    if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(valueOf)) {
                        str3 = "author";
                    } else if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(valueOf)) {
                        str3 = "following";
                    }
                    r.onEvent(MobClick.obtain().setEventName("like_comment").setLabelName(eventType).setValue(l2).setExtValueString(uid).setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("attribute", str3).a("reply_uid", uid).a("reply_comment_id", str2).b()));
                }
            } else {
                this.F = "";
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.comment.widget.a aVar, Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{aVar, comment2}, this, f2855a, false, 27640, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, comment2}, this, f2855a, false, 27640, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
        } else if (comment2 != null && j()) {
            String o2 = o();
            String l2 = l();
            String cid = comment.getCid();
            if (PatchProxy.isSupport(new Object[]{o2, l2, cid}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27382, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{o2, l2, cid}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27382, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            } else {
                r.a("tap_comment", (Map) com.ss.android.ugc.aweme.comment.f.a.a(o2, l2).a("comment_id", cid).f34114b);
            }
            if (!com.ss.android.ugc.aweme.comment.f.f36433c.a(comment2)) {
                if (!AbTestManager.a().Z()) {
                    c(aVar, comment);
                } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    com.ss.android.ugc.aweme.login.e.a((Fragment) this, getEventType(), "reply_comment", ad.a().a("login_title", GlobalContext.getContext().getString(C0906R.string.uz)).a("group_id", this.H).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(this.H)).f75487b);
                } else if (TimeLockRuler.isTeenModeON()) {
                    com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.ci0).a();
                } else {
                    d(comment2);
                }
            }
        }
    }

    public final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f2855a, false, 27644, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f2855a, false, 27644, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        UserProfileActivity.a(getContext(), str3, str4, "like_banner");
    }

    public final void a(CommentReplyButtonStruct commentReplyButtonStruct, int i2) {
        if (PatchProxy.isSupport(new Object[]{commentReplyButtonStruct, Integer.valueOf(i2)}, this, f2855a, false, 27645, new Class[]{CommentReplyButtonStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commentReplyButtonStruct, Integer.valueOf(i2)}, this, f2855a, false, 27645, new Class[]{CommentReplyButtonStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.C == null) {
            this.C = new l();
            this.C.a(l());
            this.C.a(this.R);
            this.C.f36430b = this;
        }
        this.C.a(commentReplyButtonStruct, (CommentReplyButtonViewHolder) this.f2860f.findViewHolderForAdapterPosition(i2));
    }

    private boolean a(PoiStruct poiStruct) {
        PoiStruct poiStruct2 = poiStruct;
        if (!PatchProxy.isSupport(new Object[]{poiStruct2}, this, f2855a, false, 27678, new Class[]{PoiStruct.class}, Boolean.TYPE)) {
            return poiStruct2 == null || poiStruct2.address == null || TextUtils.isEmpty(poiStruct2.address.getCity());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiStruct2}, this, f2855a, false, 27678, new Class[]{PoiStruct.class}, Boolean.TYPE)).booleanValue();
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27684, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27684, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.K = System.currentTimeMillis();
        com.ss.android.ugc.aweme.comment.f.a.a(o(), this.r, com.ss.android.ugc.aweme.comment.f.a.a(this.o), "list");
        if (this.o != null) {
            this.D.a(true, this.o);
        }
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27685, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27685, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.o = null;
            this.t = false;
        }
        I();
        this.D.a(false, (Comment) null);
    }

    public final void a(int i2, int i3, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f2855a, false, 27689, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f2855a, false, 27689, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Comment comment = this.o;
        if (PatchProxy.isSupport(new Object[]{comment, Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f2855a, false, 27687, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f2855a, false, 27687, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(comment, i2, i3, str, false);
    }

    public final void a(Comment comment) {
        String str;
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f2855a, false, 27690, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f2855a, false, 27690, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (this.r != null && this.r.isAd()) {
            if (TextUtils.equals(getEventType(), "general_search")) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.r).a("result_ad").b("comment").a(getContext());
            } else {
                Context context = getContext();
                Aweme aweme = this.r;
                if (PatchProxy.isSupport(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31582, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31582, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.commercialize.log.g.b(context, "comment", aweme, com.ss.android.ugc.aweme.commercialize.log.g.f(context, aweme, "raw ad comment"));
                }
            }
        }
        Comment comment3 = null;
        if (!(comment2 == null || comment.getReplyComments() == null)) {
            if (PatchProxy.isSupport(new Object[]{comment2}, this, f2855a, false, 27698, new Class[]{Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{comment2}, this, f2855a, false, 27698, new Class[]{Comment.class}, Void.TYPE);
            } else {
                List<TextExtraStruct> textExtra = comment.getTextExtra();
                if (!(textExtra == null || this.s == null)) {
                    for (TextExtraStruct next : textExtra) {
                        Iterator<User> it2 = this.s.f36251d.iterator();
                        while (it2.hasNext()) {
                            User next2 = it2.next();
                            if (TextUtils.equals(next2.getUid(), next.getUserId())) {
                                if (next2.getAtType() == 3) {
                                    str = "follow";
                                } else if (next2.getAtType() == 1) {
                                    str = "search";
                                } else {
                                    str = next2.getAtType() == 4 ? "recent" : null;
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    com.ss.android.ugc.aweme.comment.f.a.a(str, l(), next2.getUid());
                                }
                            }
                        }
                    }
                }
            }
        }
        int[] Q2 = Q();
        e eVar = this.D;
        int i2 = Q2[0];
        int i3 = Q2[1];
        if (PatchProxy.isSupport(new Object[]{comment2, Integer.valueOf(i2), Integer.valueOf(i3)}, eVar, e.f36576a, false, 27508, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2, Integer.valueOf(i2), Integer.valueOf(i3)}, eVar, e.f36576a, false, 27508, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            eVar.a(comment2, i2, i3, false);
        }
        if (this.r != null) {
            com.ss.android.ugc.aweme.feed.d.b a2 = com.ss.android.ugc.aweme.feed.d.b.a();
            String aid = this.r.getAid();
            if (PatchProxy.isSupport(new Object[]{aid}, a2, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41091, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aid}, a2, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41091, new Class[]{String.class}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.feed.d.b.c()) {
                b.c cVar = (b.c) a2.h.a(aid);
                if (cVar != null) {
                    a2.f45239d++;
                    cVar.f45251c = 1;
                }
            }
        }
        c(1);
        Object[] objArr = new Object[2];
        objArr[0] = this.r.getAid();
        if (comment2 != null) {
            comment3 = comment.clone();
        }
        objArr[1] = comment3;
        bg.a(new com.ss.android.ugc.aweme.comment.b.a(3, objArr));
    }

    public final void a(Exception exc, int i2, Comment comment) {
        boolean z2;
        Exception exc2 = exc;
        int i3 = i2;
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{exc2, Integer.valueOf(i2), comment2}, this, f2855a, false, 27692, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, Integer.valueOf(i2), comment2}, this, f2855a, false, 27692, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE);
            return;
        }
        if (i3 == 3) {
            com.ss.android.ugc.aweme.forward.e.a.a(o(), getCommentInputAweme(), "list", this.t ? "click_reply_comment" : "click_comment", false);
        }
        int[] Q2 = Q();
        e eVar = this.D;
        int i4 = Q2[0];
        int i5 = Q2[1];
        byte b2 = i3 == 3 ? (byte) 1 : 0;
        if (PatchProxy.isSupport(new Object[]{exc2, comment2, Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(b2)}, eVar, e.f36576a, false, 27507, new Class[]{Exception.class, Comment.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{exc2, comment2, Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(b2)}, eVar, e.f36576a, false, 27507, new Class[]{Exception.class, Comment.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            if (!com.ss.android.ugc.aweme.comment.f.f36433c.a(comment2)) {
                eVar.b(comment2);
            }
            com.ss.android.ugc.aweme.comment.f.f36433c.c(comment2);
            z2 = com.ss.android.ugc.aweme.comment.api.a.a(eVar.f36578c.getContext(), exc2, b2 != 0 ? C0906R.string.ahn : C0906R.string.w7, eVar.a(comment2, i4, i5));
            if (z2) {
                com.ss.android.ugc.aweme.comment.f.f36433c.g(comment2);
            } else {
                eVar.a(comment2);
            }
        }
        if (z2) {
            String fakeId = comment.getFakeId();
            c(-e(fakeId));
            this.D.a(fakeId);
            bg.a(new com.ss.android.ugc.aweme.comment.b.a(4, new Object[]{this.r.getAid()}));
        }
    }

    public final void a(String str, int i2) {
        String authorUid;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f2855a, false, 27696, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f2855a, false, 27696, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        String o2 = o();
        String aid = this.r == null ? "" : this.r.getAid();
        if (this.r == null) {
            authorUid = "";
        } else {
            authorUid = this.r.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str, i2, o2, aid, authorUid);
    }

    public final void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f2855a, false, 27697, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2855a, false, 27697, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String o2 = o();
        String aid = this.r == null ? "" : this.r.getAid();
        if (this.r == null) {
            str2 = "";
        } else {
            str2 = this.r.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str, o2, aid, str2);
    }

    public final void a(String str, List<Comment> list) {
        String str2 = str;
        List<Comment> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, this, f2855a, false, 27699, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2}, this, f2855a, false, 27699, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        String a2 = this.D.a(str2, list2);
        if (!TextUtils.isEmpty(a2)) {
            com.ss.android.ugc.aweme.comment.f.a.c(o(), l(), a2);
        }
    }

    public final void b(String str, List<Comment> list) {
        String str2;
        String str3 = str;
        List<Comment> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str3, list2}, this, f2855a, false, 27700, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, list2}, this, f2855a, false, 27700, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        e eVar = this.D;
        if (PatchProxy.isSupport(new Object[]{str3, list2}, eVar, e.f36576a, false, 27515, new Class[]{String.class, List.class}, String.class)) {
            e eVar2 = eVar;
            str2 = (String) PatchProxy.accessDispatch(new Object[]{str3, list2}, eVar2, e.f36576a, false, 27515, new Class[]{String.class, List.class}, String.class);
        } else if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list)) {
            str2 = "";
        } else {
            CommentAdapter commentAdapter = (CommentAdapter) eVar.f36578c.getAdapter();
            int a2 = commentAdapter.a(str3, 11);
            String str4 = "";
            if (a2 - list.size() >= 0) {
                Comment comment = (Comment) commentAdapter.getData().get(a2);
                if (comment instanceof CommentReplyButtonStruct) {
                    str4 = ((CommentReplyButtonStruct) comment).getCommentId();
                }
                eVar.f36579d.b(list2);
                int size = a2 - list.size();
                commentAdapter.notifyItemRangeRemoved(size, list.size());
                commentAdapter.notifyItemRangeChanged(size, commentAdapter.getItemCount() - size);
            }
            str2 = str4;
        }
        if (!TextUtils.isEmpty(str2)) {
            com.ss.android.ugc.aweme.comment.f.a.b(o(), l(), str2);
        }
    }

    public int getCommentInputViewType() {
        if (this.t) {
            return 4;
        }
        if (this.o != null) {
            return 3;
        }
        return 2;
    }

    private String E() {
        if (!PatchProxy.isSupport(new Object[0], this, f2855a, false, 27657, new Class[0], String.class)) {
            return this.f2856b.getAuthorUid();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27657, new Class[0], String.class);
    }

    private boolean F() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27659, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27659, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f2856b.isEnableComment() && !com.ss.android.ugc.aweme.commercialize.utils.c.L(this.r)) {
            z2 = true;
        }
        return z2;
    }

    private boolean G() {
        if (!PatchProxy.isSupport(new Object[0], this, f2855a, false, 27660, new Class[0], Boolean.TYPE)) {
            return this.f2856b.isCommentClose();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27660, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private void H() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27662, new Class[0], Void.TYPE);
            return;
        }
        this.o = null;
        this.t = false;
        if (this.s != null) {
            this.s.i();
        }
    }

    private void J() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27667, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), this.r, this.A, 5, this.z)) {
            q();
        }
    }

    private void N() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27676, new Class[0], Void.TYPE);
            return;
        }
        this.commercePrice.setVisibility(8);
        this.commerceBottomDivider.setVisibility(8);
    }

    private void O() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27677, new Class[0], Void.TYPE);
            return;
        }
        this.commercePrice.setVisibility(0);
        this.commerceBottomDivider.setVisibility(0);
        this.commerceSales.setVisibility(0);
    }

    private com.ss.android.download.api.b.d P() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27681, new Class[0], com.ss.android.download.api.b.d.class)) {
            return (com.ss.android.download.api.b.d) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27681, new Class[0], com.ss.android.download.api.b.d.class);
        }
        if (this.O == null) {
            this.O = new a(this, (byte) 0);
        }
        return this.O;
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27585, new Class[0], Void.TYPE);
            return;
        }
        w wVar = new w(this);
        this.linkClose.setOnClickListener(wVar);
        this.linkTag.setOnClickListener(wVar);
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27586, new Class[0], Void.TYPE);
        } else if (a(this.r)) {
            y();
        } else {
            this.linkTag.setVisibility(8);
        }
    }

    private void z() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27597, new Class[0], Void.TYPE);
            return;
        }
        this.y = 0;
        A();
        C();
        H();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27643, new Class[0], Void.TYPE);
            return;
        }
        q();
    }

    public final boolean g() {
        if (!PatchProxy.isSupport(new Object[0], this, f2855a, false, 27683, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.account.d.a().isLogin();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27683, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public String getEventType() {
        if (!PatchProxy.isSupport(new Object[0], this, f2855a, false, 27658, new Class[0], String.class)) {
            return this.f2856b.getEventType();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27658, new Class[0], String.class);
    }

    public final boolean j() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27595, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27595, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isVisible() && this.P != null && this.P.a()) {
            z2 = true;
        }
        return z2;
    }

    public final String l() {
        if (!PatchProxy.isSupport(new Object[0], this, f2855a, false, 27637, new Class[0], String.class)) {
            return this.f2856b.getAid();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27637, new Class[0], String.class);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27633, new Class[0], Void.TYPE);
            return;
        }
        k();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27592, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        bg.d(this);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27607, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.s != null) {
            this.s.j();
        }
        S();
        this.P.setVisibleChangedListener(null);
        bg.d(this);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27606, new Class[0], Void.TYPE);
            return;
        }
        if (j()) {
            g(false);
        }
        super.onStop();
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27665, new Class[0], Void.TYPE);
        } else if (!this.I) {
            a(this.mCommentAdLayout, 0, 360, true);
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27710, new Class[0], Void.TYPE);
            return;
        }
        if (this.P != null) {
            this.P.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27598, new Class[0], Void.TYPE);
            return;
        }
        this.y = 0;
        A();
        C();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27618, new Class[0], Void.TYPE);
            return;
        }
        this.D.s_();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27610, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27610, new Class[0], Void.TYPE);
            return;
        }
        if (this.y == 0) {
            a(this.y);
        }
        if (this.s != null) {
            this.s.b();
        }
        this.D.y_();
    }

    public final void z_() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27624, new Class[0], Void.TYPE);
            return;
        }
        this.D.z_();
    }

    private void A() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27599, new Class[0], Void.TYPE);
            return;
        }
        if (F() && !G()) {
            this.m.a(1, l(), 2, "", this.f2856b.getInsertCids(), B());
        }
    }

    private Long B() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27600, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27600, new Class[0], Long.class);
        }
        Aweme aweme = this.r;
        if (aweme == null && this.f2856b != null) {
            aweme = j.a().a(this.f2856b.getAid());
        }
        if (aweme == null || aweme.getAwemeRawAd() == null || com.ss.android.ugc.aweme.commercialize.utils.c.u(aweme)) {
            return null;
        }
        return aweme.getAwemeRawAd().getCreativeId();
    }

    private String D() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27632, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27632, new Class[0], String.class);
        }
        String eventType = getEventType();
        if (TextUtils.equals("opus", getEventType()) || TextUtils.equals("collection", getEventType())) {
            if (this.f2856b.isMyProfile()) {
                eventType = "personal_homepage";
            } else {
                eventType = "others_homepage";
            }
        }
        return eventType;
    }

    private void I() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27663, new Class[0], Void.TYPE);
        } else if (this.K > 0) {
            this.K = 0;
            com.ss.android.ugc.aweme.comment.f.a.a(o(), this.r, System.currentTimeMillis() - this.K, "list");
        }
    }

    private void K() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27669, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a() && this.r != null && this.r.isAppAd()) {
            Activity c2 = k.c(getContext());
            if (c2 != null) {
                com.ss.android.ugc.aweme.app.c.a.c.a().a(c2, P(), (com.ss.android.download.api.b.c) com.ss.android.ugc.aweme.app.c.d.d.a(getContext(), this.r));
            }
        }
    }

    private int[] Q() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27693, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27693, new Class[0], int[].class);
        }
        int i3 = -1;
        if (j()) {
            RecyclerView.LayoutManager layoutManager = this.f2860f.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i3 = linearLayoutManager.findFirstVisibleItemPosition();
                i2 = linearLayoutManager.findLastVisibleItemPosition();
                return new int[]{i3, i2};
            }
        }
        i2 = -1;
        return new int[]{i3, i2};
    }

    private void R() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27706, new Class[0], Void.TYPE);
            return;
        }
        this.n = new d();
        this.n.a(new com.ss.android.ugc.aweme.comment.e.c());
        this.n.a(this);
        this.m = new h();
        this.m.a(new com.ss.android.ugc.aweme.comment.e.g());
        this.R.a(this.f2856b.getInsertCids());
        ((com.ss.android.ugc.aweme.comment.e.g) this.m.i()).f36414f = this.R;
        this.m.a(this);
        this.B = new f();
        this.B.a(this);
        this.B.a(new com.ss.android.ugc.aweme.comment.e.e());
    }

    private void S() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27707, new Class[0], Void.TYPE);
            return;
        }
        this.n.k();
        this.n.j();
        this.m.k();
        this.m.j();
        this.B.k();
        this.B.j();
        if (this.C != null) {
            this.C.k();
            this.C.j();
            this.C = null;
        }
        this.J = false;
        this.t = false;
    }

    private void u() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27582, new Class[0], Void.TYPE);
        } else if (this.r != null) {
            this.f2858d.setVisibility(0);
            this.commerceArea.setVisibility(8);
            this.commerceBottomDivider2.setVisibility(8);
            this.poiCouponText.setVisibility(8);
            x();
            t();
            if (!"poi_page".equalsIgnoreCase(getEventType()) && M()) {
                z2 = true;
            }
            a(z2);
            v();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27589, new Class[0], Void.TYPE);
            return;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        if (this.r != null) {
            Context context = getContext();
            if (context != null) {
                User author = this.r.getAuthor();
                if (author != null && this.r.hasPromotion()) {
                    com.ss.android.ugc.aweme.commerce.a.a.a(this.r);
                    com.ss.android.ugc.aweme.commerce.promotion.a.f37668b.a(this.r.getAid(), this.r.getAuthorUid(), new x(this, context, author, valueOf), y.f36633b);
                    if (com.ss.android.ugc.aweme.commercialize.utils.c.u(this.r)) {
                        com.ss.android.ugc.aweme.commercialize.log.g.b(com.ss.android.ugc.aweme.app.i.a().getContext(), this.r, "comment_ad");
                    }
                }
            }
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27634, new Class[0], Void.TYPE);
            return;
        }
        if (!this.J) {
            this.J = true;
            if (this.m != null) {
                this.m.a(4, l(), 2, "", "", B());
            }
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27654, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27654, new Class[0], Void.TYPE);
            return;
        }
        if (!this.U) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                bg.a(new com.ss.android.ugc.aweme.feed.f.f(1).a(activity.hashCode()));
                a.c.f33272d = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                if (this.S > 0 && this.y > 0) {
                    a(this.y);
                }
                this.U = true;
            } else {
                return;
            }
        }
        this.S++;
        g(true);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27655, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27655, new Class[0], Void.TYPE);
            return;
        }
        this.U = false;
        a.c.f33272d = PushConstants.PUSH_TYPE_NOTIFY;
        if (this.E && this.f2860f != null) {
            com.ss.android.ugc.aweme.commercialize.model.c adCommentStruct = this.f2856b.getAdCommentStruct();
            if (adCommentStruct != null) {
                List data = ((CommentAdapter) this.f2860f.getAdapter()).getData();
                if (!CollectionUtils.isEmpty(data) && !(data.get(0) instanceof com.ss.android.ugc.aweme.commercialize.model.c)) {
                    data.add(0, adCommentStruct);
                }
            }
        }
        g(false);
        this.f2860f.postDelayed(new q(this), 120);
        bg.a(new com.ss.android.ugc.aweme.feed.f.a(3));
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27608, new Class[0], Void.TYPE);
            return;
        }
        this.D.n_();
        if (this.s != null) {
            this.s.c();
        }
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27614, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27614, new Class[0], Void.TYPE);
            return;
        }
        if (this.mCommentAdLayout != null) {
            a(this.mCommentAdLayout, GlobalContext.getContext().getResources().getDimensionPixelOffset(C0906R.dimen.bi), 0, false);
        }
    }

    public final String o() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27664, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27664, new Class[0], String.class);
        }
        switch (this.f2856b.getPageType()) {
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE /*1000*/:
                return "personal_homepage";
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST /*1001*/:
                return "personal_collection";
            case 2000:
                return "others_homepage";
            case 2001:
                return "others_collection";
            default:
                return getEventType();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27605, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27670, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null && this.r.isAppAd()) {
            com.ss.android.ugc.aweme.app.c.a.c.a().a(this.r.getAwemeRawAd().getDownloadUrl());
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27604, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.M) {
            this.M = false;
        } else if (this.L) {
            m();
            this.L = false;
        } else if (j()) {
            g(true);
        }
        K();
    }

    private void C() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27601, new Class[0], Void.TYPE);
            return;
        }
        if (!F()) {
            this.j.setVisibility(0);
            this.k.setVisibility(8);
            this.g.setVisibility(8);
            this.f2859e.setVisibility(8);
            this.l.setVisibility(8);
        } else if (G()) {
            this.k.setVisibility(0);
            this.j.setVisibility(8);
            this.g.setVisibility(8);
            this.f2859e.setVisibility(8);
            this.l.setVisibility(8);
        } else {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.g.setVisibility(0);
            this.f2859e.setVisibility(0);
            this.l.setVisibility(0);
        }
        if (this.s != null) {
            this.s.a();
        }
        this.f2858d.setVisibility(0);
    }

    private void L() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27673, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.f2856b.getInsertCids()) && this.f2856b.showReplyWithInsertCid()) {
            List data = ((CommentAdapter) this.f2860f.getAdapter()).getData();
            String str = this.f2856b.getInsertCids().split(",")[0];
            for (int i2 = 0; i2 < data.size(); i2++) {
                Comment comment = (Comment) data.get(i2);
                if (TextUtils.equals(comment.getCid(), str)) {
                    if (comment.getStatus() != 0) {
                        if (this.f2856b.isForceOpenReply()) {
                            d(comment);
                            return;
                        } else if (com.ss.android.g.a.b() || data.size() >= 3) {
                            this.o = comment;
                            this.g.setHint(getString(C0906R.string.bz8, ae.a(comment.getUser())));
                        } else {
                            d(comment);
                            return;
                        }
                    }
                    return;
                }
            }
            com.bytedance.ies.dmt.ui.d.a.c(GlobalContext.getContext(), (int) C0906R.string.v5).a();
        }
    }

    private void s() {
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27580, new Class[0], Void.TYPE);
            return;
        }
        CommentAdapter commentAdapter = new CommentAdapter(this, this.f2856b);
        commentAdapter.a(this.r);
        commentAdapter.f36283c = this;
        commentAdapter.f36282b = D();
        commentAdapter.setLoadMoreListener(this);
        commentAdapter.f36285e = this.f2856b.getRequestId();
        commentAdapter.mTextColor = ContextCompat.getColor(GlobalContext.getContext(), C0906R.color.i3);
        commentAdapter.f36286f = this.R;
        if (!(this.r == null || this.r.getAuthor() == null || this.r.getAuthor().getCommentFilterStatus() != 1)) {
            commentAdapter.setLoadEmptyTextResId(C0906R.string.b5m);
            commentAdapter.g = true;
        }
        this.f2860f.setAdapter(commentAdapter);
        this.D.f36577b = this.f2856b.getAid();
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(this.f2856b.getAid());
        if (b2 != null) {
            if (b2.getStatistics() == null) {
                i2 = 0;
            } else {
                i2 = b2.getStatistics().getCommentCount();
            }
            if (this.f2856b.getAdCommentStruct() == null) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = i2 + i3;
            if (i5 == 0) {
                this.f2857c.setText(GlobalContext.getContext().getString(C0906R.string.c2));
            } else {
                TextView textView = this.f2857c;
                if (i5 > 1) {
                    i4 = C0906R.string.wc;
                } else {
                    i4 = C0906R.string.wd;
                }
                textView.setText(getString(i4, com.ss.android.ugc.aweme.i18n.b.a((long) i5)));
            }
        }
        z();
        w();
        u();
    }

    private void v() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27584, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.link.f.a("poi", this.r, true)) {
            XiGuaTaskStruct xiGuaTask = this.r.getXiGuaTask();
            if (xiGuaTask != null && com.ss.android.ugc.aweme.j.a.a.a(this.r)) {
                this.commerceArea.setVisibility(0);
                this.commerceLogo.setImageURI(new Uri.Builder().scheme("res").path("2130839455").build());
                this.commerceTitle.setText(C0906R.string.duf);
                this.commercePrice.setText(xiGuaTask.getTitle());
                this.commerceSales.setText(xiGuaTask.getDesc());
                this.commerceArea.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f36530a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f36530a, false, 27739, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f36530a, false, 27739, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        com.ss.android.ugc.aweme.j.a.a.a(GlobalContext.getContext(), VideoCommentDialogFragment2.this.r);
                        r.a("click_mission_icon", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", VideoCommentDialogFragment2.this.getEventType()).a("group_id", VideoCommentDialogFragment2.this.r.getAid()).a("author_id", com.ss.android.ugc.aweme.u.aa.b(VideoCommentDialogFragment2.this.r.getAuthor())).a("entrance_location", "comment_page").f34114b);
                    }
                });
                this.f2858d.setVisibility(8);
                this.commerceClose.setOnClickListener(new v(this));
                User author = this.r.getAuthor();
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", getEventType()).a("group_id", this.r.getAid());
                if (author != null) {
                    str = author.getUid();
                } else {
                    str = "";
                }
                r.a("show_mission_icon", (Map) a2.a("author_id", str).a("entrance_location", "comment_page").f34114b);
            }
        }
    }

    private void y() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27588, new Class[0], Void.TYPE);
            return;
        }
        this.linkTag.setVisibility(0);
        this.f2858d.setVisibility(8);
        this.linkTitle.setText(this.r.getLinkAdData().commentArea.title);
        this.linkDesc.setText(this.r.getLinkAdData().commentArea.featureLabel);
        ((GenericDraweeHierarchy) this.linkIcon.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
        if (TextUtils.isEmpty(this.r.getLinkAdData().label)) {
            this.linkAdTag.setVisibility(8);
            this.linkAdTagDiv.setVisibility(8);
        } else {
            this.linkAdTag.setText(this.r.getLinkAdData().label);
            this.linkAdTag.setVisibility(0);
            this.linkAdTagDiv.setVisibility(0);
        }
        com.ss.android.ugc.aweme.base.c.b(this.linkIcon, this.r.getLinkAdData().getCommentAvatarIcon());
        com.ss.android.ugc.aweme.commercialize.log.g.a(getContext(), new a.C0509a().a("comment_show").a(this.r.getLinkAdData()).a(this.r).a(true).a());
        com.ss.android.ugc.aweme.commercialize.log.f.a(this.r.getLinkAdData(), this.r, "show", true, getEventType());
    }

    private boolean M() {
        boolean z2;
        String str;
        String str2;
        double d2;
        double d3;
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27674, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27674, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.commercialize.link.f.a("poi", this.r, true) || "poi_page".equalsIgnoreCase(o())) {
            return false;
        } else {
            this.commerceArea.setVisibility(0);
            com.ss.android.ugc.aweme.poi.e.p.a((RemoteImageView) this.commerceLogo, this.r.getPoiStruct());
            PoiStruct poiStruct = this.r.getPoiStruct();
            this.commerceTitle.setText(poiStruct.poiName);
            com.ss.android.ugc.aweme.poi.a f2 = af.a(GlobalContext.getContext()).f();
            if (f2 == null) {
                if (!a(poiStruct)) {
                    this.commercePrice.setText(poiStruct.address.getCity());
                } else {
                    N();
                }
            } else if (!TextUtils.isEmpty(f2.city)) {
                if (a(poiStruct)) {
                    N();
                } else if (c(f2.city, poiStruct.address.getCity()) && !b(poiStruct)) {
                    double doubleValue = Double.valueOf(poiStruct.poiLatitude).doubleValue();
                    double doubleValue2 = Double.valueOf(poiStruct.poiLongitude).doubleValue();
                    double d4 = f2.latitude;
                    double d5 = f2.longitude;
                    if (!f2.isGaode) {
                        double[] b2 = com.ss.android.ugc.aweme.poi.e.a.b(d5, d4);
                        double d6 = b2[0];
                        d3 = b2[1];
                        d2 = d6;
                    } else {
                        d2 = d5;
                        d3 = d4;
                    }
                    this.commercePrice.setText(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDistanceBetweenLocations(getContext(), doubleValue, doubleValue2, d3, d2));
                } else if (!a(poiStruct)) {
                    this.commercePrice.setText(poiStruct.address.getCity());
                } else {
                    N();
                }
            } else if (!a(poiStruct)) {
                this.commercePrice.setText(poiStruct.address.getCity());
            } else {
                N();
            }
            if (poiStruct.itemCount > 0) {
                this.commerceSales.setText(String.format(getResources().getString(C0906R.string.jv), new Object[]{com.ss.android.ugc.aweme.i18n.b.a((long) poiStruct.itemCount)}));
                z2 = true;
            } else {
                this.commerceSales.setVisibility(8);
                z2 = false;
            }
            if (com.ss.android.ugc.aweme.poi.e.p.a(f2, poiStruct)) {
                str = PushConstants.PUSH_TYPE_NOTIFY;
                this.commerceBottomDivider2.setVisibility(8);
                this.poiCouponText.setVisibility(8);
            } else {
                if (com.ss.android.ugc.aweme.poi.e.p.b(poiStruct)) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                this.commerceBottomDivider2.setVisibility(0);
                this.poiCouponText.setVisibility(0);
                this.poiCouponText.setText(poiStruct.getPoiSubTitle());
                a(poiStruct, z2);
                str = str2;
            }
            this.commerceArea.setOnClickListener(new r(this, str, poiStruct));
            this.f2858d.setVisibility(8);
            this.commerceClose.setOnClickListener(new s(this));
            return true;
        }
    }

    private boolean t() {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27581, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27581, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.commercialize.link.f.a("iron_man", this.r, true)) {
            return false;
        } else {
            com.ss.android.ugc.aweme.miniapp_api.model.f microAppInfo = this.r.getMicroAppInfo();
            if (microAppInfo == null) {
                return false;
            }
            this.f2858d.setVisibility(0);
            this.commerceArea.setVisibility(0);
            TextView textView = this.commerceTitle;
            if (TextUtils.isEmpty(microAppInfo.getTitle())) {
                str = microAppInfo.getName();
            } else {
                str = microAppInfo.getTitle();
            }
            textView.setText(str);
            int type = microAppInfo.getType();
            if (type == 1) {
                this.commerceLogo.setImageURI(new Uri.Builder().scheme("res").path("2130839682").build());
            } else if (type == 2) {
                this.commerceLogo.setImageURI(new Uri.Builder().scheme("res").path("2130839687").build());
            }
            TextView textView2 = this.commercePrice;
            if (!TextUtils.isEmpty(microAppInfo.getDesc())) {
                str2 = microAppInfo.getDesc();
            } else if (microAppInfo.isApp()) {
                str2 = GlobalContext.getContext().getString(C0906R.string.bbb);
            } else {
                str2 = GlobalContext.getContext().getString(C0906R.string.bbe);
            }
            textView2.setText(str2);
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", getEventType()).a("position", "comment_top").a("group_id", this.r.getAid()).a("author_id", this.r.getAuthorUid()).a("mp_id", microAppInfo.getAppId());
            if (microAppInfo.isApp()) {
                str3 = "micro_app";
            } else {
                str3 = "micro_game";
            }
            r.a("mp_show", (Map) a2.a("_param_for_special", str3).f34114b);
            this.f2858d.setVisibility(8);
            this.commerceClose.setOnClickListener(new o(this));
            this.commerceArea.setOnClickListener(new p(this, iMiniAppService, microAppInfo));
            this.commerceDivider.setVisibility(8);
            this.commerceLogoRight.setVisibility(8);
            this.commerceBottomDivider.setVisibility(8);
            return true;
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27682, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27682, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            return false;
        } else {
            if (this.q != null) {
                this.q.a(new ar(20));
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(long j2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            String aid = this.r.getAid();
            if (aid == null) {
                aid = "";
            }
            jSONObject.put("group_id", aid);
            com.ss.android.ugc.aweme.store.a.f71744c = SystemClock.uptimeMillis() - j2;
            jSONObject.put("duration", String.valueOf(com.ss.android.ugc.aweme.store.a.f71744c));
        } catch (JSONException unused) {
        }
        AppLogNewUtils.onEventV3("comment_list", jSONObject);
        return null;
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2855a, false, 27619, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2855a, false, 27619, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.J = false;
        this.D.c(exc);
    }

    public final void d(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f2855a, false, 27625, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f2855a, false, 27625, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.D.d(exc2);
    }

    public final void e(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f2855a, false, 27627, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f2855a, false, 27627, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.D.e(exc2);
    }

    @Subscribe
    public void onEvent(ah ahVar) {
        if (PatchProxy.isSupport(new Object[]{ahVar}, this, f2855a, false, 27704, new Class[]{ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar}, this, f2855a, false, 27704, new Class[]{ah.class}, Void.TYPE);
            return;
        }
        h(true);
    }

    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f2855a, true, 27715, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f2855a, true, 27715, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        VideoCommentDialogFragment2 b2 = b(context);
        if (b2 == null || !b2.j()) {
            return false;
        }
        return true;
    }

    public static VideoCommentDialogFragment2 b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f2855a, true, 27719, new Class[]{Context.class}, VideoCommentDialogFragment2.class)) {
            return (VideoCommentDialogFragment2) PatchProxy.accessDispatch(new Object[]{context}, null, f2855a, true, 27719, new Class[]{Context.class}, VideoCommentDialogFragment2.class);
        }
        FragmentActivity c2 = c(context);
        if (c2 == null) {
            return null;
        }
        Fragment findFragmentByTag = c2.getSupportFragmentManager().findFragmentByTag("comment");
        if (findFragmentByTag instanceof VideoCommentDialogFragment2) {
            return (VideoCommentDialogFragment2) findFragmentByTag;
        }
        return null;
    }

    @Nullable
    private static FragmentActivity c(@Nullable Context context) {
        Context context2 = context;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f2855a, true, 27722, new Class[]{Context.class}, FragmentActivity.class)) {
                return (FragmentActivity) PatchProxy.accessDispatch(new Object[]{context2}, null, f2855a, true, 27722, new Class[]{Context.class}, FragmentActivity.class);
            } else if (context2 == null) {
                return null;
            } else {
                if (context2 instanceof FragmentActivity) {
                    return (FragmentActivity) context2;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    return null;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
    }

    private int f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27622, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27622, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        int c2 = this.m.c();
        if (this.E) {
            List data = ((CommentAdapter) this.f2860f.getAdapter()).getData();
            if (!CollectionUtils.isEmpty(data)) {
                if (z2) {
                    c2++;
                } else if (!(data.get(0) instanceof com.ss.android.ugc.aweme.commercialize.model.c)) {
                    c2++;
                }
            }
            if (!(this.r == null || this.r.getAdCommentStruct() == null || c2 <= 0)) {
                c2++;
            }
        }
        return c2;
    }

    private void h(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27709, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27709, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.P != null) {
            this.P.a(z2);
        }
    }

    public final void d(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f2855a, false, 27649, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f2855a, false, 27649, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (isAdded()) {
            if (this.o == null || !this.o.equals(comment)) {
                this.o = comment;
                if (this.s != null) {
                    this.s.a(comment.getUser());
                }
            } else {
                this.o = comment;
                this.g.performClick();
            }
        }
    }

    public final void e(boolean z2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27695, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27695, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            String o2 = o();
            Aweme commentInputAweme = getCommentInputAweme();
            if (this.o != null) {
                str = "click_reply";
            } else {
                str = "click_original";
            }
            com.ss.android.ugc.aweme.forward.e.a.b(o2, commentInputAweme, "list", str);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2855a, false, 27596, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2855a, false, 27596, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.g.setKeyListener(null);
        this.N = new WrapLinearLayoutManager(getActivity());
        this.f2860f.setLayoutManager(this.N);
        R();
        if (bundle != null) {
            this.M = bundle.getBoolean("should_hide", false);
            if (this.M) {
                h(false);
            }
        }
        s();
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        AwesomeSplashEvent awesomeSplashEvent2 = awesomeSplashEvent;
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent2}, this, f2855a, false, 27705, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent2}, this, f2855a, false, 27705, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        if (awesomeSplashEvent2.f39420b != 4) {
            h(true);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2855a, false, 27590, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2855a, false, 27590, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        FragmentInstrumentation.onCreate("com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2");
        super.onCreate(bundle);
        bg.c(this);
        if (getArguments() != null) {
            this.f2856b = (com.ss.android.ugc.aweme.comment.d.b) getArguments().getSerializable("id");
        }
        this.s = new CommentInputManager(this, hashCode(), this);
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.comment.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2855a, false, 27602, new Class[]{com.ss.android.ugc.aweme.comment.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2855a, false, 27602, new Class[]{com.ss.android.ugc.aweme.comment.b.b.class}, Void.TYPE);
            return;
        }
        if (this.f2860f != null && TextUtils.equals(bVar.f36374a, l())) {
            this.f2860f.scrollToPosition(0);
        }
    }

    public void onHiddenChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27603, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27603, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            n();
        } else {
            m();
        }
        super.onHiddenChanged(z2);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f2855a, false, 27712, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f2855a, false, 27712, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.comment.a.a.a("VideoCommentDialogFragment2 onSaveInstanceState");
        bundle2.putSerializable("should_hide", Boolean.TRUE);
    }

    private void a(int i2) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2855a, false, 27613, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2855a, false, 27613, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (j()) {
            if (!AbTestManager.a().a(i2) || this.r == null || !this.r.getAwemeControl().canComment()) {
                z2 = false;
            }
            if (z2) {
                if (this.s != null && !this.s.d()) {
                    this.s.a(this.g.onSaveInstanceState(), this.g.getHint(), false);
                }
                r.a("keyboard_open", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("keyboard_open", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("comment_cnt", i2).f34114b);
                return;
            }
            r.a("keyboard_open", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("keyboard_open", PushConstants.PUSH_TYPE_NOTIFY).a("comment_cnt", i2).f34114b);
        }
    }

    private void b(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2855a, false, 27623, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2855a, false, 27623, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y = i2;
        if (i2 == 0) {
            this.f2857c.setText(GlobalContext.getContext().getString(C0906R.string.c2));
            return;
        }
        TextView textView = this.f2857c;
        if (i2 > 1) {
            i3 = C0906R.string.wc;
        } else {
            i3 = C0906R.string.wd;
        }
        textView.setText(getString(i3, com.ss.android.ugc.aweme.i18n.b.a((long) i2)));
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2855a, false, 27628, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2855a, false, 27628, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = this.y + i2;
        b(i3);
        h hVar = this.m;
        String aid = this.f2856b.getAid();
        if (PatchProxy.isSupport(new Object[]{aid, Integer.valueOf(i3)}, hVar, h.f36421a, false, 27340, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            h hVar2 = hVar;
            PatchProxy.accessDispatch(new Object[]{aid, Integer.valueOf(i3)}, hVar2, h.f36421a, false, 27340, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.feed.a.a().b(aid, i3);
        bg.a(new ar(14, ((com.ss.android.ugc.aweme.comment.e.g) hVar.f2978e).f36412d));
    }

    private int d(String str) {
        String str2 = str;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2855a, false, 27629, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f2855a, false, 27629, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        com.ss.android.ugc.aweme.comment.g.c cVar = this.R;
        if (PatchProxy.isSupport(new Object[]{str2}, cVar, com.ss.android.ugc.aweme.comment.g.c.f36457a, false, 27778, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, cVar, com.ss.android.ugc.aweme.comment.g.c.f36457a, false, 27778, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (!CollectionUtils.isEmpty(cVar.f36459c)) {
            Iterator<Comment> it2 = cVar.f36459c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Comment next = it2.next();
                if (TextUtils.equals(next.getCid(), str2)) {
                    i2 = next.getReplyCommentTotal() + 1;
                    break;
                }
            }
        }
        return i2;
    }

    private int e(String str) {
        String str2 = str;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2855a, false, 27630, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f2855a, false, 27630, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        com.ss.android.ugc.aweme.comment.g.c cVar = this.R;
        if (PatchProxy.isSupport(new Object[]{str2}, cVar, com.ss.android.ugc.aweme.comment.g.c.f36457a, false, 27779, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, cVar, com.ss.android.ugc.aweme.comment.g.c.f36457a, false, 27779, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (!CollectionUtils.isEmpty(cVar.f36459c)) {
            Iterator<Comment> it2 = cVar.f36459c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Comment next = it2.next();
                if (TextUtils.equals(next.getFakeId(), str2)) {
                    i2 = next.getReplyCommentTotal() + 1;
                    break;
                }
            }
        }
        return i2;
    }

    private void g(boolean z2) {
        String insertCids;
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27653, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27653, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z3) {
            if (this.G == 0) {
                String o2 = o();
                Aweme aweme = this.r;
                int a2 = com.ss.android.ugc.aweme.longvideo.b.a.a(getActivity());
                if (TextUtils.isEmpty(this.f2856b.getInsertCids())) {
                    insertCids = null;
                } else {
                    insertCids = this.f2856b.getInsertCids();
                }
                com.ss.android.ugc.aweme.comment.f.a.a(o2, aweme, "list", a2, insertCids, this.f2856b.getEnterMethod(), this.f2856b.getPlayListType(), this.f2856b.getPlayListIdKey(), this.f2856b.getPlayListId(), this.f2856b.getPreviousPage());
                this.G = System.currentTimeMillis();
            }
        } else if (this.G != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.G;
            this.G = 0;
            if (currentTimeMillis >= 0) {
                com.ss.android.ugc.aweme.comment.f.a.a(o(), l(), currentTimeMillis);
            } else {
                return;
            }
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f2860f.getAdapter();
        if (commentAdapter != null) {
            commentAdapter.a(z3);
        }
        if (x && commentAdapter != null && !CollectionUtils.isEmpty(commentAdapter.getData())) {
            this.f2860f.scrollToPosition(0);
        }
        x = false;
    }

    public final void f(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2855a, false, 27635, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2855a, false, 27635, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.F)) {
            com.ss.android.ugc.aweme.comment.f.a.a(o(), this.r, (String) null, false, "list");
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.forward.c.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2855a, false, 27694, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2855a, false, 27694, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && aVar.f48271e == 1) {
            if (aVar.f48268b != null) {
                if (hashCode() == aVar.f48272f) {
                    int[] Q2 = Q();
                    this.D.a(aVar.f48268b.getComment(), Q2[0], Q2[1], true);
                }
                H();
                c(1);
            }
            if (aVar.f48272f == hashCode()) {
                String o2 = o();
                Aweme aweme = aVar.f48270d;
                if (this.t) {
                    str = "click_reply_comment";
                } else {
                    str = "click_comment";
                }
                com.ss.android.ugc.aweme.forward.e.a.a(o2, aweme, "list", str, true);
            }
        }
    }

    private void b(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f2855a, false, 27656, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f2855a, false, 27656, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.r = aweme;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = "";
        }
        this.H = str;
        this.A.a(getContext(), aweme);
        K();
        if (PatchProxy.isSupport(new Object[0], this, f2855a, false, 27671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2855a, false, 27671, new Class[0], Void.TYPE);
            return;
        }
        this.E = false;
        if (this.r != null) {
            if (this.r.isAd()) {
                this.E = this.r.getAwemeRawAd().isCommentAreaSwitch();
            }
            this.I = false;
            com.ss.android.ugc.aweme.utils.c.a(this.mCommentAdBtn);
            com.ss.android.ugc.aweme.utils.c.a(this.mCommentAdSourceTv);
            com.ss.android.ugc.aweme.utils.c.a(this.mCommentAdDesTv);
            com.ss.android.ugc.aweme.utils.c.a(this.mCommentAdUserAvatar);
        }
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27686, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2855a, false, 27686, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.comment.f.a.a("input", l(), PushConstants.PUSH_TYPE_NOTIFY);
        if (z2) {
            I();
        }
    }

    @Subscribe
    public void onEvent(t tVar) {
        if (PatchProxy.isSupport(new Object[]{tVar}, this, f2855a, false, 27703, new Class[]{t.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tVar}, this, f2855a, false, 27703, new Class[]{t.class}, Void.TYPE);
            return;
        }
        h(true);
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onReportCommentEvent(BroadcastMethod.a aVar) {
        BroadcastMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2855a, false, 27721, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2855a, false, 27721, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            try {
                if (TextUtils.equals("commentReportSuccess", aVar2.f44432b.getString("eventName"))) {
                    String string = aVar2.f44432b.getJSONObject("data").getString("object_id");
                    c(-d(string));
                    this.D.b(string);
                    bg.a(new com.ss.android.ugc.aweme.comment.b.a(4, new Object[]{this.r.getAid(), string}));
                    com.ss.android.ugc.aweme.comment.e.g gVar = (com.ss.android.ugc.aweme.comment.e.g) this.m.i();
                    if (gVar != null) {
                        CommentItemList commentItemList = (CommentItemList) gVar.getData();
                        if (!(commentItemList == null || commentItemList.replyStyle == 2)) {
                            e eVar = this.D;
                            if (PatchProxy.isSupport(new Object[]{string}, eVar, e.f36576a, false, 27514, new Class[]{String.class}, Void.TYPE)) {
                                e eVar2 = eVar;
                                PatchProxy.accessDispatch(new Object[]{string}, eVar2, e.f36576a, false, 27514, new Class[]{String.class}, Void.TYPE);
                            } else if (eVar.f36578c.getAdapter() instanceof CommentAdapter) {
                                CommentAdapter commentAdapter = (CommentAdapter) eVar.f36578c.getAdapter();
                                if (PatchProxy.isSupport(new Object[]{string}, commentAdapter, CommentAdapter.f36281a, false, 27203, new Class[]{String.class}, Void.TYPE)) {
                                    CommentAdapter commentAdapter2 = commentAdapter;
                                    PatchProxy.accessDispatch(new Object[]{string}, commentAdapter2, CommentAdapter.f36281a, false, 27203, new Class[]{String.class}, Void.TYPE);
                                } else if (commentAdapter.getBasicItemCount() != 0) {
                                    if (!TextUtils.isEmpty(string)) {
                                        Iterator it2 = commentAdapter.mItems.iterator();
                                        boolean z2 = false;
                                        while (it2.hasNext()) {
                                            Comment comment = (Comment) it2.next();
                                            if (!CollectionUtils.isEmpty(comment.getReplyComments())) {
                                                Comment comment2 = comment.getReplyComments().get(0);
                                                if (comment2 != null && TextUtils.equals(comment2.getCid(), string)) {
                                                    it2.remove();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            commentAdapter.notifyDataSetChanged();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private boolean b(PoiStruct poiStruct) {
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{poiStruct2}, this, f2855a, false, 27679, new Class[]{PoiStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiStruct2}, this, f2855a, false, 27679, new Class[]{PoiStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (poiStruct2 == null || TextUtils.isEmpty(poiStruct2.poiLatitude) || TextUtils.isEmpty(poiStruct2.poiLongitude)) {
            return true;
        } else {
            return false;
        }
    }

    public final void b(Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f2855a, false, 27691, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f2855a, false, 27691, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        int[] Q2 = Q();
        if (this.o != null && (!this.t || !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId()) || comment.getCommentType() == 0)) {
            comment2.setReplyToUserId(this.o.getUser().getUid());
            if (this.t && comment.getCommentType() != 0) {
                comment2.setReplyToUserName(ae.a(this.o.getUser()));
            } else if (comment.getCommentType() == 2 && !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                comment2.setReplyToUserName(ae.a(this.o.getUser()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.o);
            comment2.setReplyComments(arrayList);
        }
        if (!com.ss.android.ugc.aweme.comment.f.f36433c.e(comment2)) {
            com.ss.android.ugc.aweme.comment.f.f36433c.a(comment2, this.o);
        }
        e eVar = this.D;
        int i2 = Q2[0];
        int i3 = Q2[1];
        if (PatchProxy.isSupport(new Object[]{comment2, Integer.valueOf(i2), Integer.valueOf(i3)}, eVar, e.f36576a, false, 27505, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2, Integer.valueOf(i2), Integer.valueOf(i3)}, eVar, e.f36576a, false, 27505, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            boolean z2 = !com.ss.android.ugc.aweme.comment.f.f36433c.a(comment2);
            if (z2) {
                eVar.b(comment2);
            }
            if (!com.ss.android.ugc.aweme.comment.f.f36433c.e(comment2)) {
                com.ss.android.ugc.aweme.comment.f.f36433c.d(comment2);
            }
            if (!z2) {
                eVar.a(comment2);
            }
        }
        H();
    }

    public final void c(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f2855a, false, 27646, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f2855a, false, 27646, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        String text = comment.getText();
        a(com.ss.android.ugc.aweme.comment.f.f36433c.l(comment), com.ss.android.ugc.aweme.comment.f.f36433c.j(comment), com.bytedance.ies.dmt.ui.input.emoji.g.a(text), text, true);
        if (this.s != null) {
            this.s.b(comment);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @butterknife.OnClick({2131493623, 2131493617, 2131493618, 2131493622, 2131493624})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f2855a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 27666(0x6c12, float:3.8768E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f2855a
            r3 = 0
            r4 = 27666(0x6c12, float:3.8768E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            android.view.View r0 = r7.mCommentAdLayout
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            int r0 = r0.bottomMargin
            if (r0 >= 0) goto L_0x0041
            return
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.r
            if (r0 != 0) goto L_0x0046
            return
        L_0x0046:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.r
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x004f
            return
        L_0x004f:
            java.lang.String r1 = r0.getOpenUrl()
            int r2 = r19.getId()
            r3 = 2131165993(0x7f070329, float:1.7946219E38)
            r8 = 2
            if (r2 == r3) goto L_0x0436
            r3 = 2131165995(0x7f07032b, float:1.7946223E38)
            if (r2 != r3) goto L_0x0064
            goto L_0x0436
        L_0x0064:
            r3 = 2131165994(0x7f07032a, float:1.794622E38)
            if (r2 != r3) goto L_0x0119
            android.content.Context r2 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            boolean r1 = com.ss.android.ugc.aweme.commercialize.im.f.b((java.lang.String) r1)
            if (r1 == 0) goto L_0x00c8
            android.content.Context r0 = r18.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.r
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31575(0x7b57, float:4.4246E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00ba
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31575(0x7b57, float:4.4246E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0115
        L_0x00ba:
            java.lang.String r2 = "comment_end_ad"
            java.lang.String r3 = "click_message"
            java.lang.String r4 = "raw ad click"
            org.json.JSONObject r4 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.lang.String) r4, (boolean) r10)
            com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (java.lang.String) r2, (java.lang.String) r3, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r4)
            goto L_0x0115
        L_0x00c8:
            android.content.Context r1 = r18.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31624(0x7b88, float:4.4315E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x010a
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31624(0x7b88, float:4.4315E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0115
        L_0x010a:
            java.lang.String r2 = "click_title"
            java.lang.String r3 = "raw feed comment end click title"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (org.json.JSONObject) r3)
        L_0x0115:
            r18.J()
            return
        L_0x0119:
            r1 = 2131165988(0x7f070324, float:1.7946209E38)
            if (r2 != r1) goto L_0x03a3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2855a
            r3 = 0
            r4 = 27668(0x6c14, float:3.8771E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0143
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2855a
            r3 = 0
            r4 = 27668(0x6c14, float:3.8771E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0435
        L_0x0143:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.r
            if (r0 == 0) goto L_0x03a2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.r
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x03a2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.r
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            java.lang.String r1 = r0.getType()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x03a2
            java.lang.String r2 = r0.getOpenUrl()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 6
            switch(r4) {
                case -1354573786: goto L_0x01a9;
                case 96801: goto L_0x019f;
                case 117588: goto L_0x0195;
                case 3083120: goto L_0x018b;
                case 3148996: goto L_0x0181;
                case 957829685: goto L_0x0177;
                case 1893962841: goto L_0x016d;
                default: goto L_0x016c;
            }
        L_0x016c:
            goto L_0x01b3
        L_0x016d:
            java.lang.String r4 = "redpacket"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01b3
            r1 = 6
            goto L_0x01b4
        L_0x0177:
            java.lang.String r4 = "counsel"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01b3
            r1 = 0
            goto L_0x01b4
        L_0x0181:
            java.lang.String r4 = "form"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01b3
            r1 = 5
            goto L_0x01b4
        L_0x018b:
            java.lang.String r4 = "dial"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01b3
            r1 = 4
            goto L_0x01b4
        L_0x0195:
            java.lang.String r4 = "web"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01b3
            r1 = 1
            goto L_0x01b4
        L_0x019f:
            java.lang.String r4 = "app"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01b3
            r1 = 3
            goto L_0x01b4
        L_0x01a9:
            java.lang.String r4 = "coupon"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01b3
            r1 = 2
            goto L_0x01b4
        L_0x01b3:
            r1 = -1
        L_0x01b4:
            switch(r1) {
                case 0: goto L_0x0329;
                case 1: goto L_0x0329;
                case 2: goto L_0x02d4;
                case 3: goto L_0x0277;
                case 4: goto L_0x0220;
                case 5: goto L_0x0210;
                case 6: goto L_0x01b9;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            goto L_0x038f
        L_0x01b9:
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            android.content.Context r1 = r18.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31629(0x7b8d, float:4.4322E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0203
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31629(0x7b8d, float:4.4322E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x038f
        L_0x0203:
            java.lang.String r2 = "click_redpacket"
            java.lang.String r3 = "raw feed comment end click red packet"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (org.json.JSONObject) r3)
            goto L_0x038f
        L_0x0210:
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.d((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            goto L_0x038f
        L_0x0220:
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            android.content.Context r1 = r18.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31625(0x7b89, float:4.4316E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x026a
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31625(0x7b89, float:4.4316E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x038f
        L_0x026a:
            java.lang.String r2 = "click_call"
            java.lang.String r3 = "raw feed comment end click call"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (org.json.JSONObject) r3)
            goto L_0x038f
        L_0x0277:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x038f
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            android.content.Context r1 = r18.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31627(0x7b8b, float:4.4319E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x02c7
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31627(0x7b8b, float:4.4319E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x038f
        L_0x02c7:
            java.lang.String r2 = "click_start"
            java.lang.String r3 = "raw feed comment end click start"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (org.json.JSONObject) r3)
            goto L_0x038f
        L_0x02d4:
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            android.content.Context r1 = r18.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31622(0x7b86, float:4.4312E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x031d
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31622(0x7b86, float:4.4312E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x038f
        L_0x031d:
            java.lang.String r2 = "click_coupon"
            java.lang.String r3 = "raw feed comment coupon click"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (org.json.JSONObject) r3)
            goto L_0x038f
        L_0x0329:
            boolean r1 = com.ss.android.ugc.aweme.commercialize.im.f.b((java.lang.String) r2)
            if (r1 == 0) goto L_0x0381
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.r
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31573(0x7b55, float:4.4243E-41)
            java.lang.Class[] r3 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0373
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31573(0x7b55, float:4.4243E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0388
        L_0x0373:
            java.lang.String r3 = "comment_end_ad"
            java.lang.String r4 = "click_message"
            java.lang.String r6 = "raw ad click"
            org.json.JSONObject r6 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.Aweme) r2, (java.lang.String) r6, (boolean) r10)
            com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r1, (java.lang.String) r3, (java.lang.String) r4, (com.ss.android.ugc.aweme.feed.model.Aweme) r2, (org.json.JSONObject) r6)
            goto L_0x0388
        L_0x0381:
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.d((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
        L_0x0388:
            android.content.Context r1 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
        L_0x038f:
            android.content.Context r0 = r18.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.r
            com.ss.android.ugc.aweme.commercialize.feed.e r2 = r7.A
            com.ss.android.ugc.aweme.commercialize.c.b r3 = r7.z
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (com.ss.android.ugc.aweme.commercialize.feed.e) r2, (int) r5, (com.ss.android.ugc.aweme.commercialize.c.b) r3)
            if (r0 == 0) goto L_0x03a2
            r18.q()
        L_0x03a2:
            return
        L_0x03a3:
            r1 = 2131165989(0x7f070325, float:1.794621E38)
            if (r2 != r1) goto L_0x0435
            android.content.Context r1 = r18.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31628(0x7b8c, float:4.432E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x03ea
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31628(0x7b8c, float:4.432E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03f5
        L_0x03ea:
            java.lang.String r2 = "close"
            java.lang.String r3 = "raw feed comment end click close"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (org.json.JSONObject) r3)
        L_0x03f5:
            r7.I = r9
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2855a
            r3 = 0
            r4 = 27615(0x6bdf, float:3.8697E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x041b
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2855a
            r3 = 0
            r4 = 27615(0x6bdf, float:3.8697E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x041b:
            android.view.View r0 = r7.mCommentAdLayout
            if (r0 == 0) goto L_0x0435
            android.view.View r0 = r7.mCommentAdLayout
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131427410(0x7f0b0052, float:1.8476435E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            r2 = 360(0x168, float:5.04E-43)
            r7.a(r0, r1, r2, r10)
        L_0x0435:
            return
        L_0x0436:
            android.content.Context r2 = r18.getContext()
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            boolean r1 = com.ss.android.ugc.aweme.commercialize.im.f.b((java.lang.String) r1)
            if (r1 == 0) goto L_0x0495
            android.content.Context r0 = r18.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.r
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31574(0x7b56, float:4.4245E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0487
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31574(0x7b56, float:4.4245E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x04e2
        L_0x0487:
            java.lang.String r2 = "comment_end_ad"
            java.lang.String r3 = "click_message"
            java.lang.String r4 = "raw ad click"
            org.json.JSONObject r4 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.lang.String) r4, (boolean) r10)
            com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (java.lang.String) r2, (java.lang.String) r3, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r4)
            goto L_0x04e2
        L_0x0495:
            android.content.Context r1 = r18.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31623(0x7b87, float:4.4313E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x04d7
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r14 = 1
            r15 = 31623(0x7b87, float:4.4313E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x04e2
        L_0x04d7:
            java.lang.String r2 = "click_source"
            java.lang.String r3 = "raw feed comment end click source"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0, (org.json.JSONObject) r3)
        L_0x04e2:
            r18.J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2.onClick(android.view.View):void");
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2855a, false, 27636, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2855a, false, 27636, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.D.c(str);
        if (!TextUtils.isEmpty(this.F)) {
            com.ss.android.ugc.aweme.comment.f.a.a(o(), this.r, str, true, "list");
        }
    }

    private void c(com.ss.android.ugc.aweme.comment.widget.a aVar, Comment comment) {
        String str;
        String str2;
        boolean z2;
        final com.ss.android.ugc.aweme.comment.widget.a aVar2 = aVar;
        final Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{aVar2, comment2}, this, f2855a, false, 27642, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, comment2}, this, f2855a, false, 27642, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a((Fragment) this, getEventType(), "reply_comment", ad.a().a("login_title", GlobalContext.getContext().getString(C0906R.string.uz)).a("group_id", this.H).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(this.H)).f75487b);
        } else {
            if (comment.getUser() != null) {
                str = comment.getUser().getUid();
            } else {
                str = "";
            }
            boolean equals = TextUtils.equals(str, com.ss.android.ugc.aweme.account.d.a().getCurUserId());
            if (!equals) {
                String eventType = getEventType();
                String l2 = l();
                if (this.o != null) {
                    str2 = this.o.getCid();
                } else {
                    str2 = "";
                }
                String str3 = str2;
                String E2 = E();
                boolean isMyProfile = this.f2856b.isMyProfile();
                if (this.r == null || this.r.getAwemeType() != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                com.ss.android.ugc.aweme.comment.f.a.a("reply_comment", eventType, l2, str3, E2, isMyProfile, z2);
            }
            boolean equals2 = TextUtils.equals(this.f2856b.getAuthorUid(), com.ss.android.ugc.aweme.account.d.a().getCurUserId());
            if (this.s != null) {
                this.s.a(equals, equals2, !comment.isTranslated(), new CommentInputManager.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f36536a;

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27744, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27744, new Class[0], Void.TYPE);
                            return;
                        }
                        VideoCommentDialogFragment2.this.d(comment2);
                    }

                    public final void f() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27748, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27748, new Class[0], Void.TYPE);
                            return;
                        }
                        VideoCommentDialogFragment2.this.s.a(comment2, VideoCommentDialogFragment2.this.o());
                    }

                    public final void g() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27749, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27749, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.comment.f.a.a(VideoCommentDialogFragment2.this.o());
                    }

                    public final void c() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27745, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27745, new Class[0], Void.TYPE);
                            return;
                        }
                        VideoCommentDialogFragment2 videoCommentDialogFragment2 = VideoCommentDialogFragment2.this;
                        Comment comment = comment2;
                        if (PatchProxy.isSupport(new Object[]{comment}, videoCommentDialogFragment2, VideoCommentDialogFragment2.f2855a, false, 27648, new Class[]{Comment.class}, Void.TYPE)) {
                            Object[] objArr = {comment};
                            VideoCommentDialogFragment2 videoCommentDialogFragment22 = videoCommentDialogFragment2;
                            PatchProxy.accessDispatch(objArr, videoCommentDialogFragment22, VideoCommentDialogFragment2.f2855a, false, 27648, new Class[]{Comment.class}, Void.TYPE);
                            return;
                        }
                        if (videoCommentDialogFragment2.isAdded() && videoCommentDialogFragment2.s != null) {
                            videoCommentDialogFragment2.t = true;
                            videoCommentDialogFragment2.o = comment;
                            videoCommentDialogFragment2.s.e();
                            com.ss.android.ugc.aweme.forward.e.a.a(videoCommentDialogFragment2.o(), videoCommentDialogFragment2.getCommentInputAweme(), "list", "click_reply_comment");
                        }
                    }

                    public final void e() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27747, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27747, new Class[0], Void.TYPE);
                            return;
                        }
                        VideoCommentDialogFragment2.this.s.a(comment2);
                        com.ss.android.ugc.aweme.comment.f.a.a(VideoCommentDialogFragment2.this.o(), comment2.getUser().getUid(), comment2.getCid(), VideoCommentDialogFragment2.this.r);
                    }

                    public final void h() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27750, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27750, new Class[0], Void.TYPE);
                            return;
                        }
                        VideoCommentDialogFragment2 videoCommentDialogFragment2 = VideoCommentDialogFragment2.this;
                        com.ss.android.ugc.aweme.comment.widget.a aVar = aVar2;
                        Comment comment = comment2;
                        if (PatchProxy.isSupport(new Object[]{aVar, comment}, videoCommentDialogFragment2, VideoCommentDialogFragment2.f2855a, false, 27651, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
                            Object[] objArr = {aVar, comment};
                            VideoCommentDialogFragment2 videoCommentDialogFragment22 = videoCommentDialogFragment2;
                            PatchProxy.accessDispatch(objArr, videoCommentDialogFragment22, VideoCommentDialogFragment2.f2855a, false, 27651, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
                            return;
                        }
                        if (aVar != null) {
                            aVar.a();
                        }
                    }

                    public final void i() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27751, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27751, new Class[0], Void.TYPE);
                            return;
                        }
                        VideoCommentDialogFragment2 videoCommentDialogFragment2 = VideoCommentDialogFragment2.this;
                        com.ss.android.ugc.aweme.comment.widget.a aVar = aVar2;
                        Comment comment = comment2;
                        if (PatchProxy.isSupport(new Object[]{aVar, comment}, videoCommentDialogFragment2, VideoCommentDialogFragment2.f2855a, false, 27652, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
                            Object[] objArr = {aVar, comment};
                            VideoCommentDialogFragment2 videoCommentDialogFragment22 = videoCommentDialogFragment2;
                            PatchProxy.accessDispatch(objArr, videoCommentDialogFragment22, VideoCommentDialogFragment2.f2855a, false, 27652, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
                            return;
                        }
                        if (aVar != null) {
                            aVar.b();
                        }
                    }

                    public final void d() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27746, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27746, new Class[0], Void.TYPE);
                            return;
                        }
                        VideoCommentDialogFragment2 videoCommentDialogFragment2 = VideoCommentDialogFragment2.this;
                        Comment comment = comment2;
                        if (PatchProxy.isSupport(new Object[]{comment}, videoCommentDialogFragment2, VideoCommentDialogFragment2.f2855a, false, 27650, new Class[]{Comment.class}, Void.TYPE)) {
                            Object[] objArr = {comment};
                            VideoCommentDialogFragment2 videoCommentDialogFragment22 = videoCommentDialogFragment2;
                            PatchProxy.accessDispatch(objArr, videoCommentDialogFragment22, VideoCommentDialogFragment2.f2855a, false, 27650, new Class[]{Comment.class}, Void.TYPE);
                            return;
                        }
                        ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(videoCommentDialogFragment2.getActivity(), "comment", comment.getCid(), comment.getUser().getUid(), videoCommentDialogFragment2.r.getAuthorUid(), null);
                        com.ss.android.ugc.aweme.comment.f.a.a(videoCommentDialogFragment2.o(), videoCommentDialogFragment2.r, comment.getCid(), "list", "click_report_button");
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f36536a, false, 27743, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f36536a, false, 27743, new Class[0], Void.TYPE);
                            return;
                        }
                        VideoCommentDialogFragment2 videoCommentDialogFragment2 = VideoCommentDialogFragment2.this;
                        Comment comment = comment2;
                        if (PatchProxy.isSupport(new Object[]{comment}, videoCommentDialogFragment2, VideoCommentDialogFragment2.f2855a, false, 27647, new Class[]{Comment.class}, Void.TYPE)) {
                            Object[] objArr = {comment};
                            VideoCommentDialogFragment2 videoCommentDialogFragment22 = videoCommentDialogFragment2;
                            PatchProxy.accessDispatch(objArr, videoCommentDialogFragment22, VideoCommentDialogFragment2.f2855a, false, 27647, new Class[]{Comment.class}, Void.TYPE);
                            return;
                        }
                        FragmentActivity activity = videoCommentDialogFragment2.getActivity();
                        if (activity != null && comment != null) {
                            if (!NetworkUtils.isNetworkAvailable(activity)) {
                                com.bytedance.ies.dmt.ui.d.a.c((Context) activity, (int) C0906R.string.bgf).a();
                                return;
                            }
                            if (videoCommentDialogFragment2.f2856b.getSource() == 0) {
                                String l = videoCommentDialogFragment2.l();
                                if (PatchProxy.isSupport(new Object[]{"video_page", l}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27389, new Class[]{String.class, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{"video_page", l}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27389, new Class[]{String.class, String.class}, Void.TYPE);
                                } else {
                                    r.onEvent(MobClick.obtain().setEventName("delete_comment").setLabelName("video_page").setValue(l));
                                }
                            }
                            if (videoCommentDialogFragment2.n != null && !TextUtils.isEmpty(comment.getCid())) {
                                ((com.ss.android.ugc.aweme.comment.e.c) videoCommentDialogFragment2.n.i()).f36399e = videoCommentDialogFragment2.f2856b.getAid();
                                videoCommentDialogFragment2.n.a(comment.getCid());
                                videoCommentDialogFragment2.v = comment;
                            }
                        }
                    }
                });
            }
        }
    }

    private boolean c(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f2855a, false, 27680, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f2855a, false, 27680, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (lowerCase.length() > lowerCase2.length()) {
                return lowerCase.contains(lowerCase2);
            }
            return lowerCase2.contains(lowerCase);
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f2855a, false, 27594, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f2855a, false, 27594, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.f2859e = (DmtStatusView) view2.findViewById(C0906R.id.cvd);
        Context context = view.getContext();
        int color = ContextCompat.getColor(context, C0906R.color.a72);
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, (int) C0906R.style.r5));
        dmtTextView.setTextColor(color);
        dmtTextView.setText(C0906R.string.b6x);
        dmtTextView.setOnClickListener(new z(this));
        DmtTextView dmtTextView2 = new DmtTextView(new ContextThemeWrapper(context, (int) C0906R.style.r5));
        dmtTextView2.setTextColor(color);
        dmtTextView2.setText(C0906R.string.vh);
        this.f2859e.setBuilder(DmtStatusView.a.a(context).b((View) dmtTextView2).c((View) dmtTextView).c(0));
        this.f2860f = (RecyclerView) view2.findViewById(C0906R.id.cc5);
        if (this.f2860f instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.f2860f).setLabel("comment_list");
        }
        this.P = (CommentNestedLayout) view2.findViewById(C0906R.id.chy);
        this.P.setVisibleChangedListener(this.Q);
        this.f2857c = (TextView) view2.findViewById(C0906R.id.title);
        b(0);
        this.f2858d = view2.findViewById(C0906R.id.ix);
        this.f2858d.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36532a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f36532a, false, 27740, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36532a, false, 27740, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                VideoCommentDialogFragment2.this.q();
            }
        });
        this.g = (MentionEditText) view2.findViewById(C0906R.id.v7);
        this.h = (ImageView) view2.findViewById(C0906R.id.g3);
        this.i = (ImageView) view2.findViewById(C0906R.id.b0x);
        this.R = new com.ss.android.ugc.aweme.comment.g.c();
        this.D = new e(getActivity(), this.f2859e, this.f2860f, this.R);
        this.j = view2.findViewById(C0906R.id.ahv);
        this.k = view2.findViewById(C0906R.id.v2);
        this.l = (RelativeLayout) view2.findViewById(C0906R.id.v8);
        if (TextUtils.equals("Meizu", Build.BRAND) && TextUtils.equals("m1note", Build.BOARD) && TextUtils.equals("M463C", Build.MODEL) && TextUtils.equals("m1 note", Build.PRODUCT) && Build.VERSION.SDK_INT == 19) {
            this.l.setPadding(this.l.getPaddingLeft(), this.l.getPaddingTop(), this.l.getPaddingRight(), com.ss.android.ugc.aweme.base.utils.p.d(GlobalContext.getContext()));
        }
        this.f2860f.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36534a;

            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f36534a, false, 27741, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f36534a, false, 27741, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
            }

            public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36534a, false, 27742, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36534a, false, 27742, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                int findLastVisibleItemPosition = ((LinearLayoutManager) VideoCommentDialogFragment2.this.f2860f.getLayoutManager()).findLastVisibleItemPosition();
                int itemCount = VideoCommentDialogFragment2.this.f2860f.getLayoutManager().getItemCount();
                if (findLastVisibleItemPosition >= 8 && itemCount - findLastVisibleItemPosition < 8 && ((com.ss.android.ugc.aweme.comment.e.g) VideoCommentDialogFragment2.this.m.i()).isHasMore()) {
                    VideoCommentDialogFragment2.this.k();
                }
            }
        });
        Context context2 = getContext();
        TextView textView = this.f2857c;
        ImageView imageView = (ImageView) this.f2858d;
        RelativeLayout relativeLayout = this.l;
        MentionEditText mentionEditText = this.g;
        ImageView imageView2 = this.h;
        if (PatchProxy.isSupport(new Object[]{context2, view2, textView, imageView, relativeLayout, mentionEditText, imageView2}, null, com.ss.android.ugc.aweme.comment.adapter.b.f36343a, true, 27217, new Class[]{Context.class, View.class, TextView.class, ImageView.class, ViewGroup.class, TextView.class, ImageView.class}, Void.TYPE)) {
            Object[] objArr = {context2, view2, textView, imageView, relativeLayout, mentionEditText, imageView2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.comment.adapter.b.f36343a, true, 27217, new Class[]{Context.class, View.class, TextView.class, ImageView.class, ViewGroup.class, TextView.class, ImageView.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.comment.adapter.b.a()) {
            textView.setTextColor(textView.getResources().getColor(C0906R.color.a0e));
            view2.setBackground(com.ss.android.ugc.bytex.a.a.a.a(view.getResources(), 2130837870));
            imageView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(imageView.getResources(), 2130839372));
            if (PatchProxy.isSupport(new Object[]{context2, relativeLayout, mentionEditText, imageView2}, null, com.ss.android.ugc.aweme.comment.adapter.b.f36343a, true, 27218, new Class[]{Context.class, ViewGroup.class, TextView.class, ImageView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, relativeLayout, mentionEditText, imageView2}, null, com.ss.android.ugc.aweme.comment.adapter.b.f36343a, true, 27218, new Class[]{Context.class, ViewGroup.class, TextView.class, ImageView.class}, Void.TYPE);
            } else {
                relativeLayout.setBackground(com.ss.android.ugc.bytex.a.a.a.a(relativeLayout.getResources(), 2130837871));
                mentionEditText.setHintTextColor(context2.getResources().getColor(C0906R.color.a0e));
                mentionEditText.setTextColor(context2.getResources().getColor(C0906R.color.a11));
                imageView2.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(context2.getResources(), 2130839357));
            }
        }
        bg.c(this);
        this.g.setFocusable(false);
        this.s.a(this.g, this.h, this.i, this.H, o());
        this.g.setTextSize(2, 15.0f);
    }

    private void a(PoiStruct poiStruct, boolean z2) {
        TextView textView;
        if (PatchProxy.isSupport(new Object[]{poiStruct, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27675, new Class[]{PoiStruct.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct, Byte.valueOf(z2)}, this, f2855a, false, 27675, new Class[]{PoiStruct.class, Boolean.TYPE}, Void.TYPE);
        } else if (!a(poiStruct)) {
            String charSequence = this.commercePrice.getText().toString();
            String charSequence2 = this.commerceSales.getText().toString();
            String charSequence3 = this.poiCouponText.getText().toString();
            TextPaint paint = this.commercePrice.getPaint();
            int measureText = ((int) paint.measureText(charSequence2)) + u.a(14.0d);
            int screenWidth = ((UIUtils.getScreenWidth(getContext()) - u.a(120.0d)) - (((int) paint.measureText(charSequence3)) + u.a(14.0d))) - ((int) paint.measureText(charSequence));
            int i2 = 8;
            if (screenWidth < measureText) {
                this.commerceBottomDivider2.setVisibility(8);
                this.commerceBottomDivider.setVisibility(8);
                textView = this.commerceSales;
            } else {
                this.commerceBottomDivider.setVisibility(0);
                textView = this.commerceSales;
                if (z2) {
                    i2 = 0;
                }
            }
            textView.setVisibility(i2);
        }
    }

    public final void b(com.ss.android.ugc.aweme.comment.widget.a aVar, Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{aVar, comment2}, this, f2855a, false, 27641, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, comment2}, this, f2855a, false, 27641, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
        } else if (comment2 != null && j()) {
            String o2 = o();
            String l2 = l();
            String cid = comment.getCid();
            if (PatchProxy.isSupport(new Object[]{o2, l2, cid}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27383, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{o2, l2, cid}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27383, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            } else {
                r.a("press_comment", (Map) com.ss.android.ugc.aweme.comment.f.a.a(o2, l2).a("comment_id", cid).f34114b);
            }
            if (AbTestManager.a().Z() && !com.ss.android.ugc.aweme.comment.f.f36433c.a(comment2)) {
                c(aVar, comment);
            }
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2855a, false, 27593, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2855a, false, 27593, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.r7, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    public static VideoCommentDialogFragment2 a(Activity activity, Aweme aweme, com.ss.android.ugc.aweme.comment.d.b bVar) {
        boolean z2;
        boolean z3;
        Aweme aweme2;
        boolean z4;
        VideoCommentDialogFragment2 videoCommentDialogFragment2;
        Aweme aweme3 = aweme;
        com.ss.android.ugc.aweme.comment.d.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{activity, aweme3, bVar2}, null, f2855a, true, 27713, new Class[]{Activity.class, Aweme.class, com.ss.android.ugc.aweme.comment.d.b.class}, VideoCommentDialogFragment2.class)) {
            return (VideoCommentDialogFragment2) PatchProxy.accessDispatch(new Object[]{activity, aweme3, bVar2}, null, f2855a, true, 27713, new Class[]{Activity.class, Aweme.class, com.ss.android.ugc.aweme.comment.d.b.class}, VideoCommentDialogFragment2.class);
        } else if (activity == null || aweme3 == null || activity.isFinishing()) {
            return null;
        } else {
            try {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                VideoCommentDialogFragment2 videoCommentDialogFragment22 = (VideoCommentDialogFragment2) supportFragmentManager.findFragmentByTag("comment");
                if (videoCommentDialogFragment22 == null) {
                    if (PatchProxy.isSupport(new Object[]{bVar2}, null, f2855a, true, 27714, new Class[]{com.ss.android.ugc.aweme.comment.d.b.class}, VideoCommentDialogFragment2.class)) {
                        videoCommentDialogFragment2 = (VideoCommentDialogFragment2) PatchProxy.accessDispatch(new Object[]{bVar2}, null, f2855a, true, 27714, new Class[]{com.ss.android.ugc.aweme.comment.d.b.class}, VideoCommentDialogFragment2.class);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("id", bVar2);
                        videoCommentDialogFragment2 = new VideoCommentDialogFragment2();
                        videoCommentDialogFragment2.setArguments(bundle);
                    }
                    videoCommentDialogFragment22 = videoCommentDialogFragment2;
                    videoCommentDialogFragment22.b(aweme3);
                    supportFragmentManager.beginTransaction().setCustomAnimations(C0906R.anim.a1, C0906R.anim.a2).add(C0906R.id.akx, videoCommentDialogFragment22, "comment").commitAllowingStateLoss();
                } else {
                    videoCommentDialogFragment22.b(aweme3);
                    if (PatchProxy.isSupport(new Object[]{bVar2}, videoCommentDialogFragment22, f2855a, false, 27577, new Class[]{com.ss.android.ugc.aweme.comment.d.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar2}, videoCommentDialogFragment22, f2855a, false, 27577, new Class[]{com.ss.android.ugc.aweme.comment.d.b.class}, Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[]{bVar2}, videoCommentDialogFragment22, f2855a, false, 27578, new Class[]{com.ss.android.ugc.aweme.comment.d.b.class}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, videoCommentDialogFragment22, f2855a, false, 27578, new Class[]{com.ss.android.ugc.aweme.comment.d.b.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            if (TextUtils.equals(bVar.getAid(), videoCommentDialogFragment22.f2856b.getAid()) && bVar.isCommentClose() == videoCommentDialogFragment22.f2856b.isCommentClose() && bVar.isCommentLimited() == videoCommentDialogFragment22.f2856b.isCommentLimited() && bVar.isEnableComment() == videoCommentDialogFragment22.f2856b.isEnableComment()) {
                                if (PatchProxy.isSupport(new Object[]{bVar2}, videoCommentDialogFragment22, f2855a, false, 27579, new Class[]{com.ss.android.ugc.aweme.comment.d.b.class}, Boolean.TYPE)) {
                                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, videoCommentDialogFragment22, f2855a, false, 27579, new Class[]{com.ss.android.ugc.aweme.comment.d.b.class}, Boolean.TYPE)).booleanValue();
                                } else {
                                    if (bVar2 == null || bVar.getAdCommentStruct() == null) {
                                        aweme2 = null;
                                    } else {
                                        aweme2 = j.a().a(bVar.getAdCommentStruct().getAid());
                                    }
                                    if (aweme2 == null || !aweme2.isAd() || !aweme2.getAwemeRawAd().isCommentAreaSwitch()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (videoCommentDialogFragment22.E != z4) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                if (!z3) {
                                    z2 = false;
                                }
                            }
                            z2 = true;
                        }
                        if (!z2 && videoCommentDialogFragment22.f2860f.getChildCount() != 0) {
                            if (!videoCommentDialogFragment22.E) {
                                videoCommentDialogFragment22.f2856b = bVar2;
                                if (videoCommentDialogFragment22.f2856b.isForceRefresh()) {
                                    videoCommentDialogFragment22.A();
                                }
                                videoCommentDialogFragment22.C();
                                videoCommentDialogFragment22.u();
                            }
                        }
                        videoCommentDialogFragment22.f2856b = bVar2;
                        if (PatchProxy.isSupport(new Object[0], videoCommentDialogFragment22, f2855a, false, 27708, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], videoCommentDialogFragment22, f2855a, false, 27708, new Class[0], Void.TYPE);
                        } else {
                            videoCommentDialogFragment22.S();
                            videoCommentDialogFragment22.R();
                        }
                        if (videoCommentDialogFragment22.R != null) {
                            videoCommentDialogFragment22.R.a();
                            videoCommentDialogFragment22.D.y_();
                        }
                        videoCommentDialogFragment22.s();
                        if (PatchProxy.isSupport(new Object[0], videoCommentDialogFragment22, f2855a, false, 27591, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], videoCommentDialogFragment22, f2855a, false, 27591, new Class[0], Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.comment.h.a().b();
                        }
                    }
                    if (bVar.isScrollToTop() && videoCommentDialogFragment22.f2860f != null) {
                        videoCommentDialogFragment22.f2860f.scrollToPosition(0);
                    }
                    if (PatchProxy.isSupport(new Object[0], videoCommentDialogFragment22, f2855a, false, 27711, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], videoCommentDialogFragment22, f2855a, false, 27711, new Class[0], Void.TYPE);
                    } else if (videoCommentDialogFragment22.P != null) {
                        CommentNestedLayout commentNestedLayout = videoCommentDialogFragment22.P;
                        if (PatchProxy.isSupport(new Object[0], commentNestedLayout, CommentNestedLayout.f36636a, false, 27813, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], commentNestedLayout, CommentNestedLayout.f36636a, false, 27813, new Class[0], Void.TYPE);
                        } else {
                            commentNestedLayout.a(true, true);
                        }
                    }
                }
                return videoCommentDialogFragment22;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.comment.a.a.a("VideoCommentDialogFragment2.showComment() error in try/catch. ErrorMessage: " + e2.getMessage());
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
                return null;
            }
        }
    }

    private void a(View view, int i2, int i3, boolean z2) {
        AwemeRawAd awemeRawAd;
        View view2 = view;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27616, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2)}, this, f2855a, false, 27616, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            int i6 = ((RelativeLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            if (z2) {
                if (i6 < 0) {
                    Context context = getContext();
                    if (this.r == null) {
                        awemeRawAd = null;
                    } else {
                        awemeRawAd = this.r.getAwemeRawAd();
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.b(context, awemeRawAd);
                    com.ss.android.ugc.aweme.utils.c.a(view2, i6, i4, i5).start();
                }
            } else if (i6 >= 0) {
                com.ss.android.ugc.aweme.utils.c.a(view2, i6, i4, i5).start();
            }
        }
    }

    private void a(Comment comment, int i2, int i3, String str, boolean z2) {
        String str2;
        String str3;
        String str4;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{comment, Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2855a, false, 27688, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z2)}, this, f2855a, false, 27688, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.sec.a.a("comment");
        if (i2 == 2) {
            String eventType = getEventType();
            String l2 = l();
            if (comment != null) {
                str4 = comment.getCid();
            } else {
                str4 = "";
            }
            String E2 = E();
            boolean isMyProfile = this.f2856b.isMyProfile();
            if (this.r == null || this.r.getAwemeType() != 2) {
                z3 = false;
            } else {
                z3 = true;
            }
            com.ss.android.ugc.aweme.comment.f.a.a("post_reply_comment", eventType, l2, str4, E2, isMyProfile, z3);
        }
        if (TextUtils.equals(this.f2856b.getEventType(), "homepage_follow")) {
            Aweme aweme = this.r;
            if (comment != null) {
                str3 = comment.getCid();
            } else {
                str3 = "";
            }
            com.ss.android.ugc.aweme.newfollow.g.a.b(aweme, "homepage_follow", "list", str3);
        }
        Aweme aweme2 = this.r;
        String o2 = o();
        String a2 = com.ss.android.ugc.aweme.comment.f.a.a(comment);
        if (comment != null) {
            str2 = comment.getCid();
        } else {
            str2 = "";
        }
        com.ss.android.ugc.aweme.comment.f.a.a(aweme2, str, o2, a2, str2, "list", String.valueOf(i3), this.f2856b.getIsLongItem(), this.f2856b.getEnterMethod(), this.f2856b.getPlayListType(), this.f2856b.getPlayListIdKey(), this.f2856b.getPlayListId(), z2);
        if (this.p != null) {
            this.p.onEvent(l());
        }
    }
}
