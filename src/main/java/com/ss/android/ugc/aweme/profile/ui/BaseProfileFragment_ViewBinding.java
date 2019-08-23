package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;

public class BaseProfileFragment_ViewBinding implements Unbinder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f61748c;

    /* renamed from: a  reason: collision with root package name */
    private BaseProfileFragment f61749a;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f61748c, false, 67895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61748c, false, 67895, new Class[0], Void.TYPE);
            return;
        }
        BaseProfileFragment baseProfileFragment = this.f61749a;
        if (baseProfileFragment != null) {
            this.f61749a = null;
            baseProfileFragment.mStatusView = null;
            baseProfileFragment.mScrollableLayout = null;
            baseProfileFragment.mTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseProfileFragment_ViewBinding(BaseProfileFragment baseProfileFragment, View view) {
        this.f61749a = baseProfileFragment;
        baseProfileFragment.mStatusView = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusView'");
        baseProfileFragment.mScrollableLayout = (DampScrollableLayout) Utils.findRequiredViewAsType(view, C0906R.id.ck9, "field 'mScrollableLayout'", DampScrollableLayout.class);
        baseProfileFragment.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
    }
}
