package com.ss.android.ugc.aweme.following.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FollowingListFragment_ViewBinding extends SimpleUserFragment_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48026a;

    /* renamed from: c  reason: collision with root package name */
    private FollowingListFragment f48027c;

    /* renamed from: d  reason: collision with root package name */
    private View f48028d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48026a, false, 44985, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48026a, false, 44985, new Class[0], Void.TYPE);
            return;
        }
        FollowingListFragment followingListFragment = this.f48027c;
        if (followingListFragment != null) {
            this.f48027c = null;
            followingListFragment.imgAddFriends = null;
            followingListFragment.mVSpit = null;
            this.f48028d.setOnClickListener(null);
            this.f48028d = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowingListFragment_ViewBinding(final FollowingListFragment followingListFragment, View view) {
        super(followingListFragment, view);
        this.f48027c = followingListFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dj, "field 'imgAddFriends' and method 'onViewClicked'");
        followingListFragment.imgAddFriends = (ImageView) Utils.castView(findRequiredView, C0906R.id.dj, "field 'imgAddFriends'", ImageView.class);
        this.f48028d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48029a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48029a, false, 44986, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48029a, false, 44986, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                followingListFragment.onViewClicked();
            }
        });
        followingListFragment.mVSpit = Utils.findRequiredView(view, C0906R.id.dqu, "field 'mVSpit'");
    }
}
