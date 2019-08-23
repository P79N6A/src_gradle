package com.ss.android.ugc.aweme.poi.ui.publish;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.t;

@Keep
@Deprecated
public class PoiStructInToolsLine {
    public static ChangeQuickRedirect changeQuickRedirect;
    public PoiStruct poi;
    public t poiActivity;
    public final int version = 1;

    public String getPoiId() {
        return this.poi.poiId;
    }

    public String getPoiName() {
        return this.poi.poiName;
    }

    public String toJson() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 66685, new Class[0], String.class)) {
            return m.d().toJson((Object) this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 66685, new Class[0], String.class);
    }

    public static boolean hasPoiActivity(PoiStructInToolsLine poiStructInToolsLine) {
        if (poiStructInToolsLine == null || poiStructInToolsLine.poiActivity == null) {
            return false;
        }
        return true;
    }

    public static String filter(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 66683, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 66683, new Class[]{String.class}, String.class);
        }
        PoiStructInToolsLine fromJson = fromJson(str);
        if (fromJson != null) {
            return fromJson.toJson();
        }
        return null;
    }

    public static String filterForDraft(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 66684, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 66684, new Class[]{String.class}, String.class);
        }
        PoiStructInToolsLine fromJson = fromJson(str);
        if (hasPoiActivity(fromJson)) {
            fromJson.poiActivity = null;
            return fromJson.toJson();
        } else if (fromJson == null || fromJson.poi == null) {
            return null;
        } else {
            return str;
        }
    }

    public static PoiStructInToolsLine fromJson(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 66682, new Class[]{String.class}, PoiStructInToolsLine.class)) {
            return (PoiStructInToolsLine) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 66682, new Class[]{String.class}, PoiStructInToolsLine.class);
        }
        try {
            return (PoiStructInToolsLine) m.d().fromJson(str2, PoiStructInToolsLine.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
