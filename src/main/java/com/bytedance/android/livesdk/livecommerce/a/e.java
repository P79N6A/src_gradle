package com.bytedance.android.livesdk.livecommerce.a;

import com.meituan.robust.ChangeQuickRedirect;

public class e extends d {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f15900c;

    public e(String str, String str2, String str3, String str4, int i) {
        super("livesdk_product_entrance_click");
        a("anchor_id", str);
        a("room_id", str2);
        a("carrier_type", str3);
        a("destination", str4);
        a("follow_status", i);
    }
}
