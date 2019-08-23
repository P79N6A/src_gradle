package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.livesdk.chatroom.interact.model.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class InteractDialogPKUserListContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
        public abstract void a(d dVar);

        public abstract void a(Room room);

        public abstract void a(Throwable th);

        public abstract void b(Throwable th);
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        public abstract void a(Room room, long j);

        public abstract void a(Room room, long j, String str, int i);

        public abstract void c();

        public a(View view) {
            super(view);
        }
    }
}
