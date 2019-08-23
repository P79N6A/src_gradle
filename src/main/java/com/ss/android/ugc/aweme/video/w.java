package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Random;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76277a;

    /* renamed from: b  reason: collision with root package name */
    private static Random f76278b = new Random();

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f76277a, true, 89041, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76277a, true, 89041, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return f76278b.nextBoolean();
    }
}
