package com.ss.android.ugc.aweme.video.preload.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.preload.b;
import com.ss.android.ugc.aweme.video.preload.c;
import com.ss.android.ugc.aweme.video.preload.d;
import com.ss.android.ugc.aweme.video.preload.e;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76186a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<com.ss.android.ugc.aweme.video.preload.a> f76187b;

    /* renamed from: c  reason: collision with root package name */
    c f76188c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, List<e>> f76189d = new LinkedHashMap<String, List<e>>() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final boolean removeEldestEntry(Map.Entry entry) {
            if (PatchProxy.isSupport(new Object[]{entry}, this, changeQuickRedirect, false, 89294, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, changeQuickRedirect, false, 89294, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
            } else if (size() > 10) {
                return true;
            } else {
                return false;
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f76190e;

    /* renamed from: f  reason: collision with root package name */
    private int f76191f;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.a.a$a  reason: collision with other inner class name */
    public static class C0797a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f76202a = new a();
    }

    public final Object a(VideoUrlModel videoUrlModel, String str, String[] strArr) {
        return null;
    }

    public final d e(VideoUrlModel videoUrlModel) {
        return null;
    }

    public final String e() {
        return "engine";
    }

    public final c d() {
        return this.f76188c;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f76186a, false, 89285, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76186a, false, 89285, new Class[0], Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().cancelAllTasks();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76186a, false, 89286, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76186a, false, 89286, new Class[0], Void.TYPE);
            return;
        }
        DataLoaderHelper.getDataLoader().clearAllCache();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f76186a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 89279(0x15cbf, float:1.25107E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f76186a
            r5 = 0
            r6 = 89279(0x15cbf, float:1.25107E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f76186a
            r4 = 0
            r5 = 89278(0x15cbe, float:1.25105E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            if (r1 == 0) goto L_0x0055
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f76186a
            r6 = 0
            r7 = 89278(0x15cbe, float:1.25105E-40)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = r10
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0081
        L_0x0055:
            android.content.Context r1 = com.ss.android.ugc.aweme.base.utils.d.a()
            if (r1 != 0) goto L_0x005c
            goto L_0x0081
        L_0x005c:
            java.io.File r3 = com.ss.android.ugc.aweme.video.b.b((android.content.Context) r1)
            boolean r4 = com.ss.android.ugc.aweme.video.b.h()
            if (r4 != 0) goto L_0x006a
            java.io.File r3 = r1.getCacheDir()
        L_0x006a:
            if (r3 != 0) goto L_0x006d
            goto L_0x0081
        L_0x006d:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "cachev2"
            r1.<init>(r3, r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x007d
            r1.mkdirs()
        L_0x007d:
            java.lang.String r2 = r1.getAbsolutePath()
        L_0x0081:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x00e9
            r1 = 3
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x00e3 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r3.d()     // Catch:{ Exception -> 0x00e3 }
            int r3 = r3.enginePreloaderOpenTimeOut     // Catch:{ Exception -> 0x00e3 }
            com.ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r3)     // Catch:{ Exception -> 0x00e3 }
            r1 = 2
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x00e3 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r3.d()     // Catch:{ Exception -> 0x00e3 }
            int r3 = r3.enginePreloaderRWTimeOut     // Catch:{ Exception -> 0x00e3 }
            com.ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r3)     // Catch:{ Exception -> 0x00e3 }
            r1 = 4
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x00e3 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r3.d()     // Catch:{ Exception -> 0x00e3 }
            int r3 = r3.enginePreloaderConcurrentNum     // Catch:{ Exception -> 0x00e3 }
            com.ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r3)     // Catch:{ Exception -> 0x00e3 }
            r1 = 6
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x00e3 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r3.d()     // Catch:{ Exception -> 0x00e3 }
            int r3 = r3.enginePreloaderStackOrQueue     // Catch:{ Exception -> 0x00e3 }
            com.ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r3)     // Catch:{ Exception -> 0x00e3 }
            r1 = 5
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x00e3 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r3.d()     // Catch:{ Exception -> 0x00e3 }
            int r3 = r3.enginePreloaderPreloadStrategy     // Catch:{ Exception -> 0x00e3 }
            com.ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r3)     // Catch:{ Exception -> 0x00e3 }
            com.ss.ttvideoengine.TTVideoEngine.setStringValue(r0, r2)     // Catch:{ Exception -> 0x00e3 }
            android.content.Context r0 = com.ss.android.ugc.aweme.base.utils.d.a()     // Catch:{ Exception -> 0x00e3 }
            com.ss.ttvideoengine.TTVideoEngine.startDataLoader(r0)     // Catch:{ Exception -> 0x00e3 }
            com.ss.android.ugc.aweme.video.preload.a.a$2 r0 = new com.ss.android.ugc.aweme.video.preload.a.a$2     // Catch:{ Exception -> 0x00e3 }
            r0.<init>()     // Catch:{ Exception -> 0x00e3 }
            com.ss.ttvideoengine.TTVideoEngine.setDataLoaderListener(r0)     // Catch:{ Exception -> 0x00e3 }
            r0 = 1
            r10.f76190e = r0     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00e9
        L_0x00e3:
            r0 = move-exception
            java.lang.String r1 = "checkInit fail."
            com.bytedance.article.common.monitor.stack.ExceptionMonitor.ensureNotReachHere((java.lang.Throwable) r0, (java.lang.String) r1)
        L_0x00e9:
            boolean r0 = r10.f76190e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.a.a.a():boolean");
    }

    public final void a(int i) {
        this.f76191f = i;
    }

    public final void a(com.ss.android.ugc.aweme.video.preload.a aVar) {
        com.ss.android.ugc.aweme.video.preload.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76186a, false, 89290, new Class[]{com.ss.android.ugc.aweme.video.preload.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76186a, false, 89290, new Class[]{com.ss.android.ugc.aweme.video.preload.a.class}, Void.TYPE);
            return;
        }
        this.f76187b = new WeakReference<>(aVar2);
    }

    public final long a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76186a, false, 89288, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f76186a, false, 89288, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        DataLoaderHelper.DataLoaderCacheFileInfo cacheFileInfo = DataLoaderHelper.getDataLoader().cacheFileInfo(str2);
        if (cacheFileInfo != null) {
            return cacheFileInfo.mCacheSizeFromZero;
        }
        return 0;
    }

    public final int b(VideoUrlModel videoUrlModel) {
        long j;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76186a, false, 89277, new Class[]{VideoUrlModel.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76186a, false, 89277, new Class[]{VideoUrlModel.class}, Integer.TYPE)).intValue();
        } else if (videoUrlModel == null) {
            return 0;
        } else {
            DataLoaderHelper.DataLoaderCacheFileInfo cacheFileInfo = DataLoaderHelper.getDataLoader().cacheFileInfo(videoUrlModel.getBitRatedRatioUri());
            if (cacheFileInfo != null) {
                j = cacheFileInfo.mCacheSizeFromZero;
            } else {
                j = 0;
            }
            return (int) j;
        }
    }

    public final boolean c(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76186a, false, 89282, new Class[]{VideoUrlModel.class}, Boolean.TYPE)) {
            return a(videoUrlModel2, 0);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76186a, false, 89282, new Class[]{VideoUrlModel.class}, Boolean.TYPE)).booleanValue();
    }

    public final void d(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76186a, false, 89284, new Class[]{VideoUrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76186a, false, 89284, new Class[]{VideoUrlModel.class}, Void.TYPE);
            return;
        }
        if (videoUrlModel != null) {
            DataLoaderHelper.getDataLoader().cancelTask(videoUrlModel.getBitRatedRatioUri());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.ss.android.ugc.aweme.video.preload.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.video.preload.e f(com.ss.android.ugc.aweme.feed.model.VideoUrlModel r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f76186a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r1 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.e> r6 = com.ss.android.ugc.aweme.video.preload.e.class
            r3 = 0
            r4 = 89292(0x15ccc, float:1.25125E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f76186a
            r3 = 0
            r4 = 89292(0x15ccc, float:1.25125E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r1 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.e> r6 = com.ss.android.ugc.aweme.video.preload.e.class
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.video.preload.e r0 = (com.ss.android.ugc.aweme.video.preload.e) r0
            return r0
        L_0x0035:
            java.lang.String r0 = r10.getBitRatedRatioUri()
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0064
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.video.preload.e>> r2 = r9.f76189d
            boolean r2 = r2.containsKey(r0)
            if (r2 == 0) goto L_0x0064
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.video.preload.e>> r2 = r9.f76189d
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0064
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0064
            int r1 = r0.size()
            int r1 = r1 - r7
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            com.ss.android.ugc.aweme.video.preload.e r1 = (com.ss.android.ugc.aweme.video.preload.e) r1
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.a.a.f(com.ss.android.ugc.aweme.feed.model.VideoUrlModel):com.ss.android.ugc.aweme.video.preload.e");
    }

    public final List<e> g(VideoUrlModel videoUrlModel) {
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76186a, false, 89293, new Class[]{VideoUrlModel.class}, List.class)) {
            return this.f76189d.get(videoUrlModel.getBitRatedRatioUri());
        }
        return (List) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76186a, false, 89293, new Class[]{VideoUrlModel.class}, List.class);
    }

    public final long b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76186a, false, 89289, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f76186a, false, 89289, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        DataLoaderHelper.DataLoaderCacheFileInfo cacheFileInfo = DataLoaderHelper.getDataLoader().cacheFileInfo(str2);
        if (cacheFileInfo != null) {
            return cacheFileInfo.mMediaSize;
        }
        return 0;
    }

    public final boolean a(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76186a, false, 89276, new Class[]{VideoUrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76186a, false, 89276, new Class[]{VideoUrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (videoUrlModel == null || DataLoaderHelper.getDataLoader().cacheFileInfo(videoUrlModel.getBitRatedRatioUri()) == null) {
            return false;
        } else {
            return true;
        }
    }

    public final void b(com.ss.android.ugc.aweme.video.preload.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f76186a, false, 89291, new Class[]{com.ss.android.ugc.aweme.video.preload.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f76186a, false, 89291, new Class[]{com.ss.android.ugc.aweme.video.preload.a.class}, Void.TYPE);
            return;
        }
        if (this.f76187b != null && this.f76187b.get() == aVar) {
            this.f76187b = null;
        }
    }

    public final boolean a(VideoUrlModel videoUrlModel, int i) {
        int i2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel, Integer.valueOf(i)}, this, f76186a, false, 89283, new Class[]{VideoUrlModel.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel, Integer.valueOf(i)}, this, f76186a, false, 89283, new Class[]{VideoUrlModel.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        StringBuilder sb = new StringBuilder("preload id:");
        sb.append(videoUrlModel.getSourceId());
        sb.append(", size:");
        sb.append(i);
        sb.append(", key:");
        sb.append(videoUrlModel.getBitRatedRatioUri());
        if (this.f76190e && videoUrlModel != null) {
            com.ss.android.ugc.playerkit.videoview.a.a b2 = com.ss.android.ugc.playerkit.videoview.c.a.a().b(videoUrlModel.getBitRatedRatioUri()).b(videoUrlModel, com.ss.android.ugc.playerkit.c.a.r().a(), false);
            if (b2.f77751a != null && b2.f77751a.length > 0) {
                new StringBuilder("preload uri:").append(videoUrlModel.getBitRatedRatioUri());
                if ((i == -1 || i == 0) && this.f76191f > 0) {
                    i2 = this.f76191f;
                } else {
                    i2 = i;
                }
                TTVideoEngine.addTask(videoUrlModel.getBitRatedRatioUri(), videoUrlModel.getBitRatedRatioUri(), b2.f77751a, (long) i2);
                z = true;
            }
        }
        return z;
    }
}
