package com.bytedance.android.livesdk.chatroom.ui;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class eh implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12143a;

    /* renamed from: b  reason: collision with root package name */
    private final MessageListAdapter.TextMessageViewHolder f12144b;

    eh(MessageListAdapter.TextMessageViewHolder textMessageViewHolder) {
        this.f12144b = textMessageViewHolder;
    }

    public final void a(Spannable spannable) {
        Spannable spannable2 = spannable;
        if (PatchProxy.isSupport(new Object[]{spannable2}, this, f12143a, false, 6282, new Class[]{Spannable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannable2}, this, f12143a, false, 6282, new Class[]{Spannable.class}, Void.TYPE);
            return;
        }
        MessageListAdapter.TextMessageViewHolder textMessageViewHolder = this.f12144b;
        if (spannable2 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textMessageViewHolder.f11726b.getText());
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(spannable2);
            textMessageViewHolder.f11726b.setText(spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(textMessageViewHolder.g);
            spannableStringBuilder2.append(" ");
            textMessageViewHolder.g = spannableStringBuilder2.append(spannable2);
        }
    }
}
