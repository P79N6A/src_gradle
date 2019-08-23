package com.ss.android.ugc.aweme.poi.e;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.poi.a.j;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.aw;
import com.ss.android.ugc.aweme.poi.model.b;
import com.ss.android.ugc.aweme.utils.q;
import java.util.List;
import java.util.Locale;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59828a;

    /* renamed from: com.ss.android.ugc.aweme.poi.e.p$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59829a = new int[aw.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.ugc.aweme.poi.model.aw[] r0 = com.ss.android.ugc.aweme.poi.model.aw.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f59829a = r0
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_RESTAURANT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_HOTEL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_SCENERY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_ENTERTAINMENT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_CITY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_SPORTS     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_SHOP     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_SCHOOL     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_TRAFFIC     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_CAR     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_LIFE     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_HOSPITAL     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f59829a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.ss.android.ugc.aweme.poi.model.aw r1 = com.ss.android.ugc.aweme.poi.model.aw.POI_TYPE_HOUSE     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.e.p.AnonymousClass1.<clinit>():void");
        }
    }

    public interface a {
    }

    public static boolean a(PoiStruct poiStruct) {
        if (!PatchProxy.isSupport(new Object[]{poiStruct}, null, f59828a, true, 66875, new Class[]{PoiStruct.class}, Boolean.TYPE)) {
            return poiStruct != null && !c(poiStruct) && poiStruct.getShowHalfCard() == 1;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiStruct}, null, f59828a, true, 66875, new Class[]{PoiStruct.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(List<String> list) {
        boolean equalsIgnoreCase;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{list}, null, f59828a, true, 66876, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list}, null, f59828a, true, 66876, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        }
        String d2 = c.d();
        if (TextUtils.isEmpty(d2) || CollectionUtils.isEmpty(list)) {
            return true;
        }
        for (String next : list) {
            if (a(next)) {
                equalsIgnoreCase = a(next, d2);
            } else {
                equalsIgnoreCase = d2.equalsIgnoreCase(next);
            }
            z = equalsIgnoreCase;
            if (z) {
                return true;
            }
        }
        return z;
    }

    private static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f59828a, true, 66877, new Class[]{String.class}, Boolean.TYPE)) {
            return !TextUtils.isEmpty(str) && str2.endsWith("0000");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f59828a, true, 66877, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    private static boolean a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f59828a, true, 66878, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f59828a, true, 66878, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (str2.length() < 2 || str.length() < 2) {
            return false;
        } else {
            return str4.substring(0, 2).equalsIgnoreCase(str3.substring(0, 2));
        }
    }

    public static boolean a(com.ss.android.ugc.aweme.poi.a aVar, PoiStruct poiStruct) {
        com.ss.android.ugc.aweme.poi.a aVar2 = aVar;
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{aVar2, poiStruct2}, null, f59828a, true, 66880, new Class[]{com.ss.android.ugc.aweme.poi.a.class, PoiStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, poiStruct2}, null, f59828a, true, 66880, new Class[]{com.ss.android.ugc.aweme.poi.a.class, PoiStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (poiStruct.getPoiSubTitleType() != 4) {
            return TextUtils.isEmpty(poiStruct.getPoiSubTitle()) || poiStruct.getPoiSubTitleType() == 0 || (b(poiStruct) && !a(poiStruct.getVoucherReleaseAreas()));
        } else {
            if (aVar2 == null) {
                return true;
            }
            try {
                return c.a(Double.parseDouble(poiStruct2.poiLatitude), Double.parseDouble(poiStruct2.poiLongitude), aVar2.latitude, aVar2.longitude) > 10.0d;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    public static boolean a(com.ss.android.ugc.aweme.poi.a aVar, String str, String str2, String str3) {
        com.ss.android.ugc.aweme.poi.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, str, str2, str3}, null, f59828a, true, 66882, new Class[]{com.ss.android.ugc.aweme.poi.a.class, String.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, str, str2, str3}, null, f59828a, true, 66882, new Class[]{com.ss.android.ugc.aweme.poi.a.class, String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        String str4 = aVar2 == null ? "" : aVar2.city;
        if (!com.ss.android.g.a.a() && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            String lowerCase = str4.toLowerCase();
            String lowerCase2 = str3.toLowerCase();
            if (lowerCase.length() > lowerCase2.length()) {
                return lowerCase.contains(lowerCase2);
            }
            return lowerCase2.contains(lowerCase);
        } else if (aVar2 == null || !aVar.isValid() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            try {
                return c.a(Double.parseDouble(str), Double.parseDouble(str2), aVar2.latitude, aVar2.longitude) < 50.0d;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static boolean a(PoiDetail poiDetail, com.ss.android.ugc.aweme.poi.a aVar) {
        String str;
        PoiDetail poiDetail2 = poiDetail;
        com.ss.android.ugc.aweme.poi.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{poiDetail2, aVar2}, null, f59828a, true, 66883, new Class[]{PoiDetail.class, com.ss.android.ugc.aweme.poi.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiDetail2, aVar2}, null, f59828a, true, 66883, new Class[]{PoiDetail.class, com.ss.android.ugc.aweme.poi.a.class}, Boolean.TYPE)).booleanValue();
        } else if (poiDetail2 == null || poiDetail2.poiStruct == null || aVar2 == null || !aVar.isValid()) {
            return false;
        } else {
            PoiStruct poiStruct = poiDetail.getPoiStruct();
            b address = poiStruct.getAddress();
            String poiLatitude = poiStruct.getPoiLatitude();
            String poiLongitude = poiStruct.getPoiLongitude();
            if (address == null) {
                str = "";
            } else {
                str = address.getCity();
            }
            return a(aVar2, poiLatitude, poiLongitude, str);
        }
    }

    public static boolean a(PoiStruct poiStruct, com.ss.android.ugc.aweme.poi.a aVar) {
        String str;
        com.ss.android.ugc.aweme.poi.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{poiStruct, aVar2}, null, f59828a, true, 66884, new Class[]{PoiStruct.class, com.ss.android.ugc.aweme.poi.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiStruct, aVar2}, null, f59828a, true, 66884, new Class[]{PoiStruct.class, com.ss.android.ugc.aweme.poi.a.class}, Boolean.TYPE)).booleanValue();
        } else if (poiStruct == null || aVar2 == null || !aVar.isValid()) {
            return false;
        } else {
            b address = poiStruct.getAddress();
            String poiLatitude = poiStruct.getPoiLatitude();
            String poiLongitude = poiStruct.getPoiLongitude();
            if (address == null) {
                str = "";
            } else {
                str = address.getCity();
            }
            return a(aVar2, poiLatitude, poiLongitude, str);
        }
    }

    public static void a(RemoteImageView remoteImageView, PoiStruct poiStruct) {
        RemoteImageView remoteImageView2 = remoteImageView;
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, poiStruct2}, null, f59828a, true, 66893, new Class[]{RemoteImageView.class, PoiStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, poiStruct2}, null, f59828a, true, 66893, new Class[]{RemoteImageView.class, PoiStruct.class}, Void.TYPE);
            return;
        }
        int d2 = d(poiStruct);
        remoteImageView2.setImageResource(d2);
        a(remoteImageView2, d2, poiStruct2);
    }

    public static boolean a(double d2, double d3) {
        if (!PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59828a, true, 66900, new Class[]{Double.TYPE, Double.TYPE}, Boolean.TYPE)) {
            return Math.abs(d2) <= 90.0d && Math.abs(d3) <= 180.0d && d2 != 0.0d && d3 != 0.0d;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59828a, true, 66900, new Class[]{Double.TYPE, Double.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static String[] a(com.ss.android.ugc.aweme.poi.a aVar) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.poi.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f59828a, true, 66901, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f59828a, true, 66901, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, String[].class);
        }
        if (aVar2.isGaode) {
            double[] c2 = a.c(aVar2.longitude, aVar2.latitude);
            str = String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(c2[0])});
            str2 = String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(c2[1])});
        } else {
            str = String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(aVar2.longitude)});
            str2 = String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(aVar2.latitude)});
        }
        return new String[]{str2, str};
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f59828a, true, 66886, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59828a, true, 66886, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!com.ss.android.ugc.aweme.i18n.c.a() || d()) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f59828a, true, 66889, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59828a, true, 66889, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!com.ss.android.g.a.c()) {
            return false;
        }
        if (q.c()) {
            return true;
        }
        return e.c();
    }

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f59828a, true, 66874, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f59828a, true, 66874, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            int intValue = g.b().aq().getMaxPicSize().intValue();
            if (intValue >= 0) {
                return intValue;
            }
            return 2000;
        } catch (com.bytedance.ies.a unused) {
            return 2000;
        }
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f59828a, true, 66888, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59828a, true, 66888, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!com.ss.android.ugc.aweme.i18n.c.a() || ((Boolean) SharePrefCache.inst().getShowInteractionStickers().c()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean b(PoiStruct poiStruct) {
        if (PatchProxy.isSupport(new Object[]{poiStruct}, null, f59828a, true, 66881, new Class[]{PoiStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiStruct}, null, f59828a, true, 66881, new Class[]{PoiStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (poiStruct != null && poiStruct.getPoiSubTitleType() == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static String a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f59828a, true, 66892, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f59828a, true, 66892, new Class[]{Integer.TYPE}, String.class);
        } else if (i2 == j.Companion.getTYPE_NEARBY()) {
            return "nearby";
        } else {
            if (i2 == j.Companion.getTYPE_HOTEL()) {
                return "hotel";
            }
            if (i2 == j.Companion.getTYPE_SCENE()) {
                return "tour";
            }
            if (i2 == j.Companion.getTYPE_FOOD()) {
                return "food";
            }
            return "explore";
        }
    }

    private static boolean c(PoiStruct poiStruct) {
        if (PatchProxy.isSupport(new Object[]{poiStruct}, null, f59828a, true, 66879, new Class[]{PoiStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiStruct}, null, f59828a, true, 66879, new Class[]{PoiStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (poiStruct != null && poiStruct.getPoiSubTitleType() == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static int d(PoiStruct poiStruct) {
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{poiStruct2}, null, f59828a, true, 66894, new Class[]{PoiStruct.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{poiStruct2}, null, f59828a, true, 66894, new Class[]{PoiStruct.class}, Integer.TYPE)).intValue();
        }
        int i = 2130839205;
        if (poiStruct2 == null) {
            return 2130839205;
        }
        switch (AnonymousClass1.f59829a[aw.getPoiType(poiStruct2.iconType).ordinal()]) {
            case 1:
                i = 2130839216;
                break;
            case 2:
                i = 2130839204;
                break;
            case 3:
                i = 2130839221;
                break;
            case 4:
                i = 2130839197;
                break;
            case 5:
                i = 2130839193;
                break;
            case 6:
                i = 2130839220;
                break;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                i = 2130839219;
                break;
            case 8:
                i = 2130839194;
                break;
            case 9:
                i = 2130839222;
                break;
            case 10:
                i = 2130839192;
                break;
        }
        return i;
    }

    public static String a(PoiStruct poiStruct, String str) {
        if (PatchProxy.isSupport(new Object[]{poiStruct, str}, null, f59828a, true, 66902, new Class[]{PoiStruct.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{poiStruct, str}, null, f59828a, true, 66902, new Class[]{PoiStruct.class, String.class}, String.class);
        } else if (poiStruct == null) {
            return "";
        } else {
            return (String) poiStruct.get(str);
        }
    }

    private static void a(RemoteImageView remoteImageView, int i, UrlModel urlModel) {
        RemoteImageView remoteImageView2 = remoteImageView;
        int i2 = i;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, Integer.valueOf(i), urlModel2}, null, f59828a, true, 66897, new Class[]{RemoteImageView.class, Integer.TYPE, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, Integer.valueOf(i), urlModel2}, null, f59828a, true, 66897, new Class[]{RemoteImageView.class, Integer.TYPE, UrlModel.class}, Void.TYPE);
        } else if (remoteImageView2 != null && remoteImageView.getContext() != null) {
            try {
                GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(remoteImageView.getContext().getResources());
                genericDraweeHierarchyBuilder.setPlaceholderImage(i2);
                genericDraweeHierarchyBuilder.setFailureImage(i2);
                remoteImageView2.setHierarchy(genericDraweeHierarchyBuilder.build());
                com.ss.android.ugc.aweme.base.c.b(remoteImageView2, urlModel2);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(RemoteImageView remoteImageView, int i, PoiStruct poiStruct) {
        RemoteImageView remoteImageView2 = remoteImageView;
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, Integer.valueOf(i), poiStruct2}, null, f59828a, true, 66895, new Class[]{RemoteImageView.class, Integer.TYPE, PoiStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, Integer.valueOf(i), poiStruct2}, null, f59828a, true, 66895, new Class[]{RemoteImageView.class, Integer.TYPE, PoiStruct.class}, Void.TYPE);
        } else if (poiStruct2 != null) {
            UrlModel urlModel = poiStruct2.iconOnEntry;
            if (urlModel != null) {
                a(remoteImageView2, i, urlModel);
            }
        }
    }
}
