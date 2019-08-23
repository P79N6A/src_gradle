package com.ss.android.ugc.aweme.following.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FollowerListFragment_ViewBinding extends SimpleUserFragment_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47994a;

    /* renamed from: c  reason: collision with root package name */
    private FollowerListFragment f47995c;

    /* renamed from: d  reason: collision with root package name */
    private View f47996d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f47994a, false, 44936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47994a, false, 44936, new Class[0], Void.TYPE);
            return;
        }
        FollowerListFragment followerListFragment = this.f47995c;
        if (followerListFragment != null) {
            this.f47995c = null;
            followerListFragment.viewFansDivider = null;
            followerListFragment.imgAddFriends = null;
            this.f47996d.setOnClickListener(null);
            this.f47996d = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowerListFragment_ViewBinding(final FollowerListFragment followerListFragment, View view) {
        super(followerListFragment, view);
        this.f47995c = followerListFragment;
        followerListFragment.viewFansDivider = Utils.findRequiredView(view, C0906R.id.ac8, "field 'viewFansDivider'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dj, "field 'imgAddFriends' and method 'onViewClicked'");
        followerListFragment.imgAddFriends = (ImageView) Utils.castView(findRequiredView, C0906R.id.dj, "field 'imgAddFriends'", ImageView.class);
        this.f47996d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47997a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f47997a, false, 44937, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f47997a, false, 44937, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                followerListFragment.onViewClicked();
            }
        });
    }
}
