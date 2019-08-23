package com.ss.android.ugc.aweme.commercialize.views.form;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BottomFormDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40093a;

    /* renamed from: b  reason: collision with root package name */
    private BottomFormDialog f40094b;

    /* renamed from: c  reason: collision with root package name */
    private View f40095c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f40093a, false, 33193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40093a, false, 33193, new Class[0], Void.TYPE);
        } else if (this.f40094b != null) {
            this.f40094b = null;
            this.f40095c.setOnClickListener(null);
            this.f40095c = null;
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public BottomFormDialog_ViewBinding(final BottomFormDialog bottomFormDialog, View view) {
        this.f40094b = bottomFormDialog;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ai1, "method 'onClick'");
        this.f40095c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40096a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f40096a, false, 33194, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f40096a, false, 33194, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                bottomFormDialog.onClick(view2);
            }
        });
    }
}
