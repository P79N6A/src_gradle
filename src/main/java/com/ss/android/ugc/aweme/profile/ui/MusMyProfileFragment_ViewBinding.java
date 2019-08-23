package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MusMyProfileFragment_ViewBinding extends MusAbsProfileFragment_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f62005b;

    /* renamed from: d  reason: collision with root package name */
    private MusMyProfileFragment f62006d;

    /* renamed from: e  reason: collision with root package name */
    private View f62007e;

    /* renamed from: f  reason: collision with root package name */
    private View f62008f;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62005b, false, 68354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62005b, false, 68354, new Class[0], Void.TYPE);
        } else if (this.f62006d != null) {
            this.f62006d = null;
            this.f62007e.setOnClickListener(null);
            this.f62007e = null;
            this.f62008f.setOnClickListener(null);
            this.f62008f = null;
            super.unbind();
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public MusMyProfileFragment_ViewBinding(final MusMyProfileFragment musMyProfileFragment, View view) {
        super(musMyProfileFragment, view);
        this.f62006d = musMyProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dj, "method 'addFriends'");
        this.f62007e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62009a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62009a, false, 68355, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62009a, false, 68355, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musMyProfileFragment.addFriends(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bni, "method 'onMore'");
        this.f62008f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62012a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62012a, false, 68356, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62012a, false, 68356, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musMyProfileFragment.onMore(view2);
            }
        });
    }
}
