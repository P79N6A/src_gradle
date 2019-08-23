package com.umeng.message;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.service.UMJobIntentService;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;

public class UmengDownloadResourceService extends UMJobIntentService {
    public static final String TAG = "com.umeng.message.UmengDownloadResourceService";
    /* access modifiers changed from: private */
    public static Thread x;

    /* renamed from: a  reason: collision with root package name */
    ScheduledThreadPoolExecutor f81119a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4);

    /* renamed from: b  reason: collision with root package name */
    Context f81120b = this;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<String> f81121c = new ArrayList<>();

    public class DownloadResourceTask extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        UMessage f81124a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<String> f81125b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f81126c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            Iterator<String> it2 = this.f81125b.iterator();
            boolean z = true;
            while (it2.hasNext()) {
                z &= download(it2.next());
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            UmengDownloadResourceService.this.f81121c.remove(this.f81124a.msg_id);
            if (bool.booleanValue() || this.f81126c <= 0) {
                MessageSharedPrefs.getInstance(UmengDownloadResourceService.this.f81120b).setMessageResourceDownloaded(this.f81124a.msg_id);
                String jSONObject = this.f81124a.getRaw().toString();
                Intent intent = new Intent(UmengDownloadResourceService.this.f81120b, UmengDownloadResourceService.class);
                intent.putExtra("body", jSONObject);
                intent.putExtra("id", this.f81124a.message_id);
                intent.putExtra(PushConstants.TASK_ID, this.f81124a.task_id);
                intent.putExtra("OPERATIOIN", 1);
                intent.putExtra("RETRY_TIME", this.f81126c);
                UMJobIntentService.enqueueWork(UmengDownloadResourceService.this.f81120b, UmengDownloadResourceService.class, intent);
                return;
            }
            if (UmengDownloadResourceService.this.f81121c.size() == 0) {
                UmengDownloadResourceService.this.stopSelf();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStream} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean download(java.lang.String r9) {
            /*
                r8 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r9)
                r1 = 1
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                r0 = 0
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r3.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                int r4 = r9.hashCode()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r3.append(r4)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                com.umeng.message.UmengDownloadResourceService r4 = com.umeng.message.UmengDownloadResourceService.this     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                android.content.Context r4 = r4.f81120b     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                com.umeng.message.entity.UMessage r5 = r8.f81124a     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.lang.String r4 = com.umeng.message.UmengDownloadResourceService.getMessageResourceFolder(r4, r5)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r6.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r6.append(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.lang.String r7 = ".tmp"
                r6.append(r7)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r5.<init>(r4, r6)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r6.<init>(r4, r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                boolean r3 = r6.exists()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                if (r3 == 0) goto L_0x0050
                com.umeng.message.UmengDownloadResourceService r9 = com.umeng.message.UmengDownloadResourceService.this
                r9.close(r2)
                com.umeng.message.UmengDownloadResourceService r9 = com.umeng.message.UmengDownloadResourceService.this
                r9.close(r2)
                return r1
            L_0x0050:
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                if (r4 != 0) goto L_0x005e
                r3.mkdirs()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
            L_0x005e:
                boolean r3 = r5.exists()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                if (r3 == 0) goto L_0x0067
                r5.delete()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
            L_0x0067:
                java.net.URI r3 = new java.net.URI     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r3.<init>(r9)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.lang.String r9 = r3.toASCIIString()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                r3.<init>(r9)     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.io.InputStream r9 = r3.openStream()     // Catch:{ Exception -> 0x00b0, all -> 0x00a3 }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00b1, all -> 0x009e }
                r3.<init>(r5)     // Catch:{ Exception -> 0x00b1, all -> 0x009e }
                r2 = 10240(0x2800, float:1.4349E-41)
                byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            L_0x0082:
                int r4 = r9.read(r2)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
                if (r4 <= 0) goto L_0x008c
                r3.write(r2, r0, r4)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
                goto L_0x0082
            L_0x008c:
                r5.renameTo(r6)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
                com.umeng.message.UmengDownloadResourceService r0 = com.umeng.message.UmengDownloadResourceService.this
                r0.close(r9)
                com.umeng.message.UmengDownloadResourceService r9 = com.umeng.message.UmengDownloadResourceService.this
                r9.close(r3)
                return r1
            L_0x009a:
                r0 = move-exception
                goto L_0x00a0
            L_0x009c:
                r2 = r3
                goto L_0x00b1
            L_0x009e:
                r0 = move-exception
                r3 = r2
            L_0x00a0:
                r2 = r9
                r9 = r0
                goto L_0x00a5
            L_0x00a3:
                r9 = move-exception
                r3 = r2
            L_0x00a5:
                com.umeng.message.UmengDownloadResourceService r0 = com.umeng.message.UmengDownloadResourceService.this
                r0.close(r2)
                com.umeng.message.UmengDownloadResourceService r0 = com.umeng.message.UmengDownloadResourceService.this
                r0.close(r3)
                throw r9
            L_0x00b0:
                r9 = r2
            L_0x00b1:
                com.umeng.message.UmengDownloadResourceService r1 = com.umeng.message.UmengDownloadResourceService.this
                r1.close(r9)
                com.umeng.message.UmengDownloadResourceService r9 = com.umeng.message.UmengDownloadResourceService.this
                r9.close(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengDownloadResourceService.DownloadResourceTask.download(java.lang.String):boolean");
        }

        public DownloadResourceTask(UMessage uMessage, int i) {
            this.f81124a = uMessage;
            if ("notificationpullapp".equals(uMessage.display_type)) {
                try {
                    this.f81125b.add(new JSONObject(uMessage.custom).optString("img"));
                } catch (Exception unused) {
                }
            }
            if (uMessage.isLargeIconFromInternet()) {
                this.f81125b.add(uMessage.img);
            }
            if (uMessage.isSoundFromInternet()) {
                this.f81125b.add(uMessage.sound);
            }
            if (!TextUtils.isEmpty(uMessage.bar_image)) {
                this.f81125b.add(uMessage.bar_image);
            }
            if (!TextUtils.isEmpty(uMessage.expand_image)) {
                this.f81125b.add(uMessage.expand_image);
            }
            this.f81126c = i;
        }
    }

    public void checkCache() {
        try {
            checkDir(new File(getMessageResourceFolder(this.f81120b, null)), 1048576, 86400000);
        } catch (Throwable unused) {
        }
    }

    public void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public void notification(UMessage uMessage) {
        UHandler uHandler;
        if ("notificationpullapp".equals(uMessage.display_type)) {
            uHandler = PushAgent.getInstance(this).getAdHandler();
        } else {
            uHandler = PushAgent.getInstance(this).getMessageHandler();
        }
        if (uHandler != null) {
            if (TextUtils.equals("autoupdate", uMessage.display_type)) {
                UmengMessageHandler umengMessageHandler = (UmengMessageHandler) PushAgent.getInstance(this.f81120b).getMessageHandler();
                if (umengMessageHandler != null) {
                    umengMessageHandler.dealWithNotificationMessage(this.f81120b, uMessage);
                }
                return;
            }
            uHandler.handleMessage(this, uMessage);
        }
    }

    private static long a(File file) {
        long j = 0;
        if (file == null || !file.exists() || !file.isDirectory()) {
            return 0;
        }
        Stack stack = new Stack();
        stack.clear();
        stack.push(file);
        while (!stack.isEmpty()) {
            for (File file2 : ((File) stack.pop()).listFiles()) {
                if (!file2.isDirectory()) {
                    j += file2.length();
                }
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Intent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "wuchi"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "--->>> UmengDownloadResourceService onHandleWork"
            r4 = 0
            r2[r4] = r3
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r0, (java.lang.Object[]) r2)
            if (r9 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.String r0 = "OPERATIOIN"
            r2 = 2
            int r0 = r9.getIntExtra(r0, r2)
            java.lang.String r3 = "RETRY_TIME"
            r5 = 3
            int r3 = r9.getIntExtra(r3, r5)
            java.lang.String r5 = "body"
            java.lang.String r5 = r9.getStringExtra(r5)
            com.umeng.message.entity.UMessage r6 = new com.umeng.message.entity.UMessage     // Catch:{ Exception -> 0x008e }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x008e }
            r7.<init>(r5)     // Catch:{ Exception -> 0x008e }
            r6.<init>(r7)     // Catch:{ Exception -> 0x008e }
            java.lang.String r5 = "id"
            java.lang.String r5 = r9.getStringExtra(r5)     // Catch:{ Exception -> 0x008e }
            r6.message_id = r5     // Catch:{ Exception -> 0x008e }
            java.lang.String r5 = "task_id"
            java.lang.String r9 = r9.getStringExtra(r5)     // Catch:{ Exception -> 0x008e }
            r6.task_id = r9     // Catch:{ Exception -> 0x008e }
            java.util.ArrayList<java.lang.String> r9 = r8.f81121c     // Catch:{ Exception -> 0x008e }
            java.lang.String r5 = r6.msg_id     // Catch:{ Exception -> 0x008e }
            boolean r9 = r9.contains(r5)     // Catch:{ Exception -> 0x008e }
            if (r9 == 0) goto L_0x0049
            return
        L_0x0049:
            java.util.ArrayList<java.lang.String> r9 = r8.f81121c     // Catch:{ Exception -> 0x008e }
            java.lang.String r5 = r6.msg_id     // Catch:{ Exception -> 0x008e }
            r9.add(r5)     // Catch:{ Exception -> 0x008e }
            switch(r0) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0054;
                default: goto L_0x0053;
            }     // Catch:{ Exception -> 0x008e }
        L_0x0053:
            goto L_0x008d
        L_0x0054:
            java.lang.String r9 = TAG     // Catch:{ Exception -> 0x008e }
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ Exception -> 0x008e }
            java.lang.String r5 = "开始下载资源"
            r0[r4] = r5     // Catch:{ Exception -> 0x008e }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r9, (int) r2, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x008e }
            int r3 = r3 - r1
            r8.setAlarm(r6, r3)     // Catch:{ Exception -> 0x008e }
            r8.checkCache()     // Catch:{ Exception -> 0x008e }
            r8.downloadResource(r6, r3)     // Catch:{ Exception -> 0x008e }
            goto L_0x008e
        L_0x006a:
            r8.deleteAlarm(r6, r3)     // Catch:{ Exception -> 0x008e }
            java.lang.String r9 = TAG     // Catch:{ Exception -> 0x008e }
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ Exception -> 0x008e }
            java.lang.String r1 = "下载资源后显示通知"
            r0[r4] = r1     // Catch:{ Exception -> 0x008e }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r9, (int) r2, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x008e }
            r8.notification(r6)     // Catch:{ Exception -> 0x008e }
            java.util.ArrayList<java.lang.String> r9 = r8.f81121c     // Catch:{ Exception -> 0x008e }
            java.lang.String r0 = r6.msg_id     // Catch:{ Exception -> 0x008e }
            r9.remove(r0)     // Catch:{ Exception -> 0x008e }
            java.util.ArrayList<java.lang.String> r9 = r8.f81121c     // Catch:{ Exception -> 0x008e }
            int r9 = r9.size()     // Catch:{ Exception -> 0x008e }
            if (r9 != 0) goto L_0x008d
            r8.stopSelf()     // Catch:{ Exception -> 0x008e }
        L_0x008d:
            return
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengDownloadResourceService.a(android.content.Intent):void");
    }

    public void deleteAlarm(UMessage uMessage, int i) {
        UMLog.mutlInfo(TAG, 2, "deleteAlarm");
        ((AlarmManager) getSystemService("alarm")).cancel(a(uMessage, i));
    }

    @SuppressLint({"NewApi"})
    public void downloadResource(UMessage uMessage, int i) {
        DownloadResourceTask downloadResourceTask = new DownloadResourceTask(uMessage, i);
        if (Build.VERSION.SDK_INT >= 11) {
            downloadResourceTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            downloadResourceTask.execute(new Void[0]);
        }
    }

    /* access modifiers changed from: private */
    public static void b(File file, long j) {
        if (file != null && file.exists() && file.canWrite() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (!file2.isDirectory() && System.currentTimeMillis() - file2.lastModified() > j) {
                    file2.delete();
                }
            }
        }
    }

    public static String getMessageResourceFolder(Context context, UMessage uMessage) {
        String str = context.getCacheDir() + "/umeng_push/";
        if (uMessage == null || uMessage.msg_id == null) {
            return str;
        }
        return str + uMessage.msg_id + "/";
    }

    public void setAlarm(UMessage uMessage, int i) {
        UMLog.mutlInfo(TAG, 2, "setAlarm");
        ((AlarmManager) getSystemService("alarm")).set(1, System.currentTimeMillis() + 300000, a(uMessage, i));
    }

    private PendingIntent a(UMessage uMessage, int i) {
        String jSONObject = uMessage.getRaw().toString();
        int hashCode = uMessage.msg_id.hashCode();
        Intent intent = new Intent(this.f81120b, UmengDownloadResourceService.class);
        intent.putExtra("body", jSONObject);
        intent.putExtra("id", uMessage.message_id);
        intent.putExtra(PushConstants.TASK_ID, uMessage.task_id);
        intent.putExtra("OPERATIOIN", 2);
        intent.putExtra("RETRY_TIME", i);
        PendingIntent service = PendingIntent.getService(this.f81120b, hashCode, intent, 134217728);
        String str = TAG;
        UMLog.mutlInfo(str, 2, "PendingIntent: msgId:" + uMessage.msg_id + ",requestCode:" + hashCode + ",retryTime:" + i);
        return service;
    }

    public static void checkDir(final File file, long j, final long j2) throws IOException {
        if (file.exists() && a(file.getCanonicalFile()) > j) {
            if (x == null) {
                x = new Thread(new Runnable() {
                    public final void run() {
                        UmengDownloadResourceService.b(file, j2);
                        Thread unused = UmengDownloadResourceService.x = null;
                    }
                });
            }
            synchronized (x) {
                x.start();
            }
        }
    }
}
