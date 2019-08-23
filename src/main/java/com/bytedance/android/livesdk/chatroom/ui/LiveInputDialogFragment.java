package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.u;
import com.bytedance.android.livesdk.chatroom.f.e;
import com.bytedance.android.livesdk.chatroom.ui.KeyboardShadowView;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.s;
import com.bytedance.android.livesdk.widget.BarrageView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;

public class LiveInputDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11578a;

    /* renamed from: b  reason: collision with root package name */
    public BarrageView f11579b;

    /* renamed from: c  reason: collision with root package name */
    InputFilter f11580c;

    /* renamed from: d  reason: collision with root package name */
    public View f11581d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f11582e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f11583f;
    public TextView g;
    public View h;
    public boolean i;
    public boolean j;
    public String k;
    public c l;
    public a m;
    public boolean n = false;
    private final View.OnClickListener o = new ch(this);
    private final TextWatcher p = new TextWatcher() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11584a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            int i;
            int i2;
            String str2;
            if (PatchProxy.isSupport(new Object[]{editable}, this, f11584a, false, 5978, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f11584a, false, 5978, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            Editable text = LiveInputDialogFragment.this.f11583f.getText();
            LiveInputDialogFragment liveInputDialogFragment = LiveInputDialogFragment.this;
            if (text == null) {
                str = "";
            } else {
                str = text.toString();
            }
            liveInputDialogFragment.k = str;
            if (TextUtils.isEmpty(LiveInputDialogFragment.this.k)) {
                LiveInputDialogFragment.this.g.setVisibility(0);
                LiveInputDialogFragment.this.f11582e.setBackgroundResource(2130841457);
            } else {
                LiveInputDialogFragment.this.g.setVisibility(8);
                LiveInputDialogFragment.this.f11582e.setBackgroundResource(2130841456);
            }
            int trimmedLength = TextUtils.getTrimmedLength(LiveInputDialogFragment.this.k);
            int i3 = 15;
            if (LiveInputDialogFragment.this.i) {
                i = 15;
            } else {
                i = 50;
            }
            if (trimmedLength > i) {
                LiveInputDialogFragment liveInputDialogFragment2 = LiveInputDialogFragment.this;
                EditText editText = LiveInputDialogFragment.this.f11583f;
                int length = LiveInputDialogFragment.this.k.length();
                if (PatchProxy.isSupport(new Object[]{editText, Integer.valueOf(length)}, liveInputDialogFragment2, LiveInputDialogFragment.f11578a, false, 5961, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
                    LiveInputDialogFragment liveInputDialogFragment3 = liveInputDialogFragment2;
                    PatchProxy.accessDispatch(new Object[]{editText, Integer.valueOf(length)}, liveInputDialogFragment3, LiveInputDialogFragment.f11578a, false, 5961, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
                } else {
                    liveInputDialogFragment2.f11580c = new InputFilter.LengthFilter(length);
                    editText.setFilters(new InputFilter[]{liveInputDialogFragment2.f11580c});
                }
            } else {
                LiveInputDialogFragment liveInputDialogFragment4 = LiveInputDialogFragment.this;
                EditText editText2 = LiveInputDialogFragment.this.f11583f;
                if (PatchProxy.isSupport(new Object[]{editText2}, liveInputDialogFragment4, LiveInputDialogFragment.f11578a, false, 5962, new Class[]{EditText.class}, Void.TYPE)) {
                    LiveInputDialogFragment liveInputDialogFragment5 = liveInputDialogFragment4;
                    PatchProxy.accessDispatch(new Object[]{editText2}, liveInputDialogFragment5, LiveInputDialogFragment.f11578a, false, 5962, new Class[]{EditText.class}, Void.TYPE);
                } else if (liveInputDialogFragment4.f11580c != null) {
                    editText2.setFilters(new InputFilter[0]);
                    liveInputDialogFragment4.f11580c = null;
                }
            }
            if (LiveInputDialogFragment.this.i) {
                i2 = 15;
            } else {
                i2 = 50;
            }
            if (trimmedLength > i2) {
                if (LiveInputDialogFragment.this.i) {
                    str2 = LiveInputDialogFragment.this.getString(C0906R.string.d14);
                } else {
                    str2 = LiveInputDialogFragment.this.getString(C0906R.string.cz6, 50);
                }
                ai.a(str2, 1);
                String str3 = LiveInputDialogFragment.this.k;
                if (!LiveInputDialogFragment.this.i) {
                    i3 = 50;
                }
                String substring = str3.substring(0, i3);
                LiveInputDialogFragment.this.f11583f.setText(substring);
                LiveInputDialogFragment.this.f11583f.setSelection(substring.length());
            }
        }
    };
    private final View.OnLayoutChangeListener q = new View.OnLayoutChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11586a;

        /* renamed from: c  reason: collision with root package name */
        private float f11588c = -1.0f;

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i4;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f11586a, false, 5979, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f11586a, false, 5979, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (LiveInputDialogFragment.this.f11581d != null) {
                if (this.f11588c < 0.0f) {
                    this.f11588c = ((float) LiveInputDialogFragment.this.getResources().getDisplayMetrics().heightPixels) * 0.75f;
                }
                if (((float) i9) < this.f11588c) {
                    if (!LiveInputDialogFragment.this.n) {
                        LiveInputDialogFragment.this.n = true;
                        int i10 = i8 - i9;
                        LiveInputDialogFragment.this.f11581d.setVisibility(0);
                        if (LiveInputDialogFragment.this.h.getVisibility() == 0) {
                            i10 += LiveInputDialogFragment.this.h.getHeight();
                        }
                        com.bytedance.android.livesdk.u.a.a().a((Object) new u(i10, true));
                    }
                } else if (LiveInputDialogFragment.this.n) {
                    LiveInputDialogFragment.this.n = false;
                    LiveInputDialogFragment.this.f11581d.setVisibility(4);
                    try {
                        LiveInputDialogFragment.this.dismiss();
                    } catch (IllegalStateException unused) {
                    }
                    com.bytedance.android.livesdk.u.a.a().a((Object) new u(0, false));
                }
            }
        }
    };
    private View r;
    private TextView s;
    private View t;
    private boolean u;
    private boolean v;
    private boolean w = false;
    private e.a x = new e.a() {
    };

    public interface a {
        void a();

        void a(boolean z);

        User b();

        boolean c();

        boolean d();

        int e();
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11592a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11593b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11594c;

        /* renamed from: d  reason: collision with root package name */
        public String f11595d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11596e = true;
    }

    public interface c {
        void a(b bVar);

        void a(String str, boolean z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11578a, false, 5965, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11578a, false, 5965, new Class[0], Void.TYPE);
        } else if (this.f11583f != null) {
            s.b(getContext(), this.f11583f);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f11578a, false, 5958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11578a, false, 5958, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f11581d.removeOnLayoutChangeListener(this.q);
        this.w = false;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f11578a, false, 5959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11578a, false, 5959, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.w) {
            this.w = false;
            a(200, 1, 5);
            return;
        }
        this.f11583f.postDelayed(new cj(this), 100);
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11578a, false, 5969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11578a, false, 5969, new Class[0], Void.TYPE);
        } else if (isAdded()) {
            if (this.j) {
                this.f11583f.setText("");
                this.g.setText(C0906R.string.deg);
                this.f11583f.setEnabled(false);
                return;
            }
            this.f11583f.setText(this.k);
            if (!TextUtils.isEmpty(this.k)) {
                this.f11583f.setSelection(this.k.length());
            }
            this.f11583f.setTextSize(1, 17.0f);
            if (this.i) {
                this.g.setText(C0906R.string.cur);
            } else if (this.u) {
                this.g.setText(C0906R.string.cpq);
            } else {
                this.g.setText(C0906R.string.dc9);
            }
            this.f11583f.setEnabled(true);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11578a, false, 5964, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11578a, false, 5964, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        this.w = this.n;
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11578a, false, 5954, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11578a, false, 5954, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11578a, false, 5953, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11578a, false, 5953, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.vx);
        setCancelable(true);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.i = arguments.getBoolean("live.intent.extra.DANMU_OPEN", false);
        this.u = arguments.getBoolean("live.intent.extra.IS_BROADCASTER", false);
        this.j = arguments.getBoolean("live.intent.extra.USER_BANNED", false);
        this.k = arguments.getString("live.intent.extra.INPUT", "");
        this.v = arguments.getBoolean("live.inter.extra.CAN_DANMU", true);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f11578a, false, 5963, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f11578a, false, 5963, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.l != null) {
            b bVar = new b();
            bVar.f11593b = this.u;
            bVar.f11594c = this.j;
            bVar.f11592a = this.i;
            bVar.f11595d = this.k;
            bVar.f11596e = this.v;
            this.l.a(bVar);
            this.l = null;
            this.n = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007f, code lost:
        if (com.bytedance.android.live.core.utils.g.a(getActivity()) == false) goto L_0x0081;
     */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(android.os.Bundle r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f11578a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r7[r9] = r3
            java.lang.Class<android.app.Dialog> r8 = android.app.Dialog.class
            r5 = 0
            r6 = 5955(0x1743, float:8.345E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f11578a
            r13 = 0
            r14 = 5955(0x1743, float:8.345E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r15[r9] = r0
            java.lang.Class<android.app.Dialog> r16 = android.app.Dialog.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.app.Dialog r0 = (android.app.Dialog) r0
            return r0
        L_0x0035:
            android.app.Dialog r0 = super.onCreateDialog(r18)
            r0.setCanceledOnTouchOutside(r9)
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x008b
            r2 = 80
            r1.setGravity(r2)
            r2 = -1
            r3 = -2
            r1.setLayout(r2, r3)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r9)
            r1.setBackgroundDrawable(r2)
            r2 = 3
            r1.setSoftInputMode(r2)
            r2 = 32
            r1.addFlags(r2)
            android.support.v4.app.FragmentActivity r2 = r17.getActivity()
            if (r2 == 0) goto L_0x0071
            android.support.v4.app.FragmentActivity r2 = r17.getActivity()
            int r2 = r2.getRequestedOrientation()
            if (r2 == 0) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r2 = r17
            goto L_0x0081
        L_0x0071:
            r2 = r17
            boolean r3 = r2.u
            if (r3 != 0) goto L_0x0086
            android.support.v4.app.FragmentActivity r3 = r17.getActivity()
            boolean r3 = com.bytedance.android.live.core.utils.g.a(r3)
            if (r3 != 0) goto L_0x0086
        L_0x0081:
            r3 = 1024(0x400, float:1.435E-42)
            r1.addFlags(r3)
        L_0x0086:
            r3 = 2
            r1.clearFlags(r3)
            goto L_0x008d
        L_0x008b:
            r2 = r17
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LiveInputDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11578a, false, 5968, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11578a, false, 5968, new Class[]{String.class}, Void.TYPE);
        } else if (isAdded() && !this.j) {
            this.k = str;
            b();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f11578a, false, 5966, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f11578a, false, 5966, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isAdded()) {
            if ((!this.j || !z) && (this.j || z)) {
                this.j = z;
                b();
            }
        }
    }

    public static LiveInputDialogFragment a(b bVar, a aVar) {
        b bVar2 = bVar;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, aVar2}, null, f11578a, true, 5952, new Class[]{b.class, a.class}, LiveInputDialogFragment.class)) {
            return (LiveInputDialogFragment) PatchProxy.accessDispatch(new Object[]{bVar2, aVar2}, null, f11578a, true, 5952, new Class[]{b.class, a.class}, LiveInputDialogFragment.class);
        }
        LiveInputDialogFragment liveInputDialogFragment = new LiveInputDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("live.intent.extra.DANMU_OPEN", bVar2.f11592a);
        bundle.putBoolean("live.intent.extra.IS_BROADCASTER", bVar2.f11593b);
        bundle.putBoolean("live.intent.extra.USER_BANNED", bVar2.f11594c);
        bundle.putString("live.intent.extra.INPUT", bVar2.f11595d);
        bundle.putBoolean("live.inter.extra.CAN_DANMU", bVar2.f11596e);
        liveInputDialogFragment.setArguments(bundle);
        liveInputDialogFragment.m = aVar2;
        return liveInputDialogFragment;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f11578a, false, 5957, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f11578a, false, 5957, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f11583f.addTextChangedListener(this.p);
        this.f11583f.setOnKeyListener(new ci(this));
        this.f11579b.setOnClickListener(this.o);
        this.f11582e.setOnClickListener(this.o);
        b();
        if (!this.j && this.i) {
            this.f11579b.a(false);
        }
        if (!com.bytedance.android.live.uikit.a.a.d() || this.m == null || this.m.d()) {
            this.h.setVisibility(8);
        } else {
            User b2 = this.m.b();
            if (b2 != null && !b2.isNeverRecharge()) {
                return;
            }
            if (b2 != null || TTLiveSDKContext.getHostService().k().a().getPayScores() <= 0) {
                if (TTLiveSDKContext.getHostService().k().c()) {
                    TextView textView = this.s;
                    if (b2 != null) {
                        str = b2.getNickName();
                    } else {
                        str = TTLiveSDKContext.getHostService().k().a().getNickName();
                    }
                    textView.setText(str);
                } else {
                    this.s.setText(C0906R.string.dad);
                }
                this.t.setOnClickListener(this.o);
                if (!this.m.c()) {
                    ViewGroup.LayoutParams layoutParams = this.s.getLayoutParams();
                    layoutParams.width = -2;
                    this.s.setLayoutParams(layoutParams);
                }
                this.h.setVisibility(0);
                HashMap hashMap = new HashMap();
                hashMap.put("discount_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                com.bytedance.android.livesdk.j.a.a().a("discount_recharge_show", hashMap, Room.class, new j().a("live_detail").c("comment").b("live_function"), new k());
            } else {
                return;
            }
        }
        if (com.bytedance.android.live.uikit.a.a.j()) {
            this.f11579b.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2, int i2, int i3) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11578a, false, 5960, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11578a, false, 5960, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f11583f != null && i2 <= i3) {
            EditText editText = this.f11583f;
            ck ckVar = new ck(this, j2, i2, i3);
            editText.postDelayed(ckVar, j3);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        ViewGroup viewGroup2 = viewGroup;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f11578a, false, 5956, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f11578a, false, 5956, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aic, viewGroup, false);
        this.f11581d = inflate;
        this.f11581d.addOnLayoutChangeListener(this.q);
        KeyboardShadowView keyboardShadowView = (KeyboardShadowView) this.f11581d.findViewById(C0906R.id.duk);
        keyboardShadowView.setActivity(getActivity());
        if (!this.u || (getActivity() != null && getActivity().getRequestedOrientation() == 0)) {
            z = false;
        }
        keyboardShadowView.setShowStatusBar(z);
        this.r = inflate.findViewById(C0906R.id.auq);
        this.f11582e = (ImageView) inflate.findViewById(C0906R.id.cnw);
        this.f11579b = (BarrageView) inflate.findViewById(C0906R.id.jq);
        this.f11583f = (EditText) inflate.findViewById(C0906R.id.a8w);
        this.g = (TextView) inflate.findViewById(C0906R.id.a8x);
        this.f11582e = (ImageView) inflate.findViewById(C0906R.id.cnw);
        this.r.getLayoutParams().width = (getResources().getDisplayMetrics().widthPixels - inflate.getPaddingLeft()) - inflate.getPaddingRight();
        this.h = inflate.findViewById(C0906R.id.caw);
        this.h.getLayoutParams().width = (getResources().getDisplayMetrics().widthPixels - inflate.getPaddingLeft()) - inflate.getPaddingRight();
        this.t = this.h.findViewById(C0906R.id.al1);
        this.s = (TextView) this.h.findViewById(C0906R.id.dq2);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            BarrageView barrageView = this.f11579b;
            if (this.v) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            UIUtils.setViewVisibility(barrageView, i2);
            if (!this.v) {
                this.i = false;
            }
        }
        if (com.bytedance.android.live.uikit.a.a.f() && getDialog() != null) {
            keyboardShadowView.setCallback(new KeyboardShadowView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11590a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f11590a, false, 5981, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f11590a, false, 5981, new Class[0], Void.TYPE);
                        return;
                    }
                    LiveInputDialogFragment.this.a();
                    if (LiveInputDialogFragment.this.m != null) {
                        LiveInputDialogFragment.this.m.a(false);
                        if (LiveInputDialogFragment.this.m.e() != 0) {
                            try {
                                LiveInputDialogFragment.this.dismiss();
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            });
        }
        return inflate;
    }
}
