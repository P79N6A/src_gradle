package com.bytedance.android.live.core.network;

import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String url;
    private String xTtLogId;

    public final String getUrl() {
        return this.url;
    }

    public final String getMessage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 402, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 402, new Class[0], String.class);
        }
        return " TYPE = CustomApiServerException, url = " + this.url + ", xTtLogId = " + this.xTtLogId + "  " + super.getMessage();
    }

    public b(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.url = "";
        } else {
            this.url = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.xTtLogId = "";
        } else {
            this.xTtLogId = str2;
        }
    }
}
