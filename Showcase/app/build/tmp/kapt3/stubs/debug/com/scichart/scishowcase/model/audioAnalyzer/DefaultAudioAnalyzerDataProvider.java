package com.scichart.scishowcase.model.audioAnalyzer;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014R\u000e\u0010\n\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/scichart/scishowcase/model/audioAnalyzer/DefaultAudioAnalyzerDataProvider;", "Lcom/scichart/scishowcase/model/DataProviderBase;", "Lcom/scichart/scishowcase/model/audioAnalyzer/AudioData;", "Lcom/scichart/scishowcase/model/audioAnalyzer/IAudioAnalyzerDataProvider;", "sampleRate", "", "minBufferSize", "interval", "", "(IIJ)V", "audioData", "audioRecord", "Landroid/media/AudioRecord;", "time", "getBufferSize", "getSampleRate", "onNext", "onStart", "", "onStop", "app_debug"})
public final class DefaultAudioAnalyzerDataProvider extends com.scichart.scishowcase.model.DataProviderBase<com.scichart.scishowcase.model.audioAnalyzer.AudioData> implements com.scichart.scishowcase.model.audioAnalyzer.IAudioAnalyzerDataProvider {
    private final android.media.AudioRecord audioRecord = null;
    private final com.scichart.scishowcase.model.audioAnalyzer.AudioData audioData = null;
    private long time;
    private final int sampleRate = 0;
    private final int minBufferSize = 0;
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.scichart.scishowcase.model.audioAnalyzer.AudioData onNext() {
        return null;
    }
    
    @java.lang.Override()
    public int getBufferSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSampleRate() {
        return 0;
    }
    
    public DefaultAudioAnalyzerDataProvider(int sampleRate, int minBufferSize, long interval) {
        super(0L, null);
    }
    
    public DefaultAudioAnalyzerDataProvider() {
        super(0L, null);
    }
}