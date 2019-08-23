package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import java.io.Serializable;

public class j implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("mv_id")
    public String mvThemeId;

    public static j createStruct(String str) {
        j jVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 73902, new Class[]{String.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 73902, new Class[]{String.class}, j.class);
        }
        j jVar2 = new j();
        if (TextUtils.isEmpty(str)) {
            return jVar2;
        }
        try {
            jVar = (j) ((IAVService) ServiceManager.get().getService(IAVService.class)).provideAvGson().fromJson(str2, j.class);
        } catch (Exception unused) {
            jVar = jVar2;
        }
        return jVar;
    }
}
