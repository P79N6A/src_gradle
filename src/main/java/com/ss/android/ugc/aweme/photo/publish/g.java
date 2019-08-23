package com.ss.android.ugc.aweme.photo.publish;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.model.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58716a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoUploadSuccessPopView f58717b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f58718c;

    /* renamed from: d  reason: collision with root package name */
    private final f f58719d;

    g(PhotoUploadSuccessPopView photoUploadSuccessPopView, Aweme aweme, f fVar) {
        this.f58717b = photoUploadSuccessPopView;
        this.f58718c = aweme;
        this.f58719d = fVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58716a, false, 63775, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58716a, false, 63775, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PhotoUploadSuccessPopView photoUploadSuccessPopView = this.f58717b;
        Aweme aweme = this.f58718c;
        f fVar = this.f58719d;
        if (AbTestManager.a().bu() != 1) {
            HashMap hashMap = new HashMap();
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                switch (status.getPrivateStatus()) {
                    case 0:
                        hashMap.put("privacy_status", "public");
                        break;
                    case 1:
                        hashMap.put("privacy_status", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
                        break;
                    case 2:
                        hashMap.put("privacy_status", "friend");
                        break;
                }
            }
            hashMap.put("enter_from", "release");
            r.a("click_ad_sticker", (Map) hashMap);
            if (!com.ss.android.ugc.aweme.commercialize.utils.g.a((Context) photoUploadSuccessPopView.f58674c, fVar.f39380a.f39387c, false)) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a((Context) photoUploadSuccessPopView.f58674c, fVar.f39380a.f39388d, fVar.f39380a.f39389e);
            }
        }
    }
}
