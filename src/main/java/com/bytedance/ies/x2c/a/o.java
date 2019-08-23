package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class o implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        viewStub.setId(C0906R.id.cwr);
        viewStub.setInflatedId(C0906R.id.b1d);
        viewStub.setLayoutResource(C0906R.layout.a8j);
        viewStub.setLayoutParams(layoutParams);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        ViewStub viewStub2 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        viewStub2.setId(C0906R.id.cwq);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        viewStub2.setInflatedId(C0906R.id.bge);
        viewStub2.setLayoutResource(C0906R.layout.a3c);
        viewStub2.setLayoutParams(layoutParams2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2);
        }
        ViewStub viewStub3 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        viewStub3.setId(C0906R.id.cwt);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        viewStub3.setInflatedId(C0906R.id.b5r);
        viewStub3.setLayoutResource(C0906R.layout.a1d);
        viewStub3.setLayoutParams(layoutParams3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3);
        }
        ViewStub viewStub4 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        viewStub4.setId(C0906R.id.cwv);
        viewStub4.setInflatedId(C0906R.id.act);
        viewStub4.setLayoutResource(C0906R.layout.m2);
        viewStub4.setLayoutParams(layoutParams4);
        if (viewStub4.getParent() == null) {
            frameLayout.addView(viewStub4);
        }
        ViewStub viewStub5 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        viewStub5.setId(C0906R.id.cx3);
        viewStub5.setInflatedId(C0906R.id.b4r);
        viewStub5.setLayoutResource(C0906R.layout.m6);
        viewStub5.setLayoutParams(layoutParams5);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5);
        }
        ViewStub viewStub6 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        viewStub6.setId(C0906R.id.cx2);
        viewStub6.setInflatedId(C0906R.id.b4q);
        viewStub6.setLayoutResource(C0906R.layout.m5);
        viewStub6.setLayoutParams(layoutParams6);
        if (viewStub6.getParent() == null) {
            frameLayout.addView(viewStub6);
        }
        return frameLayout;
    }
}
