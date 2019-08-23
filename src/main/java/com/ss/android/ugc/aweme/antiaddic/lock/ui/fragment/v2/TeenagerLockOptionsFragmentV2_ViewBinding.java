package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.TimeLockDesc;

public class TeenagerLockOptionsFragmentV2_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33576a;

    /* renamed from: b  reason: collision with root package name */
    private TeenagerLockOptionsFragmentV2 f33577b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33576a, false, 22053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33576a, false, 22053, new Class[0], Void.TYPE);
            return;
        }
        TeenagerLockOptionsFragmentV2 teenagerLockOptionsFragmentV2 = this.f33577b;
        if (teenagerLockOptionsFragmentV2 != null) {
            this.f33577b = null;
            teenagerLockOptionsFragmentV2.desc1 = null;
            teenagerLockOptionsFragmentV2.desc2 = null;
            teenagerLockOptionsFragmentV2.desc3 = null;
            teenagerLockOptionsFragmentV2.mBetaDes = null;
            teenagerLockOptionsFragmentV2.mBottom = null;
            teenagerLockOptionsFragmentV2.mAppealCloseTeenagerMode = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public TeenagerLockOptionsFragmentV2_ViewBinding(TeenagerLockOptionsFragmentV2 teenagerLockOptionsFragmentV2, View view) {
        this.f33577b = teenagerLockOptionsFragmentV2;
        teenagerLockOptionsFragmentV2.desc1 = (TimeLockDesc) Utils.findRequiredViewAsType(view, C0906R.id.czr, "field 'desc1'", TimeLockDesc.class);
        teenagerLockOptionsFragmentV2.desc2 = (TimeLockDesc) Utils.findRequiredViewAsType(view, C0906R.id.czs, "field 'desc2'", TimeLockDesc.class);
        teenagerLockOptionsFragmentV2.desc3 = (TimeLockDesc) Utils.findRequiredViewAsType(view, C0906R.id.czt, "field 'desc3'", TimeLockDesc.class);
        teenagerLockOptionsFragmentV2.mBetaDes = Utils.findRequiredView(view, C0906R.id.k3, "field 'mBetaDes'");
        teenagerLockOptionsFragmentV2.mBottom = Utils.findRequiredView(view, C0906R.id.m0, "field 'mBottom'");
        teenagerLockOptionsFragmentV2.mAppealCloseTeenagerMode = (Button) Utils.findRequiredViewAsType(view, C0906R.id.no, "field 'mAppealCloseTeenagerMode'", Button.class);
    }
}
