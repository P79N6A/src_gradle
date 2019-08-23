package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.f;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.common.c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.d;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class en extends c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12171a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f12172b = en.class.getSimpleName();
    private static final /* synthetic */ a.C0900a m;

    /* renamed from: c  reason: collision with root package name */
    public TextView f12173c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12174d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12175e;

    /* renamed from: f  reason: collision with root package name */
    public DataCenter f12176f;
    private Room i;
    private User j;
    private Activity k;
    private String l;

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f12171a, false, 6345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12171a, false, 6345, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f12175e = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f12171a, false, 6346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12171a, false, 6346, new Class[0], Void.TYPE);
            return;
        }
        this.f12175e = false;
        super.onDetachedFromWindow();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12171a, true, 6347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12171a, true, 6347, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("RemindFollowDialog.java", en.class);
            m = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.RemindFollowDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 113);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12171a, false, 6342, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12171a, false, 6342, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.ah9);
        ImageView imageView = (ImageView) findViewById(C0906R.id.hk);
        TextView textView = (TextView) findViewById(C0906R.id.bpn);
        HSImageView hSImageView = (HSImageView) findViewById(C0906R.id.f1);
        if (((Integer) LiveSettingKeys.SHOW_ANCHOR_LEVEL.a()).intValue() != 1 || this.j.getAnchorLevel() == null || this.j.getAnchorLevel().m() == null) {
            hSImageView.setVisibility(8);
        } else {
            hSImageView.setVisibility(0);
            com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) hSImageView, this.j.getAnchorLevel().m());
        }
        TextView textView2 = (TextView) findViewById(C0906R.id.a3u);
        this.f12173c = (TextView) findViewById(C0906R.id.agq);
        this.f12173c.setOnClickListener(this);
        com.bytedance.android.livesdk.chatroom.f.b.a(imageView, this.j.getAvatarThumb(), 2130841468);
        if (com.bytedance.android.live.uikit.a.a.j()) {
            textView.setText(this.j.displayId);
        } else {
            textView.setText(this.j.getNickName());
        }
        textView2.setText(C0906R.string.cxk);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            UIUtils.updateLayout(this.f12173c, -1, -3);
            UIUtils.updateLayoutMargin(this.f12173c, (int) UIUtils.dip2Px(getContext(), 16.0f), -3, (int) UIUtils.dip2Px(getContext(), 16.0f), -3);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12171a, false, 6343, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12171a, false, 6343, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(m, this, this, view));
        if (view.getId() == C0906R.id.agq) {
            if (PatchProxy.isSupport(new Object[0], this, f12171a, false, 6344, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12171a, false, 6344, new Class[0], Void.TYPE);
            } else if (!TTLiveSDKContext.getHostService().k().c()) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "live_detail");
                bundle.putString("action_type", "follow");
                bundle.putString("source", "live");
                bundle.putString("v1_source", "follow");
                TTLiveSDKContext.getHostService().k().a(getContext(), i.a().a(f.a()).b(f.b()).d("live_detail").e("follow").c("live").a(-1).a()).subscribe((Observer<? super T>) new g<Object>());
            } else if (!this.f12174d) {
                if (j.b(this.f12176f)) {
                    ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "follow", j.c(this.f12176f));
                }
                TTLiveSDKContext.getHostService().k().a(((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((b.a) com.bytedance.android.livesdk.user.f.b().a(this.j.getId())).a(this.i.getRequestId())).b("live_detail")).c("live_follow_popup")).b(this.i.getId())).d(this.i.getLabels())).a(this.k)).e("live_detail")).f("follow")).c()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<com.bytedance.android.livesdkapi.depend.model.b.a>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12177a;

                    public final void onComplete() {
                    }

                    public final void onSubscribe(Disposable disposable) {
                    }

                    public final void onError(Throwable th) {
                        if (PatchProxy.isSupport(new Object[]{th}, this, f12177a, false, 6349, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f12177a, false, 6349, new Class[]{Throwable.class}, Void.TYPE);
                        } else if (en.this.f12175e) {
                            en.this.f12174d = false;
                            l.a(en.this.getContext(), th);
                        }
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        com.bytedance.android.livesdkapi.depend.model.b.a aVar = (com.bytedance.android.livesdkapi.depend.model.b.a) obj;
                        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12177a, false, 6348, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12177a, false, 6348, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
                            return;
                        }
                        if (en.this.f12175e) {
                            en.this.f12174d = false;
                            en.this.f12173c.setText(C0906R.string.cys);
                            en.this.dismiss();
                        }
                    }
                });
                this.f12174d = true;
                HashMap hashMap = new HashMap();
                hashMap.put("follow_notice_duration", String.valueOf((long) ((Integer) com.bytedance.android.livesdk.config.a.C.a()).intValue()));
                hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                com.bytedance.android.livesdk.j.a.a().a("follow", hashMap, new com.bytedance.android.livesdk.j.c.c("live_follow_popup", this.j.getId()), new com.bytedance.android.livesdk.j.c.j().b("live_interact").a("live_detail"), Room.class);
            }
        }
    }

    public en(Activity activity, boolean z, Room room, String str) {
        super(activity, z);
        this.k = activity;
        this.i = room;
        this.j = room.getOwner();
        this.l = str;
    }
}
