package com.ujjwalagrawal.spectrum.helper.image_loaders;

import android.widget.ImageView;

import com.wang.avi.AVLoadingIndicatorView;

/**
 * Created by ujjwal on 14/10/17.
 */

public interface ImageLoader {

    void loadImage(String url, ImageView imageView, AVLoadingIndicatorView progressBar);
    void load_circular_image(String url, ImageView imageView, AVLoadingIndicatorView progressBar);

}
