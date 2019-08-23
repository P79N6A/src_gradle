package com.ss.android.ugc.aweme.poi.ui.publish;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.poi.e.c;
import com.ss.android.ugc.aweme.poi.model.t;
import java.io.Serializable;

@Keep
public class PoiContext implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public t mPoiActivity;
    public String mSelectPoiId;
    public String mSelectPoiName;
    public String mShootPoiId;
    public double mShootPoiLat;
    public double mShootPoiLng;
    public String mShootPoiName;

    public void setLat(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 66677, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 66677, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mShootPoiLat = safeParseDouble(str);
    }

    public void setLng(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 66678, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 66678, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mShootPoiLng = safeParseDouble(str);
    }

    private double safeParseDouble(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 66676, new Class[]{String.class}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 66676, new Class[]{String.class}, Double.TYPE)).doubleValue();
        } else if (TextUtils.isEmpty(str)) {
            return 0.0d;
        } else {
            try {
                return Double.parseDouble(str);
            } catch (Exception unused) {
                return 0.0d;
            }
        }
    }

    public static String serializeForDraft(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 66673, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 66673, new Class[]{String.class}, String.class);
        }
        PoiContext unserializeFromJson = unserializeFromJson(str);
        if (unserializeFromJson == null) {
            return null;
        }
        if (unserializeFromJson.mPoiActivity != null) {
            unserializeFromJson.mPoiActivity = null;
        }
        return serializeToStr(unserializeFromJson);
    }

    public static String serializeToStr(PoiContext poiContext) {
        PoiContext poiContext2 = poiContext;
        if (PatchProxy.isSupport(new Object[]{poiContext2}, null, changeQuickRedirect, true, 66672, new Class[]{PoiContext.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{poiContext2}, null, changeQuickRedirect, true, 66672, new Class[]{PoiContext.class}, String.class);
        } else if (poiContext2 == null) {
            return null;
        } else {
            return m.d().toJson((Object) poiContext2);
        }
    }

    public static PoiContext unserializeFromJson(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 66674, new Class[]{String.class}, PoiContext.class)) {
            return (PoiContext) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 66674, new Class[]{String.class}, PoiContext.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                PoiStructInToolsLine fromJson = PoiStructInToolsLine.fromJson(str);
                if (fromJson == null) {
                    return (PoiContext) m.d().fromJson(str2, PoiContext.class);
                }
                if (fromJson.poi != null && !TextUtils.isEmpty(fromJson.getPoiId())) {
                    if (!TextUtils.isEmpty(fromJson.getPoiName())) {
                        PoiContext poiContext = new PoiContext();
                        if (PoiStructInToolsLine.hasPoiActivity(fromJson)) {
                            poiContext.mPoiActivity = fromJson.poiActivity;
                            poiContext.mShootPoiId = fromJson.getPoiId();
                            poiContext.mShootPoiName = fromJson.getPoiName();
                            poiContext.setLat(fromJson.poi.getPoiLatitude());
                            poiContext.setLng(fromJson.poi.getPoiLongitude());
                        } else {
                            poiContext.mSelectPoiId = fromJson.getPoiId();
                            poiContext.mSelectPoiName = fromJson.getPoiName();
                        }
                        return poiContext;
                    }
                }
                return (PoiContext) m.d().fromJson(str2, PoiContext.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public boolean hasRecommendPoi(String str, String str2) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3}, this, changeQuickRedirect, false, 66675, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str3}, this, changeQuickRedirect, false, 66675, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        double safeParseDouble = safeParseDouble(str);
        double safeParseDouble2 = safeParseDouble(str3);
        if (!(safeParseDouble == 0.0d || safeParseDouble2 == 0.0d || TextUtils.isEmpty(this.mShootPoiId) || TextUtils.isEmpty(this.mShootPoiName) || this.mShootPoiLat == 0.0d || this.mShootPoiLng == 0.0d)) {
            if (c.a(safeParseDouble, safeParseDouble2, this.mShootPoiLat, this.mShootPoiLng) <= 50.0d) {
                return true;
            }
        }
        return false;
    }
}
