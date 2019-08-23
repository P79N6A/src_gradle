package com.ss.android.ugc.aweme.video.preload;

import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.preload.a.a;
import com.ss.android.ugc.aweme.video.preload.f;
import com.ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.aweme.video.w;
import java.util.List;

public class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76257a;

    /* renamed from: b  reason: collision with root package name */
    public LruCache<String, Long> f76258b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f76259c;

    /* renamed from: d  reason: collision with root package name */
    private b f76260d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final g f76261a = new g((byte) 0);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76262a;

        public static boolean a() {
            if (PatchProxy.isSupport(new Object[0], null, f76262a, true, 89275, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76262a, true, 89275, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (!com.ss.android.g.a.a() || !p.a().b() || AbTestManager.a().d().enablePreloadBackground()) {
                return true;
            }
            return false;
        }
    }

    public static g f() {
        return a.f76261a;
    }

    public final boolean a(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89233, new Class[]{VideoUrlModel.class}, Boolean.TYPE)) {
            return g().a(videoUrlModel2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89233, new Class[]{VideoUrlModel.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f76257a, false, 89235, new Class[0], Boolean.TYPE)) {
            return g().a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76257a, false, 89235, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean a(VideoUrlModel videoUrlModel, int i) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel2, Integer.valueOf(i)}, this, f76257a, false, 89238, new Class[]{VideoUrlModel.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel2, Integer.valueOf(i)}, this, f76257a, false, 89238, new Class[]{VideoUrlModel.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!b.a()) {
            return false;
        } else {
            return g().a(videoUrlModel2, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme[] r19, int r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f76257a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme[]> r3 = com.ss.android.ugc.aweme.feed.model.Aweme[].class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 89249(0x15ca1, float:1.25064E-40)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004d
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f76257a
            r14 = 0
            r15 = 89249(0x15ca1, float:1.25064E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme[]> r1 = com.ss.android.ugc.aweme.feed.model.Aweme[].class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x004d:
            if (r0 == 0) goto L_0x0065
            int r1 = r0.length
            if (r1 > 0) goto L_0x0053
            goto L_0x0065
        L_0x0053:
            int r1 = r0.length
        L_0x0054:
            if (r9 >= r1) goto L_0x0062
            r2 = r0[r9]
            r3 = r18
            r4 = r20
            r3.a((com.ss.android.ugc.aweme.feed.model.Aweme) r2, (int) r4)
            int r9 = r9 + 1
            goto L_0x0054
        L_0x0062:
            r3 = r18
            return
        L_0x0065:
            r3 = r18
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.g.a(com.ss.android.ugc.aweme.feed.model.Aweme[], int):void");
    }

    public final void a(boolean z, int i, List<Aweme> list, List<PreloadTask> list2) {
        List<Aweme> list3 = list;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), list3, list2}, this, f76257a, false, 89250, new Class[]{Boolean.TYPE, Integer.TYPE, List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), list3, list2}, this, f76257a, false, 89250, new Class[]{Boolean.TYPE, Integer.TYPE, List.class, List.class}, Void.TYPE);
        } else if ((AbTestManager.a().aY() != 2 || !w.a()) && b.a()) {
            for (PreloadTask next : list2) {
                if (next.count <= 0 || next.offset < 0) {
                    boolean z2 = z;
                    int i2 = i;
                } else {
                    a(a(z, list3, next.count, i, next.offset), next.getVideoPreloadSize());
                }
            }
        }
    }

    private g() {
        this.f76258b = new LruCache<>(1048576);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f76257a, false, 89254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76257a, false, 89254, new Class[0], Void.TYPE);
            return;
        }
        g().b();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76257a, false, 89258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76257a, false, 89258, new Class[0], Void.TYPE);
            return;
        }
        g().c();
    }

    public final c d() {
        if (!PatchProxy.isSupport(new Object[0], this, f76257a, false, 89270, new Class[0], c.class)) {
            return g().d();
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f76257a, false, 89270, new Class[0], c.class);
    }

    public final String e() {
        if (!PatchProxy.isSupport(new Object[0], this, f76257a, false, 89236, new Class[0], String.class)) {
            return g().e();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f76257a, false, 89236, new Class[0], String.class);
    }

    public final b h() {
        if (!PatchProxy.isSupport(new Object[0], this, f76257a, false, 89244, new Class[0], b.class)) {
            return g();
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, f76257a, false, 89244, new Class[0], b.class);
    }

    public b g() {
        if (PatchProxy.isSupport(new Object[0], this, f76257a, false, 89232, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f76257a, false, 89232, new Class[0], b.class);
        }
        if (!this.f76259c) {
            synchronized (this) {
                if (this.f76260d == null) {
                    if (AbTestManager.a().ai() == 2) {
                        this.f76260d = a.C0797a.f76202a;
                    } else {
                        this.f76260d = f.b.f76256a;
                    }
                    this.f76260d.a();
                    this.f76259c = true;
                }
            }
        }
        return this.f76260d;
    }

    /* synthetic */ g(byte b2) {
        this();
    }

    public final void a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f76257a, false, 89246, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f76257a, false, 89246, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        a(aweme2, -1);
    }

    private VideoUrlModel c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f76257a, false, 89257, new Class[]{Aweme.class}, VideoUrlModel.class)) {
            return (VideoUrlModel) PatchProxy.accessDispatch(new Object[]{aweme}, this, f76257a, false, 89257, new Class[]{Aweme.class}, VideoUrlModel.class);
        } else if (aweme == null) {
            return null;
        } else {
            Video video = aweme.getVideo();
            if (video == null) {
                return null;
            }
            VideoUrlModel properPlayAddr = video.getProperPlayAddr();
            if (properPlayAddr == null) {
                return null;
            }
            properPlayAddr.setRatio(video.getRatio());
            if (!com.ss.android.ugc.playerkit.b.a((UrlModel) properPlayAddr)) {
                return null;
            }
            return properPlayAddr;
        }
    }

    public final long a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f76257a, false, 89261, new Class[]{String.class}, Long.TYPE)) {
            return g().a(str2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f76257a, false, 89261, new Class[]{String.class}, Long.TYPE)).longValue();
    }

    public final int b(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89234, new Class[]{VideoUrlModel.class}, Integer.TYPE)) {
            return g().b(videoUrlModel2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89234, new Class[]{VideoUrlModel.class}, Integer.TYPE)).intValue();
    }

    public final void d(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89239, new Class[]{VideoUrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89239, new Class[]{VideoUrlModel.class}, Void.TYPE);
            return;
        }
        g().d(videoUrlModel2);
    }

    public final d e(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89268, new Class[]{VideoUrlModel.class}, d.class)) {
            return g().e(videoUrlModel2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89268, new Class[]{VideoUrlModel.class}, d.class);
    }

    public final e f(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89273, new Class[]{VideoUrlModel.class}, e.class)) {
            return h().f(videoUrlModel2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89273, new Class[]{VideoUrlModel.class}, e.class);
    }

    public final long h(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76257a, false, 89241, new Class[]{VideoUrlModel.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76257a, false, 89241, new Class[]{VideoUrlModel.class}, Long.TYPE)).longValue();
        } else if (videoUrlModel != null) {
            return g().b(videoUrlModel.getBitRatedRatioUri());
        } else {
            return -1;
        }
    }

    public final int i(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89243, new Class[]{VideoUrlModel.class}, Integer.TYPE)) {
            return g().b(videoUrlModel2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89243, new Class[]{VideoUrlModel.class}, Integer.TYPE)).intValue();
    }

    public final d j(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89245, new Class[]{VideoUrlModel.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89245, new Class[]{VideoUrlModel.class}, d.class);
        } else if (videoUrlModel2 != null) {
            return g().e(videoUrlModel2);
        } else {
            return null;
        }
    }

    public final long b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f76257a, false, 89262, new Class[]{String.class}, Long.TYPE)) {
            return g().b(str2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f76257a, false, 89262, new Class[]{String.class}, Long.TYPE)).longValue();
    }

    public final boolean c(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89237, new Class[]{VideoUrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89237, new Class[]{VideoUrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (!b.a()) {
            return false;
        } else {
            return g().c(videoUrlModel2);
        }
    }

    public final List<e> g(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76257a, false, 89274, new Class[]{VideoUrlModel.class}, List.class)) {
            return h().g(videoUrlModel2);
        }
        return (List) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76257a, false, 89274, new Class[]{VideoUrlModel.class}, List.class);
    }

    public final void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f76257a, false, 89253, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f76257a, false, 89253, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        VideoUrlModel c2 = c(aweme);
        if (c2 != null) {
            g().d(c2);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76257a, false, 89271, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76257a, false, 89271, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        g().a(i);
    }

    public final void b(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76257a, false, 89267, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76257a, false, 89267, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f76260d != null) {
            g().b(aVar2);
        }
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76257a, false, 89266, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76257a, false, 89266, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f76260d != null) {
            g().a(aVar2);
        }
    }

    public final void a(Aweme aweme, int i) {
        VideoUrlModel videoUrlModel;
        boolean z;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f76257a, false, 89247, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f76257a, false, 89247, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
        } else if (aweme == null || aweme.isLive() || aweme.getVideo() == null || aweme.getVideo().getProperPlayAddr() == null) {
        } else if (b.a()) {
            if (AbTestManager.a().bp()) {
                videoUrlModel = i.a(aweme.getVideo(), com.ss.android.ugc.playerkit.c.a.r().a());
            } else {
                videoUrlModel = aweme.getVideo().getProperPlayAddr();
            }
            if (videoUrlModel != null && com.ss.android.ugc.aweme.video.e.a.b()) {
                videoUrlModel.setSourceId(aweme.getAid());
                videoUrlModel.setRatio(aweme.getVideo().getRatio());
                if (com.ss.android.ugc.playerkit.b.a((UrlModel) videoUrlModel)) {
                    if (i2 < 0) {
                        z = g().c(videoUrlModel);
                    } else {
                        z = g().a(videoUrlModel, i2);
                    }
                    if (z) {
                        this.f76258b.put(videoUrlModel.getUri(), 0L);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.ugc.aweme.feed.model.VideoUrlModel r22, java.lang.String r23, java.lang.String[] r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f76257a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r5 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r13] = r5
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r7 = 0
            r8 = 89260(0x15cac, float:1.2508E-40)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005a
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f76257a
            r17 = 0
            r18 = 89260(0x15cac, float:1.2508E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r1 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class<java.lang.Object> r20 = java.lang.Object.class
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x005a:
            com.ss.android.ugc.aweme.video.preload.b r3 = r21.g()
            java.lang.Object r0 = r3.a(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.g.a(com.ss.android.ugc.aweme.feed.model.VideoUrlModel, java.lang.String, java.lang.String[]):java.lang.Object");
    }

    public static Aweme[] a(boolean z, List<Aweme> list, int i, int i2, int i3) {
        List<Aweme> list2 = list;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), list2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f76257a, true, 89252, new Class[]{Boolean.TYPE, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Aweme[].class)) {
            Object[] objArr = {Byte.valueOf(z), list2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            return (Aweme[]) PatchProxy.accessDispatch(objArr, null, f76257a, true, 89252, new Class[]{Boolean.TYPE, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Aweme[].class);
        }
        Aweme[] awemeArr = new Aweme[i];
        if (z) {
            while (i4 < awemeArr.length) {
                int i5 = i2 + 1 + i4 + i3;
                if (i5 < list.size()) {
                    awemeArr[i4] = list2.get(i5);
                }
                i4++;
            }
        } else {
            while (i4 < awemeArr.length) {
                int i6 = ((i2 - 1) - i4) - i3;
                if (i6 >= 0 && i6 < list.size()) {
                    awemeArr[i4] = list2.get(i6);
                }
                i4++;
            }
        }
        return awemeArr;
    }
}
