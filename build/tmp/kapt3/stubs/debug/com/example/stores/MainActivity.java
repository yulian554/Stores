package com.example.stores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/stores/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/stores/OnClickListener;", "()V", "binding", "Lcom/example/stores/databinding/ActivityMainBinding;", "mAdapter", "Lcom/example/stores/StoreAdapter;", "mGridLayout", "Landroidx/recyclerview/widget/GridLayoutManager;", "getStore", "", "onClick", "storeEntity", "Lcom/example/stores/StoreEntity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteStore", "onFavoriteStore", "setupRecyclerView", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.stores.OnClickListener {
    private com.example.stores.databinding.ActivityMainBinding binding;
    private com.example.stores.StoreAdapter mAdapter;
    private androidx.recyclerview.widget.GridLayoutManager mGridLayout;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void getStore() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity) {
    }
    
    @java.lang.Override()
    public void onFavoriteStore(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity) {
    }
    
    @java.lang.Override()
    public void onDeleteStore(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity) {
    }
    
    public MainActivity() {
        super();
    }
}