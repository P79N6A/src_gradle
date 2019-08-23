package com.bytedance.ies.dmt.ui.input.emoji;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.common.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f20405a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    public static int a(String str) {
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            while (f20405a.matcher(str).find()) {
                i++;
            }
        }
        return i;
    }

    public static void a(TextView textView) {
        CharSequence text = textView.getText();
        SpannableString spannableString = new SpannableString(text);
        for (a removeSpan : (a[]) spannableString.getSpans(0, text.length(), a.class)) {
            spannableString.removeSpan(removeSpan);
        }
        f a2 = f.a(textView.getContext());
        Matcher matcher = f20405a.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int b2 = a2.b(matcher.group());
            if (b2 > 0) {
                int lineHeight = textView.getLineHeight();
                Drawable a3 = com.ss.android.ugc.bytex.a.a.a.a(textView.getResources(), b2);
                a3.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a3.getIntrinsicWidth()) + 0.0f) / ((float) a3.getIntrinsicHeight()))) + 0.5f), lineHeight);
                spannableString.setSpan(new a(a3, Integer.valueOf(end - start)), start, end, 33);
            }
        }
        if (textView instanceof EditText) {
            Editable editableText = textView.getEditableText();
            if (editableText != null) {
                editableText.replace(0, text.length(), spannableString);
            }
            return;
        }
        textView.setText(spannableString);
    }
}
