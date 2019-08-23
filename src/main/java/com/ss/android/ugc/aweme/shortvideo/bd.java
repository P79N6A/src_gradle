package com.ss.android.ugc.aweme.shortvideo;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.draft.a.h;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.o.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/DraftUpdateServiceImpl;", "Lcom/ss/android/ugc/aweme/draft/model/DraftUpdateService;", "()V", "transformNewAVMusic", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "musicString", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class bd implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65783a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f65784b = LazyKt.lazy(b.INSTANCE);

    /* renamed from: c  reason: collision with root package name */
    public static final a f65785c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/DraftUpdateServiceImpl$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65786a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f65787b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Gson> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        public final Gson invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 74086, new Class[0], Gson.class)) {
                return ((IAVService) ServiceManager.get().getService(IAVService.class)).provideAvGson();
            }
            return (Gson) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 74086, new Class[0], Gson.class);
        }
    }

    @NotNull
    public final e a(@NotNull String str) {
        Object value;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65783a, false, 74084, new Class[]{String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str2}, this, f65783a, false, 74084, new Class[]{String.class}, e.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "musicString");
        a aVar = f65785c;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f65786a, false, 74085, new Class[0], Gson.class)) {
            value = PatchProxy.accessDispatch(new Object[0], aVar, a.f65786a, false, 74085, new Class[0], Gson.class);
        } else {
            value = f65784b.getValue();
        }
        Object fromJson = ((Gson) value).fromJson(str2, MusicModel.class);
        Intrinsics.checkExpressionValueIsNotNull(fromJson, "gson\n                .fr…, MusicModel::class.java)");
        MusicModel musicModel = (MusicModel) fromJson;
        if (musicModel.getName() == null && musicModel.getMusicType() == null) {
            z = true;
        }
        if (z) {
            Object fromJson2 = m.d().fromJson(str2, e.class);
            Intrinsics.checkExpressionValueIsNotNull(fromJson2, "RetrofitFactory.getGson(…ing, AVMusic::class.java)");
            return (e) fromJson2;
        }
        e a2 = new c().apply(musicModel);
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "AVMusicTransformation().apply(oldMusicModel)!!");
        return a2;
    }
}
