package com.ss.android.ugc.aweme.shortvideo.record;

import android.support.v7.widget.AppCompatTextView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.shortvideo.aj;
import com.ss.android.ugc.aweme.shortvideo.bz;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/record/DTRecordBottomTabConfigure;", "Lcom/ss/android/ugc/aweme/shortvideo/record/BaseRecordBottomTabConfigure;", "tabHost", "Lcom/ss/android/ugc/aweme/story/widget/TabHost;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "(Lcom/ss/android/ugc/aweme/story/widget/TabHost;Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;)V", "initTab", "", "isLiveSupport", "", "isLiveBeforeMV", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends b {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f69100e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(@NotNull TabHost tabHost, @NotNull fh fhVar) {
        super(tabHost, fhVar);
        Intrinsics.checkParameterIsNotNull(tabHost, "tabHost");
        Intrinsics.checkParameterIsNotNull(fhVar, "shortVideoContext");
    }

    public final void a(boolean z, boolean z2) {
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f69100e, false, 78376, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f69100e, false, 78376, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean c2 = aj.f65581d.c();
        boolean d2 = aj.f65581d.d();
        boolean a2 = a();
        for (g ordinal : g.values()) {
            switch (f.f69101a[ordinal.ordinal()]) {
                case 1:
                    boolean z4 = z2;
                    if (PatchProxy.isSupport(new Object[0], this, b.f69090a, false, 78328, new Class[0], Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, b.f69090a, false, 78328, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z3 = PhotoModule.a(this.f69093d.r);
                    }
                    if (!z3) {
                        break;
                    } else {
                        AppCompatTextView b2 = b();
                        b2.setText(g.PHOTO_SHORT.getNameResId());
                        LinearLayout linearLayout = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "tabContainer");
                        b2.setTag(linearLayout.getContext().getString(g.PHOTO_SHORT.getTagResId()));
                        this.f69091b.addView(b2);
                        a.a(this.f69092c.getContext(), "show_take_photo_entrance", "shoot_page");
                        break;
                    }
                case 2:
                    boolean z5 = z2;
                    if (c2) {
                        break;
                    } else {
                        AppCompatTextView b3 = b();
                        b3.setText(g.RECORD_CLICK.getNameResId());
                        LinearLayout linearLayout2 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "tabContainer");
                        b3.setTag(linearLayout2.getContext().getString(g.RECORD_CLICK.getTagResId()));
                        this.f69091b.addView(b3);
                        break;
                    }
                case 3:
                    boolean z6 = z2;
                    if (c2) {
                        break;
                    } else {
                        AppCompatTextView b4 = b();
                        b4.setText(g.RECORD_NORMAL.getNameResId());
                        LinearLayout linearLayout3 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "tabContainer");
                        b4.setTag(linearLayout3.getContext().getString(g.RECORD_NORMAL.getTagResId()));
                        this.f69091b.addView(b4);
                        break;
                    }
                case 4:
                    boolean z7 = z2;
                    if (c2 && (!d2 || a2)) {
                        AppCompatTextView b5 = b();
                        b5.setText(g.RECORD_COMBINE.getNameResId());
                        LinearLayout linearLayout4 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "tabContainer");
                        b5.setTag(linearLayout4.getContext().getString(g.RECORD_COMBINE.getTagResId()));
                        this.f69091b.addView(b5);
                        break;
                    }
                case 5:
                    boolean z8 = z2;
                    if (d2 && !a2) {
                        AppCompatTextView b6 = b();
                        b6.setText(g.RECORD_COMBINE_60.getNameResId());
                        LinearLayout linearLayout5 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "tabContainer");
                        b6.setTag(linearLayout5.getContext().getString(g.RECORD_COMBINE_60.getTagResId()));
                        this.f69091b.addView(b6);
                        break;
                    }
                case 6:
                    boolean z9 = z2;
                    if (d2 && !a2) {
                        AppCompatTextView b7 = b();
                        b7.setText(g.RECORD_COMBINE_15.getNameResId());
                        LinearLayout linearLayout6 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "tabContainer");
                        b7.setTag(linearLayout6.getContext().getString(g.RECORD_COMBINE_15.getTagResId()));
                        this.f69091b.addView(b7);
                        break;
                    }
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    boolean z10 = z2;
                    if (b.a() && !a2) {
                        AppCompatTextView b8 = b();
                        b8.setText(g.RECORD_MODE_M.getNameResId());
                        LinearLayout linearLayout7 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "tabContainer");
                        b8.setTag(linearLayout7.getContext().getString(g.RECORD_MODE_M.getTagResId()));
                        this.f69091b.addView(b8);
                        break;
                    }
                case 8:
                    boolean z11 = z2;
                    if (new bz(this.f69092c.getContext()).a() && Intrinsics.areEqual((Object) "direct_shoot", (Object) this.f69093d.r)) {
                        AppCompatTextView b9 = b();
                        b9.setText(g.RECORD_HUAWEI_SLOW.getNameResId());
                        LinearLayout linearLayout8 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout8, "tabContainer");
                        b9.setTag(linearLayout8.getContext().getString(g.RECORD_HUAWEI_SLOW.getTagResId()));
                        this.f69091b.addView(b9);
                        break;
                    }
                case 9:
                    if (!z) {
                        boolean z12 = z2;
                        break;
                    } else {
                        a(z2);
                        break;
                    }
            }
        }
    }
}
