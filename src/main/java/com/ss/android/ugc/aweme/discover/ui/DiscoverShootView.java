package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/DiscoverShootView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIvwShoot", "Landroid/widget/ImageView;", "mTvwShoot", "Landroid/widget/TextView;", "init", "", "setType", "type", "content", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "updateFollowStatus", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "followed", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverShootView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42888a;

    /* renamed from: b  reason: collision with root package name */
    TextView f42889b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f42890c;

    @JvmOverloads
    public DiscoverShootView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public DiscoverShootView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r4 == null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.profile.model.User r11, boolean r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f42888a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 37571(0x92c3, float:5.2648E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f42888a
            r3 = 0
            r4 = 37571(0x92c3, float:5.2648E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            android.widget.TextView r0 = r10.f42889b
            if (r0 == 0) goto L_0x0077
            android.widget.TextView r1 = r10.f42889b
            if (r1 == 0) goto L_0x0071
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x0071
            if (r12 == 0) goto L_0x005b
            r2 = 2131560077(0x7f0d068d, float:1.8745516E38)
            goto L_0x005e
        L_0x005b:
            r2 = 2131560074(0x7f0d068a, float:1.874551E38)
        L_0x005e:
            java.lang.Object[] r3 = new java.lang.Object[r9]
            if (r11 == 0) goto L_0x0068
            java.lang.String r4 = r11.getNickname()
            if (r4 != 0) goto L_0x006a
        L_0x0068:
            java.lang.String r4 = ""
        L_0x006a:
            r3[r8] = r4
            java.lang.String r1 = r1.getString(r2, r3)
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0077:
            android.widget.ImageView r0 = r10.f42890c
            if (r0 == 0) goto L_0x0088
            if (r12 == 0) goto L_0x0081
            r1 = 2130838878(0x7f02055e, float:1.728275E38)
            goto L_0x0084
        L_0x0081:
            r1 = 2130838877(0x7f02055d, float:1.7282749E38)
        L_0x0084:
            r0.setImageResource(r1)
            return
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.DiscoverShootView.a(com.ss.android.ugc.aweme.profile.model.User, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DiscoverShootView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f42888a, false, 37569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42888a, false, 37569, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a38, this, true);
        this.f42889b = (TextView) findViewById(C0906R.id.dm1);
        this.f42890c = (ImageView) findViewById(C0906R.id.b6p);
        setOrientation(0);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 33.0f);
        setPadding(dip2Px, 0, dip2Px, 0);
        setBackgroundResource(2130837926);
        setGravity(17);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscoverShootView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
