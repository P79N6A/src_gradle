package com.ss.android.ugc.aweme.feed.ui.masklayer;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer/MaskLayerHelper;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f46694a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static int f46695b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f46696c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0563a f46697d = new C0563a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer/MaskLayerHelper$Companion;", "", "()V", "buttonWidth", "", "isNewStyle", "", "()Z", "translationYValue", "getTranslationYValue", "()I", "setTranslationYValue", "(I)V", "canShowMaskLayer", "eventType", "", "getButtonWidth", "itemView", "Landroid/view/View;", "getCalcuWidth", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.a$a  reason: collision with other inner class name */
    public static final class C0563a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46698a;

        private C0563a() {
        }

        public static boolean a() {
            return a.f46696c;
        }

        public /* synthetic */ C0563a(byte b2) {
            this();
        }

        public final boolean a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f46698a, false, 43379, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f46698a, false, 43379, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "eventType");
            CharSequence charSequence = str2;
            if (TextUtils.equals(charSequence, "homepage_hot")) {
                return true;
            }
            if (MainPageExperimentHelper.d() && TextUtils.equals(charSequence, "homepage_follow")) {
                return true;
            }
            if (!com.ss.android.g.a.a()) {
                return false;
            }
            return AbTestManager.a().o();
        }

        public final int a(@NotNull View view) {
            double d2;
            View view2 = view;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f46698a, false, 43377, new Class[]{View.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f46698a, false, 43377, new Class[]{View.class}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(view2, "itemView");
            if (a.f46694a == -1) {
                C0563a aVar = this;
                if (PatchProxy.isSupport(new Object[]{view2}, aVar, f46698a, false, 43378, new Class[]{View.class}, Double.TYPE)) {
                    d2 = ((Double) PatchProxy.accessDispatch(new Object[]{view2}, aVar, f46698a, false, 43378, new Class[]{View.class}, Double.TYPE)).doubleValue();
                } else {
                    View findViewById = view2.findViewById(C0906R.id.cov);
                    if (findViewById != null) {
                        TextPaint paint = ((TextView) findViewById).getPaint();
                        int b2 = p.b(view.getContext());
                        int a2 = u.a(85.0d);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(C0906R.string.c3c));
                        arrayList.add(Integer.valueOf(C0906R.string.cdz));
                        arrayList.add(Integer.valueOf(C0906R.string.c1g));
                        Iterable<Number> iterable = arrayList;
                        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (Number intValue : iterable) {
                            arrayList2.add(view.getContext().getString(intValue.intValue()));
                        }
                        Iterable<String> iterable2 = (List) arrayList2;
                        Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                        for (String measureText : iterable2) {
                            arrayList3.add(Integer.valueOf((int) paint.measureText(measureText)));
                        }
                        Iterable<Number> iterable3 = (List) arrayList3;
                        Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
                        for (Number intValue2 : iterable3) {
                            arrayList4.add(Integer.valueOf(intValue2.intValue() + a2));
                        }
                        Integer num = (Integer) CollectionsKt.max((Iterable<? extends T>) (List) arrayList4);
                        if (num != null) {
                            i = num.intValue();
                        }
                        double d3 = (double) i;
                        double d4 = (double) b2;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        double d5 = d3 / d4;
                        if (d5 > 0.77d) {
                            d5 = 0.77d;
                        } else if (d5 < 0.66d) {
                            d5 = 0.66d;
                        }
                        Double.isNaN(d4);
                        d2 = d5 * d4;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                    }
                }
                a.f46694a = (int) d2;
            }
            return a.f46694a;
        }
    }

    static {
        int i;
        boolean z = false;
        if (f46696c) {
            i = u.a(35.0d);
        } else {
            i = u.a(70.0d);
        }
        f46695b = i;
        if (com.ss.android.g.a.a()) {
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (a2.w() == 1) {
                z = true;
            }
        }
        f46696c = z;
    }
}
