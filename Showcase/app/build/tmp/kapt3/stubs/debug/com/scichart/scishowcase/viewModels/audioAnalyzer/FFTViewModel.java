package com.scichart.scishowcase.viewModels.audioAnalyzer;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/scichart/scishowcase/viewModels/audioAnalyzer/FFTViewModel;", "Lcom/scichart/scishowcase/viewModels/ChartViewModel;", "context", "Landroid/content/Context;", "fftSize", "", "hzPerDataPoint", "", "(Landroid/content/Context;ID)V", "fftDS", "Lcom/scichart/charting/model/dataSeries/XyDataSeries;", "onNextFFT", "", "fftData", "Lcom/scichart/core/model/DoubleValues;", "FFTPaletteProvider", "app_debug"})
public final class FFTViewModel extends com.scichart.scishowcase.viewModels.ChartViewModel {
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Double, java.lang.Double> fftDS = null;
    
    public final void onNextFFT(@org.jetbrains.annotations.NotNull()
    com.scichart.core.model.DoubleValues fftData) {
    }
    
    public FFTViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int fftSize, double hzPerDataPoint) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/scichart/scishowcase/viewModels/audioAnalyzer/FFTViewModel$FFTPaletteProvider;", "Lcom/scichart/charting/visuals/renderableSeries/paletteProviders/PaletteProviderBase;", "Lcom/scichart/charting/visuals/renderableSeries/FastColumnRenderableSeries;", "Lcom/scichart/charting/visuals/renderableSeries/paletteProviders/IFillPaletteProvider;", "Lcom/scichart/charting/visuals/renderableSeries/paletteProviders/IStrokePaletteProvider;", "()V", "colors", "Lcom/scichart/core/model/IntegerValues;", "diffBlue", "", "diffGreen", "diffRed", "maxColor", "maxColorBlue", "maxColorGreen", "maxColorRed", "minColor", "minColorBlue", "minColorGreen", "minColorRed", "getFillColors", "getStrokeColors", "lerp", "diffColor", "fraction", "", "update", "", "app_debug"})
    static final class FFTPaletteProvider extends com.scichart.charting.visuals.renderableSeries.paletteProviders.PaletteProviderBase<com.scichart.charting.visuals.renderableSeries.FastColumnRenderableSeries> implements com.scichart.charting.visuals.renderableSeries.paletteProviders.IFillPaletteProvider, com.scichart.charting.visuals.renderableSeries.paletteProviders.IStrokePaletteProvider {
        private final com.scichart.core.model.IntegerValues colors = null;
        private final int minColor = -16744448;
        private final int maxColor = -65536;
        private final int minColorRed = 0;
        private final int minColorGreen = 0;
        private final int minColorBlue = 0;
        private final int maxColorRed = 0;
        private final int maxColorGreen = 0;
        private final int maxColorBlue = 0;
        private final int diffRed = 0;
        private final int diffGreen = 0;
        private final int diffBlue = 0;
        
        @java.lang.Override()
        public void update() {
        }
        
        private final int lerp(int minColor, int diffColor, double fraction) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.scichart.core.model.IntegerValues getFillColors() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.scichart.core.model.IntegerValues getStrokeColors() {
            return null;
        }
        
        public FFTPaletteProvider() {
            super(null);
        }
    }
}