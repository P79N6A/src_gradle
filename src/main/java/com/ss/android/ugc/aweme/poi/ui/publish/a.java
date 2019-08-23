package com.ss.android.ugc.aweme.poi.ui.publish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.ui.publish.b;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PoiAndGoodsPublishModel;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import com.ss.android.ugc.aweme.shortvideo.util.h;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*H\u0007J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0016JB\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002062\u0006\u0010,\u001a\u00020-2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\"H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\u0010\u0010=\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010>\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u000204H\u0016J\b\u0010A\u001a\u00020\u0000H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u000b0\u000b8VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR#\u0010\u0014\u001a\n \u0011*\u0004\u0018\u00010\u000b0\u000b8VX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0015\u0010\rR)\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00188VX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR#\u0010\u001e\u001a\n \u0011*\u0004\u0018\u00010\u000b0\u000b8VX\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001f\u0010\r¨\u0006B"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiAndGoodsPublishExtension;", "Lcom/ss/android/ugc/aweme/services/publish/IAVPublishExtension;", "Lcom/ss/android/ugc/aweme/services/publish/PoiAndGoodsPublishModel;", "()V", "delegate", "Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiAndGoodsPublishViewHolder;", "getDelegate", "()Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiAndGoodsPublishViewHolder;", "setDelegate", "(Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiAndGoodsPublishViewHolder;)V", "goodsDraftId", "", "getGoodsDraftId", "()Ljava/lang/String;", "goodsDraftId$delegate", "Lkotlin/Lazy;", "latitude", "kotlin.jvm.PlatformType", "getLatitude", "latitude$delegate", "longitude", "getLongitude", "longitude$delegate", "mobParams", "", "getMobParams", "()Ljava/util/Map;", "mobParams$delegate", "name", "getName", "poiContext", "getPoiContext", "poiContext$delegate", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAsyncGoodsInfoEvent", "event", "Lcom/ss/android/ugc/aweme/shortvideo/event/AsyncGoodsInfoEvent;", "onBackPressed", "publishOutput", "Lcom/ss/android/ugc/aweme/services/publish/PublishOutput;", "onCreate", "fragment", "Landroid/support/v4/app/Fragment;", "extensionWidgetContainer", "Landroid/widget/LinearLayout;", "savedInstanceState", "Landroid/os/Bundle;", "contentType", "Lcom/ss/android/ugc/aweme/services/publish/AVPublishContentType;", "extensionMisc", "Lcom/ss/android/ugc/aweme/services/publish/ExtensionMisc;", "callback", "Lcom/ss/android/ugc/aweme/services/publish/IAVPublishExtension$Callback;", "onDestroy", "onEnterChildrenMode", "onPublish", "onSaveDraft", "onSaveInstanceState", "outState", "provideExtensionData", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements IAVPublishExtension<PoiAndGoodsPublishModel>, PoiAndGoodsPublishModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3762a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f3763b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "poiContext", "getPoiContext()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "latitude", "getLatitude()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "longitude", "getLongitude()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "goodsDraftId", "getGoodsDraftId()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mobParams", "getMobParams()Ljava/util/Map;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public b f3764c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f3765d = LazyKt.lazy(new f(this));

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f3766e = LazyKt.lazy(new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f3767f = LazyKt.lazy(new c(this));
    @Nullable
    private final Lazy g = LazyKt.lazy(new C0673a(this));
    @Nullable
    private final Lazy h = LazyKt.lazy(new d(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.a$a  reason: collision with other inner class name */
    static final class C0673a extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0673a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Nullable
        public final String invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 66615, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 66615, new Class[0], String.class);
            } else if (this.this$0.a().o()) {
                return this.this$0.a().p();
            } else {
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final String invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 66616, new Class[0], String.class)) {
                return this.this$0.a().g;
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 66616, new Class[0], String.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final String invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 66617, new Class[0], String.class)) {
                return this.this$0.a().f60854f;
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 66617, new Class[0], String.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Map<String, String>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final Map<String, String> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 66618, new Class[0], Map.class)) {
                return this.this$0.a().l();
            }
            return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 66618, new Class[0], Map.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onPoiSelected"}, k = 3, mv = {1, 1, 15})
    static final class e implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IAVPublishExtension.Callback f60848b;

        e(IAVPublishExtension.Callback callback) {
            this.f60848b = callback;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f60847a, false, 66619, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60847a, false, 66619, new Class[0], Void.TYPE);
                return;
            }
            this.f60848b.onContentModified();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final String invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 66620, new Class[0], String.class)) {
                return this.this$0.a().n();
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 66620, new Class[0], String.class);
        }
    }

    @Nullable
    public final String getGoodsDraftId() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3762a, false, 66613, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3762a, false, 66613, new Class[0], String.class);
        } else {
            value = this.g.getValue();
        }
        return (String) value;
    }

    public final String getLatitude() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3762a, false, 66611, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3762a, false, 66611, new Class[0], String.class);
        } else {
            value = this.f3766e.getValue();
        }
        return (String) value;
    }

    public final String getLongitude() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3762a, false, 66612, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3762a, false, 66612, new Class[0], String.class);
        } else {
            value = this.f3767f.getValue();
        }
        return (String) value;
    }

    @Nullable
    public final Map<String, String> getMobParams() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3762a, false, 66614, new Class[0], Map.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3762a, false, 66614, new Class[0], Map.class);
        } else {
            value = this.h.getValue();
        }
        return (Map) value;
    }

    @NotNull
    public final String getName() {
        return "PoiAndGoodsPublishExtension";
    }

    public final String getPoiContext() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3762a, false, 66610, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3762a, false, 66610, new Class[0], String.class);
        } else {
            value = this.f3765d.getValue();
        }
        return (String) value;
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
    }

    public final void onEnterChildrenMode() {
    }

    public final void onPublish(@NotNull PublishOutput publishOutput) {
        PublishOutput publishOutput2 = publishOutput;
        if (PatchProxy.isSupport(new Object[]{publishOutput2}, this, f3762a, false, 66608, new Class[]{PublishOutput.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{publishOutput2}, this, f3762a, false, 66608, new Class[]{PublishOutput.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(publishOutput2, "publishOutput");
    }

    public final /* bridge */ /* synthetic */ Object provideExtensionData() {
        return this;
    }

    @NotNull
    public final b a() {
        if (PatchProxy.isSupport(new Object[0], this, f3762a, false, 66601, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f3762a, false, 66601, new Class[0], b.class);
        }
        b bVar = this.f3764c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        return bVar;
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3762a, false, 66604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3762a, false, 66604, new Class[0], Void.TYPE);
            return;
        }
        if (org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().c(this);
        }
    }

    @Subscribe
    public final void onAsyncGoodsInfoEvent(@Nullable com.ss.android.ugc.aweme.shortvideo.f.a aVar) {
        com.ss.android.ugc.aweme.shortvideo.f.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3762a, false, 66605, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3762a, false, 66605, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            b bVar = this.f3764c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            }
            bVar.a(aVar2);
        }
    }

    public final void onBackPressed(@NotNull PublishOutput publishOutput) {
        if (PatchProxy.isSupport(new Object[]{publishOutput}, this, f3762a, false, 66607, new Class[]{PublishOutput.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{publishOutput}, this, f3762a, false, 66607, new Class[]{PublishOutput.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(publishOutput, "publishOutput");
        b bVar = this.f3764c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        if (!bVar.j()) {
            b bVar2 = this.f3764c;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            }
            bVar2.b(publishOutput.getFilePath());
        }
        b bVar3 = this.f3764c;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        if (bVar3.h()) {
            b bVar4 = this.f3764c;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            }
            bVar4.d();
        }
    }

    public final void onSaveDraft(@NotNull PublishOutput publishOutput) {
        if (PatchProxy.isSupport(new Object[]{publishOutput}, this, f3762a, false, 66606, new Class[]{PublishOutput.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{publishOutput}, this, f3762a, false, 66606, new Class[]{PublishOutput.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(publishOutput, "publishOutput");
        b bVar = this.f3764c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        if (!bVar.j()) {
            b bVar2 = this.f3764c;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            }
            bVar2.b(publishOutput.getFilePath());
        }
        b bVar3 = this.f3764c;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        if (bVar3.h()) {
            b bVar4 = this.f3764c;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            }
            bVar4.d();
        }
    }

    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f3762a, false, 66609, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f3762a, false, 66609, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bundle2, "outState");
        b bVar = this.f3764c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        bVar.b(bundle2);
    }

    public final void onCreate(@NotNull Fragment fragment, @NotNull LinearLayout linearLayout, @Nullable Bundle bundle, @NotNull AVPublishContentType aVPublishContentType, @NotNull PublishOutput publishOutput, @NotNull ExtensionMisc extensionMisc, @NotNull IAVPublishExtension.Callback callback) {
        Fragment fragment2 = fragment;
        LinearLayout linearLayout2 = linearLayout;
        Bundle bundle2 = bundle;
        AVPublishContentType aVPublishContentType2 = aVPublishContentType;
        PublishOutput publishOutput2 = publishOutput;
        ExtensionMisc extensionMisc2 = extensionMisc;
        IAVPublishExtension.Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{fragment2, linearLayout2, bundle2, aVPublishContentType2, publishOutput2, extensionMisc2, callback2}, this, f3762a, false, 66603, new Class[]{Fragment.class, LinearLayout.class, Bundle.class, AVPublishContentType.class, PublishOutput.class, ExtensionMisc.class, IAVPublishExtension.Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, linearLayout2, bundle2, aVPublishContentType2, publishOutput2, extensionMisc2, callback2}, this, f3762a, false, 66603, new Class[]{Fragment.class, LinearLayout.class, Bundle.class, AVPublishContentType.class, PublishOutput.class, ExtensionMisc.class, IAVPublishExtension.Callback.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        Intrinsics.checkParameterIsNotNull(linearLayout2, "extensionWidgetContainer");
        Intrinsics.checkParameterIsNotNull(aVPublishContentType2, "contentType");
        Intrinsics.checkParameterIsNotNull(publishOutput2, "publishOutput");
        Intrinsics.checkParameterIsNotNull(extensionMisc2, "extensionMisc");
        Intrinsics.checkParameterIsNotNull(callback2, "callback");
        boolean isFromMicroApp = extensionMisc.isFromMicroApp();
        com.ss.android.ugc.aweme.commercialize.model.e a2 = com.ss.android.ugc.aweme.commercialize.model.e.a(extensionMisc.getCommerceData());
        Intrinsics.checkExpressionValueIsNotNull(a2, "CommercePublishModel.fro…tensionMisc.commerceData)");
        v vVar = a2.f39379f;
        Bundle bundle3 = bundle2;
        b bVar = new b(fragment, linearLayout, aVPublishContentType, isFromMicroApp, vVar, new e(callback2), extensionMisc.getShowPOI());
        this.f3764c = bVar;
        b bVar2 = this.f3764c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        bVar2.h = extensionMisc.getCandidateLog();
        b bVar3 = this.f3764c;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        bVar3.a(h.b(publishOutput.getFilePath()));
        if (bundle3 != null) {
            b bVar4 = this.f3764c;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            }
            bVar4.a(bundle3);
        }
        b bVar5 = this.f3764c;
        if (bVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        bVar5.m = extensionMisc.getDefaultSelectStickerPoi();
        b bVar6 = this.f3764c;
        if (bVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        bVar6.a(PoiContext.unserializeFromJson(extensionMisc.getPoiContext()));
        if (!org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().a((Object) this);
        }
    }
}
