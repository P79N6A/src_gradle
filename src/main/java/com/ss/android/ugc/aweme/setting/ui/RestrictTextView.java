package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.d.d;
import com.ss.android.ugc.aweme.setting.d.g;
import com.ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.ss.android.ugc.aweme.setting.model.RestrictInfoModel;

public class RestrictTextView extends DmtTextView implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64188a;

    /* renamed from: b  reason: collision with root package name */
    private g f64189b;

    /* renamed from: c  reason: collision with root package name */
    private String f64190c;

    public RestrictTextView(Context context) {
        this(context, null);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f64188a, false, 72594, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f64188a, false, 72594, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f64190c = str;
        this.f64189b.a(str);
    }

    public final void a(RestrictInfo restrictInfo) {
        if (PatchProxy.isSupport(new Object[]{restrictInfo}, this, f64188a, false, 72595, new Class[]{RestrictInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{restrictInfo}, this, f64188a, false, 72595, new Class[]{RestrictInfo.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(restrictInfo.awemeId, this.f64190c)) {
            setVisibility(0);
            setText(String.format("Review time:%s \nReview AllFriends:%s ", new Object[]{restrictInfo.reviewTime, restrictInfo.reviewResult}));
        }
    }

    public RestrictTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public RestrictTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f64188a, false, 72593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64188a, false, 72593, new Class[0], Void.TYPE);
            return;
        }
        this.f64189b = new g(new RestrictInfoModel(), this);
    }
}
