package com.ss.android.ugc.aweme.profile.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.d.f;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.profile.d.w;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditLocationFragment;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.List;

public final /* synthetic */ class cl implements ProfileEditLocationFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62592a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditFragment f62593b;

    cl(ProfileEditFragment profileEditFragment) {
        this.f62593b = profileEditFragment;
    }

    public final void a(String str) {
        byte b2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f62592a, false, 68740, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f62592a, false, 68740, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ProfileEditFragment profileEditFragment = this.f62593b;
        if (PatchProxy.isSupport(new Object[0], profileEditFragment, ProfileEditFragment.f62137a, false, 68706, new Class[0], Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[0], profileEditFragment, ProfileEditFragment.f62137a, false, 68706, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            f fVar = new f();
            String str2 = "";
            fVar.country = "";
            fVar.province = "";
            fVar.city = "";
            fVar.district = "";
            List list = (List) profileEditFragment.i.selectedLocation.getValue();
            w wVar = (w) list.get(0);
            if (!TextUtils.isEmpty(wVar.getName())) {
                if (TextUtils.equals(wVar.getName(), "~")) {
                    fVar.country = profileEditFragment.getString(C0906R.string.a6g);
                    b2 = 1;
                } else {
                    if (!TextUtils.equals(wVar.getName(), ClassUtils.INNER_CLASS_SEPARATOR)) {
                        fVar.country = wVar.getName();
                        str2 = wVar.getCode();
                        if (!TextUtils.equals(((w) list.get(1)).getName(), ClassUtils.INNER_CLASS_SEPARATOR)) {
                            if (!((w) list.get(1)).getCode().contains("city_")) {
                                fVar.province = ((w) list.get(1)).getName();
                                if (!TextUtils.equals(((w) list.get(2)).getName(), ClassUtils.INNER_CLASS_SEPARATOR)) {
                                    fVar.city = ((w) list.get(2)).getName();
                                }
                            } else {
                                fVar.province = "";
                                fVar.city = ((w) list.get(1)).getName();
                                if (!TextUtils.equals(((w) list.get(2)).getName(), ClassUtils.INNER_CLASS_SEPARATOR)) {
                                    fVar.district = ((w) list.get(2)).getName();
                                }
                            }
                        }
                    }
                    b2 = 0;
                }
                profileEditFragment.mDmtStatusView.d();
                profileEditFragment.j.setIsoCountryCode(str2);
                profileEditFragment.j.setCountry(fVar.country);
                profileEditFragment.j.setProvince(fVar.province);
                profileEditFragment.j.setCityName(fVar.city);
                profileEditFragment.j.setDistrict(fVar.district);
                ad adVar = profileEditFragment.f62141e;
                String str3 = fVar.country;
                String str4 = fVar.province;
                String str5 = fVar.city;
                String str6 = fVar.district;
                Object[] objArr = {str2, str3, str4, str5, str6, Byte.valueOf(b2)};
                ChangeQuickRedirect changeQuickRedirect = ad.f61573a;
                Class[] clsArr = {String.class, String.class, String.class, String.class, String.class, Boolean.TYPE};
                if (PatchProxy.isSupport(objArr, adVar, changeQuickRedirect, false, 67644, clsArr, Void.TYPE)) {
                    ad adVar2 = adVar;
                    PatchProxy.accessDispatch(new Object[]{str2, str3, str4, str5, str6, Byte.valueOf(b2)}, adVar2, ad.f61573a, false, 67644, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
                } else if (!adVar.f61577e) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("iso_country_code", str2);
                    hashMap.put("country", str3);
                    hashMap.put("province", str4);
                    hashMap.put("city", str5);
                    hashMap.put("district", str6);
                    hashMap.put("hide_location", String.valueOf(b2));
                    d.a().updateLocation(adVar.g, hashMap);
                    adVar.f61577e = true;
                }
            }
        }
    }
}
