package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.banner.a;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.chatroom.model.e;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J\u001f\u0010\u001a\u001a\u00020\u00132\u0010\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00132\u0010\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010\u001eJ\u0012\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/viewmodule/TopRightBannerWidget;", "Lcom/bytedance/ies/sdk/widgets/LiveRecyclableWidget;", "Lcom/ss/ugc/live/sdk/message/interfaces/OnMessageListener;", "()V", "isAnchor", "", "messageManager", "Lcom/ss/ugc/live/sdk/message/interfaces/IMessageManager;", "room", "Lcom/bytedance/android/livesdkapi/depend/model/live/Room;", "staticContainer", "Landroid/widget/LinearLayout;", "webView", "Landroid/webkit/WebView;", "webViewRecord", "Lcom/bytedance/android/livesdk/browser/factory/IWebViewManager$WebViewRecord;", "getLayoutId", "", "loadDynamicBanner", "", "url", "", "loadStaticBanners", "banners", "", "Lcom/bytedance/android/livesdk/chatroom/model/BannerInRoom;", "onInit", "args", "", "", "([Ljava/lang/Object;)V", "onLoad", "onMessage", "message", "Lcom/ss/ugc/live/sdk/message/data/IMessage;", "onUnload", "sendLog", "bannerId", "eventName", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class TopRightBannerWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12842a;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final a f12843e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    b.e f12844b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f12845c;

    /* renamed from: d  reason: collision with root package name */
    WebView f12846d;

    /* renamed from: f  reason: collision with root package name */
    private IMessageManager f12847f;
    private Room g;
    private boolean h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/viewmodule/TopRightBannerWidget$Companion;", "", "()V", "DYNAMIC_BANNER_SIZE_DP", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/android/livesdk/chatroom/viewmodule/TopRightBannerWidget$loadStaticBanners$1$1"}, k = 3, mv = {1, 1, 13})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f12849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TopRightBannerWidget f12850c;

        b(e eVar, TopRightBannerWidget topRightBannerWidget) {
            this.f12849b = eVar;
            this.f12850c = topRightBannerWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12848a, false, 7542, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12848a, false, 7542, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.chatroom.c.b.a(this.f12850c.context, this.f12849b);
            this.f12850c.a(String.valueOf(this.f12849b.f11108a), "live_banner_click");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "data", "Lcom/bytedance/android/livesdk/banner/InRoomBannerManager$Data;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class c<T> implements Consumer<a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TopRightBannerWidget f12852b;

        c(TopRightBannerWidget topRightBannerWidget) {
            this.f12852b = topRightBannerWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            boolean z;
            a.b bVar = (a.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f12851a, false, 7543, new Class[]{a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f12851a, false, 7543, new Class[]{a.b.class}, Void.TYPE);
                return;
            }
            f fVar = bVar.f9105c;
            f.a aVar = fVar.f11115b;
            List<e> list = null;
            if (aVar != null) {
                str = aVar.f11117a;
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TopRightBannerWidget topRightBannerWidget = this.f12852b;
                f.a aVar2 = fVar.f11115b;
                if (aVar2 != null) {
                    list = aVar2.f11118b;
                }
                if (PatchProxy.isSupport(new Object[]{list}, topRightBannerWidget, TopRightBannerWidget.f12842a, false, 7539, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list}, topRightBannerWidget, TopRightBannerWidget.f12842a, false, 7539, new Class[]{List.class}, Void.TYPE);
                } else if (list != null) {
                    LinearLayout linearLayout = topRightBannerWidget.f12845c;
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("staticContainer");
                    }
                    linearLayout.removeAllViews();
                    for (e eVar : list) {
                        LayoutInflater from = LayoutInflater.from(topRightBannerWidget.context);
                        LinearLayout linearLayout2 = topRightBannerWidget.f12845c;
                        if (linearLayout2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("staticContainer");
                        }
                        View inflate = from.inflate(C0906R.layout.akd, linearLayout2);
                        com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) inflate.findViewById(C0906R.id.aq8), eVar.f11110c);
                        inflate.setOnClickListener(new b(eVar, topRightBannerWidget));
                        topRightBannerWidget.a(String.valueOf(eVar.f11108a), "live_banner_show");
                    }
                }
            } else {
                TopRightBannerWidget topRightBannerWidget2 = this.f12852b;
                f.a aVar3 = fVar.f11115b;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "collection.topRightBanner");
                String str2 = aVar3.f11117a;
                Intrinsics.checkExpressionValueIsNotNull(str2, "collection.topRightBanner.url");
                if (PatchProxy.isSupport(new Object[]{str2}, topRightBannerWidget2, TopRightBannerWidget.f12842a, false, 7540, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, topRightBannerWidget2, TopRightBannerWidget.f12842a, false, 7540, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.browser.c.b f2 = j.q().f();
                Context context = topRightBannerWidget2.context;
                if (context != null) {
                    b.e a2 = f2.a((Activity) context, (b.d) null);
                    RoundRectWebView roundRectWebView = a2.f9317b;
                    Intrinsics.checkExpressionValueIsNotNull(roundRectWebView, "webView");
                    topRightBannerWidget2.f12846d = roundRectWebView;
                    topRightBannerWidget2.f12844b = a2;
                    if (Build.VERSION.SDK_INT <= 19) {
                        WebView webView = topRightBannerWidget2.f12846d;
                        if (webView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webView");
                        }
                        webView.setLayerType(1, null);
                    }
                    WebView webView2 = topRightBannerWidget2.f12846d;
                    if (webView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                    }
                    webView2.setBackgroundColor(0);
                    WebView webView3 = topRightBannerWidget2.f12846d;
                    if (webView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                    }
                    webView3.setLayoutParams(new FrameLayout.LayoutParams(ac.a(64.0f), ac.a(64.0f)));
                    ViewGroup viewGroup = topRightBannerWidget2.containerView;
                    WebView webView4 = topRightBannerWidget2.f12846d;
                    if (webView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                    }
                    viewGroup.addView(webView4);
                    j.q().f().a(topRightBannerWidget2.f12844b, str2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    public final int getLayoutId() {
        return C0906R.layout.aox;
    }

    public final void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12842a, false, 7537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12842a, false, 7537, new Class[0], Void.TYPE);
            return;
        }
        IMessageManager iMessageManager = this.f12847f;
        if (iMessageManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        }
        iMessageManager.removeMessageListener(this);
        ViewGroup viewGroup = this.containerView;
        WebView webView = this.f12846d;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        viewGroup.removeView(webView);
        j.q().f().a(this.f12844b);
    }

    public final void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12842a, false, 7535, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12842a, false, 7535, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        View findViewById = this.contentView.findViewById(C0906R.id.cux);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById(R.id.static_container)");
        this.f12845c = (LinearLayout) findViewById;
    }

    public final void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12842a, false, 7536, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12842a, false, 7536, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        Object obj = this.dataCenter.get("data_room", new Room());
        Intrinsics.checkExpressionValueIsNotNull(obj, "dataCenter.get(WidgetConstant.DATA_ROOM, Room())");
        this.g = (Room) obj;
        Object obj2 = this.dataCenter.get("data_is_anchor", Boolean.FALSE);
        Intrinsics.checkExpressionValueIsNotNull(obj2, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.h = ((Boolean) obj2).booleanValue();
        Object obj3 = this.dataCenter.get("data_message_manager");
        Intrinsics.checkExpressionValueIsNotNull(obj3, "dataCenter.get(WidgetCon…ant.DATA_MESSAGE_MANAGER)");
        this.f12847f = (IMessageManager) obj3;
        IMessageManager iMessageManager = this.f12847f;
        if (iMessageManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        }
        iMessageManager.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        Long l = null;
        com.bytedance.android.livesdk.banner.a aVar = (com.bytedance.android.livesdk.banner.a) this.dataCenter.get("data_in_room_banner_manager", null);
        if (aVar != null) {
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            Observable<a.b> a2 = aVar.a(l);
            if (a2 != null) {
                ab abVar = (ab) a2.as(autoDispose());
                if (abVar != null) {
                    abVar.a((Consumer<? super T>) new c<Object>(this));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(@org.jetbrains.annotations.Nullable com.ss.ugc.live.sdk.message.data.IMessage r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f12842a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.ugc.live.sdk.message.data.IMessage> r1 = com.ss.ugc.live.sdk.message.data.IMessage.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 7538(0x1d72, float:1.0563E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f12842a
            r3 = 0
            r4 = 7538(0x1d72, float:1.0563E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.ugc.live.sdk.message.data.IMessage> r1 = com.ss.ugc.live.sdk.message.data.IMessage.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            boolean r0 = r10 instanceof com.bytedance.android.livesdk.message.model.ae
            if (r0 == 0) goto L_0x0133
            r0 = r10
            com.bytedance.android.livesdk.message.model.ae r0 = (com.bytedance.android.livesdk.message.model.ae) r0
            int r1 = r0.f16443c
            r2 = 2
            if (r1 != r2) goto L_0x0133
            com.bytedance.android.livesdk.v.f r1 = com.bytedance.android.livesdk.v.j.q()
            com.google.gson.Gson r1 = r1.c()
            com.google.gson.JsonObject r0 = r0.f16442b
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            java.lang.String r0 = r1.toJson((com.google.gson.JsonElement) r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "type"
            java.lang.String r3 = "refresh"
            r1.put(r2, r3)
            java.lang.String r2 = "data"
            r1.put(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.android.livesdk.j.a r2 = com.bytedance.android.livesdk.j.a.a()
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r3 = com.bytedance.android.livesdk.j.c.j.class
            com.bytedance.android.livesdk.j.b.g r2 = r2.a((java.lang.Class) r3)
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            boolean r5 = r2 instanceof com.bytedance.android.livesdk.j.b.k
            if (r5 == 0) goto L_0x00b6
            com.bytedance.android.livesdk.j.b.k r2 = (com.bytedance.android.livesdk.j.b.k) r2
            java.util.Map r3 = r2.a()
            java.lang.String r4 = "enter_from"
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x008b
            java.util.Map r3 = r2.a()
            java.lang.String r4 = "enter_from"
            r3.get(r4)
        L_0x008b:
            java.util.Map r3 = r2.a()
            java.lang.String r4 = "source"
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x00a0
            java.util.Map r2 = r2.a()
            java.lang.String r3 = "source"
            r2.get(r3)
        L_0x00a0:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "enter_from_merge"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "enter_method"
            java.lang.Object r2 = r2.get(r4)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        L_0x00b6:
            java.lang.String r2 = "enter_from_merge"
            org.json.JSONObject r2 = r0.put(r2, r3)
            java.lang.String r3 = "enter_method"
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "event_page"
            boolean r4 = r9.h
            if (r4 == 0) goto L_0x00cb
            java.lang.String r4 = "live_take_detail"
            goto L_0x00cd
        L_0x00cb:
            java.lang.String r4 = "live_detail"
        L_0x00cd:
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.g
            if (r4 != 0) goto L_0x00dc
            java.lang.String r5 = "room"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x00dc:
            long r4 = r4.getId()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.g
            if (r4 != 0) goto L_0x00f3
            java.lang.String r5 = "room"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x00f3:
            long r4 = r4.getOwnerUserId()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "request_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.g
            if (r4 != 0) goto L_0x010a
            java.lang.String r5 = "room"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x010a:
            java.lang.String r4 = r4.getRequestId()
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "log_pb"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.g
            if (r4 != 0) goto L_0x011d
            java.lang.String r5 = "room"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x011d:
            java.lang.String r4 = r4.getLog_pb()
            r2.put(r3, r4)
            java.lang.String r2 = "log"
            r1.put(r2, r0)
            com.bytedance.android.livesdk.browser.c.b$e r0 = r9.f12844b
            if (r0 == 0) goto L_0x0133
            java.lang.String r2 = "H5_roomStatusChange"
            r0.a(r2, r1)
            return
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void a(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5}, this, f12842a, false, 7541, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5}, this, f12842a, false, 7541, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Map hashMap = new HashMap();
        hashMap.put("banner_id", str4);
        hashMap.put("request_page", "topright");
        com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
        Object[] objArr = new Object[3];
        objArr[0] = Room.class;
        com.bytedance.android.livesdk.j.c.j b2 = new com.bytedance.android.livesdk.j.c.j().b("live_function");
        if (this.h) {
            str3 = "live_take_detail";
        } else {
            str3 = "live_detail";
        }
        objArr[1] = b2.a(str3);
        objArr[2] = new k();
        a2.a(str5, hashMap, objArr);
    }
}
