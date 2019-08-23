package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.DouplusTextStruct;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/DouplusTitleHelper;", "", "()V", "TYPE_MENU", "", "TYPE_OTHER", "TYPE_SELF", "getTitle", "", "type", "fallback", "Type", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DouplusTitleHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39618a;

    /* renamed from: b  reason: collision with root package name */
    public static final DouplusTitleHelper f39619b = new DouplusTitleHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/DouplusTitleHelper$Type;", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Type {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/global/config/settings/pojo/DouplusTextStruct;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<DouplusTextStruct, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i) {
            super(1);
            this.$type = i;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((DouplusTextStruct) obj));
        }

        public final boolean invoke(@NotNull DouplusTextStruct douplusTextStruct) {
            DouplusTextStruct douplusTextStruct2 = douplusTextStruct;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{douplusTextStruct2}, this, changeQuickRedirect, false, 32497, new Class[]{DouplusTextStruct.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{douplusTextStruct2}, this, changeQuickRedirect, false, 32497, new Class[]{DouplusTextStruct.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(douplusTextStruct2, AdvanceSetting.NETWORK_TYPE);
            try {
                Integer type = douplusTextStruct.getType();
                if (type != null) {
                    try {
                        if (type.intValue() == this.$type) {
                            z = true;
                        }
                    } catch (com.bytedance.ies.a unused) {
                    }
                    return z;
                }
            } catch (com.bytedance.ies.a unused2) {
            }
            return z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/global/config/settings/pojo/DouplusTextStruct;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<DouplusTextStruct, String> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        @Nullable
        public final String invoke(@NotNull DouplusTextStruct douplusTextStruct) {
            String str;
            DouplusTextStruct douplusTextStruct2 = douplusTextStruct;
            if (PatchProxy.isSupport(new Object[]{douplusTextStruct2}, this, changeQuickRedirect, false, 32498, new Class[]{DouplusTextStruct.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{douplusTextStruct2}, this, changeQuickRedirect, false, 32498, new Class[]{DouplusTextStruct.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(douplusTextStruct2, AdvanceSetting.NETWORK_TYPE);
            try {
                str = douplusTextStruct.getTitle();
            } catch (com.bytedance.ies.a unused) {
                str = null;
            }
            return str;
        }
    }

    @JvmStatic
    @Nullable
    @JvmOverloads
    public static final String a(@Type int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f39618a, true, 32496, new Class[]{Integer.TYPE}, String.class)) {
            return a(i, null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f39618a, true, 32496, new Class[]{Integer.TYPE}, String.class);
    }

    private DouplusTitleHelper() {
    }

    /* access modifiers changed from: private */
    @JvmStatic
    @Nullable
    @JvmOverloads
    public static String a(@Type int i, @Nullable String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, null, f39618a, true, 32495, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, null, f39618a, true, 32495, new Class[]{Integer.TYPE, String.class}, String.class);
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            List<DouplusTextStruct> bh = b2.bh();
            Intrinsics.checkExpressionValueIsNotNull(bh, "douplusEntryTitle");
            String str3 = (String) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(SequencesKt.filter(SequencesKt.filterNotNull(CollectionsKt.asSequence(bh)), new a(i)), b.INSTANCE)));
            if (str3 == null) {
                str2 = str;
            } else {
                str2 = str3;
            }
            return str2;
        } catch (com.bytedance.ies.a unused) {
            return str;
        }
    }
}
