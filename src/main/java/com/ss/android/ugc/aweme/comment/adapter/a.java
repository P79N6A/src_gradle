package com.ss.android.ugc.aweme.comment.adapter;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.comment.model.Comment;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36342a;

    static void a(Comment comment, TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{comment, textView2}, null, f36342a, true, 27214, new Class[]{Comment.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, textView2}, null, f36342a, true, 27214, new Class[]{Comment.class, TextView.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a() && !TextUtils.isEmpty(comment.getLabelText())) {
            String format = String.format(textView.getResources().getString(C0906R.string.ve), new Object[]{""});
            if (!TextUtils.isEmpty(format)) {
                textView2.setVisibility(0);
                textView2.setText(format);
                if (textView2 instanceof DmtTextView) {
                    ((DmtTextView) textView2).setFontType(c.g);
                }
                return;
            }
        }
        textView2.setVisibility(8);
    }

    static void a(Comment comment, TextView textView, boolean z) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{comment, textView2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f36342a, true, 27213, new Class[]{Comment.class, TextView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, textView2, Byte.valueOf(z)}, null, f36342a, true, 27213, new Class[]{Comment.class, TextView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        String labelText = comment.getLabelText();
        if (TextUtils.isEmpty(labelText)) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(labelText);
        if (com.ss.android.g.a.a()) {
            if (comment.getLabelType() == 1) {
                textView2.setTextColor(textView.getResources().getColor(C0906R.color.xy));
            } else {
                textView2.setTextColor(textView.getResources().getColor(C0906R.color.p_));
            }
            if (textView2 instanceof DmtTextView) {
                ((DmtTextView) textView2).setFontType(c.g);
            }
        } else if (comment.getLabelType() == 1) {
            textView2.setBackgroundResource(2130838343);
            textView2.setTextColor(-1);
        } else if (z) {
            textView2.setBackgroundResource(2130837875);
            textView2.setTextColor(textView.getResources().getColor(C0906R.color.ow));
        } else {
            textView2.setBackgroundResource(2130837874);
            textView2.setTextColor(textView.getResources().getColor(C0906R.color.p_));
        }
    }
}
