package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.push.az;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ab {

    /* renamed from: a  reason: collision with root package name */
    private static Object f82485a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static Map<String, Queue<String>> f919a = new HashMap();

    public static boolean a(XMPushService xMPushService, String str, String str2) {
        synchronized (f82485a) {
            SharedPreferences a2 = c.a(xMPushService, "push_message_ids", 0);
            Queue queue = f919a.get(str);
            if (queue == null) {
                String[] split = a2.getString(str, "").split(",");
                LinkedList linkedList = new LinkedList();
                for (String add : split) {
                    linkedList.add(add);
                }
                f919a.put(str, linkedList);
                queue = linkedList;
            }
            if (queue.contains(str2)) {
                return true;
            }
            queue.add(str2);
            if (queue.size() > 25) {
                queue.poll();
            }
            String a3 = az.a((Collection<?>) queue, ",");
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str, a3);
            edit.commit();
            return false;
        }
    }
}
