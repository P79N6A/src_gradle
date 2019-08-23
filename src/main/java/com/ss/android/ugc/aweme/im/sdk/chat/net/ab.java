package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ab extends aa {
    public static ChangeQuickRedirect k;

    public static String a(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, null, k, true, 51325, new Class[]{n.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{nVar}, null, k, true, 51325, new Class[]{n.class}, String.class);
        } else if (nVar == null) {
            return "";
        } else {
            return "upload" + nVar.getIndex() + "_" + nVar.getUuid();
        }
    }
}
