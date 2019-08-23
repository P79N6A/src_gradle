package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.common.widget.DragView;

public class AbsFollowFeedDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57181a;

    /* renamed from: b  reason: collision with root package name */
    private AbsFollowFeedDetailActivity f57182b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57181a, false, 61440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57181a, false, 61440, new Class[0], Void.TYPE);
            return;
        }
        AbsFollowFeedDetailActivity absFollowFeedDetailActivity = this.f57182b;
        if (absFollowFeedDetailActivity != null) {
            this.f57182b = null;
            absFollowFeedDetailActivity.mDragView = null;
            absFollowFeedDetailActivity.mDiggLayout = null;
            absFollowFeedDetailActivity.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AbsFollowFeedDetailActivity_ViewBinding(AbsFollowFeedDetailActivity absFollowFeedDetailActivity, View view) {
        this.f57182b = absFollowFeedDetailActivity;
        absFollowFeedDetailActivity.mDragView = (DragView) Utils.findRequiredViewAsType(view, C0906R.id.a45, "field 'mDragView'", DragView.class);
        absFollowFeedDetailActivity.mDiggLayout = (DiggLayout) Utils.findRequiredViewAsType(view, C0906R.id.a51, "field 'mDiggLayout'", DiggLayout.class);
        absFollowFeedDetailActivity.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.chu, "field 'mRootView'", ViewGroup.class);
    }
}
