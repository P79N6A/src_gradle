package com.ss.android.medialib;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.model.Segment;
import java.util.List;

public class FFMpegManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29312a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile FFMpegManager f29313c;

    /* renamed from: b  reason: collision with root package name */
    public FFMpegInvoker f29314b = new FFMpegInvoker();

    @Keep
    public interface EncoderListener {
        void onChooseEncoder(int i);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f29315a = "";

        /* renamed from: b  reason: collision with root package name */
        public String f29316b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f29317c = "";

        /* renamed from: d  reason: collision with root package name */
        public long f29318d;

        /* renamed from: e  reason: collision with root package name */
        public long f29319e;

        /* renamed from: f  reason: collision with root package name */
        public int f29320f;
        public boolean g;
        public int h;
        public String i = "";
        public int j;
        public String k = "";
        public float l = 1.0f;
        public boolean m;
        public int n = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public boolean u = true;
        public EncoderListener v;
        public List<Segment> w;
        public int x;
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f29312a, false, 16190, new Class[0], Integer.TYPE)) {
            return this.f29314b.uninitVideoToGraph();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29312a, false, 16190, new Class[0], Integer.TYPE)).intValue();
    }

    public static FFMpegManager a() {
        if (PatchProxy.isSupport(new Object[0], null, f29312a, true, 16185, new Class[0], FFMpegManager.class)) {
            return (FFMpegManager) PatchProxy.accessDispatch(new Object[0], null, f29312a, true, 16185, new Class[0], FFMpegManager.class);
        }
        synchronized (FFMpegManager.class) {
            if (f29313c == null) {
                synchronized (FFMpegManager.class) {
                    if (f29313c == null) {
                        f29313c = new FFMpegManager();
                    }
                }
            }
        }
        return f29313c;
    }

    public final void a(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f29312a, false, 16186, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f29312a, false, 16186, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.f29314b.setmFFMpagCaller(eVar2);
    }

    public final int b(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f29312a, false, 16206, new Class[]{String.class}, Integer.TYPE)) {
            return a(str, 3000, -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f29312a, false, 16206, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final int c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f29312a, false, 16215, new Class[]{String.class}, Integer.TYPE)) {
            return this.f29314b.checkMp3File(str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f29312a, false, 16215, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final int a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f29312a, false, 16199, new Class[]{a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f29312a, false, 16199, new Class[]{a.class}, Integer.TYPE)).intValue();
        }
        a.a(0);
        int rencodeAndSplitFile = this.f29314b.rencodeAndSplitFile(aVar2.f29315a, aVar2.f29316b, aVar2.f29317c, aVar2.f29318d, aVar2.f29319e, aVar2.f29320f, aVar2.g ? 1 : 0, aVar2.h, aVar2.i, aVar2.j, aVar2.k, aVar2.l, aVar2.m, aVar2.u, aVar2.n, aVar2.o, aVar2.p, aVar2.q, aVar2.r, aVar2.s, aVar2.t, aVar2.v);
        a.a(10000);
        return rencodeAndSplitFile;
    }

    public final int[] a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f29312a, false, 16189, new Class[]{String.class}, int[].class)) {
            return this.f29314b.initVideoToGraph(str2, -1, -1);
        }
        return (int[]) PatchProxy.accessDispatch(new Object[]{str2}, this, f29312a, false, 16189, new Class[]{String.class}, int[].class);
    }

    public final int a(String str, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j3), new Long(j4)}, this, f29312a, false, 16205, new Class[]{String.class, Long.TYPE, Long.TYPE}, Integer.TYPE)) {
            return this.f29314b.isCanImport(str, j, j2);
        }
        Object[] objArr = {str, new Long(j3), new Long(j4)};
        return ((Integer) PatchProxy.accessDispatch(objArr, this, f29312a, false, 16205, new Class[]{String.class, Long.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
    }

    public final int a(String str, String str2, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (!PatchProxy.isSupport(new Object[]{str, str2, new Long(j3), new Long(j4)}, this, f29312a, false, 16213, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE}, Integer.TYPE)) {
            return this.f29314b.resampleAudioToWav(str, str2, j, j2);
        }
        Object[] objArr = {str, str2, new Long(j3), new Long(j4)};
        return ((Integer) PatchProxy.accessDispatch(objArr, this, f29312a, false, 16213, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
    }
}
