package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONException;
import org.json.JSONObject;

public class FpsRecyclerView extends RecyclerView {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f76332d;

    /* renamed from: e  reason: collision with root package name */
    JSONObject f76333e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f76334f;
    long g = -1;
    long h;
    long i;
    int j;
    int k;
    int l;
    long m = Long.MIN_VALUE;
    String n = "unKnown";

    /* renamed from: com.ss.android.ugc.aweme.views.FpsRecyclerView$1  reason: invalid class name */
    class AnonymousClass1 extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FpsRecyclerView f76336b;

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            String str;
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f76335a, false, 89469, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f76335a, false, 89469, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f76336b.f76334f = false;
                FpsRecyclerView fpsRecyclerView = this.f76336b;
                if (PatchProxy.isSupport(new Object[0], fpsRecyclerView, FpsRecyclerView.f76332d, false, 89468, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], fpsRecyclerView, FpsRecyclerView.f76332d, false, 89468, new Class[0], Void.TYPE);
                } else if (!(fpsRecyclerView.h == 0 || fpsRecyclerView.i == 0 || fpsRecyclerView.f76333e == null)) {
                    long j = (fpsRecyclerView.i * 1000) / fpsRecyclerView.h;
                    try {
                        fpsRecyclerView.f76333e.put("average", j);
                        fpsRecyclerView.f76333e.put("Max", fpsRecyclerView.m);
                        fpsRecyclerView.f76333e.put("GT16", ((long) (fpsRecyclerView.j * 100)) / fpsRecyclerView.i);
                        fpsRecyclerView.f76333e.put("GT32", ((long) (fpsRecyclerView.k * 100)) / fpsRecyclerView.i);
                        fpsRecyclerView.f76333e.put("GT64", ((long) (fpsRecyclerView.l * 100)) / fpsRecyclerView.i);
                        n.a("aweme_fps_data", fpsRecyclerView.n, fpsRecyclerView.f76333e);
                    } catch (JSONException unused) {
                    }
                    StringBuilder sb = new StringBuilder("tab:");
                    if (fpsRecyclerView.n != null) {
                        str = fpsRecyclerView.n;
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append("; totalNum:");
                    sb.append(fpsRecyclerView.i);
                    sb.append("; average:");
                    sb.append(j);
                    sb.append("; Max:");
                    sb.append(fpsRecyclerView.m);
                    sb.append("; GT16:");
                    sb.append(((long) (fpsRecyclerView.j * 100)) / fpsRecyclerView.i);
                    sb.append("; GT32:");
                    sb.append(((long) (fpsRecyclerView.k * 100)) / fpsRecyclerView.i);
                    sb.append("; GT64:");
                    sb.append(((long) (fpsRecyclerView.l * 100)) / fpsRecyclerView.i);
                    fpsRecyclerView.h = 0;
                    fpsRecyclerView.i = 0;
                    fpsRecyclerView.g = -1;
                    fpsRecyclerView.j = 0;
                    fpsRecyclerView.k = 0;
                    fpsRecyclerView.l = 0;
                    fpsRecyclerView.m = Long.MIN_VALUE;
                }
            } else {
                this.f76336b.f76334f = true;
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f76335a, false, 89470, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f76335a, false, 89470, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public void setLabel(String str) {
        this.n = str;
    }

    public FpsRecyclerView(Context context) {
        super(context);
    }

    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f76332d, false, 89466, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f76332d, false, 89466, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public FpsRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FpsRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
