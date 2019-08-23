package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;

public final class InteractDialogPKTypeContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
        public abstract void a(int i);

        public abstract void a(boolean z);

        public abstract void a(boolean z, Throwable th);
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        public abstract void a(long j);

        public abstract void a(boolean z);

        public abstract void c();

        public a(View view) {
            super(view);
        }
    }
}
