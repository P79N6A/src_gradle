package com.ss.android.ugc.aweme.photo.publish;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PhotoPublishActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58636a;

    /* renamed from: b  reason: collision with root package name */
    private PhotoPublishActivity f58637b;

    /* renamed from: c  reason: collision with root package name */
    private View f58638c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f58636a, false, 63729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58636a, false, 63729, new Class[0], Void.TYPE);
        } else if (this.f58637b != null) {
            this.f58637b = null;
            this.f58638c.setOnClickListener(null);
            this.f58638c = null;
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public PhotoPublishActivity_ViewBinding(final PhotoPublishActivity photoPublishActivity, View view) {
        this.f58637b = photoPublishActivity;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.iu, "method 'onClick'");
        this.f58638c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58639a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f58639a, false, 63730, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f58639a, false, 63730, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                photoPublishActivity.onClick(view2);
            }
        });
    }
}
