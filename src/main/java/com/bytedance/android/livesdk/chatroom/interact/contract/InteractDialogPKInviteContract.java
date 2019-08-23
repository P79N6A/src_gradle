package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;

public final class InteractDialogPKInviteContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
        public abstract void a(int i);

        public abstract void a(boolean z);
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        public abstract void a(int i);

        public abstract void a(int i, long j, long j2, User user);

        public abstract void a(long j, long j2, long j3, long j4);

        public abstract void c();

        public abstract void d();

        public a(View view) {
            super(view);
        }
    }
}
