package com.ss.android.ugc.aweme.login;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class c extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53751a;

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f53751a, false, 56336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53751a, false, 56336, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
    }

    public c(@NonNull Context context) {
        super(context, C0906R.style.t3);
        setContentView(LayoutInflater.from(context).inflate(C0906R.layout.ji, null));
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) UIUtils.dip2Px(context, 57.0f);
        attributes.width = (int) UIUtils.dip2Px(context, 57.0f);
        window.setAttributes(attributes);
    }
}
