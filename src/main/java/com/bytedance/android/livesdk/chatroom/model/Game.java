package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.bytedance.android.live.a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.m;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class Game {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("game_id")
    public long gameId;
    @SerializedName("icon")
    public ImageModel icon;
    @SerializedName("name")
    public String name;

    public String toJsonString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 5116, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 5116, new Class[0], String.class);
        } else if (m.c() != null) {
            return m.c().toJson((Object) this);
        } else {
            return a.a().toJson((Object) this);
        }
    }

    public static Game fromJson(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 5117, new Class[]{String.class}, Game.class)) {
            return (Game) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 5117, new Class[]{String.class}, Game.class);
        }
        try {
            if (m.c() != null) {
                return (Game) m.c().fromJson(str2, Game.class);
            }
            return (Game) a.a().fromJson(str2, Game.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }
}
