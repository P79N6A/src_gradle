package com.ss.android.ugc.aweme.festival.christmas.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.eh;

public class FeedStickerTagView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47281a;
    @BindView(2131497913)
    TextView mFestivalName;
    @BindView(2131495137)
    ImageView mIvRightArrow;
    @BindView(2131496160)
    View mPlaceHolderView;
    @BindView(2131498169)
    TextView mStickerName;

    public FeedStickerTagView(@NonNull Context context) {
        this(context, null);
    }

    public void setStickerName(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f47281a, false, 43945, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f47281a, false, 43945, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            String a2 = eh.a(this.mStickerName.getPaint(), 200.0f, str);
            this.mStickerName.setText(a2);
            if (AbTestManager.a().cl()) {
                this.mIvRightArrow.setVisibility(0);
                this.mPlaceHolderView.setVisibility(8);
                eh.a(this.mIvRightArrow, a2.endsWith("…"));
                return;
            }
            this.mIvRightArrow.setVisibility(8);
            this.mPlaceHolderView.setVisibility(0);
        }
    }

    public FeedStickerTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f47281a, false, 43946, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f47281a, false, 43946, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (z) {
            this.mFestivalName.setVisibility(8);
        }
        if (TextUtils.isEmpty(str)) {
            this.mFestivalName.setVisibility(8);
            return;
        }
        this.mFestivalName.setVisibility(0);
        this.mFestivalName.setText(str);
    }

    public FeedStickerTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context}, this, f47281a, false, 43944, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f47281a, false, 43944, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.aqv, null);
        ButterKnife.bind((Object) this, inflate);
        addView(inflate);
    }
}
