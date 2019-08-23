package com.ss.android.ugc.aweme.translation;

import android.support.v4.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.translation.model.VideoTranslationCache;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74955a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f74956b;

    /* renamed from: c  reason: collision with root package name */
    private LruCache<String, VideoTranslationCache> f74957c = new LruCache<>(100);

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f74955a, true, 87280, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f74955a, true, 87280, new Class[0], a.class);
        }
        if (f74956b == null) {
            synchronized (a.class) {
                if (f74956b == null) {
                    f74956b = new a();
                }
            }
        }
        return f74956b;
    }

    public final VideoTranslationCache a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f74955a, false, 87282, new Class[]{String.class}, VideoTranslationCache.class)) {
            return (VideoTranslationCache) PatchProxy.accessDispatch(new Object[]{str2}, this, f74955a, false, 87282, new Class[]{String.class}, VideoTranslationCache.class);
        } else if (str2 == null) {
            return null;
        } else {
            return (VideoTranslationCache) this.f74957c.get(str2);
        }
    }

    public final void a(String str, VideoTranslationCache videoTranslationCache) {
        String str2 = str;
        VideoTranslationCache videoTranslationCache2 = videoTranslationCache;
        if (PatchProxy.isSupport(new Object[]{str2, videoTranslationCache2}, this, f74955a, false, 87281, new Class[]{String.class, VideoTranslationCache.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, videoTranslationCache2}, this, f74955a, false, 87281, new Class[]{String.class, VideoTranslationCache.class}, Void.TYPE);
        } else if (str2 != null) {
            this.f74957c.put(str2, videoTranslationCache2);
        }
    }
}
