package com.ss.android.ugc.aweme.promote;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.Required;

@Keep
public class PromoteProgramResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Required
    public Boolean confirmed = Boolean.FALSE;

    public boolean isConfirmedSuccess() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70178, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70178, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.confirmed != null && this.confirmed.booleanValue()) {
            z = true;
        }
        return z;
    }
}
