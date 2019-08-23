package com.ss.android.ugc.aweme.miniapp.c.a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.api.b.b;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.downloadlib.h;
import com.ss.android.excitingvideo.model.ExcitingDownloadAdEventModel;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55607a;

    /* renamed from: b  reason: collision with root package name */
    Context f55608b;

    public d(Context context) {
        this.f55608b = context;
    }

    public static String a(ExcitingDownloadAdEventModel excitingDownloadAdEventModel) {
        if (PatchProxy.isSupport(new Object[]{excitingDownloadAdEventModel}, null, f55607a, true, 59364, new Class[]{ExcitingDownloadAdEventModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{excitingDownloadAdEventModel}, null, f55607a, true, 59364, new Class[]{ExcitingDownloadAdEventModel.class}, String.class);
        } else if (excitingDownloadAdEventModel == null) {
            return "";
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("getClickButtonTag", excitingDownloadAdEventModel.getClickButtonTag());
                jSONObject.put("getClickStartLabel", excitingDownloadAdEventModel.getClickStartLabel());
                jSONObject.put("getClickPauseLabel", excitingDownloadAdEventModel.getClickPauseLabel());
                jSONObject.put("getClickContinueLabel", excitingDownloadAdEventModel.getClickContinueLabel());
                jSONObject.put("getClickInstallLabel", excitingDownloadAdEventModel.getClickInstallLabel());
                jSONObject.put("getClickOpenLabel", excitingDownloadAdEventModel.getClickOpenLabel());
                jSONObject.put("getClickTag", excitingDownloadAdEventModel.getClickTag());
                jSONObject.put("getClickStartTag", excitingDownloadAdEventModel.getClickStartTag());
                jSONObject.put("getClickPauseTag", excitingDownloadAdEventModel.getClickPauseTag());
                jSONObject.put("getClickContinueTag", excitingDownloadAdEventModel.getClickContinueTag());
                jSONObject.put("getClickInstallTag", excitingDownloadAdEventModel.getClickInstallTag());
                jSONObject.put("getClickOpenTag", excitingDownloadAdEventModel.getClickOpenTag());
                jSONObject.put("isEnableClickEvent", excitingDownloadAdEventModel.isEnableClickEvent());
                jSONObject.put("isEnableNoChargeClickEvent", excitingDownloadAdEventModel.isEnableNoChargeClickEvent());
                jSONObject.put("isEnableV3Event", excitingDownloadAdEventModel.isEnableV3Event());
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public static b a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f55607a, true, 59365, new Class[]{String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str2}, null, f55607a, true, 59365, new Class[]{String.class}, b.class);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                b.a l = new b.a().a(jSONObject.optString("getClickButtonTag")).h(jSONObject.optString("getClickStartLabel")).i(jSONObject.optString("getClickPauseLabel")).j(jSONObject.optString("getClickContinueLabel")).k(jSONObject.optString("getClickInstallLabel")).l(jSONObject.optString("getClickOpenLabel"));
                l.f28635d = jSONObject.optString("getClickTag");
                return l.c(jSONObject.optString("getClickStartTag")).d(jSONObject.optString("getClickPauseTag")).e(jSONObject.optString("getClickContinueTag")).f(jSONObject.optString("getClickInstallTag")).g(jSONObject.optString("getClickOpenTag")).a(jSONObject.optBoolean("isEnableClickEvent")).b(jSONObject.optBoolean("isEnableNoChargeClickEvent")).c(jSONObject.optBoolean("isEnableV3Event")).a();
            } catch (JSONException unused) {
            }
        }
        return new b.a().a("landing_ad").b("landing_ad").j("click_continue").k("click_install").i("click_pause").a();
    }

    /* access modifiers changed from: package-private */
    public void a(@NonNull CrossProcessDataEntity crossProcessDataEntity, String str) {
        CrossProcessDataEntity crossProcessDataEntity2 = crossProcessDataEntity;
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2, str2}, this, f55607a, false, 59363, new Class[]{CrossProcessDataEntity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2, str2}, this, f55607a, false, 59363, new Class[]{CrossProcessDataEntity.class, String.class}, Void.TYPE);
            return;
        }
        try {
            i = Integer.parseInt(crossProcessDataEntity2.getString("downloadToken"));
        } catch (NumberFormatException unused) {
        }
        h.a(this.f55608b).a(str2, i);
    }
}
