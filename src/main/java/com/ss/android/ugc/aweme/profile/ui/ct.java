package com.ss.android.ugc.aweme.profile.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.d.w;
import com.ss.android.ugc.aweme.profile.ui.LocationAdapter;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class ct implements LocationAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62607a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditLocationFragment f62608b;

    ct(ProfileEditLocationFragment profileEditLocationFragment) {
        this.f62608b = profileEditLocationFragment;
    }

    public final void a(String str, String str2, int i, int i2, boolean z) {
        String str3 = str;
        String str4 = str2;
        int i3 = i2;
        int i4 = 1;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f62607a, false, 68789, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f62607a, false, 68789, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ProfileEditLocationFragment profileEditLocationFragment = this.f62608b;
        if (TextUtils.equals(str3, "*")) {
            if (profileEditLocationFragment.i != null) {
                List list = (List) profileEditLocationFragment.g.selectedLocation.getValue();
                ((w) list.get(0)).setValue(TextUtils.equals(profileEditLocationFragment.i.country, "中国") ? "CN" : "UNKNOWN", profileEditLocationFragment.i.country);
                String str5 = "";
                if (!TextUtils.isEmpty(profileEditLocationFragment.i.province)) {
                    if (TextUtils.equals(profileEditLocationFragment.i.province, profileEditLocationFragment.i.city) || profileEditLocationFragment.i.province == null || profileEditLocationFragment.i.province.endsWith("市")) {
                        str5 = "city_";
                    } else {
                        ((w) list.get(1)).setValue("", profileEditLocationFragment.i.province);
                        i4 = 2;
                    }
                }
                if (!TextUtils.isEmpty(profileEditLocationFragment.i.city)) {
                    ((w) list.get(i4)).setValue(str5, profileEditLocationFragment.i.city);
                    i4++;
                }
                if (!TextUtils.isEmpty(profileEditLocationFragment.i.district)) {
                    ((w) list.get(i4)).setValue("", profileEditLocationFragment.i.district);
                    i4++;
                }
                ((w) list.get(i4)).setValue(ClassUtils.INNER_CLASS_SEPARATOR, ClassUtils.INNER_CLASS_SEPARATOR);
                profileEditLocationFragment.dismiss();
                if (profileEditLocationFragment.h != null) {
                    profileEditLocationFragment.h.a(str4);
                }
            }
        } else if (TextUtils.equals(str3, "~")) {
            ((w) ((ArrayList) profileEditLocationFragment.g.selectedLocation.getValue()).get(0)).setValue(str3, str4);
            profileEditLocationFragment.dismiss();
            if (profileEditLocationFragment.h != null) {
                profileEditLocationFragment.h.a(str4);
            }
        } else {
            ((w) ((ArrayList) profileEditLocationFragment.g.selectedLocation.getValue()).get(i3)).setValue(str3, str4);
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(profileEditLocationFragment.f62202d);
                sb.append(profileEditLocationFragment.f62202d.isEmpty() ? "" : "-");
                sb.append(i);
                ProfileEditLocationFragment a2 = ProfileEditLocationFragment.a(sb.toString(), str4);
                a2.setUserVisibleHint(true);
                a2.h = new cu(profileEditLocationFragment);
                a2.show(profileEditLocationFragment.getActivity().getSupportFragmentManager(), "ProfileEditLocation");
                return;
            }
            ((w) ((ArrayList) profileEditLocationFragment.g.selectedLocation.getValue()).get(i3 + 1)).setValue(ClassUtils.INNER_CLASS_SEPARATOR, ClassUtils.INNER_CLASS_SEPARATOR);
            profileEditLocationFragment.dismiss();
            if (profileEditLocationFragment.h != null) {
                profileEditLocationFragment.h.a(profileEditLocationFragment.f62203e);
            }
        }
    }
}
