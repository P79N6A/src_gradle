package com.ss.android.ugc.aweme.newfollow.vh;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.forward.b.c;
import com.ss.android.ugc.aweme.forward.b.f;
import com.ss.android.ugc.aweme.forward.d.m;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.a.b;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.dp;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import java.util.List;

public class MomentForwardFeedViewHolder extends BaseForwardViewHolder implements f {
    public static ChangeQuickRedirect s;
    @BindView(2131495315)
    View mCenterContainer;
    @BindView(2131494996)
    RemoteImageView mCoverView;
    @BindView(2131497369)
    ViewStub mDynamicStub;
    @BindView(2131496854)
    View mForwardContainer;
    @BindView(2131493829)
    View mFriendPermissionCover;
    @BindView(2131497924)
    DmtTextView mFriendPermissionView;
    @BindView(2131494314)
    View mHeaderContainer;
    @BindView(2131498041)
    MentionTextView mOriginDescView;
    @BindView(2131495276)
    View mOriginHeader;
    @BindView(2131498026)
    DmtTextView mOriginNickName;
    @BindView(2131495122)
    ImageView mPlayView;

    public final void a(int i) {
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.f.f fVar) {
    }

    public final void b(boolean z) {
    }

    public final void e() {
    }

    public final KeepSurfaceTextureView f() {
        return null;
    }

    public final int[] p() {
        return new int[0];
    }

    public final void q() {
    }

    public final boolean s() {
        return true;
    }

    public final View o() {
        return this.mCoverView;
    }

