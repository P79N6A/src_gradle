package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.CrashPromptDialog;
import com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler;
import com.crashlytics.android.core.LogFileManager;
import com.crashlytics.android.core.ReportUploader;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.b.j;
import io.fabric.sdk.android.services.b.l;
import io.fabric.sdk.android.services.b.m;
import io.fabric.sdk.android.services.b.s;
import io.fabric.sdk.android.services.d.e;
import io.fabric.sdk.android.services.e.a;
import io.fabric.sdk.android.services.f.o;
import io.fabric.sdk.android.services.f.p;
import io.fabric.sdk.android.services.f.q;
import io.fabric.sdk.android.services.f.t;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

public class CrashlyticsController {
    private static final String[] INITIAL_SESSION_PART_TAGS = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    static final Comparator<File> LARGEST_FILE_NAME_FIRST = new Comparator<File>() {
        public final int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    private static final Map<String, String> SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
    static final FilenameFilter SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter("BeginSession") {
        public final boolean accept(File file, String str) {
            if (!super.accept(file, str) || !str.endsWith(".cls")) {
                return false;
            }
            return true;
        }
    };
    static final FileFilter SESSION_DIRECTORY_FILTER = new FileFilter() {
        public final boolean accept(File file) {
            if (!file.isDirectory() || file.getName().length() != 35) {
                return false;
            }
            return true;
        }
    };
    static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {
        public final boolean accept(File file, String str) {
            if (str.length() != 39 || !str.endsWith(".cls")) {
                return false;
            }
            return true;
        }
    };
    public static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    static final Comparator<File> SMALLEST_FILE_NAME_FIRST = new Comparator<File>() {
        public final int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    public final AppData appData;
    private final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    public final CrashlyticsCore crashlyticsCore;
    private final DevicePowerStateListener devicePowerStateListener;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final a fileStore;
    private final EventLogger firebaseAnalyticsLogger;
    private final ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
    private final e httpRequestFactory;
    private final s idManager;
    private final LogFileDirectoryProvider logFileDirectoryProvider;
    public final LogFileManager logFileManager;
    private final PreferenceManager preferenceManager;
    private final ReportUploader.ReportFilesProvider reportFilesProvider;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    public final String unityVersion;

    static class AnySessionPartFileFilter implements FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            if (CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) || !CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches()) {
                return false;
            }
            return true;
        }
    }

    interface CodedOutputStreamWriteAction {
        void writeTo(CodedOutputStream codedOutputStream) throws Exception;
    }

    static final class DefaultSettingsDataProvider implements CrashlyticsUncaughtExceptionHandler.SettingsDataProvider {
        private DefaultSettingsDataProvider() {
        }

        public final t getSettingsData() {
            return q.a().b();
        }
    }

    static class FileNameContainsFilter implements FilenameFilter {
        private final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        public boolean accept(File file, String str) {
            if (!str.contains(this.string) || str.endsWith(".cls_temp")) {
                return false;
            }
            return true;
        }
    }

    interface FileOutputStreamWriteAction {
        void writeTo(FileOutputStream fileOutputStream) throws Exception;
    }

    static class InvalidPartFileFilter implements FilenameFilter {
        InvalidPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            if (ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) || str.contains("SessionMissingBinaryImages")) {
                return true;
            }
            return false;
        }
    }

    static final class LogFileDirectoryProvider implements LogFileManager.DirectoryProvider {
        private final a rootFileStore;

        public final File getLogFileDir() {
            File file = new File(this.rootFileStore.a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }

        public LogFileDirectoryProvider(a aVar) {
            this.rootFileStore = aVar;
        }
    }

    static final class PrivacyDialogCheck implements ReportUploader.SendCheck {
        private final i kit;
        public final PreferenceManager preferenceManager;
        private final o promptData;

        public final boolean canSendReports() {
            Activity activity;
            c cVar = this.kit.fabric;
            if (cVar.g != null) {
                activity = (Activity) cVar.g.get();
            } else {
                activity = null;
            }
            if (activity == null || activity.isFinishing()) {
                return true;
            }
            final CrashPromptDialog create = CrashPromptDialog.create(activity, this.promptData, new CrashPromptDialog.AlwaysSendCallback() {
                public void sendUserReportsWithoutPrompting(boolean z) {
                    PrivacyDialogCheck.this.preferenceManager.setShouldAlwaysSendReports(z);
                }
            });
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    create.show();
                }
            });
            create.await();
            return create.getOptIn();
        }

        public PrivacyDialogCheck(i iVar, PreferenceManager preferenceManager2, o oVar) {
            this.kit = iVar;
            this.preferenceManager = preferenceManager2;
            this.promptData = oVar;
        }
    }

    final class ReportUploaderFilesProvider implements ReportUploader.ReportFilesProvider {
        public final File[] getCompleteSessionFiles() {
            return CrashlyticsController.this.listCompleteSessionFiles();
        }

        public final File[] getNativeReportFiles() {
            return CrashlyticsController.this.listNativeSessionFileDirectories();
        }

        public final File[] getInvalidSessionFiles() {
            return CrashlyticsController.this.getInvalidFilesDir().listFiles();
        }

        private ReportUploaderFilesProvider() {
        }
    }

    final class ReportUploaderHandlingExceptionCheck implements ReportUploader.HandlingExceptionCheck {
        public final boolean isHandlingException() {
            return CrashlyticsController.this.isHandlingException();
        }

        private ReportUploaderHandlingExceptionCheck() {
        }
    }

    static final class SendReportRunnable implements Runnable {
        private final Context context;
        private final Report report;
        private final ReportUploader reportUploader;

        public final void run() {
            if (io.fabric.sdk.android.services.b.i.j(this.context)) {
                this.reportUploader.forceUpload(this.report);
            }
        }

        public SendReportRunnable(Context context2, Report report2, ReportUploader reportUploader2) {
            this.context = context2;
            this.report = report2;
            this.reportUploader = reportUploader2;
        }
    }

    static class SessionPartFileFilter implements FilenameFilter {
        private final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        public boolean accept(File file, String str) {
            if (!str.equals(this.sessionId + ".cls") && str.contains(this.sessionId) && !str.endsWith(".cls_temp")) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public File getFilesDir() {
        return this.fileStore.a();
    }

    /* access modifiers changed from: package-private */
    public File[] listNativeSessionFileDirectories() {
        return listFilesMatching(SESSION_DIRECTORY_FILTER);
    }

    /* access modifiers changed from: package-private */
    public File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    /* access modifiers changed from: package-private */
    public void registerDevicePowerStateListener() {
        this.devicePowerStateListener.initialize();
    }

    private boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    /* access modifiers changed from: package-private */
    public void cleanInvalidTempFiles() {
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                CrashlyticsController.this.doCleanInvalidTempFiles(CrashlyticsController.this.listFilesMatching((FilenameFilter) new InvalidPartFileFilter()));
            }
        });
    }

    /* access modifiers changed from: package-private */
    public File getFatalSessionFilesDir() {
        return new File(getFilesDir(), "fatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public File getInvalidFilesDir() {
        return new File(getFilesDir(), "invalidClsFiles");
    }

    /* access modifiers changed from: package-private */
    public File getNonFatalSessionFilesDir() {
        return new File(getFilesDir(), "nonfatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public boolean hasOpenSession() {
        if (listSessionBeginFiles().length > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isHandlingException() {
        if (this.crashHandler == null || !this.crashHandler.isHandlingException()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void openSession() {
        this.backgroundWorker.submit((Callable<T>) new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    public String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 0) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]);
        }
        return null;
    }

    public String getPreviousSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 1) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[1]);
        }
        return null;
    }

    private void trimInvalidSessionFiles() {
        File invalidFilesDir = getInvalidFilesDir();
        if (invalidFilesDir.exists()) {
            File[] listFilesMatching = listFilesMatching(invalidFilesDir, new InvalidPartFileFilter());
            Arrays.sort(listFilesMatching, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i = 0; i < listFilesMatching.length && hashSet.size() < 4; i++) {
                hashSet.add(getSessionIdFromSessionFile(listFilesMatching[i]));
            }
            retainSessions(listFiles(invalidFilesDir), hashSet);
        }
    }

    public void doOpenSession() throws Exception {
        Date date = new Date();
        String clsuuid = new CLSUUID(this.idManager).toString();
        new StringBuilder("Opening a new session with ID ").append(clsuuid);
        writeBeginSession(clsuuid, date);
        writeSessionApp(clsuuid);
        writeSessionOS(clsuuid);
        writeSessionDevice(clsuuid);
        this.logFileManager.setCurrentSession(clsuuid);
    }

    /* access modifiers changed from: package-private */
    public File[] listCompleteSessionFiles() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getFilesDir(), SESSION_FILE_FILTER));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream != null) {
            try {
                clsFileOutputStream.closeInProgressStream();
            } catch (IOException unused) {
            }
        }
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        if (fileArr == null) {
            return new File[0];
        }
        return fileArr;
    }

    /* access modifiers changed from: package-private */
    public void doCloseSessions(p pVar) throws Exception {
        doCloseSessions(pVar, false);
    }

    static String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    private File[] listFiles(File file) {
        return ensureFileArrayNotNull(file.listFiles());
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching((FilenameFilter) new SessionPartFileFilter(str));
    }

    private void writeSessionUser(String str) throws Exception {
        final UserMetaData userMetaData = getUserMetaData(str);
        writeSessionPartFile(str, "SessionUser", new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetaData.id, userMetaData.name, userMetaData.email);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void cacheKeyData(final Map<String, String> map) {
        this.backgroundWorker.submit((Callable<T>) new Callable<Void>() {
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeKeyData(CrashlyticsController.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File delete : listSessionPartFilesFor(str)) {
            delete.delete();
        }
    }

    private File[] listFilesMatching(FileFilter fileFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(fileFilter));
    }

    private void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File recursiveDelete : file.listFiles()) {
                recursiveDelete(recursiveDelete);
            }
        }
        file.delete();
    }

    private void writeSessionOS(String str) throws Exception {
        final boolean d2 = io.fabric.sdk.android.services.b.i.d(this.crashlyticsCore.context);
        writeSessionPartFile(str, "SessionOS", new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionOS(codedOutputStream, Build.VERSION.RELEASE, Build.VERSION.CODENAME, d2);
            }
        });
        writeFile(str, "SessionOS.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("version", Build.VERSION.RELEASE);
                        put("build_version", Build.VERSION.CODENAME);
                        put("is_rooted", Boolean.valueOf(d2));
                    }
                }).toString().getBytes());
            }
        });
    }

    /* access modifiers changed from: package-private */
    public boolean finalizeNativeReport(final CrashlyticsNdkData crashlyticsNdkData) {
        if (crashlyticsNdkData == null) {
            return true;
        }
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                TreeSet<File> treeSet = crashlyticsNdkData.timestampedDirectories;
                String previousSessionId = CrashlyticsController.this.getPreviousSessionId();
                if (previousSessionId != null && !treeSet.isEmpty()) {
                    File first = treeSet.first();
                    if (first != null) {
                        CrashlyticsController.this.finalizeMostRecentNativeCrash(CrashlyticsController.this.crashlyticsCore.context, first, previousSessionId);
                    }
                }
                CrashlyticsController.this.recursiveDelete((Set<File>) treeSet);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean finalizeSessions(final p pVar) {
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                if (CrashlyticsController.this.isHandlingException()) {
                    return Boolean.FALSE;
                }
                CrashlyticsController.this.doCloseSessions(pVar, true);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void registerAnalyticsEventListener(t tVar) {
        if (tVar.f83356d.f83331e) {
            new StringBuilder("Registered Firebase Analytics event listener for breadcrumbs: ").append(this.appMeasurementEventListenerRegistrar.register());
        }
    }

    public boolean shouldPromptUserBeforeSendingCrashReports(t tVar) {
        if (tVar != null && tVar.f83356d.f83327a && !this.preferenceManager.shouldAlwaysSendReports()) {
            return true;
        }
        return false;
    }

    private UserMetaData getUserMetaData(String str) {
        if (isHandlingException()) {
            return new UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail());
        }
        return new MetaDataStore(getFilesDir()).readUserData(str);
    }

    private void trimOpenSessions(int i) {
        HashSet hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int min = Math.min(i, listSortedSessionBeginFiles.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i2]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching((FilenameFilter) new AnySessionPartFileFilter()), hashSet);
    }

    private void writeSessionApp(String str) throws Exception {
        String str2 = this.idManager.f83194b;
        String str3 = this.appData.versionCode;
        String str4 = this.appData.versionName;
        final String str5 = str2;
        final String str6 = str3;
        final String str7 = str4;
        final String a2 = this.idManager.a();
        final int id = m.determineFrom(this.appData.installerPackageName).getId();
        AnonymousClass19 r1 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionApp(codedOutputStream, str5, CrashlyticsController.this.appData.apiKey, str6, str7, a2, id, CrashlyticsController.this.unityVersion);
            }
        };
        writeSessionPartFile(str, "SessionApp", r1);
        AnonymousClass20 r12 = new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        String str;
                        put("app_identifier", str5);
                        put("api_key", CrashlyticsController.this.appData.apiKey);
                        put("version_code", str6);
                        put("version_name", str7);
                        put("install_uuid", a2);
                        put("delivery_mechanism", Integer.valueOf(id));
                        if (TextUtils.isEmpty(CrashlyticsController.this.unityVersion)) {
                            str = "";
                        } else {
                            str = CrashlyticsController.this.unityVersion;
                        }
                        put("unity_version", str);
                    }
                }).toString().getBytes());
            }
        };
        writeFile(str, "SessionApp.json", r12);
    }

    public File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    public void recordFatalFirebaseEvent(long j) {
        if (!firebaseCrashExists() && this.firebaseAnalyticsLogger != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j);
            this.firebaseAnalyticsLogger.logEvent("clx", "_ae", bundle);
        }
    }

    public void recursiveDelete(Set<File> set) {
        for (File recursiveDelete : set) {
            recursiveDelete(recursiveDelete);
        }
    }

    public void sendSessionReports(t tVar) {
        if (tVar != null) {
            Context context = this.crashlyticsCore.context;
            ReportUploader reportUploader = new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(tVar.f83353a.f83315d, tVar.f83353a.f83316e), this.reportFilesProvider, this.handlingExceptionCheck);
            for (File sessionReport : listCompleteSessionFiles()) {
                this.backgroundWorker.submit((Runnable) new SendReportRunnable(context, new SessionReport(sessionReport, SEND_AT_CRASHTIME_HEADER), reportUploader));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void trimSessionFiles(int i) {
        int capFileCount = i - Utils.capFileCount(getFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, capFileCount - Utils.capFileCount(getNonFatalSessionFilesDir(), capFileCount, SMALLEST_FILE_NAME_FIRST), SMALLEST_FILE_NAME_FIRST);
    }

    /* access modifiers changed from: package-private */
    public void doCleanInvalidTempFiles(File[] fileArr) {
        final HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            new StringBuilder("Found invalid session part file: ").append(file);
            hashSet.add(getSessionIdFromSessionFile(file));
        }
        if (!hashSet.isEmpty()) {
            File invalidFilesDir = getInvalidFilesDir();
            if (!invalidFilesDir.exists()) {
                invalidFilesDir.mkdir();
            }
            for (File file2 : listFilesMatching((FilenameFilter) new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                new StringBuilder("Moving session file: ").append(file2);
                if (!file2.renameTo(new File(invalidFilesDir, file2.getName()))) {
                    new StringBuilder("Could not move session file. Deleting ").append(file2);
                    file2.delete();
                }
            }
            trimInvalidSessionFiles();
        }
    }

    private void writeSessionDevice(String str) throws Exception {
        boolean z;
        boolean z2;
        String str2 = str;
        Context context = this.crashlyticsCore.context;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int ordinal = i.a.getValue().ordinal();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a2 = io.fabric.sdk.android.services.b.i.a();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean c2 = io.fabric.sdk.android.services.b.i.c(context);
        Map<s.a, String> e2 = this.idManager.e();
        boolean c3 = io.fabric.sdk.android.services.b.i.c(context);
        if (io.fabric.sdk.android.services.b.i.d(context)) {
            c3 |= true;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z2 = c3 | true;
        } else {
            z2 = c3;
        }
        final int i = ordinal;
        final int i2 = availableProcessors;
        final long j = a2;
        final long j2 = blockCount;
        final boolean z3 = c2;
        long j3 = a2;
        AnonymousClass23 r15 = r0;
        final Map<s.a, String> map = e2;
        final boolean z4 = z2;
        final int i3 = z4 ? 1 : 0;
        AnonymousClass23 r0 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionDevice(codedOutputStream, i, Build.MODEL, i2, j, j2, z3, map, i3, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        writeSessionPartFile(str2, "SessionDevice", r15);
        final int i4 = availableProcessors;
        final long j4 = j3;
        AnonymousClass24 r02 = new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("arch", Integer.valueOf(i));
                        put("build_model", Build.MODEL);
                        put("available_processors", Integer.valueOf(i4));
                        put("total_ram", Long.valueOf(j4));
                        put("disk_space", Long.valueOf(j2));
                        put("is_emulator", Boolean.valueOf(z3));
                        put("ids", map);
                        put("state", Integer.valueOf(z4));
                        put("build_manufacturer", Build.MANUFACTURER);
                        put("build_product", Build.PRODUCT);
                    }
                }).toString().getBytes());
            }
        };
        writeFile(str2, "SessionDevice.json", r02);
    }

    private void gzipIfNotEmpty(byte[] bArr, File file) throws IOException {
        if (bArr != null && bArr.length > 0) {
            gzip(bArr, file);
        }
    }

    private File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    /* access modifiers changed from: package-private */
    public void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.doWriteNonFatal(date, thread, th);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit((Callable<T>) new Callable<Void>() {
            public Void call() throws Exception {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.logFileManager.writeToLog(j, str);
                }
                return null;
            }
        });
    }

    private void gzip(byte[] bArr, File file) throws IOException {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                io.fabric.sdk.android.services.b.i.a((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                io.fabric.sdk.android.services.b.i.a((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            io.fabric.sdk.android.services.b.i.a((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    private byte[] readFile(String str, String str2) {
        File filesDir = getFilesDir();
        return NativeFileUtils.readFile(new File(filesDir, str + str2));
    }

    private static void recordFatalExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) c.a(Answers.class);
        if (answers != null) {
            answers.onException(new j.a(str, str2));
        }
    }

    private static void recordLoggedExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) c.a(Answers.class);
        if (answers != null) {
            answers.onException(new j.b(str, str2));
        }
    }

    private void trimSessionEventFiles(String str, int i) {
        File filesDir = getFilesDir();
        Utils.capFileCount(filesDir, new FileNameContainsFilter(str + "SessionEvent"), i, SMALLEST_FILE_NAME_FIRST);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doCloseSessions(io.fabric.sdk.android.services.f.p r3, boolean r4) throws java.lang.Exception {
        /*
            r2 = this;
            int r0 = r4 + 8
            r2.trimOpenSessions(r0)
            java.io.File[] r0 = r2.listSortedSessionBeginFiles()
            int r1 = r0.length
            if (r1 > r4) goto L_0x000d
            return
        L_0x000d:
            r1 = r0[r4]
            java.lang.String r1 = getSessionIdFromSessionFile(r1)
            r2.writeSessionUser(r1)
            if (r3 != 0) goto L_0x0019
            return
        L_0x0019:
            int r3 = r3.f83344c
            r2.closeOpenSessions(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.doCloseSessions(io.fabric.sdk.android.services.f.p, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        openSession();
        this.crashHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() {
            public void onUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
                CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th, z);
            }
        }, new DefaultSettingsDataProvider(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.crashHandler);
    }

    private CreateReportSpiCall getCreateReportSpiCall(String str, String str2) {
        String c2 = io.fabric.sdk.android.services.b.i.c(this.crashlyticsCore.context, "com.crashlytics.ApiEndpoint");
        return new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(this.crashlyticsCore, c2, str, this.httpRequestFactory), new NativeCreateReportSpiCall(this.crashlyticsCore, c2, str2, this.httpRequestFactory));
    }

    private void retainSessions(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            if (!matcher.matches()) {
                new StringBuilder("Deleting unknown file: ").append(name);
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                new StringBuilder("Trimming session file: ").append(name);
                file.delete();
            }
        }
    }

    private void writeBeginSession(String str, Date date) throws Exception {
        final String str2 = str;
        final String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{this.crashlyticsCore.getVersion()});
        final long time = date.getTime() / 1000;
        AnonymousClass17 r5 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeBeginSession(codedOutputStream, str2, format, time);
            }
        };
        writeSessionPartFile(str, "BeginSession", r5);
        AnonymousClass18 r52 = new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("session_id", str2);
                        put("generator", format);
                        put("started_at_seconds", Long.valueOf(time));
                    }
                }).toString().getBytes());
            }
        };
        writeFile(str, "BeginSession.json", r52);
    }

    private static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) throws IOException {
        if (!file.exists()) {
            new StringBuilder("Tried to include a file that doesn't exist: ").append(file.getName());
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                copyToCodedOutputStream(fileInputStream2, codedOutputStream, (int) file.length());
                io.fabric.sdk.android.services.b.i.a((Closeable) fileInputStream2, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                io.fabric.sdk.android.services.b.i.a((Closeable) fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            io.fabric.sdk.android.services.b.i.a((Closeable) fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void submitAllReports(float f2, t tVar) {
        ReportUploader.SendCheck sendCheck;
        if (tVar != null) {
            CreateReportSpiCall createReportSpiCall = getCreateReportSpiCall(tVar.f83353a.f83315d, tVar.f83353a.f83316e);
            if (shouldPromptUserBeforeSendingCrashReports(tVar)) {
                sendCheck = new PrivacyDialogCheck(this.crashlyticsCore, this.preferenceManager, tVar.f83355c);
            } else {
                sendCheck = new ReportUploader.AlwaysSendCheck();
            }
            new ReportUploader(this.appData.apiKey, createReportSpiCall, this.reportFilesProvider, this.handlingExceptionCheck).uploadReports(f2, sendCheck);
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) throws IOException {
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            File[] listFilesMatching = listFilesMatching((FilenameFilter) new FileNameContainsFilter(str + str2 + ".cls"));
            if (listFilesMatching.length == 0) {
                StringBuilder sb = new StringBuilder("Can't find ");
                sb.append(str2);
                sb.append(" data for session ID ");
                sb.append(str);
            } else {
                StringBuilder sb2 = new StringBuilder("Collecting ");
                sb2.append(str2);
                sb2.append(" data for session ID ");
                sb2.append(str);
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void cacheUserData(final String str, final String str2, final String str3) {
        this.backgroundWorker.submit((Callable<T>) new Callable<Void>() {
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(CrashlyticsController.this.getCurrentSessionId(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    private void closeOpenSessions(File[] fileArr, int i, int i2) {
        while (i < fileArr.length) {
            File file = fileArr[i];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            new StringBuilder("Closing session: ").append(sessionIdFromSessionFile);
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)});
        trimSessionEventFiles(str, i);
        return listFilesMatching((FilenameFilter) new FileNameContainsFilter(str + "SessionEvent"));
    }

    private static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, io.fabric.sdk.android.services.b.i.f83171a);
        for (File file : fileArr) {
            try {
                String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()});
                writeToCosFromFile(codedOutputStream, file);
            } catch (Exception unused) {
            }
        }
    }

    private void writeFile(String str, String str2, FileOutputStreamWriteAction fileOutputStreamWriteAction) throws Exception {
        FileOutputStream fileOutputStream = null;
        try {
            File filesDir = getFilesDir();
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(filesDir, str + str2));
            try {
                fileOutputStreamWriteAction.writeTo(fileOutputStream2);
                io.fabric.sdk.android.services.b.i.a((Closeable) fileOutputStream2, "Failed to close " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                io.fabric.sdk.android.services.b.i.a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            io.fabric.sdk.android.services.b.i.a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
            throw th;
        }
    }

    public void writeFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream newInstance;
        CodedOutputStream codedOutputStream = null;
        try {
            String currentSessionId = getCurrentSessionId();
            if (currentSessionId == null) {
                io.fabric.sdk.android.services.b.i.a((Flushable) null, "Failed to flush to session begin file.");
                io.fabric.sdk.android.services.b.i.a((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            recordFatalExceptionAnswersEvent(currentSessionId, th.getClass().getName());
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + "SessionCrash");
            try {
                newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
            } catch (Exception unused) {
                io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
            } catch (Throwable th2) {
                th = th2;
                io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
                throw th;
            }
            try {
                writeSessionEvent(newInstance, date, thread, th, "crash", true);
                io.fabric.sdk.android.services.b.i.a((Flushable) newInstance, "Failed to flush to session begin file.");
            } catch (Exception unused2) {
                codedOutputStream = newInstance;
                io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
            } catch (Throwable th3) {
                th = th3;
                codedOutputStream = newInstance;
                io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
                throw th;
            }
            io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Exception unused3) {
            clsFileOutputStream = null;
            io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
            io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
            io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
            io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    private void writeSessionPartFile(String str, String str2, CodedOutputStreamWriteAction codedOutputStreamWriteAction) throws Exception {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStream = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + str2);
            try {
                CodedOutputStream newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                try {
                    codedOutputStreamWriteAction.writeTo(newInstance);
                    io.fabric.sdk.android.services.b.i.a((Flushable) newInstance, "Failed to flush to session " + str2 + " file.");
                    io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
                } catch (Throwable th) {
                    th = th;
                    codedOutputStream = newInstance;
                    io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
                    io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
                io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            clsFileOutputStream = null;
            io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
            io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i) {
        boolean z;
        boolean z2;
        File file2;
        new StringBuilder("Collecting session parts for ID ").append(str);
        File[] listFilesMatching = listFilesMatching((FilenameFilter) new FileNameContainsFilter(str + "SessionCrash"));
        if (listFilesMatching == null || listFilesMatching.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)});
        File[] listFilesMatching2 = listFilesMatching((FilenameFilter) new FileNameContainsFilter(str + "SessionEvent"));
        if (listFilesMatching2 == null || listFilesMatching2.length <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)});
        if (z || z2) {
            File[] trimmedNonFatalFiles = getTrimmedNonFatalFiles(str, listFilesMatching2, i);
            if (z) {
                file2 = listFilesMatching[0];
            } else {
                file2 = null;
            }
            synthesizeSessionFile(file, str, trimmedNonFatalFiles, file2);
        } else {
            new StringBuilder("No events present for session ID ").append(str);
        }
        new StringBuilder("Removing session part files for ID ").append(str);
        deleteSessionPartFilesFor(str);
    }

    public void doWriteNonFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        String currentSessionId = getCurrentSessionId();
        if (currentSessionId != null) {
            recordLoggedExceptionAnswersEvent(currentSessionId, th.getClass().getName());
            CodedOutputStream codedOutputStream = null;
            try {
                StringBuilder sb = new StringBuilder("Crashlytics is logging non-fatal exception \"");
                sb.append(th);
                sb.append("\" from thread ");
                sb.append(thread.getName());
                int andIncrement = this.eventCounter.getAndIncrement();
                if (andIncrement >= 0) {
                    String replace = String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(andIncrement)}).replace(' ', '0');
                    clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + "SessionEvent" + replace);
                    try {
                        CodedOutputStream newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                        try {
                            writeSessionEvent(newInstance, date, thread, th, "error", false);
                            io.fabric.sdk.android.services.b.i.a((Flushable) newInstance, "Failed to flush to non-fatal file.");
                        } catch (Exception unused) {
                            codedOutputStream = newInstance;
                            io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                            io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                            trimSessionEventFiles(currentSessionId, 64);
                        } catch (Throwable th2) {
                            th = th2;
                            codedOutputStream = newInstance;
                            io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                            io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                            throw th;
                        }
                    } catch (Exception unused2) {
                        io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                        io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                        trimSessionEventFiles(currentSessionId, 64);
                    } catch (Throwable th3) {
                        th = th3;
                        io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                        io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                        throw th;
                    }
                    io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                    try {
                        trimSessionEventFiles(currentSessionId, 64);
                    } catch (Exception unused3) {
                    }
                } else {
                    throw new IllegalArgumentException("value must be zero or greater");
                }
            } catch (Exception unused4) {
                clsFileOutputStream = null;
                io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                trimSessionEventFiles(currentSessionId, 64);
            } catch (Throwable th4) {
                th = th4;
                clsFileOutputStream = null;
                io.fabric.sdk.android.services.b.i.a((Flushable) codedOutputStream, "Failed to flush to non-fatal file.");
                io.fabric.sdk.android.services.b.i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                throw th;
            }
        }
    }

    public void finalizeMostRecentNativeCrash(Context context, File file, String str) throws IOException {
        byte[] minidumpFromDirectory = NativeFileUtils.minidumpFromDirectory(file);
        byte[] metadataJsonFromDirectory = NativeFileUtils.metadataJsonFromDirectory(file);
        byte[] binaryImagesJsonFromDirectory = NativeFileUtils.binaryImagesJsonFromDirectory(file, context);
        if (minidumpFromDirectory == null || minidumpFromDirectory.length == 0) {
            new StringBuilder("No minidump data found in directory ").append(file);
            return;
        }
        recordFatalExceptionAnswersEvent(str, "<native-crash: minidump>");
        byte[] readFile = readFile(str, "BeginSession.json");
        byte[] readFile2 = readFile(str, "SessionApp.json");
        byte[] readFile3 = readFile(str, "SessionDevice.json");
        byte[] readFile4 = readFile(str, "SessionOS.json");
        byte[] readFile5 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getUserDataFileForSession(str));
        LogFileManager logFileManager2 = new LogFileManager(this.crashlyticsCore.context, this.logFileDirectoryProvider, str);
        byte[] bytesForLog = logFileManager2.getBytesForLog();
        logFileManager2.clearLog();
        byte[] readFile6 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getKeysFileForSession(str));
        File file2 = new File(this.fileStore.a(), str);
        if (file2.mkdir()) {
            gzipIfNotEmpty(minidumpFromDirectory, new File(file2, "minidump"));
            gzipIfNotEmpty(metadataJsonFromDirectory, new File(file2, "metadata"));
            gzipIfNotEmpty(binaryImagesJsonFromDirectory, new File(file2, "binaryImages"));
            gzipIfNotEmpty(readFile, new File(file2, "session"));
            gzipIfNotEmpty(readFile2, new File(file2, PushConstants.EXTRA_APPLICATION_PENDING_INTENT));
            gzipIfNotEmpty(readFile3, new File(file2, "device"));
            gzipIfNotEmpty(readFile4, new File(file2, "os"));
            gzipIfNotEmpty(readFile5, new File(file2, AllStoryActivity.f73306b));
            gzipIfNotEmpty(bytesForLog, new File(file2, "logs"));
            gzipIfNotEmpty(readFile6, new File(file2, "keys"));
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void handleUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
        StringBuilder sb = new StringBuilder("Crashlytics is handling uncaught exception \"");
        sb.append(th);
        sb.append("\" from thread ");
        sb.append(thread.getName());
        this.devicePowerStateListener.dispose();
        final Date date = new Date();
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = this.backgroundWorker;
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider2 = settingsDataProvider;
        final boolean z2 = z;
        AnonymousClass7 r1 = new Callable<Void>() {
            public Void call() throws Exception {
                io.fabric.sdk.android.services.f.m mVar;
                p pVar;
                boolean z;
                CrashlyticsController.this.crashlyticsCore.createCrashMarker();
                CrashlyticsController.this.writeFatal(date, thread2, th2);
                t settingsData = settingsDataProvider2.getSettingsData();
                if (settingsData != null) {
                    pVar = settingsData.f83354b;
                    mVar = settingsData.f83356d;
                } else {
                    pVar = null;
                    mVar = null;
                }
                boolean z2 = false;
                if (mVar == null || mVar.f83331e) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || z2) {
                    CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                }
                CrashlyticsController.this.doCloseSessions(pVar);
                CrashlyticsController.this.doOpenSession();
                if (pVar != null) {
                    CrashlyticsController.this.trimSessionFiles(pVar.g);
                }
                if (l.a(CrashlyticsController.this.crashlyticsCore.context).a() && !CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                    z2 = true;
                }
                if (z2) {
                    CrashlyticsController.this.sendSessionReports(settingsData);
                }
                return null;
            }
        };
        crashlyticsBackgroundWorker.submitAndWait(r1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:23|22|28|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void synthesizeSessionFile(java.io.File r10, java.lang.String r11, java.io.File[] r12, java.io.File r13) {
        /*
            r9 = this;
            r0 = 1
            if (r13 == 0) goto L_0x0005
            r1 = 1
            goto L_0x0006
        L_0x0005:
            r1 = 0
        L_0x0006:
            if (r1 == 0) goto L_0x000d
            java.io.File r2 = r9.getFatalSessionFilesDir()
            goto L_0x0011
        L_0x000d:
            java.io.File r2 = r9.getNonFatalSessionFilesDir()
        L_0x0011:
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x001a
            r2.mkdirs()
        L_0x001a:
            r3 = 0
            com.crashlytics.android.core.ClsFileOutputStream r4 = new com.crashlytics.android.core.ClsFileOutputStream     // Catch:{ Exception -> 0x006e, all -> 0x006a }
            r4.<init>((java.io.File) r2, (java.lang.String) r11)     // Catch:{ Exception -> 0x006e, all -> 0x006a }
            com.crashlytics.android.core.CodedOutputStream r2 = com.crashlytics.android.core.CodedOutputStream.newInstance((java.io.OutputStream) r4)     // Catch:{ Exception -> 0x006f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.lang.String r5 = "Collecting SessionStart data for session ID "
            r3.<init>(r5)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r3.append(r11)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            writeToCosFromFile(r2, r10)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r10 = 4
            java.util.Date r3 = new java.util.Date     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r3.<init>()     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            long r5 = r3.getTime()     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            r2.writeUInt64(r10, r5)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r10 = 5
            r2.writeBool(r10, r1)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r10 = 11
            r2.writeUInt32(r10, r0)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r10 = 12
            r0 = 3
            r2.writeEnum(r10, r0)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r9.writeInitialPartsTo(r2, r11)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            writeNonFatalEventsTo(r2, r12, r11)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            if (r1 == 0) goto L_0x005b
            writeToCosFromFile(r2, r13)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
        L_0x005b:
            java.lang.String r10 = "Error flushing session file stream"
            io.fabric.sdk.android.services.b.i.a((java.io.Flushable) r2, (java.lang.String) r10)
            java.lang.String r10 = "Failed to close CLS file"
            io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r4, (java.lang.String) r10)
            return
        L_0x0066:
            r10 = move-exception
            goto L_0x0084
        L_0x0068:
            r3 = r2
            goto L_0x006f
        L_0x006a:
            r10 = move-exception
            r2 = r3
            r4 = r2
            goto L_0x0084
        L_0x006e:
            r4 = r3
        L_0x006f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            java.lang.String r12 = "Failed to write session file for session ID: "
            r10.<init>(r12)     // Catch:{ all -> 0x0082 }
            r10.append(r11)     // Catch:{ all -> 0x0082 }
            java.lang.String r10 = "Error flushing session file stream"
            io.fabric.sdk.android.services.b.i.a((java.io.Flushable) r3, (java.lang.String) r10)
            r9.closeWithoutRenamingOrLog(r4)
            return
        L_0x0082:
            r10 = move-exception
            r2 = r3
        L_0x0084:
            java.lang.String r11 = "Error flushing session file stream"
            io.fabric.sdk.android.services.b.i.a((java.io.Flushable) r2, (java.lang.String) r11)
            java.lang.String r11 = "Failed to close CLS file"
            io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r4, (java.lang.String) r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.synthesizeSessionFile(java.io.File, java.lang.String, java.io.File[], java.io.File):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: java.util.TreeMap} */
    /* JADX WARNING: type inference failed for: r8v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeSessionEvent(com.crashlytics.android.core.CodedOutputStream r26, java.util.Date r27, java.lang.Thread r28, java.lang.Throwable r29, java.lang.String r30, boolean r31) throws java.lang.Exception {
        /*
            r25 = this;
            r0 = r25
            com.crashlytics.android.core.TrimmedThrowableData r5 = new com.crashlytics.android.core.TrimmedThrowableData
            com.crashlytics.android.core.StackTraceTrimmingStrategy r1 = r0.stackTraceTrimmingStrategy
            r2 = r29
            r5.<init>(r2, r1)
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.crashlyticsCore
            android.content.Context r1 = r1.context
            long r2 = r27.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = io.fabric.sdk.android.services.b.i.b((android.content.Context) r1)
            com.crashlytics.android.core.DevicePowerStateListener r4 = r0.devicePowerStateListener
            boolean r4 = r4.isPowerConnected()
            java.lang.Float r6 = io.fabric.sdk.android.services.b.i.b((android.content.Context) r1)
            r7 = 0
            if (r4 == 0) goto L_0x004c
            if (r6 != 0) goto L_0x002a
            goto L_0x004c
        L_0x002a:
            float r4 = r6.floatValue()
            double r9 = (double) r4
            r11 = 4636666922610458624(0x4058c00000000000, double:99.0)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x003c
            r4 = 3
            r17 = 3
            goto L_0x004e
        L_0x003c:
            float r4 = r6.floatValue()
            double r9 = (double) r4
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0049
            r4 = 2
            r17 = 2
            goto L_0x004e
        L_0x0049:
            r17 = 0
            goto L_0x004e
        L_0x004c:
            r17 = 1
        L_0x004e:
            boolean r4 = io.fabric.sdk.android.services.b.i.c(r1)
            if (r4 != 0) goto L_0x0067
            java.lang.String r4 = "sensor"
            java.lang.Object r4 = r1.getSystemService(r4)
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4
            r6 = 8
            android.hardware.Sensor r4 = r4.getDefaultSensor(r6)
            if (r4 == 0) goto L_0x0067
            r18 = 1
            goto L_0x0069
        L_0x0067:
            r18 = 0
        L_0x0069:
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r9 = io.fabric.sdk.android.services.b.i.a()
            android.app.ActivityManager$MemoryInfo r4 = new android.app.ActivityManager$MemoryInfo
            r4.<init>()
            java.lang.String r6 = "activity"
            java.lang.Object r6 = r1.getSystemService(r6)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            r6.getMemoryInfo(r4)
            long r11 = r4.availMem
            long r19 = r9 - r11
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            android.os.StatFs r6 = new android.os.StatFs
            r6.<init>(r4)
            int r4 = r6.getBlockSize()
            long r9 = (long) r4
            int r4 = r6.getBlockCount()
            long r11 = (long) r4
            long r11 = r11 * r9
            int r4 = r6.getAvailableBlocks()
            long r14 = (long) r4
            long r9 = r9 * r14
            long r21 = r11 - r9
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r12 = io.fabric.sdk.android.services.b.i.a((java.lang.String) r4, (android.content.Context) r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r10 = r5.stacktrace
            com.crashlytics.android.core.AppData r4 = r0.appData
            java.lang.String r15 = r4.buildId
            io.fabric.sdk.android.services.b.s r4 = r0.idManager
            java.lang.String r14 = r4.f83194b
            if (r31 == 0) goto L_0x0102
            java.util.Map r4 = java.lang.Thread.getAllStackTraces()
            int r6 = r4.size()
            java.lang.Thread[] r6 = new java.lang.Thread[r6]
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00d8:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00fe
            java.lang.Object r11 = r4.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r23 = r11.getKey()
            java.lang.Thread r23 = (java.lang.Thread) r23
            r6[r7] = r23
            com.crashlytics.android.core.StackTraceTrimmingStrategy r8 = r0.stackTraceTrimmingStrategy
            java.lang.Object r11 = r11.getValue()
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r8 = r8.getTrimmedStackTrace(r11)
            r9.add(r8)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x00d8
        L_0x00fe:
            r8 = 1
            r23 = r6
            goto L_0x0107
        L_0x0102:
            r8 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r7]
            r23 = r4
        L_0x0107:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = io.fabric.sdk.android.services.b.i.a((android.content.Context) r1, (java.lang.String) r4, (boolean) r8)
            if (r1 != 0) goto L_0x0117
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
        L_0x0114:
            r24 = r1
            goto L_0x012c
        L_0x0117:
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.crashlyticsCore
            java.util.Map r1 = r1.getAttributes()
            if (r1 == 0) goto L_0x0114
            int r4 = r1.size()
            if (r4 <= r8) goto L_0x0114
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r24 = r4
        L_0x012c:
            com.crashlytics.android.core.LogFileManager r11 = r0.logFileManager
            r1 = r26
            r4 = r30
            r6 = r28
            r7 = r10
            r8 = r23
            r10 = r24
            com.crashlytics.android.core.SessionProtobufHelper.writeSessionEvent(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.writeSessionEvent(com.crashlytics.android.core.CodedOutputStream, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    CrashlyticsController(CrashlyticsCore crashlyticsCore2, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, e eVar, s sVar, PreferenceManager preferenceManager2, a aVar, AppData appData2, UnityVersionProvider unityVersionProvider, AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar2, EventLogger eventLogger) {
        this.crashlyticsCore = crashlyticsCore2;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = eVar;
        this.idManager = sVar;
        this.preferenceManager = preferenceManager2;
        this.fileStore = aVar;
        this.appData = appData2;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.appMeasurementEventListenerRegistrar = appMeasurementEventListenerRegistrar2;
        this.firebaseAnalyticsLogger = eventLogger;
        Context context = crashlyticsCore2.context;
        this.logFileDirectoryProvider = new LogFileDirectoryProvider(aVar);
        this.logFileManager = new LogFileManager(context, this.logFileDirectoryProvider);
        this.reportFilesProvider = new ReportUploaderFilesProvider();
        this.handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
        this.devicePowerStateListener = new DevicePowerStateListener(context);
        this.stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
    }
}
