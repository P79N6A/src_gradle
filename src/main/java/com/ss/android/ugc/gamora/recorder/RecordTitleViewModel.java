package com.ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.MutableLiveData;
import android.graphics.drawable.Drawable;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.ss.android.ugc.aweme.tools.bd;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u001a\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J \u0010\"\u001a\u00020\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020%0\u001aJ\u000e\u0010&\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020%J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001eJ\u000e\u0010*\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001bJ\u000e\u0010+\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020-J\u000e\u0010.\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordTitleViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "()V", "setClickable", "Landroid/arch/lifecycle/MutableLiveData;", "", "getSetClickable", "()Landroid/arch/lifecycle/MutableLiveData;", "setMusicChange", "Ljava/lang/Void;", "getSetMusicChange", "showMusicTips", "getShowMusicTips", "tryHideMusicTips", "getTryHideMusicTips", "uiEventContext", "Lcom/ss/android/ugc/aweme/tools/UiEventContext;", "getUiEventContext", "()Lcom/ss/android/ugc/aweme/tools/UiEventContext;", "setUiEventContext", "(Lcom/ss/android/ugc/aweme/tools/UiEventContext;)V", "defaultState", "setCloseChooseAlphaAnim", "", "value", "Lkotlin/Pair;", "", "setCloseChooseVisible", "setIvChooseMusicAlpha", "", "setIvChooseMusicDrawable", "Landroid/graphics/drawable/Drawable;", "setIvChooseMusicVisible", "setProgressClipAnchors", "", "Lcom/ss/android/ugc/aweme/shortvideo/ui/TimeSpeedModelExtension;", "", "setProgressMaxDuration", "setProgressSegmentVisible", "setTitleBarVisible", "setTopMargin", "setTvChooseMusicAlpha", "setTvChooseMusicClickable", "setTvChooseMusicText", "", "setTvChooseMusicVisible", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecordTitleViewModel extends JediViewModel<RecordTitleState> {
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public bd f77608d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final MutableLiveData<Void> f77609e = new MutableLiveData<>();
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final MutableLiveData<Void> f77610f = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Void> g = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Boolean> h = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ Pair $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Pair pair) {
            super(1);
            this.$value = pair;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, false, false, 0, false, false, false, false, null, this.$value, null, 12287, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ boolean $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.$value = z;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, false, this.$value, 0, false, false, false, false, null, null, null, 16351, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ int $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i) {
            super(1);
            this.$value = i;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, this.$value, null, false, false, 0, false, false, false, false, null, null, null, 16379, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ Drawable $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Drawable drawable) {
            super(1);
            this.$value = drawable;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, false, false, 0, false, false, false, false, this.$value, null, null, 14335, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ boolean $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$value = z;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, false, false, 0, this.$value, false, false, false, null, null, null, 16255, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class f extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ Pair $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Pair pair) {
            super(1);
            this.$value = pair;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, false, false, 0, false, false, false, false, null, null, this.$value, 8191, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class g extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ long $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(1);
            this.$value = j;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, this.$value, 0.0f, 0, null, false, false, 0, false, false, false, false, null, null, null, 16382, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ boolean $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z) {
            super(1);
            this.$value = z;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, false, false, 0, false, false, false, this.$value, null, null, null, 15359, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ boolean $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(boolean z) {
            super(1);
            this.$value = z;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, this.$value, false, 0, false, false, false, false, null, null, null, 16367, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ float $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(float f2) {
            super(1);
            this.$value = f2;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, this.$value, 0, null, false, false, 0, false, false, false, false, null, null, null, 16381, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class k extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ boolean $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(boolean z) {
            super(1);
            this.$value = z;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, false, false, 0, false, false, this.$value, false, null, null, null, 15871, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ String $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(1);
            this.$value = str;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, this.$value, false, false, 0, false, false, false, false, null, null, null, 16375, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/gamora/recorder/RecordTitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function1<RecordTitleState, RecordTitleState> {
        final /* synthetic */ boolean $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(boolean z) {
            super(1);
            this.$value = z;
        }

        @NotNull
        public final RecordTitleState invoke(@NotNull RecordTitleState recordTitleState) {
            Intrinsics.checkParameterIsNotNull(recordTitleState, "$receiver");
            return RecordTitleState.copy$default(recordTitleState, 0, 0.0f, 0, null, false, false, 0, false, this.$value, false, false, null, null, null, 16127, null);
        }
    }

    public final /* synthetic */ x c() {
        RecordTitleState recordTitleState = new RecordTitleState(0, 0.0f, 0, null, false, false, 0, false, false, false, false, null, null, null, 16383, null);
        return recordTitleState;
    }

    public final void a(float f2) {
        c(new j(f2));
    }

    public final void b(boolean z) {
        c(new m(z));
    }

    public final void c(boolean z) {
        c(new h(z));
    }

    public final void d(boolean z) {
        c(new i(z));
    }

    public final void e(boolean z) {
        c(new b(z));
    }

    public final void a(int i2) {
        c(new c(i2));
    }

    public final void a(@NotNull Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "value");
        c(new d(drawable));
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        c(new l(str));
    }

    public final void a(@NotNull Pair<Float, Float> pair) {
        Intrinsics.checkParameterIsNotNull(pair, "value");
        c(new a(pair));
    }

    public final void a(boolean z) {
        c(new e(z));
    }
}
