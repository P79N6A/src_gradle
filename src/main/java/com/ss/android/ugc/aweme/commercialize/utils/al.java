package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0007J\u001c\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001f\u001a\u00020\u0004H\u0002J\u0012\u0010 \u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010!\u001a\u00020\"2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020\u001cH\u0007J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0007H\u0007J\u0012\u0010&\u001a\u00020\"2\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010'\u001a\u00020\"2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010(\u001a\u00020\u001cH\u0007J\u0012\u0010)\u001a\u00020\"2\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010*\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0007J!\u0010+\u001a\u00020\"*\u00020\f2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\"0-H\bJ!\u0010.\u001a\u00020\"*\u00020\f2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\"0-H\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR(\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00128B@BX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00128B@BX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/TrueViewPlayRecorder;", "", "()V", "FLAG_CLICK", "", "FLAG_SENT", "TAG", "", "TRUE_VIEW_PLAY_TYPE_CLICK", "TRUE_VIEW_PLAY_TYPE_PLAY", "awemeState", "Ljava/util/WeakHashMap;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAwemeState", "()Ljava/util/WeakHashMap;", "awemeState$delegate", "Lkotlin/Lazy;", "value", "", "trueViewClicked", "getTrueViewClicked", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", "setTrueViewClicked", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Z)V", "trueViewSent", "getTrueViewSent", "setTrueViewSent", "effectivePlayDuration", "", "aweme", "getState", "def", "hasClicked", "onBreak", "", "duration", "onClickOccur", "creativeId", "onOver", "onProgress", "position", "onStart", "useEffectivePlay", "commonTask", "f", "Lkotlin/Function1;", "task", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39702a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f39703b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(al.class), "awemeState", "getAwemeState()Ljava/util/WeakHashMap;"))};

    /* renamed from: c  reason: collision with root package name */
    public static final al f39704c = new al();

    /* renamed from: d  reason: collision with root package name */
    private static final Lazy f39705d = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/WeakHashMap;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<WeakHashMap<Aweme, Integer>> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        @NotNull
        public final WeakHashMap<Aweme, Integer> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32600, new Class[0], WeakHashMap.class)) {
                return new WeakHashMap<>();
            }
            return (WeakHashMap) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32600, new Class[0], WeakHashMap.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "kotlin.jvm.PlatformType", "it", "", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<Map.Entry<? extends Aweme, ? extends Integer>, Aweme> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        public final Aweme invoke(@NotNull Map.Entry<? extends Aweme, Integer> entry) {
            Map.Entry<? extends Aweme, Integer> entry2 = entry;
            if (PatchProxy.isSupport(new Object[]{entry2}, this, changeQuickRedirect, false, 32601, new Class[]{Map.Entry.class}, Aweme.class)) {
                return (Aweme) PatchProxy.accessDispatch(new Object[]{entry2}, this, changeQuickRedirect, false, 32601, new Class[]{Map.Entry.class}, Aweme.class);
            }
            Intrinsics.checkParameterIsNotNull(entry2, AdvanceSetting.NETWORK_TYPE);
            return (Aweme) entry.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<Aweme, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $creativeId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$creativeId = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((Aweme) obj));
        }

        public final boolean invoke(Aweme aweme) {
            String str;
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, changeQuickRedirect, false, 32602, new Class[]{Aweme.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, changeQuickRedirect, false, 32602, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(aweme2, AdvanceSetting.NETWORK_TYPE);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getCreativeIdStr();
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual((Object) str, (Object) this.$creativeId) || al.f39704c.c(aweme2)) {
                return false;
            }
            return true;
        }
    }

    private final WeakHashMap<Aweme, Integer> a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39702a, false, 32584, new Class[0], WeakHashMap.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39702a, false, 32584, new Class[0], WeakHashMap.class);
        } else {
            value = f39705d.getValue();
        }
        return (WeakHashMap) value;
    }

    private al() {
    }

    @JvmStatic
    public static final void b(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39702a, true, 32586, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39702a, true, 32586, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null && c.t(aweme)) {
            f(aweme);
            if (!f39704c.c(aweme2)) {
                if (e(aweme)) {
                    g.a(GlobalContext.getContext(), aweme2, "play");
                } else {
                    g.c(aweme);
                }
            }
            f39704c.a().remove(aweme2);
        }
    }

    @JvmStatic
    public static final boolean d(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39702a, true, 32596, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39702a, true, 32596, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme2 == null || !f39704c.g(aweme2)) {
            return false;
        } else {
            return true;
        }
    }

    @JvmStatic
    public static final boolean e(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39702a, true, 32597, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39702a, true, 32597, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (c.t(aweme) && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || !awemeRawAd.useEffectivePlayAction()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final long f(@Nullable Aweme aweme) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39702a, true, 32598, new Class[]{Aweme.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39702a, true, 32598, new Class[]{Aweme.class}, Long.TYPE)).longValue();
        }
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Float effectivePlayTime = awemeRawAd.getEffectivePlayTime();
                if (effectivePlayTime != null) {
                    f2 = effectivePlayTime.floatValue();
                    return kotlin.a.a.a(f2 * 1000.0f);
                }
            }
        }
        f2 = 3.0f;
        return kotlin.a.a.a(f2 * 1000.0f);
    }

    private final boolean g(@NotNull Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f39702a, false, 32594, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f39702a, false, 32594, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if ((a(aweme2, 0) & 1) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean c(@NotNull Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f39702a, false, 32592, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f39702a, false, 32592, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if ((a(aweme2, 0) & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @JvmStatic
    public static final void a(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39702a, true, 32585, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39702a, true, 32585, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null && c.t(aweme)) {
            f(aweme);
            f39704c.a().put(aweme2, 0);
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f39702a, true, 32588, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f39702a, true, 32588, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "creativeId");
        for (Aweme aweme : SequencesKt.toList(SequencesKt.filter(SequencesKt.map(MapsKt.asSequence(f39704c.a()), b.INSTANCE), new c(str2)))) {
            if (e(aweme)) {
                g.a(GlobalContext.getContext(), aweme, "click");
                f39704c.a(aweme, true);
            }
            al alVar = f39704c;
            if (PatchProxy.isSupport(new Object[]{aweme, (byte) 1}, alVar, f39702a, false, 32595, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
                al alVar2 = alVar;
                PatchProxy.accessDispatch(new Object[]{aweme, (byte) 1}, alVar2, f39702a, false, 32595, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            } else {
                alVar.a().put(aweme, Integer.valueOf(alVar.a(aweme, 0) | 1));
            }
        }
    }

    /* access modifiers changed from: private */
    public final int a(Aweme aweme, int i) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i)}, this, f39702a, false, 32599, new Class[]{Aweme.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i)}, this, f39702a, false, 32599, new Class[]{Aweme.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (aweme2 == null) {
            return i;
        } else {
            Integer num = a().get(aweme2);
            if (num != null) {
                return num.intValue();
            }
            return i;
        }
    }

    @JvmStatic
    public static final void a(@Nullable Aweme aweme, long j) {
        Aweme aweme2 = aweme;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aweme2, new Long(j2)}, null, f39702a, true, 32587, new Class[]{Aweme.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, new Long(j2)}, null, f39702a, true, 32587, new Class[]{Aweme.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (aweme2 != null && c.t(aweme)) {
            if (j2 >= f(aweme) && !f39704c.c(aweme2)) {
                if (e(aweme)) {
                    g.a(GlobalContext.getContext(), aweme2, "play");
                } else {
                    g.c(aweme);
                }
            }
            f39704c.a().remove(aweme2);
        }
    }

    public final void a(@NotNull Aweme aweme, boolean z) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, (byte) 1}, this, f39702a, false, 32593, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, (byte) 1}, this, f39702a, false, 32593, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a().put(aweme2, Integer.valueOf(2 | a(aweme2, 0)));
    }
}
