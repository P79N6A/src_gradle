package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.android.ClipboardCompat;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001f\u0010\r\u001a\u00020\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0012J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/viewmodule/PrivateDebugInfoWidget;", "Lcom/bytedance/ies/sdk/widgets/LiveRecyclableWidget;", "()V", "buttonView", "Landroid/widget/TextView;", "remoteInfoView", "room", "Lcom/bytedance/android/livesdkapi/depend/model/live/Room;", "streamInfoText", "", "streamInfoView", "getLayoutId", "", "onInit", "", "args", "", "", "([Ljava/lang/Object;)V", "onLoad", "onUnload", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class PrivateDebugInfoWidget extends LiveRecyclableWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12743a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f12744b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f12745c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f12746d;

    /* renamed from: e  reason: collision with root package name */
    public Room f12747e;

    /* renamed from: f  reason: collision with root package name */
    public String f12748f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PrivateDebugInfoWidget f12750b;

        a(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f12750b = privateDebugInfoWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12749a, false, 7390, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12749a, false, 7390, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Room room = this.f12750b.f12747e;
            if (room == null) {
                Intrinsics.throwUninitializedPropertyAccessException("room");
            }
            final String privateInfo = room.getPrivateInfo();
            new m.a(this.f12750b.context, 1).c((CharSequence) privateInfo).a(2, (CharSequence) "Copy", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12751a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f12752b;

                {
                    this.f12752b = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12751a, false, 7391, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12751a, false, 7391, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    ClipboardCompat.setText(this.f12752b.f12750b.context, "", privateInfo);
                }
            }).a(3, (CharSequence) "Send", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12754a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f12755b;

                {
                    this.f12755b = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12754a, false, 7392, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12754a, false, 7392, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        StringBuilder sb = new StringBuilder();
                        sb.append(privateInfo);
                        sb.append(10);
                        String str = this.f12755b.f12750b.f12748f;
                        if (str == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("streamInfoText");
                        }
                        sb.append(str);
                        intent.putExtra("android.intent.extra.TEXT", sb.toString());
                        intent.setType("text/plain");
                        this.f12755b.f12750b.context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }).a().show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12757a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PrivateDebugInfoWidget f12758b;

        b(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f12758b = privateDebugInfoWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12757a, false, 7393, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12757a, false, 7393, new Class[]{View.class}, Void.TYPE);
            } else if (PrivateDebugInfoWidget.a(this.f12758b).getVisibility() == 0) {
                PrivateDebugInfoWidget.a(this.f12758b).setVisibility(8);
                PrivateDebugInfoWidget.b(this.f12758b).setVisibility(8);
                PrivateDebugInfoWidget.c(this.f12758b).setText(C0906R.string.dhp);
            } else {
                PrivateDebugInfoWidget.a(this.f12758b).setVisibility(0);
                PrivateDebugInfoWidget.b(this.f12758b).setVisibility(0);
                PrivateDebugInfoWidget.c(this.f12758b).setText(C0906R.string.dho);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Long;)Ljava/lang/String;"}, k = 3, mv = {1, 1, 13})
    static final class c<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12759a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f12760b = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            if (PatchProxy.isSupport(new Object[]{l}, this, f12759a, false, 7394, new Class[]{Long.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{l}, this, f12759a, false, 7394, new Class[]{Long.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(l, AdvanceSetting.NETWORK_TYPE);
            com.bytedance.android.livesdk.player.a a2 = j.q().a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "LiveInternalService.inst().livePlayController()");
            JSONObject d2 = a2.d();
            return "推流SDK版本:" + d2.optString("推流SDK版本:") + "\n推流设备机型:" + d2.optString("推流设备机型:") + "\n推流系统版本号:" + d2.optString("推流系统版本号:") + "\n宽:" + d2.optString("width:") + " 高:" + d2.optString("height:") + "\n推流码率:" + d2.optString("推流码率:") + "\n推流帧频:" + d2.optString("推流帧频:") + "\n渲染帧频:" + d2.optString("渲染帧频:") + "\n下载码率:" + d2.optString("下载码率:") + "\n卡顿次数:" + d2.optString("卡顿次数:") + "\n卡顿时长:" + d2.optString("卡顿时长:") + "\n卡顿原因:" + d2.optString("卡顿原因:");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "text", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class d<T> implements Consumer<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12761a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PrivateDebugInfoWidget f12762b;

        d(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f12762b = privateDebugInfoWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            if (PatchProxy.isSupport(new Object[]{str}, this, f12761a, false, 7395, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f12761a, false, 7395, new Class[]{String.class}, Void.TYPE);
                return;
            }
            PrivateDebugInfoWidget.b(this.f12762b).setText(str);
        }
    }

    public final int getLayoutId() {
        return C0906R.layout.aov;
    }

    public final void onUnload() {
    }

    @NotNull
    public static final /* synthetic */ TextView a(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f12745c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("remoteInfoView");
        }
        return textView;
    }

    @NotNull
    public static final /* synthetic */ TextView b(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f12746d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("streamInfoView");
        }
        return textView;
    }

    @NotNull
    public static final /* synthetic */ TextView c(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f12744b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonView");
        }
        return textView;
    }

    public final void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12743a, false, 7388, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12743a, false, 7388, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12748f = "";
        View findViewById = this.contentView.findViewById(C0906R.id.cda);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById(R.id.remote_info)");
        this.f12745c = (TextView) findViewById;
        View findViewById2 = this.contentView.findViewById(C0906R.id.cw9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.findViewById(R.id.stream_info)");
        this.f12746d = (TextView) findViewById2;
        View findViewById3 = this.contentView.findViewById(C0906R.id.ph);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById(R.id.button)");
        this.f12744b = (TextView) findViewById3;
        TextView textView = this.f12745c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("remoteInfoView");
        }
        textView.setOnClickListener(new a(this));
        this.contentView.findViewById(C0906R.id.ph).setOnClickListener(new b(this));
    }

    public final void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12743a, false, 7389, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12743a, false, 7389, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        Object obj = this.dataCenter.get("data_room", new Room());
        Intrinsics.checkExpressionValueIsNotNull(obj, "dataCenter.get(WidgetConstant.DATA_ROOM, Room())");
        this.f12747e = (Room) obj;
        TextView textView = this.f12745c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("remoteInfoView");
        }
        Room room = this.f12747e;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("room");
        }
        textView.setText(room.getPrivateInfo());
        ((ab) com.bytedance.android.livesdk.utils.b.b.a(0, 3, TimeUnit.SECONDS).take(Long.MAX_VALUE).observeOn(Schedulers.io()).map(c.f12760b).observeOn(AndroidSchedulers.mainThread()).as(autoDispose())).a((Consumer<? super T>) new d<Object>(this));
    }
}
