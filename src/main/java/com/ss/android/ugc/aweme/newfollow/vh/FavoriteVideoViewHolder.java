package com.ss.android.ugc.aweme.newfollow.vh;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.favorites.FavoriteListActivity;
import com.ss.android.ugc.aweme.feed.b.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.newfollow.ui.FavoriteAdapter;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.profile.adapter.AmeDecoration;
import com.ss.android.ugc.aweme.profile.i;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;

public class FavoriteVideoViewHolder extends RecyclerView.ViewHolder implements FavoriteAdapter.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57503b;

    /* renamed from: c  reason: collision with root package name */
    protected FollowFeed f57504c;

    /* renamed from: d  reason: collision with root package name */
    protected GridLayoutManager f57505d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f57506e;

    /* renamed from: f  reason: collision with root package name */
    protected FavoriteAdapter f57507f;
    boolean g;
    @BindView(2131498345)
    AvatarImageView mAvatarView;
    @BindView(2131497877)
    protected TextView mCreateTime;
    @BindView(2131498221)
    TextView mHeadUserFavoriteView;
    @BindView(2131498222)
    TextView mHeadUserNameView;
    @BindView(2131496668)
    RecyclerView mRecycleView;

    private static String b() {
        return "like";
    }

    private static String c() {
        return "trends";
    }

    private String a() {
        if (PatchProxy.isSupport(new Object[0], this, f57503b, false, 62111, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57503b, false, 62111, new Class[0], String.class);
        }
        String str = "";
        List<String> favoriteIds = this.f57504c.getFavoriteIds();
        if (favoriteIds != null && favoriteIds.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (String append : favoriteIds) {
                sb.append(append);
                sb.append(",");
            }
            str = sb.substring(0, sb.lastIndexOf(","));
        }
        return str;
    }

    @OnClick({2131498221})
    public void gotoFavoriteListActivity() {
        String str;
        String str2;
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f57503b, false, 62112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57503b, false, 62112, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            str = d.a().getCurUserId();
            str2 = c.d().getCurUser().getSecUid();
            i = d.a().getCurUser().getFavoritingCount();
        } else {
            if (i.f61546a == null) {
                str = "";
            } else {
                str = i.f61546a.getUid();
            }
            if (i.f61546a == null) {
                str2 = "";
            } else {
                str2 = i.f61546a.getSecUid();
            }
            i = i.f61547b;
        }
        FavoriteListActivity.a(this.f57506e, i, str, str2, this.g, false, c(), b());
    }

    public FavoriteVideoViewHolder(FollowFeedLayout followFeedLayout) {
        super(followFeedLayout);
        RecyclerView.ItemDecoration itemDecoration;
        this.f57506e = followFeedLayout.getContext();
        ButterKnife.bind((Object) this, (View) followFeedLayout);
        this.mRecycleView.setOverScrollMode(2);
        if (PatchProxy.isSupport(new Object[0], this, f57503b, false, 62107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57503b, false, 62107, new Class[0], Void.TYPE);
        } else {
            this.f57505d = new WrapGridLayoutManager(this.f57506e, 4);
        }
        if (PatchProxy.isSupport(new Object[0], this, f57503b, false, 62109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57503b, false, 62109, new Class[0], Void.TYPE);
        } else {
            this.f57507f = new FavoriteAdapter(this);
        }
        this.mRecycleView.setLayoutManager(this.f57505d);
        RecyclerView recyclerView = this.mRecycleView;
        if (PatchProxy.isSupport(new Object[0], this, f57503b, false, 62108, new Class[0], RecyclerView.ItemDecoration.class)) {
            itemDecoration = (RecyclerView.ItemDecoration) PatchProxy.accessDispatch(new Object[0], this, f57503b, false, 62108, new Class[0], RecyclerView.ItemDecoration.class);
        } else {
            itemDecoration = new AmeDecoration((int) UIUtils.dip2Px(this.f57506e, 1.0f), 4);
        }
        recyclerView.addItemDecoration(itemDecoration);
        this.mRecycleView.setAdapter(this.f57507f);
    }

    public void a(FollowFeed followFeed) {
        if (PatchProxy.isSupport(new Object[]{followFeed}, this, f57503b, false, 62106, new Class[]{FollowFeed.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeed}, this, f57503b, false, 62106, new Class[]{FollowFeed.class}, Void.TYPE);
            return;
        }
        this.mCreateTime.setText(eo.b(this.f57506e, followFeed.getBlockFavoriteTime() * 1000));
    }

    public final void a(FollowFeed followFeed, boolean z) {
        User user;
        if (PatchProxy.isSupport(new Object[]{followFeed, Byte.valueOf(z ? (byte) 1 : 0)}, this, f57503b, false, 62105, new Class[]{FollowFeed.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeed, Byte.valueOf(z)}, this, f57503b, false, 62105, new Class[]{FollowFeed.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = z;
        this.f57504c = followFeed;
        TextView textView = this.mHeadUserFavoriteView;
        Resources resources = this.mHeadUserFavoriteView.getResources();
        textView.setText(resources.getString(C0906R.string.adm, new Object[]{followFeed.getLikeCount()}));
        a(followFeed);
        if (z) {
            user = d.a().getCurUser();
        } else {
            user = i.f61546a;
        }
        if (user != null) {
            com.ss.android.ugc.aweme.base.c.b(this.mAvatarView, user.getAvatarThumb());
            this.mHeadUserNameView.setText(user.getNickname());
            this.f57507f.a(followFeed.getFavorites());
        }
    }

    public final void a(View view, Aweme aweme, int i) {
        User user;
        String str;
        if (PatchProxy.isSupport(new Object[]{view, aweme, Integer.valueOf(i)}, this, f57503b, false, 62110, new Class[]{View.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aweme, Integer.valueOf(i)}, this, f57503b, false, 62110, new Class[]{View.class, Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g) {
            user = d.a().getCurUser();
        } else {
            user = i.f61546a;
        }
        h a2 = h.a();
        Activity activity = (Activity) this.f57506e;
        j a3 = j.a("aweme://aweme/detail/" + aweme.getAid()).a("video_from", "favorite_list").a("video_type", 1).a("userid", user.getUid()).a("like_enter_method", "click_cover").a("profile_enterprise_type", aweme.getEnterpriseType()).a("content_source", b()).a("ids", a()).a("tab_name", c());
        if (this.g) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        a2.a(activity, a3.a("refer", str).a());
        b.a(aweme);
    }
}
