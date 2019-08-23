package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.l;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.discover.a.c;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;

public class RecommendCardViewHolder extends AnimatedViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41731a;
    @BindView(2131493169)
    CircleImageView avatar;

    /* renamed from: b  reason: collision with root package name */
    public LottieComposition f41732b;

    /* renamed from: c  reason: collision with root package name */
    public User f41733c;
    @BindView(2131493580)
    FrameLayout closeContainer;
    @BindView(2131493582)
    ImageView closeIv;

    /* renamed from: d  reason: collision with root package name */
    Context f41734d;
    @BindView(2131493918)
    View descriptionBg;

    /* renamed from: e  reason: collision with root package name */
    public boolean f41735e;
    @BindView(2131495032)
    AnimationImageView ivFollow;
    private aa k;
    @BindView(2131495895)
    View nickNameBg;
    @BindView(2131496852)
    LinearLayout rootLayout;
    @BindView(2131493917)
    TextView txtDescription;
    @BindView(2131495894)
    TextView txtNickName;

    public final void a() {
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41731a, false, 35738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41731a, false, 35738, new Class[0], Void.TYPE);
        } else if (this.f41732b == null) {
            LottieComposition.Factory.fromAssetFileName(this.f41734d, "anim_follow_people.json", new l() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41740a;

                public final void a(LottieComposition lottieComposition) {
                    if (PatchProxy.isSupport(new Object[]{lottieComposition}, this, f41740a, false, 35742, new Class[]{LottieComposition.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{lottieComposition}, this, f41740a, false, 35742, new Class[]{LottieComposition.class}, Void.TYPE);
                        return;
                    }
                    RecommendCardViewHolder.this.f41732b = lottieComposition;
                    RecommendCardViewHolder.this.ivFollow.setComposition(RecommendCardViewHolder.this.f41732b);
                }
            });
        } else {
            this.ivFollow.setComposition(this.f41732b);
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f41731a, false, 35737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41731a, false, 35737, new Class[0], Void.TYPE);
            return;
        }
        c();
        if (TextUtils.equals(d.a().getCurUserId(), this.f41733c.getUid())) {
            this.ivFollow.setVisibility(4);
        } else if (this.f41733c.getFollowStatus() == 0) {
            this.ivFollow.setVisibility(0);
            this.ivFollow.setProgress(0.0f);
        } else {
            this.ivFollow.setVisibility(4);
            this.ivFollow.setProgress(1.0f);
        }
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f41731a, false, 35735, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f41731a, false, 35735, new Class[]{User.class}, Void.TYPE);
            return;
        }
        String str = "";
        if (!StringUtils.isEmpty(user.getNickname())) {
            str = user.getNickname();
        }
        this.txtNickName.setText(str);
        if (user.getRecommendReason() == null || user.getRecommendReason().isEmpty()) {
            this.txtDescription.setText("热门用户");
        } else {
            this.txtDescription.setText(user.getRecommendReason());
        }
        this.avatar.a(user.getAvatarMedium());
        b();
    }

    @OnClick({2131495032, 2131496852})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41731a, false, 35739, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41731a, false, 35739, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.b1d) {
            if (this.f41733c != null) {
                if (PatchProxy.isSupport(new Object[0], this, f41731a, false, 35736, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f41731a, false, 35736, new Class[0], Void.TYPE);
                } else if (!NetworkUtils.isNetworkAvailable(this.f41734d)) {
                    a.b(this.f41734d, (int) C0906R.string.bgf).a();
                } else {
                    String uid = this.f41733c.getUid();
                    if (!TextUtils.equals(uid, d.a().getCurUserId()) && this.f41733c.getFollowStatus() == 0) {
                        if (this.f41733c.getFollowStatus() == 0) {
                            this.ivFollow.setAnimation("anim_follow_people.json");
                            this.ivFollow.playAnimation();
                        }
                        if (this.k != null) {
                            c cVar = new c(uid, "follow");
                            cVar.f41489b = this.f41733c;
                            this.k.a(cVar);
                        }
                    }
                }
            }
        } else if (id == C0906R.id.chy && this.f41733c != null) {
            UserProfileActivity.a(this.f41734d, this.f41733c.getUid(), this.f41733c.getSecUid(), "discovery_recommend");
            if (this.k != null) {
                this.k.a(new c(this.f41733c.getUid(), "enter"));
            }
        }
    }

    public RecommendCardViewHolder(View view, aa aaVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.k = aaVar;
    }
}
