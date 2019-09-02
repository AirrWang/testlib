package com.example.pictureselect;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.luck.picture.lib.PictureExternalPreviewActivity;
import com.luck.picture.lib.PicturePlayAudioActivity;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.PictureVideoPlayActivity;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.tools.DoubleUtils;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class CustomPictureSelector {
    private final WeakReference<Activity> mActivity;
    private final WeakReference<Fragment> mFragment;
    private PictureSelector pictureSelector;

    private CustomPictureSelector(Activity activity) {
        this(activity, null);
        pictureSelector = PictureSelector.create(activity);
    }

    private CustomPictureSelector(Fragment fragment) {
        this(fragment.getActivity(), fragment);
        pictureSelector = PictureSelector.create(fragment);
    }

    private CustomPictureSelector(Activity activity, Fragment fragment) {
        mActivity = new WeakReference<>(activity);
        mFragment = new WeakReference<>(fragment);
    }

    /**
     * Start PictureSelector for Activity.
     *
     * @param activity
     * @return PictureSelector instance.
     */
    public static CustomPictureSelector create(Activity activity) {
        return new CustomPictureSelector(activity);
    }

    /**
     * Start PictureSelector for Fragment.
     *
     * @param fragment
     * @return PictureSelector instance.
     */
    public static CustomPictureSelector create(Fragment fragment) {
        return new CustomPictureSelector(fragment);
    }

    /**
     * @param mimeType Select the type of picture you want，all or Picture or Video .
     * @return LocalMedia PictureSelectionModel
     */
    public CustomPictureSelectionModel openGallery(int mimeType) {
        return new CustomPictureSelectionModel(this, mimeType);
    }

    /**
     * @param mimeType Select the type of picture you want，Picture or Video.
     * @return LocalMedia PictureSelectionModel
     */
    public CustomPictureSelectionModel openCamera(int mimeType) {
        return new CustomPictureSelectionModel(this, mimeType, true);
    }

    /**
     * 外部预览时设置样式
     *
     * @param themeStyle
     * @return
     */
    public CustomPictureSelectionModel themeStyle(int themeStyle) {
        return new CustomPictureSelectionModel(this, PictureMimeType.ofImage()).theme(themeStyle);
    }

    /**
     * @param data
     * @return Selector Multiple LocalMedia
     */
    public static List<LocalMedia> obtainMultipleResult(Intent data) {
        List<LocalMedia> result = new ArrayList<>();
        if (data != null) {
            result = (List<LocalMedia>) data.getSerializableExtra(PictureConfig.EXTRA_RESULT_SELECTION);
            if (result == null) {
                result = new ArrayList<>();
            }
            return result;
        }
        return result;
    }

    /**
     * @param data
     * @return Put image Intent Data
     */
    public static Intent putIntentResult(List<LocalMedia> data) {
        return new Intent().putExtra(PictureConfig.EXTRA_RESULT_SELECTION, (Serializable) data);
    }

    /**
     * @param bundle
     * @return get Selector  LocalMedia
     */
    public static List<LocalMedia> obtainSelectorList(Bundle bundle) {
        List<LocalMedia> selectionMedias;
        if (bundle != null) {
            selectionMedias = (List<LocalMedia>) bundle
                    .getSerializable(PictureConfig.EXTRA_SELECT_LIST);
            return selectionMedias;
        }
        selectionMedias = new ArrayList<>();
        return selectionMedias;
    }

    /**
     * @param selectedImages
     * @return put Selector  LocalMedia
     */
    public static void saveSelectorList(Bundle outState, List<LocalMedia> selectedImages) {
        outState.putSerializable(PictureConfig.EXTRA_SELECT_LIST, (Serializable) selectedImages);
    }

    /**
     * set preview image
     *
     * @param position
     * @param medias
     */
    public void externalPicturePreview(int position, List<LocalMedia> medias) {
        if (!DoubleUtils.isFastDoubleClick()) {
            Intent intent = new Intent(getActivity(), PictureExternalPreviewCustomActivity.class);
            intent.putExtra(PictureConfig.EXTRA_PREVIEW_SELECT_LIST, (Serializable) medias);
            intent.putExtra(PictureConfig.EXTRA_POSITION, position);
            getActivity().startActivity(intent);
            getActivity().overridePendingTransition(com.luck.picture.lib.R.anim.a5, 0);
        }
    }

    /**
     * set preview image
     *
     * @param position
     * @param medias
     */
    public void externalPicturePreviewStrs(int position, List<String> medias) {
        List<LocalMedia> localMediaList = null;
        for (int i = 0; i < medias.size(); i++) {
            String pic_path = (String) medias.get(i);
            LocalMedia media = new LocalMedia(pic_path, 0, 0, "");
            localMediaList.add(media);
            media = null;
        }

        if (!DoubleUtils.isFastDoubleClick()) {
            Intent intent = new Intent(getActivity(), PictureExternalPreviewCustomActivity.class);
            intent.putExtra(PictureConfig.EXTRA_PREVIEW_SELECT_LIST, (Serializable) localMediaList);
            intent.putExtra(PictureConfig.EXTRA_POSITION, position);
            getActivity().startActivity(intent);
            getActivity().overridePendingTransition(com.luck.picture.lib.R.anim.a5, 0);
        }
    }

    /**
     * set preview image
     *
     * @param position
     * @param medias
     */
    public void externalPicturePreview(int position, List<LocalMedia> medias,Class<? extends PictureExternalPreviewCustomActivity> clas) {
        if (!DoubleUtils.isFastDoubleClick()) {
            Intent intent = new Intent(getActivity(), clas);
            intent.putExtra(PictureConfig.EXTRA_PREVIEW_SELECT_LIST, (Serializable) medias);
            intent.putExtra(PictureConfig.EXTRA_POSITION, position);
            getActivity().startActivity(intent);
            getActivity().overridePendingTransition(com.luck.picture.lib.R.anim.a5, 0);
        }
    }

    /**
     * set preview image
     *
     * @param position
     * @param medias
     * @param directory_path
     */
    public void externalPicturePreview(int position, String directory_path, List<LocalMedia> medias) {
        if (!DoubleUtils.isFastDoubleClick()) {
            Intent intent = new Intent(getActivity(), PictureExternalPreviewActivity.class);
            intent.putExtra(PictureConfig.EXTRA_PREVIEW_SELECT_LIST, (Serializable) medias);
            intent.putExtra(PictureConfig.EXTRA_POSITION, position);
            intent.putExtra(PictureConfig.DIRECTORY_PATH, directory_path);
            getActivity().startActivity(intent);
            getActivity().overridePendingTransition(com.luck.picture.lib.R.anim.a5, 0);
        }
    }

    /**
     * set preview video
     *
     * @param path
     */
    public void externalPictureVideo(String path) {
        if (!DoubleUtils.isFastDoubleClick()) {
            Intent intent = new Intent(getActivity(), PictureVideoPlayActivity.class);
            intent.putExtra("video_path", path);
            getActivity().startActivity(intent);
        }
    }

    /**
     * set preview audio
     *
     * @param path
     */
    public void externalPictureAudio(String path) {
        if (!DoubleUtils.isFastDoubleClick()) {
            Intent intent = new Intent(getActivity(), PicturePlayAudioActivity.class);
            intent.putExtra("audio_path", path);
            getActivity().startActivity(intent);
            getActivity().overridePendingTransition(com.luck.picture.lib.R.anim.a5, 0);
        }
    }

    /**
     * @return Activity.
     */
    @Nullable
    Activity getActivity() {
        return mActivity.get();
    }

    /**
     * @return Fragment.
     */
    @Nullable
    Fragment getFragment() {
        return mFragment != null ? mFragment.get() : null;
    }

    public PictureSelector getPictureSelector() {
        return pictureSelector;
    }

    public void setImageListener(PictureExternalPreviewCustomActivity.OnImageLongClickListener listener) {
        PictureExternalPreviewCustomActivity.setOnImageLongClickListener(listener);
    }

    public void forResult(int requestCode){
        if(!DoubleUtils.isFastDoubleClick()) {
            Activity activity = getActivity();
            if(activity == null) {
                return;
            }

            Intent intent = new Intent(activity, CustomPictureSelectorActivity.class);
            Fragment fragment = getFragment();
            if(fragment != null) {
                fragment.startActivityForResult(intent, requestCode);
            } else {
                activity.startActivityForResult(intent, requestCode);
            }

            activity.overridePendingTransition(com.luck.picture.lib.R.anim.a5, 0);
        }
    }
}
