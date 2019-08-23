package com.ss.android.ugc.aweme.poi.ui;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity;
import com.ss.android.ugc.aweme.poi.e.h;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60820a;

    /* renamed from: b  reason: collision with root package name */
    private final j f60821b;

    m(j jVar) {
        this.f60821b = jVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60820a, false, 66019, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60820a, false, 66019, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        j jVar = this.f60821b;
        h.a(jVar.f60810c, "click_favourite_hint", d.a().a("enter_from", "poi_page").a("poi_id", jVar.f60810c.getPoiId()));
        jVar.f60811d.dismiss();
        Intent intent = new Intent(jVar.a(), UserFavoritesActivity.class);
        intent.putExtra("index", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        intent.putExtra("enter_from", "poi_page");
        intent.putExtra("enter_method", "click_favourite_hint");
        jVar.a().startActivity(intent);
    }
}
