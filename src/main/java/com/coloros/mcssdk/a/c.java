package com.coloros.mcssdk.a;

import android.content.Context;
import android.content.Intent;
import com.coloros.mcssdk.PushManager;
import com.coloros.mcssdk.c.b;
import com.coloros.mcssdk.c.d;
import com.coloros.mcssdk.mode.Message;
import java.util.ArrayList;
import java.util.List;

public abstract class c implements d {
    public static List<Message> a(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        int i = 4096;
        try {
            i = Integer.parseInt(b.a(intent.getStringExtra("type")));
        } catch (Exception e2) {
            d.b("MessageParser--getMessageByIntent--Exception:" + e2.getMessage());
        }
        d.a("MessageParser--getMessageByIntent--type:".concat(String.valueOf(i)));
        ArrayList arrayList = new ArrayList();
        for (d next : PushManager.getInstance().getParsers()) {
            if (next != null) {
                Message a2 = next.a(context, i, intent);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public abstract Message a(Intent intent);
}
