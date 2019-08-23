package com.zhihu.matisse.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.FileProvider;
import android.support.v4.os.EnvironmentCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.internal.a.b;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.entity.d;
import com.zhihu.matisse.internal.model.AlbumCollection;
import com.zhihu.matisse.internal.ui.AlbumPreviewActivity;
import com.zhihu.matisse.internal.ui.MediaSelectionFragment;
import com.zhihu.matisse.internal.ui.SelectedPreviewActivity;
import com.zhihu.matisse.internal.ui.adapter.AlbumMediaAdapter;
import com.zhihu.matisse.internal.ui.widget.CheckRadioView;
import com.zhihu.matisse.internal.ui.widget.IncapableDialog;
import com.zhihu.matisse.internal.ui.widget.a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class MatisseActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, AlbumCollection.a, MediaSelectionFragment.a, AlbumMediaAdapter.a, AlbumMediaAdapter.b, AlbumMediaAdapter.c {

    /* renamed from: a  reason: collision with root package name */
    public final AlbumCollection f82735a = new AlbumCollection();

    /* renamed from: b  reason: collision with root package name */
    public a f82736b;

    /* renamed from: c  reason: collision with root package name */
    private com.zhihu.matisse.internal.a.a f82737c;

    /* renamed from: d  reason: collision with root package name */
    private com.zhihu.matisse.internal.model.a f82738d = new com.zhihu.matisse.internal.model.a(this);

    /* renamed from: e  reason: collision with root package name */
    private d f82739e;

    /* renamed from: f  reason: collision with root package name */
    private com.zhihu.matisse.internal.ui.adapter.a f82740f;
    private TextView g;
    private TextView h;
    private View i;
    private View j;
    private LinearLayout k;
    private CheckRadioView l;
    private boolean m;

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public final com.zhihu.matisse.internal.model.a c() {
        return this.f82738d;
    }

    public final void a() {
        this.f82740f.swapCursor(null);
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    public final void b() {
        e();
        if (this.f82739e.r != null) {
            this.f82738d.c();
            this.f82738d.d();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AlbumCollection albumCollection = this.f82735a;
        if (albumCollection.f82662b != null) {
            albumCollection.f82662b.destroyLoader(1);
        }
        albumCollection.f82663c = null;
        this.f82739e.v = null;
        this.f82739e.r = null;
    }

    private int g() {
        int f2 = this.f82738d.f();
        int i2 = 0;
        for (int i3 = 0; i3 < f2; i3++) {
            c cVar = (c) this.f82738d.b().get(i3);
            if (cVar.a() && com.zhihu.matisse.internal.a.c.a(cVar.f82644d) > ((float) this.f82739e.u)) {
                i2++;
            }
        }
        return i2;
    }

    private void e() {
        int f2 = this.f82738d.f();
        if (f2 == 0) {
            this.g.setEnabled(false);
            this.h.setEnabled(false);
            this.h.setText(getString(C0906R.string.bad));
        } else if (f2 != 1 || !this.f82739e.b()) {
            this.g.setEnabled(true);
            this.h.setEnabled(true);
            this.h.setText(getString(C0906R.string.bac, new Object[]{Integer.valueOf(f2)}));
        } else {
            this.g.setEnabled(true);
            this.h.setText(C0906R.string.bad);
            this.h.setEnabled(true);
        }
        if (this.f82739e.s) {
            this.k.setVisibility(0);
            f();
            return;
        }
        this.k.setVisibility(4);
    }

    private void f() {
        this.l.setChecked(this.m);
        if (g() > 0 && this.m) {
            IncapableDialog.a("", getString(C0906R.string.bak, new Object[]{Integer.valueOf(this.f82739e.u)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
            this.l.setChecked(false);
            this.m = false;
        }
    }

    public final void d() {
        File file;
        if (this.f82737c != null) {
            com.zhihu.matisse.internal.a.a aVar = this.f82737c;
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(getPackageManager()) != null) {
                File file2 = null;
                try {
                    String format = String.format("JPEG_%s.jpg", new Object[]{new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date())});
                    if (aVar.f82626c.f82638a) {
                        file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } else {
                        file = ((Activity) aVar.f82624a.get()).getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                    }
                    if (aVar.f82626c.f82640c != null) {
                        file = new File(file, aVar.f82626c.f82640c);
                    }
                    File file3 = new File(file, format);
                    if ("mounted".equals(EnvironmentCompat.getStorageState(file3))) {
                        file2 = file3;
                    }
                } catch (IOException unused) {
                }
                if (file2 != null) {
                    aVar.f82628e = file2.getAbsolutePath();
                    aVar.f82627d = FileProvider.getUriForFile((Context) aVar.f82624a.get(), aVar.f82626c.f82639b, file2);
                    intent.putExtra("output", aVar.f82627d);
                    intent.addFlags(2);
                    if (Build.VERSION.SDK_INT < 21) {
                        for (ResolveInfo resolveInfo : getPackageManager().queryIntentActivities(intent, 65536)) {
                            grantUriPermission(resolveInfo.activityInfo.packageName, aVar.f82627d, 3);
                        }
                    }
                    if (aVar.f82625b != null) {
                        ((Fragment) aVar.f82625b.get()).startActivityForResult(intent, 24);
                        return;
                    }
                    ((Activity) aVar.f82624a.get()).startActivityForResult(intent, 24);
                }
            }
        }
    }

    public final void a(final Cursor cursor) {
        this.f82740f.swapCursor(cursor);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (!cursor.isClosed()) {
                    cursor.moveToPosition(MatisseActivity.this.f82735a.f82664d);
                    a aVar = MatisseActivity.this.f82736b;
                    MatisseActivity matisseActivity = MatisseActivity.this;
                    int i = MatisseActivity.this.f82735a.f82664d;
                    aVar.f82731c.setSelection(i);
                    aVar.a(matisseActivity, i);
                    com.zhihu.matisse.internal.entity.a a2 = com.zhihu.matisse.internal.entity.a.a(cursor);
                    if (a2.b() && d.a().k) {
                        a2.a();
                    }
                    MatisseActivity.this.a(a2);
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f82738d.b(bundle);
        bundle.putInt("state_current_selection", this.f82735a.f82664d);
        bundle.putBoolean("checkState", this.m);
    }

    public final void a(com.zhihu.matisse.internal.entity.a aVar) {
        if (!aVar.b() || !aVar.c()) {
            this.i.setVisibility(0);
            this.j.setVisibility(8);
            getSupportFragmentManager().beginTransaction().replace(C0906R.id.y9, MediaSelectionFragment.a(aVar), MediaSelectionFragment.class.getSimpleName()).commitAllowingStateLoss();
            return;
        }
        this.i.setVisibility(8);
        this.j.setVisibility(0);
    }

    public void onClick(View view) {
        if (view.getId() == C0906R.id.px) {
            Intent intent = new Intent(this, SelectedPreviewActivity.class);
            intent.putExtra("extra_default_bundle", this.f82738d.a());
            intent.putExtra("extra_result_original_enable", this.m);
            startActivityForResult(intent, 23);
        } else if (view.getId() == C0906R.id.ps) {
            Intent intent2 = new Intent();
            intent2.putParcelableArrayListExtra("extra_result_selection", (ArrayList) this.f82738d.c());
            intent2.putStringArrayListExtra("extra_result_selection_path", (ArrayList) this.f82738d.d());
            intent2.putExtra("extra_result_original_enable", this.m);
            setResult(-1, intent2);
            finish();
        } else {
            if (view.getId() == C0906R.id.bvk) {
                int g2 = g();
                if (g2 > 0) {
                    IncapableDialog.a("", getString(C0906R.string.baj, new Object[]{Integer.valueOf(g2), Integer.valueOf(this.f82739e.u)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
                    return;
                }
                this.m = !this.m;
                this.l.setChecked(this.m);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        this.f82739e = d.a();
        setTheme(this.f82739e.f82649d);
        super.onCreate(bundle);
        if (!this.f82739e.q) {
            setResult(0);
            finish();
            return;
        }
        setContentView((int) C0906R.layout.cf);
        if (this.f82739e.c()) {
            setRequestedOrientation(this.f82739e.f82650e);
        }
        if (this.f82739e.k) {
            this.f82737c = new com.zhihu.matisse.internal.a.a(this);
            if (this.f82739e.l != null) {
                this.f82737c.f82626c = this.f82739e.l;
            } else {
                throw new RuntimeException("Don't forget to set CaptureStrategy.");
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(C0906R.id.d4f);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayShowTitleEnabled(false);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{C0906R.attr.ab});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        navigationIcon.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        this.g = (TextView) findViewById(C0906R.id.px);
        this.h = (TextView) findViewById(C0906R.id.ps);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i = findViewById(C0906R.id.y9);
        this.j = findViewById(C0906R.id.a9x);
        this.k = (LinearLayout) findViewById(C0906R.id.bvk);
        this.l = (CheckRadioView) findViewById(C0906R.id.bvj);
        this.k.setOnClickListener(this);
        this.f82738d.a(bundle);
        if (bundle != null) {
            this.m = bundle.getBoolean("checkState");
        }
        e();
        this.f82740f = new com.zhihu.matisse.internal.ui.adapter.a(this, null, false);
        this.f82736b = new a(this);
        this.f82736b.f82732d = this;
        a aVar = this.f82736b;
        aVar.f82730b = (TextView) findViewById(C0906R.id.cnf);
        Drawable drawable = aVar.f82730b.getCompoundDrawables()[2];
        TypedArray obtainStyledAttributes2 = aVar.f82730b.getContext().getTheme().obtainStyledAttributes(new int[]{C0906R.attr.ab});
        int color2 = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        drawable.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
        aVar.f82730b.setVisibility(8);
        aVar.f82730b.setOnClickListener(new View.OnClickListener() {
            public final void onClick(
/*
Method generation error in method: com.zhihu.matisse.internal.ui.widget.a.2.onClick(android.view.View):void, dex: classes6.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.zhihu.matisse.internal.ui.widget.a.2.onClick(android.view.View):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        });
        aVar.f82730b.setOnTouchListener(aVar.f82731c.createDragToOpenListener(aVar.f82730b));
        a aVar2 = this.f82736b;
        aVar2.f82731c.setAnchorView(findViewById(C0906R.id.d4f));
        a aVar3 = this.f82736b;
        com.zhihu.matisse.internal.ui.adapter.a aVar4 = this.f82740f;
        aVar3.f82731c.setAdapter(aVar4);
        aVar3.f82729a = aVar4;
        AlbumCollection albumCollection = this.f82735a;
        albumCollection.f82661a = new WeakReference<>(this);
        albumCollection.f82662b = getSupportLoaderManager();
        albumCollection.f82663c = this;
        AlbumCollection albumCollection2 = this.f82735a;
        if (bundle != null) {
            albumCollection2.f82664d = bundle.getInt("state_current_selection");
        }
        AlbumCollection albumCollection3 = this.f82735a;
        albumCollection3.f82662b.initLoader(1, null, albumCollection3);
    }

    public final void a(com.zhihu.matisse.internal.entity.a aVar, c cVar, int i2) {
        Intent intent = new Intent(this, AlbumPreviewActivity.class);
        intent.putExtra("extra_album", aVar);
        intent.putExtra("extra_item", cVar);
        intent.putExtra("extra_default_bundle", this.f82738d.a());
        intent.putExtra("extra_result_original_enable", this.m);
        startActivityForResult(intent, 23);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1) {
            if (i2 == 23) {
                Bundle bundleExtra = intent.getBundleExtra("extra_result_bundle");
                ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
                this.m = intent.getBooleanExtra("extra_result_original_enable", false);
                int i4 = bundleExtra.getInt("state_collection_type", 0);
                if (intent.getBooleanExtra("extra_result_apply", false)) {
                    Intent intent2 = new Intent();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (parcelableArrayList != null) {
                        Iterator it2 = parcelableArrayList.iterator();
                        while (it2.hasNext()) {
                            c cVar = (c) it2.next();
                            arrayList.add(cVar.f82643c);
                            arrayList2.add(b.a(this, cVar.f82643c));
                        }
                    }
                    intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
                    intent2.putStringArrayListExtra("extra_result_selection_path", arrayList2);
                    intent2.putExtra("extra_result_original_enable", this.m);
                    setResult(-1, intent2);
                    finish();
                } else {
                    com.zhihu.matisse.internal.model.a aVar = this.f82738d;
                    if (parcelableArrayList.size() == 0) {
                        aVar.f82670b = 0;
                    } else {
                        aVar.f82670b = i4;
                    }
                    aVar.f82669a.clear();
                    aVar.f82669a.addAll(parcelableArrayList);
                    Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(MediaSelectionFragment.class.getSimpleName());
                    if (findFragmentByTag instanceof MediaSelectionFragment) {
                        ((MediaSelectionFragment) findFragmentByTag).f82680a.notifyDataSetChanged();
                    }
                    e();
                }
            } else if (i2 == 24) {
                Uri uri = this.f82737c.f82627d;
                String str = this.f82737c.f82628e;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(uri);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(str);
                Intent intent3 = new Intent();
                intent3.putParcelableArrayListExtra("extra_result_selection", arrayList3);
                intent3.putStringArrayListExtra("extra_result_selection_path", arrayList4);
                setResult(-1, intent3);
                if (Build.VERSION.SDK_INT < 21) {
                    revokeUriPermission(uri, 3);
                }
                finish();
            }
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f82735a.f82664d = i2;
        this.f82740f.getCursor().moveToPosition(i2);
        com.zhihu.matisse.internal.entity.a a2 = com.zhihu.matisse.internal.entity.a.a(this.f82740f.getCursor());
        if (a2.b() && d.a().k) {
            a2.a();
        }
        a(a2);
    }
}
