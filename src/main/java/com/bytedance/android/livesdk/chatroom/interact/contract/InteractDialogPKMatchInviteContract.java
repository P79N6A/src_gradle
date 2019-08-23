package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;

public final class InteractDialogPKMatchInviteContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
        public abstract void a(int i);
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        public abstract void a(int i);

        public abstract void a(int i, long j, long j2, long j3);

        public abstract void a(long j, long j2, long j3, long j4);

        public abstract void c();

        public a(View view) {
            super(view);
        }
    }
}
