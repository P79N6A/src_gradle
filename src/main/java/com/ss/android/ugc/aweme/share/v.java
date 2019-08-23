package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.ei;
import java.util.StringTokenizer;

public class v extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3882b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f3883c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f3884d;

    /* renamed from: e  reason: collision with root package name */
    protected View f3885e;

    public int getLayoutResource() {
        return C0906R.layout.gq;
    }

    public ImageView getShareImageView() {
        return this.f3883c;
    }

    public TextView getShareTextView() {
        return this.f3884d;
    }

    public v(Context context) {
        this(context, null);
    }

    public void setIcon(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f3882b, false, 72991, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f3882b, false, 72991, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.f3883c.setImageDrawable(drawable2);
    }

    public final void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3882b, false, 72998, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3882b, false, 72998, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3885e != null) {
            View view = this.f3885e;
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setIcon(@DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3882b, false, 72990, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3882b, false, 72990, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3883c.setImageResource(i);
    }

    public void setIconAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3882b, false, 72992, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3882b, false, 72992, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f3883c.setAlpha(f2);
    }

    public void setText(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3882b, false, 72993, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3882b, false, 72993, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3884d.setText(i);
    }

    public void setTextAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3882b, false, 72997, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3882b, false, 72997, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f3884d.setAlpha(f2);
    }

    public void setTextColor(@ColorRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3882b, false, 72996, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3882b, false, 72996, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3884d.setTextColor(getResources().getColor(i));
    }

    public void setTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3882b, false, 72994, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3882b, false, 72994, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f3884d.setTextSize(f2);
    }

    public void setText(String str) {
        int i;
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f3882b, false, 72995, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f3882b, false, 72995, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TextView textView = this.f3884d;
        if (str3.contains(" ")) {
            i = 2;
        } else {
            i = 1;
        }
        textView.setMaxLines(i);
        TextView textView2 = this.f3884d;
        if (PatchProxy.isSupport(new Object[]{str3}, null, ei.f75821a, true, 88613, new Class[]{String.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{str3}, null, ei.f75821a, true, 88613, new Class[]{String.class}, String.class);
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(str3, " ");
            StringBuilder sb = new StringBuilder();
            sb.append(stringTokenizer.nextToken());
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.length() >= 8) {
                    sb.append(" \n");
                    sb.append(nextToken);
                } else {
                    sb.append(" ");
                    sb.append(nextToken);
                }
            }
            str2 = sb.toString();
        }
        textView2.setText(str2);
    }

    public v(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public v(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        this.f3883c = (ImageView) findViewById(C0906R.id.cp6);
        this.f3884d = (TextView) findViewById(C0906R.id.cp7);
        this.f3885e = findViewById(C0906R.id.mq);
        a(false);
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(1);
        setGravity(1);
    }
}
