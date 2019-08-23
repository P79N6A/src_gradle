package com.bytedance.android.livesdk.chatroom.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class cv implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12042a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12043b;

    cv(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f12043b = liveProfileDetailFragment;
    }

    public final boolean onLongClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12042a, false, 6121, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f12042a, false, 6121, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        LiveProfileDetailFragment liveProfileDetailFragment = this.f12043b;
        ((ClipboardManager) liveProfileDetailFragment.h.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("hotsoon_id", String.valueOf(liveProfileDetailFragment.r.displayId)));
        ai.a((int) C0906R.string.cr1);
        return true;
    }
}
