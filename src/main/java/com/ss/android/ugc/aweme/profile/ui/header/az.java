package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment;

public final class az extends aa {
    public static ChangeQuickRedirect bc;

    public final boolean ab_() {
        return false;
    }

    public final int getLayout() {
        return C0906R.layout.apk;
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, bc, false, 69659, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, bc, false, 69659, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a()) {
            z = true;
        }
        return z;
    }

    public az(@NonNull Context context, BaseProfileFragment baseProfileFragment, ay ayVar, WeakHandler weakHandler, aq aqVar) {
        super(context, baseProfileFragment, ayVar, weakHandler, aqVar);
    }
}
