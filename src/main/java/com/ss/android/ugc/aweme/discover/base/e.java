package com.ss.android.ugc.aweme.discover.base;

import android.support.annotation.ColorInt;
import android.support.v7.graphics.Palette;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.HashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42159a;

    /* renamed from: e  reason: collision with root package name */
    public static HashMap<Integer, Integer> f42160e = new HashMap<>();
    static final Palette.Filter h = new PaletteDelegate$3();
    @ColorInt

    /* renamed from: b  reason: collision with root package name */
    public int f42161b;

    /* renamed from: c  reason: collision with root package name */
    public a f42162c;

    /* renamed from: d  reason: collision with root package name */
    public UrlModel f42163d;

    /* renamed from: f  reason: collision with root package name */
    public Palette f42164f;
    public int g;

    public interface a {
        void a(@ColorInt int i);
    }

    public final boolean a(UrlModel urlModel) {
        if (urlModel == this.f42163d) {
            return true;
        }
        return false;
    }

    public final void a(@ColorInt int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42159a, false, 36161, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42159a, false, 36161, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42162c.a(i);
    }
}
