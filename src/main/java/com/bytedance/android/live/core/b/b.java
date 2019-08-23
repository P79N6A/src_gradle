package com.bytedance.android.live.core.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7832a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, String> f7833b;

    static {
        HashMap hashMap = new HashMap();
        f7833b = hashMap;
        hashMap.put("ar", "ar");
        f7833b.put("bn_in", "bn-IN");
        f7833b.put("en", "en");
        f7833b.put("es", "es");
        f7833b.put("fr_fr", "fr");
        f7833b.put("gu_in", "gu-IN");
        f7833b.put("hi_in", "hi-IN");
        f7833b.put("ja_jp", "ja-JP");
        f7833b.put("kn_in", "kn-IN");
        f7833b.put("ko_kr", "ko-KR");
        f7833b.put("ml_in", "ml-IN");
        f7833b.put("mr_in", "mr-IN");
        f7833b.put("ms", "ms-MY");
        f7833b.put("or_in", "or-IN");
        f7833b.put("pa_in", "pa-IN");
        f7833b.put("pt_br", "pt-BR");
        f7833b.put("pt_pt", "pt-BR");
        f7833b.put("ru_ru", "ru-RU");
        f7833b.put("ta_in", "ta-IN");
        f7833b.put("te_in", "te-IN");
        f7833b.put("th_th", "th-TH");
        f7833b.put("vi_vn", "vi-VN");
        f7833b.put("zh_cn", "zh-hans-CN");
        f7833b.put("de", "de-de");
        f7833b.put("id", "id-ID");
        f7833b.put(AdvanceSetting.NETWORK_TYPE, "it-IT");
        f7833b.put("tr", "tr-TR");
    }

    public static String a(Locale locale) {
        Locale locale2;
        if (PatchProxy.isSupport(new Object[]{locale}, null, f7832a, true, 202, new Class[]{Locale.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{locale}, null, f7832a, true, 202, new Class[]{Locale.class}, String.class);
        } else if ("cnDouyin".equals("i18nVigo")) {
            if (PatchProxy.isSupport(new Object[]{locale}, null, f7832a, true, 203, new Class[]{Locale.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{locale}, null, f7832a, true, 203, new Class[]{Locale.class}, String.class);
            }
            String lowerCase = locale.toString().toLowerCase();
            String lowerCase2 = locale.getLanguage().toLowerCase();
            if (f7833b.containsKey(lowerCase)) {
                return f7833b.get(lowerCase);
            }
            if (f7833b.containsKey(lowerCase2)) {
                return f7833b.get(lowerCase2);
            }
            if (TextUtils.isEmpty(locale.getCountry())) {
                return lowerCase2;
            }
            return locale.getLanguage() + "-" + locale.getCountry();
        } else {
            if (locale == null || locale.getLanguage() == null) {
                locale2 = Locale.getDefault();
            } else {
                locale2 = locale;
            }
            String language = locale2.getLanguage();
            String country = locale2.getCountry();
            if (language.equals("ml") || language.equals("pa") || language.equals("gu") || language.equals("bh") || language.equals("bn") || language.equals("mr")) {
                return language + "-IN";
            } else if (language.equals("pt")) {
                return language + "-BR";
            } else if (language.equals("sv")) {
                return language + "-SE";
            } else if (language.equals("zh") && !TextUtils.equals(country, "CN")) {
                return language + "-TW";
            } else if (!language.equals("es") || !TextUtils.equals(country, "US")) {
                return language;
            } else {
                return language + "-US";
            }
        }
    }
}
