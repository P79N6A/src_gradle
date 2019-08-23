package com.umeng.message.tag;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.UTrack;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.common.d;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.util.HttpRequest;
import com.umeng.message.util.e;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class TagManager {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f81354a = "com.umeng.message.tag.TagManager";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static TagManager f81355d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static ITagManager f81356f;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f81357e;

    public interface TCallBack {
        void onMessage(boolean z, ITagManager.Result result);
    }

    public interface TagListCallBack {
        void onMessage(boolean z, List<String> list);
    }

    public interface WeightedTagListCallBack {
        void onMessage(boolean z, Hashtable<String, Integer> hashtable);
    }

    /* access modifiers changed from: private */
    public boolean e() {
        boolean z;
        if (MessageSharedPrefs.getInstance(this.f81357e).getTagSendPolicy() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            UMLog.mutlInfo(f81354a, 2, "Tag API被服务器禁止");
        }
        return z;
    }

    /* access modifiers changed from: private */
    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", UTrack.getInstance(this.f81357e).getHeader());
        jSONObject.put("utdid", UmengMessageDeviceConfig.getUtdid(this.f81357e));
        jSONObject.put("device_token", MessageSharedPrefs.getInstance(this.f81357e).getDeviceToken());
        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public boolean d() {
        if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(this.f81357e))) {
            UMLog.mutlInfo(f81354a, 0, "UTDID为空");
            return false;
        } else if (!TextUtils.isEmpty(MessageSharedPrefs.getInstance(this.f81357e).getDeviceToken())) {
            return true;
        } else {
            UMLog.mutlInfo(f81354a, 0, "Device token为空");
            return false;
        }
    }

    /* access modifiers changed from: private */
    public ITagManager.Result f() {
        ITagManager.Result result = new ITagManager.Result(new JSONObject(), false);
        result.remain = MessageSharedPrefs.getInstance(this.f81357e).getTagRemain();
        result.status = "ok";
        result.jsonString = "status:" + result.status + ", remain:" + result.remain + ",description:" + result.status;
        return result;
    }

    private TagManager(Context context) {
        this.f81357e = context.getApplicationContext();
    }

    public void getTags(final TagListCallBack tagListCallBack) {
        d.a(new Runnable() {
            public void run() {
                String a2 = TagManager.this.a(MessageSharedPrefs.getInstance(TagManager.this.f81357e).get_getTagsInterval(), false);
                List list = null;
                if (!TextUtils.isEmpty(a2)) {
                    try {
                        throw new Exception(a2);
                    } catch (Exception e2) {
                        String a3 = TagManager.f81354a;
                        UMLog.mutlInfo(a3, 0, "exception:" + e2.getMessage());
                        tagListCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.e()) {
                    try {
                        throw new Exception("Tag API被服务器禁止.");
                    } catch (Exception e3) {
                        String a4 = TagManager.f81354a;
                        UMLog.mutlInfo(a4, 0, "exception:" + e3.getMessage());
                        tagListCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.d()) {
                    try {
                        List tags = TagManager.f81356f.getTags(TagManager.this.c());
                        try {
                            tagListCallBack.onMessage(true, tags);
                        } catch (Exception e4) {
                            e = e4;
                            list = tags;
                            String a5 = TagManager.f81354a;
                            UMLog.mutlInfo(a5, 0, "exception:" + e.getMessage());
                            tagListCallBack.onMessage(false, list);
                        }
                    } catch (Exception e5) {
                        e = e5;
                        String a52 = TagManager.f81354a;
                        UMLog.mutlInfo(a52, 0, "exception:" + e.getMessage());
                        tagListCallBack.onMessage(false, list);
                    }
                } else {
                    try {
                        throw new Exception("缺少utdid或device token");
                    } catch (Exception e6) {
                        String a6 = TagManager.f81354a;
                        UMLog.mutlInfo(a6, 0, "exception:" + e6.getMessage());
                        tagListCallBack.onMessage(false, null);
                    }
                }
            }
        });
    }

    public void getWeightedTags(final WeightedTagListCallBack weightedTagListCallBack) {
        d.a(new Runnable() {
            public void run() {
                Hashtable hashtable = new Hashtable();
                if (!TagManager.this.d()) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "缺少utdid或device token");
                    weightedTagListCallBack.onMessage(false, hashtable);
                    return;
                }
                String a2 = TagManager.this.a(MessageSharedPrefs.getInstance(TagManager.this.f81357e).getListWeightedTagsInterval(), true);
                if (!TextUtils.isEmpty(a2)) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, a2);
                    weightedTagListCallBack.onMessage(false, hashtable);
                    return;
                }
                try {
                    Hashtable weightedTags = TagManager.f81356f.getWeightedTags(TagManager.this.c());
                    try {
                        weightedTagListCallBack.onMessage(true, weightedTags);
                    } catch (Exception unused) {
                        hashtable = weightedTags;
                        UMLog.mutlInfo(TagManager.f81354a, 0, "获取加权标签列表异常");
                        weightedTagListCallBack.onMessage(false, hashtable);
                    }
                } catch (Exception unused2) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "获取加权标签列表异常");
                    weightedTagListCallBack.onMessage(false, hashtable);
                }
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(4:5|6|7|8)|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.umeng.message.tag.TagManager getInstance(android.content.Context r6) {
        /*
            java.lang.Class<com.umeng.message.tag.TagManager> r0 = com.umeng.message.tag.TagManager.class
            monitor-enter(r0)
            com.umeng.message.tag.TagManager r1 = f81355d     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0030
            com.umeng.message.tag.TagManager r1 = new com.umeng.message.tag.TagManager     // Catch:{ all -> 0x0034 }
            android.content.Context r2 = r6.getApplicationContext()     // Catch:{ all -> 0x0034 }
            r1.<init>(r2)     // Catch:{ all -> 0x0034 }
            f81355d = r1     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "com.umeng.message.common.impl.json.JTagManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0030 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0030 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0030 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch:{ Exception -> 0x0030 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0030 }
            r2[r5] = r6     // Catch:{ Exception -> 0x0030 }
            java.lang.Object r6 = r1.newInstance(r2)     // Catch:{ Exception -> 0x0030 }
            com.umeng.message.common.inter.ITagManager r6 = (com.umeng.message.common.inter.ITagManager) r6     // Catch:{ Exception -> 0x0030 }
            f81356f = r6     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            com.umeng.message.tag.TagManager r6 = f81355d     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)
            return r6
        L_0x0034:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.tag.TagManager.getInstance(android.content.Context):com.umeng.message.tag.TagManager");
    }

    private void a(final TCallBack tCallBack) {
        d.a(new Runnable() {
            public void run() {
                ITagManager.Result result;
                if (TagManager.this.e()) {
                    try {
                        throw new Exception("Tag API被服务器禁止");
                    } catch (Exception unused) {
                        tCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.d()) {
                    try {
                        result = TagManager.f81356f.reset(TagManager.this.c());
                        try {
                            tCallBack.onMessage(true, result);
                        } catch (Exception unused2) {
                            tCallBack.onMessage(false, result);
                        }
                    } catch (Exception unused3) {
                        result = null;
                        tCallBack.onMessage(false, result);
                    }
                } else {
                    try {
                        throw new Exception("缺少utdid或device token");
                    } catch (Exception unused4) {
                        tCallBack.onMessage(false, null);
                    }
                }
            }
        });
    }

    public void addTags(final TCallBack tCallBack, final String... strArr) {
        d.a(new Runnable() {
            public void run() {
                ITagManager.Result result = new ITagManager.Result();
                if (strArr == null || strArr.length == 0) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "No tags");
                    result.setErrors("No tags");
                    tCallBack.onMessage(false, result);
                } else if (!TagManager.this.d()) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "No utdid or device_token");
                    result.setErrors("No utdid or device_token");
                    tCallBack.onMessage(false, result);
                } else if (TagManager.this.e()) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "Tag API is disabled by the server");
                    result.setErrors("Tag API is disabled by the server");
                    tCallBack.onMessage(false, result);
                } else {
                    String a2 = TagManager.this.a(MessageSharedPrefs.getInstance(TagManager.this.f81357e).get_addTagsInterval(), strArr);
                    if (!TextUtils.isEmpty(a2)) {
                        UMLog.mutlInfo(TagManager.f81354a, 0, a2);
                        result.setErrors(a2);
                        tCallBack.onMessage(false, result);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (strArr.length > 0) {
                        for (String str : strArr) {
                            if (!MessageSharedPrefs.getInstance(TagManager.this.f81357e).isTagSet(str) && !arrayList.contains(str)) {
                                byte[] bArr = null;
                                try {
                                    bArr = str.getBytes("UTF-8");
                                } catch (UnsupportedEncodingException unused) {
                                }
                                if (bArr.length <= 128 && bArr.length >= 0) {
                                    arrayList.add(str);
                                }
                            }
                        }
                    }
                    if (arrayList.size() == 0) {
                        tCallBack.onMessage(true, TagManager.this.f());
                        return;
                    }
                    try {
                        JSONObject e2 = TagManager.this.c();
                        e2.put("tags", e.a((List<String>) arrayList));
                        tCallBack.onMessage(true, TagManager.f81356f.addTags(e2, strArr));
                    } catch (Exception unused2) {
                        UMLog.mutlInfo(TagManager.f81354a, 0, "添加tag异常");
                    }
                }
            }
        });
    }

    public void addWeightedTags(final TCallBack tCallBack, final Hashtable<String, Integer> hashtable) {
        d.a(new Runnable() {
            public void run() {
                ITagManager.Result result = new ITagManager.Result();
                if (!TagManager.this.d()) {
                    result.setErrors("No utdid or device token");
                    UMLog.mutlInfo(TagManager.f81354a, 0, "No utdid or device token");
                    tCallBack.onMessage(false, result);
                } else if (hashtable == null || hashtable.size() == 0) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "No weighted tags");
                    result.setErrors("No weighted tags");
                    tCallBack.onMessage(false, result);
                } else if (hashtable.size() > 64) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "The maximum number of adding weighted tags per request is 64");
                    result.setErrors("The maximum number of adding weighted tags per request is 64");
                    tCallBack.onMessage(false, result);
                } else {
                    String a2 = TagManager.this.a(MessageSharedPrefs.getInstance(TagManager.this.f81357e).getAddWeightedTagsInterval(), hashtable);
                    if (!TextUtils.isEmpty(a2)) {
                        UMLog.mutlInfo(TagManager.f81354a, 0, a2);
                        result.setErrors(a2);
                        tCallBack.onMessage(false, result);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (String str : hashtable.keySet()) {
                            jSONObject.put(str, ((Integer) hashtable.get(str)).intValue());
                        }
                        JSONObject e2 = TagManager.this.c();
                        e2.put("tags", jSONObject);
                        tCallBack.onMessage(true, TagManager.f81356f.addWeightedTags(e2, hashtable));
                    } catch (Exception unused) {
                        UMLog.mutlInfo(TagManager.f81354a, 0, "添加加权标签异常");
                    }
                }
            }
        });
    }

    public void deleteTags(final TCallBack tCallBack, final String... strArr) {
        d.a(new Runnable() {
            public void run() {
                String a2 = TagManager.this.a(MessageSharedPrefs.getInstance(TagManager.this.f81357e).get_deleteTagsInterval(), strArr);
                ITagManager.Result result = null;
                if (!TextUtils.isEmpty(a2)) {
                    try {
                        throw new Exception(a2);
                    } catch (Exception e2) {
                        String a3 = TagManager.f81354a;
                        UMLog.mutlInfo(a3, 0, "exception:" + e2.getMessage());
                        tCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.e()) {
                    try {
                        throw new Exception("Tag API is disabled by the server.");
                    } catch (Exception e3) {
                        String a4 = TagManager.f81354a;
                        UMLog.mutlInfo(a4, 0, "exception:" + e3.getMessage());
                        tCallBack.onMessage(false, null);
                    }
                } else if (!TagManager.this.d()) {
                    try {
                        throw new Exception("No utdid or device_token");
                    } catch (Exception e4) {
                        String a5 = TagManager.f81354a;
                        UMLog.mutlInfo(a5, 0, "exception:" + e4.getMessage());
                        tCallBack.onMessage(false, null);
                    }
                } else if (strArr == null || strArr.length == 0) {
                    try {
                        throw new Exception("No tags");
                    } catch (Exception e5) {
                        String a6 = TagManager.f81354a;
                        UMLog.mutlInfo(a6, 0, "exception:" + e5.getMessage());
                        tCallBack.onMessage(false, null);
                    }
                } else {
                    try {
                        JSONObject e6 = TagManager.this.c();
                        e6.put("tags", e.a(strArr));
                        ITagManager.Result deleteTags = TagManager.f81356f.deleteTags(e6, strArr);
                        try {
                            tCallBack.onMessage(true, deleteTags);
                        } catch (Exception e7) {
                            e = e7;
                            result = deleteTags;
                            String a7 = TagManager.f81354a;
                            UMLog.mutlInfo(a7, 0, "exception:" + e.getMessage());
                            tCallBack.onMessage(false, result);
                        }
                    } catch (Exception e8) {
                        e = e8;
                        String a72 = TagManager.f81354a;
                        UMLog.mutlInfo(a72, 0, "exception:" + e.getMessage());
                        tCallBack.onMessage(false, result);
                    }
                }
            }
        });
    }

    public void deleteWeightedTags(final TCallBack tCallBack, final String... strArr) {
        d.a(new Runnable() {
            public void run() {
                ITagManager.Result result = new ITagManager.Result();
                if (!TagManager.this.d()) {
                    result.setErrors("缺少utdid或device token");
                    UMLog.mutlInfo(TagManager.f81354a, 0, "缺少utdid或device token");
                    tCallBack.onMessage(false, result);
                } else if (strArr == null || strArr.length == 0) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "没有加权标签");
                    result.setErrors("没有加权标签");
                    tCallBack.onMessage(false, result);
                } else if (strArr.length > 64) {
                    UMLog.mutlInfo(TagManager.f81354a, 0, "每次请求最多删除64个加权标签");
                    result.setErrors("每次请求最多删除64个加权标签");
                    tCallBack.onMessage(false, result);
                } else {
                    String b2 = TagManager.this.b(MessageSharedPrefs.getInstance(TagManager.this.f81357e).getDeleteWeightedTagsInterval(), strArr);
                    if (!TextUtils.isEmpty(b2)) {
                        UMLog.mutlInfo(TagManager.f81354a, 0, b2);
                        result.setErrors(b2);
                        tCallBack.onMessage(false, result);
                        return;
                    }
                    try {
                        JSONObject e2 = TagManager.this.c();
                        e2.put("tags", e.a(strArr));
                        tCallBack.onMessage(true, TagManager.f81356f.deleteWeightedTags(e2, strArr));
                    } catch (Exception unused) {
                        UMLog.mutlInfo(TagManager.f81354a, 0, "删除加权标签异常");
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public String a(String str, boolean z) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        try {
            ITagManager.Result result = new ITagManager.Result(new JSONObject(str), z);
            long currentTimeMillis = System.currentTimeMillis();
            if (result.interval != 0) {
                if ((currentTimeMillis - result.last_requestTime) / 1000 <= result.interval) {
                    str2 = "interval限制";
                }
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    /* access modifiers changed from: private */
    public String a(String str, Hashtable<String, Integer> hashtable) {
        for (String next : hashtable.keySet()) {
            try {
                byte[] bytes = next.getBytes("UTF-8");
                if (bytes.length > 128 && bytes.length <= 0) {
                    return "部分Tags长度不在限制0到128个字符之间";
                }
                if (hashtable.get(next).intValue() >= -10) {
                    if (hashtable.get(next).intValue() > 10) {
                    }
                }
                return "部分Tags权值不在-10到10之间";
            } catch (UnsupportedEncodingException unused) {
                UMLog.mutlInfo(f81354a, 0, "UnsupportedEncodingException");
                return "部分Tags长度不在限制0到128个字符之间";
            }
        }
        String str2 = null;
        if (str == null) {
            return null;
        }
        try {
            ITagManager.Result result = new ITagManager.Result(new JSONObject(str), true);
            long currentTimeMillis = System.currentTimeMillis();
            if (result.interval != 0) {
                if ((currentTimeMillis - result.last_requestTime) / 1000 <= result.interval) {
                    str2 = "interval限制";
                }
            }
        } catch (JSONException unused2) {
        }
        return str2;
    }

    /* access modifiers changed from: private */
    public String b(String str, String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            try {
                byte[] bytes = str2.getBytes("UTF-8");
                if (bytes.length > 128 || bytes.length < 0) {
                    return "部分Tags长度不在限制0到128个字符之间";
                }
                arrayList.add(str2);
                i++;
            } catch (UnsupportedEncodingException unused) {
                UMLog.mutlInfo(f81354a, 0, "UnsupportedEncodingException");
                return "部分Tags长度不在限制0到128个字符之间";
            }
        }
        String str3 = null;
        if (str == null) {
            return null;
        }
        try {
            ITagManager.Result result = new ITagManager.Result(new JSONObject(str), true);
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() > 0 && result.interval != 0) {
                if ((currentTimeMillis - result.last_requestTime) / 1000 <= result.interval) {
                    str3 = "interval限制";
                }
            }
        } catch (JSONException unused2) {
        }
        return str3;
    }

    /* access modifiers changed from: private */
    public String a(String str, String... strArr) {
        String str2;
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        String str3 = null;
        if (strArr != null && strArr.length > 0) {
            for (String str4 : strArr) {
                if (!MessageSharedPrefs.getInstance(this.f81357e).isTagSet(str4) && !arrayList.contains(str4)) {
                    try {
                        bArr = str4.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                        bArr = null;
                    }
                    if (bArr.length > 128 || bArr.length < 0) {
                        return "部分Tags长度不在限制0到128个字符之间";
                    }
                    arrayList.add(str4);
                }
            }
        }
        if (str == null) {
            return null;
        }
        try {
            ITagManager.Result result = new ITagManager.Result(new JSONObject(str), false);
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() > 0) {
                if (result.remain < 0 || arrayList.size() > result.remain) {
                    str2 = "Tags数量不能超过1024";
                } else if (result.interval != 0) {
                    if ((currentTimeMillis - result.last_requestTime) / 1000 <= result.interval) {
                        str2 = "interval限制";
                    }
                }
                str3 = str2;
            }
        } catch (Exception unused2) {
        }
        return str3;
    }

    private static JSONObject a(JSONObject jSONObject, String str) throws JSONException {
        String body = HttpRequest.post((CharSequence) str).acceptJson().contentType("application/json").send((CharSequence) jSONObject.toString()).body("UTF-8");
        String str2 = f81354a;
        UMLog.mutlInfo(str2, 2, "postJson() url=" + str + "\n request = " + jSONObject + "\n response = " + body);
        return new JSONObject(body);
    }

    private void a(final TCallBack tCallBack, final String... strArr) {
        d.a(new Runnable() {
            public void run() {
                ITagManager.Result result;
                if (TagManager.this.e()) {
                    try {
                        throw new Exception("Tag API is disabled by the server.");
                    } catch (Exception unused) {
                        tCallBack.onMessage(false, null);
                    }
                } else if (!TagManager.this.d()) {
                    try {
                        throw new Exception("No utdid or device_token");
                    } catch (Exception unused2) {
                        tCallBack.onMessage(false, null);
                    }
                } else if (strArr == null || strArr.length == 0) {
                    try {
                        throw new Exception("No tags");
                    } catch (Exception unused3) {
                        tCallBack.onMessage(false, null);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (String add : strArr) {
                        arrayList.add(add);
                    }
                    if (arrayList.size() == 0) {
                        tCallBack.onMessage(true, TagManager.this.f());
                        return;
                    }
                    try {
                        JSONObject e2 = TagManager.this.c();
                        e2.put("tags", e.a((List<String>) arrayList));
                        result = TagManager.f81356f.update(e2, strArr);
                        try {
                            tCallBack.onMessage(true, result);
                        } catch (Exception unused4) {
                            tCallBack.onMessage(true, result);
                        }
                    } catch (Exception unused5) {
                        result = null;
                        tCallBack.onMessage(true, result);
                    }
                }
            }
        });
    }
}
