package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.ao;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.festival.common.FestivalResHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.h;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import java.io.File;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoShareView extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    boolean m;
    @BindView(2131497128)
    View mLayout;
    @BindView(2131497088)
    View mShareContainerView;
    @BindView(2131497092)
    TextView mShareCount;
    private boolean n;
    private boolean o;
    private String p;
    private long q;
    private boolean r;
    @BindView(2131497101)
    RemoteImageView shareIv;

    public final void b() {
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43336, new Class[0], Void.TYPE);
        } else if (ex.b()) {
            this.shareIv.setImageResource(2130839644);
            v.a((View) this.mShareCount, 8);
        } else if (this.f3210b == null || this.f3210b.getAuthor() == null || !TextUtils.equals(this.f3210b.getAuthor().getUid(), d.a().getCurUser().getUid())) {
            try {
                this.shareIv.setImageResource(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getShareIconResource());
            } catch (Exception unused) {
            }
        } else {
            this.shareIv.setImageResource(2130839644);
        }
    }

    private boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43340, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 43340, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3210b == null) {
            return false;
        } else {
            User author = this.f3210b.getAuthor();
            if (author != null) {
                return TextUtils.equals(author.getUid(), d.a().getCurUser().getUid());
            }
            return false;
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43342, new Class[0], Void.TYPE);
            return;
        }
        if (this.m) {
            this.m = false;
            i();
        }
        if (this.r) {
            this.r = false;
            if (this.mShareCount != null && this.mShareCount.getVisibility() == 0 && !TextUtils.isEmpty(this.p)) {
                this.mShareCount.setText(this.p);
            }
            i();
        }
        if (this.o) {
            this.o = false;
            i();
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43343, new Class[0], Void.TYPE);
            return;
        }
        this.mShareContainerView.animate().cancel();
        Animation animation = this.mShareContainerView.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        if (com.ss.android.ugc.aweme.festival.christmas.a.a()) {
            a();
        } else {
            this.shareIv.setImageResource(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getShareIconResource());
        }
        this.mShareContainerView.setScaleX(1.0f);
        this.mShareContainerView.setScaleY(1.0f);
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43346, new Class[0], Void.TYPE);
        } else if (!ex.b() && !this.o && !this.r) {
            if (TextUtils.equals(e.d().a("last_share_type", ""), "TYPE_FAVORITE")) {
                a(this.f3210b);
                return;
            }
            this.m = true;
            this.mShareContainerView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46348a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f46348a, false, 43361, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46348a, false, 43361, new Class[0], Void.TYPE);
                        return;
                    }
                    if (!b.c() || !TextUtils.equals(ao.b(), "chat_merge")) {
                        Drawable shareGuideAnimationIcon = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getShareGuideAnimationIcon((Activity) VideoShareView.this.h);
                        if (shareGuideAnimationIcon != null) {
                            VideoShareView.this.shareIv.setImageDrawable(shareGuideAnimationIcon);
                            r.a("share_highlight", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", VideoShareView.this.f3211c).a("group_id", aa.m(VideoShareView.this.f3210b)).a("author_id", aa.a(VideoShareView.this.f3210b)).a("show_content", ao.b()).f34114b);
                        }
                    } else {
                        b.a(VideoShareView.this.h, VideoShareView.this.shareIv, 4);
                        r.a("share_highlight", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", VideoShareView.this.f3211c).a("group_id", aa.m(VideoShareView.this.f3210b)).a("author_id", aa.a(VideoShareView.this.f3210b)).a("show_content", ao.b()).f34114b);
                    }
                    VideoShareView.this.mShareContainerView.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150).withEndAction(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f46350a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f46350a, false, 43362, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f46350a, false, 43362, new Class[0], Void.TYPE);
                                return;
                            }
                            VideoShareView.this.mShareContainerView.animate().scaleX(0.95f).scaleY(0.95f).setDuration(150).withEndAction(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f46352a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f46352a, false, 43363, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f46352a, false, 43363, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.02f, 0.95f, 1.02f, 1, 0.5f, 1, 0.5f);
                                    scaleAnimation.setDuration(600);
                                    scaleAnimation.setRepeatMode(2);
                                    scaleAnimation.setRepeatCount(-1);
                                    VideoShareView.this.mShareContainerView.startAnimation(scaleAnimation);
                                }
                            }).start();
                        }
                    }).start();
                }
            }).start();
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43350, new Class[0], Void.TYPE);
            return;
        }
        if (this.shareIv != null) {
            this.shareIv.setImageResource(2130838914);
        }
        if (this.mShareContainerView != null) {
            this.mShareContainerView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new bz(this)).start();
        }
    }

    public final void a() {
        Drawable drawable;
        File file;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43335, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.festival.christmas.a.a() || g()) {
            f();
        } else {
            if (PatchProxy.isSupport(new Object[0], null, FestivalResHandler.f47284a, true, 43983, new Class[0], Drawable.class)) {
                drawable = (Drawable) PatchProxy.accessDispatch(new Object[0], null, FestivalResHandler.f47284a, true, 43983, new Class[0], Drawable.class);
            } else {
                Drawable a2 = FestivalResHandler.a("share_icon.png");
                if (a2 != null) {
                    drawable = a2;
                } else {
                    if (PatchProxy.isSupport(new Object[0], null, FestivalResHandler.f47284a, true, 43982, new Class[0], File.class)) {
                        file = (File) PatchProxy.accessDispatch(new Object[0], null, FestivalResHandler.f47284a, true, 43982, new Class[0], File.class);
                    } else {
                        file = FestivalResHandler.b("share_icon.png");
                    }
                    drawable = FestivalResHandler.a(file);
                    if (drawable != null) {
                        FestivalResHandler.a("share_icon.png", drawable);
                    }
                }
            }
            if (drawable == null) {
                f();
            } else {
                this.shareIv.setImageDrawable(drawable);
            }
        }
    }

    public VideoShareView(View view) {
        super(view);
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, l, false, 43338, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, l, false, 43338, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        dataCenter.a("video_show_share_guide_animation", (Observer<a>) this).a("update_diig_view", (Observer<a>) this).a("video_on_pause", (Observer<a>) this).a("pause_share_guide_animation", (Observer<a>) this).a("recover_share_guide_animation", (Observer<a>) this).a("on_page_unselected", (Observer<a>) this).a("on_page_selected", (Observer<a>) this).a("image_pause", (Observer<a>) this).a("on_image_page_selected", (Observer<a>) this).a("handle_double_click", (Observer<a>) this).a("show_festival_activity_icon", (Observer<a>) this).a("video_show_flip_share_drawable", (Observer<a>) this);
    }

    private void a(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, l, false, 43349, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, l, false, 43349, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme != null && !aweme.isProhibited() && !this.n && aweme.getUserDigg() == 0 && !this.m) {
            this.r = true;
            SharePrefCache.inst().getIsShowFavouriteIcon().a(Boolean.TRUE);
            if (this.mShareCount != null && this.mShareCount.getVisibility() == 0) {
                if (this.mShareCount.getText() != null) {
                    str = this.mShareCount.getText().toString();
                } else {
                    str = "";
                }
                this.p = str;
                this.mShareCount.setText(this.h.getString(C0906R.string.cdz));
            }
            k();
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43334, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43334, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_share);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        ButterKnife.bind((Object) this, view);
        this.mShareContainerView.setOnTouchListener(v.a());
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43354, new Class[0], Void.TYPE);
            return;
        }
        this.mLayout.setContentDescription(this.h.getString(C0906R.string.c6i));
        this.shareIv.setContentDescription(this.h.getString(C0906R.string.c6i));
    }

    @OnClick({2131497088, 2131497092})
    public void onClick(View view) {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2;
        String str2;
        JSONObject jSONObject3;
        String str3;
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43341, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43341, new Class[]{View.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.q < 800) {
            this.q = 0;
            return;
        }
        this.q = currentTimeMillis;
        if (this.f3210b != null) {
            if (this.f3210b.isCanPlay() || com.ss.android.ugc.aweme.favorites.d.b.a(this.f3210b, this.f3214f)) {
                this.g.a("video_share_click", (Object) null);
                if (this.m) {
                    r.a("share_highlight_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", aa.m(this.f3210b)).a("author_id", aa.a(this.f3210b)).a("show_content", ao.b()).a("is_pop_up", 0).f34114b);
                } else {
                    com.ss.android.ugc.aweme.feed.g.e a2 = com.ss.android.ugc.aweme.feed.g.e.a();
                    RemoteImageView remoteImageView = this.shareIv;
                    String str4 = this.f3211c;
                    String m2 = aa.m(this.f3210b);
                    String a3 = aa.a(this.f3210b);
                    if (PatchProxy.isSupport(new Object[]{remoteImageView, str4, m2, a3}, a2, com.ss.android.ugc.aweme.feed.g.e.f45352a, false, 41327, new Class[]{ImageView.class, String.class, String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{remoteImageView, str4, m2, a3}, a2, com.ss.android.ugc.aweme.feed.g.e.f45352a, false, 41327, new Class[]{ImageView.class, String.class, String.class, String.class}, Void.TYPE);
                    } else {
                        View findViewById = remoteImageView.getRootView().findViewById(C0906R.id.b16);
                        if (findViewById != null) {
                            if (findViewById.getVisibility() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z = z2;
                        } else {
                            z = false;
                        }
                        a2.a(remoteImageView, 2, str4, m2, a3, Boolean.valueOf(z));
                        if (z) {
                            findViewById.setVisibility(8);
                        }
                    }
                }
                com.ss.android.ugc.aweme.sec.a.a("share");
                h();
                if (this.f3211c == null) {
                    this.f3211c = "";
                }
                JSONObject jSONObject4 = new JSONObject();
                if (e()) {
                    try {
                        jSONObject4.put("is_photo", 1);
                    } catch (JSONException unused) {
                    }
                }
                String str5 = this.f3211c;
                char c2 = 65535;
                int hashCode = str5.hashCode();
                if (hashCode != -1271119582) {
                    if (hashCode == 1691937916 && str5.equals("homepage_hot")) {
                        c2 = 0;
                    }
                } else if (str5.equals("homepage_follow")) {
                    c2 = 1;
                }
                switch (c2) {
                    case 0:
                        Context applicationContext = this.h.getApplicationContext();
                        String aid = this.f3210b.getAid();
                        if (e()) {
                            jSONObject = jSONObject4;
                        } else {
                            jSONObject = null;
                        }
                        r.a(applicationContext, "click_share_button", "homepage_hot", aid, 0, jSONObject);
                        if (c.t(this.f3210b)) {
                            Context context = this.h;
                            Aweme aweme = this.f3210b;
                            if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31747, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31747, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            } else if (!com.ss.android.g.a.a()) {
                                com.ss.android.ugc.aweme.commercialize.log.d.a().a("draw_ad").b("otherclick").b(aweme).d("share_sign").a(context);
                            }
                        }
                        h a4 = new h().e("homepage_hot").f("homepage_hot").f(this.f3210b).c((String) this.g.b("playlist_id", "")).b((String) this.g.b("playlist_id_key", "")).a((String) this.g.b("playlist_type", ""));
                        if (this.f3210b.getAuthor() == null) {
                            str = "";
                        } else {
                            str = this.f3210b.getAuthor().getUid();
                        }
                        a4.i(str).e();
                        break;
                    case 1:
                        Context applicationContext2 = this.h.getApplicationContext();
                        String aid2 = this.f3210b.getAid();
                        if (e()) {
                            jSONObject2 = jSONObject4;
                        } else {
                            jSONObject2 = null;
                        }
                        r.a(applicationContext2, "click_share_button", "homepage_follow", aid2, 0, jSONObject2);
                        h a5 = new h().e("homepage_follow").f("homepage_follow").f(this.f3210b).c((String) this.g.b("playlist_id", "")).b((String) this.g.b("playlist_id_key", "")).a((String) this.g.b("playlist_type", ""));
                        if (this.f3210b.getAuthor() == null) {
                            str2 = "";
                        } else {
                            str2 = this.f3210b.getAuthor().getUid();
                        }
                        a5.i(str2).e();
                        break;
                    default:
                        if (this.h instanceof DetailActivity) {
                            Context applicationContext3 = this.h.getApplicationContext();
                            String str6 = this.f3211c;
                            String aid3 = this.f3210b.getAid();
                            if (e()) {
                                jSONObject3 = jSONObject4;
                            } else {
                                jSONObject3 = null;
                            }
                            r.a(applicationContext3, "click_share_button", str6, aid3, 0, jSONObject3);
                            h a6 = new h().e(this.f3211c).f(this.f3211c).f(this.f3210b).c((String) this.g.b("playlist_id", "")).b((String) this.g.b("playlist_id_key", "")).a((String) this.g.b("playlist_type", ""));
                            if (this.f3210b.getAuthor() == null) {
                                str3 = "";
                            } else {
                                str3 = this.f3210b.getAuthor().getUid();
                            }
                            a6.i(str3).e();
                            break;
                        }
                        break;
                }
                bg.a(new com.ss.android.ugc.aweme.main.a.a());
            } else if (this.f3210b.isImage()) {
                com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.b0y).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.drx).a();
            }
        }
    }

    public final void a(VideoItemParams videoItemParams) {
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, l, false, 43337, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, l, false, 43337, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
        if (this.f3210b != null) {
            this.mShareContainerView.setVisibility(0);
            this.mShareCount.setVisibility(0);
            User author = this.f3210b.getAuthor();
            a();
            AbTestModel d2 = AbTestManager.a().d();
            if (g() || !am.b(this.f3210b) || com.ss.android.ugc.aweme.favorites.d.b.a(this.f3210b, this.f3214f)) {
                this.mShareContainerView.setAlpha(1.0f);
                this.mShareContainerView.setEnabled(true);
            } else {
                this.mShareContainerView.setAlpha(0.5f);
                this.mShareContainerView.setEnabled(false);
            }
            AwemeStatistics statistics = this.f3210b.getStatistics();
            if (statistics == null || author == null) {
                this.mShareCount.setVisibility(8);
            } else if (TextUtils.equals(d.a().getCurUserId(), author.getUid())) {
                this.mShareCount.setVisibility(8);
            } else if (d2 == null) {
                this.mShareCount.setVisibility(8);
            } else if (d2.shareButtonStyle == 2) {
                this.mShareCount.setVisibility(0);
                this.mShareCount.setTextSize(1, 10.0f);
                this.mShareCount.setText(C0906R.string.drp);
            } else if (d2.shareButtonStyle == 3) {
                this.mShareCount.setVisibility(0);
                this.mShareCount.setTextSize(1, 12.0f);
                this.mShareCount.setText(com.ss.android.ugc.aweme.i18n.b.a((long) statistics.getShareCount()));
            } else {
                this.mShareCount.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, l, false, 43353, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, l, false, 43353, new Class[0], Void.TYPE);
                return;
            }
            if (ex.b()) {
                this.shareIv.setImageResource(2130839644);
                v.a((View) this.mShareCount, 8);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            com.ss.android.ugc.aweme.arch.widgets.base.a r8 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43339(0xa94b, float:6.0731E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43339(0xa94b, float:6.0731E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            if (r8 == 0) goto L_0x056e
            java.lang.String r0 = r8.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            r11 = 6
            r12 = 2
            switch(r2) {
                case -1780252142: goto L_0x00be;
                case -1475411887: goto L_0x00b4;
                case -777668341: goto L_0x00aa;
                case 245017106: goto L_0x009f;
                case 249129690: goto L_0x0095;
                case 281945252: goto L_0x008a;
                case 350216171: goto L_0x007f;
                case 800761863: goto L_0x0074;
                case 920041496: goto L_0x006a;
                case 1346787590: goto L_0x0060;
                case 1628582276: goto L_0x0055;
                case 1863388195: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x00c8
        L_0x004a:
            java.lang.String r2 = "video_show_share_guide_animation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 6
            goto L_0x00c9
        L_0x0055:
            java.lang.String r2 = "on_page_unselected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 2
            goto L_0x00c9
        L_0x0060:
            java.lang.String r2 = "recover_share_guide_animation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 4
            goto L_0x00c9
        L_0x006a:
            java.lang.String r2 = "pause_share_guide_animation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 3
            goto L_0x00c9
        L_0x0074:
            java.lang.String r2 = "on_image_page_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 8
            goto L_0x00c9
        L_0x007f:
            java.lang.String r2 = "on_page_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 9
            goto L_0x00c9
        L_0x008a:
            java.lang.String r2 = "show_festival_activity_icon"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 11
            goto L_0x00c9
        L_0x0095:
            java.lang.String r2 = "video_on_pause"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 0
            goto L_0x00c9
        L_0x009f:
            java.lang.String r2 = "video_show_flip_share_drawable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 10
            goto L_0x00c9
        L_0x00aa:
            java.lang.String r2 = "update_diig_view"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 5
            goto L_0x00c9
        L_0x00b4:
            java.lang.String r2 = "handle_double_click"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 7
            goto L_0x00c9
        L_0x00be:
            java.lang.String r2 = "image_pause"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            r0 = 1
            goto L_0x00c9
        L_0x00c8:
            r0 = -1
        L_0x00c9:
            switch(r0) {
                case 0: goto L_0x056a;
                case 1: goto L_0x056a;
                case 2: goto L_0x056a;
                case 3: goto L_0x051a;
                case 4: goto L_0x04ec;
                case 5: goto L_0x04df;
                case 6: goto L_0x04db;
                case 7: goto L_0x03d1;
                case 8: goto L_0x0396;
                case 9: goto L_0x0396;
                case 10: goto L_0x00d3;
                case 11: goto L_0x00ce;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            goto L_0x056e
        L_0x00ce:
            r20.a()
            goto L_0x056e
        L_0x00d3:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43351(0xa957, float:6.0748E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00fa
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43351(0xa957, float:6.0748E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x056e
        L_0x00fa:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.festival.christmas.a.f47225a
            r16 = 1
            r17 = 43895(0xab77, float:6.151E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r10] = r2
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x013a
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.festival.christmas.a.f47225a
            r16 = 1
            r17 = 43895(0xab77, float:6.151E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r10] = r1
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x023f
        L_0x013a:
            if (r0 == 0) goto L_0x023e
            java.lang.String r1 = r0.getStickerIDs()
            boolean r1 = com.ss.android.ugc.aweme.festival.christmas.a.a((java.lang.String) r1)
            if (r1 != 0) goto L_0x0148
            goto L_0x023e
        L_0x0148:
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getAuthor()
            if (r1 == 0) goto L_0x023e
            com.ss.android.ugc.aweme.utils.u r2 = com.ss.android.ugc.aweme.utils.u.f75965b
            boolean r2 = r2.d(r0)
            if (r2 != 0) goto L_0x023e
            com.ss.android.ugc.aweme.utils.u r2 = com.ss.android.ugc.aweme.utils.u.f75965b
            boolean r2 = r2.e(r0)
            if (r2 == 0) goto L_0x0160
            goto L_0x023e
        L_0x0160:
            boolean r2 = r1.isMe()
            if (r2 == 0) goto L_0x016c
            boolean r0 = com.ss.android.ugc.aweme.festival.christmas.a.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            goto L_0x023f
        L_0x016c:
            boolean r0 = r1.isSecret()
            if (r0 != 0) goto L_0x023e
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.festival.christmas.a.f47225a
            r16 = 1
            r17 = 43892(0xab74, float:6.1506E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x01a4
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.festival.christmas.a.f47225a
            r16 = 1
            r17 = 43892(0xab74, float:6.1506E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x023f
        L_0x01a4:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getFestivalShareDonationTime()
            java.lang.Object r0 = r0.c()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r0)
            r13[r10] = r4
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r13[r9] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.festival.christmas.a.f47225a
            r16 = 1
            r17 = 43902(0xab7e, float:6.152E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r10] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r9] = r5
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0217
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r0)
            r13[r10] = r4
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r13[r9] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.festival.christmas.a.f47225a
            r16 = 1
            r17 = 43902(0xab7e, float:6.152E-41)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r9] = r1
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x023f
        L_0x0217:
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            r4.setTimeInMillis(r0)
            r5.setTimeInMillis(r2)
            int r0 = r4.get(r9)
            int r1 = r5.get(r9)
            if (r1 > r0) goto L_0x023c
            if (r1 != r0) goto L_0x023e
            int r0 = r5.get(r11)
            int r1 = r4.get(r11)
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x023e
        L_0x023c:
            r0 = 1
            goto L_0x023f
        L_0x023e:
            r0 = 0
        L_0x023f:
            if (r0 == 0) goto L_0x0395
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x0395
            boolean r0 = r7.o
            if (r0 != 0) goto L_0x0395
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            boolean r0 = r0.isMe()
            if (r0 == 0) goto L_0x02cd
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.f47284a
            r14 = 1
            r15 = 43987(0xabd3, float:6.1639E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<android.graphics.drawable.Drawable> r17 = android.graphics.drawable.Drawable.class
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0285
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.f47284a
            r14 = 1
            r15 = 43987(0xabd3, float:6.1639E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<android.graphics.drawable.Drawable> r17 = android.graphics.drawable.Drawable.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L_0x033d
        L_0x0285:
            java.lang.String r0 = "share_flip_my_icon.png"
            android.graphics.drawable.Drawable r0 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x028f
            goto L_0x033d
        L_0x028f:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.f47284a
            r14 = 1
            r15 = 43985(0xabd1, float:6.1636E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<java.io.File> r17 = java.io.File.class
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x02ba
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.f47284a
            r14 = 1
            r15 = 43985(0xabd1, float:6.1636E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<java.io.File> r17 = java.io.File.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.io.File r0 = (java.io.File) r0
            goto L_0x02c0
        L_0x02ba:
            java.lang.String r0 = "share_flip_my_icon.png"
            java.io.File r0 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.b(r0)
        L_0x02c0:
            android.graphics.drawable.Drawable r0 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.a((java.io.File) r0)
            if (r0 == 0) goto L_0x033d
            java.lang.String r1 = "share_flip_my_icon.png"
            com.ss.android.ugc.aweme.festival.common.FestivalResHandler.a((java.lang.String) r1, (android.graphics.drawable.Drawable) r0)
            goto L_0x033d
        L_0x02cd:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.f47284a
            r14 = 1
            r15 = 43986(0xabd2, float:6.1638E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<android.graphics.drawable.Drawable> r17 = android.graphics.drawable.Drawable.class
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x02f8
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.f47284a
            r14 = 1
            r15 = 43986(0xabd2, float:6.1638E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<android.graphics.drawable.Drawable> r17 = android.graphics.drawable.Drawable.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L_0x033d
        L_0x02f8:
            java.lang.String r0 = "share_flip_icon.png"
            android.graphics.drawable.Drawable r0 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0301
            goto L_0x033d
        L_0x0301:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.f47284a
            r14 = 1
            r15 = 43984(0xabd0, float:6.1635E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<java.io.File> r17 = java.io.File.class
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x032c
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.f47284a
            r14 = 1
            r15 = 43984(0xabd0, float:6.1635E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<java.io.File> r17 = java.io.File.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.io.File r0 = (java.io.File) r0
            goto L_0x0332
        L_0x032c:
            java.lang.String r0 = "share_flip_icon.png"
            java.io.File r0 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.b(r0)
        L_0x0332:
            android.graphics.drawable.Drawable r0 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.a((java.io.File) r0)
            if (r0 == 0) goto L_0x033d
            java.lang.String r1 = "share_flip_icon.png"
            com.ss.android.ugc.aweme.festival.common.FestivalResHandler.a((java.lang.String) r1, (android.graphics.drawable.Drawable) r0)
        L_0x033d:
            if (r0 == 0) goto L_0x0395
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.shareIv
            if (r1 == 0) goto L_0x0395
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.shareIv
            r1.setImageDrawable(r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43352(0xa958, float:6.0749E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x036e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43352(0xa958, float:6.0749E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0393
        L_0x036e:
            android.view.View r0 = r7.mShareContainerView
            if (r0 == 0) goto L_0x0393
            android.view.View r0 = r7.mShareContainerView
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            r1 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            com.ss.android.ugc.aweme.feed.ui.ca r1 = new com.ss.android.ugc.aweme.feed.ui.ca
            r1.<init>(r7)
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
            r0.start()
        L_0x0393:
            r7.o = r9
        L_0x0395:
            return
        L_0x0396:
            r20.a()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43348(0xa954, float:6.0743E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03c0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43348(0xa954, float:6.0743E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x056e
        L_0x03c0:
            android.view.View r0 = r7.mShareContainerView
            if (r0 == 0) goto L_0x03d0
            android.view.View r0 = r7.mShareContainerView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setScaleX(r1)
            android.view.View r0 = r7.mShareContainerView
            r0.setScaleY(r1)
        L_0x03d0:
            return
        L_0x03d1:
            boolean r0 = r7.n
            if (r0 != 0) goto L_0x056e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            if (r0 == 0) goto L_0x056e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            int r0 = r0.getUserDigg()
            if (r0 != 0) goto L_0x056e
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f3210b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43347(0xa953, float:6.0742E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0416
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43347(0xa953, float:6.0742E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x056e
        L_0x0416:
            if (r8 == 0) goto L_0x056e
            boolean r0 = r8.isProhibited()
            if (r0 != 0) goto L_0x056e
            boolean r0 = r7.o
            if (r0 == 0) goto L_0x0424
            goto L_0x056e
        L_0x0424:
            boolean r0 = r7.n
            if (r0 != 0) goto L_0x04da
            int r0 = r8.getUserDigg()
            if (r0 != 0) goto L_0x04da
            boolean r0 = r7.m
            if (r0 != 0) goto L_0x04da
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.d.b.f44282a
            r14 = 1
            r15 = 39686(0x9b06, float:5.5612E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0461
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.d.b.f44282a
            r14 = 1
            r15 = 39686(0x9b06, float:5.5612E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0495
        L_0x0461:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0494
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getIsShowFavouriteIcon()
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0494
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r0.getRegisterTime()
            long r1 = r1 - r3
            r3 = 604800(0x93a80, double:2.98811E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0494
            r0 = 1
            goto L_0x0495
        L_0x0494:
            r0 = 0
        L_0x0495:
            if (r0 == 0) goto L_0x04da
            r7.r = r9
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getIsShowFavouriteIcon()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.a(r1)
            android.widget.TextView r0 = r7.mShareCount
            if (r0 == 0) goto L_0x04d7
            android.widget.TextView r0 = r7.mShareCount
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x04d7
            android.widget.TextView r0 = r7.mShareCount
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x04c5
            android.widget.TextView r0 = r7.mShareCount
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            goto L_0x04c7
        L_0x04c5:
            java.lang.String r0 = ""
        L_0x04c7:
            r7.p = r0
            android.widget.TextView r0 = r7.mShareCount
            android.content.Context r1 = r7.h
            r2 = 2131562708(0x7f0d10d4, float:1.8750852E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
        L_0x04d7:
            r20.k()
        L_0x04da:
            return
        L_0x04db:
            r20.j()
            return
        L_0x04df:
            java.lang.Object r0 = r8.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7.n = r0
            return
        L_0x04ec:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43345(0xa951, float:6.0739E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0512
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43345(0xa951, float:6.0739E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x056e
        L_0x0512:
            boolean r0 = r7.m
            if (r0 == 0) goto L_0x0519
            r20.j()
        L_0x0519:
            return
        L_0x051a:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43344(0xa950, float:6.0738E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0540
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43344(0xa950, float:6.0738E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x056e
        L_0x0540:
            boolean r0 = r7.m
            if (r0 == 0) goto L_0x0547
            r20.i()
        L_0x0547:
            boolean r0 = r7.r
            if (r0 == 0) goto L_0x0569
            android.widget.TextView r0 = r7.mShareCount
            if (r0 == 0) goto L_0x0566
            android.widget.TextView r0 = r7.mShareCount
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0566
            java.lang.String r0 = r7.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0566
            android.widget.TextView r0 = r7.mShareCount
            java.lang.String r1 = r7.p
            r0.setText(r1)
        L_0x0566:
            r20.i()
        L_0x0569:
            return
        L_0x056a:
            r20.h()
            return
        L_0x056e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.VideoShareView.onChanged(java.lang.Object):void");
    }
}
