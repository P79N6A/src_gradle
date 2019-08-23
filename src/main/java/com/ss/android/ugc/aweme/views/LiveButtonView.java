package com.ss.android.ugc.aweme.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;

public class LiveButtonView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76369a;

    /* renamed from: b  reason: collision with root package name */
    public int f76370b;

    /* renamed from: c  reason: collision with root package name */
    public float f76371c;

    /* renamed from: d  reason: collision with root package name */
    public a f76372d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f76373e;

    /* renamed from: f  reason: collision with root package name */
    private LinkedList<View> f76374f;

    public interface a {
        void a();

        void b();
    }

    public void setOnStatusListener(a aVar) {
        this.f76372d = aVar;
    }

    public void setAlphaForAlphaViews(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f76369a, false, 89578, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f76369a, false, 89578, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        Iterator it2 = this.f76374f.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setAlpha(f2);
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f76369a, false, 89571, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f76369a, false, 89571, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f76369a, false, 89576, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f76369a, false, 89576, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.f76370b != 0) {
            float width = (((float) getWidth()) * (1.0f - this.f76371c)) / 2.0f;
            canvas.drawRoundRect(new RectF(width, 0.0f, (((float) getWidth()) * this.f76371c) + width, (float) getHeight()), (float) (getHeight() / 2), (float) (getHeight() / 2), this.f76373e);
            setAlphaForAlphaViews((1.0f - this.f76371c) / 0.5f);
            ((ViewGroup) getParent()).setAlpha(1.0f - ((1.0f - this.f76371c) / 0.5f));
        }
        super.onDraw(canvas);
    }
}
