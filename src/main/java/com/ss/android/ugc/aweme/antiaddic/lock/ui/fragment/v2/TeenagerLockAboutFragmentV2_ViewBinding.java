package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.TimeLockDesc;

public class TeenagerLockAboutFragmentV2_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33571a;

    /* renamed from: b  reason: collision with root package name */
    private TeenagerLockAboutFragmentV2 f33572b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33571a, false, 22045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33571a, false, 22045, new Class[0], Void.TYPE);
            return;
        }
        TeenagerLockAboutFragmentV2 teenagerLockAboutFragmentV2 = this.f33572b;
        if (teenagerLockAboutFragmentV2 != null) {
            this.f33572b = null;
            teenagerLockAboutFragmentV2.desc1 = null;
            teenagerLockAboutFragmentV2.desc2 = null;
            teenagerLockAboutFragmentV2.desc3 = null;
            teenagerLockAboutFragmentV2.autoOpenTimelock = null;
            teenagerLockAboutFragmentV2.mBetaDes = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public TeenagerLockAboutFragmentV2_ViewBinding(TeenagerLockAboutFragmentV2 teenagerLockAboutFragmentV2, View view) {
        this.f33572b = teenagerLockAboutFragmentV2;
        teenagerLockAboutFragmentV2.desc1 = (TimeLockDesc) Utils.findRequiredViewAsType(view, C0906R.id.czr, "field 'desc1'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.desc2 = (TimeLockDesc) Utils.findRequiredViewAsType(view, C0906R.id.czs, "field 'desc2'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.desc3 = (TimeLockDesc) Utils.findRequiredViewAsType(view, C0906R.id.czt, "field 'desc3'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.autoOpenTimelock = (TimeLockDesc) Utils.findRequiredViewAsType(view, C0906R.id.czu, "field 'autoOpenTimelock'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.mBetaDes = Utils.findRequiredView(view, C0906R.id.k3, "field 'mBetaDes'");
    }
}
