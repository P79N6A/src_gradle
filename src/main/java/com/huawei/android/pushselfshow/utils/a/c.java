package com.huawei.android.pushselfshow.utils.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.b.a;
import com.huawei.android.pushselfshow.richpush.a.b;
import com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;

public class c {
    public static ArrayList a(Context context, String str) {
        String str2;
        String[] strArr;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str2 = "SELECT pushmsg._id,pushmsg.msg,pushmsg.token,pushmsg.url,notify.bmp  FROM pushmsg LEFT OUTER JOIN notify ON pushmsg.url = notify.url order by pushmsg._id desc limit 1000;";
            strArr = null;
        } else {
            strArr = new String[]{str};
            str2 = "SELECT pushmsg._id,pushmsg.msg,pushmsg.token,pushmsg.url,notify.bmp  FROM pushmsg LEFT OUTER JOIN notify ON pushmsg.url = notify.url and pushmsg.url = ? order by pushmsg._id desc";
        }
        try {
            cursor = b.a().a(context, RichMediaProvider.a.f25355f, str2, strArr);
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
            cursor = null;
        }
        if (cursor == null) {
            e.a("PushSelfShowLog", "cursor is null.");
            return arrayList;
        }
        while (cursor.moveToNext()) {
            try {
                int i = cursor.getInt(0);
                byte[] blob = cursor.getBlob(1);
                if (blob == null) {
                    e.d("PushSelfShowLog", "msg is null");
                } else {
                    a aVar = new a(blob, " ".getBytes("UTF-8"));
                    if (!aVar.b()) {
                        e.a("PushSelfShowLog", "parseMessage failed");
                    }
                    String string = cursor.getString(3);
                    com.huawei.android.pushselfshow.richpush.favorites.e eVar = new com.huawei.android.pushselfshow.richpush.favorites.e();
                    eVar.a(i);
                    eVar.a(string);
                    eVar.a(aVar);
                    arrayList.add(eVar);
                }
            } catch (Exception e3) {
                e.c("TAG", "query favo error " + e3.toString(), e3);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        e.e("PushSelfShowLog", "query favo size is " + arrayList.size());
        return arrayList;
    }

    public static void a(Context context, int i) {
        try {
            b a2 = b.a();
            Uri uri = RichMediaProvider.a.g;
            a2.a(context, uri, "pushmsg", "_id = ?", new String[]{i});
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
    }

    public static boolean a(Context context, String str, a aVar) {
        if (context == null || str == null || aVar == null) {
            e.e("PushSelfShowLog", "insertPushMsginfo ilegle param");
            return false;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(PushConstants.WEB_URL, str);
            contentValues.put("msg", aVar.c());
            contentValues.put("token", " ".getBytes("UTF-8"));
            e.a("PushSelfShowLog", "insertPushMsginfo select url is %s ,rpl is %s", str, aVar.D);
            ArrayList a2 = a(context, str);
            String str2 = aVar.D;
            int i = 0;
            while (i < a2.size()) {
                if (((com.huawei.android.pushselfshow.richpush.favorites.e) a2.get(i)).b() == null || !str2.equals(((com.huawei.android.pushselfshow.richpush.favorites.e) a2.get(i)).b().D)) {
                    i++;
                } else {
                    e.a("PushSelfShowLog", str2 + " already exist");
                    return true;
                }
            }
            e.e("PushSelfShowLog", "insertPushMsginfo " + contentValues.toString());
            b.a().a(context, RichMediaProvider.a.f25354e, "pushmsg", contentValues);
            return true;
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "insertBmpinfo error", e2);
            return false;
        }
    }
}
