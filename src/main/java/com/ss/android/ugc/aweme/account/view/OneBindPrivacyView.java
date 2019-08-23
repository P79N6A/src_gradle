package com.ss.android.ugc.aweme.account.view;

import android.app.Application;
import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/account/view/OneBindPrivacyView;", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setCarrier", "", "carrier", "", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class OneBindPrivacyView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33138a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/view/OneBindPrivacyView$setCarrier$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneBindPrivacyView f33140b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33141c;

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f33139a, false, 21477, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f33139a, false, 21477, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint2, "ds");
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f33140b.getResources().getColor(C0906R.color.zn));
            textPaint2.setUnderlineText(false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(@org.jetbrains.annotations.NotNull android.view.View r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f33139a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 21476(0x53e4, float:3.0094E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0030
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f33139a
                r3 = 0
                r4 = 21476(0x53e4, float:3.0094E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0030:
                java.lang.String r0 = "widget"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r10.setTag(r0)
                java.lang.String r0 = r9.f33141c
                int r1 = r0.hashCode()
                r2 = -1429363305(0xffffffffaacda597, float:-3.6530216E-13)
                if (r1 == r2) goto L_0x0066
                r2 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
                if (r1 == r2) goto L_0x005b
                r2 = -840542575(0xffffffffcde65691, float:-4.83054112E8)
                if (r1 == r2) goto L_0x0050
                goto L_0x0071
            L_0x0050:
                java.lang.String r1 = "unicom"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0071
                java.lang.String r0 = "https://opencloud.wostore.cn/authz/resource/html/disclaimer.html?fromsdk=true"
                goto L_0x007e
            L_0x005b:
                java.lang.String r1 = "mobile"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0071
                java.lang.String r0 = "https://wap.cmpassport.com/resources/html/contract.html"
                goto L_0x007e
            L_0x0066:
                java.lang.String r1 = "telecom"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0071
                java.lang.String r0 = "https://e.189.cn/sdk/agreement/detail.do?hidetop=true"
                goto L_0x007e
            L_0x0071:
                com.ss.android.ugc.aweme.account.view.OneBindPrivacyView r0 = r9.f33140b
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131561545(0x7f0d0c49, float:1.8748494E38)
                java.lang.String r0 = r0.getString(r1)
            L_0x007e:
                java.lang.String r1 = r9.f33141c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r2 = "unicom"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 != 0) goto L_0x00a8
                java.lang.Class<com.ss.android.ugc.aweme.main.h.v> r1 = com.ss.android.ugc.aweme.main.h.v.class
                java.lang.Object r1 = com.ss.android.ugc.aweme.w.a((java.lang.Class<T>) r1)
                com.ss.android.ugc.aweme.main.h.v r1 = (com.ss.android.ugc.aweme.main.h.v) r1
                android.app.Application r2 = com.ss.android.ugc.aweme.w.b()
                java.lang.String r3 = "ModuleStore.getApplication()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                android.content.Context r2 = (android.content.Context) r2
                java.lang.String r3 = "protocolUrl"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                r1.a((android.content.Context) r2, (java.lang.String) r0, (boolean) r7)
                return
            L_0x00a8:
                java.lang.Class<com.ss.android.ugc.aweme.main.h.v> r1 = com.ss.android.ugc.aweme.main.h.v.class
                java.lang.Object r1 = com.ss.android.ugc.aweme.w.a((java.lang.Class<T>) r1)
                com.ss.android.ugc.aweme.main.h.v r1 = (com.ss.android.ugc.aweme.main.h.v) r1
                android.app.Application r2 = com.ss.android.ugc.aweme.w.b()
                java.lang.String r3 = "ModuleStore.getApplication()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                android.content.Context r2 = (android.content.Context) r2
                java.lang.String r3 = "protocolUrl"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                r3 = -1
                r1.a(r2, r0, r7, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.view.OneBindPrivacyView.a.onClick(android.view.View):void");
        }

        a(OneBindPrivacyView oneBindPrivacyView, String str) {
            this.f33140b = oneBindPrivacyView;
            this.f33141c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/view/OneBindPrivacyView$setCarrier$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33142a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneBindPrivacyView f33143b;

        b(OneBindPrivacyView oneBindPrivacyView) {
            this.f33143b = oneBindPrivacyView;
        }

        public final void onClick(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f33142a, false, 21478, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f33142a, false, 21478, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "widget");
            view2.setTag(Boolean.TRUE);
            Application b2 = w.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ModuleStore.getApplication()");
            ((v) w.a(v.class)).a((Context) b2, "https://www.douyin.com/falcon/douyin_falcon/user_agreement/", true);
        }

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f33142a, false, 21479, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f33142a, false, 21479, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint2, "ds");
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f33143b.getResources().getColor(C0906R.color.zn));
            textPaint2.setUnderlineText(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/view/OneBindPrivacyView$setCarrier$3", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneBindPrivacyView f33145b;

        c(OneBindPrivacyView oneBindPrivacyView) {
            this.f33145b = oneBindPrivacyView;
        }

        public final void onClick(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f33144a, false, 21480, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f33144a, false, 21480, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "widget");
            view2.setTag(Boolean.TRUE);
            Application b2 = w.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ModuleStore.getApplication()");
            ((v) w.a(v.class)).a((Context) b2, "https://www.douyin.com/falcon/douyin_falcon/privacy_agreement/", true);
        }

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f33144a, false, 21481, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f33144a, false, 21481, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint2, "ds");
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f33145b.getResources().getColor(C0906R.color.zn));
            textPaint2.setUnderlineText(false);
        }
    }

    @JvmOverloads
    public OneBindPrivacyView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public OneBindPrivacyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setCarrier(@NotNull String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f33138a, false, 21473, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f33138a, false, 21473, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "carrier");
        int hashCode = str.hashCode();
        if (hashCode != -1429363305) {
            if (hashCode != -1068855134) {
                if (hashCode == -840542575 && str3.equals("unicom")) {
                    str2 = getResources().getString(C0906R.string.bjn);
                    String string = getResources().getString(C0906R.string.bjl, new Object[]{str2});
                    CharSequence charSequence = string;
                    Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
                    a aVar = new a(this, str3);
                    Intrinsics.checkExpressionValueIsNotNull(string, "totalStr");
                    Intrinsics.checkExpressionValueIsNotNull(str2, "carrierStr");
                    CharSequence charSequence2 = charSequence;
                    String str4 = str2;
                    newSpannable.setSpan(aVar, StringsKt.indexOf$default(charSequence2, str4, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence2, str4, 0, false, 6, (Object) null) + str2.length(), 33);
                    String string2 = getResources().getString(C0906R.string.b91);
                    String string3 = getResources().getString(C0906R.string.b90);
                    b bVar = new b(this);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "termStr");
                    CharSequence charSequence3 = charSequence;
                    String str5 = string2;
                    newSpannable.setSpan(bVar, StringsKt.indexOf$default(charSequence3, str5, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence3, str5, 0, false, 6, (Object) null) + string2.length(), 33);
                    c cVar = new c(this);
                    Intrinsics.checkExpressionValueIsNotNull(string3, "privacyStr");
                    String str6 = string3;
                    newSpannable.setSpan(cVar, StringsKt.indexOf$default(charSequence3, str6, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence3, str6, 0, false, 6, (Object) null) + string3.length(), 33);
                    setText(newSpannable);
                    setMovementMethod(LinkMovementMethod.getInstance());
                }
            } else if (str3.equals("mobile")) {
                str2 = getResources().getString(C0906R.string.bjj);
                String string4 = getResources().getString(C0906R.string.bjl, new Object[]{str2});
                CharSequence charSequence4 = string4;
                Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(charSequence4);
                a aVar2 = new a(this, str3);
                Intrinsics.checkExpressionValueIsNotNull(string4, "totalStr");
                Intrinsics.checkExpressionValueIsNotNull(str2, "carrierStr");
                CharSequence charSequence22 = charSequence4;
                String str42 = str2;
                newSpannable2.setSpan(aVar2, StringsKt.indexOf$default(charSequence22, str42, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence22, str42, 0, false, 6, (Object) null) + str2.length(), 33);
                String string22 = getResources().getString(C0906R.string.b91);
                String string32 = getResources().getString(C0906R.string.b90);
                b bVar2 = new b(this);
                Intrinsics.checkExpressionValueIsNotNull(string22, "termStr");
                CharSequence charSequence32 = charSequence4;
                String str52 = string22;
                newSpannable2.setSpan(bVar2, StringsKt.indexOf$default(charSequence32, str52, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence32, str52, 0, false, 6, (Object) null) + string22.length(), 33);
                c cVar2 = new c(this);
                Intrinsics.checkExpressionValueIsNotNull(string32, "privacyStr");
                String str62 = string32;
                newSpannable2.setSpan(cVar2, StringsKt.indexOf$default(charSequence32, str62, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence32, str62, 0, false, 6, (Object) null) + string32.length(), 33);
                setText(newSpannable2);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
        } else if (str3.equals("telecom")) {
            str2 = getResources().getString(C0906R.string.bjk);
            String string42 = getResources().getString(C0906R.string.bjl, new Object[]{str2});
            CharSequence charSequence42 = string42;
            Spannable newSpannable22 = Spannable.Factory.getInstance().newSpannable(charSequence42);
            a aVar22 = new a(this, str3);
            Intrinsics.checkExpressionValueIsNotNull(string42, "totalStr");
            Intrinsics.checkExpressionValueIsNotNull(str2, "carrierStr");
            CharSequence charSequence222 = charSequence42;
            String str422 = str2;
            newSpannable22.setSpan(aVar22, StringsKt.indexOf$default(charSequence222, str422, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence222, str422, 0, false, 6, (Object) null) + str2.length(), 33);
            String string222 = getResources().getString(C0906R.string.b91);
            String string322 = getResources().getString(C0906R.string.b90);
            b bVar22 = new b(this);
            Intrinsics.checkExpressionValueIsNotNull(string222, "termStr");
            CharSequence charSequence322 = charSequence42;
            String str522 = string222;
            newSpannable22.setSpan(bVar22, StringsKt.indexOf$default(charSequence322, str522, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence322, str522, 0, false, 6, (Object) null) + string222.length(), 33);
            c cVar22 = new c(this);
            Intrinsics.checkExpressionValueIsNotNull(string322, "privacyStr");
            String str622 = string322;
            newSpannable22.setSpan(cVar22, StringsKt.indexOf$default(charSequence322, str622, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence322, str622, 0, false, 6, (Object) null) + string322.length(), 33);
            setText(newSpannable22);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        str2 = getResources().getString(C0906R.string.bjj);
        String string422 = getResources().getString(C0906R.string.bjl, new Object[]{str2});
        CharSequence charSequence422 = string422;
        Spannable newSpannable222 = Spannable.Factory.getInstance().newSpannable(charSequence422);
        a aVar222 = new a(this, str3);
        Intrinsics.checkExpressionValueIsNotNull(string422, "totalStr");
        Intrinsics.checkExpressionValueIsNotNull(str2, "carrierStr");
        CharSequence charSequence2222 = charSequence422;
        String str4222 = str2;
        newSpannable222.setSpan(aVar222, StringsKt.indexOf$default(charSequence2222, str4222, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence2222, str4222, 0, false, 6, (Object) null) + str2.length(), 33);
        String string2222 = getResources().getString(C0906R.string.b91);
        String string3222 = getResources().getString(C0906R.string.b90);
        b bVar222 = new b(this);
        Intrinsics.checkExpressionValueIsNotNull(string2222, "termStr");
        CharSequence charSequence3222 = charSequence422;
        String str5222 = string2222;
        newSpannable222.setSpan(bVar222, StringsKt.indexOf$default(charSequence3222, str5222, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence3222, str5222, 0, false, 6, (Object) null) + string2222.length(), 33);
        c cVar222 = new c(this);
        Intrinsics.checkExpressionValueIsNotNull(string3222, "privacyStr");
        String str6222 = string3222;
        newSpannable222.setSpan(cVar222, StringsKt.indexOf$default(charSequence3222, str6222, 0, false, 6, (Object) null), StringsKt.indexOf$default(charSequence3222, str6222, 0, false, 6, (Object) null) + string3222.length(), 33);
        setText(newSpannable222);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneBindPrivacyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setGravity(17);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public /* synthetic */ OneBindPrivacyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
