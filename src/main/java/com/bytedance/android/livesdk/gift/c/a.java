package com.bytedance.android.livesdk.gift.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends com.bytedance.android.live.a.a.a.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public a() {
        super(-4);
    }

    public final String getMessage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9839, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9839, new Class[0], String.class);
        }
        return " TYPE = SendGiftFailException " + super.getMessage();
    }
}
