package com.scichart.scishowcase.model.ecg;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/scichart/scishowcase/model/ecg/DefaultEcgDataProvider;", "Lcom/scichart/scishowcase/model/DataProviderBase;", "Lcom/scichart/scishowcase/model/ecg/EcgData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ECG_TRACES", "", "SAMPLE_RATE", "", "bloodOxygenation", "Ljava/util/ArrayList;", "getBloodOxygenation", "()Ljava/util/ArrayList;", "bloodPressure", "getBloodPressure", "bloodVolume", "getBloodVolume", "currentIndex", "", "currentTrace", "Lcom/scichart/scishowcase/model/ecg/TraceAOrB;", "ecgHeartRate", "getEcgHeartRate", "totalIndex", "xValues", "getXValues", "onNext", "app_debug"})
public class DefaultEcgDataProvider extends com.scichart.scishowcase.model.DataProviderBase<com.scichart.scishowcase.model.ecg.EcgData> {
    private final java.lang.String ECG_TRACES = "data/EcgTraces.csv";
    private final double SAMPLE_RATE = 800.0;
    private int currentIndex;
    private int totalIndex;
    private com.scichart.scishowcase.model.ecg.TraceAOrB currentTrace;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Double> xValues = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Double> ecgHeartRate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Double> bloodPressure = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Double> bloodVolume = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Double> bloodOxygenation = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Double> getXValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Double> getEcgHeartRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Double> getBloodPressure() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Double> getBloodVolume() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Double> getBloodOxygenation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.scichart.scishowcase.model.ecg.EcgData onNext() {
        return null;
    }
    
    public DefaultEcgDataProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(0L, null);
    }
}