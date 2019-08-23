package com.ss.android.ugc.aweme.commercialize.coupon.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public enum a {
    StatusUnReceived(0),
    StatusValid(1),
    StatusRedeemed(2),
    StatusExpired(3),
    StatusRefunded(6);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static a getStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 30446, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 30446, new Class[]{Integer.TYPE}, a.class);
        }
        for (a aVar : values()) {
            if (aVar.value == i) {
                return aVar;
            }
        }
        return StatusValid;
    }

    private a(int i) {
        this.value = i;
    }
}
