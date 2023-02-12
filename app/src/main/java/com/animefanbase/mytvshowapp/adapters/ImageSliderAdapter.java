package com.animefanbase.mytvshowapp.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.animefanbase.mytvshowapp.R;
import com.animefanbase.mytvshowapp.databinding.ItemContainerSilderImageBinding;

public class ImageSliderAdapter extends RecyclerView.Adapter<ImageSliderAdapter.ImageSliderViewHolder> {

    private String[] sliderImages;
    private LayoutInflater layoutInflater;

    public ImageSliderAdapter(String[] sliderImages) {
        this.sliderImages = sliderImages;
    }

    @NonNull
    @Override
    public ImageSliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());

        }
        ItemContainerSilderImageBinding silderImageBinding = DataBindingUtil.inflate(
                layoutInflater, R.layout.item_container_silder_image,parent, false
        );
        return new ImageSliderViewHolder(silderImageBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageSliderViewHolder holder, int position) {
        holder.bindSliderImage((sliderImages[position]));
    }

    @Override
    public int getItemCount() {
        return sliderImages.length;
    }

    static class ImageSliderViewHolder extends RecyclerView.ViewHolder{

        private ItemContainerSilderImageBinding itemContainerSilderImageBinding;

        public ImageSliderViewHolder(ItemContainerSilderImageBinding itemContainerSilderImageBinding){
            super(itemContainerSilderImageBinding.getRoot());
            this.itemContainerSilderImageBinding = itemContainerSilderImageBinding;

        }
        public void bindSliderImage(String imageURL) {
            itemContainerSilderImageBinding.setImageURL(imageURL);

        }

    }

}
