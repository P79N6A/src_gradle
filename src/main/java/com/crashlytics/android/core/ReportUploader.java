package com.crashlytics.android.core;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.fabric.sdk.android.services.b.h;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ReportUploader {
    static final Map<String, String> HEADER_INVALID_CLS_FILE = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
    public static final short[] RETRY_INTERVALS = {10, 20, 30, 60, 120, 300};
    private final String apiKey;
    private final CreateReportSpiCall createReportCall;
    private final Object fileAccessLock = new Object();
    public final HandlingExceptionCheck handlingExceptionCheck;
    private final ReportFilesProvider reportFilesProvider;
    public Thread uploadThread;

    static final class AlwaysSendCheck implements SendCheck {
        public final boolean canSendReports() {
            return true;
        }

        AlwaysSendCheck() {
        }
    }

    interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    interface ReportFilesProvider {
        File[] getCompleteSessionFiles();

        File[] getInvalidSessionFiles();

        File[] getNativeReportFiles();
    }

    interface SendCheck {
        boolean canSendReports();
    }

    class Worker extends h {
        private final float delay;
        private final SendCheck sendCheck;

        public void onRun() {
            try {
                attemptUploadWithRetry();
            } catch (Exception unused) {
            }
            ReportUploader.this.uploadThread = null;
        }

        private void attemptUploadWithRetry() {
            StringBuilder sb = new StringBuilder("Starting report processing in ");
            sb.append(this.delay);
            sb.append(" second(s)...");
            if (this.delay > 0.0f) {
                try {
                    Thread.sleep((long) (this.delay * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<Report> findReports = ReportUploader.this.findReports();
            if (!ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                if (findReports.isEmpty() || this.sendCheck.canSendReports()) {
                    int i = 0;
                    while (!findReports.isEmpty() && !ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                        StringBuilder sb2 = new StringBuilder("Attempting to send ");
                        sb2.append(findReports.size());
                        sb2.append(" report(s)");
                        for (Report forceUpload : findReports) {
                            ReportUploader.this.forceUpload(forceUpload);
                        }
                        findReports = ReportUploader.this.findReports();
                        if (!findReports.isEmpty()) {
                            int i2 = i + 1;
                            long j = (long) ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
                            StringBuilder sb3 = new StringBuilder("Report submisson: scheduling delayed retry in ");
                            sb3.append(j);
                            sb3.append(" seconds");
                            try {
                                Thread.sleep(j * 1000);
                                i = i2;
                            } catch (InterruptedException unused2) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    }
                    return;
                }
                StringBuilder sb4 = new StringBuilder("User declined to send. Removing ");
                sb4.append(findReports.size());
                sb4.append(" Report(s).");
                for (Report remove : findReports) {
                    remove.remove();
                }
            }
        }

        Worker(float f2, SendCheck sendCheck2) {
            this.delay = f2;
            this.sendCheck = sendCheck2;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isUploading() {
        if (this.uploadThread != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public List<Report> findReports() {
        File[] completeSessionFiles;
        File[] invalidSessionFiles;
        File[] nativeReportFiles;
        synchronized (this.fileAccessLock) {
            completeSessionFiles = this.reportFilesProvider.getCompleteSessionFiles();
            invalidSessionFiles = this.reportFilesProvider.getInvalidSessionFiles();
            nativeReportFiles = this.reportFilesProvider.getNativeReportFiles();
        }
        LinkedList linkedList = new LinkedList();
        if (completeSessionFiles != null) {
            for (File file : completeSessionFiles) {
                new StringBuilder("Found crash report ").append(file.getPath());
                linkedList.add(new SessionReport(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (invalidSessionFiles != null) {
            for (File file2 : invalidSessionFiles) {
                String sessionIdFromSessionFile = CrashlyticsController.getSessionIdFromSessionFile(file2);
                if (!hashMap.containsKey(sessionIdFromSessionFile)) {
                    hashMap.put(sessionIdFromSessionFile, new LinkedList());
                }
                ((List) hashMap.get(sessionIdFromSessionFile)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            new StringBuilder("Found invalid session: ").append(str);
            List list = (List) hashMap.get(str);
            linkedList.add(new InvalidSessionReport(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (nativeReportFiles != null) {
            for (File nativeSessionReport : nativeReportFiles) {
                linkedList.add(new NativeSessionReport(nativeSessionReport));
            }
        }
        linkedList.isEmpty();
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        new java.lang.StringBuilder("Error occurred sending report ").append(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean forceUpload(com.crashlytics.android.core.Report r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.fileAccessLock
            monitor-enter(r0)
            r1 = 0
            com.crashlytics.android.core.CreateReportRequest r2 = new com.crashlytics.android.core.CreateReportRequest     // Catch:{ Exception -> 0x0033 }
            java.lang.String r3 = r5.apiKey     // Catch:{ Exception -> 0x0033 }
            r2.<init>(r3, r6)     // Catch:{ Exception -> 0x0033 }
            com.crashlytics.android.core.CreateReportSpiCall r3 = r5.createReportCall     // Catch:{ Exception -> 0x0033 }
            boolean r2 = r3.invoke(r2)     // Catch:{ Exception -> 0x0033 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0033 }
            java.lang.String r4 = "Crashlytics report upload "
            r3.<init>(r4)     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x001d
            java.lang.String r4 = "complete: "
            goto L_0x001f
        L_0x001d:
            java.lang.String r4 = "FAILED: "
        L_0x001f:
            r3.append(r4)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r4 = r6.getIdentifier()     // Catch:{ Exception -> 0x0033 }
            r3.append(r4)     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x003d
            r6.remove()     // Catch:{ Exception -> 0x0033 }
            r6 = 1
            r1 = 1
            goto L_0x003d
        L_0x0031:
            r6 = move-exception
            goto L_0x003f
        L_0x0033:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "Error occurred sending report "
            r2.<init>(r3)     // Catch:{ all -> 0x0031 }
            r2.append(r6)     // Catch:{ all -> 0x0031 }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r1
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.ReportUploader.forceUpload(com.crashlytics.android.core.Report):boolean");
    }

    public synchronized void uploadReports(float f2, SendCheck sendCheck) {
        if (this.uploadThread == null) {
            this.uploadThread = new Thread(new Worker(f2, sendCheck), "Crashlytics Report Uploader");
            this.uploadThread.start();
        }
    }

    public ReportUploader(String str, CreateReportSpiCall createReportSpiCall, ReportFilesProvider reportFilesProvider2, HandlingExceptionCheck handlingExceptionCheck2) {
        if (createReportSpiCall != null) {
            this.createReportCall = createReportSpiCall;
            this.apiKey = str;
            this.reportFilesProvider = reportFilesProvider2;
            this.handlingExceptionCheck = handlingExceptionCheck2;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }
}
