package com.alimama.tunion.sdk.a;

import android.content.Context;
import android.text.TextUtils;
import com.alimama.tunion.trade.base.ITUnionAppLink;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.applink.TBAppLinkParam;
import com.taobao.applink.TBAppLinkSDK;
import com.taobao.applink.exception.TBAppLinkException;
import com.taobao.applink.param.TBURIParam;

public class a implements ITUnionAppLink {
    public a(Context context, String str, String str2) {
        TBAppLinkSDK.getInstance().init(context, new TBAppLinkParam(str, str2, "", PushConstants.PUSH_TYPE_UPLOAD_LOG));
        TBAppLinkSDK.getInstance().setJumpFailedMode(TBAppLinkSDK.JumpFailedMode.NONE);
    }

    public boolean jumpTBURI(Context context, String str, String str2) {
        TBURIParam tBURIParam = new TBURIParam(str);
        if (!TextUtils.isEmpty(str2)) {
            tBURIParam.setBackUrl(str2);
        }
        try {
            return TBAppLinkSDK.getInstance().jumpTBURI(context, tBURIParam);
        } catch (TBAppLinkException unused) {
            return false;
        }
    }
}
