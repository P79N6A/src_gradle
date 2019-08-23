package com.ss.android.ugc.aweme.im.sdk.chat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.ies.dmt.ui.input.emoji.f;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.model.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 12\u00020\u0001:\u000512345B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017J\u001e\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u00002\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002J\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010#J\u0014\u0010$\u001a\u000e\u0012\b\u0012\u00060\u001fR\u00020\u0000\u0018\u00010#H\u0002J\u001e\u0010%\u001a\b\u0018\u00010\u001fR\u00020\u00002\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0006\u0010&\u001a\u00020'J\u0012\u0010(\u001a\u00020\u00152\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u0014\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0006\u0010-\u001a\u00020\u0015J\u0018\u0010.\u001a\u00020'2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014J\u0012\u0010/\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText;", "Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mEmojiResHelper", "Lcom/bytedance/ies/dmt/ui/input/emoji/EmojiResHelper;", "kotlin.jvm.PlatformType", "mOnKeyListener", "Landroid/view/View$OnKeyListener;", "mOnMentionInputListener", "Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$OnMentionInputListener;", "getMOnMentionInputListener", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$OnMentionInputListener;", "setMOnMentionInputListener", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$OnMentionInputListener;)V", "addEmojiText", "", "emojiText", "", "addMentionText", "type", "text", "id", "nickname", "uid", "getClosestMentionSpan", "Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$MentionSpan;", "selStart", "selEnd", "getMentionIds", "", "getMentionSpans", "getNearbyMentionSpan", "initViews", "", "isRTL", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onDeleteEvent", "onSelectionChanged", "setOnKeyListener", "listener", "Companion", "HackInputConnection", "MentionSpan", "MentionTextWatcher", "OnMentionInputListener", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class MentionEditText extends DmtEditText {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51020b;

    /* renamed from: e  reason: collision with root package name */
    public static final a f51021e = new a((byte) 0);
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private e f51022a;

    /* renamed from: c  reason: collision with root package name */
    public View.OnKeyListener f51023c;

    /* renamed from: d  reason: collision with root package name */
    public final f f51024d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$Companion;", "", "()V", "TYPE_USER", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$HackInputConnection;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "editText", "Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText;", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText;Landroid/view/inputmethod/InputConnection;ZLcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText;)V", "getEditText", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText;", "deleteSurroundingText", "beforeLength", "", "afterLength", "sendKeyEvent", "event", "Landroid/view/KeyEvent;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class b extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51025a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final MentionEditText f51026b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MentionEditText f51027c;

        public final boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f51025a, false, 51397, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f51025a, false, 51397, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(keyEvent, "event");
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                z = this.f51026b.a();
                if (z) {
                    View.OnKeyListener onKeyListener = this.f51027c.f51023c;
                    if (onKeyListener != null) {
                        onKeyListener.onKey(this.f51026b, keyEvent.getKeyCode(), keyEvent);
                    }
                }
            } else {
                z = false;
            }
            if (z || super.sendKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51025a, false, 51398, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51025a, false, 51398, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            if (i == 1 && i2 == 0) {
                z = this.f51026b.a();
            } else {
                z = false;
            }
            if (z || super.deleteSurroundingText(i, i2)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MentionEditText mentionEditText, @NotNull InputConnection inputConnection, boolean z, @NotNull MentionEditText mentionEditText2) {
            super(inputConnection, true);
            Intrinsics.checkParameterIsNotNull(inputConnection, "target");
            Intrinsics.checkParameterIsNotNull(mentionEditText2, "editText");
            this.f51027c = mentionEditText;
            this.f51026b = mentionEditText2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$MentionSpan;", "", "text", "", "id", "type", "", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "range", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/Range;", "getRange", "()Lcom/ss/android/ugc/aweme/im/sdk/chat/model/Range;", "setRange", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/model/Range;)V", "getText", "setText", "getType", "()I", "setType", "(I)V", "equals", "", "other", "hashCode", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51028a;

        /* renamed from: b  reason: collision with root package name */
        public int f51029b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String f51030c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f51031d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public Range f51032e;

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, f51028a, false, 51400, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51028a, false, 51400, new Class[0], Integer.TYPE)).intValue();
            }
            String str = this.f51030c;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.f51031d;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + this.f51029b) * 31;
            Range range = this.f51032e;
            if (range != null) {
                i3 = range.hashCode();
            }
            return i5 + i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f51028a, false, 51399, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f51028a, false, 51399, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (this == obj) {
                return true;
            } else {
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (this.f51029b != cVar.f51029b || !Intrinsics.areEqual((Object) this.f51031d, (Object) cVar.f51031d) || !Intrinsics.areEqual((Object) this.f51030c, (Object) cVar.f51030c) || !Intrinsics.areEqual((Object) this.f51032e, (Object) cVar.f51032e)) {
                    return false;
                }
                return true;
            }
        }

        public c(String str, @Nullable String str2, @Nullable int i) {
            this.f51030c = str2;
            this.f51031d = str;
            this.f51029b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$MentionTextWatcher;", "Landroid/text/TextWatcher;", "(Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText;)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "charSequence", "", "i", "", "i1", "i2", "onTextChanged", "index", "count", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51034a;

        public final void afterTextChanged(@NotNull Editable editable) {
            Editable editable2 = editable;
            if (PatchProxy.isSupport(new Object[]{editable2}, this, f51034a, false, 51403, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable2}, this, f51034a, false, 51403, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(editable2, "editable");
        }

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51034a, false, 51401, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51034a, false, 51401, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, "charSequence");
        }

        public d() {
        }

        public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51034a, false, 51402, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51034a, false, 51402, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, "charSequence");
            if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i)) {
                e mOnMentionInputListener = MentionEditText.this.getMOnMentionInputListener();
                if (mOnMentionInputListener != null) {
                    mOnMentionInputListener.a();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/view/MentionEditText$OnMentionInputListener;", "", "onMentionCharacterInput", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface e {
        void a();
    }

    @JvmOverloads
    public MentionEditText(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public MentionEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Nullable
    public final e getMOnMentionInputListener() {
        return this.f51022a;
    }

    private final List<c> getMentionSpans() {
        if (PatchProxy.isSupport(new Object[0], this, f51020b, false, 51386, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f51020b, false, 51386, new Class[0], List.class);
        }
        Editable text = getText();
        List<c> list = null;
        if (text != null) {
            c[] cVarArr = (c[]) text.getSpans(0, text.length(), c.class);
            if (cVarArr != null) {
                list = ArraysKt.toList((T[]) cVarArr);
            }
            if (list != null) {
                for (c cVar : list) {
                    cVar.f51032e = new Range(text.getSpanStart(cVar), text.getSpanEnd(cVar));
                }
            }
        }
        return list;
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f51020b, false, 51393, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51020b, false, 51393, new Class[0], Boolean.TYPE)).booleanValue();
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionEnd != selectionStart) {
            return false;
        }
        c a2 = a(selectionStart, selectionEnd);
        if (a2 == null) {
            return false;
        }
        Range range = a2.f51032e;
        if (range != null) {
            Editable text = getText();
            if (text != null) {
                text.delete(range.getFrom(), range.getTo());
            }
        }
        return true;
    }

    @Nullable
    public final List<String> getMentionIds() {
        if (PatchProxy.isSupport(new Object[0], this, f51020b, false, 51389, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f51020b, false, 51389, new Class[0], List.class);
        }
        List<c> mentionSpans = getMentionSpans();
        if (mentionSpans == null) {
            return null;
        }
        Collection arrayList = new ArrayList();
        for (c cVar : mentionSpans) {
            String str = cVar.f51030c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (List) arrayList;
    }

    public final void setMOnMentionInputListener(@Nullable e eVar) {
        this.f51022a = eVar;
    }

    public void setOnKeyListener(@Nullable View.OnKeyListener onKeyListener) {
        View.OnKeyListener onKeyListener2 = onKeyListener;
        if (PatchProxy.isSupport(new Object[]{onKeyListener2}, this, f51020b, false, 51383, new Class[]{View.OnKeyListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onKeyListener2}, this, f51020b, false, 51383, new Class[]{View.OnKeyListener.class}, Void.TYPE);
            return;
        }
        this.f51023c = onKeyListener2;
        super.setOnKeyListener(onKeyListener);
    }

    @Nullable
    public InputConnection onCreateInputConnection(@Nullable EditorInfo editorInfo) {
        if (PatchProxy.isSupport(new Object[]{editorInfo}, this, f51020b, false, 51384, new Class[]{EditorInfo.class}, InputConnection.class)) {
            return (InputConnection) PatchProxy.accessDispatch(new Object[]{editorInfo}, this, f51020b, false, 51384, new Class[]{EditorInfo.class}, InputConnection.class);
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Intrinsics.checkExpressionValueIsNotNull(onCreateInputConnection, "super.onCreateInputConnection(outAttrs)");
        return new b(this, onCreateInputConnection, true, this);
    }

    private final c a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51020b, false, 51387, new Class[]{Integer.TYPE, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51020b, false, 51387, new Class[]{Integer.TYPE, Integer.TYPE}, c.class);
        }
        List<c> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            for (c cVar : mentionSpans) {
                Range range = cVar.f51032e;
                if (range == null) {
                    int i3 = i;
                    int i4 = i2;
                } else if (range.contains(i, i2)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    private final c b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51020b, false, 51388, new Class[]{Integer.TYPE, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51020b, false, 51388, new Class[]{Integer.TYPE, Integer.TYPE}, c.class);
        }
        List<c> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            for (c cVar : mentionSpans) {
                Range range = cVar.f51032e;
                if (range == null) {
                    int i3 = i;
                    int i4 = i2;
                } else if (range.isWrappedBy(i, i2)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public void onSelectionChanged(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51020b, false, 51385, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51020b, false, 51385, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSelectionChanged(i, i2);
        c b2 = b(i, i2);
        if (b2 != null) {
            Range range = b2.f51032e;
            if (range != null) {
                if (i == i2) {
                    try {
                        setSelection(range.getAnchorPosition(i));
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    if (i2 < range.getTo()) {
                        setSelection(i, range.getTo());
                    }
                    if (i > range.getFrom()) {
                        setSelection(range.getFrom(), i2);
                    }
                }
            }
        }
        if (i == i2) {
            setSelection(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MentionEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f51024d = f.a(context);
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f51020b, false, 51382, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51020b, false, 51382, new Class[0], Void.TYPE);
            return;
        }
        Context context2 = getContext();
        if (PatchProxy.isSupport(new Object[]{context2}, this, f51020b, false, 51394, new Class[]{Context.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f51020b, false, 51394, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 != null && Build.VERSION.SDK_INT >= 17) {
            Resources resources = context2.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(configuration, "configuration");
            if (configuration.getLayoutDirection() == 1) {
                z = true;
            }
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(5);
            }
            setGravity(getGravity() | 8388611);
        }
        addTextChangedListener(new d());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MentionEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
