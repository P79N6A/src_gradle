package com.ss.android.ugc.aweme.commercialize.im;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ItemInputMenu extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38881a;

    public ItemInputMenu(Context context) {
        super(context);
    }

    public void setLeftVisible(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38881a, false, 30822, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38881a, false, 30822, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.bmd);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    public void setText(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f38881a, false, 30823, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38881a, false, 30823, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TextView textView = (TextView) findViewById(C0906R.id.bmf);
        if (textView != null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            textView.setText(str2);
        }
    }

    public ItemInputMenu(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static ItemInputMenu a(ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f38881a, true, 30821, new Class[]{ViewGroup.class, Boolean.TYPE}, ItemInputMenu.class)) {
            return (ItemInputMenu) PatchProxy.accessDispatch(new Object[]{viewGroup2, Byte.valueOf(z)}, null, f38881a, true, 30821, new Class[]{ViewGroup.class, Boolean.TYPE}, ItemInputMenu.class);
        }
        ItemInputMenu itemInputMenu = (ItemInputMenu) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vz, viewGroup2, false);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) itemInputMenu.getLayoutParams();
        if (z) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -1;
        }
        itemInputMenu.setLayoutParams(layoutParams);
        return itemInputMenu;
    }

    public ItemInputMenu(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