    public final void B_() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62640, new Class[0], Void.TYPE);
            return;
        }
        super.B_();
        k();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62641, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62641, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        m();
    }

    @OnClick({2131496854})
    public void onCheckDetail() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62644, new Class[0], Void.TYPE);
            return;
        }
        this.n.g();
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62630, new Class[0], Void.TYPE);
            return;
        }
        super.u();
        a(true);
    }

    private void N() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62637, new Class[0], Void.TYPE);
            return;
        }
        if (this.f48319d.getForwardItem().getVideo() != null) {
            c.a(this.mCoverView, this.f48319d.getForwardItem().getVideo().getOriginCover(), this.mCoverView.getWidth(), this.mCoverView.getHeight());
        }
        this.mPlayView.setVisibility(0);
    }

    private void O() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62638, new Class[0], Void.TYPE);
            return;
        }
        List<ImageInfo> imageInfos = this.f48319d.getForwardItem().getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = imageInfos.get(0);
            if (imageInfo != null) {
                if (imageInfo.getLabelLarge() != null) {
                    CollectionUtils.isEmpty(imageInfo.getLabelLarge().getUrlList());
                }
                c.a(this.mCoverView, imageInfo.getLabelLarge(), this.mCoverView.getWidth(), this.mCoverView.getHeight());
            }
        }
        this.mPlayView.setVisibility(8);
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62631, new Class[0], Void.TYPE);
        } else if (!this.f48319d.isShowForwardEntrance() || !AbTestManager.a().M()) {
            v.a((View) this.mForwardLayout, 8);
        } else {
            v.a((View) this.mForwardLayout, 0);
        }
    }

    public final void I() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62628, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mForwardContainer.setOutlineProvider(new dp((int) UIUtils.dip2Px(c(), 2.0f)));
            this.mForwardContainer.setClipToOutline(true);
            this.mCoverView.setOutlineProvider(new dp((int) UIUtils.dip2Px(c(), 2.0f)));
            this.mCoverView.setClipToOutline(true);
        }
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62633, new Class[0], Void.TYPE);
        } else if (this.f48319d.getForwardItem() != null && this.f48319d.getForwardItem().getAuthor() != null) {
            if (PatchProxy.isSupport(new Object[0], this, s, false, 62634, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, s, false, 62634, new Class[0], Void.TYPE);
            } else {
                this.mOriginNickName.getPaint().setFakeBoldText(true);
                this.mOriginNickName.setText(H());
                g.a((TextView) this.mOriginNickName);
            }
            b(this.mOriginDescView, this.f48319d.getForwardItem());
        }
    }

    public final String H() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62636, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, s, false, 62636, new Class[0], String.class);
        } else if (this.f48319d.getForwardItem() == null || this.f48319d.getForwardItem().getAuthor() == null) {
            return "";
        } else {
            if (!TextUtils.isEmpty(this.f48319d.getForwardItem().getAuthor().getRemarkName())) {
                str = "@" + this.f48319d.getForwardItem().getAuthor().getRemarkName();
            } else {
                str = "@" + this.f48319d.getForwardItem().getAuthor().getNickname();
            }
            return str;
        }
    }

    public final void L() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62639, new Class[0], Void.TYPE);
        } else if (am.a(this.f48319d)) {
            this.mFriendPermissionCover.setVisibility(0);
            this.mFriendPermissionView.setVisibility(0);
            this.mFriendPermissionView.setCompoundDrawablesWithIntrinsicBounds(2130839585, 0, 0, 0);
            this.mFriendPermissionView.setText(c().getString(C0906R.string.ai2));
        } else if (!b.c(this.f48319d) || !am.b(this.f48319d)) {
            this.mFriendPermissionCover.setVisibility(8);
            this.mFriendPermissionView.setVisibility(8);
        } else {
            this.mFriendPermissionCover.setVisibility(0);
            this.mFriendPermissionView.setVisibility(0);
            this.mFriendPermissionView.setCompoundDrawablesWithIntrinsicBounds(2130839775, 0, 0, 0);
            this.mFriendPermissionView.setText(c().getString(C0906R.string.cix));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r13 = this;
            r7 = 0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.meituan.robust.ChangeQuickRedirect r2 = s
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62627(0xf4a3, float:8.7759E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0025
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.meituan.robust.ChangeQuickRedirect r2 = s
            r3 = 0
            r4 = 62627(0xf4a3, float:8.7759E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f48319d
            if (r0 == 0) goto L_0x0119
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f48319d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getForwardItem()
            if (r0 != 0) goto L_0x0033
            goto L_0x0119
        L_0x0033:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f48319d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getForwardItem()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            if (r1 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            int r1 = r1.getWidth()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            int r0 = r0.getHeight()
        L_0x004f:
            r9 = r0
            r8 = r1
            goto L_0x007d
        L_0x0052:
            boolean r1 = r0.isImage()
            if (r1 == 0) goto L_0x007b
            java.util.List r1 = r0.getImageInfos()
            if (r1 == 0) goto L_0x007b
            java.util.List r0 = r0.getImageInfos()
            if (r0 == 0) goto L_0x007b
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x007b
            java.lang.Object r0 = r0.get(r7)
            com.ss.android.ugc.aweme.feed.model.ImageInfo r0 = (com.ss.android.ugc.aweme.feed.model.ImageInfo) r0
            if (r0 == 0) goto L_0x007b
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            goto L_0x004f
        L_0x007b:
            r8 = 0
            r9 = 0
        L_0x007d:
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11 = 1
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = s
            r3 = 0
            r4 = 62629(0xf4a5, float:8.7762E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r7] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00cb
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = s
            r3 = 0
            r4 = 62629(0xf4a5, float:8.7762E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r7] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00cb:
            android.content.Context r0 = r13.c()
            r1 = 1130102784(0x435c0000, float:220.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            android.content.Context r1 = r13.c()
            r2 = 1132068864(0x437a0000, float:250.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r2)
            float r2 = (float) r9
            float r3 = r0 / r2
            float r4 = (float) r8
            float r5 = r1 / r4
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x00ff
            float r4 = r4 * r3
            float r2 = r2 * r3
            r3 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 * r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r0 = r4
        L_0x00f7:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fc
            r0 = r1
        L_0x00fc:
            int r0 = (int) r0
            int r1 = (int) r2
            goto L_0x010e
        L_0x00ff:
            float r4 = r4 * r5
            float r1 = r2 * r5
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            int r1 = (int) r4
            int r0 = (int) r0
            r12 = r1
            r1 = r0
            r0 = r12
        L_0x010e:
            android.view.View r2 = r13.mCenterContainer
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r2.width = r0
            r2.height = r1
            return
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.MomentForwardFeedViewHolder.y():void");
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, s, false, 62625, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, s, false, 62625, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View findViewById = view2.findViewById(C0906R.id.bg5);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) (((float) layoutParams.leftMargin) + UIUtils.dip2Px(c(), 50.0f));
        layoutParams.topMargin = -((int) UIUtils.dip2Px(c(), 20.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    @OnClick({2131495315})
    public void onClickOriginContent(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 62643, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 62643, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!a.a(view) && (this.n instanceof m)) {
            if (this.f48319d.getForwardItem().isImage()) {
                ((m) this.n).m();
                return;
            }
            ((m) this.n).l();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, s, false, 62645, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, s, false, 62645, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f48319d != null && this.f48319d.getForwardItem() != null) {
            this.mOriginHeader.setBackground(null);
            this.mForwardContainer.setBackgroundColor(c().getResources().getColor(C0906R.color.z3));
            if (this.f48319d.getForwardItem().isImage()) {
                O();
            } else {
                N();
            }
        }
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 62626, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 62626, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a6_);
        a(viewStub.inflate(), 4.0f, 3.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 0.0f, 8.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a68);
        a(viewStub3.inflate(), 4.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub4.setLayoutResource(C0906R.layout.a4e);
        a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub5.setLayoutResource(C0906R.layout.a42);
        a(viewStub5.inflate(), 16.0f);
    }

    @OnClick({2131498026})
    public void onClickOriginNickName(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 62642, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 62642, new Class[]{View.class}, Void.TYPE);
        } else if (this.f48319d != null && this.f48319d.getForwardItem() != null) {
            h.a().a((Activity) c(), j.a("aweme://user/profile/" + this.f48319d.getForwardItem().getAuthorUid()).a("sec_user_id", this.f48319d.getForwardItem().getAuthor().getSecUid()).a("profile_from", "video_at").a("video_id", this.f48319d.getForwardItem().getAid()).a("profile_enterprise_type", this.f48319d.getForwardItem().getEnterpriseType()).a());
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(2);
            textExtraStruct.setUserId(this.f48319d.getForwardItem().getAuthorUid());
            com.ss.android.ugc.aweme.newfollow.g.a.a(c(), textExtraStruct, this.f48319d, "homepage_follow");
        }
    }

    public final void b(MentionTextView mentionTextView, Aweme aweme) {
        MentionTextView mentionTextView2 = mentionTextView;
        if (PatchProxy.isSupport(new Object[]{mentionTextView2, aweme}, this, s, false, 62635, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mentionTextView2, aweme}, this, s, false, 62635, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            if (TextUtils.isEmpty(aweme.getDesc())) {
                mentionTextView2.setVisibility(8);
                return;
            }
            if (!com.ss.android.g.a.a() && !aweme.isHashTag()) {
                b.h(aweme);
            }
            mentionTextView2.setText(String.format("%s", new Object[]{aweme.getDesc()}));
            mentionTextView2.setVisibility(0);
            g.a((TextView) mentionTextView);
            mentionTextView2.setSpanSize(UIUtils.sp2px(c(), 15.0f));
            mentionTextView2.setSpanStyle(1);
            mentionTextView2.setOnSpanClickListener(new aa(this));
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            AbTestManager.a();
            mentionTextView2.a(textExtra, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
            mentionTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public MomentForwardFeedViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, d dVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, aVar2, aVar3);
        c.a aVar4;
        if (PatchProxy.isSupport(new Object[]{dVar, lVar}, this, s, false, 62624, new Class[]{d.class, l.class}, m.class)) {
            aVar4 = (m) PatchProxy.accessDispatch(new Object[]{dVar, lVar}, this, s, false, 62624, new Class[]{d.class, l.class}, m.class);
        } else {
            aVar4 = new m(this, dVar, lVar) {
            };
        }
        this.n = aVar4;
        ((LinearLayout) this.mForwardHeaderLayout).setGravity(48);
        this.mCommentLayout.setDisplayType(AbTestManager.a().aB());
    }
}
