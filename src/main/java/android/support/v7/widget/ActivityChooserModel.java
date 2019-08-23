package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ActivityChooserModel extends DataSetObservable {
    static final String LOG_TAG = "ActivityChooserModel";
    private static final Map<String, ActivityChooserModel> sDataModelRegistry = new HashMap();
    private static final Object sRegistryLock = new Object();
    private final List<ActivityResolveInfo> mActivities = new ArrayList();
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter = new DefaultSorter();
    boolean mCanReadHistoricalData = true;
    final Context mContext;
    private final List<HistoricalRecord> mHistoricalRecords = new ArrayList();
    private boolean mHistoricalRecordsChanged = true;
    final String mHistoryFileName;
    private int mHistoryMaxSize = 50;
    private final Object mInstanceLock = new Object();
    private Intent mIntent;
    private boolean mReadShareHistoryCalled = false;
    private boolean mReloadActivities = false;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final ResolveInfo resolveInfo;
        public float weight;

        public final int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public final String toString() {
            return "[" + "resolveInfo:" + this.resolveInfo.toString() + "; weight:" + new BigDecimal((double) this.weight) + "]";
        }

        public ActivityResolveInfo(ResolveInfo resolveInfo2) {
            this.resolveInfo = resolveInfo2;
        }

        public final int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo) obj).weight)) {
                return true;
            }
            return false;
        }
    }

    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    static final class DefaultSorter implements ActivitySorter {
        private final Map<ComponentName, ActivityResolveInfo> mPackageNameToActivityMap = new HashMap();

        DefaultSorter() {
        }

        public final void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2) {
            Map<ComponentName, ActivityResolveInfo> map = this.mPackageNameToActivityMap;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ActivityResolveInfo activityResolveInfo = list.get(i);
                activityResolveInfo.weight = 0.0f;
                map.put(new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name), activityResolveInfo);
            }
            float f2 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f2;
                    f2 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public final int hashCode() {
            int i;
            if (this.activity == null) {
                i = 0;
            } else {
                i = this.activity.hashCode();
            }
            return ((((i + 31) * 31) + ((int) (this.time ^ (this.time >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public final String toString() {
            return "[" + "; activity:" + this.activity + "; time:" + this.time + "; weight:" + new BigDecimal((double) this.weight) + "]";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            if (this.activity == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!this.activity.equals(historicalRecord.activity)) {
                return false;
            }
            if (this.time == historicalRecord.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight)) {
                return true;
            }
            return false;
        }

        public HistoricalRecord(String str, long j, float f2) {
            this(ComponentName.unflattenFromString(str), j, f2);
        }

        public HistoricalRecord(ComponentName componentName, long j, float f2) {
            this.activity = componentName;
            this.time = j;
            this.weight = f2;
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        PersistHistoryAsyncTask() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
            if (r12 != null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r12.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
            if (r12 == null) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
            if (r12 == null) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            if (r12 == null) goto L_0x0096;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = r12[r0]
                java.util.List r1 = (java.util.List) r1
                r2 = 1
                r12 = r12[r2]
                java.lang.String r12 = (java.lang.String) r12
                r3 = 0
                android.support.v7.widget.ActivityChooserModel r4 = android.support.v7.widget.ActivityChooserModel.this     // Catch:{ FileNotFoundException -> 0x0097 }
                android.content.Context r4 = r4.mContext     // Catch:{ FileNotFoundException -> 0x0097 }
                java.io.FileOutputStream r12 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x0097 }
                org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
                r4.setOutput(r12, r3)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r5 = "UTF-8"
                java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                r4.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r5 = "historical-records"
                r4.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                r6 = 0
            L_0x002b:
                if (r6 >= r5) goto L_0x0061
                java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                android.support.v7.widget.ActivityChooserModel$HistoricalRecord r7 = (android.support.v7.widget.ActivityChooserModel.HistoricalRecord) r7     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r8 = "historical-record"
                r4.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r8 = "activity"
                android.content.ComponentName r9 = r7.activity     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r8 = "time"
                long r9 = r7.time     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r8 = "weight"
                float r7 = r7.weight     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                r4.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                java.lang.String r7 = "historical-record"
                r4.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                int r6 = r6 + 1
                goto L_0x002b
            L_0x0061:
                java.lang.String r0 = "historical-records"
                r4.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                r4.endDocument()     // Catch:{ IllegalArgumentException -> 0x008e, IllegalStateException -> 0x0086, IOException -> 0x007e, all -> 0x0073 }
                android.support.v7.widget.ActivityChooserModel r0 = android.support.v7.widget.ActivityChooserModel.this
                r0.mCanReadHistoricalData = r2
                if (r12 == 0) goto L_0x0096
            L_0x006f:
                r12.close()     // Catch:{ IOException -> 0x0096 }
                goto L_0x0096
            L_0x0073:
                r0 = move-exception
                android.support.v7.widget.ActivityChooserModel r1 = android.support.v7.widget.ActivityChooserModel.this
                r1.mCanReadHistoricalData = r2
                if (r12 == 0) goto L_0x007d
                r12.close()     // Catch:{ IOException -> 0x007d }
            L_0x007d:
                throw r0
            L_0x007e:
                android.support.v7.widget.ActivityChooserModel r0 = android.support.v7.widget.ActivityChooserModel.this
                r0.mCanReadHistoricalData = r2
                if (r12 == 0) goto L_0x0096
                goto L_0x006f
            L_0x0086:
                android.support.v7.widget.ActivityChooserModel r0 = android.support.v7.widget.ActivityChooserModel.this
                r0.mCanReadHistoricalData = r2
                if (r12 == 0) goto L_0x0096
                goto L_0x006f
            L_0x008e:
                android.support.v7.widget.ActivityChooserModel r0 = android.support.v7.widget.ActivityChooserModel.this
                r0.mCanReadHistoricalData = r2
                if (r12 == 0) goto L_0x0096
                goto L_0x006f
            L_0x0096:
                return r3
            L_0x0097:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserModel.PersistHistoryAsyncTask.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public int getHistoryMaxSize() {
        int i;
        synchronized (this.mInstanceLock) {
            i = this.mHistoryMaxSize;
        }
        return i;
    }

    public Intent getIntent() {
        Intent intent;
        synchronized (this.mInstanceLock) {
            intent = this.mIntent;
        }
        return intent;
    }

    private void ensureConsistentState() {
        boolean loadActivitiesIfNeeded = loadActivitiesIfNeeded() | readHistoricalDataIfNeeded();
        pruneExcessiveHistoricalRecordsIfNeeded();
        if (loadActivitiesIfNeeded) {
            sortActivitiesIfNeeded();
            notifyChanged();
        }
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded() {
        int size = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
        if (size > 0) {
            this.mHistoricalRecordsChanged = true;
            for (int i = 0; i < size; i++) {
                this.mHistoricalRecords.remove(0);
            }
        }
    }

    private boolean readHistoricalDataIfNeeded() {
        if (!this.mCanReadHistoricalData || !this.mHistoricalRecordsChanged || TextUtils.isEmpty(this.mHistoryFileName)) {
            return false;
        }
        this.mCanReadHistoricalData = false;
        this.mReadShareHistoryCalled = true;
        readHistoricalDataImpl();
        return true;
    }

    public int getActivityCount() {
        int size;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mActivities.size();
        }
        return size;
    }

    public int getHistorySize() {
        int size;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mHistoricalRecords.size();
        }
        return size;
    }

    private boolean loadActivitiesIfNeeded() {
        if (!this.mReloadActivities || this.mIntent == null) {
            return false;
        }
        this.mReloadActivities = false;
        this.mActivities.clear();
        List<ResolveInfo> queryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.mActivities.add(new ActivityResolveInfo(queryIntentActivities.get(i)));
        }
        return true;
    }

    private void persistHistoricalDataIfNeeded() {
        if (!this.mReadShareHistoryCalled) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.mHistoricalRecordsChanged) {
            this.mHistoricalRecordsChanged = false;
            if (!TextUtils.isEmpty(this.mHistoryFileName)) {
                new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.mHistoricalRecords), this.mHistoryFileName});
            }
        }
    }

    private boolean sortActivitiesIfNeeded() {
        if (this.mActivitySorter == null || this.mIntent == null || this.mActivities.isEmpty() || this.mHistoricalRecords.isEmpty()) {
            return false;
        }
        this.mActivitySorter.sort(this.mIntent, this.mActivities, Collections.unmodifiableList(this.mHistoricalRecords));
        return true;
    }

    public ResolveInfo getDefaultActivity() {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            if (this.mActivities.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.mActivities.get(0).resolveInfo;
            return resolveInfo;
        }
    }

    private void readHistoricalDataImpl() {
        try {
            FileInputStream openFileInput = this.mContext.openFileInput(this.mHistoryFileName);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<HistoricalRecord> list = this.mHistoricalRecords;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (!(next == 3 || next == 4)) {
                                if ("historical-record".equals(newPullParser.getName())) {
                                    list.add(new HistoricalRecord(newPullParser.getAttributeValue(null, PushConstants.INTENT_ACTIVITY_NAME), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        } else if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (IOException unused) {
                            }
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (XmlPullParserException unused2) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (IOException unused4) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused5) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused7) {
        }
    }

    public void setOnChooseActivityListener(OnChooseActivityListener onChooseActivityListener) {
        synchronized (this.mInstanceLock) {
            this.mActivityChoserModelPolicy = onChooseActivityListener;
        }
    }

    private boolean addHistoricalRecord(HistoricalRecord historicalRecord) {
        boolean add = this.mHistoricalRecords.add(historicalRecord);
        if (add) {
            this.mHistoricalRecordsChanged = true;
            pruneExcessiveHistoricalRecordsIfNeeded();
            persistHistoricalDataIfNeeded();
            sortActivitiesIfNeeded();
            notifyChanged();
        }
        return add;
    }

    public ResolveInfo getActivity(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            resolveInfo = this.mActivities.get(i).resolveInfo;
        }
        return resolveInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setActivitySorter(android.support.v7.widget.ActivityChooserModel.ActivitySorter r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            android.support.v7.widget.ActivityChooserModel$ActivitySorter r1 = r2.mActivitySorter     // Catch:{ all -> 0x0016 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            r2.mActivitySorter = r3     // Catch:{ all -> 0x0016 }
            boolean r3 = r2.sortActivitiesIfNeeded()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            r2.notifyChanged()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserModel.setActivitySorter(android.support.v7.widget.ActivityChooserModel$ActivitySorter):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setHistoryMaxSize(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            int r1 = r2.mHistoryMaxSize     // Catch:{ all -> 0x0019 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0009:
            r2.mHistoryMaxSize = r3     // Catch:{ all -> 0x0019 }
            r2.pruneExcessiveHistoricalRecordsIfNeeded()     // Catch:{ all -> 0x0019 }
            boolean r3 = r2.sortActivitiesIfNeeded()     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            r2.notifyChanged()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserModel.setHistoryMaxSize(int):void");
    }

    public void setIntent(Intent intent) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent != intent) {
                this.mIntent = intent;
                this.mReloadActivities = true;
                ensureConsistentState();
            }
        }
    }

    public int getActivityIndex(ResolveInfo resolveInfo) {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            List<ActivityResolveInfo> list = this.mActivities;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).resolveInfo == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Intent chooseActivity(int i) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == null) {
                return null;
            }
            ensureConsistentState();
            ActivityResolveInfo activityResolveInfo = this.mActivities.get(i);
            ComponentName componentName = new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name);
            Intent intent = new Intent(this.mIntent);
            intent.setComponent(componentName);
            if (this.mActivityChoserModelPolicy != null) {
                if (this.mActivityChoserModelPolicy.onChooseActivity(this, new Intent(intent))) {
                    return null;
                }
            }
            addHistoricalRecord(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public void setDefaultActivity(int i) {
        float f2;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            ActivityResolveInfo activityResolveInfo = this.mActivities.get(i);
            ActivityResolveInfo activityResolveInfo2 = this.mActivities.get(0);
            if (activityResolveInfo2 != null) {
                f2 = (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f;
            } else {
                f2 = 1.0f;
            }
            addHistoricalRecord(new HistoricalRecord(new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), f2));
        }
    }

    public static ActivityChooserModel get(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (sRegistryLock) {
            activityChooserModel = sDataModelRegistry.get(str);
            if (activityChooserModel == null) {
                activityChooserModel = new ActivityChooserModel(context, str);
                sDataModelRegistry.put(str, activityChooserModel);
            }
        }
        return activityChooserModel;
    }

    private ActivityChooserModel(Context context, String str) {
        this.mContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.mHistoryFileName = str;
            return;
        }
        this.mHistoryFileName = str + ".xml";
    }
}
