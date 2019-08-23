package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final class t implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -2);
        linearLayout.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        linearLayout2.setId(C0906R.id.a3w);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2);
        }
        MentionTextView mentionTextView = new MentionTextView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        mentionTextView.setId(C0906R.id.a3m);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) resources.getDimension(C0906R.dimen.rd);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        mentionTextView.setEllipsize(TextUtils.TruncateAt.END);
        mentionTextView.setGravity(8388627);
        mentionTextView.setIncludeFontPadding(false);
        mentionTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics())), 1.0f);
        mentionTextView.setMaxLines(4);
        mentionTextView.setPadding(mentionTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()), mentionTextView.getPaddingRight(), mentionTextView.getPaddingBottom());
        mentionTextView.setShadowLayer(mentionTextView.getShadowRadius(), mentionTextView.getShadowDx(), mentionTextView.getShadowDy(), resources.getColor(C0906R.color.mc));
        mentionTextView.setShadowLayer(mentionTextView.getShadowRadius(), mentionTextView.getShadowDx(), 1.0f, mentionTextView.getShadowColor());
        mentionTextView.setShadowLayer(1.0f, mentionTextView.getShadowDx(), mentionTextView.getShadowDy(), mentionTextView.getShadowColor());
        mentionTextView.setTextAlignment(5);
        mentionTextView.setTextColor(resources.getColorStateList(C0906R.color.uj));
        mentionTextView.setTextSize(2, 15.0f);
        mentionTextView.setLayoutParams(layoutParams2);
        if (mentionTextView.getParent() == null) {
            linearLayout2.addView(mentionTextView);
        }
        ImageView imageView = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        imageView.setId(C0906R.id.ayg);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3) && Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        imageView.setPadding(imageView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()), imageView.getPaddingRight(), imageView.getPaddingBottom());
        imageView.setImageResource(2130838948);
        imageView.setVisibility(8);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        imageView.setLayoutParams(layoutParams3);
        if (imageView.getParent() == null) {
            linearLayout2.addView(imageView);
        }
        TranslationStatusView translationStatusView = new TranslationStatusView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        translationStatusView.setId(C0906R.id.d6m);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4) || Build.VERSION.SDK_INT < 17) {
            i = C0906R.dimen.rd;
        } else {
            i = C0906R.dimen.rd;
            layoutParams4.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) resources.getDimension(i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        translationStatusView.setVisibility(8);
        translationStatusView.setLayoutParams(layoutParams4);
        if (translationStatusView.getParent() == null) {
            linearLayout.addView(translationStatusView);
        }
        a.a(mentionTextView);
        a.a(translationStatusView);
        return linearLayout;
    }
}
