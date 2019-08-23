package com.ss.android.ugc.aweme.story.shootvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.util.j;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73510a;

    public static d a(String str, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4;
        String str5;
        String str6 = str;
        String str7 = str2;
        if (PatchProxy.isSupport(new Object[]{str6, str7, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f73510a, true, 85287, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str6, str7, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, null, f73510a, true, 85287, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, d.class);
        }
        d a2 = d.a().a("creation_id", str7).a("shoot_way", str6);
        if (z2) {
            str3 = "photo";
        } else {
            str3 = "video";
        }
        d a3 = a2.a("content_type", str3);
        if (z) {
            str4 = "upload";
        } else {
            str4 = "shoot";
        }
        d a4 = a3.a("content_source", str4).a("camera_type", j.a()).a("camera_level", a.L.b(e.a.RecordCameraCompatLevel));
        if (z3) {
            str5 = "edit_post_page";
        } else {
            str5 = "video_shoot_page";
        }
        return a4.a("enter_from", str5);
    }
}
