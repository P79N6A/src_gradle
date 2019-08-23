package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.poi.preview.a;
import com.ss.android.ugc.aweme.u.aa;
import java.util.HashMap;
import java.util.Map;

class TransferLayout$1 extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60145a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f60146b;

    TransferLayout$1(h hVar) {
        this.f60146b = hVar;
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60145a, false, 65470, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60145a, false, 65470, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f60146b.f60196f.f60180b = i;
        if (this.f60146b.f60196f.h) {
            this.f60146b.a(i, 0);
            return;
        }
        for (int i2 = 1; i2 <= this.f60146b.f60196f.f60181c; i2++) {
            this.f60146b.a(i, i2);
        }
    }

    public void onPageScrollStateChanged(int i) {
        String str;
        String str2;
        String str3;
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60145a, false, 65471, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60145a, false, 65471, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 0) {
            int currentItem = this.f60146b.f60194d.getCurrentItem();
            String str4 = this.f60146b.f60196f.x;
            String str5 = this.f60146b.f60196f.y;
            HashMap<String, String> hashMap = this.f60146b.f60196f.z;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(currentItem), str4, str5, hashMap}, null, a.f60117a, true, 65390, new Class[]{Integer.TYPE, String.class, String.class, HashMap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(currentItem), str4, str5, hashMap}, null, a.f60117a, true, 65390, new Class[]{Integer.TYPE, String.class, String.class, HashMap.class}, Void.TYPE);
            } else if (!TextUtils.isEmpty(str5)) {
                d a2 = d.a().a("enter_from", "poi_page").a("enter_method", "slide_pic").a("poi_channel", aa.b()).a("poi_id", str4);
                if (hashMap != null) {
                    str = hashMap.get("poi_type");
                } else {
                    str = "";
                }
                d a3 = a2.a("poi_type", str);
                if (hashMap != null) {
                    str2 = hashMap.get("group_id");
                } else {
                    str2 = "";
                }
                d a4 = a3.a("group_id", str2);
                if (hashMap != null) {
                    str3 = hashMap.get("previous_page");
                } else {
                    str3 = "";
                }
                d a5 = a4.a("previous_page", str3).a("content_type", str5);
                if (hashMap != null) {
                    if (!TextUtils.isEmpty(hashMap.get("poi_backend_type"))) {
                        a5.a("poi_backend_type", hashMap.get("poi_backend_type"));
                    }
                    if (!TextUtils.isEmpty(hashMap.get("poi_city"))) {
                        a5.a("poi_city", hashMap.get("poi_city"));
                        a5.a("poi_device_samecity", hashMap.get("poi_device_samecity"));
                    }
                }
                if (hashMap != null && hashMap.containsKey("pic_tag")) {
                    String str6 = hashMap.get("pic_tag");
                    if (!TextUtils.isEmpty(str6)) {
                        String[] split = str6.split("-");
                        if (split != null && currentItem < split.length) {
                            try {
                                i2 = Integer.parseInt(split[currentItem]);
                            } catch (Exception unused) {
                                i2 = 0;
                            }
                            if (i2 > 0) {
                                a5.a("pic_tag", i2);
                            }
                        }
                    }
                }
                r.a("poi_pic_operation", (Map) a5.f34114b);
            }
        }
    }
}
