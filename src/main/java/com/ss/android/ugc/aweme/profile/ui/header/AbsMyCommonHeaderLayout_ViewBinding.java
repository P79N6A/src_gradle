package com.ss.android.ugc.aweme.profile.ui.header;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class AbsMyCommonHeaderLayout_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62780a;

    /* renamed from: b  reason: collision with root package name */
    private AbsMyCommonHeaderLayout f62781b;

    /* renamed from: c  reason: collision with root package name */
    private View f62782c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62780a, false, 69496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62780a, false, 69496, new Class[0], Void.TYPE);
        } else if (this.f62781b != null) {
            this.f62781b = null;
            if (this.f62782c != null) {
                this.f62782c.setOnClickListener(null);
                this.f62782c = null;
            }
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public AbsMyCommonHeaderLayout_ViewBinding(final AbsMyCommonHeaderLayout absMyCommonHeaderLayout, View view) {
        this.f62781b = absMyCommonHeaderLayout;
        View findViewById = view.findViewById(C0906R.id.bpc);
        if (findViewById != null) {
            this.f62782c = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62783a;

                public final void doClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f62783a, false, 69497, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f62783a, false, 69497, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    absMyCommonHeaderLayout.onQrCodeClick(view2);
                }
            });
        }
    }
}
