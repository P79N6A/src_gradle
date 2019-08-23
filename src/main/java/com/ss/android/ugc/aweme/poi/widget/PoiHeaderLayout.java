package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.ui.j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ.\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/widget/PoiHeaderLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPresenter", "Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiDetailHeaderInfoPresenter;", "bindData", "", "poiDetail", "Lcom/ss/android/ugc/aweme/poi/model/PoiDetail;", "initPresenter", "fragment", "Lcom/bytedance/ies/uikit/base/AbsFragment;", "collectInfoGetter", "Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiDetailHeaderInfoPresenter$ICollectionInfoGetter;", "collectPresenter", "Lcom/ss/android/ugc/aweme/poi/ui/PoiCollectPresenter;", "panelSizeListener", "Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiDetailHeaderInfoPresenter$OnPanelSizeChangedListener;", "invalidatePanelHeight", "poiMore", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiHeaderLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61041a;

    /* renamed from: b  reason: collision with root package name */
    public PoiDetailHeaderInfoPresenter f61042b;

    @JvmOverloads
    public PoiHeaderLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PoiHeaderLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(@Nullable PoiDetail poiDetail) {
        PoiDetail poiDetail2 = poiDetail;
        if (PatchProxy.isSupport(new Object[]{poiDetail2}, this, f61041a, false, 67055, new Class[]{PoiDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiDetail2}, this, f61041a, false, 67055, new Class[]{PoiDetail.class}, Void.TYPE);
            return;
        }
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = this.f61042b;
        if (poiDetailHeaderInfoPresenter != null) {
            poiDetailHeaderInfoPresenter.a(poiDetail2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PoiHeaderLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(C0906R.layout.yx, this);
    }

    public final void a(@Nullable AbsFragment absFragment, @Nullable PoiDetailHeaderInfoPresenter.a aVar, @Nullable j jVar, @Nullable PoiDetailHeaderInfoPresenter.b bVar) {
        if (PatchProxy.isSupport(new Object[]{absFragment, aVar, jVar, bVar}, this, f61041a, false, 67054, new Class[]{AbsFragment.class, PoiDetailHeaderInfoPresenter.a.class, j.class, PoiDetailHeaderInfoPresenter.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absFragment, aVar, jVar, bVar}, this, f61041a, false, 67054, new Class[]{AbsFragment.class, PoiDetailHeaderInfoPresenter.a.class, j.class, PoiDetailHeaderInfoPresenter.b.class}, Void.TYPE);
            return;
        }
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = new PoiDetailHeaderInfoPresenter(absFragment, aVar, this, jVar, bVar);
        this.f61042b = poiDetailHeaderInfoPresenter;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoiHeaderLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
