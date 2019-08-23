package org.android.agoo.control;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;
import org.android.agoo.service.SendMessage;

public class AgooFactory {
    @SuppressLint({"CI_StaticFieldLeak"})
    public static Context mContext;
    private MessageService messageService;
    protected NotifManager notifyManager;

    class a implements ServiceConnection {

        /* renamed from: b  reason: collision with root package name */
        private Intent f83993b;

        /* renamed from: c  reason: collision with root package name */
        private String f83994c;

        /* renamed from: d  reason: collision with root package name */
        private SendMessage f83995d;

        /* renamed from: e  reason: collision with root package name */
        private ServiceConnection f83996e = this;

        public void onServiceDisconnected(ComponentName componentName) {
            ALog.d("AgooFactory", "MessageConnection disConnected", new Object[0]);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ALog.d("AgooFactory", "MessageConnection conneted:" + componentName, new Object[0]);
            this.f83995d = SendMessage.Stub.asInterface(iBinder);
            ALog.d("AgooFactory", "onConnected current tid:" + Thread.currentThread().getId(), new Object[0]);
            ALog.d("AgooFactory", "MessageConnection sent:" + this.f83993b, new Object[0]);
            if (this.f83995d != null) {
                ThreadPoolExecutorFactory.execute(new f(this));
            }
        }

