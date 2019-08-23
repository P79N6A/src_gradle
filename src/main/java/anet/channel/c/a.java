package anet.channel.c;

import anet.channel.util.ALog;
import anetwork.channel.config.IRemoteConfig;
import com.taobao.orange.OrangeConfig;

public class a implements IRemoteConfig {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1180a;

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f1180a = true;
        } catch (Exception unused) {
            f1180a = false;
        }
    }

    public void unRegister() {
        if (!f1180a) {
            ALog.w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return;
        }
        OrangeConfig.getInstance().unregisterListener(new String[]{"networkSdk"});
    }

    public void register() {
        if (!f1180a) {
            ALog.w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"networkSdk"}, new b(this));
            getConfig("networkSdk", "network_empty_scheme_https_switch", "true");
        } catch (Exception e2) {
            ALog.e("awcn.OrangeConfigImpl", "register fail", null, e2, new Object[0]);
        }
    }

    public String getConfig(String... strArr) {
        if (!f1180a) {
            ALog.w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e2) {
            ALog.e("awcn.OrangeConfigImpl", "get config failed!", null, e2, new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(61:2|3|4|5|6|7|8|9|10|(1:12)|13|14|15|16|17|18|19|20|(1:22)|23|24|25|26|(1:28)|29|30|31|32|33|34|(1:36)|37|38|39|40|(1:42)|43|44|(3:46|(1:48)|49)|50|51|(1:53)|54|55|(1:57)|58|59|(1:61)|62|63|(1:65)|66|67|(1:69)|70|71|(1:73)|74|75|(1:77)|(4:78|79|(1:81)|82)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(64:2|3|4|5|6|7|8|9|10|(1:12)|13|14|15|16|17|18|19|20|(1:22)|23|24|25|26|(1:28)|29|30|31|32|33|34|(1:36)|37|38|39|40|(1:42)|43|44|(3:46|(1:48)|49)|50|51|(1:53)|54|55|(1:57)|58|59|(1:61)|62|63|(1:65)|66|67|(1:69)|70|71|(1:73)|74|75|(1:77)|78|79|(1:81)|82) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00db */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00fa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x010b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0122 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x013d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0158 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0177 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0192 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x01b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x01d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x01f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0211 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0228 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x023f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x025e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x027d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0294 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007f A[Catch:{ Exception -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ef A[Catch:{ Exception -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011f A[Catch:{ Exception -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016c A[Catch:{ Exception -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a6 A[Catch:{ Exception -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c5 A[Catch:{ Exception -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e7 A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0206 A[Catch:{ Exception -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0225 A[Catch:{ Exception -> 0x0228 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x023c A[Catch:{ Exception -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0253 A[Catch:{ Exception -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0272 A[Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0291 A[Catch:{ Exception -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02a8 A[Catch:{ Exception -> 0x02b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigUpdate(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "networkSdk"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = "awcn.OrangeConfigImpl"
            java.lang.String r1 = "onConfigUpdate"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "namespace"
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r10
            r6 = 0
            anet.channel.util.ALog.i(r0, r1, r6, r3)
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0039 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0039 }
            java.lang.String r3 = "network_empty_scheme_https_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x0039 }
            java.lang.String r3 = "true"
            r1[r2] = r3     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0039 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0039 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0039 }
            anet.channel.strategy.c r3 = anet.channel.strategy.c.a.f1353a     // Catch:{ Exception -> 0x0039 }
            r3.a((boolean) r1)     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0054 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0054 }
            java.lang.String r3 = "network_spdy_enable_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x0054 }
            java.lang.String r3 = "true"
            r1[r2] = r3     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0054 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0054 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0054 }
            anetwork.channel.config.NetworkConfigCenter.setSpdyEnabled(r1)     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x006f }
            r1[r5] = r10     // Catch:{ Exception -> 0x006f }
            java.lang.String r3 = "network_http_cache_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x006f }
            java.lang.String r3 = "true"
            r1[r2] = r3     // Catch:{ Exception -> 0x006f }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x006f }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x006f }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x006f }
            anetwork.channel.config.NetworkConfigCenter.setHttpCacheEnable(r1)     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x008a }
            r1[r5] = r10     // Catch:{ Exception -> 0x008a }
            java.lang.String r3 = "network_http_cache_flag"
            r1[r4] = r3     // Catch:{ Exception -> 0x008a }
            r1[r2] = r6     // Catch:{ Exception -> 0x008a }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x008a }
            if (r1 == 0) goto L_0x008a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x008a }
            long r7 = r1.longValue()     // Catch:{ Exception -> 0x008a }
            anetwork.channel.config.NetworkConfigCenter.setCacheFlag(r7)     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00a5 }
            r1[r5] = r10     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "network_https_sni_enable_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r3 = "true"
            r1[r2] = r3     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x00a5 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x00a5 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00a5 }
            anet.channel.AwcnConfig.setHttpsSniEnable(r1)     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00c0 }
            r1[r5] = r10     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = "network_accs_session_bg_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = "true"
            r1[r2] = r3     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x00c0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x00c0 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00c0 }
            anet.channel.AwcnConfig.setAccsSessionCreateForbiddenInBg(r1)     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00db }
            r1[r5] = r10     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = "network_request_statistic_sample_rate"
            r1[r4] = r3     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = "10000"
            r1[r2] = r3     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x00db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00db }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00db }
            anetwork.channel.config.NetworkConfigCenter.setRequestStatisticSampleRate(r1)     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00fa }
            r1[r5] = r10     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = "network_request_forbidden_bg"
            r1[r4] = r3     // Catch:{ Exception -> 0x00fa }
            r1[r2] = r6     // Catch:{ Exception -> 0x00fa }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x00fa }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00fa }
            if (r3 != 0) goto L_0x00fa
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x00fa }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00fa }
            anetwork.channel.config.NetworkConfigCenter.setBgRequestForbidden(r1)     // Catch:{ Exception -> 0x00fa }
        L_0x00fa:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x010b }
            r1[r5] = r10     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = "network_url_white_list_bg"
            r1[r4] = r3     // Catch:{ Exception -> 0x010b }
            r1[r2] = r6     // Catch:{ Exception -> 0x010b }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x010b }
            anetwork.channel.config.NetworkConfigCenter.updateWhiteListMap(r1)     // Catch:{ Exception -> 0x010b }
        L_0x010b:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0122 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0122 }
            java.lang.String r3 = "network_amdc_preset_hosts"
            r1[r4] = r3     // Catch:{ Exception -> 0x0122 }
            r1[r2] = r6     // Catch:{ Exception -> 0x0122 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0122 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0122 }
            if (r3 != 0) goto L_0x0122
            anetwork.channel.config.NetworkConfigCenter.setAmdcPresetHosts(r1)     // Catch:{ Exception -> 0x0122 }
        L_0x0122:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x013d }
            r1[r5] = r10     // Catch:{ Exception -> 0x013d }
            java.lang.String r3 = "network_horse_race_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x013d }
            java.lang.String r3 = "true"
            r1[r2] = r3     // Catch:{ Exception -> 0x013d }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x013d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x013d }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x013d }
            anet.channel.AwcnConfig.setHorseRaceEnable(r1)     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0158 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0158 }
            java.lang.String r3 = "tnet_enable_header_cache"
            r1[r4] = r3     // Catch:{ Exception -> 0x0158 }
            java.lang.String r3 = "true"
            r1[r2] = r3     // Catch:{ Exception -> 0x0158 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0158 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0158 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0158 }
            anet.channel.AwcnConfig.setTnetHeaderCacheEnable(r1)     // Catch:{ Exception -> 0x0158 }
        L_0x0158:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0177 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0177 }
            java.lang.String r3 = "network_quic_enable_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x0177 }
            r1[r2] = r6     // Catch:{ Exception -> 0x0177 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0177 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0177 }
            if (r3 != 0) goto L_0x0177
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0177 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0177 }
            anet.channel.AwcnConfig.setQuicEnable(r1)     // Catch:{ Exception -> 0x0177 }
        L_0x0177:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0192 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0192 }
            java.lang.String r3 = "network_response_buffer_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x0192 }
            java.lang.String r3 = "true"
            r1[r2] = r3     // Catch:{ Exception -> 0x0192 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0192 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0192 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0192 }
            anetwork.channel.config.NetworkConfigCenter.setResponseBufferEnable(r1)     // Catch:{ Exception -> 0x0192 }
        L_0x0192:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01b1 }
            r1[r5] = r10     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "network_get_session_async_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x01b1 }
            r1[r2] = r6     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x01b1 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01b1 }
            if (r3 != 0) goto L_0x01b1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x01b1 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x01b1 }
            anetwork.channel.config.NetworkConfigCenter.setGetSessionAsyncEnable(r1)     // Catch:{ Exception -> 0x01b1 }
        L_0x01b1:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01d3 }
            r1[r5] = r10     // Catch:{ Exception -> 0x01d3 }
            java.lang.String r3 = "network_bg_forbid_request_threshold"
            r1[r4] = r3     // Catch:{ Exception -> 0x01d3 }
            r1[r2] = r6     // Catch:{ Exception -> 0x01d3 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x01d3 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r3 != 0) goto L_0x01d3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01d3 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01d3 }
            if (r1 >= 0) goto L_0x01d0
            r1 = 0
        L_0x01d0:
            anetwork.channel.config.NetworkConfigCenter.setBgForbidRequestThreshold(r1)     // Catch:{ Exception -> 0x01d3 }
        L_0x01d3:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01f2 }
            r1[r5] = r10     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r3 = "network_normal_thread_pool_executor_size"
            r1[r4] = r3     // Catch:{ Exception -> 0x01f2 }
            r1[r2] = r6     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x01f2 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01f2 }
            if (r3 != 0) goto L_0x01f2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01f2 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01f2 }
            anet.channel.thread.ThreadPoolExecutorFactory.setNormalExecutorPoolSize(r1)     // Catch:{ Exception -> 0x01f2 }
        L_0x01f2:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0211 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0211 }
            java.lang.String r3 = "network_idle_session_close_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x0211 }
            r1[r2] = r6     // Catch:{ Exception -> 0x0211 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0211 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0211 }
            if (r3 != 0) goto L_0x0211
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0211 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0211 }
            anet.channel.AwcnConfig.setIdleSessionCloseEnable(r1)     // Catch:{ Exception -> 0x0211 }
        L_0x0211:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0228 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0228 }
            java.lang.String r3 = "network_monitor_requests"
            r1[r4] = r3     // Catch:{ Exception -> 0x0228 }
            r1[r2] = r6     // Catch:{ Exception -> 0x0228 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0228 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0228 }
            if (r3 != 0) goto L_0x0228
            anetwork.channel.config.NetworkConfigCenter.setMonitorRequestList(r1)     // Catch:{ Exception -> 0x0228 }
        L_0x0228:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x023f }
            r1[r5] = r10     // Catch:{ Exception -> 0x023f }
            java.lang.String r3 = "network_session_preset_hosts"
            r1[r4] = r3     // Catch:{ Exception -> 0x023f }
            r1[r2] = r6     // Catch:{ Exception -> 0x023f }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x023f }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x023f }
            if (r3 != 0) goto L_0x023f
            anet.channel.AwcnConfig.registerPresetSessions(r1)     // Catch:{ Exception -> 0x023f }
        L_0x023f:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x025e }
            r1[r5] = r10     // Catch:{ Exception -> 0x025e }
            java.lang.String r3 = "network_ipv6_blacklist_switch"
            r1[r4] = r3     // Catch:{ Exception -> 0x025e }
            r1[r2] = r6     // Catch:{ Exception -> 0x025e }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x025e }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x025e }
            if (r3 != 0) goto L_0x025e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x025e }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x025e }
            anet.channel.AwcnConfig.setIpv6BlackListEnable(r1)     // Catch:{ Exception -> 0x025e }
        L_0x025e:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x027d }
            r1[r5] = r10     // Catch:{ Exception -> 0x027d }
            java.lang.String r3 = "network_ipv6_blacklist_ttl"
            r1[r4] = r3     // Catch:{ Exception -> 0x027d }
            r1[r2] = r6     // Catch:{ Exception -> 0x027d }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x027d }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x027d }
            if (r3 != 0) goto L_0x027d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x027d }
            long r7 = r1.longValue()     // Catch:{ Exception -> 0x027d }
            anet.channel.AwcnConfig.setIpv6BlackListTtl(r7)     // Catch:{ Exception -> 0x027d }
        L_0x027d:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0294 }
            r1[r5] = r10     // Catch:{ Exception -> 0x0294 }
            java.lang.String r3 = "network_url_degrade_list"
            r1[r4] = r3     // Catch:{ Exception -> 0x0294 }
            r1[r2] = r6     // Catch:{ Exception -> 0x0294 }
            java.lang.String r1 = r9.getConfig(r1)     // Catch:{ Exception -> 0x0294 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0294 }
            if (r3 != 0) goto L_0x0294
            anetwork.channel.config.NetworkConfigCenter.setDegradeRequestList(r1)     // Catch:{ Exception -> 0x0294 }
        L_0x0294:
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x02b4 }
            r0[r5] = r10     // Catch:{ Exception -> 0x02b4 }
            java.lang.String r10 = "network_delay_retry_request_no_network"
            r0[r4] = r10     // Catch:{ Exception -> 0x02b4 }
            r0[r2] = r6     // Catch:{ Exception -> 0x02b4 }
            java.lang.String r10 = r9.getConfig(r0)     // Catch:{ Exception -> 0x02b4 }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x02b4 }
            if (r0 != 0) goto L_0x02b3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x02b4 }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x02b4 }
            anetwork.channel.config.NetworkConfigCenter.setRequestDelayRetryForNoNetwork(r10)     // Catch:{ Exception -> 0x02b4 }
        L_0x02b3:
            return
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.c.a.onConfigUpdate(java.lang.String):void");
    }
}
