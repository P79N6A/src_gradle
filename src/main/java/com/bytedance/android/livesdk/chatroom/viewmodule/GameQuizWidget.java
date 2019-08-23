package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.graphics.Color;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.model.o;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.chatroom.widget.h;
import com.bytedance.android.livesdk.message.model.z;
import com.bytedance.android.livesdk.utils.ab;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Locale;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class GameQuizWidget extends LiveWidget implements WeakHandler.IHandler, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12518a = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f12519e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static int f12520f = -1;

    /* renamed from: b  reason: collision with root package name */
    long f12521b;

    /* renamed from: c  reason: collision with root package name */
    private h f12522c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12523d;
    private a g = new a(this, (byte) 0);

    public interface GameQuizApi {
        @GET("/live/gamb/_get")
        Observable<d<List<o>>> checkQuizState(@Query(a = "room_id") long j);
    }

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12524a;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12525d;

        /* renamed from: c  reason: collision with root package name */
        private View f12527c;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12524a, false, 6833, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12524a, false, 6833, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12524a, false, 6832, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12524a, false, 6832, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12524a, true, 6831, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12524a, true, 6831, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("GameQuizWidget.java", a.class);
            f12525d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.GameQuizWidget$ToolbarGameQuizBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 241);
        }

        public final int[] a() {
            if (PatchProxy.isSupport(new Object[0], this, f12524a, false, 6830, new Class[0], int[].class)) {
                return (int[]) PatchProxy.accessDispatch(new Object[0], this, f12524a, false, 6830, new Class[0], int[].class);
            }
            int[] iArr = {0, 0};
            if (this.f12527c == null) {
                return iArr;
            }
            this.f12527c.getLocationOnScreen(iArr);
            return iArr;
        }

        private a() {
        }

        public void onClick(View view) {
            int i;
            int i2;
            int i3;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f12524a, false, 6829, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f12524a, false, 6829, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f12525d, this, this, view2));
            GameQuizWidget gameQuizWidget = GameQuizWidget.this;
            if (PatchProxy.isSupport(new Object[0], gameQuizWidget, GameQuizWidget.f12518a, false, 6825, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], gameQuizWidget, GameQuizWidget.f12518a, false, 6825, new Class[0], Void.TYPE);
                return;
            }
            long id = ((Room) gameQuizWidget.dataCenter.get("data_room")).getOwner().getId();
            long b2 = TTLiveSDKContext.getHostService().k().b();
            String format = String.format(Locale.US, "https://hotsoon.snssdk.com/hotsoon/in_app/common_live/game_guess/?room_id=%s&anchor_id=%s&user_id=%s", new Object[]{Long.valueOf(gameQuizWidget.f12521b), Long.valueOf(id), Long.valueOf(b2)});
            FragmentActivity fragmentActivity = (FragmentActivity) gameQuizWidget.context;
            DisplayMetrics displayMetrics = gameQuizWidget.context.getResources().getDisplayMetrics();
            if (fragmentActivity.getRequestedOrientation() == 0) {
                i3 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
                i2 = i3;
                i = 8388613;
            } else {
                i3 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
                i2 = 400;
                i = 80;
            }
            BaseDialogFragment.a(fragmentActivity, (DialogFragment) j.q().f().a(c.a(format).a(i3).b(i2).e(i).a("button")));
        }

        /* synthetic */ a(GameQuizWidget gameQuizWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            this.f12527c = view;
        }
    }

    public void handleMsg(Message message) {
    }

    public GameQuizWidget() {
        if (f12519e == -1) {
            f12519e = Color.parseColor("#FF2200");
            f12520f = Color.parseColor("#404040");
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12518a, false, 6820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12518a, false, 6820, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f12523d && ab.a() != null) {
            ab.a().removeMessageListener(this);
        }
        if (PatchProxy.isSupport(new Object[0], this, f12518a, false, 6824, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12518a, false, 6824, new Class[0], Void.TYPE);
        } else if (this.f12522c != null && this.f12522c.isShowing()) {
            this.f12522c.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        SpannableString spannableString;
        if (PatchProxy.isSupport(new Object[0], this, f12518a, false, 6823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12518a, false, 6823, new Class[0], Void.TYPE);
            return;
        }
        if (this.f12523d) {
            spannableString = new SpannableString(ac.a((int) C0906R.string.d39));
            spannableString.setSpan(new ForegroundColorSpan(f12519e), 0, spannableString.length(), 33);
        } else {
            String nickName = ((Room) this.dataCenter.get("data_room")).getOwner().getNickName();
            if (TextUtils.isEmpty(nickName)) {
                nickName = ac.a((int) C0906R.string.cp5);
            }
            String a2 = ac.a((int) C0906R.string.d3_);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(f12519e);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(f12520f);
            SpannableString spannableString2 = new SpannableString(nickName + a2);
            spannableString2.setSpan(foregroundColorSpan, 0, nickName.length(), 33);
            spannableString2.setSpan(foregroundColorSpan2, nickName.length(), spannableString2.length(), 33);
            spannableString = spannableString2;
        }
        if (this.f12522c == null) {
            this.f12522c = new h(this.context, this.f12523d, spannableString, this.g.a());
        }
        if (!this.f12522c.isShowing()) {
            this.f12522c.show();
        } else {
            this.f12522c.a();
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12518a, false, 6819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12518a, false, 6819, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        WeakHandler weakHandler = new WeakHandler(this);
        this.f12523d = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12521b = ((Long) this.dataCenter.get("data_room_id")).longValue();
        if (this.f12523d) {
            if (!((Boolean) com.bytedance.android.livesdk.w.b.R.a()).booleanValue()) {
                weakHandler.postDelayed(new ad(this), 2000);
            }
        } else if (((Activity) this.context).getRequestedOrientation() == 1) {
            if (PatchProxy.isSupport(new Object[0], this, f12518a, false, 6822, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12518a, false, 6822, new Class[0], Void.TYPE);
            } else {
                ((GameQuizApi) j.q().d().a(GameQuizApi.class)).checkQuizState(this.f12521b).compose(getAutoUnbindTransformer()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ae(this), af.f12970b);
            }
            if (ab.a() != null) {
                ab.a().addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.GAME_QUIZ.getIntType(), this);
            }
        }
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().a(f.GAME_QUIZ, (d.a) this.g);
    }

    public void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f12518a, false, 6821, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f12518a, false, 6821, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        o oVar = ((z) iMessage).f16716c;
        if (oVar != null && oVar.f11146c == 1) {
            if (oVar.f11145b == this.f12521b) {
                a();
            }
        }
    }
}
