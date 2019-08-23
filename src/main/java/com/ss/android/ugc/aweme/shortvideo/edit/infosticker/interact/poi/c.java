package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.PoiStickerHollowTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;

public class c extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67287a;

    /* renamed from: b  reason: collision with root package name */
    PoiStickerHollowTextView f67288b;

    /* renamed from: c  reason: collision with root package name */
    int f67289c;

    /* renamed from: d  reason: collision with root package name */
    float f67290d;

    /* renamed from: e  reason: collision with root package name */
    int f67291e;
    private int y;

    public c(Context context) {
        this(context, null);
    }

    public void setPoiContentTxt(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f67287a, false, 76998, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f67287a, false, 76998, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f67288b.setText(str);
        if (PatchProxy.isSupport(new Object[0], this, f67287a, false, 76999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67287a, false, 76999, new Class[0], Void.TYPE);
        } else {
            this.f67288b.setTextSize(this.f67290d);
            ViewGroup.LayoutParams layoutParams = this.f67288b.getLayoutParams();
            layoutParams.width = -2;
            this.f67288b.setLayoutParams(layoutParams);
        }
        setVisibility(4);
        this.f67288b.post(new d(this));
    }

    private c(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f67290d = 28.0f;
        this.g = context;
        this.y = (int) UIUtils.dip2Px(context, 32.0f);
        this.f67289c = UIUtils.getScreenWidth(context) - this.y;
        this.f67291e = this.f67289c;
        this.f67290d = UIUtils.dip2Px(context, 28.0f);
        if (PatchProxy.isSupport(new Object[0], this, f67287a, false, 76996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67287a, false, 76996, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(this.g).inflate(C0906R.layout.a8u, this);
        this.l = (StickerHelpBoxView) findViewById(C0906R.id.cvj);
        this.m = findViewById(C0906R.id.z1);
        this.f67288b = (PoiStickerHollowTextView) findViewById(C0906R.id.zd);
        this.f67288b.setMaxWidth(this.f67291e);
        setVisibility(8);
    }
}
