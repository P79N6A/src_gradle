package com.bytedance.android.live.core.utils.fresco;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;

public class ImageTypeRecorder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8254a;

    /* renamed from: c  reason: collision with root package name */
    private static ImageTypeRecorder f8255c;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, Integer> f8256b = new ConcurrentHashMap<>();

    public @interface Type {
    }

    private ImageTypeRecorder() {
    }

    public static ImageTypeRecorder a() {
        if (PatchProxy.isSupport(new Object[0], null, f8254a, true, 1390, new Class[0], ImageTypeRecorder.class)) {
            return (ImageTypeRecorder) PatchProxy.accessDispatch(new Object[0], null, f8254a, true, 1390, new Class[0], ImageTypeRecorder.class);
        }
        if (f8255c != null) {
            return f8255c;
        }
        synchronized (ImageTypeRecorder.class) {
            if (f8255c == null) {
                f8255c = new ImageTypeRecorder();
            }
        }
        return f8255c;
    }
}
