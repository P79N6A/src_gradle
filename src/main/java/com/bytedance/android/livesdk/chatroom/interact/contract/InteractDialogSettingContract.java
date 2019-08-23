package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;

public final class InteractDialogSettingContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
        public abstract void a(Throwable th);

        public abstract void b();

        public abstract void b(Throwable th);

        public abstract void i();
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        public abstract void a(boolean z);

        public abstract void b(boolean z);

        public a(View view) {
            super(view);
        }
    }
}
