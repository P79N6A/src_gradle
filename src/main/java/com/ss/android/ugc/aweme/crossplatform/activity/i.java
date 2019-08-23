package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.android.ClipboardCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40704a;

    /* renamed from: b  reason: collision with root package name */
    private final h f40705b;

    i(h hVar) {
        this.f40705b = hVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40704a, false, 34188, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40704a, false, 34188, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        h hVar = this.f40705b;
        int id = view.getId();
        PopupWindow a2 = hVar.a();
        if (PatchProxy.isSupport(new Object[]{a2}, null, j.f40706a, true, 34189, new Class[]{PopupWindow.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{a2}, null, j.f40706a, true, 34189, new Class[]{PopupWindow.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a2.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        String currentUrl = hVar.g.c().getCurrentUrl();
        if (id == C0906R.id.bv5) {
            Activity activity = hVar.f40703f;
            if (PatchProxy.isSupport(new Object[]{activity, currentUrl}, null, com.ss.android.ugc.aweme.crossplatform.base.a.f40714a, true, 34197, new Class[]{Activity.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, currentUrl}, null, com.ss.android.ugc.aweme.crossplatform.base.a.f40714a, true, 34197, new Class[]{Activity.class, String.class}, Void.TYPE);
            } else {
                if (!StringUtils.isEmpty(currentUrl)) {
                    try {
                        Intent intent = new Intent();
                        intent.setData(Uri.parse(currentUrl));
                        intent.setAction("android.intent.action.VIEW");
                        activity.startActivity(intent);
                    } catch (Exception unused) {
                    }
                }
            }
        } else if (id == C0906R.id.zw) {
            Activity activity2 = hVar.f40703f;
            if (PatchProxy.isSupport(new Object[]{activity2, currentUrl}, null, com.ss.android.ugc.aweme.crossplatform.base.a.f40714a, true, 34198, new Class[]{Activity.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, currentUrl}, null, com.ss.android.ugc.aweme.crossplatform.base.a.f40714a, true, 34198, new Class[]{Activity.class, String.class}, Void.TYPE);
            } else {
                if (!StringUtils.isEmpty(currentUrl)) {
                    ClipboardCompat.setText(activity2, "", currentUrl);
                    UIUtils.displayToastWithIcon((Context) activity2, 2130838576, (int) C0906R.string.cmq);
                }
            }
        } else if (id == C0906R.id.cct) {
            hVar.g.c().b();
        }
    }
}
