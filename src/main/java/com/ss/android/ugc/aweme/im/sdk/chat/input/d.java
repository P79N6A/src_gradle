package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtRadioButton;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.im.core.b.a.q;
import com.bytedance.im.core.b.e.l;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.r;
import com.bytedance.im.sugar.input.SoftInputResizeFuncLayoutView;
import com.bytedance.im.sugar.input.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter;
import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.f;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.i;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.chat.o;
import com.ss.android.ugc.aweme.im.sdk.chat.p;
import com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText;
import com.ss.android.ugc.aweme.im.sdk.chat.view.SearchableEditText;
import com.ss.android.ugc.aweme.im.sdk.d.l;
import com.ss.android.ugc.aweme.im.sdk.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.resources.k;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.ap;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.HorizontalSpaceItemDecoration;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends l implements l.a, b.a, IInputView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3364a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f3365b = "d";
    private AudioRecordBar A;
    private f B;
    private a C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    @ColorInt
    private int H;
    @ColorInt
    private int I;
    @ColorInt
    private int J;
    @ColorInt
    private int K;
    private boolean L;
    private View.OnClickListener M;
    private View.OnKeyListener N;
    private TextWatcher O;
    private com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a<c> P;
    private com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c> Q;

    /* renamed from: c  reason: collision with root package name */
    IInputView f3366c;

    /* renamed from: d  reason: collision with root package name */
    public SearchableEditText f3367d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f3368e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f3369f;
    public ImageView g;
    public ImageView h;
    ImageView i;
    public LinearLayout j;
    public ViewGroup k;
    public LinearLayout l;
    SoftInputResizeFuncLayoutView m;
    public RadioGroup n;
    public RecyclerView o;
    public TextView p;
    public SearchGifAdapter q;
    public com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b r;
    com.ss.android.ugc.aweme.im.sdk.chat.input.photo.c s;
    public o t;
    int u = 4;
    public int v = -1;
    public List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b> w;
    public b x;
    l y;
    public com.bytedance.im.core.b.e.l z = new com.bytedance.im.core.b.e.l(this);

    public interface a {
        void a(int i);
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50462a;

        /* renamed from: b  reason: collision with root package name */
        long f50463b;

        /* renamed from: c  reason: collision with root package name */
        boolean f50464c;

        /* renamed from: e  reason: collision with root package name */
        private IMUser f50466e;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f50462a, false, 50626, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50462a, false, 50626, new Class[0], Void.TYPE);
                return;
            }
            this.f50463b = SystemClock.elapsedRealtime();
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f50462a, false, 50627, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50462a, false, 50627, new Class[0], Void.TYPE);
            } else if (!m.a()) {
                IMUser iMUser = this.f50466e;
                if (iMUser != null && (iMUser.getCommerceUserLevel() != 0 || iMUser.isWithCommerceEntry())) {
                    new StringBuilder("try send user action, hasContent=").append(this.f50464c);
                    String uid = iMUser.getUid();
                    if (!TextUtils.isEmpty(uid)) {
                        com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(e.a(Long.valueOf(uid).longValue()));
                        if (a2 != null) {
                            r.a aVar = new r.a();
                            if (this.f50464c) {
                                i = 3;
                            } else {
                                i = 4;
                            }
                            aVar.a(i).a(a2).a();
                        }
                    }
                }
            }
        }

        public b() {
            this.f50466e = d.this.t.getSingleChatFromUser();
        }
    }

    public final AudioRecordBar f() {
        return this.A;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3364a, false, 50541, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3364a, false, 50541, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (this.f3367d.getText() == null || this.f3367d.getText().length() + str.length() < ad.a()) {
                if (this.v == -1) {
                    c(-2);
                }
                SearchableEditText searchableEditText = this.f3367d;
                if (PatchProxy.isSupport(new Object[]{str2}, searchableEditText, MentionEditText.f51020b, false, 51391, new Class[]{String.class}, Boolean.TYPE)) {
                    SearchableEditText searchableEditText2 = searchableEditText;
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, searchableEditText2, MentionEditText.f51020b, false, 51391, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(str2, "emojiText");
                    if (searchableEditText.getEditableText() != null) {
                        int selectionStart = searchableEditText.getSelectionStart();
                        SpannableString spannableString = new SpannableString(str2);
                        int b2 = searchableEditText.f51024d.b(str2);
                        if (b2 > 0) {
                            int lineHeight = searchableEditText.getLineHeight();
                            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(searchableEditText.getResources(), b2);
                            Intrinsics.checkExpressionValueIsNotNull(a2, "drawable");
                            a2.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a2.getIntrinsicWidth()) + 0.0f) / ((float) a2.getIntrinsicHeight()))) + 0.5f), lineHeight);
                            com.ss.android.ugc.aweme.im.sdk.chat.view.a.a(spannableString, new com.bytedance.ies.dmt.ui.common.a(a2), 0, spannableString.length(), 33);
                        }
                        Editable text = searchableEditText.getText();
                        if (text != null) {
                            text.insert(selectionStart, spannableString);
                        }
                    }
                }
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b(h(), (int) C0906R.string.aur).a();
        }
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f3364a, false, 50542, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f3364a, false, 50542, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        c(-2);
        if (!TextUtils.isEmpty(str)) {
            if (this.f3367d.getText() == null || this.f3367d.getText().length() + str.length() < ad.a()) {
                SearchableEditText searchableEditText = this.f3367d;
                if (PatchProxy.isSupport(new Object[]{str3, str4}, searchableEditText, MentionEditText.f51020b, false, 51390, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, searchableEditText, MentionEditText.f51020b, false, 51390, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(str3, "nickname");
                    Intrinsics.checkParameterIsNotNull(str4, "uid");
                    if (PatchProxy.isSupport(new Object[]{0, str3, str4}, searchableEditText, MentionEditText.f51020b, false, 51392, new Class[]{Integer.TYPE, String.class, String.class}, Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{0, str3, str4}, searchableEditText, MentionEditText.f51020b, false, 51392, new Class[]{Integer.TYPE, String.class, String.class}, Boolean.TYPE)).booleanValue();
                    } else if (searchableEditText.getEditableText() != null) {
                        int selectionStart = searchableEditText.getSelectionStart();
                        SpannableString spannableString = new SpannableString("@" + str3 + ' ');
                        com.ss.android.ugc.aweme.im.sdk.chat.view.a.a(spannableString, new MentionEditText.c(spannableString.toString(), str4, 0), 0, spannableString.length(), 33);
                        Editable editableText = searchableEditText.getEditableText();
                        Intrinsics.checkExpressionValueIsNotNull(editableText, "editableText");
                        if (editableText.length() > 0) {
                            z2 = true;
                        }
                        if (z2) {
                            int length = searchableEditText.getEditableText().length();
                            if (selectionStart > 0 && length >= selectionStart) {
                                int i2 = selectionStart - 1;
                                if (TextUtils.equals(searchableEditText.getEditableText().subSequence(i2, selectionStart), "@")) {
                                    Editable text = searchableEditText.getText();
                                    if (text != null) {
                                        text.delete(i2, selectionStart);
                                    }
                                    selectionStart--;
                                }
                            }
                        }
                        Editable text2 = searchableEditText.getText();
                        if (text2 != null) {
                            text2.insert(selectionStart, spannableString);
                        }
                    }
                }
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b(h(), (int) C0906R.string.aur).a();
        }
    }

    public final void a(List<i> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3364a, false, 50552, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3364a, false, 50552, new Class[]{List.class}, Void.TYPE);
        } else if (i()) {
            b("sendPhoto");
            UIUtils.displayToast(h(), (int) C0906R.string.avy);
        } else {
            if (bc.c()) {
                s.a().b(this.t.getConversationId(), j.fromPhotoItems(list));
            } else {
                s.a().a(this.t.getConversationId(), (List<j>) j.fromPhotoItems(list));
            }
            e();
        }
    }

    public final void a(List<i> list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f3364a, false, 50555, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f3364a, false, 50555, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context h2 = h();
        String conversationId = this.t.getConversationId();
        if (PatchProxy.isSupport(new Object[]{h2, conversationId, Integer.valueOf(i2)}, null, PhotoPreviewListActivity.f50759a, true, 51011, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{h2, conversationId, Integer.valueOf(i2)}, null, PhotoPreviewListActivity.f50759a, true, 51011, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(h2, PhotoPreviewListActivity.class);
        intent.putExtra("session_id", conversationId);
        intent.putExtra("photo_start_index", i2);
        h2.startActivity(intent);
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3364a, false, 50572, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3364a, false, 50572, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!this.f3367d.g && !TextUtils.isEmpty(this.f3367d.getText())) {
            this.f3367d.setTag(C0906R.id.m, this.f3367d.getText());
        }
        this.f3367d.setSearchable(z2);
        q();
        if (z2) {
            this.f3367d.setHint(C0906R.string.atm);
            this.q.b();
            if (!TextUtils.isEmpty(this.f3367d.getText())) {
                this.f3367d.setText("");
            }
            w();
            this.z.sendEmptyMessage(1);
            return;
        }
        p();
        this.p.setVisibility(8);
        this.o.setVisibility(8);
        CharSequence charSequence = (CharSequence) this.f3367d.getTag(C0906R.id.m);
        if (charSequence != null) {
            this.f3367d.setTag(C0906R.id.m, null);
            if (!TextUtils.equals(this.f3367d.getText(), charSequence)) {
                this.f3367d.setTag(C0906R.id.h, charSequence);
                this.f3367d.setText(charSequence);
            }
        } else if (!TextUtils.isEmpty(this.f3367d.getText())) {
            this.f3367d.setText("");
        }
        this.f3367d.setHint(C0906R.string.ato);
        Editable text = this.f3367d.getText();
        if (text != null) {
            this.f3367d.setSelection(text.length());
        }
        w();
    }

    /* access modifiers changed from: package-private */
    public void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f3364a, false, 50581, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f3364a, false, 50581, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        String a2 = ap.a(charSequence.toString());
        int i2 = this.q.f50336b;
        if (m.a()) {
            x();
            if (TextUtils.isEmpty(a2)) {
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.a(i2, this.P);
            } else {
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.a(i2, a2, this.P);
            }
        } else if (TextUtils.isEmpty(a2)) {
            b(true);
        } else if (a2.length() <= 8) {
            y();
            com.ss.android.ugc.aweme.im.sdk.utils.r.a(a2, i2, this.Q);
        }
    }

    public final void b(boolean z2) {
        ObjectAnimator objectAnimator;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3364a, false, 50587, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3364a, false, 50587, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int dimensionPixelSize = h().getResources().getDimensionPixelSize(C0906R.dimen.h6);
        if (z2) {
            objectAnimator = ObjectAnimator.ofFloat(this.o, "translationY", new float[]{0.0f, (float) dimensionPixelSize});
            objectAnimator.addListener(new Animator.AnimatorListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50446a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f50446a, false, 50609, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f50446a, false, 50609, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    d dVar = d.this;
                    if (PatchProxy.isSupport(new Object[0], dVar, d.f3364a, false, 50549, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], dVar, d.f3364a, false, 50549, new Class[0], Void.TYPE);
                        return;
                    }
                    dVar.n();
                    dVar.q.b();
                }
            });
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.o, "translationY", new float[]{(float) dimensionPixelSize, 0.0f});
        }
        objectAnimator.setDuration(60);
        objectAnimator.start();
    }

    public final void a(@NonNull Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f3364a, false, 50588, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f3364a, false, 50588, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        if (this.m.c() == -2) {
            runnable.run();
        }
    }

    public final void a(@NonNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3364a, false, 50589, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3364a, false, 50589, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.o.setVisibility(0);
        SearchGifAdapter searchGifAdapter = this.q;
        if (PatchProxy.isSupport(new Object[]{cVar2}, searchGifAdapter, SearchGifAdapter.f50335a, false, 50647, new Class[]{c.class}, Void.TYPE)) {
            SearchGifAdapter searchGifAdapter2 = searchGifAdapter;
            PatchProxy.accessDispatch(new Object[]{cVar2}, searchGifAdapter2, SearchGifAdapter.f50335a, false, 50647, new Class[]{c.class}, Void.TYPE);
        } else {
            searchGifAdapter.a();
            searchGifAdapter.a(searchGifAdapter.f50340f, cVar2);
            if (searchGifAdapter.f50340f.isEmpty()) {
                if (PatchProxy.isSupport(new Object[0], searchGifAdapter, SearchGifAdapter.f50335a, false, 50651, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], searchGifAdapter, SearchGifAdapter.f50335a, false, 50651, new Class[0], Void.TYPE);
                } else {
                    searchGifAdapter.f50340f.add(new com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a());
                    searchGifAdapter.a(false, 0);
                }
            }
            searchGifAdapter.notifyDataSetChanged();
            searchGifAdapter.f50337c = false;
        }
        this.o.scrollToPosition(0);
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50593, new Class[0], Void.TYPE);
        } else if (this.w == null) {
            this.w = new ArrayList();
        } else {
            this.w.clear();
        }
        b(cVar);
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c cVar) {
        com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3364a, false, 50590, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3364a, false, 50590, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE);
            return;
        }
        SearchGifAdapter searchGifAdapter = this.q;
        if (PatchProxy.isSupport(new Object[]{cVar2}, searchGifAdapter, SearchGifAdapter.f50335a, false, 50642, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE)) {
            SearchGifAdapter searchGifAdapter2 = searchGifAdapter;
            PatchProxy.accessDispatch(new Object[]{cVar2}, searchGifAdapter2, SearchGifAdapter.f50335a, false, 50642, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE);
        } else {
            searchGifAdapter.a();
            searchGifAdapter.a(searchGifAdapter.f50340f, cVar2);
            searchGifAdapter.notifyDataSetChanged();
            searchGifAdapter.f50337c = false;
        }
        this.o.scrollToPosition(0);
    }

    private void q() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50529, new Class[0], Void.TYPE);
            return;
        }
        SearchableEditText searchableEditText = this.f3367d;
        if (this.F || this.f3367d.g) {
            i2 = 2130840472;
        }
        searchableEditText.setBackgroundResource(i2);
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50540, new Class[0], Void.TYPE);
            return;
        }
        if (!this.G || this.t.isEnterpriseChat()) {
            this.f3368e.setVisibility(8);
        }
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50546, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50546, new Class[0], Void.TYPE);
            return;
        }
        if (this.D) {
            this.g.setImageResource(2130840490);
        }
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50576, new Class[0], Void.TYPE);
            return;
        }
        if (this.z.hasMessages(1)) {
            this.z.removeMessages(1);
        }
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50584, new Class[0], Void.TYPE);
            return;
        }
        if (this.P == null) {
            this.P = new com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.b<c>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50442a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f50442a, false, 50624, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50442a, false, 50624, new Class[0], Void.TYPE);
                        return;
                    }
                    super.a();
                    if (d.this.f3367d.g) {
                        d.this.p();
                        SearchGifAdapter searchGifAdapter = d.this.q;
                        if (searchGifAdapter.f50337c) {
                            searchGifAdapter.f50337c = false;
                        }
                        d.this.p.setVisibility(8);
                        d.this.o.setVisibility(0);
                        com.bytedance.ies.dmt.ui.d.a.b(d.this.h(), (int) C0906R.string.ave).a();
                    }
                }

                public final /* synthetic */ void b(@Nonnull Object obj) {
                    c cVar = (c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f50442a, false, 50622, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f50442a, false, 50622, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    super.b(cVar);
                    if (d.this.f3367d.g) {
                        d.this.a(cVar);
                        d.this.p();
                        d.this.p.setVisibility(8);
                    }
                }

                public final /* synthetic */ void c(@Nonnull Object obj) {
                    c cVar = (c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f50442a, false, 50621, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f50442a, false, 50621, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    super.c(cVar);
                    if (d.this.f3367d.g) {
                        d.this.a(cVar);
                        d.this.p.setVisibility(0);
                        d.this.p();
                        d.this.z.sendEmptyMessageDelayed(2, 3000);
                    }
                }

                public final /* synthetic */ void a(@Nonnull Object obj) {
                    c cVar = (c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f50442a, false, 50623, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f50442a, false, 50623, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    super.a(cVar);
                    if (d.this.f3367d.g) {
                        SearchGifAdapter searchGifAdapter = d.this.q;
                        if (PatchProxy.isSupport(new Object[]{cVar}, searchGifAdapter, SearchGifAdapter.f50335a, false, 50648, new Class[]{c.class}, Void.TYPE)) {
                            SearchGifAdapter searchGifAdapter2 = searchGifAdapter;
                            PatchProxy.accessDispatch(new Object[]{cVar}, searchGifAdapter2, SearchGifAdapter.f50335a, false, 50648, new Class[]{c.class}, Void.TYPE);
                        } else {
                            ArrayList arrayList = new ArrayList(searchGifAdapter.f50340f);
                            searchGifAdapter.a(searchGifAdapter.f50340f, cVar);
                            searchGifAdapter.a(searchGifAdapter.f50340f, (List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a>) arrayList);
                            searchGifAdapter.f50337c = false;
                        }
                        d.this.b(cVar);
                    }
                }
            };
        }
    }

    private void y() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50585, new Class[0], Void.TYPE);
            return;
        }
        if (this.Q == null) {
            this.Q = new com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.b<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50444a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f50444a, false, 50605, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50444a, false, 50605, new Class[0], Void.TYPE);
                        return;
                    }
                    super.a();
                    d.this.a((Runnable) new k(this));
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ void a(@NonNull com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c cVar) {
                    SearchGifAdapter searchGifAdapter = d.this.q;
                    if (PatchProxy.isSupport(new Object[]{cVar}, searchGifAdapter, SearchGifAdapter.f50335a, false, 50644, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE)) {
                        SearchGifAdapter searchGifAdapter2 = searchGifAdapter;
                        PatchProxy.accessDispatch(new Object[]{cVar}, searchGifAdapter2, SearchGifAdapter.f50335a, false, 50644, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE);
                    } else {
                        ArrayList arrayList = new ArrayList(searchGifAdapter.f50340f);
                        searchGifAdapter.a(searchGifAdapter.f50340f, cVar);
                        searchGifAdapter.a(searchGifAdapter.f50340f, (List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a>) arrayList);
                        searchGifAdapter.f50337c = false;
                    }
                    d.this.n();
                    d.this.o();
                }

                public final /* synthetic */ void b(@NonNull Object obj) {
                    com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c cVar = (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f50444a, false, 50603, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f50444a, false, 50603, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE);
                        return;
                    }
                    super.b(cVar);
                    d.this.a((Runnable) new i(this, cVar));
                }

                public final /* synthetic */ void a(@NonNull Object obj) {
                    com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c cVar = (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f50444a, false, 50604, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f50444a, false, 50604, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c.class}, Void.TYPE);
                        return;
                    }
                    super.a(cVar);
                    d.this.a((Runnable) new j(this, cVar));
                }
            };
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50560, new Class[0], Void.TYPE);
            return;
        }
        this.f3367d.setText("");
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50596, new Class[0], Void.TYPE);
            return;
        }
        this.m.b();
    }

    public final Context h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3364a, false, 50550, new Class[0], Context.class)) {
            return this.k.getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50550, new Class[0], Context.class);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50569, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3366c == null) {
            this.f3366c = new com.ss.android.ugc.aweme.im.sdk.a.d(this, h());
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50571, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.im.sdk.d.a.b().enableExpressionTab()) {
            this.n.setVisibility(8);
            a(false);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50574, new Class[0], Void.TYPE);
            return;
        }
        w();
        this.z.sendEmptyMessageDelayed(1, 200);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50577, new Class[0], Void.TYPE);
            return;
        }
        if (this.z.hasMessages(3)) {
            this.z.removeMessages(3);
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50578, new Class[0], Void.TYPE);
            return;
        }
        this.z.sendEmptyMessageDelayed(3, 5000);
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50579, new Class[0], Void.TYPE);
            return;
        }
        if (this.z.hasMessages(2)) {
            this.z.removeMessages(2);
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50544, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.im.sdk.d.a.b().enableExpressionTab() && this.n.getVisibility() == 0) {
            l();
        }
        t();
        u();
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50545, new Class[0], Void.TYPE);
            return;
        }
        if (this.E && this.f3369f.isSelected()) {
            this.f3369f.setImageResource(2130840480);
            this.f3369f.setContentDescription(h().getResources().getString(C0906R.string.aoj));
            this.f3369f.setSelected(false);
        }
    }

    private void v() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50564, new Class[0], Void.TYPE);
            return;
        }
        if (this.H == 0) {
            Resources resources = this.j.getResources();
            this.H = resources.getColor(C0906R.color.ed);
            this.J = resources.getColor(C0906R.color.ee);
            this.I = resources.getColor(C0906R.color.ec);
            this.K = resources.getColor(C0906R.color.ef);
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50595, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50595, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.m.a()) {
            e();
            return true;
        } else {
            if (h() instanceof ChatRoomActivity) {
                ((Activity) h()).finish();
            }
            return false;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50539, new Class[0], Void.TYPE);
            return;
        }
        r();
        if (!this.D) {
            this.g.setVisibility(8);
        }
        if (!this.E) {
            this.f3369f.setVisibility(8);
        }
        if (!this.F) {
            this.i.setVisibility(8);
        }
    }

    public final boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50554, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50554, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.t.isGroupChat()) {
            return false;
        } else {
            IMUser b2 = com.ss.android.ugc.aweme.im.sdk.d.e.a().b(String.valueOf(e.a(this.t.getConversationId())));
            if (!m.a() && ((b2 != null && b2.getCommerceUserLevel() > 0) || (com.ss.android.ugc.aweme.im.sdk.utils.d.c() != null && com.ss.android.ugc.aweme.im.sdk.utils.d.c().getCommerceUserLevel() > 0))) {
                return false;
            }
            if (b2 == null || (b2.getFollowStatus() != 2 && !com.ss.android.ugc.aweme.im.sdk.utils.d.a(b2))) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50568, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50568, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.t.isGroupChat()) {
            return false;
        } else {
            IMUser b2 = com.ss.android.ugc.aweme.im.sdk.d.e.a().b(String.valueOf(e.a(this.t.getConversationId())));
            if (b2 == null || (b2.getFollowStatus() != 2 && !com.ss.android.ugc.aweme.im.sdk.utils.d.a(b2))) {
                return true;
            }
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50556, new Class[0], Void.TYPE);
            return;
        }
        Context h2 = h();
        String conversationId = this.t.getConversationId();
        if (PatchProxy.isSupport(new Object[]{h2, conversationId}, null, PhotoSelectActivity.f50773a, true, 51028, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{h2, conversationId}, null, PhotoSelectActivity.f50773a, true, 51028, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(h2, PhotoSelectActivity.class);
        intent.putExtra("session_id", conversationId);
        h2.startActivity(intent);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50558, new Class[0], Void.TYPE);
            return;
        }
        Editable text = this.f3367d.getText();
        if (text != null) {
            if (TextUtils.isEmpty(text.toString())) {
                UIUtils.displayToast(h(), (int) C0906R.string.av8);
            } else if (text.length() >= ad.a()) {
                UIUtils.displayToast(h(), GlobalContext.getContext().getResources().getString(C0906R.string.aur));
            } else {
                TextContent obtain = TextContent.obtain(text.toString());
                String conversationId = this.t.getConversationId();
                if (PatchProxy.isSupport(new Object[]{conversationId, obtain}, null, com.ss.android.ugc.aweme.im.sdk.c.a.f22842a, true, 51684, new Class[]{String.class, BaseContent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{conversationId, obtain}, null, com.ss.android.ugc.aweme.im.sdk.c.a.f22842a, true, 51684, new Class[]{String.class, BaseContent.class}, Void.TYPE);
                } else if (obtain != null) {
                    Map a2 = com.ss.android.ugc.aweme.im.sdk.c.a.a(conversationId);
                    Integer a3 = com.ss.android.ugc.aweme.im.sdk.c.a.a(a2);
                    if (a3 != null) {
                        if (a3.intValue() > 0) {
                            obtain.setType(771);
                        }
                        int intValue = a3.intValue() - 1;
                        if (intValue > 0) {
                            a2.put("commercialize.personal_info_count", Integer.toString(intValue));
                        } else {
                            a2.remove("commercialize.personal_info_count");
                        }
                        com.ss.android.ugc.aweme.im.sdk.c.a.a(conversationId, a2);
                    }
                }
                ba.a().b(this.t.getConversationId(), (BaseContent) obtain, (ba.a) new ba.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50460a;

                    public final void onSendFailure(com.bytedance.im.core.d.j jVar) {
                    }

                    public final void onSendSuccess(n nVar) {
                        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50460a, false, 50618, new Class[]{n.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{nVar}, this, f50460a, false, 50618, new Class[]{n.class}, Void.TYPE);
                            return;
                        }
                        if (d.this.t instanceof p) {
                            z a2 = z.a();
                            com.ss.android.ugc.aweme.im.service.model.a imAdLog = ((p) d.this.t).getImAdLog();
                            if (PatchProxy.isSupport(new Object[]{imAdLog}, a2, z.f52670a, false, 53598, new Class[]{com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE)) {
                                z zVar = a2;
                                PatchProxy.accessDispatch(new Object[]{imAdLog}, zVar, z.f52670a, false, 53598, new Class[]{com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE);
                            } else if (imAdLog != null) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                    jSONObject.put("value", imAdLog.getCreativeId());
                                    jSONObject.put("log_extra", imAdLog.getLogExtra());
                                    jSONObject.put("value", imAdLog.getCreativeId());
                                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("message_ad").setLabelName("message_action").setJsonObject(jSONObject));
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }

                    public final void onSend(com.bytedance.im.core.d.b bVar, List<n> list) {
                        List<n> list2 = list;
                        if (PatchProxy.isSupport(new Object[]{bVar, list2}, this, f50460a, false, 50617, new Class[]{com.bytedance.im.core.d.b.class, List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar, list2}, this, f50460a, false, 50617, new Class[]{com.bytedance.im.core.d.b.class, List.class}, Void.TYPE);
                            return;
                        }
                        if (d.this.t.isGroupChat() && list2 != null) {
                            for (int i = 0; i < list.size(); i++) {
                                List mentionIds = d.this.f3367d.getMentionIds();
                                if (mentionIds != null && !mentionIds.isEmpty()) {
                                    n nVar = list2.get(i);
                                    if (PatchProxy.isSupport(new Object[]{nVar, mentionIds}, null, ad.f52467a, true, 53665, new Class[]{n.class, List.class}, n.class)) {
                                        n nVar2 = (n) PatchProxy.accessDispatch(new Object[]{nVar, mentionIds}, null, ad.f52467a, true, 53665, new Class[]{n.class, List.class}, n.class);
                                    } else if (mentionIds != null && !mentionIds.isEmpty()) {
                                        nVar.getExt().put("s:mentioned_users", q.a(mentionIds, ","));
                                    }
                                }
                            }
                        }
                    }
                });
                this.f3367d.setText("");
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50562, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b bVar = this.r;
            if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b.f50552d, false, 50788, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b.f50552d, false, 50788, new Class[0], Void.TYPE);
            } else {
                k.a().b(bVar);
                com.ss.android.ugc.aweme.im.sdk.resources.b a2 = com.ss.android.ugc.aweme.im.sdk.resources.b.a();
                if (PatchProxy.isSupport(new Object[]{bVar}, a2, com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a, false, 53074, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.d.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.im.sdk.resources.b bVar2 = a2;
                    PatchProxy.accessDispatch(new Object[]{bVar}, bVar2, com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a, false, 53074, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.d.class}, Void.TYPE);
                } else {
                    a2.f52265e.remove(bVar);
                }
            }
        }
        if (this.y != null) {
            this.y.a();
            this.y = null;
        }
        com.ss.android.ugc.aweme.im.sdk.chat.input.photo.m.a().f();
    }

    public void onResume() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50561, new Class[0], Void.TYPE);
            return;
        }
        if (this.v == 2 && this.s != null) {
            this.s.f();
        }
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50528, new Class[0], Void.TYPE);
            return;
        }
        if (this.G && !j() && !this.t.isEnterpriseChat()) {
            com.ss.android.ugc.aweme.im.sdk.utils.o a2 = com.ss.android.ugc.aweme.im.sdk.utils.o.a();
            if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.utils.o.f52605a, false, 53430, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.utils.o.f52605a, false, 53430, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z2 = a2.f52608b.getBoolean("hint_start_video_chat", true);
            }
            if (z2) {
                Context h2 = h();
                if (h2 instanceof Activity) {
                    Activity activity = (Activity) h2;
                    View inflate = LayoutInflater.from(activity).inflate(C0906R.layout.vg, this.k, false);
                    com.ss.android.ugc.aweme.im.sdk.chat.view.b bVar = new com.ss.android.ugc.aweme.im.sdk.chat.view.b();
                    bVar.a(inflate, activity);
                    bVar.f51039b = 0;
                    this.f3368e.postDelayed(new e(this, activity, bVar, inflate), 800);
                }
            }
        }
    }

    public final void a(a aVar) {
        this.C = aVar;
    }

    public final void a(MentionEditText.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f3364a, false, 50525, new Class[]{MentionEditText.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f3364a, false, 50525, new Class[]{MentionEditText.e.class}, Void.TYPE);
            return;
        }
        if (this.f3367d != null) {
            this.f3367d.setMOnMentionInputListener(eVar);
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.sdk.chat.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3364a, false, 50563, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3364a, false, 50563, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.a.a.class}, Void.TYPE);
            return;
        }
        e();
    }

    private void b(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3364a, false, 50583, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3364a, false, 50583, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.B == null) {
            this.B = new f(this, this.k, this.t.getConversationId());
        }
        this.B.a(list);
    }

    private void c(List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3364a, false, 50592, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3364a, false, 50592, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.w == null) {
            this.w = new ArrayList();
        }
        this.w.addAll(list);
    }

    private void c(boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3364a, false, 50565, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3364a, false, 50565, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.L != z2) {
            this.L = z2;
            v();
            SearchableEditText searchableEditText = this.f3367d;
            if (z2) {
                i2 = this.H;
            } else {
                i2 = this.J;
            }
            searchableEditText.setHintTextColor(i2);
            SearchableEditText searchableEditText2 = this.f3367d;
            if (z2) {
                i3 = this.I;
            } else {
                i3 = this.K;
            }
            searchableEditText2.setTextColor(i3);
            this.f3367d.setSelected(z2);
            this.g.setActivated(z2);
            this.f3369f.setActivated(z2);
            if (z2) {
                d(4);
            }
            ImageView imageView = this.i;
            if (z2) {
                i4 = 2130839010;
            } else {
                i4 = 2130840497;
            }
            imageView.setImageResource(i4);
            LinearLayout linearLayout = this.j;
            if (z2) {
                i5 = 2130838050;
            } else {
                i5 = 2130838051;
            }
            linearLayout.setBackgroundResource(i5);
            g();
        }
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3364a, false, 50551, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3364a, false, 50551, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if ((this.m.c() == 2 || this.m.c() == 1) && i2 == 5) {
            this.g.setImageResource(2130840490);
            e();
        }
        if (i2 != 5) {
            this.A.setVisibility(8);
            this.f3367d.setVisibility(0);
            if (this.u != i2) {
                this.i.setSelected(!this.i.isSelected());
                this.i.setContentDescription(h().getResources().getString(C0906R.string.aog));
            }
            this.u = 4;
        } else if (i()) {
            UIUtils.displayToast(h(), (int) C0906R.string.aw0);
        } else {
            this.A.setVisibility(0);
            this.f3367d.setVisibility(8);
            if (this.u != i2) {
                this.i.setSelected(!this.i.isSelected());
                this.i.setContentDescription(h().getResources().getString(C0906R.string.aoq));
            }
            this.u = 5;
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{67}, this, f3364a, false, 50557, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{67}, this, f3364a, false, 50557, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (!this.f3367d.a()) {
            this.f3367d.dispatchKeyEvent(keyEvent);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3364a, false, 50597, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3364a, false, 50597, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.k.setVisibility(i2);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3364a, false, 50547, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3364a, false, 50547, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.m.c() == 2 && i2 != this.m.c()) {
            this.g.setImageResource(2130840490);
        }
        if (this.B != null) {
            this.B.a(null);
        }
        if (i2 == -1) {
            e();
        } else if (i2 == -2) {
            this.m.e();
        } else if (i2 != 1) {
            if (i2 == 2) {
                if (this.m.c() == 2) {
                    this.g.setImageResource(2130840490);
                    e();
                } else if (i()) {
                    b("sendPhoto");
                    UIUtils.displayToast(h(), (int) C0906R.string.avy);
                } else {
                    com.ss.android.ugc.aweme.im.sdk.chat.input.photo.k.a().a((Activity) h(), new g(this));
                }
            }
        } else if (this.m.c() == 1) {
            e();
        } else {
            this.r.e();
            this.m.a(1);
        }
    }

    public final void b(@NonNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3364a, false, 50591, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3364a, false, 50591, new Class[]{c.class}, Void.TYPE);
            return;
        }
        g gVar = cVar2.f50620a;
        if (gVar != null && gVar.f50625a != null && gVar.f50625a.size() > 0) {
            c(gVar.f50625a);
        }
    }

    public final void a(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f3364a, false, 50575, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f3364a, false, 50575, new Class[]{Message.class}, Void.TYPE);
        } else if (message.what == 1) {
            this.q.f50336b = 0;
            a((CharSequence) this.f3367d.getText());
        } else if (message.what == 2) {
            this.p.setVisibility(8);
        } else {
            if (message.what == 3) {
                b(true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.CharSequence r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f3364a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 50582(0xc596, float:7.088E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f3364a
            r13 = 0
            r14 = 50582(0xc596, float:7.088E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            com.ss.android.ugc.aweme.im.sdk.resources.b r2 = com.ss.android.ugc.aweme.im.sdk.resources.b.a()
            boolean r2 = r2.d()
            if (r2 != 0) goto L_0x00ad
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            r3 = 0
            if (r2 == 0) goto L_0x0048
        L_0x0045:
            r0 = r17
            goto L_0x00a9
        L_0x0048:
            com.ss.android.ugc.aweme.im.sdk.resources.b r2 = com.ss.android.ugc.aweme.im.sdk.resources.b.a()
            java.lang.String r0 = r18.toString()
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a
            r13 = 0
            r14 = 53079(0xcf57, float:7.438E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r15[r9] = r4
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r11 = r2
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0084
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a
            r13 = 0
            r14 = 53079(0xcf57, float:7.438E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r11 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            goto L_0x0045
        L_0x0084:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f52263c
            if (r1 == 0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f52263c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0045
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0097
            goto L_0x0045
        L_0x0097:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f52264d
            java.util.List r1 = r2.a((java.util.Map<java.lang.String, java.lang.String>) r1, (java.lang.String) r0)
            if (r1 != 0) goto L_0x00a7
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f52263c
            java.util.List r0 = r2.a((java.util.Map<java.lang.String, java.lang.String>) r1, (java.lang.String) r0)
            r3 = r0
            goto L_0x0045
        L_0x00a7:
            r3 = r1
            goto L_0x0045
        L_0x00a9:
            r0.b((java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>) r3)
            goto L_0x00af
        L_0x00ad:
            r0 = r17
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.d.b(java.lang.CharSequence):void");
    }

    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c cVar) {
        com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3364a, false, 50559, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3364a, false, 50559, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c.class}, Void.TYPE);
            return;
        }
        int stickerType = cVar2.f50557a.getStickerType();
        if ((stickerType == 2 || stickerType == 3) && i()) {
            UIUtils.displayToast(h(), (int) C0906R.string.ar8);
        } else {
            ba.a().b(this.t.getConversationId(), (BaseContent) EmojiContent.obtain(cVar2.f50557a));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3364a, false, 50553, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3364a, false, 50553, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            IMUser b2 = com.ss.android.ugc.aweme.im.sdk.d.e.a().b(String.valueOf(e.a(this.t.getConversationId())));
            com.ss.android.ugc.aweme.framework.a.a.a("User Follow Status : toUser=" + b2.toString() + " fromUser=" + com.ss.android.ugc.aweme.im.sdk.utils.l.a(com.ss.android.ugc.aweme.im.sdk.utils.d.c()) + " type=" + str2);
        } catch (Exception unused) {
        }
    }

    public static d a(@NonNull ViewGroup viewGroup, o oVar) {
        ViewGroup viewGroup2 = viewGroup;
        o oVar2 = oVar;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, oVar2}, null, f3364a, true, 50524, new Class[]{ViewGroup.class, o.class}, d.class)) {
            return new d(viewGroup2, oVar2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{viewGroup2, oVar2}, null, f3364a, true, 50524, new Class[]{ViewGroup.class, o.class}, d.class);
    }

    private d(ViewGroup viewGroup, o oVar) {
        int i2;
        this.t = oVar;
        this.D = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().enableSendPic();
        this.G = com.ss.android.ugc.aweme.im.sdk.d.a.b().enableMediaRecord();
        this.E = com.ss.android.ugc.aweme.im.sdk.d.a.b().enableSendEmoji();
        this.F = com.ss.android.ugc.aweme.im.sdk.d.a.b().enableSendVoice();
        if (viewGroup.getContext() instanceof AbsActivity) {
            ((AbsActivity) viewGroup.getContext()).registerLifeCycleMonitor(this);
        }
        this.x = new b();
        this.k = (ViewGroup) viewGroup.findViewById(C0906R.id.auu);
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f3364a, false, 50526, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f3364a, false, 50526, new Class[]{ViewGroup.class}, Void.TYPE);
        } else {
            this.f3367d = (SearchableEditText) viewGroup.findViewById(C0906R.id.bnu);
            q();
            this.j = (LinearLayout) viewGroup.findViewById(C0906R.id.a8n);
            this.l = (LinearLayout) viewGroup.findViewById(C0906R.id.b8z);
            this.f3368e = (ImageView) viewGroup.findViewById(C0906R.id.b2h);
            this.f3369f = (ImageView) viewGroup.findViewById(C0906R.id.a9c);
            this.g = (ImageView) viewGroup.findViewById(C0906R.id.bxo);
            this.h = (ImageView) viewGroup.findViewById(C0906R.id.cno);
            this.i = (ImageView) viewGroup.findViewById(C0906R.id.cy7);
            this.A = (AudioRecordBar) viewGroup.findViewById(C0906R.id.bn3);
            this.n = (RadioGroup) viewGroup.findViewById(C0906R.id.ce7);
            this.o = (RecyclerView) viewGroup.findViewById(C0906R.id.cii);
            this.p = (TextView) viewGroup.findViewById(C0906R.id.dc9);
            RecyclerView recyclerView = this.o;
            if (m.a()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            recyclerView.setVisibility(i2);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(h());
            linearLayoutManager.setOrientation(0);
            this.o.setLayoutManager(linearLayoutManager);
            this.o.addItemDecoration(new HorizontalSpaceItemDecoration(h().getResources().getDimensionPixelSize(C0906R.dimen.he)));
            this.q = new SearchGifAdapter(this.o);
            this.o.setAdapter(this.q);
            this.m = (SoftInputResizeFuncLayoutView) viewGroup.findViewById(C0906R.id.bw9);
            this.m.setEditText(this.f3367d);
            this.m.setResizable(false);
            g();
        }
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50530, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50566, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50566, new Class[0], Void.TYPE);
            } else if (this.M == null) {
                this.M = new h(this);
            }
            if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50573, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50573, new Class[0], Void.TYPE);
            } else if (this.O == null) {
                this.O = new com.ss.android.ugc.aweme.base.ui.c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50440a;

                    public final void afterTextChanged(Editable editable) {
                        boolean z;
                        if (PatchProxy.isSupport(new Object[]{editable}, this, f50440a, false, 50619, new Class[]{Editable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{editable}, this, f50440a, false, 50619, new Class[]{Editable.class}, Void.TYPE);
                            return;
                        }
                        if (TextUtils.isEmpty(editable)) {
                            if (d.this.r != null) {
                                d.this.r.a(false);
                            }
                            d.this.h.setActivated(false);
                            d.this.h.setVisibility(8);
                            d.this.g.setVisibility(0);
                        } else {
                            if (d.this.r != null) {
                                d.this.r.a(true);
                            }
                            d.this.h.setActivated(true);
                            d.this.h.setVisibility(0);
                            d.this.g.setVisibility(8);
                        }
                        d dVar = d.this;
                        if (PatchProxy.isSupport(new Object[0], dVar, d.f3364a, false, 50580, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], dVar, d.f3364a, false, 50580, new Class[0], Void.TYPE);
                        } else if (com.ss.android.ugc.aweme.im.sdk.d.a.b().enableExpressionTab() && dVar.f3367d.g) {
                            dVar.h.setVisibility(8);
                            dVar.h.setActivated(false);
                        }
                        d.this.g();
                        b bVar = d.this.x;
                        if (editable.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, bVar, b.f50462a, false, 50625, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            b bVar2 = bVar;
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, bVar2, b.f50462a, false, 50625, new Class[]{Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        new StringBuilder("onStatusChanged hasContent=").append(z);
                        bVar.f50464c = z;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j = bVar.f50463b + 2000;
                        if (j <= elapsedRealtime || !z) {
                            bVar.f50463b = elapsedRealtime;
                            bVar.a();
                            return;
                        }
                        d.this.k.removeCallbacks(bVar);
                        d.this.k.postDelayed(bVar, j - elapsedRealtime);
                    }

                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        CharSequence charSequence2 = charSequence;
                        if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f50440a, false, 50620, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f50440a, false, 50620, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        } else if (com.ss.android.ugc.aweme.im.sdk.d.a.b().enableExpressionTab() && d.this.f3367d.g) {
                            d.this.m();
                        } else if (m.a() || com.ss.android.ugc.aweme.global.config.settings.g.b().bJ().getShow().intValue() != 1 || com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getAssociativeEmoji() != 1 || charSequence.length() > 8) {
                            CharSequence charSequence3 = (CharSequence) d.this.f3367d.getTag(C0906R.id.h);
                            if (charSequence3 == null || !TextUtils.equals(charSequence3, charSequence)) {
                                d.this.b(charSequence);
                            } else {
                                d.this.f3367d.setTag(C0906R.id.h, null);
                            }
                        } else {
                            d.this.m();
                        }
                    }
                };
            }
            if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50594, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50594, new Class[0], Void.TYPE);
            } else if (this.N == null) {
                this.N = new View.OnKeyListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50448a;

                    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                        View view2 = view;
                        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), keyEvent}, this, f50448a, false, 50610, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), keyEvent}, this, f50448a, false, 50610, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                        } else if (view.equals(d.this.f3367d) && i == 4 && keyEvent.getAction() == 0) {
                            return d.this.d();
                        } else {
                            return false;
                        }
                    }
                };
            }
            this.f3367d.removeTextChangedListener(this.O);
            this.f3367d.addTextChangedListener(this.O);
            this.f3367d.setFilters(new InputFilter[]{new com.ss.android.ugc.aweme.im.sdk.chat.q(ad.a())});
            this.f3367d.setOnKeyListener(this.N);
            this.f3367d.setOnClickListener(this.M);
            this.f3367d.setOnFocusChangeListener(new View.OnFocusChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50450a;

                public final void onFocusChange(View view, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f50450a, false, 50611, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f50450a, false, 50611, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!z) {
                        d.this.e();
                    }
                }
            });
            this.h.setOnClickListener(this.M);
            this.f3369f.setOnClickListener(this.M);
            this.g.setOnClickListener(this.M);
            this.i.setOnClickListener(this.M);
            this.f3368e.setOnClickListener(this.M);
            if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50531, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50531, new Class[0], Void.TYPE);
            } else {
                this.n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50454a;

                    /* renamed from: b  reason: collision with root package name */
                    DmtRadioButton f50455b = ((DmtRadioButton) d.this.n.findViewById(C0906R.id.ca0));

                    /* renamed from: c  reason: collision with root package name */
                    DmtRadioButton f50456c = ((DmtRadioButton) d.this.n.findViewById(C0906R.id.ca1));

                    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                        if (PatchProxy.isSupport(new Object[]{radioGroup, Integer.valueOf(i)}, this, f50454a, false, 50613, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{radioGroup, Integer.valueOf(i)}, this, f50454a, false, 50613, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE);
                        } else if (i == C0906R.id.ca0) {
                            d.this.c(1);
                            d.this.a(false);
                            this.f50455b.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20595b);
                            this.f50456c.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20594a);
                        } else {
                            d.this.c(-2);
                            d.this.a(true);
                            this.f50455b.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20594a);
                            this.f50456c.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20595b);
                        }
                    }
                });
            }
            if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50532, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50532, new Class[0], Void.TYPE);
            } else {
                this.q.h = new SearchGifAdapter.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50458a;

                    public final void a(int i) {
                        int i2 = i;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50458a, false, 50614, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50458a, false, 50614, new Class[]{Integer.TYPE}, Void.TYPE);
                        } else if (i2 >= 0) {
                            if (d.this.i()) {
                                com.bytedance.ies.dmt.ui.d.a.b(d.this.h(), (int) C0906R.string.ar8).a();
                                return;
                            }
                            com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b bVar = d.this.w.get(i2);
                            if (bVar != null && bVar.f50618b != null && bVar.f50618b.f50621a != null) {
                                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b bVar2 = bVar.f50618b.f50621a;
                                d dVar = d.this;
                                if (PatchProxy.isSupport(new Object[]{bVar, bVar2}, dVar, d.f3364a, false, 50535, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b.class, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bVar, bVar2}, dVar, d.f3364a, false, 50535, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b.class, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b.class}, Void.TYPE);
                                } else {
                                    com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar = new com.ss.android.ugc.aweme.im.sdk.resources.model.a();
                                    aVar.setAnimateType(bVar.f50617a);
                                    aVar.setStickerType(3);
                                    aVar.setWidth(Integer.parseInt(bVar2.f50597b));
                                    aVar.setHeight(Integer.parseInt(bVar2.f50598c));
                                    aVar.setDisplayName(dVar.h().getString(C0906R.string.auy));
                                    List singletonList = Collections.singletonList(bVar2.f50596a);
                                    UrlModel urlModel = new UrlModel();
                                    urlModel.setUrlList(singletonList);
                                    aVar.setAnimateUrl(urlModel);
                                    com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c cVar = new com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c();
                                    cVar.f50557a = aVar;
                                    dVar.k();
                                    dVar.f3366c.a(cVar);
                                }
                                d dVar2 = d.this;
                                if (PatchProxy.isSupport(new Object[]{bVar}, dVar2, d.f3364a, false, 50537, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bVar}, dVar2, d.f3364a, false, 50537, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b.class}, Void.TYPE);
                                    return;
                                }
                                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.a aVar2 = bVar.f50619c;
                                if (!(aVar2 == null || aVar2.f50613a == null || TextUtils.isEmpty(aVar2.f50613a.f50622a))) {
                                    String str = aVar2.f50613a.f50622a + "&ts=" + System.currentTimeMillis();
                                    if (PatchProxy.isSupport(new Object[]{str}, null, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.f50594a, true, 50892, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str}, null, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.f50594a, true, 50892, new Class[]{String.class}, Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.f50595b.giphyAnalytics(str);
                                }
                            }
                        }
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a>} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
                    /* JADX WARNING: Multi-variable type inference failed */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b r30) {
                        /*
                            r29 = this;
                            r7 = r29
                            r8 = r30
                            r9 = 1
                            java.lang.Object[] r0 = new java.lang.Object[r9]
                            r10 = 0
                            r0[r10] = r8
                            com.meituan.robust.ChangeQuickRedirect r2 = f50458a
                            java.lang.Class[] r5 = new java.lang.Class[r9]
                            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b> r1 = com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b.class
                            r5[r10] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r3 = 0
                            r4 = 50615(0xc5b7, float:7.0927E-41)
                            r1 = r29
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                            if (r0 == 0) goto L_0x0038
                            java.lang.Object[] r0 = new java.lang.Object[r9]
                            r0[r10] = r8
                            com.meituan.robust.ChangeQuickRedirect r2 = f50458a
                            r3 = 0
                            r4 = 50615(0xc5b7, float:7.0927E-41)
                            java.lang.Class[] r5 = new java.lang.Class[r9]
                            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b> r1 = com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b.class
                            r5[r10] = r1
                            java.lang.Class r6 = java.lang.Void.TYPE
                            r1 = r29
                            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                            return
                        L_0x0038:
                            if (r8 != 0) goto L_0x003b
                            return
                        L_0x003b:
                            com.ss.android.ugc.aweme.im.sdk.chat.input.d r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.d.this
                            java.lang.Object[] r11 = new java.lang.Object[r9]
                            r11[r10] = r8
                            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.chat.input.d.f3364a
                            r14 = 0
                            r15 = 50533(0xc565, float:7.0812E-41)
                            java.lang.Class[] r1 = new java.lang.Class[r9]
                            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b> r2 = com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b.class
                            r1[r10] = r2
                            java.lang.Class r17 = java.lang.Void.TYPE
                            r12 = r0
                            r16 = r1
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                            if (r1 == 0) goto L_0x0072
                            java.lang.Object[] r11 = new java.lang.Object[r9]
                            r11[r10] = r8
                            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.chat.input.d.f3364a
                            r14 = 0
                            r15 = 50533(0xc565, float:7.0812E-41)
                            java.lang.Class[] r1 = new java.lang.Class[r9]
                            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b> r2 = com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b.class
                            r1[r10] = r2
                            java.lang.Class r17 = java.lang.Void.TYPE
                            r12 = r0
                            r16 = r1
                            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                            goto L_0x01ee
                        L_0x0072:
                            int r1 = r8.f50602c
                            r2 = 2
                            if (r1 != r2) goto L_0x01ee
                            java.lang.String r1 = "null"
                            java.lang.String r3 = ","
                            java.lang.CharSequence r4 = com.ss.android.ugc.aweme.im.sdk.utils.d.b()
                            java.lang.String r4 = r4.toString()
                            com.ss.android.ugc.aweme.im.sdk.chat.o r5 = r0.t
                            java.lang.String r5 = r5.getConversationId()
                            com.ss.android.ugc.aweme.im.sdk.chat.o r6 = r0.t
                            boolean r6 = r6.isGroupChat()
                            if (r6 == 0) goto L_0x0093
                            r6 = r1
                            goto L_0x009b
                        L_0x0093:
                            long r11 = com.bytedance.im.core.d.e.a((java.lang.String) r5)
                            java.lang.String r6 = java.lang.String.valueOf(r11)
                        L_0x009b:
                            com.ss.android.ugc.aweme.im.sdk.chat.view.SearchableEditText r11 = r0.f3367d
                            android.text.Editable r11 = r11.getText()
                            if (r11 != 0) goto L_0x00a6
                            java.lang.String r11 = ""
                            goto L_0x00b4
                        L_0x00a6:
                            com.ss.android.ugc.aweme.im.sdk.chat.view.SearchableEditText r11 = r0.f3367d
                            android.text.Editable r11 = r11.getText()
                            java.lang.String r11 = r11.toString()
                            java.lang.String r11 = r11.trim()
                        L_0x00b4:
                            com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter r0 = r0.q
                            java.lang.Object[] r12 = new java.lang.Object[r10]
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter.f50335a
                            r15 = 0
                            r16 = 50645(0xc5d5, float:7.0969E-41)
                            java.lang.Class[] r13 = new java.lang.Class[r10]
                            java.lang.Class<java.util.List> r18 = java.util.List.class
                            r17 = r13
                            r13 = r0
                            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                            r13 = 0
                            if (r12 == 0) goto L_0x00e3
                            java.lang.Object[] r12 = new java.lang.Object[r10]
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter.f50335a
                            r15 = 0
                            r16 = 50645(0xc5d5, float:7.0969E-41)
                            java.lang.Class[] r13 = new java.lang.Class[r10]
                            java.lang.Class<java.util.List> r18 = java.util.List.class
                            r17 = r13
                            r13 = r0
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                            r13 = r0
                            java.util.List r13 = (java.util.List) r13
                            goto L_0x0102
                        L_0x00e3:
                            int r12 = r0.f50339e
                            if (r12 <= 0) goto L_0x0102
                            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> r12 = r0.f50340f
                            int r12 = r12.size()
                            int r12 = r12 - r9
                            int r14 = r0.f50339e
                            if (r14 != r12) goto L_0x00f5
                            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> r13 = r0.f50340f
                            goto L_0x0102
                        L_0x00f5:
                            int r14 = r0.f50339e
                            if (r14 >= r12) goto L_0x0102
                            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> r12 = r0.f50340f
                            int r0 = r0.f50339e
                            int r0 = r0 + r9
                            java.util.List r13 = r12.subList(r10, r0)
                        L_0x0102:
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            if (r13 == 0) goto L_0x0142
                            boolean r12 = r13.isEmpty()
                            if (r12 == 0) goto L_0x0110
                            goto L_0x0142
                        L_0x0110:
                            java.util.Iterator r12 = r13.iterator()
                        L_0x0114:
                            boolean r13 = r12.hasNext()
                            if (r13 == 0) goto L_0x012f
                            java.lang.Object r13 = r12.next()
                            com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a r13 = (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a) r13
                            boolean r14 = r13 instanceof com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b
                            if (r14 == 0) goto L_0x0114
                            com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b r13 = (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b) r13
                            java.lang.String r13 = r13.f50601b
                            r0.append(r13)
                            r0.append(r3)
                            goto L_0x0114
                        L_0x012f:
                            boolean r3 = android.text.TextUtils.isEmpty(r0)
                            if (r3 == 0) goto L_0x0139
                            r0.append(r1)
                            goto L_0x0145
                        L_0x0139:
                            int r1 = r0.length()
                            int r1 = r1 - r9
                            r0.substring(r10, r1)
                            goto L_0x0145
                        L_0x0142:
                            r0.append(r1)
                        L_0x0145:
                            java.lang.String r0 = r0.toString()
                            java.lang.String r1 = r8.f50601b
                            r3 = 6
                            java.lang.Object[] r12 = new java.lang.Object[r3]
                            r12[r10] = r5
                            r12[r9] = r6
                            r12[r2] = r4
                            r19 = 3
                            r12[r19] = r11
                            r20 = 4
                            r12[r20] = r0
                            r21 = 5
                            r12[r21] = r1
                            r13 = 0
                            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.im.sdk.utils.z.f52670a
                            r16 = 53643(0xd18b, float:7.517E-41)
                            java.lang.Class[] r15 = new java.lang.Class[r3]
                            java.lang.Class<java.lang.String> r17 = java.lang.String.class
                            r15[r10] = r17
                            java.lang.Class<java.lang.String> r17 = java.lang.String.class
                            r15[r9] = r17
                            java.lang.Class<java.lang.String> r17 = java.lang.String.class
                            r15[r2] = r17
                            java.lang.Class<java.lang.String> r17 = java.lang.String.class
                            r15[r19] = r17
                            java.lang.Class<java.lang.String> r17 = java.lang.String.class
                            r15[r20] = r17
                            java.lang.Class<java.lang.String> r17 = java.lang.String.class
                            r15[r21] = r17
                            java.lang.Class r18 = java.lang.Void.TYPE
                            r17 = r15
                            r15 = 1
                            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                            if (r12 == 0) goto L_0x01c6
                            java.lang.Object[] r12 = new java.lang.Object[r3]
                            r12[r10] = r5
                            r12[r9] = r6
                            r12[r2] = r4
                            r12[r19] = r11
                            r12[r20] = r0
                            r12[r21] = r1
                            r23 = 0
                            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.im.sdk.utils.z.f52670a
                            r25 = 1
                            r26 = 53643(0xd18b, float:7.517E-41)
                            java.lang.Class[] r0 = new java.lang.Class[r3]
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r0[r10] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r0[r9] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r0[r2] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r0[r19] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r0[r20] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r0[r21] = r1
                            java.lang.Class r28 = java.lang.Void.TYPE
                            r22 = r12
                            r27 = r0
                            com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
                            goto L_0x01ee
                        L_0x01c6:
                            java.util.HashMap r2 = new java.util.HashMap
                            r2.<init>()
                            java.lang.String r3 = "conversation_id"
                            r2.put(r3, r5)
                            java.lang.String r3 = "to_user_id"
                            r2.put(r3, r6)
                            java.lang.String r3 = "from_user_id"
                            r2.put(r3, r4)
                            java.lang.String r3 = "search_query"
                            r2.put(r3, r11)
                            java.lang.String r3 = "emoji_show"
                            r2.put(r3, r0)
                            java.lang.String r0 = "emoji_click"
                            r2.put(r0, r1)
                            java.lang.String r0 = "auto_emoji_click"
                            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r2)
                        L_0x01ee:
                            com.ss.android.ugc.aweme.im.sdk.chat.input.d r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.d.this
                            java.lang.Object[] r11 = new java.lang.Object[r9]
                            r11[r10] = r8
                            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.chat.input.d.f3364a
                            r14 = 0
                            r15 = 50536(0xc568, float:7.0816E-41)
                            java.lang.Class[] r1 = new java.lang.Class[r9]
                            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b> r2 = com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b.class
                            r1[r10] = r2
                            java.lang.Class r17 = java.lang.Void.TYPE
                            r12 = r0
                            r16 = r1
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                            if (r1 == 0) goto L_0x0224
                            java.lang.Object[] r11 = new java.lang.Object[r9]
                            r11[r10] = r8
                            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.chat.input.d.f3364a
                            r14 = 0
                            r15 = 50536(0xc568, float:7.0816E-41)
                            java.lang.Class[] r1 = new java.lang.Class[r9]
                            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b> r2 = com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b.class
                            r1[r10] = r2
                            java.lang.Class r17 = java.lang.Void.TYPE
                            r12 = r0
                            r16 = r1
                            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                            return
                        L_0x0224:
                            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r8.f50600a
                            if (r1 == 0) goto L_0x026a
                            com.ss.android.ugc.aweme.im.sdk.resources.model.a r2 = new com.ss.android.ugc.aweme.im.sdk.resources.model.a
                            r2.<init>()
                            r2.setAnimateUrl(r1)
                            int r3 = r1.getWidth()
                            r2.setWidth(r3)
                            int r1 = r1.getHeight()
                            r2.setHeight(r1)
                            r2.setStickerType(r9)
                            java.lang.String r1 = "gif"
                            r2.setAnimateType(r1)
                            android.content.Context r1 = r0.h()
                            r3 = 2131560455(0x7f0d0807, float:1.8746283E38)
                            java.lang.String r1 = r1.getString(r3)
                            r2.setDisplayName(r1)
                            com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c r1 = new com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c
                            r1.<init>()
                            r1.f50557a = r2
                            r0.k()
                            com.ss.android.ugc.aweme.im.sdk.chat.input.IInputView r2 = r0.f3366c
                            r2.a((com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c) r1)
                            com.ss.android.ugc.aweme.im.sdk.chat.view.SearchableEditText r0 = r0.f3367d
                            java.lang.String r1 = ""
                            r0.setText(r1)
                        L_0x026a:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.d.AnonymousClass8.a(com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b):void");
                    }
                };
            }
            if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50538, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50538, new Class[0], Void.TYPE);
            } else {
                this.q.g = new f(this);
            }
            if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50534, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50534, new Class[0], Void.TYPE);
            } else if (!m.a()) {
                this.o.addOnScrollListener(new InputView$6(this));
            }
            this.m.setOnPanelChangeListener(this);
            this.m.setOnClickListener(this.M);
            au.a.h().a(this.f3368e, this.f3369f, this.g, this.h);
            this.j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50452a;

                public final void onGlobalLayout() {
                    if (PatchProxy.isSupport(new Object[0], this, f50452a, false, 50612, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50452a, false, 50612, new Class[0], Void.TYPE);
                        return;
                    }
                    if (d.this.j.getVisibility() != 0) {
                        d.this.e();
                    }
                }
            });
        }
        this.r = new com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.b(h(), this);
        this.m.a(1, this.r.a());
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50527, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.service.b.a inputMenuCustomizer = IMService.get().getInputMenuCustomizer();
        if (this.t.isSingleChat() && inputMenuCustomizer != null) {
            p pVar = (p) this.t;
            final IMUser fromUser = pVar.getFromUser();
            if (fromUser != null) {
                inputMenuCustomizer.a(fromUser.getUid(), fromUser.getVerificationType(), fromUser.getEnterpriseVerifyReason(), new com.ss.android.ugc.aweme.im.service.b.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50437a;

                    public final LinearLayout a() {
                        return d.this.j;
                    }

                    public final LinearLayout b() {
                        return d.this.l;
                    }

                    public final boolean c() {
                        if (d.this.v != -1) {
                            return true;
                        }
                        return false;
                    }

                    public final void a(String str) {
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{str2}, this, f50437a, false, 50602, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2}, this, f50437a, false, 50602, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        TextContent textContent = new TextContent();
                        textContent.setText(str2);
                        ba.a().a(fromUser.getUid(), (BaseContent) textContent);
                    }
                }, pVar.getImAdLog());
            }
        }
    }

    public final void a(int i2, View view) {
        int i3;
        int i4 = i2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), view}, this, f3364a, false, 50543, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), view}, this, f3364a, false, 50543, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
            return;
        }
        if (i4 == -1) {
            s();
            c(false);
        } else if (i4 == -2) {
            if (!(com.ss.android.ugc.aweme.im.sdk.d.a.b().enableExpressionTab() && this.n.getVisibility() == 0 && C0906R.id.ca1 == this.n.getCheckedRadioButtonId())) {
                s();
            }
            c(true);
        } else if (i4 == 1) {
            c(true);
        } else if (i4 == 2) {
            this.g.setImageResource(2130839180);
            t();
            c(true);
            z a2 = z.a();
            if (PatchProxy.isSupport(new Object[0], a2, z.f52670a, false, 53599, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, z.f52670a, false, 53599, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("click_album").setLabelName("chat"));
            }
        }
        if (this.C != null) {
            a aVar = this.C;
            if (i4 == -1) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            aVar.a(i3);
        }
        this.v = i4;
        if (PatchProxy.isSupport(new Object[0], this, f3364a, false, 50548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3364a, false, 50548, new Class[0], Void.TYPE);
            return;
        }
        if (!m.a() && this.m.c() != -2) {
            SearchGifAdapter searchGifAdapter = this.q;
            if (PatchProxy.isSupport(new Object[0], searchGifAdapter, SearchGifAdapter.f50335a, false, 50641, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], searchGifAdapter, SearchGifAdapter.f50335a, false, 50641, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (searchGifAdapter.f50340f == null || searchGifAdapter.f50340f.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                b(true);
            }
        }
    }
}
