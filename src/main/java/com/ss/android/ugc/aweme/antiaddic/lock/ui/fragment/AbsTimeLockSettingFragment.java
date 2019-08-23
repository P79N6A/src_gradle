package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.b.a;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;

public abstract class AbsTimeLockSettingFragment extends AbsTimeLockFragment implements a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f33489e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f33490f;
    protected com.ss.android.ugc.aweme.antiaddic.lock.a.a g;
    protected DmtStatusView h;
    private View i;

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f33489e, false, 21943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33489e, false, 21943, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.h != null) {
            this.h.b();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f33489e, false, 21944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33489e, false, 21944, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.d();
        }
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f33489e, false, 21945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33489e, false, 21945, new Class[0], Void.TYPE);
            return;
        }
        f();
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f33489e, false, 21946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33489e, false, 21946, new Class[0], Void.TYPE);
            return;
        }
        f();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f33489e, false, 21942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33489e, false, 21942, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.g != null && isViewValid()) {
            this.g.b();
        }
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f33489e, false, 21941, new Class[0], Integer.TYPE)) {
            return ((com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.a) ((SetLockParamViewModel) ViewModelProviders.of(getActivity()).get(SetLockParamViewModel.class)).f33617a.getValue()).f33619a;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33489e, false, 21941, new Class[0], Integer.TYPE)).intValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33489e, false, 21939, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33489e, false, 21939, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.i = view.findViewById(C0906R.id.ix);
        this.i.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33491a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33491a, false, 21947, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33491a, false, 21947, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                AbsTimeLockSettingFragment.this.getActivity().onBackPressed();
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33490f = arguments.getBoolean("from_change_pwd", false);
        }
        if (PatchProxy.isSupport(new Object[0], this, f33489e, false, 21940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33489e, false, 21940, new Class[0], Void.TYPE);
            return;
        }
        this.g = new com.ss.android.ugc.aweme.antiaddic.lock.a.a();
        this.g.a((a) this);
    }
}
