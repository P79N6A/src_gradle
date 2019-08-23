package com.bytedance.android.livesdk.chatroom.interact.contract;

import android.arch.lifecycle.LifecycleOwner;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class b {

    public interface a {
        void a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.b$b  reason: collision with other inner class name */
    public interface C0088b {
        void a();

        void a(InteractDialogFragmentBaseContract.View view);

        View b();

        Room c();

        LifecycleOwner d();

        void dismiss();

        void setCancelable(boolean z);
    }
}
