package com.bytedance.android.live.f;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.ies.sdk.widgets.DataCenter;

public interface b extends com.bytedance.android.live.base.b {
    int isFirstConsume(i iVar);

    void openWallet(Activity activity);

    void showRechargeDialogInH5(@NonNull FragmentActivity fragmentActivity, boolean z, String str, DataCenter dataCenter, c cVar);

    a walletCenter();
}
