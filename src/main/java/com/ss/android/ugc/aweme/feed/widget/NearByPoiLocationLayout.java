package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;

public class NearByPoiLocationLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47012a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f47013b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f47014c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f47015d;

    /* renamed from: e  reason: collision with root package name */
    protected int f47016e;

    /* renamed from: f  reason: collision with root package name */
    private RemoteImageView f47017f;
    private View g;

    public NearByPoiLocationLayout(Context context) {
        this(context, null);
    }

    public void setData(PoiStruct poiStruct) {
        if (PatchProxy.isSupport(new Object[]{poiStruct}, this, f47012a, false, 43723, new Class[]{PoiStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct}, this, f47012a, false, 43723, new Class[]{PoiStruct.class}, Void.TYPE);
        } else if (poiStruct == null || StringUtils.isEmpty(poiStruct.poiId)) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.f47014c.setVisibility(8);
            this.g.setVisibility(0);
            this.f47013b.setText(poiStruct.poiName);
            p.a(this.f47017f, poiStruct);
            setContentDescription(poiStruct.poiName);
        }
    }

    public NearByPoiLocationLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearByPoiLocationLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47015d = context;
        if (PatchProxy.isSupport(new Object[0], this, f47012a, false, 43722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47012a, false, 43722, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(this.f47015d).inflate(C0906R.layout.a44, this);
        setOrientation(0);
        setPadding(0, 0, (int) UIUtils.dip2Px(this.f47015d, 2.0f), 0);
        if (Build.VERSION.SDK_INT >= 17) {
            setPaddingRelative(0, 0, (int) UIUtils.dip2Px(this.f47015d, 2.0f), 0);
        }
        this.f47016e = (int) UIUtils.dip2Px(getContext(), 5.0f);
        this.f47013b = (TextView) findViewById(C0906R.id.bjr);
        this.f47014c = (TextView) findViewById(C0906R.id.rg);
        this.f47017f = (RemoteImageView) findViewById(C0906R.id.bjt);
        this.g = findViewById(C0906R.id.bjs);
        setVisibility(8);
    }
}
