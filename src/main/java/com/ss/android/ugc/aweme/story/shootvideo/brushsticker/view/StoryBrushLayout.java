package com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.a.b;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout;
import com.ss.android.ugc.aweme.utils.ax;

public class StoryBrushLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73409a;

    /* renamed from: b  reason: collision with root package name */
    public ColorSelectLayout f73410b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f73411c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f73412d;

    /* renamed from: e  reason: collision with root package name */
    public b f73413e;

    /* renamed from: f  reason: collision with root package name */
    public a.C0762a f73414f;
    public int g;
    private Context h;
    private View i;
    private View j;
    private View k;
    private StoryBrushView l;

    public View getBrushView() {
        return this.l;
    }

    public View getCancelView() {
        return this.j;
    }

    public final boolean b() {
        if (!this.f73412d) {
            return true;
        }
        return false;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f73409a, false, 85183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73409a, false, 85183, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.a.b(this);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73409a, false, 85185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73409a, false, 85185, new Class[0], Void.TYPE);
            return;
        }
        c();
        this.f73412d = true;
        if (this.f73413e != null) {
            this.f73413e.dismiss();
        }
    }

    public void setStoryEditViewShowListener(b bVar) {
        this.f73413e = bVar;
    }

    public StoryBrushLayout(@NonNull Context context) {
        this(context, null);
    }

    public void setStoryBrushListener(a.C0762a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f73409a, false, 85187, new Class[]{a.C0762a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f73409a, false, 85187, new Class[]{a.C0762a.class}, Void.TYPE);
            return;
        }
        this.f73414f = aVar;
        if (this.l != null) {
            this.l.setStoryBrushListener(aVar);
        }
    }

    public StoryBrushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.f73412d = true;
        this.g = 2;
        this.h = context;
        if (PatchProxy.isSupport(new Object[0], this, f73409a, false, 85181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73409a, false, 85181, new Class[0], Void.TYPE);
            return;
        }
        this.i = LayoutInflater.from(this.h).inflate(C0906R.layout.a96, null);
        this.l = (StoryBrushView) this.i.findViewById(C0906R.id.nd);
        this.f73410b = (ColorSelectLayout) this.i.findViewById(C0906R.id.ui);
        this.f73411c = (ImageView) this.i.findViewById(C0906R.id.nc);
        this.j = this.i.findViewById(C0906R.id.na);
        this.k = this.i.findViewById(C0906R.id.cxa);
        this.k.setOnClickListener(new a(this));
        this.j.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73415a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f73415a, false, 85191, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f73415a, false, 85191, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (StoryBrushLayout.this.f73414f != null) {
                    StoryBrushLayout.this.f73414f.a();
                }
            }
        });
        this.f73411c.setOnClickListener(new b(this));
        this.f73410b.setColorChangeListener(new c(this));
        addView(this.i);
        View findViewById = findViewById(C0906R.id.d3v);
        if (fc.a()) {
            i2 = (int) UIUtils.dip2Px(getContext(), 40.0f);
        } else {
            i2 = UIUtils.getStatusBarHeight(this.h);
        }
        findViewById.setPadding(0, i2, 0, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(3);
        ofFloat.start();
        c.b(this.f73411c);
        c.a(this.j);
        c.a(this.k);
    }
}
