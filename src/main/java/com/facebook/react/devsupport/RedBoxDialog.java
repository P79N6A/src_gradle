package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.a;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.ss.android.ugc.aweme.C0906R;
import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

public class RedBoxDialog extends Dialog implements AdapterView.OnItemClickListener {
    public boolean isReporting;
    private Button mCopyToClipboardButton;
    public final DevSupportManager mDevSupportManager;
    private Button mDismissButton;
    private final DoubleTapReloadRecognizer mDoubleTapReloadRecognizer;
    @Nullable
    public View mLineSeparator;
    @Nullable
    public ProgressBar mLoadingIndicator;
    @Nullable
    public final RedBoxHandler mRedBoxHandler;
    private Button mReloadJsButton;
    @Nullable
    public Button mReportButton;
    private View.OnClickListener mReportButtonOnClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            if (RedBoxDialog.this.mRedBoxHandler != null && RedBoxDialog.this.mRedBoxHandler.isReportEnabled() && !RedBoxDialog.this.isReporting) {
                RedBoxDialog.this.isReporting = true;
                ((TextView) a.b(RedBoxDialog.this.mReportTextView)).setText("Reporting...");
                ((TextView) a.b(RedBoxDialog.this.mReportTextView)).setVisibility(0);
                ((ProgressBar) a.b(RedBoxDialog.this.mLoadingIndicator)).setVisibility(0);
                ((View) a.b(RedBoxDialog.this.mLineSeparator)).setVisibility(0);
                ((Button) a.b(RedBoxDialog.this.mReportButton)).setEnabled(false);
                String sourceUrl = RedBoxDialog.this.mDevSupportManager.getSourceUrl();
                RedBoxDialog.this.mRedBoxHandler.reportRedbox(view.getContext(), (String) a.b(RedBoxDialog.this.mDevSupportManager.getLastErrorTitle()), (StackFrame[]) a.b(RedBoxDialog.this.mDevSupportManager.getLastErrorStack()), sourceUrl, (RedBoxHandler.ReportCompletedListener) a.b(RedBoxDialog.this.mReportCompletedListener));
            }
        }
    };
    public RedBoxHandler.ReportCompletedListener mReportCompletedListener = new RedBoxHandler.ReportCompletedListener() {
        public void onReportError(SpannedString spannedString) {
            RedBoxDialog.this.isReporting = false;
            ((Button) a.b(RedBoxDialog.this.mReportButton)).setEnabled(true);
            ((ProgressBar) a.b(RedBoxDialog.this.mLoadingIndicator)).setVisibility(8);
            ((TextView) a.b(RedBoxDialog.this.mReportTextView)).setText(spannedString);
        }

        public void onReportSuccess(SpannedString spannedString) {
            RedBoxDialog.this.isReporting = false;
            ((Button) a.b(RedBoxDialog.this.mReportButton)).setEnabled(true);
            ((ProgressBar) a.b(RedBoxDialog.this.mLoadingIndicator)).setVisibility(8);
            ((TextView) a.b(RedBoxDialog.this.mReportTextView)).setText(spannedString);
        }
    };
    @Nullable
    public TextView mReportTextView;
    private ListView mStackView;

    static class CopyToHostClipBoardTask extends AsyncTask<String, Void, Void> {
        private final DevSupportManager mDevSupportManager;

        private CopyToHostClipBoardTask(DevSupportManager devSupportManager) {
            this.mDevSupportManager = devSupportManager;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(String... strArr) {
            try {
                String uri = Uri.parse(this.mDevSupportManager.getSourceUrl()).buildUpon().path("/copy-to-clipboard").query(null).build().toString();
                for (String create : strArr) {
                    new OkHttpClient().newCall(new Request.Builder().url(uri).post(RequestBody.create((MediaType) null, create)).build()).execute();
                }
            } catch (Exception e2) {
                FLog.e("ReactNative", "Could not copy to the host clipboard", (Throwable) e2);
            }
            return null;
        }
    }

    static class OpenStackFrameTask extends AsyncTask<StackFrame, Void, Void> {
        private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        private final DevSupportManager mDevSupportManager;

        private OpenStackFrameTask(DevSupportManager devSupportManager) {
            this.mDevSupportManager = devSupportManager;
        }

        private static JSONObject stackFrameToJson(StackFrame stackFrame) {
            return new JSONObject(MapBuilder.of("file", stackFrame.getFile(), "methodName", stackFrame.getMethod(), "lineNumber", Integer.valueOf(stackFrame.getLine()), "column", Integer.valueOf(stackFrame.getColumn())));
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(StackFrame... stackFrameArr) {
            try {
                String uri = Uri.parse(this.mDevSupportManager.getSourceUrl()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (StackFrame stackFrameToJson : stackFrameArr) {
                    okHttpClient.newCall(new Request.Builder().url(uri).post(RequestBody.create(JSON, stackFrameToJson(stackFrameToJson).toString())).build()).execute();
                }
            } catch (Exception e2) {
                FLog.e("ReactNative", "Could not open stack frame", (Throwable) e2);
            }
            return null;
        }
    }

    static class StackAdapter extends BaseAdapter {
        private final StackFrame[] mStack;
        private final String mTitle;

        static class FrameViewHolder {
            public final TextView mFileView;
            public final TextView mMethodView;

            private FrameViewHolder(View view) {
                this.mMethodView = (TextView) view.findViewById(C0906R.id.cgy);
                this.mFileView = (TextView) view.findViewById(C0906R.id.cgx);
            }
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        public int getViewTypeCount() {
            return 2;
        }

        public boolean isEnabled(int i) {
            return i > 0;
        }

        public int getCount() {
            return this.mStack.length + 1;
        }

        public Object getItem(int i) {
            if (i == 0) {
                return this.mTitle;
            }
            return this.mStack[i - 1];
        }

        public StackAdapter(String str, StackFrame[] stackFrameArr) {
            this.mTitle = str;
            this.mStack = stackFrameArr;
        }

        /* JADX WARNING: type inference failed for: r3v7, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L_0x0020
                if (r4 == 0) goto L_0x0008
                android.widget.TextView r4 = (android.widget.TextView) r4
                goto L_0x001a
            L_0x0008:
                android.content.Context r3 = r5.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                r4 = 2131690980(0x7f0f05e4, float:1.9011019E38)
                android.view.View r3 = r3.inflate(r4, r5, r0)
                r4 = r3
                android.widget.TextView r4 = (android.widget.TextView) r4
            L_0x001a:
                java.lang.String r3 = r2.mTitle
                r4.setText(r3)
                return r4
            L_0x0020:
                if (r4 != 0) goto L_0x003a
                android.content.Context r4 = r5.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                r1 = 2131690979(0x7f0f05e3, float:1.9011017E38)
                android.view.View r4 = r4.inflate(r1, r5, r0)
                com.facebook.react.devsupport.RedBoxDialog$StackAdapter$FrameViewHolder r5 = new com.facebook.react.devsupport.RedBoxDialog$StackAdapter$FrameViewHolder
                r0 = 0
                r5.<init>(r4)
                r4.setTag(r5)
            L_0x003a:
                com.facebook.react.devsupport.interfaces.StackFrame[] r5 = r2.mStack
                int r3 = r3 + -1
                r3 = r5[r3]
                java.lang.Object r5 = r4.getTag()
                com.facebook.react.devsupport.RedBoxDialog$StackAdapter$FrameViewHolder r5 = (com.facebook.react.devsupport.RedBoxDialog.StackAdapter.FrameViewHolder) r5
                android.widget.TextView r0 = r5.mMethodView
                java.lang.String r1 = r3.getMethod()
                r0.setText(r1)
                android.widget.TextView r5 = r5.mFileView
                java.lang.String r3 = com.facebook.react.devsupport.StackTraceHelper.formatFrameSource(r3)
                r5.setText(r3)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.RedBoxDialog.StackAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    public void resetReporting() {
        if (this.mRedBoxHandler != null && this.mRedBoxHandler.isReportEnabled()) {
            this.isReporting = false;
            ((TextView) a.b(this.mReportTextView)).setVisibility(8);
            ((ProgressBar) a.b(this.mLoadingIndicator)).setVisibility(8);
            ((View) a.b(this.mLineSeparator)).setVisibility(8);
            ((Button) a.b(this.mReportButton)).setVisibility(0);
            ((Button) a.b(this.mReportButton)).setEnabled(true);
        }
    }

    public void setExceptionDetails(String str, StackFrame[] stackFrameArr) {
        this.mStackView.setAdapter(new StackAdapter(str, stackFrameArr));
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82) {
            this.mDevSupportManager.showDevOptionsDialog();
            return true;
        }
        if (this.mDoubleTapReloadRecognizer.didDoubleTapR(i, getCurrentFocus())) {
            this.mDevSupportManager.handleReloadJS();
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected RedBoxDialog(Context context, DevSupportManager devSupportManager, @Nullable RedBoxHandler redBoxHandler) {
        super(context, C0906R.style.l6);
        requestWindowFeature(1);
        setContentView(C0906R.layout.ach);
        this.mDevSupportManager = devSupportManager;
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.mRedBoxHandler = redBoxHandler;
        this.mStackView = (ListView) findViewById(C0906R.id.ch6);
        this.mStackView.setOnItemClickListener(this);
        this.mReloadJsButton = (Button) findViewById(C0906R.id.ch3);
        this.mReloadJsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RedBoxDialog.this.mDevSupportManager.handleReloadJS();
            }
        });
        this.mDismissButton = (Button) findViewById(C0906R.id.ch0);
        this.mDismissButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RedBoxDialog.this.dismiss();
            }
        });
        this.mCopyToClipboardButton = (Button) findViewById(C0906R.id.cgz);
        this.mCopyToClipboardButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String lastErrorTitle = RedBoxDialog.this.mDevSupportManager.getLastErrorTitle();
                StackFrame[] lastErrorStack = RedBoxDialog.this.mDevSupportManager.getLastErrorStack();
                a.b(lastErrorTitle);
                a.b(lastErrorStack);
                new CopyToHostClipBoardTask(RedBoxDialog.this.mDevSupportManager).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{StackTraceHelper.formatStackTrace(lastErrorTitle, lastErrorStack)});
            }
        });
        if (this.mRedBoxHandler != null && this.mRedBoxHandler.isReportEnabled()) {
            this.mLoadingIndicator = (ProgressBar) findViewById(C0906R.id.ch2);
            this.mLineSeparator = findViewById(C0906R.id.ch1);
            this.mReportTextView = (TextView) findViewById(C0906R.id.ch5);
            this.mReportTextView.setMovementMethod(LinkMovementMethod.getInstance());
            this.mReportTextView.setHighlightColor(0);
            this.mReportButton = (Button) findViewById(C0906R.id.ch4);
            this.mReportButton.setOnClickListener(this.mReportButtonOnClickListener);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new OpenStackFrameTask(this.mDevSupportManager).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new StackFrame[]{(StackFrame) this.mStackView.getAdapter().getItem(i)});
    }
}
