package com.ss.android.ugc.aweme.shortvideo.sticker.a;

import android.database.Cursor;
import android.provider.MediaStore;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.dd;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69254a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f69255b = {"_data", "date_added"};

    private static void a(Cursor cursor) {
        if (PatchProxy.isSupport(new Object[]{cursor}, null, f69254a, true, 79033, new Class[]{Cursor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cursor}, null, f69254a, true, 79033, new Class[]{Cursor.class}, Void.TYPE);
            return;
        }
        if (cursor != null) {
            cursor.close();
        }
    }

    public static List<d> a(long j, long j2, String str, int i) {
        d dVar;
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str2, Integer.valueOf(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)}, null, f69254a, true, 79031, new Class[]{Long.TYPE, Long.TYPE, String.class, Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str2, Integer.valueOf(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)}, null, f69254a, true, 79031, new Class[]{Long.TYPE, Long.TYPE, String.class, Integer.TYPE}, List.class);
        }
        dd.a();
        ArrayList arrayList = new ArrayList();
        String str3 = "_data like ? ";
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str2 + "%");
        if (j3 > 0 && j4 > 0) {
            str3 = str3 + "AND date_added NOT BETWEEN ? AND ? ";
            arrayList2.add(String.valueOf(j));
            arrayList2.add(String.valueOf(j2));
        } else if (j3 > 0 || j4 > 0) {
            str3 = str3 + "ANDdate_added > ?";
            arrayList2.add(String.valueOf(Math.max(j, j2)));
        }
        String[] strArr = new String[arrayList2.size()];
        arrayList2.toArray(strArr);
        Cursor query = com.ss.android.ugc.aweme.port.in.a.f61119b.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f69255b, str3, strArr, "date_added DESC LIMIT " + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    if (PatchProxy.isSupport(new Object[]{query}, null, f69254a, true, 79032, new Class[]{Cursor.class}, d.class)) {
                        dVar = (d) PatchProxy.accessDispatch(new Object[]{query}, null, f69254a, true, 79032, new Class[]{Cursor.class}, d.class);
                    } else {
                        dVar = new d();
                        dVar.f69276a = query.getString(0);
                        if (bm.a(dVar.f69276a)) {
                            dVar.f69277b = Math.max(query.getLong(1), new File(dVar.f69276a).lastModified());
                        } else {
                            dVar.f69277b = query.getLong(1);
                        }
                    }
                    arrayList.add(dVar);
                } finally {
                    a(query);
                }
            }
        }
        return arrayList;
    }
}
