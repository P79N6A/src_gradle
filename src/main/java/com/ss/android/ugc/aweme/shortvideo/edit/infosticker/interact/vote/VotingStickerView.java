package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.q;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.shortvideo.widget.f;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \"2\u00020\u0001:\u0003\"#$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\tJ\b\u0010\u001b\u001a\u00020\u000fH\u0002J\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "KEYBOARD_CHANGE_MIN_THRESHOLD", "container", "Landroid/widget/LinearLayout;", "bindVoteStruct", "", "voteStruct", "Lcom/ss/android/ugc/aweme/sticker/data/VoteStruct;", "getLastTouchedIndex", "getVoteStruct", "initView", "setDisplayUI", "setEditEnable", "enable", "", "setEditTextFocusable", "index", "setEditTextProperty", "setEditUi", "setTitleEditFocusable", "setTouchEnable", "touchEnable", "updateMaxLine", "maxLine", "Companion", "OptionTextWatcher", "TitleTextWatcher", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VotingStickerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67351a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f67352b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final int f67353c = u.a(73.0d);

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f67354d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f67355e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerView$Companion;", "", "()V", "FOCUS_INDEX_OPTION_1", "", "FOCUS_INDEX_OPTION_2", "FOCUS_INDEX_TITLE", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J*\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J*\u0010\u0010\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerView$OptionTextWatcher;", "Landroid/text/TextWatcher;", "editText", "Landroid/widget/EditText;", "nextEditText", "(Landroid/widget/EditText;Landroid/widget/EditText;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67356a;

        /* renamed from: b  reason: collision with root package name */
        private final EditText f67357b;

        /* renamed from: c  reason: collision with root package name */
        private final EditText f67358c;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f67356a, false, 77184, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f67356a, false, 77184, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            e.a(this.f67357b, 1);
            String valueOf = String.valueOf(editable);
            CharSequence charSequence = valueOf;
            if (StringsKt.indexOf$default(charSequence, 13, 0, false, 6, (Object) null) >= 0 || StringsKt.indexOf$default(charSequence, 10, 0, false, 6, (Object) null) >= 0) {
                this.f67357b.setText(StringsKt.replace$default(StringsKt.replace$default(valueOf, "\r", "", false, 4, (Object) null), "\n", "", false, 4, (Object) null));
                this.f67357b.setSelection(this.f67357b.getText().length());
                e.b(this.f67358c);
            }
        }

        public b(@NotNull EditText editText, @Nullable EditText editText2) {
            Intrinsics.checkParameterIsNotNull(editText, "editText");
            this.f67357b = editText;
            this.f67358c = editText2;
        }

        public /* synthetic */ b(EditText editText, EditText editText2, int i) {
            this(editText, null);
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67356a, false, 77185, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67356a, false, 77185, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            e.a(this.f67357b, 20.0d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J*\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J*\u0010\u0010\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerView$TitleTextWatcher;", "Landroid/text/TextWatcher;", "editText", "Landroid/widget/EditText;", "nextEditText", "(Landroid/widget/EditText;Landroid/widget/EditText;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67359a;

        /* renamed from: b  reason: collision with root package name */
        private final EditText f67360b;

        /* renamed from: c  reason: collision with root package name */
        private final EditText f67361c;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f67359a, false, 77186, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f67359a, false, 77186, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            e.a(this.f67360b, e.f67389f);
            e.g = e.a(this.f67360b);
        }

        public c(@NotNull EditText editText, @Nullable EditText editText2) {
            Intrinsics.checkParameterIsNotNull(editText, "editText");
            this.f67360b = editText;
            this.f67361c = editText2;
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67359a, false, 77187, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67359a, false, 77187, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            e.a(this.f67360b, 10.0d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67362a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f67363b = new d();

        d() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            KeyEvent keyEvent2 = keyEvent;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), keyEvent2}, this, f67362a, false, 77188, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), keyEvent2}, this, f67362a, false, 77188, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (66 == i) {
                Intrinsics.checkExpressionValueIsNotNull(keyEvent2, "event");
                if (keyEvent.getAction() != 0 || e.g < e.f67389f) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    public final View b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67351a, false, 77182, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67351a, false, 77182, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f67355e == null) {
            this.f67355e = new HashMap();
        }
        View view = (View) this.f67355e.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f67355e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67351a, false, 77175, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67351a, false, 77175, new Class[0], Void.TYPE);
            return;
        }
        setEditTextFocusable(0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67351a, false, 77181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67351a, false, 77181, new Class[0], Void.TYPE);
            return;
        }
        VoteEditText voteEditText = (VoteEditText) b(C0906R.id.aan);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(0);
        Space space = (Space) b(C0906R.id.b_q);
        Intrinsics.checkExpressionValueIsNotNull(space, "layout_space");
        space.setVisibility(0);
    }

    public final void b() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f67351a, false, 77180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67351a, false, 77180, new Class[0], Void.TYPE);
            return;
        }
        VoteEditText voteEditText = (VoteEditText) b(C0906R.id.aan);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(8);
        Space space = (Space) b(C0906R.id.b_q);
        Intrinsics.checkExpressionValueIsNotNull(space, "layout_space");
        space.setVisibility(8);
        VoteEditText voteEditText2 = (VoteEditText) b(C0906R.id.aan);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText2, "et_voting_sticker_title");
        if (!q.a(String.valueOf(voteEditText2.getText()))) {
            VoteEditText voteEditText3 = (VoteEditText) b(C0906R.id.aan);
            Intrinsics.checkExpressionValueIsNotNull(voteEditText3, "et_voting_sticker_title");
            voteEditText3.setVisibility(0);
            Space space2 = (Space) b(C0906R.id.b_q);
            Intrinsics.checkExpressionValueIsNotNull(space2, "layout_space");
            space2.setVisibility(0);
        }
        VoteEditText voteEditText4 = (VoteEditText) b(C0906R.id.aal);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText4, "et_voting_sticker_option_1");
        CharSequence text = voteEditText4.getText();
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((VoteEditText) b(C0906R.id.aal)).setText(C0906R.string.dss);
        }
        VoteEditText voteEditText5 = (VoteEditText) b(C0906R.id.aam);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText5, "et_voting_sticker_option_2");
        CharSequence text2 = voteEditText5.getText();
        if (text2 == null || text2.length() == 0) {
            z2 = true;
        }
        if (z2) {
            ((VoteEditText) b(C0906R.id.aam)).setText(C0906R.string.dst);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a9, code lost:
        if ((java.lang.System.currentTimeMillis() - ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) b(com.ss.android.ugc.aweme.C0906R.id.aam)).f67337b) < 1000) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        if ((java.lang.System.currentTimeMillis() - ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) b(com.ss.android.ugc.aweme.C0906R.id.aam)).f67337b) < 1000) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getLastTouchedIndex() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f67351a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 77173(0x12d75, float:1.08142E-40)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f67351a
            r5 = 0
            r6 = 77173(0x12d75, float:1.08142E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002c:
            r1 = 2131166610(0x7f070592, float:1.794747E38)
            android.view.View r2 = r12.b(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r2 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r2
            long r2 = r2.f67337b
            r4 = 2131166608(0x7f070590, float:1.7947466E38)
            android.view.View r5 = r12.b(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r5 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r5
            long r5 = r5.f67337b
            r7 = 2
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 2131166609(0x7f070591, float:1.7947468E38)
            int r11 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0073
            android.view.View r1 = r12.b(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r1 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r1
            long r1 = r1.f67337b
            android.view.View r3 = r12.b(r10)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r3 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r3
            long r3 = r3.f67337b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ac
            long r1 = java.lang.System.currentTimeMillis()
            android.view.View r3 = r12.b(r10)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r3 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r3
            long r3 = r3.f67337b
            long r1 = r1 - r3
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ac
        L_0x0071:
            r0 = 2
            goto L_0x00ac
        L_0x0073:
            android.view.View r1 = r12.b(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r1 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r1
            long r1 = r1.f67337b
            android.view.View r3 = r12.b(r10)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r3 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r3
            long r5 = r3.f67337b
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x009a
            long r1 = java.lang.System.currentTimeMillis()
            android.view.View r3 = r12.b(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r3 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r3
            long r3 = r3.f67337b
            long r1 = r1 - r3
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ac
            r0 = 1
            goto L_0x00ac
        L_0x009a:
            long r1 = java.lang.System.currentTimeMillis()
            android.view.View r3 = r12.b(r10)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r3 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r3
            long r3 = r3.f67337b
            long r1 = r1 - r3
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ac
            goto L_0x0071
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView.getLastTouchedIndex():int");
    }

    @NotNull
    public final VoteStruct getVoteStruct() {
        if (PatchProxy.isSupport(new Object[0], this, f67351a, false, 77176, new Class[0], VoteStruct.class)) {
            return (VoteStruct) PatchProxy.accessDispatch(new Object[0], this, f67351a, false, 77176, new Class[0], VoteStruct.class);
        }
        VoteStruct voteStruct = new VoteStruct();
        VoteEditText voteEditText = (VoteEditText) b(C0906R.id.aan);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText, "et_voting_sticker_title");
        voteStruct.setQuestion(String.valueOf(voteEditText.getText()));
        List arrayList = new ArrayList();
        VoteStruct.OptionsBean optionsBean = new VoteStruct.OptionsBean();
        VoteEditText voteEditText2 = (VoteEditText) b(C0906R.id.aal);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText2, "et_voting_sticker_option_1");
        optionsBean.setPostOption(String.valueOf(voteEditText2.getText()));
        arrayList.add(optionsBean);
        VoteStruct.OptionsBean optionsBean2 = new VoteStruct.OptionsBean();
        VoteEditText voteEditText3 = (VoteEditText) b(C0906R.id.aam);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText3, "et_voting_sticker_option_2");
        optionsBean2.setPostOption(String.valueOf(voteEditText3.getText()));
        arrayList.add(optionsBean2);
        voteStruct.setOptions(arrayList);
        return voteStruct;
    }

    private final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f67351a, false, 77170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67351a, false, 77170, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.at2, this, false);
        if (inflate != null) {
            this.f67354d = (LinearLayout) inflate;
            LinearLayout linearLayout = this.f67354d;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("container");
            }
            addView(linearLayout);
            e.f67385b = Math.max(p.e(getContext()) / 4, this.f67353c);
            if (PatchProxy.isSupport(new Object[0], this, f67351a, false, 77172, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67351a, false, 77172, new Class[0], Void.TYPE);
                return;
            }
            VoteEditText voteEditText = (VoteEditText) b(C0906R.id.aan);
            Intrinsics.checkExpressionValueIsNotNull(voteEditText, "et_voting_sticker_title");
            ((VoteEditText) b(C0906R.id.aan)).addTextChangedListener(new c(voteEditText, (VoteEditText) b(C0906R.id.aal)));
            VoteEditText voteEditText2 = (VoteEditText) b(C0906R.id.aal);
            Intrinsics.checkExpressionValueIsNotNull(voteEditText2, "et_voting_sticker_option_1");
            ((VoteEditText) b(C0906R.id.aal)).addTextChangedListener(new b(voteEditText2, (VoteEditText) b(C0906R.id.aam)));
            VoteEditText voteEditText3 = (VoteEditText) b(C0906R.id.aam);
            Intrinsics.checkExpressionValueIsNotNull(voteEditText3, "et_voting_sticker_option_2");
            ((VoteEditText) b(C0906R.id.aam)).addTextChangedListener(new b(voteEditText3, null, 2));
            Typeface b2 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a().b("方正兰亭特黑简体");
            if (b2 != null) {
                VoteEditText voteEditText4 = (VoteEditText) b(C0906R.id.aan);
                Intrinsics.checkExpressionValueIsNotNull(voteEditText4, "et_voting_sticker_title");
                voteEditText4.setTypeface(b2);
            }
            e.a((EditText) (VoteEditText) b(C0906R.id.aan), 10.0d);
            e.a((EditText) (VoteEditText) b(C0906R.id.aal), 20.0d);
            e.a((EditText) (VoteEditText) b(C0906R.id.aam), 20.0d);
            ((VoteEditText) b(C0906R.id.aal)).setLayerType(1, null);
            ((VoteEditText) b(C0906R.id.aam)).setLayerType(1, null);
            f.b bVar = f.f71435d;
            VoteEditText voteEditText5 = (VoteEditText) b(C0906R.id.aal);
            Intrinsics.checkExpressionValueIsNotNull(voteEditText5, "et_voting_sticker_option_1");
            bVar.a(voteEditText5, Color.parseColor("#ffffff"), u.a(22.0d), Color.parseColor("#3d000000"), u.a(4.0d), 0, 0);
            f.b bVar2 = f.f71435d;
            VoteEditText voteEditText6 = (VoteEditText) b(C0906R.id.aam);
            Intrinsics.checkExpressionValueIsNotNull(voteEditText6, "et_voting_sticker_option_2");
            bVar2.a(voteEditText6, Color.parseColor("#ffffff"), u.a(22.0d), Color.parseColor("#3d000000"), u.a(4.0d), 0, 0);
            ((VoteEditText) b(C0906R.id.aan)).setOnKeyListener(d.f67363b);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VotingStickerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        d();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67351a, false, 77171, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67351a, false, 77171, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        e.f67389f = i;
        VoteEditText voteEditText = (VoteEditText) b(C0906R.id.aan);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText, "et_voting_sticker_title");
        voteEditText.setMaxLines(e.f67389f);
    }

    public final void setEditEnable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67351a, false, 77178, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67351a, false, 77178, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        VoteEditText voteEditText = (VoteEditText) b(C0906R.id.aan);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText, "et_voting_sticker_title");
        voteEditText.setEnabled(z);
        VoteEditText voteEditText2 = (VoteEditText) b(C0906R.id.aal);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText2, "et_voting_sticker_option_1");
        voteEditText2.setEnabled(z);
        VoteEditText voteEditText3 = (VoteEditText) b(C0906R.id.aam);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText3, "et_voting_sticker_option_2");
        voteEditText3.setEnabled(z);
    }

    public final void setTouchEnable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67351a, false, 77179, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67351a, false, 77179, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((VoteEditText) b(C0906R.id.aan)).setMode(z);
        ((VoteEditText) b(C0906R.id.aal)).setMode(z);
        ((VoteEditText) b(C0906R.id.aam)).setMode(z);
    }

    public final void a(@NotNull VoteStruct voteStruct) {
        if (PatchProxy.isSupport(new Object[]{voteStruct}, this, f67351a, false, 77177, new Class[]{VoteStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{voteStruct}, this, f67351a, false, 77177, new Class[]{VoteStruct.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(voteStruct, "voteStruct");
        ((VoteEditText) b(C0906R.id.aan)).setText(voteStruct.getQuestion());
        VoteStruct.OptionsBean optionsBean = voteStruct.getOptions().get(0);
        Intrinsics.checkExpressionValueIsNotNull(optionsBean, "voteStruct.options[0]");
        ((VoteEditText) b(C0906R.id.aal)).setText(optionsBean.getPostOption());
        VoteStruct.OptionsBean optionsBean2 = voteStruct.getOptions().get(1);
        Intrinsics.checkExpressionValueIsNotNull(optionsBean2, "voteStruct.options[1]");
        ((VoteEditText) b(C0906R.id.aam)).setText(optionsBean2.getPostOption());
    }

    public final void setEditTextFocusable(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67351a, false, 77174, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67351a, false, 77174, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        VoteEditText voteEditText = (VoteEditText) b(C0906R.id.aan);
        Intrinsics.checkExpressionValueIsNotNull(voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(0);
        Space space = (Space) b(C0906R.id.b_q);
        Intrinsics.checkExpressionValueIsNotNull(space, "layout_space");
        space.setVisibility(0);
        switch (i) {
            case 0:
                e.b((VoteEditText) b(C0906R.id.aan));
                return;
            case 1:
                e.b((VoteEditText) b(C0906R.id.aal));
                return;
            case 2:
                e.b((VoteEditText) b(C0906R.id.aam));
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VotingStickerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
        d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VotingStickerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
        d();
    }
}
