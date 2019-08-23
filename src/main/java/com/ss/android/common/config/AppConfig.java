package com.ss.android.common.config;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Address;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.common.util.e;
import com.ss.android.http.a.c;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.linkselector.a;
import com.ss.android.linkselector.b.b;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONArray;

public class AppConfig implements WeakHandler.IHandler, NetworkUtils.c {
    private static String[] CONFIG_SERVERS = {"dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};
    private static String DOMAIN_CONFIG_URL = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AppConfig mInstance;
    private static int sShuffleDns = -1;
    private Address address = null;
    private boolean isDebug = false;
    private boolean isEnableLinkSelector = false;
    private boolean isFirstActivityCreate;
    private boolean isTryInitFailed;
    private final Context mContext;
    private List<String> mCookieShareHostList = new ArrayList();
    private HashMap<String, InetAddress[]> mDnsMap;
    private boolean mEnableLocation = true;
    private boolean mForceChanged = true;
    final WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    private HashMap<String, List<ConnectHost>> mHostMap = new HashMap<>();
    private final boolean mIsMainProcess;
    private long mLastRefreshTime;
    private long mLastTryRefreshTime;
    private HashMap<String, List<b>> mLinkHostMap = new HashMap<>();
    private long mLinkOptInterval = 300;
    private HashMap<Pattern, String> mLinkPathMap = new LinkedHashMap();
    private boolean mLoading;
    private volatile boolean mLocalLoaded;
    private HashMap<Pattern, String> mPathHostGroupMap = new LinkedHashMap();
    private HashMap<String, List<ConnectHost>> mUIHostMap = new HashMap<>();
    private HashMap<Pattern, String> mUiPathHostGroupMap = new LinkedHashMap();
    private boolean mUseHttps = true;
    private boolean mUseLinkSelector = true;

    public class _lancet {
        public static ChangeQuickRedirect changeQuickRedirect;

        private _lancet() {
        }

        @Insert
        @TargetClass
        static boolean com_ss_android_ugc_aweme_lancet_NetworkUtilsLancet_inCookieHostList(AppConfig appConfig, String str, List list) {
            boolean z;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{appConfig, str2, list}, null, changeQuickRedirect, true, 15749, new Class[]{AppConfig.class, String.class, List.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{appConfig, str2, list}, null, changeQuickRedirect, true, 15749, new Class[]{AppConfig.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
            } else if (StringUtils.isEmpty(str) || Lists.isEmpty(list)) {
                return false;
            } else {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71686, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71686, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (a2.i != null) {
                    z = a2.i.booleanValue();
                } else {
                    AbTestModel d2 = a2.d();
                    if (d2 == null) {
                        a2.i = Boolean.TRUE;
                        z = a2.i.booleanValue();
                    } else {
                        a2.i = Boolean.valueOf(d2.isUseCookieSync);
                        z = a2.i.booleanValue();
                    }
                }
                if (z) {
                    synchronized (AppConfig.getInstance(k.a())) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str3 = (String) it2.next();
                            if (!StringUtils.isEmpty(str3) && str2.endsWith(str3)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    String str4 = (String) it3.next();
                    if (!StringUtils.isEmpty(str4) && str2.endsWith(str4)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    private boolean inCookieHostList(String str, List list) {
        if (!PatchProxy.isSupport(new Object[]{str, list}, this, changeQuickRedirect, false, 15737, new Class[]{String.class, List.class}, Boolean.TYPE)) {
            return _lancet.com_ss_android_ugc_aweme_lancet_NetworkUtilsLancet_inCookieHostList(this, str, list);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, list}, this, changeQuickRedirect, false, 15737, new Class[]{String.class, List.class}, Boolean.TYPE)).booleanValue();
    }

    public String filterUrlOnUIThread(String str) {
        return str;
    }

    public boolean isEnableLinkSelector() {
        return this.isEnableLinkSelector;
    }

    public void setFirstActivityCreate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15746, new Class[0], Void.TYPE);
            return;
        }
        if (!this.isFirstActivityCreate) {
            this.isFirstActivityCreate = true;
            if (this.isTryInitFailed) {
                initLinkSelector();
            }
        }
    }

    public void tryRefreshConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15724, new Class[0], Void.TYPE);
            return;
        }
        tryRefreshConfig(false);
    }

