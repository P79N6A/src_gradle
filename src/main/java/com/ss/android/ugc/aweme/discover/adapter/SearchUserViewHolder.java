package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerifyAndLive;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.ss.android.ugc.aweme.discover.ui.am;
import com.ss.android.ugc.aweme.discover.ui.ay;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.adapter.a;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.hotsearch.d.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.live.f;
import com.ss.android.ugc.aweme.utils.ex;

public class SearchUserViewHolder extends AbsSearchViewHolder implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41902c;
    @BindView(2131496951)
    ViewStub cardViewStub;

    /* renamed from: d  reason: collision with root package name */
    User f41903d;

    /* renamed from: e  reason: collision with root package name */
    RecyclerView.ViewHolder f41904e;

    /* renamed from: f  reason: collision with root package name */
    ViewGroup f41905f;
    a g;
    private com.ss.android.ugc.aweme.feed.ui.a h;
    private SearchUser i;
    private int j = 56;
    private com.ss.android.ugc.aweme.follow.widet.a k;
    @BindView(2131493383)
    FollowUserBtn mBtnFollow;
    @BindView(2131494950)
    AvatarImageWithVerifyAndLive mIvAvator;
    @BindView(2131494881)
    LiveCircleView mLiveCircle;
    @BindView(2131494690)
    ImageView mLiveTag;
    @BindView(2131497801)
    TextView mTvAwemeId;
    @BindView(2131497886)
    TextView mTvDesc;
    @BindView(2131497909)
    TextView mTvFansCnt;
    @BindView(2131498082)
    TextView mTvRecommendReason;
    @BindView(2131498224)
    TextView mTvUsername;

    public final View a() {
        return this.itemView;
    }

    private String v() {
        if (this.f41524b == null || !this.f41524b.f41974f) {
            return "search_result";
        }
        return "general_search";
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35922, new Class[0], Void.TYPE);
        } else if (h()) {
            this.mBtnFollow.setVisibility(8);
        } else {
            this.k.a(this.f41903d);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35923, new Class[0], Void.TYPE);
            return;
        }
        this.mIvAvator.setData(this.f41903d);
        a(this.f41903d);
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35927, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35927, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (ex.b()) {
            return true;
        } else {
            return i();
        }
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35928, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35928, new Class[0], Boolean.TYPE)).booleanValue();
        }
        int j2 = b.j();
        if (j2 == 1 || j2 == 2) {
            return true;
        }
        return false;
    }

    private boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35929, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35929, new Class[0], Boolean.TYPE)).booleanValue();
        }
        int j2 = b.j();
        if (j2 == 2 || j2 == 3) {
            return true;
        }
        return false;
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35938, new Class[0], Void.TYPE);
            return;
        }
        this.mIvAvator.a(true);
        this.mLiveCircle.setVisibility(0);
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35939, new Class[0], Void.TYPE);
            return;
        }
        this.mIvAvator.a(false);
        this.mLiveCircle.setVisibility(8);
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35940, new Class[0], Void.TYPE);
            return;
        }
        this.mIvAvator.b();
        this.mLiveTag.setVisibility(0);
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35941, new Class[0], Void.TYPE);
            return;
        }
        this.mLiveCircle.setVisibility(8);
        this.mLiveTag.setVisibility(8);
    }

    private void g() {
        SpannableString spannableString;
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35926, new Class[0], Void.TYPE);
            return;
        }
        if (j()) {
            spannableString = n();
        } else {
            spannableString = l();
        }
        if (i()) {
            this.mTvAwemeId.setText(spannableString);
            return;
        }
        this.mTvAwemeId.setText(spannableString);
        this.mTvFansCnt.setText(o());
    }

    private SpannableString m() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35932, new Class[0], SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35932, new Class[0], SpannableString.class);
        }
        if (TextUtils.isEmpty(this.f41903d.getUniqueId())) {
            str = this.f41903d.getShortId();
        } else {
            str = this.f41903d.getUniqueId();
        }
        return com.ss.android.ugc.aweme.base.utils.a.a(this.itemView.getContext(), str, this.i.uniqidPosition);
    }

    private SpannableString n() {
        SpannableString spannableString;
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35933, new Class[0], SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35933, new Class[0], SpannableString.class);
        }
        if (!TextUtils.isEmpty(this.f41903d.getRemarkName())) {
            spannableString = com.ss.android.ugc.aweme.base.utils.a.a(this.mIvAvator.getContext(), this.f41903d.getRemarkName(), this.i.remarkPosition);
        } else {
            spannableString = com.ss.android.ugc.aweme.base.utils.a.a(this.mIvAvator.getContext(), this.f41903d.getNickname(), this.i.position);
        }
        return spannableString;
    }

    private String p() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35935, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35935, new Class[0], String.class);
        }
        String a2 = com.ss.android.ugc.aweme.i18n.b.a((long) this.f41903d.getAwemeCount());
        String string = this.itemView.getContext().getResources().getString(C0906R.string.ds5);
        return a2 + " " + string;
    }

    private String q() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35936, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35936, new Class[0], String.class);
        }
        int followStatus = this.f41903d.getFollowStatus();
        if (followStatus == 1) {
            return this.itemView.getContext().getResources().getString(C0906R.string.agr);
        }
        if (followStatus == 2) {
            return this.itemView.getContext().getResources().getString(C0906R.string.a6u);
        }
        return "";
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35924, new Class[0], Void.TYPE);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j()) {
            spannableStringBuilder.append(m());
        } else {
            spannableStringBuilder.append(n());
        }
        if (i() && !TextUtils.isEmpty(q())) {
            spannableStringBuilder.append(" · ");
            SpannableString spannableString = new SpannableString(q());
            ab.a(spannableString, new ForegroundColorSpan(ContextCompat.getColor(this.itemView.getContext(), C0906R.color.zx)), 0, spannableString.length(), 33);
            ab.a(spannableString, new AbsoluteSizeSpan(14, true), 0, spannableString.length(), 33);
            spannableStringBuilder.append(spannableString);
        }
        this.mTvUsername.setText(spannableStringBuilder);
        h.a(this.mTvUsername, this.f41903d.getStarBillboardRank(), 4, v(), null);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35925, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35925, new Class[0], Void.TYPE);
            return;
        }
        this.mTvDesc.setVisibility(0);
        this.mTvDesc.setCompoundDrawables(null, null, null, null);
        this.mTvDesc.setCompoundDrawablePadding(0);
        if (i()) {
            this.mTvDesc.setText(o() + " · " + p());
        } else if (!TextUtils.isEmpty(this.f41903d.getRemarkName())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            this.mTvDesc.setText(spannableStringBuilder.append(new SpannableString(v.c(a()).getString(C0906R.string.agn))).append(com.ss.android.ugc.aweme.base.utils.a.a(this.mIvAvator.getContext(), this.f41903d.getNickname(), this.i.position)));
        } else if (TextUtils.isEmpty(this.f41903d.getSignature())) {
            this.mTvDesc.setVisibility(8);
        } else {
            this.mTvDesc.setText(this.f41903d.getSignature());
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35930, new Class[0], Void.TYPE);
        } else if (TextUtils.isEmpty(this.f41903d.getRecommendReason())) {
            this.mTvRecommendReason.setVisibility(8);
        } else {
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.mTvRecommendReason.getContext().getResources(), 2130839291);
            a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
            a2.setAlpha(SearchJediMixFeedAdapter.f42517f);
            if (this.mTvDesc.getVisibility() != 0) {
                this.mTvRecommendReason.setVisibility(8);
                this.mTvDesc.setVisibility(0);
                this.mTvDesc.setCompoundDrawablePadding(u.a(2.0d));
                this.mTvDesc.setCompoundDrawables(a2, null, null, null);
                this.mTvDesc.setText(this.f41903d.getRecommendReason());
                return;
            }
            this.mTvRecommendReason.setVisibility(0);
            this.mTvRecommendReason.setCompoundDrawablePadding(u.a(2.0d));
            this.mTvRecommendReason.setCompoundDrawables(a2, null, null, null);
            this.mTvRecommendReason.setText(this.f41903d.getRecommendReason());
        }
    }

    private SpannableString l() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35931, new Class[0], SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35931, new Class[0], SpannableString.class);
        }
        if (TextUtils.isEmpty(this.f41903d.getUniqueId())) {
            str = this.f41903d.getShortId();
        } else {
            str = this.f41903d.getUniqueId();
        }
        String a2 = ay.a(this.itemView.getContext());
        int indexOf = a2.indexOf("%1");
        if (indexOf == -1) {
            indexOf = 0;
        }
        String format = String.format(a2, new Object[]{str});
        if (com.ss.android.g.a.b() && i() && format.endsWith(",")) {
            format = format.substring(0, format.length() - 1);
        }
        return com.ss.android.ugc.aweme.base.utils.a.a(this.itemView.getContext(), format, this.i.uniqidPosition, indexOf);
    }

    private String o() {
        if (PatchProxy.isSupport(new Object[0], this, f41902c, false, 35934, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41902c, false, 35934, new Class[0], String.class);
        } else if (com.ss.android.g.a.a()) {
            String a2 = com.ss.android.ugc.aweme.i18n.b.a((long) this.f41903d.getFollowerCount());
            String string = this.itemView.getContext().getResources().getString(C0906R.string.agu);
            return a2 + " " + string;
        } else {
            Context context = this.itemView.getContext();
            return context.getString(C0906R.string.ad_, new Object[]{this.f41903d.getFollowerCount()});
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41902c, false, 35943, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41902c, false, 35943, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (view.getId() != C0906R.id.ayr || !com.ss.android.ugc.aweme.live.a.a(this.f41903d)) {
                this.g.a(this.f41903d, getAdapterPosition());
            } else {
                f.a(view.getContext(), this.f41903d, v());
            }
        }
    }

    private void a(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f41902c, false, 35937, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f41902c, false, 35937, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (this.h == null) {
            this.h = new com.ss.android.ugc.aweme.feed.ui.a(true, this.mIvAvator, this.mIvAvator, this.mLiveCircle);
        }
        if (user2 != null) {
            this.h.a(user2, getClass(), null);
            if (com.ss.android.ugc.aweme.live.a.a(user)) {
                com.ss.android.ugc.aweme.story.live.b.a(user.getUid(), user2.roomId, v(), "others_photo", user.getRequestId(), -1, com.ss.android.g.a.b(), "");
                if (com.ss.android.g.a.a()) {
                    r();
                } else {
                    t();
                }
            } else if (com.ss.android.g.a.a()) {
                s();
            } else {
                u();
            }
        }
    }

    public final void a(SearchUser searchUser) {
        if (PatchProxy.isSupport(new Object[]{searchUser}, this, f41902c, false, 35921, new Class[]{SearchUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchUser}, this, f41902c, false, 35921, new Class[]{SearchUser.class}, Void.TYPE);
        } else if (searchUser != null && searchUser.user != null) {
            this.i = searchUser;
            this.f41903d = searchUser.user;
            e();
            g();
            f();
            k();
            d();
            c();
            if (searchUser.cardType() != 0) {
                if (this.f41905f == null) {
                    this.f41905f = (ViewGroup) this.cardViewStub.inflate();
                }
                this.f41905f.setVisibility(0);
                this.f41904e = am.a(this.f41905f, searchUser);
                return;
            }
            if (this.f41905f != null) {
                this.f41905f.setVisibility(8);
            }
        }
    }

    public final void a(SuggestUser suggestUser) {
        SuggestUser suggestUser2 = suggestUser;
        if (PatchProxy.isSupport(new Object[]{suggestUser2}, this, f41902c, false, 35920, new Class[]{SuggestUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{suggestUser2}, this, f41902c, false, 35920, new Class[]{SuggestUser.class}, Void.TYPE);
        } else if (suggestUser2 == null || suggestUser2.user == null) {
        } else {
            a(new SearchUser().setUser(suggestUser2.user));
        }
    }

    private SearchUserViewHolder(View view, a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(this);
        this.mIvAvator.setOnClickListener(this);
        this.g = aVar;
        this.k = new com.ss.android.ugc.aweme.follow.widet.a(this.mBtnFollow, new a.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41906a;

            public final String a() {
                return "search_result";
            }

            public final String b() {
                return "click_follow";
            }

            public final int c() {
                return 14;
            }

            public final void a(int i, User user) {
                User user2 = user;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user2}, this, f41906a, false, 35944, new Class[]{Integer.TYPE, User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user2}, this, f41906a, false, 35944, new Class[]{Integer.TYPE, User.class}, Void.TYPE);
                    return;
                }
                SearchUserViewHolder.this.g.a(user2);
            }
        });
    }

    @NonNull
    public static SearchUserViewHolder a(ViewGroup viewGroup, com.ss.android.ugc.aweme.following.ui.adapter.a aVar) {
        ViewGroup viewGroup2 = viewGroup;
        com.ss.android.ugc.aweme.following.ui.adapter.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, aVar2}, null, f41902c, true, 35919, new Class[]{ViewGroup.class, com.ss.android.ugc.aweme.following.ui.adapter.a.class}, SearchUserViewHolder.class)) {
            return new SearchUserViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0g, viewGroup2, false), aVar2);
        }
        return (SearchUserViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, aVar2}, null, f41902c, true, 35919, new Class[]{ViewGroup.class, com.ss.android.ugc.aweme.following.ui.adapter.a.class}, SearchUserViewHolder.class);
    }
}
