package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;

public class a extends w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70734a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f70735b;

    /* renamed from: c  reason: collision with root package name */
    private C0736a f70736c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$a  reason: collision with other inner class name */
    public interface C0736a {
        void a(boolean z);
    }

    public void setStateChangeCB(C0736a aVar) {
        this.f70736c = aVar;
    }

    public void setBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel) {
        if (PatchProxy.isSupport(new Object[]{businessGoodsPublishModel}, this, f70734a, false, 80128, new Class[]{BusinessGoodsPublishModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{businessGoodsPublishModel}, this, f70734a, false, 80128, new Class[]{BusinessGoodsPublishModel.class}, Void.TYPE);
        } else if (businessGoodsPublishModel != null) {
            setTextHighlight(true);
            if (!TextUtils.isEmpty(businessGoodsPublishModel.title)) {
                setTitle(businessGoodsPublishModel.title);
                this.f70735b = true;
            } else {
                setTitle((int) C0906R.string.akh);
                this.f70735b = false;
            }
            if (this.f70736c != null) {
                this.f70736c.a(!TextUtils.isEmpty(businessGoodsPublishModel.title));
            }
            setSubtitle((String) null);
        }
    }

    public a(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null);
        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), 2130838755);
        setTitle((int) C0906R.string.akh);
        setDrawableLeft(a2);
        setSubtitle((String) null);
    }
}
