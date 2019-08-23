package com.ss.android.ugc.aweme.forward.vh;

import android.os.Build;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.forward.b.e;
import com.ss.android.ugc.aweme.forward.d.f;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.utils.dp;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class ForwardImageViewHolder extends BaseForwardViewHolder implements e {
    public static ChangeQuickRedirect s;
    @BindView(2131494996)
    protected RemoteImageView mCoverView;
    @Nullable
    @BindView(2131497369)
    ViewStub mDynamicStub;
    @BindView(2131495258)
    protected ViewGroup mImageLayout;
    @BindView(2131498041)
    MentionTextView mOriginDescView;
    @BindView(2131495276)
    View mOriginHeader;
    @BindView(2131496853)
    ViewGroup mOriginRootView;

    public int N() {
        return 1;
    }

    @NotNull
    public String O() {
        return "from_follow_page";
    }

    public final void e() {
    }

    public String q() {
        return null;
    }

    public final ImageView a() {
        return this.mCoverView;
    }

    public final void J() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45631, new Class[0], Void.TYPE);
            return;
        }
        o();
    }

    public void P() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45630, new Class[0], Void.TYPE);
            return;
        }
        this.n.g();
    }

    public void o() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45624, new Class[0], Void.TYPE);
            return;
        }
        ((f) this.n).l();
    }

    @OnClick({2131495276})
    public void onCheckDetail() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45629, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45629, new Class[0], Void.TYPE);
            return;
        }
        P();
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45622, new Class[0], Void.TYPE);
        } else if (this.f48319d.getForwardItem() != null && this.f48319d.getForwardItem().getAuthor() != null) {
            b(this.mOriginDescView, this.f48319d.getForwardItem());
        }
    }

    public void I() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45618, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mOriginRootView.setOutlineProvider(new dp(this.mOriginRootView.getResources().getDimensionPixelOffset(C0906R.dimen.gh)));
            this.mOriginRootView.setClipToOutline(true);
        }
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45621, new Class[0], Void.TYPE);
        } else if (this.f48319d != null && this.f48319d.getForwardItem() != null && this.f48319d.getForwardItem().getImageInfos() != null) {
            List<ImageInfo> imageInfos = this.f48319d.getForwardItem().getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = imageInfos.get(0);
                if (imageInfo != null) {
                    a((View) this.mImageLayout, imageInfo.getWidth(), imageInfo.getHeight());
                }
            }
        }
    }

    public void u() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45619, new Class[0], Void.TYPE);
            return;
        }
        super.u();
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, s, false, 45617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, s, false, 45617, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mCoverView.setVisibility(0);
        if (this.f48319d.getForwardItem() != null) {
            List<ImageInfo> imageInfos = this.f48319d.getForwardItem().getImageInfos();
            if (!CollectionUtils.isEmpty(imageInfos)) {
                ImageInfo imageInfo = imageInfos.get(0);
                if (imageInfo != null) {
                    if (imageInfo.getLabelLarge() != null) {
                        CollectionUtils.isEmpty(imageInfo.getLabelLarge().getUrlList());
                    }
                    c.a(this.mCoverView, imageInfo.getLabelLarge(), this.mCoverView.getWidth(), this.mCoverView.getHeight());
                }
            }
        }
    }

    public final void p() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45628, new Class[0], Void.TYPE);
        } else if (this.f48319d != null && this.f48319d.getForwardItem() != null) {
            com.ss.android.ugc.aweme.newfollow.g.a.b(this.f48319d, t());
            ((f) this.n).a((long) ea.f66827f);
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Aweme aweme = this.f48319d;
            if (PatchProxy.isSupport(new Object[]{aweme}, this, s, false, 45627, new Class[]{Aweme.class}, a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[]{aweme}, this, s, false, 45627, new Class[]{Aweme.class}, a.class);
            } else {
                a e2 = this.f48318c.e();
                if (e2 instanceof b) {
                    b bVar = (b) e2;
                    if (bVar.a()) {
                        bVar.a(new FollowFeed(aweme));
                    }
                }
                aVar = e2;
            }
            a2.f44610c = aVar;
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, s, false, 45625, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, s, false, 45625, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                ((f) this.n).a(true);
            }
            DetailActivity.a(c(), this.f48319d.getAid(), t(), O(), this.f48319d.getEnterpriseType(), N(), q(), this.mImageLayout);
        }
    }

    @OnClick({2131495258})
    public void onExpandImage(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 45623, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 45623, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            o();
        }
    }

    public f a(l lVar) {
        l lVar2 = lVar;
        if (!PatchProxy.isSupport(new Object[]{lVar2}, this, s, false, 45615, new Class[]{l.class}, f.class)) {
            return new f(this, lVar2);
        }
        return (f) PatchProxy.accessDispatch(new Object[]{lVar2}, this, s, false, 45615, new Class[]{l.class}, f.class);
    }

    public void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 45616, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 45616, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a4h);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a4j);
        a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub4.setLayoutResource(C0906R.layout.a40);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub5.setLayoutResource(C0906R.layout.a42);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwm);
        viewStub6.setLayoutResource(C0906R.layout.a4d);
        a(viewStub6.inflate(), 12.0f);
    }

    public ForwardImageViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, aVar2, aVar3);
        this.n = a(lVar);
    }
}
