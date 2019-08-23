package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DeleteDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46113a;

    /* renamed from: b  reason: collision with root package name */
    private DeleteDialog f46114b;

    /* renamed from: c  reason: collision with root package name */
    private View f46115c;

    /* renamed from: d  reason: collision with root package name */
    private View f46116d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46113a, false, 42488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46113a, false, 42488, new Class[0], Void.TYPE);
            return;
        }
        DeleteDialog deleteDialog = this.f46114b;
        if (deleteDialog != null) {
            this.f46114b = null;
            deleteDialog.mRootView = null;
            this.f46115c.setOnClickListener(null);
            this.f46115c = null;
            this.f46116d.setOnClickListener(null);
            this.f46116d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DeleteDialog_ViewBinding(final DeleteDialog deleteDialog, View view) {
        this.f46114b = deleteDialog;
        deleteDialog.mRootView = (CoordinatorLayout) Utils.findRequiredViewAsType(view, C0906R.id.chy, "field 'mRootView'", CoordinatorLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.a3g, "method 'onClick'");
        this.f46115c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46117a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46117a, false, 42489, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46117a, false, 42489, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                deleteDialog.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.q2, "method 'cancel'");
        this.f46116d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46120a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46120a, false, 42490, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46120a, false, 42490, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                deleteDialog.cancel();
            }
        });
    }
}
