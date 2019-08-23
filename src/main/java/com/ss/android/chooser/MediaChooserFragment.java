package com.ss.android.chooser;

import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.chooser.b;
import com.ss.android.chooser.e;
import com.ss.android.ugc.aweme.C0906R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class MediaChooserFragment extends AbsFragment implements WeakHandler.IHandler {
    public static String l = "ARG_NUM_COLUMNS";
    public static String m = "ARG_HORIZONTAL_SPACING";
    public static String n = "ARG_VERTICAL_SPACING";
    public static String o = "ARG_GRID_PADDING";
    public static String p = "ARG_TEXT_COLOR";
    public static String q = "ARG_TEXT_SIZE";
    public static String r = "ARG_SHADOW_COLOR";
    public static String s = "ARG_ITEM_HEIGHT_WIDTH_RATIO";
    public static String t = "ARG_BG_COLOR";
    public static String u = "ARG_TEXT_BACKGROUND";
    public static String v = "ARG_TEXT_INDICATOR";
    private View A;
    private View B;
    private View C;
    private TextView D;
    private View E;
    private String[] F;
    private GridView G;
    private boolean H;
    private boolean I;
    private int J;
    private WeakHandler K = new WeakHandler(this);
    private AdapterView.OnItemClickListener L = new AdapterView.OnItemClickListener() {
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00e2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onItemClick(android.widget.AdapterView<?> r9, android.view.View r10, int r11, long r12) {
            /*
                r8 = this;
                com.ss.android.chooser.MediaChooserFragment r9 = com.ss.android.chooser.MediaChooserFragment.this
                com.ss.android.chooser.a r9 = r9.f27941e
                com.ss.android.chooser.f r9 = r9.getItem(r11)
                long r10 = r9.f27989a
                r12 = 0
                r13 = 1
                r0 = -1
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x00bd
                com.ss.android.chooser.MediaChooserFragment r9 = com.ss.android.chooser.MediaChooserFragment.this
                com.ss.android.chooser.e r9 = r9.f27942f
                int r9 = r9.f()
                com.ss.android.chooser.MediaChooserFragment r10 = com.ss.android.chooser.MediaChooserFragment.this
                int r10 = r10.f27940d
                if (r9 < r10) goto L_0x0057
                com.ss.android.chooser.MediaChooserFragment r9 = com.ss.android.chooser.MediaChooserFragment.this
                int r9 = r9.f27940d
                if (r9 <= r13) goto L_0x0040
                com.ss.android.chooser.MediaChooserFragment r9 = com.ss.android.chooser.MediaChooserFragment.this
                android.support.v4.app.FragmentActivity r9 = r9.getActivity()
                r10 = 2131561229(0x7f0d0b0d, float:1.8747853E38)
                java.lang.Object[] r11 = new java.lang.Object[r13]
                com.ss.android.chooser.MediaChooserFragment r13 = com.ss.android.chooser.MediaChooserFragment.this
                int r13 = r13.f27940d
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r11[r12] = r13
                java.lang.String r9 = r9.getString(r10, r11)
                goto L_0x004d
            L_0x0040:
                com.ss.android.chooser.MediaChooserFragment r9 = com.ss.android.chooser.MediaChooserFragment.this
                android.support.v4.app.FragmentActivity r9 = r9.getActivity()
                r10 = 2131561227(0x7f0d0b0b, float:1.8747849E38)
                java.lang.String r9 = r9.getString(r10)
            L_0x004d:
                com.ss.android.chooser.MediaChooserFragment r10 = com.ss.android.chooser.MediaChooserFragment.this
                android.support.v4.app.FragmentActivity r10 = r10.getActivity()
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r10, (java.lang.String) r9)
                return
            L_0x0057:
                com.ss.android.chooser.MediaChooserFragment r9 = com.ss.android.chooser.MediaChooserFragment.this
                android.support.v4.app.FragmentActivity r10 = r9.getActivity()
                if (r10 == 0) goto L_0x00bc
                r10 = 4
                int r11 = r9.f27939c
                if (r10 == r11) goto L_0x00a4
                r10 = 5
                int r11 = r9.f27939c
                if (r10 != r11) goto L_0x006a
                goto L_0x00a4
            L_0x006a:
                r10 = 8
                int r11 = r9.f27939c
                if (r10 != r11) goto L_0x00bc
                java.lang.String r10 = "take_video"
                com.ss.android.chooser.MediaChooserFragment.a(r10)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                long r11 = java.lang.System.currentTimeMillis()
                r10.append(r11)
                java.lang.String r11 = ".mp4"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.i = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                long r11 = java.lang.System.currentTimeMillis()
                r10.append(r11)
                java.lang.String r11 = ".jpg"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.j = r10
                goto L_0x00bc
            L_0x00a4:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                long r11 = java.lang.System.currentTimeMillis()
                r10.append(r11)
                java.lang.String r11 = ".jpg"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.i = r10
                return
            L_0x00bc:
                return
            L_0x00bd:
                com.ss.android.chooser.MediaChooserFragment r10 = com.ss.android.chooser.MediaChooserFragment.this
                int r10 = r10.f27938b
                if (r10 != 0) goto L_0x0140
                com.ss.android.chooser.MediaChooserFragment r0 = com.ss.android.chooser.MediaChooserFragment.this
                com.ss.android.chooser.b r10 = com.ss.android.chooser.b.a()
                com.ss.android.chooser.b$a r10 = r10.f27968d
                if (r10 == 0) goto L_0x00df
                java.lang.String r10 = r10.a()
                boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r10)
                if (r11 != 0) goto L_0x00df
                android.support.v4.app.FragmentActivity r11 = r0.getActivity()
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r11, (java.lang.String) r10)
                goto L_0x00e0
            L_0x00df:
                r12 = 1
            L_0x00e0:
                if (r12 == 0) goto L_0x0140
                com.ss.android.chooser.e r10 = com.ss.android.chooser.e.a()
                r10.d()
                com.ss.android.chooser.e r10 = com.ss.android.chooser.e.a()
                r10.a((com.ss.android.chooser.f) r9)
                int r10 = r9.f27992d
                if (r10 != r13) goto L_0x0127
                android.net.Uri r10 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                long r11 = r9.f27989a
                android.content.ContentUris.withAppendedId(r10, r11)
                java.lang.String r10 = "pick"
                com.ss.android.chooser.MediaChooserFragment.a(r10)
                long r10 = r9.f27993e
                r12 = 3000(0xbb8, double:1.482E-320)
                int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r1 > 0) goto L_0x0113
                android.support.v4.app.FragmentActivity r9 = r0.getActivity()
                r10 = 2131560980(0x7f0d0a14, float:1.8747348E38)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r9, (int) r10)
                goto L_0x0140
            L_0x0113:
                long r9 = r9.f27993e
                r11 = 600000(0x927c0, double:2.964394E-318)
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 <= 0) goto L_0x0140
                android.support.v4.app.FragmentActivity r9 = r0.getActivity()
                r10 = 2131564589(0x7f0d182d, float:1.8754668E38)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r9, (int) r10)
                goto L_0x0140
            L_0x0127:
                android.net.Uri r10 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                long r11 = r9.f27989a
                android.net.Uri r5 = android.content.ContentUris.withAppendedId(r10, r11)
                com.ss.android.chooser.MediaChooserFragment$a r10 = r0.g
                if (r10 != 0) goto L_0x0140
                r1 = 0
                r2 = 1
                java.lang.String r3 = r9.f27990b
                int r4 = r9.f27992d
                int r6 = r9.i
                int r7 = r9.j
                r0.a(r1, r2, r3, r4, r5, r6, r7)
            L_0x0140:
                com.ss.android.chooser.b.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.chooser.MediaChooserFragment.AnonymousClass1.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    };
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private double U;
    private View.OnClickListener V = new View.OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int id = view.getId();
            if (id != C0906R.id.cnd && id == C0906R.id.cn2) {
                FragmentActivity activity = MediaChooserFragment.this.getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                    activity.finish();
                }
                if (!MediaChooserFragment.this.k) {
                    MediaChooserFragment.a("local_pic");
                }
            }
        }
    };
    private e.d W = new e.d() {
        public final void a() {
            MediaChooserFragment.this.a();
        }
    };
    private e.c X = new e.c() {
        public final void a(boolean z) {
            if (MediaChooserFragment.this.isViewValid()) {
                MediaChooserFragment.this.f27937a.setVisibility(4);
                if (z) {
                    MediaChooserFragment.this.b();
                }
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public View f27937a;

    /* renamed from: b  reason: collision with root package name */
    public int f27938b;

    /* renamed from: c  reason: collision with root package name */
    volatile int f27939c;

    /* renamed from: d  reason: collision with root package name */
    public int f27940d = 9;

    /* renamed from: e  reason: collision with root package name */
    public a f27941e;

    /* renamed from: f  reason: collision with root package name */
    public e f27942f;
    public a g;
    public e.a h;
    String i;
    String j;
    public boolean k;
    private final int w = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
    private final int x = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
    private final int y = 1003;
    private final int z = 100;

    public interface a {
    }

    public void onResume() {
        super.onResume();
        b();
        a();
    }

    public final void a() {
        boolean z2;
        if (isViewValid() && this.f27941e != null) {
            TextView textView = this.D;
            textView.setText(this.f27942f.f() + "/" + this.f27940d);
            View view = this.B;
            if (this.f27942f.f() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            view.setEnabled(z2);
        }
    }

    public void onStart() {
        super.onStart();
        a aVar = this.f27941e;
        aVar.j.a(aVar.k);
        e eVar = aVar.j;
        eVar.h.add(aVar.l);
        this.f27942f.a(this.W);
        e eVar2 = this.f27942f;
        eVar2.i.add(this.X);
    }

    public void onStop() {
        super.onStop();
        a aVar = this.f27941e;
        aVar.j.b(aVar.k);
        e eVar = aVar.j;
        eVar.h.remove(aVar.l);
        this.f27942f.b(this.W);
        e eVar2 = this.f27942f;
        eVar2.i.remove(this.X);
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        List b2 = this.f27942f.b(this.J);
        if (!Lists.isEmpty(b2) && this.F != null && this.F.length > 0) {
            e.a().a(Arrays.asList(this.F));
            this.F = null;
        }
        List e2 = this.f27942f.e();
        if (4 == this.f27939c || 5 == this.f27939c) {
            arrayList.add(f.a(0));
        } else if (8 == this.f27939c) {
            arrayList.add(f.a(1));
        }
        arrayList.addAll(b2);
        if (this.h != null) {
            arrayList = this.h.a();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        }
        this.f27941e.a((Collection<? extends f>) arrayList, (Collection<? extends f>) e2);
    }

    public static void a(String str) {
        new HashMap().put("reference", str);
    }

    public void handleMsg(Message message) {
        if (message.what == 100) {
            e.a().b();
            Object obj = message.obj;
            if (obj instanceof f) {
                f fVar = (f) obj;
                e eVar = this.f27942f;
                int i2 = this.J;
                List list = eVar.f27985f.get(Integer.valueOf(i2));
                if (list == null) {
                    list = new ArrayList();
                    eVar.f27985f.put(Integer.valueOf(i2), list);
                }
                if (list.size() >= 0) {
                    list.add(0, fVar);
                } else {
                    list.add(fVar);
                }
                eVar.b(fVar);
                eVar.a(i2);
                if (this.f27938b == 0) {
                    e.a().d();
                }
                Bundle bundle = new Bundle();
                this.f27942f.a(fVar);
                a(bundle, 0, fVar.f27990b, fVar.f27992d, null, fVar.i, fVar.j);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f27942f == null && getActivity() != null) {
            e.a(getActivity().getApplicationContext());
            this.f27942f = e.a();
        }
        int i2 = 0;
        if (Lists.isEmpty(this.f27942f.b(this.J))) {
            this.f27937a.setVisibility(0);
            this.f27942f.a(this.J, false);
        }
        a aVar = new a(getActivity(), this.f27938b, this.f27940d, this.M, this.U, this.N, this.P);
        this.f27941e = aVar;
        this.f27941e.i = this.R;
        this.f27941e.h = this.Q;
        this.f27941e.g = this.S;
        this.f27941e.f27951e = this.H;
        this.f27941e.f27952f = this.I;
        b a2 = b.a();
        a aVar2 = this.f27941e;
        int i3 = a2.f27966b;
        int i4 = a2.f27967c;
        if (i3 > 0 && i4 > 0 && i3 < i4) {
            aVar2.f27949c = i3;
            aVar2.f27950d = i4;
        }
        this.G.setAdapter(this.f27941e);
        a();
        this.k = b.a(this.f27939c);
        View view = this.E;
        if (!this.k) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.E.setVisibility(8);
        a("publish");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.M = getArguments().getInt(l, -1);
            this.N = getArguments().getInt(m, -1);
            this.O = getArguments().getInt(n, -1);
            this.P = getArguments().getInt(o, -1);
            this.Q = getArguments().getInt(p, -1);
            this.R = getArguments().getInt(r, -1);
            this.U = getArguments().getDouble(s, 1.0d);
            this.S = getArguments().getInt(q, 12);
            this.T = getArguments().getInt(t, -1);
            this.H = getArguments().getBoolean(u, false);
            this.I = getArguments().getBoolean(v, false);
            return;
        }
        this.M = 3;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.U = 1.0d;
        this.S = -1;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.T != -1 && this.G != null) {
            this.G.setBackgroundColor(this.T);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4;
        FragmentActivity activity = getActivity();
        a("other");
        if (i3 != 0) {
            super.onActivityResult(i2, i3, intent);
            if (i2 == 1001 || i2 == 1003) {
                if (i2 == 1001) {
                    a("take_pic");
                }
                String str = b.f27964a + File.separator + this.i;
                if (!StringUtils.isEmpty(str) && new File(str).exists()) {
                    if (i2 == 1001) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    FragmentActivity activity2 = getActivity();
                    WeakHandler weakHandler = this.K;
                    if (activity2 != null && !StringUtils.isEmpty(str)) {
                        e a2 = e.a();
                        a2.f27983d = false;
                        a2.f27980a.getContentResolver().unregisterContentObserver(a2.f27982c);
                        b.AnonymousClass1 r1 = new MediaScannerConnection.MediaScannerConnectionClient(i4, activity2, str, weakHandler, 100) {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ int f27969a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ Context f27970b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ String f27971c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ Handler f27972d;

                            /* renamed from: e  reason: collision with root package name */
                            final /* synthetic */ int f27973e;

                            public final void onMediaScannerConnected() {
                            }

                            public final void onScanCompleted(String str, Uri uri) {
                                f fVar;
                                boolean z = true;
                                if (1 != this.f27969a) {
                                    z = false;
                                }
                                if (z) {
                                    fVar = b.b(this.f27970b.getApplicationContext(), this.f27971c);
                                } else {
                                    fVar = b.a(this.f27970b.getApplicationContext(), this.f27971c);
                                }
                                if (fVar == null) {
                                    File file = new File(this.f27971c);
                                    f fVar2 = new f(-1);
                                    fVar2.f27994f = file.length();
                                    fVar2.f27990b = this.f27971c;
                                    fVar2.h = this.f27971c;
                                    fVar2.f27992d = this.f27969a;
                                    fVar2.f27991c = System.currentTimeMillis();
                                    fVar = fVar2;
                                }
                                if (this.f27972d != null) {
                                    Message obtainMessage = this.f27972d.obtainMessage();
                                    obtainMessage.what = this.f27973e;
                                    obtainMessage.obj = fVar;
                                    this.f27972d.sendMessage(obtainMessage);
                                }
                            }

                            {
                                this.f27969a = r1;
                                this.f27970b = r2;
                                this.f27971c = r3;
                                this.f27972d = r4;
                                this.f27973e = r5;
                            }
                        };
                        MediaScannerConnection.scanFile(activity2.getApplicationContext(), new String[]{str}, null, r1);
                    }
                }
            } else if (i2 == 1002) {
                activity.setResult(-1);
                activity.finish();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cd, code lost:
        if (com.ss.android.chooser.b.a(r7) != false) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110  */
    @android.annotation.SuppressLint({"InflateParams"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r7 = 2131690890(0x7f0f058a, float:1.9010836E38)
            r8 = 0
            android.view.View r6 = r6.inflate(r7, r8)
            r7 = 2131167010(0x7f070722, float:1.7948282E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.GridView r7 = (android.widget.GridView) r7
            r5.G = r7
            android.widget.GridView r7 = r5.G
            android.widget.AdapterView$OnItemClickListener r8 = r5.L
            r7.setOnItemClickListener(r8)
            int r7 = r5.M
            r8 = -1
            if (r7 == r8) goto L_0x0026
            android.widget.GridView r7 = r5.G
            int r0 = r5.M
            r7.setNumColumns(r0)
        L_0x0026:
            int r7 = r5.N
            if (r7 == r8) goto L_0x003b
            android.widget.GridView r7 = r5.G
            android.support.v4.app.FragmentActivity r0 = r5.getActivity()
            int r1 = r5.N
            float r1 = (float) r1
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r7.setHorizontalSpacing(r0)
        L_0x003b:
            int r7 = r5.O
            if (r7 == r8) goto L_0x0050
            android.widget.GridView r7 = r5.G
            android.support.v4.app.FragmentActivity r0 = r5.getActivity()
            int r1 = r5.O
            float r1 = (float) r1
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r7.setVerticalSpacing(r0)
        L_0x0050:
            int r7 = r5.P
            r0 = 0
            if (r7 != r8) goto L_0x0058
            r5.P = r0
            goto L_0x0066
        L_0x0058:
            android.support.v4.app.FragmentActivity r7 = r5.getActivity()
            int r8 = r5.P
            float r8 = (float) r8
            float r7 = com.bytedance.common.utility.UIUtils.dip2Px(r7, r8)
            int r7 = (int) r7
            r5.P = r7
        L_0x0066:
            android.widget.GridView r7 = r5.G
            int r8 = r5.P
            int r1 = r5.P
            int r2 = r5.P
            int r3 = r5.P
            r7.setPadding(r8, r1, r2, r3)
            android.os.Bundle r7 = r5.getArguments()
            r8 = 1
            if (r7 == 0) goto L_0x009a
            java.lang.String r1 = "media_choose_select_type"
            int r1 = r7.getInt(r1)
            r5.f27938b = r1
            java.lang.String r1 = "media_chooser_type"
            int r1 = r7.getInt(r1, r0)
            r5.f27939c = r1
            java.lang.String r1 = "media_max_select_count"
            int r1 = r7.getInt(r1, r8)
            r5.f27940d = r1
            java.lang.String r1 = "media_select_list"
            java.lang.String[] r7 = r7.getStringArray(r1)
            r5.F = r7
        L_0x009a:
            r7 = 7
            r5.f27939c = r7
            r5.f27938b = r0
            r5.f27940d = r8
            int r7 = r5.f27939c
            r1 = 4
            r2 = 2
            if (r2 == r7) goto L_0x00ac
            if (r1 != r7) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r3 = 0
            goto L_0x00ad
        L_0x00ac:
            r3 = 1
        L_0x00ad:
            r4 = 3
            if (r3 == 0) goto L_0x00b2
        L_0x00b0:
            r1 = 1
            goto L_0x00cf
        L_0x00b2:
            r3 = 6
            if (r3 != r7) goto L_0x00b7
            r3 = 1
            goto L_0x00b8
        L_0x00b7:
            r3 = 0
        L_0x00b8:
            if (r3 == 0) goto L_0x00bc
            r1 = 2
            goto L_0x00cf
        L_0x00bc:
            if (r4 == r7) goto L_0x00c4
            r2 = 5
            if (r2 != r7) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r2 = 0
            goto L_0x00c5
        L_0x00c4:
            r2 = 1
        L_0x00c5:
            if (r2 == 0) goto L_0x00c9
            r1 = 3
            goto L_0x00cf
        L_0x00c9:
            boolean r7 = com.ss.android.chooser.b.a(r7)
            if (r7 == 0) goto L_0x00b0
        L_0x00cf:
            r5.J = r1
            r7 = 2131169815(0x7f071217, float:1.795397E38)
            android.view.View r7 = r6.findViewById(r7)
            r5.B = r7
            android.view.View r7 = r5.B
            android.view.View$OnClickListener r1 = r5.V
            r7.setOnClickListener(r1)
            r7 = 2131169803(0x7f07120b, float:1.7953946E38)
            android.view.View r7 = r6.findViewById(r7)
            r5.A = r7
            android.view.View r7 = r5.A
            android.view.View$OnClickListener r1 = r5.V
            r7.setOnClickListener(r1)
            r7 = 2131169808(0x7f071210, float:1.7953957E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.D = r7
            r7 = 2131168727(0x7f070dd7, float:1.7951764E38)
            android.view.View r7 = r6.findViewById(r7)
            r5.C = r7
            android.view.View r7 = r5.C
            int r1 = r5.f27938b
            if (r8 != r1) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r8 = 0
        L_0x010d:
            if (r8 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r0 = 8
        L_0x0112:
            r7.setVisibility(r0)
            r7 = 2131168400(0x7f070c90, float:1.79511E38)
            android.view.View r7 = r6.findViewById(r7)
            r5.E = r7
            r7 = 2131168301(0x7f070c2d, float:1.79509E38)
            android.view.View r7 = r6.findViewById(r7)
            r5.f27937a = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.chooser.MediaChooserFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* access modifiers changed from: package-private */
    public void a(Bundle bundle, int i2, String str, int i3, Uri uri, int i4, int i5) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setData(uri);
        intent.putExtra("media_source", i2);
        intent.putExtra("media_path", str);
        intent.putExtra("media_type", i3);
        intent.putExtra("media_width", i4);
        intent.putExtra("media_height", i5);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }
}
