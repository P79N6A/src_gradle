package com.ss.android.ugc.aweme.cloudcontrol.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class TemplateResponse<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public T data;
    public String message;

    public static TemplateResponse builder(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 27060, new Class[]{Integer.TYPE, String.class}, TemplateResponse.class)) {
            return (TemplateResponse) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 27060, new Class[]{Integer.TYPE, String.class}, TemplateResponse.class);
        }
        TemplateResponse templateResponse = new TemplateResponse();
        templateResponse.code = i;
        templateResponse.message = str2;
        return templateResponse;
    }
}
