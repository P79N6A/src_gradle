package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;

public final class ad implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        if (viewGroup2 != null) {
            DmtTextView dmtTextView = new DmtTextView(context2);
            ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
            dmtTextView.setTextSize(1, 17.0f);
            dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
            dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(C0906R.color.mc));
            dmtTextView.setAlpha(0.6f);
            dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.a08));
            dmtTextView.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), dmtTextView.getPaddingTop(), dmtTextView.getPaddingRight(), dmtTextView.getPaddingBottom());
            dmtTextView.setPadding(dmtTextView.getPaddingLeft(), dmtTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), dmtTextView.getPaddingBottom());
            dmtTextView.setMinWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
            dmtTextView.setPadding(dmtTextView.getPaddingLeft(), dmtTextView.getPaddingTop(), dmtTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
            dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
            dmtTextView.setGravity(17);
            if (RelativeLayout.LayoutParams.class.isInstance(a2)) {
                ((RelativeLayout.LayoutParams) a2).addRule(15, -1);
            }
            dmtTextView.setId(C0906R.id.dbu);
            if (RelativeLayout.LayoutParams.class.isInstance(a2)) {
                ((RelativeLayout.LayoutParams) a2).addRule(0, C0906R.id.bay);
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a2)) {
                ((RelativeLayout.LayoutParams) a2).addRule(16, C0906R.id.bay);
            }
            dmtTextView.setText(C0906R.string.ae6);
            if (viewGroup2 != null) {
                dmtTextView.setLayoutParams(a2);
                viewGroup2.addView(dmtTextView);
            }
            DmtTextView dmtTextView2 = new DmtTextView(context2);
            ViewGroup.MarginLayoutParams a3 = a.a(viewGroup2, -2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
            dmtTextView2.setTextSize(1, 17.0f);
            dmtTextView2.setShadowLayer(2.0f, dmtTextView2.getShadowDx(), dmtTextView2.getShadowDy(), dmtTextView2.getShadowColor());
            dmtTextView2.setShadowLayer(dmtTextView2.getShadowRadius(), dmtTextView2.getShadowDx(), dmtTextView2.getShadowDy(), resources.getColor(C0906R.color.mc));
            dmtTextView2.setAlpha(0.6f);
            dmtTextView2.setTextColor(resources.getColorStateList(C0906R.color.a08));
            dmtTextView2.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), dmtTextView2.getPaddingTop(), dmtTextView2.getPaddingRight(), dmtTextView2.getPaddingBottom());
            dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), dmtTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), dmtTextView2.getPaddingBottom());
            dmtTextView2.setMinWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
            dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), dmtTextView2.getPaddingTop(), dmtTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
            dmtTextView2.setShadowLayer(dmtTextView2.getShadowRadius(), dmtTextView2.getShadowDx(), 2.0f, dmtTextView2.getShadowColor());
            dmtTextView2.setGravity(17);
            if (RelativeLayout.LayoutParams.class.isInstance(a3)) {
                ((RelativeLayout.LayoutParams) a3).addRule(15, -1);
            }
            dmtTextView2.setId(C0906R.id.df8);
            if (RelativeLayout.LayoutParams.class.isInstance(a3)) {
                i = C0906R.id.bay;
                ((RelativeLayout.LayoutParams) a3).addRule(0, C0906R.id.bay);
            } else {
                i = C0906R.id.bay;
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a3)) {
                ((RelativeLayout.LayoutParams) a3).addRule(16, i);
            }
            dmtTextView2.setText(C0906R.string.ae9);
            if (viewGroup2 != null) {
                dmtTextView2.setLayoutParams(a3);
                viewGroup2.addView(dmtTextView2);
            }
            ImageView imageView = new ImageView(context2);
            ViewGroup.MarginLayoutParams a4 = a.a(viewGroup2, (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
            imageView.setId(C0906R.id.cyq);
            if (RelativeLayout.LayoutParams.class.isInstance(a4)) {
                i2 = C0906R.id.dbu;
                ((RelativeLayout.LayoutParams) a4).addRule(1, C0906R.id.dbu);
            } else {
                i2 = C0906R.id.dbu;
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a4)) {
                ((RelativeLayout.LayoutParams) a4).addRule(17, i2);
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a4) && Build.VERSION.SDK_INT >= 17) {
                a4.setMarginStart((int) TypedValue.applyDimension(1, -15.0f, resources.getDisplayMetrics()));
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
                a4.leftMargin = (int) TypedValue.applyDimension(1, -15.0f, resources.getDisplayMetrics());
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
                a4.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
            }
            imageView.setVisibility(8);
            imageView.setImageResource(2130840255);
            if (viewGroup2 != null) {
                imageView.setLayoutParams(a4);
                viewGroup2.addView(imageView);
            }
            DmtTextView dmtTextView3 = new DmtTextView(context2);
            ViewGroup.MarginLayoutParams a5 = a.a(viewGroup2, -2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
            dmtTextView3.setTextSize(1, 12.0f);
            dmtTextView3.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
            dmtTextView3.setId(C0906R.id.cyr);
            if (RelativeLayout.LayoutParams.class.isInstance(a5)) {
                i3 = C0906R.id.dbu;
                ((RelativeLayout.LayoutParams) a5).addRule(1, C0906R.id.dbu);
            } else {
                i3 = C0906R.id.dbu;
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a5)) {
                ((RelativeLayout.LayoutParams) a5).addRule(17, i3);
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a5) && Build.VERSION.SDK_INT >= 17) {
                a5.setMarginStart((int) TypedValue.applyDimension(1, -19.0f, resources.getDisplayMetrics()));
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
                a5.leftMargin = (int) TypedValue.applyDimension(1, -19.0f, resources.getDisplayMetrics());
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
                a5.topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
            }
            dmtTextView3.setBackgroundResource(2130838296);
            dmtTextView3.setGravity(17);
            dmtTextView3.setMinWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
            dmtTextView3.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), dmtTextView3.getPaddingBottom());
            dmtTextView3.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), dmtTextView3.getPaddingBottom());
            dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingBottom());
            dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingBottom());
            dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
            dmtTextView3.setText(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            dmtTextView3.setVisibility(8);
            dmtTextView3.setTextColor(resources.getColorStateList(C0906R.color.i0));
            if (viewGroup2 != null) {
                dmtTextView3.setLayoutParams(a5);
                viewGroup2.addView(dmtTextView3);
            }
            ImageView imageView2 = new ImageView(context2);
            ViewGroup.MarginLayoutParams a6 = a.a(viewGroup2, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
            imageView2.setId(C0906R.id.b5w);
            if (RelativeLayout.LayoutParams.class.isInstance(a6)) {
                i4 = C0906R.id.dbu;
                ((RelativeLayout.LayoutParams) a6).addRule(1, C0906R.id.dbu);
            } else {
                i4 = C0906R.id.dbu;
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a6)) {
                ((RelativeLayout.LayoutParams) a6).addRule(17, i4);
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a6) && Build.VERSION.SDK_INT >= 17) {
                a6.setMarginStart((int) TypedValue.applyDimension(1, -21.0f, resources.getDisplayMetrics()));
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
                a6.leftMargin = (int) TypedValue.applyDimension(1, -21.0f, resources.getDisplayMetrics());
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
                a6.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
            }
            imageView2.setBackgroundResource(2130838297);
            imageView2.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), imageView2.getPaddingTop(), imageView2.getPaddingRight(), imageView2.getPaddingBottom());
            imageView2.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), imageView2.getPaddingTop(), imageView2.getPaddingRight(), imageView2.getPaddingBottom());
            imageView2.setPadding(imageView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), imageView2.getPaddingRight(), imageView2.getPaddingBottom());
            imageView2.setPadding(imageView2.getPaddingLeft(), imageView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), imageView2.getPaddingBottom());
            imageView2.setPadding(imageView2.getPaddingLeft(), imageView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), imageView2.getPaddingBottom());
            imageView2.setPadding(imageView2.getPaddingLeft(), imageView2.getPaddingTop(), imageView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.setImageResource(2130838810);
            imageView2.setVisibility(8);
            if (viewGroup2 != null) {
                imageView2.setLayoutParams(a6);
                viewGroup2.addView(imageView2);
            }
            ImageView imageView3 = new ImageView(context2);
            ViewGroup.MarginLayoutParams a7 = a.a(viewGroup2, (int) TypedValue.applyDimension(1, 25.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
            imageView3.setId(C0906R.id.b5x);
            if (RelativeLayout.LayoutParams.class.isInstance(a7)) {
                i5 = C0906R.id.dbu;
                ((RelativeLayout.LayoutParams) a7).addRule(1, C0906R.id.dbu);
            } else {
                i5 = C0906R.id.dbu;
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a7)) {
                ((RelativeLayout.LayoutParams) a7).addRule(17, i5);
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a7) && Build.VERSION.SDK_INT >= 17) {
                a7.setMarginStart((int) TypedValue.applyDimension(1, -21.0f, resources.getDisplayMetrics()));
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a7)) {
                a7.leftMargin = (int) TypedValue.applyDimension(1, -21.0f, resources.getDisplayMetrics());
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a7)) {
                a7.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
            }
            imageView3.setBackgroundResource(2130838297);
            imageView3.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), imageView3.getPaddingTop(), imageView3.getPaddingRight(), imageView3.getPaddingBottom());
            imageView3.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), imageView3.getPaddingTop(), imageView3.getPaddingRight(), imageView3.getPaddingBottom());
            imageView3.setPadding(imageView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), imageView3.getPaddingRight(), imageView3.getPaddingBottom());
            imageView3.setPadding(imageView3.getPaddingLeft(), imageView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), imageView3.getPaddingBottom());
            imageView3.setPadding(imageView3.getPaddingLeft(), imageView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), imageView3.getPaddingBottom());
            imageView3.setPadding(imageView3.getPaddingLeft(), imageView3.getPaddingTop(), imageView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
            imageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView3.setImageResource(2130839400);
            imageView3.setVisibility(8);
            if (viewGroup2 != null) {
                imageView3.setLayoutParams(a7);
                viewGroup2.addView(imageView3);
            }
            View view = new View(context2);
            ViewGroup.MarginLayoutParams a8 = a.a(viewGroup2, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
            view.setBackgroundResource(2130838238);
            if (RelativeLayout.LayoutParams.class.isInstance(a8)) {
                ((RelativeLayout.LayoutParams) a8).addRule(15, -1);
            }
            view.setId(C0906R.id.bay);
            if (viewGroup2 != null) {
                view.setLayoutParams(a8);
                viewGroup2.addView(view);
            }
            DmtTextView dmtTextView4 = new DmtTextView(context2);
            ViewGroup.MarginLayoutParams a9 = a.a(viewGroup2, -2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
            dmtTextView4.setTextSize(1, 17.0f);
            dmtTextView4.setShadowLayer(2.0f, dmtTextView4.getShadowDx(), dmtTextView4.getShadowDy(), dmtTextView4.getShadowColor());
            dmtTextView4.setShadowLayer(dmtTextView4.getShadowRadius(), dmtTextView4.getShadowDx(), dmtTextView4.getShadowDy(), resources.getColor(C0906R.color.mc));
            dmtTextView4.setAlpha(0.6f);
            dmtTextView4.setTextColor(resources.getColorStateList(C0906R.color.a08));
            dmtTextView4.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), dmtTextView4.getPaddingTop(), dmtTextView4.getPaddingRight(), dmtTextView4.getPaddingBottom());
            dmtTextView4.setPadding(dmtTextView4.getPaddingLeft(), dmtTextView4.getPaddingTop(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), dmtTextView4.getPaddingBottom());
            dmtTextView4.setMinWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
            dmtTextView4.setPadding(dmtTextView4.getPaddingLeft(), dmtTextView4.getPaddingTop(), dmtTextView4.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
            dmtTextView4.setShadowLayer(dmtTextView4.getShadowRadius(), dmtTextView4.getShadowDx(), 2.0f, dmtTextView4.getShadowColor());
            dmtTextView4.setGravity(17);
            if (RelativeLayout.LayoutParams.class.isInstance(a9)) {
                ((RelativeLayout.LayoutParams) a9).addRule(15, -1);
            }
            dmtTextView4.setId(C0906R.id.dcx);
            dmtTextView4.setText(C0906R.string.ae8);
            if (viewGroup2 != null) {
                dmtTextView4.setLayoutParams(a9);
                viewGroup2.addView(dmtTextView4);
            }
            View view2 = new View(context2);
            ViewGroup.MarginLayoutParams a10 = a.a(viewGroup2, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
            view2.setBackgroundResource(2130838238);
            if (RelativeLayout.LayoutParams.class.isInstance(a10)) {
                ((RelativeLayout.LayoutParams) a10).addRule(15, -1);
            }
            view2.setId(C0906R.id.cen);
            if (viewGroup2 != null) {
                view2.setLayoutParams(a10);
                viewGroup2.addView(view2);
            }
            DmtTextView dmtTextView5 = new DmtTextView(context2);
            ViewGroup.MarginLayoutParams a11 = a.a(viewGroup2, -2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
            dmtTextView5.setTextSize(1, 17.0f);
            dmtTextView5.setShadowLayer(2.0f, dmtTextView5.getShadowDx(), dmtTextView5.getShadowDy(), dmtTextView5.getShadowColor());
            dmtTextView5.setShadowLayer(dmtTextView5.getShadowRadius(), dmtTextView5.getShadowDx(), dmtTextView5.getShadowDy(), resources.getColor(C0906R.color.mc));
            dmtTextView5.setAlpha(0.6f);
            dmtTextView5.setTextColor(resources.getColorStateList(C0906R.color.a08));
            dmtTextView5.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), dmtTextView5.getPaddingTop(), dmtTextView5.getPaddingRight(), dmtTextView5.getPaddingBottom());
            dmtTextView5.setPadding(dmtTextView5.getPaddingLeft(), dmtTextView5.getPaddingTop(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), dmtTextView5.getPaddingBottom());
            dmtTextView5.setMinWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
            dmtTextView5.setPadding(dmtTextView5.getPaddingLeft(), dmtTextView5.getPaddingTop(), dmtTextView5.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
            dmtTextView5.setShadowLayer(dmtTextView5.getShadowRadius(), dmtTextView5.getShadowDx(), 2.0f, dmtTextView5.getShadowColor());
            dmtTextView5.setGravity(17);
            if (RelativeLayout.LayoutParams.class.isInstance(a11)) {
                ((RelativeLayout.LayoutParams) a11).addRule(15, -1);
            }
            dmtTextView5.setId(C0906R.id.dc2);
            dmtTextView5.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            dmtTextView5.setSingleLine(true);
            dmtTextView5.setFocusable(true);
            if (RelativeLayout.LayoutParams.class.isInstance(a11)) {
                ((RelativeLayout.LayoutParams) a11).addRule(1, C0906R.id.cen);
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a11)) {
                ((RelativeLayout.LayoutParams) a11).addRule(17, C0906R.id.cen);
            }
            dmtTextView5.setFocusableInTouchMode(true);
            dmtTextView5.setText(C0906R.string.ae9);
            if (viewGroup2 != null) {
                dmtTextView5.setLayoutParams(a11);
                viewGroup2.addView(dmtTextView5);
            }
            View view3 = new View(context2);
            ViewGroup.MarginLayoutParams a12 = a.a(viewGroup2, -1, (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
            view3.setId(C0906R.id.bl5);
            if (ViewGroup.MarginLayoutParams.class.isInstance(a12)) {
                a12.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a12)) {
                i6 = C0906R.id.dbu;
                ((RelativeLayout.LayoutParams) a12).addRule(5, C0906R.id.dbu);
            } else {
                i6 = C0906R.id.dbu;
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a12)) {
                ((RelativeLayout.LayoutParams) a12).addRule(7, i6);
            }
            if (RelativeLayout.LayoutParams.class.isInstance(a12)) {
                ((RelativeLayout.LayoutParams) a12).addRule(8, i6);
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a12)) {
                a12.leftMargin = (int) TypedValue.applyDimension(1, 22.5f, resources.getDisplayMetrics());
            }
            if (ViewGroup.MarginLayoutParams.class.isInstance(a12)) {
                a12.rightMargin = (int) TypedValue.applyDimension(1, 22.5f, resources.getDisplayMetrics());
            }
            view3.setBackgroundColor(resources.getColor(C0906R.color.a08));
            view3.setVisibility(8);
            if (viewGroup2 != null) {
                view3.setLayoutParams(a12);
                viewGroup2.addView(view3);
            }
            a.a(dmtTextView);
            a.a(dmtTextView2);
            a.a(dmtTextView3);
            a.a(dmtTextView4);
            a.a(dmtTextView5);
            return viewGroup2;
        }
        throw new IllegalStateException("merge标签 container不得为null attach不得为false");
    }
}
