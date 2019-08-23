package com.bytedance.android.livesdk.effect;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.live.core.rxutils.autodispose.ae;
import com.bytedance.android.live.core.rxutils.autodispose.af;
import com.bytedance.android.live.core.rxutils.autodispose.m;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0003\u0014\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0006\u0010\u000f\u001a\u00020\bJ\u001c\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper;", "", "()V", "beautyStickerList", "Ljava/util/ArrayList;", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "Lkotlin/collections/ArrayList;", "loadSmallItemBeautyData", "", "fragment", "Landroid/support/v4/app/Fragment;", "callback", "Lcom/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$LiveBeautyLoadCallback;", "activity", "Landroid/support/v4/app/FragmentActivity;", "release", "tryDownloadSticker", "sticker", "Lcom/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$LiveBeautyDownloadCallback;", "updateLocalTagValue", "Companion", "LiveBeautyDownloadCallback", "LiveBeautyLoadCallback", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13798a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f13799c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<com.bytedance.android.livesdk.sticker.b.a> f13800b = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$Companion;", "", "()V", "AB_GROUP", "", "BEAUTY_CONFIG", "ITEMS", "beautyEffectValue2UIValue", "", "sticker", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "value", "", "beautyUIValue2EffectValue", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13801a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final float a(@NotNull com.bytedance.android.livesdk.sticker.b.a aVar, int i) {
            int i2;
            com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
            int i3 = i;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{aVar2, Integer.valueOf(i)}, this, f13801a, false, 8213, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Integer.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{aVar2, Integer.valueOf(i)}, this, f13801a, false, 8213, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Integer.TYPE}, Float.TYPE)).floatValue();
            }
            Intrinsics.checkParameterIsNotNull(aVar2, "sticker");
            if (i3 == 0) {
                return 0.0f;
            }
            int i4 = 100;
            if (aVar2.h != null) {
                i4 = aVar2.h.f17257c;
                i2 = aVar2.h.f17258d;
            } else {
                i2 = 0;
            }
            if (i2 < 0) {
                z = true;
            }
            if (!z) {
                double d2 = (double) (i4 - i2);
                Double.isNaN(d2);
                double d3 = (double) i3;
                Double.isNaN(d3);
                return (float) (((d2 * 1.0d) / 10000.0d) * d3);
            } else if (i3 > 0) {
                double d4 = (double) i4;
                Double.isNaN(d4);
                double d5 = (double) i3;
                Double.isNaN(d5);
                return (float) (((d4 * 1.0d) / 5000.0d) * d5 * 2.0d);
            } else {
                double d6 = (double) i2;
                Double.isNaN(d6);
                double d7 = (double) i3;
                Double.isNaN(d7);
                return (float) (((d6 * 1.0d) / -5000.0d) * d7 * 2.0d);
            }
        }

        @JvmStatic
        public final int a(@NotNull com.bytedance.android.livesdk.sticker.b.a aVar, float f2) {
            int i;
            com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{aVar2, Float.valueOf(f2)}, this, f13801a, false, 8214, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Float.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar2, Float.valueOf(f2)}, this, f13801a, false, 8214, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Float.TYPE}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(aVar2, "sticker");
            if (f2 == 0.0f) {
                return 0;
            }
            int i2 = 100;
            if (aVar2.h != null) {
                i2 = aVar2.h.f17257c;
                i = aVar2.h.f17258d;
            } else {
                i = 0;
            }
            if (i < 0) {
                z = true;
            }
            if (!z) {
                return (int) (((float) (10000 / (i2 - i))) * f2);
            }
            if (f2 > 0.0f) {
                return (int) ((((float) (5000 / i2)) * f2) / 2.0f);
            }
            return (int) ((((float) (-5000 / i)) * f2) / 2.0f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$LiveBeautyDownloadCallback;", "", "onError", "", "onSuccess", "sticker", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public interface b {
        void a(@NotNull com.bytedance.android.livesdk.sticker.b.a aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, d2 = {"Lcom/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$LiveBeautyLoadCallback;", "", "onError", "", "onSuccess", "stickerList", "", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public interface c {
        void a();

        void a(@NotNull List<? extends com.bytedance.android.livesdk.sticker.b.a> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$loadSmallItemBeautyData$1", "Lcom/bytedance/android/livesdk/sticker/presenter/AbsBaseLiveStickerPresenter$SyncStickerListener;", "onSyncStickersFailed", "", "onSyncStickersSuccess", "effectCategoryResponseList", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class d implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f13803b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f13804c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f13805d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "apply"}, k = 3, mv = {1, 1, 13})
        static final class a<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13806a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f13807b;

            a(d dVar) {
                this.f13807b = dVar;
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x007b, code lost:
                if (r2.intValue() != r3) goto L_0x007d;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bytedance.android.livesdk.sticker.b.a apply(@org.jetbrains.annotations.NotNull com.ss.android.ugc.effectmanager.effect.model.Effect r11) {
                /*
                    r10 = this;
                    r8 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    r9 = 0
                    r1[r9] = r11
                    com.meituan.robust.ChangeQuickRedirect r3 = f13806a
                    java.lang.Class[] r6 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r2 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r6[r9] = r2
                    java.lang.Class<com.bytedance.android.livesdk.sticker.b.a> r7 = com.bytedance.android.livesdk.sticker.b.a.class
                    r4 = 0
                    r5 = 8217(0x2019, float:1.1514E-41)
                    r2 = r10
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0033
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    r1[r9] = r11
                    com.meituan.robust.ChangeQuickRedirect r3 = f13806a
                    r4 = 0
                    r5 = 8217(0x2019, float:1.1514E-41)
                    java.lang.Class[] r6 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r6[r9] = r0
                    java.lang.Class<com.bytedance.android.livesdk.sticker.b.a> r7 = com.bytedance.android.livesdk.sticker.b.a.class
                    r2 = r10
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    com.bytedance.android.livesdk.sticker.b.a r0 = (com.bytedance.android.livesdk.sticker.b.a) r0
                    return r0
                L_0x0033:
                    java.lang.String r1 = "it"
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r1)
                    com.bytedance.android.livesdk.sticker.b.a r1 = com.bytedance.android.livesdk.sticker.h.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r11)
                    com.google.gson.JsonParser r2 = new com.google.gson.JsonParser     // Catch:{ Throwable -> 0x00f6 }
                    r2.<init>()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r0 = r11.extra     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonElement r0 = r2.parse((java.lang.String) r0)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "JsonParser().parse(it.extra)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "ab_group"
                    boolean r2 = r0.has(r2)     // Catch:{ Throwable -> 0x00f6 }
                    if (r2 == 0) goto L_0x007e
                    com.bytedance.android.live.core.setting.l<java.lang.Integer> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r3 = "LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.Object r2 = r2.a()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r3 = "ab_group"
                    com.google.gson.JsonElement r3 = r0.get(r3)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r4 = "jsonObject.get(AB_GROUP)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Throwable -> 0x00f6 }
                    int r3 = r3.getAsInt()     // Catch:{ Throwable -> 0x00f6 }
                    if (r2 != 0) goto L_0x0077
                    goto L_0x007d
                L_0x0077:
                    int r2 = r2.intValue()     // Catch:{ Throwable -> 0x00f6 }
                    if (r2 == r3) goto L_0x007e
                L_0x007d:
                    return r1
                L_0x007e:
                    java.lang.String r2 = "beautyConfig"
                    com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "jsonObject.get(BEAUTY_CONFIG)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r0 = r0.getAsString()     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonParser r2 = new com.google.gson.JsonParser     // Catch:{ Throwable -> 0x00f6 }
                    r2.<init>()     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonElement r0 = r2.parse((java.lang.String) r0)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "JsonParser().parse(beautyConfig)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "items"
                    com.google.gson.JsonArray r0 = r0.getAsJsonArray(r2)     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonElement r0 = r0.get(r9)     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.Gson r2 = com.bytedance.android.live.a.a()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.Class<com.bytedance.android.livesdk.sticker.b.a$a> r3 = com.bytedance.android.livesdk.sticker.b.a.C0121a.class
                    java.lang.Object r0 = r2.fromJson((com.google.gson.JsonElement) r0, (java.lang.Class<T>) r3)     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.sticker.b.a$a r0 = (com.bytedance.android.livesdk.sticker.b.a.C0121a) r0     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "stickerBean"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ Throwable -> 0x00f6 }
                    r1.h = r0     // Catch:{ Throwable -> 0x00f6 }
                    java.util.List<java.lang.String> r2 = r1.i     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r0 = r0.f17256b     // Catch:{ Throwable -> 0x00f6 }
                    r2.add(r0)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r0 = "beautyTag"
                    java.lang.String r0 = com.bytedance.android.livesdk.sticker.h.a((java.lang.String) r0, (com.bytedance.android.livesdk.sticker.b.a) r1)     // Catch:{ Throwable -> 0x00f6 }
                    boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x00f6 }
                    if (r2 != 0) goto L_0x00e3
                    com.bytedance.android.livesdk.v.f r2 = com.bytedance.android.livesdk.v.j.q()     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.effect.b r2 = r2.p()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r3 = "LiveInternalService.inst().liveEffectService()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.sticker.c.b r2 = r2.a()     // Catch:{ Throwable -> 0x00f6 }
                    r2.a((java.lang.String) r0, (com.bytedance.android.livesdk.sticker.b.a) r1)     // Catch:{ Throwable -> 0x00f6 }
                L_0x00e3:
                    com.bytedance.android.livesdk.effect.k$d r0 = r10.f13807b     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.effect.k r0 = r0.f13803b     // Catch:{ Throwable -> 0x00f6 }
                    java.util.ArrayList<com.bytedance.android.livesdk.sticker.b.a> r0 = r0.f13800b     // Catch:{ Throwable -> 0x00f6 }
                    r0.add(r1)     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.effect.k$d r0 = r10.f13807b     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.effect.k r0 = r0.f13803b     // Catch:{ Throwable -> 0x00f6 }
                    r2 = 0
                    r3 = 2
                    r0.a((com.bytedance.android.livesdk.sticker.b.a) r1, (com.bytedance.android.livesdk.effect.k.b) null)     // Catch:{ Throwable -> 0x00f6 }
                    goto L_0x00fc
                L_0x00f6:
                    r0 = move-exception
                    java.lang.String r2 = "LiveSmallItemBeautyDialogFragment"
                    com.bytedance.android.live.core.c.a.a((java.lang.String) r2, (java.lang.Throwable) r0)
                L_0x00fc:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.effect.k.d.a.apply(com.ss.android.ugc.effectmanager.effect.model.Effect):com.bytedance.android.livesdk.sticker.b.a");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "test"}, k = 3, mv = {1, 1, 13})
        static final class b<T> implements Predicate<com.bytedance.android.livesdk.sticker.b.a> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13808a;

            /* renamed from: b  reason: collision with root package name */
            public static final b f13809b = new b();

            b() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                com.bytedance.android.livesdk.sticker.b.a aVar = (com.bytedance.android.livesdk.sticker.b.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f13808a, false, 8218, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f13808a, false, 8218, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Boolean.TYPE)).booleanValue();
                }
                Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
                if (aVar.h != null) {
                    return true;
                }
                return false;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "kotlin.jvm.PlatformType", "", "accept"}, k = 3, mv = {1, 1, 13})
        static final class c<T> implements Consumer<List<com.bytedance.android.livesdk.sticker.b.a>> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13810a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f13811b;

            c(d dVar) {
                this.f13811b = dVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                List list = (List) obj;
                if (PatchProxy.isSupport(new Object[]{list}, this, f13810a, false, 8219, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list}, this, f13810a, false, 8219, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                if (Lists.isEmpty(list)) {
                    c cVar = this.f13811b.f13804c;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else {
                    c cVar2 = this.f13811b.f13804c;
                    if (cVar2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
                        cVar2.a(list);
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
        /* renamed from: com.bytedance.android.livesdk.effect.k$d$d  reason: collision with other inner class name */
        static final class C0096d<T> implements Consumer<Throwable> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13812a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f13813b;

            C0096d(d dVar) {
                this.f13813b = dVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f13812a, false, 8220, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f13812a, false, 8220, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                c cVar = this.f13813b.f13804c;
                if (cVar != null) {
                    cVar.a();
                }
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f13802a, false, 8216, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13802a, false, 8216, new Class[0], Void.TYPE);
                return;
            }
            c cVar = this.f13804c;
            if (cVar != null) {
                cVar.a();
            }
        }

        public final void a(@Nullable EffectChannelResponse effectChannelResponse) {
            if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f13802a, false, 8215, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f13802a, false, 8215, new Class[]{EffectChannelResponse.class}, Void.TYPE);
            } else if (effectChannelResponse == null || t.a(effectChannelResponse.allCategoryEffects)) {
                c cVar = this.f13804c;
                if (cVar != null) {
                    cVar.a();
                }
            } else {
                this.f13803b.f13800b.clear();
                ((af) Observable.fromIterable(effectChannelResponse.allCategoryEffects).map(new a(this)).filter(b.f13809b).toList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).as(com.bytedance.android.live.core.rxutils.autodispose.e.a(this.f13805d))).a(new c(this), new C0096d(this));
            }
        }

        d(k kVar, c cVar, Fragment fragment) {
            this.f13803b = kVar;
            this.f13804c = cVar;
            this.f13805d = fragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$loadSmallItemBeautyData$2", "Lcom/bytedance/android/livesdk/sticker/presenter/AbsBaseLiveStickerPresenter$SyncStickerListener;", "onSyncStickersFailed", "", "onSyncStickersSuccess", "effectCategoryResponseList", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class e implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f13815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f13816c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f13817d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "apply"}, k = 3, mv = {1, 1, 13})
        static final class a<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13818a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f13819b;

            a(e eVar) {
                this.f13819b = eVar;
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x007b, code lost:
                if (r2.intValue() != r3) goto L_0x007d;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bytedance.android.livesdk.sticker.b.a apply(@org.jetbrains.annotations.NotNull com.ss.android.ugc.effectmanager.effect.model.Effect r11) {
                /*
                    r10 = this;
                    r8 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    r9 = 0
                    r1[r9] = r11
                    com.meituan.robust.ChangeQuickRedirect r3 = f13818a
                    java.lang.Class[] r6 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r2 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r6[r9] = r2
                    java.lang.Class<com.bytedance.android.livesdk.sticker.b.a> r7 = com.bytedance.android.livesdk.sticker.b.a.class
                    r4 = 0
                    r5 = 8223(0x201f, float:1.1523E-41)
                    r2 = r10
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0033
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    r1[r9] = r11
                    com.meituan.robust.ChangeQuickRedirect r3 = f13818a
                    r4 = 0
                    r5 = 8223(0x201f, float:1.1523E-41)
                    java.lang.Class[] r6 = new java.lang.Class[r8]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r6[r9] = r0
                    java.lang.Class<com.bytedance.android.livesdk.sticker.b.a> r7 = com.bytedance.android.livesdk.sticker.b.a.class
                    r2 = r10
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    com.bytedance.android.livesdk.sticker.b.a r0 = (com.bytedance.android.livesdk.sticker.b.a) r0
                    return r0
                L_0x0033:
                    java.lang.String r1 = "it"
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r1)
                    com.bytedance.android.livesdk.sticker.b.a r1 = com.bytedance.android.livesdk.sticker.h.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r11)
                    com.google.gson.JsonParser r2 = new com.google.gson.JsonParser     // Catch:{ Throwable -> 0x00f6 }
                    r2.<init>()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r0 = r11.extra     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonElement r0 = r2.parse((java.lang.String) r0)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "JsonParser().parse(it.extra)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "ab_group"
                    boolean r2 = r0.has(r2)     // Catch:{ Throwable -> 0x00f6 }
                    if (r2 == 0) goto L_0x007e
                    com.bytedance.android.live.core.setting.l<java.lang.Integer> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r3 = "LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.Object r2 = r2.a()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r3 = "ab_group"
                    com.google.gson.JsonElement r3 = r0.get(r3)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r4 = "jsonObject.get(AB_GROUP)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Throwable -> 0x00f6 }
                    int r3 = r3.getAsInt()     // Catch:{ Throwable -> 0x00f6 }
                    if (r2 != 0) goto L_0x0077
                    goto L_0x007d
                L_0x0077:
                    int r2 = r2.intValue()     // Catch:{ Throwable -> 0x00f6 }
                    if (r2 == r3) goto L_0x007e
                L_0x007d:
                    return r1
                L_0x007e:
                    java.lang.String r2 = "beautyConfig"
                    com.google.gson.JsonElement r0 = r0.get(r2)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "jsonObject.get(BEAUTY_CONFIG)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r0 = r0.getAsString()     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonParser r2 = new com.google.gson.JsonParser     // Catch:{ Throwable -> 0x00f6 }
                    r2.<init>()     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonElement r0 = r2.parse((java.lang.String) r0)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "JsonParser().parse(beautyConfig)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "items"
                    com.google.gson.JsonArray r0 = r0.getAsJsonArray(r2)     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.JsonElement r0 = r0.get(r9)     // Catch:{ Throwable -> 0x00f6 }
                    com.google.gson.Gson r2 = com.bytedance.android.live.a.a()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.Class<com.bytedance.android.livesdk.sticker.b.a$a> r3 = com.bytedance.android.livesdk.sticker.b.a.C0121a.class
                    java.lang.Object r0 = r2.fromJson((com.google.gson.JsonElement) r0, (java.lang.Class<T>) r3)     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.sticker.b.a$a r0 = (com.bytedance.android.livesdk.sticker.b.a.C0121a) r0     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r2 = "stickerBean"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ Throwable -> 0x00f6 }
                    r1.h = r0     // Catch:{ Throwable -> 0x00f6 }
                    java.util.List<java.lang.String> r2 = r1.i     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r0 = r0.f17256b     // Catch:{ Throwable -> 0x00f6 }
                    r2.add(r0)     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r0 = "beautyTag"
                    java.lang.String r0 = com.bytedance.android.livesdk.sticker.h.a((java.lang.String) r0, (com.bytedance.android.livesdk.sticker.b.a) r1)     // Catch:{ Throwable -> 0x00f6 }
                    boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x00f6 }
                    if (r2 != 0) goto L_0x00e3
                    com.bytedance.android.livesdk.v.f r2 = com.bytedance.android.livesdk.v.j.q()     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.effect.b r2 = r2.p()     // Catch:{ Throwable -> 0x00f6 }
                    java.lang.String r3 = "LiveInternalService.inst().liveEffectService()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.sticker.c.b r2 = r2.a()     // Catch:{ Throwable -> 0x00f6 }
                    r2.a((java.lang.String) r0, (com.bytedance.android.livesdk.sticker.b.a) r1)     // Catch:{ Throwable -> 0x00f6 }
                L_0x00e3:
                    com.bytedance.android.livesdk.effect.k$e r0 = r10.f13819b     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.effect.k r0 = r0.f13815b     // Catch:{ Throwable -> 0x00f6 }
                    java.util.ArrayList<com.bytedance.android.livesdk.sticker.b.a> r0 = r0.f13800b     // Catch:{ Throwable -> 0x00f6 }
                    r0.add(r1)     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.effect.k$e r0 = r10.f13819b     // Catch:{ Throwable -> 0x00f6 }
                    com.bytedance.android.livesdk.effect.k r0 = r0.f13815b     // Catch:{ Throwable -> 0x00f6 }
                    r2 = 0
                    r3 = 2
                    r0.a((com.bytedance.android.livesdk.sticker.b.a) r1, (com.bytedance.android.livesdk.effect.k.b) null)     // Catch:{ Throwable -> 0x00f6 }
                    goto L_0x00fc
                L_0x00f6:
                    r0 = move-exception
                    java.lang.String r2 = "LiveSmallItemBeautyDialogFragment"
                    com.bytedance.android.live.core.c.a.a((java.lang.String) r2, (java.lang.Throwable) r0)
                L_0x00fc:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.effect.k.e.a.apply(com.ss.android.ugc.effectmanager.effect.model.Effect):com.bytedance.android.livesdk.sticker.b.a");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "test"}, k = 3, mv = {1, 1, 13})
        static final class b<T> implements Predicate<com.bytedance.android.livesdk.sticker.b.a> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13820a;

            /* renamed from: b  reason: collision with root package name */
            public static final b f13821b = new b();

            b() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                com.bytedance.android.livesdk.sticker.b.a aVar = (com.bytedance.android.livesdk.sticker.b.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f13820a, false, 8224, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f13820a, false, 8224, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Boolean.TYPE)).booleanValue();
                }
                Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
                if (aVar.h != null) {
                    return true;
                }
                return false;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "kotlin.jvm.PlatformType", "", "accept"}, k = 3, mv = {1, 1, 13})
        static final class c<T> implements Consumer<List<com.bytedance.android.livesdk.sticker.b.a>> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13822a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f13823b;

            c(e eVar) {
                this.f13823b = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                List list = (List) obj;
                if (PatchProxy.isSupport(new Object[]{list}, this, f13822a, false, 8225, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list}, this, f13822a, false, 8225, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                if (Lists.isEmpty(list)) {
                    c cVar = this.f13823b.f13816c;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else {
                    c cVar2 = this.f13823b.f13816c;
                    if (cVar2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
                        cVar2.a(list);
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
        static final class d<T> implements Consumer<Throwable> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13824a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f13825b;

            d(e eVar) {
                this.f13825b = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f13824a, false, 8226, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f13824a, false, 8226, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                c cVar = this.f13825b.f13816c;
                if (cVar != null) {
                    cVar.a();
                }
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f13814a, false, 8222, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13814a, false, 8222, new Class[0], Void.TYPE);
                return;
            }
            c cVar = this.f13816c;
            if (cVar != null) {
                cVar.a();
            }
        }

        public final void a(@Nullable EffectChannelResponse effectChannelResponse) {
            m mVar;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (PatchProxy.isSupport(new Object[]{effectChannelResponse2}, this, f13814a, false, 8221, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effectChannelResponse2}, this, f13814a, false, 8221, new Class[]{EffectChannelResponse.class}, Void.TYPE);
            } else if (effectChannelResponse2 == null || t.a(effectChannelResponse2.allCategoryEffects)) {
                c cVar = this.f13816c;
                if (cVar != null) {
                    cVar.a();
                }
            } else {
                this.f13815b.f13800b.clear();
                Single observeOn = Observable.fromIterable(effectChannelResponse2.allCategoryEffects).map(new a(this)).filter(b.f13821b).toList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                FragmentActivity fragmentActivity = this.f13817d;
                if (PatchProxy.isSupport(new Object[]{fragmentActivity}, null, com.bytedance.android.live.core.rxutils.autodispose.e.f8028a, true, 670, new Class[]{FragmentActivity.class}, m.class)) {
                    mVar = (m) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, com.bytedance.android.live.core.rxutils.autodispose.e.f8028a, true, 670, new Class[]{FragmentActivity.class}, m.class);
                } else if (fragmentActivity == null) {
                    mVar = com.bytedance.android.live.core.rxutils.autodispose.e.a(com.bytedance.android.live.core.rxutils.autodispose.f.f8046b);
                } else {
                    mVar = com.bytedance.android.live.core.rxutils.autodispose.e.a((ae) com.bytedance.android.live.core.rxutils.autodispose.a.a(fragmentActivity, Lifecycle.Event.ON_DESTROY));
                }
                ((af) observeOn.as(mVar)).a(new c(this), new d(this));
            }
        }

        public e(k kVar, c cVar, FragmentActivity fragmentActivity) {
            this.f13815b = kVar;
            this.f13816c = cVar;
            this.f13817d = fragmentActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$tryDownloadSticker$1", "Lcom/bytedance/android/livesdk/sticker/presenter/AbsBaseLiveStickerPresenter$StickerDownloadListener;", "onDownloadFail", "", "panel", "", "sticker", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "onDownloadStart", "onDownloadSuccess", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class f implements a.C0122a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13826a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f13827b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f13828c;

        public final void a(@Nullable String str, @Nullable com.bytedance.android.livesdk.sticker.b.a aVar) {
        }

        f(k kVar, b bVar) {
            this.f13827b = kVar;
            this.f13828c = bVar;
        }

        public final void b(@Nullable String str, @Nullable com.bytedance.android.livesdk.sticker.b.a aVar) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, aVar}, this, f13826a, false, 8227, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, aVar}, this, f13826a, false, 8227, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                return;
            }
            Intrinsics.areEqual((Object) com.bytedance.android.livesdk.sticker.c.a.f17264e, (Object) str2);
        }

        public final void c(@Nullable String str, @Nullable com.bytedance.android.livesdk.sticker.b.a aVar) {
            if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f13826a, false, 8228, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f13826a, false, 8228, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                return;
            }
            if (Intrinsics.areEqual((Object) com.bytedance.android.livesdk.sticker.c.a.f17264e, (Object) str) && aVar != null) {
                this.f13827b.a(aVar);
                b bVar = this.f13828c;
                if (bVar != null) {
                    bVar.a(aVar);
                }
            }
        }
    }

    @JvmStatic
    public static final float a(@NotNull com.bytedance.android.livesdk.sticker.b.a aVar, int i) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2, Integer.valueOf(i)}, null, f13798a, true, 8211, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Integer.TYPE}, Float.TYPE)) {
            return f13799c.a(aVar2, i);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{aVar2, Integer.valueOf(i)}, null, f13798a, true, 8211, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Integer.TYPE}, Float.TYPE)).floatValue();
    }

    public final void a(com.bytedance.android.livesdk.sticker.b.a aVar) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f13798a, false, 8209, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f13798a, false, 8209, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.sticker.a.c o = j.q().o();
        Collection arrayList = new ArrayList();
        for (Object next : this.f13800b) {
            if (StringUtils.equal(((com.bytedance.android.livesdk.sticker.b.a) next).r, aVar2.r)) {
                arrayList.add(next);
            }
        }
        for (com.bytedance.android.livesdk.sticker.b.a aVar3 : (List) arrayList) {
            if (o.c(aVar3.h.f17256b) == null) {
                o.a(com.bytedance.android.livesdk.sticker.c.a.f17264e, aVar3);
                o.a(aVar3.h.f17256b, f13799c.a(aVar3, aVar3.h.f17255a));
            }
        }
    }

    @JvmOverloads
    public final void a(@NotNull Fragment fragment, @Nullable c cVar) {
        Fragment fragment2 = fragment;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{fragment2, cVar2}, this, f13798a, false, 8203, new Class[]{Fragment.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, cVar2}, this, f13798a, false, 8203, new Class[]{Fragment.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        b p = j.q().p();
        Intrinsics.checkExpressionValueIsNotNull(p, "LiveInternalService.inst().liveEffectService()");
        p.a().a(com.bytedance.android.livesdk.sticker.c.a.f17264e, (a.b) new d(this, cVar2, fragment2));
    }

    @JvmOverloads
    public final void a(@NotNull com.bytedance.android.livesdk.sticker.b.a aVar, @Nullable b bVar) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, bVar2}, this, f13798a, false, 8207, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, bVar2}, this, f13798a, false, 8207, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "sticker");
        b p = j.q().p();
        Intrinsics.checkExpressionValueIsNotNull(p, "LiveInternalService.inst().liveEffectService()");
        if (p.a().a(aVar2)) {
            a(aVar);
            if (bVar2 != null) {
                bVar2.a(aVar2);
                return;
            }
            return;
        }
        b p2 = j.q().p();
        Intrinsics.checkExpressionValueIsNotNull(p2, "LiveInternalService.inst().liveEffectService()");
        p2.a().a(com.bytedance.android.livesdk.sticker.c.a.f17264e, aVar2, (a.C0122a) new f(this, bVar2));
    }
}
