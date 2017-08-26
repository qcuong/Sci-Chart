package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class AudioAnalyzerFragmentBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontalGuideline, 4);
        sViewsWithIds.put(R.id.verticalGuideline, 5);
    }
    // views
    public final android.support.constraint.Guideline horizontalGuideline;
    private final android.support.constraint.ConstraintLayout mboundView0;
    private final com.scichart.charting.visuals.SciChartSurface mboundView2;
    private final com.scichart.charting.visuals.SciChartSurface mboundView3;
    public final com.scichart.charting.visuals.SciChartSurface sciChartSurface2;
    public final android.support.constraint.Guideline verticalGuideline;
    // variables
    private com.scichart.scishowcase.viewModels.audioAnalyzer.AudioAnalyzerViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AudioAnalyzerFragmentBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.horizontalGuideline = (android.support.constraint.Guideline) bindings[4];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.scichart.charting.visuals.SciChartSurface) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.scichart.charting.visuals.SciChartSurface) bindings[3];
        this.mboundView3.setTag(null);
        this.sciChartSurface2 = (com.scichart.charting.visuals.SciChartSurface) bindings[1];
        this.sciChartSurface2.setTag(null);
        this.verticalGuideline = (android.support.constraint.Guideline) bindings[5];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.viewModel :
                setViewModel((com.scichart.scishowcase.viewModels.audioAnalyzer.AudioAnalyzerViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.scichart.scishowcase.viewModels.audioAnalyzer.AudioAnalyzerViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.scichart.scishowcase.viewModels.audioAnalyzer.AudioAnalyzerViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.scichart.scishowcase.viewModels.audioAnalyzer.AudioAnalyzerViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.scichart.scishowcase.viewModels.audioAnalyzer.AudioAnalyzerViewModel ViewModel, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.scichart.scishowcase.viewModels.audioAnalyzer.SpectrogramViewModel viewModelSpectrogramVM = null;
        com.scichart.scishowcase.viewModels.audioAnalyzer.FFTViewModel viewModelFftVM = null;
        com.scichart.scishowcase.viewModels.audioAnalyzer.AudioStreamViewModel viewModelAudioStreamVM = null;
        com.scichart.scishowcase.viewModels.audioAnalyzer.AudioAnalyzerViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.spectrogramVM
                    viewModelSpectrogramVM = viewModel.getSpectrogramVM();
                    // read viewModel.fftVM
                    viewModelFftVM = viewModel.getFftVM();
                    // read viewModel.audioStreamVM
                    viewModelAudioStreamVM = viewModel.getAudioStreamVM();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceViewModel(this.mboundView2, viewModelFftVM);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceViewModel(this.mboundView3, viewModelSpectrogramVM);
            com.scichart.scishowcase.utils.BindingAdaptersKt.configureSurfaceViewModel(this.sciChartSurface2, viewModelAudioStreamVM);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static AudioAnalyzerFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioAnalyzerFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AudioAnalyzerFragmentBinding>inflate(inflater, com.scichart.scishowcase.R.layout.audio_analyzer_fragment, root, attachToRoot, bindingComponent);
    }
    public static AudioAnalyzerFragmentBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioAnalyzerFragmentBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.audio_analyzer_fragment, null, false), bindingComponent);
    }
    public static AudioAnalyzerFragmentBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioAnalyzerFragmentBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/audio_analyzer_fragment_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AudioAnalyzerFragmentBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}