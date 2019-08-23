package com.ss.android.ugc.aweme.share;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qrcode.f.a;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class bp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64811a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileShareActivity f64812b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64813c;

    /* renamed from: d  reason: collision with root package name */
    private final com.douyin.baseshare.a f64814d;

    bp(ProfileShareActivity profileShareActivity, a aVar, com.douyin.baseshare.a aVar2) {
        this.f64812b = profileShareActivity;
        this.f64813c = aVar;
        this.f64814d = aVar2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f64811a, false, 73206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64811a, false, 73206, new Class[0], Void.TYPE);
            return;
        }
        ProfileShareActivity profileShareActivity = this.f64812b;
        a aVar = this.f64813c;
        com.douyin.baseshare.a aVar2 = this.f64814d;
        if (aVar != null) {
            aVar.dismiss();
        }
        String d2 = aVar2.d();
        if (PatchProxy.isSupport(new Object[]{d2}, profileShareActivity, ProfileShareActivity.f64514a, false, 73198, new Class[]{String.class}, Void.TYPE)) {
            Object[] objArr = {d2};
            ProfileShareActivity profileShareActivity2 = profileShareActivity;
            PatchProxy.accessDispatch(objArr, profileShareActivity2, ProfileShareActivity.f64514a, false, 73198, new Class[]{String.class}, Void.TYPE);
        } else {
            Intent intent = new Intent();
            intent.putExtra("type", d2);
            profileShareActivity.setResult(-1, intent);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("share_type", profileShareActivity.f64517d);
            r.onEvent(MobClick.obtain().setEventName("share_person").setLabelName(aVar2.d()).setValue(profileShareActivity.f64515b.getUid()).setJsonObject(jSONObject));
        } catch (JSONException unused) {
        }
    }
}
