package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.chatroom.viewmodule.a.b;
import com.bytedance.android.livesdk.chatroom.viewmodule.a.c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13323a;

    public static final class a implements h.b<c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13324a;

        @NonNull
        public final h.b.a<c> a(h.b.a<c> aVar) {
            h.b.a<c> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f13324a, false, 7722, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new h((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f13324a, false, 7722, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private h() {
    }

    /* synthetic */ h(byte b2) {
        this();
    }

    public final void a(DataCenter dataCenter, Context context) {
        DataCenter dataCenter2 = dataCenter;
        Context context2 = context;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{dataCenter2, context2}, this, f13323a, false, 7721, new Class[]{DataCenter.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter2, context2}, this, f13323a, false, 7721, new Class[]{DataCenter.class, Context.class}, Void.TYPE);
            return;
        }
        d a2 = j.a();
        a2.a(f.MORE, (d.a) new c(context2));
        a2.a(f.CLOSE_ROOM, (d.a) new com.bytedance.android.livesdk.chatroom.viewmodule.a.a());
        a2.a(f.COMMERCE, (d.a) new g());
        d b2 = j.b();
        b2.a(f.MANAGE, (d.a) new b());
        Room room = (Room) dataCenter2.get("data_room");
        com.bytedance.android.live.base.model.c.a a3 = j.a(dataCenter);
        if ((room != null && room.isDouPlusPromotion) || a3.hasDouPlusEntry) {
            z = true;
        }
        if (z) {
            a3.hasDouPlusEntry = true;
            j.a(a3, room, dataCenter2);
            b2.a(f.DOU_PLUS_PROMOTE, (d.a) new com.bytedance.android.livesdk.c.a.a(room.author().getSecUid(), dataCenter2));
        }
    }

    public final void b(DataCenter dataCenter, List<f> list) {
        DataCenter dataCenter2 = dataCenter;
        List<f> list2 = list;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{dataCenter2, list2}, this, f13323a, false, 7720, new Class[]{DataCenter.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter2, list2}, this, f13323a, false, 7720, new Class[]{DataCenter.class, List.class}, Void.TYPE);
            return;
        }
        list.clear();
        com.bytedance.android.livesdkapi.depend.model.live.a aVar = (com.bytedance.android.livesdkapi.depend.model.live.a) dataCenter2.get("data_live_mode");
        Room room = (Room) dataCenter2.get("data_room");
        if (aVar != com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
            if (aVar.isUsingCamera) {
                list2.add(f.BEAUTY);
                list2.add(f.FILTER);
                list2.add(f.STICKER);
            }
            list2.add(f.DECORATION);
            if (aVar.isUsingCamera) {
                list2.add(f.REVERSE_CAMERA);
                list2.add(f.REVERSE_MIRROR);
            }
            list2.add(f.MANAGE);
            list2.add(f.SHARE);
            if (aVar == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY) {
                list2.add(f.PUSH_URL);
            }
            if (aVar == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                list2.add(f.MESSAGE_PUSH);
            }
        }
        if (room.isDouPlusPromotion || j.a(dataCenter).hasDouPlusEntry) {
            z = true;
        }
        if (z) {
            list2.add(f.DOU_PLUS_PROMOTE);
        }
    }

    public final void a(DataCenter dataCenter, List<f> list) {
        DataCenter dataCenter2 = dataCenter;
        List<f> list2 = list;
        if (PatchProxy.isSupport(new Object[]{dataCenter2, list2}, this, f13323a, false, 7719, new Class[]{DataCenter.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter2, list2}, this, f13323a, false, 7719, new Class[]{DataCenter.class, List.class}, Void.TYPE);
            return;
        }
        list.clear();
        boolean booleanValue = ((Boolean) dataCenter2.get("data_is_anchor")).booleanValue();
        boolean booleanValue2 = ((Boolean) dataCenter2.get("data_is_portrait")).booleanValue();
        com.bytedance.android.livesdkapi.depend.model.live.a aVar = (com.bytedance.android.livesdkapi.depend.model.live.a) dataCenter2.get("data_live_mode");
        Room room = (Room) dataCenter2.get("data_room");
        if (booleanValue) {
            if (!booleanValue2) {
                list2.add(f.BARRAGE);
            }
            if (booleanValue2) {
                list2.add(f.RED_ENVELOPE);
                list2.add(f.COMMERCE);
            }
            if (aVar == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO || aVar == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                list2.add(f.PK);
                list2.add(f.INTERACTION);
                list2.add(f.AUDIO_TOGGLE);
            }
            if (aVar == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                list2.add(f.RADIO_COVER);
            }
            if ((room.isScreenshot || room.isThirdParty) && ((Boolean) LiveSettingKeys.LIVE_SHOW_GAME_QUIZ.a()).booleanValue()) {
                list2.add(f.GAME_QUIZ);
            }
            if (aVar != com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                list2.add(f.MORE);
            }
            if (aVar == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                list2.add(f.SHARE);
            }
            list2.add(f.GIFT);
            return;
        }
        if (!booleanValue2 && !com.bytedance.android.live.uikit.a.a.a()) {
            list2.add(f.SWITCH_VIDEO_QUALITY);
        }
        if (booleanValue2) {
            list2.add(f.COMMERCE);
            if (aVar == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO || aVar == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                list2.add(f.AUDIO_TOGGLE);
            }
        } else if (com.bytedance.android.live.uikit.a.a.a()) {
            list2.add(f.BARRAGE);
            list2.add(f.GIFT_ANIMATION);
            list2.add(f.SWITCH_SCREEN_ORIENTATION);
        } else {
            list2.add(f.BARRAGE);
            list2.add(f.SWITCH_SCREEN_ORIENTATION);
            list2.add(f.GIFT_ANIMATION);
        }
        list2.add(f.SHARE);
        if (booleanValue2 && ((Boolean) LiveSettingKeys.LIVE_PACKAKGE_PURCHASE.a()).booleanValue()) {
            list2.add(f.PACKAGE_PURCHASE);
        }
        if ((room.isScreenshot || room.isThirdParty) && ((Boolean) LiveSettingKeys.LIVE_SHOW_GAME_QUIZ.a()).booleanValue()) {
            list2.add(f.GAME_QUIZ);
        }
        if (((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getFastGift() != null) {
            list2.add(f.FAST_GIFT);
        }
        list2.add(f.GIFT);
    }
}
