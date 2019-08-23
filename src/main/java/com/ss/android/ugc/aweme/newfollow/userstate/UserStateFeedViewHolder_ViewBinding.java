package com.ss.android.ugc.aweme.newfollow.userstate;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder_ViewBinding;

public class UserStateFeedViewHolder_ViewBinding extends FlowFeedViewHolder_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57351a;

    /* renamed from: c  reason: collision with root package name */
    private UserStateFeedViewHolder f57352c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57351a, false, 61801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57351a, false, 61801, new Class[0], Void.TYPE);
            return;
        }
        UserStateFeedViewHolder userStateFeedViewHolder = this.f57352c;
        if (userStateFeedViewHolder != null) {
            this.f57352c = null;
            userStateFeedViewHolder.mPrivateAccountView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public UserStateFeedViewHolder_ViewBinding(UserStateFeedViewHolder userStateFeedViewHolder, View view) {
        super(userStateFeedViewHolder, view);
        this.f57352c = userStateFeedViewHolder;
        userStateFeedViewHolder.mPrivateAccountView = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.c6d, "field 'mPrivateAccountView'", RelativeLayout.class);
    }
}
