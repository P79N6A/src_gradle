package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.utils.ey;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\f\u0010#\u001a\u00020$*\u0004\u0018\u00010%\u001a\f\u0010&\u001a\u00020\u000e*\u0004\u0018\u00010%\u001a\u0014\u0010'\u001a\u00020$*\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u000e\u001a\u0016\u0010)\u001a\u00020$*\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020\nH\u0002\u001a\f\u0010+\u001a\u00020$*\u0004\u0018\u00010%\u001a\f\u0010,\u001a\u00020$*\u0004\u0018\u00010%\u001a,\u0010-\u001a\u00020$*\u0004\u0018\u00010%2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001cXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001cXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"ANIMATOR_DURATION_TIME", "", "ANIMATOR_PROPERTY_ROTATION", "", "ANIMATOR_PROPERTY_SCALE_X", "ANIMATOR_PROPERTY_SCALE_Y", "ANIMATOR_PROPERTY_X", "ANIMATOR_PROPERTY_Y", "CLICK_DISTANCE", "EDIT_TEXT_OPTION_PADDING", "", "EDIT_TEXT_TITLE_PADDING", "EDIT_TEXT_TITLE_TYPEFACE", "KEYBOARD_MIN_HEIGHT", "", "MAX_PER_LINE_TEXT_SIZE", "OPTION_BACKGROUND_COLOR", "OPTION_BACKGROUND_RADIO", "OPTION_MAX_LINE", "OPTION_SHADOW_COLOR", "OPTION_SHADOW_OFFSET_X", "OPTION_SHADOW_OFFSET_Y", "OPTION_SHADOW_RADIO", "REFLECT_VIEW_CLASS_EDITOR", "REFLECT_VIEW_FIELD_EDITOR", "REFLECT_VIEW_FIELD_INSERTION_CONTROLLER_ENABLED", "REFLECT_VIEW_FIELD_SELECTION_CONTROLLER_ENABLED", "ROTATION_HALF", "", "ROTATION_MAX", "TITLE_MAX_LINE", "VOTING_ADD_DEFAUL", "VOTING_ADD_NULL", "VOTING_ADD_VIEW", "currentTitleLineCount", "disableCopyAndPaste", "", "Landroid/widget/EditText;", "getRealLineCount", "limitLine", "count", "resetEditTextPadding", "padding", "setEditTextFocusable", "setInsertionDisabled", "setPaddingRelativeCompat", "start", "top", "end", "bottom", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67384a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f67385b = 200;

    /* renamed from: c  reason: collision with root package name */
    public static int f67386c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static int f67387d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static int f67388e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static int f67389f = 3;
    public static int g;

    public static final int a(@Nullable EditText editText) {
        int i;
        if (PatchProxy.isSupport(new Object[]{editText}, null, f67384a, true, 77192, new Class[]{EditText.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{editText}, null, f67384a, true, 77192, new Class[]{EditText.class}, Integer.TYPE)).intValue();
        } else if (editText == null) {
            return 0;
        } else {
            try {
                if (editText.getLayout() == null) {
                    StaticLayout staticLayout = new StaticLayout(editText.getText(), editText.getPaint(), editText.getMaxWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    i = staticLayout.getLineCount();
                } else {
                    Layout layout = editText.getLayout();
                    Intrinsics.checkExpressionValueIsNotNull(layout, "layout");
                    i = layout.getLineCount();
                }
            } catch (Exception unused) {
                i = 0;
            }
            return i;
        }
    }

    public static final void b(@Nullable EditText editText) {
        EditText editText2 = editText;
        if (PatchProxy.isSupport(new Object[]{editText2}, null, f67384a, true, 77193, new Class[]{EditText.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText2}, null, f67384a, true, 77193, new Class[]{EditText.class}, Void.TYPE);
        } else if (editText2 != null) {
            editText2.setFocusable(true);
            editText2.setFocusableInTouchMode(true);
            editText.requestFocus();
            KeyboardUtils.b(editText2);
            editText2.setSelection(editText.getText().length());
        }
    }

    public static final void a(@Nullable EditText editText, double d2) {
        EditText editText2 = editText;
        if (PatchProxy.isSupport(new Object[]{editText2, Double.valueOf(d2)}, null, f67384a, true, 77189, new Class[]{EditText.class, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText2, Double.valueOf(d2)}, null, f67384a, true, 77189, new Class[]{EditText.class, Double.TYPE}, Void.TYPE);
        } else if (editText2 != null) {
            if (!TextUtils.isEmpty(editText.getText().toString()) || editText.getHint() == null) {
                editText2.setGravity(17);
                a(editText2, u.a(d2), 0, u.a(d2), 0);
                return;
            }
            Paint paint = new Paint();
            paint.setTextSize(editText.getTextSize());
            paint.setTypeface(editText.getTypeface());
            int measureText = (int) ((((float) editText.getLayoutParams().width) - paint.measureText(editText.getHint().toString())) / 2.0f);
            if (measureText < 0) {
                a(editText2, 0, 0, 0, 0);
                editText2.setGravity(8388659);
                return;
            }
            a(editText2, measureText, 0, 0, 0);
            editText2.setGravity(8388627);
        }
    }

    public static final void a(@Nullable EditText editText, int i) {
        boolean z;
        EditText editText2 = editText;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{editText2, Integer.valueOf(i)}, null, f67384a, true, 77191, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText2, Integer.valueOf(i)}, null, f67384a, true, 77191, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
        } else if (editText2 != null) {
            CharSequence text = editText.getText();
            if (text == null || text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && a(editText) > i2) {
                String obj = editText.getText().toString();
                int i3 = i2 * 50;
                if (obj.length() >= i3) {
                    if (obj != null) {
                        obj = obj.substring(0, i3);
                        Intrinsics.checkExpressionValueIsNotNull(obj, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                int length = obj.length() - 1;
                if (obj != null) {
                    String substring = obj.substring(0, length);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int length2 = substring.length() - 1;
                    while (length2 >= 0 && Character.isHighSurrogate(substring.charAt(length2))) {
                        if (substring != null) {
                            substring = substring.substring(0, length2);
                            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            length2--;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    editText2.setText(substring);
                    editText2.setSelection(editText.getText().length());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }

    private static void a(@Nullable EditText editText, int i, int i2, int i3, int i4) {
        EditText editText2 = editText;
        int i5 = i;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{editText2, Integer.valueOf(i), 0, Integer.valueOf(i3), 0}, null, f67384a, true, 77190, new Class[]{EditText.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {editText2, Integer.valueOf(i), 0, Integer.valueOf(i3), 0};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f67384a, true, 77190, new Class[]{EditText.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (editText2 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                editText2.setPaddingRelative(i5, 0, i6, 0);
            } else if (!ey.a(editText.getContext())) {
                editText2.setPadding(i5, 0, i6, 0);
            } else {
                editText2.setPadding(i6, 0, i5, 0);
            }
        }
    }
}
