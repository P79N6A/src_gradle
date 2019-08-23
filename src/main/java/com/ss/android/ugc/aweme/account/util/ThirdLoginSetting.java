package com.ss.android.ugc.aweme.account.util;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.l;

@Keep
public class ThirdLoginSetting {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("show_num")
    private int directShowNumber;
    @SerializedName("order")
    private String order;

    public int getDirectShowNumber() {
        return this.directShowNumber;
    }

    public l[] getOrder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21414, new Class[0], l[].class)) {
            return (l[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21414, new Class[0], l[].class);
        } else if (TextUtils.isEmpty(this.order)) {
            return null;
        } else {
            String[] split = this.order.split(",");
            l[] lVarArr = new l[split.length];
            for (int i = 0; i < split.length; i++) {
                lVarArr[i] = l.valueOf(split[i].toUpperCase());
            }
            return lVarArr;
        }
    }
}
