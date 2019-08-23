package com.ss.android.ugc.aweme.shortvideo.record;

import android.support.v7.widget.AppCompatTextView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.aj;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/record/MuseRecordBottomTabConfigure;", "Lcom/ss/android/ugc/aweme/shortvideo/record/BaseRecordBottomTabConfigure;", "tabHost", "Lcom/ss/android/ugc/aweme/story/widget/TabHost;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "(Lcom/ss/android/ugc/aweme/story/widget/TabHost;Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;)V", "initTab", "", "isLiveSupport", "", "isLiveBeforeMV", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k extends b {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f69117e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(@NotNull TabHost tabHost, @NotNull fh fhVar) {
        super(tabHost, fhVar);
        Intrinsics.checkParameterIsNotNull(tabHost, "tabHost");
        Intrinsics.checkParameterIsNotNull(fhVar, "shortVideoContext");
    }

    public final void a(boolean z, boolean z2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f69117e, false, 78386, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f69117e, false, 78386, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean d2 = aj.f65581d.d();
        boolean a2 = a();
        for (i ordinal : i.values()) {
            switch (l.f69118a[ordinal.ordinal()]) {
                case 1:
                    if (d2 && !a2) {
                        break;
                    } else {
                        AppCompatTextView b2 = b();
                        b2.setText(i.RECORD_COMBINE.getNameResId());
                        if (aj.f65581d.c()) {
                            LinearLayout linearLayout = this.f69091b;
                            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "tabContainer");
                            str = linearLayout.getContext().getString(i.RECORD_COMBINE.getTagResId());
                        } else {
                            LinearLayout linearLayout2 = this.f69091b;
                            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "tabContainer");
                            str = linearLayout2.getContext().getString(C0906R.string.bx7);
                        }
                        b2.setTag(str);
                        this.f69091b.addView(b2);
                        break;
                    }
                case 2:
                    if (d2 && !a2) {
                        AppCompatTextView b3 = b();
                        b3.setText(i.RECORD_COMBINE_60.getNameResId());
                        LinearLayout linearLayout3 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "tabContainer");
                        b3.setTag(linearLayout3.getContext().getString(i.RECORD_COMBINE_60.getTagResId()));
                        this.f69091b.addView(b3);
                        break;
                    }
                case 3:
                    if (d2 && !a2) {
                        AppCompatTextView b4 = b();
                        b4.setText(i.RECORD_COMBINE_15.getNameResId());
                        LinearLayout linearLayout4 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "tabContainer");
                        b4.setTag(linearLayout4.getContext().getString(i.RECORD_COMBINE_15.getTagResId()));
                        this.f69091b.addView(b4);
                        break;
                    }
                case 4:
                    if (b.a() && !a2) {
                        AppCompatTextView b5 = b();
                        b5.setText(i.RECORD_MODE_M.getNameResId());
                        LinearLayout linearLayout5 = this.f69091b;
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "tabContainer");
                        b5.setTag(linearLayout5.getContext().getString(i.RECORD_MODE_M.getTagResId()));
                        this.f69091b.addView(b5);
                        break;
                    }
                case 5:
                    if (!z) {
                        break;
                    } else {
                        a(z2);
                        break;
                    }
            }
        }
    }
}
