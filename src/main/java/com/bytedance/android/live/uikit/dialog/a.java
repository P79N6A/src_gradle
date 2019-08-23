package com.bytedance.android.live.uikit.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8500a;
    ImageView A;
    TextView B;
    TextView C;
    public View D;
    public boolean E;
    public ListAdapter F;
    public int G = -1;
    int H;
    int I;
    public int J;
    public int K;
    public int L;
    public int M;
    int N;
    public Handler O;
    final View.OnClickListener P = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8506a;

        public final void onClick(View view) {
            Message message;
            if (PatchProxy.isSupport(new Object[]{view}, this, f8506a, false, 1776, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8506a, false, 1776, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (view == a.this.o && a.this.q != null) {
                message = Message.obtain(a.this.q);
            } else if (view == a.this.r && a.this.t != null) {
                message = Message.obtain(a.this.t);
            } else if (view != a.this.u || a.this.w == null) {
                message = null;
            } else {
                message = Message.obtain(a.this.w);
            }
            if (message != null) {
                message.sendToTarget();
            }
            a.this.O.obtainMessage(1, a.this.f8502c).sendToTarget();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final Context f8501b;

    /* renamed from: c  reason: collision with root package name */
    public final DialogInterface f8502c;

    /* renamed from: d  reason: collision with root package name */
    final Window f8503d;

    /* renamed from: e  reason: collision with root package name */
    CharSequence f8504e;

    /* renamed from: f  reason: collision with root package name */
    CharSequence f8505f;
    public ListView g;
    View h;
    int i;
    int j;
    int k;
    int l;
    int m;
    boolean n;
    public Button o;
    CharSequence p;
    public Message q;
    public Button r;
    CharSequence s;
    public Message t;
    public Button u;
    CharSequence v;
    public Message w;
    public ScrollView x;
    int y;
    Drawable z;

    /* renamed from: com.bytedance.android.live.uikit.dialog.a$a  reason: collision with other inner class name */
    public static class C0067a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8523a;
        public int A;
        public int B;
        public boolean C;
        public boolean[] D;
        public boolean E;
        public boolean F;
        public int G = -1;
        public DialogInterface.OnMultiChoiceClickListener H;
        public Cursor I;
        public String J;
        public String K;
        public boolean L;
        public AdapterView.OnItemSelectedListener M;
        public boolean N = true;

        /* renamed from: b  reason: collision with root package name */
        public final Context f8524b;

        /* renamed from: c  reason: collision with root package name */
        public final LayoutInflater f8525c;

        /* renamed from: d  reason: collision with root package name */
        public int f8526d;

        /* renamed from: e  reason: collision with root package name */
        public Drawable f8527e;

        /* renamed from: f  reason: collision with root package name */
        public int f8528f;
        public CharSequence g;
        public View h;
        public CharSequence i;
        public CharSequence j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public DialogInterface.OnClickListener m;
        public CharSequence n;
        public DialogInterface.OnClickListener o;
        public boolean p;
        public DialogInterface.OnCancelListener q;
        public DialogInterface.OnDismissListener r;
        public DialogInterface.OnKeyListener s;
        public CharSequence[] t;
        public ListAdapter u;
        public DialogInterface.OnClickListener v;
        public int w;
        public View x;
        public int y;
        public int z;

        public C0067a(Context context) {
            this.f8524b = context;
            this.p = true;
            this.f8525c = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r11v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r11v1 */
        /* JADX WARNING: type inference failed for: r0v38, types: [com.bytedance.android.live.uikit.dialog.a$c] */
        /* JADX WARNING: type inference failed for: r0v39, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r0v80, types: [com.bytedance.android.live.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r0v81, types: [com.bytedance.android.live.uikit.dialog.a$a$1] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(final com.bytedance.android.live.uikit.dialog.a r13) {
            /*
                r12 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r13
                com.meituan.robust.ChangeQuickRedirect r2 = f8523a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.bytedance.android.live.uikit.dialog.a> r1 = com.bytedance.android.live.uikit.dialog.a.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 1781(0x6f5, float:2.496E-42)
                r1 = r12
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0030
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r13
                com.meituan.robust.ChangeQuickRedirect r2 = f8523a
                r3 = 0
                r4 = 1781(0x6f5, float:2.496E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.bytedance.android.live.uikit.dialog.a> r1 = com.bytedance.android.live.uikit.dialog.a.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r12
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0030:
                android.view.View r0 = r12.h
                if (r0 == 0) goto L_0x003a
                android.view.View r0 = r12.h
                r13.D = r0
                goto L_0x00ed
            L_0x003a:
                java.lang.CharSequence r0 = r12.g
                if (r0 == 0) goto L_0x0043
                java.lang.CharSequence r0 = r12.g
                r13.a((java.lang.CharSequence) r0)
            L_0x0043:
                android.graphics.drawable.Drawable r0 = r12.f8527e
                if (r0 == 0) goto L_0x008e
                android.graphics.drawable.Drawable r9 = r12.f8527e
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.live.uikit.dialog.a.f8500a
                r3 = 0
                r4 = 1764(0x6e4, float:2.472E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r13
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0077
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.live.uikit.dialog.a.f8500a
                r3 = 0
                r4 = 1764(0x6e4, float:2.472E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r13
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x008e
            L_0x0077:
                r13.z = r9
                r13.y = r8
                android.widget.ImageView r0 = r13.A
                if (r0 == 0) goto L_0x008e
                if (r9 == 0) goto L_0x0087
                android.widget.ImageView r0 = r13.A
                r0.setImageDrawable(r9)
                goto L_0x008e
            L_0x0087:
                android.widget.ImageView r0 = r13.A
                r1 = 8
                r0.setVisibility(r1)
            L_0x008e:
                int r0 = r12.f8526d
                if (r0 == 0) goto L_0x0097
                int r0 = r12.f8526d
                r13.a((int) r0)
            L_0x0097:
                int r0 = r12.f8528f
                if (r0 == 0) goto L_0x00ed
                int r9 = r12.f8528f
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                r0[r8] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.live.uikit.dialog.a.f8500a
                r3 = 0
                r4 = 1765(0x6e5, float:2.473E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Integer.TYPE
                r1 = r13
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x00da
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                r0[r8] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.live.uikit.dialog.a.f8500a
                r3 = 0
                r4 = 1765(0x6e5, float:2.473E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Integer.TYPE
                r1 = r13
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                goto L_0x00ea
            L_0x00da:
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                android.content.Context r1 = r13.f8501b
                android.content.res.Resources$Theme r1 = r1.getTheme()
                r1.resolveAttribute(r9, r0, r7)
                int r0 = r0.resourceId
            L_0x00ea:
                r13.a((int) r0)
            L_0x00ed:
                java.lang.CharSequence r0 = r12.i
                if (r0 == 0) goto L_0x012c
                java.lang.CharSequence r9 = r12.i
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.live.uikit.dialog.a.f8500a
                r3 = 0
                r4 = 1761(0x6e1, float:2.468E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<java.lang.CharSequence> r1 = java.lang.CharSequence.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r13
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0121
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.live.uikit.dialog.a.f8500a
                r3 = 0
                r4 = 1761(0x6e1, float:2.468E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<java.lang.CharSequence> r1 = java.lang.CharSequence.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r13
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x012c
            L_0x0121:
                r13.f8505f = r9
                android.widget.TextView r0 = r13.C
                if (r0 == 0) goto L_0x012c
                android.widget.TextView r0 = r13.C
                r0.setText(r9)
            L_0x012c:
                java.lang.CharSequence r0 = r12.j
                r9 = 0
                if (r0 == 0) goto L_0x0139
                r0 = -1
                java.lang.CharSequence r1 = r12.j
                android.content.DialogInterface$OnClickListener r2 = r12.k
                r13.a(r0, r1, r2, r9)
            L_0x0139:
                java.lang.CharSequence r0 = r12.l
                if (r0 == 0) goto L_0x0145
                r0 = -2
                java.lang.CharSequence r1 = r12.l
                android.content.DialogInterface$OnClickListener r2 = r12.m
                r13.a(r0, r1, r2, r9)
            L_0x0145:
                java.lang.CharSequence r0 = r12.n
                if (r0 == 0) goto L_0x0151
                r0 = -3
                java.lang.CharSequence r1 = r12.n
                android.content.DialogInterface$OnClickListener r2 = r12.o
                r13.a(r0, r1, r2, r9)
            L_0x0151:
                boolean r0 = r12.L
                if (r0 == 0) goto L_0x0157
                r13.E = r7
            L_0x0157:
                java.lang.CharSequence[] r0 = r12.t
                if (r0 != 0) goto L_0x0163
                android.database.Cursor r0 = r12.I
                if (r0 != 0) goto L_0x0163
                android.widget.ListAdapter r0 = r12.u
                if (r0 == 0) goto L_0x023c
            L_0x0163:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r13
                com.meituan.robust.ChangeQuickRedirect r2 = f8523a
                r3 = 0
                r4 = 1782(0x6f6, float:2.497E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.bytedance.android.live.uikit.dialog.a> r1 = com.bytedance.android.live.uikit.dialog.a.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r12
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0192
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r13
                com.meituan.robust.ChangeQuickRedirect r2 = f8523a
                r3 = 0
                r4 = 1782(0x6f6, float:2.497E-42)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.bytedance.android.live.uikit.dialog.a> r1 = com.bytedance.android.live.uikit.dialog.a.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r12
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x023c
            L_0x0192:
                android.view.LayoutInflater r0 = r12.f8525c
                int r1 = r13.J
                android.view.View r0 = r0.inflate(r1, r9)
                r10 = r0
                com.bytedance.android.live.uikit.dialog.RecycleListView r10 = (com.bytedance.android.live.uikit.dialog.RecycleListView) r10
                boolean r0 = r12.E
                if (r0 == 0) goto L_0x01c6
                android.database.Cursor r0 = r12.I
                if (r0 != 0) goto L_0x01b7
                com.bytedance.android.live.uikit.dialog.a$a$1 r11 = new com.bytedance.android.live.uikit.dialog.a$a$1
                android.content.Context r2 = r12.f8524b
                int r3 = r13.K
                r4 = 2131170287(0x7f0713ef, float:1.7954928E38)
                java.lang.CharSequence[] r5 = r12.t
                r0 = r11
                r1 = r12
                r6 = r10
                r0.<init>(r2, r3, r4, r5, r6)
                goto L_0x01fe
            L_0x01b7:
                com.bytedance.android.live.uikit.dialog.a$a$2 r11 = new com.bytedance.android.live.uikit.dialog.a$a$2
                android.content.Context r2 = r12.f8524b
                android.database.Cursor r3 = r12.I
                r4 = 0
                r0 = r11
                r1 = r12
                r5 = r10
                r6 = r13
                r0.<init>(r2, r3, r4, r5, r6)
                goto L_0x01fe
            L_0x01c6:
                boolean r0 = r12.F
                if (r0 == 0) goto L_0x01ce
                int r0 = r13.L
            L_0x01cc:
                r3 = r0
                goto L_0x01d1
            L_0x01ce:
                int r0 = r13.M
                goto L_0x01cc
            L_0x01d1:
                android.database.Cursor r0 = r12.I
                r1 = 2131170287(0x7f0713ef, float:1.7954928E38)
                if (r0 != 0) goto L_0x01e9
                android.widget.ListAdapter r0 = r12.u
                if (r0 == 0) goto L_0x01df
                android.widget.ListAdapter r0 = r12.u
                goto L_0x01fd
            L_0x01df:
                com.bytedance.android.live.uikit.dialog.a$c r0 = new com.bytedance.android.live.uikit.dialog.a$c
                android.content.Context r2 = r12.f8524b
                java.lang.CharSequence[] r4 = r12.t
                r0.<init>(r2, r3, r1, r4)
                goto L_0x01fd
            L_0x01e9:
                android.widget.SimpleCursorAdapter r0 = new android.widget.SimpleCursorAdapter
                android.content.Context r2 = r12.f8524b
                android.database.Cursor r4 = r12.I
                java.lang.String[] r5 = new java.lang.String[r7]
                java.lang.String r6 = r12.J
                r5[r8] = r6
                int[] r6 = new int[r7]
                r6[r8] = r1
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
            L_0x01fd:
                r11 = r0
            L_0x01fe:
                r13.F = r11
                int r0 = r12.G
                r13.G = r0
                android.content.DialogInterface$OnClickListener r0 = r12.v
                if (r0 == 0) goto L_0x0211
                com.bytedance.android.live.uikit.dialog.a$a$3 r0 = new com.bytedance.android.live.uikit.dialog.a$a$3
                r0.<init>(r13)
                r10.setOnItemClickListener(r0)
                goto L_0x021d
            L_0x0211:
                android.content.DialogInterface$OnMultiChoiceClickListener r0 = r12.H
                if (r0 == 0) goto L_0x021d
                com.bytedance.android.live.uikit.dialog.a$a$4 r0 = new com.bytedance.android.live.uikit.dialog.a$a$4
                r0.<init>(r10, r13)
                r10.setOnItemClickListener(r0)
            L_0x021d:
                android.widget.AdapterView$OnItemSelectedListener r0 = r12.M
                if (r0 == 0) goto L_0x0226
                android.widget.AdapterView$OnItemSelectedListener r0 = r12.M
                r10.setOnItemSelectedListener(r0)
            L_0x0226:
                boolean r0 = r12.F
                if (r0 == 0) goto L_0x022e
                r10.setChoiceMode(r7)
                goto L_0x0236
            L_0x022e:
                boolean r0 = r12.E
                if (r0 == 0) goto L_0x0236
                r0 = 2
                r10.setChoiceMode(r0)
            L_0x0236:
                boolean r0 = r12.N
                r10.f8499a = r0
                r13.g = r10
            L_0x023c:
                android.view.View r0 = r12.x
                if (r0 == 0) goto L_0x0266
                boolean r0 = r12.C
                if (r0 == 0) goto L_0x025d
                android.view.View r0 = r12.x
                int r1 = r12.y
                int r2 = r12.z
                int r3 = r12.A
                int r4 = r12.B
                r13.h = r0
                r13.i = r8
                r13.n = r7
                r13.j = r1
                r13.k = r2
                r13.l = r3
                r13.m = r4
                return
            L_0x025d:
                android.view.View r0 = r12.x
                r13.h = r0
                r13.i = r8
                r13.n = r8
                return
            L_0x0266:
                int r0 = r12.w
                if (r0 == 0) goto L_0x0272
                int r0 = r12.w
                r13.h = r9
                r13.i = r0
                r13.n = r8
            L_0x0272:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.dialog.a.C0067a.a(com.bytedance.android.live.uikit.dialog.a):void");
        }
    }

    static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8545a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<DialogInterface> f8546b;

        public b(DialogInterface dialogInterface) {
            this.f8546b = new WeakReference<>(dialogInterface);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
            r2 = r17;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f8545a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.os.Message> r3 = android.os.Message.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 1788(0x6fc, float:2.506E-42)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0034
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f8545a
                r13 = 0
                r14 = 1788(0x6fc, float:2.506E-42)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<android.os.Message> r0 = android.os.Message.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0034:
                int r2 = r0.what
                if (r2 == r1) goto L_0x0052
                switch(r2) {
                    case -3: goto L_0x003e;
                    case -2: goto L_0x003e;
                    case -1: goto L_0x003e;
                    default: goto L_0x003b;
                }
            L_0x003b:
                r2 = r17
                goto L_0x005b
            L_0x003e:
                java.lang.Object r1 = r0.obj
                android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
                r2 = r17
                java.lang.ref.WeakReference<android.content.DialogInterface> r3 = r2.f8546b
                java.lang.Object r3 = r3.get()
                android.content.DialogInterface r3 = (android.content.DialogInterface) r3
                int r0 = r0.what
                r1.onClick(r3, r0)
                return
            L_0x0052:
                r2 = r17
                java.lang.Object r0 = r0.obj
                android.content.DialogInterface r0 = (android.content.DialogInterface) r0
                r0.dismiss()
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.dialog.a.b.handleMessage(android.os.Message):void");
        }
    }

    static class c extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, C0906R.id.d05, charSequenceArr);
        }
    }

    public final void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f8500a, false, 1760, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f8500a, false, 1760, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        this.f8504e = charSequence;
        if (this.B != null) {
            this.B.setText(charSequence);
        }
    }

    static boolean a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f8500a, true, 1758, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, null, f8500a, true, 1758, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else if (view.onCheckIsTextEditor()) {
            return true;
        } else {
            if (!(view2 instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8500a, false, 1763, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8500a, false, 1763, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.z = null;
        this.y = i2;
        if (this.A != null) {
            if (i2 != 0) {
                this.A.setImageResource(this.y);
                return;
            }
            this.A.setVisibility(8);
        }
    }

    public a(Context context, DialogInterface dialogInterface, Window window) {
        this.f8501b = context;
        this.f8502c = dialogInterface;
        this.f8503d = window;
        this.O = new b(dialogInterface);
        this.H = C0906R.layout.a_g;
        this.I = 0;
        this.J = C0906R.layout.a_h;
        this.K = C0906R.layout.a_j;
        this.L = C0906R.layout.a_k;
        this.M = C0906R.layout.a_i;
    }

    public static void a(View view, View view2, View view3) {
        int i2;
        View view4 = view;
        View view5 = view2;
        View view6 = view3;
        if (PatchProxy.isSupport(new Object[]{view4, view5, view6}, null, f8500a, true, 1772, new Class[]{View.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view4, view5, view6}, null, f8500a, true, 1772, new Class[]{View.class, View.class, View.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 14) {
            int i3 = 4;
            if (view5 != null) {
                if (view4.canScrollVertically(-1)) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                view5.setVisibility(i2);
            }
            if (view6 != null) {
                if (view4.canScrollVertically(1)) {
                    i3 = 0;
                }
                view6.setVisibility(i3);
            }
        }
    }

    public final void a(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        Message message2;
        int i3 = i2;
        CharSequence charSequence2 = charSequence;
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), charSequence2, onClickListener2, null}, this, f8500a, false, 1762, new Class[]{Integer.TYPE, CharSequence.class, DialogInterface.OnClickListener.class, Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), charSequence2, onClickListener2, null}, this, f8500a, false, 1762, new Class[]{Integer.TYPE, CharSequence.class, DialogInterface.OnClickListener.class, Message.class}, Void.TYPE);
            return;
        }
        if (onClickListener2 != null) {
            message2 = this.O.obtainMessage(i3, onClickListener2);
        } else {
            message2 = message;
        }
        switch (i3) {
            case -3:
                this.v = charSequence2;
                this.w = message2;
                return;
            case -2:
                this.s = charSequence2;
                this.t = message2;
                return;
            case -1:
                this.p = charSequence2;
                this.q = message2;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }
}
