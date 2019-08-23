package com.huawei.android.pushagent;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.a.f;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import com.huawei.android.pushagent.utils.c;
import com.huawei.android.pushagent.utils.tools.PushServiceTools;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class PushManager {
    private static Map a(Context context, Map map) {
        HashMap hashMap = new HashMap();
        h hVar = new h(context, "tags_info");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (hVar.e(str)) {
                String b2 = hVar.b(str);
                if (!TextUtils.isEmpty(str2) && str2.equals(b2)) {
                    e.a("PushLogAC2815", "tag has reported:" + entry);
                }
            }
            hashMap.put(str, str2);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void deleteTags(android.content.Context r9, java.util.List r10) throws com.huawei.android.pushagent.PushException {
        /*
            java.lang.Class<com.huawei.android.pushagent.PushManager> r0 = com.huawei.android.pushagent.PushManager.class
            monitor-enter(r0)
            java.lang.String r1 = "push_client_self_info"
            java.lang.String r2 = "token_info"
            java.lang.String r4 = com.huawei.android.pushagent.utils.a.f.a(r9, r1, r2)     // Catch:{ all -> 0x00c4 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x00b5
            if (r10 == 0) goto L_0x00b3
            int r1 = r10.size()     // Catch:{ Exception -> 0x00a1 }
            if (r1 != 0) goto L_0x001b
            goto L_0x00b3
        L_0x001b:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x00a1 }
            r1.<init>()     // Catch:{ Exception -> 0x00a1 }
            com.huawei.android.pushagent.utils.a.h r2 = new com.huawei.android.pushagent.utils.a.h     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = "tags_info"
            r2.<init>(r9, r3)     // Catch:{ Exception -> 0x00a1 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x00a1 }
        L_0x002b:
            boolean r3 = r10.hasNext()     // Catch:{ Exception -> 0x00a1 }
            if (r3 == 0) goto L_0x006e
            java.lang.Object r3 = r10.next()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00a1 }
            boolean r5 = r2.e(r3)     // Catch:{ Exception -> 0x00a1 }
            if (r5 == 0) goto L_0x0057
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a1 }
            r5.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r6 = "tagKey"
            r5.put(r6, r3)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = "opType"
            r6 = 2
            r5.put(r3, r6)     // Catch:{ Exception -> 0x00a1 }
            int r3 = r5.length()     // Catch:{ Exception -> 0x00a1 }
            if (r3 <= 0) goto L_0x002b
            r1.put(r5)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x002b
        L_0x0057:
            java.lang.String r5 = "PushLogAC2815"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1 }
            r6.<init>()     // Catch:{ Exception -> 0x00a1 }
            r6.append(r3)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = " not exist, need not to remove"
            r6.append(r3)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x00a1 }
            com.huawei.android.pushagent.utils.a.e.a(r5, r3)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x002b
        L_0x006e:
            int r10 = r1.length()     // Catch:{ Exception -> 0x00a1 }
            if (r10 <= 0) goto L_0x0098
            java.lang.String r10 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = "begin to deleTags: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x00a1 }
            r2.append(r3)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a1 }
            com.huawei.android.pushagent.utils.a.e.a(r10, r2)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x00a1 }
            r6 = 0
            r8 = 2
            r3 = r9
            com.huawei.android.pushagent.utils.c.a(r3, r4, r5, r6, r8)     // Catch:{ Exception -> 0x00a1 }
            monitor-exit(r0)
            return
        L_0x0098:
            java.lang.String r9 = "PushLogAC2815"
            java.lang.String r10 = "no tag need to delete"
            com.huawei.android.pushagent.utils.a.e.b(r9, r10)     // Catch:{ Exception -> 0x00a1 }
            monitor-exit(r0)
            return
        L_0x00a1:
            r9 = move-exception
            java.lang.String r10 = "PushLogAC2815"
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00c4 }
            com.huawei.android.pushagent.utils.a.e.b(r10, r9)     // Catch:{ all -> 0x00c4 }
            com.huawei.android.pushagent.PushException r9 = new com.huawei.android.pushagent.PushException     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = "delete tags failed"
            r9.<init>((java.lang.String) r10)     // Catch:{ all -> 0x00c4 }
            throw r9     // Catch:{ all -> 0x00c4 }
        L_0x00b3:
            monitor-exit(r0)
            return
        L_0x00b5:
            java.lang.String r9 = "PushLogAC2815"
            java.lang.String r10 = "token is null, should register a token first"
            com.huawei.android.pushagent.utils.a.e.c(r9, r10)     // Catch:{ all -> 0x00c4 }
            com.huawei.android.pushagent.PushException r9 = new com.huawei.android.pushagent.PushException     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = "set tags push token invalid"
            r9.<init>((java.lang.String) r10)     // Catch:{ all -> 0x00c4 }
            throw r9     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.PushManager.deleteTags(android.content.Context, java.util.List):void");
    }

    public static final void deregisterToken(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            e.a("PushLogAC2815", "token is null, can not deregister token");
            return;
        }
        if (TextUtils.isEmpty(a.r(context))) {
            if (a.o(context)) {
                e.a("PushLogAC2815", "votedPackage is null, deregister token from frameworkPush");
            } else {
                e.a("PushLogAC2815", "votedPackage is null and not exist frameworkPush, can not deregister token");
                return;
            }
        }
        String a2 = f.a(context, str);
        Intent intent = new Intent("com.huawei.android.push.intent.DEREGISTER");
        intent.putExtra("pkg_name", context.getPackageName());
        intent.putExtra("device_token", a2);
        intent.putExtra("isTokenEncrypt", true);
        PushServiceTools.broadcastOrStartSelfService(context, intent);
    }

    public static final void enableReceiveNormalMsg(Context context, boolean z) {
        if (context == null) {
            e.a("PushLogAC2815", "context is null");
        } else {
            new h(context, "push_switch").a("normal_msg_enable", !z);
        }
    }

    public static final void enableReceiveNotifyMsg(Context context, boolean z) {
        if (context == null) {
            e.a("PushLogAC2815", "context is null");
        } else {
            new h(context, "push_switch").a("notify_msg_enable", !z);
        }
    }

    public static synchronized Map getTags(Context context) throws PushException {
        Map b2;
        synchronized (PushManager.class) {
            try {
                b2 = new h(context, "tags_info").b();
            } catch (Exception e2) {
                e.b("PushLogAC2815", e2.toString());
                throw new PushException("get tags failed");
            }
        }
        return b2;
    }

    public static void requestPushState(Context context) {
        PushReceiver.getPushState(context);
    }

    public static void requestToken(Context context) {
        PushReceiver.getToken(context);
    }

    public static synchronized void setTags(Context context, Map map) throws PushException {
        synchronized (PushManager.class) {
            if (map != null) {
                String a2 = com.huawei.android.pushagent.utils.a.f.a(context, "push_client_self_info", "token_info");
                if (!TextUtils.isEmpty(a2)) {
                    Map a3 = a(context, map);
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry entry : a3.entrySet()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("tagKey", (String) entry.getKey());
                            jSONObject.put("tagValue", (String) entry.getValue());
                            jSONObject.put("opType", 1);
                            if (jSONObject.length() > 0) {
                                jSONArray.put(jSONObject);
                            }
                        }
                        if (jSONArray.length() > 0) {
                            e.a("PushLogAC2815", "begin to setTags: " + jSONArray.toString());
                            c.a(context, a2, jSONArray.toString(), 0, 2);
                            return;
                        }
                        e.b("PushLogAC2815", "no tag need to upload");
                    } catch (Exception e2) {
                        e.b("PushLogAC2815", e2.toString());
                        throw new PushException("set tags failed");
                    }
                } else {
                    e.c("PushLogAC2815", "token is null, should register a token first");
                    throw new PushException("set tags push token invalid");
                }
            }
        }
    }
}
