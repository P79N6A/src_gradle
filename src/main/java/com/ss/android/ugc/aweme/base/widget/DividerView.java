package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.b;
import com.ss.android.ugc.aweme.base.widget.a.a;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class DividerView extends View implements b<a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<Class, Constructor<ViewGroup.LayoutParams>> sConstructorMapCache = new HashMap();
    private Class layoutParamClazz;
    int mBackgroundColor;
    int mForegroundColor;
    private a mViewModel;

    /* renamed from: com.ss.android.ugc.aweme.base.widget.DividerView$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35093a = new int[a.C0451a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.ss.android.ugc.aweme.base.widget.a.a$a[] r0 = com.ss.android.ugc.aweme.base.widget.a.a.C0451a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35093a = r0
                int[] r0 = f35093a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.base.widget.a.a$a r1 = com.ss.android.ugc.aweme.base.widget.a.a.C0451a.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f35093a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.base.widget.a.a$a r1 = com.ss.android.ugc.aweme.base.widget.a.a.C0451a.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.widget.DividerView.AnonymousClass1.<clinit>():void");
        }
    }

    public DividerView create(Context context, ViewGroup viewGroup) {
        return this;
    }

    public View getAndroidView() {
        return this;
    }

    private void hide() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 25420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 25420, new Class[0], Void.TYPE);
            return;
        }
        if (getVisibility() != 8) {
            setVisibility(8);
            requestLayout();
        }
    }

    public void refresh() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 25421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 25421, new Class[0], Void.TYPE);
            return;
        }
        if (this.mViewModel != null) {
            bind(this.mViewModel);
        }
    }

    public DividerView(Context context) {
        super(context);
    }

    public DividerView setLayoutParamClazz(Class cls) {
        this.layoutParamClazz = cls;
        return this;
    }

    private void setColor(a aVar) {
        this.mForegroundColor = aVar.f35118f;
        this.mBackgroundColor = aVar.g;
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, changeQuickRedirect, false, 25422, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, changeQuickRedirect, false, 25422, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.mViewModel != null) {
            canvas.clipRect(0, 0, getWidth(), getHeight());
            canvas.drawColor(this.mBackgroundColor);
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.drawColor(this.mForegroundColor);
        }
    }

    public void bind(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 25419, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 25419, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.mViewModel = aVar;
        if (aVar == null) {
            hide();
            return;
        }
        setColor(aVar);
        int i = aVar.f35116d;
        if (i <= 0) {
            hide();
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int[] iArr = aVar.f35117e;
        if (iArr != null) {
            setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        } else {
            setPadding(0, 0, 0, 0);
        }
        if (getLayoutParams() == null) {
            setLayoutParams(createLayoutParams(aVar.f35115b, i, aVar.i));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (AnonymousClass1.f35093a[aVar.i.ordinal()] != 2) {
            if (layoutParams.height != i) {
                layoutParams.height = i;
                requestLayout();
            }
        } else if (layoutParams.width != i) {
            layoutParams.width = i;
            requestLayout();
        }
    }

    public DividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private ViewGroup.LayoutParams createLayoutParams(Class cls, int i, a.C0451a aVar) {
        Class cls2;
        if (PatchProxy.isSupport(new Object[]{cls, Integer.valueOf(i), aVar}, this, changeQuickRedirect, false, 25418, new Class[]{Class.class, Integer.TYPE, a.C0451a.class}, ViewGroup.LayoutParams.class)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{cls, Integer.valueOf(i), aVar}, this, changeQuickRedirect, false, 25418, new Class[]{Class.class, Integer.TYPE, a.C0451a.class}, ViewGroup.LayoutParams.class);
        }
        if (cls == null) {
            cls2 = ViewGroup.LayoutParams.class;
        } else {
            cls2 = cls;
        }
        try {
            Constructor constructor = sConstructorMapCache.get(cls2);
            if (constructor == null) {
                constructor = cls2.getConstructor(new Class[]{Integer.TYPE, Integer.TYPE});
                sConstructorMapCache.put(cls2, constructor);
            }
            if (AnonymousClass1.f35093a[aVar.ordinal()] != 2) {
                return (ViewGroup.LayoutParams) constructor.newInstance(new Object[]{-1, Integer.valueOf(i)});
            }
            return (ViewGroup.LayoutParams) constructor.newInstance(new Object[]{Integer.valueOf(i), -1});
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
