package com.bytedance.android.livesdk.feed.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdkapi.view.c;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveTabIndicator extends HorizontalScrollView {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f14526f;

    /* renamed from: a  reason: collision with root package name */
    private boolean f14527a = true;
    LinearLayout g;
    a h;
    Map<Long, Boolean> i = new HashMap();
    List<g> j;

    public interface a {
        void a(g gVar);
    }

    public int getLayoutId() {
        return C0906R.layout.an7;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14526f, false, 9048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14526f, false, 9048, new Class[0], Void.TYPE);
            return;
        }
        inflate(getContext(), getLayoutId(), this);
        setHorizontalScrollBarEnabled(false);
        this.g = (LinearLayout) findViewById(C0906R.id.yl);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14526f, false, 9056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14526f, false, 9056, new Class[0], Void.TYPE);
            return;
        }
        getParentViewPager();
    }

    private c getParentViewPager() {
        if (PatchProxy.isSupport(new Object[0], this, f14526f, false, 9058, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f14526f, false, 9058, new Class[0], c.class);
        }
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof c)) {
            viewParent = viewParent.getParent();
        }
        return (c) viewParent;
    }

    public int getItemGap() {
        if (PatchProxy.isSupport(new Object[0], this, f14526f, false, 9054, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14526f, false, 9054, new Class[0], Integer.TYPE)).intValue();
        } else if (this.j.size() > 5 || this.j.size() <= 1) {
            return (int) UIUtils.dip2Px(getContext(), 30.0f);
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
            int i2 = 0;
            for (g gVar : this.j) {
                i2 = (int) (((float) i2) + textPaint.measureText(gVar.f14081c));
            }
            int screenWidth = UIUtils.getScreenWidth(getContext());
            int[] leftAndRightPadding = getLeftAndRightPadding();
            return (((screenWidth - leftAndRightPadding[0]) - leftAndRightPadding[1]) - i2) / (this.j.size() - 1);
        }
    }

    public int[] getLeftAndRightPadding() {
        if (PatchProxy.isSupport(new Object[0], this, f14526f, false, 9053, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f14526f, false, 9053, new Class[0], int[].class);
        } else if (this.j.size() == 1) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
            int screenWidth = (int) ((((float) UIUtils.getScreenWidth(getContext())) - textPaint.measureText(this.j.get(0).f14081c)) / 2.0f);
            return new int[]{screenWidth, screenWidth};
        } else if (this.j.size() == 2) {
            int screenWidth2 = UIUtils.getScreenWidth(getContext());
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
            float f2 = (float) (screenWidth2 / 2);
            return new int[]{(int) ((f2 - textPaint2.measureText(this.j.get(0).f14081c)) / 2.0f), (int) ((f2 - textPaint2.measureText(this.j.get(1).f14081c)) / 2.0f)};
        } else {
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 30.0f);
            return new int[]{dip2Px, dip2Px};
        }
    }

    public void setOnTabClickListener(a aVar) {
        this.h = aVar;
    }

    public LiveTabIndicator(Context context) {
        super(context);
        a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f14526f, false, 9055, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f14526f, false, 9055, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            b();
        } else if (motionEvent.getAction() != 2) {
            if (PatchProxy.isSupport(new Object[0], this, f14526f, false, 9057, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14526f, false, 9057, new Class[0], Void.TYPE);
            } else {
                getParentViewPager();
            }
        } else if (onInterceptTouchEvent) {
            b();
        }
        return onInterceptTouchEvent;
    }

    public final void a(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f14526f, false, 9051, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f14526f, false, 9051, new Class[]{g.class}, Void.TYPE);
            return;
        }
        int childCount = this.g.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            com.bytedance.android.livesdk.feed.tab.c.a aVar = (com.bytedance.android.livesdk.feed.tab.c.a) this.g.getChildAt(i2);
            long j2 = this.j.get(i2).f14080b;
            if (j2 == gVar.f14080b) {
                aVar.setChecked(true);
                this.i.put(Long.valueOf(j2), Boolean.TRUE);
                this.j.get(i2).k = true;
            } else {
                aVar.setChecked(false);
                this.i.put(Long.valueOf(j2), Boolean.FALSE);
                this.j.get(i2).k = false;
            }
        }
    }

    public void setTitles(List<g> list) {
        com.bytedance.android.livesdk.feed.tab.c.a aVar;
        List<g> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f14526f, false, 9049, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f14526f, false, 9049, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.removeAllViews();
            if (!CollectionUtils.isEmpty(list)) {
                this.j = list2;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    g gVar = list2.get(i2);
                    if (i2 == 0 && this.f14527a) {
                        this.i.put(Long.valueOf(gVar.f14080b), Boolean.TRUE);
                        this.f14527a = false;
                    }
                    if (PatchProxy.isSupport(new Object[]{gVar, Integer.valueOf(i2)}, this, f14526f, false, 9050, new Class[]{g.class, Integer.TYPE}, com.bytedance.android.livesdk.feed.tab.c.a.class)) {
                        aVar = (com.bytedance.android.livesdk.feed.tab.c.a) PatchProxy.accessDispatch(new Object[]{gVar, Integer.valueOf(i2)}, this, f14526f, false, 9050, new Class[]{g.class, Integer.TYPE}, com.bytedance.android.livesdk.feed.tab.c.a.class);
                    } else {
                        aVar = new com.bytedance.android.livesdk.feed.tab.c.a(getContext());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        int[] leftAndRightPadding = getLeftAndRightPadding();
                        int itemGap = getItemGap();
                        if (i2 == 0) {
                            layoutParams.setMargins(leftAndRightPadding[0], 0, 0, 0);
                            if (Build.VERSION.SDK_INT >= 17) {
                                layoutParams.setMarginStart(leftAndRightPadding[0]);
                                layoutParams.setMarginEnd(0);
                            }
                        } else if (i2 == this.j.size() - 1) {
                            layoutParams.setMargins(itemGap, 0, leftAndRightPadding[1], 0);
                            if (Build.VERSION.SDK_INT >= 17) {
                                layoutParams.setMarginStart(itemGap);
                                layoutParams.setMarginEnd(leftAndRightPadding[1]);
                            }
                        } else {
                            layoutParams.setMargins(itemGap, 0, 0, 0);
                            if (Build.VERSION.SDK_INT >= 17) {
                                layoutParams.setMarginStart(itemGap);
                                layoutParams.setMarginEnd(0);
                            }
                        }
                        aVar.setLayoutParams(layoutParams);
                        aVar.setGravity(17);
                        if (Build.VERSION.SDK_INT >= 17) {
                            aVar.setTextAlignment(4);
                        }
                        aVar.setTextColor(getResources().getColorStateList(C0906R.color.afx));
                        aVar.setText(gVar.f14081c);
                        if (this.i.containsKey(Long.valueOf(gVar.f14080b))) {
                            aVar.setChecked(this.i.get(Long.valueOf(gVar.f14080b)).booleanValue());
                        }
                        if (PatchProxy.isSupport(new Object[]{1, Float.valueOf(16.0f)}, aVar, com.bytedance.android.livesdk.feed.tab.c.a.f14436a, false, 8948, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
                            Object[] objArr = {1, Float.valueOf(16.0f)};
                            Object[] objArr2 = objArr;
                            com.bytedance.android.livesdk.feed.tab.c.a aVar2 = aVar;
                            PatchProxy.accessDispatch(objArr2, aVar2, com.bytedance.android.livesdk.feed.tab.c.a.f14436a, false, 8948, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
                        } else {
                            aVar.f14437b.setTextSize(1, 16.0f);
                        }
                        aVar.setOnClickListener(new a(this, i2, gVar, aVar));
                    }
                    this.g.addView(aVar);
                }
            }
        }
    }

    public LiveTabIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public LiveTabIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    @RequiresApi(api = 21)
    public LiveTabIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a();
    }
}
