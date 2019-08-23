package com.bytedance.android.live.core.b;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.ies.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7826a;

    /* renamed from: b  reason: collision with root package name */
    private static Locale f7827b = new Locale("hi", "IN");

    /* renamed from: c  reason: collision with root package name */
    private static Locale f7828c = new Locale("te", "IN");

    /* renamed from: d  reason: collision with root package name */
    private static Locale f7829d = new Locale("ta", "IN");

    /* renamed from: e  reason: collision with root package name */
    private static Locale f7830e = new Locale("mr", "IN");

    /* renamed from: f  reason: collision with root package name */
    private static Locale f7831f = new Locale("bn", "IN");
    private static Locale g = new Locale("gu", "IN");
    private static Locale h = new Locale("kn", "IN");
    private static Locale i = new Locale("ml", "IN");
    private static Locale j = new Locale("pa", "IN");
    private static Locale k = new Locale(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.a.f69355d, "IN");
    private static Locale l = new Locale("in", "ID");
    private static Locale m = new Locale("vi", "VN");
    private static Locale n = Locale.JAPAN;
    private static Locale o = Locale.KOREA;
    private static Locale p = new Locale("th", "TH");
    private static Locale q = new Locale("pt", "PT");
    private static Locale r = new Locale("ms");
    private static Locale s = Locale.FRANCE;
    private static Locale t = new Locale("ru", "RU");
    private static Locale u = new Locale("es");
    private static Locale v = new Locale("ar");
    private static HashSet<String> w = new HashSet<>(Arrays.asList(new String[]{"en", "hi", "in", "vi", "ko", "ja", "th", "ta", "te", "mr", "ms", "pt", "bn", "fr", "ru", "es", "ar"}));
    private static List<String> x = Arrays.asList(new String[]{"EG", "DZ", "MA", "TN", "LY", "YE", "SS", "DJ", "CMR", "SO", "MR", "SD", "SA", "AE", "OM", "KW", "QA", "BH", "JO", "LB", "PS", "IQ", "SY"});
    private static List<String> y = Arrays.asList(new String[]{"US", "GB"});

    public static Locale a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f7826a, true, 193, new Class[]{Context.class}, Locale.class)) {
            return (Locale) PatchProxy.accessDispatch(new Object[]{context}, null, f7826a, true, 193, new Class[]{Context.class}, Locale.class);
        }
        Locale b2 = b(context);
        if (b2 != null) {
            return a(b2);
        }
        return Locale.getDefault();
    }

    @Nullable
    private static Locale b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f7826a, true, 198, new Class[]{Context.class}, Locale.class)) {
            return (Locale) PatchProxy.accessDispatch(new Object[]{context}, null, f7826a, true, 198, new Class[]{Context.class}, Locale.class);
        }
        Locale locale = null;
        if (context == null) {
            return null;
        }
        try {
            Locale locale2 = (Locale) com.bytedance.android.live.a.a().fromJson(b.a(context).a("sp_lanuage_last_select_tag", ""), Locale.class);
            if (locale2 instanceof Locale) {
                locale = locale2;
            }
        } catch (Exception unused) {
        }
        return locale;
    }

    private static Locale a(Locale locale) {
        Locale locale2;
        if (PatchProxy.isSupport(new Object[]{locale}, null, f7826a, true, 201, new Class[]{Locale.class}, Locale.class)) {
            return (Locale) PatchProxy.accessDispatch(new Object[]{locale}, null, f7826a, true, 201, new Class[]{Locale.class}, Locale.class);
        }
        if (TextUtils.isEmpty(locale.getCountry())) {
            locale2 = new Locale(locale.getLanguage(), Locale.getDefault().getCountry(), locale.getVariant());
        } else {
            locale2 = locale;
        }
        return locale2;
    }
}
