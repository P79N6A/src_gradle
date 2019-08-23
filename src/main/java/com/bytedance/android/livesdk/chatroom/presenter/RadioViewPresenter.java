package com.bytedance.android.livesdk.chatroom.presenter;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.af;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.message.model.ba;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Single;
import java.io.File;

public final class RadioViewPresenter extends bx<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11191a;

    /* renamed from: b  reason: collision with root package name */
    Context f11192b;

    /* renamed from: c  reason: collision with root package name */
    private Observer<KVData> f11193c = new bo(this);

    interface UploadCoverApi {
        @POST("/webcast/room/upload/image_with_risk/")
        Single<d<Object>> upload(@Body TypedOutput typedOutput, @Query(a = "room_id") long j, @Query(a = "user_id") long j2);
    }

    public interface a extends al {
        void a(String str);

        Room b();

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11191a, false, 5301, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11191a, false, 5301, new Class[0], Void.TYPE);
            return;
        }
        this.x.removeObserver(this.f11193c);
        super.d();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11191a, false, 5305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11191a, false, 5305, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(((a) b()).b().getOwner().getBackgroundImgUrl())) {
            ((a) b()).c();
        } else {
            ((a) b()).d();
        }
        com.bytedance.android.livesdk.j.a.a().a("background_pic_select", new j().a("live_take_detail").b("live_take"), Room.class);
    }

    public RadioViewPresenter(Context context) {
        this.f11192b = context;
    }

    public final void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f11191a, false, 5302, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f11191a, false, 5302, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (iMessage2 instanceof ba) {
            ba baVar = (ba) iMessage2;
            switch ((int) baVar.f16538b) {
                case 1:
                    ((a) b()).a(baVar.f16539c);
                    return;
                case 2:
                    ((a) b()).g();
                    break;
            }
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11191a, false, 5300, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11191a, false, 5300, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ROOM_IMG_MESSAGE.getIntType(), this);
        this.x.observeForever("cmd_change_radio_cover", this.f11193c);
    }

    public final void a(String str) {
        long j;
        if (PatchProxy.isSupport(new Object[]{str}, this, f11191a, false, 5299, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11191a, false, 5299, new Class[]{String.class}, Void.TYPE);
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            com.bytedance.retrofit2.mime.d dVar = new com.bytedance.retrofit2.mime.d();
            dVar.a("file", new e("image/jpeg", file));
            long longValue = ((Long) this.x.get("data_room_id")).longValue();
            User user = (User) this.x.get("data_user_in_room");
            UploadCoverApi uploadCoverApi = (UploadCoverApi) com.bytedance.android.livesdk.v.j.q().d().a(UploadCoverApi.class);
            if (user != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            ((af) uploadCoverApi.upload(dVar, longValue, j).as(p())).a(new br(this), new bs(this));
        }
    }
}
