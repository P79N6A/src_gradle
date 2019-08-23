package com.ss.android.ugc.aweme.newfollow.vh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.hotsearch.d.h;
import com.ss.android.ugc.aweme.live.feedpage.b;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.dp;
import io.reactivex.functions.Consumer;
import java.util.List;

public class MomentFollowFeedViewHolder extends BaseFollowViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57646a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f57647b;

    /* renamed from: c  reason: collision with root package name */
    private Consumer<b> f57648c;
    @BindView(2131495315)
    View mCenterContainer;
    @BindView(2131497369)
    ViewStub mDynamicStub;
    @BindView(2131493829)
    View mFriendPermissionCover;
    @BindView(2131497924)
    DmtTextView mFriendPermissionView;
    @BindView(2131494314)
    View mHeaderContainer;
    @BindView(2131495122)
    ImageView mPlayView;

    public final void a(com.ss.android.ugc.aweme.newfollow.e.b bVar, com.ss.android.ugc.aweme.newfollow.e.b bVar2) {
    }

    public final boolean j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean c() {
        this.n.b(this.mHeadUserNameView, this.itemView, this.j, this.j.getAuthor());
        return false;
    }

    public final void N() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62603, new Class[0], Void.TYPE);
            return;
        }
        super.N();
        if (com.ss.android.ugc.aweme.newfollow.a.b.a(this.j)) {
            I();
        }
    }

    public final void O() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62602, new Class[0], Void.TYPE);
            return;
        }
        super.O();
        if (com.ss.android.ugc.aweme.newfollow.a.b.a(this.j)) {
            J();
        }
    }

    public final void S() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62594, new Class[0], Void.TYPE);
            return;
        }
        super.S();
        J();
    }

    public final void V() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62593, new Class[0], Void.TYPE);
            return;
        }
        super.V();
        I();
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62605, new Class[0], Void.TYPE);
        } else if (this.j.isImage()) {
            g();
        } else {
            e();
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62606, new Class[0], Void.TYPE);
            return;
        }
        if (this.j.getVideo() != null) {
            c.a(this.mCoverView, this.j.getVideo().getOriginCover(), this.mCoverView.getWidth(), this.mCoverView.getHeight());
        }
        this.mPlayView.setVisibility(0);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62607, new Class[0], Void.TYPE);
            return;
        }
        List<ImageInfo> imageInfos = this.j.getImageInfos();
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

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62608, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mCenterContainer.setOutlineProvider(new dp((int) UIUtils.dip2Px(X(), 2.0f)));
            this.mCenterContainer.setClipToOutline(true);
        }
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62604, new Class[0], Void.TYPE);
        } else if (!this.j.isShowForwardEntrance() || !AbTestManager.a().M()) {
            v.a((View) this.mForwardLayout, 8);
        } else {
            v.a((View) this.mForwardLayout, 0);
        }
    }

    public final void L() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62599, new Class[0], Void.TYPE);
        } else if (am.a(this.j)) {
            this.mFriendPermissionCover.setVisibility(0);
            this.mFriendPermissionView.setVisibility(0);
            this.mFriendPermissionView.setCompoundDrawablesWithIntrinsicBounds(2130839585, 0, 0, 0);
            this.mFriendPermissionView.setText(X().getString(C0906R.string.ai2));
        } else if (!com.ss.android.ugc.aweme.newfollow.a.b.c(this.j) || !am.b(this.j)) {
            this.mFriendPermissionCover.setVisibility(8);
            this.mFriendPermissionView.setVisibility(8);
        } else {
            this.mFriendPermissionCover.setVisibility(0);
            this.mFriendPermissionView.setVisibility(0);
            this.mFriendPermissionView.setCompoundDrawablesWithIntrinsicBounds(2130839775, 0, 0, 0);
            this.mFriendPermissionView.setText(X().getString(C0906R.string.cix));
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62597, new Class[0], Void.TYPE);
            return;
        }
        m();
        L();
        q();
        o();
        z();
        w();
        u();
        x();
        t();
        s();
        E_();
        A();
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62598, new Class[0], Void.TYPE);
        } else {
            z zVar = new z(this);
            if (this.j.getAuthor() != null) {
                h.a(this.mHeadUserNameView, this.j.getAuthor().getStarBillboardRank(), 4, d(), zVar);
            }
        }
        this.f57647b = false;
    }

    public final void W() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62609, new Class[0], Void.TYPE);
            return;
        }
        super.W();
        if (!a.a(this.mCenterContainer) && this.j != null) {
            if (this.j.isImage()) {
                if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62610, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62610, new Class[0], Void.TYPE);
                } else {
                    d M = M();
                    if (M != null) {
                        M.f57413d.a(16777216);
                        int[] iArr = new int[2];
                        this.mCoverView.getLocationOnScreen(iArr);
                        DragView.b bVar = new DragView.b(iArr[0], iArr[1], this.mCoverView.getHeight(), this.mCoverView.getWidth(), (float) this.mCoverView.getResources().getDimensionPixelOffset(C0906R.dimen.gh));
                        k.a(d(), this.j);
                        AbsFollowFeedDetailActivity.a(X(), bVar, this.j, d(), M.j);
                    }
                }
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62611, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62611, new Class[0], Void.TYPE);
                    return;
                }
                this.f57647b = true;
                d M2 = M();
                if (M2 != null) {
                    M2.k = true;
                    M2.f57413d.a(16777216);
                    k.a(d(), this.j);
                    int[] iArr2 = new int[2];
                    this.mCenterContainer.getLocationOnScreen(iArr2);
                    if (this.j == null || this.j.getVideo() == null) {
                        f2 = ((float) this.mCenterContainer.getHeight()) / ((float) this.mCenterContainer.getWidth());
                    } else {
                        f2 = ((float) this.j.getVideo().getHeight()) / ((float) this.j.getVideo().getWidth());
                    }
                    DragView.b bVar2 = new DragView.b(iArr2[0], iArr2[1], this.mCenterContainer.getHeight(), this.mCenterContainer.getWidth(), (float) this.mCoverView.getResources().getDimensionPixelOffset(C0906R.dimen.gh), f2);
                    AbsFollowFeedDetailActivity.a(X(), bVar2, this.j, 2, d(), M2.j);
                }
            }
        }
    }

    public final void l() {
        int i;
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62595, new Class[0], Void.TYPE);
            return;
        }
        if (this.j.getVideo() != null) {
            i2 = this.j.getVideo().getWidth();
            i = this.j.getVideo().getHeight();
        } else {
            if (this.j.isImage() && this.j.getImageInfos() != null) {
                List<ImageInfo> imageInfos = this.j.getImageInfos();
                if (imageInfos != null && !imageInfos.isEmpty()) {
                    ImageInfo imageInfo = imageInfos.get(0);
                    if (imageInfo != null) {
                        int width = imageInfo.getWidth();
                        i = imageInfo.getHeight();
                        i2 = width;
                    }
                }
            }
            i2 = 0;
            i = 0;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}, this, f57646a, false, 62596, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}, this, f57646a, false, 62596, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float dip2Px = UIUtils.dip2Px(X(), 220.0f);
        float dip2Px2 = UIUtils.dip2Px(X(), 250.0f);
        float f2 = (float) i;
        float f3 = dip2Px / f2;
        float f4 = (float) i2;
        float f5 = dip2Px2 / f4;
        if (f3 <= f5) {
            float f6 = f4 * f3;
            float f7 = f2 * f3;
            float f8 = dip2Px * 0.75f;
            if (f6 >= f8) {
                f8 = f6;
            }
            if (f8 > dip2Px2) {
                f8 = dip2Px2;
            }
            i4 = (int) f8;
            i3 = (int) f7;
        } else {
            float f9 = f4 * f5;
            float f10 = f2 * f5;
            if (f10 <= dip2Px) {
                dip2Px = f10;
            }
            i3 = (int) dip2Px;
            i4 = (int) f9;
        }
        ViewGroup.LayoutParams layoutParams = this.mCenterContainer.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i3;
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f57646a, false, 62601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57646a, false, 62601, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            if (this.H || (!(this.B.a() instanceof FollowFeedAdapter) && !(this.B.a() instanceof UserStateFeedAdapter))) {
                this.q.setVisibility(8);
            } else {
                this.q.setVisibility(0);
            }
        }
        if (this.j.getAuthor() != null) {
            this.mHeaderLayout.setVisibility(0);
            if (this.m == null) {
                this.m = new com.ss.android.ugc.aweme.feed.ui.a(this.j.getAuthor().isLive(), this.mAvatarLiveView, this.mAvatarView, this.mAvatarBorderView);
            }
            if (com.ss.android.ugc.aweme.newfollow.a.b.a(this.j)) {
                if (this.J != null) {
                    this.J.a(this.j.getAuthor(), true, this.j.getAid());
                }
                c.a((RemoteImageView) this.mAvatarLiveView, this.j.getAuthor().getAvatarThumb(), this.avatarSize, this.avatarSize);
                com.ss.android.ugc.aweme.newfollow.g.a.c(this.j);
            } else {
                if (this.J != null) {
                    this.J.a(this.j.getAuthor(), false, this.j.getAid());
                }
                c.a((RemoteImageView) this.mAvatarView, this.j.getAuthor().getAvatarThumb(), this.avatarSize, this.avatarSize);
            }
            if (this.f57648c == null) {
                this.f57648c = new Consumer<b>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f57649a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        b bVar = (b) obj;
                        if (PatchProxy.isSupport(new Object[]{bVar}, this, f57649a, false, 62613, new Class[]{b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar}, this, f57649a, false, 62613, new Class[]{b.class}, Void.TYPE);
                            return;
                        }
                        if (TextUtils.equals(MomentFollowFeedViewHolder.this.j.getAuthor().getUid(), String.valueOf(bVar.f53380a))) {
                            MomentFollowFeedViewHolder.this.j.getAuthor().roomId = bVar.f53381b;
                            if (!MomentFollowFeedViewHolder.this.j.getAuthor().isLive()) {
                                MomentFollowFeedViewHolder.this.q();
                            }
                        }
                    }
                };
            }
            this.m.a(this.j.getAuthor(), getClass(), this.f57648c);
            if (!TextUtils.isEmpty(this.j.getAuthor().getRemarkName())) {
                this.mHeadUserNameView.setText(this.j.getAuthor().getRemarkName());
            } else {
                this.mHeadUserNameView.setText(com.ss.android.ugc.aweme.base.utils.a.a(this.itemView.getContext(), this.j.getAuthor().getNickname(), this.j.getNicknamePosition()));
            }
        }
    }

    public final void b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f57646a, false, 62591, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f57646a, false, 62591, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View findViewById = view2.findViewById(C0906R.id.bg5);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) (((float) layoutParams.leftMargin) + UIUtils.dip2Px(X(), 50.0f));
        layoutParams.topMargin = -((int) UIUtils.dip2Px(X(), 20.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57646a, false, 62592, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57646a, false, 62592, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a6_);
        a(viewStub.inflate(), 4.0f, 3.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 0.0f, 8.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a66);
        a(viewStub3.inflate(), 4.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwz);
        viewStub4.setLayoutResource(C0906R.layout.a4a);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub5.setLayoutResource(C0906R.layout.a4e);
        a(viewStub5.inflate(), 16.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub6.setLayoutResource(C0906R.layout.a42);
        a(viewStub6.inflate(), 16.0f);
    }

    public MomentFollowFeedViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2) {
        super(followFeedLayout, aVar, lVar, aVar2);
        this.mCenterContainer.setOnTouchListener(this.R);
        ((LinearLayout) this.mHeaderLayout).setGravity(48);
        this.mCommentLayout.setDisplayType(AbTestManager.a().aB());
    }
}
