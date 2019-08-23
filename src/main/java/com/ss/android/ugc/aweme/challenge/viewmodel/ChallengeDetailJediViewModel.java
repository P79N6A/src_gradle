package com.ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J \u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailJediViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailState;", "()V", "defaultState", "refreshChallenge", "", "cid", "", "clickReason", "", "isHashTag", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ChallengeDetailJediViewModel extends JediViewModel<ChallengeDetailState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f35721d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements SingleOnSubscribe<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f35724c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f35725d;

        a(String str, int i, boolean z) {
            this.f35723b = str;
            this.f35724c = i;
            this.f35725d = z;
        }

        public final void subscribe(@NotNull SingleEmitter<ChallengeDetail> singleEmitter) {
            if (PatchProxy.isSupport(new Object[]{singleEmitter}, this, f35722a, false, 26429, new Class[]{SingleEmitter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{singleEmitter}, this, f35722a, false, 26429, new Class[]{SingleEmitter.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(singleEmitter, "emitter");
            try {
                singleEmitter.onSuccess(ChallengeApi.a(this.f35723b, this.f35724c, this.f35725d));
            } catch (Throwable th) {
                if (!singleEmitter.isDisposed()) {
                    singleEmitter.onError(th);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailState;", "state", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<ChallengeDetailState, com.bytedance.jedi.arch.a<? extends ChallengeDetail>, ChallengeDetailState> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(2);
        }

        @NotNull
        public final ChallengeDetailState invoke(@NotNull ChallengeDetailState challengeDetailState, @NotNull com.bytedance.jedi.arch.a<? extends ChallengeDetail> aVar) {
            ChallengeDetailState challengeDetailState2 = challengeDetailState;
            com.bytedance.jedi.arch.a<? extends ChallengeDetail> aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{challengeDetailState2, aVar2}, this, changeQuickRedirect, false, 26430, new Class[]{ChallengeDetailState.class, com.bytedance.jedi.arch.a.class}, ChallengeDetailState.class)) {
                return (ChallengeDetailState) PatchProxy.accessDispatch(new Object[]{challengeDetailState2, aVar2}, this, changeQuickRedirect, false, 26430, new Class[]{ChallengeDetailState.class, com.bytedance.jedi.arch.a.class}, ChallengeDetailState.class);
            }
            Intrinsics.checkParameterIsNotNull(challengeDetailState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(aVar2, "state");
            return challengeDetailState.copy(aVar);
        }
    }

    public final /* synthetic */ x c() {
        ChallengeDetailState challengeDetailState;
        if (PatchProxy.isSupport(new Object[0], this, f35721d, false, 26427, new Class[0], ChallengeDetailState.class)) {
            challengeDetailState = (ChallengeDetailState) PatchProxy.accessDispatch(new Object[0], this, f35721d, false, 26427, new Class[0], ChallengeDetailState.class);
        } else {
            challengeDetailState = new ChallengeDetailState(null, 1, null);
        }
        return challengeDetailState;
    }

    public final void a(@Nullable String str, int i, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f35721d, false, 26428, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z)}, this, f35721d, false, 26428, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Single subscribeOn = Single.create(new a(str2, i, z)).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "Single.create<ChallengeD…scribeOn(Schedulers.io())");
        a(subscribeOn, b.INSTANCE);
    }
}
