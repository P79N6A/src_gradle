package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.AccessibilityUtil;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.hitrank.f;
import com.ss.android.ugc.aweme.feed.f.af;
import com.ss.android.ugc.aweme.feed.f.ag;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.f.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.festival.common.FestivalResHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.aj;
import com.ss.android.ugc.aweme.main.ak;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.p;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ed;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.u;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;

public class FeedAvatarView extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    private static final String t;
    @BindDimen(2131231010)
    int avatarSize;
    @BindView(2131492992)
    ImageView ivAdLink;
    public boolean m;
    @BindView(2131498347)
    LiveCircleView mAvatarBorderView;
    @Nullable
    @BindView(2131493179)
    RemoteImageView mAvatarDeco;
    @BindView(2131495027)
    ImageView mAvatarDecoration;
    @BindView(2131498352)
    AvatarImageWithLive mAvatarLiveView;
    @BindView(2131493191)
    AnimationImageView mAvatarLoadingView;
    @BindView(2131498345)
    AvatarWithBorderView mAvatarView;
    @BindView(2131494350)
    RelativeLayout mFollowContainerView;
    @BindView(2131494347)
    AnimationImageView mFollowView;
    @BindView(2131497359)
    StoryCircleView mStoryRing;
    protected b n;
    protected h o;
    private int p;
    private a q;
    private e r;
    private ak s;
    private Consumer<com.ss.android.ugc.aweme.live.feedpage.b> u;

    private boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, l, false, 42527, new Class[0], Boolean.TYPE)) {
            return false;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 42527, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, l, false, 42519, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, l, false, 42519, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (user == null || am.a(this.f3210b, 3)) {
            if (this.mAvatarLiveView != null) {
                this.mAvatarLiveView.setVisibility(4);
                this.mAvatarLiveView.a(false);
            }
            this.mAvatarView.setVisibility(0);
            this.mAvatarView.setBorderColor(C0906R.color.bc);
            a(this.mAvatarView);
            if (this.mAvatarDeco != null) {
                this.mAvatarDeco.setVisibility(8);
            }
        } else {
            b(TextUtils.isEmpty(user.getRemarkName()) ? user.getNickname() : user.getRemarkName());
            if (user.isMe()) {
                user.roomId = d.a().getCurUser().roomId;
            }
            if (this.q == null) {
                this.q = new a(user.isLive(), this.mAvatarLiveView, this.mAvatarView, this.mAvatarBorderView);
            }
            b(user);
            if (c(user)) {
                if (this.n != null) {
                    this.n.a(user, true, this.f3210b.getAid());
                }
                this.mAvatarLiveView.setBorderColor(C0906R.color.ano);
                a(this.mAvatarLiveView.getAvatarImageView());
                this.mAvatarLiveView.a(true);
            } else {
                if (this.n != null) {
                    this.n.a(user, false, this.f3210b.getAid());
                }
                this.mAvatarView.setBorderColor(C0906R.color.bc);
                a(this.mAvatarView);
                this.mAvatarLiveView.a(false);
            }
            if (this.mAvatarDeco != null) {
                if (c(user) || !com.ss.android.ugc.aweme.commercialize.model.b.a(user)) {
                    this.mAvatarDeco.setVisibility(8);
                } else {
                    this.mAvatarDeco.setVisibility(0);
                    com.ss.android.ugc.aweme.commercialize.model.b.a(user, this.mAvatarDeco);
                    com.ss.android.ugc.aweme.commercialize.model.b.a(user, "feed");
                }
            }
            a(user.getFollowStatus());
            if (user.getXmasUnlockCount() >= 3) {
                Drawable d2 = FestivalResHandler.d();
                if (d2 != null) {
                    this.mAvatarDecoration.setVisibility(0);
                    this.mAvatarDecoration.setImageDrawable(d2);
                } else {
                    this.mAvatarDecoration.setVisibility(8);
                }
            } else {
                this.mAvatarDecoration.setVisibility(8);
            }
        }
    }

    static {
        String str;
        if (AbTestManager.a().bF() == 1) {
            str = "home_follow_lottie.json";
        } else {
            str = "anim_follow_people.json";
        }
        t = str;
    }

    private boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42525, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 42525, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.s == null) {
            return true;
        } else {
            return this.s.a(this.f3210b);
        }
    }

    private String i() {
        if (!PatchProxy.isSupport(new Object[0], this, l, false, 42531, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.feed.a.a().c(this.f3210b, this.f3214f);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, l, false, 42531, new Class[0], String.class);
    }

    private boolean j() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42546, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 42546, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.r != null && this.r.d()) {
            z = true;
        }
        return z;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42520, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42520, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
        if (this.n != null) {
            this.n.a();
        }
    }

    private void f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42521, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42522, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 42522, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!(this.f3210b == null || this.f3210b.getAwemeType() != 101 || this.f3210b.getStreamUrlModel() == null)) {
            z = true;
        }
        if (!z && this.q != null) {
            this.q.e();
        }
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 42536, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 42536, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a("to_profile", (Object) str);
        }
    }

    private void a(@NonNull AvatarWithBorderView avatarWithBorderView) {
        if (PatchProxy.isSupport(new Object[]{avatarWithBorderView}, this, l, false, 42524, new Class[]{AvatarWithBorderView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarWithBorderView}, this, l, false, 42524, new Class[]{AvatarWithBorderView.class}, Void.TYPE);
        } else if (!am.a(this.f3210b, (RemoteImageView) avatarWithBorderView)) {
            if (this.f3210b == null || this.f3210b.getAuthor() == null || this.f3210b.getAuthor().getAvatarThumb() == null) {
                c.a((RemoteImageView) avatarWithBorderView, com.ss.android.ugc.aweme.base.model.a.a(2130839027));
            } else {
                c.a((RemoteImageView) avatarWithBorderView, this.f3210b.getAuthor().getAvatarThumb(), this.avatarSize, this.avatarSize);
            }
        }
    }

    private void b(int i) {
        float f2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 42535, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 42535, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mFollowView.setAnimation(t);
        AnimationImageView animationImageView = this.mFollowView;
        if (com.ss.android.ugc.aweme.commercialize.utils.c.B(this.f3210b)) {
            i2 = 8;
        }
        animationImageView.setVisibility(i2);
        AnimationImageView animationImageView2 = this.mFollowView;
        if (i == 0) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        animationImageView2.setProgress(f2);
    }

    private void c(int i) {
        if (PatchProxy.isSupport(new Object[]{19}, this, l, false, 42542, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{19}, this, l, false, 42542, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3212d != null) {
            String str = "";
            try {
                str = this.f3212d.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                this.f3210b.setRequestId(str);
            }
        }
        if (this.g != null) {
            this.g.a("feed_internal_event", (Object) new ar(19, this.f3210b));
        }
    }

    @Subscribe
    public void onFollowEvent(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, l, false, 42544, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, l, false, 42544, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(followStatus.userId) && TextUtils.equals(aa.a(this.f3210b), followStatus.userId)) {
            if (this.f3210b.getAuthor() != null) {
                this.f3210b.getAuthor().setFollowStatus(followStatus.followStatus);
            }
            a(followStatus.followStatus);
        }
    }

    private void b(final User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, l, false, 42518, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, l, false, 42518, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (this.u == null) {
            this.u = new Consumer<com.ss.android.ugc.aweme.live.feedpage.b>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46145a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    com.ss.android.ugc.aweme.live.feedpage.b bVar = (com.ss.android.ugc.aweme.live.feedpage.b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f46145a, false, 42548, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f46145a, false, 42548, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE);
                        return;
                    }
                    if (TextUtils.equals(user.getUid(), String.valueOf(bVar.f53380a))) {
                        user.roomId = bVar.f53381b;
                        if (!user.isLive()) {
                            FeedAvatarView.this.a(FeedAvatarView.this.f3210b.getAuthor());
                        }
                    }
                }
            };
        }
        this.q.a(user, getClass(), this.u);
    }

    private static boolean c(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, l, true, 42540, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, l, true, 42540, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || !user.isLive() || !com.ss.android.ugc.aweme.story.a.a() || user.isBlock() || ex.b()) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, l, false, 42539, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, l, false, 42539, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        if (dataCenter != null) {
            dataCenter.a("startPlayAnimation", (Observer<a>) this).a("stopPlayAnimation", (Observer<a>) this).a("on_page_selected", (Observer<a>) this).a("image_pause", (Observer<a>) this).a("update_ad_user_follow_ui", (Observer<a>) this);
        }
    }

    private void a(int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 42534, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 42534, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f3210b != null && this.f3210b.getAuthor() != null) {
            this.mFollowView.clearAnimation();
            User author = this.f3210b.getAuthor();
            if (StringUtils.equal(author.getUid(), d.a().getCurUserId()) || StringUtils.equal(this.f3211c, "homepage_follow") || !this.f3210b.isCanPlay()) {
                if (!StringUtils.equal(this.f3211c, "homepage_follow") || StringUtils.equal(author.getUid(), d.a().getCurUserId()) || !this.f3210b.isCanPlay() || AbTestManager.a().bF() != 1) {
                    this.mFollowView.setVisibility(4);
                } else {
                    b(i);
                }
                if (c(author)) {
                    ((RelativeLayout.LayoutParams) this.mAvatarLiveView.getLayoutParams()).bottomMargin = (int) UIUtils.dip2Px(this.h, 12.5f);
                } else {
                    ((RelativeLayout.LayoutParams) this.mAvatarView.getLayoutParams()).bottomMargin = (int) UIUtils.dip2Px(this.h, 10.0f);
                }
            } else {
                if (i == 0) {
                    try {
                        if (e() || j()) {
                            this.mFollowView.setAnimation(t);
                            AnimationImageView animationImageView = this.mFollowView;
                            if (com.ss.android.ugc.aweme.commercialize.utils.c.B(this.f3210b)) {
                                i2 = 8;
                            }
                            animationImageView.setVisibility(i2);
                            this.mFollowView.setProgress(0.0f);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (!this.m) {
                    if ((e() || j()) && AbTestManager.a().bF() == 1) {
                        b(i);
                    } else {
                        this.mFollowView.setVisibility(4);
                    }
                }
            }
        }
    }

    private void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 42545, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 42545, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            this.mAvatarView.setContentDescription(str);
            this.mAvatarLiveView.setContentDescription(str);
            AccessibilityUtil.setAccessibilityDelegate(this.mAvatarLiveView, new AccessibilityUtil.AccessibilityDelegateCallBack() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46150a;

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
                    if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat2}, this, f46150a, false, 42551, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat2}, this, f46150a, false, 42551, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
                        return;
                    }
                    accessibilityNodeInfoCompat2.setClassName(Button.class.getName());
                }
            });
            AccessibilityUtil.setAccessibilityDelegate(this.mFollowContainerView, new AccessibilityUtil.AccessibilityDelegateCallBack() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46152a;

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
                    if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat2}, this, f46152a, false, 42552, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat2}, this, f46152a, false, 42552, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
                        return;
                    }
                    accessibilityNodeInfoCompat2.setClassName(Button.class.getName());
                    accessibilityNodeInfoCompat2.setContentDescription(FeedAvatarView.this.h.getString(C0906R.string.ai7));
                }
            });
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
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
            r4 = 42538(0xa62a, float:5.9608E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 42538(0xa62a, float:5.9608E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            if (r8 == 0) goto L_0x016c
            java.lang.String r0 = r8.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -1860252652: goto L_0x006f;
                case -1780252142: goto L_0x0065;
                case -1661876786: goto L_0x005b;
                case 307897710: goto L_0x0051;
                case 350216171: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0079
        L_0x0047:
            java.lang.String r2 = "on_page_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r0 = 4
            goto L_0x007a
        L_0x0051:
            java.lang.String r2 = "startPlayAnimation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            goto L_0x007a
        L_0x005b:
            java.lang.String r2 = "stopPlayAnimation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r0 = 2
            goto L_0x007a
        L_0x0065:
            java.lang.String r2 = "image_pause"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r0 = 1
            goto L_0x007a
        L_0x006f:
            java.lang.String r2 = "update_ad_user_follow_ui"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r0 = 3
            goto L_0x007a
        L_0x0079:
            r0 = -1
        L_0x007a:
            switch(r0) {
                case 0: goto L_0x0168;
                case 1: goto L_0x0138;
                case 2: goto L_0x0138;
                case 3: goto L_0x0114;
                case 4: goto L_0x007f;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x016c
        L_0x007f:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 42537(0xa629, float:5.9607E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a5
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 42537(0xa629, float:5.9607E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0110
        L_0x00a5:
            com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive r0 = r7.mAvatarLiveView
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r0 = r0.getAvatarImageView()
            r7.a((com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView) r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            if (r0 == 0) goto L_0x0110
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = l
            r14 = 1
            r15 = 42541(0xa62d, float:5.9613E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.ss.android.ugc.aweme.profile.model.User.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x00f3
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = l
            r14 = 1
            r15 = 42541(0xa62d, float:5.9613E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L_0x0103
        L_0x00f3:
            if (r0 == 0) goto L_0x0102
            boolean r1 = com.ss.android.ugc.aweme.commercialize.model.b.a(r0)
            if (r1 == 0) goto L_0x0102
            boolean r0 = c((com.ss.android.ugc.aweme.profile.model.User) r0)
            if (r0 == 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r9 = 0
        L_0x0103:
            if (r9 == 0) goto L_0x0110
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "video"
            com.ss.android.ugc.aweme.commercialize.model.b.a((com.ss.android.ugc.aweme.profile.model.User) r0, (java.lang.String) r1)
        L_0x0110:
            r18.f()
            goto L_0x016c
        L_0x0114:
            boolean r0 = r18.j()
            if (r0 == 0) goto L_0x0130
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x016c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            int r0 = r0.getFollowStatus()
            r7.a((int) r0)
            return
        L_0x0130:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r7.mFollowView
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x0138:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 42523(0xa61b, float:5.9587E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x015e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 42523(0xa61b, float:5.9587E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x016c
        L_0x015e:
            com.ss.android.ugc.aweme.feed.ui.a r0 = r7.q
            if (r0 == 0) goto L_0x0167
            com.ss.android.ugc.aweme.feed.ui.a r0 = r7.q
            r0.f()
        L_0x0167:
            return
        L_0x0168:
            r18.f()
            return
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.FeedAvatarView.onChanged(java.lang.Object):void");
    }

    private void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 42533, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, l, false, 42533, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.main.a.a());
        if (!c() && !com.ss.android.ugc.aweme.login.utils.a.a(this.f3210b)) {
            if (this.f3210b == null || (this.f3210b.isCanPlay() && !this.f3210b.isDelete())) {
                if (this.r != null) {
                    if (z) {
                        this.r.a("plus_sign");
                    } else {
                        this.r.l();
                    }
                }
                if (!(this.f3210b == null || this.f3210b.getAuthor() == null)) {
                    c(19);
                    User author = this.f3210b.getAuthor();
                    if (h() || !c(author) || !com.ss.android.ugc.aweme.story.a.a()) {
                        ((q) ((q) new q().b(this.f3210b, this.f3214f).b(this.f3211c).a("click_head")).a(this.h)).e();
                        new p().e(this.f3210b).b(this.f3210b.getAuthorUid()).c(this.f3211c).e();
                        a("");
                    } else if (!com.ss.android.ugc.aweme.story.live.c.a().b()) {
                        if (TextUtils.equals(this.f3211c, "homepage_hot")) {
                            com.ss.android.ugc.aweme.story.live.b.a(this.h, "homepage_hot", author.getRequestId(), author.getUid(), author.roomId, this.f3210b.getAid());
                            str = "homepage_hot";
                        } else if (TextUtils.equals(this.f3211c, "homepage_follow")) {
                            com.ss.android.ugc.aweme.story.live.b.a(this.h, "homepage_follow", author.getRequestId(), author.getUid(), author.roomId, this.f3210b.getAid());
                            str = "homepage_follow";
                        } else {
                            com.ss.android.ugc.aweme.story.live.b.a(this.h, this.f3211c, author.getRequestId(), author.getUid(), author.roomId, this.f3210b.getAid());
                            str = this.f3211c;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("live.intent.extra.ENTER_AWEME_ID", this.f3210b.getAid());
                        bundle.putString("live.intent.extra.REQUEST_ID", author.getRequestId());
                        bundle.putString("enter_method", "video_head");
                        if (com.ss.android.ugc.aweme.commercialize.utils.c.u(this.f3210b)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("log_extra", this.f3210b.getAwemeRawAd().getLogExtra());
                            hashMap.put("value", this.f3210b.getAwemeRawAd().getCreativeId());
                            bundle.putSerializable("live_douplus_log_extra", hashMap);
                            bundle.putBoolean("enter_from_dou_plus", true);
                        }
                        com.ss.android.ugc.aweme.story.live.c.a(this.h, this.f3210b.getAuthor(), str, bundle);
                    }
                }
            } else if (this.f3210b.isImage()) {
                com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.b0y).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.drx).a();
            }
        }
    }

    public final void b(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (PatchProxy.isSupport(new Object[]{videoItemParams2}, this, l, false, 42515, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams2}, this, l, false, 42515, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.b(videoItemParams);
        if (videoItemParams2 != null) {
            this.r = videoItemParams2.mAdViewController;
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 42513, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 42513, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((com.ss.android.ugc.aweme.legoImp.inflate.q) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.q.class)).a(this.h, (int) C0906R.layout.layout_feed_avatar);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        ButterKnife.bind((Object) this, a2);
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42514, new Class[0], Void.TYPE);
        } else if (!(!u.a() || this.mAvatarView == null || this.mFollowView == null || this.mFollowContainerView == null)) {
            int a3 = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 45.0f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mAvatarView.getLayoutParams();
            layoutParams.height = a3;
            layoutParams.width = a3;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.getMarginStart() + com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 2.5f));
            }
            layoutParams.leftMargin += com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 2.5f);
            this.mAvatarView.setLayoutParams(layoutParams);
            int a4 = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 23.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mFollowView.getLayoutParams();
            layoutParams2.height = a4;
            layoutParams2.width = a4;
            this.mFollowView.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.mFollowContainerView.getLayoutParams();
            layoutParams3.height = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 29.0f);
            this.mFollowContainerView.setLayoutParams(layoutParams3);
        }
        if (!com.ss.android.g.a.a()) {
            this.o = (h) ServiceManager.get().getService(h.class);
            this.n = this.o.a(this.mAvatarView, this.mStoryRing, this.mAvatarLoadingView);
            this.n.a(new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46143a;

                public final void a(boolean z) {
                    double d2;
                    double d3;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46143a, false, 42547, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46143a, false, 42547, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) FeedAvatarView.this.mAvatarView.getLayoutParams();
                    double d4 = 49.0d;
                    if (z) {
                        d2 = 44.0d;
                    } else {
                        d2 = 49.0d;
                    }
                    layoutParams.width = com.ss.android.ugc.aweme.base.utils.u.a(d2);
                    if (z) {
                        d4 = 44.0d;
                    }
                    layoutParams.height = com.ss.android.ugc.aweme.base.utils.u.a(d4);
                    if (z) {
                        d3 = 8.5d;
                    } else {
                        d3 = 5.5d;
                    }
                    layoutParams.leftMargin = com.ss.android.ugc.aweme.base.utils.u.a(d3);
                    FeedAvatarView.this.mAvatarView.setLayoutParams(layoutParams);
                }
            });
        }
    }

    @OnClick({2131494350, 2131498345, 2131498352})
    public void onClick(View view) {
        Object[] objArr;
        Object obj;
        ChangeQuickRedirect changeQuickRedirect;
        boolean z;
        int i;
        Class[] clsArr;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, l, false, 42526, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, l, false, 42526, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.agt) {
            if (PatchProxy.isSupport(new Object[]{view2}, this, l, false, 42532, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, l, false, 42532, new Class[]{View.class}, Void.TYPE);
            } else if (this.p == 1 || this.p == 2) {
                a(true);
            } else {
                if (!com.ss.android.ugc.aweme.commercialize.utils.c.H(this.f3210b) && !c() && this.f3210b != null) {
                    User author = this.f3210b.getAuthor();
                    if (author != null) {
                        if (author.getFollowStatus() != 0) {
                            if (AbTestManager.a().bF() == 1) {
                                com.ss.android.ugc.aweme.main.d.a.a(this.f3210b, "head_icon");
                                DataCenter dataCenter = this.g;
                                Aweme aweme = this.f3210b;
                                if (PatchProxy.isSupport(new Object[]{view2, dataCenter, aweme}, null, MainPageExperimentHelper.f54220a, true, 57398, new Class[]{View.class, DataCenter.class, Aweme.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view2, dataCenter, aweme}, null, MainPageExperimentHelper.f54220a, true, 57398, new Class[]{View.class, DataCenter.class, Aweme.class}, Void.TYPE);
                                } else {
                                    Dialog b2 = new a.C0185a(view.getContext()).a((int) C0906R.string.pr).a((int) C0906R.string.dpt, (DialogInterface.OnClickListener) new aj(view2, dataCenter, aweme)).b((int) C0906R.string.kj, ak.f54337b).a().b();
                                    if (b2.findViewById(C0906R.id.dhn) instanceof TextView) {
                                        ((TextView) b2.findViewById(C0906R.id.dhn)).setTextColor(view.getResources().getColor(C0906R.color.ho));
                                    }
                                    if (b2.findViewById(C0906R.id.da0) != null) {
                                        b2.findViewById(C0906R.id.da0).setVisibility(8);
                                    }
                                }
                            }
                        } else if (!TextUtils.equals(author.getUid(), d.a().getCurUserId())) {
                            if (this.r != null && this.r.a() && !com.ss.android.ugc.aweme.commercialize.utils.c.x(this.f3210b)) {
                                Context context = view.getContext();
                                Aweme aweme2 = this.f3210b;
                                if (PatchProxy.isSupport(new Object[]{context, aweme2}, null, g.f39316a, true, 31563, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{context, aweme2}, null, g.f39316a, true, 31563, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                                } else {
                                    g.a(context, aweme2, (FollowStatus) null);
                                }
                            }
                            if (com.ss.android.ugc.aweme.commercialize.utils.c.u(this.f3210b) || com.ss.android.ugc.aweme.commercialize.utils.c.x(this.f3210b)) {
                                g.c(this.h, this.f3210b, "plus_sign");
                            }
                            if (!m.a().c()) {
                                com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.bgf).a();
                            } else {
                                if (this.g != null) {
                                    ar arVar = new ar(12, this.f3210b);
                                    arVar.f45295e = "feed";
                                    this.g.a("feed_internal_event", (Object) arVar);
                                }
                                if (d.a().isLogin()) {
                                    f.f42393c.a(author, 5);
                                    com.ss.android.ugc.aweme.store.d a2 = com.ss.android.ugc.aweme.store.d.a();
                                    String uid = author.getUid();
                                    if (PatchProxy.isSupport(new Object[]{uid}, a2, com.ss.android.ugc.aweme.store.d.f71748a, false, 82120, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{uid}, a2, com.ss.android.ugc.aweme.store.d.f71748a, false, 82120, new Class[]{String.class}, Void.TYPE);
                                    } else if (!(uid == null || a2.f71751b == null || !uid.equals(a2.f71751b.getUid()))) {
                                        a2.f71751b.setFollowStatus(1);
                                    }
                                    this.mFollowView.playAnimation();
                                    this.mFollowView.addAnimatorListener(new Animator.AnimatorListener() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f46148a;

                                        public final void onAnimationCancel(Animator animator) {
                                        }

                                        public final void onAnimationRepeat(Animator animator) {
                                        }

                                        public final void onAnimationStart(Animator animator) {
                                        }

                                        private void a(int i) {
                                            int i2 = i;
                                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46148a, false, 42549, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46148a, false, 42549, new Class[]{Integer.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            int intValue = ((Integer) SharePrefCache.inst().getShowJumpEffectAfterFollowCount().c()).intValue();
                                            if (i2 < 0 || (i2 >= 0 && intValue < i2)) {
                                                int i3 = intValue + 1;
                                                SharePrefCache.inst().getShowJumpEffectAfterFollowCount().a(Integer.valueOf(i3));
                                                s sVar = new s();
                                                FeedAvatarView.this.mAvatarView.getLocationOnScreen(sVar.f45316a);
                                                bg.a(sVar);
                                                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                                                r.a("view_follow_tab_effect", (Map) a2.a("show_cnt", i3).f34114b);
                                            }
                                        }

                                        public final void onAnimationEnd(Animator animator) {
                                            int i = 0;
                                            if (PatchProxy.isSupport(new Object[]{animator}, this, f46148a, false, 42550, new Class[]{Animator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{animator}, this, f46148a, false, 42550, new Class[]{Animator.class}, Void.TYPE);
                                                return;
                                            }
                                            FeedAvatarView.this.m = false;
                                            bg.a(new af(FeedAvatarView.this.f3210b));
                                            AbTestManager a2 = AbTestManager.a();
                                            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71667, new Class[0], Integer.TYPE)) {
                                                i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71667, new Class[0], Integer.TYPE)).intValue();
                                            } else {
                                                AbTestModel d2 = a2.d();
                                                if (d2 != null) {
                                                    i = d2.isShowJumpEffectAfterFollow;
                                                }
                                            }
                                            if (i == 1) {
                                                a(1);
                                                return;
                                            }
                                            if (i == 2) {
                                                if (d.a().isLogin() && d.a().getCurUser().getFollowingCount() < 20) {
                                                    a(-1);
                                                }
                                            } else if (i == 10) {
                                                a(-1);
                                            }
                                        }
                                    });
                                    this.m = true;
                                }
                            }
                        }
                    }
                }
            }
        } else if ((id == C0906R.id.dp2 || id == C0906R.id.dp9) && g()) {
            if (id == C0906R.id.dp9 && com.ss.android.ugc.aweme.commercialize.utils.c.u(this.f3210b)) {
                g.a(this.h, "draw_ad", this.f3210b);
            }
            if (com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[0], this, l, false, 42530, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, l, false, 42530, new Class[0], Void.TYPE);
                } else {
                    if (!ex.b() && !com.ss.android.ugc.aweme.login.utils.a.a(this.f3210b) && !c()) {
                        if (this.f3210b == null || this.f3210b.isCanPlay()) {
                            if (this.r != null) {
                                this.r.l();
                            }
                            ((q) ((q) new q().b(this.f3210b, this.f3214f).b(this.f3211c).a(this.h)).e((String) this.g.b("playlist_type", "")).g((String) this.g.b("playlist_id", "")).f((String) this.g.b("playlist_id_key", "")).a("click_head")).e();
                            z.a(z.c.PROFILE);
                            if (this.f3210b != null) {
                                c(19);
                                User author2 = this.f3210b.getAuthor();
                                if (author2 != null && author2.isLive() && com.ss.android.ugc.aweme.story.a.a()) {
                                    if (TextUtils.equals(this.f3211c, "homepage_hot")) {
                                        com.ss.android.ugc.aweme.story.live.b.d(this.h, 1, i(), author2.getUid(), author2.roomId, this.f3210b.getAid());
                                    } else if (TextUtils.equals(this.f3211c, "homepage_follow")) {
                                        com.ss.android.ugc.aweme.story.live.b.c(this.h, 1, i(), author2.getUid(), author2.roomId, this.f3210b.getAid());
                                    } else {
                                        Context context2 = this.h;
                                        String str = this.f3211c;
                                        boolean z2 = this.f3213e;
                                        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.feed.g.c.f45346a, true, 41304, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                                            str = (String) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.feed.g.c.f45346a, true, 41304, new Class[]{String.class, Boolean.TYPE}, String.class);
                                        } else {
                                            if (com.ss.android.g.a.a()) {
                                                if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.feed.g.c.f45346a, true, 41305, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                                                    objArr = new Object[]{str, Byte.valueOf(z2)};
                                                    obj = null;
                                                    changeQuickRedirect = com.ss.android.ugc.aweme.feed.g.c.f45346a;
                                                    z = true;
                                                    i = 41305;
                                                    clsArr = new Class[]{String.class, Boolean.TYPE};
                                                } else if ("opus".equals(str)) {
                                                    str = z2 ? "personal_homepage" : "others_homepage";
                                                } else if ("collection".equals(str)) {
                                                    str = z2 ? "personal_collection" : "others_collection";
                                                }
                                            } else {
                                                if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.feed.g.c.f45346a, true, 41306, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                                                    objArr = new Object[]{str, Byte.valueOf(z2)};
                                                    obj = null;
                                                    changeQuickRedirect = com.ss.android.ugc.aweme.feed.g.c.f45346a;
                                                    z = true;
                                                    i = 41306;
                                                    clsArr = new Class[]{String.class, Boolean.TYPE};
                                                } else if ("opus".equals(str) || "collection".equals(str)) {
                                                    str = z2 ? "personal_homepage" : "others_homepage";
                                                }
                                            }
                                            str = (String) PatchProxy.accessDispatch(objArr, obj, changeQuickRedirect, z, i, clsArr, String.class);
                                        }
                                        com.ss.android.ugc.aweme.story.live.b.a(context2, 1, str, i(), author2.getUid(), author2.roomId);
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("live.intent.extra.ENTER_AWEME_ID", this.f3210b.getAid());
                                    com.ss.android.ugc.aweme.story.live.c a3 = com.ss.android.ugc.aweme.story.live.c.a();
                                    c.a c2 = new c.a(this.h, this.f3210b.getAuthor()).d(author2.getRequestId()).b(this.f3211c).c("video_head");
                                    c2.j = bundle;
                                    a3.a(c2);
                                    c(19);
                                } else if (g() || TextUtils.equals(this.f3211c, "update_tips")) {
                                    a("");
                                } else {
                                    bg.a(new ag(this.h.hashCode()));
                                }
                            }
                        } else if (this.f3210b.isImage()) {
                            com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.b0y).a();
                        } else {
                            com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.drx).a();
                        }
                    }
                }
            } else if (h() || this.n == null || !this.n.b()) {
                a(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42517(0xa615, float:5.9579E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 42517(0xa615, float:5.9579E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.a((com.ss.android.ugc.aweme.feed.model.VideoItemParams) r11)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 == 0) goto L_0x0049
            android.support.v4.app.Fragment r1 = r10.k
            boolean r1 = r1 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
            if (r1 == 0) goto L_0x0049
            int r0 = r0.feedFollowButton
            r10.p = r0
        L_0x0049:
            android.widget.RelativeLayout r7 = r10.mFollowContainerView
            int r0 = r10.p
            r1 = 2
            if (r0 == r1) goto L_0x0087
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.b()
            if (r0 != 0) goto L_0x0087
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 42528(0xa620, float:5.9594E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0081
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 42528(0xa620, float:5.9594E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            if (r0 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r0 = 0
            goto L_0x0088
        L_0x0087:
            r0 = 4
        L_0x0088:
            r7.setVisibility(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f3210b
            r1 = 3
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.am.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0, (int) r1)
            r1 = 8
            if (r0 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r10.mFollowView
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r10.ivAdLink
            goto L_0x00ba
        L_0x009e:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r10.mFollowView
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.f3210b
            boolean r2 = com.ss.android.ugc.aweme.commercialize.utils.c.B(r2)
            if (r2 == 0) goto L_0x00ab
            r2 = 8
            goto L_0x00ac
        L_0x00ab:
            r2 = 0
        L_0x00ac:
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r10.ivAdLink
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.f3210b
            boolean r2 = com.ss.android.ugc.aweme.commercialize.utils.c.B(r2)
            if (r2 == 0) goto L_0x00ba
            r1 = 0
        L_0x00ba:
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f3210b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            r10.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.FeedAvatarView.a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public FeedAvatarView(View view, ak akVar) {
        super(view);
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 42516, new Class[0], Void.TYPE);
        } else {
            View.OnTouchListener a2 = ed.a(0.5f, 1.0f);
            this.mAvatarView.setOnTouchListener(a2);
            this.mAvatarLiveView.setOnTouchListener(a2);
            if (com.ss.android.g.a.b()) {
                this.mAvatarView.a(true, false);
                AvatarImageWithLive avatarImageWithLive = this.mAvatarLiveView;
                if (PatchProxy.isSupport(new Object[]{(byte) 1, (byte) 0}, avatarImageWithLive, AvatarImageWithLive.f46072a, false, 42416, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    AvatarImageWithLive avatarImageWithLive2 = avatarImageWithLive;
                    PatchProxy.accessDispatch(new Object[]{(byte) 1, (byte) 0}, avatarImageWithLive2, AvatarImageWithLive.f46072a, false, 42416, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                } else if (avatarImageWithLive.f46073b != null) {
                    avatarImageWithLive.f46073b.a(true, false);
                }
            }
        }
        bg.c(this);
        this.s = akVar;
    }
}
