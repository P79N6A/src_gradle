package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;

public final class y implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        linearLayout.setId(C0906R.id.bou);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        imageView.setId(C0906R.id.bof);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        imageView.setAlpha(0.9f);
        imageView.setImageResource(2130838964);
        imageView.setVisibility(8);
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            linearLayout.addView(imageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setTextSize(1, 15.0f);
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView.setId(C0906R.id.bol);
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(C0906R.color.a3_));
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), 0.0f, dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setText(C0906R.string.bko);
        dmtTextView.setMaxWidth((int) TypedValue.applyDimension(1, 149.0f, resources.getDisplayMetrics()));
        dmtTextView.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView.setMaxLines(1);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.hw));
        dmtTextView.setTypeface(Typeface.DEFAULT_BOLD);
        dmtTextView.setVisibility(8);
        dmtTextView.setFontType("bold");
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        MarqueeView marqueeView = new MarqueeView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        marqueeView.setId(C0906R.id.bov);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3) && Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        marqueeView.setSpeed((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        marqueeView.setTextColor(resources.getColor(C0906R.color.hx));
        marqueeView.setTextShadow(resources.getColor(C0906R.color.mc));
        marqueeView.setTextSize((int) TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics()));
        marqueeView.setLayoutParams(layoutParams3);
        if (marqueeView.getParent() == null) {
            linearLayout.addView(marqueeView);
        }
        a.a(dmtTextView);
        a.a(marqueeView);
        return linearLayout;
    }
}
