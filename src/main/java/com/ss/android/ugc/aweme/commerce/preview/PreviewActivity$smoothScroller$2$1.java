package com.ss.android.ugc.aweme.commerce.preview;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.preview.PreviewActivity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$smoothScroller$2$1", "Landroid/support/v7/widget/LinearSmoothScroller;", "calculateDtToFit", "", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewActivity$smoothScroller$2$1 extends LinearSmoothScroller {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37247a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PreviewActivity.bk f37248b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreviewActivity$smoothScroller$2$1(PreviewActivity.bk bkVar, Context context) {
        super(context);
        this.f37248b = bkVar;
    }

    public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        int intValue;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f37247a, false, 28746, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f37247a, false, 28746, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        PreviewActivity previewActivity = this.f37248b.this$0;
        if (PatchProxy.isSupport(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28560, new Class[0], Integer.TYPE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28560, new Class[0], Integer.TYPE)).intValue();
        } else {
            intValue = ((Number) previewActivity.i.getValue()).intValue();
        }
        return super.calculateDtToFit(i - intValue, i2, i3, i4, -1);
    }
}
