package com.ss.android.ugc.aweme.feed.ui;

import android.arch.lifecycle.Observer;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/VideoPlayCountView;", "Lcom/ss/android/ugc/aweme/feed/ui/BaseVideoItemView;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mPlayCountView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "videoItemParams", "Lcom/ss/android/ugc/aweme/feed/model/VideoItemParams;", "initView", "observe", "dataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "onChanged", "t", "onDestroyView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class bv extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    private DmtTextView m;

    public final void a(@Nullable DataCenter dataCenter) {
    }

    public final void b() {
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    public bv(@Nullable View view) {
        super(view);
    }

    public final void a(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43299, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43299, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_post_time);
        if (view instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = u.a(4.0d);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(u.a(4.0d));
            }
            ((FrameLayout) view).addView(a2, layoutParams);
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "contentView");
        DmtTextView dmtTextView = (DmtTextView) a2.findViewById(C0906R.id.dgg);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "contentView.tv_post_time");
        this.m = dmtTextView;
        if (Build.VERSION.SDK_INT >= 17) {
            DmtTextView dmtTextView2 = this.m;
            if (dmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayCountView");
            }
            dmtTextView2.setTextDirection(2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.VideoItemParams r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43300(0xa924, float:6.0676E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43300(0xa924, float:6.0676E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.a((com.ss.android.ugc.aweme.feed.model.VideoItemParams) r10)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f3210b
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r0.getStatistics()
            if (r0 == 0) goto L_0x0049
            int r0 = r0.getPlayCount()
            long r0 = (long) r0
            java.lang.String r0 = com.ss.android.ugc.aweme.i18n.b.a(r0)
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f3210b
            if (r1 == 0) goto L_0x0053
            boolean r1 = r1.isAd()
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f3210b
            if (r2 == 0) goto L_0x005d
            boolean r2 = r2.isDelete()
            goto L_0x005e
        L_0x005d:
            r2 = 1
        L_0x005e:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x006c
            int r3 = r3.length()
            if (r3 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r3 = 0
            goto L_0x006d
        L_0x006c:
            r3 = 1
        L_0x006d:
            if (r3 != 0) goto L_0x00bb
            if (r1 != 0) goto L_0x00bb
            if (r2 != 0) goto L_0x00bb
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.m
            if (r1 != 0) goto L_0x007c
            java.lang.String r2 = "mPlayCountView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x007c:
            r1.setVisibility(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.m
            if (r1 != 0) goto L_0x0088
            java.lang.String r2 = "mPlayCountView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0088:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "· "
            r2.<init>(r3)
            android.content.Context r3 = r9.h
            r4 = 2131559112(0x7f0d02c8, float:1.8743559E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "mContext.getString(R.string.challenge_view_count)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r8] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r7)
            java.lang.String r0 = java.lang.String.format(r3, r0)
            java.lang.String r3 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            return
        L_0x00bb:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.m
            if (r0 != 0) goto L_0x00c4
            java.lang.String r1 = "mPlayCountView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00c4:
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bv.a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }
}
