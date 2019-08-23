package com.ss.android.ugc.aweme.shortvideo.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import org.greenrobot.eventbus.Subscribe;

public class PublishSyncItemView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3886a;

    /* renamed from: b  reason: collision with root package name */
    public VideoPublishSyncModel f3887b;

    /* renamed from: c  reason: collision with root package name */
    public a f3888c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3889d;
    @BindView(2131497430)
    AutoRTLImageView mIvIcon;
    @BindView(2131497431)
    TextView mTvName;

    interface a {
        void a(int i, boolean z);
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3886a, false, 74969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3886a, false, 74969, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        bg.c(this);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3886a, false, 74970, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3886a, false, 74970, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f3886a, false, 74964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3886a, false, 74964, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        ButterKnife.bind((View) this);
    }

    public PublishSyncItemView(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void setItemClick(a aVar) {
        this.f3888c = aVar;
    }

    @Subscribe
    public void onPublishSyncEvent(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3886a, false, 74968, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3886a, false, 74968, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar.f65498b == this.f3887b.mType && "action_bind_toutiao_success".equals(aVar.f65497a)) {
            d.a().queryUser();
            setSelected(!this.f3889d);
            if (this.f3888c != null) {
                this.f3888c.a(this.f3887b.mType, this.f3889d);
            }
        }
    }

    public void setSelected(boolean z) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3886a, false, 74967, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3886a, false, 74967, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSelected(z);
        this.f3889d = z;
        this.mTvName.setSelected(z);
        TextView textView = this.mTvName;
        if (z) {
            i = this.mTvName.getContext().getResources().getColor(C0906R.color.zo);
        } else {
            i = this.mTvName.getContext().getResources().getColor(C0906R.color.a6m);
        }
        textView.setTextColor(i);
        AutoRTLImageView autoRTLImageView = this.mIvIcon;
        if (z) {
            i2 = 255;
        } else {
            i2 = 77;
        }
        autoRTLImageView.setImageAlpha(i2);
    }

    public PublishSyncItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PublishSyncItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
