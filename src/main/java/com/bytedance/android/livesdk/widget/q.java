package com.bytedance.android.livesdk.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.model.ae;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18552a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveTagPicker f18553b;

    q(LiveTagPicker liveTagPicker) {
        this.f18553b = liveTagPicker;
    }

    public final void run() {
        int i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f18552a, false, 14509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18552a, false, 14509, new Class[0], Void.TYPE);
            return;
        }
        LiveTagPicker liveTagPicker = this.f18553b;
        if (liveTagPicker.f18267c.getChildCount() != liveTagPicker.g.size()) {
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
                i = (int) ((((float) liveTagPicker.f18267c.getWidth()) - UIUtils.dip2Px(liveTagPicker.getContext(), 24.0f)) / 4.0f);
            } else {
                i = (liveTagPicker.f18267c.getWidth() - ((int) UIUtils.dip2Px(liveTagPicker.getContext(), 45.0f))) / 4;
            }
            for (int i2 = 0; i2 < liveTagPicker.g.size(); i2++) {
                TextView textView = (TextView) LayoutInflater.from(liveTagPicker.getActivity()).inflate(((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1 ? C0906R.layout.ajt : C0906R.layout.ajs, liveTagPicker.f18267c, false);
                ae aeVar = liveTagPicker.g.get(i2);
                textView.setText(aeVar.f11092b);
                textView.setTag(Integer.valueOf(i2));
                textView.setOnClickListener(liveTagPicker);
                textView.setWidth(i);
                liveTagPicker.f18267c.addView(textView);
                liveTagPicker.f18269e.add(textView);
                if (liveTagPicker.f18270f == -1 && aeVar.f11091a == liveTagPicker.f18266b) {
                    liveTagPicker.f18270f = i2;
                    textView.setSelected(true);
                }
            }
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 0) {
                View view = liveTagPicker.f18268d;
                if (liveTagPicker.f18270f != -1) {
                    z = true;
                }
                view.setEnabled(z);
            }
        }
    }
}
