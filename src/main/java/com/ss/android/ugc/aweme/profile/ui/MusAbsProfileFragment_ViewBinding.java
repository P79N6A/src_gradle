package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MusAbsProfileFragment_ViewBinding extends BaseProfileFragment_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61962a;

    /* renamed from: b  reason: collision with root package name */
    private MusAbsProfileFragment f61963b;

    /* renamed from: d  reason: collision with root package name */
    private View f61964d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f61962a, false, 68248, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61962a, false, 68248, new Class[0], Void.TYPE);
        } else if (this.f61963b != null) {
            this.f61963b = null;
            this.f61964d.setOnClickListener(null);
            this.f61964d = null;
            super.unbind();
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public MusAbsProfileFragment_ViewBinding(final MusAbsProfileFragment musAbsProfileFragment, View view) {
        super(musAbsProfileFragment, view);
        this.f61963b = musAbsProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bni, "method 'onMore'");
        this.f61964d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61965a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f61965a, false, 68249, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f61965a, false, 68249, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musAbsProfileFragment.onMore(view2);
            }
        });
    }
}
