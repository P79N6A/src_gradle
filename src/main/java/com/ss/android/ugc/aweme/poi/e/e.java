package com.ss.android.ugc.aweme.poi.e;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59784a;

    public static boolean a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66801, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66801, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.poiEnableFeedToFullScreen;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66802, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66802, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.autoPlayLive;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66803, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66803, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.useInjectionJsb;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66804, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66804, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.poiNearbyShowPoilabel;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66805, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66805, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.poiNearbyFullscreenShowLive;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66809, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66809, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.simplifyPoiEntry;
        } else {
            i = 1;
        }
        if ((i & 1) > 0) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66810, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66810, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.lowFrequencyLocatingLogic;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66811, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66811, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.poiNearbyAccelerated;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66812, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66812, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.poiOpenReserve;
        } else {
            i = 1;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66813, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66813, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 == null || d2.poiUseMapBox != 1) {
            return false;
        }
        return true;
    }

    public static boolean k() {
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66814, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66814, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!p.d() || l()) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59784a, true, 66815, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f59784a, true, 66815, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!p.d()) {
            return true;
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 != null) {
            i = d2.poiTTEnable;
        } else {
            i = 0;
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public static boolean a(String str, PoiStruct poiStruct) {
        String str2 = str;
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{str2, poiStruct2}, null, f59784a, true, 66816, new Class[]{String.class, PoiStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, poiStruct2}, null, f59784a, true, 66816, new Class[]{String.class, PoiStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.equals("homepage_hot", str2) || poiStruct.getPoiCard().getIsShow() != 1 || !p.a(poiStruct2, af.a((Context) k.a()).f())) {
            return false;
        } else {
            return true;
        }
    }
}
