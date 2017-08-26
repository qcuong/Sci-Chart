package com.scichart.scishowcase.viewModels.ecg;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003abcB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010O\u001a\u00020P2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u0017H\u0002J(\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00172\u000e\u0010U\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030V2\u0006\u0010W\u001a\u00020XH\u0002J \u0010Y\u001a\u00020Z2\u0006\u0010T\u001a\u00020\u00172\u000e\u0010U\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030VH\u0002J\b\u0010[\u001a\u00020\u0017H\u0002J\u0014\u0010\\\u001a\u00020]2\n\u0010^\u001a\u0006\u0012\u0002\b\u00030_H\u0016J\b\u0010`\u001a\u00020]H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010$\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010.R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u00102\u001a\u000203\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u001a\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010?\u001a\u00020@\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010E\u001a\u00020F\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010I\u001a\u00020F\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0011\u0010K\u001a\u00020L\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010N\u00a8\u0006d"}, d2 = {"Lcom/scichart/scishowcase/viewModels/ecg/EcgViewModel;", "Lcom/scichart/scishowcase/viewModels/FragmentViewModelBase;", "context", "Landroid/content/Context;", "dataProvider", "Lcom/scichart/scishowcase/model/IDataProvider;", "Lcom/scichart/scishowcase/model/ecg/EcgData;", "suspendable", "Lcom/scichart/core/framework/ISuspendable;", "(Landroid/content/Context;Lcom/scichart/scishowcase/model/IDataProvider;Lcom/scichart/core/framework/ISuspendable;)V", "FIFO_CAPACITY", "", "bloodOxygenation", "bloodOxygenationDataSeries", "Lcom/scichart/charting/model/dataSeries/XyDataSeries;", "", "bloodOxygenationSweepDataSeries", "bloodOxygenationVM", "Lcom/scichart/scishowcase/viewModels/ecg/EcgBloodOxygenationViewModel;", "getBloodOxygenationVM", "()Lcom/scichart/scishowcase/viewModels/ecg/EcgBloodOxygenationViewModel;", "bloodOxygenationValues", "", "", "[Ljava/lang/String;", "bloodPressureBarValues", "[Ljava/lang/Integer;", "bloodPressureColor", "bloodPressureDataSeries", "bloodPressureSweepDataSeries", "bloodPressureVM", "Lcom/scichart/scishowcase/viewModels/ecg/EcgBloodPressureViewModel;", "getBloodPressureVM", "()Lcom/scichart/scishowcase/viewModels/ecg/EcgBloodPressureViewModel;", "bloodPressureValues", "bloodVolumeBarValues", "bloodVolumeColor", "bloodVolumeDataSeries", "bloodVolumeSweepDataSeries", "bloodVolumeVM", "Lcom/scichart/scishowcase/viewModels/ecg/EcgBloodVolumeViewModel;", "getBloodVolumeVM", "()Lcom/scichart/scishowcase/viewModels/ecg/EcgBloodVolumeViewModel;", "bloodVolumeValues", "dataBatch", "Lcom/scichart/scishowcase/viewModels/ecg/EcgViewModel$EcgDataBatch;", "Lcom/scichart/scishowcase/viewModels/ecg/EcgViewModel/EcgDataBatch;", "ecgDataSeries", "ecgSweepDataSeries", "heartRateColor", "hrVM", "Lcom/scichart/scishowcase/viewModels/ecg/EcgHeartRateViewModel;", "getHrVM", "()Lcom/scichart/scishowcase/viewModels/ecg/EcgHeartRateViewModel;", "hrValues", "lastBloodOxygenationSweepDataSeries", "lastBloodPressureDataSeries", "lastBloodVolumeDataSeries", "lastEcgSweepDataSeries", "pmColor", "pmSize", "random", "Ljava/util/Random;", "renderableSeries", "Lcom/scichart/charting/model/RenderableSeriesCollection;", "getRenderableSeries", "()Lcom/scichart/charting/model/RenderableSeriesCollection;", "timeFormat", "Ljava/text/SimpleDateFormat;", "xAxes", "Lcom/scichart/charting/model/AxisCollection;", "getXAxes", "()Lcom/scichart/charting/model/AxisCollection;", "yAxes", "getYAxes", "yAxisLayoutStrategy", "Lcom/scichart/charting/layoutManagers/IAxisLayoutStrategy;", "getYAxisLayoutStrategy", "()Lcom/scichart/charting/layoutManagers/IAxisLayoutStrategy;", "generateAxis", "Lcom/scichart/charting/visuals/axes/NumericAxis;", "id", "generateLineRenderableSeries", "Lcom/scichart/charting/visuals/renderableSeries/FastLineRenderableSeries;", "yAxisId", "dataSeries", "Lcom/scichart/charting/model/dataSeries/IDataSeries;", "strokeStyle", "Lcom/scichart/drawing/common/SolidPenStyle;", "generateScatterRenderableSeriesForLastAppendedPoint", "Lcom/scichart/charting/visuals/renderableSeries/XyScatterRenderableSeries;", "getTimeString", "subscribe", "", "lifecycleProvider", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "updateVMValues", "DimTracePaletteProvider", "EcgDataBatch", "LeftAlignedOuterVerticallyStackedYAxisLayoutStrategy", "app_debug"})
public final class EcgViewModel extends com.scichart.scishowcase.viewModels.FragmentViewModelBase {
    private final int FIFO_CAPACITY = 7850;
    private final int heartRateColor = 0;
    private final int bloodPressureColor = 0;
    private final int bloodVolumeColor = 0;
    private final int bloodOxygenation = 0;
    private final int pmColor = -1;
    private final int pmSize = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.charting.model.AxisCollection xAxes = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.charting.model.AxisCollection yAxes = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.charting.layoutManagers.IAxisLayoutStrategy yAxisLayoutStrategy = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.charting.model.RenderableSeriesCollection renderableSeries = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.ecg.EcgHeartRateViewModel hrVM = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.ecg.EcgBloodPressureViewModel bloodPressureVM = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.ecg.EcgBloodVolumeViewModel bloodVolumeVM = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.ecg.EcgBloodOxygenationViewModel bloodOxygenationVM = null;
    private final java.util.Random random = null;
    private final java.lang.String[] hrValues = null;
    private final java.lang.String[] bloodPressureValues = null;
    private final java.lang.Integer[] bloodPressureBarValues = null;
    private final java.lang.String[] bloodVolumeValues = null;
    private final java.lang.Integer[] bloodVolumeBarValues = null;
    private final java.lang.String[] bloodOxygenationValues = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> ecgDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> ecgSweepDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> bloodPressureDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> bloodPressureSweepDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> bloodVolumeDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> bloodVolumeSweepDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> bloodOxygenationDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> bloodOxygenationSweepDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> lastEcgSweepDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> lastBloodPressureDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> lastBloodVolumeDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> lastBloodOxygenationSweepDataSeries = null;
    private final com.scichart.scishowcase.viewModels.ecg.EcgViewModel.EcgDataBatch dataBatch = null;
    private final java.text.SimpleDateFormat timeFormat = null;
    private final com.scichart.scishowcase.model.IDataProvider<com.scichart.scishowcase.model.ecg.EcgData> dataProvider = null;
    private final com.scichart.core.framework.ISuspendable suspendable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.charting.model.AxisCollection getXAxes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.charting.model.AxisCollection getYAxes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.charting.layoutManagers.IAxisLayoutStrategy getYAxisLayoutStrategy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.charting.model.RenderableSeriesCollection getRenderableSeries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.ecg.EcgHeartRateViewModel getHrVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.ecg.EcgBloodPressureViewModel getBloodPressureVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.ecg.EcgBloodVolumeViewModel getBloodVolumeVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.ecg.EcgBloodOxygenationViewModel getBloodOxygenationVM() {
        return null;
    }
    
    @java.lang.Override()
    public void subscribe(@org.jetbrains.annotations.NotNull()
    com.trello.rxlifecycle2.LifecycleProvider<?> lifecycleProvider) {
    }
    
    private final com.scichart.charting.visuals.axes.NumericAxis generateAxis(android.content.Context context, java.lang.String id) {
        return null;
    }
    
    private final com.scichart.charting.visuals.renderableSeries.FastLineRenderableSeries generateLineRenderableSeries(java.lang.String yAxisId, com.scichart.charting.model.dataSeries.IDataSeries<?, ?> dataSeries, com.scichart.drawing.common.SolidPenStyle strokeStyle) {
        return null;
    }
    
    private final com.scichart.charting.visuals.renderableSeries.XyScatterRenderableSeries generateScatterRenderableSeriesForLastAppendedPoint(java.lang.String yAxisId, com.scichart.charting.model.dataSeries.IDataSeries<?, ?> dataSeries) {
        return null;
    }
    
    private final void updateVMValues() {
    }
    
    private final java.lang.String getTimeString() {
        return null;
    }
    
    public EcgViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.IDataProvider<com.scichart.scishowcase.model.ecg.EcgData> dataProvider, @org.jetbrains.annotations.NotNull()
    com.scichart.core.framework.ISuspendable suspendable) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/scichart/scishowcase/viewModels/ecg/EcgViewModel$LeftAlignedOuterVerticallyStackedYAxisLayoutStrategy;", "Lcom/scichart/charting/layoutManagers/VerticalAxisLayoutStrategy;", "()V", "layoutAxes", "", "left", "", "top", "right", "bottom", "measureAxes", "availableWidth", "availableHeight", "chartLayoutState", "Lcom/scichart/charting/layoutManagers/ChartLayoutState;", "app_debug"})
    static final class LeftAlignedOuterVerticallyStackedYAxisLayoutStrategy extends com.scichart.charting.layoutManagers.VerticalAxisLayoutStrategy {
        
        @java.lang.Override()
        public void measureAxes(int availableWidth, int availableHeight, @org.jetbrains.annotations.NotNull()
        com.scichart.charting.layoutManagers.ChartLayoutState chartLayoutState) {
        }
        
        @java.lang.Override()
        public void layoutAxes(int left, int top, int right, int bottom) {
        }
        
        public LeftAlignedOuterVerticallyStackedYAxisLayoutStrategy() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/scichart/scishowcase/viewModels/ecg/EcgViewModel$DimTracePaletteProvider;", "Lcom/scichart/charting/visuals/renderableSeries/paletteProviders/PaletteProviderBase;", "Lcom/scichart/charting/visuals/renderableSeries/XyRenderableSeriesBase;", "Lcom/scichart/charting/visuals/renderableSeries/paletteProviders/IStrokePaletteProvider;", "()V", "colors", "Lcom/scichart/core/model/IntegerValues;", "endOpacity", "", "opacityDiff", "startOpacity", "getStrokeColors", "update", "", "app_debug"})
    static final class DimTracePaletteProvider extends com.scichart.charting.visuals.renderableSeries.paletteProviders.PaletteProviderBase<com.scichart.charting.visuals.renderableSeries.XyRenderableSeriesBase> implements com.scichart.charting.visuals.renderableSeries.paletteProviders.IStrokePaletteProvider {
        private final com.scichart.core.model.IntegerValues colors = null;
        private final double startOpacity = 0.2;
        private final double endOpacity = 1.0;
        private final double opacityDiff = 0.8;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.scichart.core.model.IntegerValues getStrokeColors() {
            return null;
        }
        
        @java.lang.Override()
        public void update() {
        }
        
        public DimTracePaletteProvider() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006\u00a8\u0006!"}, d2 = {"Lcom/scichart/scishowcase/viewModels/ecg/EcgViewModel$EcgDataBatch;", "", "()V", "bloodOxygenationA", "Lcom/scichart/core/model/DoubleValues;", "getBloodOxygenationA", "()Lcom/scichart/core/model/DoubleValues;", "bloodOxygenationB", "getBloodOxygenationB", "bloodPressureValuesA", "getBloodPressureValuesA", "bloodPressureValuesB", "getBloodPressureValuesB", "bloodVolumeValuesA", "getBloodVolumeValuesA", "bloodVolumeValuesB", "getBloodVolumeValuesB", "ecgHeartRateValuesA", "getEcgHeartRateValuesA", "ecgHeartRateValuesB", "getEcgHeartRateValuesB", "lastEcgData", "Lcom/scichart/scishowcase/model/ecg/EcgData;", "getLastEcgData", "()Lcom/scichart/scishowcase/model/ecg/EcgData;", "setLastEcgData", "(Lcom/scichart/scishowcase/model/ecg/EcgData;)V", "xValues", "getXValues", "updateData", "", "ecgDataList", "", "app_debug"})
    static final class EcgDataBatch {
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues xValues = null;
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues ecgHeartRateValuesA = null;
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues bloodPressureValuesA = null;
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues bloodVolumeValuesA = null;
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues bloodOxygenationA = null;
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues ecgHeartRateValuesB = null;
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues bloodPressureValuesB = null;
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues bloodVolumeValuesB = null;
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.core.model.DoubleValues bloodOxygenationB = null;
        @org.jetbrains.annotations.NotNull()
        public com.scichart.scishowcase.model.ecg.EcgData lastEcgData;
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getXValues() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getEcgHeartRateValuesA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getBloodPressureValuesA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getBloodVolumeValuesA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getBloodOxygenationA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getEcgHeartRateValuesB() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getBloodPressureValuesB() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getBloodVolumeValuesB() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.core.model.DoubleValues getBloodOxygenationB() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.scishowcase.model.ecg.EcgData getLastEcgData() {
            return null;
        }
        
        public final void setLastEcgData(@org.jetbrains.annotations.NotNull()
        com.scichart.scishowcase.model.ecg.EcgData p0) {
        }
        
        public final void updateData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.scichart.scishowcase.model.ecg.EcgData> ecgDataList) {
        }
        
        public EcgDataBatch() {
            super();
        }
    }
}