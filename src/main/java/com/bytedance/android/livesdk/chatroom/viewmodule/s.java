package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.message.model.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13291a;

    /* renamed from: b  reason: collision with root package name */
    private final DailyRankWidget f13292b;

    /* renamed from: c  reason: collision with root package name */
    private final l f13293c;

    s(DailyRankWidget dailyRankWidget, l lVar) {
        this.f13292b = dailyRankWidget;
        this.f13293c = lVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13291a, false, 6694, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13291a, false, 6694, new Class[]{View.class}, Void.TYPE);
            return;
        }
        DailyRankWidget dailyRankWidget = this.f13292b;
        l lVar = this.f13293c;
        dailyRankWidget.h.a();
        dailyRankWidget.a(0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trace_id", lVar.h);
            f.a(dailyRankWidget.context).a("click_hlbutton", "news", 0, 0, jSONObject);
        } catch (JSONException unused) {
        }
    }
}
