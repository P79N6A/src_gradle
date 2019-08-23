package com.ss.android.ugc.aweme.poi.ui.publish;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SpeedRecommendPoiItemView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60842a;
    @BindView(2131496646)
    TextView mTvPoiName;

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f60842a, false, 66694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60842a, false, 66694, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        ButterKnife.bind((View) this);
    }

    public SpeedRecommendPoiItemView(Context context) {
        super(context);
    }

    public SpeedRecommendPoiItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpeedRecommendPoiItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
