package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;

public final class InteractDialogPKTimeContract {

    public static abstract class View extends InteractDialogFragmentBaseContract.View<a> {
    }

    public static abstract class a extends InteractDialogFragmentBaseContract.a<View> {
        protected a(View view) {
            super(view);
        }
    }
}
