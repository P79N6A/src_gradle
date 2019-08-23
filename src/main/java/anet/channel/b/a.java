package anet.channel.b;

import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.cache.Cache;
import com.taobao.alivfssdk.cache.AVFSCache;
import com.taobao.alivfssdk.cache.AVFSCacheConfig;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.IAVFSCache;

public class a implements Cache {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1168a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Object f1169b;

    /* renamed from: c  reason: collision with root package name */
    private static Object f1170c;

    /* renamed from: d  reason: collision with root package name */
    private static Object f1171d;

    private IAVFSCache b() {
        AVFSCache cacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache");
        if (cacheForModule != null) {
            return cacheForModule.getFileCache();
        }
        return null;
    }

    public void clear() {
        if (f1168a) {
            try {
                IAVFSCache b2 = b();
                if (b2 != null) {
                    b2.removeAllObject((IAVFSCache.OnAllObjectRemoveCallback) f1171d);
                }
            } catch (Exception e2) {
                ALog.e("anet.AVFSCacheImpl", "clear cache failed", null, e2, new Object[0]);
            }
        }
    }

    static {
        try {
            Class.forName("com.taobao.alivfssdk.cache.AVFSCacheManager");
            f1169b = new b();
            f1170c = new c();
            f1171d = new d();
        } catch (ClassNotFoundException unused) {
            ALog.w("anet.AVFSCacheImpl", "no alivfs sdk!", null, new Object[0]);
        }
    }

    public void a() {
        if (f1168a) {
            AVFSCache cacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache");
            if (cacheForModule != null) {
                AVFSCacheConfig aVFSCacheConfig = new AVFSCacheConfig();
                aVFSCacheConfig.limitSize = 5242880L;
                aVFSCacheConfig.fileMemMaxSize = 1048576;
                cacheForModule.moduleConfig(aVFSCacheConfig);
            }
        }
    }

    public Cache.Entry get(String str) {
        if (!f1168a) {
            return null;
        }
        try {
            IAVFSCache b2 = b();
            if (b2 != null) {
                return (Cache.Entry) b2.objectForKey(StringUtils.md5ToHex(str));
            }
        } catch (Exception e2) {
            ALog.e("anet.AVFSCacheImpl", "get cache failed", null, e2, new Object[0]);
        }
        return null;
    }

    public void remove(String str) {
        if (f1168a) {
            try {
                IAVFSCache b2 = b();
                if (b2 != null) {
                    b2.removeObjectForKey(StringUtils.md5ToHex(str), (IAVFSCache.OnObjectRemoveCallback) f1170c);
                }
            } catch (Exception e2) {
                ALog.e("anet.AVFSCacheImpl", "remove cache failed", null, e2, new Object[0]);
            }
        }
    }

    public void put(String str, Cache.Entry entry) {
        if (f1168a) {
            try {
                IAVFSCache b2 = b();
                if (b2 != null) {
                    b2.setObjectForKey(StringUtils.md5ToHex(str), entry, (IAVFSCache.OnObjectSetCallback) f1169b);
                }
            } catch (Exception e2) {
                ALog.e("anet.AVFSCacheImpl", "put cache failed", null, e2, new Object[0]);
            }
        }
    }
}
