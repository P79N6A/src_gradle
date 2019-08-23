package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.be;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ih {
    private static HashMap<String, ArrayList<io>> a(Context context, List<io> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<io>> hashMap = new HashMap<>();
        for (io next : list) {
            a(context, next);
            ArrayList arrayList = hashMap.get(next.c());
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(next.c(), arrayList);
            }
            arrayList.add(next);
        }
        return hashMap;
    }

    private static void a(Context context, ij ijVar, HashMap<String, ArrayList<io>> hashMap) {
        for (Map.Entry next : hashMap.entrySet()) {
            try {
                ArrayList arrayList = (ArrayList) next.getValue();
                if (!(arrayList == null || arrayList.size() == 0)) {
                    b.a("TinyData is uploaded immediately item size:" + arrayList.size());
                    ijVar.a(arrayList, ((io) arrayList.get(0)).e(), (String) next.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context, ij ijVar, List<io> list) {
        HashMap<String, ArrayList<io>> a2 = a(context, list);
        if (a2 == null || a2.size() == 0) {
            b.a("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
            return;
        }
        a(context, ijVar, a2);
    }

    private static void a(Context context, io ioVar) {
        if (ioVar.f545a) {
            ioVar.a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(ioVar.d())) {
            ioVar.f(be.a());
        }
        ioVar.b(System.currentTimeMillis());
        if (TextUtils.isEmpty(ioVar.e())) {
            ioVar.e(context.getPackageName());
        }
        if (TextUtils.isEmpty(ioVar.c())) {
            ioVar.e(ioVar.e());
        }
    }
}
