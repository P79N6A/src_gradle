package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.gift.effect.entry.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class UserEnterRankView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14865a;

    /* renamed from: b  reason: collision with root package name */
    private View f14866b;

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f14865a, false, 9501, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14865a, false, 9501, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        Context context = getContext();
        this.f14866b = new View(context);
        int a2 = ac.a(16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 16;
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ac.a(30.0f), ac.a(14.0f));
        layoutParams.gravity = 16;
        imageView.setImageResource(2130841348);
        if (c.a(context)) {
            addView(imageView, 0, layoutParams2);
            addView(this.f14866b, layoutParams);
            return;
        }
        addView(this.f14866b, 0, layoutParams);
        addView(imageView, layoutParams2);
    }

    public UserEnterRankView(@NonNull Context context) {
        super(context);
    }

    public void setupUI(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14865a, false, 9502, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14865a, false, 9502, new Class[]{a.class}, Void.TYPE);
            return;
        }
        TextView textView = (TextView) findViewById(C0906R.id.da0);
        if (aVar.k != 0) {
            if (aVar.k == 1) {
                this.f14866b.setBackgroundResource(2130841422);
                textView.setText(C0906R.string.d15);
                return;
            } else if (aVar.k == 2) {
                this.f14866b.setBackgroundResource(2130841423);
                textView.setText(C0906R.string.d17);
                return;
            } else if (aVar.k == 3) {
                this.f14866b.setBackgroundResource(2130841424);
                textView.setText(C0906R.string.d18);
                return;
            } else if (aVar.k == 4) {
                this.f14866b.setVisibility(8);
                textView.setText(C0906R.string.d16);
                return;
            }
        }
        setVisibility(8);
    }

    public UserEnterRankView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserEnterRankView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
