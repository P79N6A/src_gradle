package anetwork.channel.download;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.Header;
import anetwork.channel.aidl.Connection;
import anetwork.channel.http.NetworkSdkSetting;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class DownloadManager {

    /* renamed from: a  reason: collision with root package name */
    SparseArray<b> f1511a;

    /* renamed from: b  reason: collision with root package name */
    AtomicInteger f1512b;

    /* renamed from: c  reason: collision with root package name */
    ThreadPoolExecutor f1513c;

    /* renamed from: d  reason: collision with root package name */
    Context f1514d;

    public interface DownloadListener {
        void onFail(int i, int i2, String str);

        void onProgress(int i, long j, long j2);

        void onSuccess(int i, String str);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static DownloadManager f1515a = new DownloadManager();

        private a() {
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f1516a;

        /* renamed from: b  reason: collision with root package name */
        final URL f1517b;

        /* renamed from: d  reason: collision with root package name */
        private final String f1519d;

        /* renamed from: e  reason: collision with root package name */
        private final CopyOnWriteArrayList<DownloadListener> f1520e;

        /* renamed from: f  reason: collision with root package name */
        private final AtomicBoolean f1521f = new AtomicBoolean(false);
        private final AtomicBoolean g = new AtomicBoolean(false);
        private volatile Connection h = null;
        private boolean i = true;

        public void a() {
            this.f1521f.set(true);
            a(-105, "download canceled.");
            if (this.h != null) {
                try {
                    this.h.cancel();
                } catch (RemoteException unused) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0166, code lost:
            r3.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x016f, code lost:
            if (r15.f1521f.get() == false) goto L_0x0191;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x019c, code lost:
            if (r2.renameTo(new java.io.File(r15.f1519d)) == false) goto L_0x01a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x019e, code lost:
            a(r15.f1519d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x01a4, code lost:
            a(-106, "file rename to " + r15.f1519d + " failed");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x017b A[SYNTHETIC, Splitter:B:120:0x017b] */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0183 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x01c8 A[SYNTHETIC, Splitter:B:145:0x01c8] */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x01d0 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x0232 A[SYNTHETIC, Splitter:B:185:0x0232] */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x0237 A[SYNTHETIC, Splitter:B:189:0x0237] */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x023c A[SYNTHETIC, Splitter:B:193:0x023c] */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x0244 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:208:0x0256 A[SYNTHETIC, Splitter:B:208:0x0256] */
        /* JADX WARNING: Removed duplicated region for block: B:212:0x025b A[SYNTHETIC, Splitter:B:212:0x025b] */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x0260 A[SYNTHETIC, Splitter:B:216:0x0260] */
        /* JADX WARNING: Removed duplicated region for block: B:221:0x0268 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r15 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r15.f1521f
                boolean r0 = r0.get()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                r0 = 0
                r1 = 0
                anetwork.channel.download.DownloadManager r2 = anetwork.channel.download.DownloadManager.this     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.net.URL r3 = r15.f1517b     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                boolean r4 = r15.i     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.io.File r2 = r2.a((java.lang.String) r3, (boolean) r4)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                boolean r3 = r2.exists()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                anetwork.channel.entity.RequestImpl r4 = new anetwork.channel.entity.RequestImpl     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.net.URL r5 = r15.f1517b     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r4.<init>((java.net.URL) r5)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r4.setRetryTime(r0)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r5 = 1
                r4.setFollowRedirects(r5)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                if (r3 == 0) goto L_0x0049
                java.lang.String r5 = "Range"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.lang.String r7 = "bytes="
                r6.<init>(r7)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                long r7 = r2.length()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r6.append(r7)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.lang.String r7 = "-"
                r6.append(r7)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r4.addHeader(r5, r6)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
            L_0x0049:
                anetwork.channel.degrade.DegradableNetwork r5 = new anetwork.channel.degrade.DegradableNetwork     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                anetwork.channel.download.DownloadManager r6 = anetwork.channel.download.DownloadManager.this     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                android.content.Context r6 = r6.f1514d     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                anetwork.channel.aidl.Connection r6 = r5.getConnection(r4, r1)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r15.h = r6     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                anetwork.channel.aidl.Connection r6 = r15.h     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                int r6 = r6.getStatusCode()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                if (r6 <= 0) goto L_0x01f0
                r7 = 416(0x1a0, float:5.83E-43)
                r8 = 200(0xc8, float:2.8E-43)
                if (r6 == r8) goto L_0x006e
                r9 = 206(0xce, float:2.89E-43)
                if (r6 == r9) goto L_0x006e
                if (r6 == r7) goto L_0x006e
                goto L_0x01f0
            L_0x006e:
                if (r3 == 0) goto L_0x009e
                if (r6 != r7) goto L_0x009b
                java.util.List r3 = r4.getHeaders()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r15.a((java.util.List<anetwork.channel.Header>) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.util.concurrent.atomic.AtomicBoolean r3 = r15.f1521f     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                boolean r3 = r3.get()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                if (r3 == 0) goto L_0x0094
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r3 = r0.f1511a
                monitor-enter(r3)
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x0091 }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r0.f1511a     // Catch:{ all -> 0x0091 }
                int r1 = r15.f1516a     // Catch:{ all -> 0x0091 }
                r0.remove(r1)     // Catch:{ all -> 0x0091 }
                monitor-exit(r3)     // Catch:{ all -> 0x0091 }
                return
            L_0x0091:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0091 }
                throw r0
            L_0x0094:
                anetwork.channel.aidl.Connection r3 = r5.getConnection(r4, r1)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r15.h = r3     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r3 = 0
            L_0x009b:
                if (r6 != r8) goto L_0x009e
                r3 = 0
            L_0x009e:
                java.util.concurrent.atomic.AtomicBoolean r4 = r15.f1521f     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                boolean r4 = r4.get()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                if (r4 == 0) goto L_0x00b9
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r4 = r0.f1511a
                monitor-enter(r4)
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x00b6 }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r0.f1511a     // Catch:{ all -> 0x00b6 }
                int r1 = r15.f1516a     // Catch:{ all -> 0x00b6 }
                r0.remove(r1)     // Catch:{ all -> 0x00b6 }
                monitor-exit(r4)     // Catch:{ all -> 0x00b6 }
                return
            L_0x00b6:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00b6 }
                throw r0
            L_0x00b9:
                r4 = 0
                if (r3 != 0) goto L_0x00c9
                java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r7.<init>(r2)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r3.<init>(r7)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r7 = r1
                goto L_0x00e7
            L_0x00c9:
                java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.lang.String r4 = "rw"
                r3.<init>(r2, r4)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                long r4 = r3.length()     // Catch:{ Exception -> 0x01eb, all -> 0x01e6 }
                r3.seek(r4)     // Catch:{ Exception -> 0x01eb, all -> 0x01e6 }
                java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x01eb, all -> 0x01e6 }
                java.nio.channels.FileChannel r8 = r3.getChannel()     // Catch:{ Exception -> 0x01eb, all -> 0x01e6 }
                java.io.OutputStream r8 = java.nio.channels.Channels.newOutputStream(r8)     // Catch:{ Exception -> 0x01eb, all -> 0x01e6 }
                r7.<init>(r8)     // Catch:{ Exception -> 0x01eb, all -> 0x01e6 }
                r14 = r7
                r7 = r3
                r3 = r14
            L_0x00e7:
                anetwork.channel.aidl.Connection r8 = r15.h     // Catch:{ Exception -> 0x01e3, all -> 0x01df }
                java.util.Map r8 = r8.getConnHeadFields()     // Catch:{ Exception -> 0x01e3, all -> 0x01df }
                long r8 = r15.a(r6, r8, r4)     // Catch:{ Exception -> 0x01e3, all -> 0x01df }
                anetwork.channel.aidl.Connection r6 = r15.h     // Catch:{ Exception -> 0x01e3, all -> 0x01df }
                anetwork.channel.aidl.ParcelableInputStream r6 = r6.getInputStream()     // Catch:{ Exception -> 0x01e3, all -> 0x01df }
                if (r6 != 0) goto L_0x0123
                r2 = -103(0xffffffffffffff99, float:NaN)
                java.lang.String r4 = "input stream is null."
                r15.a((int) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x0120 }
                r3.close()     // Catch:{ Exception -> 0x0103 }
            L_0x0103:
                if (r7 == 0) goto L_0x0108
                r7.close()     // Catch:{ Exception -> 0x0108 }
            L_0x0108:
                if (r6 == 0) goto L_0x010d
                r6.close()     // Catch:{ Exception -> 0x010d }
            L_0x010d:
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r0.f1511a
                monitor-enter(r0)
                anetwork.channel.download.DownloadManager r1 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x011d }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r1 = r1.f1511a     // Catch:{ all -> 0x011d }
                int r2 = r15.f1516a     // Catch:{ all -> 0x011d }
                r1.remove(r2)     // Catch:{ all -> 0x011d }
                monitor-exit(r0)     // Catch:{ all -> 0x011d }
                return
            L_0x011d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x011d }
                throw r1
            L_0x0120:
                r2 = move-exception
                goto L_0x021e
            L_0x0123:
                r10 = 2048(0x800, float:2.87E-42)
                byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x0120 }
                r11 = 0
            L_0x0128:
                int r12 = r6.read(r10)     // Catch:{ Exception -> 0x0120 }
                r13 = -1
                if (r12 == r13) goto L_0x0166
                java.util.concurrent.atomic.AtomicBoolean r13 = r15.f1521f     // Catch:{ Exception -> 0x0120 }
                boolean r13 = r13.get()     // Catch:{ Exception -> 0x0120 }
                if (r13 == 0) goto L_0x015c
                anetwork.channel.aidl.Connection r2 = r15.h     // Catch:{ Exception -> 0x0120 }
                r2.cancel()     // Catch:{ Exception -> 0x0120 }
                r3.close()     // Catch:{ Exception -> 0x013f }
            L_0x013f:
                if (r7 == 0) goto L_0x0144
                r7.close()     // Catch:{ Exception -> 0x0144 }
            L_0x0144:
                if (r6 == 0) goto L_0x0149
                r6.close()     // Catch:{ Exception -> 0x0149 }
            L_0x0149:
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r0.f1511a
                monitor-enter(r0)
                anetwork.channel.download.DownloadManager r1 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x0159 }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r1 = r1.f1511a     // Catch:{ all -> 0x0159 }
                int r2 = r15.f1516a     // Catch:{ all -> 0x0159 }
                r1.remove(r2)     // Catch:{ all -> 0x0159 }
                monitor-exit(r0)     // Catch:{ all -> 0x0159 }
                return
            L_0x0159:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0159 }
                throw r1
            L_0x015c:
                int r11 = r11 + r12
                r3.write(r10, r0, r12)     // Catch:{ Exception -> 0x0120 }
                long r12 = (long) r11     // Catch:{ Exception -> 0x0120 }
                long r12 = r12 + r4
                r15.a((long) r12, (long) r8)     // Catch:{ Exception -> 0x0120 }
                goto L_0x0128
            L_0x0166:
                r3.flush()     // Catch:{ Exception -> 0x0120 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r15.f1521f     // Catch:{ Exception -> 0x0120 }
                boolean r4 = r4.get()     // Catch:{ Exception -> 0x0120 }
                if (r4 == 0) goto L_0x0191
                r3.close()     // Catch:{ Exception -> 0x0174 }
            L_0x0174:
                if (r7 == 0) goto L_0x0179
                r7.close()     // Catch:{ Exception -> 0x0179 }
            L_0x0179:
                if (r6 == 0) goto L_0x017e
                r6.close()     // Catch:{ Exception -> 0x017e }
            L_0x017e:
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r4 = r0.f1511a
                monitor-enter(r4)
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x018e }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r0.f1511a     // Catch:{ all -> 0x018e }
                int r1 = r15.f1516a     // Catch:{ all -> 0x018e }
                r0.remove(r1)     // Catch:{ all -> 0x018e }
                monitor-exit(r4)     // Catch:{ all -> 0x018e }
                return
            L_0x018e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x018e }
                throw r0
            L_0x0191:
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0120 }
                java.lang.String r5 = r15.f1519d     // Catch:{ Exception -> 0x0120 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0120 }
                boolean r2 = r2.renameTo(r4)     // Catch:{ Exception -> 0x0120 }
                if (r2 == 0) goto L_0x01a4
                java.lang.String r2 = r15.f1519d     // Catch:{ Exception -> 0x0120 }
                r15.a((java.lang.String) r2)     // Catch:{ Exception -> 0x0120 }
                goto L_0x01be
            L_0x01a4:
                r2 = -106(0xffffffffffffff96, float:NaN)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0120 }
                java.lang.String r5 = "file rename to "
                r4.<init>(r5)     // Catch:{ Exception -> 0x0120 }
                java.lang.String r5 = r15.f1519d     // Catch:{ Exception -> 0x0120 }
                r4.append(r5)     // Catch:{ Exception -> 0x0120 }
                java.lang.String r5 = " failed"
                r4.append(r5)     // Catch:{ Exception -> 0x0120 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0120 }
                r15.a((int) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x0120 }
            L_0x01be:
                r3.close()     // Catch:{ Exception -> 0x01c1 }
            L_0x01c1:
                if (r7 == 0) goto L_0x01c6
                r7.close()     // Catch:{ Exception -> 0x01c6 }
            L_0x01c6:
                if (r6 == 0) goto L_0x01cb
                r6.close()     // Catch:{ Exception -> 0x01cb }
            L_0x01cb:
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r0.f1511a
                monitor-enter(r0)
                anetwork.channel.download.DownloadManager r1 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x01dc }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r1 = r1.f1511a     // Catch:{ all -> 0x01dc }
                int r2 = r15.f1516a     // Catch:{ all -> 0x01dc }
                r1.remove(r2)     // Catch:{ all -> 0x01dc }
                monitor-exit(r0)     // Catch:{ all -> 0x01dc }
                goto L_0x024e
            L_0x01dc:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01dc }
                throw r1
            L_0x01df:
                r0 = move-exception
                r6 = r1
                goto L_0x0253
            L_0x01e3:
                r2 = move-exception
                r6 = r1
                goto L_0x021e
            L_0x01e6:
                r0 = move-exception
                r6 = r1
                r7 = r3
                goto L_0x0254
            L_0x01eb:
                r2 = move-exception
                r6 = r1
                r7 = r3
                r3 = r6
                goto L_0x021e
            L_0x01f0:
                r2 = -102(0xffffffffffffff9a, float:NaN)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.lang.String r4 = "ResponseCode:"
                r3.<init>(r4)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r3.append(r6)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                r15.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0216 }
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r0.f1511a
                monitor-enter(r0)
                anetwork.channel.download.DownloadManager r1 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x0213 }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r1 = r1.f1511a     // Catch:{ all -> 0x0213 }
                int r2 = r15.f1516a     // Catch:{ all -> 0x0213 }
                r1.remove(r2)     // Catch:{ all -> 0x0213 }
                monitor-exit(r0)     // Catch:{ all -> 0x0213 }
                return
            L_0x0213:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0213 }
                throw r1
            L_0x0216:
                r0 = move-exception
                r6 = r1
                r7 = r6
                goto L_0x0254
            L_0x021a:
                r2 = move-exception
                r3 = r1
                r6 = r3
                r7 = r6
            L_0x021e:
                java.lang.String r4 = "anet.DownloadManager"
                java.lang.String r5 = "file download failed!"
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0252 }
                anet.channel.util.ALog.e(r4, r5, r1, r2, r0)     // Catch:{ all -> 0x0252 }
                r0 = -104(0xffffffffffffff98, float:NaN)
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0252 }
                r15.a((int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0252 }
                if (r3 == 0) goto L_0x0235
                r3.close()     // Catch:{ Exception -> 0x0235 }
            L_0x0235:
                if (r7 == 0) goto L_0x023a
                r7.close()     // Catch:{ Exception -> 0x023a }
            L_0x023a:
                if (r6 == 0) goto L_0x023f
                r6.close()     // Catch:{ Exception -> 0x023f }
            L_0x023f:
                anetwork.channel.download.DownloadManager r0 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r0.f1511a
                monitor-enter(r0)
                anetwork.channel.download.DownloadManager r1 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x024f }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r1 = r1.f1511a     // Catch:{ all -> 0x024f }
                int r2 = r15.f1516a     // Catch:{ all -> 0x024f }
                r1.remove(r2)     // Catch:{ all -> 0x024f }
                monitor-exit(r0)     // Catch:{ all -> 0x024f }
            L_0x024e:
                return
            L_0x024f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x024f }
                throw r1
            L_0x0252:
                r0 = move-exception
            L_0x0253:
                r1 = r3
            L_0x0254:
                if (r1 == 0) goto L_0x0259
                r1.close()     // Catch:{ Exception -> 0x0259 }
            L_0x0259:
                if (r7 == 0) goto L_0x025e
                r7.close()     // Catch:{ Exception -> 0x025e }
            L_0x025e:
                if (r6 == 0) goto L_0x0263
                r6.close()     // Catch:{ Exception -> 0x0263 }
            L_0x0263:
                anetwork.channel.download.DownloadManager r1 = anetwork.channel.download.DownloadManager.this
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r1 = r1.f1511a
                monitor-enter(r1)
                anetwork.channel.download.DownloadManager r2 = anetwork.channel.download.DownloadManager.this     // Catch:{ all -> 0x0273 }
                android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r2 = r2.f1511a     // Catch:{ all -> 0x0273 }
                int r3 = r15.f1516a     // Catch:{ all -> 0x0273 }
                r2.remove(r3)     // Catch:{ all -> 0x0273 }
                monitor-exit(r1)     // Catch:{ all -> 0x0273 }
                throw r0
            L_0x0273:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0273 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.download.DownloadManager.b.run():void");
        }

        private String a(URL url) {
            String str;
            String path = url.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            if (lastIndexOf != -1) {
                str = path.substring(lastIndexOf + 1, path.length());
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String md5ToHex = StringUtils.md5ToHex(url.toString());
            if (md5ToHex == null) {
                return url.getFile();
            }
            return md5ToHex;
        }

        private void a(String str) {
            if (this.g.compareAndSet(false, true)) {
                Iterator<DownloadListener> it2 = this.f1520e.iterator();
                while (it2.hasNext()) {
                    it2.next().onSuccess(this.f1516a, str);
                }
            }
        }

        private void a(List<Header> list) {
            if (list != null) {
                ListIterator<Header> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if ("Range".equalsIgnoreCase(listIterator.next().getName())) {
                        listIterator.remove();
                        return;
                    }
                }
            }
        }

        public boolean a(DownloadListener downloadListener) {
            if (this.g.get()) {
                return false;
            }
            this.f1520e.add(downloadListener);
            return true;
        }

        private void a(int i2, String str) {
            if (this.g.compareAndSet(false, true)) {
                Iterator<DownloadListener> it2 = this.f1520e.iterator();
                while (it2.hasNext()) {
                    it2.next().onFail(this.f1516a, i2, str);
                }
            }
        }

        private void a(long j, long j2) {
            if (!this.g.get()) {
                Iterator<DownloadListener> it2 = this.f1520e.iterator();
                while (it2.hasNext()) {
                    it2.next().onProgress(this.f1516a, j, j2);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long a(int r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, long r8) {
            /*
                r5 = this;
                r0 = 200(0xc8, float:2.8E-43)
                r1 = 0
                if (r6 != r0) goto L_0x0011
                java.lang.String r6 = "Content-Length"
                java.lang.String r6 = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r7, r6)     // Catch:{ Exception -> 0x0046 }
                long r6 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x0046 }
                goto L_0x0047
            L_0x0011:
                r0 = 206(0xce, float:2.89E-43)
                if (r6 != r0) goto L_0x0046
                java.lang.String r6 = "Content-Range"
                java.lang.String r6 = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r7, r6)     // Catch:{ Exception -> 0x0046 }
                if (r6 == 0) goto L_0x0031
                r0 = 47
                int r0 = r6.lastIndexOf(r0)     // Catch:{ Exception -> 0x0046 }
                r3 = -1
                if (r0 == r3) goto L_0x0031
                int r0 = r0 + 1
                java.lang.String r6 = r6.substring(r0)     // Catch:{ Exception -> 0x0046 }
                long r3 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x0046 }
                goto L_0x0032
            L_0x0031:
                r3 = r1
            L_0x0032:
                int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r6 != 0) goto L_0x0044
                java.lang.String r6 = "Content-Length"
                java.lang.String r6 = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r7, r6)     // Catch:{ Exception -> 0x0044 }
                long r6 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x0044 }
                r0 = 0
                long r1 = r6 + r8
                goto L_0x0046
            L_0x0044:
                r6 = r3
                goto L_0x0047
            L_0x0046:
                r6 = r1
            L_0x0047:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.download.DownloadManager.b.a(int, java.util.Map, long):long");
        }

        b(URL url, String str, String str2, DownloadListener downloadListener) {
            this.f1516a = DownloadManager.this.f1512b.getAndIncrement();
            this.f1517b = url;
            str2 = TextUtils.isEmpty(str2) ? a(url) : str2;
            if (TextUtils.isEmpty(str)) {
                this.f1519d = DownloadManager.this.b(str2);
            } else {
                if (str.endsWith("/")) {
                    this.f1519d = str + str2;
                } else {
                    this.f1519d = str + '/' + str2;
                }
                if (str.startsWith("/data/user") || str.startsWith("/data/data")) {
                    this.i = false;
                }
            }
            this.f1520e = new CopyOnWriteArrayList<>();
            this.f1520e.add(downloadListener);
        }
    }

    public static DownloadManager getInstance() {
        return a.f1515a;
    }

    private void a() {
        if (this.f1514d != null) {
            File file = new File(this.f1514d.getExternalFilesDir(null), "downloads");
            if (!file.exists()) {
                file.mkdir();
            }
        }
    }

    private DownloadManager() {
        this.f1511a = new SparseArray<>(6);
        this.f1512b = new AtomicInteger(0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f1513c = threadPoolExecutor;
        this.f1514d = null;
        this.f1514d = NetworkSdkSetting.getContext();
        this.f1513c.allowCoreThreadTimeOut(true);
        a();
    }

    /* access modifiers changed from: private */
    public String b(String str) {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f1514d.getExternalFilesDir(null));
        sb.append("/downloads");
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    private boolean a(String str) {
        if (this.f1514d != null) {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    return file.mkdir();
                }
                return true;
            } catch (Exception unused) {
                ALog.e("anet.DownloadManager", "create folder failed", null, "folder", str);
            }
        }
        return false;
    }

    public void cancel(int i) {
        synchronized (this.f1511a) {
            b bVar = this.f1511a.get(i);
            if (bVar != null) {
                if (ALog.isPrintLog(2)) {
                    ALog.i("anet.DownloadManager", "try cancel task" + i + " url=" + bVar.f1517b.toString(), null, new Object[0]);
                }
                this.f1511a.remove(i);
                bVar.a();
            }
        }
    }

    /* access modifiers changed from: private */
    public File a(String str, boolean z) {
        String md5ToHex = StringUtils.md5ToHex(str);
        if (md5ToHex != null) {
            str = md5ToHex;
        }
        if (z) {
            return new File(this.f1514d.getExternalCacheDir(), str);
        }
        return new File(this.f1514d.getCacheDir(), str);
    }

    public int enqueue(String str, String str2, DownloadListener downloadListener) {
        return enqueue(str, null, str2, downloadListener);
    }

    public int enqueue(String str, String str2, String str3, DownloadListener downloadListener) {
        int i = 0;
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.DownloadManager", "enqueue", null, "folder", str2, "filename", str3, PushConstants.WEB_URL, str);
        }
        if (this.f1514d == null) {
            ALog.e("anet.DownloadManager", "network sdk not initialized.", null, new Object[0]);
            return -1;
        }
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(str2) || a(str2)) {
                synchronized (this.f1511a) {
                    int size = this.f1511a.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        b valueAt = this.f1511a.valueAt(i);
                        if (!url.equals(valueAt.f1517b)) {
                            i++;
                        } else if (valueAt.a(downloadListener)) {
                            int i2 = valueAt.f1516a;
                            return i2;
                        }
                    }
                    b bVar = new b(url, str2, str3, downloadListener);
                    this.f1511a.put(bVar.f1516a, bVar);
                    this.f1513c.submit(bVar);
                    int i3 = bVar.f1516a;
                    return i3;
                }
            }
            ALog.e("anet.DownloadManager", "file folder invalid.", null, new Object[0]);
            if (downloadListener != null) {
                downloadListener.onFail(-1, -101, "file folder path invalid");
            }
            return -1;
        } catch (MalformedURLException e2) {
            ALog.e("anet.DownloadManager", "url invalid.", null, e2, new Object[0]);
            if (downloadListener != null) {
                downloadListener.onFail(-1, -100, "url invalid");
            }
            return -1;
        }
    }
}
