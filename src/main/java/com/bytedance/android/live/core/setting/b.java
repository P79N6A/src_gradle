package com.bytedance.android.live.core.setting;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Type;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8158a;

    /* renamed from: b  reason: collision with root package name */
    private final ABTestDialog f8159b;

    b(ABTestDialog aBTestDialog) {
        this.f8159b = aBTestDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f8158a, false, 884, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f8158a, false, 884, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ABTestDialog aBTestDialog = this.f8159b;
        String str = null;
        try {
            Type c2 = m.c(aBTestDialog.f8127c);
            if (c2 == String.class) {
                str = (String) aBTestDialog.a(String.class, aBTestDialog.a((ViewGroup) aBTestDialog.f8126b, (Object) m.a(aBTestDialog.f8127c)));
            } else if (c2 instanceof Class) {
                str = s.a(aBTestDialog.a((Class) c2, aBTestDialog.a((ViewGroup) aBTestDialog.f8126b, (Object) m.a(aBTestDialog.f8127c))));
            }
            if (m.a(aBTestDialog.f8127c, str)) {
                aBTestDialog.f8129e.accept(Integer.valueOf(aBTestDialog.f8128d));
                aBTestDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }
}
