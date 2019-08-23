package com.bytedance.android.livesdk.live.a.a;

import android.os.Build;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.j;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.live.model.Camera2AB;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import org.json.JSONObject;

public final class a implements com.ss.ugc.live.c.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15786a;

    /* renamed from: b  reason: collision with root package name */
    private d f15787b = TTLiveSDKContext.getHostService().b().b();

    private int a(List<FilterModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15786a, false, 10296, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, this, f15786a, false, 10296, new Class[]{List.class}, Integer.TYPE)).intValue();
        }
        int intValue = ((Integer) b.E.a()).intValue();
        if (intValue >= list.size() || intValue >= list.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    public final void a(JSONObject jSONObject) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f15786a, false, 10295, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f15786a, false, 10295, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            int cameraType = ((Camera2AB) LiveConfigSettingKeys.CAMERA_AB_SETTING_KEY.a()).getCameraType();
            if (Build.VERSION.SDK_INT >= 28) {
                cameraType = 2;
            }
            jSONObject.put("camera", cameraType);
            List<FilterModel> list = j.a().f13785b;
            if (!Lists.isEmpty(list)) {
                if (PatchProxy.isSupport(new Object[]{list}, this, f15786a, false, 10297, new Class[]{List.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{list}, this, f15786a, false, 10297, new Class[]{List.class}, String.class);
                } else if (list.isEmpty()) {
                    str = "";
                } else {
                    str = list.get(a(list)).getFilterPath();
                }
                jSONObject.put("filter_opened", !StringUtils.isEmpty(str));
                if (PatchProxy.isSupport(new Object[]{list}, this, f15786a, false, 10298, new Class[]{List.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{list}, this, f15786a, false, 10298, new Class[]{List.class}, String.class);
                } else {
                    str2 = list.get(a(list)).getName();
                }
                jSONObject.put("filter_name", str2);
            }
            jSONObject.put("beauty_white", (double) (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * ((Float) b.F.a()).floatValue()));
            jSONObject.put("beauty_skin", (double) (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13830b.f13834a * ((Float) b.G.a()).floatValue()));
            jSONObject.put("beauty_eye", (double) (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13831c.f13834a * ((Float) b.H.a()).floatValue()));
            jSONObject.put("beauty_face", (double) (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13832d.f13834a * ((Float) b.I.a()).floatValue()));
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("StreamLog", th);
        }
        com.bytedance.android.livesdk.v.j.q().a().a(jSONObject);
    }
}
