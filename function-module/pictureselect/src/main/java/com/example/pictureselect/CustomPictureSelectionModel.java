package com.example.pictureselect;

import com.luck.picture.lib.PictureSelectionModel;
import com.luck.picture.lib.entity.LocalMedia;

import java.util.List;

public class CustomPictureSelectionModel extends PictureSelectionModel {
    private CustomPictureSelector mSelector;
    public CustomPictureSelectionModel(CustomPictureSelector selector, int mimeType) {
        super(selector.getPictureSelector(), mimeType);
        mSelector = selector;
    }

    public CustomPictureSelectionModel(CustomPictureSelector selector, int mimeType, boolean camera) {
        super(selector.getPictureSelector(), mimeType, camera);
        mSelector = selector;
    }

    @Override
    public CustomPictureSelectionModel theme(int themeStyleId) {
        return (CustomPictureSelectionModel) super.theme(themeStyleId);
    }

    @Override
    public CustomPictureSelectionModel selectionMode(int selectionMode) {
        return (CustomPictureSelectionModel) super.selectionMode(selectionMode);
    }

    @Override
    public CustomPictureSelectionModel enableCrop(boolean enableCrop) {
        return (CustomPictureSelectionModel) super.enableCrop(enableCrop);
    }

    @Override
    public CustomPictureSelectionModel enablePreviewAudio(boolean enablePreviewAudio) {
        return (CustomPictureSelectionModel) super.enablePreviewAudio(enablePreviewAudio);
    }

    @Override
    public CustomPictureSelectionModel freeStyleCropEnabled(boolean freeStyleCropEnabled) {
        return (CustomPictureSelectionModel) super.freeStyleCropEnabled(freeStyleCropEnabled);
    }

    @Override
    public CustomPictureSelectionModel scaleEnabled(boolean scaleEnabled) {
        return (CustomPictureSelectionModel) super.scaleEnabled(scaleEnabled);
    }

    @Override
    public CustomPictureSelectionModel rotateEnabled(boolean rotateEnabled) {
        return (CustomPictureSelectionModel) super.rotateEnabled(rotateEnabled);
    }

    @Override
    public CustomPictureSelectionModel circleDimmedLayer(boolean circleDimmedLayer) {
        return (CustomPictureSelectionModel) super.circleDimmedLayer(circleDimmedLayer);
    }

    @Override
    public CustomPictureSelectionModel showCropFrame(boolean showCropFrame) {
        return (CustomPictureSelectionModel) super.showCropFrame(showCropFrame);
    }

    @Override
    public CustomPictureSelectionModel showCropGrid(boolean showCropGrid) {
        return (CustomPictureSelectionModel) super.showCropGrid(showCropGrid);
    }

    @Override
    public CustomPictureSelectionModel hideBottomControls(boolean hideBottomControls) {
        return (CustomPictureSelectionModel) super.hideBottomControls(hideBottomControls);
    }

    @Override
    public CustomPictureSelectionModel withAspectRatio(int aspect_ratio_x, int aspect_ratio_y) {
        return (CustomPictureSelectionModel) super.withAspectRatio(aspect_ratio_x, aspect_ratio_y);
    }

    @Override
    public CustomPictureSelectionModel maxSelectNum(int maxSelectNum) {
        return (CustomPictureSelectionModel) super.maxSelectNum(maxSelectNum);
    }

    @Override
    public CustomPictureSelectionModel minSelectNum(int minSelectNum) {
        return (CustomPictureSelectionModel) super.minSelectNum(minSelectNum);
    }

    @Override
    public CustomPictureSelectionModel videoQuality(int videoQuality) {
        return (CustomPictureSelectionModel) super.videoQuality(videoQuality);
    }

    @Override
    public CustomPictureSelectionModel imageFormat(String suffixType) {
        return (CustomPictureSelectionModel) super.imageFormat(suffixType);
    }

    @Override
    public CustomPictureSelectionModel cropWH(int cropWidth, int cropHeight) {
        return (CustomPictureSelectionModel) super.cropWH(cropWidth, cropHeight);
    }

    @Override
    public CustomPictureSelectionModel videoMaxSecond(int videoMaxSecond) {
        return (CustomPictureSelectionModel) super.videoMaxSecond(videoMaxSecond);
    }

    @Override
    public CustomPictureSelectionModel videoMinSecond(int videoMinSecond) {
        return (CustomPictureSelectionModel) super.videoMinSecond(videoMinSecond);
    }

