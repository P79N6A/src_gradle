package com.bytedance.android.livesdk.feed.banner.adapter;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14049a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14050b;

    b(a aVar) {
        this.f14050b = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14049a, false, 8552, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14049a, false, 8552, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a aVar = this.f14050b;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f14043a, false, 8551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f14043a, false, 8551, new Class[0], Void.TYPE);
            return;
        }
        if (aVar.f14048f != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", aVar.g);
            hashMap.put("banner_id", String.valueOf(aVar.f14048f.getId()));
            com.bytedance.android.livesdk.feed.g.b.a().a("banner_click", hashMap);
            if (!TextUtils.isEmpty(aVar.f14048f.h) && h.e() != null) {
                h.f().j().a(aVar.f14047e, aVar.f14048f.h, new Bundle());
            }
        }
    }
}
