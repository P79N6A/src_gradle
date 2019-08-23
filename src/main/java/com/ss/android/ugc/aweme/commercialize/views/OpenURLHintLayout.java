package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128TX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/OpenURLHintLayout;", "Lcom/ss/android/ugc/aweme/commercialize/views/HeaderFrameLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "aweme", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "canScaleContent", "", "getCanScaleContent", "()Z", "canScroll", "getCanScroll", "openUrlValid", "getOpenUrlTitle", "", "ad", "Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "onClick", "", "v", "Landroid/view/View;", "reset", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OpenURLHintLayout extends HeaderFrameLayout implements View.OnClickListener {
    public static ChangeQuickRedirect g;
    private Aweme h;
    private boolean i;

    public final boolean getCanScaleContent() {
        return true;
    }

    public final boolean getCanScroll() {
        return this.i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenURLHintLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setHeaderId(C0906R.id.ck);
    }

    public final void a(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, g, false, 32908, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, g, false, 32908, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        setScrollOffset(0);
        setAweme(aweme);
        if (this.i) {
            g.N(getContext(), aweme);
            if (PatchProxy.isSupport(new Object[0], this, HeaderFrameLayout.f39922a, false, 32888, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, HeaderFrameLayout.f39922a, false, 32888, new Class[0], Void.TYPE);
                return;
            }
            View header = getHeader();
            if (header != null) {
                postDelayed(new HeaderFrameLayout.b(this, header, this), 500);
            }
        }
    }

    public final void onClick(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, g, false, 32909, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, g, false, 32909, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        int id = view.getId();
        if (id == C0906R.id.cj) {
            com.ss.android.ugc.aweme.commercialize.utils.g.b(getContext(), this.h);
            g.P(getContext(), this.h);
            return;
        }
        if (id == C0906R.id.ch) {
            if (PatchProxy.isSupport(new Object[0], this, HeaderFrameLayout.f39922a, false, 32889, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, HeaderFrameLayout.f39922a, false, 32889, new Class[0], Void.TYPE);
            } else {
                View header = getHeader();
                if (header != null) {
                    postDelayed(new HeaderFrameLayout.c(this, header, this), 0);
                }
            }
            g.O(getContext(), this.h);
            setAweme(null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setAweme(com.ss.android.ugc.aweme.feed.model.Aweme r13) {
        /*
            r12 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = g
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 32907(0x808b, float:4.6113E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 32907(0x808b, float:4.6113E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            if (r13 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r13.getAwemeRawAd()
            if (r0 == 0) goto L_0x003f
            int r0 = r0.getTipsType()
            goto L_0x0040
        L_0x003f:
            r0 = -1
        L_0x0040:
            r1 = 0
            if (r0 != r7) goto L_0x011b
            if (r13 != 0) goto L_0x0048
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0048:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r13.getAwemeRawAd()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.getOpenUrl()
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.g.b(r0)
            if (r0 == 0) goto L_0x011b
            android.view.View r0 = r12.getHeader()
            if (r0 != 0) goto L_0x0072
            android.content.Context r0 = r12.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2131690728(0x7f0f04e8, float:1.9010508E38)
            r3 = r12
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r0 = r0.inflate(r2, r3)
        L_0x0072:
            r9 = r0
            r0 = 2131165305(0x7f070079, float:1.7944823E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r2 = "header.findViewById<Text…>(R.id.ad_open_url_title)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r13.getAwemeRawAd()
            if (r11 == 0) goto L_0x00fa
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 32910(0x808e, float:4.6117E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r5[r8] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 32910(0x808e, float:4.6117E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r5[r8] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00bf:
            r1 = r0
            goto L_0x00fa
        L_0x00c1:
            java.lang.String r0 = r11.getSchemaName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r0 = 0
            goto L_0x00d3
        L_0x00d2:
            r0 = 1
        L_0x00d3:
            if (r0 == 0) goto L_0x00e1
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131558511(0x7f0d006f, float:1.874234E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x00e5
        L_0x00e1:
            java.lang.String r0 = r11.getSchemaName()
        L_0x00e5:
            android.content.res.Resources r1 = r12.getResources()
            r2 = 2131558516(0x7f0d0074, float:1.874235E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r8] = r0
            java.lang.String r0 = r1.getString(r2, r3)
            java.lang.String r1 = "resources.getString(R.st…en_url_title, schemaName)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            goto L_0x00bf
        L_0x00fa:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r10.setText(r1)
            r0 = 2131165303(0x7f070077, float:1.794482E38)
            android.view.View r0 = r9.findViewById(r0)
            r1 = r12
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            r0 = 2131165301(0x7f070075, float:1.7944815E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setOnClickListener(r1)
            r12.i = r7
            r12.h = r13
            return
        L_0x011b:
            r12.i = r8
            r12.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout.setAweme(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenURLHintLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        setHeaderId(C0906R.id.ck);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenURLHintLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        setHeaderId(C0906R.id.ck);
    }
}
