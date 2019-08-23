package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.u.aa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PoiActsFlipperView extends ViewFlipper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61015a;

    /* renamed from: b  reason: collision with root package name */
    public List<PoiClassRankBannerStruct> f61016b;

    /* renamed from: c  reason: collision with root package name */
    private int f61017c;

    /* renamed from: d  reason: collision with root package name */
    private int f61018d;

    /* renamed from: e  reason: collision with root package name */
    private c f61019e;

    /* renamed from: f  reason: collision with root package name */
    private a f61020f;

    public interface a {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61015a, false, 67006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61015a, false, 67006, new Class[0], Void.TYPE);
            return;
        }
        if (isFlipping()) {
            stopFlipping();
        }
    }

    public int getCurrentPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f61015a, false, 67008, new Class[0], Integer.TYPE)) {
            return getDisplayedChild();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61015a, false, 67008, new Class[0], Integer.TYPE)).intValue();
    }

    public PoiClassRankBannerStruct getCurrentItem() {
        if (PatchProxy.isSupport(new Object[0], this, f61015a, false, 67007, new Class[0], PoiClassRankBannerStruct.class)) {
            return (PoiClassRankBannerStruct) PatchProxy.accessDispatch(new Object[0], this, f61015a, false, 67007, new Class[0], PoiClassRankBannerStruct.class);
        }
        int displayedChild = getDisplayedChild();
        if (displayedChild < 0 || displayedChild >= this.f61016b.size()) {
            return null;
        }
        return this.f61016b.get(displayedChild);
    }

    public void setOnItemChangeListener(a aVar) {
        this.f61020f = aVar;
    }

    public PoiActsFlipperView(Context context) {
        this(context, null);
    }

    @NonNull
    private TextView a(PoiClassRankBannerStruct poiClassRankBannerStruct) {
        if (PatchProxy.isSupport(new Object[]{poiClassRankBannerStruct}, this, f61015a, false, 67011, new Class[]{PoiClassRankBannerStruct.class}, TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[]{poiClassRankBannerStruct}, this, f61015a, false, 67011, new Class[]{PoiClassRankBannerStruct.class}, TextView.class);
        }
        TextView textView = new TextView(getContext());
        textView.setSingleLine();
        textView.setText(poiClassRankBannerStruct.getDescription());
        textView.setTextSize(1, (float) this.f61017c);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(this.f61018d);
        textView.setGravity(8388627);
        return textView;
    }

    public void setDisplayedChild(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61015a, false, 67012, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61015a, false, 67012, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int displayedChild = getDisplayedChild();
        super.setDisplayedChild(i);
        int displayedChild2 = getDisplayedChild();
        if (displayedChild != displayedChild2) {
            if (PatchProxy.isSupport(new Object[0], this, f61015a, false, 67013, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61015a, false, 67013, new Class[0], Void.TYPE);
            } else if (this.f61020f != null) {
                getCurrentItem();
                getDisplayedChild();
            }
            int size = displayedChild2 % this.f61016b.size();
            a(this.f61016b.get(size), size);
        }
    }

    public PoiActsFlipperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f61015a, false, 67004, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f61015a, false, 67004, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HotSearchWordsFlipperView);
        this.f61017c = obtainStyledAttributes.getInt(2, 15);
        this.f61018d = obtainStyledAttributes.getColor(1, getResources().getColor(C0906R.color.a6n));
        this.f61016b = new ArrayList();
        setFlipInterval(5000);
        setInAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.ca));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.cb));
        obtainStyledAttributes.recycle();
    }

    private void a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        if (PatchProxy.isSupport(new Object[]{poiClassRankBannerStruct, Integer.valueOf(i)}, this, f61015a, false, 67010, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassRankBannerStruct, Integer.valueOf(i)}, this, f61015a, false, 67010, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        h.a(this.f61019e, "banner_show", d.a().a("enter_from", "poi_page").a("previous_page", this.f61019e.getPreviousPage()).a("banner_id", poiClassRankBannerStruct.getBid()).a("client_order", i).a("city_info", aa.a()).a("from_poi_id", this.f61019e.getPoiId()));
    }

    public final void a(List<PoiClassRankBannerStruct> list, c cVar) {
        if (PatchProxy.isSupport(new Object[]{list, cVar}, this, f61015a, false, 67009, new Class[]{List.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, cVar}, this, f61015a, false, 67009, new Class[]{List.class, c.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            this.f61019e = cVar;
            if (isFlipping()) {
                stopFlipping();
            }
            this.f61016b.clear();
            this.f61016b.addAll(list);
            Collections.shuffle(this.f61016b);
            removeAllViews();
            for (int i = 0; i < this.f61016b.size(); i++) {
                PoiClassRankBannerStruct poiClassRankBannerStruct = this.f61016b.get(i);
                addView(a(poiClassRankBannerStruct), new FrameLayout.LayoutParams(-1, -1));
                if (i == 0) {
                    a(poiClassRankBannerStruct, 0);
                }
            }
            if (this.f61016b.size() >= 2) {
                startFlipping();
            }
        }
    }
}