    private void initLinkSelector() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15745, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15745, new Class[0], Void.TYPE);
        } else if (!this.isFirstActivityCreate) {
            this.isTryInitFailed = true;
        } else {
            this.isTryInitFailed = false;
            LinkSelector a2 = LinkSelector.a(this.mContext);
            a2.f2472a = this.isEnableLinkSelector;
            long j = this.mLinkOptInterval * 1000;
            if (j < 60000) {
                j = 60000;
            }
            a2.f2474c = j;
            HashMap<String, List<b>> hashMap = this.mLinkHostMap;
            HashMap<Pattern, String> hashMap2 = this.mLinkPathMap;
            a2.a((Map<String, List<b>>) hashMap);
            a2.b((Map<Pattern, String>) hashMap2);
            Context context = LinkSelector.f2471f;
            if (context != null && a2.f2473b == null) {
                a2.f2473b = new LinkSelector.NetworkChangeReceiver();
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                Context applicationContext = context.getApplicationContext();
                LinkSelector.f2471f = applicationContext;
                applicationContext.registerReceiver(a2.f2473b, intentFilter);
            }
            a2.f2475d = 10000;
            a2.a((a) null);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void tryLoadDomainConfig4OtherProcess() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15726, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15726, new Class[0], Void.TYPE);
        } else if (System.currentTimeMillis() - this.mLastRefreshTime > 3600000) {
            this.mLastRefreshTime = System.currentTimeMillis();
            try {
                extractPathHostMapping(e.a(this.mContext, 2));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void tryLoadLocalConfig() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00af }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x00af }
            r4 = 0
            r5 = 15730(0x3d72, float:2.2042E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00af }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00af }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00af }
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect     // Catch:{ all -> 0x00af }
            r5 = 0
            r6 = 15730(0x3d72, float:2.2042E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x00af }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x00af }
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00af }
            monitor-exit(r10)
            return
        L_0x0025:
            boolean r1 = r10.mLocalLoaded     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r10)
            return
        L_0x002b:
            r1 = 1
            r10.mLocalLoaded = r1     // Catch:{ all -> 0x00af }
            android.content.Context r1 = r10.mContext     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "smart_network_select"
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r1, r2, r0)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "config_mapping"
            r3 = 0
            java.lang.String r2 = r1.getString(r2, r3)     // Catch:{ all -> 0x00af }
            java.lang.String r4 = "domain_cookie_share_mapping"
            java.lang.String r4 = r1.getString(r4, r3)     // Catch:{ all -> 0x00af }
            java.lang.String r5 = "domain_group_host_list"
            java.lang.String r5 = r1.getString(r5, r3)     // Catch:{ all -> 0x00af }
            java.lang.String r6 = "is_enable_selector"
            boolean r0 = r1.getBoolean(r6, r0)     // Catch:{ all -> 0x00af }
            r10.isEnableLinkSelector = r0     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "link_opt_interval"
            r6 = 300(0x12c, double:1.48E-321)
            long r6 = r1.getLong(r0, r6)     // Catch:{ all -> 0x00af }
            r10.mLinkOptInterval = r6     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "last_refresh_time"
            r6 = 0
            long r6 = r1.getLong(r0, r6)     // Catch:{ all -> 0x00af }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00af }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            r6 = r8
        L_0x006c:
            r10.mLastRefreshTime = r6     // Catch:{ all -> 0x00af }
            r10.extractPathHostMapping(r2)     // Catch:{ all -> 0x00af }
            r10.extractDomainList(r4)     // Catch:{ all -> 0x00af }
            r10.extractHostMap(r5)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "static_dns_mapping"
            java.lang.String r0 = r1.getString(r0, r3)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "shuffle_dns"
            r3 = -1
            int r2 = r1.getInt(r2, r3)     // Catch:{ all -> 0x00af }
            sShuffleDns = r2     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "use_dns_mapping"
            int r1 = r1.getInt(r2, r3)     // Catch:{ all -> 0x00af }
            com.ss.android.common.util.NetworkUtils.setUseDnsMapping(r1)     // Catch:{ all -> 0x00af }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x00af }
            r1.<init>()     // Catch:{ all -> 0x00af }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ all -> 0x00af }
            if (r2 != 0) goto L_0x00aa
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x00aa }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.common.config.AppConfigParser.parseDnsMap(r1, r2)     // Catch:{ Exception -> 0x00aa }
            monitor-enter(r10)     // Catch:{ Exception -> 0x00aa }
            r10.mDnsMap = r1     // Catch:{ all -> 0x00a7 }
            monitor-exit(r10)     // Catch:{ all -> 0x00a7 }
            goto L_0x00aa
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r10.initLinkSelector()     // Catch:{ all -> 0x00af }
            monitor-exit(r10)
            return
        L_0x00af:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.config.AppConfig.tryLoadLocalConfig():void");
    }

    public static void setConfigServers(String[] strArr) {
        CONFIG_SERVERS = strArr;
    }

    public static void setDomainConfigUrl(String str) {
        DOMAIN_CONFIG_URL = str;
    }

    public void setAddress(Address address2) {
        this.address = address2;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    public void setEnableLocation(boolean z) {
        this.mEnableLocation = z;
    }

    public void setUseHttps(boolean z) {
        this.mUseHttps = z;
    }

    public void setUseLinkSelector(boolean z) {
        this.mUseLinkSelector = z;
    }

    public static void onActivityResume(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 15723, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 15723, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        AppConfig appConfig = mInstance;
        if (appConfig != null) {
            appConfig.tryRefreshConfig(true);
        }
    }

    private void doRefresh(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15728, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 15728, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mLoading = true;
        if (z) {
            this.mLastTryRefreshTime = System.currentTimeMillis();
        }
        new Thread("AppConfigThread") {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void run() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15748, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15748, new Class[0], Void.TYPE);
                    return;
                }
                AppConfig.this.updateConfig(z);
            }
        }.start();
    }

    private void extractDomainList(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 15732, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 15732, new Class[]{String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                ArrayList arrayList = new ArrayList();
                if (AppConfigParser.parseCookieShareDomain(arrayList, jSONArray)) {
                    try {
                        this.mCookieShareHostList = arrayList;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    private void extractHostMap(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15733, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15733, new Class[]{String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                HashMap<String, List<ConnectHost>> hashMap = new HashMap<>();
                HashMap<String, List<b>> hashMap2 = new HashMap<>();
                if (AppConfigParser.parseHostMap(hashMap, jSONArray, hashMap2)) {
                    this.mHostMap = hashMap;
                    this.mLinkHostMap = hashMap2;
                    HashMap<String, List<ConnectHost>> hashMap3 = new HashMap<>();
                    hashMap3.putAll(hashMap);
                    this.mUIHostMap = hashMap3;
                }
            } catch (Exception unused) {
            }
        }
    }

    private void extractPathHostMapping(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15731, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15731, new Class[]{String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (AppConfigParser.parsePathHostMap(linkedHashMap, jSONArray, linkedHashMap2)) {
                    this.mPathHostGroupMap = linkedHashMap;
                    this.mLinkPathMap = linkedHashMap2;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.putAll(linkedHashMap);
                    this.mUiPathHostGroupMap = linkedHashMap3;
                }
            } catch (Exception unused) {
            }
        }
    }

    private String filterUrlForDebug(String str) {
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15742, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15742, new Class[]{String.class}, String.class);
        }
        URI create = URI.create(str);
        if (this.isDebug) {
            if (this.mUseHttps) {
                str3 = "https";
            } else {
                str3 = "http";
            }
            try {
                str2 = com.ss.android.http.a.a.a.a.a(create, new c(create.getHost(), create.getPort(), str3)).toString();
            } catch (URISyntaxException unused) {
            }
            return str2;
        }
        str2 = str;
        return str2;
    }

    public static AppConfig getInstance(Context context) {
        AppConfig appConfig;
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 15722, new Class[]{Context.class}, AppConfig.class)) {
            return (AppConfig) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 15722, new Class[]{Context.class}, AppConfig.class);
        }
        synchronized (AppConfig.class) {
            if (mInstance == null) {
                AppConfig appConfig2 = new AppConfig(context.getApplicationContext(), ToolUtils.isMainProcess(context));
                mInstance = appConfig2;
                NetworkUtils.setApiRequestInterceptor(appConfig2);
            }
            appConfig = mInstance;
        }
        return appConfig;
    }

    private void tryRefreshDomainConfig(boolean z) {
        long j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15727, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 15727, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.mLoading) {
            if (this.mForceChanged) {
                this.mForceChanged = false;
                this.mLastRefreshTime = 0;
                this.mLastTryRefreshTime = 0;
            }
            if (z) {
                j = 10800000;
            } else {
                j = 43200000;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastRefreshTime > j && currentTimeMillis - this.mLastTryRefreshTime > 120000) {
                boolean isNetworkAvailable = NetworkUtils.isNetworkAvailable(this.mContext);
                if (!this.mLocalLoaded || isNetworkAvailable) {
                    doRefresh(isNetworkAvailable);
                }
            }
        }
    }

    public List<String> getShareCookieHostList(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15736, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15736, new Class[]{String.class}, List.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            synchronized (this) {
                List<String> list = this.mCookieShareHostList;
                if (inCookieHostList(str, list)) {
                    return list;
                }
                return null;
            }
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, changeQuickRedirect, false, 15729, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, changeQuickRedirect, false, 15729, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message.what) {
            case BaseLoginOrRegisterActivity.o /*101*/:
                this.mLoading = false;
                this.mLastRefreshTime = System.currentTimeMillis();
                if (this.mForceChanged) {
                    tryRefreshConfig();
                    return;
                }
                break;
            case 102:
                this.mLoading = false;
                if (this.mForceChanged) {
                    tryRefreshConfig();
                    break;
                }
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.net.InetAddress> resolveInetAddresses(java.lang.String r11) {
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
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 15739(0x3d7b, float:2.2055E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0033
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15739(0x3d7b, float:2.2055E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0033:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r11)
            r2 = 0
            if (r1 != 0) goto L_0x0071
            boolean r1 = r10.mIsMainProcess
            if (r1 != 0) goto L_0x003f
            goto L_0x0071
        L_0x003f:
            r10.tryLoadLocalConfig()
            monitor-enter(r10)
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r1 = r10.mDnsMap     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0050
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r1 = r10.mDnsMap     // Catch:{ all -> 0x006e }
            java.lang.Object r0 = r1.get(r11)     // Catch:{ all -> 0x006e }
            java.net.InetAddress[] r0 = (java.net.InetAddress[]) r0     // Catch:{ all -> 0x006e }
            goto L_0x0051
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 == 0) goto L_0x006c
            int r1 = r0.length     // Catch:{ all -> 0x006e }
            if (r1 > 0) goto L_0x0057
            goto L_0x006c
        L_0x0057:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x006e }
            r1.<init>()     // Catch:{ all -> 0x006e }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x006e }
            r1.addAll(r0)     // Catch:{ all -> 0x006e }
            int r0 = sShuffleDns     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x006a
            java.util.Collections.shuffle(r1)     // Catch:{ all -> 0x006e }
        L_0x006a:
            monitor-exit(r10)     // Catch:{ all -> 0x006e }
            return r1
        L_0x006c:
            monitor-exit(r10)     // Catch:{ all -> 0x006e }
            return r2
        L_0x006e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.config.AppConfig.resolveInetAddresses(java.lang.String):java.util.List");
    }

    public void tryRefreshConfig(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15725, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 15725, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (TextUtils.isEmpty(DOMAIN_CONFIG_URL)) {
            throw new RuntimeException("must called setDomainConfigUrl method before tryRefreshConfig!");
        } else if (this.mIsMainProcess) {
            tryRefreshDomainConfig(z);
        } else {
            if (this.mLastRefreshTime <= 0) {
                try {
                    new ThreadPlus("LoadDomainConfig4Other-Thread") {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        public void run() {
                            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15747, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15747, new Class[0], Void.TYPE);
                                return;
                            }
                            AppConfig.this.tryLoadDomainConfig4OtherProcess();
                        }
                    }.start();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public String filterUrl(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15741, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15741, new Class[]{String.class}, String.class);
        } else if (StringUtils.isEmpty(str) || !this.mUseLinkSelector) {
            return str;
        } else {
            if (LinkSelector.a().b()) {
                return filterUrlForDebug(LinkSelector.a().a(str));
            }
            try {
                String filterUrlForDebug = filterUrlForDebug(str);
                try {
                    URI create = URI.create(filterUrlForDebug);
                    String host = create.getHost();
                    int port = create.getPort();
                    String scheme = create.getScheme();
                    for (String equals : CONFIG_SERVERS) {
                        if (equals.equals(host)) {
                            return filterUrlForDebug;
                        }
                    }
                    if (this.mIsMainProcess) {
                        tryLoadLocalConfig();
                    } else {
                        tryLoadDomainConfig4OtherProcess();
                    }
                    String str3 = "";
                    synchronized (this) {
                        ConnectHost findBestConnectHost = findBestConnectHost(filterUrlForDebug, this.mHostMap);
                        if (findBestConnectHost != null) {
                            str3 = findBestConnectHost.getHost();
                            scheme = findBestConnectHost.getSchema();
                        }
                    }
                    if (!StringUtils.isEmpty(str3)) {
                        str2 = com.ss.android.http.a.a.a.a.a(create, new c(str3, port, scheme)).toString();
                        return str2;
                    }
                } catch (Throwable unused) {
                }
                str2 = filterUrlForDebug;
            } catch (Throwable unused2) {
                str2 = str;
            }
            return str2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateConfig(boolean r19) {
        /*
            r18 = this;
            r8 = r18
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r19)
            r10 = 0
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 15744(0x3d80, float:2.2062E-41)
            r2 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x003c
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r19)
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15744(0x3d80, float:2.2062E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003c:
            r18.tryLoadLocalConfig()
            r1 = 102(0x66, float:1.43E-43)
            if (r19 != 0) goto L_0x0049
            com.bytedance.common.utility.collection.WeakHandler r0 = r8.mHandler
            r0.sendEmptyMessage(r1)
            return
        L_0x0049:
            java.lang.String[] r2 = CONFIG_SERVERS
            int r3 = r2.length
            r4 = 0
        L_0x004d:
            if (r4 >= r3) goto L_0x0239
            r0 = r2[r4]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0234 }
            r5.<init>()     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r6 = "http://"
            r5.append(r6)     // Catch:{ Throwable -> 0x0234 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r0 = DOMAIN_CONFIG_URL     // Catch:{ Throwable -> 0x0234 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0234 }
            boolean r0 = r8.mEnableLocation     // Catch:{ Throwable -> 0x0234 }
            if (r0 == 0) goto L_0x00a9
            android.location.Address r0 = r8.address     // Catch:{ Throwable -> 0x0234 }
            if (r0 == 0) goto L_0x00a9
            android.location.Address r0 = r8.address     // Catch:{ Throwable -> 0x0234 }
            if (r0 == 0) goto L_0x00a9
            boolean r6 = r0.hasLatitude()     // Catch:{ Throwable -> 0x0234 }
            if (r6 == 0) goto L_0x00a9
            boolean r6 = r0.hasLongitude()     // Catch:{ Throwable -> 0x0234 }
            if (r6 == 0) goto L_0x00a9
            java.lang.String r6 = "?latitude="
            r5.append(r6)     // Catch:{ Throwable -> 0x0234 }
            double r6 = r0.getLatitude()     // Catch:{ Throwable -> 0x0234 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r6 = "&longitude="
            r5.append(r6)     // Catch:{ Throwable -> 0x0234 }
            double r6 = r0.getLongitude()     // Catch:{ Throwable -> 0x0234 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r0 = r0.getLocality()     // Catch:{ Throwable -> 0x0234 }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0234 }
            if (r6 != 0) goto L_0x00a9
            java.lang.String r6 = "&city="
            r5.append(r6)     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r0 = android.net.Uri.encode(r0)     // Catch:{ Throwable -> 0x0234 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0234 }
        L_0x00a9:
            com.ss.android.http.a.b.f r0 = new com.ss.android.http.a.b.f     // Catch:{ Throwable -> 0x0234 }
            r0.<init>()     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0234 }
            r11 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            r14 = 1
            r15 = 0
            r17 = 1
            r12 = r5
            r16 = r0
            java.lang.String r6 = com.ss.android.common.util.NetworkUtils.executeGet(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x0234 }
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0234 }
            if (r7 == 0) goto L_0x00c8
            goto L_0x0234
        L_0x00c8:
            java.lang.String r7 = "X-SS-SIGN"
            com.ss.android.http.a.a r0 = r0.a((java.lang.String) r7)     // Catch:{ Throwable -> 0x0234 }
            if (r0 == 0) goto L_0x0234
            java.lang.String r7 = r0.b()     // Catch:{ Throwable -> 0x0234 }
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0234 }
            if (r7 == 0) goto L_0x00dc
            goto L_0x0234
        L_0x00dc:
            java.lang.String r0 = r0.b()     // Catch:{ Throwable -> 0x0234 }
            boolean r0 = com.ss.android.common.config.RequestValidator.checkSSSign(r5, r0, r6)     // Catch:{ Throwable -> 0x0234 }
            if (r0 != 0) goto L_0x00e8
            goto L_0x0234
        L_0x00e8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0234 }
            r0.<init>(r6)     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r5 = "status_code"
            int r5 = r0.optInt(r5)     // Catch:{ Throwable -> 0x0234 }
            if (r5 == 0) goto L_0x00f7
            goto L_0x0234
        L_0x00f7:
            java.lang.String r5 = "data"
            org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r5 = "enable_link_select"
            boolean r5 = r0.optBoolean(r5)     // Catch:{ Throwable -> 0x0234 }
            r8.isEnableLinkSelector = r5     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r5 = "speed_interval"
            long r5 = r0.optLong(r5)     // Catch:{ Throwable -> 0x0234 }
            r8.mLinkOptInterval = r5     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r5 = "path_control"
            org.json.JSONArray r5 = r0.optJSONArray(r5)     // Catch:{ Throwable -> 0x0234 }
            if (r5 != 0) goto L_0x011a
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0234 }
            r5.<init>()     // Catch:{ Throwable -> 0x0234 }
        L_0x011a:
            java.lang.String r6 = "all_hosts"
            org.json.JSONArray r6 = r0.optJSONArray(r6)     // Catch:{ Throwable -> 0x0234 }
            if (r6 != 0) goto L_0x0127
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0234 }
            r6.<init>()     // Catch:{ Throwable -> 0x0234 }
        L_0x0127:
            java.lang.String r7 = "union_domain"
            org.json.JSONArray r7 = r0.optJSONArray(r7)     // Catch:{ Throwable -> 0x0234 }
            if (r7 != 0) goto L_0x0134
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0234 }
            r7.<init>()     // Catch:{ Throwable -> 0x0234 }
        L_0x0134:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0234 }
            r11.<init>()     // Catch:{ Throwable -> 0x0234 }
            boolean r12 = com.ss.android.common.config.AppConfigParser.parseCookieShareDomain(r11, r7)     // Catch:{ Throwable -> 0x0234 }
            if (r12 == 0) goto L_0x0148
            monitor-enter(r18)     // Catch:{ Throwable -> 0x0234 }
            r8.mCookieShareHostList = r11     // Catch:{ all -> 0x0145 }
            monitor-exit(r18)     // Catch:{ all -> 0x0145 }
            r11 = 1
            goto L_0x0149
        L_0x0145:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ Throwable -> 0x0234 }
        L_0x0148:
            r11 = 0
        L_0x0149:
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ Throwable -> 0x0234 }
            r12.<init>()     // Catch:{ Throwable -> 0x0234 }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ Throwable -> 0x0234 }
            r13.<init>()     // Catch:{ Throwable -> 0x0234 }
            boolean r14 = com.ss.android.common.config.AppConfigParser.parseHostMap(r12, r6, r13)     // Catch:{ Throwable -> 0x0234 }
            if (r14 == 0) goto L_0x016e
            monitor-enter(r18)     // Catch:{ Throwable -> 0x0234 }
            r8.mHostMap = r12     // Catch:{ all -> 0x016b }
            r8.mLinkHostMap = r13     // Catch:{ all -> 0x016b }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ all -> 0x016b }
            r13.<init>()     // Catch:{ all -> 0x016b }
            r13.putAll(r12)     // Catch:{ all -> 0x016b }
            r8.mUIHostMap = r13     // Catch:{ all -> 0x016b }
            monitor-exit(r18)     // Catch:{ all -> 0x016b }
            r12 = 1
            goto L_0x016f
        L_0x016b:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x016b }
            throw r0     // Catch:{ Throwable -> 0x0234 }
        L_0x016e:
            r12 = 0
        L_0x016f:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0234 }
            r13.<init>()     // Catch:{ Throwable -> 0x0234 }
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0234 }
            r14.<init>()     // Catch:{ Throwable -> 0x0234 }
            boolean r15 = com.ss.android.common.config.AppConfigParser.parsePathHostMap(r13, r5, r14)     // Catch:{ Throwable -> 0x0234 }
            if (r15 == 0) goto L_0x0194
            monitor-enter(r18)     // Catch:{ Throwable -> 0x0234 }
            r8.mPathHostGroupMap = r13     // Catch:{ all -> 0x0191 }
            r8.mLinkPathMap = r14     // Catch:{ all -> 0x0191 }
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0191 }
            r14.<init>()     // Catch:{ all -> 0x0191 }
            r14.putAll(r13)     // Catch:{ all -> 0x0191 }
            r8.mUiPathHostGroupMap = r14     // Catch:{ all -> 0x0191 }
            monitor-exit(r18)     // Catch:{ all -> 0x0191 }
            r13 = 1
            goto L_0x0195
        L_0x0191:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0191 }
            throw r0     // Catch:{ Throwable -> 0x0234 }
        L_0x0194:
            r13 = 0
        L_0x0195:
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r14 = "dns_mapping"
            org.json.JSONArray r14 = r0.optJSONArray(r14)     // Catch:{ Throwable -> 0x0234 }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ Throwable -> 0x0234 }
            r15.<init>()     // Catch:{ Throwable -> 0x0234 }
            com.ss.android.common.config.AppConfigParser.parseDnsMap(r15, r14)     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r16 = ""
            if (r14 == 0) goto L_0x01bd
            int r17 = r15.size()     // Catch:{ Throwable -> 0x0234 }
            if (r17 <= 0) goto L_0x01bd
            java.lang.String r16 = r14.toString()     // Catch:{ Throwable -> 0x0234 }
        L_0x01bd:
            r14 = r16
            java.lang.String r9 = "shuffle_dns"
            int r9 = r0.optInt(r9)     // Catch:{ Throwable -> 0x0234 }
            sShuffleDns = r9     // Catch:{ Throwable -> 0x0234 }
            java.lang.String r9 = "use_dns_mapping"
            int r0 = r0.optInt(r9)     // Catch:{ Throwable -> 0x0234 }
            com.ss.android.common.util.NetworkUtils.setUseDnsMapping(r0)     // Catch:{ Throwable -> 0x0234 }
            monitor-enter(r18)     // Catch:{ Throwable -> 0x0234 }
            r8.mDnsMap = r15     // Catch:{ all -> 0x0231 }
            monitor-exit(r18)     // Catch:{ all -> 0x0231 }
            monitor-enter(r18)     // Catch:{ Throwable -> 0x0234 }
            android.content.Context r0 = r8.mContext     // Catch:{ all -> 0x022e }
            java.lang.String r9 = "smart_network_select"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r9, r10)     // Catch:{ all -> 0x022e }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x022e }
            if (r13 == 0) goto L_0x01e8
            java.lang.String r9 = "config_mapping"
            r0.putString(r9, r5)     // Catch:{ all -> 0x022e }
        L_0x01e8:
            if (r11 == 0) goto L_0x01ef
            java.lang.String r9 = "domain_cookie_share_mapping"
            r0.putString(r9, r7)     // Catch:{ all -> 0x022e }
        L_0x01ef:
            if (r12 == 0) goto L_0x01f6
            java.lang.String r7 = "domain_group_host_list"
            r0.putString(r7, r6)     // Catch:{ all -> 0x022e }
        L_0x01f6:
            java.lang.String r6 = "is_enable_selector"
            boolean r7 = r8.isEnableLinkSelector     // Catch:{ all -> 0x022e }
            r0.putBoolean(r6, r7)     // Catch:{ all -> 0x022e }
            java.lang.String r6 = "link_opt_interval"
            long r11 = r8.mLinkOptInterval     // Catch:{ all -> 0x022e }
            r0.putLong(r6, r11)     // Catch:{ all -> 0x022e }
            java.lang.String r6 = "static_dns_mapping"
            r0.putString(r6, r14)     // Catch:{ all -> 0x022e }
            java.lang.String r6 = "shuffle_dns"
            int r7 = sShuffleDns     // Catch:{ all -> 0x022e }
            r0.putInt(r6, r7)     // Catch:{ all -> 0x022e }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x022e }
            java.lang.String r9 = "last_refresh_time"
            r0.putLong(r9, r6)     // Catch:{ all -> 0x022e }
            r0.commit()     // Catch:{ all -> 0x022e }
            monitor-exit(r18)     // Catch:{ all -> 0x022e }
            com.bytedance.common.utility.collection.WeakHandler r0 = r8.mHandler     // Catch:{ Throwable -> 0x0234 }
            r6 = 101(0x65, float:1.42E-43)
            r0.sendEmptyMessage(r6)     // Catch:{ Throwable -> 0x0234 }
            r18.initLinkSelector()     // Catch:{ Throwable -> 0x0234 }
            android.content.Context r0 = r8.mContext     // Catch:{ Throwable -> 0x0234 }
            r6 = 2
            com.ss.android.common.util.e.a(r0, r6, r5)     // Catch:{ Throwable -> 0x0234 }
            return
        L_0x022e:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x022e }
            throw r0     // Catch:{ Throwable -> 0x0234 }
        L_0x0231:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0231 }
            throw r0     // Catch:{ Throwable -> 0x0234 }
        L_0x0234:
            int r4 = r4 + 1
            r9 = 1
            goto L_0x004d
        L_0x0239:
            com.bytedance.common.utility.collection.WeakHandler r0 = r8.mHandler
            r0.sendEmptyMessage(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.config.AppConfig.updateConfig(boolean):void");
    }

    private AppConfig(Context context, boolean z) {
        this.mContext = context;
        this.mIsMainProcess = z;
    }

    private ConnectHost findBestConnectHost(String str, HashMap<String, List<ConnectHost>> hashMap) {
        if (PatchProxy.isSupport(new Object[]{str, hashMap}, this, changeQuickRedirect, false, 15743, new Class[]{String.class, HashMap.class}, ConnectHost.class)) {
            return (ConnectHost) PatchProxy.accessDispatch(new Object[]{str, hashMap}, this, changeQuickRedirect, false, 15743, new Class[]{String.class, HashMap.class}, ConnectHost.class);
        }
        URI create = URI.create(str);
        HashMap<Pattern, String> hashMap2 = this.mPathHostGroupMap;
        List list = hashMap.get(findMatchHostName(hashMap2, create.getHost() + create.getPath()));
        if (Lists.isEmpty(list)) {
            return null;
        }
        return (ConnectHost) list.get(0);
    }

    public boolean inCookieHostList$___twin___(String str, List<String> list) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, list}, this, changeQuickRedirect, false, 15738, new Class[]{String.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, list}, this, changeQuickRedirect, false, 15738, new Class[]{String.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str) || Lists.isEmpty(list)) {
            return false;
        } else {
            for (String endsWith : list) {
                if (str2.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        }
    }

    private String findMatchHostName(HashMap<Pattern, String> hashMap, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{hashMap, str2}, this, changeQuickRedirect, false, 15740, new Class[]{HashMap.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{hashMap, str2}, this, changeQuickRedirect, false, 15740, new Class[]{HashMap.class, String.class}, String.class);
        } else if (StringUtils.isEmpty(str) || hashMap == null || hashMap.isEmpty()) {
            return "";
        } else {
            try {
                for (Map.Entry next : hashMap.entrySet()) {
                    if (((Pattern) next.getKey()).matcher(str2).matches()) {
                        return (String) next.getValue();
                    }
                }
            } catch (Exception unused) {
            }
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> getShareCookie(android.webkit.CookieManager r12, java.lang.String r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r12
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.webkit.CookieManager> r2 = android.webkit.CookieManager.class
            r6[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 15735(0x3d77, float:2.205E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0040
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r12
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15735(0x3d77, float:2.205E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.webkit.CookieManager> r0 = android.webkit.CookieManager.class
            r6[r9] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r2 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0040:
            r1 = 0
            if (r12 == 0) goto L_0x0081
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r13)
            if (r2 == 0) goto L_0x004a
            goto L_0x0081
        L_0x004a:
            monitor-enter(r11)
            java.util.List<java.lang.String> r2 = r11.mCookieShareHostList     // Catch:{ all -> 0x007e }
            android.net.Uri r3 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = r3.getHost()     // Catch:{ Exception -> 0x0056 }
            goto L_0x0057
        L_0x0056:
            r3 = r1
        L_0x0057:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x007c
            boolean r2 = r11.inCookieHostList(r3, r2)     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0064
            goto L_0x007c
        L_0x0064:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r2 = com.ss.android.common.util.NetworkUtils.getShareCookieHost()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r12.getCookie(r2)     // Catch:{ all -> 0x007e }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x007a
            r1.add(r0)     // Catch:{ all -> 0x007e }
        L_0x007a:
            monitor-exit(r11)     // Catch:{ all -> 0x007e }
            return r1
        L_0x007c:
            monitor-exit(r11)     // Catch:{ all -> 0x007e }
            return r1
        L_0x007e:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x007e }
            throw r0
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.config.AppConfig.getShareCookie(android.webkit.CookieManager, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c4, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String tryDnsMapping(java.lang.String r12, java.lang.String[] r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r12
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r10] = r2
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 15734(0x3d76, float:2.2048E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0040
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r12
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 15734(0x3d76, float:2.2048E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r10] = r0
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0040:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x00c7
            boolean r1 = r11.mIsMainProcess
            if (r1 == 0) goto L_0x00c7
            if (r13 == 0) goto L_0x00c7
            int r1 = r13.length
            if (r1 > 0) goto L_0x0051
            goto L_0x00c7
        L_0x0051:
            r1 = 0
            r13[r9] = r1
            r11.tryLoadLocalConfig()
            monitor-enter(r11)
            java.net.URI r2 = java.net.URI.create(r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r3 = r2.getHost()     // Catch:{ Exception -> 0x00bb }
            if (r3 == 0) goto L_0x00bf
            int r4 = r3.length()     // Catch:{ Exception -> 0x00bb }
            if (r4 != 0) goto L_0x0069
            goto L_0x00bf
        L_0x0069:
            int r4 = r2.getPort()     // Catch:{ Exception -> 0x00bb }
            if (r4 <= 0) goto L_0x0075
            r5 = 80
            if (r4 == r5) goto L_0x0075
            monitor-exit(r11)     // Catch:{ all -> 0x00c1 }
            return r12
        L_0x0075:
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r4 = r11.mDnsMap     // Catch:{ Exception -> 0x00bb }
            if (r4 == 0) goto L_0x0081
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r1 = r11.mDnsMap     // Catch:{ Exception -> 0x00bb }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x00bb }
            java.net.InetAddress[] r1 = (java.net.InetAddress[]) r1     // Catch:{ Exception -> 0x00bb }
        L_0x0081:
            if (r1 == 0) goto L_0x00bd
            int r4 = r1.length     // Catch:{ Exception -> 0x00bb }
            if (r4 > 0) goto L_0x0087
            goto L_0x00bd
        L_0x0087:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00bb }
            r4.<init>()     // Catch:{ Exception -> 0x00bb }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x00bb }
            r4.addAll(r1)     // Catch:{ Exception -> 0x00bb }
            java.util.Collections.shuffle(r4)     // Catch:{ Exception -> 0x00bb }
            java.lang.Object r1 = r4.get(r9)     // Catch:{ Exception -> 0x00bb }
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch:{ Exception -> 0x00bb }
            boolean r1 = r1 instanceof java.net.Inet4Address     // Catch:{ Exception -> 0x00bb }
            if (r1 == 0) goto L_0x00bb
            java.lang.Object r1 = r4.get(r9)     // Catch:{ Exception -> 0x00bb }
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch:{ Exception -> 0x00bb }
            java.lang.String r1 = r1.getHostAddress()     // Catch:{ Exception -> 0x00bb }
            com.ss.android.http.a.c r4 = new com.ss.android.http.a.c     // Catch:{ Exception -> 0x00bb }
            r4.<init>(r1)     // Catch:{ Exception -> 0x00bb }
            java.net.URI r1 = com.ss.android.http.a.a.a.a.a(r2, r4)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00bb }
            r13[r9] = r3     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            r0 = r1
            goto L_0x00c3
        L_0x00bb:
            r0 = r12
            goto L_0x00c3
        L_0x00bd:
            monitor-exit(r11)     // Catch:{ all -> 0x00c1 }
            return r12
        L_0x00bf:
            monitor-exit(r11)     // Catch:{ all -> 0x00c1 }
            return r12
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c5
        L_0x00c3:
            monitor-exit(r11)     // Catch:{ all -> 0x00c1 }
            return r0
        L_0x00c5:
            monitor-exit(r11)     // Catch:{ all -> 0x00c1 }
            throw r0
        L_0x00c7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.config.AppConfig.tryDnsMapping(java.lang.String, java.lang.String[]):java.lang.String");
    }
}
