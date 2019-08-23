package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;

public final class InteractDialogPKSettingContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
        public abstract void a(int i);

        public abstract void a(int i, int i2);

        public abstract void a(Throwable th);

        public abstract void b();

        public abstract void b(Throwable th);

        public abstract void i();
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        public abstract void a(int i, int i2);

        public abstract void a(String str);

        public abstract void a(boolean z);

        public abstract void b(boolean z);

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public a(View view) {
            super(view);
        }
    }
}
