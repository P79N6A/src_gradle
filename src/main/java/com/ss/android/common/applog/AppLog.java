package com.ss.android.common.applog;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.AppLogNetworkStatusMonitor;
import com.bytedance.common.utility.CommonHttpException;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.AppContext;
import com.ss.android.common.a.a;
import com.ss.android.common.applog.aa;
import com.ss.android.common.applog.ad;
import com.ss.android.common.applog.e;
import com.ss.android.common.util.EventsSender;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.d.b.a;
import com.ss.android.d.d;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class AppLog implements ad.a, com.ss.android.d.a.c, Thread.UncaughtExceptionHandler {
    static final String[] HEADER_KEYS = {"appkey", "udid", "openudid", "sdk_version", "package", "channel", "display_name", "app_version", "version_code", "timezone", "access", "os", "os_version", "os_api", "device_model", "device_brand", "device_manufacturer", "language", "resolution", "display_density", "density_dpi", "mc", "carrier", "mcc_mnc", "clientudid", "install_id", "device_id", "sig_hash", "aid", "push_sdk", "rom", "aliyun_uuid", "release_build", "update_version_code", "manifest_version_code", "cpu_abi", "build_serial", "app_track", "serial_number", "sim_serial_number", "not_request_sender", "rom_version", "region", "tz_name", "tz_offset", "sim_region", "custom", "google_aid", "app_language", "app_region"};
    static final String KEY_MESSAGE = "message";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final List<g> mCallbacks = new ArrayList();
    private static volatile boolean mCollectFreeSpace;
    private static final SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    private static volatile f mFreeSpaceCollector;
    private static boolean mHasHandledCache;
    private static volatile long mLastGetAppConfigTime;
    public static int mLaunchFrom;
    private static String sAbSDKVersion;
    private static boolean sAliyunPushInclude = true;
    private static boolean sAnonymous;
    private static AppContext sAppContext;
    static int sAppCount = 0;
    static volatile int sAppLogHttpsToHttp = 0;
    private static long sAppStartTime;
    private static WeakReference<e> sConfigUpdateListener = null;
    private static final Bundle sCustomBundle = new Bundle();
    static h sCustomInfo;
    private static long sFetchActiveTime = 0;
    private static l sGlobalEventCallback;
    private static Handler sHandler = new Handler(Looper.getMainLooper());
    public static volatile boolean sHasLoadDid = false;
    private static boolean sHasManualInvokeActiveUser = false;
    private static volatile JSONObject sHeaderCopy = null;
    private static String sHostI = "ic.snssdk.com";
    private static String sHostLog = "log.snssdk.com";
    private static String sHostMon = "mon.snssdk.com";
    private static String sHostSrv = "ichannel.snssdk.com";
    private static String sHostTimely = "rtlog.snssdk.com";
    private static boolean sHwPushInclude = true;
    private static volatile boolean sInitGuard;
    private static boolean sInitWithActivity = false;
    private static AppLog sInstance;
    private static final ThreadLocal<Boolean> sIsConfigThread = new ThreadLocal<>();
    private static boolean sIsNotRequestSender = false;
    static String sLastCreateActivityName;
    static String sLastCreateActivityNameAndTime;
    static String sLastResumeActivityName;
    static String sLastResumeActivityNameAndTime;
    private static final Object sLock = new Object();
    private static final Object sLogConfigLock = new Object();
    static i sLogEncryptCfg;
    private static boolean sMiPushInclude = true;
    private static boolean sMyPushInclude = true;
    private static boolean sMzPushInclude = true;
    public static volatile boolean sPendingActiveUser = false;
    private static boolean sReportCrash = true;
    static String sRomInfo = null;
    static final List<j> sSessionHookList = new ArrayList(2);
    static String sSessionKey = "";
    static volatile boolean sStopped = false;
    static volatile o sTraceCallback;
    private static boolean sUmengPushInclude = true;
    static AtomicLong sUserId = new AtomicLong();
    private static ae urlConfig;
    private a mANRMonitor = null;
    d mActivityRecord;
    private long mActivityTime = 0;
    private volatile boolean mAllowOldImageSample = false;
    private String mAllowPushListJsonStr = "";
    private final HashSet<Integer> mAllowPushSet = new HashSet<>();
    private long mBatchEventInterval = 60000;
    private final ConcurrentHashMap<String, String> mBlackV1 = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, String> mBlackV3 = new ConcurrentHashMap<>();
    public final Context mContext;
    private int mEnableTrafficGuard = 0;
    private final ConcurrentHashMap<String, String> mEventTimely = new ConcurrentHashMap<>();
    private final JSONObject mFingerprint;
    private HashSet<Integer> mFingerprintSet = new HashSet<>();
    private boolean mForbidReportPhoneDetailInfo;
    private final AtomicLong mGlobalEventIndexMatrix = new AtomicLong();
    private final AtomicLong mGlobalEventIndexMatrixV1 = new AtomicLong();
    private long mGlobalEventIndexSavePoint;
    private boolean mHasSetup = false;
    private boolean mHasTryResendConfig = false;
    public boolean mHasUpdateConfig;
    private final JSONObject mHeader;
    private long mHeartbeatTime = System.currentTimeMillis();
    private int mHttpMonitorPort = 0;
    private HashSet<Integer> mImageErrorCodes = new HashSet<>();
    private List<k> mImageErrorList = new ArrayList();
    private Map<String, l> mImageErrorStatusMap = new HashMap();
    private AtomicInteger mImageFailureCount = new AtomicInteger();
    private Map<String, l> mImageHttpErrorStatusMap = new HashMap();
    private List<p> mImageRatioList = new ArrayList();
    private AtomicInteger mImageSuccessCount = new AtomicInteger();
    volatile boolean mInitOk;
    private int mLastConfigVersion;
    private volatile boolean mLoadingOnlineConfig = false;
    final LinkedList<s> mLogQueue = new LinkedList<>();
    volatile v mLogReaper = null;
    @NonNull
    private final AppLogNetworkStatusMonitor mNetWorkMonitor;
    Thread.UncaughtExceptionHandler mOriginHandler = null;
    final LinkedList<a> mQueue = new LinkedList<>();
    private Random mRandom = new Random();
    private LinkedList<m> mSamples = new LinkedList<>();
    private long mSendFingerprintTime = 0;
    private int mSendLaunchTimely = 1;
    private x mSession;
    public long mSessionInterval = 30000;
    private boolean mSetupOk = false;
    private volatile long mStartWaitSendTimely;
    private final AtomicBoolean mStopFlag = new AtomicBoolean();
    private JSONObject mTimeSync = null;
    private ad mTrafficGuard = null;
    private volatile long mTryUpdateConfigTime = 0;
    private volatile long mUpdateConfigTime = 0;
    private int mVersionCode = 1;
    private af mWifiBssidInfo;

    public interface e {
        void a();

        void a(boolean z);
    }

    public interface i {
        boolean a();
    }

    public interface j {
        void a(long j);

        void a(long j, String str, JSONObject jSONObject);

        void b(long j, String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.common.applog.AppLog$9  reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f28021a = new int[b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.common.applog.AppLog$b[] r0 = com.ss.android.common.applog.AppLog.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28021a = r0
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.PAGE_START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.PAGE_END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.EVENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.IMAGE_SAMPLE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.API_SAMPLE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.CONFIG_UPDATE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.UA_UPDATE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.SAVE_ANR_TAG     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.SAVE_DNS_REPORT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.SAVE_MISC_LOG     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.CUSTOMER_HEADER_UPDATE     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.DEVICE_ID_UPDATE     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.UPDATE_GOOGLE_AID     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f28021a     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.ss.android.common.applog.AppLog$b r1 = com.ss.android.common.applog.AppLog.b.UPDATE_APP_LANGUAGE_REGION     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.AnonymousClass9.<clinit>():void");
        }
    }

    public interface ConfigUpdateListenerEnhanced extends e {
        void handleConfigUpdate(JSONObject jSONObject);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f28022a;

        /* renamed from: b  reason: collision with root package name */
        public Object f28023b;

        /* renamed from: c  reason: collision with root package name */
        public long f28024c;

        /* renamed from: d  reason: collision with root package name */
        public String f28025d;

        public a(b bVar) {
            this.f28022a = bVar;
        }
    }

    enum b {
        PAGE_START(0),
        PAGE_END(1),
        EVENT(2),
        IMAGE_SAMPLE(3),
        CONFIG_UPDATE(4),
        API_SAMPLE(5),
        UA_UPDATE(6),
        SAVE_ANR_TAG(7),
        SAVE_DNS_REPORT(8),
        SAVE_MISC_LOG(9),
        DEVICE_ID_UPDATE(10),
        CUSTOMER_HEADER_UPDATE(11),
        UPDATE_GOOGLE_AID(12),
        UPDATE_APP_LANGUAGE_REGION(13);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        final int nativeInt;

        private b(int i) {
            this.nativeInt = i;
        }
    }

    class c extends Thread implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28026a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f28028c;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:21|22|(1:24)(1:25)|26|27|(3:46|29|30)(1:31)) */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
            if (r8.f28027b.mQueue.isEmpty() == false) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
            if (r1 == null) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
            r8.f28027b.processItem(r1);
            r8.f28028c = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
            if (r8.f28028c == false) goto L_0x00b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
            r8.f28028c = false;
            r8.f28027b.checkSessionEnd();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0088 */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x008c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f28026a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 15461(0x3c65, float:2.1665E-41)
                r2 = r8
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f28026a
                r4 = 0
                r5 = 15461(0x3c65, float:2.1665E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r8
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0023:
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f28026a
                r4 = 0
                r5 = 15462(0x3c66, float:2.1667E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r8
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0045
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f28026a
                r4 = 0
                r5 = 15462(0x3c66, float:2.1667E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r8
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                goto L_0x0048
            L_0x0045:
                com.ss.android.d.d.a((com.ss.android.d.d.a) r8)
            L_0x0048:
                com.ss.android.common.applog.AppLog r1 = com.ss.android.common.applog.AppLog.this
                boolean r1 = r1.setupLogReaper()
                if (r1 != 0) goto L_0x0051
                return
            L_0x0051:
                com.ss.android.common.applog.AppLog r1 = com.ss.android.common.applog.AppLog.this
                r1.ensureHeaderCopy()
                com.ss.android.common.applog.AppLog r1 = com.ss.android.common.applog.AppLog.this
                r1.checkSessionEnd()
            L_0x005b:
                r1 = 0
                com.ss.android.common.applog.AppLog r2 = com.ss.android.common.applog.AppLog.this
                java.util.LinkedList<com.ss.android.common.applog.AppLog$a> r2 = r2.mQueue
                monitor-enter(r2)
                boolean r3 = com.ss.android.common.applog.AppLog.sStopped     // Catch:{ all -> 0x00bf }
                if (r3 == 0) goto L_0x0067
                monitor-exit(r2)     // Catch:{ all -> 0x00bf }
                return
            L_0x0067:
                com.ss.android.common.applog.AppLog r3 = com.ss.android.common.applog.AppLog.this     // Catch:{ all -> 0x00bf }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$a> r3 = r3.mQueue     // Catch:{ all -> 0x00bf }
                boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00bf }
                if (r3 == 0) goto L_0x0098
                boolean r3 = r8.f28028c     // Catch:{ InterruptedException -> 0x0088 }
                if (r3 == 0) goto L_0x0081
                com.ss.android.common.applog.AppLog r3 = com.ss.android.common.applog.AppLog.this     // Catch:{ InterruptedException -> 0x0088 }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$a> r3 = r3.mQueue     // Catch:{ InterruptedException -> 0x0088 }
                com.ss.android.common.applog.AppLog r4 = com.ss.android.common.applog.AppLog.this     // Catch:{ InterruptedException -> 0x0088 }
                long r4 = r4.mSessionInterval     // Catch:{ InterruptedException -> 0x0088 }
                r3.wait(r4)     // Catch:{ InterruptedException -> 0x0088 }
                goto L_0x0088
            L_0x0081:
                com.ss.android.common.applog.AppLog r3 = com.ss.android.common.applog.AppLog.this     // Catch:{ InterruptedException -> 0x0088 }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$a> r3 = r3.mQueue     // Catch:{ InterruptedException -> 0x0088 }
                r3.wait()     // Catch:{ InterruptedException -> 0x0088 }
            L_0x0088:
                boolean r3 = com.ss.android.common.applog.AppLog.sStopped     // Catch:{ all -> 0x00bf }
                if (r3 == 0) goto L_0x008e
                monitor-exit(r2)     // Catch:{ all -> 0x00bf }
                return
            L_0x008e:
                com.ss.android.common.applog.AppLog r3 = com.ss.android.common.applog.AppLog.this     // Catch:{ all -> 0x00bf }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$a> r3 = r3.mQueue     // Catch:{ all -> 0x00bf }
                boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00bf }
                if (r3 != 0) goto L_0x00a2
            L_0x0098:
                com.ss.android.common.applog.AppLog r1 = com.ss.android.common.applog.AppLog.this     // Catch:{ all -> 0x00bf }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$a> r1 = r1.mQueue     // Catch:{ all -> 0x00bf }
                java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00bf }
                com.ss.android.common.applog.AppLog$a r1 = (com.ss.android.common.applog.AppLog.a) r1     // Catch:{ all -> 0x00bf }
            L_0x00a2:
                monitor-exit(r2)     // Catch:{ all -> 0x00bf }
                r2 = 1
                if (r1 == 0) goto L_0x00ae
                com.ss.android.common.applog.AppLog r3 = com.ss.android.common.applog.AppLog.this
                r3.processItem(r1)
                r8.f28028c = r2
                goto L_0x00b9
            L_0x00ae:
                boolean r1 = r8.f28028c
                if (r1 == 0) goto L_0x00b9
                r8.f28028c = r0
                com.ss.android.common.applog.AppLog r1 = com.ss.android.common.applog.AppLog.this
                r1.checkSessionEnd()
            L_0x00b9:
                com.ss.android.common.applog.AppLog r1 = com.ss.android.common.applog.AppLog.this
                r1.tryUpdateConfig(r2, r0)
                goto L_0x005b
            L_0x00bf:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00bf }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.c.run():void");
        }

        public c() {
            super("ActionReaper");
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f28026a, false, 15465, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f28026a, false, 15465, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            AppLog.sHasLoadDid = true;
            if (AppLog.sPendingActiveUser) {
                AppLog.activeUserInvokeInternal(AppLog.this.mContext);
            }
        }

        public final void a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f28026a, false, 15463, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str2}, this, f28026a, false, 15463, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            a aVar = new a(b.DEVICE_ID_UPDATE);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", str);
                jSONObject.put("install_id", str2);
                aVar.f28023b = jSONObject;
            } catch (JSONException unused) {
            }
            AppLog.this.enqueue(aVar);
            AppLog.this.mHasUpdateConfig = true;
        }

        public final void a(boolean z, boolean z2) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f28026a, false, 15464, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f28026a, false, 15464, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            } else if (AppLog.this.mHasUpdateConfig) {
                AppLog.this.mHasUpdateConfig = false;
            } else {
                if (z) {
                    AppLog.this.tryUpdateConfig(false, true, z2);
                }
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f28029a;

        /* renamed from: b  reason: collision with root package name */
        public String f28030b;

        public d() {
        }

        public d(String str, int i) {
            this.f28030b = str;
            this.f28029a = i;
        }
    }

    public interface f {
        JSONObject a();
    }

    public interface g {
    }

    public interface h extends com.ss.android.d.a.b {
        JSONObject a();
    }

    static class k {

        /* renamed from: a  reason: collision with root package name */
        final String f28031a;

        /* renamed from: b  reason: collision with root package name */
        final int f28032b;

        /* renamed from: c  reason: collision with root package name */
        final int f28033c;

        /* renamed from: d  reason: collision with root package name */
        final int f28034d;

        /* renamed from: e  reason: collision with root package name */
        final int f28035e;

        /* renamed from: f  reason: collision with root package name */
        final int f28036f;
        final int g;

        public k(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f28031a = str;
            this.f28032b = i;
            this.f28033c = i2;
            this.f28034d = i3;
            this.f28035e = i4;
            this.f28036f = i5;
            this.g = i6;
        }
    }

    static class l {

        /* renamed from: a  reason: collision with root package name */
        final String f28037a;

        /* renamed from: b  reason: collision with root package name */
        boolean f28038b;

        /* renamed from: c  reason: collision with root package name */
        long f28039c;

        /* renamed from: d  reason: collision with root package name */
        int f28040d;

        public l(String str) {
            this.f28037a = str;
        }
    }

    static class m {

        /* renamed from: a  reason: collision with root package name */
        public final String f28041a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28042b;

        /* renamed from: c  reason: collision with root package name */
        public final long f28043c;

        /* renamed from: d  reason: collision with root package name */
        public final long f28044d;

        public m(String str, int i, long j, long j2) {
            this.f28041a = str;
            this.f28042b = i;
            this.f28043c = j;
            this.f28044d = j2;
        }
    }

    static class n extends ThreadPlus {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28045a;

        /* renamed from: b  reason: collision with root package name */
        final int f28046b;

        /* renamed from: c  reason: collision with root package name */
        final String f28047c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f28048d;

        /* renamed from: e  reason: collision with root package name */
        final Throwable f28049e;

        /* JADX WARNING: Can't wrap try/catch for region: R(7:17|(2:21|22)|23|24|(1:31)(1:30)|(3:37|38|(1:40)(4:41|(2:43|(1:45))|46|47))|48) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007b */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf A[Catch:{ Exception -> 0x012a }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00db A[Catch:{ Exception -> 0x012a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f28045a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 15466(0x3c6a, float:2.1672E-41)
                r2 = r13
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f28045a
                r5 = 0
                r6 = 15466(0x3c6a, float:2.1672E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r13
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x012c }
                java.lang.String r1 = r13.f28047c     // Catch:{ Throwable -> 0x012c }
                java.lang.String r2 = "UTF-8"
                byte[] r5 = r1.getBytes(r2)     // Catch:{ Throwable -> 0x012c }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x012c }
                boolean r2 = r13.f28048d     // Catch:{ Throwable -> 0x012c }
                if (r2 == 0) goto L_0x0039
                java.lang.String r2 = com.ss.android.common.applog.AppLog.CDN_STATS_URL()     // Catch:{ Throwable -> 0x012c }
                goto L_0x003d
            L_0x0039:
                java.lang.String r2 = com.ss.android.common.applog.AppLog.CDN_ERROR_URL()     // Catch:{ Throwable -> 0x012c }
            L_0x003d:
                r1.<init>(r2)     // Catch:{ Throwable -> 0x012c }
                r2 = 1
                com.ss.android.common.applog.NetUtil.appendCommonParams(r1, r2)     // Catch:{ Throwable -> 0x012c }
                java.lang.String r4 = r1.toString()     // Catch:{ Throwable -> 0x012c }
                com.bytedance.common.utility.NetworkClient r3 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x012c }
                r6 = 0
                java.lang.String r7 = "text; charset=utf-8"
                r8 = 0
                java.lang.String r1 = r3.post(r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x012c }
                if (r1 == 0) goto L_0x012b
                int r3 = r1.length()     // Catch:{ Throwable -> 0x012c }
                if (r3 != 0) goto L_0x005e
                goto L_0x012b
            L_0x005e:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x012c }
                r3.<init>(r1)     // Catch:{ Throwable -> 0x012c }
                boolean r1 = com.ss.android.common.applog.AppLog.isApiSuccess(r3)     // Catch:{ Throwable -> 0x012c }
                if (r1 != 0) goto L_0x006a
                return
            L_0x006a:
                java.lang.String r1 = "poke_dns"
                java.lang.String r1 = r3.optString(r1)     // Catch:{ Throwable -> 0x012c }
                if (r1 == 0) goto L_0x007b
                int r4 = r1.length()     // Catch:{ Throwable -> 0x012c }
                if (r4 <= 0) goto L_0x007b
                java.net.InetAddress.getByName(r1)     // Catch:{ Exception -> 0x007b }
            L_0x007b:
                int r1 = r13.f28046b     // Catch:{ Throwable -> 0x012c }
                if (r1 <= 0) goto L_0x0085
                int r1 = r13.f28046b     // Catch:{ Throwable -> 0x012c }
                r4 = 100
                if (r1 < r4) goto L_0x008b
            L_0x0085:
                int r1 = r13.f28046b     // Catch:{ Throwable -> 0x012c }
                r4 = 300(0x12c, float:4.2E-43)
                if (r1 <= r4) goto L_0x008d
            L_0x008b:
                r1 = 1
                goto L_0x008e
            L_0x008d:
                r1 = 0
            L_0x008e:
                if (r1 == 0) goto L_0x012a
                java.lang.Throwable r1 = r13.f28049e     // Catch:{ Throwable -> 0x012c }
                if (r1 == 0) goto L_0x012a
                java.lang.String r1 = "send_error_detail"
                boolean r1 = com.ss.android.common.applog.AppLog.optBoolean(r3, r1, r0)     // Catch:{ Throwable -> 0x012c }
                if (r1 == 0) goto L_0x012a
                java.lang.String r1 = r13.f28047c     // Catch:{ Exception -> 0x012a }
                java.lang.Throwable r3 = r13.f28049e     // Catch:{ Exception -> 0x012a }
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x012a }
                r5[r0] = r1     // Catch:{ Exception -> 0x012a }
                r5[r2] = r3     // Catch:{ Exception -> 0x012a }
                r6 = 0
                com.meituan.robust.ChangeQuickRedirect r7 = f28045a     // Catch:{ Exception -> 0x012a }
                r8 = 1
                r9 = 15467(0x3c6b, float:2.1674E-41)
                java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x012a }
                java.lang.Class<java.lang.String> r11 = java.lang.String.class
                r10[r0] = r11     // Catch:{ Exception -> 0x012a }
                java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
                r10[r2] = r11     // Catch:{ Exception -> 0x012a }
                java.lang.Class r11 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x012a }
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x012a }
                if (r5 == 0) goto L_0x00db
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x012a }
                r6[r0] = r1     // Catch:{ Exception -> 0x012a }
                r6[r2] = r3     // Catch:{ Exception -> 0x012a }
                r7 = 0
                com.meituan.robust.ChangeQuickRedirect r8 = f28045a     // Catch:{ Exception -> 0x012a }
                r9 = 1
                r10 = 15467(0x3c6b, float:2.1674E-41)
                java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x012a }
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r11[r0] = r1     // Catch:{ Exception -> 0x012a }
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                r11[r2] = r0     // Catch:{ Exception -> 0x012a }
                java.lang.Class r12 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x012a }
                com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x012a }
                goto L_0x012a
            L_0x00db:
                java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ Exception -> 0x012a }
                r0.<init>()     // Catch:{ Exception -> 0x012a }
                java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Exception -> 0x012a }
                r2.<init>(r0)     // Catch:{ Exception -> 0x012a }
                com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Exception -> 0x012a }
                java.lang.Throwable r3 = r3.getCause()     // Catch:{ Exception -> 0x012a }
                if (r3 == 0) goto L_0x00fa
                com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Exception -> 0x012a }
                java.lang.Throwable r3 = r3.getCause()     // Catch:{ Exception -> 0x012a }
                if (r3 == 0) goto L_0x00fa
                com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Exception -> 0x012a }
            L_0x00fa:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012a }
                r2.close()     // Catch:{ Exception -> 0x012a }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x012a }
                r2.<init>()     // Catch:{ Exception -> 0x012a }
                java.lang.String r3 = "error_info"
                r2.put(r3, r1)     // Catch:{ Exception -> 0x012a }
                java.lang.String r1 = "error_detail"
                r2.put(r1, r0)     // Catch:{ Exception -> 0x012a }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x012a }
                java.lang.String r1 = "UTF-8"
                byte[] r4 = r0.getBytes(r1)     // Catch:{ Exception -> 0x012a }
                java.lang.String r3 = com.ss.android.common.applog.AppLog.CDN_ERROR_DETAIL_URL()     // Catch:{ Exception -> 0x012a }
                com.bytedance.common.utility.NetworkClient r2 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Exception -> 0x012a }
                r5 = 1
                java.lang.String r6 = "text; charset=utf-8"
                r7 = 1
                r2.post(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x012a }
                return
            L_0x012a:
                return
            L_0x012b:
                return
            L_0x012c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.n.run():void");
        }

        public n(int i, String str, boolean z, Throwable th) {
            super("ImageStatsThread");
            this.f28046b = i;
            this.f28047c = str;
            this.f28048d = z;
            this.f28049e = th;
        }
    }

    public interface o {
        void onEventExpired(List<Long> list);
    }

    static class p {

        /* renamed from: a  reason: collision with root package name */
        final String f28050a;

        /* renamed from: b  reason: collision with root package name */
        final double f28051b;

        public p(String str, double d2) {
            this.f28050a = str;
            this.f28051b = d2;
        }
    }

    @Deprecated
    public static void checkANRLog() {
    }

    private int ensureRange(int i2, int i3, int i4, int i5) {
        return i2 < i4 ? i3 : i2 > i5 ? i5 : i2;
    }

    public static boolean getDebugNetError() {
        return false;
    }

    public static String getInstallId() {
        return PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15312, new Class[0], String.class) ? (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15312, new Class[0], String.class) : d.a();
    }

    public static String getServerDeviceId() {
        return PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15317, new Class[0], String.class) ? (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15317, new Class[0], String.class) : d.b();
    }

    private void notifyOnEvent(o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, changeQuickRedirect, false, 15409, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, changeQuickRedirect, false, 15409, new Class[]{o.class}, Void.TYPE);
        }
    }

    public static void onNetConfigUpdate(JSONObject jSONObject, boolean z) {
    }

    public static void reportNetError(Throwable th, String str, String str2) {
    }

    public static String getAbSDKVersion() {
        return sAbSDKVersion;
    }

    static AppContext getAppContext() {
        return sAppContext;
    }

    public static JSONObject getHeaderCopy() {
        return sHeaderCopy;
    }

    public static String getRomInfo() {
        return sRomInfo;
    }

    public static String getSessionKey() {
        return sSessionKey;
    }

    public JSONObject getTimeSync() {
        return this.mTimeSync;
    }

    /* access modifiers changed from: package-private */
    public void onEvent(String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, new Long(j4), new Long(j5), Byte.valueOf(z ? (byte) 1 : 0), jSONObject}, this, changeQuickRedirect, false, 15380, new Class[]{String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str7, new Long(j4), new Long(j5), Byte.valueOf(z), jSONObject}, this, changeQuickRedirect, false, 15380, new Class[]{String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        if (!this.mInitOk) {
            tryReportEventDiscard(3);
            return;
        }
        try {
            if (getLogRecoverySwitch()) {
                if ("event_v3".equalsIgnoreCase(str5)) {
                    if (this.mBlackV3 != null && this.mBlackV3.size() > 0 && !StringUtils.isEmpty(str2) && this.mBlackV3.containsKey(str6)) {
                        tryReportEventDiscard(2);
                        return;
                    }
                } else if (this.mBlackV1 != null && this.mBlackV1.size() > 0) {
                    if (!StringUtils.isEmpty(str3)) {
                        str4 = str6 + str7;
                    } else {
                        str4 = str6;
                    }
                    if (this.mBlackV1.containsKey(str4)) {
                        tryReportEventDiscard(2);
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        o oVar = new o();
        oVar.f28188b = str5;
        oVar.f28189c = str6;
        oVar.f28190d = str7;
        oVar.f28191e = j4;
        oVar.f28192f = j5;
        NetworkUtils.NetworkType networkType = this.mNetWorkMonitor.getNetworkType();
        if (networkType != null) {
            jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
            try {
                jSONObject2.put("nt", networkType.getValue());
            } catch (Exception unused2) {
            }
        } else {
            jSONObject2 = jSONObject;
        }
        oVar.g = sUserId.get();
        if (jSONObject2 == null || !jSONObject2.has("event_v3_reserved_field_time_stamp")) {
            oVar.h = System.currentTimeMillis();
        } else {
            try {
                oVar.h = jSONObject2.getLong("event_v3_reserved_field_time_stamp");
            } catch (Throwable unused3) {
                oVar.h = System.currentTimeMillis();
            }
            jSONObject2.remove("event_v3_reserved_field_time_stamp");
        }
        if (jSONObject2 != null) {
            oVar.j = jSONObject2.toString();
        }
        oVar.k = z;
        oVar.l = false;
        if (Logger.debug()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onEvent ");
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            sb.append(" ");
            sb.append(str7);
            if (!(j4 == 0 && j5 == 0 && jSONObject2 == null)) {
                sb.append(" ");
                sb.append(j4);
            }
            if (!(j5 == 0 && jSONObject2 == null)) {
                sb.append(" ");
                sb.append(j5);
            }
            if (jSONObject2 != null) {
                sb.append(" ");
                sb.append(jSONObject2);
            }
        }
        try {
            if (EventsSender.inst().isSenderEnable()) {
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject3.put(next, jSONObject2.get(next));
                    }
                }
                jSONObject3.put("category", str5);
                jSONObject3.put("tag", str6);
                if (!StringUtils.isEmpty(str3)) {
                    jSONObject3.put("label", str7);
                }
                if (j4 != 0) {
                    jSONObject3.put("value", j4);
                }
                if (j5 != 0) {
                    jSONObject3.put("ext_value", j5);
                }
                EventsSender.inst().putEvent(jSONObject3);
            }
        } catch (Exception unused4) {
        }
        a aVar = new a(b.EVENT);
        aVar.f28023b = oVar;
        enqueue(aVar);
    }

    static String ACTIVE_USER_URL() {
        return urlConfig.l;
    }

    static String APPLOG_CONFIG_URL() {
        return urlConfig.j;
    }

    static String APPLOG_CONFIG_URL_FALLBACK_HTTP() {
        return urlConfig.o;
    }

    static String APPLOG_TIMELY_URL() {
        return urlConfig.k;
    }

    public static void addAppCount() {
        sAppCount++;
    }

    public static void onAppQuit() {
        sFetchActiveTime = 0;
    }

    static String APPLOG_URL() {
        if (sAppLogHttpsToHttp == 0) {
            return urlConfig.i;
        }
        return urlConfig.n;
    }

    public static String getAllowPushListJsonStr() {
        if (sInstance == null) {
            return "";
        }
        return sInstance.mAllowPushListJsonStr;
    }

    public static int getHttpMonitorPort() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.mHttpMonitorPort;
        }
        return 0;
    }

    @Deprecated
    public static void onImageFailure() {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                appLog.incImageFailureCount();
            }
        }
    }

    @Deprecated
    public static void onImageSuccess() {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                appLog.incImageSuccessCount();
            }
        }
    }

    static String CDN_ERROR_DETAIL_URL() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15292, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15292, new Class[0], String.class);
        }
        return "https://" + sHostI + "/cdn_error_detail/";
    }

    static String CDN_ERROR_URL() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15291, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15291, new Class[0], String.class);
        }
        return "https://" + sHostI + "/cdn_error/";
    }

    static String CDN_STATS_URL() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15290, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15290, new Class[0], String.class);
        }
        return "https://" + sHostI + "/cdn/";
    }

    static String CRASH_URL() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15288, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15288, new Class[0], String.class);
        }
        return "https://" + sHostLog + "/service/2/app_log_exception/";
    }

    static String MON_URL() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15289, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15289, new Class[0], String.class);
        }
        return "https://" + sHostMon + "/monitor/collect/";
    }

    private long doGetLastActivteTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15381, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15381, new Class[0], Long.TYPE)).longValue();
        } else if (this.mActivityRecord != null) {
            return System.currentTimeMillis();
        } else {
            return this.mActivityTime;
        }
    }

    public static long genEventIndex() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15407, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15407, new Class[0], Long.TYPE)).longValue();
        }
        long j2 = -1;
        if (sInstance != null) {
            j2 = sInstance.mGlobalEventIndexMatrix.getAndIncrement();
        }
        return j2;
    }

    public static String genSession() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15426, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15426, new Class[0], String.class);
        }
        return UUID.randomUUID().toString();
    }

    public static int getAppId() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15314, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15314, new Class[0], Integer.TYPE)).intValue();
        }
        return com.ss.android.d.a.d.a();
    }

    public static String getClientId() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15316, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15316, new Class[0], String.class);
        }
        if (sInstance != null) {
            return com.ss.android.d.d.c();
        }
        return null;
    }

    public static String getCustomVersion() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15330, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15330, new Class[0], String.class);
        }
        return com.ss.android.d.a.d.f28346c;
    }

    static boolean getEventV3Switch() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15337, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15337, new Class[0], Boolean.TYPE)).booleanValue();
        }
        i iVar = sLogEncryptCfg;
        return true;
    }

    public static String getInstallId$___twin___() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15313, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15313, new Class[0], String.class);
        }
        if (sInstance != null) {
            return com.ss.android.d.d.a();
        }
        return null;
    }

    public static long getLastActiveTime() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15319, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15319, new Class[0], Long.TYPE)).longValue();
        }
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.doGetLastActivteTime();
        }
        return 0;
    }

    static boolean getLogEncryptSwitch() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15336, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15336, new Class[0], Boolean.TYPE)).booleanValue();
        }
        i iVar = sLogEncryptCfg;
        if (iVar != null) {
            return iVar.a();
        }
        return true;
    }

    static boolean getLogRecoverySwitch() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15338, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15338, new Class[0], Boolean.TYPE)).booleanValue();
        }
        i iVar = sLogEncryptCfg;
        return true;
    }

    public static String getServerDeviceId$___twin___() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15318, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15318, new Class[0], String.class);
        }
        if (sInstance != null) {
            return com.ss.android.d.d.b();
        }
        return null;
    }

    private String getUserAgent() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15324, new Class[0], String.class)) {
            return com.ss.android.d.a.d.b(this.mContext);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15324, new Class[0], String.class);
    }

    public static String getUserId() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15315, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15315, new Class[0], String.class);
        }
        return String.valueOf(sUserId.get());
    }

    static boolean isInForeground() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15320, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15320, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AppLog appLog = sInstance;
        if (appLog == null || Looper.myLooper() != Looper.getMainLooper()) {
            return false;
        }
        if (appLog.mActivityRecord != null) {
            z = true;
        }
        return z;
    }

    private void loadGlobalEventIndex() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15404, new Class[0], Void.TYPE);
            return;
        }
        this.mGlobalEventIndexMatrix.set(0);
        this.mGlobalEventIndexMatrixV1.set(0);
    }

    private void notifyConfigUpdate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15418, new Class[0], Void.TYPE);
            return;
        }
        if (sConfigUpdateListener != null) {
            e eVar = (e) sConfigUpdateListener.get();
            if (eVar != null) {
                try {
                    eVar.a();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onQuit() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = 0
            r4 = 1
            r5 = 15358(0x3bfe, float:2.1521E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 1
            r6 = 15358(0x3bfe, float:2.1521E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            boolean r1 = sStopped     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x002c
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x002c:
            r1 = 1
            sStopped = r1     // Catch:{ all -> 0x003a }
            com.ss.android.common.applog.AppLog r1 = sInstance     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0038
            com.ss.android.common.applog.AppLog r1 = sInstance     // Catch:{ all -> 0x003a }
            r1.stop()     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.onQuit():void");
    }

    static void resetEventIndex() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15406, new Class[0], Void.TYPE);
            return;
        }
        if (sInstance != null) {
            sInstance.mGlobalEventIndexMatrix.set(0);
            sInstance.mGlobalEventIndexMatrixV1.set(0);
        }
    }

    public static void tryEnableANRMonitor() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15356, new Class[0], Void.TYPE);
            return;
        }
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.doEnableANRMonitor();
        }
    }

    public static void tryWaitDeviceInit() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15352, new Class[0], Void.TYPE);
        } else {
            com.ss.android.d.b.b.a(com.ss.android.d.d.f2454c);
        }
    }

    public synchronized void ensureHeaderCopy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15416, new Class[0], Void.TYPE);
            return;
        }
        try {
            sHeaderCopy = new JSONObject(this.mHeader, HEADER_KEYS);
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void incImageFailureCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15388, new Class[0], Void.TYPE);
            return;
        }
        this.mImageFailureCount.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    public void incImageSuccessCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15387, new Class[0], Void.TYPE);
            return;
        }
        this.mImageSuccessCount.incrementAndGet();
    }

    public boolean isNewUserMode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15446, new Class[0], Boolean.TYPE)) {
            return com.ss.android.d.d.b(this.mContext);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15446, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void doEnableANRMonitor() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15374, new Class[0], Void.TYPE);
            return;
        }
        if (this.mANRMonitor == null && this.mLogReaper != null) {
            this.mANRMonitor = a.a(this.mLogReaper);
            if (Looper.myLooper() == Looper.getMainLooper() && this.mActivityRecord != null) {
                this.mANRMonitor.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void sendHeartbeat() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15378, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mHeartbeatTime > 60000) {
            this.mHeartbeatTime = currentTimeMillis;
            synchronized (this.mLogQueue) {
                this.mLogQueue.notify();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean trySetupLogReaper() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15440, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15440, new Class[0], Boolean.TYPE)).booleanValue();
        }
        synchronized (this.mHeader) {
            if (this.mHasSetup) {
                boolean z = this.mSetupOk;
                return z;
            }
            this.mSetupOk = setupLogReaper();
            this.mHasSetup = true;
            boolean z2 = this.mSetupOk;
            return z2;
        }
    }

    private boolean isBssidAllowUpload() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15434, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15434, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!(this.mFingerprintSet == null || !this.mFingerprintSet.contains(6) || this.mWifiBssidInfo == null)) {
            af afVar = this.mWifiBssidInfo;
            if (PatchProxy.isSupport(new Object[0], afVar, af.f28123a, false, 15686, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], afVar, af.f28123a, false, 15686, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (afVar.f28124b != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - afVar.f28126d >= 1800000 && NetworkUtils.isWifi(afVar.f28124b)) {
                        String b2 = afVar.b();
                        if (!TextUtils.isEmpty(b2) && !b2.equals(afVar.f28125c)) {
                            afVar.f28127e = true;
                            afVar.f28128f = b2;
                            afVar.g = currentTimeMillis;
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void checkSessionEnd() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15399, new Class[0], Void.TYPE);
        } else if (this.mSession != null && !this.mSession.i) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.mSession.k && currentTimeMillis - this.mSession.h >= this.mSessionInterval) {
                x xVar = this.mSession;
                onSessionEnd();
                this.mSession = null;
                u uVar = new u();
                uVar.f28204a = xVar;
                enqueue((s) uVar);
                if (this.mTrafficGuard != null) {
                    ad adVar = this.mTrafficGuard;
                    if (PatchProxy.isSupport(new Object[0], adVar, ad.f28105a, false, 15680, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], adVar, ad.f28105a, false, 15680, new Class[0], Void.TYPE);
                        return;
                    }
                    adVar.f28106b.removeMessages(2);
                    adVar.f28106b.sendEmptyMessageDelayed(2, 180000);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void loadSSIDs() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15428, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (sAppContext != null) {
                this.mVersionCode = sAppContext.getVersionCode();
            }
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(this.mContext, com.ss.android.d.a.a.a(), 0);
            this.mLastConfigVersion = a2.getInt("app_log_last_config_version", 0);
            if (this.mLastConfigVersion == this.mVersionCode) {
                long j2 = a2.getLong("app_log_last_config_time", 0);
                if (j2 <= currentTimeMillis) {
                    currentTimeMillis = j2;
                }
                this.mUpdateConfigTime = currentTimeMillis;
            }
            try {
                String string = a2.getString("allow_push_list", null);
                this.mAllowPushListJsonStr = string;
                if (string != null) {
                    synchronized (sLock) {
                        parseIntSet(this.mAllowPushSet, new JSONArray(string));
                    }
                }
            } catch (Exception unused) {
            }
            this.mAllowOldImageSample = a2.getBoolean("allow_old_image_sample", false);
            try {
                String string2 = a2.getString("real_time_events", null);
                if (!StringUtils.isEmpty(string2)) {
                    JSONArray jSONArray = new JSONArray(string2);
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            String string3 = jSONArray.getString(i2);
                            if (!StringUtils.isEmpty(string3)) {
                                this.mEventTimely.put(string3, "timely");
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Exception unused3) {
        }
    }

    /* access modifiers changed from: package-private */
    public void onSessionEnd() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15400, new Class[0], Void.TYPE);
        } else if (this.mSession != null) {
            x xVar = this.mSession;
            h a2 = h.a(this.mContext);
            int andSet = this.mImageSuccessCount.getAndSet(0);
            int andSet2 = this.mImageFailureCount.getAndSet(0);
            if (xVar != null && xVar.f28218a > 0) {
                if (andSet > 0 || andSet2 > 0) {
                    o oVar = new o();
                    oVar.f28188b = "image";
                    oVar.f28189c = "stats";
                    oVar.f28191e = (long) andSet;
                    oVar.f28192f = (long) andSet2;
                    oVar.h = xVar.h;
                    oVar.i = xVar.f28218a;
                    a2.a(oVar);
                }
                if (!this.mAllowOldImageSample) {
                    this.mSamples.clear();
                }
                Iterator it2 = this.mSamples.iterator();
                while (it2.hasNext()) {
                    m mVar = (m) it2.next();
                    o oVar2 = new o();
                    oVar2.f28188b = "image";
                    oVar2.f28189c = "sample";
                    oVar2.f28190d = mVar.f28041a;
                    oVar2.f28191e = (long) mVar.f28042b;
                    oVar2.f28192f = mVar.f28043c;
                    oVar2.h = mVar.f28044d;
                    oVar2.i = xVar.f28218a;
                    a2.a(oVar2);
                    i2++;
                    if (i2 >= 5) {
                        break;
                    }
                }
            }
            this.mSamples.clear();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00ba */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setupLogReaper() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 15442(0x3c52, float:2.1639E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 15442(0x3c52, float:2.1639E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            boolean r1 = r12.mForbidReportPhoneDetailInfo     // Catch:{ Exception -> 0x0041 }
            com.ss.android.d.d.a((boolean) r1)     // Catch:{ Exception -> 0x0041 }
            com.ss.android.d.b.b.f28381c = r12     // Catch:{ Exception -> 0x0041 }
            com.ss.android.d.a.d.i = r12     // Catch:{ Exception -> 0x0041 }
            boolean r1 = sAnonymous     // Catch:{ Exception -> 0x0041 }
            com.ss.android.d.a.a.f28342b = r1     // Catch:{ Exception -> 0x0041 }
            boolean r1 = sInitWithActivity     // Catch:{ Exception -> 0x0041 }
            com.ss.android.d.d.f2455d = r1     // Catch:{ Exception -> 0x0041 }
            android.content.Context r1 = r12.mContext     // Catch:{ Exception -> 0x0041 }
            com.ss.android.d.d.a((android.content.Context) r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0048
        L_0x0041:
            r1 = move-exception
            boolean r2 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00ee }
            if (r2 != 0) goto L_0x00ed
        L_0x0048:
            org.json.JSONObject r1 = r12.mHeader     // Catch:{ Exception -> 0x00ee }
            android.content.Context r2 = r12.mContext     // Catch:{ Exception -> 0x00ee }
            boolean r1 = r12.initHeader(r1, r2)     // Catch:{ Exception -> 0x00ee }
            r12.mInitOk = r1     // Catch:{ Exception -> 0x00ee }
            android.content.Context r1 = r12.mContext     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.h r1 = com.ss.android.common.applog.h.a((android.content.Context) r1)     // Catch:{ Exception -> 0x00ee }
            r2 = 0
            com.ss.android.common.applog.x r1 = r1.b(r2)     // Catch:{ Exception -> 0x00ee }
            r12.mSession = r1     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.x r1 = r12.mSession     // Catch:{ Exception -> 0x00ee }
            r12.loadStats(r1)     // Catch:{ Exception -> 0x00ee }
            r12.notifyConfigUpdate()     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.x r1 = r12.mSession     // Catch:{ Exception -> 0x00ee }
            if (r1 == 0) goto L_0x007a
            com.ss.android.common.applog.r r1 = new com.ss.android.common.applog.r     // Catch:{ Exception -> 0x00ee }
            r1.<init>()     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.x r2 = r12.mSession     // Catch:{ Exception -> 0x00ee }
            long r2 = r2.f28218a     // Catch:{ Exception -> 0x00ee }
            r1.f28202a = r2     // Catch:{ Exception -> 0x00ee }
            r12.enqueue((com.ss.android.common.applog.s) r1)     // Catch:{ Exception -> 0x00ee }
        L_0x007a:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Throwable -> 0x00ba }
            r1.<init>()     // Catch:{ Throwable -> 0x00ba }
            android.os.Bundle r2 = sCustomBundle     // Catch:{ Throwable -> 0x00ba }
            monitor-enter(r2)     // Catch:{ Throwable -> 0x00ba }
            android.os.Bundle r3 = sCustomBundle     // Catch:{ all -> 0x00b7 }
            r1.putAll(r3)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            int r2 = r1.size()     // Catch:{ Throwable -> 0x00ba }
            if (r2 <= 0) goto L_0x00ba
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00ba }
            r2.<init>()     // Catch:{ Throwable -> 0x00ba }
            java.util.Set r3 = r1.keySet()     // Catch:{ Throwable -> 0x00ba }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x00ba }
        L_0x009b:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x00ba }
            if (r4 == 0) goto L_0x00af
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x00ba }
            java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x00ba }
            r2.put(r4, r5)     // Catch:{ Throwable -> 0x00ba }
            goto L_0x009b
        L_0x00af:
            org.json.JSONObject r1 = r12.mHeader     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r3 = "custom"
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x00ba }
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            throw r1     // Catch:{ Throwable -> 0x00ba }
        L_0x00ba:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ee }
            org.json.JSONObject r1 = r12.mHeader     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r2 = HEADER_KEYS     // Catch:{ Exception -> 0x00ee }
            r5.<init>(r1, r2)     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.v r1 = new com.ss.android.common.applog.v     // Catch:{ Exception -> 0x00ee }
            android.content.Context r4 = r12.mContext     // Catch:{ Exception -> 0x00ee }
            java.util.LinkedList<com.ss.android.common.applog.s> r6 = r12.mLogQueue     // Catch:{ Exception -> 0x00ee }
            java.util.concurrent.atomic.AtomicBoolean r7 = r12.mStopFlag     // Catch:{ Exception -> 0x00ee }
            java.util.List<com.ss.android.common.applog.AppLog$j> r8 = sSessionHookList     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.x r9 = r12.mSession     // Catch:{ Exception -> 0x00ee }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r12.mBlackV1     // Catch:{ Exception -> 0x00ee }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r11 = r12.mBlackV3     // Catch:{ Exception -> 0x00ee }
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ee }
            r12.mLogReaper = r1     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.v r1 = r12.mLogReaper     // Catch:{ Exception -> 0x00ee }
            long r2 = r12.mBatchEventInterval     // Catch:{ Exception -> 0x00ee }
            r1.a((long) r2)     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.v r1 = r12.mLogReaper     // Catch:{ Exception -> 0x00ee }
            int r2 = r12.mSendLaunchTimely     // Catch:{ Exception -> 0x00ee }
            r1.f28212b = r2     // Catch:{ Exception -> 0x00ee }
            com.ss.android.common.applog.v r1 = r12.mLogReaper     // Catch:{ Exception -> 0x00ee }
            r1.start()     // Catch:{ Exception -> 0x00ee }
            r0 = 1
            return r0
        L_0x00ed:
            throw r1     // Catch:{ Exception -> 0x00ee }
        L_0x00ee:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.setupLogReaper():boolean");
    }

    /* access modifiers changed from: package-private */
    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15379, new Class[0], Void.TYPE);
            return;
        }
        this.mNetWorkMonitor.onDestroy();
        synchronized (this.mQueue) {
            this.mQueue.clear();
            this.mQueue.notify();
        }
        this.mStopFlag.set(true);
        synchronized (this.mLogQueue) {
            this.mLogQueue.clear();
            this.mLogQueue.notifyAll();
        }
        if (PatchProxy.isSupport(new Object[0], null, h.f28160a, true, 15500, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, h.f28160a, true, 15500, new Class[0], Void.TYPE);
            return;
        }
        synchronized (h.i) {
            if (h.j != null) {
                h.j.a();
            }
        }
    }

    private JSONObject packThirdPartAccount() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15435, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15435, new Class[0], JSONObject.class);
        } else if (this.mFingerprintSet == null || this.mFingerprintSet.isEmpty()) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                Context context = this.mContext;
                if (PatchProxy.isSupport(new Object[]{context}, null, ac.f28104a, true, 15674, new Class[]{Context.class}, String.class)) {
                    str5 = (String) PatchProxy.accessDispatch(new Object[]{context}, null, ac.f28104a, true, 15674, new Class[]{Context.class}, String.class);
                } else {
                    str5 = ac.a(context, "com.facebook.auth.login");
                }
                if (!TextUtils.isEmpty(str5)) {
                    jSONObject.put("account_facebook", str5);
                }
            } catch (Exception unused) {
            }
            try {
                Context context2 = this.mContext;
                if (PatchProxy.isSupport(new Object[]{context2}, null, ac.f28104a, true, 15675, new Class[]{Context.class}, String.class)) {
                    str4 = (String) PatchProxy.accessDispatch(new Object[]{context2}, null, ac.f28104a, true, 15675, new Class[]{Context.class}, String.class);
                } else {
                    str4 = ac.a(context2, "com.twitter.android.auth.login");
                }
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("account_twitter", str4);
                }
            } catch (Exception unused2) {
            }
            try {
                Context context3 = this.mContext;
                if (PatchProxy.isSupport(new Object[]{context3}, null, ac.f28104a, true, 15677, new Class[]{Context.class}, String.class)) {
                    str3 = (String) PatchProxy.accessDispatch(new Object[]{context3}, null, ac.f28104a, true, 15677, new Class[]{Context.class}, String.class);
                } else {
                    str3 = ac.a(context3, "com.sina.weibo.account");
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("account_weibo", str3);
                }
            } catch (Exception unused3) {
            }
            try {
                Context context4 = this.mContext;
                if (PatchProxy.isSupport(new Object[]{context4}, null, ac.f28104a, true, 15676, new Class[]{Context.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{context4}, null, ac.f28104a, true, 15676, new Class[]{Context.class}, String.class);
                } else {
                    str2 = ac.a(context4, "com.tencent.mm.account");
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("account_weixin", str2);
                }
            } catch (Exception unused4) {
            }
            try {
                Context context5 = this.mContext;
                if (PatchProxy.isSupport(new Object[]{context5}, null, ac.f28104a, true, 15678, new Class[]{Context.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{context5}, null, ac.f28104a, true, 15678, new Class[]{Context.class}, String.class);
                } else {
                    str = ac.a(context5, "com.renren.renren_account_manager");
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("account_renren", str);
                }
            } catch (Exception unused5) {
            }
            return jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0076 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void tryGetFingerPrint() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 15433(0x3c49, float:2.1626E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 15433(0x3c49, float:2.1626E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            java.util.HashSet<java.lang.Integer> r0 = r9.mFingerprintSet
            if (r0 == 0) goto L_0x01e3
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            goto L_0x01e3
        L_0x002f:
            r1 = 0
            android.content.Context r2 = r9.mContext     // Catch:{ Throwable -> 0x003b }
            java.lang.String r3 = "phone"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Throwable -> 0x003b }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Throwable -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r2 = r1
        L_0x003c:
            if (r2 != 0) goto L_0x003f
            return
        L_0x003f:
            java.lang.String r3 = "m_phone_number"
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00a6
            org.json.JSONObject r4 = r9.mFingerprint
            boolean r4 = r4.isNull(r3)
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = com.bytedance.common.utility.android.ContactsUtil.getHashedLocalMobile(r2)     // Catch:{ Throwable -> 0x0066 }
            if (r4 == 0) goto L_0x0076
            int r5 = r4.length()     // Catch:{ Throwable -> 0x0066 }
            if (r5 <= 0) goto L_0x0076
            org.json.JSONObject r5 = r9.mFingerprint     // Catch:{ Throwable -> 0x0066 }
            r5.put(r3, r4)     // Catch:{ Throwable -> 0x0066 }
            goto L_0x0076
        L_0x0066:
            r3 = move-exception
            org.json.JSONObject r4 = r9.mFingerprint     // Catch:{ Exception -> 0x0076 }
            java.lang.String r5 = "no_m_phone"
            java.lang.Class r3 = r3.getClass()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0076 }
            r4.put(r5, r3)     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            java.lang.String r3 = r2.getLine1Number()     // Catch:{ Throwable -> 0x0094 }
            if (r3 == 0) goto L_0x008a
            int r4 = r3.length()     // Catch:{ Throwable -> 0x0094 }
            if (r4 <= 0) goto L_0x008a
            org.json.JSONObject r4 = r9.mFingerprint     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r5 = "raw_phone_number"
            r4.put(r5, r3)     // Catch:{ Throwable -> 0x0094 }
            goto L_0x00a6
        L_0x008a:
            org.json.JSONObject r3 = r9.mFingerprint     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r4 = "no_raw_phone"
            java.lang.String r5 = "empty"
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x0094 }
            goto L_0x00a6
        L_0x0094:
            r3 = move-exception
            org.json.JSONObject r4 = r9.mFingerprint     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r5 = "no_raw_phone"
            java.lang.Class r3 = r3.getClass()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x00a5 }
            r4.put(r5, r3)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a6
        L_0x00a5:
        L_0x00a6:
            java.lang.String r3 = "sim_serial"
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r0.contains(r4)
            r5 = 30
            if (r4 == 0) goto L_0x00d6
            org.json.JSONObject r4 = r9.mFingerprint
            boolean r4 = r4.isNull(r3)
            if (r4 == 0) goto L_0x00d6
            java.lang.String r4 = r2.getSimSerialNumber()     // Catch:{ Throwable -> 0x00d5 }
            if (r4 == 0) goto L_0x00d6
            int r6 = r4.length()     // Catch:{ Throwable -> 0x00d5 }
            if (r6 <= 0) goto L_0x00d6
            int r6 = r4.length()     // Catch:{ Throwable -> 0x00d5 }
            if (r6 >= r5) goto L_0x00d6
            org.json.JSONObject r6 = r9.mFingerprint     // Catch:{ Throwable -> 0x00d5 }
            r6.put(r3, r4)     // Catch:{ Throwable -> 0x00d5 }
            goto L_0x00d6
        L_0x00d5:
        L_0x00d6:
            java.lang.String r3 = "subscribe_id"
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0104
            org.json.JSONObject r4 = r9.mFingerprint
            boolean r4 = r4.isNull(r3)
            if (r4 == 0) goto L_0x0104
            java.lang.String r4 = r2.getSubscriberId()     // Catch:{ Throwable -> 0x0103 }
            if (r4 == 0) goto L_0x0104
            int r6 = r4.length()     // Catch:{ Throwable -> 0x0103 }
            if (r6 <= 0) goto L_0x0104
            int r6 = r4.length()     // Catch:{ Throwable -> 0x0103 }
            if (r6 >= r5) goto L_0x0104
            org.json.JSONObject r6 = r9.mFingerprint     // Catch:{ Throwable -> 0x0103 }
            r6.put(r3, r4)     // Catch:{ Throwable -> 0x0103 }
            goto L_0x0104
        L_0x0103:
        L_0x0104:
            java.lang.String r3 = "sim_op"
            r4 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x0132
            org.json.JSONObject r6 = r9.mFingerprint
            boolean r6 = r6.isNull(r3)
            if (r6 == 0) goto L_0x0132
            java.lang.String r6 = r2.getSimOperator()     // Catch:{ Throwable -> 0x0131 }
            if (r6 == 0) goto L_0x0132
            int r7 = r6.length()     // Catch:{ Throwable -> 0x0131 }
            if (r7 <= 0) goto L_0x0132
            int r7 = r6.length()     // Catch:{ Throwable -> 0x0131 }
            if (r7 >= r5) goto L_0x0132
            org.json.JSONObject r7 = r9.mFingerprint     // Catch:{ Throwable -> 0x0131 }
            r7.put(r3, r6)     // Catch:{ Throwable -> 0x0131 }
            goto L_0x0132
        L_0x0131:
        L_0x0132:
            java.lang.String r3 = "net_op"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x015f
            org.json.JSONObject r6 = r9.mFingerprint
            boolean r6 = r6.isNull(r3)
            if (r6 == 0) goto L_0x015f
            java.lang.String r6 = r2.getNetworkOperator()     // Catch:{ Throwable -> 0x015e }
            if (r6 == 0) goto L_0x015f
            int r7 = r6.length()     // Catch:{ Throwable -> 0x015e }
            if (r7 <= 0) goto L_0x015f
            int r7 = r6.length()     // Catch:{ Throwable -> 0x015e }
            if (r7 >= r5) goto L_0x015f
            org.json.JSONObject r5 = r9.mFingerprint     // Catch:{ Throwable -> 0x015e }
            r5.put(r3, r6)     // Catch:{ Throwable -> 0x015e }
            goto L_0x015f
        L_0x015e:
        L_0x015f:
            java.lang.String r3 = "phone_type"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x017e
            org.json.JSONObject r5 = r9.mFingerprint
            boolean r5 = r5.isNull(r3)
            if (r5 == 0) goto L_0x017e
            org.json.JSONObject r5 = r9.mFingerprint     // Catch:{ Exception -> 0x017d }
            int r6 = r2.getPhoneType()     // Catch:{ Exception -> 0x017d }
            r5.put(r3, r6)     // Catch:{ Exception -> 0x017d }
            goto L_0x017e
        L_0x017d:
        L_0x017e:
            java.lang.String r3 = "net_type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x019d
            org.json.JSONObject r4 = r9.mFingerprint
            boolean r4 = r4.isNull(r3)
            if (r4 == 0) goto L_0x019d
            org.json.JSONObject r4 = r9.mFingerprint     // Catch:{ Exception -> 0x019c }
            int r2 = r2.getNetworkType()     // Catch:{ Exception -> 0x019c }
            r4.put(r3, r2)     // Catch:{ Exception -> 0x019c }
            goto L_0x019d
        L_0x019c:
        L_0x019d:
            java.lang.String r2 = "third_part_account"
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x01bf
            org.json.JSONObject r3 = r9.mFingerprint
            boolean r3 = r3.isNull(r2)
            if (r3 == 0) goto L_0x01bf
            org.json.JSONObject r3 = r9.packThirdPartAccount()
            if (r3 == 0) goto L_0x01bf
            org.json.JSONObject r4 = r9.mFingerprint     // Catch:{ Exception -> 0x01be }
            r4.put(r2, r3)     // Catch:{ Exception -> 0x01be }
            goto L_0x01bf
        L_0x01be:
        L_0x01bf:
            java.lang.String r2 = "wifi_bssid"
            r3 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x01e2
            com.ss.android.common.applog.af r0 = r9.mWifiBssidInfo     // Catch:{ Exception -> 0x01e2 }
            if (r0 == 0) goto L_0x01d6
            com.ss.android.common.applog.af r0 = r9.mWifiBssidInfo     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x01e2 }
        L_0x01d6:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01e2 }
            if (r0 != 0) goto L_0x01e1
            org.json.JSONObject r0 = r9.mFingerprint     // Catch:{ Exception -> 0x01e2 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x01e2 }
        L_0x01e1:
            return
        L_0x01e2:
            return
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.tryGetFingerPrint():void");
    }

    public static void registerGlobalEventCallback(l lVar) {
        sGlobalEventCallback = lVar;
    }

    public static void registerLogRequestCallback(o oVar) {
        sTraceCallback = oVar;
    }

    public static void setAbSDKVersion(String str) {
        sAbSDKVersion = str;
    }

    public static void setIsNotRequestSender(boolean z) {
        sIsNotRequestSender = z;
    }

    public static void setMyPushIncludeValues(boolean z) {
        sMyPushInclude = z;
    }

    public static void setReportCrash(boolean z) {
        sReportCrash = z;
    }

    @Deprecated
    public static void setSessionHook(j jVar) {
        addSessionHook(jVar);
    }

    public static void setSessionKey(String str) {
        sSessionKey = str;
    }

    @Deprecated
    public static void setConfigUpdateListener(e eVar) {
        if (eVar == null) {
            sConfigUpdateListener = null;
        } else {
            sConfigUpdateListener = new WeakReference<>(eVar);
        }
    }

    public static void activeUser(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 15447, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 15447, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        sHasManualInvokeActiveUser = true;
        activeUserInvokeInternal(context.getApplicationContext());
    }

    public static String getSigHash(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 15441, new Class[]{Context.class}, String.class)) {
            return com.ss.android.d.a.d.a(context);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 15441, new Class[]{Context.class}, String.class);
    }

    public static boolean isBadDeviceId(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15321, new Class[]{String.class}, Boolean.TYPE)) {
            return NetUtil.isBadId(str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15321, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static void setAliYunHanlder(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, null, changeQuickRedirect, true, 15351, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, null, changeQuickRedirect, true, 15351, new Class[]{m.class}, Void.TYPE);
            return;
        }
        NetUtil.setAliYunHanlder(mVar);
    }

    public static void setAppContext(AppContext appContext) {
        if (PatchProxy.isSupport(new Object[]{appContext}, null, changeQuickRedirect, true, 15302, new Class[]{AppContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appContext}, null, changeQuickRedirect, true, 15302, new Class[]{AppContext.class}, Void.TYPE);
            return;
        }
        sAppContext = appContext;
        com.ss.android.d.a.d.f28345b = appContext;
        NetUtil.setAppContext(appContext);
    }

    public static void setAppId(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15327, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15327, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.d.a.d.f28347d = i2;
    }

    public static void setChannel(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15328, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15328, new Class[]{String.class}, Void.TYPE);
        } else if (!sInitGuard) {
            com.ss.android.d.a.d.f28344a = str;
        } else {
            throw new IllegalStateException("setChannel 必须在 init 之前调用");
        }
    }

    public static void setConfigUpdateListener(ConfigUpdateListenerEnhanced configUpdateListenerEnhanced) {
        ConfigUpdateListenerEnhanced configUpdateListenerEnhanced2 = configUpdateListenerEnhanced;
        if (PatchProxy.isSupport(new Object[]{configUpdateListenerEnhanced2}, null, changeQuickRedirect, true, 15421, new Class[]{ConfigUpdateListenerEnhanced.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configUpdateListenerEnhanced2}, null, changeQuickRedirect, true, 15421, new Class[]{ConfigUpdateListenerEnhanced.class}, Void.TYPE);
        } else if (configUpdateListenerEnhanced2 == null) {
            sConfigUpdateListener = null;
        } else {
            sConfigUpdateListener = new WeakReference<>(configUpdateListenerEnhanced2);
        }
    }

    public static void setCustomInfo(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, null, changeQuickRedirect, true, 15335, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, null, changeQuickRedirect, true, 15335, new Class[]{h.class}, Void.TYPE);
            return;
        }
        sCustomInfo = hVar;
        com.ss.android.d.b.b.f28379a = hVar;
    }

    public static void setCustomVersion(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15329, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15329, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.d.a.d.f28346c = str;
    }

    public static void setEncryptCountSPName(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15300, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15300, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            NetUtil.setEncryptSPName(str);
        }
    }

    @Deprecated
    public static void setGoogleAId(String str) {
        if (!StringUtils.isEmpty(str)) {
            if (!StringUtils.isEmpty(str) && !str.equals(com.ss.android.a.f2411a)) {
                com.ss.android.a.f2411a = str;
            }
            AppLog appLog = sInstance;
            if (appLog != null) {
                a aVar = new a(b.UPDATE_GOOGLE_AID);
                aVar.f28023b = str;
                appLog.enqueue(aVar);
            }
        }
    }

    public static void setHostI(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15301, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15301, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            sHostI = str;
        }
    }

    public static void setHostLog(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15295, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15295, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            sHostLog = str;
        }
    }

    public static void setHostMon(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15296, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15296, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            sHostMon = str;
        }
    }

    public static void setLogEncryptConfig(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, changeQuickRedirect, true, 15334, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, null, changeQuickRedirect, true, 15334, new Class[]{i.class}, Void.TYPE);
            return;
        }
        sLogEncryptCfg = iVar;
        com.ss.android.d.b.a.f28353b = new a.C0334a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28011a;

            public final boolean a() {
                if (!PatchProxy.isSupport(new Object[0], this, f28011a, false, 15456, new Class[0], Boolean.TYPE)) {
                    return AppLog.getLogEncryptSwitch();
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f28011a, false, 15456, new Class[0], Boolean.TYPE)).booleanValue();
            }
        };
    }

    public static void setNeedAntiCheating(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15444, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 15444, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.d.b.a.f28356e = z;
    }

    public static void setReleaseBuild(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15331, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15331, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.d.a.d.f28348e = str;
    }

    public static void setSPName(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15299, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15299, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str)) {
            com.ss.android.d.a.a.f28341a = str;
        }
    }

    public static void activeUserInvokeInternal(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 15448, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 15448, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (!sHasLoadDid) {
            synchronized (AppLog.class) {
                if (!sHasLoadDid) {
                    sPendingActiveUser = true;
                    return;
                }
            }
        }
        sPendingActiveUser = false;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sFetchActiveTime >= 900000 && NetworkUtils.isNetworkAvailable(context)) {
            sFetchActiveTime = currentTimeMillis;
            new a.C0329a(context2, ACTIVE_USER_URL()).start();
        }
    }

    public static void addSessionHook(j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, null, changeQuickRedirect, true, 15332, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, null, changeQuickRedirect, true, 15332, new Class[]{j.class}, Void.TYPE);
        } else if (jVar2 != null) {
            synchronized (sSessionHookList) {
                if (!sSessionHookList.contains(jVar2)) {
                    sSessionHookList.add(jVar2);
                }
            }
        }
    }

    private static void appendParamsToEvent(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15341, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15341, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 != null && !jSONObject2.has("ab_sdk_version") && !TextUtils.isEmpty(sAbSDKVersion)) {
            try {
                jSONObject2.put("ab_sdk_version", sAbSDKVersion);
            } catch (JSONException unused) {
            }
        }
    }

    static String escape4ImageStats(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 15390, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 15390, new Class[]{String.class}, String.class);
        } else if (str2 == null || str.length() == 0) {
            return str2;
        } else {
            if (str2.indexOf(92) >= 0) {
                str2 = str2.replace("\\", "\\\\");
            }
            if (str2.indexOf(124) >= 0) {
                str2 = str2.replace("|", "\\|");
            }
            if (str2.indexOf(94) >= 0) {
                str2 = str2.replace("^", "\\^");
            }
            return str2;
        }
    }

    static String formatDate(long j2) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3)}, null, changeQuickRedirect, true, 15369, new Class[]{Long.TYPE}, String.class)) {
            return mDateFormat.format(new Date(j3));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, null, changeQuickRedirect, true, 15369, new Class[]{Long.TYPE}, String.class);
    }

    public static int getAllowPushService(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15304, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15304, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        AppLog appLog = sInstance;
        synchronized (sLock) {
            if (appLog == null) {
                return 0;
            }
            try {
                if (appLog.mAllowPushSet.contains(Integer.valueOf(i2))) {
                    return 1;
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        return sInstance;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.common.applog.AppLog getInstance(android.content.Context r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.common.applog.AppLog> r8 = com.ss.android.common.applog.AppLog.class
            r3 = 0
            r5 = 1
            r6 = 15365(0x3c05, float:2.1531E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 15365(0x3c05, float:2.1531E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.common.applog.AppLog> r16 = com.ss.android.common.applog.AppLog.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.common.applog.AppLog r0 = (com.ss.android.common.applog.AppLog) r0
            return r0
        L_0x0035:
            boolean r1 = sInitGuard
            if (r1 != 0) goto L_0x0048
            boolean r1 = com.bytedance.common.utility.Logger.debug()
            if (r1 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "getInstance不能在init之前调用"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            java.lang.Object r1 = sLock
            monitor-enter(r1)
            boolean r2 = sStopped     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x0052
            r0 = 0
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            return r0
        L_0x0052:
            com.ss.android.common.applog.AppLog r2 = sInstance     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0060
            com.ss.android.common.applog.AppLog r2 = new com.ss.android.common.applog.AppLog     // Catch:{ all -> 0x0064 }
            r2.<init>(r0)     // Catch:{ all -> 0x0064 }
            sInstance = r2     // Catch:{ all -> 0x0064 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x0064 }
        L_0x0060:
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            com.ss.android.common.applog.AppLog r0 = sInstance
            return r0
        L_0x0064:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.getInstance(android.content.Context):com.ss.android.common.applog.AppLog");
    }

    public static void getSSIDs(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, changeQuickRedirect, true, 15309, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, null, changeQuickRedirect, true, 15309, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        AppLog appLog = null;
        synchronized (sLock) {
            if (!sStopped) {
                appLog = sInstance;
            }
        }
        if (appLog != null) {
            com.ss.android.d.d.a((Map) map);
            String valueOf = String.valueOf(sUserId.get());
            if (valueOf != null) {
                map2.put("user_id", valueOf);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getVersion(android.content.Context r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 15322(0x3bda, float:2.147E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0033
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 15322(0x3bda, float:2.147E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0033:
            com.ss.android.common.applog.AppLog r1 = sInstance
            r2 = 0
            if (r1 == 0) goto L_0x003c
            java.lang.String r2 = com.ss.android.d.a.d.d()
        L_0x003c:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x0053
            if (r17 == 0) goto L_0x0053
            android.content.pm.PackageManager r1 = r17.getPackageManager()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = r17.getPackageName()     // Catch:{ Exception -> 0x0053 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r9)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = r0.versionName     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = ""
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.getVersion(android.content.Context):java.lang.String");
    }

    private void handleCallback(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 15373, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 15373, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            ArrayList<g> arrayList = new ArrayList<>();
            synchronized (mCallbacks) {
                arrayList.addAll(mCallbacks);
            }
            for (g gVar : arrayList) {
                if (gVar != null) {
                    jSONObject2.optString("data");
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void handleConfigUpdate(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 15419, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 15419, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        if (sConfigUpdateListener != null) {
            e eVar = (e) sConfigUpdateListener.get();
            if (eVar instanceof ConfigUpdateListenerEnhanced) {
                try {
                    ((ConfigUpdateListenerEnhanced) eVar).handleConfigUpdate(jSONObject2);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void initDataFromSp(Context context) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 15370, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 15370, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        loadSSIDs();
        g.a(context).e();
        loadGlobalEventIndex();
        if (com.ss.android.ugc.aweme.q.c.a(this.mContext, com.ss.android.d.a.a.a(), 0).getInt("forbid_report_phone_detail_info", 0) <= 0) {
            z = false;
        }
        this.mForbidReportPhoneDetailInfo = z;
    }

    public static boolean isApiSuccess(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15414, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return "success".equals(jSONObject2.optString("message"));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15414, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
    }

    private boolean isServer503Error(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, changeQuickRedirect, false, 15432, new Class[]{Throwable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{th2}, this, changeQuickRedirect, false, 15432, new Class[]{Throwable.class}, Boolean.TYPE)).booleanValue();
        } else if (!(th2 instanceof CommonHttpException) || ((CommonHttpException) th2).getResponseCode() != 503) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isValidUDID(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 15427, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 15427, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null) {
            return false;
        } else {
            int length = str.length();
            if (length < 13 || length > 160) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str2.charAt(i2);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                    return false;
                }
            }
            return true;
        }
    }

    private void notifyRemoteConfigUpdate(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15420, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 15420, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (sConfigUpdateListener != null) {
            e eVar = (e) sConfigUpdateListener.get();
            if (eVar != null) {
                try {
                    eVar.a(z);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void notifySessionStart(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, changeQuickRedirect, false, 15402, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, changeQuickRedirect, false, 15402, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (sSessionHookList != null) {
            synchronized (sSessionHookList) {
                for (j a2 : sSessionHookList) {
                    a2.a(j3);
                }
            }
        }
    }

    public static void onActivityCreate(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 15363, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 15363, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof Activity) {
            sLastCreateActivityName = context.getClass().getName();
            sLastCreateActivityNameAndTime = sLastCreateActivityName + "(" + String.valueOf(System.currentTimeMillis()) + ")";
        }
    }

    public static void onPause(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 15361, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 15361, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof Activity) {
            onPause(context2, context.getClass().getName(), context.hashCode());
        }
    }

    public static void onResume(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 15359, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 15359, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof Activity) {
            onResume(context2, context.getClass().getName(), context.hashCode());
        }
        if (!sHasManualInvokeActiveUser) {
            activeUserInvokeInternal(context.getApplicationContext());
        }
    }

    public static String packJsonObject(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, null, changeQuickRedirect, true, 15436, new Class[]{JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{jSONObject}, null, changeQuickRedirect, true, 15436, new Class[]{JSONObject.class}, String.class);
        } else if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        } else {
            return packString(jSONObject.toString());
        }
    }

    public static String packString(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 15437, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 15437, new Class[]{String.class}, String.class);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                byte[] bytes = str2.getBytes("UTF-8");
                int length = bytes.length;
                for (int i2 = 0; i2 < length; i2++) {
                    bytes[i2] = (byte) (bytes[i2] ^ -99);
                }
                return Base64.encodeToString(bytes, 10);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void registerCrashCallBackHandler(com.ss.android.common.applog.AppLog.g r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.common.applog.AppLog$g> r3 = com.ss.android.common.applog.AppLog.g.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 15293(0x3bbd, float:2.143E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 15293(0x3bbd, float:2.143E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.common.applog.AppLog$g> r0 = com.ss.android.common.applog.AppLog.g.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            java.util.List<com.ss.android.common.applog.AppLog$g> r1 = mCallbacks
            monitor-enter(r1)
            if (r0 == 0) goto L_0x0049
            java.util.List<com.ss.android.common.applog.AppLog$g> r2 = mCallbacks     // Catch:{ all -> 0x0047 }
            boolean r2 = r2.contains(r0)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0040
            goto L_0x0049
        L_0x0040:
            java.util.List<com.ss.android.common.applog.AppLog$g> r2 = mCallbacks     // Catch:{ all -> 0x0047 }
            r2.add(r0)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            return
        L_0x0047:
            r0 = move-exception
            goto L_0x004b
        L_0x0049:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            return
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.registerCrashCallBackHandler(com.ss.android.common.applog.AppLog$g):void");
    }

    public static void registerCrashHandler(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 15308, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 15308, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context}, null, v.f28208a, true, 15579, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, v.f28208a, true, 15579, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            v.f28209d = context.getApplicationContext();
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            v.f28211f = defaultUncaughtExceptionHandler;
            if (defaultUncaughtExceptionHandler == v.g) {
                v.f28211f = null;
                return;
            }
            Thread.setDefaultUncaughtExceptionHandler(v.g);
        }
    }

    public static void removeSessionHook(j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, null, changeQuickRedirect, true, 15333, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, null, changeQuickRedirect, true, 15333, new Class[]{j.class}, Void.TYPE);
        } else if (jVar2 != null) {
            synchronized (sSessionHookList) {
                sSessionHookList.remove(jVar2);
            }
        }
    }

    private static void runOnUIThread(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, null, changeQuickRedirect, true, 15282, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, null, changeQuickRedirect, true, 15282, new Class[]{Runnable.class}, Void.TYPE);
        } else if (runnable2 != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                sHandler.post(runnable2);
            }
        }
    }

    private void saveAppTrack(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 15413, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 15413, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Context context = this.mContext;
        com.ss.android.d.d dVar = com.ss.android.d.d.f2452a;
        if (com.ss.android.d.d.f2452a != null) {
            dVar.f2457f.a(context, str2);
        }
    }

    static void saveDnsReportTime(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, null, changeQuickRedirect, true, 15350, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, null, changeQuickRedirect, true, 15350, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        AppLog appLog = sInstance;
        if (j3 > 0 && appLog != null) {
            a aVar = new a(b.SAVE_DNS_REPORT);
            aVar.f28024c = j3;
            appLog.enqueue(aVar);
        }
    }

    public static void sendANRLog(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 15366, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 15366, new Class[]{String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            try {
                AppLog appLog = sInstance;
                if (appLog != null) {
                    appLog.insertAnrToDB(str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void setAnonymous(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15281, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 15281, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!sInitGuard) {
            sAnonymous = z;
        } else {
            throw new IllegalStateException("please call before init");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|(1:16)|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setAppTrack(org.json.JSONObject r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 15307(0x3bcb, float:2.145E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 15307(0x3bcb, float:2.145E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            com.ss.android.common.applog.AppLog r1 = sInstance
            if (r1 == 0) goto L_0x0055
            java.lang.Object r2 = sLock
            monitor-enter(r2)
            if (r0 != 0) goto L_0x003f
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r0 = move-exception
            goto L_0x0053
        L_0x003f:
            org.json.JSONObject r3 = r1.mHeader     // Catch:{ Throwable -> 0x0051 }
            if (r3 == 0) goto L_0x004a
            org.json.JSONObject r3 = r1.mHeader     // Catch:{ Throwable -> 0x0051 }
            java.lang.String r4 = "app_track"
            r3.put(r4, r0)     // Catch:{ Throwable -> 0x0051 }
        L_0x004a:
            java.lang.String r0 = r17.toString()     // Catch:{ Throwable -> 0x0051 }
            r1.saveAppTrack(r0)     // Catch:{ Throwable -> 0x0051 }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            return
        L_0x0053:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r0
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.setAppTrack(org.json.JSONObject):void");
    }

    public static void setCustomerHeader(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, changeQuickRedirect, true, 15310, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, null, changeQuickRedirect, true, 15310, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            try {
                if (bundle.size() > 0) {
                    AppLog appLog = sInstance;
                    if (appLog != null) {
                        appLog.addCustomerHeader(bundle2);
                    } else {
                        synchronized (sCustomBundle) {
                            sCustomBundle.putAll(bundle2);
                        }
                    }
                    if (bundle2 != null) {
                        if (bundle.size() > 0) {
                            com.ss.android.d.b.b.a(bundle);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void setDBNamme(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15298, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15298, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[]{str}, null, h.f28160a, true, 15498, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, null, h.f28160a, true, 15498, new Class[]{String.class}, Void.TYPE);
            } else if (!StringUtils.isEmpty(str)) {
                h.f28161b = str;
            }
        }
    }

    public static void setDefaultUserAgent(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 15323, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 15323, new Class[]{String.class}, Void.TYPE);
            return;
        }
        AppLog appLog = sInstance;
        if (appLog != null) {
            String userAgent = sInstance.getUserAgent();
            if (!StringUtils.isEmpty(str) && !str2.equals(userAgent)) {
                a aVar = new a(b.UA_UPDATE);
                aVar.f28023b = str2;
                appLog.enqueue(aVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void setDeviceRegisterURL(java.lang.String[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 15297(0x3bc1, float:2.1436E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 15297(0x3bc1, float:2.1436E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            if (r0 == 0) goto L_0x0041
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0041
            r1 = r0[r9]
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0041
            com.ss.android.d.b.a.f28352a = r0
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.setDeviceRegisterURL(java.lang.String[]):void");
    }

    public static void setHttpMonitorPort(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15306, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15306, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        AppLog appLog = sInstance;
        if (appLog != null) {
            synchronized (sLock) {
                if (appLog.mHttpMonitorPort != i3) {
                    appLog.mHttpMonitorPort = i3;
                    appLog.notifyConfigUpdate();
                }
            }
        }
    }

    public static void setUseGoogleAdId(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15450, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 15450, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!sInitGuard) {
            com.ss.android.d.d.f2456e = z;
        } else {
            throw new IllegalStateException("setChannel 必须在 init 之前调用");
        }
    }

    public static void setUserId(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, null, changeQuickRedirect, true, 15325, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, null, changeQuickRedirect, true, 15325, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        sUserId.set(j3);
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.notifyConfigUpdate();
        }
    }

    public static void tryEnableTrafficGuard(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15357, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15357, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.doEnableTrafficGuard(i2);
        }
    }

    static void tryPutEventIndex(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15405, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15405, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        if (sInstance != null) {
            try {
                jSONObject2.put("tea_event_index", sInstance.mGlobalEventIndexMatrix.getAndIncrement());
            } catch (JSONException unused) {
            }
        }
    }

    static void tryReportEventDiscard(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15283, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15283, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        final int i3 = i2;
        runOnUIThread(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f27999a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f27999a, false, 15451, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f27999a, false, 15451, new Class[0], Void.TYPE);
                }
            }
        });
    }

    static void tryReportLogExpired(List<Long> list) {
        final List<Long> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, changeQuickRedirect, true, 15285, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, null, changeQuickRedirect, true, 15285, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            runOnUIThread(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f28004a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f28004a, false, 15453, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f28004a, false, 15453, new Class[0], Void.TYPE);
                        return;
                    }
                    o oVar = AppLog.sTraceCallback;
                    if (oVar != null) {
                        oVar.onEventExpired(list2);
                    }
                }
            });
        }
    }

    static void tryReportTerminateLost(List<String> list) {
        final List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, changeQuickRedirect, true, 15286, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, null, changeQuickRedirect, true, 15286, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            runOnUIThread(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f28006a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f28006a, false, 15454, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f28006a, false, 15454, new Class[0], Void.TYPE);
                        return;
                    }
                    if (AppLog.sTraceCallback != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                }
            });
        }
    }

    public static void unRegisterCrashCallBackHandler(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, null, changeQuickRedirect, true, 15294, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, null, changeQuickRedirect, true, 15294, new Class[]{g.class}, Void.TYPE);
            return;
        }
        synchronized (mCallbacks) {
            if (mCallbacks.contains(gVar2)) {
                mCallbacks.remove(gVar2);
            }
        }
    }

    private boolean updateAppLanguage(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15395, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15395, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                if (!str.equals(this.mHeader.optString("app_language", null))) {
                    this.mHeader.put("app_language", str);
                    if (this.mLogReaper != null) {
                        this.mLogReaper.a(new JSONObject(this.mHeader, HEADER_KEYS));
                    }
                    com.ss.android.ugc.aweme.q.c.a(this.mContext, com.ss.android.d.a.a.a(), 0).edit().putString("app_language", str).commit();
                    return true;
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    private void updateAppLanguageAndRegion(JSONObject jSONObject) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15394, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15394, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        String optString = jSONObject.optString("app_language", null);
        String optString2 = jSONObject.optString("app_region", null);
        if (!updateAppLanguage(optString) && !updateAppRegion(optString2)) {
            z = false;
        }
        if (z) {
            com.ss.android.d.d dVar = com.ss.android.d.d.f2452a;
            if (dVar != null) {
                com.ss.android.d.b.b bVar = dVar.f2457f;
                if (bVar.t != null) {
                    bVar.t.a();
                }
                Logger.debug();
            }
        }
    }

    private boolean updateAppRegion(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15396, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15396, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                if (!str.equals(this.mHeader.optString("app_region", null))) {
                    this.mHeader.put("app_region", str);
                    if (this.mLogReaper != null) {
                        this.mLogReaper.a(new JSONObject(this.mHeader, HEADER_KEYS));
                    }
                    com.ss.android.ugc.aweme.q.c.a(this.mContext, com.ss.android.d.a.a.a(), 0).edit().putString("app_region", str).commit();
                    return true;
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    private void updateGoogleAID(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15393, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15393, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(str) && this.mLogReaper != null) {
            try {
                if (!str.equals(this.mHeader.optString("google_aid", null))) {
                    this.mHeader.put("google_aid", str);
                    if (this.mLogReaper != null) {
                        this.mLogReaper.a(new JSONObject(this.mHeader, HEADER_KEYS));
                    }
                    com.ss.android.ugc.aweme.q.c.a(this.mContext, com.ss.android.d.a.a.a(), 0).edit().putString("google_aid", str).commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addCustomerHeader(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 15311, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 15311, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            bundle3.putAll(bundle2);
            a aVar = new a(b.CUSTOMER_HEADER_UPDATE);
            aVar.f28023b = bundle3;
            try {
                enqueue(aVar);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }

    /* access modifiers changed from: package-private */
    public void doEnableTrafficGuard(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, changeQuickRedirect, false, 15375, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, changeQuickRedirect, false, 15375, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mEnableTrafficGuard = i2;
        if (this.mTrafficGuard == null && i2 > 0) {
            this.mTrafficGuard = new ad(this.mContext, this);
        }
    }

    /* access modifiers changed from: package-private */
    public void doSaveDnsReportTime(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, changeQuickRedirect, false, 15385, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, changeQuickRedirect, false, 15385, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(this.mContext, com.ss.android.d.a.a.a(), 0).edit();
        edit.putLong("dns_report_time", j3);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public void enqueue(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 15376, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 15376, new Class[]{a.class}, Void.TYPE);
        } else if (aVar != null) {
            synchronized (this.mQueue) {
                if (!sStopped) {
                    if (this.mQueue.size() >= 2000) {
                        this.mQueue.poll();
                    }
                    this.mQueue.add(aVar);
                    this.mQueue.notify();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void handleImageSample(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, changeQuickRedirect, false, 15412, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, changeQuickRedirect, false, 15412, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (this.mSamples.size() >= 5) {
            this.mSamples.removeFirst();
        }
        this.mSamples.add(mVar);
    }

    /* access modifiers changed from: package-private */
    public void onActivityResume(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, changeQuickRedirect, false, 15382, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, changeQuickRedirect, false, 15382, new Class[]{d.class}, Void.TYPE);
        } else if (this.mInitOk && dVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mActivityTime = currentTimeMillis;
            this.mActivityRecord = dVar;
            Logger.debug();
            a aVar = new a(b.PAGE_START);
            aVar.f28024c = currentTimeMillis;
            enqueue(aVar);
            if (this.mANRMonitor != null) {
                this.mANRMonitor.a();
            }
            if (this.mTrafficGuard != null) {
                this.mTrafficGuard.a();
            }
        }
    }

    public void onTrafficWarning(ad.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, changeQuickRedirect, false, 15371, new Class[]{ad.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, changeQuickRedirect, false, 15371, new Class[]{ad.b.class}, Void.TYPE);
        } else if (bVar != null) {
            if (!isInForeground()) {
                if (this.mEnableTrafficGuard == 1) {
                    onQuit();
                    d.a(Process.myPid());
                } else if (this.mEnableTrafficGuard == 2) {
                    onEvent(null, "traffic_warn", bVar.toString());
                }
            }
            if (this.mTrafficGuard != null) {
                this.mTrafficGuard.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean parseImageSampleRatio(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 15422, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 15422, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            return false;
        }
        int length = names.length();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            String string = names.getString(i2);
            double d2 = jSONObject2.getDouble(string);
            if (d2 >= 0.0d && d2 < 1.0d) {
                arrayList.add(new p(string, d2));
            }
        }
        this.mImageRatioList = arrayList;
        return true;
    }

    /* access modifiers changed from: package-private */
    public HashSet<Integer> parseIntSet(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{jSONArray2}, this, changeQuickRedirect, false, 15425, new Class[]{JSONArray.class}, HashSet.class)) {
            return (HashSet) PatchProxy.accessDispatch(new Object[]{jSONArray2}, this, changeQuickRedirect, false, 15425, new Class[]{JSONArray.class}, HashSet.class);
        }
        HashSet<Integer> hashSet = new HashSet<>();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = jSONArray2.getInt(i2);
            if (i3 > 0) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        return hashSet;
    }

    public void setNewUserMode(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15445, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 15445, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.d.f.a(this.mContext, z);
    }

    /* access modifiers changed from: package-private */
    public void updateUserAgentString(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 15384, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 15384, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Context context = this.mContext;
        if (!StringUtils.isEmpty(str) && !str2.equals(com.ss.android.d.a.d.g)) {
            com.ss.android.d.a.d.g = str2;
            SharedPreferences.Editor edit = com.ss.android.d.a.a.a(context).edit();
            edit.putString("user_agent", str2);
            edit.commit();
        }
    }

    private void insertAnrToDB(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15367, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15367, new Class[]{String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            try {
                v vVar = this.mLogReaper;
                if (vVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", str);
                    jSONObject.put("is_anr", 1);
                    jSONObject.put("anr_time", System.currentTimeMillis());
                    if (this.mContext != null) {
                        f.a(this.mContext, jSONObject);
                    }
                    jSONObject.put("last_create_activity", sLastCreateActivityName);
                    jSONObject.put("last_resume_activity", sLastResumeActivityName);
                    jSONObject.put("last_create_activity_time", sLastCreateActivityNameAndTime);
                    jSONObject.put("last_resume_activity_time", sLastResumeActivityNameAndTime);
                    jSONObject.put("app_start_time", sAppStartTime);
                    jSONObject.put("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(sAppStartTime)));
                    if (sAppContext != null) {
                        jSONObject.put("crash_version", sAppContext.getVersion());
                        jSONObject.put("crash_version_code", sAppContext.getVersionCode());
                        jSONObject.put("crash_update_version_code", sAppContext.getUpdateVersionCode());
                    }
                    jSONObject.put("alive_activities", com.ss.android.common.b.a.a());
                    jSONObject.put("running_task_info", ToolUtils.getRunningTaskInfoString(this.mContext));
                    vVar.b(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void onActivityCreate(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15364, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15364, new Class[]{String.class}, Void.TYPE);
            return;
        }
        sLastCreateActivityName = str;
        sLastCreateActivityNameAndTime = sLastCreateActivityName + "(" + String.valueOf(System.currentTimeMillis()) + ")";
    }

    private void updateCustomerHeader(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 15397, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 15397, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (!(bundle == null || bundle.size() <= 0 || this.mLogReaper == null)) {
            try {
                JSONObject optJSONObject = this.mHeader.optJSONObject("custom");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                for (String str : bundle.keySet()) {
                    optJSONObject.put(str, bundle.get(str));
                }
                this.mHeader.put("custom", optJSONObject);
                if (this.mLogReaper != null) {
                    this.mLogReaper.a(new JSONObject(this.mHeader, HEADER_KEYS));
                }
                ensureHeaderCopy();
            } catch (Throwable unused) {
            }
        }
    }

    private void updateDid(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15398, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 15398, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject != null) {
            boolean isBadDeviceId = isBadDeviceId(this.mHeader.optString("device_id", null));
            String optString = jSONObject.optString("device_id", null);
            String optString2 = jSONObject.optString("install_id", null);
            if (!StringUtils.isEmpty(optString)) {
                try {
                    this.mHeader.put("device_id", optString);
                } catch (JSONException unused) {
                }
            }
            if (!StringUtils.isEmpty(optString2)) {
                try {
                    this.mHeader.put("install_id", optString2);
                } catch (JSONException unused2) {
                }
            }
            if (this.mLogReaper != null) {
                try {
                    this.mLogReaper.a(new JSONObject(this.mHeader, HEADER_KEYS));
                } catch (JSONException unused3) {
                }
            }
            ensureHeaderCopy();
            tryUpdateConfig(true, true, isBadDeviceId);
        }
    }

    public void enqueue(s sVar) {
        if (PatchProxy.isSupport(new Object[]{sVar}, this, changeQuickRedirect, false, 15377, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, changeQuickRedirect, false, 15377, new Class[]{s.class}, Void.TYPE);
        } else if (sVar != null) {
            this.mHeartbeatTime = System.currentTimeMillis();
            synchronized (this.mLogQueue) {
                if (this.mLogQueue.size() >= 2000) {
                    this.mLogQueue.poll();
                }
                this.mLogQueue.add(sVar);
                this.mLogQueue.notify();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void handleEvent(o oVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{oVar}, this, changeQuickRedirect, false, 15408, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, changeQuickRedirect, false, 15408, new Class[]{o.class}, Void.TYPE);
            return;
        }
        notifyOnEvent(oVar);
        tryExtendSession(oVar.h, true);
        if (this.mSession == null) {
            tryReportEventDiscard(4);
            return;
        }
        if ("event_v3".equalsIgnoreCase(oVar.f28188b)) {
            oVar.m = this.mGlobalEventIndexMatrix.getAndIncrement();
        } else {
            oVar.m = this.mGlobalEventIndexMatrixV1.getAndIncrement();
        }
        oVar.i = this.mSession.f28218a;
        if (!handleEventTimely(oVar)) {
            long a2 = h.a(this.mContext).a(oVar);
            if (a2 > 0) {
                oVar.f28187a = a2;
                sendHeartbeat();
            }
            if (a2 <= 0) {
                z = false;
            }
            tryReportEventInsertResult(z, oVar.m);
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityPause(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 15383, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 15383, new Class[]{d.class}, Void.TYPE);
        } else if (this.mInitOk && dVar2 != null) {
            String str = dVar2.f28030b;
            long currentTimeMillis = System.currentTimeMillis();
            d dVar3 = this.mActivityRecord;
            if (dVar3 == null || !(dVar3 == null || dVar3.f28029a == dVar2.f28029a)) {
                this.mActivityTime = currentTimeMillis - 1010;
            }
            this.mActivityRecord = null;
            int i2 = (int) ((currentTimeMillis - this.mActivityTime) / 1000);
            if (i2 <= 0) {
                i2 = 1;
            }
            this.mActivityTime = currentTimeMillis;
            Logger.debug();
            q qVar = new q();
            qVar.f28199a = str;
            qVar.f28200b = i2;
            a aVar = new a(b.PAGE_END);
            aVar.f28023b = qVar;
            aVar.f28024c = currentTimeMillis;
            enqueue(aVar);
            if (this.mANRMonitor != null) {
                a aVar2 = this.mANRMonitor;
                if (PatchProxy.isSupport(new Object[0], aVar2, a.f28053a, false, 15246, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar2, a.f28053a, false, 15246, new Class[0], Void.TYPE);
                    return;
                }
                aVar2.f28056d = false;
                aVar2.i = System.currentTimeMillis();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void parseImageErrorReport(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 15423, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 15423, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        JSONArray names = jSONObject.names();
        int length = names.length();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            String string = names.getString(i2);
            JSONObject jSONObject3 = jSONObject2.getJSONObject(string);
            k kVar = new k(string, ensureRange(jSONObject3.optInt("net_error_interval"), 10, 1, 60), ensureRange(jSONObject3.optInt("net_report_count"), 3, 1, 10), ensureRange(jSONObject3.optInt("net_silent_period"), 60, 60, 86400), ensureRange(jSONObject3.optInt("srv_error_interval"), 10, 1, 60), ensureRange(jSONObject3.optInt("srv_report_count"), 3, 1, 10), ensureRange(jSONObject3.optInt("srv_silent_period"), com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f, 60, 86400));
            arrayList.add(kVar);
        }
        this.mImageErrorList = arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062 A[SYNTHETIC, Splitter:B:12:0x0062] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendTimelyEvent(java.lang.String r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 15411(0x3c33, float:2.1595E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0037
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15411(0x3c33, float:2.1595E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0037:
            java.lang.String r1 = "UTF-8"
            byte[] r4 = r11.getBytes(r1)     // Catch:{ Throwable -> 0x009c }
            java.lang.String r0 = APPLOG_TIMELY_URL()     // Catch:{ Throwable -> 0x009c }
            android.content.Context r1 = r10.mContext     // Catch:{ Throwable -> 0x009c }
            java.lang.String r0 = com.ss.android.j.f.a((android.content.Context) r1, (java.lang.String) r0)     // Catch:{ Throwable -> 0x009c }
            java.lang.String r3 = com.ss.android.common.applog.NetUtil.addCommonParams(r0, r8)     // Catch:{ Throwable -> 0x009c }
            java.lang.Object r0 = r4.clone()     // Catch:{ Throwable -> 0x009c }
            byte[] r0 = (byte[]) r0     // Catch:{ Throwable -> 0x009c }
            android.content.Context r1 = r10.mContext     // Catch:{ Throwable -> 0x009c }
            if (r1 == 0) goto L_0x0062
            boolean r1 = getLogEncryptSwitch()     // Catch:{ Throwable -> 0x009c }
            if (r1 == 0) goto L_0x0062
            android.content.Context r1 = r10.mContext     // Catch:{ RuntimeException -> 0x0062 }
            java.lang.String r0 = com.ss.android.common.applog.NetUtil.sendEncryptLog(r3, r0, r1, r9)     // Catch:{ RuntimeException -> 0x0062 }
            goto L_0x006e
        L_0x0062:
            com.bytedance.common.utility.NetworkClient r2 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x009c }
            r5 = 1
            java.lang.String r6 = "application/json; charset=utf-8"
            r7 = 0
            java.lang.String r0 = r2.post(r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x009c }
        L_0x006e:
            if (r0 == 0) goto L_0x009b
            int r1 = r0.length()     // Catch:{ Throwable -> 0x009c }
            if (r1 != 0) goto L_0x0077
            goto L_0x009b
        L_0x0077:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x009c }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x009c }
            java.lang.String r0 = "ss_app_log"
            java.lang.String r2 = "magic_tag"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Throwable -> 0x009c }
            boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x009c }
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "success"
            java.lang.String r2 = "message"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Throwable -> 0x009c }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x009c }
            if (r0 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r8 = 0
        L_0x009a:
            return r8
        L_0x009b:
            return r9
        L_0x009c:
            r0 = move-exception
            boolean r1 = r0 instanceof com.bytedance.common.utility.CommonHttpException
            if (r1 == 0) goto L_0x00b5
            com.bytedance.common.utility.CommonHttpException r0 = (com.bytedance.common.utility.CommonHttpException) r0
            int r0 = r0.getResponseCode()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 < r1) goto L_0x00b5
            r1 = 600(0x258, float:8.41E-43)
            if (r0 >= r1) goto L_0x00b5
            long r0 = java.lang.System.currentTimeMillis()
            r10.mStartWaitSendTimely = r0
        L_0x00b5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.sendTimelyEvent(java.lang.String):boolean");
    }

    private AppLog(Context context) {
        com.ss.android.d.a.d.f28349f = "2.5.5.8";
        com.ss.android.d.d.g = c.a();
        this.mContext = context.getApplicationContext();
        this.mHeader = new JSONObject();
        this.mFingerprint = new JSONObject();
        sAppStartTime = System.currentTimeMillis();
        initDataFromSp(context);
        this.mInitOk = true;
        new c().start();
        if (sReportCrash) {
            this.mOriginHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (this.mOriginHandler == this) {
                this.mOriginHandler = null;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }
        this.mWifiBssidInfo = new af(this.mContext);
        this.mNetWorkMonitor = new AppLogNetworkStatusMonitor(this.mContext);
    }

    private boolean handleEventTimely(final o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, changeQuickRedirect, false, 15410, new Class[]{o.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{oVar}, this, changeQuickRedirect, false, 15410, new Class[]{o.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (oVar != null && !oVar.l) {
                if (currentTimeMillis - this.mStartWaitSendTimely >= 900000) {
                    if ("event_v3".equalsIgnoreCase(oVar.f28188b) && this.mEventTimely != null && this.mEventTimely.size() > 0 && !StringUtils.isEmpty(oVar.f28189c) && this.mEventTimely.containsKey(oVar.f28189c) && !StringUtils.isEmpty(oVar.j)) {
                        JSONObject jSONObject = new JSONObject(oVar.j);
                        if (jSONObject.optInt("_event_v3", 0) == 1) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            if (jSONObject.has("nt")) {
                                jSONObject3.put("nt", jSONObject.optInt("nt"));
                            }
                            if (oVar.g > 0) {
                                jSONObject3.put("user_id", oVar.g);
                            }
                            jSONObject.remove("nt");
                            jSONObject.remove("_event_v3");
                            jSONObject3.put("event", oVar.f28189c);
                            jSONObject3.put("params", jSONObject);
                            jSONObject3.put("session_id", oVar.i);
                            jSONObject3.put("datetime", formatDate(oVar.h));
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject3);
                            jSONObject2.put("event_v3", jSONArray);
                            if (this.mTimeSync != null) {
                                jSONObject2.put("time_sync", this.mTimeSync);
                            }
                            jSONObject2.put("magic_tag", "ss_app_log");
                            jSONObject2.put("header", this.mHeader);
                            jSONObject2.put("_gen_time", System.currentTimeMillis());
                            final String jSONObject4 = jSONObject2.toString();
                            new ThreadPlus() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f28012a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f28012a, false, 15457, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f28012a, false, 15457, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    super.run();
                                    try {
                                        if (!AppLog.this.sendTimelyEvent(jSONObject4)) {
                                            o oVar = new o();
                                            oVar.f28188b = oVar.f28188b;
                                            oVar.f28189c = oVar.f28189c;
                                            oVar.f28190d = oVar.f28190d;
                                            oVar.f28191e = oVar.f28191e;
                                            oVar.f28192f = oVar.f28192f;
                                            oVar.l = true;
                                            oVar.g = oVar.g;
                                            oVar.j = oVar.j;
                                            oVar.k = oVar.k;
                                            oVar.h = oVar.h;
                                            a aVar = new a(b.EVENT);
                                            aVar.f28023b = oVar;
                                            AppLog.this.enqueue(aVar);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }.start();
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void loadStats(x xVar) {
        x xVar2 = xVar;
        if (PatchProxy.isSupport(new Object[]{xVar2}, this, changeQuickRedirect, false, 15429, new Class[]{x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xVar2}, this, changeQuickRedirect, false, 15429, new Class[]{x.class}, Void.TYPE);
            return;
        }
        try {
            this.mSamples.clear();
            SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(this.mContext, com.ss.android.d.a.a.a(), 0);
            long currentTimeMillis = System.currentTimeMillis();
            this.mSendFingerprintTime = a2.getLong("send_fingerprint_time", 0);
            if (this.mSendFingerprintTime >= currentTimeMillis) {
                this.mSendFingerprintTime = currentTimeMillis - 86400000;
            }
            long j2 = a2.getLong("session_interval", 30000);
            if (j2 >= ea.f66827f && j2 <= 300000) {
                this.mSessionInterval = j2;
            }
            this.mBatchEventInterval = a2.getLong("batch_event_interval", 0);
            this.mSendLaunchTimely = a2.getInt("send_launch_timely", 1);
            try {
                String string = a2.getString("image_sampling_ratio", null);
                if (string != null) {
                    parseImageSampleRatio(new JSONObject(string));
                }
            } catch (Exception unused) {
            }
            try {
                String string2 = a2.getString("image_error_report", null);
                if (string2 != null) {
                    parseImageErrorReport(new JSONObject(string2));
                }
            } catch (Exception unused2) {
            }
            try {
                String string3 = a2.getString("image_error_codes", null);
                if (string3 != null) {
                    this.mImageErrorCodes = parseIntSet(new JSONArray(string3));
                }
            } catch (Exception unused3) {
            }
            try {
                String string4 = a2.getString("fingerprint_codes", null);
                if (string4 != null) {
                    this.mFingerprintSet = parseIntSet(new JSONArray(string4));
                }
            } catch (Exception unused4) {
            }
            this.mHttpMonitorPort = a2.getInt("http_monitor_port", 0);
            sAppLogHttpsToHttp = a2.getInt("switch_applog_https_to_http", 0);
            if (xVar2 != null) {
                String string5 = a2.getString("stats_value", null);
                if (!StringUtils.isEmpty(string5)) {
                    JSONObject jSONObject = new JSONObject(string5);
                    String optString = jSONObject.optString("session_id", null);
                    if (optString != null) {
                        if (optString.equals(xVar2.f28219b)) {
                            int optInt = jSONObject.optInt("cnt_success", 0);
                            int optInt2 = jSONObject.optInt("cnt_failure", 0);
                            if (optInt > 0) {
                                this.mImageSuccessCount.addAndGet(optInt);
                            }
                            if (optInt2 > 0) {
                                this.mImageFailureCount.addAndGet(optInt2);
                            }
                            if (!jSONObject.isNull("samples")) {
                                JSONArray jSONArray = jSONObject.getJSONArray("samples");
                                int length = jSONArray.length();
                                if (length > 5) {
                                    length = 5;
                                }
                                for (int i2 = 0; i2 < length; i2++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    String optString2 = jSONObject2.optString(PushConstants.WEB_URL, null);
                                    int i3 = jSONObject2.getInt("networktype");
                                    long j3 = jSONObject2.getLong("time");
                                    long j4 = jSONObject2.getLong("timestamp");
                                    if (!StringUtils.isEmpty(optString2)) {
                                        m mVar = new m(optString2, i3, j3, j4);
                                        this.mSamples.add(mVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused5) {
        }
    }

    /* access modifiers changed from: package-private */
    public void processItem(a aVar) {
        String str;
        String str2;
        boolean z;
        a aVar2 = aVar;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 15392, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 15392, new Class[]{a.class}, Void.TYPE);
        } else if (this.mInitOk && !sStopped) {
            switch (AnonymousClass9.f28021a[aVar2.f28022a.ordinal()]) {
                case 1:
                    tryExtendSession(aVar2.f28024c, false);
                    long j2 = aVar2.f28024c;
                    if (this.mSession == null) {
                        str = "";
                    } else {
                        str = this.mSession.f28219b;
                    }
                    com.ss.android.common.applog.a.c a2 = com.ss.android.common.applog.a.c.a(this.mContext);
                    if (PatchProxy.isSupport(new Object[]{new Long(j2), str}, a2, com.ss.android.common.applog.a.c.f28065a, false, 15700, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                        com.ss.android.common.applog.a.c cVar = a2;
                        PatchProxy.accessDispatch(new Object[]{new Long(j2), str}, cVar, com.ss.android.common.applog.a.c.f28065a, false, 15700, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                    } else {
                        aa.a().c(new Runnable(j2, str) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f28073a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ long f28074b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ String f28075c;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f28073a, false, 15708, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f28073a, false, 15708, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (c.this.f28068d) {
                                    c.this.f28068d = false;
                                    aa.a().b(c.this.k);
                                    aa.a().b(c.this.j);
                                    c.this.c();
                                    c.this.g.a();
                                    if (c.this.f28066b) {
                                        if (this.f28074b - c.this.f28069e <= 30000) {
                                            c.this.h.clear();
                                            c.this.f28070f = null;
                                        } else {
                                            if (c.this.f28070f != null) {
                                                if (c.this.f28067c) {
                                                    d dVar = c.this.f28070f;
                                                    String str = this.f28075c;
                                                    dVar.f28096f = true;
                                                    dVar.g = str;
                                                    c.this.f28070f.h = this.f28074b;
                                                }
                                                c.this.g.a(c.this.f28070f);
                                                c.this.f28070f = null;
                                            }
                                            c.this.k.run();
                                        }
                                    }
                                    c.this.b();
                                }
                            }

                            {
                                this.f28074b = r2;
                                this.f28075c = r4;
                            }
                        });
                    }
                    sendHeartbeat();
                    return;
                case 2:
                    long j3 = aVar2.f28024c;
                    if (this.mSession == null) {
                        str2 = "";
                    } else {
                        str2 = this.mSession.f28219b;
                    }
                    com.ss.android.common.applog.a.c a3 = com.ss.android.common.applog.a.c.a(this.mContext);
                    if (PatchProxy.isSupport(new Object[]{new Long(j3), str2}, a3, com.ss.android.common.applog.a.c.f28065a, false, 15703, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                        com.ss.android.common.applog.a.c cVar2 = a3;
                        PatchProxy.accessDispatch(new Object[]{new Long(j3), str2}, cVar2, com.ss.android.common.applog.a.c.f28065a, false, 15703, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                    } else {
                        aa.a().c(new Runnable(j3, str2) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f28084a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ long f28085b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ String f28086c;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f28084a, false, 15712, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f28084a, false, 15712, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (!c.this.f28068d) {
                                    c.this.b();
                                    aa.a().a(c.this.k, 30010);
                                    c.this.f28069e = this.f28085b;
                                    c.this.f28068d = true;
                                    if (c.this.f28067c) {
                                        c.this.f28066b = true;
                                        c.this.f28070f = new d(this.f28085b);
                                        d dVar = c.this.f28070f;
                                        String str = this.f28086c;
                                        dVar.f28094d = true;
                                        dVar.f28095e = str;
                                        c.this.a(c.this.f28070f.f28093c);
                                    }
                                }
                            }

                            {
                                this.f28085b = r2;
                                this.f28086c = r4;
                            }
                        });
                    }
                    if (aVar2.f28023b instanceof q) {
                        handlePageEnd((q) aVar2.f28023b, aVar2.f28024c);
                    }
                    sendHeartbeat();
                    return;
                case 3:
                    if (aVar2.f28023b instanceof o) {
                        handleEvent((o) aVar2.f28023b);
                        return;
                    }
                    break;
                case 4:
                    if (aVar2.f28023b instanceof m) {
                        handleImageSample((m) aVar2.f28023b);
                        return;
                    }
                    break;
                case 5:
                    return;
                case 6:
                    if (aVar2.f28023b instanceof JSONObject) {
                        try {
                            z = Boolean.valueOf(aVar2.f28025d).booleanValue();
                        } catch (Exception unused) {
                            z = false;
                        }
                        JSONObject jSONObject = (JSONObject) aVar2.f28023b;
                        if (aVar2.f28024c == 1) {
                            z2 = true;
                        }
                        handleConfigUpdate(jSONObject, z2, z);
                    }
                    notifyRemoteConfigUpdate(true);
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*7*/:
                    if (aVar2.f28023b instanceof String) {
                        updateUserAgentString((String) aVar2.f28023b);
                        return;
                    }
                    break;
                case 8:
                    return;
                case 9:
                    if (aVar2.f28024c > 0) {
                        doSaveDnsReportTime(aVar2.f28024c);
                        return;
                    }
                    break;
                case 10:
                    if (!StringUtils.isEmpty(aVar2.f28025d) && (aVar2.f28023b instanceof JSONObject)) {
                        doRecordMiscLog(aVar2.f28025d, (JSONObject) aVar2.f28023b);
                        return;
                    }
                case 11:
                    if (aVar2.f28023b instanceof Bundle) {
                        updateCustomerHeader((Bundle) aVar2.f28023b);
                        return;
                    }
                    break;
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                    if (aVar2.f28023b instanceof JSONObject) {
                        updateDid((JSONObject) aVar2.f28023b);
                        return;
                    }
                    break;
                case 13:
                    if (aVar2.f28023b instanceof String) {
                        updateGoogleAID((String) aVar2.f28023b);
                        return;
                    }
                    break;
                case 14:
                    if (aVar2.f28023b instanceof JSONObject) {
                        updateAppLanguageAndRegion((JSONObject) aVar2.f28023b);
                        break;
                    }
                    break;
            }
        }
    }

    public static void setCollectFreeSpace(boolean z, f fVar) {
        mCollectFreeSpace = z;
        mFreeSpaceCollector = fVar;
    }

    public static String addCommonParams(String str, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15354, new Class[]{String.class, Boolean.TYPE}, String.class)) {
            return NetUtil.addCommonParams(str, z);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, null, changeQuickRedirect, true, 15354, new Class[]{String.class, Boolean.TYPE}, String.class);
    }

    public static void appendCommonParams(StringBuilder sb, boolean z) {
        if (PatchProxy.isSupport(new Object[]{sb, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15355, new Class[]{StringBuilder.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sb, Byte.valueOf(z)}, null, changeQuickRedirect, true, 15355, new Class[]{StringBuilder.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        NetUtil.appendCommonParams(sb, z);
    }

    public static int checkHttpRequestException(Throwable th, String[] strArr) {
        if (!PatchProxy.isSupport(new Object[]{th, strArr}, null, changeQuickRedirect, true, 15353, new Class[]{Throwable.class, String[].class}, Integer.TYPE)) {
            return NetUtil.checkHttpRequestException(th, strArr);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{th, strArr}, null, changeQuickRedirect, true, 15353, new Class[]{Throwable.class, String[].class}, Integer.TYPE)).intValue();
    }

    public static void onEvent(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, changeQuickRedirect, true, 15347, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str}, null, changeQuickRedirect, true, 15347, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        onEvent(context, "umeng", str, null, 0, 0, false, null);
    }

    public static void recordMonLog(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, changeQuickRedirect, true, 15349, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, changeQuickRedirect, true, 15349, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        AppLog appLog = sInstance;
        if (appLog != null && !StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                h.a(appLog.mContext).a(str3, str4);
            } catch (Exception unused) {
            }
        }
    }

    public static void setAccount(Context context, Account account) {
        Account account2 = account;
        if (PatchProxy.isSupport(new Object[]{context, account2}, null, changeQuickRedirect, true, 15443, new Class[]{Context.class, Account.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, account2}, null, changeQuickRedirect, true, 15443, new Class[]{Context.class, Account.class}, Void.TYPE);
        } else if (com.ss.android.d.f.f28398a instanceof com.ss.android.d.c) {
            ((com.ss.android.d.c) com.ss.android.d.f.f28398a).a(account2);
        } else {
            com.ss.android.d.f.f28399b = account2;
        }
    }

    static void tryReportEventInsertResult(boolean z, long j2) {
        final long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j3)}, null, changeQuickRedirect, true, 15284, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j3)}, null, changeQuickRedirect, true, 15284, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        runOnUIThread(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28001a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f28001a, false, 15452, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28001a, false, 15452, new Class[0], Void.TYPE);
                }
            }
        });
    }

    static void tryReportLogRequest(boolean z, List<Long> list) {
        final List<Long> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), list2}, null, changeQuickRedirect, true, 15287, new Class[]{Boolean.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), list2}, null, changeQuickRedirect, true, 15287, new Class[]{Boolean.TYPE, List.class}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        runOnUIThread(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28008a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f28008a, false, 15455, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28008a, false, 15455, new Class[0], Void.TYPE);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void doRecordMiscLog(String str, JSONObject jSONObject) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 15386, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 15386, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            if (this.mSession != null) {
                j2 = this.mSession.f28218a;
            } else {
                j2 = 0;
            }
            if (this.mInitOk && j2 > 0 && !StringUtils.isEmpty(str) && jSONObject != null) {
                h.a(this.mContext).a(j2, str, jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void tryUpdateConfig(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15438, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 15438, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        tryUpdateConfig(z, false, z2);
    }

    public static void clearDidAndIid(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 15449, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 15449, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (!sInitGuard) {
                if (com.ss.android.d.d.f2453b) {
                    com.ss.android.d.b.a.a a2 = com.ss.android.d.f.a(context);
                    if (a2 instanceof com.ss.android.d.c) {
                        com.ss.android.d.c cVar = (com.ss.android.d.c) a2;
                        if (!TextUtils.isEmpty(str)) {
                            com.ss.android.d.c.f28387b = null;
                            String str3 = "clear_key_prefix" + str2;
                            SharedPreferences a3 = com.ss.android.d.a.a.a(context);
                            if (!a3.getBoolean(str3, false)) {
                                SharedPreferences.Editor edit = a3.edit();
                                edit.putBoolean(str3, true);
                                if (a3.contains("device_id")) {
                                    edit.remove("device_id");
                                }
                                if (a3.contains("install_id")) {
                                    edit.remove("install_id");
                                }
                                edit.apply();
                                cVar.f28390a.c("device_id");
                                Logger.debug();
                            } else {
                                Logger.debug();
                            }
                        }
                    }
                    return;
                }
                throw new IllegalStateException("please init first");
            } else if (Logger.debug()) {
                throw new IllegalStateException("clearDidAndIid shouldn't be called after Applog.init();");
            }
        }
    }

    private boolean initHeader(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2 = jSONObject;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, context2}, this, changeQuickRedirect, false, 15368, new Class[]{JSONObject.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2, context2}, this, changeQuickRedirect, false, 15368, new Class[]{JSONObject.class, Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (sMiPushInclude) {
                jSONArray.put(1);
            }
            if (sMyPushInclude) {
                jSONArray.put(2);
            }
            if (sUmengPushInclude) {
                jSONArray.put(6);
            }
            if (sHwPushInclude) {
                jSONArray.put(7);
            }
            if (sMzPushInclude) {
                jSONArray.put(8);
            }
            if (sAliyunPushInclude) {
                jSONArray.put(9);
            }
            jSONObject2.put("push_sdk", jSONArray);
        } catch (Exception unused) {
        }
        return com.ss.android.d.a.d.a(context2, jSONObject2);
    }

    public static void setAllowPushService(int i2, int i3) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, changeQuickRedirect, true, 15305, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, changeQuickRedirect, true, 15305, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        AppLog appLog = sInstance;
        if (appLog == null) {
            return;
        }
        if (i4 == 1 || i4 == 0) {
            synchronized (sLock) {
                if ((appLog.mAllowPushSet.contains(Integer.valueOf(i2)) && i4 == 0) || (!appLog.mAllowPushSet.contains(Integer.valueOf(i2)) && i4 == 1)) {
                    if (i4 == 1) {
                        appLog.mAllowPushSet.add(Integer.valueOf(i2));
                    } else {
                        appLog.mAllowPushSet.remove(Integer.valueOf(i2));
                    }
                    appLog.notifyConfigUpdate();
                }
            }
        }
    }

    public static void setAppLanguageAndRegion(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, changeQuickRedirect, true, 15326, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, changeQuickRedirect, true, 15326, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) || !StringUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject();
            if (!StringUtils.isEmpty(str)) {
                if (!StringUtils.isEmpty(str) && !str3.equals(com.ss.android.a.f2412b)) {
                    com.ss.android.a.f2412b = str3;
                }
                try {
                    jSONObject.put("app_language", str3);
                } catch (JSONException unused) {
                }
            }
            if (!StringUtils.isEmpty(str2)) {
                if (!StringUtils.isEmpty(str2) && !str4.equals(com.ss.android.a.f2413c)) {
                    com.ss.android.a.f2413c = str4;
                }
                try {
                    jSONObject.put("app_region", str4);
                } catch (JSONException unused2) {
                }
            }
            AppLog appLog = sInstance;
            if (appLog != null) {
                a aVar = new a(b.UPDATE_APP_LANGUAGE_REGION);
                aVar.f28023b = jSONObject;
                appLog.enqueue(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void handlePageEnd(q qVar, long j2) {
        q qVar2 = qVar;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{qVar2, new Long(j3)}, this, changeQuickRedirect, false, 15403, new Class[]{q.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar2, new Long(j3)}, this, changeQuickRedirect, false, 15403, new Class[]{q.class, Long.TYPE}, Void.TYPE);
        } else if (this.mSession != null && !this.mSession.i) {
            this.mSession.k = false;
            this.mSession.h = j3;
            qVar2.f28201c = this.mSession.f28218a;
            h.a(this.mContext).a(qVar, j3);
            try {
                JSONObject jSONObject = new JSONObject();
                int i2 = this.mImageSuccessCount.get();
                int i3 = this.mImageFailureCount.get();
                jSONObject.put("session_id", this.mSession.f28219b);
                jSONObject.put("cnt_success", i2);
                jSONObject.put("cnt_failure", i3);
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = this.mSamples.iterator();
                while (it2.hasNext()) {
                    m mVar = (m) it2.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(PushConstants.WEB_URL, mVar.f28041a);
                    jSONObject2.put("networktype", mVar.f28042b);
                    jSONObject2.put("time", mVar.f28043c);
                    jSONObject2.put("timestamp", mVar.f28044d);
                    jSONArray.put(jSONObject2);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("samples", jSONArray);
                }
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(this.mContext, com.ss.android.d.a.a.a(), 0).edit();
                edit.putString("stats_value", jSONObject.toString());
                edit.commit();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void parseIntSet(HashSet<Integer> hashSet, JSONArray jSONArray) throws JSONException {
        HashSet<Integer> hashSet2 = hashSet;
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{hashSet2, jSONArray2}, this, changeQuickRedirect, false, 15424, new Class[]{HashSet.class, JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashSet2, jSONArray2}, this, changeQuickRedirect, false, 15424, new Class[]{HashSet.class, JSONArray.class}, Void.TYPE);
        } else if (hashSet2 != null && jSONArray2 != null) {
            hashSet.clear();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = jSONArray2.getInt(i2);
                if (i3 > 0) {
                    hashSet2.add(Integer.valueOf(i3));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void tryExtendSession(long j2, boolean z) {
        boolean z2;
        long j3 = j2;
        boolean z3 = z;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15401, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), Byte.valueOf(z)}, this, changeQuickRedirect, false, 15401, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        h a2 = h.a(this.mContext);
        if (this.mSession == null || ((!this.mSession.k && j3 - this.mSession.h >= this.mSessionInterval) || (this.mSession.i && !z3))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!z3) {
                this.mSession.k = true;
                this.mSession.h = j3;
            }
            return;
        }
        onSessionEnd();
        x xVar = this.mSession;
        x xVar2 = new x();
        xVar2.f28219b = genSession();
        xVar2.f28220c = j3;
        resetEventIndex();
        xVar2.f28221d = this.mGlobalEventIndexMatrix.getAndIncrement();
        xVar2.h = xVar2.f28220c;
        xVar2.f28222e = 0;
        xVar2.f28223f = com.ss.android.d.a.d.d();
        xVar2.g = com.ss.android.d.a.d.b();
        xVar2.i = z3;
        if (!z3) {
            xVar2.k = true;
        }
        long a3 = a2.a(xVar2);
        if (a3 > 0) {
            xVar2.f28218a = a3;
            this.mSession = xVar2;
            notifySessionStart(a3);
        } else {
            this.mSession = null;
        }
        if (!(xVar == null && this.mSession == null)) {
            u uVar = new u();
            uVar.f28204a = xVar;
            if (mLaunchFrom <= 0) {
                mLaunchFrom = 6;
            }
            if (this.mSession != null && !this.mSession.i) {
                uVar.f28205b = this.mSession;
            }
            enqueue((s) uVar);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{thread, th}, this, changeQuickRedirect, false, 15372, new Class[]{Thread.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{thread, th}, this, changeQuickRedirect, false, 15372, new Class[]{Thread.class, Throwable.class}, Void.TYPE);
            return;
        }
        v vVar = this.mLogReaper;
        if (!(th == null || vVar == null)) {
            try {
                JSONObject a2 = f.a(this.mContext, thread, th);
                a2.put("last_create_activity", sLastCreateActivityName);
                a2.put("last_resume_activity", sLastResumeActivityName);
                a2.put("last_create_activity_time", sLastCreateActivityNameAndTime);
                a2.put("last_resume_activity_time", sLastResumeActivityNameAndTime);
                a2.put("app_start_time", sAppStartTime);
                a2.put("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(sAppStartTime)));
                if (sAppContext != null) {
                    a2.put("crash_version", sAppContext.getVersion());
                    a2.put("crash_version_code", sAppContext.getVersionCode());
                    a2.put("crash_update_version_code", sAppContext.getUpdateVersionCode());
                }
                a2.put("alive_activities", com.ss.android.common.b.a.a());
                a2.put("running_task_info", ToolUtils.getRunningTaskInfoString(this.mContext));
                if (sCustomInfo != null) {
                    JSONObject a3 = sCustomInfo.a();
                    if (a3 != null && a3.length() > 0) {
                        Iterator<String> keys = a3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!StringUtils.isEmpty(next)) {
                                a2.put(next, a3.opt(next));
                            }
                        }
                    }
                }
                vVar.b(a2);
                handleCallback(a2);
            } catch (Exception unused) {
            }
        }
        if (!ToolUtils.isMainProcess(this.mContext)) {
            try {
                Logger.debug();
                d.a(Process.myPid());
            } catch (Throwable unused2) {
            }
        } else if (!(this.mOriginHandler == null || this.mOriginHandler == this)) {
            this.mOriginHandler.uncaughtException(thread, th);
        }
    }

    @Deprecated
    public static void onImageSample(String str, int i2, long j2) {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                appLog.doOnImageSample(str, i2, j2);
            }
        }
    }

    @Deprecated
    public static void onImageFailure(String str, int i2, int i3) {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null && appLog.mAllowOldImageSample) {
                appLog.onEvent("image", "fail", str, (long) i2, (long) i3, true, (JSONObject) null);
            }
        }
    }

    public static boolean optBoolean(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15415, new Class[]{JSONObject.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2, str2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 15415, new Class[]{JSONObject.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject2 == null || jSONObject.isNull(str)) {
            return z;
        } else {
            int optInt = jSONObject2.optInt(str2, -1);
            if (optInt > 0) {
                return true;
            }
            if (optInt == 0) {
                return false;
            }
            return jSONObject.optBoolean(str, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void doOnImageSample(String str, int i2, long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), new Long(j3)}, this, changeQuickRedirect, false, 15389, new Class[]{String.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), new Long(j3)}, this, changeQuickRedirect, false, 15389, new Class[]{String.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
        } else if (this.mAllowOldImageSample) {
            m mVar = new m(str, i2, j2, System.currentTimeMillis());
            a aVar = new a(b.IMAGE_SAMPLE);
            aVar.f28023b = mVar;
            enqueue(aVar);
        }
    }

    public static void init(Context context, boolean z, ae aeVar) {
        Context context2 = context;
        ae aeVar2 = aeVar;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0), aeVar2}, null, changeQuickRedirect, true, 15303, new Class[]{Context.class, Boolean.TYPE, ae.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z), aeVar2}, null, changeQuickRedirect, true, 15303, new Class[]{Context.class, Boolean.TYPE, ae.class}, Void.TYPE);
        } else if (aeVar2 != null) {
            urlConfig = aeVar2;
            setDeviceRegisterURL(aeVar2.m);
            sInitGuard = true;
            if (context2 instanceof Activity) {
                sInitWithActivity = true;
            }
            getInstance(context);
            if (!mHasHandledCache) {
                mHasHandledCache = true;
                e a2 = e.a();
                if (PatchProxy.isSupport(new Object[0], a2, e.f28138a, false, 15474, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a2, e.f28138a, false, 15474, new Class[0], Void.TYPE);
                } else {
                    new ThreadPlus("handle_cached_events") {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f28141a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f28141a, false, 15475, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f28141a, false, 15475, new Class[0], Void.TYPE);
                                return;
                            }
                            super.run();
                            try {
                                LinkedList linkedList = new LinkedList();
                                synchronized (e.this.f28140b) {
                                    linkedList.addAll(e.this.f28140b);
                                    e.this.f28140b.clear();
                                }
                                while (!linkedList.isEmpty()) {
                                    a aVar = (a) linkedList.poll();
                                    AppLog.onEvent(null, aVar.f28143a, aVar.f28144b, aVar.f28145c, aVar.f28146d, aVar.f28147e, aVar.f28148f, aVar.g);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }.start();
                }
            }
            sHasManualInvokeActiveUser = !z;
        } else {
            throw new IllegalArgumentException("urlConfig must not be null");
        }
    }

    public static void onEvent(Context context, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 15346, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 15346, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        onEvent(context, "umeng", str, str2, 0, 0, false, null);
    }

    public static void onPause(Context context, String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15362, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15362, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            d dVar = new d(str2, i2);
            AppLog instance = getInstance(context);
            if (instance != null) {
                instance.onActivityPause(dVar);
            }
            com.ss.android.d.b.b.b();
        }
    }

    public static void onResume(Context context, String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15360, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, Integer.valueOf(i2)}, null, changeQuickRedirect, true, 15360, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            sLastResumeActivityName = str2;
            sLastResumeActivityNameAndTime = sLastResumeActivityName + "(" + String.valueOf(System.currentTimeMillis()) + ")";
            d dVar = new d(str2, i2);
            AppLog instance = getInstance(context);
            if (instance != null) {
                instance.onActivityResume(dVar);
            }
            com.ss.android.d.b.b.b();
        }
    }

    public static void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context, str2, jSONObject2}, null, changeQuickRedirect, true, 15348, new Class[]{Context.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, jSONObject2}, null, changeQuickRedirect, true, 15348, new Class[]{Context.class, String.class, JSONObject.class}, Void.TYPE);
        } else if (!sStopped && !StringUtils.isEmpty(str) && jSONObject2 != null && jSONObject.length() > 0) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                try {
                    if (EventsSender.inst().isSenderEnable()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("log_type", str2);
                        jSONObject3.put("obj", jSONObject2);
                        EventsSender.inst().putEvent(jSONObject3);
                    }
                } catch (Exception unused) {
                }
                a aVar = new a(b.SAVE_MISC_LOG);
                aVar.f28025d = str2;
                aVar.f28023b = jSONObject2;
                appLog.enqueue(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0077 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean updateConfig(java.lang.String r14, boolean r15, boolean r16) {
        /*
            r13 = this;
            r8 = r13
            r9 = 3
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r14
            java.lang.Byte r2 = java.lang.Byte.valueOf(r15)
            r11 = 1
            r1[r11] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r16)
            r12 = 2
            r1[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 15430(0x3c46, float:2.1622E-41)
            r2 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0062
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r14
            java.lang.Byte r0 = java.lang.Byte.valueOf(r15)
            r1[r11] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r16)
            r1[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15430(0x3c46, float:2.1622E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r12] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0062:
            java.lang.ThreadLocal<java.lang.Boolean> r1 = sIsConfigThread
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.set(r2)
            boolean r0 = r13.doUpdateConfig(r14, r15, r16)
            java.lang.Object r1 = sLogConfigLock
            monitor-enter(r1)
            r8.mLoadingOnlineConfig = r10     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = sLogConfigLock     // Catch:{ Exception -> 0x0077 }
            r2.notifyAll()     // Catch:{ Exception -> 0x0077 }
        L_0x0077:
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            java.lang.ThreadLocal<java.lang.Boolean> r1 = sIsConfigThread
            r1.remove()
            if (r0 != 0) goto L_0x0082
            r13.notifyRemoteConfigUpdate(r10)
        L_0x0082:
            return r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.updateConfig(java.lang.String, boolean, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01aa A[Catch:{ Throwable -> 0x01f3 }, LOOP:0: B:11:0x0085->B:61:0x01aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean doUpdateConfig(java.lang.String r23, boolean r24, boolean r25) {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            r9 = 3
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r24)
            r11 = 1
            r1[r11] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r25)
            r12 = 2
            r1[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 15431(0x3c47, float:2.1623E-41)
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0067
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)
            r1[r11] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r25)
            r1[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15431(0x3c47, float:2.1623E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r12] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r22
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0067:
            java.lang.String r1 = "UTF-8"
            byte[] r1 = r0.getBytes(r1)     // Catch:{ Throwable -> 0x01f3 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01f3 }
            long r4 = mLastGetAppConfigTime     // Catch:{ Throwable -> 0x01f3 }
            r0 = 0
            long r4 = r2 - r4
            r6 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x007f
            r9 = 1
            goto L_0x0080
        L_0x007f:
            r9 = 0
        L_0x0080:
            mLastGetAppConfigTime = r2     // Catch:{ Throwable -> 0x01f3 }
            r13 = 0
            r0 = 0
            r14 = 0
        L_0x0085:
            if (r14 >= r12) goto L_0x01b0
            java.lang.Object r2 = r1.clone()     // Catch:{ Throwable -> 0x01f3 }
            byte[] r2 = (byte[]) r2     // Catch:{ Throwable -> 0x01f3 }
            java.lang.String r3 = APPLOG_CONFIG_URL()     // Catch:{ Throwable -> 0x01f3 }
            if (r0 == 0) goto L_0x0097
            java.lang.String r3 = APPLOG_CONFIG_URL_FALLBACK_HTTP()     // Catch:{ Throwable -> 0x01f3 }
        L_0x0097:
            android.content.Context r4 = r8.mContext     // Catch:{ Throwable -> 0x01f3 }
            java.lang.String r3 = com.ss.android.j.f.a((android.content.Context) r4, (java.lang.String) r3)     // Catch:{ Throwable -> 0x01f3 }
            java.lang.String r3 = com.ss.android.common.applog.NetUtil.addCommonParams(r3, r11)     // Catch:{ Throwable -> 0x01f3 }
            com.ss.android.common.applog.c r4 = com.ss.android.common.applog.c.a()     // Catch:{ Throwable -> 0x01f3 }
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x01f3 }
            r5[r10] = r3     // Catch:{ Throwable -> 0x01f3 }
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.applog.c.f28129a     // Catch:{ Throwable -> 0x01f3 }
            r18 = 0
            r19 = 15269(0x3ba5, float:2.1396E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x01f3 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r10] = r7     // Catch:{ Throwable -> 0x01f3 }
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            r15 = r5
            r16 = r4
            r20 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x01f3 }
            if (r5 == 0) goto L_0x00e0
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x01f3 }
            r5[r10] = r3     // Catch:{ Throwable -> 0x01f3 }
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.applog.c.f28129a     // Catch:{ Throwable -> 0x01f3 }
            r18 = 0
            r19 = 15269(0x3ba5, float:2.1396E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x01f3 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3[r10] = r6     // Catch:{ Throwable -> 0x01f3 }
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            r15 = r5
            r16 = r4
            r20 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x01f3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x01f3 }
            goto L_0x0130
        L_0x00e0:
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x01f3 }
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.applog.c.f28129a     // Catch:{ Throwable -> 0x01f3 }
            r18 = 0
            r19 = 15273(0x3ba9, float:2.1402E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x01f3 }
            java.lang.Class r21 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x01f3 }
            r15 = r5
            r16 = r4
            r20 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x01f3 }
            if (r5 == 0) goto L_0x0113
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x01f3 }
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.applog.c.f28129a     // Catch:{ Throwable -> 0x01f3 }
            r18 = 0
            r19 = 15273(0x3ba9, float:2.1402E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x01f3 }
            java.lang.Class r21 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x01f3 }
            r15 = r5
            r16 = r4
            r20 = r6
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x01f3 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Throwable -> 0x01f3 }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x01f3 }
            goto L_0x0125
        L_0x0113:
            java.lang.String r5 = com.ss.android.d.a.a.a()     // Catch:{ Throwable -> 0x01f3 }
            android.content.SharedPreferences r5 = r4.c(r5)     // Catch:{ Throwable -> 0x01f3 }
            if (r5 != 0) goto L_0x011f
            r5 = 0
            goto L_0x0125
        L_0x011f:
            java.lang.String r6 = "session_interval"
            boolean r5 = r5.contains(r6)     // Catch:{ Throwable -> 0x01f3 }
        L_0x0125:
            if (r5 != 0) goto L_0x0128
            goto L_0x0130
        L_0x0128:
            java.lang.String r5 = "is_settings_cached"
            java.lang.String r6 = "1"
            java.lang.String r3 = r4.a(r3, r5, r6)     // Catch:{ Throwable -> 0x01f3 }
        L_0x0130:
            java.lang.String r4 = "https://"
            boolean r4 = r3.startsWith(r4)     // Catch:{ Throwable -> 0x01f3 }
            if (r4 == 0) goto L_0x013a
            r15 = 1
            goto L_0x013b
        L_0x013a:
            r15 = r0
        L_0x013b:
            android.content.Context r0 = r8.mContext     // Catch:{ Throwable -> 0x01a1 }
            if (r0 == 0) goto L_0x0175
            boolean r0 = getLogEncryptSwitch()     // Catch:{ Throwable -> 0x01a1 }
            if (r0 == 0) goto L_0x0175
            android.content.Context r0 = r8.mContext     // Catch:{ RuntimeException -> 0x014d }
            java.lang.String r0 = com.ss.android.common.applog.NetUtil.sendEncryptLog(r3, r2, r0, r9)     // Catch:{ RuntimeException -> 0x014d }
            goto L_0x01b1
        L_0x014d:
            if (r9 == 0) goto L_0x0163
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01a1 }
            r0.<init>()     // Catch:{ Throwable -> 0x01a1 }
            r0.append(r3)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r2 = "&config_retry=b"
            r0.append(r2)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x01a1 }
            r16 = r0
            goto L_0x0165
        L_0x0163:
            r16 = r3
        L_0x0165:
            com.bytedance.common.utility.NetworkClient r2 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x019d }
            r5 = 1
            java.lang.String r6 = "application/json; charset=utf-8"
            r7 = 0
            r3 = r16
            r4 = r1
            java.lang.String r0 = r2.post(r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x019d }
            goto L_0x01b1
        L_0x0175:
            if (r9 == 0) goto L_0x018b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01a1 }
            r0.<init>()     // Catch:{ Throwable -> 0x01a1 }
            r0.append(r3)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r2 = "&config_retry=b"
            r0.append(r2)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x01a1 }
            r16 = r0
            goto L_0x018d
        L_0x018b:
            r16 = r3
        L_0x018d:
            com.bytedance.common.utility.NetworkClient r2 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x019d }
            r5 = 1
            java.lang.String r6 = "application/json; charset=utf-8"
            r7 = 0
            r3 = r16
            r4 = r1
            java.lang.String r0 = r2.post(r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x019d }
            goto L_0x01b1
        L_0x019d:
            r0 = move-exception
            r3 = r16
            goto L_0x01a2
        L_0x01a1:
            r0 = move-exception
        L_0x01a2:
            java.lang.String r2 = "http://"
            boolean r2 = r3.startsWith(r2)     // Catch:{ Throwable -> 0x01f3 }
            if (r2 != 0) goto L_0x01af
            int r14 = r14 + 1
            r0 = r15
            goto L_0x0085
        L_0x01af:
            throw r0     // Catch:{ Throwable -> 0x01f3 }
        L_0x01b0:
            r0 = r13
        L_0x01b1:
            if (r0 == 0) goto L_0x01f2
            int r1 = r0.length()     // Catch:{ Throwable -> 0x01f3 }
            if (r1 != 0) goto L_0x01ba
            goto L_0x01f2
        L_0x01ba:
            if (r24 == 0) goto L_0x01c5
            com.ss.android.common.applog.af r1 = r8.mWifiBssidInfo     // Catch:{ Throwable -> 0x01f3 }
            if (r1 == 0) goto L_0x01c5
            com.ss.android.common.applog.af r1 = r8.mWifiBssidInfo     // Catch:{ Throwable -> 0x01f3 }
            r1.a()     // Catch:{ Throwable -> 0x01f3 }
        L_0x01c5:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01f3 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x01f3 }
            java.lang.String r0 = "ss_app_log"
            java.lang.String r2 = "magic_tag"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Throwable -> 0x01f3 }
            boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x01f3 }
            if (r0 != 0) goto L_0x01d9
            return r10
        L_0x01d9:
            com.ss.android.common.applog.AppLog$a r0 = new com.ss.android.common.applog.AppLog$a     // Catch:{ Throwable -> 0x01f3 }
            com.ss.android.common.applog.AppLog$b r2 = com.ss.android.common.applog.AppLog.b.CONFIG_UPDATE     // Catch:{ Throwable -> 0x01f3 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x01f3 }
            r0.f28023b = r1     // Catch:{ Throwable -> 0x01f3 }
            java.lang.String r1 = java.lang.String.valueOf(r25)     // Catch:{ Throwable -> 0x01f3 }
            r0.f28025d = r1     // Catch:{ Throwable -> 0x01f3 }
            if (r24 == 0) goto L_0x01ee
            r1 = 1
            r0.f28024c = r1     // Catch:{ Throwable -> 0x01f3 }
        L_0x01ee:
            r8.enqueue((com.ss.android.common.applog.AppLog.a) r0)     // Catch:{ Throwable -> 0x01f3 }
            return r11
        L_0x01f2:
            return r10
        L_0x01f3:
            r0 = move-exception
            boolean r0 = r8.isServer503Error(r0)
            if (r0 == 0) goto L_0x0203
            com.ss.android.common.applog.af r0 = r8.mWifiBssidInfo
            if (r0 == 0) goto L_0x0203
            com.ss.android.common.applog.af r0 = r8.mWifiBssidInfo
            r0.a()
        L_0x0203:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.doUpdateConfig(java.lang.String, boolean, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x024f A[Catch:{ Throwable -> 0x0280 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0141 A[Catch:{ Exception -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0152 A[Catch:{ Exception -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0166 A[Catch:{ Exception -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleConfigUpdate(org.json.JSONObject r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r9 = 3
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r18)
            r11 = 1
            r1[r11] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r19)
            r12 = 2
            r1[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 15417(0x3c39, float:2.1604E-41)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0060
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r18)
            r1[r11] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r19)
            r1[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15417(0x3c39, float:2.1604E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r6[r10] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r12] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0060:
            if (r0 != 0) goto L_0x0063
            return
        L_0x0063:
            long r1 = java.lang.System.currentTimeMillis()
            r8.mUpdateConfigTime = r1
            int r1 = r8.mVersionCode
            r8.mLastConfigVersion = r1
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = 0
            java.lang.String r5 = "server_time"
            long r5 = r0.optLong(r5)     // Catch:{ Exception -> 0x009b }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x009b
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x009b }
            r7.<init>()     // Catch:{ Exception -> 0x009b }
            java.lang.String r9 = "server_time"
            r7.put(r9, r5)     // Catch:{ Exception -> 0x009b }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x009b }
            long r5 = r5 / r1
            java.lang.String r9 = "local_time"
            r7.put(r9, r5)     // Catch:{ Exception -> 0x009b }
            r8.mTimeSync = r7     // Catch:{ Exception -> 0x009b }
            com.ss.android.common.applog.v r5 = r8.mLogReaper     // Catch:{ Exception -> 0x009b }
            if (r5 == 0) goto L_0x009b
            com.ss.android.common.applog.v r5 = r8.mLogReaper     // Catch:{ Exception -> 0x009b }
            org.json.JSONObject r6 = r8.mTimeSync     // Catch:{ Exception -> 0x009b }
            r5.f28213c = r6     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            java.lang.String r5 = "config"
            org.json.JSONObject r0 = r0.optJSONObject(r5)
            if (r0 != 0) goto L_0x00a8
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x00a8:
            r5 = r0
            r6 = 0
            java.lang.String r0 = "allow_push_list"
            org.json.JSONArray r0 = r5.optJSONArray(r0)     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r7 = sLock     // Catch:{ Exception -> 0x00c5 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x00c5 }
            java.util.HashSet<java.lang.Integer> r9 = r8.mAllowPushSet     // Catch:{ all -> 0x00c2 }
            r8.parseIntSet(r9, r0)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c5 }
            r8.mAllowPushListJsonStr = r0     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00c6
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00c5:
            r0 = r6
        L_0x00c6:
            java.lang.String r7 = "allow_old_image_sample"
            boolean r7 = optBoolean(r5, r7, r10)
            boolean r9 = r8.mAllowOldImageSample
            if (r7 == r9) goto L_0x00d4
            r8.mAllowOldImageSample = r7
            r7 = 1
            goto L_0x00d5
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            java.lang.String r9 = "session_interval"
            long r12 = r5.optLong(r9, r3)
            r14 = 15
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 < 0) goto L_0x00f3
            r14 = 300(0x12c, double:1.48E-321)
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x00f3
            long r12 = r12 * r1
            long r14 = r8.mSessionInterval
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x00f3
            r8.mSessionInterval = r12
            r9 = 1
            goto L_0x00f4
        L_0x00f3:
            r9 = 0
        L_0x00f4:
            java.lang.String r12 = "batch_event_interval"
            long r12 = r5.optLong(r12, r3)
            long r12 = r12 * r1
            long r1 = r8.mBatchEventInterval
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 == 0) goto L_0x010e
            r8.mBatchEventInterval = r12
            com.ss.android.common.applog.v r1 = r8.mLogReaper
            if (r1 == 0) goto L_0x010d
            com.ss.android.common.applog.v r1 = r8.mLogReaper
            r1.a((long) r12)
        L_0x010d:
            r9 = 1
        L_0x010e:
            java.lang.String r1 = "send_launch_timely"
            int r1 = r5.optInt(r1)
            int r2 = r8.mSendLaunchTimely
            if (r1 == r2) goto L_0x0125
            r8.mSendLaunchTimely = r1
            com.ss.android.common.applog.v r1 = r8.mLogReaper
            if (r1 == 0) goto L_0x0124
            com.ss.android.common.applog.v r1 = r8.mLogReaper
            int r2 = r8.mSendLaunchTimely
            r1.f28212b = r2
        L_0x0124:
            r9 = 1
        L_0x0125:
            java.lang.String r1 = "image_sampling_ratio"
            org.json.JSONObject r1 = r5.optJSONObject(r1)     // Catch:{ Exception -> 0x0138 }
            if (r1 == 0) goto L_0x0138
            boolean r2 = r8.parseImageSampleRatio(r1)     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x0138
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0138 }
            goto L_0x0139
        L_0x0138:
            r1 = r6
        L_0x0139:
            java.lang.String r2 = "image_error_report"
            org.json.JSONObject r2 = r5.optJSONObject(r2)     // Catch:{ Exception -> 0x0149 }
            if (r2 == 0) goto L_0x0149
            r8.parseImageErrorReport(r2)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0149 }
            goto L_0x014a
        L_0x0149:
            r2 = r6
        L_0x014a:
            java.lang.String r12 = "image_error_codes"
            org.json.JSONArray r12 = r5.optJSONArray(r12)     // Catch:{ Exception -> 0x015d }
            if (r12 == 0) goto L_0x015d
            java.util.HashSet r13 = r8.parseIntSet(r12)     // Catch:{ Exception -> 0x015d }
            r8.mImageErrorCodes = r13     // Catch:{ Exception -> 0x015d }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x015d }
            goto L_0x015e
        L_0x015d:
            r12 = r6
        L_0x015e:
            java.lang.String r13 = "fingerprint_codes"
            org.json.JSONArray r13 = r5.optJSONArray(r13)     // Catch:{ Exception -> 0x0171 }
            if (r13 == 0) goto L_0x0171
            java.util.HashSet r14 = r8.parseIntSet(r13)     // Catch:{ Exception -> 0x0171 }
            r8.mFingerprintSet = r14     // Catch:{ Exception -> 0x0171 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0171 }
            r6 = r13
        L_0x0171:
            r13 = r6
            if (r18 == 0) goto L_0x017c
            long r14 = java.lang.System.currentTimeMillis()
            r8.mSendFingerprintTime = r14
            r6 = 1
            goto L_0x017d
        L_0x017c:
            r6 = 0
        L_0x017d:
            java.lang.String r14 = "http_monitor_port"
            int r14 = r5.optInt(r14)
            if (r14 <= 0) goto L_0x018d
            int r15 = r8.mHttpMonitorPort
            if (r14 == r15) goto L_0x018d
            r8.mHttpMonitorPort = r14
            r14 = 1
            goto L_0x018e
        L_0x018d:
            r14 = 0
        L_0x018e:
            java.lang.String r15 = "switch_applog_https_to_http"
            int r15 = r5.optInt(r15, r10)
            int r3 = sAppLogHttpsToHttp
            if (r15 == r3) goto L_0x019c
            sAppLogHttpsToHttp = r15
            r3 = 1
            goto L_0x019d
        L_0x019c:
            r3 = 0
        L_0x019d:
            java.lang.String r4 = "forbid_report_phone_detail_info"
            r15 = -1
            int r4 = r5.optInt(r4, r15)
            android.content.Context r15 = r8.mContext
            java.lang.String r11 = com.ss.android.d.a.a.a()
            android.content.SharedPreferences r11 = com.ss.android.ugc.aweme.q.c.a(r15, r11, r10)
            android.content.SharedPreferences$Editor r11 = r11.edit()
            if (r4 < 0) goto L_0x01d6
            java.lang.String r15 = "forbid_report_phone_detail_info"
            r11.putInt(r15, r4)
            if (r4 <= 0) goto L_0x01bd
            r4 = 1
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            r8.mForbidReportPhoneDetailInfo = r4
            boolean r4 = r8.mForbidReportPhoneDetailInfo
            com.ss.android.d.d.a((boolean) r4)
            org.json.JSONObject r4 = r8.mHeader
            com.ss.android.d.a.d.a((org.json.JSONObject) r4)
            r16.ensureHeaderCopy()
            com.ss.android.common.applog.v r4 = r8.mLogReaper
            if (r4 == 0) goto L_0x01d6
            com.ss.android.common.applog.v r4 = r8.mLogReaper
            r4.a()
        L_0x01d6:
            if (r9 == 0) goto L_0x01ed
            java.lang.String r4 = "session_interval"
            long r9 = r8.mSessionInterval
            r11.putLong(r4, r9)
            java.lang.String r4 = "batch_event_interval"
            long r9 = r8.mBatchEventInterval
            r11.putLong(r4, r9)
            java.lang.String r4 = "send_launch_timely"
            int r9 = r8.mSendLaunchTimely
            r11.putInt(r4, r9)
        L_0x01ed:
            if (r1 == 0) goto L_0x01f4
            java.lang.String r4 = "image_sampling_ratio"
            r11.putString(r4, r1)
        L_0x01f4:
            if (r2 == 0) goto L_0x01fb
            java.lang.String r1 = "image_error_report"
            r11.putString(r1, r2)
        L_0x01fb:
            if (r12 == 0) goto L_0x0202
            java.lang.String r1 = "image_error_codes"
            r11.putString(r1, r12)
        L_0x0202:
            if (r13 == 0) goto L_0x0209
            java.lang.String r1 = "fingerprint_codes"
            r11.putString(r1, r13)
        L_0x0209:
            if (r0 == 0) goto L_0x0210
            java.lang.String r1 = "allow_push_list"
            r11.putString(r1, r0)
        L_0x0210:
            if (r7 == 0) goto L_0x0219
            java.lang.String r0 = "allow_old_image_sample"
            boolean r1 = r8.mAllowOldImageSample
            r11.putBoolean(r0, r1)
        L_0x0219:
            if (r6 == 0) goto L_0x0222
            java.lang.String r0 = "send_fingerprint_time"
            long r1 = r8.mSendFingerprintTime
            r11.putLong(r0, r1)
        L_0x0222:
            if (r14 == 0) goto L_0x022b
            java.lang.String r0 = "http_monitor_port"
            int r1 = r8.mHttpMonitorPort
            r11.putInt(r0, r1)
        L_0x022b:
            if (r3 == 0) goto L_0x0234
            java.lang.String r0 = "switch_applog_https_to_http"
            int r1 = sAppLogHttpsToHttp
            r11.putInt(r0, r1)
        L_0x0234:
            java.lang.String r0 = "app_log_last_config_time"
            long r1 = r8.mUpdateConfigTime
            r11.putLong(r0, r1)
            java.lang.String r0 = "app_log_last_config_version"
            int r1 = r8.mLastConfigVersion
            r11.putInt(r0, r1)
            java.lang.String r0 = "real_time_events"
            org.json.JSONArray r0 = r5.optJSONArray(r0)     // Catch:{ Throwable -> 0x0280 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r8.mEventTimely     // Catch:{ Throwable -> 0x0280 }
            r1.clear()     // Catch:{ Throwable -> 0x0280 }
            if (r0 == 0) goto L_0x027a
            int r1 = r0.length()     // Catch:{ Throwable -> 0x0280 }
            if (r1 <= 0) goto L_0x027a
            int r1 = r0.length()     // Catch:{ Throwable -> 0x0280 }
            r2 = 0
        L_0x025a:
            if (r2 >= r1) goto L_0x0270
            java.lang.String r3 = r0.getString(r2)     // Catch:{ Throwable -> 0x0280 }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0280 }
            if (r4 != 0) goto L_0x026d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r4 = r8.mEventTimely     // Catch:{ Throwable -> 0x0280 }
            java.lang.String r6 = "timely"
            r4.put(r3, r6)     // Catch:{ Throwable -> 0x0280 }
        L_0x026d:
            int r2 = r2 + 1
            goto L_0x025a
        L_0x0270:
            java.lang.String r1 = "real_time_events"
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0280 }
            r11.putString(r1, r0)     // Catch:{ Throwable -> 0x0280 }
            goto L_0x0281
        L_0x027a:
            java.lang.String r0 = "real_time_events"
            r11.remove(r0)     // Catch:{ Throwable -> 0x0280 }
            goto L_0x0281
        L_0x0280:
        L_0x0281:
            r11.commit()
            r8.handleConfigUpdate(r5)
            r16.notifyConfigUpdate()
            android.content.Context r0 = r8.mContext
            com.ss.android.common.applog.g r0 = com.ss.android.common.applog.g.a((android.content.Context) r0)
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x02ef
            android.content.Context r0 = r8.mContext
            com.ss.android.common.applog.g r0 = com.ss.android.common.applog.g.a((android.content.Context) r0)
            boolean r0 = r0.h
            if (r0 != 0) goto L_0x02ef
            android.content.Context r0 = r8.mContext
            com.ss.android.common.applog.g r0 = com.ss.android.common.applog.g.a((android.content.Context) r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r1)
            r4 = 0
            r2[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.common.applog.g.f28152a
            r5 = 0
            r6 = 15487(0x3c7f, float:2.1702E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r7[r4] = r1
            java.lang.Class r9 = java.lang.Void.TYPE
            r1 = r2
            r2 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x02e8
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r1)
            r4 = 0
            r2[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.common.applog.g.f28152a
            r5 = 0
            r6 = 15487(0x3c7f, float:2.1702E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r7[r4] = r1
            java.lang.Class r9 = java.lang.Void.TYPE
            r1 = r2
            r2 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02ef
        L_0x02e8:
            r1 = 1
            r0.h = r1
            r0.d()
            goto L_0x02f0
        L_0x02ef:
            r1 = 1
        L_0x02f0:
            if (r19 == 0) goto L_0x030c
            boolean r0 = r8.mHasTryResendConfig
            if (r0 != 0) goto L_0x030c
            long r2 = r8.mSendFingerprintTime
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x030c
            r8.mHasTryResendConfig = r1
            java.util.HashSet<java.lang.Integer> r0 = r8.mFingerprintSet
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x030c
            r2 = 0
            r8.tryUpdateConfig(r1, r1, r2)
        L_0x030c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.handleConfigUpdate(org.json.JSONObject, boolean, boolean):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01ec */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0143 A[Catch:{ Exception -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145 A[Catch:{ Exception -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0148 A[Catch:{ Exception -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0151 A[Catch:{ Exception -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f0 A[Catch:{ Exception -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0205 A[Catch:{ Exception -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020e A[Catch:{ Exception -> 0x0212 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void tryUpdateConfig(boolean r21, boolean r22, boolean r23) {
        /*
            r20 = this;
            r7 = r20
            r8 = r23
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r10 = 0
            r0[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r11 = 1
            r0[r11] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r23)
            r12 = 2
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 15439(0x3c4f, float:2.1635E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0068
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r0[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r0[r11] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r23)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 15439(0x3c4f, float:2.1635E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0068:
            boolean r0 = r7.mLoadingOnlineConfig
            if (r0 == 0) goto L_0x006d
            return
        L_0x006d:
            org.json.JSONObject r0 = r7.mHeader
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            org.json.JSONObject r0 = r7.mHeader
            java.lang.String r1 = "device_id"
            r2 = 0
            java.lang.String r0 = r0.optString(r1, r2)
            boolean r0 = isBadDeviceId(r0)
            if (r0 == 0) goto L_0x0082
            return
        L_0x0082:
            org.json.JSONObject r0 = r7.mHeader
            java.lang.String r1 = "install_id"
            java.lang.String r0 = r0.optString(r1, r2)
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0091
            return
        L_0x0091:
            long r0 = java.lang.System.currentTimeMillis()
            r5 = 60000(0xea60, double:2.9644E-319)
            int r9 = r7.mLastConfigVersion
            int r12 = r7.mVersionCode
            if (r9 != r12) goto L_0x00a0
            r9 = 1
            goto L_0x00a1
        L_0x00a0:
            r9 = 0
        L_0x00a1:
            boolean r12 = sInitWithActivity
            if (r12 != 0) goto L_0x00b3
            long r2 = r7.mActivityTime
            r18 = 0
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
            if (r9 == 0) goto L_0x00b3
            r16 = 43200000(0x2932e00, double:2.1343636E-316)
            goto L_0x00b6
        L_0x00b3:
            r16 = 21600000(0x1499700, double:1.0671818E-316)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r5 = 180000(0x2bf20, double:8.8932E-319)
        L_0x00bb:
            boolean r2 = r20.isBssidAllowUpload()
            if (r2 != 0) goto L_0x00e6
            if (r22 != 0) goto L_0x00d5
            long r3 = r7.mUpdateConfigTime
            long r3 = r0 - r3
            int r9 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r9 >= 0) goto L_0x00cc
            return
        L_0x00cc:
            long r3 = r7.mTryUpdateConfigTime
            long r3 = r0 - r3
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x00e6
            return
        L_0x00d5:
            long r3 = r7.mTryUpdateConfigTime
            long r13 = r7.mUpdateConfigTime
            int r9 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e6
            long r3 = r7.mTryUpdateConfigTime
            long r3 = r0 - r3
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x00e6
            return
        L_0x00e6:
            android.content.Context r3 = r7.mContext     // Catch:{ Exception -> 0x0212 }
            boolean r3 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r3)     // Catch:{ Exception -> 0x0212 }
            if (r3 != 0) goto L_0x00ef
            return
        L_0x00ef:
            r7.mTryUpdateConfigTime = r0     // Catch:{ Exception -> 0x0212 }
            r7.mLoadingOnlineConfig = r11     // Catch:{ Exception -> 0x0212 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0212 }
            org.json.JSONObject r4 = r7.mHeader     // Catch:{ Exception -> 0x0212 }
            java.lang.String[] r5 = HEADER_KEYS     // Catch:{ Exception -> 0x0212 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0212 }
            android.content.Context r4 = r7.mContext     // Catch:{ Exception -> 0x0212 }
            java.lang.String r4 = com.ss.android.d.a.d.b(r4)     // Catch:{ Exception -> 0x0212 }
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0212 }
            if (r5 != 0) goto L_0x010d
            java.lang.String r5 = "user_agent"
            r3.put(r5, r4)     // Catch:{ Exception -> 0x0212 }
        L_0x010d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0212 }
            r4.<init>()     // Catch:{ Exception -> 0x0212 }
            java.lang.String r5 = "magic_tag"
            java.lang.String r6 = "ss_app_log"
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r5 = "header"
            r4.put(r5, r3)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r3 = "_gen_time"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0212 }
            r4.put(r3, r5)     // Catch:{ Exception -> 0x0212 }
            long r5 = r7.mSendFingerprintTime     // Catch:{ Exception -> 0x0212 }
            r3 = 0
            long r0 = r0 - r5
            r5 = 43200000(0x2932e00, double:2.1343636E-316)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0137
            if (r2 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r15 = 0
            goto L_0x0141
        L_0x0137:
            r20.tryGetFingerPrint()     // Catch:{ Exception -> 0x0212 }
            org.json.JSONObject r0 = r7.mFingerprint     // Catch:{ Exception -> 0x0212 }
            java.lang.String r2 = packJsonObject(r0)     // Catch:{ Exception -> 0x0212 }
            r15 = r2
        L_0x0141:
            if (r15 == 0) goto L_0x0145
            r0 = 1
            goto L_0x0146
        L_0x0145:
            r0 = 0
        L_0x0146:
            if (r15 == 0) goto L_0x014d
            java.lang.String r1 = "fingerprint"
            r4.put(r1, r15)     // Catch:{ Exception -> 0x0212 }
        L_0x014d:
            boolean r1 = com.ss.android.common.applog.g.f28153b     // Catch:{ Exception -> 0x01ec }
            if (r1 == 0) goto L_0x01ec
            android.content.Context r1 = r7.mContext     // Catch:{ Exception -> 0x01ec }
            com.ss.android.common.applog.g r1 = com.ss.android.common.applog.g.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01ec }
            r1.i = r10     // Catch:{ Exception -> 0x01ec }
            android.content.Context r1 = r7.mContext     // Catch:{ Exception -> 0x01ec }
            com.ss.android.common.applog.g r1 = com.ss.android.common.applog.g.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01ec }
            long r2 = r1.f28156e     // Catch:{ Exception -> 0x01ec }
            r5 = -1
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x016f
            long r1 = r1.g     // Catch:{ Exception -> 0x01ec }
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x016f
            r1 = 1
            goto L_0x0170
        L_0x016f:
            r1 = 0
        L_0x0170:
            if (r1 != 0) goto L_0x01be
            android.content.Context r1 = r7.mContext     // Catch:{ Exception -> 0x01ec }
            com.ss.android.common.applog.g r1 = com.ss.android.common.applog.g.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01ec }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x01ec }
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.common.applog.g.f28152a     // Catch:{ Exception -> 0x01ec }
            r15 = 0
            r16 = 15490(0x3c82, float:2.1706E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x01ec }
            java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x01ec }
            r13 = r1
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x01ec }
            if (r2 == 0) goto L_0x019e
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x01ec }
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.common.applog.g.f28152a     // Catch:{ Exception -> 0x01ec }
            r15 = 0
            r16 = 15490(0x3c82, float:2.1706E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x01ec }
            java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x01ec }
            r13 = r1
            r17 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x01ec }
            goto L_0x01ec
        L_0x019e:
            java.lang.ref.WeakReference<android.content.Context> r2 = r1.k     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x01ec }
            if (r2 == 0) goto L_0x01ec
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.j     // Catch:{ Exception -> 0x01ec }
            boolean r2 = r2.compareAndSet(r10, r11)     // Catch:{ Exception -> 0x01ec }
            if (r2 == 0) goto L_0x01ec
            com.ss.android.common.applog.g$1 r2 = new com.ss.android.common.applog.g$1     // Catch:{ Exception -> 0x01ec }
            r2.<init>()     // Catch:{ Exception -> 0x01ec }
            com.bytedance.common.utility.concurrent.ThreadPlus r1 = new com.bytedance.common.utility.concurrent.ThreadPlus     // Catch:{ Exception -> 0x01ec }
            java.lang.String r3 = "get_apk_install_info"
            r1.<init>(r2, r3, r11)     // Catch:{ Exception -> 0x01ec }
            r1.start()     // Catch:{ Exception -> 0x01ec }
            goto L_0x01ec
        L_0x01be:
            android.content.Context r1 = r7.mContext     // Catch:{ Exception -> 0x01ec }
            com.ss.android.common.applog.g r1 = com.ss.android.common.applog.g.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01ec }
            boolean r1 = r1.h     // Catch:{ Exception -> 0x01ec }
            if (r1 == 0) goto L_0x01d3
            android.content.Context r1 = r7.mContext     // Catch:{ Exception -> 0x01ec }
            com.ss.android.common.applog.g r1 = com.ss.android.common.applog.g.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01ec }
            org.json.JSONObject r1 = r1.b()     // Catch:{ Exception -> 0x01ec }
            goto L_0x01e5
        L_0x01d3:
            android.content.Context r1 = r7.mContext     // Catch:{ Exception -> 0x01ec }
            com.ss.android.common.applog.g r1 = com.ss.android.common.applog.g.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01ec }
            org.json.JSONObject r1 = r1.a()     // Catch:{ Exception -> 0x01ec }
            android.content.Context r2 = r7.mContext     // Catch:{ Exception -> 0x01ec }
            com.ss.android.common.applog.g r2 = com.ss.android.common.applog.g.a((android.content.Context) r2)     // Catch:{ Exception -> 0x01ec }
            r2.i = r11     // Catch:{ Exception -> 0x01ec }
        L_0x01e5:
            if (r1 == 0) goto L_0x01ec
            java.lang.String r2 = "app_install_info"
            r4.put(r2, r1)     // Catch:{ Exception -> 0x01ec }
        L_0x01ec:
            boolean r1 = mCollectFreeSpace     // Catch:{ Exception -> 0x0212 }
            if (r1 == 0) goto L_0x01ff
            com.ss.android.common.applog.AppLog$f r1 = mFreeSpaceCollector     // Catch:{ Exception -> 0x0212 }
            if (r1 == 0) goto L_0x01ff
            org.json.JSONObject r1 = r1.a()     // Catch:{ Exception -> 0x0212 }
            if (r1 == 0) goto L_0x01ff
            java.lang.String r2 = "photoinfo"
            r4.put(r2, r1)     // Catch:{ Exception -> 0x0212 }
        L_0x01ff:
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0212 }
            if (r21 == 0) goto L_0x020e
            com.ss.android.common.applog.AppLog$8 r2 = new com.ss.android.common.applog.AppLog$8     // Catch:{ Exception -> 0x0212 }
            r2.<init>(r1, r0, r8)     // Catch:{ Exception -> 0x0212 }
            r2.start()     // Catch:{ Exception -> 0x0212 }
            goto L_0x0212
        L_0x020e:
            r7.updateConfig(r1, r0, r8)     // Catch:{ Exception -> 0x0212 }
            return
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.tryUpdateConfig(boolean, boolean, boolean):void");
    }

    public static void setPushCustomValues(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        sMiPushInclude = z;
        sUmengPushInclude = z2;
        sHwPushInclude = z3;
        sMzPushInclude = z4;
        sAliyunPushInclude = z5;
    }

    @Deprecated
    public static void onImageSample(String str, long j2, long j3, int i2, String str2, Throwable th) {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                appLog.onImageSample(System.currentTimeMillis(), str, j2, j3, i2, str2, th);
            }
        }
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5)}, null, changeQuickRedirect, true, 15345, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5)}, null, changeQuickRedirect, true, 15345, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        onEvent(context, str, str2, str3, j2, j3, false, null);
    }

    public void onDeviceRegisterEvent(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5), jSONObject}, this, changeQuickRedirect, false, 15342, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5), jSONObject}, this, changeQuickRedirect, false, 15342, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        onEvent(context, str, str2, str3, j2, j3, false, jSONObject);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5), jSONObject}, null, changeQuickRedirect, true, 15343, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5), jSONObject}, null, changeQuickRedirect, true, 15343, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        onEvent(context, str, str2, str3, j2, j3, false, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021c, code lost:
        r0.f28040d = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0226, code lost:
        if (r0.f28040d >= Integer.MAX_VALUE) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0228, code lost:
        r0.f28040d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0231, code lost:
        if (r0.f28040d < r5.f28036f) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0233, code lost:
        r0.f28038b = true;
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0238, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0239, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023b, code lost:
        r0 = 0;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0166, code lost:
        if (r6 <= 0) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016a, code lost:
        if (r6 >= 100) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r7 = r8.mImageErrorCodes;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016e, code lost:
        if (r7 == null) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0178, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r33)) == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017a, code lost:
        r3 = r8.mImageErrorStatusMap;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017c, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r7 = r8.mImageErrorStatusMap.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0185, code lost:
        if (r7 != null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0187, code lost:
        r7 = new com.ss.android.common.applog.AppLog.l(r1);
        r8.mImageErrorStatusMap.put(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0193, code lost:
        if (r7.f28038b == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019f, code lost:
        if ((r11 - r7.f28039c) < ((long) r5.f28034d)) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a1, code lost:
        r7.f28040d = 0;
        r7.f28038b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a8, code lost:
        if (r7.f28038b != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01aa, code lost:
        r7.f28039c = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b5, code lost:
        if ((r11 - r7.f28039c) <= ((long) r5.f28032b)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b7, code lost:
        r7.f28040d = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c1, code lost:
        if (r7.f28040d >= Integer.MAX_VALUE) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        r7.f28040d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cc, code lost:
        if (r7.f28040d < r5.f28033c) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ce, code lost:
        r7.f28038b = true;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d3, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d4, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d5, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dd, code lost:
        if (r6 <= 300) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r3 = r8.mImageHttpErrorStatusMap;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e1, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r0 = r8.mImageHttpErrorStatusMap.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ea, code lost:
        if (r0 != null) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ec, code lost:
        r0 = new com.ss.android.common.applog.AppLog.l(r1);
        r8.mImageHttpErrorStatusMap.put(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f8, code lost:
        if (r0.f28038b == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0204, code lost:
        if ((r11 - r0.f28039c) < ((long) r5.g)) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0206, code lost:
        r0.f28040d = 0;
        r0.f28038b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020d, code lost:
        if (r0.f28038b != false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x020f, code lost:
        r0.f28039c = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021a, code lost:
        if ((r11 - r0.f28039c) <= ((long) r5.f28035e)) goto L_0x0220;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x029d A[Catch:{ Throwable -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c8 A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02d6 A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02e8 A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02fb A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0300 A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0308 A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x030d A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x032d A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0338 A[Catch:{ Throwable -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014e A[SYNTHETIC, Splitter:B:39:0x014e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageSample(long r26, java.lang.String r28, long r29, long r31, int r33, java.lang.String r34, java.lang.Throwable r35) {
        /*
            r25 = this;
            r8 = r25
            r9 = r26
            r11 = r29
            r13 = r31
            r15 = r33
            r7 = r35
            r6 = 7
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r5 = 0
            r1[r5] = r2
            r4 = 1
            r1[r4] = r28
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r11)
            r16 = 2
            r1[r16] = r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r13)
            r17 = 3
            r1[r17] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r33)
            r3 = 4
            r1[r3] = r2
            r18 = 5
            r1[r18] = r34
            r19 = 6
            r1[r19] = r7
            com.meituan.robust.ChangeQuickRedirect r20 = changeQuickRedirect
            java.lang.Class[] r2 = new java.lang.Class[r6]
            java.lang.Class r21 = java.lang.Long.TYPE
            r2[r5] = r21
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            r2[r4] = r21
            java.lang.Class r21 = java.lang.Long.TYPE
            r2[r16] = r21
            java.lang.Class r21 = java.lang.Long.TYPE
            r2[r17] = r21
            java.lang.Class r21 = java.lang.Integer.TYPE
            r2[r3] = r21
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            r2[r18] = r21
            java.lang.Class<java.lang.Throwable> r21 = java.lang.Throwable.class
            r2[r19] = r21
            java.lang.Class r21 = java.lang.Void.TYPE
            r22 = 0
            r23 = 15391(0x3c1f, float:2.1567E-41)
            r24 = r2
            r2 = r25
            r3 = r20
            r15 = 1
            r4 = r22
            r15 = 0
            r5 = r23
            r15 = 7
            r6 = r24
            r7 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00d9
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r28
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r11)
            r1[r16] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r13)
            r1[r17] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r33)
            r2 = 4
            r1[r2] = r0
            r1[r18] = r34
            r3 = r35
            r1[r19] = r3
            com.meituan.robust.ChangeQuickRedirect r0 = changeQuickRedirect
            r3 = 0
            r4 = 15391(0x3c1f, float:2.1567E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class r6 = java.lang.Long.TYPE
            r7 = 0
            r5[r7] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 1
            r5[r7] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r5[r16] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r5[r17] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r2] = r6
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r5[r18] = r2
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r5[r19] = r2
            java.lang.Class r2 = java.lang.Void.TYPE
            r26 = r1
            r27 = r25
            r28 = r0
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r26, r27, r28, r29, r30, r31, r32)
            return
        L_0x00d9:
            r2 = 4
            r3 = r35
            r7 = 1
            if (r28 == 0) goto L_0x0346
            int r1 = r28.length()
            if (r1 != 0) goto L_0x00e7
            goto L_0x0346
        L_0x00e7:
            java.net.URI r1 = java.net.URI.create(r28)     // Catch:{ Throwable -> 0x0344 }
            java.lang.String r1 = r1.getHost()     // Catch:{ Throwable -> 0x0344 }
            if (r1 == 0) goto L_0x0342
            int r4 = r1.length()     // Catch:{ Throwable -> 0x0344 }
            if (r4 != 0) goto L_0x00f9
            goto L_0x0342
        L_0x00f9:
            android.content.Context r4 = r8.mContext     // Catch:{ Throwable -> 0x0344 }
            com.bytedance.common.utility.NetworkUtils$NetworkType r4 = com.bytedance.common.utility.NetworkUtils.getNetworkType(r4)     // Catch:{ Throwable -> 0x0344 }
            r5 = 11
            r6 = r33
            r15 = 1
            if (r6 != r5) goto L_0x010b
            com.bytedance.common.utility.NetworkUtils$NetworkType r5 = com.bytedance.common.utility.NetworkUtils.NetworkType.NONE     // Catch:{ Throwable -> 0x0344 }
            if (r4 != r5) goto L_0x010b
            return
        L_0x010b:
            java.util.List<com.ss.android.common.applog.AppLog$p> r5 = r8.mImageRatioList     // Catch:{ Throwable -> 0x0344 }
            if (r5 == 0) goto L_0x0130
            if (r4 == 0) goto L_0x0130
            com.bytedance.common.utility.NetworkUtils$NetworkType r7 = com.bytedance.common.utility.NetworkUtils.NetworkType.NONE     // Catch:{ Throwable -> 0x0344 }
            if (r4 == r7) goto L_0x0130
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x0344 }
        L_0x0119:
            boolean r7 = r5.hasNext()     // Catch:{ Throwable -> 0x0344 }
            if (r7 == 0) goto L_0x0130
            java.lang.Object r7 = r5.next()     // Catch:{ Throwable -> 0x0344 }
            com.ss.android.common.applog.AppLog$p r7 = (com.ss.android.common.applog.AppLog.p) r7     // Catch:{ Throwable -> 0x0344 }
            java.lang.String r2 = r7.f28050a     // Catch:{ Throwable -> 0x0344 }
            boolean r2 = r2.equals(r1)     // Catch:{ Throwable -> 0x0344 }
            if (r2 == 0) goto L_0x012e
            goto L_0x0131
        L_0x012e:
            r2 = 4
            goto L_0x0119
        L_0x0130:
            r7 = 0
        L_0x0131:
            if (r7 == 0) goto L_0x0141
            double r2 = r7.f28051b     // Catch:{ Throwable -> 0x0344 }
            java.util.Random r5 = r8.mRandom     // Catch:{ Throwable -> 0x0344 }
            double r16 = r5.nextDouble()     // Catch:{ Throwable -> 0x0344 }
            int r5 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x0141
            r2 = 1
            goto L_0x0142
        L_0x0141:
            r2 = 0
        L_0x0142:
            java.util.List<com.ss.android.common.applog.AppLog$k> r3 = r8.mImageErrorList     // Catch:{ Throwable -> 0x0344 }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0344 }
            r18 = 1000(0x3e8, double:4.94E-321)
            long r11 = r16 / r18
            if (r3 == 0) goto L_0x024c
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x0248 }
        L_0x0152:
            boolean r5 = r3.hasNext()     // Catch:{ Throwable -> 0x0248 }
            if (r5 == 0) goto L_0x024c
            java.lang.Object r5 = r3.next()     // Catch:{ Throwable -> 0x0248 }
            com.ss.android.common.applog.AppLog$k r5 = (com.ss.android.common.applog.AppLog.k) r5     // Catch:{ Throwable -> 0x0248 }
            java.lang.String r7 = r5.f28031a     // Catch:{ Throwable -> 0x0248 }
            boolean r7 = r7.equals(r1)     // Catch:{ Throwable -> 0x0248 }
            if (r7 == 0) goto L_0x0242
            if (r6 <= 0) goto L_0x01db
            r7 = 100
            if (r6 >= r7) goto L_0x01db
            java.util.HashSet<java.lang.Integer> r7 = r8.mImageErrorCodes     // Catch:{ Throwable -> 0x0344 }
            if (r7 == 0) goto L_0x024c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r33)     // Catch:{ Throwable -> 0x0344 }
            boolean r3 = r7.contains(r3)     // Catch:{ Throwable -> 0x0344 }
            if (r3 == 0) goto L_0x024c
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$l> r3 = r8.mImageErrorStatusMap     // Catch:{ Throwable -> 0x0344 }
            monitor-enter(r3)     // Catch:{ Throwable -> 0x0344 }
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$l> r7 = r8.mImageErrorStatusMap     // Catch:{ all -> 0x01d8 }
            java.lang.Object r7 = r7.get(r1)     // Catch:{ all -> 0x01d8 }
            com.ss.android.common.applog.AppLog$l r7 = (com.ss.android.common.applog.AppLog.l) r7     // Catch:{ all -> 0x01d8 }
            if (r7 != 0) goto L_0x0191
            com.ss.android.common.applog.AppLog$l r7 = new com.ss.android.common.applog.AppLog$l     // Catch:{ all -> 0x01d8 }
            r7.<init>(r1)     // Catch:{ all -> 0x01d8 }
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$l> r15 = r8.mImageErrorStatusMap     // Catch:{ all -> 0x01d8 }
            r15.put(r1, r7)     // Catch:{ all -> 0x01d8 }
        L_0x0191:
            boolean r1 = r7.f28038b     // Catch:{ all -> 0x01d8 }
            if (r1 == 0) goto L_0x01a6
            long r0 = r7.f28039c     // Catch:{ all -> 0x01d8 }
            r15 = 0
            long r0 = r11 - r0
            int r15 = r5.f28034d     // Catch:{ all -> 0x01d8 }
            long r13 = (long) r15     // Catch:{ all -> 0x01d8 }
            int r15 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x01a6
            r0 = 0
            r7.f28040d = r0     // Catch:{ all -> 0x01d8 }
            r7.f28038b = r0     // Catch:{ all -> 0x01d8 }
        L_0x01a6:
            boolean r0 = r7.f28038b     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x01d3
            r7.f28039c = r11     // Catch:{ all -> 0x01d8 }
            long r0 = r7.f28039c     // Catch:{ all -> 0x01d8 }
            r13 = 0
            long r11 = r11 - r0
            int r0 = r5.f28032b     // Catch:{ all -> 0x01d8 }
            long r0 = (long) r0     // Catch:{ all -> 0x01d8 }
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x01bb
            r0 = 1
            r7.f28040d = r0     // Catch:{ all -> 0x01d8 }
            goto L_0x01c8
        L_0x01bb:
            r0 = 1
            int r1 = r7.f28040d     // Catch:{ all -> 0x01d8 }
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r11) goto L_0x01c8
            int r1 = r7.f28040d     // Catch:{ all -> 0x01d8 }
            int r1 = r1 + r0
            r7.f28040d = r1     // Catch:{ all -> 0x01d8 }
        L_0x01c8:
            int r0 = r7.f28040d     // Catch:{ all -> 0x01d8 }
            int r1 = r5.f28033c     // Catch:{ all -> 0x01d8 }
            if (r0 < r1) goto L_0x01d3
            r0 = 1
            r7.f28038b = r0     // Catch:{ all -> 0x01d8 }
            r5 = 1
            goto L_0x01d4
        L_0x01d3:
            r5 = 0
        L_0x01d4:
            monitor-exit(r3)     // Catch:{ all -> 0x01d8 }
            r0 = 0
            goto L_0x024e
        L_0x01d8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01d8 }
            throw r0     // Catch:{ Throwable -> 0x0344 }
        L_0x01db:
            r0 = 300(0x12c, float:4.2E-43)
            if (r6 <= r0) goto L_0x024c
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$l> r3 = r8.mImageHttpErrorStatusMap     // Catch:{ Throwable -> 0x0248 }
            monitor-enter(r3)     // Catch:{ Throwable -> 0x0248 }
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$l> r0 = r8.mImageHttpErrorStatusMap     // Catch:{ all -> 0x023f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x023f }
            com.ss.android.common.applog.AppLog$l r0 = (com.ss.android.common.applog.AppLog.l) r0     // Catch:{ all -> 0x023f }
            if (r0 != 0) goto L_0x01f6
            com.ss.android.common.applog.AppLog$l r0 = new com.ss.android.common.applog.AppLog$l     // Catch:{ all -> 0x023f }
            r0.<init>(r1)     // Catch:{ all -> 0x023f }
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$l> r7 = r8.mImageHttpErrorStatusMap     // Catch:{ all -> 0x023f }
            r7.put(r1, r0)     // Catch:{ all -> 0x023f }
        L_0x01f6:
            boolean r1 = r0.f28038b     // Catch:{ all -> 0x023f }
            if (r1 == 0) goto L_0x020b
            long r13 = r0.f28039c     // Catch:{ all -> 0x023f }
            r1 = 0
            long r13 = r11 - r13
            int r1 = r5.g     // Catch:{ all -> 0x023f }
            long r7 = (long) r1     // Catch:{ all -> 0x023f }
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x020b
            r1 = 0
            r0.f28040d = r1     // Catch:{ all -> 0x023f }
            r0.f28038b = r1     // Catch:{ all -> 0x023f }
        L_0x020b:
            boolean r1 = r0.f28038b     // Catch:{ all -> 0x023f }
            if (r1 != 0) goto L_0x023b
            r0.f28039c = r11     // Catch:{ all -> 0x023f }
            long r7 = r0.f28039c     // Catch:{ all -> 0x023f }
            r1 = 0
            long r11 = r11 - r7
            int r1 = r5.f28035e     // Catch:{ all -> 0x023f }
            long r7 = (long) r1     // Catch:{ all -> 0x023f }
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0220
            r1 = 1
            r0.f28040d = r1     // Catch:{ all -> 0x023f }
            goto L_0x022d
        L_0x0220:
            r1 = 1
            int r7 = r0.f28040d     // Catch:{ all -> 0x023f }
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r7 >= r8) goto L_0x022d
            int r7 = r0.f28040d     // Catch:{ all -> 0x023f }
            int r7 = r7 + r1
            r0.f28040d = r7     // Catch:{ all -> 0x023f }
        L_0x022d:
            int r1 = r0.f28040d     // Catch:{ all -> 0x023f }
            int r5 = r5.f28036f     // Catch:{ all -> 0x023f }
            if (r1 < r5) goto L_0x0238
            r1 = 1
            r0.f28038b = r1     // Catch:{ all -> 0x023f }
            r0 = 1
            goto L_0x0239
        L_0x0238:
            r0 = 0
        L_0x0239:
            r5 = 1
            goto L_0x023d
        L_0x023b:
            r0 = 0
            r5 = 0
        L_0x023d:
            monitor-exit(r3)     // Catch:{ all -> 0x023f }
            goto L_0x024e
        L_0x023f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x023f }
            throw r0     // Catch:{ Throwable -> 0x0248 }
        L_0x0242:
            r8 = r25
            r13 = r31
            goto L_0x0152
        L_0x0248:
            r3 = r25
            goto L_0x0345
        L_0x024c:
            r0 = 0
            r5 = 0
        L_0x024e:
            if (r2 != 0) goto L_0x0253
            if (r5 != 0) goto L_0x0253
            return
        L_0x0253:
            if (r4 == 0) goto L_0x025a
            com.bytedance.common.utility.NetworkUtils$NetworkType r1 = com.bytedance.common.utility.NetworkUtils.NetworkType.NONE     // Catch:{ Throwable -> 0x0248 }
            if (r4 != r1) goto L_0x025a
            return
        L_0x025a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0248 }
            r1.<init>()     // Catch:{ Throwable -> 0x0248 }
            r1.append(r9)     // Catch:{ Throwable -> 0x0248 }
            java.lang.String r3 = "|"
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
            java.lang.String r3 = escape4ImageStats(r28)     // Catch:{ Throwable -> 0x0248 }
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
            java.lang.String r3 = "|"
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
            r7 = r31
            r1.append(r7)     // Catch:{ Throwable -> 0x0248 }
            java.lang.String r3 = "|"
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
            r7 = r29
            r1.append(r7)     // Catch:{ Throwable -> 0x0248 }
            java.lang.String r3 = "|"
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
            r1.append(r6)     // Catch:{ Throwable -> 0x0248 }
            java.lang.String r3 = "|"
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
            int r3 = r4.getValue()     // Catch:{ Throwable -> 0x0248 }
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
            java.lang.String r3 = "|"
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
            if (r34 == 0) goto L_0x02a4
            java.lang.String r3 = escape4ImageStats(r34)     // Catch:{ Throwable -> 0x0248 }
            r1.append(r3)     // Catch:{ Throwable -> 0x0248 }
        L_0x02a4:
            r3 = 200(0xc8, float:2.8E-43)
            if (r6 == r3) goto L_0x02e8
            r3 = r25
            android.content.Context r4 = r3.mContext     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r7 = "phone"
            java.lang.Object r4 = r4.getSystemService(r7)     // Catch:{ Throwable -> 0x02bf }
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch:{ Throwable -> 0x02bf }
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r7 = r4.getNetworkOperatorName()     // Catch:{ Throwable -> 0x02bf }
            java.lang.String r4 = r4.getNetworkOperator()     // Catch:{ Throwable -> 0x02c0 }
            goto L_0x02c1
        L_0x02bf:
            r7 = 0
        L_0x02c0:
            r4 = 0
        L_0x02c1:
            java.lang.String r8 = "^"
            r1.append(r8)     // Catch:{ Throwable -> 0x0345 }
            if (r7 == 0) goto L_0x02cf
            java.lang.String r7 = escape4ImageStats(r7)     // Catch:{ Throwable -> 0x0345 }
            r1.append(r7)     // Catch:{ Throwable -> 0x0345 }
        L_0x02cf:
            java.lang.String r7 = "^"
            r1.append(r7)     // Catch:{ Throwable -> 0x0345 }
            if (r4 == 0) goto L_0x02dd
            java.lang.String r4 = escape4ImageStats(r4)     // Catch:{ Throwable -> 0x0345 }
            r1.append(r4)     // Catch:{ Throwable -> 0x0345 }
        L_0x02dd:
            java.lang.String r4 = "^0"
            r1.append(r4)     // Catch:{ Throwable -> 0x0345 }
            java.lang.String r4 = "^0"
            r1.append(r4)     // Catch:{ Throwable -> 0x0345 }
            goto L_0x02ef
        L_0x02e8:
            r3 = r25
            java.lang.String r4 = "^^^^"
            r1.append(r4)     // Catch:{ Throwable -> 0x0345 }
        L_0x02ef:
            java.lang.String r4 = "^o1^"
            r1.append(r4)     // Catch:{ Throwable -> 0x0345 }
            r1.append(r0)     // Catch:{ Throwable -> 0x0345 }
            com.ss.android.common.applog.AppLog r0 = sInstance     // Catch:{ Throwable -> 0x0345 }
            if (r0 == 0) goto L_0x0300
            java.lang.String r7 = com.ss.android.d.d.b()     // Catch:{ Throwable -> 0x0345 }
            goto L_0x0301
        L_0x0300:
            r7 = 0
        L_0x0301:
            java.lang.String r0 = "^"
            r1.append(r0)     // Catch:{ Throwable -> 0x0345 }
            if (r7 == 0) goto L_0x030b
            r1.append(r7)     // Catch:{ Throwable -> 0x0345 }
        L_0x030b:
            if (r5 == 0) goto L_0x0325
            r0 = 4
            if (r6 != r0) goto L_0x0325
            r0 = r35
            if (r0 == 0) goto L_0x0327
            java.lang.String r4 = "^"
            r1.append(r4)     // Catch:{ Throwable -> 0x0345 }
            java.lang.Class r4 = r35.getClass()     // Catch:{ Throwable -> 0x0345 }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ Throwable -> 0x0345 }
            r1.append(r4)     // Catch:{ Throwable -> 0x0345 }
            goto L_0x0327
        L_0x0325:
            r0 = r35
        L_0x0327:
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0345 }
            if (r2 == 0) goto L_0x0336
            com.ss.android.common.applog.AppLog$n r2 = new com.ss.android.common.applog.AppLog$n     // Catch:{ Throwable -> 0x0345 }
            r4 = 1
            r2.<init>(r6, r1, r4, r0)     // Catch:{ Throwable -> 0x0345 }
            r2.start()     // Catch:{ Throwable -> 0x0345 }
        L_0x0336:
            if (r5 == 0) goto L_0x0341
            com.ss.android.common.applog.AppLog$n r2 = new com.ss.android.common.applog.AppLog$n     // Catch:{ Throwable -> 0x0345 }
            r4 = 0
            r2.<init>(r6, r1, r4, r0)     // Catch:{ Throwable -> 0x0345 }
            r2.start()     // Catch:{ Throwable -> 0x0345 }
        L_0x0341:
            return
        L_0x0342:
            r3 = r8
            return
        L_0x0344:
            r3 = r8
        L_0x0345:
            return
        L_0x0346:
            r3 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.onImageSample(long, java.lang.String, long, long, int, java.lang.String, java.lang.Throwable):void");
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j2, long j3, boolean z) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5), Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15344, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5), Byte.valueOf(z)}, null, changeQuickRedirect, true, 15344, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        onEvent(context, str, str2, str3, j2, j3, z, null);
    }

    public static void onEvent$___twin___(Context context, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5), Byte.valueOf(z ? (byte) 1 : 0), jSONObject}, null, changeQuickRedirect, true, 15340, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j4), new Long(j5), Byte.valueOf(z), jSONObject}, null, changeQuickRedirect, true, 15340, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        appendParamsToEvent(jSONObject);
        AppLog appLog = sInstance;
        if (appLog == null) {
            e a2 = e.a();
            if (PatchProxy.isSupport(new Object[]{str, str2, str3, new Long(j4), new Long(j5), Byte.valueOf(z), jSONObject}, a2, e.f28138a, false, 15473, new Class[]{String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str2, str3, new Long(j4), new Long(j5), Byte.valueOf(z), jSONObject}, a2, e.f28138a, false, 15473, new Class[]{String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE);
                return;
            }
            synchronized (a2.f28140b) {
                if (a2.f28140b.size() > 200) {
                    a2.f28140b.poll();
                    tryReportEventDiscard(1);
                }
                LinkedList<e.a> linkedList = a2.f28140b;
                e.a aVar = new e.a(str, str2, str3, j2, j3, z, jSONObject);
                linkedList.add(aVar);
            }
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            tryReportEventDiscard(0);
        } else {
            if (appLog != null) {
                appLog.onEvent(str, str2, str3, j2, j3, z, jSONObject);
            }
        }
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
        boolean z2;
        boolean z3;
        String str4 = str;
        String str5 = str2;
        long j4 = j2;
        long j5 = j3;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context, str4, str5, str3, new Long(j4), new Long(j5), Byte.valueOf(z ? (byte) 1 : 0), jSONObject2}, null, changeQuickRedirect, true, 15339, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str4, str5, str3, new Long(j4), new Long(j5), Byte.valueOf(z), jSONObject2}, null, changeQuickRedirect, true, 15339, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        Object[] objArr = {context, str4, str5, str3, new Long(j4), new Long(j5), Byte.valueOf(z), jSONObject2};
        if (PatchProxy.isSupport(objArr, null, d.f28137a, true, 15470, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str4, str5, str3, new Long(j4), new Long(j5), Byte.valueOf(z), jSONObject2}, null, d.f28137a, true, 15470, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Boolean.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.b()) {
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71801, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71801, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                AbTestModel d2 = a2.d();
                if (d2 == null) {
                    z2 = false;
                } else {
                    z2 = d2.blockV1;
                }
            }
            if (!z2 || !"umeng".equals(str4) || str5 == null || !com.ss.android.ugc.aweme.lancet.a.f52929a.contains(str5)) {
                AbTestManager a3 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71802, new Class[0], Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71802, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    AbTestModel d3 = a3.d();
                    if (d3 == null) {
                        z3 = false;
                    } else {
                        z3 = d3.blockV3DoubleSend;
                    }
                }
                if (z3 && "event_v3".equalsIgnoreCase(str4) && str5 != null && com.ss.android.ugc.aweme.lancet.a.f52930b.contains(str5) && jSONObject2.has("_staging_flag")) {
                    jSONObject2.remove("_staging_flag");
                }
            }
        }
        onEvent$___twin___(context, str, str2, str3, j2, j3, z, jSONObject);
    }
}
