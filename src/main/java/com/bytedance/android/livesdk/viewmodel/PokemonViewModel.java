package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.chatroom.api.PokemonApi;
import com.bytedance.android.livesdk.chatroom.model.a.o;
import com.bytedance.android.livesdk.chatroom.model.af;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J2\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/bytedance/android/livesdk/viewmodel/PokemonViewModel;", "Lcom/bytedance/android/live/core/rxutils/RxViewModel;", "room", "Lcom/bytedance/android/livesdkapi/depend/model/live/Room;", "callback", "Lcom/bytedance/android/livesdk/viewmodel/PokemonViewModel$PokemonCallback;", "(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;Lcom/bytedance/android/livesdk/viewmodel/PokemonViewModel$PokemonCallback;)V", "api", "Lcom/bytedance/android/livesdk/chatroom/api/PokemonApi;", "getApi", "()Lcom/bytedance/android/livesdk/chatroom/api/PokemonApi;", "setApi", "(Lcom/bytedance/android/livesdk/chatroom/api/PokemonApi;)V", "getCallback", "()Lcom/bytedance/android/livesdk/viewmodel/PokemonViewModel$PokemonCallback;", "getRoom", "()Lcom/bytedance/android/livesdkapi/depend/model/live/Room;", "enableShowPokemon", "", "anchorId", "", "userId", "sendGift", "enterLiveSource", "", "giftId", "toUser", "Lcom/bytedance/android/live/base/model/user/User;", "count", "", "giftType", "sendPokemon", "triggerPokemonMessage", "PokemonCallback", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class PokemonViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17721a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public PokemonApi f17722b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Room f17723c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final a f17724d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/android/livesdk/viewmodel/PokemonViewModel$PokemonCallback;", "", "getPokemonInfoFailed", "", "error", "", "getPokemonInfoSuccess", "pokemonInfo", "Lcom/bytedance/android/livesdk/chatroom/model/interact/PokemonInfo;", "onSendPokemonFailed", "onSendPokemonSuccess", "sendGiftFailed", "sendGiftSuccess", "result", "Lcom/bytedance/android/livesdk/gift/model/SendGiftResult;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public interface a {
        void a(@NotNull o oVar);

        void a(@Nullable com.bytedance.android.livesdk.gift.model.i iVar);

        void a(@NotNull Throwable th);

        void b(@NotNull Throwable th);

        void c(@NotNull Throwable th);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "Lcom/bytedance/android/live/core/network/response/Response;", "Lcom/bytedance/android/livesdk/chatroom/model/interact/PokemonInfo;", "accept"}, k = 3, mv = {1, 1, 13})
    static final class b<T> implements Consumer<com.bytedance.android.live.core.network.response.d<o>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonViewModel f17726b;

        b(PokemonViewModel pokemonViewModel) {
            this.f17726b = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            o oVar;
            com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f17725a, false, 13868, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f17725a, false, 13868, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
                return;
            }
            a aVar = this.f17726b.f17724d;
            if (dVar != null) {
                oVar = (o) dVar.f7871b;
            } else {
                oVar = null;
            }
            if (oVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.a(oVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class c<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonViewModel f17728b;

        c(PokemonViewModel pokemonViewModel) {
            this.f17728b = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f17727a, false, 13869, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f17727a, false, 13869, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            a aVar = this.f17728b.f17724d;
            Intrinsics.checkExpressionValueIsNotNull(th, "error");
            aVar.b(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "response", "Lcom/bytedance/android/live/core/network/response/Response;", "Lcom/bytedance/android/livesdk/gift/model/SendGiftResult;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class d<T> implements Consumer<com.bytedance.android.live.core.network.response.d<com.bytedance.android.livesdk.gift.model.i>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17729a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonViewModel f17730b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f17731c;

        public d(PokemonViewModel pokemonViewModel, String str) {
            this.f17730b = pokemonViewModel;
            this.f17731c = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f17729a, false, 13870, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f17729a, false, 13870, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
                return;
            }
            PokemonViewModel pokemonViewModel = this.f17730b;
            ((com.bytedance.android.livesdk.gift.model.i) dVar.f7871b).t = this.f17731c;
            a aVar = pokemonViewModel.f17724d;
            if (aVar != null) {
                aVar.a((com.bytedance.android.livesdk.gift.model.i) dVar.f7871b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class e<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonViewModel f17733b;

        public e(PokemonViewModel pokemonViewModel) {
            this.f17733b = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f17732a, false, 13871, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f17732a, false, 13871, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            a aVar = this.f17733b.f17724d;
            Intrinsics.checkExpressionValueIsNotNull(th, "error");
            aVar.a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "response", "Lcom/bytedance/android/live/core/network/response/Response;", "Lcom/bytedance/android/livesdk/chatroom/model/SendPokemonResult;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class f<T> implements Consumer<com.bytedance.android.live.core.network.response.d<af>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonViewModel f17735b;

        public f(PokemonViewModel pokemonViewModel) {
            this.f17735b = pokemonViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
            if (r0.f11093a == 1) goto L_0x0056;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r18
                com.bytedance.android.live.core.network.response.d r0 = (com.bytedance.android.live.core.network.response.d) r0
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f17734a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.android.live.core.network.response.d> r3 = com.bytedance.android.live.core.network.response.d.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 13872(0x3630, float:1.9439E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0036
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f17734a
                r13 = 0
                r14 = 13872(0x3630, float:1.9439E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.android.live.core.network.response.d> r0 = com.bytedance.android.live.core.network.response.d.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0036:
                r2 = r17
                com.bytedance.android.livesdk.viewmodel.PokemonViewModel r3 = r2.f17735b
                if (r0 == 0) goto L_0x0047
                java.lang.Object r0 = r0.f7871b
                com.bytedance.android.livesdk.chatroom.model.af r0 = (com.bytedance.android.livesdk.chatroom.model.af) r0
                if (r0 == 0) goto L_0x0047
                int r0 = r0.f11093a
                if (r0 != r1) goto L_0x0047
                goto L_0x0056
            L_0x0047:
                com.bytedance.android.livesdk.viewmodel.PokemonViewModel$a r0 = r3.f17724d
                if (r0 == 0) goto L_0x0056
                com.bytedance.android.livesdk.gift.c.a r1 = new com.bytedance.android.livesdk.gift.c.a
                r1.<init>()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.c(r1)
                return
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.PokemonViewModel.f.accept(java.lang.Object):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class g<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonViewModel f17737b;

        public g(PokemonViewModel pokemonViewModel) {
            this.f17737b = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f17736a, false, 13873, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f17736a, false, 13873, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            a aVar = this.f17737b.f17724d;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(th, "error");
                aVar.c(th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/bytedance/android/live/core/network/response/Response;", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class h<T> implements Consumer<com.bytedance.android.live.core.network.response.d<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonViewModel f17739b;

        public h(PokemonViewModel pokemonViewModel) {
            this.f17739b = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f17738a, false, 13874, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f17738a, false, 13874, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.live.core.c.a.a("PokemonViewModel", "trigger pokemon message success");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class i<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17740a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonViewModel f17741b;

        public i(PokemonViewModel pokemonViewModel) {
            this.f17741b = pokemonViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f17740a, false, 13875, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f17740a, false, 13875, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.live.core.c.a.c("PokemonViewModel", "trigger pokemon message failed, " + th.getMessage());
        }
    }

    public PokemonViewModel(@NotNull Room room, @NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(room, "room");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f17723c = room;
        this.f17724d = aVar;
        Object a2 = j.q().d().a(PokemonApi.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "LiveInternalService.inst…e(PokemonApi::class.java)");
        this.f17722b = (PokemonApi) a2;
    }

    public final void a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f17721a, false, 13867, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f17721a, false, 13867, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a(((com.bytedance.android.livesdk.utils.b.b) this.f17722b.getPokemonInfo(j3, j4).as(com.bytedance.android.livesdk.utils.b.c.a())).a(3).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new b(this), new c(this)));
    }
}
