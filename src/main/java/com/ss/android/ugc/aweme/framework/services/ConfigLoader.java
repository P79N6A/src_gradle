package com.ss.android.ugc.aweme.framework.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConfigLoader {
    private static final Map<String, List<CacheItem>> CLASSES = Collections.synchronizedMap(new LinkedHashMap());
    private static final String[] DIRS = {"services/", "services/AwemeLive/", "services/AwemeIM/", "services/AwemeReactNative/", "services/AwemePush/", "services/AwemeShare/", "services/AwemeMain/", "services/AwemePlugin/", "services/SdkDebugger/", "services/AwemeMusic/", "services/AwemeVideo/", "services/AwemeFramework/", "services/AwemeCommerce/"};
    public static ChangeQuickRedirect changeQuickRedirect;

    static class CacheItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Object cacheService;
        public final String className;
        public final boolean persistence;

        public static CacheItem fromConfig(String str) {
            String str2 = str;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 45928, new Class[]{String.class}, CacheItem.class)) {
                return (CacheItem) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 45928, new Class[]{String.class}, CacheItem.class);
            } else if (str2 == null || "".equals(str2)) {
                return null;
            } else {
                String[] split = str2.split(":");
                String str3 = split[0];
                if (split.length > 1) {
                    z = Boolean.parseBoolean(split[1]);
                }
                return new CacheItem(str3, z);
            }
        }

        public CacheItem(String str, boolean z) {
            this.className = str;
            this.persistence = z;
        }
    }

    static class ConfigIterator<T> implements Iterator<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Class mClass;
        private ClassLoader mClassLoader;
        private List<CacheItem> mClasses;
        private int mIndex;

        public boolean hasNext() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45929, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45929, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (this.mClasses != null && this.mIndex < this.mClasses.size()) {
                z = true;
            }
            return z;
        }

        public T next() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45930, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45930, new Class[0], Object.class);
            }
            CacheItem cacheItem = this.mClasses.get(this.mIndex);
            this.mIndex++;
            synchronized (cacheItem) {
                if (cacheItem.persistence && cacheItem.cacheService != null) {
                    T t = cacheItem.cacheService;
                    return t;
                } else if (!cacheItem.persistence) {
                    return newService(cacheItem);
                } else {
                    cacheItem.cacheService = newService(cacheItem);
                    T t2 = cacheItem.cacheService;
                    return t2;
                }
            }
        }

        private T newService(CacheItem cacheItem) {
            if (PatchProxy.isSupport(new Object[]{cacheItem}, this, changeQuickRedirect, false, 45931, new Class[]{CacheItem.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{cacheItem}, this, changeQuickRedirect, false, 45931, new Class[]{CacheItem.class}, Object.class);
            }
            try {
                Class<?> cls = Class.forName(cacheItem.className, false, this.mClassLoader);
                if (this.mClass.isAssignableFrom(cls)) {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        return declaredConstructor.newInstance(new Object[0]);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException(e2);
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    } catch (NoSuchMethodException e4) {
                        throw new RuntimeException(e4);
                    } catch (InvocationTargetException e5) {
                        throw new RuntimeException(e5);
                    }
                } else {
                    throw new RuntimeException(new ClassCastException("source: " + cls.getName() + ", dest: " + this.mClass.getName()));
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException(e6);
            }
        }

        public ConfigIterator(List<CacheItem> list, Class<T> cls, ClassLoader classLoader) {
            this.mClassLoader = classLoader;
            this.mClass = cls;
            this.mClasses = list;
        }
    }

    ConfigLoader() {
    }

    static {
        addCache("com.bytedance.ies.ugc.aweme.plugin.service.IPluginService", "com.ss.android.ugc.aweme.plugin.PluginService:true");
        addCache("com.ss.android.ugc.aweme.services.IMicroAppService", "com.ss.android.ugc.aweme.net.MicroAppService");
        addCache("com.ss.android.ugc.aweme.net.INetReleaseInterceptor", "com.ss.android.ugc.aweme.net.OKHttpSwitchInterceptor\ncom.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor");
        addCache("com.ss.android.ugc.aweme.port.in.IFestivalService", "com.ss.android.ugc.aweme.shortvideo.festival.FestivalService");
        addCache("com.ss.android.ugc.aweme.framework.services.IReportService", "com.ss.android.ugc.aweme.services.ReportService:true");
        addCache("com.ss.android.ugc.aweme.sdk.IWalletMainProxy", "com.ss.android.ugc.aweme.wallet.WalletMainProxy:true");
        addCache("com.ss.android.ugc.aweme.framework.services.IRetrofitService", "com.ss.android.ugc.aweme.services.RetrofitService:true");
        addCache("com.ss.android.ugc.aweme.feed.IFeedLogger", "com.ss.android.ugc.aweme.feed.FeedLogger");
        addCache("com.ss.android.ugc.aweme.utils.GsonProvider", "com.ss.android.ugc.aweme.utils.GsonHolder:true");
        addCache("com.ss.android.ugc.aweme.commerce.service.ICommerceService", "com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService:true");
        addCache("com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService", "com.ss.android.ugc.aweme.im.sdk.providedservices.ImplService:true");
        addCache("com.ss.android.ugc.aweme.framework.services.IThemedService", "com.ss.android.ugc.aweme.framework.core.impl.ThemedService:true");
        addCache("com.ss.android.ugc.aweme.im.service.IIMService", "com.ss.android.ugc.aweme.im.sdk.providedservices.IMService:true");
        addCache("com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService$Factory", "com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl:true");
        addCache("com.ss.android.ugc.awemepushapi.IPushApi", "com.ss.android.ugc.awemepushlib.interaction.PushService");
        addCache("com.ss.android.ugc.aweme.sdk.IWalletService", "com.ss.android.ugc.aweme.sdk.WalletService:true");
        addCache("com.ss.android.ugc.aweme.services.antispam.IAntiSpamService", "com.ss.android.ugc.aweme.services.AntiSpamService");
        addCache("com.ss.android.ugc.aweme.sdk.IIapWalletProxy", "com.ss.android.ugc.aweme.sdk.IapWalletProxy:true");
        addCache("com.ss.android.ugc.aweme.share.ILiveShareService", "com.ss.android.ugc.aweme.feed.share.command.LiveShareServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.port.in.IAVStoryProxyService", "com.ss.android.ugc.aweme.services.story.AVStoryProxyServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.services.IMainService", "com.ss.android.ugc.aweme.services.MainServiceImpl");
        addCache("com.ss.android.ugc.aweme.framework.services.IShareService", "com.douyin.share.services.ShareService:true\n");
        addCache("com.ss.android.ugc.aweme.framework.services.ILocationService", "com.ss.android.ugc.aweme.services.LocationService:true");
        addCache("com.ss.android.ugc.aweme.crossplatform.platform.rn.service.IReactService", "com.ss.android.ugc.aweme.crossplatform.platform.rn.service.ReactService:true");
        addCache("com.ss.android.ugc.aweme.services.IAVService", "com.ss.android.ugc.aweme.services.AVServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.port.in.IRecordingStateService", "com.ss.android.ugc.aweme.shortvideo.RecordingStateServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.poi.IPOIService", "com.ss.android.ugc.aweme.services.POIService:true");
        addCache("com.ss.android.ugc.aweme.services.IAVInitializer", "com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl:true");
        addCache("com.ss.android.ugc.aweme.framework.services.IUserService", "com.ss.android.ugc.aweme.services.UserService:true");
        addCache("com.ss.android.ugc.aweme.services.story.IStoryRecordService", "com.ss.android.ugc.aweme.services.story.StoryRecordService:true");
        addCache("com.ss.android.ugc.aweme.bridgeservice.IBridgeService", "com.ss.android.ugc.aweme.common.BridgeService");
        addCache("com.ss.android.ugc.aweme.IAccountService", "com.ss.android.ugc.aweme.AccountService:true");
        addCache("com.ss.android.ugc.aweme.framework.services.awemepush.IPushService", "com.ss.android.ugc.awemepushlib.interaction.PushService");
        addCache("com.ss.android.ugc.aweme.sticker.IStickerViewService", "com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerViewServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.feed.cache.IFeedApi", "com.ss.android.ugc.aweme.feed.FeedApiService");
        addCache("com.ss.android.ugc.aweme.framework.services.IMedialibConfigService", "com.ss.android.ugc.aweme.services.MedialibConfigService:true");
        addCache("com.ss.android.ugc.aweme.web.IAmeJsMessageHandlerService", "com.ss.android.ugc.aweme.web.AmeJsMessageHandlerServiceImpl");
        addCache("com.ss.android.ugc.aweme.net.IReleaseInterceptor", "com.ss.android.ugc.aweme.net.OKHttpSwitchInterceptor\ncom.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor");
        addCache("com.ss.android.ugc.aweme.framework.services.IFollowService", "com.ss.android.ugc.aweme.services.FollowService:true");
        addCache("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory", "com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory:true");
        addCache("com.ss.android.ugc.aweme.share.ShareOrderService", "com.ss.android.ugc.aweme.share.ShareOrderServiceImpl");
        addCache("com.ss.android.ugc.aweme.language.I18nManagerService", "com.ss.android.ugc.aweme.language.I18nManagerServiceImpl");
        addCache("com.ss.android.ugc.aweme.tools.AVApi", "com.ss.android.ugc.aweme.shortvideo.AVApiImpl");
        addCache("com.ss.android.ugc.aweme.story.api.IAVStoryService", "com.ss.android.ugc.aweme.story.shootvideo.services.AVStoryServiceImpl");
        addCache("com.ss.android.ugc.aweme.framework.services.IGlobalConfigService", "com.ss.android.ugc.aweme.services.GlobalConfigService:true");
        addCache("com.ss.android.ugc.aweme.framework.services.IEventBusHelperService", "com.ss.android.ugc.aweme.services.EventBusHelperService");
        addCache("com.ss.android.ugc.aweme.ab.IAVABService", "com.ss.android.ugc.aweme.services.AVABService");
    }

    private static void closeQuietly(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, changeQuickRedirect, true, 45927, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, changeQuickRedirect, true, 45927, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static <T> Iterator<T> iterator(Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, null, changeQuickRedirect, true, 45922, new Class[]{Class.class}, Iterator.class)) {
            return (Iterator) PatchProxy.accessDispatch(new Object[]{cls2}, null, changeQuickRedirect, true, 45922, new Class[]{Class.class}, Iterator.class);
        }
        ClassLoader classLoader = cls.getClassLoader();
        return new ConfigIterator(loadClasses(cls2, classLoader), cls2, classLoader);
    }

    private static List<CacheItem> parseSafely(URL url) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{url}, null, changeQuickRedirect, true, 45925, new Class[]{URL.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{url}, null, changeQuickRedirect, true, 45925, new Class[]{URL.class}, List.class);
        }
        while (i < 3) {
            try {
                return parse(url);
            } catch (ConcurrentModificationException e2) {
                ConcurrentModificationException concurrentModificationException = e2;
                if (i < 2) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                } else {
                    throw concurrentModificationException;
                }
            }
        }
        return new LinkedList();
    }

    private static List<CacheItem> parse(URL url) {
        InputStreamReader inputStreamReader;
        InputStream inputStream;
        BufferedReader bufferedReader;
        if (PatchProxy.isSupport(new Object[]{url}, null, changeQuickRedirect, true, 45926, new Class[]{URL.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{url}, null, changeQuickRedirect, true, 45926, new Class[]{URL.class}, List.class);
        }
        LinkedList linkedList = new LinkedList();
        BufferedReader bufferedReader2 = null;
        try {
            inputStream = url.openStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
            } catch (IOException unused) {
                inputStreamReader = null;
                closeQuietly(bufferedReader2);
                closeQuietly(inputStreamReader);
                closeQuietly(inputStream);
                return linkedList;
            } catch (Throwable th) {
                th = th;
                inputStreamReader = null;
                closeQuietly(bufferedReader2);
                closeQuietly(inputStreamReader);
                closeQuietly(inputStream);
                throw th;
            }
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (IOException unused2) {
                closeQuietly(bufferedReader2);
                closeQuietly(inputStreamReader);
                closeQuietly(inputStream);
                return linkedList;
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(bufferedReader2);
                closeQuietly(inputStreamReader);
                closeQuietly(inputStream);
                throw th;
            }
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    CacheItem fromConfig = CacheItem.fromConfig(readLine);
                    if (fromConfig != null) {
                        linkedList.add(fromConfig);
                    }
                }
                closeQuietly(bufferedReader);
            } catch (IOException unused3) {
                bufferedReader2 = bufferedReader;
                closeQuietly(bufferedReader2);
                closeQuietly(inputStreamReader);
                closeQuietly(inputStream);
                return linkedList;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                closeQuietly(bufferedReader2);
                closeQuietly(inputStreamReader);
                closeQuietly(inputStream);
                throw th;
            }
        } catch (IOException unused4) {
            inputStream = null;
            inputStreamReader = null;
            closeQuietly(bufferedReader2);
            closeQuietly(inputStreamReader);
            closeQuietly(inputStream);
            return linkedList;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            inputStreamReader = null;
            closeQuietly(bufferedReader2);
            closeQuietly(inputStreamReader);
            closeQuietly(inputStream);
            throw th;
        }
        closeQuietly(inputStreamReader);
        closeQuietly(inputStream);
        return linkedList;
    }

    private static void addCache(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, changeQuickRedirect, true, 45921, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, changeQuickRedirect, true, 45921, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        String[] split = str4.split("\n");
        ArrayList arrayList = new ArrayList();
        for (String fromConfig : split) {
            arrayList.add(CacheItem.fromConfig(fromConfig));
        }
        CLASSES.put(str3, arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r2 = new java.util.LinkedList<>();
        r3 = DIRS;
        r4 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r10 >= r4) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        r5 = getUrls(r0, r1, r3[r10]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (r5 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r5.hasMoreElements() == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        r2.addAll(parseSafely(r5.nextElement()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        r1 = CLASSES;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (CLASSES.containsKey(r0) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        CLASSES.put(r19.getName(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        r2 = CLASSES.get(r19.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader.CacheItem> loadClasses(java.lang.Class<T> r19, java.lang.ClassLoader r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r8[r10] = r4
            java.lang.Class<java.lang.ClassLoader> r4 = java.lang.ClassLoader.class
            r8[r11] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = 0
            r6 = 1
            r7 = 45923(0xb363, float:6.4352E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 45923(0xb363, float:6.4352E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r0[r10] = r1
            java.lang.Class<java.lang.ClassLoader> r1 = java.lang.ClassLoader.class
            r0[r11] = r1
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0048:
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r2 = CLASSES
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r3 = CLASSES     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = r19.getName()     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00ac }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x005b
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            return r3
        L_0x005b:
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.String[] r3 = DIRS
            int r4 = r3.length
        L_0x0064:
            if (r10 >= r4) goto L_0x0085
            r5 = r3[r10]
            java.util.Enumeration r5 = getUrls(r0, r1, r5)
        L_0x006c:
            if (r5 == 0) goto L_0x0082
            boolean r6 = r5.hasMoreElements()
            if (r6 == 0) goto L_0x0082
            java.lang.Object r6 = r5.nextElement()
            java.net.URL r6 = (java.net.URL) r6
            java.util.List r6 = parseSafely(r6)
            r2.addAll(r6)
            goto L_0x006c
        L_0x0082:
            int r10 = r10 + 1
            goto L_0x0064
        L_0x0085:
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r1 = CLASSES
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r3 = CLASSES     // Catch:{ all -> 0x00a9 }
            boolean r3 = r3.containsKey(r0)     // Catch:{ all -> 0x00a9 }
            if (r3 != 0) goto L_0x009a
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r3 = CLASSES     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r19.getName()     // Catch:{ all -> 0x00a9 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a7
        L_0x009a:
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r2 = CLASSES     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r19.getName()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x00a9 }
            r2 = r0
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r1)     // Catch:{ all -> 0x00a9 }
            return r2
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.framework.services.ConfigLoader.loadClasses(java.lang.Class, java.lang.ClassLoader):java.util.List");
    }

    private static Enumeration<URL> getUrls(Class cls, ClassLoader classLoader, String str) {
        ClassLoader classLoader2 = classLoader;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cls, classLoader2, str2}, null, changeQuickRedirect, true, 45924, new Class[]{Class.class, ClassLoader.class, String.class}, Enumeration.class)) {
            return (Enumeration) PatchProxy.accessDispatch(new Object[]{cls, classLoader2, str2}, null, changeQuickRedirect, true, 45924, new Class[]{Class.class, ClassLoader.class, String.class}, Enumeration.class);
        }
        String str3 = str2 + cls.getName();
        if (classLoader2 == null) {
            try {
                return ClassLoader.getSystemResources(str3);
            } catch (IOException unused) {
                return null;
            }
        } else {
            try {
                return classLoader2.getResources(str3);
            } catch (IOException unused2) {
                return null;
            }
        }
    }
}
