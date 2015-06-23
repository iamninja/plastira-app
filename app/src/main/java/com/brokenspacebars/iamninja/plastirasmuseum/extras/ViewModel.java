package com.brokenspacebars.iamninja.plastirasmuseum.extras;

/**
 * Created by iamninja on 6/10/15.
 */
public class ViewModel {
    private String text;
    private String image;

    public ViewModel(String text, String image) {
        this. text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }
}
