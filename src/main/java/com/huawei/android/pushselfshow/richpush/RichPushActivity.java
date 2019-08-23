package com.huawei.android.pushselfshow.richpush;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.richpush.favorites.FavoritesActivity;
import com.huawei.android.pushselfshow.richpush.html.HtmlViewer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class RichPushActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    String f25223a = "";

    /* renamed from: b  reason: collision with root package name */
    private Class f25224b;

    /* renamed from: c  reason: collision with root package name */
    private Object f25225c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f25226d;
    public Activity m_activity = this;
    public boolean mkInstance;

    private HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put("html", HtmlViewer.class);
        hashMap.put("favorite", FavoritesActivity.class);
        return hashMap;
    }

    private void a(String str, Class[] clsArr, Object[] objArr) {
        String str2;
        StringBuilder sb;
        String noSuchMethodException;
        if (this.f25224b != null && this.f25225c != null && !TextUtils.isEmpty(str) && clsArr != null && objArr != null) {
            try {
                this.f25224b.getDeclaredMethod(str, clsArr).invoke(this.f25225c, objArr);
            } catch (NoSuchMethodException e2) {
                str2 = "PushSelfShowLog";
                sb = new StringBuilder();
                sb.append(this.f25224b.getName());
                sb.append(" doesn't has ");
                sb.append(str);
                sb.append(" method,err info ");
                noSuchMethodException = e2.toString();
                sb.append(noSuchMethodException);
                e.a(str2, sb.toString());
            } catch (IllegalAccessException e3) {
                str2 = "PushSelfShowLog";
                sb = new StringBuilder();
                sb.append(this.f25224b.getName());
                sb.append(" doesn't has ");
                sb.append(str);
                sb.append(" method,err info ");
                noSuchMethodException = e3.toString();
                sb.append(noSuchMethodException);
                e.a(str2, sb.toString());
            } catch (IllegalArgumentException e4) {
                str2 = "PushSelfShowLog";
                sb = new StringBuilder();
                sb.append(this.f25224b.getName());
                sb.append(" doesn't has ");
                sb.append(str);
                sb.append(" method,err info ");
                noSuchMethodException = e4.toString();
                sb.append(noSuchMethodException);
                e.a(str2, sb.toString());
            } catch (InvocationTargetException e5) {
                str2 = "PushSelfShowLog";
                sb = new StringBuilder();
                sb.append(this.f25224b.getName());
                sb.append(" doesn't has ");
                sb.append(str);
                sb.append(" method,err info ");
                noSuchMethodException = e5.toString();
                sb.append(noSuchMethodException);
                e.a(str2, sb.toString());
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        e.a("PushSelfShowLog", "enter onActivityResult of RichPush");
        if (!this.mkInstance) {
            super.onActivityResult(i, i2, intent);
        }
        a("onActivityResult", new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent});
    }

    public void onCreate(Bundle bundle) {
        this.m_activity.setRequestedOrientation(5);
        if (!this.mkInstance) {
            super.onCreate(bundle);
        }
        e.a((Context) this.m_activity);
        e.a("PushSelfShowLog", "enter onCreate of RichPush ");
        if (this.f25226d == null || this.f25226d.isEmpty()) {
            this.f25226d = a();
        }
        Intent intent = this.m_activity.getIntent();
        e.a("PushSelfShowLog", "enter onCreate of RichPush  intent " + intent);
        if (intent == null) {
            finish();
            return;
        }
        if (bundle != null) {
            intent.putExtra("collect_img_disable", bundle.getBoolean("collect_img_disable"));
        }
        try {
            this.f25223a = intent.getStringExtra("type");
        } catch (Exception unused) {
            e.d("PushSelfShowLog", "getStringExtra type error");
        }
        e.a("PushSelfShowLog", "the showType is :" + this.f25223a);
        if (this.f25226d.containsKey(this.f25223a)) {
            this.f25224b = (Class) this.f25226d.get(this.f25223a);
            try {
                this.f25225c = this.f25224b.getConstructor(new Class[0]).newInstance(new Object[0]);
                Method declaredMethod = this.f25224b.getDeclaredMethod("setActivity", new Class[]{Activity.class});
                e.a("PushSelfShowLog", "call setActivity in RichPush!");
                declaredMethod.invoke(this.f25225c, new Object[]{this.m_activity});
                this.f25224b.getDeclaredMethod("onCreate", new Class[]{Intent.class}).invoke(this.f25225c, new Object[]{intent});
            } catch (NoSuchMethodException e2) {
                e.a("PushSelfShowLog", this.f25224b.getName() + " doesn't has onCreate method,err info " + e2.toString());
            } catch (InstantiationException e3) {
                e.a("PushSelfShowLog", this.f25224b.getName() + " doesn't has onCreate method,err info " + e3.toString());
            } catch (IllegalAccessException e4) {
                e.a("PushSelfShowLog", this.f25224b.getName() + " doesn't has onCreate method,err info " + e4.toString());
            } catch (IllegalArgumentException e5) {
                e.a("PushSelfShowLog", this.f25224b.getName() + " doesn't has onCreate method,err info " + e5.toString());
            } catch (InvocationTargetException e6) {
                e.a("PushSelfShowLog", this.f25224b.getName() + " doesn't has onCreate method,err info " + e6.toString());
            }
        } else {
            e.a("PushSelfShowLog", "the showType is invalid");
            finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        a("onCreateOptionsMenu", new Class[]{Menu.class}, new Object[]{menu});
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        e.a("PushSelfShowLog", "enter onDestroy of RichPush");
        if (!this.mkInstance) {
            super.onDestroy();
        }
        a("onDestroy", new Class[0], new Object[0]);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        e.a("PushSelfShowLog", "enter onKeyDown of RichPush");
        a("onKeyDown", new Class[]{Integer.TYPE, KeyEvent.class}, new Object[]{Integer.valueOf(i), keyEvent});
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        a("onOptionsItemSelected", new Class[]{MenuItem.class}, new Object[]{menuItem});
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        e.a("PushSelfShowLog", "enter onPause of RichPush");
        if (!this.mkInstance) {
            super.onPause();
        }
        a("onPause", new Class[0], new Object[0]);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        a("onPrepareOptionsMenu", new Class[]{Menu.class}, new Object[]{menu});
        return super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        e.a("PushSelfShowLog", "enter onRequestPermissionsResult of RichPush");
        if (!this.mkInstance) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
        a("onRequestPermissionsResult", new Class[]{Integer.TYPE, String[].class, int[].class}, new Object[]{Integer.valueOf(i), strArr, iArr});
    }

    public void onRestart() {
        e.a("PushSelfShowLog", "enter onRestart of RichPush");
        if (!this.mkInstance) {
            super.onRestart();
        }
        a("onRestart", new Class[0], new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        e.a("PushSelfShowLog", "enter onResume of RichPush");
        if (!this.mkInstance) {
            super.onResume();
        }
        a("onResume", new Class[0], new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        e.a("PushSelfShowLog", "enter onSaveInstanceState of RichPush");
        if (!this.mkInstance) {
            super.onSaveInstanceState(bundle);
        }
        a("onSaveInstanceState", new Class[]{Bundle.class}, new Object[]{bundle});
    }

    public void onStart() {
        e.a("PushSelfShowLog", "enter onStart of RichPush");
        if (!this.mkInstance) {
            super.onStart();
        }
        a("onStart", new Class[0], new Object[0]);
    }

    public void onStop() {
        e.a("PushSelfShowLog", "enter onStop of RichPush， and mkInstance is " + this.mkInstance + "and pActivityClass is " + this.f25224b + ",and pActivityInstance is " + this.f25225c);
        if (!this.mkInstance) {
            super.onStop();
        }
        a("onStop", new Class[0], new Object[0]);
    }

    public void setActivity(Activity activity) {
        this.m_activity = activity;
        this.mkInstance = true;
    }
}
