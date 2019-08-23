package com.ss.android.ugc.aweme.newfollow.vh;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import butterknife.BindView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.hotsearch.d.h;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity;
import com.ss.android.ugc.aweme.newfollow.ui.FollowEnterDetailViewModel;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.utils.dp;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FollowImageViewHolder extends BaseFollowViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f57580d;

    /* renamed from: e  reason: collision with root package name */
    boolean f57581e;
    @BindView(2131497369)
    ViewStub mDynamicStub;
    @BindView(2131495258)
    protected ViewGroup mImageLayout;

    @NotNull
    public String c() {
        return "from_follow_page";
    }

    public int e() {
        return 1;
    }

    public String g() {
        return null;
    }

    public boolean j() {
        return this.f57581e;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean ad() {
        this.n.b(this.mHeadUserNameView, this.itemView, this.j, this.j.getAuthor());
        return false;
    }

    public final void P() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62315, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62315, new Class[0], Void.TYPE);
            return;
        }
        super.P();
    }

    public final void V() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62308, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62308, new Class[0], Void.TYPE);
            return;
        }
        super.V();
        a(false);
    }

    public final void W() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62307, new Class[0], Void.TYPE);
            return;
        }
        super.W();
        if (!a.a(this.mImageLayout)) {
            a((long) ea.f66827f);
            ab();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62304, new Class[0], Void.TYPE);
            return;
        }
        D();
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62305, new Class[0], Void.TYPE);
            return;
        }
        super.D();
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
    }

    @TargetApi(21)
    public void H() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62306, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62306, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mImageLayout.setOutlineProvider(new dp(this.mImageLayout.getResources().getDimensionPixelOffset(C0906R.dimen.gh)));
            this.mImageLayout.setClipToOutline(true);
        }
    }

    public final void S() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62311, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62311, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62310, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62310, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (X() instanceof MainActivity) {
            z = FollowEnterDetailViewModel.a(d(), (MainActivity) X()).f57208b;
        }
        if (!z) {
            super.S();
        }
    }

    public void ab() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62314, new Class[0], Void.TYPE);
            return;
        }
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

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62300, new Class[0], Void.TYPE);
            return;
        }
        List<ImageInfo> imageInfos = this.j.getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = imageInfos.get(0);
            if (imageInfo != null) {
                a((View) this.mImageLayout, imageInfo.getWidth(), imageInfo.getHeight());
            }
        }
    }

    public void n() {
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62302, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        s sVar = new s(this);
        if (this.j.getAuthor() != null) {
            h.a(this.mHeadUserNameView, this.j.getAuthor().getStarBillboardRank(), 4, d(), sVar);
        }
    }

    public final void ac() {
        com.ss.android.ugc.aweme.common.f.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f57580d, false, 62313, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57580d, false, 62313, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            com.ss.android.ugc.aweme.newfollow.g.a.b(this.j, d());
            a(true);
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Aweme aweme = this.j;
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f57580d, false, 62312, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.common.f.a.class)) {
                aVar = (com.ss.android.ugc.aweme.common.f.a) PatchProxy.accessDispatch(new Object[]{aweme}, this, f57580d, false, 62312, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.common.f.a.class);
            } else {
                aVar = this.n.e();
                if (aVar instanceof b) {
                    b bVar = (b) aVar;
                    if (bVar.a()) {
                        bVar.a(new FollowFeed(aweme));
                    }
                }
            }
            a2.f44610c = aVar;
            if (AbTestManager.a().bL()) {
                LiveDetailActivity.b(X(), this.j.getAid(), d(), c(), this.j.getEnterpriseType(), e(), g(), this.mImageLayout);
            } else {
                DetailActivity.a(X(), this.j.getAid(), d(), c(), this.j.getEnterpriseType(), e(), g(), this.mImageLayout);
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57580d, false, 62317, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57580d, false, 62317, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(view);
        this.w.e();
    }

    public void onViewDetachedFromWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57580d, false, 62318, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57580d, false, 62318, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(view);
        k();
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57580d, false, 62309, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57580d, false, 62309, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (X() instanceof MainActivity) {
            FollowEnterDetailViewModel.a(d(), (MainActivity) X()).f57208b = z;
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57580d, false, 62316, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57580d, false, 62316, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i);
        a((long) ea.f66827f);
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57580d, false, 62301, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57580d, false, 62301, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a4h);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a41);
        a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwz);
        viewStub4.setLayoutResource(C0906R.layout.a4a);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub5.setLayoutResource(C0906R.layout.a40);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub6.setLayoutResource(C0906R.layout.a42);
        viewStub6.inflate();
        ViewStub viewStub7 = (ViewStub) view.findViewById(C0906R.id.cwm);
        viewStub7.setLayoutResource(C0906R.layout.a4d);
        a(viewStub7.inflate(), 12.0f);
    }

    public FollowImageViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2) {
        this(followFeedLayout, aVar, lVar, aVar2, false);
    }

    public FollowImageViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2, boolean z) {
        super(followFeedLayout, aVar, lVar, aVar2);
        this.mImageLayout.setOnTouchListener(this.R);
        this.f57581e = z;
        if (this.f57581e) {
            this.mCommentLayout.setDisplayType(AbTestManager.a().aB());
        }
    }
}
