package com.bytedance.android.livesdk.widget.a;

import android.graphics.Typeface;
import com.bytedance.android.livesdk.widget.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import java.io.File;

public final /* synthetic */ class e implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18398a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f18399b = new e();

    private e() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18398a, false, 14821, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f18398a, false, 14821, new Class[]{Object.class}, Object.class);
        }
        File file = (File) obj;
        return new a.b(file.getName().replace(".ttf", ""), Typeface.createFromFile(file), (byte) 0);
    }
}