    @Override
    public CustomPictureSelectionModel recordVideoSecond(int recordVideoSecond) {
        return (CustomPictureSelectionModel) super.recordVideoSecond(recordVideoSecond);
    }

    @Override
    public CustomPictureSelectionModel glideOverride(int width, int height) {
        return (CustomPictureSelectionModel) super.glideOverride(width, height);
    }

    @Override
    public CustomPictureSelectionModel sizeMultiplier(float sizeMultiplier) {
        return (CustomPictureSelectionModel) super.sizeMultiplier(sizeMultiplier);
    }

    @Override
    public CustomPictureSelectionModel imageSpanCount(int imageSpanCount) {
        return (CustomPictureSelectionModel) super.imageSpanCount(imageSpanCount);
    }

    @Override
    public CustomPictureSelectionModel minimumCompressSize(int size) {
        return (CustomPictureSelectionModel) super.minimumCompressSize(size);
    }

    @Override
    public CustomPictureSelectionModel cropCompressQuality(int compressQuality) {
        return (CustomPictureSelectionModel) super.cropCompressQuality(compressQuality);
    }

    @Override
    public CustomPictureSelectionModel compress(boolean isCompress) {
        return (CustomPictureSelectionModel) super.compress(isCompress);
    }

    @Override
    public CustomPictureSelectionModel synOrAsy(boolean synOrAsy) {
        return (CustomPictureSelectionModel) super.synOrAsy(synOrAsy);
    }

    @Override
    public CustomPictureSelectionModel compressSavePath(String path) {
        return (CustomPictureSelectionModel) super.compressSavePath(path);
    }

    @Override
    public CustomPictureSelectionModel isZoomAnim(boolean zoomAnim) {
        return (CustomPictureSelectionModel) super.isZoomAnim(zoomAnim);
    }

    @Override
    public CustomPictureSelectionModel previewEggs(boolean previewEggs) {
        return (CustomPictureSelectionModel) super.previewEggs(previewEggs);
    }

    @Override
    public CustomPictureSelectionModel isCamera(boolean isCamera) {
        return (CustomPictureSelectionModel) super.isCamera(isCamera);
    }

    @Override
    public CustomPictureSelectionModel setOutputCameraPath(String outputCameraPath) {
        return (CustomPictureSelectionModel) super.setOutputCameraPath(outputCameraPath);
    }

    @Override
    public CustomPictureSelectionModel isGif(boolean isGif) {
        return (CustomPictureSelectionModel) super.isGif(isGif);
    }

    @Override
    public CustomPictureSelectionModel previewImage(boolean enablePreview) {
        return (CustomPictureSelectionModel) super.previewImage(enablePreview);
    }

    @Override
    public CustomPictureSelectionModel previewVideo(boolean enPreviewVideo) {
        return (CustomPictureSelectionModel) super.previewVideo(enPreviewVideo);
    }

    @Override
    public CustomPictureSelectionModel openClickSound(boolean openClickSound) {
        return (CustomPictureSelectionModel) super.openClickSound(openClickSound);
    }

    @Override
    public CustomPictureSelectionModel isDragFrame(boolean isDragFrame) {
        return (CustomPictureSelectionModel) super.isDragFrame(isDragFrame);
    }

    @Override
    public CustomPictureSelectionModel selectionMedia(List<LocalMedia> selectionMedia) {
        return (CustomPictureSelectionModel) super.selectionMedia(selectionMedia);
    }

    @Override
    public void forResult(int requestCode) {
//        super.forResult(requestCode);
        mSelector.forResult(requestCode);
    }

    @Override
    public void openExternalPreview(int position, List<LocalMedia> medias) {
        mSelector.externalPicturePreview(position,medias);
//        super.openExternalPreview(position, medias);
    }

    public void openExternalPreviewStrs(int position, List<String> medias) {
        mSelector.externalPicturePreviewStrs(position,medias);
//        super.openExternalPreview(position, medias);
    }

//    public void openExternalPreview(int position, List<LocalMedia> medias,Class<? extends PictureExternalPreviewCustomActivity> clas) {
//        mSelector.externalPicturePreview(position,medias,clas);
////        super.openExternalPreview(position, medias);
//    }

    @Override
    public void openExternalPreview(int position, String directory_path, List<LocalMedia> medias) {
        super.openExternalPreview(position, directory_path, medias);
    }


    public CustomPictureSelectionModel setImageListener(PictureExternalPreviewCustomActivity.OnImageLongClickListener listener) {
        mSelector.setImageListener(listener);
        return this;
    }
}
