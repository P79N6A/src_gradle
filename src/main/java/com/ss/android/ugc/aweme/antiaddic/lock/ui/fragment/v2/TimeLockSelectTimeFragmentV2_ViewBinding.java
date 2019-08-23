package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TimeLockSelectTimeFragmentV2_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33594a;

    /* renamed from: b  reason: collision with root package name */
    private TimeLockSelectTimeFragmentV2 f33595b;

    /* renamed from: c  reason: collision with root package name */
    private View f33596c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33594a, false, 22085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33594a, false, 22085, new Class[0], Void.TYPE);
            return;
        }
        TimeLockSelectTimeFragmentV2 timeLockSelectTimeFragmentV2 = this.f33595b;
        if (timeLockSelectTimeFragmentV2 != null) {
            this.f33595b = null;
            timeLockSelectTimeFragmentV2.mTitle = null;
            timeLockSelectTimeFragmentV2.mContainerLayout = null;
            this.f33596c.setOnClickListener(null);
            this.f33596c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public TimeLockSelectTimeFragmentV2_ViewBinding(final TimeLockSelectTimeFragmentV2 timeLockSelectTimeFragmentV2, View view) {
        this.f33595b = timeLockSelectTimeFragmentV2;
        timeLockSelectTimeFragmentV2.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        timeLockSelectTimeFragmentV2.mContainerLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.y9, "field 'mContainerLayout'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'back'");
        this.f33596c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33597a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33597a, false, 22086, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33597a, false, 22086, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                timeLockSelectTimeFragmentV2.back();
            }
        });
    }
}
