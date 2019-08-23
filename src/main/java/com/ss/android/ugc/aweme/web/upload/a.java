package com.ss.android.ugc.aweme.web.upload;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76892a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseAdapter f76893b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76894c;

    /* renamed from: d  reason: collision with root package name */
    private final String f76895d;

    a(ImageChooseAdapter imageChooseAdapter, int i, String str) {
        this.f76893b = imageChooseAdapter;
        this.f76894c = i;
        this.f76895d = str;
    }

    public final void onClick(View view) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f76892a, false, 90098, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76892a, false, 90098, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ImageChooseAdapter imageChooseAdapter = this.f76893b;
        int i = this.f76894c;
        String str = this.f76895d;
        if (!imageChooseAdapter.h) {
            if (i >= 0 || imageChooseAdapter.f76868e.size() < imageChooseAdapter.g) {
                z = false;
            }
            if (!z) {
                imageChooseAdapter.i.a(view, str);
            }
        }
    }
}
