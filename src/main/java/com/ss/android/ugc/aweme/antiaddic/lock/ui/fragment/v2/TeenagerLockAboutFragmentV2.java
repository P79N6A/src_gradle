package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.View;
import butterknife.BindView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.TimeLockDesc;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public class TeenagerLockAboutFragmentV2 extends AbsAboutFragmentV2 {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f33570f;
    @BindView(2131497475)
    TimeLockDesc autoOpenTimelock;
    @BindView(2131497472)
    TimeLockDesc desc1;
    @BindView(2131497473)
    TimeLockDesc desc2;
    @BindView(2131497474)
    TimeLockDesc desc3;
    @BindView(2131493254)
    View mBetaDes;

    @LayoutRes
    public final int a() {
        return C0906R.layout.qq;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f33570f, false, 22044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33570f, false, 22044, new Class[0], Void.TYPE);
            return;
        }
        r.a("open_teen_mode", (Map) d.a().f34114b);
        super.c();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33570f, false, 22042, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33570f, false, 22042, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (!TimeLockRuler.isTeenagerAbEnable()) {
            this.desc3.setVisibility(8);
            this.desc1.setText(getString(C0906R.string.a1q));
        }
        if (a.a()) {
            this.desc1.setText(getString(C0906R.string.bzx));
            this.desc2.setText(getString(C0906R.string.ble));
            this.mBetaDes.setVisibility(4);
            v.a(false, this.desc3, this.autoOpenTimelock);
        } else if (b.f33436b.b() != b.a.PARENT || !com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            this.desc1.setText(getString(C0906R.string.ciq));
        } else {
            this.desc1.setText(getString(C0906R.string.cip));
        }
        if (f()) {
            if (PatchProxy.isSupport(new Object[0], this, f33570f, false, 22043, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33570f, false, 22043, new Class[0], Void.TYPE);
                return;
            }
            this.f33536b.setText(getString(C0906R.string.bl3));
            this.autoOpenTimelock.setVisibility(8);
            if (a.a()) {
                this.desc1.setText(getString(C0906R.string.bl5));
                this.desc2.setText(getString(C0906R.string.bl6));
                this.desc3.setVisibility(8);
                return;
            }
            this.desc2.setText(getString(C0906R.string.ci9));
            this.desc2.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839843));
            this.desc3.setText(getString(C0906R.string.bl6));
            this.desc3.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839844));
        }
    }
}
