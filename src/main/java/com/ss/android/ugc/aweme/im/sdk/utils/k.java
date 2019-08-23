package com.ss.android.ugc.aweme.im.sdk.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52599a;

    public static boolean a(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, f52599a, true, 53389, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, f52599a, true, 53389, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (shareStruct2 == null || shareStruct2.extraParams == null) {
            return false;
        } else {
            return TextUtils.equals(shareStruct2.extraParams.get("IS_FRIEND_PRIVATE"), "true");
        }
    }
}
