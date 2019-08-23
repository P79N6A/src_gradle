package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class InteractDialogPKMatchContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
        public abstract void a(int i);

        public abstract void a(Room room);

        public abstract void a(String str);

        public abstract void a(Throwable th);
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        public abstract void a(int i);

        public abstract void a(long j);

        public abstract void a(Room room, long j, String str, int i);

        public abstract void c();

        public abstract void d();

        public abstract boolean e();

        public a(View view) {
            super(view);
        }
    }
}
