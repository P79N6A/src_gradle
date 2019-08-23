package com.ss.android.ugc.aweme.language;

import android.content.Context;
import android.support.annotation.RawRes;
import java.util.Locale;

public interface I18nManagerService {
    String getAppLanguage();

    Locale getCountryLocale();

    b getCurrentI18nItem(Context context);

    String getLanguage(Locale locale);

    String getRegion();

    String getSysLanguage();

    String getSysRegion();

    @RawRes
    int[] getZipBeautyFaceResIds();

    void installCommonParams();

    boolean isArabicLang(Context context);

    boolean isIndonesiaByMcc();

    boolean isKorean();
}
