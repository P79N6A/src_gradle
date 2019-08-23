package com.ss.android.ugc.aweme.newfollow;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.favorites.FavoriteListActivity;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.profile.i;
import com.ss.android.ugc.aweme.profile.model.User;

public class FavoriteTitleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57046a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f57047b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f57048c;

    /* renamed from: d  reason: collision with root package name */
    protected int f57049d;

    /* renamed from: e  reason: collision with root package name */
    protected String f57050e;

    /* renamed from: f  reason: collision with root package name */
    protected String f57051f;
    @BindView(2131494232)
    TextView mFavoriteCountView;

    public FavoriteTitleViewHolder(View view) {
        super(view);
        this.f57047b = view.getContext();
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57046a, false, 61006, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57046a, false, 61006, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (PatchProxy.isSupport(new Object[0], this, f57046a, false, 61007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57046a, false, 61007, new Class[0], Void.TYPE);
            return;
        }
        FavoriteListActivity.a(this.f57047b, this.f57049d, this.f57050e, this.f57051f, this.f57048c, true, "trends", "like");
    }

    public final void a(FollowFeed followFeed, boolean z) {
        User user;
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{followFeed, Byte.valueOf(z ? (byte) 1 : 0)}, this, f57046a, false, 61005, new Class[]{FollowFeed.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeed, Byte.valueOf(z)}, this, f57046a, false, 61005, new Class[]{FollowFeed.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f57048c = z;
        if (z) {
            user = d.a().getCurUser();
        } else {
            user = i.f61546a;
        }
        if (user != null) {
            if (this.f57048c) {
                this.f57050e = d.a().getCurUserId();
                this.f57051f = c.d().getCurUser().getSecUid();
                this.f57049d = d.a().getCurUser().getFavoritingCount();
                str = this.f57049d;
            } else {
                if (i.f61546a == null) {
                    str2 = "";
                } else {
                    str2 = i.f61546a.getUid();
                }
                this.f57050e = str2;
                if (i.f61546a == null) {
                    str3 = "";
                } else {
                    str3 = i.f61546a.getSecUid();
                }
                this.f57051f = str3;
                this.f57049d = i.f61547b;
                str = this.f57049d;
            }
            this.mFavoriteCountView.setText(str);
        }
    }
}
