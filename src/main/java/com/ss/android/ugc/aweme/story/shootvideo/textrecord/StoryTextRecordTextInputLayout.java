package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;

public class StoryTextRecordTextInputLayout extends TextStickerInputLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74223a;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74223a, false, 86241, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74223a, false, 86241, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getVisibility() != 0) {
            d();
        }
    }

    public void dismiss(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74223a, false, 86242, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74223a, false, 86242, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (getVisibility() != 8 && !z) {
            e();
        }
    }

    public StoryTextRecordTextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
