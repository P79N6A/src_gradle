package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;

public class RelationLabelTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76391a;

    /* renamed from: b  reason: collision with root package name */
    private RelationDynamicLabel f76392b;

    public RelationLabelTextView(Context context) {
        super(context);
    }

    public final void a(RelationDynamicLabel relationDynamicLabel) {
        if (PatchProxy.isSupport(new Object[]{relationDynamicLabel}, this, f76391a, false, 89600, new Class[]{RelationDynamicLabel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{relationDynamicLabel}, this, f76391a, false, 89600, new Class[]{RelationDynamicLabel.class}, Void.TYPE);
            return;
        }
        this.f76392b = relationDynamicLabel;
        if (this.f76392b == null || TextUtils.isEmpty(this.f76392b.getLabelInfo())) {
            setVisibility(8);
            return;
        }
        setText(this.f76392b.getLabelInfo());
        setVisibility(0);
    }

    public RelationLabelTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RelationLabelTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
