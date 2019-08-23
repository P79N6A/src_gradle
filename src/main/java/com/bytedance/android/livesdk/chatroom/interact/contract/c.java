package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.common.d;
import com.bytedance.android.livesdk.common.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class c {

    public static abstract class a extends d<b> {
        public abstract User a();

        public abstract void a(int i);

        public abstract void a(long j);

        public abstract void a(j jVar);

        public abstract Room b();

        public abstract long c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract j g();
    }

    public interface b extends e {
        void a(int i, boolean z);

        void a(long j);

        void a(User user);

        void a(boolean z);

        void b(boolean z);

        void setVisibility(boolean z);
    }
}
