package com.ss.android.ugc.aweme.setting.ui;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64458a;

    /* renamed from: b  reason: collision with root package name */
    private final TestSettingActivity f64459b;

    y(TestSettingActivity testSettingActivity) {
        this.f64459b = testSettingActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64458a, false, 72822, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64458a, false, 72822, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TestSettingActivity testSettingActivity = this.f64459b;
        if (PatchProxy.isSupport(new Object[0], testSettingActivity, TestSettingActivity.f64283a, false, 72766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], testSettingActivity, TestSettingActivity.f64283a, false, 72766, new Class[0], Void.TYPE);
            return;
        }
        String obj = testSettingActivity.mWebusedefaultEditText.getEditableText().toString();
        if (!TextUtils.isEmpty(obj)) {
            String trim = obj.trim();
            Intent intent = new Intent(testSettingActivity, CrossPlatformActivity.class);
            intent.setData(Uri.parse(trim));
            intent.putExtra(PushConstants.TITLE, "Web测试页");
            testSettingActivity.startActivity(intent);
        }
    }
}
