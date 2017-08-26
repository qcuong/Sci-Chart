package com.scichart.scishowcase.viewModels.audioAnalyzer;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0016R\u000e\u0010\t\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006#"}, d2 = {"Lcom/scichart/scishowcase/viewModels/audioAnalyzer/AudioAnalyzerViewModel;", "Lcom/scichart/scishowcase/viewModels/FragmentViewModelBase;", "context", "Landroid/content/Context;", "maxFrequency", "", "dataProvider", "Lcom/scichart/scishowcase/model/audioAnalyzer/IAudioAnalyzerDataProvider;", "(Landroid/content/Context;ILcom/scichart/scishowcase/model/audioAnalyzer/IAudioAnalyzerDataProvider;)V", "audioStreamBufferSize", "audioStreamVM", "Lcom/scichart/scishowcase/viewModels/audioAnalyzer/AudioStreamViewModel;", "getAudioStreamVM", "()Lcom/scichart/scishowcase/viewModels/audioAnalyzer/AudioStreamViewModel;", "bufferSize", "fft", "Lcom/scichart/scishowcase/utils/Radix2FFT;", "fftData", "Lcom/scichart/core/model/DoubleValues;", "fftSize", "fftVM", "Lcom/scichart/scishowcase/viewModels/audioAnalyzer/FFTViewModel;", "getFftVM", "()Lcom/scichart/scishowcase/viewModels/audioAnalyzer/FFTViewModel;", "hzPerDataPoint", "", "sampleRate", "spectrogramVM", "Lcom/scichart/scishowcase/viewModels/audioAnalyzer/SpectrogramViewModel;", "getSpectrogramVM", "()Lcom/scichart/scishowcase/viewModels/audioAnalyzer/SpectrogramViewModel;", "subscribe", "", "lifecycleProvider", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "app_debug"})
public final class AudioAnalyzerViewModel extends com.scichart.scishowcase.viewModels.FragmentViewModelBase {
    private final int bufferSize = 0;
    private final int sampleRate = 0;
    private final int audioStreamBufferSize = 500000;
    private final com.scichart.scishowcase.utils.Radix2FFT fft = null;
    private final double hzPerDataPoint = 0.0;
    private final int fftSize = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.audioAnalyzer.AudioStreamViewModel audioStreamVM = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.audioAnalyzer.FFTViewModel fftVM = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.audioAnalyzer.SpectrogramViewModel spectrogramVM = null;
    private final com.scichart.core.model.DoubleValues fftData = null;
    private final com.scichart.scishowcase.model.audioAnalyzer.IAudioAnalyzerDataProvider dataProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.audioAnalyzer.AudioStreamViewModel getAudioStreamVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.audioAnalyzer.FFTViewModel getFftVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.audioAnalyzer.SpectrogramViewModel getSpectrogramVM() {
        return null;
    }
    
    @java.lang.Override()
    public void subscribe(@org.jetbrains.annotations.NotNull()
    com.trello.rxlifecycle2.LifecycleProvider<?> lifecycleProvider) {
    }
    
    public AudioAnalyzerViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int maxFrequency, @org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.audioAnalyzer.IAudioAnalyzerDataProvider dataProvider) {
        super(null);
    }
}