package com.scichart.scishowcase.viewModels.audioAnalyzer;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rR \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/scichart/scishowcase/viewModels/audioAnalyzer/SpectrogramViewModel;", "Lcom/scichart/scishowcase/viewModels/ChartViewModel;", "context", "Landroid/content/Context;", "fftSize", "", "batchSize", "(Landroid/content/Context;II)V", "spectrogramDS", "Lcom/scichart/charting/model/dataSeries/UniformHeatmapDataSeries;", "", "", "spectrogramValues", "Lcom/scichart/core/model/DoubleValues;", "onNextFFT", "", "fftData", "app_debug"})
public final class SpectrogramViewModel extends com.scichart.scishowcase.viewModels.ChartViewModel {
    private final com.scichart.charting.model.dataSeries.UniformHeatmapDataSeries<java.lang.Long, java.lang.Long, java.lang.Double> spectrogramDS = null;
    private final com.scichart.core.model.DoubleValues spectrogramValues = null;
    
    public final void onNextFFT(@org.jetbrains.annotations.NotNull()
    com.scichart.core.model.DoubleValues fftData) {
    }
    
    public SpectrogramViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int fftSize, int batchSize) {
        super(null);
    }
}