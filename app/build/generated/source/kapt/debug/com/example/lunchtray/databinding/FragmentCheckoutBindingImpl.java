package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 5);
        sViewsWithIds.put(R.id.accompaniment_selection, 6);
        sViewsWithIds.put(R.id.accompaniment_price, 7);
        sViewsWithIds.put(R.id.divider, 8);
        sViewsWithIds.put(R.id.subtotal, 9);
        sViewsWithIds.put(R.id.tax, 10);
        sViewsWithIds.put(R.id.total, 11);
        sViewsWithIds.put(R.id.submit_button, 12);
        sViewsWithIds.put(R.id.cancel_button, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[13]
            , (android.view.View) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            );
        this.entreePrice.setTag(null);
        this.entreeSelection.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.sidePrice.setTag(null);
        this.sideSelection.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.CheckoutFragment == variableId) {
            setCheckoutFragment((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckoutFragment(@Nullable com.example.lunchtray.ui.order.CheckoutFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAccompaniment((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 1 :
                return onChangeViewModelEntree((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 2 :
                return onChangeViewModelSide((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAccompaniment(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewModelAccompaniment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEntree(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewModelEntree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSide(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewModelSide, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewModelAccompaniment = null;
        java.lang.String sidePriceAndroidStringSubtotalViewModelSidePrice = null;
        java.lang.String entreePriceAndroidStringSubtotalViewModelEntreePrice = null;
        com.example.lunchtray.model.MenuItem viewModelEntreeGetValue = null;
        com.example.lunchtray.model.MenuItem viewModelSideGetValue = null;
        double viewModelSidePrice = 0.0;
        com.example.lunchtray.model.MenuItem viewModelAccompanimentGetValue = null;
        double viewModelEntreePrice = 0.0;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewModelEntree = null;
        java.lang.String viewModelAccompanimentName = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewModelSide = null;
        java.lang.String viewModelEntreeName = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.accompaniment
                        viewModelAccompaniment = viewModel.getAccompaniment();
                    }
                    updateLiveDataRegistration(0, viewModelAccompaniment);


                    if (viewModelAccompaniment != null) {
                        // read viewModel.accompaniment.getValue()
                        viewModelAccompanimentGetValue = viewModelAccompaniment.getValue();
                    }


                    if (viewModelAccompanimentGetValue != null) {
                        // read viewModel.accompaniment.getValue().name
                        viewModelAccompanimentName = viewModelAccompanimentGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.entree
                        viewModelEntree = viewModel.getEntree();
                    }
                    updateLiveDataRegistration(1, viewModelEntree);


                    if (viewModelEntree != null) {
                        // read viewModel.entree.getValue()
                        viewModelEntreeGetValue = viewModelEntree.getValue();
                    }


                    if (viewModelEntreeGetValue != null) {
                        // read viewModel.entree.getValue().price
                        viewModelEntreePrice = viewModelEntreeGetValue.getPrice();
                        // read viewModel.entree.getValue().name
                        viewModelEntreeName = viewModelEntreeGetValue.getName();
                    }


                    // read @android:string/subtotal
                    entreePriceAndroidStringSubtotalViewModelEntreePrice = entreePrice.getResources().getString(R.string.subtotal, viewModelEntreePrice);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.side
                        viewModelSide = viewModel.getSide();
                    }
                    updateLiveDataRegistration(2, viewModelSide);


                    if (viewModelSide != null) {
                        // read viewModel.side.getValue()
                        viewModelSideGetValue = viewModelSide.getValue();
                    }


                    if (viewModelSideGetValue != null) {
                        // read viewModel.side.getValue().price
                        viewModelSidePrice = viewModelSideGetValue.getPrice();
                    }


                    // read @android:string/subtotal
                    sidePriceAndroidStringSubtotalViewModelSidePrice = sidePrice.getResources().getString(R.string.subtotal, viewModelSidePrice);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreePrice, entreePriceAndroidStringSubtotalViewModelEntreePrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreeSelection, viewModelEntreeName);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sidePrice, sidePriceAndroidStringSubtotalViewModelSidePrice);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sideSelection, viewModelAccompanimentName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.accompaniment
        flag 1 (0x2L): viewModel.entree
        flag 2 (0x3L): viewModel.side
        flag 3 (0x4L): CheckoutFragment
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}