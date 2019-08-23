package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

public class StickerTipWidget extends LiveRecyclableWidget implements Observer<KVData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12798a;

    /* renamed from: b  reason: collision with root package name */
    private Disposable f12799b;

    public int getLayoutId() {
        return C0906R.layout.aks;
    }

    public void onInit(Object... objArr) {
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12798a, false, 7474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12798a, false, 7474, new Class[0], Void.TYPE);
            return;
        }
        this.dataCenter.removeObserver(this);
        if (this.f12799b != null && !this.f12799b.isDisposed()) {
            this.f12799b.dispose();
        }
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12798a, false, 7473, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12798a, false, 7473, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.dataCenter.observe("cmd_sticker_tip", this);
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12798a, false, 7472, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12798a, false, 7472, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == 1351936788 && key.equals("cmd_sticker_tip")) {
                c2 = 0;
            }
            if (c2 == 0) {
                if (this.f12799b != null && !this.f12799b.isDisposed()) {
                    this.f12799b.dispose();
                }
                if (StringUtils.isEmpty((String) kVData.getData())) {
                    this.contentView.setVisibility(4);
                    return;
                }
                this.contentView.setVisibility(0);
                ((TextView) this.contentView).setText((CharSequence) kVData.getData());
                this.f12799b = Observable.timer(3, TimeUnit.SECONDS).compose(getAutoUnbindTransformer()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ek(this), el.f13227b);
            }
        }
    }
}
