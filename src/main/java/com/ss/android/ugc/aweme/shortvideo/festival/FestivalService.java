package com.ss.android.ugc.aweme.shortvideo.festival;

import android.support.annotation.Keep;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.IFestivalService;

@Keep
public class FestivalService implements IFestivalService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getWaterPicDir() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77220, new Class[0], String.class)) {
            return k.INSTANCE.getWaterPicDir();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77220, new Class[0], String.class);
    }

    public void setTextForChallengeDesc(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        String str2;
        int i;
        String str3 = str;
        TextView textView3 = textView;
        TextView textView4 = textView2;
        ImageView imageView2 = imageView;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{str3, textView3, viewGroup, textView4, imageView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 77221, new Class[]{String.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {str3, textView3, viewGroup, textView4, imageView2, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 77221, new Class[]{String.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {str3, textView3, viewGroup, textView4, imageView2, Byte.valueOf(z)};
        if (PatchProxy.isSupport(objArr3, null, a.f67676a, true, 77209, new Class[]{String.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr4 = {str3, textView3, viewGroup, textView4, imageView2, Byte.valueOf(z)};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, a.f67676a, true, 77209, new Class[]{String.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            int screenWidth = (int) (((float) UIUtils.getScreenWidth(textView.getContext())) - UIUtils.dip2Px(textView.getContext(), 32.0f));
            SpannableString spannableString = new SpannableString(str3);
            if (textView4 == null) {
                str2 = "";
            } else {
                str2 = textView2.getText().toString();
            }
            i iVar = new i(textView.getPaint(), screenWidth, z2, str2);
            SpannableString a2 = iVar.a(spannableString);
            boolean z3 = iVar.f67703c;
            textView3.setText(a2);
            if (z2) {
                int i2 = 8;
                if (z3) {
                    DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), textView.getPaint(), screenWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    int height = dynamicLayout.getHeight();
                    if (!z3 || TextUtils.isEmpty(str)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    textView4.setVisibility(i);
                    if (z3 && !TextUtils.isEmpty(str)) {
                        i2 = 0;
                    }
                    imageView2.setVisibility(i2);
                    b bVar = new b(textView, height, dynamicLayout, spannableString, imageView, textView2, viewGroup, a2);
                    textView3.post(bVar);
                    return;
                }
                imageView2.setVisibility(8);
                textView4.setVisibility(8);
            }
        }
    }
}
