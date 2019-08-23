package com.ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.LruCache;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;

public class fb {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75865a;

    /* renamed from: e  reason: collision with root package name */
    private static fb f75866e;

    /* renamed from: b  reason: collision with root package name */
    public Handler f75867b;

    /* renamed from: c  reason: collision with root package name */
    public LruCache<String, Bitmap> f75868c;

    /* renamed from: d  reason: collision with root package name */
    public String f75869d;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f75870f;
    private int g;

    public static fb a() {
        if (PatchProxy.isSupport(new Object[0], null, f75865a, true, 88698, new Class[0], fb.class)) {
            return (fb) PatchProxy.accessDispatch(new Object[0], null, f75865a, true, 88698, new Class[0], fb.class);
        }
        if (f75866e == null) {
            f75866e = new fb();
        }
        return f75866e;
    }

    private fb() {
        ExecutorService executorService;
        if (PatchProxy.isSupport(new Object[]{4}, null, fc.f75873a, true, 88706, new Class[]{Integer.TYPE}, ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[]{4}, null, fc.f75873a, true, 88706, new Class[]{Integer.TYPE}, ExecutorService.class);
        } else {
            executorService = h.a(m.a(p.FIXED).a(4).a());
        }
        this.f75870f = executorService;
        this.f75867b = new Handler(Looper.getMainLooper());
        this.g = (int) Runtime.getRuntime().totalMemory();
        this.f75868c = new LruCache<String, Bitmap>(this.g / 5) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75871a;

            public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                if (!PatchProxy.isSupport(new Object[]{str, bitmap}, this, f75871a, false, 88703, new Class[]{String.class, Bitmap.class}, Integer.TYPE)) {
                    return bitmap.getRowBytes() * bitmap.getHeight();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str, bitmap}, this, f75871a, false, 88703, new Class[]{String.class, Bitmap.class}, Integer.TYPE)).intValue();
            }
        };
        this.f75869d = a.f61119b.getCacheDir().getPath();
    }

    @Nullable
    public final Bitmap a(String str, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{str, 90, 110, 1}, this, f75865a, false, 88701, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{str, 90, 110, 1}, this, f75865a, false, 88701, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class);
        }
        try {
            return ThumbnailUtils.extractThumbnail((Bitmap) Reflect.on(ThumbnailUtils.class).call("createImageThumbnail", new Class[]{String.class, Integer.TYPE}, str, 1).get(), 90, 110, 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
