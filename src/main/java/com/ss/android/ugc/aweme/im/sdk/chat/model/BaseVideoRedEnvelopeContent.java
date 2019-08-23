package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.service.c;
import com.ss.android.ugc.aweme.im.service.model.d;
import com.ss.android.ugc.aweme.im.service.model.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseVideoRedEnvelopeContent;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseRedEnvelopeContent;", "()V", "tryInit", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class BaseVideoRedEnvelopeContent extends BaseRedEnvelopeContent {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BaseVideoRedEnvelopeContent() {
        String string = GlobalContext.getContext().getString(C0906R.string.b0m);
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…xplan_video_red_envelope)");
        setRedEnvelopeTitle(string);
    }

    public void tryInit() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51106, new Class[0], Void.TYPE);
            return;
        }
        a a2 = a.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeImManager.instance()");
        c e2 = a2.e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "AwemeImManager.instance().proxy");
        d iMSetting = e2.getIMSetting();
        Intrinsics.checkExpressionValueIsNotNull(iMSetting, "AwemeImManager.instance().proxy.imSetting");
        e eVar = iMSetting.f52883f;
        if (eVar == null || TextUtils.isEmpty(eVar.v)) {
            str = GlobalContext.getContext().getString(C0906R.string.b0q);
        } else {
            str = eVar.v;
        }
        this.msgHint = str;
    }
}
