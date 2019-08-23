package com.ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.CommerceTag;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.commercialize.link.f;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.s;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ah;
import com.ss.android.ugc.aweme.feed.f.aj;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoFeedTagWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoPostTimeWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget;
import com.ss.android.ugc.aweme.feed.k.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.ak;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.profile.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ed;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedImageViewHolder extends BaseFeedViewHolder implements ak {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f44687b;

    /* renamed from: a  reason: collision with root package name */
    private Context f44688a;

    /* renamed from: c  reason: collision with root package name */
    String f44689c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f44690d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f44691e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f44692f;
    public int g;
    long h = -1;
    @BindView(2131493203)
    LinearLayout llAwemeIntro;
    @BindView(2131496748)
    LinearLayout llRightMenu;
    private Aweme m;
    @BindView(2131493202)
    ViewGroup mAwemeInCheckLayout;
    @BindView(2131493317)
    View mBottomView;
    @BindView(2131493711)
    CommerceTag mCommerceTagView;
    @BindView(2131493827)
    RemoteImageView mCoverView;
    @BindView(2131494519)
    View mGradualBottomView;
    @BindView(2131496168)
    LineProgressBar mLineProgressBar;
    @BindView(2131495688)
    LongPressLayout mLongPressLayout;
    @BindView(2131498527)
    FrameLayout mRootView;
    @BindView(2131497614)
    LinearLayout mTitleLayout;
    @BindView(2131497590)
    TextView mTitleView;
    @BindView(2131493517)
    TextView mTvChallenge;
    @BindView(2131497907)
    TextView mTxtExtra;
    @BindView(2131498632)
    RelativeLayout mWidgetContainer;
    private aa<ar> n;
    private boolean o;
    private JSONObject p;
    private int q;
    private Fragment r;
    @BindView(2131498476)
    TagLayout tagLayout;

    public boolean a(Aweme aweme) {
        return true;
    }

    public final int c() {
        return 2;
    }

    public final IFeedPlayerView k() {
        return null;
    }

    public final boolean C() {
        return this.f44691e;
    }

    public final Context b() {
        return this.f44688a;
    }

    public final Aweme d() {
        return this.m;
    }

    private boolean w() {
        return this.f44688a instanceof MainActivity;
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40369, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("stopPlayAnimation", (Object) Boolean.TRUE);
        }
    }

    private JSONObject v() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40382, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40382, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_photo", 1);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40368, new Class[0], Void.TYPE);
            return;
        }
        n();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40367, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f44690d) {
            l();
            this.f44690d = true;
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40384, new Class[0], Void.TYPE);
            return;
        }
        this.h = System.currentTimeMillis();
        if (this.j != null) {
            this.j.a("image_resume", (Object) Boolean.TRUE);
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40392, new Class[0], Void.TYPE);
            return;
        }
        n();
        if (this.j != null) {
            this.j.a("on_image_page_unselected", (Object) null);
        }
    }

    public final void t_() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40365, new Class[0], Void.TYPE);
            return;
        }
        super.t_();
        if (this.mLineProgressBar != null) {
            this.mLineProgressBar.c();
        }
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40379, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new ah(this.f44689c, w()));
        bg.a(new aj(this.f44688a.hashCode()));
        if (((Integer) SharePrefCache.inst().getScrollToProfileGuideState().c()).intValue() == 0) {
            SharePrefCache.inst().getScrollToProfileGuideState().a(1);
        }
    }

    public final void i() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40385, new Class[0], Void.TYPE);
            return;
        }
        if (a.a().l && (!c.Q(this.m) || c.R(this.m) || com.ss.android.ugc.aweme.commercialize.splash.a.a().l)) {
            i = -a.a().b();
        }
        if (a.d()) {
            i += a.f61216b;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mWidgetContainer.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.mWidgetContainer.setLayoutParams(layoutParams);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40383, new Class[0], Void.TYPE);
        } else if (this.h != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.h;
            this.h = -1;
            r.onEvent(MobClick.obtain().setEventName("play_time").setLabelName(this.f44689c).setValue(this.m.getAid()).setExtValueLong(currentTimeMillis).setJsonObject(v()));
            r.a("play_time", (Map) d.a().a("enter_from", this.f44689c).a("group_id", this.m.getAid()).a("duration", currentTimeMillis).f34114b);
            if (this.j != null) {
                this.j.a("image_pause", (Object) Boolean.TRUE);
            }
        }
    }

    public void l() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40374, new Class[0], Void.TYPE);
            return;
        }
        VideoItemParams requestId = VideoItemParams.newBuilder().setAweme(this.m).setEventType(this.f44689c).setMyProfile(this.f44692f).setPageType(this.g).setEnterMethodValue(this.l).setRequestId(this.p);
        if (this.j != null) {
            this.j.a("video_params", (Object) requestId);
        }
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40375, new Class[0], Void.TYPE);
        } else {
            List<ImageInfo> imageInfos = this.m.getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = imageInfos.get(0);
                if (imageInfo != null) {
                    this.mCoverView.setVisibility(0);
                    this.mLineProgressBar.a();
                    com.ss.android.ugc.aweme.base.c.b(this.mCoverView, imageInfo.getLabelLarge());
                    com.ss.android.ugc.aweme.base.c.a(imageInfo.getLabelLarge(), (c.a) new c.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f44693a;

                        public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                            if (PatchProxy.isSupport(new Object[]{dataSource}, this, f44693a, false, 40399, new Class[]{DataSource.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dataSource}, this, f44693a, false, 40399, new Class[]{DataSource.class}, Void.TYPE);
                                return;
                            }
                            FeedImageViewHolder.this.mLineProgressBar.b();
                        }

                        public final void a(Exception exc) {
                            if (PatchProxy.isSupport(new Object[]{exc}, this, f44693a, false, 40400, new Class[]{Exception.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{exc}, this, f44693a, false, 40400, new Class[]{Exception.class}, Void.TYPE);
                                return;
                            }
                            FeedImageViewHolder.this.mLineProgressBar.b();
                        }
                    });
                }
            }
        }
        User author = this.m.getAuthor();
        if (author != null) {
            this.mTitleView.setText(this.f44688a.getString(C0906R.string.ae_, new Object[]{author.getNickname()}));
            this.mTitleView.getPaint().setFakeBoldText(true);
        } else {
            this.mTitleView.setText("");
        }
        if (this.m == null || this.m.isCanPlay()) {
            this.mTitleView.setVisibility(0);
        } else {
            this.mTitleView.setVisibility(4);
        }
        this.tagLayout.setEventType(this.f44689c);
        List<AwemeLabelModel> videoLabels = this.m.getVideoLabels();
        if (PatchProxy.isSupport(new Object[]{videoLabels}, this, f44687b, false, 40377, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoLabels}, this, f44687b, false, 40377, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(videoLabels)) {
            for (int i = 0; i < videoLabels.size(); i++) {
                AwemeLabelModel awemeLabelModel = videoLabels.get(i);
                if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 1 && !b.b(this.m) && this.m.getStatus() != null && this.m.getStatus().getPrivateStatus() == 1) {
                    videoLabels.remove(awemeLabelModel);
                }
            }
        }
        if (StringUtils.equal(this.f44689c, "homepage_hot")) {
            this.tagLayout.a(this.m, videoLabels, new TagLayout.a(7, 20));
        } else {
            this.tagLayout.b(this.m, videoLabels, new TagLayout.a(7, 20));
        }
        TextUtils.isEmpty(this.m.getExtra());
        this.mTxtExtra.setVisibility(8);
        if (this.m.getUserDigg() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44687b, false, 40381, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44687b, false, 40381, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.j != null) {
            this.j.a("update_diig_view_from_panel", (Object) Boolean.valueOf(z));
        }
        if (this.f44688a instanceof MainActivity) {
            a(com.ss.android.ugc.aweme.main.a.a().f54286b);
        }
        AwemeStatus status = this.m.getStatus();
        if (status == null) {
            this.mAwemeInCheckLayout.setVisibility(8);
        } else if (status.isInReviewing()) {
            this.mAwemeInCheckLayout.setVisibility(0);
        } else {
            this.mAwemeInCheckLayout.setVisibility(8);
        }
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40376, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.utils.c.a(this.mBottomView);
        }
        i();
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40394, new Class[0], Void.TYPE);
            return;
        }
        this.mCommerceTagView.setVisibility(8);
        if (f.a("shopping_cart", this.m, false, this.g)) {
            if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40395, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40395, new Class[0], Void.TYPE);
                return;
            }
            this.mCommerceTagView.setVisibility(0);
            if (!(this.m.getPromotion() == null || this.m.getPromotion().getShortTitle() == null)) {
                this.mCommerceTagView.a(this.m.getPromotion().getShortTitle());
            }
        }
    }

    public Aweme d(int i) {
        return this.m;
    }

    private void f(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44687b, false, 40364, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44687b, false, 40364, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.n == null || this.m == null)) {
            this.n.a(new ar(i, d(i)));
        }
    }

    public final void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f44687b, false, 40380, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f44687b, false, 40380, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (!(this.f44688a == null || aweme == null || this.j == null)) {
            this.j.a("handle_double_click", (Object) aweme);
        }
    }

    public final void e(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44687b, false, 40386, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44687b, false, 40386, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.mBottomView.getLayoutParams()).bottomMargin = i;
        this.mBottomView.requestLayout();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44687b, false, 40391, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44687b, false, 40391, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("on_image_page_selected", (Object) null);
        }
        a(false);
        com.ss.android.ugc.aweme.feed.b.a(this.g, this.m.getAid(), 2);
        this.mLineProgressBar.b();
        r.onEvent(MobClick.obtain().setEventName("show").setLabelName(this.f44689c).setValue(this.m.getAid()).setJsonObject(v()));
        r.onEvent(MobClick.obtain().setEventName("video_play").setLabelName(this.f44689c).setValue(this.m.getAid()).setJsonObject(v()));
        this.h = System.currentTimeMillis();
        this.o = false;
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40396, new Class[0], Void.TYPE);
            return;
        }
        if (!this.o) {
            this.o = true;
            s.a(this.m, (View) this.mCommerceTagView, this.f44689c);
        }
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44687b, false, 40388, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44687b, false, 40388, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            an.a(this.llRightMenu, this.llRightMenu.getAlpha(), 0.0f);
            an.a(this.llAwemeIntro, this.llAwemeIntro.getAlpha(), 0.0f);
            an.a(this.mBottomView, this.mBottomView.getAlpha(), 0.0f);
            this.f44691e = true;
        } else {
            an.a(this.llRightMenu, this.llRightMenu.getAlpha(), 1.0f);
            an.a(this.llAwemeIntro, this.llAwemeIntro.getAlpha(), 1.0f);
            an.a(this.mBottomView, this.mBottomView.getAlpha(), 1.0f);
            if (this.f44691e) {
                this.f44691e = false;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r0.equals("video_comment_list") != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.ss.android.ugc.aweme.arch.widgets.base.a r7 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44687b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 40397(0x9dcd, float:5.6608E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44687b
            r3 = 0
            r4 = 40397(0x9dcd, float:5.6608E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r0 = r7.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            r3 = 3
            switch(r2) {
                case -1618328215: goto L_0x006a;
                case -492284990: goto L_0x0061;
                case -162745511: goto L_0x0057;
                case 1181771620: goto L_0x004d;
                case 1964086245: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0074
        L_0x0043:
            java.lang.String r2 = "to_profile"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0074
            r8 = 4
            goto L_0x0075
        L_0x004d:
            java.lang.String r2 = "video_share_click"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0074
            r8 = 2
            goto L_0x0075
        L_0x0057:
            java.lang.String r2 = "feed_internal_event"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0074
            r8 = 3
            goto L_0x0075
        L_0x0061:
            java.lang.String r2 = "video_comment_list"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0074
            goto L_0x0075
        L_0x006a:
            java.lang.String r2 = "video_digg"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0074
            r8 = 0
            goto L_0x0075
        L_0x0074:
            r8 = -1
        L_0x0075:
            switch(r8) {
                case 0: goto L_0x009d;
                case 1: goto L_0x008f;
                case 2: goto L_0x008b;
                case 3: goto L_0x007d;
                case 4: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x00ab
        L_0x0079:
            r10.q()
            goto L_0x00ab
        L_0x007d:
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r0 = r10.n
            if (r0 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r0 = r10.n
            java.lang.Object r1 = r7.a()
            r0.a(r1)
            return
        L_0x008b:
            r10.f(r3)
            return
        L_0x008f:
            java.lang.Object r0 = r7.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10.f(r0)
            return
        L_0x009d:
            java.lang.Object r0 = r7.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10.f(r0)
            return
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder.onChanged(java.lang.Object):void");
    }

    @OnClick({2131497590, 2131493317, 2131493202, 2131493711})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44687b, false, 40378, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44687b, false, 40378, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.title) {
            if (this.m != null && (!this.m.isCanPlay() || this.m.isDelete())) {
                com.bytedance.ies.dmt.ui.d.a.b(this.f44688a, (int) C0906R.string.b0y).a();
            } else if (!(this.m == null || this.m.getAuthor() == null || !a(this.m))) {
                f(18);
                q();
            }
        } else if (id == C0906R.id.xl) {
            f(30);
            s.a(this.f44688a, this.m, this.f44689c);
        } else if (id == C0906R.id.il && this.m != null && !TextUtils.isEmpty(this.m.getAid())) {
            Intent intent = new Intent(b(), CrossPlatformActivity.class);
            intent.setData(Uri.parse(String.format("https://aweme.snssdk.com/falcon/douyin_falcon/reviewing/?itemId=%s", new Object[]{this.m.getAid()})));
            intent.putExtra("hide_nav_bar", true);
            b().startActivity(intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.f.ad r13) {
        /*
            r12 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f44687b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.ad> r1 = com.ss.android.ugc.aweme.feed.f.ad.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 40371(0x9db3, float:5.6572E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f44687b
            r3 = 0
            r4 = 40371(0x9db3, float:5.6572E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.ad> r1 = com.ss.android.ugc.aweme.feed.f.ad.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.m
            java.lang.String r0 = r0.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f45279b
            java.lang.String r1 = r1.getAid()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0045
            return
        L_0x0045:
            com.ss.android.ugc.aweme.feed.model.PrivateUrlModel r0 = r13.f45278a
            com.ss.android.ugc.aweme.base.model.UrlModel r10 = r0.labelPrivate
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.m
            r0.setLabelPrivate(r10)
            int r7 = r13.f45280c
            r11 = 2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r9] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f44687b
            r3 = 0
            r4 = 40390(0x9dc6, float:5.6598E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r1 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0095
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r9] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f44687b
            r3 = 0
            r4 = 40390(0x9dc6, float:5.6598E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r1 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00eb
        L_0x0095:
            r0 = 0
            if (r10 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.feed.model.AwemeLabelModel r0 = new com.ss.android.ugc.aweme.feed.model.AwemeLabelModel
            r0.<init>()
            r0.setLabelType(r7)
            r0.setUrlModels(r10)
        L_0x00a3:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.m
            if (r1 == 0) goto L_0x00eb
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.m
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r1 = r1.videoLabels
            if (r1 == 0) goto L_0x00eb
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.m
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r1 = r1.videoLabels
            int r1 = r1.size()
            r2 = 0
        L_0x00b6:
            if (r2 >= r1) goto L_0x00e2
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r12.m
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r3 = r3.videoLabels
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.feed.model.AwemeLabelModel r3 = (com.ss.android.ugc.aweme.feed.model.AwemeLabelModel) r3
            int r3 = r3.getLabelType()
            if (r3 == r8) goto L_0x00d0
            r4 = 11
            if (r3 != r4) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            int r2 = r2 + 1
            goto L_0x00b6
        L_0x00d0:
            if (r7 != 0) goto L_0x00da
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.m
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r0 = r0.videoLabels
            r0.remove(r2)
            goto L_0x00eb
        L_0x00da:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.m
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r1 = r1.videoLabels
            r1.set(r2, r0)
            goto L_0x00eb
        L_0x00e2:
            if (r7 == 0) goto L_0x00eb
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.m
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r1 = r1.videoLabels
            r1.add(r9, r0)
        L_0x00eb:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getIsPrivateAvailable()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0121
            if (r10 == 0) goto L_0x0121
            java.util.List r0 = r10.getUrlList()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0121
            com.ss.android.ugc.aweme.base.ui.TagLayout r0 = r12.tagLayout
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.m
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.m
            java.util.List r2 = r2.getVideoLabels()
            com.ss.android.ugc.aweme.base.ui.TagLayout$a r3 = new com.ss.android.ugc.aweme.base.ui.TagLayout$a
            r4 = 7
            r5 = 20
            r3.<init>(r4, r5)
            r0.b(r1, r2, r3)
            return
        L_0x0121:
            com.ss.android.ugc.aweme.base.ui.TagLayout r0 = r12.tagLayout
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder.a(com.ss.android.ugc.aweme.feed.f.ad):void");
    }

    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44687b, false, 40393, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44687b, false, 40393, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (z) {
            this.mWidgetContainer.setVisibility(4);
        } else {
            this.mWidgetContainer.setVisibility(0);
        }
    }

    public void a(Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, f44687b, false, 40366, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, this, f44687b, false, 40366, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
        } else if (aweme != null) {
            this.m = aweme;
            this.f44690d = z;
            this.h = System.currentTimeMillis();
            if (this.f44690d) {
                l();
            }
            this.mWidgetContainer.setVisibility(0);
        }
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f44687b, false, 40363, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f44687b, false, 40363, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        this.j.a("playlist_id", (Object) str6);
        this.j.a("playlist_type", (Object) str4);
        this.j.a("playlist_id_key", (Object) str5);
    }

    public FeedImageViewHolder(int i, View view, aa<ar> aaVar, String str, View.OnTouchListener onTouchListener, Fragment fragment, int i2) {
        this.f44688a = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.mGradualBottomView.getLayoutParams().height = (UIUtils.getScreenHeight(this.f44688a) * 3) / 4;
        this.f44689c = str;
        this.q = i;
        this.r = fragment;
        this.g = i2;
        this.n = aaVar;
        if ("upload".equals(this.f44689c)) {
            this.f44689c = null;
        }
        this.mTitleView.setOnTouchListener(ed.a(0.5f, 1.0f));
        this.mLongPressLayout.setListener(new d(this, i));
        this.mLongPressLayout.setTapListener(onTouchListener);
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40372, new Class[0], Void.TYPE);
            return;
        }
        this.j = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.c.a(this.r, this), (LifecycleOwner) this.r);
        this.j.a("update_diig_view", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("video_digg", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("feed_internal_event", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("video_share_click", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("to_profile", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("video_comment_list", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
        this.k = WidgetManager.a(this.r, (View) this.mRootView);
        this.k.a(this.j);
        this.k.b(C0906R.id.a51, new VideoDiggWidget(this.f44689c)).b(C0906R.id.dta, new VideoDescWidget()).b(C0906R.id.ad1, new VideoFeedTagWidget()).b(C0906R.id.i5, new FeedAvatarWidget(this)).b(C0906R.id.cpx, new VideoShareWidget()).b(C0906R.id.vd, new VideoCommentWidget());
        if (PatchProxy.isSupport(new Object[0], this, f44687b, false, 40373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44687b, false, 40373, new Class[0], Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.n() && TextUtils.equals(this.f44689c, "homepage_follow")) {
            this.k.b(C0906R.id.dsp, new VideoPostTimeWidget());
        }
    }
}
