package com.ss.android.ugc.aweme.app.debug;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class AbsABActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34142a;

    /* renamed from: b  reason: collision with root package name */
    private AbsABActivity f34143b;

    /* renamed from: c  reason: collision with root package name */
    private View f34144c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f34142a, false, 23345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34142a, false, 23345, new Class[0], Void.TYPE);
        } else if (this.f34143b != null) {
            this.f34143b = null;
            this.f34144c.setOnClickListener(null);
            this.f34144c = null;
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public AbsABActivity_ViewBinding(final AbsABActivity absABActivity, View view) {
        this.f34143b = absABActivity;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.iu, "method 'back'");
        this.f34144c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34145a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f34145a, false, 23346, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f34145a, false, 23346, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                absABActivity.back();
            }
        });
    }
}
