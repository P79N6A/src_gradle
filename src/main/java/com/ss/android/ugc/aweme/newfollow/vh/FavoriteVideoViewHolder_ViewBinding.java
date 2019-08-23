package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;

public class FavoriteVideoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57508a;

    /* renamed from: b  reason: collision with root package name */
    private FavoriteVideoViewHolder f57509b;

    /* renamed from: c  reason: collision with root package name */
    private View f57510c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57508a, false, 62113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57508a, false, 62113, new Class[0], Void.TYPE);
            return;
        }
        FavoriteVideoViewHolder favoriteVideoViewHolder = this.f57509b;
        if (favoriteVideoViewHolder != null) {
            this.f57509b = null;
            favoriteVideoViewHolder.mAvatarView = null;
            favoriteVideoViewHolder.mHeadUserNameView = null;
            favoriteVideoViewHolder.mHeadUserFavoriteView = null;
            favoriteVideoViewHolder.mCreateTime = null;
            favoriteVideoViewHolder.mRecycleView = null;
            this.f57510c.setOnClickListener(null);
            this.f57510c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FavoriteVideoViewHolder_ViewBinding(final FavoriteVideoViewHolder favoriteVideoViewHolder, View view) {
        this.f57509b = favoriteVideoViewHolder;
        favoriteVideoViewHolder.mAvatarView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.dp2, "field 'mAvatarView'", AvatarImageView.class);
        favoriteVideoViewHolder.mHeadUserNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dlg, "field 'mHeadUserNameView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dlf, "field 'mHeadUserFavoriteView' and method 'gotoFavoriteListActivity'");
        favoriteVideoViewHolder.mHeadUserFavoriteView = (TextView) Utils.castView(findRequiredView, C0906R.id.dlf, "field 'mHeadUserFavoriteView'", TextView.class);
        this.f57510c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57511a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57511a, false, 62114, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57511a, false, 62114, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                favoriteVideoViewHolder.gotoFavoriteListActivity();
            }
        });
        favoriteVideoViewHolder.mCreateTime = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dak, "field 'mCreateTime'", TextView.class);
        favoriteVideoViewHolder.mRecycleView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.ccc, "field 'mRecycleView'", RecyclerView.class);
    }
}
