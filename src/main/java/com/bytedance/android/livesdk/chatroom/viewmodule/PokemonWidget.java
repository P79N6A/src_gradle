package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.PokemonApi;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.chatroom.event.ag;
import com.bytedance.android.livesdk.chatroom.model.a.o;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.viewmodel.PokemonViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007*\u0001\u0013\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001f\u0010\u001d\u001a\u00020\u001a2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020 \u0018\u00010\u001fH\u0016¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\u001a2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020 \u0018\u00010\u001fH\u0016¢\u0006\u0002\u0010!J\b\u0010#\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0018H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/viewmodule/PokemonWidget;", "Lcom/bytedance/ies/sdk/widgets/LiveRecyclableWidget;", "()V", "mIsAnchor", "", "getMIsAnchor", "()Z", "setMIsAnchor", "(Z)V", "mRoom", "Lcom/bytedance/android/livesdkapi/depend/model/live/Room;", "getMRoom", "()Lcom/bytedance/android/livesdkapi/depend/model/live/Room;", "setMRoom", "(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", "observer", "Landroid/arch/lifecycle/Observer;", "Lcom/bytedance/ies/sdk/widgets/KVData;", "pokemonCallback", "com/bytedance/android/livesdk/chatroom/viewmodule/PokemonWidget$pokemonCallback$1", "Lcom/bytedance/android/livesdk/chatroom/viewmodule/PokemonWidget$pokemonCallback$1;", "viewModel", "Lcom/bytedance/android/livesdk/viewmodel/PokemonViewModel;", "getLayoutId", "", "onEvent", "", "event", "Lcom/bytedance/android/livesdk/browser/jsbridge/event/PokemonPurchaseEvent;", "onInit", "args", "", "", "([Ljava/lang/Object;)V", "onLoad", "onUnload", "triggerPokemonTip", "delay", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class PokemonWidget extends LiveRecyclableWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12724a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f12725e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public PokemonViewModel f12726b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public Room f12727c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12728d;

    /* renamed from: f  reason: collision with root package name */
    private Observer<KVData> f12729f = new b(this);
    private e g = new e(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/viewmodule/PokemonWidget$Companion;", "", "()V", "POKEMON_URL", "", "TAG", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/sdk/widgets/KVData;", "onChanged"}, k = 3, mv = {1, 1, 13})
    static final class b<T> implements Observer<KVData> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonWidget f12731b;

        b(PokemonWidget pokemonWidget) {
            this.f12731b = pokemonWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            KVData kVData = (KVData) obj;
            if (PatchProxy.isSupport(new Object[]{kVData}, this, f12730a, false, 7371, new Class[]{KVData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kVData}, this, f12730a, false, 7371, new Class[]{KVData.class}, Void.TYPE);
                return;
            }
            Object obj2 = null;
            if (kVData != null) {
                str = kVData.getKey();
            } else {
                str = null;
            }
            if (str != null) {
                if (kVData != null) {
                    obj2 = kVData.getData();
                }
                if (obj2 != null && Intrinsics.areEqual((Object) kVData.getKey(), (Object) "data_link_state")) {
                    Integer num = (Integer) kVData.getData();
                    if (num != null && num.intValue() == 1) {
                        View view = this.f12731b.contentView;
                        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
                        view.setVisibility(8);
                        return;
                    }
                    View view2 = this.f12731b.contentView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
                    view2.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonWidget f12733b;

        c(PokemonWidget pokemonWidget) {
            this.f12733b = pokemonWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12732a, false, 7372, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12732a, false, 7372, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.user.e k = TTLiveSDKContext.getHostService().k();
            Intrinsics.checkExpressionValueIsNotNull(k, "TTLiveSDKContext.getHostService().user()");
            if (!k.c()) {
                TTLiveSDKContext.getHostService().k().a((FragmentActivity) this.f12733b.context, i.a().a(ac.a((int) C0906R.string.deu)).a(0).a()).compose(this.f12733b.getAutoUnbindTransformer()).subscribe((io.reactivex.Observer<? super T>) new g<Object>());
            } else if (!TTLiveSDKContext.getHostService().k().a(h.GIFT)) {
                com.ss.android.common.util.i iVar = new com.ss.android.common.util.i("https://hotsoon.snssdk.com/falcon/live_inroom/page/magic_baby/pokemon/");
                User owner = this.f12733b.a().getOwner();
                Intrinsics.checkExpressionValueIsNotNull(owner, "mRoom.owner");
                iVar.a("anchor_id", owner.getId());
                iVar.a("room_id", this.f12733b.a().getId());
                com.bytedance.android.livesdk.user.e k2 = TTLiveSDKContext.getHostService().k();
                Intrinsics.checkExpressionValueIsNotNull(k2, "TTLiveSDKContext.getHostService().user()");
                com.bytedance.android.live.base.model.user.i a2 = k2.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "TTLiveSDKContext.getHost…vice().user().currentUser");
                if (a2 != null) {
                    iVar.a("user_id", a2.getId());
                }
                aa aaVar = new aa(iVar.a(), "", 17, 0, 0, 8);
                aaVar.h = true;
                com.bytedance.android.livesdk.u.a.a().a((Object) aaVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/android/livesdk/browser/jsbridge/event/PokemonPurchaseEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class d<T> implements Consumer<com.bytedance.android.livesdk.browser.jsbridge.a.e> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonWidget f12735b;

        d(PokemonWidget pokemonWidget) {
            this.f12735b = pokemonWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.browser.jsbridge.a.e eVar = (com.bytedance.android.livesdk.browser.jsbridge.a.e) obj;
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f12734a, false, 7373, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f12734a, false, 7373, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.e.class}, Void.TYPE);
                return;
            }
            PokemonWidget pokemonWidget = this.f12735b;
            Intrinsics.checkExpressionValueIsNotNull(eVar, AdvanceSetting.NETWORK_TYPE);
            pokemonWidget.onEvent(eVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0002¨\u0006\u0011"}, d2 = {"com/bytedance/android/livesdk/chatroom/viewmodule/PokemonWidget$pokemonCallback$1", "Lcom/bytedance/android/livesdk/viewmodel/PokemonViewModel$PokemonCallback;", "getPokemonInfoFailed", "", "error", "", "getPokemonInfoSuccess", "pokemonInfo", "Lcom/bytedance/android/livesdk/chatroom/model/interact/PokemonInfo;", "mobSendGift", "result", "Lcom/bytedance/android/livesdk/gift/model/SendGiftResult;", "onSendPokemonFailed", "onSendPokemonSuccess", "sendGiftFailed", "sendGiftSuccess", "showMoneyNotEnough", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class e implements PokemonViewModel.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonWidget f12737b;

        private final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f12736a, false, 7379, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12736a, false, 7379, new Class[0], Void.TYPE);
                return;
            }
            ai.a((int) C0906R.string.dje);
            this.f12737b.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new ag(1, (String) this.f12737b.dataCenter.get("log_enter_live_source"), "pokemon"));
        }

        e(PokemonWidget pokemonWidget) {
            this.f12737b = pokemonWidget;
        }

        public final void b(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f12736a, false, 7376, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f12736a, false, 7376, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "error");
            l.a(this.f12737b.context, th2);
        }

        public final void c(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f12736a, false, 7378, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f12736a, false, 7378, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "error");
            l.a(this.f12737b.context, th2);
        }

        public final void a(@NotNull o oVar) {
            o oVar2 = oVar;
            if (PatchProxy.isSupport(new Object[]{oVar2}, this, f12736a, false, 7377, new Class[]{o.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{oVar2}, this, f12736a, false, 7377, new Class[]{o.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(oVar2, "pokemonInfo");
            if (oVar2.f11067a && this.f12737b.isViewValid) {
                View view = this.f12737b.contentView;
                if (view != null) {
                    ((ImageView) view).setBackground(null);
                    com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.f12737b.contentView, oVar2.f11069c);
                    ViewGroup viewGroup = this.f12737b.containerView;
                    Intrinsics.checkExpressionValueIsNotNull(viewGroup, "containerView");
                    viewGroup.setVisibility(0);
                    PokemonWidget pokemonWidget = this.f12737b;
                    int i = oVar2.f11068b;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, pokemonWidget, PokemonWidget.f12724a, false, 7368, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PokemonWidget pokemonWidget2 = pokemonWidget;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, pokemonWidget2, PokemonWidget.f12724a, false, 7368, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i <= 0) {
                        i = 30;
                    }
                    ((ab) Observable.timer((long) (i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).as(pokemonWidget.autoDispose())).a((Consumer<? super T>) new f<Object>(pokemonWidget));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                }
            }
        }

        public final void a(@Nullable com.bytedance.android.livesdk.gift.model.i iVar) {
            String str;
            com.bytedance.android.livesdk.gift.model.i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f12736a, false, 7374, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f12736a, false, 7374, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE);
            } else if (iVar2 != null && this.f12737b.isViewValid) {
                com.bytedance.android.live.f.a n = j.q().n();
                Intrinsics.checkExpressionValueIsNotNull(n, "LiveInternalService.inst().walletCenter()");
                n.a(iVar2.f15131c);
                if (com.bytedance.android.livesdk.utils.ab.a() != null && this.f12737b.isViewValid) {
                    com.bytedance.android.livesdk.utils.ab.a().insertMessage(((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getGiftMessage(this.f12737b.a().getId(), iVar2, (User) this.f12737b.dataCenter.get("data_user_in_room")));
                }
                if (PatchProxy.isSupport(new Object[]{iVar2}, this, f12736a, false, 7380, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar2}, this, f12736a, false, 7380, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, Void.TYPE);
                } else {
                    this.f12737b.dataCenter.get("log_enter_live_source");
                    this.f12737b.a().getUserFrom();
                    com.ss.android.ugc.aweme.q.c.a(this.f12737b.context, "feed_live_span", 0).getInt("span_count", 0);
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(iVar2.t)) {
                        String str2 = iVar2.t;
                        Intrinsics.checkExpressionValueIsNotNull(str2, "result.giftType");
                        hashMap.put("request_page", str2);
                    }
                    com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                    Map map = hashMap;
                    Object[] objArr = new Object[3];
                    com.bytedance.android.livesdk.j.c.j jVar = new com.bytedance.android.livesdk.j.c.j();
                    if (this.f12737b.f12728d) {
                        str = "live_take_detail";
                    } else {
                        str = "live_detail";
                    }
                    objArr[0] = jVar.a(str).c("bottom_tab").b("live_interact").f("other");
                    objArr[1] = Room.class;
                    objArr[2] = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getSendGiftResultLog(iVar2);
                    a2.a("send_gift", map, objArr);
                }
                this.f12737b.dataCenter.lambda$put$1$DataCenter("cmd_close_h5_dialog", new Object());
                PokemonViewModel pokemonViewModel = this.f12737b.f12726b;
                if (pokemonViewModel != null) {
                    long j = iVar2.f15133e;
                    if (PatchProxy.isSupport(new Object[]{new Long(j)}, pokemonViewModel, PokemonViewModel.f17721a, false, 13865, new Class[]{Long.TYPE}, Void.TYPE)) {
                        PokemonViewModel pokemonViewModel2 = pokemonViewModel;
                        PatchProxy.accessDispatch(new Object[]{new Long(j)}, pokemonViewModel2, PokemonViewModel.f17721a, false, 13865, new Class[]{Long.TYPE}, Void.TYPE);
                    } else {
                        PokemonApi pokemonApi = pokemonViewModel.f17722b;
                        User owner = pokemonViewModel.f17723c.getOwner();
                        Intrinsics.checkExpressionValueIsNotNull(owner, "room.owner");
                        pokemonViewModel.a(((com.bytedance.android.livesdk.utils.b.b) pokemonApi.sendPokemon(owner.getId(), j, pokemonViewModel.f17723c.getId()).as(com.bytedance.android.livesdk.utils.b.c.a())).a(3).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new PokemonViewModel.f(pokemonViewModel), new PokemonViewModel.g(pokemonViewModel)));
                    }
                }
            }
        }

        public final void a(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f12736a, false, 7375, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f12736a, false, 7375, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "error");
            if (th2 instanceof com.bytedance.android.livesdk.gift.c.a) {
                a();
            } else if (th2 instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th2;
                if (40001 == aVar.getErrorCode()) {
                    a();
                } else {
                    ai.a(aVar.getPrompt());
                }
            } else {
                ai.a((int) C0906R.string.d2r);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 13})
    static final class f<T> implements Consumer<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PokemonWidget f12739b;

        f(PokemonWidget pokemonWidget) {
            this.f12739b = pokemonWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            if (PatchProxy.isSupport(new Object[]{l}, this, f12738a, false, 7381, new Class[]{Long.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{l}, this, f12738a, false, 7381, new Class[]{Long.class}, Void.TYPE);
                return;
            }
            PokemonViewModel pokemonViewModel = this.f12739b.f12726b;
            if (pokemonViewModel != null) {
                User owner = this.f12739b.a().getOwner();
                Intrinsics.checkExpressionValueIsNotNull(owner, "mRoom.owner");
                long id = owner.getId();
                if (PatchProxy.isSupport(new Object[]{new Long(id)}, pokemonViewModel, PokemonViewModel.f17721a, false, 13864, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PokemonViewModel pokemonViewModel2 = pokemonViewModel;
                    PatchProxy.accessDispatch(new Object[]{new Long(id)}, pokemonViewModel2, PokemonViewModel.f17721a, false, 13864, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    pokemonViewModel.a(((com.bytedance.android.livesdk.utils.b.b) pokemonViewModel.f17722b.showPokemonTip(id).compose(com.bytedance.android.live.core.rxutils.i.a()).as(com.bytedance.android.livesdk.utils.b.c.a())).a(3).subscribe(new PokemonViewModel.h(pokemonViewModel), new PokemonViewModel.i(pokemonViewModel)));
                }
            }
        }
    }

    public final int getLayoutId() {
        return C0906R.layout.al2;
    }

    @NotNull
    public final Room a() {
        if (PatchProxy.isSupport(new Object[0], this, f12724a, false, 7364, new Class[0], Room.class)) {
            return (Room) PatchProxy.accessDispatch(new Object[0], this, f12724a, false, 7364, new Class[0], Room.class);
        }
        Room room = this.f12727c;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        return room;
    }

    public final void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12724a, false, 7369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12724a, false, 7369, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkExpressionValueIsNotNull(viewGroup, "containerView");
        viewGroup.setVisibility(8);
        this.dataCenter.removeObserver(this.f12729f);
    }

    public final void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12724a, false, 7367, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12724a, false, 7367, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.contentView.setOnClickListener(new c(this));
    }

    public final void onEvent(@NotNull com.bytedance.android.livesdk.browser.jsbridge.a.e eVar) {
        ObservableTransformer observableTransformer;
        com.bytedance.android.livesdk.browser.jsbridge.a.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f12724a, false, 7370, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f12724a, false, 7370, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "event");
        if (((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(eVar2.f9429a) != null) {
            PokemonViewModel pokemonViewModel = this.f12726b;
            if (pokemonViewModel != null) {
                Object obj = this.dataCenter.get("log_enter_live_source");
                Intrinsics.checkExpressionValueIsNotNull(obj, "dataCenter.get(WidgetCon…nt.LOG_ENTER_LIVE_SOURCE)");
                String str = (String) obj;
                long j = eVar2.f9429a;
                if (PatchProxy.isSupport(new Object[]{str, new Long(j), null, 1, "pokemon_task"}, pokemonViewModel, PokemonViewModel.f17721a, false, 13866, new Class[]{String.class, Long.TYPE, User.class, Integer.TYPE, String.class}, Void.TYPE)) {
                    PokemonViewModel pokemonViewModel2 = pokemonViewModel;
                    PatchProxy.accessDispatch(new Object[]{str, new Long(j), null, 1, "pokemon_task"}, pokemonViewModel2, PokemonViewModel.f17721a, false, 13866, new Class[]{String.class, Long.TYPE, User.class, Integer.TYPE, String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(str, "enterLiveSource");
                    if (((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(j) != null) {
                        long id = pokemonViewModel.f17723c.getId();
                        User owner = pokemonViewModel.f17723c.getOwner();
                        Intrinsics.checkExpressionValueIsNotNull(owner, "room.owner");
                        Observable compose = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).sendGift(j, id, owner.getId(), 1).compose(com.bytedance.android.live.core.rxutils.i.a());
                        RxViewModel rxViewModel = pokemonViewModel;
                        if (PatchProxy.isSupport(new Object[]{rxViewModel}, null, com.bytedance.android.live.core.rxutils.i.f8106a, true, 636, new Class[]{RxViewModel.class}, ObservableTransformer.class)) {
                            observableTransformer = (ObservableTransformer) PatchProxy.accessDispatch(new Object[]{rxViewModel}, null, com.bytedance.android.live.core.rxutils.i.f8106a, true, 636, new Class[]{RxViewModel.class}, ObservableTransformer.class);
                        } else {
                            observableTransformer = com.bytedance.android.live.core.rxutils.rxlifecycle.b.a((Observable<T>) rxViewModel.k).a(com.bytedance.android.live.core.rxutils.rxlifecycle.a.DESTROY);
                        }
                        pokemonViewModel.a(compose.compose(observableTransformer).subscribe(new PokemonViewModel.d(pokemonViewModel, "pokemon_task"), new PokemonViewModel.e(pokemonViewModel)));
                    }
                }
            }
        }
    }

    public final void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12724a, false, 7366, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12724a, false, 7366, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkExpressionValueIsNotNull(viewGroup, "containerView");
        viewGroup.setVisibility(8);
        com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.browser.jsbridge.a.e.class).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new d<Object>(this));
        Object obj = this.dataCenter.get("data_room");
        Intrinsics.checkExpressionValueIsNotNull(obj, "dataCenter.get(WidgetConstant.DATA_ROOM)");
        this.f12727c = (Room) obj;
        Object obj2 = this.dataCenter.get("data_is_anchor");
        Intrinsics.checkExpressionValueIsNotNull(obj2, "dataCenter.get(WidgetConstant.DATA_IS_ANCHOR)");
        this.f12728d = ((Boolean) obj2).booleanValue();
        Room room = this.f12727c;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        this.f12726b = new PokemonViewModel(room, this.g);
        long b2 = TTLiveSDKContext.getHostService().k().b();
        if (b2 > 0) {
            PokemonViewModel pokemonViewModel = this.f12726b;
            if (pokemonViewModel != null) {
                Room room2 = this.f12727c;
                if (room2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                }
                User owner = room2.getOwner();
                Intrinsics.checkExpressionValueIsNotNull(owner, "mRoom.owner");
                pokemonViewModel.a(owner.getId(), b2);
            }
        } else {
            PokemonViewModel pokemonViewModel2 = this.f12726b;
            if (pokemonViewModel2 != null) {
                Room room3 = this.f12727c;
                if (room3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                }
                User owner2 = room3.getOwner();
                Intrinsics.checkExpressionValueIsNotNull(owner2, "mRoom.owner");
                long id = owner2.getId();
                Room room4 = this.f12727c;
                if (room4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                }
                User owner3 = room4.getOwner();
                Intrinsics.checkExpressionValueIsNotNull(owner3, "mRoom.owner");
                pokemonViewModel2.a(id, owner3.getId());
            }
        }
        this.dataCenter.observe("data_link_state", this.f12729f);
    }
}
