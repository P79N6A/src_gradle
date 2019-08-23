package com.ss.android.ugc.aweme.setting.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.login.f;

@Keep
public class ThirdLoginSetting {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("show_num")
    public int directShowNumber;
    @SerializedName("order")
    private String order;

    public f[] getOrder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72249, new Class[0], f[].class)) {
            return (f[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72249, new Class[0], f[].class);
        } else if (TextUtils.isEmpty(this.order)) {
            return null;
        } else {
            String[] split = this.order.split(",");
            f[] fVarArr = new f[split.length];
            for (int i = 0; i < split.length; i++) {
                fVarArr[i] = f.valueOf(split[i].toUpperCase());
            }
            return fVarArr;
        }
    }
}
