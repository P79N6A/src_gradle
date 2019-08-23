package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.j;
import com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment;
import com.ss.android.ugc.aweme.story.api.i;

public final class av extends AbsMyCommonHeaderLayout {
    public static ChangeQuickRedirect aB;

    public final int getLayout() {
        return C0906R.layout.ac1;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, aB, false, 69631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, aB, false, 69631, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        this.ad.a(j.f61549b, (Object) 1);
    }

    public final void aa_() {
        if (PatchProxy.isSupport(new Object[0], this, aB, false, 69630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, aB, false, 69630, new Class[0], Void.TYPE);
            return;
        }
        super.aa_();
        if (!a.a() && !TimeLockRuler.isTeenModeON()) {
            this.ae.a((int) C0906R.id.agc, ((i) ServiceManager.get().getService(i.class)).a());
        }
    }

    public av(@NonNull Context context, BaseProfileFragment baseProfileFragment) {
        super(context, baseProfileFragment);
    }
}
