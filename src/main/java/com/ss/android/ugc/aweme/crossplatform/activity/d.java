package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.crossplatform.base.a;
import com.ss.android.ugc.aweme.crossplatform.base.b;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40693a;

    /* renamed from: b  reason: collision with root package name */
    private final b f40694b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f40695c;

    d(b bVar, EditText editText) {
        this.f40694b = bVar;
        this.f40695c = editText;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40693a, false, 34124, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40693a, false, 34124, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        b bVar = this.f40694b;
        EditText editText = this.f40695c;
        if (editText.getText() != null) {
            Activity activity = bVar.f40688b;
            String obj = editText.getText().toString();
            if (PatchProxy.isSupport(new Object[]{activity, obj}, null, a.f40714a, true, 34199, new Class[]{Activity.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, obj}, null, a.f40714a, true, 34199, new Class[]{Activity.class, String.class}, Void.TYPE);
            } else if (!TextUtils.isEmpty(obj)) {
                activity.startActivity(b.a((Context) activity, Uri.parse("").buildUpon().appendQueryParameter(PushConstants.WEB_URL, obj).build()));
            }
        }
    }
}
