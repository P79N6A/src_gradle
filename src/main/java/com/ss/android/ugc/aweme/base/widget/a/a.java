package com.ss.android.ugc.aweme.base.widget.a;

import android.support.annotation.ColorInt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.impl.b;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.widget.DividerView;

public class a extends b<DividerView> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35113a;

    /* renamed from: c  reason: collision with root package name */
    public static final int f35114c = u.a(0.5d);

    /* renamed from: b  reason: collision with root package name */
    public Class f35115b;

    /* renamed from: d  reason: collision with root package name */
    public int f35116d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f35117e;

    /* renamed from: f  reason: collision with root package name */
    public int f35118f;
    public int g;
    public C0451a i;

    /* renamed from: com.ss.android.ugc.aweme.base.widget.a.a$a  reason: collision with other inner class name */
    public enum C0451a {
        VERTICAL,
        HORIZONTAL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private a(int i2) {
        this(i2, null, 0, 0);
    }

    public a(int i2, C0451a aVar) {
        this(i2);
        this.i = aVar;
    }

    private a(int i2, int[] iArr, @ColorInt int i3, @ColorInt int i4) {
        this.i = C0451a.VERTICAL;
        if (PatchProxy.isSupport(new Object[]{null}, this, f35113a, false, 25525, new Class[]{int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f35113a, false, 25525, new Class[]{int[].class}, Void.TYPE);
        }
        this.f35116d = i2;
        this.f35117e = null;
        this.f35118f = i3;
        this.g = i4;
    }
}
