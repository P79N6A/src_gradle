package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;

public final class InteractDialogButtonContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
        public abstract void a(Throwable th);

        public abstract void b();
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        public abstract void a(long j);

        public a(View view) {
            super(view);
        }
    }
}
