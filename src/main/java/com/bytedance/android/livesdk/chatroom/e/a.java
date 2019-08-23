package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import android.support.annotation.DrawableRes;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public abstract class a<T extends c> extends b<T> {
    public abstract ImageModel a();

    public void a(Context context, Room room) {
    }

    @DrawableRes
    public abstract int b();

    public ImageModel c() {
        return null;
    }

    public abstract boolean d();

    public User e() {
        return null;
    }

    public final boolean f() {
        return false;
    }

    public String g() {
        return "#ff4e33";
    }

    public ImageModel h() {
        return null;
    }

    public a(T t) {
        super(t, 1);
    }
}
