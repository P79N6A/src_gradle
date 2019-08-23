package com.ss.android.ugc.aweme.feed.k;

import android.text.InputFilter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/utils/InputFilterUtils;", "", "()V", "removeLengthFilter", "", "Landroid/text/InputFilter;", "filters", "([Landroid/text/InputFilter;)[Landroid/text/InputFilter;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45597a;

    /* renamed from: b  reason: collision with root package name */
    public static final j f45598b = new j();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/text/InputFilter;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<InputFilter, Boolean> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((InputFilter) obj));
        }

        public final boolean invoke(@NotNull InputFilter inputFilter) {
            InputFilter inputFilter2 = inputFilter;
            if (PatchProxy.isSupport(new Object[]{inputFilter2}, this, changeQuickRedirect, false, 43621, new Class[]{InputFilter.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{inputFilter2}, this, changeQuickRedirect, false, 43621, new Class[]{InputFilter.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(inputFilter2, AdvanceSetting.NETWORK_TYPE);
            return inputFilter2 instanceof InputFilter.LengthFilter;
        }
    }

    private j() {
    }
}
