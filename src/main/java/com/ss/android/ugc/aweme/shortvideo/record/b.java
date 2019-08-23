package com.ss.android.ugc.aweme.shortvideo.record;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/record/BaseRecordBottomTabConfigure;", "Lcom/ss/android/ugc/aweme/shortvideo/record/RecordBottomTabConfigure;", "tabHost", "Lcom/ss/android/ugc/aweme/story/widget/TabHost;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "(Lcom/ss/android/ugc/aweme/story/widget/TabHost;Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;)V", "getShortVideoContext", "()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "tabContainer", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "getTabContainer$tools_dmt_av_impl_douyinCnRelease", "()Landroid/widget/LinearLayout;", "getTabHost", "()Lcom/ss/android/ugc/aweme/story/widget/TabHost;", "addLiveTab", "", "isLiveBeforeMV", "", "getIndexForTag", "tag", "", "getTabItem", "Landroid/support/v7/widget/AppCompatTextView;", "getTabItem$tools_dmt_av_impl_douyinCnRelease", "isDuetOrReactMode", "isDuetOrReactMode$tools_dmt_av_impl_douyinCnRelease", "isPhotoEnable", "isPhotoEnable$tools_dmt_av_impl_douyinCnRelease", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69090a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f69091b = ((LinearLayout) this.f69092c.findViewById(C0906R.id.y9));
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final TabHost f69092c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final fh f69093d;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f69090a, false, 78327, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69090a, false, 78327, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f69093d.b() || this.f69093d.c()) {
            return true;
        } else {
            return false;
        }
    }

    @NotNull
    public final AppCompatTextView b() {
        if (PatchProxy.isSupport(new Object[0], this, f69090a, false, 78329, new Class[0], AppCompatTextView.class)) {
            return (AppCompatTextView) PatchProxy.accessDispatch(new Object[0], this, f69090a, false, 78329, new Class[0], AppCompatTextView.class);
        }
        LinearLayout linearLayout = this.f69091b;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "tabContainer");
        View inflate = View.inflate(linearLayout.getContext(), C0906R.layout.a9h, null);
        if (inflate != null) {
            return (AppCompatTextView) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.AppCompatTextView");
    }

    public final int a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69090a, false, 78325, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f69090a, false, 78325, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str, "tag");
        LinearLayout linearLayout = this.f69091b;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "tabContainer");
        if (linearLayout.getChildCount() <= 0) {
            return -1;
        }
        LinearLayout linearLayout2 = this.f69091b;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "tabContainer");
        int childCount = linearLayout2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f69091b.getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "tabContainer.getChildAt(i)");
            if (Intrinsics.areEqual((Object) str, childAt.getTag())) {
                return i;
            }
        }
        return 0;
    }

    public final int a(boolean z) {
        int i;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69090a, false, 78326, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69090a, false, 78326, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        AppCompatTextView b2 = b();
        boolean b3 = a.b();
        if (b3) {
            i = i.RECORD_LIVE.getNameResId();
        } else {
            i = g.RECORD_LIVE.getNameResId();
        }
        b2.setText(i);
        LinearLayout linearLayout = this.f69091b;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "tabContainer");
        Context context = linearLayout.getContext();
        if (b3) {
            i2 = i.RECORD_LIVE.getTagResId();
        } else {
            i2 = g.RECORD_LIVE.getTagResId();
        }
        b2.setTag(context.getString(i2));
        LinearLayout linearLayout2 = this.f69091b;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "tabContainer");
        int childCount = linearLayout2.getChildCount();
        int a2 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.a(this.f69092c);
        if (b3) {
            i3 = -1;
        } else {
            LinearLayout linearLayout3 = this.f69091b;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "tabContainer");
            String string = linearLayout3.getContext().getString(g.RECORD_HUAWEI_SLOW.getTagResId());
            Intrinsics.checkExpressionValueIsNotNull(string, "tabContainer.context.get…ORD_HUAWEI_SLOW.tagResId)");
            i3 = a(string);
        }
        if (z && a2 >= 0) {
            childCount = a2;
        } else if (i3 > 0) {
            childCount = i3;
        }
        this.f69091b.addView(b2, childCount);
        return childCount;
    }

    public b(@NotNull TabHost tabHost, @NotNull fh fhVar) {
        Intrinsics.checkParameterIsNotNull(tabHost, "tabHost");
        Intrinsics.checkParameterIsNotNull(fhVar, "shortVideoContext");
        this.f69092c = tabHost;
        this.f69093d = fhVar;
    }
}