        public a(String str, Intent intent) {
            this.f83994c = str;
            this.f83993b = intent;
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private String f83997b;

        /* renamed from: c  reason: collision with root package name */
        private Intent f83998c;

        /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|10|(1:12)|13) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0093 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x00f2 A[Catch:{ Throwable -> 0x00fc }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                r0 = 0
                com.ss.android.push.PushDependManager r1 = com.ss.android.push.PushDependManager.inst()     // Catch:{ Throwable -> 0x00fc }
                android.content.Context r2 = org.android.agoo.control.AgooFactory.mContext     // Catch:{ Throwable -> 0x00fc }
                java.util.List r1 = r1.getWakeupBlacklistPkg(r2)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = r6.f83997b     // Catch:{ Throwable -> 0x00fc }
                boolean r1 = r1.contains(r2)     // Catch:{ Throwable -> 0x00fc }
                if (r1 == 0) goto L_0x0038
                com.ss.android.push.PushDependManager r1 = com.ss.android.push.PushDependManager.inst()     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = "AgooFactory"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r4 = "run: prevent start : "
                r3.<init>(r4)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r4 = r6.f83997b     // Catch:{ Throwable -> 0x00fc }
                r3.append(r4)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x00fc }
                r1.loggerD(r2, r3)     // Catch:{ Throwable -> 0x00fc }
                android.content.Context r1 = org.android.agoo.control.AgooFactory.mContext     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = r6.f83997b     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = "umeng"
                org.json.JSONObject[] r4 = new org.json.JSONObject[r0]     // Catch:{ Throwable -> 0x00fc }
                com.ss.android.push.c.a(r1, r2, r3, r4)     // Catch:{ Throwable -> 0x00fc }
                return
            L_0x0038:
                java.lang.String r1 = "AgooFactory"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = "running tid:"
                r2.<init>(r3)     // Catch:{ Throwable -> 0x00fc }
                java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ Throwable -> 0x00fc }
                long r3 = r3.getId()     // Catch:{ Throwable -> 0x00fc }
                r2.append(r3)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = ",pack="
                r2.append(r3)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = r6.f83997b     // Catch:{ Throwable -> 0x00fc }
                r2.append(r3)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00fc }
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x00fc }
                com.taobao.accs.utl.ALog.d(r1, r2, r3)     // Catch:{ Throwable -> 0x00fc }
                android.content.Context r1 = org.android.agoo.control.AgooFactory.mContext     // Catch:{ Throwable -> 0x00fc }
                android.content.Intent r2 = r6.f83998c     // Catch:{ Throwable -> 0x00fc }
                r1.sendBroadcast(r2)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r1 = "AgooFactory"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = "SendMessageRunnable for accs,pack="
                r2.<init>(r3)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = r6.f83997b     // Catch:{ Throwable -> 0x00fc }
                r2.append(r3)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00fc }
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x00fc }
                com.taobao.accs.utl.ALog.d(r1, r2, r3)     // Catch:{ Throwable -> 0x00fc }
                android.content.Intent r1 = r6.f83998c     // Catch:{ Throwable -> 0x0093 }
                java.lang.String r2 = r6.f83997b     // Catch:{ Throwable -> 0x0093 }
                r1.setPackage(r2)     // Catch:{ Throwable -> 0x0093 }
                android.content.Intent r1 = r6.f83998c     // Catch:{ Throwable -> 0x0093 }
                java.lang.String r2 = "org.agoo.android.intent.action.RECEIVE"
                r1.setAction(r2)     // Catch:{ Throwable -> 0x0093 }
                android.content.Context r1 = org.android.agoo.control.AgooFactory.mContext     // Catch:{ Throwable -> 0x0093 }
                android.content.Intent r2 = r6.f83998c     // Catch:{ Throwable -> 0x0093 }
                r3 = 1
                com.taobao.accs.a.a.a(r1, r2, r3)     // Catch:{ Throwable -> 0x0093 }
            L_0x0093:
                android.content.Intent r1 = new android.content.Intent     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = "org.android.agoo.client.MessageReceiverService"
                r1.<init>(r2)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = r6.f83997b     // Catch:{ Throwable -> 0x00fc }
                r1.setPackage(r2)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = "AgooFactory"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r4 = "this message pack:"
                r3.<init>(r4)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r4 = r6.f83997b     // Catch:{ Throwable -> 0x00fc }
                r3.append(r4)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x00fc }
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x00fc }
                com.taobao.accs.utl.ALog.d(r2, r3, r4)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = "AgooFactory"
                java.lang.String r3 = "start to service..."
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x00fc }
                com.taobao.accs.utl.ALog.d(r2, r3, r4)     // Catch:{ Throwable -> 0x00fc }
                org.android.agoo.control.AgooFactory$a r2 = new org.android.agoo.control.AgooFactory$a     // Catch:{ Throwable -> 0x00fc }
                org.android.agoo.control.AgooFactory r3 = org.android.agoo.control.AgooFactory.this     // Catch:{ Throwable -> 0x00fc }
                r3.getClass()     // Catch:{ Throwable -> 0x00fc }
                android.content.Intent r4 = r6.f83998c     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r5 = "id"
                java.lang.String r4 = r4.getStringExtra(r5)     // Catch:{ Throwable -> 0x00fc }
                android.content.Intent r5 = r6.f83998c     // Catch:{ Throwable -> 0x00fc }
                r2.<init>(r4, r5)     // Catch:{ Throwable -> 0x00fc }
                android.content.Context r3 = org.android.agoo.control.AgooFactory.mContext     // Catch:{ Throwable -> 0x00fc }
                r4 = 17
                boolean r1 = r3.bindService(r1, r2, r4)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r2 = "AgooFactory"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r4 = "start service ret:"
                r3.<init>(r4)     // Catch:{ Throwable -> 0x00fc }
                r3.append(r1)     // Catch:{ Throwable -> 0x00fc }
                java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x00fc }
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x00fc }
                com.taobao.accs.utl.ALog.d(r2, r3, r4)     // Catch:{ Throwable -> 0x00fc }
                if (r1 != 0) goto L_0x00fb
                java.lang.String r1 = "AgooFactory"
                java.lang.String r2 = "SendMessageRunnable is error"
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x00fc }
                com.taobao.accs.utl.ALog.d(r1, r2, r3)     // Catch:{ Throwable -> 0x00fc }
            L_0x00fb:
                return
            L_0x00fc:
                r1 = move-exception
                java.lang.String r2 = "AgooFactory"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "SendMessageRunnable is error,e="
                r3.<init>(r4)
                java.lang.String r1 = r1.toString()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.taobao.accs.utl.ALog.e(r2, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.AgooFactory.b.run():void");
        }

        public b(String str, Intent intent) {
            this.f83997b = str;
            this.f83998c = intent;
        }
    }

    public void reportCacheMsg() {
        try {
            ThreadPoolExecutorFactory.execute(new c(this));
        } catch (Throwable th) {
            ALog.e("AgooFactory", "reportCacheMsg fail:" + th.toString(), new Object[0]);
        }
    }

    public static MessageService access$100(AgooFactory agooFactory) {
        return agooFactory.messageService;
    }

    public void saveMsg(byte[] bArr) {
        saveMsg(bArr, null);
    }

    public static String parseEncryptedMsg(String str) {
        String str2;
        byte[] bArr;
        try {
            String a2 = Config.a(mContext);
            if (UtilityImpl.a("ACCS_SDK", mContext)) {
                str2 = UtilityImpl.c("ACCS_SDK", mContext);
            } else {
                str2 = com.taobao.accs.utl.a.b(mContext);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = com.taobao.accs.utl.a.b(mContext);
            }
            if (com.taobao.accs.client.a.f78909a == 2) {
                if (!TextUtils.isEmpty(com.taobao.accs.utl.a.f79096b)) {
                    bArr = org.android.agoo.common.a.a(com.taobao.accs.utl.a.f79096b.getBytes("utf-8"), (a2 + str2).getBytes("utf-8"));
                    if (bArr == null && bArr.length > 0) {
                        return new String(org.android.agoo.common.a.a(Base64.decode(str, 8), new SecretKeySpec(org.android.agoo.common.a.a(bArr), "AES"), org.android.agoo.common.a.a(a2.getBytes("utf-8"))), "utf-8");
                    }
                    ALog.e("AgooFactory", "aesDecrypt key is null!", new Object[0]);
                    return null;
                }
                ALog.e("AgooFactory", "getAppsign secret null", new Object[0]);
            }
            bArr = null;
            if (bArr == null) {
            }
            ALog.e("AgooFactory", "aesDecrypt key is null!", new Object[0]);
            return null;
        } catch (Throwable th) {
            ALog.e("AgooFactory", "parseEncryptedMsg failure: ", th, new Object[0]);
            return null;
        }
    }

    public void msgRecevie(byte[] bArr, String str) {
        msgRecevie(bArr, str, null);
    }

    private static final boolean checkPackage(Context context, String str) {
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public void saveMsg(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            ThreadPoolExecutorFactory.execute(new a(this, bArr, str));
        }
    }

    public void updateMsg(byte[] bArr, boolean z) {
        ThreadPoolExecutorFactory.execute(new d(this, bArr, z));
    }

    public void updateNotifyMsg(String str, String str2) {
        ThreadPoolExecutorFactory.execute(new e(this, str, str2));
    }

    private void sendMsgByBindService(String str, Intent intent) {
        try {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d("AgooFactory", "onHandleMessage current tid:" + Thread.currentThread().getId(), new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new b(str, intent));
        } catch (Throwable th) {
            ALog.e("AgooFactory", "sendMsgByBindService error >>", th, new Object[0]);
        }
    }

    public void updateMsgStatus(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.i("AgooFactory", "updateNotifyMsg begin,messageId=" + str + ",status=" + str2 + ",reportTimes=" + Config.e(mContext), new Object[0]);
                    }
                    if (TextUtils.equals(str2, "8")) {
                        this.messageService.a(str, PushConstants.PUSH_TYPE_UPLOAD_LOG);
                        return;
                    }
                    if (TextUtils.equals(str2, "9")) {
                        this.messageService.a(str, "3");
                    }
                }
            }
        } catch (Throwable th) {
            ALog.e("AgooFactory", "updateNotifyMsg e=" + th.toString(), new Object[0]);
        }
    }

    private static Bundle getFlag(long j, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Integer.parseInt(charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString("encrypted", sb.toString());
                    if (charArray[6] == '1') {
                        bundle.putString("report", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        msgDO.reportStr = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    }
                    if (charArray[7] == '1') {
                        bundle.putString("notify", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString("has_test", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString("duplicate", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt("popup", 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    public void init(Context context, NotifManager notifManager, MessageService messageService2) {
        mContext = context.getApplicationContext();
        this.notifyManager = notifManager;
        if (this.notifyManager == null) {
            this.notifyManager = new NotifManager();
        }
        this.notifyManager.init(mContext);
        this.messageService = messageService2;
        if (this.messageService == null) {
            this.messageService = new MessageService();
        }
        this.messageService.a(mContext);
    }

    public void msgRecevie(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i("AgooFactory", "into--[AgooFactory,msgRecevie]:messageSource=" + str, new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new b(this, bArr, str, extraInfo));
        } catch (Throwable th) {
            ALog.e("AgooFactory", "serviceImpl init task fail:" + th.toString(), new Object[0]);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:55|56|(1:58)) */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f7, code lost:
        if (com.taobao.accs.utl.ALog.isPrintLog(com.taobao.accs.utl.ALog.Level.I) != false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f9, code lost:
        com.taobao.accs.utl.ALog.i("AgooFactory", "agoo msg has no time", new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x01f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle msgReceiverPreHandler(byte[] r30, java.lang.String r31, com.taobao.accs.base.TaoBaseService.ExtraInfo r32, boolean r33) {
        /*
            r29 = this;
            r8 = r29
            r0 = r30
            r9 = r31
            r10 = r32
            r1 = 66002(0x101d2, float:9.2489E-41)
            r11 = 0
            r12 = 0
            if (r0 == 0) goto L_0x029c
            int r2 = r0.length     // Catch:{ Throwable -> 0x029a }
            if (r2 <= 0) goto L_0x029c
            java.lang.String r13 = new java.lang.String     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = "utf-8"
            r13.<init>(r0, r2)     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.ALog$Level r0 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Throwable -> 0x029a }
            boolean r0 = com.taobao.accs.utl.ALog.isPrintLog(r0)     // Catch:{ Throwable -> 0x029a }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "AgooFactory"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x029a }
            java.lang.String r3 = "msgRecevie,message--->["
            r2.<init>(r3)     // Catch:{ Throwable -> 0x029a }
            r2.append(r13)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r3 = "],utdid="
            r2.append(r3)     // Catch:{ Throwable -> 0x029a }
            android.content.Context r3 = mContext     // Catch:{ Throwable -> 0x029a }
            java.lang.String r3 = com.taobao.accs.utl.a.b(r3)     // Catch:{ Throwable -> 0x029a }
            r2.append(r3)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x029a }
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.ALog.i(r0, r2, r3)     // Catch:{ Throwable -> 0x029a }
        L_0x0044:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x029a }
            if (r0 == 0) goto L_0x0077
            com.taobao.accs.utl.UTMini r0 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = "accs.msgRecevie"
            android.content.Context r3 = mContext     // Catch:{ Throwable -> 0x029a }
            java.lang.String r3 = com.taobao.accs.utl.a.b(r3)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r4 = "message==null"
            r0.commitEvent(r1, r2, r3, r4)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r0 = "AgooFactory"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = "handleMessage message==null,utdid="
            r1.<init>(r2)     // Catch:{ Throwable -> 0x029a }
            android.content.Context r2 = mContext     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = com.taobao.accs.utl.a.b(r2)     // Catch:{ Throwable -> 0x029a }
            r1.append(r2)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x029a }
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.ALog.i(r0, r1, r2)     // Catch:{ Throwable -> 0x029a }
            return r11
        L_0x0077:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Throwable -> 0x029a }
            r0.<init>(r13)     // Catch:{ Throwable -> 0x029a }
            int r14 = r0.length()     // Catch:{ Throwable -> 0x029a }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x029a }
            r15.<init>()     // Catch:{ Throwable -> 0x029a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x029a }
            r7.<init>()     // Catch:{ Throwable -> 0x029a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x029a }
            r6.<init>()     // Catch:{ Throwable -> 0x029a }
            r1 = r11
            r2 = r1
            r5 = 0
        L_0x0092:
            if (r5 >= r14) goto L_0x0275
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Throwable -> 0x029a }
            r4.<init>()     // Catch:{ Throwable -> 0x029a }
            org.json.JSONObject r1 = r0.getJSONObject(r5)     // Catch:{ Throwable -> 0x029a }
            if (r1 == 0) goto L_0x025b
            org.android.agoo.common.MsgDO r3 = new org.android.agoo.common.MsgDO     // Catch:{ Throwable -> 0x029a }
            r3.<init>()     // Catch:{ Throwable -> 0x029a }
            java.lang.String r11 = "p"
            java.lang.String r11 = r1.getString(r11)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r12 = "i"
            java.lang.String r12 = r1.getString(r12)     // Catch:{ Throwable -> 0x029a }
            r22 = r0
            java.lang.String r0 = "b"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Throwable -> 0x029a }
            r23 = r2
            java.lang.String r2 = "f"
            r25 = r6
            r24 = r7
            long r6 = r1.getLong(r2)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = "ext"
            boolean r2 = r1.isNull(r2)     // Catch:{ Throwable -> 0x029a }
            if (r2 != 0) goto L_0x00d3
            java.lang.String r2 = "ext"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Throwable -> 0x029a }
            goto L_0x00d5
        L_0x00d3:
            r2 = r23
        L_0x00d5:
            r15.append(r12)     // Catch:{ Throwable -> 0x029a }
            r26 = r13
            int r13 = r14 + -1
            if (r5 >= r13) goto L_0x00e6
            r27 = r14
            java.lang.String r14 = ","
            r15.append(r14)     // Catch:{ Throwable -> 0x029a }
            goto L_0x00e8
        L_0x00e6:
            r27 = r14
        L_0x00e8:
            r3.msgIds = r12     // Catch:{ Throwable -> 0x029a }
            r3.extData = r2     // Catch:{ Throwable -> 0x029a }
            r3.removePacks = r11     // Catch:{ Throwable -> 0x029a }
            r3.messageSource = r9     // Catch:{ Throwable -> 0x029a }
            boolean r14 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x029a }
            if (r14 == 0) goto L_0x010c
            java.lang.String r0 = "11"
            r3.errorCode = r0     // Catch:{ Throwable -> 0x029a }
            org.android.agoo.control.NotifManager r0 = r8.notifyManager     // Catch:{ Throwable -> 0x029a }
            r0.handlerACKMessage(r3, r10)     // Catch:{ Throwable -> 0x029a }
        L_0x00ff:
            r23 = r2
            r11 = r4
            r16 = r5
            r13 = r24
            r14 = r25
        L_0x0108:
            r12 = r26
            goto L_0x0258
        L_0x010c:
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x029a }
            if (r14 == 0) goto L_0x011c
            java.lang.String r0 = "12"
            r3.errorCode = r0     // Catch:{ Throwable -> 0x029a }
            org.android.agoo.control.NotifManager r0 = r8.notifyManager     // Catch:{ Throwable -> 0x029a }
            r0.handlerACKMessage(r3, r10)     // Catch:{ Throwable -> 0x029a }
            goto L_0x00ff
        L_0x011c:
            r16 = -1
            int r14 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x012c
            java.lang.String r0 = "13"
            r3.errorCode = r0     // Catch:{ Throwable -> 0x029a }
            org.android.agoo.control.NotifManager r0 = r8.notifyManager     // Catch:{ Throwable -> 0x029a }
            r0.handlerACKMessage(r3, r10)     // Catch:{ Throwable -> 0x029a }
            goto L_0x00ff
        L_0x012c:
            android.content.Context r14 = mContext     // Catch:{ Throwable -> 0x029a }
            boolean r14 = checkPackage(r14, r11)     // Catch:{ Throwable -> 0x029a }
            if (r14 != 0) goto L_0x017d
            java.lang.String r0 = "AgooFactory"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x029a }
            java.lang.String r3 = "msgRecevie checkpackage is del,pack="
            r1.<init>(r3)     // Catch:{ Throwable -> 0x029a }
            r1.append(r11)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x029a }
            r3 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.ALog.d(r0, r1, r6)     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.UTMini r16 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ Throwable -> 0x029a }
            r17 = 66002(0x101d2, float:9.2489E-41)
            java.lang.String r18 = "accs.msgRecevie"
            android.content.Context r0 = mContext     // Catch:{ Throwable -> 0x029a }
            java.lang.String r19 = com.taobao.accs.utl.a.b(r0)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r20 = "deletePack"
            r21 = r11
            r16.commitEvent(r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x029a }
            r14 = r25
            r14.append(r11)     // Catch:{ Throwable -> 0x029a }
            r0 = r24
            r0.append(r12)     // Catch:{ Throwable -> 0x029a }
            if (r5 >= r13) goto L_0x0176
            java.lang.String r1 = ","
            r14.append(r1)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r1 = ","
            r0.append(r1)     // Catch:{ Throwable -> 0x029a }
        L_0x0176:
            r13 = r0
            r23 = r2
            r11 = r4
            r16 = r5
            goto L_0x0108
        L_0x017d:
            r13 = r24
            r14 = r25
            android.os.Bundle r6 = getFlag(r6, r3)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r7 = "encrypted"
            java.lang.String r7 = r6.getString(r7)     // Catch:{ Throwable -> 0x029a }
            android.content.Context r16 = mContext     // Catch:{ Throwable -> 0x029a }
            r28 = r5
            java.lang.String r5 = r16.getPackageName()     // Catch:{ Throwable -> 0x029a }
            boolean r5 = r5.equals(r11)     // Catch:{ Throwable -> 0x029a }
            if (r5 == 0) goto L_0x01d8
            r5 = 4
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ Throwable -> 0x029a }
            boolean r5 = android.text.TextUtils.equals(r7, r5)     // Catch:{ Throwable -> 0x029a }
            if (r5 != 0) goto L_0x01d6
            java.lang.String r0 = "AgooFactory"
            java.lang.String r1 = "msgRecevie msg encrypted flag not exist, cannot prase!!!"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.ALog.e(r0, r1, r6)     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.UTMini r16 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ Throwable -> 0x029a }
            r17 = 66002(0x101d2, float:9.2489E-41)
            java.lang.String r18 = "accs.msgRecevie"
            android.content.Context r0 = mContext     // Catch:{ Throwable -> 0x029a }
            java.lang.String r19 = com.taobao.accs.utl.a.b(r0)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r20 = "encrypted!=4"
            java.lang.String r21 = "15"
            r16.commitEvent(r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r0 = "24"
            r3.errorCode = r0     // Catch:{ Throwable -> 0x029a }
            org.android.agoo.control.NotifManager r0 = r8.notifyManager     // Catch:{ Throwable -> 0x029a }
            r0.handlerACKMessage(r3, r10)     // Catch:{ Throwable -> 0x029a }
            r23 = r2
            r11 = r4
            r12 = r26
            r16 = r28
            goto L_0x0258
        L_0x01d6:
            r5 = 0
            goto L_0x01da
        L_0x01d8:
            r3 = 1
            r5 = 1
        L_0x01da:
            if (r6 == 0) goto L_0x01df
            r4.putAll(r6)     // Catch:{ Throwable -> 0x029a }
        L_0x01df:
            java.lang.String r3 = "t"
            java.lang.String r1 = r1.getString(r3)     // Catch:{ Throwable -> 0x01f1 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x01f1 }
            if (r3 != 0) goto L_0x0203
            java.lang.String r3 = "time"
            r4.putString(r3, r1)     // Catch:{ Throwable -> 0x01f1 }
            goto L_0x0203
        L_0x01f1:
            com.taobao.accs.utl.ALog$Level r1 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Throwable -> 0x029a }
            boolean r1 = com.taobao.accs.utl.ALog.isPrintLog(r1)     // Catch:{ Throwable -> 0x029a }
            if (r1 == 0) goto L_0x0203
            java.lang.String r1 = "AgooFactory"
            java.lang.String r3 = "agoo msg has no time"
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.ALog.i(r1, r3, r7)     // Catch:{ Throwable -> 0x029a }
        L_0x0203:
            java.lang.String r1 = "trace"
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x029a }
            r4.putLong(r1, r6)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r1 = "id"
            r4.putString(r1, r12)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r1 = "body"
            r4.putString(r1, r0)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r0 = "source"
            r4.putString(r0, r11)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r0 = "fromAppkey"
            android.content.Context r1 = mContext     // Catch:{ Throwable -> 0x029a }
            java.lang.String r1 = org.android.agoo.common.Config.a(r1)     // Catch:{ Throwable -> 0x029a }
            r4.putString(r0, r1)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r0 = "extData"
            r4.putString(r0, r2)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r0 = "oriData"
            r12 = r26
            r4.putString(r0, r12)     // Catch:{ Throwable -> 0x029a }
            if (r33 == 0) goto L_0x0247
            android.content.Context r3 = mContext     // Catch:{ Throwable -> 0x029a }
            r1 = r29
            r23 = r2
            r2 = r3
            r3 = r11
            r11 = r4
            r16 = r28
            r6 = r31
            r7 = r32
            r1.sendMsgToBussiness(r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x029a }
            goto L_0x0258
        L_0x0247:
            r23 = r2
            r11 = r4
            r16 = r28
            java.lang.String r1 = "type"
            java.lang.String r2 = "common-push"
            r11.putString(r1, r2)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r1 = "message_source"
            r11.putString(r1, r9)     // Catch:{ Throwable -> 0x029a }
        L_0x0258:
            r2 = r23
            goto L_0x0267
        L_0x025b:
            r22 = r0
            r23 = r2
            r11 = r4
            r16 = r5
            r12 = r13
            r27 = r14
            r14 = r6
            r13 = r7
        L_0x0267:
            int r5 = r16 + 1
            r1 = r11
            r7 = r13
            r6 = r14
            r0 = r22
            r14 = r27
            r11 = 0
            r13 = r12
            r12 = 0
            goto L_0x0092
        L_0x0275:
            r14 = r6
            r13 = r7
            int r0 = r14.length()     // Catch:{ Throwable -> 0x029a }
            if (r0 <= 0) goto L_0x0299
            org.android.agoo.common.MsgDO r0 = new org.android.agoo.common.MsgDO     // Catch:{ Throwable -> 0x029a }
            r0.<init>()     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = r13.toString()     // Catch:{ Throwable -> 0x029a }
            r0.msgIds = r2     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = r14.toString()     // Catch:{ Throwable -> 0x029a }
            r0.removePacks = r2     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = "10"
            r0.errorCode = r2     // Catch:{ Throwable -> 0x029a }
            r0.messageSource = r9     // Catch:{ Throwable -> 0x029a }
            org.android.agoo.control.NotifManager r2 = r8.notifyManager     // Catch:{ Throwable -> 0x029a }
            r2.handlerACKMessage(r0, r10)     // Catch:{ Throwable -> 0x029a }
        L_0x0299:
            return r1
        L_0x029a:
            r0 = move-exception
            goto L_0x02cb
        L_0x029c:
            com.taobao.accs.utl.UTMini r0 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = "accs.msgRecevie"
            android.content.Context r3 = mContext     // Catch:{ Throwable -> 0x029a }
            java.lang.String r3 = com.taobao.accs.utl.a.b(r3)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r4 = "data==null"
            r0.commitEvent(r1, r2, r3, r4)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r0 = "AgooFactory"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = "handleMessage data==null,utdid="
            r1.<init>(r2)     // Catch:{ Throwable -> 0x029a }
            android.content.Context r2 = mContext     // Catch:{ Throwable -> 0x029a }
            java.lang.String r2 = com.taobao.accs.utl.a.b(r2)     // Catch:{ Throwable -> 0x029a }
            r1.append(r2)     // Catch:{ Throwable -> 0x029a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x029a }
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x029a }
            com.taobao.accs.utl.ALog.i(r0, r1, r3)     // Catch:{ Throwable -> 0x029a }
            r1 = 0
            return r1
        L_0x02cb:
            com.taobao.accs.utl.ALog$Level r1 = com.taobao.accs.utl.ALog.Level.E
            boolean r1 = com.taobao.accs.utl.ALog.isPrintLog(r1)
            if (r1 == 0) goto L_0x02e9
            java.lang.String r1 = "AgooFactory"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "msgRecevie is error,e="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.taobao.accs.utl.ALog.e(r1, r0, r2)
        L_0x02e9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.AgooFactory.msgReceiverPreHandler(byte[], java.lang.String, com.taobao.accs.base.TaoBaseService$ExtraInfo, boolean):android.os.Bundle");
    }

    private void sendMsgToBussiness(Context context, String str, Bundle bundle, boolean z, String str2, TaoBaseService.ExtraInfo extraInfo) {
        Intent intent = new Intent();
        intent.setAction("org.agoo.android.intent.action.RECEIVE");
        intent.setPackage(str);
        intent.putExtras(bundle);
        intent.putExtra("type", "common-push");
        intent.putExtra("message_source", str2);
        intent.addFlags(32);
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("accs_extra", extraInfo);
            intent.putExtra("msg_agoo_bundle", bundle2);
        } catch (Throwable th) {
            ALog.e("AgooFactory", "sendMsgToBussiness", th, new Object[0]);
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("AgooFactory", "sendMsgToBussiness intent:" + bundle.toString() + ",utdid=" + com.taobao.accs.utl.a.b(context) + ",pack=" + str + ",agooFlag=" + z, new Object[0]);
        }
        if (z) {
            UTMini.getInstance().commitEvent(66002, "accs.msgRecevie", com.taobao.accs.utl.a.b(context), "agooMsg", "15");
            sendMsgByBindService(str, intent);
            return;
        }
        intent.setClassName(str, com.taobao.accs.client.a.a(str));
        com.taobao.accs.a.a.a(context, intent, true);
    }
}
