package com.ss.android.ugc.aweme.language;

import android.content.Context;
import android.support.annotation.RawRes;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.utils.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class I18nManagerServiceImpl implements I18nManagerService {
    @RawRes
    public static final int[] ZIP_BEAUTY_FACE_RES_IDS = {0, 0, C0906R.raw.beauty_12_1_1};
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getAppLanguage() {
        return "zh-Hans";
    }

    public boolean isArabicLang(Context context) {
        return false;
    }

    public boolean isIndonesiaByMcc() {
        return false;
    }

    public boolean isKorean() {
        return false;
    }

    public void switchLanguage(String str, Context context) {
    }

    public Locale getCountryLocale() {
        return Locale.CHINA;
    }

    public int[] getZipBeautyFaceResIds() {
        return ZIP_BEAUTY_FACE_RES_IDS;
    }

    public String getAppLogRegion() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55050, new Class[0], String.class)) {
            return Locale.CHINA.getCountry();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55050, new Class[0], String.class);
    }

    public List<b> getI18nItems() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55042, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55042, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        return arrayList;
    }

    public Map<String, b> getLocaleMap() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55043, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55043, new Class[0], Map.class);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Locale.CHINA.getLanguage(), new a());
        return linkedHashMap;
    }

    public String getRNLanguage() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55046, new Class[0], String.class)) {
            return Locale.CHINA.getLanguage();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55046, new Class[0], String.class);
    }

    public String getRegion() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55049, new Class[0], String.class)) {
            return Locale.CHINA.getCountry();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55049, new Class[0], String.class);
    }

    public String getSimCountry() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55047, new Class[0], String.class)) {
            return Locale.CHINA.getCountry();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55047, new Class[0], String.class);
    }

    public String getSysLanguage() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55045, new Class[0], String.class)) {
            return Locale.CHINA.getLanguage();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55045, new Class[0], String.class);
    }

    public String getSysRegion() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55048, new Class[0], String.class)) {
            return Locale.CHINA.getCountry();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55048, new Class[0], String.class);
    }

    public void installCommonParams() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55052, new Class[0], Void.TYPE);
            return;
        }
        NetUtil.setExtraparams(c.f53000b);
    }

    static final /* synthetic */ HashMap lambda$installCommonParams$0$I18nManagerServiceImpl() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("mcc_mnc", q.a());
        hashMap.put("js_sdk_version", ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).getJsSdkVersion());
        hashMap.put("app_type", "normal");
        hashMap.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, String.valueOf(NetworkUtils.getServerTime()));
        if (a.a()) {
            i a2 = i.a();
            if (PatchProxy.isSupport(new Object[0], a2, i.f2653a, false, 22259, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], a2, i.f2653a, false, 22259, new Class[0], String.class);
            } else {
                str = a2.getTweakedChannel();
                if (TextUtils.equals("local_test", str) && ((IAVService) ServiceManager.get().getService(IAVService.class)).getUsingOnline()) {
                    str = "default";
                }
            }
            hashMap.put("effect_channel", str);
        }
        return hashMap;
    }

    public Locale getLocale(String str) {
        return Locale.CHINA;
    }

    public b getCurrentI18nItem(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55051, new Class[]{Context.class}, b.class)) {
            return new a();
        }
        return (b) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55051, new Class[]{Context.class}, b.class);
    }

    public String getLanguage(Locale locale) {
        if (!PatchProxy.isSupport(new Object[]{locale}, this, changeQuickRedirect, false, 55044, new Class[]{Locale.class}, String.class)) {
            return Locale.CHINA.getLanguage();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{locale}, this, changeQuickRedirect, false, 55044, new Class[]{Locale.class}, String.class);
    }
}
