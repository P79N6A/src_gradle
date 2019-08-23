package com.ss.android.common.util;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public class EventsSender implements WeakHandler.IHandler, Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static NotificationManager mNotifyMgr;
    private static int notifyId;
    private static EventsSender sEventsSender;
    private Handler handler = new WeakHandler(Looper.getMainLooper(), this);
    private String mAppId = "";
    private final List<String> mEventBlackList = new ArrayList();
    private BlockingQueue<JSONObject> mEventQueue = new LinkedBlockingQueue();
    private String mHost;
    private boolean mIsFilterDemand = true;
    private boolean mSenderEnable;
    private ThreadPlus mThreadPlus;
    private boolean mVerifySendEnable = false;
    private String mVerifyUrl;
    private Queue<String> msgQueue = new LinkedList();
    long nextTime;
    private Context sApplicationContext;
    private String sDemandId;
    private String sDemandName;
    private List<String> sDemandV1Events;
    private List<String> sDemandV3Events;
    private String sUserName;
    private Toast toast;

    private boolean isVerifySendEnable() {
        return this.mVerifySendEnable;
    }

    public boolean isSenderEnable() {
        return this.mSenderEnable;
    }

    private EventsSender() {
    }

    public static EventsSender inst() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15922, new Class[0], EventsSender.class)) {
            return (EventsSender) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15922, new Class[0], EventsSender.class);
        }
        if (sEventsSender == null) {
            synchronized (EventsSender.class) {
                if (sEventsSender == null) {
                    sEventsSender = new EventsSender();
                }
            }
        }
        return sEventsSender;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|(1:12)(1:11)|13|(1:18)(1:17)|(3:21|(1:46)(10:(1:24)|25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36)|(3:38|39|48)(1:47))|43)(1:44)|5|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023 A[LOOP:0: B:4:0x0023->B:43:0x0023, LOOP_START, SYNTHETIC, Splitter:B:4:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 15932(0x3e3c, float:2.2325E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 15932(0x3e3c, float:2.2325E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            boolean r1 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x00d5 }
            if (r1 != 0) goto L_0x00d4
            boolean r1 = r9.mSenderEnable     // Catch:{ Exception -> 0x00d5 }
            r2 = 1
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = r9.mHost     // Catch:{ Exception -> 0x00d5 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00d5 }
            if (r1 != 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            boolean r3 = r9.mVerifySendEnable     // Catch:{ Exception -> 0x00d5 }
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r9.mVerifyUrl     // Catch:{ Exception -> 0x00d5 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00d5 }
            if (r3 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r1 != 0) goto L_0x004b
            if (r2 == 0) goto L_0x00d4
        L_0x004b:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r3 = r9.mEventQueue     // Catch:{ Exception -> 0x00d5 }
            java.lang.Object r3 = r3.take()     // Catch:{ Exception -> 0x00d5 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ Exception -> 0x00d5 }
            if (r3 == 0) goto L_0x0023
            if (r2 == 0) goto L_0x005a
            r9.verify(r3)     // Catch:{ Exception -> 0x00d5 }
        L_0x005a:
            java.lang.String r2 = "__demandName__"
            boolean r2 = r3.has(r2)     // Catch:{ Exception -> 0x00d5 }
            if (r2 == 0) goto L_0x0067
            java.lang.String r2 = "__demandName__"
            r3.remove(r2)     // Catch:{ Exception -> 0x00d5 }
        L_0x0067:
            java.lang.String r2 = "__demandSendTime__"
            boolean r2 = r3.has(r2)     // Catch:{ Exception -> 0x00d5 }
            if (r2 == 0) goto L_0x0074
            java.lang.String r2 = "__demandSendTime__"
            r3.remove(r2)     // Catch:{ Exception -> 0x00d5 }
        L_0x0074:
            java.lang.String r2 = "__demandTestUserName__"
            boolean r2 = r3.has(r2)     // Catch:{ Exception -> 0x00d5 }
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = "__demandTestUserName__"
            r3.remove(r2)     // Catch:{ Exception -> 0x00d5 }
        L_0x0081:
            java.lang.String r2 = "__demandNotThisDemand__"
            boolean r2 = r3.has(r2)     // Catch:{ Exception -> 0x00d5 }
            if (r2 == 0) goto L_0x008e
            java.lang.String r2 = "__demandNotThisDemand__"
            r3.remove(r2)     // Catch:{ Exception -> 0x00d5 }
        L_0x008e:
            if (r1 == 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = "http://"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = r9.mHost     // Catch:{ Exception -> 0x0023 }
            r1.append(r2)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0023 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0023 }
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = "parameter"
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0023 }
            r1.appendQueryParameter(r2, r3)     // Catch:{ Exception -> 0x0023 }
            com.bytedance.common.utility.NetworkClient r2 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Exception -> 0x0023 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0023 }
            java.lang.String r1 = r2.get(r1)     // Catch:{ Exception -> 0x0023 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0023 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r1 = "success"
            java.lang.String r3 = "data"
            java.lang.Object r2 = r2.opt(r3)     // Catch:{ Exception -> 0x0023 }
            r1.equals(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0023
        L_0x00d4:
            return
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.EventsSender.run():void");
    }

    private void setVerifySendEnable(boolean z) {
        this.mVerifySendEnable = z;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setVerifyUrl(String str) {
        this.mVerifyUrl = str;
    }

    public void interceptEvent(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 15943, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 15943, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mEventBlackList.add(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[Catch:{ Exception -> 0x0074 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void putEvent(org.json.JSONObject r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 15923(0x3e33, float:2.2313E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 15923(0x3e33, float:2.2313E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            if (r10 == 0) goto L_0x007a
            boolean r0 = r9.mSenderEnable
            if (r0 != 0) goto L_0x003b
            boolean r0 = r9.mVerifySendEnable
            if (r0 != 0) goto L_0x003b
            goto L_0x007a
        L_0x003b:
            boolean r0 = r9.mVerifySendEnable
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r9.mVerifyUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "__demandId__"
            java.lang.String r0 = r10.optString(r0)     // Catch:{ Exception -> 0x0074 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0074 }
            if (r0 == 0) goto L_0x006b
            boolean r0 = r9.mIsFilterDemand     // Catch:{ Exception -> 0x0074 }
            if (r0 != 0) goto L_0x0058
            goto L_0x006b
        L_0x0058:
            java.lang.String r0 = "category"
            java.lang.String r0 = r10.optString(r0)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "event_v3"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0074 }
            if (r0 != 0) goto L_0x006f
            boolean r8 = r9.recheckEventAndFillDemandIdAndNameForV1Event(r10)     // Catch:{ Exception -> 0x0074 }
            goto L_0x006f
        L_0x006b:
            boolean r8 = r9.recheckEventAndFillDemandIdAndNameForV3Event(r10)     // Catch:{ Exception -> 0x0074 }
        L_0x006f:
            if (r8 != 0) goto L_0x0074
            r9.recheckEventAndFillDemandIdAndNameForOtherDemand(r10)     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r0 = r9.mEventQueue
            r0.add(r10)
            return
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.EventsSender.putEvent(org.json.JSONObject):void");
    }

    public String recheckDemandIdAndGetDemandName(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15940, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15940, new Class[]{String.class}, String.class);
        } else if (this.sDemandId == null || !this.sDemandId.equals(str)) {
            return null;
        } else {
            return this.sDemandName;
        }
    }

    public void setApplicationContext(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 15933, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 15933, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            this.sApplicationContext = context.getApplicationContext();
            mNotifyMgr = (NotificationManager) this.sApplicationContext.getSystemService("notification");
        }
    }

    public synchronized void setSenderEnable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15924, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 15924, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mSenderEnable != z) {
            this.mSenderEnable = z;
            if (!this.mSenderEnable || sEventsSender == null) {
                this.mThreadPlus = null;
                return;
            }
            this.mThreadPlus = new ThreadPlus(sEventsSender, "EventSender", true);
            this.mThreadPlus.start();
        }
    }

    public void setVerifyEnable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15936, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 15936, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.handler.removeMessages(1);
        this.handler.removeMessages(2);
        this.msgQueue.clear();
        if (isSenderEnable()) {
            setVerifySendEnable(z);
        } else if (z) {
            setSenderEnable(true);
            setVerifySendEnable(true);
        } else {
            setVerifySendEnable(false);
        }
    }

    public void toast(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 15935, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 15935, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.obj = str2;
        this.handler.sendMessage(obtain);
    }

    public boolean recheckEventAndFillDemandIdAndNameForOtherDemand(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15941, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15941, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject == null || TextUtils.isEmpty(this.sUserName) || TextUtils.isEmpty(this.sDemandId) || TextUtils.isEmpty(this.sDemandName)) {
            return false;
        } else {
            try {
                if (TextUtils.isEmpty(jSONObject.optString("tag"))) {
                    return false;
                }
                String str = this.sDemandId;
                String str2 = this.sDemandName;
                jSONObject.put("__demandId__", str);
                jSONObject.put("__demandName__", str2);
                jSONObject.put("__demandSendTime__", System.currentTimeMillis());
                jSONObject.put("__demandNotThisDemand__", false);
                jSONObject.put("__demandTestUserName__", this.sUserName);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public boolean recheckEventAndFillDemandIdAndNameForV1Event(JSONObject jSONObject) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15942, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15942, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject == null || TextUtils.isEmpty(this.sDemandId) || TextUtils.isEmpty(this.sDemandName) || TextUtils.isEmpty(this.sUserName) || this.sDemandV1Events == null || this.sDemandV1Events.isEmpty()) {
            return false;
        } else {
            try {
                String optString = jSONObject.optString("tag");
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                List<String> list = this.sDemandV1Events;
                if (list != null) {
                    Iterator<String> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (optString.equals(it2.next())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    String str = this.sDemandId;
                    String str2 = this.sDemandName;
                    jSONObject.put("__demandId__", str);
                    jSONObject.put("__demandName__", str2);
                    jSONObject.put("__demandSendTime__", System.currentTimeMillis());
                    jSONObject.put("__demandTestUserName__", this.sUserName);
                    return true;
                }
                return false;
            } catch (Exception unused) {
            }
        }
    }

    public boolean recheckEventAndFillDemandIdAndNameForV3Event(JSONObject jSONObject) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15939, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15939, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject == null || TextUtils.isEmpty(this.sDemandId) || TextUtils.isEmpty(this.sDemandName) || TextUtils.isEmpty(this.sUserName) || this.sDemandV3Events == null || this.sDemandV3Events.isEmpty()) {
            return false;
        } else {
            try {
                String optString = jSONObject.optString("tag");
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                if (!this.sDemandId.equals(jSONObject.optString("__demandId__")) && this.mIsFilterDemand) {
                    return false;
                }
                List<String> list = this.sDemandV3Events;
                if (list != null) {
                    Iterator<String> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (optString.equals(it2.next())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    String str = this.sDemandId;
                    String str2 = this.sDemandName;
                    jSONObject.put("__demandId__", str);
                    jSONObject.put("__demandName__", str2);
                    jSONObject.put("__demandSendTime__", System.currentTimeMillis());
                    jSONObject.put("__demandTestUserName__", this.sUserName);
                    return true;
                }
                return false;
            } catch (Exception unused) {
            }
        }
    }

    private void verify(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15931, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15931, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            String str = null;
            if (jSONObject2.has("tag")) {
                str = jSONObject2.optString("tag");
                jSONObject2.put("event", str);
                jSONObject2.remove("tag");
            }
            String optString = jSONObject2.optString("__demandId__");
            String optString2 = jSONObject2.optString("__demandName__");
            if (optString2 != null) {
                jSONObject2.remove("__demandName__");
            }
            long optLong = jSONObject2.optLong("__demandSendTime__");
            if (jSONObject2.has("__demandSendTime__")) {
                jSONObject2.remove("__demandSendTime__");
            }
            boolean optBoolean = jSONObject2.optBoolean("__demandNotThisDemand__", true);
            if (jSONObject2.has("__demandNotThisDemand__")) {
                jSONObject2.remove("__demandNotThisDemand__");
            }
            String optString3 = jSONObject2.optString("__demandTestUserName__");
            if (jSONObject2.has("__demandTestUserName__")) {
                jSONObject2.remove("__demandTestUserName__");
            }
            if (!this.mEventBlackList.contains(str) && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                Uri.Builder buildUpon = Uri.parse(this.mVerifyUrl).buildUpon();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair("parameter", jSONObject2.toString()));
                arrayList.add(new Pair("demandID", optString));
                arrayList.add(new Pair("demandName", optString2));
                arrayList.add(new Pair("userName", optString3));
                arrayList.add(new Pair("clientSendTime", optLong));
                if (!TextUtils.isEmpty(this.mAppId)) {
                    arrayList.add(new Pair("appID", this.mAppId));
                }
                if ("event_v3".equals(jSONObject2.optString("category"))) {
                    executeVerify(str, buildUpon.toString(), arrayList, true, optBoolean);
                    return;
                }
                executeVerify(str, buildUpon.toString(), arrayList, false, optBoolean);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v2, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 15934(0x3e3e, float:2.2328E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 15934(0x3e3e, float:2.2328E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            int r0 = r8.what
            r1 = 2
            if (r0 == r9) goto L_0x005f
            int r0 = r8.what
            if (r0 != r1) goto L_0x0040
            goto L_0x005f
        L_0x0040:
            int r0 = r8.what
            r1 = 3
            if (r0 != r1) goto L_0x01a7
            java.lang.Object r0 = r8.obj
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r0 = r8.obj
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r0 = r8.obj
            java.lang.String r0 = (java.lang.String) r0
            java.util.Queue<java.lang.String> r1 = r7.msgQueue
            r1.offer(r0)
            android.os.Handler r0 = r7.handler
            r0.sendEmptyMessage(r9)
            goto L_0x01a7
        L_0x005f:
            android.os.Handler r0 = r7.handler
            r0.removeMessages(r9)
            android.content.Context r0 = r7.sApplicationContext
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r7.mVerifySendEnable
            if (r0 == 0) goto L_0x01a7
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r7.nextTime
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01a7
            java.util.Queue<java.lang.String> r0 = r7.msgQueue
            java.lang.Object r0 = r0.poll()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x01a6
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a3 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = "toast"
            java.lang.String r0 = r3.optString(r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r4 = "raw"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r5 = "event"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Exception -> 0x009f }
            java.lang.String r2 = "v3"
            boolean r2 = r3.optBoolean(r2, r9)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a7
        L_0x009f:
            r5 = r2
            goto L_0x00a6
        L_0x00a1:
            r4 = r2
            goto L_0x00a5
        L_0x00a3:
            r0 = r2
            r4 = r0
        L_0x00a5:
            r5 = r4
        L_0x00a6:
            r2 = 1
        L_0x00a7:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x00b5
            android.content.Context r3 = r7.sApplicationContext
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r10)
            r7.toast = r3
        L_0x00b5:
            android.app.NotificationManager r3 = mNotifyMgr
            if (r3 == 0) goto L_0x0155
            if (r4 == 0) goto L_0x0155
            if (r0 == 0) goto L_0x0155
            int r3 = notifyId
            int r3 = r3 + r9
            int r3 = r3 % 512
            notifyId = r3
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r6 = "ttmain_applog_verify_result_action"
            r3.setAction(r6)
            java.lang.String r6 = "android.intent.category.DEFAULT"
            r3.addCategory(r6)
            java.lang.String r6 = "json"
            java.lang.String r4 = r4.toString()
            r3.putExtra(r6, r4)
            java.lang.String r4 = "toast"
            r3.putExtra(r4, r0)
            java.lang.String r4 = "v3"
            r3.putExtra(r4, r2)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "event: "
            r4.<init>(r6)
            if (r5 != 0) goto L_0x00f6
            java.lang.String r5 = ""
        L_0x00f6:
            r4.append(r5)
            if (r2 == 0) goto L_0x00fe
            java.lang.String r2 = ""
            goto L_0x0100
        L_0x00fe:
            java.lang.String r2 = "(1.0 埋点)"
        L_0x0100:
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 16
            if (r4 < r5) goto L_0x0155
            android.content.Context r4 = r7.sApplicationContext
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.ComponentName r4 = r3.resolveActivity(r4)
            if (r4 == 0) goto L_0x0155
            android.content.Context r4 = r7.sApplicationContext
            int r5 = notifyId
            r6 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r4, r5, r3, r6)
            android.app.Notification$Builder r4 = new android.app.Notification$Builder
            android.content.Context r5 = r7.sApplicationContext
            r4.<init>(r5)
            android.app.Notification$Builder r2 = r4.setContentTitle(r2)
            android.app.Notification$BigTextStyle r4 = new android.app.Notification$BigTextStyle
            r4.<init>()
            android.app.Notification$BigTextStyle r0 = r4.bigText(r0)
            android.app.Notification$Builder r0 = r2.setStyle(r0)
            r2 = 17301651(0x1080093, float:2.4979667E-38)
            android.app.Notification$Builder r0 = r0.setSmallIcon(r2)
            android.app.Notification$Builder r0 = r0.setContentIntent(r3)
            android.app.Notification$Builder r0 = r0.setAutoCancel(r9)
            android.app.Notification r0 = r0.build()
            android.app.NotificationManager r2 = mNotifyMgr
            int r3 = notifyId
            r2.notify(r3, r0)
        L_0x0155:
            android.widget.Toast r0 = r7.toast
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.common.util.b.f28331a
            r14 = 1
            r15 = 15944(0x3e48, float:2.2342E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<android.widget.Toast> r3 = android.widget.Toast.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0189
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.common.util.b.f28331a
            r14 = 1
            r15 = 15944(0x3e48, float:2.2342E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.widget.Toast> r2 = android.widget.Toast.class
            r0[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0198
        L_0x0189:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 != r3) goto L_0x0195
            r2 = r0
            android.widget.Toast r2 = (android.widget.Toast) r2
            com.ss.android.ugc.aweme.utils.eq.a(r2)
        L_0x0195:
            r0.show()
        L_0x0198:
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r4
            r7.nextTime = r2
            android.os.Handler r0 = r7.handler
            r0.sendEmptyMessageDelayed(r1, r4)
        L_0x01a6:
            return
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.EventsSender.handleMsg(android.os.Message):void");
    }

    private void v1Event(String str, JSONObject jSONObject) throws Exception {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, changeQuickRedirect, false, 15928, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, changeQuickRedirect, false, 15928, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        msg(str2, str2 + " (1.0 埋点) ", jSONObject2, false);
    }

    private void v3Event(String str, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 15927, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 15927, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("matchResult");
        if (optJSONObject == null) {
            msg(str, str + " : error", jSONObject, true);
        } else if ("success".equals(optJSONObject.optString("check"))) {
            matchResultOk(str, optJSONObject, jSONObject, true);
        } else {
            matchResultNotOk(str, optJSONObject, jSONObject);
        }
    }

    public boolean verify(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 15938, new Class[]{String.class, JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 15938, new Class[]{String.class, JSONObject.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.mVerifySendEnable || this.sDemandId == null || this.sDemandName == null || this.sDemandV3Events == null || str == null || jSONObject == null) {
            return false;
        } else {
            if (!this.sDemandId.equals(jSONObject.optString("__demandId__"))) {
                return false;
            }
            for (String equals : this.sDemandV3Events) {
                if (equals.equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    private void matchResultNotOk(String str, JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        String str2 = str;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject3, jSONObject4}, this, changeQuickRedirect, false, 15926, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject3, jSONObject4}, this, changeQuickRedirect, false, 15926, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONArray optJSONArray = jSONObject3.optJSONArray("check");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2 + " : 错误已发送至验证平台");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"check".equals(next) && !"platform".equals(next) && !"warning".equals(next)) {
                Object opt = jSONObject3.opt(next);
                if (opt != null) {
                    arrayList.add(next + " : " + opt);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject3.optJSONArray("warning");
        if (optJSONArray2 != null) {
            arrayList.add("warning:");
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList.add(optJSONArray2.getString(i2));
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            sb.append((String) arrayList.get(i3));
            if (i3 != arrayList.size() - 1) {
                sb.append("\n");
            }
        }
        msg(str2, sb.toString(), jSONObject4, true);
    }

    public void setTestVerifyDemandItem(String str, String str2, List<String> list, List<String> list2) {
        if (PatchProxy.isSupport(new Object[]{str, str2, list, list2}, this, changeQuickRedirect, false, 15937, new Class[]{String.class, String.class, List.class, List.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, list, list2};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 15937, new Class[]{String.class, String.class, List.class, List.class}, Void.TYPE);
            return;
        }
        setTestVerifyDemandItem(str, str2, list, list2, true, null);
    }

    private void matchResultOk(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) throws Exception {
        String str2 = str;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject3, jSONObject4, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15925, new Class[]{String.class, JSONObject.class, JSONObject.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject3, jSONObject4, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15925, new Class[]{String.class, JSONObject.class, JSONObject.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"check".equals(next) && !"platform".equals(next)) {
                Object opt = jSONObject3.opt(next);
                if (opt != null) {
                    arrayList.add(next + " : " + opt);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            if (i != arrayList.size() - 1) {
                sb.append("\n");
            }
        }
        msg(str2, str2 + " : success \n" + sb.toString(), jSONObject4, z);
    }

    private void msg(String str, String str2, JSONObject jSONObject, boolean z) {
        String str3 = str;
        String str4 = str2;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str3, str4, jSONObject2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15930, new Class[]{String.class, String.class, JSONObject.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, jSONObject2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15930, new Class[]{String.class, String.class, JSONObject.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("toast", str4);
            jSONObject3.put("raw", jSONObject2);
            jSONObject3.put("event", str3);
            jSONObject3.put("v3", z);
            try {
                toast(jSONObject3.toString());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    private void executeVerify(String str, String str2, List<Pair<String, String>> list, boolean z, boolean z2) {
        String str3 = str;
        String str4 = str2;
        List<Pair<String, String>> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str3, str4, list2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15929, new Class[]{String.class, String.class, List.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, list2, Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 15929, new Class[]{String.class, String.class, List.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(NetworkClient.getDefault().post(str4, list2));
            if (z2) {
                if (z) {
                    v3Event(str3, jSONObject);
                    return;
                }
                v1Event(str3, jSONObject);
            }
        } catch (Exception unused) {
            if (z2) {
                if (z) {
                    msg(str3, str3 + " : error", null, true);
                    return;
                }
                msg(str3, str3 + "(1.0 埋点) : error", null, false);
            }
        }
    }

    public void setTestVerifyDemandItem(String str, String str2, List<String> list, List<String> list2, boolean z, String str3) {
        this.sDemandId = str;
        this.sDemandName = str2;
        this.sDemandV3Events = list;
        this.sDemandV1Events = list2;
        this.mIsFilterDemand = z;
        this.sUserName = str3;
    }
}
