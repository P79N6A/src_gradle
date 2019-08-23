package com.ss.android.ugc.aweme.shortvideo.imageframe;

import android.app.ActivityManager;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.support.v4.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68217a;

    /* renamed from: b  reason: collision with root package name */
    static final b f68218b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final LruCache<String, BitmapDrawable> f68219c;

    /* renamed from: d  reason: collision with root package name */
    private final ReadWriteLock f68220d = new ReentrantReadWriteLock();

    private b() {
        this.f68219c = new ImageCache$1(this, (int) (((long) (((((ActivityManager) GlobalContext.getContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryClass() * 1024) * 1024) / 4)) <= 0 ? 1 : (long) (((((ActivityManager) GlobalContext.getContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryClass() * 1024) * 1024) / 4)));
    }

    @Nullable
    public final BitmapDrawable a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f68217a, false, 77510, new Class[]{String.class}, BitmapDrawable.class)) {
            return (BitmapDrawable) PatchProxy.accessDispatch(new Object[]{str}, this, f68217a, false, 77510, new Class[]{String.class}, BitmapDrawable.class);
        }
        try {
            this.f68220d.readLock().lock();
            return (BitmapDrawable) this.f68219c.get(str);
        } finally {
            this.f68220d.readLock().unlock();
        }
    }

    public final void a(String str, BitmapDrawable bitmapDrawable) {
        if (PatchProxy.isSupport(new Object[]{str, bitmapDrawable}, this, f68217a, false, 77511, new Class[]{String.class, BitmapDrawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, bitmapDrawable}, this, f68217a, false, 77511, new Class[]{String.class, BitmapDrawable.class}, Void.TYPE);
            return;
        }
        try {
            this.f68220d.writeLock().lock();
            this.f68219c.put(str, bitmapDrawable);
        } finally {
            this.f68220d.writeLock().unlock();
        }
    }
}
