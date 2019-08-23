package cat.ereza.customactivityoncrash.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cat.ereza.customactivityoncrash.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;
import java.io.Serializable;

public final class DefaultErrorActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        final a.C0004a aVar;
        super.onCreate(bundle);
        setContentView(C0906R.layout.hy);
        Button button = (Button) findViewById(C0906R.id.a25);
        final Class<? extends Activity> b2 = a.b(getIntent());
        Serializable serializableExtra = getIntent().getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_EVENT_LISTENER");
        if (serializableExtra == null || !(serializableExtra instanceof a.C0004a)) {
            aVar = null;
        } else {
            aVar = (a.C0004a) serializableExtra;
        }
        if (b2 != null) {
            button.setText(C0906R.string.a40);
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    a.a(DefaultErrorActivity.this, new Intent(DefaultErrorActivity.this, b2), aVar);
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    a.a((Activity) DefaultErrorActivity.this, aVar);
                }
            });
        }
        Button button2 = (Button) findViewById(C0906R.id.a24);
        if (getIntent().getBooleanExtra("cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS", true)) {
            button2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ((TextView) new AlertDialog.Builder(DefaultErrorActivity.this).setTitle(C0906R.string.a3y).setMessage(a.a((Context) DefaultErrorActivity.this, DefaultErrorActivity.this.getIntent())).setPositiveButton(C0906R.string.a3v, null).setNeutralButton(C0906R.string.a3x, new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
                            String a2 = a.a((Context) defaultErrorActivity, defaultErrorActivity.getIntent());
                            if (Build.VERSION.SDK_INT >= 11) {
                                ((ClipboardManager) defaultErrorActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(defaultErrorActivity.getString(C0906R.string.a3u), a2));
                            } else {
                                ((android.text.ClipboardManager) defaultErrorActivity.getSystemService("clipboard")).setText(a2);
                            }
                            Toast makeText = Toast.makeText(DefaultErrorActivity.this, C0906R.string.a3w, 0);
                            if (Build.VERSION.SDK_INT == 25) {
                                eq.a(makeText);
                            }
                            makeText.show();
                        }
                    }).show().findViewById(16908299)).setTextSize(0, DefaultErrorActivity.this.getResources().getDimension(C0906R.dimen.d9));
                }
            });
        } else {
            button2.setVisibility(8);
        }
        int intExtra = getIntent().getIntExtra("cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID", 2130838555);
        ImageView imageView = (ImageView) findViewById(C0906R.id.a23);
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageDrawable(getResources().getDrawable(intExtra, getTheme()));
        } else {
            imageView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), intExtra));
        }
    }
}
