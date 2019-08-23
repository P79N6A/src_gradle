package com.bytedance.android.livesdk.module;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.Spannable;
import com.bytedance.android.live.room.a.a;
import com.bytedance.android.live.room.c;
import com.bytedance.android.live.room.d;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.e.y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j;
import com.bytedance.android.livesdk.utils.ab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

@Keep
public class RoomService implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a sCrossRoomGift;

    public RoomService() {
        b.a(c.class, this);
    }

    public com.bytedance.android.live.room.a messageManagerHelper() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12506, new Class[0], com.bytedance.android.live.room.a.class)) {
            return new com.bytedance.android.live.room.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16721a;

                public final IMessageManager a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f16721a, false, 12515, new Class[0], IMessageManager.class)) {
                        return ab.a();
                    }
                    return (IMessageManager) PatchProxy.accessDispatch(new Object[0], this, f16721a, false, 12515, new Class[0], IMessageManager.class);
                }
            };
        }
        return (com.bytedance.android.live.room.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12506, new Class[0], com.bytedance.android.live.room.a.class);
    }

    public com.bytedance.android.live.room.b room() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12507, new Class[0], com.bytedance.android.live.room.b.class)) {
            return new com.bytedance.android.live.room.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16723a;

                @Nullable
                public final Room a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f16723a, false, 12518, new Class[0], Room.class)) {
                        return TTLiveSDKContext.getLiveService().d().a();
                    }
                    return (Room) PatchProxy.accessDispatch(new Object[0], this, f16723a, false, 12518, new Class[0], Room.class);
                }
            };
        }
        return (com.bytedance.android.live.room.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12507, new Class[0], com.bytedance.android.live.room.b.class);
    }

    public d toolbarManagerHelper() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12505, new Class[0], d.class)) {
            return new d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16719a;

                public final com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f16719a, false, 12510, new Class[0], com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d.class)) {
                        return j.a();
                    }
                    return (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d) PatchProxy.accessDispatch(new Object[0], this, f16719a, false, 12510, new Class[0], com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d.class);
                }

                public final com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d b() {
                    if (!PatchProxy.isSupport(new Object[0], this, f16719a, false, 12512, new Class[0], com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d.class)) {
                        return j.c();
                    }
                    return (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d) PatchProxy.accessDispatch(new Object[0], this, f16719a, false, 12512, new Class[0], com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d.class);
                }
            };
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12505, new Class[0], d.class);
    }

    public a getCrossRoomGift() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12504, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12504, new Class[0], a.class);
        } else if (this.sCrossRoomGift == null) {
            return null;
        } else {
            a aVar2 = this.sCrossRoomGift;
            if (PatchProxy.isSupport(new Object[0], aVar2, a.f8457a, false, 1744, new Class[0], a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[0], aVar2, a.f8457a, false, 1744, new Class[0], a.class);
            } else {
                aVar = new a(aVar2.f8458b, aVar2.f8459c, aVar2.f8460d);
                aVar.f8461e = aVar2.f8461e;
            }
            this.sCrossRoomGift = null;
            return aVar;
        }
    }

    public a setCrossRoomGift(a aVar) {
        this.sCrossRoomGift = aVar;
        return aVar;
    }

    public Spannable parsePatternAndGetSpannable(e eVar, String str) {
        if (!PatchProxy.isSupport(new Object[]{eVar, str}, this, changeQuickRedirect, false, 12509, new Class[]{e.class, String.class}, Spannable.class)) {
            return y.a(eVar, str);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[]{eVar, str}, this, changeQuickRedirect, false, 12509, new Class[]{e.class, String.class}, Spannable.class);
    }

    public Spannable parsePatternAndGetSpannable(String str, e eVar) {
        if (!PatchProxy.isSupport(new Object[]{str, eVar}, this, changeQuickRedirect, false, 12508, new Class[]{String.class, e.class}, Spannable.class)) {
            return y.a(str, eVar);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[]{str, eVar}, this, changeQuickRedirect, false, 12508, new Class[]{String.class, e.class}, Spannable.class);
    }
}
