package com.ss.android.ugc.aweme.im.sdk.chat.net;

import a.g;
import a.i;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;

public final /* synthetic */ class v implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51006a;

    /* renamed from: b  reason: collision with root package name */
    static final g f51007b = new v();

    private v() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f51006a, false, 51306, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f51006a, false, 51306, new Class[]{i.class}, Object.class);
        }
        String str = (String) iVar.e();
        if (!TextUtils.isEmpty(str)) {
            UIUtils.displayToast(GlobalContext.getContext(), str);
        }
        return null;
    }
}
